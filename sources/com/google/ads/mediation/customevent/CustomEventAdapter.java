package com.google.ads.mediation.customevent;

import android.app.Activity;
import android.view.View;
import com.google.ads.C2764a.C2765a;
import com.google.ads.C2767b;
import com.google.ads.mediation.C2774a;
import com.google.ads.mediation.C2776c;
import com.google.ads.mediation.C2783d;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.customevent.C3152c;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.ads.C3987mk;

@KeepName
public final class CustomEventAdapter implements MediationBannerAdapter<C3152c, C2782d>, MediationInterstitialAdapter<C3152c, C2782d> {

    /* renamed from: a */
    private View f8612a;

    /* renamed from: b */
    private CustomEventBanner f8613b;

    /* renamed from: c */
    private CustomEventInterstitial f8614c;

    /* renamed from: com.google.ads.mediation.customevent.CustomEventAdapter$a */
    static final class C2777a implements C2780b {

        /* renamed from: a */
        private final CustomEventAdapter f8615a;

        /* renamed from: b */
        private final C2776c f8616b;

        public C2777a(CustomEventAdapter customEventAdapter, C2776c cVar) {
            this.f8615a = customEventAdapter;
            this.f8616b = cVar;
        }
    }

    /* renamed from: com.google.ads.mediation.customevent.CustomEventAdapter$b */
    class C2778b implements C2781c {

        /* renamed from: a */
        private final CustomEventAdapter f8617a;

        /* renamed from: b */
        private final C2783d f8618b;

        public C2778b(CustomEventAdapter customEventAdapter, C2783d dVar) {
            this.f8617a = customEventAdapter;
            this.f8618b = dVar;
        }
    }

    /* renamed from: a */
    private static <T> T m10555a(String str) {
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

    public final void destroy() {
        if (this.f8613b != null) {
            this.f8613b.mo9666a();
        }
        if (this.f8614c != null) {
            this.f8614c.mo9666a();
        }
    }

    public final Class<C3152c> getAdditionalParametersType() {
        return C3152c.class;
    }

    public final View getBannerView() {
        return this.f8612a;
    }

    public final Class<C2782d> getServerParametersType() {
        return C2782d.class;
    }

    public final void requestBannerAd(C2776c cVar, Activity activity, C2782d dVar, C2767b bVar, C2774a aVar, C3152c cVar2) {
        this.f8613b = (CustomEventBanner) m10555a(dVar.f8621b);
        if (this.f8613b == null) {
            cVar.mo9660a(this, C2765a.INTERNAL_ERROR);
        } else {
            this.f8613b.requestBannerAd(new C2777a(this, cVar), activity, dVar.f8620a, dVar.f8622c, bVar, aVar, cVar2 == null ? null : cVar2.mo12735a(dVar.f8620a));
        }
    }

    public final void requestInterstitialAd(C2783d dVar, Activity activity, C2782d dVar2, C2774a aVar, C3152c cVar) {
        this.f8614c = (CustomEventInterstitial) m10555a(dVar2.f8621b);
        if (this.f8614c == null) {
            dVar.mo9667a(this, C2765a.INTERNAL_ERROR);
        } else {
            this.f8614c.requestInterstitialAd(new C2778b(this, dVar), activity, dVar2.f8620a, dVar2.f8622c, aVar, cVar == null ? null : cVar.mo12735a(dVar2.f8620a));
        }
    }

    public final void showInterstitial() {
        this.f8614c.showInterstitial();
    }
}
