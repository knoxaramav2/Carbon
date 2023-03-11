#include "..\headers\core\config.hpp"

#include <stdio.h>
#include <string>
#include <tuple>

using namespace std;
using namespace Carbon;

tuple<string, string> splitOption(string input) {

	size_t loc = input.find("=");
	string key = input.substr(0, loc);
	string val = input.substr(loc + 1, input.length() - loc);

	return tuple<string, string>{key, val};
}

void GetComplexOption(string& key, string& value, Config* config) {
	key.erase(key.begin(), key.begin() + 2);

	if (key == "src") {
		if (config->sourceFile != "") {/*TODO Add error*/ return; }
		else if (value == "") {/*TODO Add error*/ return; }
		else { config->sourceFile = value; }
	}
	else if (key == "opt") {
		if (value == "0") { config->optimization = OptimizeLevel::NONE; }
		else if (value == "" || value == "1") { config->optimization = OptimizeLevel::LEVEL1; }
		else if (value == "2") { config->optimization = OptimizeLevel::LEVEL2; }
		else if (value == "3") { config->optimization = OptimizeLevel::LEVEL3; }
		else {/*TODO Add error*/ return; }
	}
	else if (key == "verbose") {
		if (value == "silent") { config->verbosity = ErrVerbosity::SILENT; }
		else if (value == "normal" || value == "1") { config->verbosity = ErrVerbosity::NORMAL; }
		else if (value == "verbose") { config->verbosity = ErrVerbosity::HIGH; }
		else {/*TODO Add error*/ return; }
	}
	else if (key == "save-asm") {
		if (value != "") {/*TODO Add error*/ return; }
		config->saveAssembly = true;
	}
	else if (key == "asm-only") {
		if (value != "") {/*TODO Add error*/ return; }
		config->saveAssembly = true;
		config->assemblyOnly = true;
	}
	else if (key == "save-precomp") {
		if (value != "") {/*TODO Add error*/ return; }
		config->preservePreCompile = true;
	}
}

void GetSimpleOption(string& key, Config* config) {
	key.erase(key.begin());

	for each (char c in key)
	{
		switch (c) {
			case 'w': config->noWarn = true; break;
		}
	}
}

bool ValidateConfig(Config* config) {

	bool valid = true;

	if (config->sourceFile == "") { 
		//TODO Add error
		valid = false; 
	}

	return valid;
}

Carbon::Config::Config(int argc, char** argv)
{
	_reporter = ErrorReporter::GetInst();
	_reporter->AddError(ERR_CODE::DUPLICATE_SRC, "Test");

	for (int i = 0; i < argc; ++i) {
		string op = argv[i];
		string key, val;
		tie(key, val) = splitOption(op);

		if (key.size() < 2) {
			//TODO Add error
			continue;
		}

		if (key[0] == '-' && key[1] == '-') {
			GetComplexOption(key, val, this);
		}
		else if (key[0] == '-') {
			GetSimpleOption(key, this);
		}
		else {
			//TODO Add error
			continue;
		}
	}

	_isValid = ValidateConfig(this);

	if (!_isValid) {
		//TODO Add error
	}
}

bool Carbon::Config::IsValid()
{
	return _isValid;
}
