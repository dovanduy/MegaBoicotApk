package com.google.android.gms.internal.p148e;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.e.gs */
final class C4633gs {

    /* renamed from: a */
    final int f15078a;

    /* renamed from: b */
    final byte[] f15079b;

    C4633gs(int i, byte[] bArr) {
        this.f15078a = i;
        this.f15079b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4633gs)) {
            return false;
        }
        C4633gs gsVar = (C4633gs) obj;
        return this.f15078a == gsVar.f15078a && Arrays.equals(this.f15079b, gsVar.f15079b);
    }

    public final int hashCode() {
        return ((527 + this.f15078a) * 31) + Arrays.hashCode(this.f15079b);
    }
}
