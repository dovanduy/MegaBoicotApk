package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C3513t;

/* renamed from: com.google.android.gms.common.api.internal.cg */
final class C3342cg {

    /* renamed from: a */
    private final int f9675a;

    /* renamed from: b */
    private final ConnectionResult f9676b;

    C3342cg(ConnectionResult connectionResult, int i) {
        C3513t.m12625a(connectionResult);
        this.f9676b = connectionResult;
        this.f9675a = i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo13285a() {
        return this.f9675a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final ConnectionResult mo13286b() {
        return this.f9676b;
    }
}
