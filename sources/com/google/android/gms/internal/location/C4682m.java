package com.google.android.gms.internal.location;

import android.content.ContentProviderClient;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.C3369i;
import com.google.android.gms.common.api.internal.C3369i.C3370a;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.location.C4707ah;
import com.google.android.gms.location.C4710ak;
import com.google.android.gms.location.C4717f;
import com.google.android.gms.location.C4718g;
import com.google.android.gms.location.LocationRequest;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.location.m */
public final class C4682m {

    /* renamed from: a */
    private final C4695z<C4678i> f15228a;

    /* renamed from: b */
    private final Context f15229b;

    /* renamed from: c */
    private ContentProviderClient f15230c = null;

    /* renamed from: d */
    private boolean f15231d = false;

    /* renamed from: e */
    private final Map<C3370a<C4718g>, C4687r> f15232e = new HashMap();

    /* renamed from: f */
    private final Map<C3370a<Object>, C4686q> f15233f = new HashMap();

    /* renamed from: g */
    private final Map<C3370a<C4717f>, C4683n> f15234g = new HashMap();

    public C4682m(Context context, C4695z<C4678i> zVar) {
        this.f15229b = context;
        this.f15228a = zVar;
    }

    /* renamed from: a */
    private final C4687r m20226a(C3369i<C4718g> iVar) {
        C4687r rVar;
        synchronized (this.f15232e) {
            rVar = (C4687r) this.f15232e.get(iVar.mo13350b());
            if (rVar == null) {
                rVar = new C4687r(iVar);
            }
            this.f15232e.put(iVar.mo13350b(), rVar);
        }
        return rVar;
    }

    /* renamed from: a */
    public final void mo16931a() throws RemoteException {
        synchronized (this.f15232e) {
            for (C4687r rVar : this.f15232e.values()) {
                if (rVar != null) {
                    ((C4678i) this.f15228a.mo16912a()).mo16925a(zzbf.m20255a((C4710ak) rVar, (C4675f) null));
                }
            }
            this.f15232e.clear();
        }
        synchronized (this.f15234g) {
            for (C4683n nVar : this.f15234g.values()) {
                if (nVar != null) {
                    ((C4678i) this.f15228a.mo16912a()).mo16925a(zzbf.m20254a((C4707ah) nVar, (C4675f) null));
                }
            }
            this.f15234g.clear();
        }
        synchronized (this.f15233f) {
            for (C4686q qVar : this.f15233f.values()) {
                if (qVar != null) {
                    ((C4678i) this.f15228a.mo16912a()).mo16926a(new zzo(2, null, qVar.asBinder(), null));
                }
            }
            this.f15233f.clear();
        }
    }

    /* renamed from: a */
    public final void mo16932a(C3370a<C4718g> aVar, C4675f fVar) throws RemoteException {
        this.f15228a.mo16913b();
        C3513t.m12626a(aVar, (Object) "Invalid null listener key");
        synchronized (this.f15232e) {
            C4687r rVar = (C4687r) this.f15232e.remove(aVar);
            if (rVar != null) {
                rVar.mo16938a();
                ((C4678i) this.f15228a.mo16912a()).mo16925a(zzbf.m20255a((C4710ak) rVar, fVar));
            }
        }
    }

    /* renamed from: a */
    public final void mo16933a(LocationRequest locationRequest, C3369i<C4718g> iVar, C4675f fVar) throws RemoteException {
        this.f15228a.mo16913b();
        C4678i iVar2 = (C4678i) this.f15228a.mo16912a();
        zzbf zzbf = new zzbf(1, zzbd.m20253a(locationRequest), m20226a(iVar).asBinder(), null, null, fVar != null ? fVar.asBinder() : null);
        iVar2.mo16925a(zzbf);
    }

    /* renamed from: a */
    public final void mo16934a(boolean z) throws RemoteException {
        this.f15228a.mo16913b();
        ((C4678i) this.f15228a.mo16912a()).mo16929a(z);
        this.f15231d = z;
    }

    /* renamed from: b */
    public final void mo16935b() throws RemoteException {
        if (this.f15231d) {
            mo16934a(false);
        }
    }
}
