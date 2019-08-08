package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C3360d.C3361a;
import com.google.android.gms.common.api.internal.C3369i.C3370a;
import com.google.android.gms.p143d.C3584h;

/* renamed from: com.google.android.gms.common.api.internal.cb */
public final class C3336cb extends C3331bz<Boolean> {

    /* renamed from: b */
    private final C3370a<?> f9656b;

    public C3336cb(C3370a<?> aVar, C3584h<Boolean> hVar) {
        super(4, hVar);
        this.f9656b = aVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo13203a(C3381r rVar, boolean z) {
    }

    /* renamed from: d */
    public final void mo13265d(C3361a<?> aVar) throws RemoteException {
        C3316bk bkVar = (C3316bk) aVar.mo13327c().remove(this.f9656b);
        if (bkVar != null) {
            bkVar.f9617b.mo13362a(aVar.mo13326b(), this.f9652a);
            bkVar.f9616a.mo13358a();
            return;
        }
        this.f9652a.mo13724b(Boolean.valueOf(false));
    }

    /* renamed from: b */
    public final Feature[] mo13246b(C3361a<?> aVar) {
        C3316bk bkVar = (C3316bk) aVar.mo13327c().get(this.f9656b);
        if (bkVar == null) {
            return null;
        }
        return bkVar.f9616a.mo13360b();
    }

    /* renamed from: c */
    public final boolean mo13247c(C3361a<?> aVar) {
        C3316bk bkVar = (C3316bk) aVar.mo13327c().get(this.f9656b);
        return bkVar != null && bkVar.f9616a.mo13361c();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo13204a(RuntimeException runtimeException) {
        super.mo13204a(runtimeException);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo13201a(Status status) {
        super.mo13201a(status);
    }
}
