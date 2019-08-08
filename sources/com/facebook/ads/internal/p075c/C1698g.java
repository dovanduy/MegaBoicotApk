package com.facebook.ads.internal.p075c;

import android.content.Context;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.facebook.ads.internal.p091r.C1795a;
import java.lang.ref.WeakReference;
import java.util.EnumSet;

/* renamed from: com.facebook.ads.internal.c.g */
public class C1698g {

    /* renamed from: a */
    public final Context f5295a;

    /* renamed from: b */
    public final String f5296b;

    /* renamed from: c */
    public InterstitialAdListener f5297c;

    /* renamed from: d */
    public String f5298d;

    /* renamed from: e */
    public EnumSet<CacheFlag> f5299e;

    /* renamed from: f */
    public String f5300f;

    /* renamed from: g */
    public long f5301g = -1;

    /* renamed from: h */
    private InterstitialAd f5302h;

    /* renamed from: i */
    private WeakReference<InterstitialAd> f5303i;

    public C1698g(Context context, InterstitialAd interstitialAd, String str) {
        this.f5295a = context;
        this.f5296b = str;
        this.f5302h = interstitialAd;
        this.f5303i = new WeakReference<>(interstitialAd);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public InterstitialAd mo7422a() {
        return this.f5302h != null ? this.f5302h : (InterstitialAd) this.f5303i.get();
    }

    /* renamed from: a */
    public void mo7423a(InterstitialAd interstitialAd) {
        if (interstitialAd != null || C1795a.m7432Z(this.f5295a)) {
            this.f5302h = interstitialAd;
        }
    }
}
