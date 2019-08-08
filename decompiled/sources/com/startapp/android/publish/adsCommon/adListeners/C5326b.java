package com.startapp.android.publish.adsCommon.adListeners;

import android.os.Handler;
import android.os.Looper;
import com.startapp.android.publish.adsCommon.C5286Ad;

/* renamed from: com.startapp.android.publish.adsCommon.adListeners.b */
/* compiled from: StartAppSDK */
public class C5326b implements AdEventListener {

    /* renamed from: a */
    AdEventListener f17083a;

    public C5326b(AdEventListener adEventListener) {
        this.f17083a = adEventListener;
    }

    public void onReceiveAd(final C5286Ad ad) {
        if (this.f17083a != null) {
            Handler a = mo19678a();
            if (a != null) {
                a.post(new Runnable() {
                    public void run() {
                        C5326b.this.f17083a.onReceiveAd(ad);
                    }
                });
            } else {
                this.f17083a.onReceiveAd(ad);
            }
        }
    }

    public void onFailedToReceiveAd(final C5286Ad ad) {
        if (this.f17083a != null) {
            Handler a = mo19678a();
            if (a != null) {
                a.post(new Runnable() {
                    public void run() {
                        C5326b.this.f17083a.onFailedToReceiveAd(ad);
                    }
                });
            } else {
                this.f17083a.onFailedToReceiveAd(ad);
            }
        }
    }

    /* renamed from: a */
    public Handler mo19678a() {
        return new Handler(Looper.getMainLooper());
    }
}
