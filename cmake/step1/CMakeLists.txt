cmake_minimum_required(VERSION 3.13.4)
project(Tutorial)
add_executable(Tutorial tutorial.cxx)

set(CMAKE_CXX_STANDARD 11)
set(CMAKE_CXX_STANDARD_REQUIRED True)

project(Tutorial VERSION 1.0)
configure_file(TutorialConfig.h.in TutorialConfig.h)

target_include_directories(Tutorial PUBLIC "${PROJECT_BINARY_DIR}")