package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences.Editor;
import com.google.android.gms.common.internal.C3513t;

/* renamed from: com.google.android.gms.measurement.internal.af */
public final class C4747af {

    /* renamed from: a */
    private final String f15404a;

    /* renamed from: b */
    private final boolean f15405b = true;

    /* renamed from: c */
    private boolean f15406c;

    /* renamed from: d */
    private boolean f15407d;

    /* renamed from: e */
    private final /* synthetic */ C4745ad f15408e;

    public C4747af(C4745ad adVar, String str, boolean z) {
        this.f15408e = adVar;
        C3513t.m12627a(str);
        this.f15404a = str;
    }

    /* renamed from: a */
    public final boolean mo17187a() {
        if (!this.f15406c) {
            this.f15406c = true;
            this.f15407d = this.f15408e.m20367y().getBoolean(this.f15404a, this.f15405b);
        }
        return this.f15407d;
    }

    /* renamed from: a */
    public final void mo17186a(boolean z) {
        Editor edit = this.f15408e.m20367y().edit();
        edit.putBoolean(this.f15404a, z);
        edit.apply();
        this.f15407d = z;
    }
}
