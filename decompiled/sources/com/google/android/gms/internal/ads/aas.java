package com.google.android.gms.internal.ads;

final class aas {

    /* renamed from: a */
    private final Object f10333a;

    /* renamed from: b */
    private final int f10334b;

    aas(Object obj, int i) {
        this.f10333a = obj;
        this.f10334b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aas)) {
            return false;
        }
        aas aas = (aas) obj;
        return this.f10333a == aas.f10333a && this.f10334b == aas.f10334b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f10333a) * 65535) + this.f10334b;
    }
}
