package com.google.android.gms.internal.p148e;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.e.gj */
public final class C4624gj extends IOException {
    C4624gj(int i, int i2) {
        StringBuilder sb = new StringBuilder(108);
        sb.append("CodedOutputStream was writing to a flat byte array and ran out of space (pos ");
        sb.append(i);
        sb.append(" limit ");
        sb.append(i2);
        sb.append(").");
        super(sb.toString());
    }
}
