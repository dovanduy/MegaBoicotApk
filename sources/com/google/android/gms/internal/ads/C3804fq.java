package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C3025aw;
import com.google.android.gms.ads.internal.C3026ax;
import com.google.android.gms.ads.internal.gmsg.C3081k;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.p137b.C3238b;
import java.util.HashMap;
import java.util.Map;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.fq */
public final class C3804fq {

    /* renamed from: a */
    private static final bbz f13117a = new bbz();

    /* renamed from: b */
    private final bca f13118b;

    /* renamed from: c */
    private final C3026ax f13119c;

    /* renamed from: d */
    private final Map<String, C3846he> f13120d = new HashMap();

    /* renamed from: e */
    private final C3837gw f13121e;

    /* renamed from: f */
    private final C3081k f13122f;

    /* renamed from: g */
    private final C3665ap f13123g;

    public C3804fq(C3026ax axVar, bca bca, C3837gw gwVar, C3081k kVar, C3665ap apVar) {
        this.f13119c = axVar;
        this.f13118b = bca;
        this.f13121e = gwVar;
        this.f13122f = kVar;
        this.f13123g = apVar;
    }

    /* renamed from: a */
    public static boolean m16641a(C3878ij ijVar, C3878ij ijVar2) {
        return true;
    }

    /* renamed from: a */
    public final C3081k mo15295a() {
        return this.f13122f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C3846he mo15296a(java.lang.String r5) {
        /*
            r4 = this;
            java.util.Map<java.lang.String, com.google.android.gms.internal.ads.he> r0 = r4.f13120d
            java.lang.Object r0 = r0.get(r5)
            com.google.android.gms.internal.ads.he r0 = (com.google.android.gms.internal.ads.C3846he) r0
            if (r0 != 0) goto L_0x0045
            com.google.android.gms.internal.ads.bca r1 = r4.f13118b     // Catch:{ Exception -> 0x002b }
            java.lang.String r2 = "com.google.ads.mediation.admob.AdMobAdapter"
            boolean r2 = r2.equals(r5)     // Catch:{ Exception -> 0x002b }
            if (r2 == 0) goto L_0x0016
            com.google.android.gms.internal.ads.bbz r1 = f13117a     // Catch:{ Exception -> 0x002b }
        L_0x0016:
            com.google.android.gms.internal.ads.he r2 = new com.google.android.gms.internal.ads.he     // Catch:{ Exception -> 0x002b }
            com.google.android.gms.internal.ads.bcd r1 = r1.mo15079a(r5)     // Catch:{ Exception -> 0x002b }
            com.google.android.gms.internal.ads.gw r3 = r4.f13121e     // Catch:{ Exception -> 0x002b }
            r2.<init>(r1, r3)     // Catch:{ Exception -> 0x002b }
            java.util.Map<java.lang.String, com.google.android.gms.internal.ads.he> r0 = r4.f13120d     // Catch:{ Exception -> 0x0028 }
            r0.put(r5, r2)     // Catch:{ Exception -> 0x0028 }
            r0 = r2
            return r0
        L_0x0028:
            r1 = move-exception
            r0 = r2
            goto L_0x002c
        L_0x002b:
            r1 = move-exception
        L_0x002c:
            java.lang.String r2 = "Fail to instantiate adapter "
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r3 = r5.length()
            if (r3 == 0) goto L_0x003d
            java.lang.String r5 = r2.concat(r5)
            goto L_0x0042
        L_0x003d:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r2)
        L_0x0042:
            com.google.android.gms.internal.ads.C3900je.m17432c(r5, r1)
        L_0x0045:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3804fq.mo15296a(java.lang.String):com.google.android.gms.internal.ads.he");
    }

    /* renamed from: a */
    public final zzaig mo15297a(zzaig zzaig) {
        if (!(this.f13119c.f8865j == null || this.f13119c.f8865j.f13282r == null || TextUtils.isEmpty(this.f13119c.f8865j.f13282r.f12573k))) {
            zzaig = new zzaig(this.f13119c.f8865j.f13282r.f12573k, this.f13119c.f8865j.f13282r.f12574l);
        }
        if (!(this.f13119c.f8865j == null || this.f13119c.f8865j.f13279o == null)) {
            C3025aw.m10936x();
            bbt.m15971a(this.f13119c.f8858c, this.f13119c.f8860e.f14505a, this.f13119c.f8865j.f13279o.f12554m, this.f13119c.f8843E, zzaig);
        }
        return zzaig;
    }

    /* renamed from: a */
    public final void mo15298a(Context context) {
        for (C3846he a : this.f13120d.values()) {
            try {
                a.mo15361a().mo15084a(C3238b.m11573a(context));
            } catch (RemoteException e) {
                C3900je.m17430b("Unable to call Adapter.onContextChanged.", e);
            }
        }
    }

    /* renamed from: a */
    public final void mo15299a(boolean z) {
        C3846he a = mo15296a(this.f13119c.f8865j.f13281q);
        if (!(a == null || a.mo15361a() == null)) {
            try {
                a.mo15361a().mo15094a(z);
                a.mo15361a().mo15099f();
            } catch (RemoteException e) {
                C3900je.m17434d("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: b */
    public final C3665ap mo15300b() {
        return this.f13123g;
    }

    /* renamed from: c */
    public final void mo15301c() {
        this.f13119c.f8847I = 0;
        C3026ax axVar = this.f13119c;
        C3025aw.m10916d();
        C3840gz gzVar = new C3840gz(this.f13119c.f8858c, this.f13119c.f8866k, this);
        String str = "AdRenderer: ";
        String valueOf = String.valueOf(gzVar.getClass().getName());
        C3900je.m17429b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        gzVar.mo14344c();
        axVar.f8863h = gzVar;
    }

    /* renamed from: d */
    public final void mo15302d() {
        C3513t.m12634b("pause must be called on the main UI thread.");
        for (String str : this.f13120d.keySet()) {
            try {
                C3846he heVar = (C3846he) this.f13120d.get(str);
                if (!(heVar == null || heVar.mo15361a() == null)) {
                    heVar.mo15361a().mo15097d();
                }
            } catch (RemoteException e) {
                C3900je.m17434d("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: e */
    public final void mo15303e() {
        C3513t.m12634b("resume must be called on the main UI thread.");
        for (String str : this.f13120d.keySet()) {
            try {
                C3846he heVar = (C3846he) this.f13120d.get(str);
                if (!(heVar == null || heVar.mo15361a() == null)) {
                    heVar.mo15361a().mo15098e();
                }
            } catch (RemoteException e) {
                C3900je.m17434d("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: f */
    public final void mo15304f() {
        C3513t.m12634b("destroy must be called on the main UI thread.");
        for (String str : this.f13120d.keySet()) {
            try {
                C3846he heVar = (C3846he) this.f13120d.get(str);
                if (!(heVar == null || heVar.mo15361a() == null)) {
                    heVar.mo15361a().mo15096c();
                }
            } catch (RemoteException e) {
                C3900je.m17434d("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: g */
    public final void mo15305g() {
        if (this.f13119c.f8865j != null && this.f13119c.f8865j.f13279o != null) {
            C3025aw.m10936x();
            bbt.m15970a(this.f13119c.f8858c, this.f13119c.f8860e.f14505a, this.f13119c.f8865j, this.f13119c.f8857b, false, this.f13119c.f8865j.f13279o.f12553l);
        }
    }

    /* renamed from: h */
    public final void mo15306h() {
        if (this.f13119c.f8865j != null && this.f13119c.f8865j.f13279o != null) {
            C3025aw.m10936x();
            bbt.m15970a(this.f13119c.f8858c, this.f13119c.f8860e.f14505a, this.f13119c.f8865j, this.f13119c.f8857b, false, this.f13119c.f8865j.f13279o.f12555n);
        }
    }
}
