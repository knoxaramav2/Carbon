#pragma once
#ifndef HEADERS_FILE_GRAPH
#define HEADERS_FILE_GRAPH

#include <vector>

#include "VirtualFile.hpp"

namespace Carbon {

	class FileGraph {

		VirtualFile* _root;
		std::vector<VirtualFile*> _reg;

		void PrintDeps(Carbon::VirtualFile* f, int depth);

	public:
		FileGraph();
		~FileGraph();
		
		bool LinkFiles(VirtualFile* src, VirtualFile* dep);
		bool InsertFile(VirtualFile* file);
		bool IsFileInGraph(std::string filePath);
		bool IsFileInGraph(VirtualFile* file);
		VirtualFile* GetFileByName(std::string filePath);

		//Diagnostic
		void CrawlGraph();
	};

}


#endif