#pragma once
#ifndef HEADER_ERR_CODES
#define HEADER_ERR_CODES

#include <string>

namespace Carbon {

	enum class ERR_CODE {
		//ERRORS
		ERR_MRK = 1000,

		MISSING_SRC,
		DUPLICATE_SRC,
		INVALID_CLI_ARG,
		INVALID_CLI_OP,

		INVALID_CONFIG,

		//WARNINGS
		WRN_MRK = 5000,

		//OTHER

	};

	class ErrorRegistry {

	public:

		static std::string GetMessage(ERR_CODE code);

	};
}

#endif