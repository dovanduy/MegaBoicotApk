package com.appnext.core;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.RotateAnimation;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.appnext.base.p046b.C1245d;
import com.appnext.core.C1317e.C1324a;
import com.google.android.exoplayer2.extractor.MpegAudioHeader;

public abstract class AppnextActivity extends Activity {
    protected String banner = "";
    protected String guid = "";
    /* access modifiers changed from: protected */
    public Handler handler;

    /* renamed from: kp */
    protected String f4104kp = "";

    /* renamed from: kq */
    private RelativeLayout f4105kq;

    /* renamed from: kr */
    protected RelativeLayout f4106kr;
    /* access modifiers changed from: protected */
    public String placementID;
    /* access modifiers changed from: protected */
    public C1349q userAction;

    /* access modifiers changed from: protected */
    public abstract C1345p getConfig();

    /* access modifiers changed from: protected */
    public abstract void onError(String str);

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        new Thread(new Runnable() {
            public final void run() {
                if (!C1326f.m5703z(AppnextActivity.this)) {
                    AppnextActivity.this.finish();
                    AppnextActivity.this.runOnUiThread(new Runnable() {
                        public final void run() {
                            AppnextActivity.this.onError(AppnextError.CONNECTION_ERROR);
                        }
                    });
                }
            }
        }).start();
        requestWindowFeature(1);
        getWindow().setFlags(C1245d.f3947iP, C1245d.f3947iP);
        getWindow().addFlags(128);
        super.onCreate(bundle);
        this.handler = new Handler();
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"NewApi"})
    /* renamed from: cy */
    public final void mo6095cy() {
        int systemUiVisibility = getWindow().getDecorView().getSystemUiVisibility() ^ 2;
        if (VERSION.SDK_INT >= 16) {
            systemUiVisibility ^= 4;
        }
        if (VERSION.SDK_INT >= 18) {
            systemUiVisibility ^= MpegAudioHeader.MAX_FRAME_SIZE_BYTES;
        }
        getWindow().getDecorView().setSystemUiVisibility(systemUiVisibility);
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"NewApi"})
    /* renamed from: cz */
    public final void mo6096cz() {
        int systemUiVisibility = getWindow().getDecorView().getSystemUiVisibility() | 2;
        if (VERSION.SDK_INT >= 16) {
            systemUiVisibility |= 4;
        }
        if (VERSION.SDK_INT >= 18) {
            systemUiVisibility |= MpegAudioHeader.MAX_FRAME_SIZE_BYTES;
        }
        getWindow().getDecorView().setSystemUiVisibility(systemUiVisibility);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo5424a(AppnextAd appnextAd, C1324a aVar) {
        if (this.userAction != null && appnextAd != null) {
            this.userAction.mo6290a(appnextAd, appnextAd.getAppURL(), aVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo5425b(AppnextAd appnextAd, C1324a aVar) {
        if (this.userAction != null && appnextAd != null) {
            this.userAction.mo6291a(appnextAd, appnextAd.getAppURL(), this.placementID, aVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6093a(ViewGroup viewGroup, Drawable drawable) {
        if (this.f4105kq != null) {
            mo6094cA();
        }
        this.f4105kq = new RelativeLayout(this);
        this.f4105kq.setBackgroundColor(Color.parseColor("#77ffffff"));
        viewGroup.addView(this.f4105kq);
        this.f4105kq.getLayoutParams().height = -1;
        this.f4105kq.getLayoutParams().width = -1;
        ProgressBar progressBar = new ProgressBar(this, null, 16842871);
        progressBar.setIndeterminateDrawable(drawable);
        progressBar.setIndeterminate(true);
        this.f4105kq.addView(progressBar);
        RotateAnimation rotateAnimation = new RotateAnimation(360.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(1000);
        rotateAnimation.setRepeatCount(-1);
        progressBar.setAnimation(rotateAnimation);
        ((LayoutParams) progressBar.getLayoutParams()).addRule(13, -1);
        this.f4105kq.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
            }
        });
        this.handler.postDelayed(new Runnable() {
            public final void run() {
                AppnextActivity.this.mo6094cA();
            }
        }, 8000);
    }

    /* access modifiers changed from: protected */
    /* renamed from: cA */
    public final void mo6094cA() {
        if (this.f4105kq != null) {
            this.f4105kq.removeAllViews();
            this.f4105kq.removeAllViewsInLayout();
            if (this.f4105kq.getParent() != null) {
                ((RelativeLayout) this.f4105kq.getParent()).removeView(this.f4105kq);
            }
        }
        if (this.handler != null) {
            this.handler.removeCallbacks(null);
        }
        this.f4105kq = null;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|5) */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDestroy() {
        /*
            r2 = this;
            super.onDestroy()
            r0 = 0
            android.os.Handler r1 = r2.handler     // Catch:{ Throwable -> 0x000b }
            r1.removeCallbacks(r0)     // Catch:{ Throwable -> 0x000b }
            r2.handler = r0     // Catch:{ Throwable -> 0x000b }
        L_0x000b:
            com.appnext.core.q r1 = r2.userAction     // Catch:{ Throwable -> 0x0013 }
            r1.destroy()     // Catch:{ Throwable -> 0x0013 }
            r2.userAction = r0     // Catch:{ Throwable -> 0x0013 }
            return
        L_0x0013:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.core.AppnextActivity.onDestroy():void");
    }
}
