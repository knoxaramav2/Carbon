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

void Carbon::VirtualFile::DeleteLine()
{
	if (_idx >= _contents.size()) { return; }

	_contents.erase(_contents.begin() + _idx);

	if (_idx >= _contents.size()) { _contents.size() - 1; }
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
