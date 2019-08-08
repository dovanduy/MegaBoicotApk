package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences.Editor;
import com.google.android.gms.common.internal.C3513t;

/* renamed from: com.google.android.gms.measurement.internal.ag */
public final class C4748ag {

    /* renamed from: a */
    private final String f15409a;

    /* renamed from: b */
    private final long f15410b;

    /* renamed from: c */
    private boolean f15411c;

    /* renamed from: d */
    private long f15412d;

    /* renamed from: e */
    private final /* synthetic */ C4745ad f15413e;

    public C4748ag(C4745ad adVar, String str, long j) {
        this.f15413e = adVar;
        C3513t.m12627a(str);
        this.f15409a = str;
        this.f15410b = j;
    }

    /* renamed from: a */
    public final long mo17188a() {
        if (!this.f15411c) {
            this.f15411c = true;
            this.f15412d = this.f15413e.m20367y().getLong(this.f15409a, this.f15410b);
        }
        return this.f15412d;
    }

    /* renamed from: a */
    public final void mo17189a(long j) {
        Editor edit = this.f15413e.m20367y().edit();
        edit.putLong(this.f15409a, j);
        edit.apply();
        this.f15412d = j;
    }
}
