package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.C3025aw;
import com.google.android.gms.ads.internal.gmsg.C3081k;
import java.util.concurrent.Future;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.gp */
public final class C3830gp extends C3894iz implements C3836gv, C3839gy, C3845hd {

    /* renamed from: a */
    public final String f13147a;

    /* renamed from: b */
    private final C3879ik f13148b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Context f13149c;

    /* renamed from: d */
    private final C3846he f13150d;

    /* renamed from: e */
    private final C3839gy f13151e;

    /* renamed from: f */
    private final Object f13152f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final String f13153g;

    /* renamed from: h */
    private final bbj f13154h;

    /* renamed from: i */
    private final long f13155i;

    /* renamed from: j */
    private int f13156j = 0;

    /* renamed from: k */
    private int f13157k = 3;

    /* renamed from: l */
    private C3833gs f13158l;

    /* renamed from: m */
    private Future f13159m;

    /* renamed from: n */
    private volatile C3081k f13160n;

    public C3830gp(Context context, String str, String str2, bbj bbj, C3879ik ikVar, C3846he heVar, C3839gy gyVar, long j) {
        this.f13149c = context;
        this.f13147a = str;
        this.f13153g = str2;
        this.f13154h = bbj;
        this.f13148b = ikVar;
        this.f13150d = heVar;
        this.f13152f = new Object();
        this.f13151e = gyVar;
        this.f13155i = j;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m16775a(zzjj zzjj, bcd bcd) {
        this.f13150d.mo15362b().mo15345a((C3839gy) this);
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.f13147a)) {
                bcd.mo15093a(zzjj, this.f13153g, this.f13154h.f12542a);
            } else {
                bcd.mo15092a(zzjj, this.f13153g);
            }
        } catch (RemoteException e) {
            C3900je.m17432c("Fail to load ad from adapter.", e);
            mo15328a(this.f13147a, 0);
        }
    }

    /* renamed from: a */
    private final boolean m16776a(long j) {
        int i;
        long b = this.f13155i - (C3025aw.m10924l().mo13695b() - j);
        if (b <= 0) {
            i = 4;
        } else {
            try {
                this.f13152f.wait(b);
                return true;
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                i = 5;
            }
        }
        this.f13157k = i;
        return false;
    }

    /* renamed from: a */
    public final void mo12687a() {
        Handler handler;
        Runnable grVar;
        if (this.f13150d != null && this.f13150d.mo15362b() != null && this.f13150d.mo15361a() != null) {
            C3838gx b = this.f13150d.mo15362b();
            b.mo15345a((C3839gy) null);
            b.mo15344a((C3836gv) this);
            b.mo15346a((C3845hd) this);
            zzjj zzjj = this.f13148b.f13291a.f14404c;
            bcd a = this.f13150d.mo15361a();
            try {
                if (a.mo15100g()) {
                    handler = C3975lz.f13539a;
                    grVar = new C3831gq(this, zzjj, a);
                } else {
                    handler = C3975lz.f13539a;
                    grVar = new C3832gr(this, a, zzjj, b);
                }
                handler.post(grVar);
            } catch (RemoteException e) {
                C3900je.m17432c("Fail to check if adapter is initialized.", e);
                mo15328a(this.f13147a, 0);
            }
            long b2 = C3025aw.m10924l().mo13695b();
            while (true) {
                synchronized (this.f13152f) {
                    if (this.f13156j != 0) {
                        this.f13158l = new C3835gu().mo15337a(C3025aw.m10924l().mo13695b() - b2).mo15336a(1 == this.f13156j ? 6 : this.f13157k).mo15338a(this.f13147a).mo15339b(this.f13154h.f12545d).mo15335a();
                    } else if (!m16776a(b2)) {
                        this.f13158l = new C3835gu().mo15336a(this.f13157k).mo15337a(C3025aw.m10924l().mo13695b() - b2).mo15338a(this.f13147a).mo15339b(this.f13154h.f12545d).mo15335a();
                        break;
                    }
                }
            }
            b.mo15345a((C3839gy) null);
            b.mo15344a((C3836gv) null);
            if (this.f13156j == 1) {
                this.f13151e.mo15327a(this.f13147a);
            } else {
                this.f13151e.mo15328a(this.f13147a, this.f13157k);
            }
        }
    }

    /* renamed from: a */
    public final void mo15324a(int i) {
        mo15328a(this.f13147a, 0);
    }

    /* renamed from: a */
    public final void mo15325a(Bundle bundle) {
        C3081k kVar = this.f13160n;
        if (kVar != null) {
            kVar.mo12421a("", bundle);
        }
    }

    /* renamed from: a */
    public final void mo15326a(C3081k kVar) {
        this.f13160n = kVar;
    }

    /* renamed from: a */
    public final void mo15327a(String str) {
        synchronized (this.f13152f) {
            this.f13156j = 1;
            this.f13152f.notify();
        }
    }

    /* renamed from: a */
    public final void mo15328a(String str, int i) {
        synchronized (this.f13152f) {
            this.f13156j = 2;
            this.f13157k = i;
            this.f13152f.notify();
        }
    }

    /* renamed from: d */
    public final Future mo15329d() {
        if (this.f13159m != null) {
            return this.f13159m;
        }
        C4008ne neVar = (C4008ne) mo14344c();
        this.f13159m = neVar;
        return neVar;
    }

    /* renamed from: e */
    public final C3833gs mo15330e() {
        C3833gs gsVar;
        synchronized (this.f13152f) {
            gsVar = this.f13158l;
        }
        return gsVar;
    }

    /* renamed from: e_ */
    public final void mo12688e_() {
    }

    /* renamed from: f */
    public final bbj mo15331f() {
        return this.f13154h;
    }

    /* renamed from: g */
    public final void mo15332g() {
        m16775a(this.f13148b.f13291a.f14404c, this.f13150d.mo15361a());
    }
}
