package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C3244a.C3246b;
import com.google.android.gms.p143d.C3584h;

/* renamed from: com.google.android.gms.common.api.internal.k */
public abstract class C3374k<A extends C3246b, L> {

    /* renamed from: a */
    private final C3369i<L> f9790a;

    /* renamed from: b */
    private final Feature[] f9791b;

    /* renamed from: c */
    private final boolean f9792c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo13359a(A a, C3584h<Void> hVar) throws RemoteException;

    /* renamed from: a */
    public void mo13358a() {
        this.f9790a.mo13348a();
    }

    /* renamed from: b */
    public Feature[] mo13360b() {
        return this.f9791b;
    }

    /* renamed from: c */
    public final boolean mo13361c() {
        return this.f9792c;
    }
}
