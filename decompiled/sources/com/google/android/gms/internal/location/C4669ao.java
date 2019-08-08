package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.C3244a.C3246b;
import com.google.android.gms.common.api.C3266f;
import com.google.android.gms.common.api.internal.C3373j;
import com.google.android.gms.location.C4718g;
import com.google.android.gms.location.LocationRequest;

/* renamed from: com.google.android.gms.internal.location.ao */
final class C4669ao extends C4671b {

    /* renamed from: b */
    private final /* synthetic */ LocationRequest f15224b;

    /* renamed from: c */
    private final /* synthetic */ C4718g f15225c;

    C4669ao(C4668an anVar, C3266f fVar, LocationRequest locationRequest, C4718g gVar) {
        this.f15224b = locationRequest;
        this.f15225c = gVar;
        super(fVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo13022a(C3246b bVar) throws RemoteException {
        ((C4689t) bVar).mo16943a(this.f15224b, C3373j.m12124a(this.f15225c, C4657ac.m20185a(), C4718g.class.getSimpleName()), (C4675f) new C4672c(this));
    }
}
