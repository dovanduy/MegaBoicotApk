package com.google.android.gms.common.stats;

import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {
    /* renamed from: a */
    public abstract long mo13679a();

    /* renamed from: b */
    public abstract int mo13680b();

    /* renamed from: c */
    public abstract long mo13681c();

    /* renamed from: d */
    public abstract String mo13682d();

    public String toString() {
        long a = mo13679a();
        int b = mo13680b();
        long c = mo13681c();
        String d = mo13682d();
        StringBuilder sb = new StringBuilder(53 + String.valueOf(d).length());
        sb.append(a);
        sb.append("\t");
        sb.append(b);
        sb.append("\t");
        sb.append(c);
        sb.append(d);
        return sb.toString();
    }
}
