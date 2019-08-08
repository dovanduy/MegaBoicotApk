package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.C2971c;
import com.google.android.gms.ads.reward.C3166b;
import com.google.android.gms.ads.reward.C3167c;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.go */
public final class C3829go implements C3166b {

    /* renamed from: a */
    private final C3816gb f13143a;

    /* renamed from: b */
    private final Context f13144b;

    /* renamed from: c */
    private final Object f13145c = new Object();

    /* renamed from: d */
    private final C3827gm f13146d = new C3827gm(null);

    public C3829go(Context context, C3816gb gbVar) {
        this.f13143a = gbVar;
        this.f13144b = context;
    }

    /* renamed from: a */
    private final void m16769a(String str, aql aql) {
        synchronized (this.f13145c) {
            if (this.f13143a != null) {
                try {
                    this.f13143a.mo14659a(new zzahk(aoe.m14581a(this.f13144b, aql), str));
                } catch (RemoteException e) {
                    C3987mk.m17434d("#007 Could not call remote method.", e);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo12836a() {
        synchronized (this.f13145c) {
            if (this.f13143a != null) {
                try {
                    this.f13143a.mo14654a();
                } catch (RemoteException e) {
                    C3987mk.m17434d("#007 Could not call remote method.", e);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo12837a(C3167c cVar) {
        synchronized (this.f13145c) {
            this.f13146d.mo15321a(cVar);
            if (this.f13143a != null) {
                try {
                    this.f13143a.mo14658a((C3822gh) this.f13146d);
                } catch (RemoteException e) {
                    C3987mk.m17434d("#007 Could not call remote method.", e);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo12838a(String str, C2971c cVar) {
        m16769a(str, cVar.mo12202a());
    }
}
