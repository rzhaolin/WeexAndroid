package com.rzl.weex.app;

import android.app.Application;
import com.rzl.weex.app.adapter.MyImageLoader;
import org.apache.weex.InitConfig;
import org.apache.weex.WXSDKEngine;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        InitConfig config = new InitConfig.Builder().setImgAdapter(new MyImageLoader()).build();
        WXSDKEngine.initialize(this, config);
    }
}
