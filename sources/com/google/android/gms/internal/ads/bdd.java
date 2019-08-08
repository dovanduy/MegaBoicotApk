package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.C2767b;
import com.google.ads.mediation.C2775b;
import com.google.ads.mediation.C2784e;
import com.google.ads.mediation.C2787f;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.C3142l;
import com.google.android.gms.p137b.C3235a;
import com.google.android.gms.p137b.C3238b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

@C3718cm
public final class bdd<NETWORK_EXTRAS extends C2787f, SERVER_PARAMETERS extends C2784e> extends bce {

    /* renamed from: a */
    private final C2775b<NETWORK_EXTRAS, SERVER_PARAMETERS> f12686a;

    /* renamed from: b */
    private final NETWORK_EXTRAS f12687b;

    public bdd(C2775b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar, NETWORK_EXTRAS network_extras) {
        this.f12686a = bVar;
        this.f12687b = network_extras;
    }

    /* renamed from: a */
    private final SERVER_PARAMETERS m16333a(String str, int i, String str2) throws RemoteException {
        HashMap hashMap;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                hashMap = new HashMap(jSONObject.length());
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String str3 = (String) keys.next();
                    hashMap.put(str3, jSONObject.getString(str3));
                }
            } finally {
                C3987mk.m17430b("", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            hashMap = new HashMap(0);
        }
        Class serverParametersType = this.f12686a.getServerParametersType();
        if (serverParametersType == null) {
            return null;
        }
        SERVER_PARAMETERS server_parameters = (C2784e) serverParametersType.newInstance();
        server_parameters.mo9668a(hashMap);
        return server_parameters;
    }

    /* renamed from: a */
    private static boolean m16334a(zzjj zzjj) {
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
        if (!(this.f12686a instanceof MediationBannerAdapter)) {
            String str = "Not a MediationBannerAdapter: ";
            String valueOf = String.valueOf(this.f12686a.getClass().getCanonicalName());
            C3987mk.m17435e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
        try {
            return C3238b.m11573a(((MediationBannerAdapter) this.f12686a).getBannerView());
        } catch (Throwable th) {
            C3987mk.m17430b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo15084a(C3235a aVar) throws RemoteException {
    }

    /* renamed from: a */
    public final void mo15085a(C3235a aVar, C3847hf hfVar, List<String> list) {
    }

    /* renamed from: a */
    public final void mo15086a(C3235a aVar, zzjj zzjj, String str, bcg bcg) throws RemoteException {
        mo15088a(aVar, zzjj, str, (String) null, bcg);
    }

    /* renamed from: a */
    public final void mo15087a(C3235a aVar, zzjj zzjj, String str, C3847hf hfVar, String str2) throws RemoteException {
    }

    /* renamed from: a */
    public final void mo15088a(C3235a aVar, zzjj zzjj, String str, String str2, bcg bcg) throws RemoteException {
        if (!(this.f12686a instanceof MediationInterstitialAdapter)) {
            String str3 = "Not a MediationInterstitialAdapter: ";
            String valueOf = String.valueOf(this.f12686a.getClass().getCanonicalName());
            C3987mk.m17435e(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
        C3987mk.m17429b("Requesting interstitial ad from adapter.");
        try {
            ((MediationInterstitialAdapter) this.f12686a).requestInterstitialAd(new bde(bcg), (Activity) C3238b.m11574a(aVar), m16333a(str, zzjj.f14531g, str2), bdi.m16367a(zzjj, m16334a(zzjj)), this.f12687b);
        } catch (Throwable th) {
            C3987mk.m17430b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo15089a(C3235a aVar, zzjj zzjj, String str, String str2, bcg bcg, zzpl zzpl, List<String> list) {
    }

    /* renamed from: a */
    public final void mo15090a(C3235a aVar, zzjn zzjn, zzjj zzjj, String str, bcg bcg) throws RemoteException {
        mo15091a(aVar, zzjn, zzjj, str, null, bcg);
    }

    /* renamed from: a */
    public final void mo15091a(C3235a aVar, zzjn zzjn, zzjj zzjj, String str, String str2, bcg bcg) throws RemoteException {
        C2767b bVar;
        if (!(this.f12686a instanceof MediationBannerAdapter)) {
            String str3 = "Not a MediationBannerAdapter: ";
            String valueOf = String.valueOf(this.f12686a.getClass().getCanonicalName());
            C3987mk.m17435e(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
        C3987mk.m17429b("Requesting banner ad from adapter.");
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.f12686a;
            bde bde = new bde(bcg);
            Activity activity = (Activity) C3238b.m11574a(aVar);
            C2784e a = m16333a(str, zzjj.f14531g, str2);
            int i = 0;
            C2767b[] bVarArr = {C2767b.f8591a, C2767b.f8592b, C2767b.f8593c, C2767b.f8594d, C2767b.f8595e, C2767b.f8596f};
            while (true) {
                if (i < 6) {
                    if (bVarArr[i].mo9616a() == zzjn.f14547e && bVarArr[i].mo9617b() == zzjn.f14544b) {
                        bVar = bVarArr[i];
                        break;
                    }
                    i++;
                } else {
                    bVar = new C2767b(C3142l.m11259a(zzjn.f14547e, zzjn.f14544b, zzjn.f14543a));
                    break;
                }
            }
            mediationBannerAdapter.requestBannerAd(bde, activity, a, bVar, bdi.m16367a(zzjj, m16334a(zzjj)), this.f12687b);
        } catch (Throwable th) {
            C3987mk.m17430b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo15092a(zzjj zzjj, String str) {
    }

    /* renamed from: a */
    public final void mo15093a(zzjj zzjj, String str, String str2) {
    }

    /* renamed from: a */
    public final void mo15094a(boolean z) {
    }

    /* renamed from: b */
    public final void mo15095b() throws RemoteException {
        if (!(this.f12686a instanceof MediationInterstitialAdapter)) {
            String str = "Not a MediationInterstitialAdapter: ";
            String valueOf = String.valueOf(this.f12686a.getClass().getCanonicalName());
            C3987mk.m17435e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
        C3987mk.m17429b("Showing interstitial from adapter.");
        try {
            ((MediationInterstitialAdapter) this.f12686a).showInterstitial();
        } catch (Throwable th) {
            C3987mk.m17430b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: c */
    public final void mo15096c() throws RemoteException {
        try {
            this.f12686a.destroy();
        } catch (Throwable th) {
            C3987mk.m17430b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: d */
    public final void mo15097d() throws RemoteException {
        throw new RemoteException();
    }

    /* renamed from: e */
    public final void mo15098e() throws RemoteException {
        throw new RemoteException();
    }

    /* renamed from: f */
    public final void mo15099f() {
    }

    /* renamed from: g */
    public final boolean mo15100g() {
        return true;
    }

    /* renamed from: h */
    public final bcm mo15101h() {
        return null;
    }

    /* renamed from: i */
    public final bcq mo15102i() {
        return null;
    }

    /* renamed from: j */
    public final Bundle mo15103j() {
        return new Bundle();
    }

    /* renamed from: k */
    public final Bundle mo15104k() {
        return new Bundle();
    }

    /* renamed from: l */
    public final Bundle mo15105l() {
        return new Bundle();
    }

    /* renamed from: m */
    public final boolean mo15106m() {
        return false;
    }

    /* renamed from: n */
    public final ave mo15107n() {
        return null;
    }

    /* renamed from: o */
    public final aqe mo15108o() {
        return null;
    }

    /* renamed from: p */
    public final bct mo15109p() {
        return null;
    }
}
