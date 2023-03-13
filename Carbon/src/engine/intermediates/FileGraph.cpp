#include "..\..\headers\engine\FileGraph.hpp"

Carbon::FileGraph::FileGraph()
{
	_root = nullptr;
}

Carbon::FileGraph::~FileGraph()
{
}

bool Carbon::FileGraph::InsertFile(VirtualFile* file)
{
	if (_root == nullptr) {
		_root = file;
	}

	if (IsFileInGraph(file)) {
		return true;
	}

	_reg.push_back(file);

	return true;
}

bool Carbon::FileGraph::IsFileInGraph(std::string filePath)
{
	for each (VirtualFile * f in _reg)
	{
		if (f->FilePath() == filePath) { return true; }
	}

	return false;
}

bool Carbon::FileGraph::IsFileInGraph(VirtualFile* file)
{
	for each (VirtualFile* f in _reg)
	{
		if (f == file) { return true; }
	}

	return false;
}
