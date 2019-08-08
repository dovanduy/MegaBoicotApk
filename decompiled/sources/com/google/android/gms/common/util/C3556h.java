package com.google.android.gms.common.util;

import android.os.SystemClock;

/* renamed from: com.google.android.gms.common.util.h */
public class C3556h implements C3553e {

    /* renamed from: a */
    private static final C3556h f10183a = new C3556h();

    /* renamed from: d */
    public static C3553e m12745d() {
        return f10183a;
    }

    /* renamed from: a */
    public long mo13694a() {
        return System.currentTimeMillis();
    }

    /* renamed from: b */
    public long mo13695b() {
        return SystemClock.elapsedRealtime();
    }

    /* renamed from: c */
    public long mo13696c() {
        return System.nanoTime();
    }

    private C3556h() {
    }
}
