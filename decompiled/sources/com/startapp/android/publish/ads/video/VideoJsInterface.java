package com.startapp.android.publish.ads.video;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import com.startapp.android.publish.adsCommon.p180d.C5363b;
import com.startapp.android.publish.html.JsInterface;
import com.startapp.common.p193a.C5518g;

/* compiled from: StartAppSDK */
public class VideoJsInterface extends JsInterface {
    private static final String TAG = "VideoJsInterface";
    private Runnable replayCallback = null;
    private Runnable skipCallback = null;
    private Runnable toggleSoundCallback = null;

    public VideoJsInterface(Context context, Runnable runnable, Runnable runnable2, Runnable runnable3, Runnable runnable4, Runnable runnable5, C5363b bVar, boolean z) {
        super(context, runnable, runnable2, bVar);
        this.replayCallback = runnable3;
        this.skipCallback = runnable4;
        this.toggleSoundCallback = runnable5;
        this.inAppBrowserEnabled = z;
    }

    @JavascriptInterface
    public void replayVideo() {
        C5518g.m23563a(TAG, 3, "replayVideo called");
        if (this.replayCallback != null) {
            new Handler(Looper.getMainLooper()).post(this.replayCallback);
        }
    }

    @JavascriptInterface
    public void skipVideo() {
        C5518g.m23563a(TAG, 3, "skipVideo called");
        if (this.skipCallback != null) {
            new Handler(Looper.getMainLooper()).post(this.skipCallback);
        }
    }

    @JavascriptInterface
    public void toggleSound() {
        C5518g.m23563a(TAG, 3, "toggleSound called");
        if (this.toggleSoundCallback != null) {
            new Handler(Looper.getMainLooper()).post(this.toggleSoundCallback);
        }
    }
}
