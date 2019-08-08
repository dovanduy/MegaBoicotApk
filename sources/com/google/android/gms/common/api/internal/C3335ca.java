package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import com.google.android.gms.common.api.C3244a.C3246b;
import com.google.android.gms.common.api.C3391k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C3332c.C3333a;
import com.google.android.gms.common.api.internal.C3360d.C3361a;

/* renamed from: com.google.android.gms.common.api.internal.ca */
public final class C3335ca<A extends C3333a<? extends C3391k, C3246b>> extends C3293ap {

    /* renamed from: a */
    private final A f9655a;

    public C3335ca(int i, A a) {
        super(i);
        this.f9655a = a;
    }

    /* renamed from: a */
    public final void mo13202a(C3361a<?> aVar) throws DeadObjectException {
        try {
            this.f9655a.mo13269b(aVar.mo13326b());
        } catch (RuntimeException e) {
            mo13204a(e);
        }
    }

    /* renamed from: a */
    public final void mo13201a(Status status) {
        this.f9655a.mo13268b(status);
    }

    /* renamed from: a */
    public final void mo13204a(RuntimeException runtimeException) {
        String simpleName = runtimeException.getClass().getSimpleName();
        String localizedMessage = runtimeException.getLocalizedMessage();
        StringBuilder sb = new StringBuilder(2 + String.valueOf(simpleName).length() + String.valueOf(localizedMessage).length());
        sb.append(simpleName);
        sb.append(": ");
        sb.append(localizedMessage);
        this.f9655a.mo13268b(new Status(10, sb.toString()));
    }

    /* renamed from: a */
    public final void mo13203a(C3381r rVar, boolean z) {
        rVar.mo13364a((BasePendingResult<? extends C3391k>) this.f9655a, z);
    }
}
