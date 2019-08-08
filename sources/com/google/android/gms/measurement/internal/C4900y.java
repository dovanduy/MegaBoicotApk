package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C3513t;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.y */
final class C4900y implements Runnable {

    /* renamed from: a */
    private final C4899x f15981a;

    /* renamed from: b */
    private final int f15982b;

    /* renamed from: c */
    private final Throwable f15983c;

    /* renamed from: d */
    private final byte[] f15984d;

    /* renamed from: e */
    private final String f15985e;

    /* renamed from: f */
    private final Map<String, List<String>> f15986f;

    private C4900y(String str, C4899x xVar, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        C3513t.m12625a(xVar);
        this.f15981a = xVar;
        this.f15982b = i;
        this.f15983c = th;
        this.f15984d = bArr;
        this.f15985e = str;
        this.f15986f = map;
    }

    public final void run() {
        this.f15981a.mo17466a(this.f15985e, this.f15982b, this.f15983c, this.f15984d, this.f15986f);
    }
}
