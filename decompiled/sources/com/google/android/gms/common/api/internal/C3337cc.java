package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C3244a;
import com.google.android.gms.common.api.C3244a.C3248d;
import com.google.android.gms.common.internal.C3504r;

/* renamed from: com.google.android.gms.common.api.internal.cc */
public final class C3337cc<O extends C3248d> {

    /* renamed from: a */
    private final boolean f9657a = true;

    /* renamed from: b */
    private final int f9658b;

    /* renamed from: c */
    private final C3244a<O> f9659c;

    /* renamed from: d */
    private final O f9660d;

    private C3337cc(C3244a<O> aVar, O o) {
        this.f9659c = aVar;
        this.f9660d = o;
        this.f9658b = C3504r.m12548a(this.f9659c, this.f9660d);
    }

    private C3337cc(C3244a<O> aVar) {
        this.f9659c = aVar;
        this.f9660d = null;
        this.f9658b = System.identityHashCode(this);
    }

    /* renamed from: a */
    public static <O extends C3248d> C3337cc<O> m11901a(C3244a<O> aVar, O o) {
        return new C3337cc<>(aVar, o);
    }

    /* renamed from: a */
    public static <O extends C3248d> C3337cc<O> m11900a(C3244a<O> aVar) {
        return new C3337cc<>(aVar);
    }

    /* renamed from: a */
    public final String mo13272a() {
        return this.f9659c.mo13090d();
    }

    public final int hashCode() {
        return this.f9658b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3337cc)) {
            return false;
        }
        C3337cc ccVar = (C3337cc) obj;
        return !this.f9657a && !ccVar.f9657a && C3504r.m12550a(this.f9659c, ccVar.f9659c) && C3504r.m12550a(this.f9660d, ccVar.f9660d);
    }
}
