#pragma once
#ifndef HEADERS_PREPROC
#define HEADERS_PREPROC

#include "..\engine\VirtualFile.hpp"
#include "..\reporting\errReporter.hpp"
#include "../core/config.hpp"
#include "..\engine\FileGraph.hpp"

namespace Carbon {

	class PreProcessor {

		Reporter* _reporter;
		Config* _config;
		FileGraph* _graph;

		//TODO Change to standalone function?
		VirtualFile* LoadFile(std::string filePath);
		void ResolveImports(VirtualFile* file);

	public:
		PreProcessor(Config& config);
		~PreProcessor();

		void ProcessSource();
	};
}

#endif