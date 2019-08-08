package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.support.p017v4.app.FragmentActivity;
import com.google.android.gms.common.internal.C3513t;

/* renamed from: com.google.android.gms.common.api.internal.g */
public class C3367g {

    /* renamed from: a */
    private final Object f9782a;

    public C3367g(Activity activity) {
        C3513t.m12626a(activity, (Object) "Activity must not be null");
        this.f9782a = activity;
    }

    /* renamed from: a */
    public boolean mo13343a() {
        return this.f9782a instanceof FragmentActivity;
    }

    /* renamed from: b */
    public final boolean mo13344b() {
        return this.f9782a instanceof Activity;
    }

    /* renamed from: c */
    public Activity mo13345c() {
        return (Activity) this.f9782a;
    }

    /* renamed from: d */
    public FragmentActivity mo13346d() {
        return (FragmentActivity) this.f9782a;
    }
}
