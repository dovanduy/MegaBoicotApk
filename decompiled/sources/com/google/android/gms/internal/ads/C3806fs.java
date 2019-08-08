package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.C3049bt;
import com.google.android.gms.p137b.C3235a;
import com.google.android.gms.p137b.C3238b;
import javax.annotation.concurrent.GuardedBy;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.fs */
public final class C3806fs extends C3818gd {

    /* renamed from: a */
    private final Context f13126a;

    /* renamed from: b */
    private final Object f13127b;

    /* renamed from: c */
    private final zzang f13128c;
    @GuardedBy("mLock")

    /* renamed from: d */
    private final C3807ft f13129d;

    public C3806fs(Context context, C3049bt btVar, bca bca, zzang zzang) {
        C3807ft ftVar = new C3807ft(context, btVar, zzjn.m18802a(), bca, zzang);
        this(context, zzang, ftVar);
    }

    private C3806fs(Context context, zzang zzang, C3807ft ftVar) {
        this.f13127b = new Object();
        this.f13126a = context;
        this.f13128c = zzang;
        this.f13129d = ftVar;
    }

    /* renamed from: a */
    public final void mo14654a() {
        synchronized (this.f13127b) {
            this.f13129d.mo15310K();
        }
    }

    /* renamed from: a */
    public final void mo14655a(C3235a aVar) {
        synchronized (this.f13127b) {
            this.f13129d.mo12442o();
        }
    }

    /* renamed from: a */
    public final void mo14656a(apm apm) {
        if (((Boolean) aoq.m14620f().mo14695a(aru.f11781aF)).booleanValue()) {
            synchronized (this.f13127b) {
                this.f13129d.mo12407a(apm);
            }
        }
    }

    /* renamed from: a */
    public final void mo14657a(C3813fz fzVar) {
        synchronized (this.f13127b) {
            this.f13129d.mo12412a(fzVar);
        }
    }

    /* renamed from: a */
    public final void mo14658a(C3822gh ghVar) {
        synchronized (this.f13127b) {
            this.f13129d.mo12413a(ghVar);
        }
    }

    /* renamed from: a */
    public final void mo14659a(zzahk zzahk) {
        synchronized (this.f13127b) {
            this.f13129d.mo15313a(zzahk);
        }
    }

    /* renamed from: a */
    public final void mo14660a(String str) {
        synchronized (this.f13127b) {
            this.f13129d.mo12420a(str);
        }
    }

    /* renamed from: a */
    public final void mo14661a(boolean z) {
        synchronized (this.f13127b) {
            this.f13129d.mo12432c(z);
        }
    }

    /* renamed from: b */
    public final Bundle mo14662b() {
        Bundle q;
        if (!((Boolean) aoq.m14620f().mo14695a(aru.f11781aF)).booleanValue()) {
            return new Bundle();
        }
        synchronized (this.f13127b) {
            q = this.f13129d.mo12444q();
        }
        return q;
    }

    /* renamed from: b */
    public final void mo14663b(C3235a aVar) {
        Context context;
        synchronized (this.f13127b) {
            if (aVar == null) {
                context = null;
            } else {
                try {
                    context = (Context) C3238b.m11574a(aVar);
                } catch (Exception e) {
                    C3900je.m17432c("Unable to extract updated context.", e);
                }
            }
            if (context != null) {
                this.f13129d.mo15312a(context);
            }
            this.f13129d.mo12443p();
        }
    }

    /* renamed from: c */
    public final void mo14664c(C3235a aVar) {
        synchronized (this.f13127b) {
            this.f13129d.mo12437j();
        }
    }

    /* renamed from: c */
    public final boolean mo14665c() {
        boolean L;
        synchronized (this.f13127b) {
            L = this.f13129d.mo15311L();
        }
        return L;
    }

    /* renamed from: d */
    public final void mo14666d() {
        mo14655a((C3235a) null);
    }

    /* renamed from: e */
    public final void mo14667e() {
        mo14663b(null);
    }

    /* renamed from: f */
    public final void mo14668f() {
        mo14664c(null);
    }

    /* renamed from: g */
    public final String mo14669g() {
        String a;
        synchronized (this.f13127b) {
            a = this.f13129d.mo12504a();
        }
        return a;
    }
}
