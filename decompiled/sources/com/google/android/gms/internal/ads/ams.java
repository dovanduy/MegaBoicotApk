package com.google.android.gms.internal.ads;

public final class ams {
    /* renamed from: a */
    public static int m14452a(int i) {
        if (i >= 0 && i <= 1) {
            return i;
        }
        if (i >= 1000 && i <= 1000) {
            return i;
        }
        StringBuilder sb = new StringBuilder(43);
        sb.append(i);
        sb.append(" is not a valid enum EnumBoolean");
        throw new IllegalArgumentException(sb.toString());
    }
}