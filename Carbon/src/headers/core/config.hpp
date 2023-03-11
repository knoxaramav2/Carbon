#pragma once
#ifndef HEADER_CONFIG
#define HEADER_CONFIG

#include "..\reporting\errReporter.hpp"

#include <string>
#include <vector>

namespace Carbon {

	enum class ErrVerbosity {
		SILENT,
		NORMAL,
		HIGH
	};

	enum class OptimizeLevel {
		NONE,
		LEVEL1,
		LEVEL2,
		LEVEL3
	};

	/// <summary>
	/// CLI options
	/// </summary>
	class Config {

		ErrorReporter* _reporter;

		bool _isValid = true;

	public:
		Config(int argc, char ** argv);
		bool IsValid();

		//Reporting
		ErrVerbosity verbosity = ErrVerbosity::NORMAL;
		bool noWarn = false;

		//Program
		std::string sourceFile; //required
		bool assemblyOnly = false;//Forces save assembly
		bool saveAssembly = false;
		bool preservePreCompile = false;
		
		//Compiler
		OptimizeLevel optimization = OptimizeLevel::NONE;
		std::string target; //CPU architecture

	};
}

#endif