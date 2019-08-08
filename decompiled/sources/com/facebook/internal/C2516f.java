package com.facebook.internal;

import android.app.Activity;

/* renamed from: com.facebook.internal.f */
/* compiled from: FacebookDialogBase */
public abstract class C2516f<CONTENT, RESULT> {

    /* renamed from: a */
    protected static final Object f7895a = new Object();

    /* renamed from: b */
    private final Activity f7896b;

    /* renamed from: c */
    private final C2546n f7897c;

    /* renamed from: d */
    private int f7898d;

    protected C2516f(Activity activity, int i) {
        C2484ae.m9489a((Object) activity, "activity");
        this.f7896b = activity;
        this.f7897c = null;
        this.f7898d = i;
    }

    protected C2516f(C2546n nVar, int i) {
        C2484ae.m9489a((Object) nVar, "fragmentWrapper");
        this.f7897c = nVar;
        this.f7896b = null;
        this.f7898d = i;
        if (nVar.mo9048c() == null) {
            throw new IllegalArgumentException("Cannot use a fragment that is not attached to an activity");
        }
    }
}
