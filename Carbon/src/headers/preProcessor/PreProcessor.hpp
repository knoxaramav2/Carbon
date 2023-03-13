#pragma once
#ifndef HEADERS_PREPROC
#define HEADERS_PREPROC

#include "..\engine\VirtualFile.hpp"
#include "..\reporting\errReporter.hpp"
#include "../core/config.hpp"

namespace Carbon {

	class PreProcessor {

		Reporter* _reporter;
		Config* _config;

	public:
		PreProcessor(Config& config);

		void ProcessSource();
		void LoadFile(std::string filePath);


	};

}

#endif