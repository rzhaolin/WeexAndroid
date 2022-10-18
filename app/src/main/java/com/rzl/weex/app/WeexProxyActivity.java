package com.rzl.weex.app;


import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import org.apache.weex.IWXRenderListener;
import org.apache.weex.WXSDKEngine;
import org.apache.weex.WXSDKInstance;
import org.apache.weex.WXSDKManager;
import org.apache.weex.common.WXRenderStrategy;
import org.apache.weex.utils.WXFileUtils;


public class WeexProxyActivity extends Activity implements IWXRenderListener, WXSDKManager.IInitListener {
    private static final String TAG = "WeexProxyActivity";
    private static final String PAG_NAME = "WXSample";
    // remote bundle url
    private static final String BUNDLE_URL = "http://dotwe.org/raw/dist/38e202c16bdfefbdb88a8754f975454c.bundle.wx";
    // local bundle url
    private static final String LOCAL_URL = "dist/index.js";

    private WXSDKInstance mWXSDKInstance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mWXSDKInstance = new WXSDKInstance(this);
        mWXSDKInstance.registerRenderListener(this);
        mWXSDKInstance.setInitListener(this);

        // if Weex SDK Engine init, then load page, else load page in the IInitListener callback
        if (WXSDKEngine.isInitialized()) {
            loadPage();
        }
    }

    public void loadPage() {
        // loadByUrl();
        loadLocalFile();
    }

    private void loadByUrl() {
        mWXSDKInstance.renderByUrl(PAG_NAME, BUNDLE_URL, null, null, WXRenderStrategy.APPEND_ASYNC);
    }

    private void loadLocalFile() {
        mWXSDKInstance.render(PAG_NAME, WXFileUtils.loadFileOrAsset(LOCAL_URL, this), null, null, WXRenderStrategy.APPEND_ASYNC);
    }

    @Override
    public void onViewCreated(WXSDKInstance instance, View view) {
        View root = LayoutInflater.from(this).inflate(R.layout.activity_weex_proxy, null);
        ViewGroup container = root.findViewById(R.id.fl_weexContainer);

        FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT,
                FrameLayout.LayoutParams.MATCH_PARENT);
        container.addView(view, params);

        setContentView(root);
    }

    // IWXRenderListener callback
    @Override
    public void onRenderSuccess(WXSDKInstance instance, int width, int height) {
        Log.d(TAG, "===Weex onRenderSuccess");
    }

    @Override
    public void onRefreshSuccess(WXSDKInstance instance, int width, int height) {
        Log.d(TAG, "===Weex onRefreshSuccess");
    }

    @Override
    public void onException(WXSDKInstance instance, String errCode, String msg) {
        Log.d(TAG, "===Weex onException " + errCode + ", " + msg);
    }

    // IInitListener callback
    @Override
    public void onInitSuccess() {
        loadPage();
    }

    @Override
    protected void onResume() {
        super.onResume();

        if (mWXSDKInstance != null) {
            mWXSDKInstance.onActivityResume();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (mWXSDKInstance != null) {
            mWXSDKInstance.onActivityPause();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (mWXSDKInstance != null) {
            mWXSDKInstance.onActivityStop();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mWXSDKInstance != null) {
            mWXSDKInstance.onActivityDestroy();
        }
    }
}
