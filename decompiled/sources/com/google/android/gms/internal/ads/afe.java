package com.google.android.gms.internal.ads;

import java.util.Arrays;

final class afe {

    /* renamed from: a */
    final int f10690a;

    /* renamed from: b */
    final byte[] f10691b;

    afe(int i, byte[] bArr) {
        this.f10690a = i;
        this.f10691b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof afe)) {
            return false;
        }
        afe afe = (afe) obj;
        return this.f10690a == afe.f10690a && Arrays.equals(this.f10691b, afe.f10691b);
    }

    public final int hashCode() {
        return ((527 + this.f10690a) * 31) + Arrays.hashCode(this.f10691b);
    }
}
