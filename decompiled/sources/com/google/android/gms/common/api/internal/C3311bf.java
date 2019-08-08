package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.C3244a.C3246b;
import com.google.android.gms.common.api.C3244a.C3248d;
import com.google.android.gms.common.api.C3263e;
import com.google.android.gms.common.api.C3391k;
import com.google.android.gms.common.api.internal.C3332c.C3333a;

/* renamed from: com.google.android.gms.common.api.internal.bf */
public final class C3311bf<O extends C3248d> extends C3385v {

    /* renamed from: a */
    private final C3263e<O> f9612a;

    public C3311bf(C3263e<O> eVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f9612a = eVar;
    }

    /* renamed from: a */
    public final void mo13131a(C3324bs bsVar) {
    }

    /* renamed from: b */
    public final void mo13137b(C3324bs bsVar) {
    }

    /* renamed from: a */
    public final <A extends C3246b, R extends C3391k, T extends C3333a<R, A>> T mo13128a(T t) {
        return this.f9612a.mo13115a(t);
    }

    /* renamed from: b */
    public final <A extends C3246b, T extends C3333a<? extends C3391k, A>> T mo13135b(T t) {
        return this.f9612a.mo13117b(t);
    }

    /* renamed from: c */
    public final Looper mo13138c() {
        return this.f9612a.mo13122g();
    }

    /* renamed from: b */
    public final Context mo13134b() {
        return this.f9612a.mo13123h();
    }
}
