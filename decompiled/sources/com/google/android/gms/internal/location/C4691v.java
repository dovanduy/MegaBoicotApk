package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.C3332c.C3334b;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.location.LocationSettingsResult;

/* renamed from: com.google.android.gms.internal.location.v */
final class C4691v extends C4681l {

    /* renamed from: a */
    private C3334b<LocationSettingsResult> f15242a;

    public C4691v(C3334b<LocationSettingsResult> bVar) {
        C3513t.m12636b(bVar != null, "listener can't be null.");
        this.f15242a = bVar;
    }

    /* renamed from: a */
    public final void mo16930a(LocationSettingsResult locationSettingsResult) throws RemoteException {
        this.f15242a.mo13267a(locationSettingsResult);
        this.f15242a = null;
    }
}
