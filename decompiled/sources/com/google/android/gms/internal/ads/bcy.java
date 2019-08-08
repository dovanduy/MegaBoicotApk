package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.C3142l;
import com.google.android.gms.ads.formats.C2990f;
import com.google.android.gms.ads.mediation.C3144b;
import com.google.android.gms.ads.mediation.C3157f;
import com.google.android.gms.ads.mediation.C3158g;
import com.google.android.gms.ads.mediation.C3159h;
import com.google.android.gms.ads.mediation.C3161j;
import com.google.android.gms.ads.mediation.C3162k;
import com.google.android.gms.ads.mediation.C3163l;
import com.google.android.gms.ads.mediation.C3164m;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.reward.mediation.InitializableMediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.p137b.C3235a;
import com.google.android.gms.p137b.C3238b;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

@C3718cm
public final class bcy extends bce {

    /* renamed from: a */
    private final C3144b f12668a;

    /* renamed from: b */
    private bcz f12669b;

    public bcy(C3144b bVar) {
        this.f12668a = bVar;
    }

    /* renamed from: a */
    private final Bundle m16224a(String str, zzjj zzjj, String str2) throws RemoteException {
        Bundle bundle;
        String str3 = "Server parameters: ";
        String valueOf = String.valueOf(str);
        C3987mk.m17435e(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
        try {
            Bundle bundle2 = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                bundle = new Bundle();
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String str4 = (String) keys.next();
                    bundle.putString(str4, jSONObject.getString(str4));
                }
            } else {
                bundle = bundle2;
            }
            if (this.f12668a instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (zzjj != null) {
                    bundle.putInt("tagForChildDirectedTreatment", zzjj.f14531g);
                }
            }
            return bundle;
        } catch (Throwable th) {
            C3987mk.m17430b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    private static boolean m16225a(zzjj zzjj) {
        if (!zzjj.f14530f) {
            aoq.m14615a();
            if (!C3975lz.m17378a()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final C3235a mo15083a() throws RemoteException {
        if (!(this.f12668a instanceof MediationBannerAdapter)) {
            String str = "Not a MediationBannerAdapter: ";
            String valueOf = String.valueOf(this.f12668a.getClass().getCanonicalName());
            C3987mk.m17435e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
        try {
            return C3238b.m11573a(((MediationBannerAdapter) this.f12668a).getBannerView());
        } catch (Throwable th) {
            C3987mk.m17430b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo15084a(C3235a aVar) throws RemoteException {
        try {
            ((C3161j) this.f12668a).mo12800a((Context) C3238b.m11574a(aVar));
        } catch (Throwable th) {
            C3987mk.m17432c("Failed", th);
        }
    }

    /* renamed from: a */
    public final void mo15085a(C3235a aVar, C3847hf hfVar, List<String> list) throws RemoteException {
        if (!(this.f12668a instanceof InitializableMediationRewardedVideoAdAdapter)) {
            String str = "Not an InitializableMediationRewardedVideoAdAdapter: ";
            String valueOf = String.valueOf(this.f12668a.getClass().getCanonicalName());
            C3987mk.m17435e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
        C3987mk.m17429b("Initialize rewarded video adapter.");
        try {
            InitializableMediationRewardedVideoAdAdapter initializableMediationRewardedVideoAdAdapter = (InitializableMediationRewardedVideoAdAdapter) this.f12668a;
            ArrayList arrayList = new ArrayList();
            for (String a : list) {
                arrayList.add(m16224a(a, (zzjj) null, (String) null));
            }
            initializableMediationRewardedVideoAdAdapter.initialize((Context) C3238b.m11574a(aVar), new C3850hi(hfVar), arrayList);
        } catch (Throwable th) {
            C3987mk.m17432c("Could not initialize rewarded video adapter.", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo15086a(C3235a aVar, zzjj zzjj, String str, bcg bcg) throws RemoteException {
        mo15088a(aVar, zzjj, str, (String) null, bcg);
    }

    /* renamed from: a */
    public final void mo15087a(C3235a aVar, zzjj zzjj, String str, C3847hf hfVar, String str2) throws RemoteException {
        Bundle bundle;
        bcx bcx;
        zzjj zzjj2 = zzjj;
        if (!(this.f12668a instanceof MediationRewardedVideoAdAdapter)) {
            String str3 = "Not a MediationRewardedVideoAdAdapter: ";
            String valueOf = String.valueOf(this.f12668a.getClass().getCanonicalName());
            C3987mk.m17435e(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
        C3987mk.m17429b("Initialize rewarded video adapter.");
        try {
            MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.f12668a;
            Bundle a = m16224a(str2, zzjj2, (String) null);
            if (zzjj2 != null) {
                bcx bcx2 = new bcx(zzjj2.f14526b == -1 ? null : new Date(zzjj2.f14526b), zzjj2.f14528d, zzjj2.f14529e != null ? new HashSet(zzjj2.f14529e) : null, zzjj2.f14535k, m16225a(zzjj), zzjj2.f14531g, zzjj2.f14542r);
                bundle = zzjj2.f14537m != null ? zzjj2.f14537m.getBundle(mediationRewardedVideoAdAdapter.getClass().getName()) : null;
                bcx = bcx2;
            } else {
                bcx = null;
                bundle = null;
            }
            mediationRewardedVideoAdAdapter.initialize((Context) C3238b.m11574a(aVar), bcx, str, new C3850hi(hfVar), a, bundle);
        } catch (Throwable th) {
            C3987mk.m17430b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo15088a(C3235a aVar, zzjj zzjj, String str, String str2, bcg bcg) throws RemoteException {
        zzjj zzjj2 = zzjj;
        if (!(this.f12668a instanceof MediationInterstitialAdapter)) {
            String str3 = "Not a MediationInterstitialAdapter: ";
            String valueOf = String.valueOf(this.f12668a.getClass().getCanonicalName());
            C3987mk.m17435e(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
        C3987mk.m17429b("Requesting interstitial ad from adapter.");
        try {
            MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) this.f12668a;
            Bundle bundle = null;
            bcx bcx = new bcx(zzjj2.f14526b == -1 ? null : new Date(zzjj2.f14526b), zzjj2.f14528d, zzjj2.f14529e != null ? new HashSet(zzjj2.f14529e) : null, zzjj2.f14535k, m16225a(zzjj), zzjj2.f14531g, zzjj2.f14542r);
            if (zzjj2.f14537m != null) {
                bundle = zzjj2.f14537m.getBundle(mediationInterstitialAdapter.getClass().getName());
            }
            mediationInterstitialAdapter.requestInterstitialAd((Context) C3238b.m11574a(aVar), new bcz(bcg), m16224a(str, zzjj2, str2), bcx, bundle);
        } catch (Throwable th) {
            C3987mk.m17430b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo15089a(C3235a aVar, zzjj zzjj, String str, String str2, bcg bcg, zzpl zzpl, List<String> list) throws RemoteException {
        zzjj zzjj2 = zzjj;
        if (!(this.f12668a instanceof MediationNativeAdapter)) {
            String str3 = "Not a MediationNativeAdapter: ";
            String valueOf = String.valueOf(this.f12668a.getClass().getCanonicalName());
            C3987mk.m17435e(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
        try {
            MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) this.f12668a;
            Bundle bundle = null;
            bdc bdc = new bdc(zzjj2.f14526b == -1 ? null : new Date(zzjj2.f14526b), zzjj2.f14528d, zzjj2.f14529e != null ? new HashSet(zzjj2.f14529e) : null, zzjj2.f14535k, m16225a(zzjj), zzjj2.f14531g, zzpl, list, zzjj2.f14542r);
            if (zzjj2.f14537m != null) {
                bundle = zzjj2.f14537m.getBundle(mediationNativeAdapter.getClass().getName());
            }
            Bundle bundle2 = bundle;
            this.f12669b = new bcz(bcg);
            mediationNativeAdapter.requestNativeAd((Context) C3238b.m11574a(aVar), this.f12669b, m16224a(str, zzjj2, str2), bdc, bundle2);
        } catch (Throwable th) {
            C3987mk.m17430b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo15090a(C3235a aVar, zzjn zzjn, zzjj zzjj, String str, bcg bcg) throws RemoteException {
        mo15091a(aVar, zzjn, zzjj, str, null, bcg);
    }

    /* renamed from: a */
    public final void mo15091a(C3235a aVar, zzjn zzjn, zzjj zzjj, String str, String str2, bcg bcg) throws RemoteException {
        zzjn zzjn2 = zzjn;
        zzjj zzjj2 = zzjj;
        if (!(this.f12668a instanceof MediationBannerAdapter)) {
            String str3 = "Not a MediationBannerAdapter: ";
            String valueOf = String.valueOf(this.f12668a.getClass().getCanonicalName());
            C3987mk.m17435e(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
        C3987mk.m17429b("Requesting banner ad from adapter.");
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.f12668a;
            Bundle bundle = null;
            bcx bcx = new bcx(zzjj2.f14526b == -1 ? null : new Date(zzjj2.f14526b), zzjj2.f14528d, zzjj2.f14529e != null ? new HashSet(zzjj2.f14529e) : null, zzjj2.f14535k, m16225a(zzjj), zzjj2.f14531g, zzjj2.f14542r);
            if (zzjj2.f14537m != null) {
                bundle = zzjj2.f14537m.getBundle(mediationBannerAdapter.getClass().getName());
            }
            mediationBannerAdapter.requestBannerAd((Context) C3238b.m11574a(aVar), new bcz(bcg), m16224a(str, zzjj2, str2), C3142l.m11259a(zzjn2.f14547e, zzjn2.f14544b, zzjn2.f14543a), bcx, bundle);
        } catch (Throwable th) {
            C3987mk.m17430b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo15092a(zzjj zzjj, String str) throws RemoteException {
        mo15093a(zzjj, str, (String) null);
    }

    /* renamed from: a */
    public final void mo15093a(zzjj zzjj, String str, String str2) throws RemoteException {
        if (!(this.f12668a instanceof MediationRewardedVideoAdAdapter)) {
            String str3 = "Not a MediationRewardedVideoAdAdapter: ";
            String valueOf = String.valueOf(this.f12668a.getClass().getCanonicalName());
            C3987mk.m17435e(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
        C3987mk.m17429b("Requesting rewarded video ad from adapter.");
        try {
            MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.f12668a;
            Bundle bundle = null;
            bcx bcx = new bcx(zzjj.f14526b == -1 ? null : new Date(zzjj.f14526b), zzjj.f14528d, zzjj.f14529e != null ? new HashSet(zzjj.f14529e) : null, zzjj.f14535k, m16225a(zzjj), zzjj.f14531g, zzjj.f14542r);
            if (zzjj.f14537m != null) {
                bundle = zzjj.f14537m.getBundle(mediationRewardedVideoAdAdapter.getClass().getName());
            }
            mediationRewardedVideoAdAdapter.loadAd(bcx, m16224a(str, zzjj, str2), bundle);
        } catch (Throwable th) {
            C3987mk.m17430b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo15094a(boolean z) throws RemoteException {
        if (!(this.f12668a instanceof C3162k)) {
            String str = "Not an OnImmersiveModeUpdatedListener: ";
            String valueOf = String.valueOf(this.f12668a.getClass().getCanonicalName());
            C3987mk.m17433d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            return;
        }
        try {
            ((C3162k) this.f12668a).onImmersiveModeUpdated(z);
        } catch (Throwable th) {
            C3987mk.m17430b("", th);
        }
    }

    /* renamed from: b */
    public final void mo15095b() throws RemoteException {
        if (!(this.f12668a instanceof MediationInterstitialAdapter)) {
            String str = "Not a MediationInterstitialAdapter: ";
            String valueOf = String.valueOf(this.f12668a.getClass().getCanonicalName());
            C3987mk.m17435e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
        C3987mk.m17429b("Showing interstitial from adapter.");
        try {
            ((MediationInterstitialAdapter) this.f12668a).showInterstitial();
        } catch (Throwable th) {
            C3987mk.m17430b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: c */
    public final void mo15096c() throws RemoteException {
        try {
            this.f12668a.onDestroy();
        } catch (Throwable th) {
            C3987mk.m17430b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: d */
    public final void mo15097d() throws RemoteException {
        try {
            this.f12668a.onPause();
        } catch (Throwable th) {
            C3987mk.m17430b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: e */
    public final void mo15098e() throws RemoteException {
        try {
            this.f12668a.onResume();
        } catch (Throwable th) {
            C3987mk.m17430b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: f */
    public final void mo15099f() throws RemoteException {
        if (!(this.f12668a instanceof MediationRewardedVideoAdAdapter)) {
            String str = "Not a MediationRewardedVideoAdAdapter: ";
            String valueOf = String.valueOf(this.f12668a.getClass().getCanonicalName());
            C3987mk.m17435e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
        C3987mk.m17429b("Show rewarded video ad from adapter.");
        try {
            ((MediationRewardedVideoAdAdapter) this.f12668a).showVideo();
        } catch (Throwable th) {
            C3987mk.m17430b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: g */
    public final boolean mo15100g() throws RemoteException {
        if (!(this.f12668a instanceof MediationRewardedVideoAdAdapter)) {
            String str = "Not a MediationRewardedVideoAdAdapter: ";
            String valueOf = String.valueOf(this.f12668a.getClass().getCanonicalName());
            C3987mk.m17435e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
        C3987mk.m17429b("Check if adapter is initialized.");
        try {
            return ((MediationRewardedVideoAdAdapter) this.f12668a).isInitialized();
        } catch (Throwable th) {
            C3987mk.m17430b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: h */
    public final bcm mo15101h() {
        C3157f a = this.f12669b.mo15172a();
        if (a instanceof C3158g) {
            return new bda((C3158g) a);
        }
        return null;
    }

    /* renamed from: i */
    public final bcq mo15102i() {
        C3157f a = this.f12669b.mo15172a();
        if (a instanceof C3159h) {
            return new bdb((C3159h) a);
        }
        return null;
    }

    /* renamed from: j */
    public final Bundle mo15103j() {
        if (this.f12668a instanceof zzatl) {
            return ((zzatl) this.f12668a).zzmq();
        }
        String str = "Not a v2 MediationBannerAdapter: ";
        String valueOf = String.valueOf(this.f12668a.getClass().getCanonicalName());
        C3987mk.m17435e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        return new Bundle();
    }

    /* renamed from: k */
    public final Bundle mo15104k() {
        if (this.f12668a instanceof zzatm) {
            return ((zzatm) this.f12668a).getInterstitialAdapterInfo();
        }
        String str = "Not a v2 MediationInterstitialAdapter: ";
        String valueOf = String.valueOf(this.f12668a.getClass().getCanonicalName());
        C3987mk.m17435e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        return new Bundle();
    }

    /* renamed from: l */
    public final Bundle mo15105l() {
        return new Bundle();
    }

    /* renamed from: m */
    public final boolean mo15106m() {
        return this.f12668a instanceof InitializableMediationRewardedVideoAdAdapter;
    }

    /* renamed from: n */
    public final ave mo15107n() {
        C2990f c = this.f12669b.mo15174c();
        if (c instanceof avh) {
            return ((avh) c).mo14886b();
        }
        return null;
    }

    /* renamed from: o */
    public final aqe mo15108o() {
        if (!(this.f12668a instanceof C3164m)) {
            return null;
        }
        try {
            return ((C3164m) this.f12668a).getVideoController();
        } catch (Throwable th) {
            C3987mk.m17430b("", th);
            return null;
        }
    }

    /* renamed from: p */
    public final bct mo15109p() {
        C3163l b = this.f12669b.mo15173b();
        if (b != null) {
            return new bdk(b);
        }
        return null;
    }
}
