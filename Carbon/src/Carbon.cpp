// Carbon.cpp : Defines the entry point for the application.
//

#define DEBUG

#include "Carbon.h"
#include "headers/core/config.hpp"

#include "headers/util/env.hpp"
#include "headers/util/file.hpp"
#include <iostream>

using namespace std;
using namespace Carbon;

void Tests();

int main(int argc, char** argv)
{
	Reporter* reporter = ErrorReporter::GetInst();
	Config config(argc, argv);

#ifdef DEBUG
	Tests();
#endif
	
	if (!config.IsValid()) {
		reporter->PrintAndClear();
		return -1;
	}

	return 0;
}

void Tests() {
	auto a = Environment::GetInst();
	auto path = a->ExecPath();

	cout << path << endl;
	cout << Util::File::GetDirectory(path) << endl;
	cout << Util::File::GetFile(path) << endl;

	cout << a->OS() << endl;
}