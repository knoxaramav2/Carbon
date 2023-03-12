#include "../headers/reporting/errCodes.hpp"

using namespace std;
using namespace Carbon;

//TODO Use provider from file for multi language support?
const string MSG_MISS_SRC = "Must define source file";
const string MSG_DUP_SRC = "Must specify only one source file";
const string MSG_INV_ARG = "Invalid option argument";
const string MSG_INV_OP = "Unrecognized option";

const string MSG_INC_CNFG = "Configuration invalid, quitting";

const string MSG_INTERNAL_NO_MSG = "<Internal Error> No message found for err code ";
string ErrorRegistry::GetMessage(ERR_CODE code) {

	string ret;

	switch (code) {
	case ERR_CODE::MISSING_SRC: ret = MSG_MISS_SRC; break;
	case ERR_CODE::DUPLICATE_SRC: ret = MSG_DUP_SRC; break;
	case ERR_CODE::INVALID_CLI_ARG: ret = MSG_INV_ARG; break;
	case ERR_CODE::INVALID_CLI_OP: ret = MSG_INV_OP; break;
		
	case ERR_CODE::INVALID_CONFIG: ret = MSG_INC_CNFG; break;

	default:
		
		ret = MSG_INTERNAL_NO_MSG + " " + to_string((int)code);
	}


	return ret;
}

