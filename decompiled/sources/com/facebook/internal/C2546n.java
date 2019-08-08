package com.facebook.internal;

import android.app.Activity;
import android.content.Intent;
import android.support.p017v4.app.Fragment;

/* renamed from: com.facebook.internal.n */
/* compiled from: FragmentWrapper */
public class C2546n {

    /* renamed from: a */
    private Fragment f7971a;

    /* renamed from: b */
    private android.app.Fragment f7972b;

    public C2546n(Fragment fragment) {
        C2484ae.m9489a((Object) fragment, "fragment");
        this.f7971a = fragment;
    }

    public C2546n(android.app.Fragment fragment) {
        C2484ae.m9489a((Object) fragment, "fragment");
        this.f7972b = fragment;
    }

    /* renamed from: a */
    public android.app.Fragment mo9045a() {
        return this.f7972b;
    }

    /* renamed from: b */
    public Fragment mo9047b() {
        return this.f7971a;
    }

    /* renamed from: a */
    public void mo9046a(Intent intent, int i) {
        if (this.f7971a != null) {
            this.f7971a.startActivityForResult(intent, i);
        } else {
            this.f7972b.startActivityForResult(intent, i);
        }
    }

    /* renamed from: c */
    public final Activity mo9048c() {
        if (this.f7971a != null) {
            return this.f7971a.mo626m();
        }
        return this.f7972b.getActivity();
    }
}
