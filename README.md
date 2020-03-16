# react-native-ableton-link

Ableton Link support for React Native (Android).

This is a work in progress experimental project.

## Getting started

`$ npm install react-native-ableton-link --save`

### Installation

`$ react-native link react-native-ableton-link`

In file `android/CMakeLists.txt` add your local path to [Ableton Link repository](https://github.com/Ableton/link): 

`set(LINK_DIR /Users/luiscript/link)` 



## Usage
```javascript
import AbletonLink from 'react-native-ableton-link';

AbletonLink.createLinkManager(function(linkCreated){
  if(linkCreated){
    AbletonLink.enable(); 
  }
});

AbletonLink.getTempo(function(e){
  console.log("tempo", e.tempo);
});

AbletonLink.getPhase(function(e){
  console.log("phase", e.phase);
});
```

## License

The MIT License (MIT)

Copyright (C) 2020 Luis Fernando Garcia Perez
contacto@luiscript.com

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.