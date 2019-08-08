package com.google.android.gms.internal.p148e;

/* renamed from: com.google.android.gms.internal.e.fx */
final class C4611fx extends IllegalArgumentException {
    C4611fx(int i, int i2) {
        StringBuilder sb = new StringBuilder(54);
        sb.append("Unpaired surrogate at index ");
        sb.append(i);
        sb.append(" of ");
        sb.append(i2);
        super(sb.toString());
    }
}
