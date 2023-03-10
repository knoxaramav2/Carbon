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

Carbon::Config::Config(int argc, char** argv)
{
	for (int i = 0; i < argc; ++i) {
		string op = argv[i];
		string key, val;
		tie(key, val) = splitOption(op);

		if (key.size() < 2) {
			//TODO Add error


		}
	}
}
