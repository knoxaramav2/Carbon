// Carbon.cpp : Defines the entry point for the application.
//

#include "Carbon.h"
#include "headers/core/config.hpp"

using namespace std;
using namespace Carbon;

int main(int argc, char** argv)
{
	Reporter* reporter = ErrorReporter::GetInst();
	Config config(argc, argv);

	if (!config.IsValid()) {
		reporter->PrintAndClear();
		return -1;
	}

	return 0;
}
