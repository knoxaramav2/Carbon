#include "..\..\headers\preProcessor\PreProcessor.hpp"
#include "..\..\headers\util\env.hpp"

#include <fstream>
#include <iostream>
#include <cctype>

using namespace std;
using namespace Carbon;

const char* cws = " \t\n\r\f\v";

//TODO implement as utility
void Trim(string& line) {

	if (line.find_first_not_of(cws) == string::npos) {
		line.clear();
		return;
	}

	size_t l = line.find_first_not_of(cws);
	size_t r = line.find_last_not_of(cws)+1;

	if (r != string::npos) { line.erase(r); }
	if (l != string::npos) { line.erase(0, l); }
}

string* SplitDirective(string& line) {

	string* ret = new string[2];
	size_t idx = line.find_first_of(cws);

	ret[0] = line.substr(0, idx);
	line.erase(0, ret[0].size());
	idx = line.find_first_not_of(cws);
	ret[1] = line.substr(idx, line.size());

	return ret;
}

void CleanVirtualFile(VirtualFile* file) {

	string tmpLine;
	bool multiLn = false;

	while (!file->IsAtEnd()) {
		bool nonWS = false;
		
		tmpLine = file->CurrentLine();
		size_t idx = 0;

		if (multiLn) { 
			idx = tmpLine.find_first_of('*');
			if (idx == string::npos) {
				file->DeleteLine(false);
				continue;
			}
			else {
				if (tmpLine[idx + 1] == '#') {
					tmpLine.erase(tmpLine.begin() + idx, tmpLine.begin() + idx + 2);
					multiLn = false;
				}
				else {
					file->DeleteLine(false);
					continue;
				}
			}
		}
		else if ((idx = tmpLine.find_first_of('#')) != string::npos) {
			
			if (tmpLine[idx + 1] == '*') {
				multiLn = true;

				tmpLine.erase(tmpLine.begin()+idx, tmpLine.begin()+1);
				continue;
			}
			else {
				tmpLine.erase(tmpLine.begin() + idx, tmpLine.end());
			}
		}

		Trim(tmpLine);

		if (tmpLine.size() == 0) { 
			file->DeleteLine(true);
		}
		else { file->SetLine(tmpLine); }

		file->Next();
	}
}

void PreProcessor::ResolveImports(VirtualFile* file) {

	file->Rewind();

	string line;
	vector <string> imports;

	while (!(line = file->CurrentLine()).empty()) {
		if(line[0]=='@') {  
			string* terms = SplitDirective(line);

			if (terms[0] == "@import" && terms[1][0] == '\"') {
				file->DeleteLine(true);
				imports.push_back(terms[1].substr(1, terms[1].size() - 2));
				cout << file->FilePath() + " <- " + terms[1] << endl;
			}
			
			delete[] terms;
		}
		else {
			file->Next();
		}
	}

	for each (string str in imports)
	{
#ifndef NDEBUG
		cout << "IMPORT " + str << endl;
#endif
		VirtualFile* dep = LoadFile(str);
		_graph->LinkFiles(file, dep);
	}
}

Carbon::PreProcessor::PreProcessor(Config& config)
{
	_reporter = ErrorReporter::GetInst();
	_config = &config;
	_graph = new FileGraph();
}

Carbon::PreProcessor::~PreProcessor()
{
	delete _graph;
}

VirtualFile* Carbon::PreProcessor::LoadFile(string filePath)
{
	ifstream reader;
	string line;
	VirtualFile* file = nullptr;

	if ((file = _graph->GetFileByName(filePath))) {
		return file;
	}

	file = new VirtualFile(filePath);

	//File name only
	if (
		filePath.find_first_of('/') == string::npos && 
		filePath.find_first_of('\\') == string::npos) {
	} {
		string execPath = Environment::WorkingPath();
		filePath = execPath + "\\" + filePath;
	}

	reader = ifstream(filePath);

	if (reader.fail()) {
		_reporter->AddError(ERR_CODE::FILE_NOT_FOUND, "Unable to read file " + filePath);
		return nullptr;
	}

	while (reader.good()) {
		getline(reader, line);
		file->AddLine(line);
	}

	_graph->InsertFile(file);

	CleanVirtualFile(file);
	ResolveImports(file);

#ifndef NDEBUG
	//Test
	cout << "Reading:\t\t" + file->FilePath() << endl;
	file->Rewind();
	while (!file->IsAtEnd()) { cout << file->Next() << endl; }
#endif

	return file;
}

void Carbon::PreProcessor::ProcessSource()
{
	LoadFile(_config->sourceFile);
#ifndef NDEBUG
	_graph->CrawlGraph();
#endif
}
