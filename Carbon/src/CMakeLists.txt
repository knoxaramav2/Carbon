# CMakeList.txt : CMake project for Carbon, include source and define
# project specific logic here.
#
cmake_minimum_required (VERSION 3.8)

set(PROPERTY CXX_STANDARD 19)
#set_property(TARGET Carbon.exe PROPERTY CXX_STANDARD_REQUIRED ON)


# Add source to this project's executable.
add_executable (Carbon "Carbon.cpp" "Carbon.h"
	"headers/parser/parser.hpp" "headers/parser/preProcessor.hpp" "support/config.cpp"
	"headers/util/env.hpp" "headers/reporting/errReporter.hpp" "support/errReporter.cpp"
	"headers/reporting/errCodes.hpp" "support/errors.cpp" "support/env.cpp" 
	"headers/util/file.hpp" "support/file.cpp")

# TODO: Add tests and install targets if needed.
