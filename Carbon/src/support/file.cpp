#include "..\headers\util\file.hpp"

using namespace std;

std::string Util::File::GetDirectory(std::string path)
{
	size_t fIdx = path.find_last_of('/');
	size_t bIdx = path.find_last_of('\\');
	size_t idx = string::npos;

	fIdx = fIdx == string::npos ? 0 : fIdx;
	bIdx = bIdx == string::npos ? 0 : bIdx;

	if (fIdx == string::npos && bIdx == string::npos) {
		return path;
	}

	if (fIdx != string::npos && fIdx > bIdx) {
		idx = fIdx;
	} else if (bIdx != string::npos && bIdx > fIdx) {
		idx = bIdx;
	}

	path = path.substr(0, idx);

	return path;
}

std::string Util::File::GetFile(std::string path)
{
	return path.erase(0, GetDirectory(path).size() + 1);
}
