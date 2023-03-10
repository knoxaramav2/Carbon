#pragma once
#ifndef HEADER_CONFIG
#define HEADER_CONFIG

#include <string>
#include <vector>

namespace Carbon {

	enum class ErrVerbosity {
		SILENT,
		NORMAL,
		HIGH
	};

	enum class CompileOptimizzation {
		NONE,
		LEVEL1,
		LEVEL2,
		LEVEL3
	};

	/// <summary>
	/// CLI options
	/// </summary>
	class Config {

	public:
		Config(int argc, char ** argv);

		//Reporting
		ErrVerbosity verbosity = ErrVerbosity::NORMAL;
	
		//Program
		std::string sourceFile; //required
		
		//Compiler
		CompileOptimizzation optimization = CompileOptimizzation::NONE;
		std::string target; //CPU architecture

	};
}

#endif