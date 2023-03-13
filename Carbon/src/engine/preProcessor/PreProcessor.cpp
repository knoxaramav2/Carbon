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

	if (l != string::npos) { line.erase(r); }
	if (l != string::npos) { line.erase(0, l); }
}

size_t NextWord(string& line, size_t start) {

	size_t ret = start;



	return ret;
}

void CleanVirtualFile(VirtualFile& file) {

	string tmpLine;
	bool multiLn = false;

	while (!file.IsAtEnd()) {
		bool nonWS = false;
		
		tmpLine = file.CurrentLine();
		size_t idx = 0;

		if (multiLn) { 
			idx = tmpLine.find_first_of('*');
			if (idx == string::npos) {
				file.DeleteLine(false);
				continue;
			}
			else {
				if (tmpLine[idx + 1] == '#') {
					tmpLine.erase(tmpLine.begin() + idx, tmpLine.begin() + idx + 2);
					multiLn = false;
				}
				else {
					file.DeleteLine(false);
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
			file.DeleteLine(true); 
		}
		else { file.SetLine(tmpLine); }

		file.Next();
	}

	//Test
	file.Rewind();
	while (!file.IsAtEnd()) { cout << file.Next() << endl; }
}

void ResolveImports(VirtualFile& file) {

	file.Rewind();

	string line;

	while (!(line = file.Next()).empty()) {
		if (line[0] != '@') { continue; }
		
		
	}

}

Carbon::PreProcessor::PreProcessor(Config& config)
{
	_reporter = ErrorReporter::GetInst();
	_config = &config;
}

void Carbon::PreProcessor::LoadFile(string filePath)
{
	ifstream reader;
	string line;
	VirtualFile file(filePath);

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
		return;
	}

	while (reader.good()) {
		getline(reader, line);
		file.AddLine(line);
	}

	CleanVirtualFile(file);
	ResolveImports(file);
}

void Carbon::PreProcessor::ProcessSource()
{
	LoadFile(_config->sourceFile);
}
