package com.facebook.ads;

import android.content.Context;
import com.facebook.ads.internal.p075c.C1701i;
import com.facebook.ads.internal.p075c.C1702j;

public class RewardedVideoAd implements C1514Ad {
    public static final int UNSET_VIDEO_DURATION = -1;

    /* renamed from: a */
    private final C1702j f4776a;

    /* renamed from: b */
    private final C1701i f4777b = new C1701i(this.f4776a);

    public RewardedVideoAd(Context context, String str) {
        this.f4776a = new C1702j(context.getApplicationContext(), str, this);
    }

    /* renamed from: a */
    private void m6465a(String str, boolean z) {
        this.f4777b.mo7432a(this, str, z);
    }

    public void destroy() {
        this.f4777b.mo7403d();
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        this.f4777b.mo7404e();
    }

    public String getPlacementId() {
        return this.f4776a.f5315b;
    }

    public int getVideoDuration() {
        return this.f4776a.f5321h;
    }

    public boolean isAdInvalidated() {
        return this.f4777b.mo7435g();
    }

    public boolean isAdLoaded() {
        return this.f4777b.mo7434f();
    }

    public void loadAd() {
        m6465a(null, true);
    }

    public void loadAd(boolean z) {
        m6465a(null, z);
    }

    public void loadAdFromBid(String str) {
        m6465a(str, true);
    }

    public void loadAdFromBid(String str, boolean z) {
        m6465a(str, z);
    }

    public void setAdListener(RewardedVideoAdListener rewardedVideoAdListener) {
        this.f4776a.f5316c = rewardedVideoAdListener;
    }

    public void setExtraHints(ExtraHints extraHints) {
        this.f4776a.f5317d = extraHints.getHints();
    }

    public void setRewardData(RewardData rewardData) {
        this.f4777b.mo7431a(rewardData);
    }

    public boolean show() {
        return show(-1);
    }

    public boolean show(int i) {
        return this.f4777b.mo7433a(this, i);
    }
}
