package com.google.android.gms.common.api.internal;

import com.google.android.gms.auth.api.signin.internal.C3210b;
import com.google.android.gms.common.api.C3266f;
import com.google.android.gms.common.api.C3391k;
import com.google.android.gms.common.api.C3392l;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.aq */
final class C3294aq implements C3392l<Status> {

    /* renamed from: a */
    private final /* synthetic */ C3378o f9574a;

    /* renamed from: b */
    private final /* synthetic */ boolean f9575b;

    /* renamed from: c */
    private final /* synthetic */ C3266f f9576c;

    /* renamed from: d */
    private final /* synthetic */ C3289al f9577d;

    C3294aq(C3289al alVar, C3378o oVar, boolean z, C3266f fVar) {
        this.f9577d = alVar;
        this.f9574a = oVar;
        this.f9575b = z;
        this.f9576c = fVar;
    }

    public final /* synthetic */ void onResult(C3391k kVar) {
        Status status = (Status) kVar;
        C3210b.m11519a(this.f9577d.f9553k).mo13005d();
        if (status.mo13080d() && this.f9577d.mo13145j()) {
            this.f9577d.mo13143h();
        }
        this.f9574a.mo13162b(status);
        if (this.f9575b) {
            this.f9576c.mo13142g();
        }
    }
}
