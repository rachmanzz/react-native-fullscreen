package io.github.rachmanzz.rnfullscreen;

import android.view.WindowManager;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class rnFullScreenRnFullscreenModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public rnFullScreenRnFullscreenModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "RNFullscreen";
    }

    @ReactMethod
    public void setFullScreen() {
        getCurrentActivity().getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
}
