package io.github.rachmanzz.rnfullscreen;

import android.app.Activity;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.bridge.JavaScriptModule;

public class rnFullScreenRnFullscreenPackage implements ReactPackage {
    private Activity mActivity = null;
    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        return Arrays.<NativeModule>asList(new rnFullScreenRnFullscreenModule(reactContext, mActivity));
    }

    public CustomReactPackage(Activity activity) {
        mActivity = activity;
    }



    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        return Collections.emptyList();
    }
}
