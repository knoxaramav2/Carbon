#pragma once
#ifndef HEADERS_FILE
#define HEADERS_FILE

#include <string>

namespace Util {

	class File {
	public:
		static std::string GetDirectory(std::string path);
		static std::string GetFile(std::string path);
	};

}

#endif