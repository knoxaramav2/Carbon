#include "..\headers\reporting\errReporter.hpp"

using namespace std;
using namespace Carbon;

ErrorReporter* ErrorReporter::_inst;
mutex ErrorReporter::_mtx;

ErrorReporter::ErrorReporter()
{
	
}

ErrorReporter::~ErrorReporter()
{
}

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
	printf("Err: %s\r\n", subMsg.c_str());
}

void Carbon::ErrorReporter::ClearErrors()
{
}

void Carbon::ErrorReporter::PrintNext()
{
}
