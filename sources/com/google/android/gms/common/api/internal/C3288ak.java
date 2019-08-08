package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3244a;
import com.google.android.gms.common.api.C3244a.C3246b;
import com.google.android.gms.common.api.C3244a.C3255f;
import com.google.android.gms.common.api.C3391k;
import com.google.android.gms.common.api.internal.C3332c.C3333a;
import java.util.Collections;

/* renamed from: com.google.android.gms.common.api.internal.ak */
public final class C3288ak implements C3297at {

    /* renamed from: a */
    private final C3298au f9542a;

    public C3288ak(C3298au auVar) {
        this.f9542a = auVar;
    }

    /* renamed from: a */
    public final void mo13187a(int i) {
    }

    /* renamed from: a */
    public final void mo13188a(Bundle bundle) {
    }

    /* renamed from: a */
    public final void mo13189a(ConnectionResult connectionResult, C3244a<?> aVar, boolean z) {
    }

    /* renamed from: b */
    public final boolean mo13191b() {
        return true;
    }

    /* renamed from: a */
    public final void mo13186a() {
        for (C3255f g : this.f9542a.f9580a.values()) {
            g.mo13098g();
        }
        this.f9542a.f9583d.f9545c = Collections.emptySet();
    }

    /* renamed from: a */
    public final <A extends C3246b, R extends C3391k, T extends C3333a<R, A>> T mo13185a(T t) {
        this.f9542a.f9583d.f9543a.add(t);
        return t;
    }

    /* renamed from: b */
    public final <A extends C3246b, T extends C3333a<? extends C3391k, A>> T mo13190b(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    /* renamed from: c */
    public final void mo13192c() {
        this.f9542a.mo13218d();
    }
}
