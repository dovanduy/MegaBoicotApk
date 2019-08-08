package com.google.android.gms.internal.p148e;

import com.google.android.gms.internal.p148e.C4513cu.C4518e;

/* renamed from: com.google.android.gms.internal.e.er */
final class C4569er implements C4552ea {

    /* renamed from: a */
    private final C4554ec f14939a;

    /* renamed from: b */
    private final String f14940b;

    /* renamed from: c */
    private final Object[] f14941c;

    /* renamed from: d */
    private final int f14942d;

    C4569er(C4554ec ecVar, String str, Object[] objArr) {
        this.f14939a = ecVar;
        this.f14940b = str;
        this.f14941c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f14942d = charAt;
            return;
        }
        char c = charAt & 8191;
        int i = 13;
        int i2 = 1;
        while (true) {
            int i3 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 55296) {
                c |= (charAt2 & 8191) << i;
                i += 13;
                i2 = i3;
            } else {
                this.f14942d = c | (charAt2 << i);
                return;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final String mo16699d() {
        return this.f14940b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final Object[] mo16700e() {
        return this.f14941c;
    }

    /* renamed from: c */
    public final C4554ec mo16683c() {
        return this.f14939a;
    }

    /* renamed from: a */
    public final int mo16681a() {
        return (this.f14942d & 1) == 1 ? C4518e.f14852h : C4518e.f14853i;
    }

    /* renamed from: b */
    public final boolean mo16682b() {
        return (this.f14942d & 2) == 2;
    }
}
