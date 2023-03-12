#include "..\headers\util\env.hpp"
#include "..\headers\util\file.hpp"

#include <filesystem>

using namespace std;
using namespace Carbon;

Environment* Environment::_inst;
string Environment::_execPath;
string Environment::_workingPath;
string Environment::_os;

#ifdef _WIN32 || _WIN64

#include <Windows.h>

string M_OS = "WINDOWS";
#define WINDOWS
#endif

#ifdef __unix__
string M_OS = "LINUX";
#endif

Carbon::Environment::Environment()
{
	_os = M_OS;

#ifdef WINDOWS
	TCHAR execPath[MAX_PATH];
	GetModuleFileNameA(NULL, execPath, MAX_PATH);
	_execPath = string(execPath);
#endif

#ifdef __unix__


#endif

	_execPath = Util::File::GetDirectory(_execPath);
}

Carbon::Environment::~Environment()
{

}

Environment* Carbon::Environment::GetInst()
{
	if (_inst == nullptr) {
		_inst = new Environment();
	}

	return _inst;
}

std::string Carbon::Environment::ExecPath()
{
	return _execPath;
}

std::string Carbon::Environment::WorkingPath()
{
	return std::string();
}

std::string Carbon::Environment::OS()
{
	return _os;
}
