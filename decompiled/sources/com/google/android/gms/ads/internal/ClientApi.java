package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.support.annotation.Keep;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.C3120p;
import com.google.android.gms.ads.internal.overlay.C3121q;
import com.google.android.gms.ads.internal.overlay.C3122r;
import com.google.android.gms.ads.internal.overlay.C3127w;
import com.google.android.gms.ads.internal.overlay.C3128x;
import com.google.android.gms.common.C3415h;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.ads.C3635ab;
import com.google.android.gms.internal.ads.C3718cm;
import com.google.android.gms.internal.ads.C3806fs;
import com.google.android.gms.internal.ads.C3816gb;
import com.google.android.gms.internal.ads.C3909jn;
import com.google.android.gms.internal.ads.C4111r;
import com.google.android.gms.internal.ads.apc;
import com.google.android.gms.internal.ads.aph;
import com.google.android.gms.internal.ads.apu;
import com.google.android.gms.internal.ads.apz;
import com.google.android.gms.internal.ads.aty;
import com.google.android.gms.internal.ads.aua;
import com.google.android.gms.internal.ads.aum;
import com.google.android.gms.internal.ads.aur;
import com.google.android.gms.internal.ads.bca;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzjn;
import com.google.android.gms.p137b.C3235a;
import com.google.android.gms.p137b.C3238b;
import java.util.HashMap;
import javax.annotation.ParametersAreNonnullByDefault;

@Keep
@DynamiteApi
@ParametersAreNonnullByDefault
@C3718cm
public class ClientApi extends apu {
    public apc createAdLoaderBuilder(C3235a aVar, String str, bca bca, int i) {
        Context context = (Context) C3238b.m11574a(aVar);
        C3025aw.m10917e();
        C3101l lVar = new C3101l(context, str, bca, new zzang(C3415h.f9877b, i, true, C3909jn.m17173k(context)), C3049bt.m11038a(context));
        return lVar;
    }

    public C4111r createAdOverlay(C3235a aVar) {
        Activity activity = (Activity) C3238b.m11574a(aVar);
        AdOverlayInfoParcel a = AdOverlayInfoParcel.m11171a(activity.getIntent());
        if (a == null) {
            return new C3121q(activity);
        }
        switch (a.f9073k) {
            case 1:
                return new C3120p(activity);
            case 2:
                return new C3127w(activity);
            case 3:
                return new C3128x(activity);
            case 4:
                return new C3122r(activity, a);
            default:
                return new C3121q(activity);
        }
    }

    public aph createBannerAdManager(C3235a aVar, zzjn zzjn, String str, bca bca, int i) throws RemoteException {
        Context context = (Context) C3238b.m11574a(aVar);
        C3025aw.m10917e();
        C3051bv bvVar = new C3051bv(context, zzjn, str, bca, new zzang(C3415h.f9877b, i, true, C3909jn.m17173k(context)), C3049bt.m11038a(context));
        return bvVar;
    }

    public C3635ab createInAppPurchaseManager(C3235a aVar) {
        return null;
    }

    /* JADX INFO: used method not loaded: com.google.android.gms.internal.ads.ars.a(com.google.android.gms.internal.ads.ark):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0034, code lost:
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.aoq.m14620f().mo14695a((com.google.android.gms.internal.ads.ark) com.google.android.gms.internal.ads.aru.f11795aT)).booleanValue() == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0048, code lost:
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.aoq.m14620f().mo14695a((com.google.android.gms.internal.ads.ark) com.google.android.gms.internal.ads.aru.f11796aU)).booleanValue() != false) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.internal.ads.aph createInterstitialAdManager(com.google.android.gms.p137b.C3235a r8, com.google.android.gms.internal.ads.zzjn r9, java.lang.String r10, com.google.android.gms.internal.ads.bca r11, int r12) throws android.os.RemoteException {
        /*
            r7 = this;
            java.lang.Object r8 = com.google.android.gms.p137b.C3238b.m11574a(r8)
            r1 = r8
            android.content.Context r1 = (android.content.Context) r1
            com.google.android.gms.internal.ads.aru.m15024a(r1)
            com.google.android.gms.internal.ads.zzang r5 = new com.google.android.gms.internal.ads.zzang
            com.google.android.gms.ads.internal.C3025aw.m10917e()
            boolean r8 = com.google.android.gms.internal.ads.C3909jn.m17173k(r1)
            r0 = 1
            r2 = 12451000(0xbdfcb8, float:1.7447567E-38)
            r5.<init>(r2, r12, r0, r8)
            java.lang.String r8 = "reward_mb"
            java.lang.String r12 = r9.f14543a
            boolean r8 = r8.equals(r12)
            if (r8 != 0) goto L_0x0036
            com.google.android.gms.internal.ads.ark<java.lang.Boolean> r12 = com.google.android.gms.internal.ads.aru.f11795aT
            com.google.android.gms.internal.ads.ars r2 = com.google.android.gms.internal.ads.aoq.m14620f()
            java.lang.Object r12 = r2.mo14695a(r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L_0x004c
        L_0x0036:
            if (r8 == 0) goto L_0x004b
            com.google.android.gms.internal.ads.ark<java.lang.Boolean> r8 = com.google.android.gms.internal.ads.aru.f11796aU
            com.google.android.gms.internal.ads.ars r12 = com.google.android.gms.internal.ads.aoq.m14620f()
            java.lang.Object r8 = r12.mo14695a(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x004b
            goto L_0x004c
        L_0x004b:
            r0 = 0
        L_0x004c:
            if (r0 == 0) goto L_0x005d
            com.google.android.gms.internal.ads.ayl r8 = new com.google.android.gms.internal.ads.ayl
            com.google.android.gms.ads.internal.bt r9 = com.google.android.gms.ads.internal.C3049bt.m11038a(r1)
            r0 = r8
            r2 = r10
            r3 = r11
            r4 = r5
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return r8
        L_0x005d:
            com.google.android.gms.ads.internal.m r8 = new com.google.android.gms.ads.internal.m
            com.google.android.gms.ads.internal.bt r6 = com.google.android.gms.ads.internal.C3049bt.m11038a(r1)
            r0 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.ClientApi.createInterstitialAdManager(com.google.android.gms.b.a, com.google.android.gms.internal.ads.zzjn, java.lang.String, com.google.android.gms.internal.ads.bca, int):com.google.android.gms.internal.ads.aph");
    }

    public aum createNativeAdViewDelegate(C3235a aVar, C3235a aVar2) {
        return new aty((FrameLayout) C3238b.m11574a(aVar), (FrameLayout) C3238b.m11574a(aVar2));
    }

    public aur createNativeAdViewHolderDelegate(C3235a aVar, C3235a aVar2, C3235a aVar3) {
        return new aua((View) C3238b.m11574a(aVar), (HashMap) C3238b.m11574a(aVar2), (HashMap) C3238b.m11574a(aVar3));
    }

    public C3816gb createRewardedVideoAd(C3235a aVar, bca bca, int i) {
        Context context = (Context) C3238b.m11574a(aVar);
        C3025aw.m10917e();
        return new C3806fs(context, C3049bt.m11038a(context), bca, new zzang(C3415h.f9877b, i, true, C3909jn.m17173k(context)));
    }

    public aph createSearchAdManager(C3235a aVar, zzjn zzjn, String str, int i) throws RemoteException {
        Context context = (Context) C3238b.m11574a(aVar);
        C3025aw.m10917e();
        return new C3019aq(context, zzjn, str, new zzang(C3415h.f9877b, i, true, C3909jn.m17173k(context)));
    }

    public apz getMobileAdsSettingsManager(C3235a aVar) {
        return null;
    }

    public apz getMobileAdsSettingsManagerWithClientJarVersion(C3235a aVar, int i) {
        Context context = (Context) C3238b.m11574a(aVar);
        C3025aw.m10917e();
        return C3138y.m11246a(context, new zzang(C3415h.f9877b, i, true, C3909jn.m17173k(context)));
    }
}
