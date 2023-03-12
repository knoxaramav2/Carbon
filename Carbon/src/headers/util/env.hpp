#pragma once
#ifndef HEADERS_ENV
#define HEADERS_ENV

#include <string>

namespace Carbon {

	class Environment {

	private:
		static Environment* _inst;
		static std::string _execPath;
		static std::string _workingPath;
		static std::string _os;
	protected:
		Environment();
		~Environment();
	public:
		static Environment* GetInst();

		static std::string ExecPath();
		static std::string WorkingPath();
		static std::string OS();
	};

}

#endif