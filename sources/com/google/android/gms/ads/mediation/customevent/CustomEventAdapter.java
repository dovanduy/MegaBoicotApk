package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.C2973d;
import com.google.android.gms.ads.mediation.C3143a;
import com.google.android.gms.ads.mediation.C3146c;
import com.google.android.gms.ads.mediation.C3155d;
import com.google.android.gms.ads.mediation.C3156e;
import com.google.android.gms.ads.mediation.C3160i;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.ads.C3987mk;

@KeepName
public final class CustomEventAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {

    /* renamed from: a */
    private View f9166a;

    /* renamed from: b */
    private CustomEventBanner f9167b;

    /* renamed from: c */
    private CustomEventInterstitial f9168c;

    /* renamed from: d */
    private CustomEventNative f9169d;

    /* renamed from: com.google.android.gms.ads.mediation.customevent.CustomEventAdapter$a */
    static final class C3147a implements C3151b {

        /* renamed from: a */
        private final CustomEventAdapter f9170a;

        /* renamed from: b */
        private final C3146c f9171b;

        public C3147a(CustomEventAdapter customEventAdapter, C3146c cVar) {
            this.f9170a = customEventAdapter;
            this.f9171b = cVar;
        }
    }

    /* renamed from: com.google.android.gms.ads.mediation.customevent.CustomEventAdapter$b */
    class C3148b implements C3153d {

        /* renamed from: a */
        private final CustomEventAdapter f9172a;

        /* renamed from: b */
        private final C3155d f9173b;

        public C3148b(CustomEventAdapter customEventAdapter, C3155d dVar) {
            this.f9172a = customEventAdapter;
            this.f9173b = dVar;
        }
    }

    /* renamed from: com.google.android.gms.ads.mediation.customevent.CustomEventAdapter$c */
    static class C3149c implements C3154e {

        /* renamed from: a */
        private final CustomEventAdapter f9175a;

        /* renamed from: b */
        private final C3156e f9176b;

        public C3149c(CustomEventAdapter customEventAdapter, C3156e eVar) {
            this.f9175a = customEventAdapter;
            this.f9176b = eVar;
        }
    }

    /* renamed from: a */
    private static <T> T m11276a(String str) {
        try {
            return Class.forName(str).newInstance();
        } catch (Throwable th) {
            String message = th.getMessage();
            StringBuilder sb = new StringBuilder(46 + String.valueOf(str).length() + String.valueOf(message).length());
            sb.append("Could not instantiate custom event adapter: ");
            sb.append(str);
            sb.append(". ");
            sb.append(message);
            C3987mk.m17435e(sb.toString());
            return null;
        }
    }

    public final View getBannerView() {
        return this.f9166a;
    }

    public final void onDestroy() {
        if (this.f9167b != null) {
            this.f9167b.mo12732a();
        }
        if (this.f9168c != null) {
            this.f9168c.mo12732a();
        }
        if (this.f9169d != null) {
            this.f9169d.mo12732a();
        }
    }

    public final void onPause() {
        if (this.f9167b != null) {
            this.f9167b.mo12733b();
        }
        if (this.f9168c != null) {
            this.f9168c.mo12733b();
        }
        if (this.f9169d != null) {
            this.f9169d.mo12733b();
        }
    }

    public final void onResume() {
        if (this.f9167b != null) {
            this.f9167b.mo12734c();
        }
        if (this.f9168c != null) {
            this.f9168c.mo12734c();
        }
        if (this.f9169d != null) {
            this.f9169d.mo12734c();
        }
    }

    public final void requestBannerAd(Context context, C3146c cVar, Bundle bundle, C2973d dVar, C3143a aVar, Bundle bundle2) {
        this.f9167b = (CustomEventBanner) m11276a(bundle.getString("class_name"));
        if (this.f9167b == null) {
            cVar.mo12722a(this, 0);
        } else {
            this.f9167b.requestBannerAd(context, new C3147a(this, cVar), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), dVar, aVar, bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name")));
        }
    }

    public final void requestInterstitialAd(Context context, C3155d dVar, Bundle bundle, C3143a aVar, Bundle bundle2) {
        this.f9168c = (CustomEventInterstitial) m11276a(bundle.getString("class_name"));
        if (this.f9168c == null) {
            dVar.mo12737a(this, 0);
        } else {
            this.f9168c.requestInterstitialAd(context, new C3148b(this, dVar), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), aVar, bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name")));
        }
    }

    public final void requestNativeAd(Context context, C3156e eVar, Bundle bundle, C3160i iVar, Bundle bundle2) {
        this.f9169d = (CustomEventNative) m11276a(bundle.getString("class_name"));
        if (this.f9169d == null) {
            eVar.mo12743a((MediationNativeAdapter) this, 0);
        } else {
            this.f9169d.requestNativeAd(context, new C3149c(this, eVar), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), iVar, bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name")));
        }
    }

    public final void showInterstitial() {
        this.f9168c.showInterstitial();
    }
}
