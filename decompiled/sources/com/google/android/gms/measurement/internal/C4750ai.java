package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences.Editor;
import com.google.android.gms.common.internal.C3513t;

/* renamed from: com.google.android.gms.measurement.internal.ai */
public final class C4750ai {

    /* renamed from: a */
    private final String f15419a;

    /* renamed from: b */
    private final String f15420b = null;

    /* renamed from: c */
    private boolean f15421c;

    /* renamed from: d */
    private String f15422d;

    /* renamed from: e */
    private final /* synthetic */ C4745ad f15423e;

    public C4750ai(C4745ad adVar, String str, String str2) {
        this.f15423e = adVar;
        C3513t.m12627a(str);
        this.f15419a = str;
    }

    /* renamed from: a */
    public final String mo17192a() {
        if (!this.f15421c) {
            this.f15421c = true;
            this.f15422d = this.f15423e.m20367y().getString(this.f15419a, null);
        }
        return this.f15422d;
    }

    /* renamed from: a */
    public final void mo17193a(String str) {
        if (!C4862el.m20976c(str, this.f15422d)) {
            Editor edit = this.f15423e.m20367y().edit();
            edit.putString(this.f15419a, str);
            edit.apply();
            this.f15422d = str;
        }
    }
}
