package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.WeakHashMap;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3718cm
public final class aji implements ajr {

    /* renamed from: a */
    private final Object f11182a = new Object();

    /* renamed from: b */
    private final WeakHashMap<C3878ij, ajj> f11183b = new WeakHashMap<>();

    /* renamed from: c */
    private final ArrayList<ajj> f11184c = new ArrayList<>();

    /* renamed from: d */
    private final Context f11185d;

    /* renamed from: e */
    private final zzang f11186e;

    /* renamed from: f */
    private final azq f11187f;

    public aji(Context context, zzang zzang) {
        this.f11185d = context.getApplicationContext();
        this.f11186e = zzang;
        this.f11187f = new azq(context.getApplicationContext(), zzang, (String) aoq.m14620f().mo14695a(aru.f11775a));
    }

    /* renamed from: e */
    private final boolean m14243e(C3878ij ijVar) {
        boolean z;
        synchronized (this.f11182a) {
            ajj ajj = (ajj) this.f11183b.get(ijVar);
            z = ajj != null && ajj.mo14393c();
        }
        return z;
    }

    /* renamed from: a */
    public final void mo14374a(ajj ajj) {
        synchronized (this.f11182a) {
            if (!ajj.mo14393c()) {
                this.f11184c.remove(ajj);
                Iterator it = this.f11183b.entrySet().iterator();
                while (it.hasNext()) {
                    if (((Entry) it.next()).getValue() == ajj) {
                        it.remove();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo14375a(C3878ij ijVar) {
        synchronized (this.f11182a) {
            ajj ajj = (ajj) this.f11183b.get(ijVar);
            if (ajj != null) {
                ajj.mo14389b();
            }
        }
    }

    /* renamed from: a */
    public final void mo14376a(zzjn zzjn, C3878ij ijVar) {
        mo14377a(zzjn, ijVar, ijVar.f13266b.getView());
    }

    /* renamed from: a */
    public final void mo14377a(zzjn zzjn, C3878ij ijVar, View view) {
        mo14379a(zzjn, ijVar, (akv) new ajp(view, ijVar), (C4089qe) null);
    }

    /* renamed from: a */
    public final void mo14378a(zzjn zzjn, C3878ij ijVar, View view, C4089qe qeVar) {
        mo14379a(zzjn, ijVar, (akv) new ajp(view, ijVar), qeVar);
    }

    /* renamed from: a */
    public final void mo14379a(zzjn zzjn, C3878ij ijVar, akv akv, C4089qe qeVar) {
        ajj ajj;
        synchronized (this.f11182a) {
            if (m14243e(ijVar)) {
                ajj = (ajj) this.f11183b.get(ijVar);
            } else {
                ajj ajj2 = new ajj(this.f11185d, zzjn, ijVar, this.f11186e, akv);
                ajj2.mo14385a((ajr) this);
                this.f11183b.put(ijVar, ajj2);
                this.f11184c.add(ajj2);
                ajj = ajj2;
            }
            ajj.mo14386a(qeVar != null ? new ajs(ajj, qeVar) : new ajw(ajj, this.f11187f, this.f11185d));
        }
    }

    /* renamed from: b */
    public final void mo14380b(C3878ij ijVar) {
        synchronized (this.f11182a) {
            ajj ajj = (ajj) this.f11183b.get(ijVar);
            if (ajj != null) {
                ajj.mo14394d();
            }
        }
    }

    /* renamed from: c */
    public final void mo14381c(C3878ij ijVar) {
        synchronized (this.f11182a) {
            ajj ajj = (ajj) this.f11183b.get(ijVar);
            if (ajj != null) {
                ajj.mo14395e();
            }
        }
    }

    /* renamed from: d */
    public final void mo14382d(C3878ij ijVar) {
        synchronized (this.f11182a) {
            ajj ajj = (ajj) this.f11183b.get(ijVar);
            if (ajj != null) {
                ajj.mo14396f();
            }
        }
    }
}
