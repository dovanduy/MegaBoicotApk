package com.startapp.android.publish.adsCommon.adListeners;

import android.os.Handler;
import android.os.Looper;
import com.startapp.android.publish.adsCommon.C5286Ad;

/* renamed from: com.startapp.android.publish.adsCommon.adListeners.a */
/* compiled from: StartAppSDK */
public class C5321a implements AdDisplayListener {

    /* renamed from: a */
    AdDisplayListener f17074a;

    public C5321a(AdDisplayListener adDisplayListener) {
        this.f17074a = adDisplayListener;
    }

    public void adHidden(final C5286Ad ad) {
        if (this.f17074a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    C5321a.this.f17074a.adHidden(ad);
                }
            });
        }
    }

    public void adDisplayed(final C5286Ad ad) {
        if (this.f17074a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    C5321a.this.f17074a.adDisplayed(ad);
                }
            });
        }
    }

    public void adClicked(final C5286Ad ad) {
        if (this.f17074a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    C5321a.this.f17074a.adClicked(ad);
                }
            });
        }
    }

    public void adNotDisplayed(final C5286Ad ad) {
        if (this.f17074a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    C5321a.this.f17074a.adNotDisplayed(ad);
                }
            });
        }
    }
}
