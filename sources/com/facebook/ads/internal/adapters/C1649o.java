package com.facebook.ads.internal.adapters;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.p017v4.content.C0362f;
import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.internal.adapters.o */
public class C1649o extends BroadcastReceiver {

    /* renamed from: a */
    private String f5160a;

    /* renamed from: b */
    private Context f5161b;

    /* renamed from: c */
    private InterstitialAdapterListener f5162c;

    /* renamed from: d */
    private C1628g f5163d;

    public C1649o(Context context, String str, C1628g gVar, InterstitialAdapterListener interstitialAdapterListener) {
        this.f5161b = context;
        this.f5160a = str;
        this.f5162c = interstitialAdapterListener;
        this.f5163d = gVar;
    }

    /* renamed from: a */
    public void mo7330a() {
        IntentFilter intentFilter = new IntentFilter();
        StringBuilder sb = new StringBuilder();
        sb.append("com.facebook.ads.interstitial.impression.logged:");
        sb.append(this.f5160a);
        intentFilter.addAction(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("com.facebook.ads.interstitial.displayed:");
        sb2.append(this.f5160a);
        intentFilter.addAction(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append("com.facebook.ads.interstitial.dismissed:");
        sb3.append(this.f5160a);
        intentFilter.addAction(sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append("com.facebook.ads.interstitial.clicked:");
        sb4.append(this.f5160a);
        intentFilter.addAction(sb4.toString());
        StringBuilder sb5 = new StringBuilder();
        sb5.append("com.facebook.ads.interstitial.error:");
        sb5.append(this.f5160a);
        intentFilter.addAction(sb5.toString());
        StringBuilder sb6 = new StringBuilder();
        sb6.append("com.facebook.ads.interstitial.activity_destroyed:");
        sb6.append(this.f5160a);
        intentFilter.addAction(sb6.toString());
        C0362f.m1362a(this.f5161b).mo1251a(this, intentFilter);
    }

    /* renamed from: b */
    public void mo7331b() {
        try {
            C0362f.m1362a(this.f5161b).mo1250a((BroadcastReceiver) this);
        } catch (Exception unused) {
        }
    }

    public void onReceive(Context context, Intent intent) {
        String str = intent.getAction().split(":")[0];
        if (this.f5162c != null && str != null) {
            if ("com.facebook.ads.interstitial.clicked".equals(str)) {
                this.f5162c.onInterstitialAdClicked(this.f5163d, null, true);
            } else if ("com.facebook.ads.interstitial.dismissed".equals(str)) {
                this.f5162c.onInterstitialAdDismissed(this.f5163d);
            } else if ("com.facebook.ads.interstitial.displayed".equals(str)) {
                this.f5162c.onInterstitialAdDisplayed(this.f5163d);
            } else if ("com.facebook.ads.interstitial.impression.logged".equals(str)) {
                this.f5162c.onInterstitialLoggingImpression(this.f5163d);
            } else if ("com.facebook.ads.interstitial.error".equals(str)) {
                this.f5162c.onInterstitialError(this.f5163d, AdError.INTERNAL_ERROR);
            } else {
                if ("com.facebook.ads.interstitial.activity_destroyed".equals(str)) {
                    this.f5162c.onInterstitialActivityDestroyed();
                }
            }
        }
    }
}
