package com.dylanvann.fastimage;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.load.model.GlideUrl;

class FastImageViewWithUrl extends ImageView {
    public GlideUrl glideUrl;
    private OnDetachedFromWindowListener mOnDetachedFromWindowListener;

    public FastImageViewWithUrl(Context context) {
        super(context);
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (mOnDetachedFromWindowListener != null) {
            mOnDetachedFromWindowListener.onDetached();
        }
    }

    public void setOnDetachedFromWindowListener(OnDetachedFromWindowListener onDetachedFromWindowListener) {
        mOnDetachedFromWindowListener = onDetachedFromWindowListener;
    }

    public interface OnDetachedFromWindowListener {
        void onDetached();
    }
}
