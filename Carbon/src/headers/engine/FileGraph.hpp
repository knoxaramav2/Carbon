#pragma once
#ifndef HEADERS_FILE_GRAPH
#define HEADERS_FILE_GRAPH

#include <vector>

#include "VirtualFile.hpp"

namespace Carbon {

	class FileGraph {

		VirtualFile* _root;
		std::vector<VirtualFile*> _reg;

	public:
		FileGraph();
		~FileGraph();

		bool InsertFile(VirtualFile* file);
		bool IsFileInGraph(std::string filePath);
		bool IsFileInGraph(VirtualFile* file);
	};

}


#endif