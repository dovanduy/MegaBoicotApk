package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.C3244a;
import com.google.android.gms.common.api.C3244a.C3245a;
import com.google.android.gms.common.api.C3244a.C3248d;
import com.google.android.gms.common.api.C3244a.C3255f;
import com.google.android.gms.common.api.C3263e;
import com.google.android.gms.common.api.internal.C3360d.C3361a;
import com.google.android.gms.common.internal.C3482e;
import com.google.android.gms.signin.C4902a;
import com.google.android.gms.signin.C4907e;

/* renamed from: com.google.android.gms.common.api.internal.cq */
public final class C3352cq<O extends C3248d> extends C3263e<O> {

    /* renamed from: b */
    private final C3255f f9701b;

    /* renamed from: c */
    private final C3346ck f9702c;

    /* renamed from: d */
    private final C3482e f9703d;

    /* renamed from: e */
    private final C3245a<? extends C4907e, C4902a> f9704e;

    public C3352cq(Context context, C3244a<O> aVar, Looper looper, C3255f fVar, C3346ck ckVar, C3482e eVar, C3245a<? extends C4907e, C4902a> aVar2) {
        super(context, aVar, looper);
        this.f9701b = fVar;
        this.f9702c = ckVar;
        this.f9703d = eVar;
        this.f9704e = aVar2;
        this.f9473a.mo13311a((C3263e<?>) this);
    }

    /* renamed from: a */
    public final C3255f mo13292a() {
        return this.f9701b;
    }

    /* renamed from: a */
    public final C3255f mo13113a(Looper looper, C3361a<O> aVar) {
        this.f9702c.mo13289a(aVar);
        return this.f9701b;
    }

    /* renamed from: a */
    public final C3320bo mo13114a(Context context, Handler handler) {
        return new C3320bo(context, handler, this.f9703d, this.f9704e);
    }
}
