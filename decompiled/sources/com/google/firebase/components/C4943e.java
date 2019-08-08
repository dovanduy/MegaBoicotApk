package com.google.firebase.components;

import com.google.android.gms.common.internal.C3513t;

/* renamed from: com.google.firebase.components.e */
/* compiled from: com.google.firebase:firebase-common@@16.0.2 */
public final class C4943e {

    /* renamed from: a */
    private final Class<?> f16124a;

    /* renamed from: b */
    private final int f16125b;

    /* renamed from: c */
    private final int f16126c;

    private C4943e(Class<?> cls, int i, int i2) {
        this.f16124a = (Class) C3513t.m12626a(cls, (Object) "Null dependency anInterface.");
        this.f16125b = i;
        this.f16126c = i2;
    }

    /* renamed from: a */
    public static C4943e m21542a(Class<?> cls) {
        return new C4943e(cls, 1, 0);
    }

    /* renamed from: a */
    public final Class<?> mo17863a() {
        return this.f16124a;
    }

    /* renamed from: b */
    public final boolean mo17864b() {
        return this.f16125b == 1;
    }

    /* renamed from: c */
    public final boolean mo17865c() {
        return this.f16126c == 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4943e)) {
            return false;
        }
        C4943e eVar = (C4943e) obj;
        if (this.f16124a == eVar.f16124a && this.f16125b == eVar.f16125b && this.f16126c == eVar.f16126c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f16124a.hashCode() ^ 1000003) * 1000003) ^ this.f16125b) * 1000003) ^ this.f16126c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f16124a);
        sb.append(", required=");
        boolean z = false;
        sb.append(this.f16125b == 1);
        sb.append(", direct=");
        if (this.f16126c == 0) {
            z = true;
        }
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
