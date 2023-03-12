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

void GetComplexOption(string& key, string& value, Config* config, Reporter* rpt) {
	key.erase(key.begin(), key.begin() + 2);

	if (key == "src") {
		if (config->sourceFile != "") { rpt->AddError(ERR_CODE::DUPLICATE_SRC, ""); return; }
		else if (value == "") { rpt->AddError(ERR_CODE::INVALID_CLI_ARG, "--src requires a value"); return; }
		else { config->sourceFile = value; }
	}
	else if (key == "opt") {
		if (value == "0") { config->optimization = OptimizeLevel::NONE; }
		else if (value == "" || value == "1") { config->optimization = OptimizeLevel::LEVEL1; }
		else if (value == "2") { config->optimization = OptimizeLevel::LEVEL2; }
		else if (value == "3") { config->optimization = OptimizeLevel::LEVEL3; }
		else { rpt->AddError(ERR_CODE::INVALID_CLI_ARG, "--opt accepts values from 0 to 4"); return; }
	}
	else if (key == "verbose") {
		if (value == "silent") { config->verbosity = ErrVerbosity::SILENT; }
		else if (value == "normal" || value == "1") { config->verbosity = ErrVerbosity::NORMAL; }
		else if (value == "verbose") { config->verbosity = ErrVerbosity::HIGH; }
		else { rpt->AddError(ERR_CODE::INVALID_CLI_ARG, "Invalid value for 'verbose'"); return; }
	}
	else if (key == "save-asm") {
		if (value != "") { rpt->AddError(ERR_CODE::INVALID_CLI_ARG, "--save-asm does not accept a value"); return; }
		config->saveAssembly = true;
	}
	else if (key == "asm-only") {
		if (value != "") { rpt->AddError(ERR_CODE::INVALID_CLI_ARG, "--asm-only does not accept a value"); return; }
		config->saveAssembly = true;
		config->assemblyOnly = true;
	}
	else if (key == "save-precomp") {
		if (value != "") { rpt->AddError(ERR_CODE::INVALID_CLI_ARG, "--save-precomp does not accept a value"); return; }
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

bool ValidateConfig(Config* config, Reporter* rpt) {

	bool valid = true;

	if (config->sourceFile == "") { 
		rpt->AddError(ERR_CODE::MISSING_SRC, "");
		valid = false; 
	}

	return valid;
}

Carbon::Config::Config(int argc, char** argv)
{
	_reporter = ErrorReporter::GetInst();

	for (int i = 1; i < argc; ++i) {
		string op = argv[i];
		string key, val;
		tie(key, val) = splitOption(op);

		if (key.size() < 2) {
			_reporter->AddError(ERR_CODE::INVALID_CLI_OP, "Unrecognized option '" + key + "'");
			continue;
		}

		if (key[0] == '-' && key[1] == '-') {
			GetComplexOption(key, val, this, _reporter);
		}
		else if (key[0] == '-') {
			GetSimpleOption(key, this);
		}
		else {
			_reporter->AddError(ERR_CODE::INVALID_CLI_OP, "Unrecognized option '" + key + "'");
			continue;
		}
	}

	_isValid = ValidateConfig(this, _reporter);

	if (!_isValid) {
		_reporter->AddError(ERR_CODE::INVALID_CONFIG, "");
	}
}

bool Carbon::Config::IsValid()
{
	return _isValid;
}
