package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.C2775b;
import com.google.ads.mediation.C2784e;
import com.google.ads.mediation.C2787f;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.C3144b;
import com.google.android.gms.ads.mediation.customevent.C3150a;
import com.google.android.gms.ads.mediation.customevent.C3152c;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import java.util.Map;

@C3718cm
public final class bbz extends bcb {

    /* renamed from: b */
    private static final bdu f12655b = new bdu();

    /* renamed from: a */
    private Map<Class<? extends Object>, Object> f12656a;

    /* renamed from: d */
    private final <NetworkExtrasT extends C2787f, ServerParametersT extends C2784e> bcd m15988d(String str) throws RemoteException {
        try {
            Class cls = Class.forName(str, false, bbz.class.getClassLoader());
            if (C2775b.class.isAssignableFrom(cls)) {
                C2775b bVar = (C2775b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                return new bdd(bVar, (C2787f) this.f12656a.get(bVar.getAdditionalParametersType()));
            } else if (C3144b.class.isAssignableFrom(cls)) {
                return new bcy((C3144b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } else {
                StringBuilder sb = new StringBuilder(64 + String.valueOf(str).length());
                sb.append("Could not instantiate mediation adapter: ");
                sb.append(str);
                sb.append(" (not a valid adapter).");
                C3987mk.m17435e(sb.toString());
                throw new RemoteException();
            }
        } catch (Throwable unused) {
            return m15989e(str);
        }
    }

    /* renamed from: e */
    private final bcd m15989e(String str) throws RemoteException {
        try {
            C3987mk.m17429b("Reflection failed, retrying using direct instantiation");
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                return new bcy(new AdMobAdapter());
            }
            if ("com.google.ads.mediation.AdUrlAdapter".equals(str)) {
                return new bcy(new AdUrlAdapter());
            }
            if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                return new bcy(new CustomEventAdapter());
            }
            if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                com.google.ads.mediation.customevent.CustomEventAdapter customEventAdapter = new com.google.ads.mediation.customevent.CustomEventAdapter();
                return new bdd(customEventAdapter, (C3152c) this.f12656a.get(customEventAdapter.getAdditionalParametersType()));
            }
            throw new RemoteException();
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder(43 + String.valueOf(str).length());
            sb.append("Could not instantiate mediation adapter: ");
            sb.append(str);
            sb.append(". ");
            C3987mk.m17432c(sb.toString(), th);
        }
    }

    /* renamed from: a */
    public final bcd mo15079a(String str) throws RemoteException {
        return m15988d(str);
    }

    /* renamed from: a */
    public final void mo15080a(Map<Class<? extends Object>, Object> map) {
        this.f12656a = map;
    }

    /* renamed from: b */
    public final boolean mo15081b(String str) throws RemoteException {
        try {
            return C3150a.class.isAssignableFrom(Class.forName(str, false, bbz.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(80 + String.valueOf(str).length());
            sb.append("Could not load custom event implementation class: ");
            sb.append(str);
            sb.append(", assuming old implementation.");
            C3987mk.m17435e(sb.toString());
            return false;
        }
    }

    /* renamed from: c */
    public final bdp mo15082c(String str) throws RemoteException {
        return bdu.m16408a(str);
    }
}
