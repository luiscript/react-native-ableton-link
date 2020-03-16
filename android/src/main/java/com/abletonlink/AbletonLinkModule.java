package com.abletonlink;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.WritableMap;

public class AbletonLinkModule extends ReactContextBaseJavaModule {

    static {
        System.loadLibrary("rn-ableton-link");
    }

    public native long nativeCreateLinkManager();
    public native double nativeGetTempo(long managerHandle);
    public native void nativeEnable(long managerHandle);
    public native double nativeGetPhase(long managerHandle);

    private long managerHandle = 0;

    private final ReactApplicationContext reactContext;

    public AbletonLinkModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "AbletonLink";
    }

    @ReactMethod
    public void sampleMethod(String stringArgument, int numberArgument, Callback callback) {
        // TODO: Implement some actually useful functionality
        callback.invoke("Received numberArgument: " + numberArgument + " stringArgument: " + stringArgument);
    }

    @ReactMethod
    public void createLinkManager(Callback callback){
        if (managerHandle == 0L) {
            managerHandle = nativeCreateLinkManager();
        }
        callback.invoke(managerHandle != 0L);
    }

    @ReactMethod
    public void getTempo(Callback callback){
        WritableMap data = Arguments.createMap();
        data.putDouble("tempo", nativeGetTempo(managerHandle));
        callback.invoke(data);
    }

    @ReactMethod
    public void enable(){
        nativeEnable(managerHandle);
    }

    @ReactMethod
    public void getPhase(Callback callback){
        WritableMap data = Arguments.createMap();
        data.putDouble("phase", nativeGetPhase(managerHandle));
        callback.invoke(data);
    }

}
