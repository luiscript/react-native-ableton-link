cmake_minimum_required(VERSION 3.4.1)

set(LINK_DIR /Users/luiscript/link)

include(${LINK_DIR}/AbletonLinkConfig.cmake)

include_directories(src/main/cpp/android-ifaddrs)
include_directories(${LINK_DIR}/include)
include_directories(${LINK_DIR}/modules/asio-standalone/asio/include)


add_library(rn-ableton-link SHARED
        src/main/cpp/rn-ableton-link.cpp
        src/main/cpp/LinkManager.cpp
        src/main/cpp/android-ifaddrs/ifaddrs.cpp)


target_compile_definitions(rn-ableton-link PRIVATE
        ANDROID=1 LINK_PLATFORM_LINUX=1 PD=1 ABL_LINK_OFFSET_MS=23)

find_library(log-lib log)

target_link_libraries(rn-ableton-link  ${log-lib} Ableton::Link)