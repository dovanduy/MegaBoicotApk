package com.google.firebase.components;

import com.google.firebase.p150b.C4934a;

/* renamed from: com.google.firebase.components.q */
/* compiled from: com.google.firebase:firebase-common@@16.0.2 */
final class C4955q<T> implements C4934a<T> {

    /* renamed from: a */
    private static final Object f16140a = new Object();

    /* renamed from: b */
    private volatile Object f16141b = f16140a;

    /* renamed from: c */
    private volatile C4934a<T> f16142c;

    C4955q(C4941c<T> cVar, C4940b bVar) {
        this.f16142c = C4956r.m21573a(cVar, bVar);
    }

    /* renamed from: a */
    public final T mo17841a() {
        T t = this.f16141b;
        if (t == f16140a) {
            synchronized (this) {
                t = this.f16141b;
                if (t == f16140a) {
                    t = this.f16142c.mo17841a();
                    this.f16141b = t;
                    this.f16142c = null;
                }
            }
        }
        return t;
    }
}
