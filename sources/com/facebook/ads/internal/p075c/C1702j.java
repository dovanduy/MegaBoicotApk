package com.facebook.ads.internal.p075c;

import android.content.Context;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import com.facebook.ads.internal.p091r.C1795a;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.internal.c.j */
public class C1702j {

    /* renamed from: a */
    public final Context f5314a;

    /* renamed from: b */
    public final String f5315b;

    /* renamed from: c */
    public RewardedVideoAdListener f5316c;

    /* renamed from: d */
    public String f5317d;

    /* renamed from: e */
    public RewardData f5318e;

    /* renamed from: f */
    public String f5319f;

    /* renamed from: g */
    public boolean f5320g;

    /* renamed from: h */
    public int f5321h = -1;

    /* renamed from: i */
    public long f5322i;

    /* renamed from: j */
    private RewardedVideoAd f5323j;

    /* renamed from: k */
    private WeakReference<RewardedVideoAd> f5324k;

    public C1702j(Context context, String str, RewardedVideoAd rewardedVideoAd) {
        this.f5314a = context;
        this.f5315b = str;
        this.f5323j = rewardedVideoAd;
        this.f5324k = new WeakReference<>(rewardedVideoAd);
        this.f5322i = -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public RewardedVideoAd mo7436a() {
        return this.f5323j != null ? this.f5323j : (RewardedVideoAd) this.f5324k.get();
    }

    /* renamed from: a */
    public void mo7437a(RewardedVideoAd rewardedVideoAd) {
        if (rewardedVideoAd != null || C1795a.m7432Z(this.f5314a)) {
            this.f5323j = rewardedVideoAd;
        }
    }
}
