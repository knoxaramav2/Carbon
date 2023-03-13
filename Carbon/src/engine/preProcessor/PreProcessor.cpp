#include "..\..\headers\preProcessor\PreProcessor.hpp"
#include "..\..\headers\util\env.hpp"

#include <fstream>
#include <iostream>
#include <cctype>

using namespace std;
using namespace Carbon;

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
				file.DeleteLine();
				continue;
			}
			else {
				if (tmpLine[idx + 1] == '#') {
					tmpLine.erase(tmpLine.begin() + idx, tmpLine.begin() + idx + 2);
					multiLn = false;
					file.SetLine(tmpLine);
				}
				else {
					file.DeleteLine();
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
		
		//check for ws
		for each (char c in tmpLine)
		{
			if (isspace(c) == 0) {
				nonWS = true;
				break;
			}
		}

		if (tmpLine.size() == 0) { file.DeleteLine(); }
		else if (!nonWS) { file.DeleteLine(); }
		else { file.SetLine(tmpLine); }

		file.Next();
	}

	//Test
	file.Rewind();
	while (!file.IsAtEnd()) { cout << file.Next() << endl; }
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
}

void Carbon::PreProcessor::ProcessSource()
{
	LoadFile(_config->sourceFile);
}
