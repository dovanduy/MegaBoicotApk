package com.google.android.gms.common.internal.p141a;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C3332c.C3334b;

/* renamed from: com.google.android.gms.common.internal.a.g */
final class C3432g extends C3427b {

    /* renamed from: a */
    private final C3334b<Status> f9955a;

    public C3432g(C3334b<Status> bVar) {
        this.f9955a = bVar;
    }

    /* renamed from: a */
    public final void mo13479a(int i) throws RemoteException {
        this.f9955a.mo13267a(new Status(i));
    }
}
