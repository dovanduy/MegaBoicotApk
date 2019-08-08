package com.facebook.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.facebook.ads.internal.p093t.C1815c;
import com.facebook.ads.internal.p093t.C1815c.C1820a;
import com.facebook.ads.internal.p093t.C1822e;
import java.lang.ref.WeakReference;

public final class DefaultMediaViewVideoRenderer extends MediaViewVideoRenderer {

    /* renamed from: d */
    private C1815c f4657d;

    /* renamed from: com.facebook.ads.DefaultMediaViewVideoRenderer$a */
    private static class C1530a implements C1820a {

        /* renamed from: a */
        private WeakReference<C1822e> f4659a;

        C1530a(C1822e eVar) {
            this.f4659a = new WeakReference<>(eVar);
        }

        /* renamed from: a */
        public void mo6808a(boolean z) {
            if (this.f4659a.get() != null) {
                ((C1822e) this.f4659a.get()).mo7744a(z, false);
            }
        }
    }

    public DefaultMediaViewVideoRenderer(Context context) {
        super(context);
        this.f4657d = new C1815c(context, this);
        setVolume(0.0f);
    }

    public DefaultMediaViewVideoRenderer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4657d = new C1815c(context, this);
        setVolume(0.0f);
    }

    public DefaultMediaViewVideoRenderer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4657d = new C1815c(context, this);
        setVolume(0.0f);
    }

    @TargetApi(21)
    public DefaultMediaViewVideoRenderer(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f4657d = new C1815c(context, this);
        setVolume(0.0f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6800a() {
        super.mo6800a();
        if (this.f4657d != null) {
            this.f4657d.mo7719a();
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f4657d != null) {
            this.f4657d.mo7723c();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        if (this.f4657d != null) {
            this.f4657d.mo7724d();
        }
        super.onDetachedFromWindow();
    }

    public void onPrepared() {
        super.onPrepared();
        setOnTouchListener(new OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        if (this.f4657d != null) {
            this.f4657d.mo7722b();
        }
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (this.f4657d != null) {
            this.f4657d.mo7725e();
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.f4657d != null) {
            this.f4657d.mo7726f();
        }
    }

    /* access modifiers changed from: protected */
    public void setNativeAd(NativeAd nativeAd) {
        super.setNativeAd(nativeAd);
        if (this.f4657d != null) {
            this.f4657d.mo7721a(nativeAd.mo6927f(), (C1820a) new C1530a(nativeAd.mo6927f()));
        }
    }
}
