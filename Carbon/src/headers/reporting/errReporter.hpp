#pragma once
#ifndef HEADER_ERR_REPORTER
#define HEADER_ERR_REPORTER

#include "errCodes.hpp"

#include <mutex>
#include <string>
#include <vector>

namespace Carbon {

	class Reporter {
	public:
		virtual void AddError(ERR_CODE code, std::string subMsg) = 0;
		virtual void ClearErrors() = 0;
		virtual void PrintNext() = 0;
		virtual void PrintAndClear() = 0;

		virtual ~Reporter() = default;
	};

	class ErrorReporter : public Reporter {

	private:
		static ErrorReporter* _inst;
		static std::mutex _mtx;
		static std::vector<std::string> _errList;
	protected:
		ErrorReporter();
		~ErrorReporter();
	public:

		//For thread safety
		ErrorReporter(ErrorReporter& clone) = delete;
		void operator=(const ErrorReporter& asgn) = delete;

		static ErrorReporter* GetInst();

		virtual void AddError(ERR_CODE code, std::string subMsg);
		virtual void ClearErrors();
		virtual void PrintNext();
		virtual void PrintAndClear();
	};
}



#endif