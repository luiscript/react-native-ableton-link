//
// Created by luiscript on 2020-03-15.
//

#ifndef ANDROID_LINKMANAGER_H
#define ANDROID_LINKMANAGER_H



#include <ableton/Link.hpp>

class LinkManager {

public:
    LinkManager();
    double getTempo();
    double getPhase();
    void enable();
private:
    ableton::Link link;
};


#endif //ANDROID_LINKMANAGER_H
