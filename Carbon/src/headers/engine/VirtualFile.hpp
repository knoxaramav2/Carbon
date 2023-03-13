#pragma once
#ifndef HEADERS_VIRTUAL_FILE
#define HEADERS_VIRTUAL_FILE

#include <string>
#include <vector>

namespace Carbon {

	class VirtualFile {

		std::string _fileName;
		std::vector<std::string> _contents;
		int _idx;

	public:

		VirtualFile(std::string fileName);
		void AddLine(std::string line);
		std::string Next();
		std::string CurrentLine();
		std::string At(int idx);
		void Rewind();
		void DeleteLine();
		void SetLine(std::string line);
		bool IsAtEnd();
	};

}

#endif