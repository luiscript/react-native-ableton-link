# react-native-ableton-link

## Getting started

`$ npm install react-native-ableton-link --save`

### Mostly automatic installation

`$ react-native link react-native-ableton-link`

## Usage
```javascript
import AbletonLink from 'react-native-ableton-link';

AbletonLink.createLinkManager(function(linkCreated){
  if(linkCreated){
    AbletonLink.enable(); 
  }
});

AbletonLink.getTempo(function(e){
  console.log("getTempo",e);
});
```
