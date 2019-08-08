package com.google.android.gms.internal.location;

import android.os.Looper;
import com.google.android.gms.common.api.C3266f;
import com.google.android.gms.common.api.C3270g;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.location.C4715d;
import com.google.android.gms.location.C4718g;
import com.google.android.gms.location.LocationRequest;

/* renamed from: com.google.android.gms.internal.location.an */
public final class C4668an implements C4715d {
    /* renamed from: a */
    public final C3270g<Status> mo16918a(C3266f fVar, LocationRequest locationRequest, C4718g gVar) {
        C3513t.m12626a(Looper.myLooper(), (Object) "Calling thread must be a prepared Looper thread.");
        return fVar.mo13135b(new C4669ao(this, fVar, locationRequest, gVar));
    }

    /* renamed from: a */
    public final C3270g<Status> mo16919a(C3266f fVar, C4718g gVar) {
        return fVar.mo13135b(new C4670ap(this, fVar, gVar));
    }
}
