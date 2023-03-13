#include "..\headers\reporting\errReporter.hpp"

#include <iostream>

using namespace std;
using namespace Carbon;

ErrorReporter* ErrorReporter::_inst;
mutex ErrorReporter::_mtx;
vector<string>ErrorReporter::_errList;

ErrorReporter::ErrorReporter(){}

ErrorReporter::~ErrorReporter(){}

ErrorReporter* Carbon::ErrorReporter::GetInst()
{
	lock_guard<mutex> lock(_mtx);

	if (_inst == nullptr) {
		_inst = new ErrorReporter();
	}

	return _inst;
}

void ErrorReporter::AddError(ERR_CODE code, string subMsg)
{
	lock_guard<mutex> lock(_mtx);
	string frmMessage = ErrorRegistry::GetMessage(code);
	if (!subMsg.empty()) { frmMessage += " : " + subMsg; }
	_errList.push_back(frmMessage);
}

void Carbon::ErrorReporter::ClearErrors()
{
	lock_guard<mutex> lock(_mtx);
	_errList.clear();
}

void Carbon::ErrorReporter::PrintNext()
{
	lock_guard<mutex> lock(_mtx);

	if (_errList.size() == 0) { return; }

	cout << _errList.at(0) << std::endl;
	_errList.erase(_errList.begin());
}

void Carbon::ErrorReporter::PrintAndClear()
{
	while (!_errList.empty()) { PrintNext(); }
}
