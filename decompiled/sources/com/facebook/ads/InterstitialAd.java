package com.facebook.ads;

import android.content.Context;
import com.facebook.ads.internal.p075c.C1697f;
import com.facebook.ads.internal.p075c.C1698g;
import java.util.EnumSet;

public class InterstitialAd implements C1514Ad {

    /* renamed from: a */
    private final C1698g f4679a;

    /* renamed from: b */
    private final C1697f f4680b = new C1697f(this.f4679a);

    public InterstitialAd(Context context, String str) {
        this.f4679a = new C1698g(context.getApplicationContext(), this, str);
    }

    /* renamed from: a */
    private void m6387a(EnumSet<CacheFlag> enumSet, String str) {
        this.f4680b.mo7418a(this, enumSet, str);
    }

    public void destroy() {
        this.f4680b.mo7403d();
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        this.f4680b.mo7404e();
    }

    public String getPlacementId() {
        return this.f4679a.f5296b;
    }

    public boolean isAdInvalidated() {
        return this.f4680b.mo7421g();
    }

    public boolean isAdLoaded() {
        return this.f4680b.mo7420f();
    }

    public void loadAd() {
        loadAd(CacheFlag.ALL);
    }

    public void loadAd(EnumSet<CacheFlag> enumSet) {
        m6387a(enumSet, null);
    }

    public void loadAdFromBid(String str) {
        m6387a(CacheFlag.ALL, str);
    }

    public void loadAdFromBid(EnumSet<CacheFlag> enumSet, String str) {
        m6387a(enumSet, str);
    }

    public void setAdListener(InterstitialAdListener interstitialAdListener) {
        this.f4679a.f5297c = interstitialAdListener;
    }

    public void setExtraHints(ExtraHints extraHints) {
        this.f4679a.f5298d = extraHints.getHints();
    }

    public boolean show() {
        return this.f4680b.mo7419a(this);
    }
}
