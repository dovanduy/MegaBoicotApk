package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C3513t;

/* renamed from: com.google.android.gms.measurement.internal.d */
final class C4822d {

    /* renamed from: a */
    final String f15661a;

    /* renamed from: b */
    final String f15662b;

    /* renamed from: c */
    final long f15663c;

    /* renamed from: d */
    final long f15664d;

    /* renamed from: e */
    final long f15665e;

    /* renamed from: f */
    final long f15666f;

    /* renamed from: g */
    final Long f15667g;

    /* renamed from: h */
    final Long f15668h;

    /* renamed from: i */
    final Long f15669i;

    /* renamed from: j */
    final Boolean f15670j;

    C4822d(String str, String str2, long j, long j2, long j3, long j4, Long l, Long l2, Long l3, Boolean bool) {
        long j5 = j;
        long j6 = j2;
        long j7 = j4;
        C3513t.m12627a(str);
        C3513t.m12627a(str2);
        boolean z = false;
        C3513t.m12635b(j5 >= 0);
        C3513t.m12635b(j6 >= 0);
        if (j7 >= 0) {
            z = true;
        }
        C3513t.m12635b(z);
        this.f15661a = str;
        this.f15662b = str2;
        this.f15663c = j5;
        this.f15664d = j6;
        this.f15665e = j3;
        this.f15666f = j7;
        this.f15667g = l;
        this.f15668h = l2;
        this.f15669i = l3;
        this.f15670j = bool;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C4822d mo17379a(long j) {
        C4822d dVar = new C4822d(this.f15661a, this.f15662b, this.f15663c, this.f15664d, j, this.f15666f, this.f15667g, this.f15668h, this.f15669i, this.f15670j);
        return dVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C4822d mo17380a(long j, long j2) {
        C4822d dVar = new C4822d(this.f15661a, this.f15662b, this.f15663c, this.f15664d, this.f15665e, j, Long.valueOf(j2), this.f15668h, this.f15669i, this.f15670j);
        return dVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C4822d mo17381a(Long l, Long l2, Boolean bool) {
        C4822d dVar = new C4822d(this.f15661a, this.f15662b, this.f15663c, this.f15664d, this.f15665e, this.f15666f, this.f15667g, l, l2, (bool == null || bool.booleanValue()) ? bool : null);
        return dVar;
    }
}
