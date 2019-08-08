package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.common.api.internal.bp */
final class C3321bp implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C3320bo f9628a;

    C3321bp(C3320bo boVar) {
        this.f9628a = boVar;
    }

    public final void run() {
        this.f9628a.f9627h.mo13255b(new ConnectionResult(4));
    }
}
