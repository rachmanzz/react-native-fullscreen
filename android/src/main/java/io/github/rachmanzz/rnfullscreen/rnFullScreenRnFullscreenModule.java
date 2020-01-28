package io.github.rachmanzz.rnfullscreen;

import android.app.Activity;
import android.view.WindowManager;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class rnFullScreenRnFullscreenModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private Activity activity;

    public rnFullScreenRnFullscreenModule(ReactApplicationContext reactContext, Activity activity) {
        super(reactContext);
        this.reactContext = reactContext;
        this.activity = activity;
    }

    @Override
    public String getName() {
        return "RNFullscreen";
    }

    @ReactMethod
    public void setFullScreen() {
        activity.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
}
