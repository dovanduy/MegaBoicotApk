package com.facebook.ads.internal.p075c;

import android.os.Message;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.internal.p074b.C1669e;
import com.facebook.ads.internal.p075c.C1679a.C1681a;
import com.facebook.ads.internal.p115w.p117b.C2339v;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.C1782a;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.util.EnumSet;

/* renamed from: com.facebook.ads.internal.c.f */
public class C1697f extends C1686b {

    /* renamed from: e */
    private final C1698g f5293e;

    /* renamed from: f */
    private C1689d f5294f;

    public C1697f(C1698g gVar) {
        super(gVar.f5295a.getApplicationContext());
        this.f5293e = gVar;
    }

    /* renamed from: h */
    private void m7060h() {
        mo7397a(1012, null);
        this.f5270b.mo7427b();
        this.f5293e.mo7423a(null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Message mo7396a() {
        Message obtain = Message.obtain(null, 1010);
        obtain.getData().putString("STR_PLACEMENT_KEY", this.f5293e.f5296b);
        obtain.getData().putString("STR_AD_ID_KEY", this.f5271c);
        obtain.getData().putString("STR_BID_PAYLOAD_KEY", this.f5293e.f5300f);
        obtain.getData().putString("STR_EXTRA_HINTS_KEY", this.f5293e.f5298d);
        obtain.getData().putSerializable("SRL_INT_CACHE_FLAGS_KEY", this.f5293e.f5299e);
        obtain.getData().putBundle("BUNDLE_SETTINGS_KEY", AdInternalSettings.f5731a);
        return obtain;
    }

    /* JADX INFO: used method not loaded: com.facebook.ads.internal.c.h.a(java.lang.String):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004a, code lost:
        r1.mo7426a(r2);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7399a(android.os.Message r9) {
        /*
            r8 = this;
            com.facebook.ads.internal.c.g r0 = r8.f5293e
            com.facebook.ads.InterstitialAd r0 = r0.mo7422a()
            if (r0 != 0) goto L_0x0019
            android.content.Context r9 = r8.f5269a
            java.lang.String r0 = "api"
            int r1 = com.facebook.ads.internal.p115w.p123h.C2373b.f7512n
            java.lang.Exception r2 = new java.lang.Exception
            java.lang.String r3 = "Ad object is null"
            r2.<init>(r3)
            com.facebook.ads.internal.p115w.p123h.C2370a.m9149b(r9, r0, r1, r2)
            return
        L_0x0019:
            int r1 = r9.what
            r2 = 10
            r3 = 0
            if (r1 == r2) goto L_0x00d7
            r2 = 1020(0x3fc, float:1.43E-42)
            if (r1 == r2) goto L_0x004e
            switch(r1) {
                case 1015: goto L_0x0046;
                case 1016: goto L_0x0041;
                case 1017: goto L_0x003c;
                default: goto L_0x0027;
            }
        L_0x0027:
            switch(r1) {
                case 1022: goto L_0x002b;
                case 1023: goto L_0x00d7;
                default: goto L_0x002a;
            }
        L_0x002a:
            goto L_0x0090
        L_0x002b:
            com.facebook.ads.internal.c.a r1 = r8.f5272d
            com.facebook.ads.internal.c.a$a r2 = com.facebook.ads.internal.p075c.C1679a.C1681a.SHOWN
            r1.mo7393a(r2)
            com.facebook.ads.internal.c.h r1 = r8.f5270b
            boolean r1 = r1.f5305b
            if (r1 == 0) goto L_0x0090
            r8.m7060h()
            goto L_0x0090
        L_0x003c:
            com.facebook.ads.internal.c.h r1 = r8.f5270b
            java.lang.String r2 = "Received destroy confirmation."
            goto L_0x004a
        L_0x0041:
            com.facebook.ads.internal.c.h r1 = r8.f5270b
            java.lang.String r2 = "Received show confirmation."
            goto L_0x004a
        L_0x0046:
            com.facebook.ads.internal.c.h r1 = r8.f5270b
            java.lang.String r2 = "Received load confirmation."
        L_0x004a:
            r1.mo7426a(r2)
            goto L_0x0090
        L_0x004e:
            com.facebook.ads.internal.c.a r1 = r8.f5272d
            com.facebook.ads.internal.c.a$a r2 = com.facebook.ads.internal.p075c.C1679a.C1681a.LOADED
            r1.mo7393a(r2)
            android.os.Bundle r1 = r9.getData()
            java.lang.String r2 = "BUNDLE_EXTRAS_KEY"
            android.os.Bundle r1 = r1.getBundle(r2)
            if (r1 == 0) goto L_0x006c
            com.facebook.ads.internal.c.g r2 = r8.f5293e
            java.lang.String r4 = "LONG_INVALIDATION_TIME_KEY"
            long r4 = r1.getLong(r4)
            r2.f5301g = r4
            goto L_0x008b
        L_0x006c:
            android.content.Context r1 = r8.f5269a
            java.lang.String r2 = "api"
            int r4 = com.facebook.ads.internal.p115w.p123h.C2373b.f7511m
            java.lang.Exception r5 = new java.lang.Exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Missing bundle for message: "
            r6.append(r7)
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            com.facebook.ads.internal.p115w.p123h.C2370a.m9149b(r1, r2, r4, r5)
        L_0x008b:
            com.facebook.ads.internal.c.g r1 = r8.f5293e
            r1.mo7423a(r3)
        L_0x0090:
            com.facebook.ads.internal.c.g r1 = r8.f5293e
            com.facebook.ads.InterstitialAdListener r1 = r1.f5297c
            if (r1 != 0) goto L_0x0097
            return
        L_0x0097:
            int r9 = r9.what
            switch(r9) {
                case 1020: goto L_0x00cf;
                case 1021: goto L_0x00c7;
                case 1022: goto L_0x00bf;
                case 1023: goto L_0x009c;
                case 1024: goto L_0x00b7;
                case 1025: goto L_0x00af;
                case 1026: goto L_0x009d;
                default: goto L_0x009c;
            }
        L_0x009c:
            return
        L_0x009d:
            com.facebook.ads.internal.c.g r9 = r8.f5293e
            com.facebook.ads.InterstitialAdListener r9 = r9.f5297c
            boolean r9 = r9 instanceof com.facebook.ads.InterstitialAdExtendedListener
            if (r9 == 0) goto L_0x00d6
            com.facebook.ads.internal.c.g r9 = r8.f5293e
            com.facebook.ads.InterstitialAdListener r9 = r9.f5297c
            com.facebook.ads.InterstitialAdExtendedListener r9 = (com.facebook.ads.InterstitialAdExtendedListener) r9
            r9.onInterstitialActivityDestroyed()
            return
        L_0x00af:
            com.facebook.ads.internal.c.g r9 = r8.f5293e
            com.facebook.ads.InterstitialAdListener r9 = r9.f5297c
            r9.onLoggingImpression(r0)
            return
        L_0x00b7:
            com.facebook.ads.internal.c.g r9 = r8.f5293e
            com.facebook.ads.InterstitialAdListener r9 = r9.f5297c
            r9.onAdClicked(r0)
            return
        L_0x00bf:
            com.facebook.ads.internal.c.g r9 = r8.f5293e
            com.facebook.ads.InterstitialAdListener r9 = r9.f5297c
            r9.onInterstitialDismissed(r0)
            return
        L_0x00c7:
            com.facebook.ads.internal.c.g r9 = r8.f5293e
            com.facebook.ads.InterstitialAdListener r9 = r9.f5297c
            r9.onInterstitialDisplayed(r0)
            return
        L_0x00cf:
            com.facebook.ads.internal.c.g r9 = r8.f5293e
            com.facebook.ads.InterstitialAdListener r9 = r9.f5297c
            r9.onAdLoaded(r0)
        L_0x00d6:
            return
        L_0x00d7:
            com.facebook.ads.internal.c.a r1 = r8.f5272d
            com.facebook.ads.internal.c.a$a r2 = com.facebook.ads.internal.p075c.C1679a.C1681a.ERROR
            r1.mo7393a(r2)
            com.facebook.ads.internal.c.h r1 = r8.f5270b
            boolean r1 = r1.f5305b
            if (r1 == 0) goto L_0x00e7
            r8.m7060h()
        L_0x00e7:
            android.os.Bundle r1 = r9.getData()
            java.lang.String r2 = "BUNDLE_EXTRAS_KEY"
            android.os.Bundle r1 = r1.getBundle(r2)
            if (r1 == 0) goto L_0x0118
            java.lang.String r9 = "INT_ERROR_CODE_KEY"
            int r9 = r1.getInt(r9)
            java.lang.String r2 = "STR_ERROR_MESSAGE_KEY"
            java.lang.String r1 = r1.getString(r2)
            com.facebook.ads.internal.c.g r2 = r8.f5293e
            com.facebook.ads.InterstitialAdListener r2 = r2.f5297c
            if (r2 == 0) goto L_0x0112
            com.facebook.ads.internal.c.g r2 = r8.f5293e
            com.facebook.ads.InterstitialAdListener r2 = r2.f5297c
            com.facebook.ads.AdError r4 = new com.facebook.ads.AdError
            r4.<init>(r9, r1)
            r2.onError(r0, r4)
            goto L_0x0137
        L_0x0112:
            java.lang.String r9 = "FBAudienceNetwork"
            android.util.Log.e(r9, r1)
            goto L_0x0137
        L_0x0118:
            android.content.Context r0 = r8.f5269a
            java.lang.String r1 = "api"
            int r2 = com.facebook.ads.internal.p115w.p123h.C2373b.f7511m
            java.lang.Exception r4 = new java.lang.Exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Missing bundle for message: "
            r5.append(r6)
            r5.append(r9)
            java.lang.String r9 = r5.toString()
            r4.<init>(r9)
            com.facebook.ads.internal.p115w.p123h.C2370a.m9149b(r0, r1, r2, r4)
        L_0x0137:
            com.facebook.ads.internal.c.g r9 = r8.f5293e
            r9.mo7423a(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.p075c.C1697f.mo7399a(android.os.Message):void");
    }

    /* renamed from: a */
    public void mo7418a(InterstitialAd interstitialAd, EnumSet<CacheFlag> enumSet, String str) {
        C1782a a = C1669e.m6979a(this.f5269a, Integer.valueOf(0), Integer.valueOf(1));
        if (a != null) {
            mo7398a(10, AdErrorType.MISSING_DEPENDENCIES_ERROR, a.mo7636b());
        } else if (!this.f5272d.mo7394a(C1681a.LOADING, "load()")) {
            this.f5293e.mo7423a(interstitialAd);
            if (this.f5294f != null) {
                this.f5294f.mo7407a(enumSet, str);
                return;
            }
            this.f5293e.f5299e = enumSet;
            this.f5293e.f5300f = str;
            if (!mo7400a(this.f5293e.f5295a)) {
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
    public boolean mo7419a(InterstitialAd interstitialAd) {
        if (this.f5272d.mo7394a(C1681a.SHOWING, "show()")) {
            return false;
        }
        this.f5293e.mo7423a(interstitialAd);
        if (this.f5270b.f5305b) {
            mo7397a(1011, null);
            return true;
        } else if (this.f5294f != null) {
            return this.f5294f.mo7411e();
        } else {
            this.f5294f = new C1689d(this.f5293e, this, this.f5271c);
            this.f5294f.mo7411e();
            return false;
        }
    }

    /* renamed from: c */
    public void mo7402c() {
        this.f5294f = new C1689d(this.f5293e, this, this.f5271c);
        this.f5294f.mo7407a(this.f5293e.f5299e, this.f5293e.f5300f);
    }

    /* renamed from: d */
    public void mo7403d() {
        if (this.f5270b.f5305b) {
            m7060h();
        }
        if (this.f5294f != null) {
            this.f5294f.mo7406a();
        }
        this.f5272d.mo7393a(C1681a.DESTROYED);
    }

    /* renamed from: f */
    public boolean mo7420f() {
        return this.f5294f != null ? this.f5294f.mo7410d() : this.f5272d.f5252a == C1681a.LOADED;
    }

    /* renamed from: g */
    public boolean mo7421g() {
        return this.f5294f != null ? this.f5294f.mo7409c() : this.f5293e.f5301g > 0 && C2339v.m9067a() > this.f5293e.f5301g;
    }
}
