package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C3025aw;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.de */
public abstract class C3737de implements C3735dc, C3929kg<Void> {

    /* renamed from: a */
    private final C4021nr<zzaef> f12847a;

    /* renamed from: b */
    private final C3735dc f12848b;

    /* renamed from: c */
    private final Object f12849c = new Object();

    public C3737de(C4021nr<zzaef> nrVar, C3735dc dcVar) {
        this.f12847a = nrVar;
        this.f12848b = dcVar;
    }

    /* renamed from: a */
    public abstract void mo15239a();

    /* renamed from: a */
    public final void mo15228a(zzaej zzaej) {
        synchronized (this.f12849c) {
            this.f12848b.mo15228a(zzaej);
            mo15239a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo15240a(C3749dq dqVar, zzaef zzaef) {
        try {
            dqVar.mo15251a(zzaef, (C3752dt) new C3746dn(this));
            return true;
        } catch (Throwable th) {
            C3900je.m17432c("Could not fetch ad response from ad request service due to an Exception.", th);
            C3025aw.m10921i().mo15436a(th, "AdRequestClientTask.getAdResponseFromService");
            this.f12848b.mo15228a(new zzaej(0));
            return false;
        }
    }

    /* renamed from: b */
    public final void mo14343b() {
        mo15239a();
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo14344c() {
        C3749dq d = mo15241d();
        if (d == null) {
            this.f12848b.mo15228a(new zzaej(0));
            mo15239a();
            return null;
        }
        this.f12847a.mo15691a(new C3739dg(this, d), new C3740dh(this));
        return null;
    }

    /* renamed from: d */
    public abstract C3749dq mo15241d();
}
