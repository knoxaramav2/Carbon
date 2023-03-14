#include "..\..\headers\engine\FileGraph.hpp"
#include "..\..\headers\util\file.hpp"

#include <iostream>

Carbon::FileGraph::FileGraph()
{
	_root = nullptr;
}

Carbon::FileGraph::~FileGraph()
{
	//TODO delete virtual files
}

bool Carbon::FileGraph::LinkFiles(VirtualFile* src, VirtualFile* dep)
{
	return src->LinkDependency(dep);
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

Carbon::VirtualFile* Carbon::FileGraph::GetFileByName(std::string filePath)
{
	return nullptr;
}

void Carbon::FileGraph::PrintDeps(Carbon::VirtualFile* f, int depth) {
	for (int i = 0; i < depth; ++i) { std::cout << '\t'; }
	//std::cout << Util::File::GetFile(f->FilePath());
	std::cout << f->FilePath() << std::endl;
	
	for each (Carbon::VirtualFile* d in f->_deps)
	{
		PrintDeps(d, depth + 1);
	}
}

void Carbon::FileGraph::CrawlGraph()
{
	std::cout << "Crawling..." << std::endl;

	PrintDeps(_root, 0);
}