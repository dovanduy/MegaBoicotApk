package com.google.android.gms.auth.api.signin.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.C3244a.C3246b;
import com.google.android.gms.common.api.C3266f;
import com.google.android.gms.common.api.C3391k;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.auth.api.signin.internal.j */
final class C3218j extends C3220l<Status> {
    C3218j(C3266f fVar) {
        super(fVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ C3391k mo13021a(Status status) {
        return status;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo13022a(C3246b bVar) throws RemoteException {
        C3216h hVar = (C3216h) bVar;
        ((C3226r) hVar.mo13557w()).mo13028a(new C3219k(this), hVar.mo13018e());
    }
}
