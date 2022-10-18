package com.rzl.weex.app.adapter;

import android.text.TextUtils;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import org.apache.weex.adapter.IWXImgLoaderAdapter;
import org.apache.weex.common.WXImageStrategy;
import org.apache.weex.dom.WXImageQuality;

public class MyImageLoader implements IWXImgLoaderAdapter {
    @Override
    public void setImage(final String url, final ImageView view,
                         WXImageQuality quality, WXImageStrategy strategy) {
        view.post(() -> {
            if (TextUtils.isEmpty(url)) {
                view.setImageBitmap(null);
                return;
            }
            String temp = url;
            if (url.startsWith("//")){
                temp = "http:" + url;
            }
            if (view.getLayoutParams().width<=0 || view.getLayoutParams().height<=0) {
                return;
            }

            Picasso.get()
                    .load(temp)
                    .resize(view.getLayoutParams().width,
                            view.getLayoutParams().height).into(view);
        });
    }
}
