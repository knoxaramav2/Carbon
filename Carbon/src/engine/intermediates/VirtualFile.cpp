#include "..\..\headers\engine\VirtualFile.hpp"

using namespace std;
using namespace Carbon;

Carbon::VirtualFile::VirtualFile(string fileName)
{
	_fileName = fileName;
	_idx = 0;
}

void Carbon::VirtualFile::AddLine(std::string line)
{
	if (line.empty()) { return; }

	_contents.push_back(line);
}

std::string Carbon::VirtualFile::Next()
{
	if (_idx >= _contents.size()) { return ""; }

	return _contents.at(_idx++);
}

std::string Carbon::VirtualFile::CurrentLine()
{
	return At(_idx);
}

std::string Carbon::VirtualFile::At(int idx)
{
	if (_idx >= _contents.size()) { return ""; }

	return _contents.at(idx);
}

void Carbon::VirtualFile::Rewind()
{
	_idx = 0;
}

void Carbon::VirtualFile::DeleteLine(bool stepBack = true)
{
	if (_idx >= _contents.size()) { return; }
	string t = _contents[_idx];
	_contents.erase(_contents.begin() + _idx);

	if (_idx < _contents.size() && _idx > 0 && stepBack) { --_idx; }
}

void Carbon::VirtualFile::SetLine(std::string line)
{
	if (_idx >= _contents.size()) { return; }

	_contents.at(_idx) = line;
}

bool Carbon::VirtualFile::IsAtEnd()
{
	return _idx >= _contents.size();
}

string Carbon::VirtualFile::FilePath() {
	return _fileName;
}

bool Carbon::VirtualFile::LinkDependency(VirtualFile* file)
{
	for each (VirtualFile* f in _deps)
	{
		if (f == file) { return true; }
	}

	_deps.push_back(file);

	return true;
}