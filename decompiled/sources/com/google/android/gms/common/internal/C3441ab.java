package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.C3266f.C3268b;
import com.google.android.gms.common.internal.C3469d.C3470a;

/* renamed from: com.google.android.gms.common.internal.ab */
final class C3441ab implements C3470a {

    /* renamed from: a */
    private final /* synthetic */ C3268b f9959a;

    C3441ab(C3268b bVar) {
        this.f9959a = bVar;
    }

    /* renamed from: a */
    public final void mo13484a(Bundle bundle) {
        this.f9959a.onConnected(bundle);
    }

    /* renamed from: a */
    public final void mo13483a(int i) {
        this.f9959a.onConnectionSuspended(i);
    }
}
