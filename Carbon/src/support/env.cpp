#include "..\headers\util\env.hpp"
#include "..\headers\util\file.hpp"

#include <filesystem>
#include <iostream>
#include <locale>
#include <sstream>
#include <codecvt>

using namespace std;
using namespace Carbon;

Environment* Environment::_inst;
string Environment::_execPath;
string Environment::_workingPath;
string Environment::_os;

#ifdef _WIN32 || _WIN64

#include <Windows.h>
#include <direct.h>
#include <WinBase.h>

string M_OS = "WINDOWS";
#define WINDOWS
#elif defined __unix__

#include <unistd.h>

string M_OS = "LINUX";
#define LINUX
#endif

Carbon::Environment::Environment()
{
	_os = M_OS;

#ifdef WINDOWS
	TCHAR execPath[MAX_PATH];
	GetModuleFileNameA(NULL, execPath, MAX_PATH);
	_execPath = string(execPath);
#endif

#ifdef LINUX


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
	wchar_t tmp[MAX_PATH];
	GetCurrentDirectoryW(MAX_PATH, tmp);
	wstring wtmp(tmp);

	using convert_typeX = std::codecvt_utf8<wchar_t>;
	std::wstring_convert<convert_typeX, wchar_t> cnvrt;

	return cnvrt.to_bytes(wtmp);
}

std::string Carbon::Environment::OS()
{
	return _os;
}
