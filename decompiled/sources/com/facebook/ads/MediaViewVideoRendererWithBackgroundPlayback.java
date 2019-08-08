package com.facebook.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.facebook.ads.internal.p093t.C1815c;

public final class MediaViewVideoRendererWithBackgroundPlayback extends MediaViewVideoRenderer {

    /* renamed from: d */
    private C1815c f4720d;

    public MediaViewVideoRendererWithBackgroundPlayback(Context context) {
        super(context);
        this.f4720d = new C1815c(context, this);
        setVolume(1.0f);
    }

    public MediaViewVideoRendererWithBackgroundPlayback(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4720d = new C1815c(context, this);
        setVolume(1.0f);
    }

    public MediaViewVideoRendererWithBackgroundPlayback(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4720d = new C1815c(context, this);
        setVolume(1.0f);
    }

    @TargetApi(21)
    public MediaViewVideoRendererWithBackgroundPlayback(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f4720d = new C1815c(context, this);
        setVolume(1.0f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6800a() {
        super.mo6800a();
        this.f4720d.mo7719a();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4720d.mo7723c();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f4720d.mo7724d();
        super.onDetachedFromWindow();
    }

    public void onPrepared() {
        super.onPrepared();
        setOnTouchListener(new OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        this.f4720d.mo7722b();
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        this.f4720d.mo7725e();
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.f4720d.mo7726f();
    }

    /* access modifiers changed from: protected */
    public void setNativeAd(NativeAd nativeAd) {
        super.setNativeAd(nativeAd);
        this.f4720d.mo7720a(nativeAd.mo6927f());
    }

    public boolean shouldAllowBackgroundPlayback() {
        return true;
    }
}
