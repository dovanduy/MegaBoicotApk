package com.facebook.ads.internal.p075c;

import android.os.Bundle;
import android.os.Message;
import com.facebook.ads.AdError;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.internal.p074b.C1669e;
import com.facebook.ads.internal.p075c.C1679a.C1681a;
import com.facebook.ads.internal.p115w.p117b.C2339v;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.C1782a;
import com.facebook.ads.internal.settings.AdInternalSettings;

/* renamed from: com.facebook.ads.internal.c.i */
public class C1701i extends C1686b {

    /* renamed from: e */
    private final C1702j f5312e;

    /* renamed from: f */
    private C1694e f5313f;

    public C1701i(C1702j jVar) {
        super(jVar.f5314a);
        this.f5312e = jVar;
    }

    /* renamed from: h */
    private void m7077h() {
        mo7397a(AdError.CACHE_ERROR_CODE, null);
        this.f5270b.mo7427b();
        this.f5312e.mo7437a(null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Message mo7396a() {
        Message obtain = Message.obtain(null, 2000);
        obtain.getData().putString("STR_PLACEMENT_KEY", this.f5312e.f5315b);
        obtain.getData().putString("STR_AD_ID_KEY", this.f5271c);
        obtain.getData().putString("STR_BID_PAYLOAD_KEY", this.f5312e.f5319f);
        obtain.getData().putString("STR_EXTRA_HINTS_KEY", this.f5312e.f5317d);
        obtain.getData().putBoolean("BOOL_RV_FAIL_ON_CACHE_FAILURE_KEY", this.f5312e.f5320g);
        obtain.getData().putSerializable("SRL_RV_REWARD_DATA_KEY", this.f5312e.f5318e);
        obtain.getData().putBundle("BUNDLE_SETTINGS_KEY", AdInternalSettings.f5731a);
        return obtain;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a2  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7399a(android.os.Message r10) {
        /*
            r9 = this;
            com.facebook.ads.internal.c.j r0 = r9.f5312e
            com.facebook.ads.RewardedVideoAd r0 = r0.mo7436a()
            if (r0 != 0) goto L_0x0019
            android.content.Context r10 = r9.f5269a
            java.lang.String r0 = "api"
            int r1 = com.facebook.ads.internal.p115w.p123h.C2373b.f7512n
            java.lang.Exception r2 = new java.lang.Exception
            java.lang.String r3 = "Ad object is null"
            r2.<init>(r3)
            com.facebook.ads.internal.p115w.p123h.C2370a.m9149b(r10, r0, r1, r2)
            return
        L_0x0019:
            int r1 = r10.what
            r2 = 10
            r3 = 0
            if (r1 == r2) goto L_0x0108
            r2 = 2100(0x834, float:2.943E-42)
            if (r1 == r2) goto L_0x0053
            r4 = 2103(0x837, float:2.947E-42)
            if (r1 == r4) goto L_0x0108
            r4 = 2106(0x83a, float:2.951E-42)
            if (r1 == r4) goto L_0x003d
            switch(r1) {
                case 2010: goto L_0x0035;
                case 2011: goto L_0x0030;
                default: goto L_0x002f;
            }
        L_0x002f:
            goto L_0x009b
        L_0x0030:
            com.facebook.ads.internal.c.h r1 = r9.f5270b
            java.lang.String r3 = "Received show confirmation."
            goto L_0x0039
        L_0x0035:
            com.facebook.ads.internal.c.h r1 = r9.f5270b
            java.lang.String r3 = "Received load confirmation."
        L_0x0039:
            r1.mo7426a(r3)
            goto L_0x009b
        L_0x003d:
            com.facebook.ads.internal.c.a r1 = r9.f5272d
            com.facebook.ads.internal.c.a$a r4 = com.facebook.ads.internal.p075c.C1679a.C1681a.SHOWN
            r1.mo7393a(r4)
            com.facebook.ads.internal.c.h r1 = r9.f5270b
            boolean r1 = r1.f5305b
            if (r1 == 0) goto L_0x004d
            r9.m7077h()
        L_0x004d:
            com.facebook.ads.internal.c.j r1 = r9.f5312e
            r1.mo7437a(r3)
            goto L_0x009b
        L_0x0053:
            com.facebook.ads.internal.c.a r1 = r9.f5272d
            com.facebook.ads.internal.c.a$a r4 = com.facebook.ads.internal.p075c.C1679a.C1681a.LOADED
            r1.mo7393a(r4)
            android.os.Bundle r1 = r10.getData()
            java.lang.String r4 = "BUNDLE_EXTRAS_KEY"
            android.os.Bundle r1 = r1.getBundle(r4)
            if (r1 == 0) goto L_0x007b
            com.facebook.ads.internal.c.j r4 = r9.f5312e
            java.lang.String r5 = "LONG_INVALIDATION_TIME_KEY"
            long r5 = r1.getLong(r5)
            r4.f5322i = r5
            com.facebook.ads.internal.c.j r4 = r9.f5312e
            java.lang.String r5 = "INT_RV_VIDEO_DURATION_KEY"
            int r1 = r1.getInt(r5)
            r4.f5321h = r1
            goto L_0x004d
        L_0x007b:
            android.content.Context r1 = r9.f5269a
            java.lang.String r4 = "api"
            int r5 = com.facebook.ads.internal.p115w.p123h.C2373b.f7511m
            java.lang.Exception r6 = new java.lang.Exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Missing bundle for message: "
            r7.append(r8)
            r7.append(r10)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            com.facebook.ads.internal.p115w.p123h.C2370a.m9149b(r1, r4, r5, r6)
            goto L_0x004d
        L_0x009b:
            com.facebook.ads.internal.c.j r1 = r9.f5312e
            com.facebook.ads.RewardedVideoAdListener r1 = r1.f5316c
            if (r1 != 0) goto L_0x00a2
            return
        L_0x00a2:
            int r10 = r10.what
            if (r10 == r2) goto L_0x0100
            switch(r10) {
                case 2104: goto L_0x00f8;
                case 2105: goto L_0x00f0;
                case 2106: goto L_0x00de;
                case 2107: goto L_0x00d6;
                case 2108: goto L_0x00c4;
                case 2109: goto L_0x00b2;
                case 2110: goto L_0x00aa;
                default: goto L_0x00a9;
            }
        L_0x00a9:
            return
        L_0x00aa:
            com.facebook.ads.internal.c.j r10 = r9.f5312e
            com.facebook.ads.RewardedVideoAdListener r10 = r10.f5316c
            r10.onRewardedVideoClosed()
            return
        L_0x00b2:
            com.facebook.ads.internal.c.j r10 = r9.f5312e
            com.facebook.ads.RewardedVideoAdListener r10 = r10.f5316c
            boolean r10 = r10 instanceof com.facebook.ads.S2SRewardedVideoAdListener
            if (r10 == 0) goto L_0x00c3
            com.facebook.ads.internal.c.j r10 = r9.f5312e
            com.facebook.ads.RewardedVideoAdListener r10 = r10.f5316c
            com.facebook.ads.S2SRewardedVideoAdListener r10 = (com.facebook.ads.S2SRewardedVideoAdListener) r10
            r10.onRewardServerFailed()
        L_0x00c3:
            return
        L_0x00c4:
            com.facebook.ads.internal.c.j r10 = r9.f5312e
            com.facebook.ads.RewardedVideoAdListener r10 = r10.f5316c
            boolean r10 = r10 instanceof com.facebook.ads.S2SRewardedVideoAdListener
            if (r10 == 0) goto L_0x00d5
            com.facebook.ads.internal.c.j r10 = r9.f5312e
            com.facebook.ads.RewardedVideoAdListener r10 = r10.f5316c
            com.facebook.ads.S2SRewardedVideoAdListener r10 = (com.facebook.ads.S2SRewardedVideoAdListener) r10
            r10.onRewardServerSuccess()
        L_0x00d5:
            return
        L_0x00d6:
            com.facebook.ads.internal.c.j r10 = r9.f5312e
            com.facebook.ads.RewardedVideoAdListener r10 = r10.f5316c
            r10.onRewardedVideoCompleted()
            return
        L_0x00de:
            com.facebook.ads.internal.c.j r10 = r9.f5312e
            com.facebook.ads.RewardedVideoAdListener r10 = r10.f5316c
            boolean r10 = r10 instanceof com.facebook.ads.RewardedVideoAdExtendedListener
            if (r10 == 0) goto L_0x00ef
            com.facebook.ads.internal.c.j r10 = r9.f5312e
            com.facebook.ads.RewardedVideoAdListener r10 = r10.f5316c
            com.facebook.ads.RewardedVideoAdExtendedListener r10 = (com.facebook.ads.RewardedVideoAdExtendedListener) r10
            r10.onRewardedVideoActivityDestroyed()
        L_0x00ef:
            return
        L_0x00f0:
            com.facebook.ads.internal.c.j r10 = r9.f5312e
            com.facebook.ads.RewardedVideoAdListener r10 = r10.f5316c
            r10.onLoggingImpression(r0)
            return
        L_0x00f8:
            com.facebook.ads.internal.c.j r10 = r9.f5312e
            com.facebook.ads.RewardedVideoAdListener r10 = r10.f5316c
            r10.onAdClicked(r0)
            return
        L_0x0100:
            com.facebook.ads.internal.c.j r10 = r9.f5312e
            com.facebook.ads.RewardedVideoAdListener r10 = r10.f5316c
            r10.onAdLoaded(r0)
            return
        L_0x0108:
            com.facebook.ads.internal.c.a r1 = r9.f5272d
            com.facebook.ads.internal.c.a$a r2 = com.facebook.ads.internal.p075c.C1679a.C1681a.ERROR
            r1.mo7393a(r2)
            com.facebook.ads.internal.c.h r1 = r9.f5270b
            boolean r1 = r1.f5305b
            if (r1 == 0) goto L_0x0118
            r9.m7077h()
        L_0x0118:
            android.os.Bundle r1 = r10.getData()
            java.lang.String r2 = "BUNDLE_EXTRAS_KEY"
            android.os.Bundle r1 = r1.getBundle(r2)
            if (r1 == 0) goto L_0x0149
            java.lang.String r10 = "INT_ERROR_CODE_KEY"
            int r10 = r1.getInt(r10)
            java.lang.String r2 = "STR_ERROR_MESSAGE_KEY"
            java.lang.String r1 = r1.getString(r2)
            com.facebook.ads.internal.c.j r2 = r9.f5312e
            com.facebook.ads.RewardedVideoAdListener r2 = r2.f5316c
            if (r2 == 0) goto L_0x0143
            com.facebook.ads.internal.c.j r2 = r9.f5312e
            com.facebook.ads.RewardedVideoAdListener r2 = r2.f5316c
            com.facebook.ads.AdError r4 = new com.facebook.ads.AdError
            r4.<init>(r10, r1)
            r2.onError(r0, r4)
            goto L_0x0168
        L_0x0143:
            java.lang.String r10 = "FBAudienceNetwork"
            android.util.Log.e(r10, r1)
            goto L_0x0168
        L_0x0149:
            android.content.Context r0 = r9.f5269a
            java.lang.String r1 = "api"
            int r2 = com.facebook.ads.internal.p115w.p123h.C2373b.f7511m
            java.lang.Exception r4 = new java.lang.Exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Missing bundle for message: "
            r5.append(r6)
            r5.append(r10)
            java.lang.String r10 = r5.toString()
            r4.<init>(r10)
            com.facebook.ads.internal.p115w.p123h.C2370a.m9149b(r0, r1, r2, r4)
        L_0x0168:
            com.facebook.ads.internal.c.j r10 = r9.f5312e
            r10.mo7437a(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.p075c.C1701i.mo7399a(android.os.Message):void");
    }

    /* renamed from: a */
    public void mo7431a(RewardData rewardData) {
        this.f5312e.f5318e = rewardData;
        if (this.f5270b.f5305b) {
            Bundle bundle = new Bundle();
            bundle.putSerializable("SRL_RV_REWARD_DATA_KEY", rewardData);
            mo7397a(AdError.INTERNAL_ERROR_2003, bundle);
            return;
        }
        if (this.f5313f != null) {
            this.f5313f.mo7412a(rewardData);
        }
    }

    /* renamed from: a */
    public void mo7432a(RewardedVideoAd rewardedVideoAd, String str, boolean z) {
        C1782a a = C1669e.m6979a(this.f5269a, Integer.valueOf(0), Integer.valueOf(1));
        if (a != null) {
            mo7398a(10, AdErrorType.MISSING_DEPENDENCIES_ERROR, a.mo7636b());
        } else if (!this.f5272d.mo7394a(C1681a.LOADING, "load()")) {
            this.f5312e.mo7437a(rewardedVideoAd);
            if (this.f5313f != null) {
                this.f5313f.mo7413a(str, z);
                return;
            }
            this.f5312e.f5319f = str;
            this.f5312e.f5320g = z;
            if (!mo7400a(this.f5312e.f5314a)) {
                mo7402c();
            } else if (this.f5270b.f5305b) {
                mo7401b();
            } else {
                this.f5270b.f5306c = true;
                this.f5270b.mo7424a();
            }
        }
    }

    /* renamed from: a */
    public boolean mo7433a(RewardedVideoAd rewardedVideoAd, int i) {
        if (this.f5272d.mo7394a(C1681a.SHOWING, "show()")) {
            return false;
        }
        this.f5312e.mo7437a(rewardedVideoAd);
        if (this.f5270b.f5305b) {
            Bundle bundle = new Bundle();
            bundle.putInt("INT_RV_APP_ORIENTATION_KEY", i);
            mo7397a(AdError.INTERNAL_ERROR_CODE, bundle);
            return true;
        } else if (this.f5313f != null) {
            return this.f5313f.mo7414a(i);
        } else {
            this.f5313f = new C1694e(this.f5312e, this, this.f5271c);
            this.f5313f.mo7414a(i);
            return false;
        }
    }

    /* renamed from: c */
    public void mo7402c() {
        this.f5313f = new C1694e(this.f5312e, this, this.f5271c);
        this.f5313f.mo7413a(this.f5312e.f5319f, this.f5312e.f5320g);
    }

    /* renamed from: d */
    public void mo7403d() {
        if (this.f5270b.f5305b) {
            m7077h();
        }
        if (this.f5313f != null) {
            this.f5313f.mo7406a();
        }
        this.f5272d.mo7393a(C1681a.DESTROYED);
    }

    /* renamed from: f */
    public boolean mo7434f() {
        return this.f5313f != null ? this.f5313f.mo7417d() : this.f5272d.f5252a == C1681a.LOADED;
    }

    /* renamed from: g */
    public boolean mo7435g() {
        return this.f5313f != null ? this.f5313f.mo7416c() : this.f5312e.f5322i > 0 && C2339v.m9067a() > this.f5312e.f5322i;
    }
}
