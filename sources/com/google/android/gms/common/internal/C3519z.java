package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* renamed from: com.google.android.gms.common.internal.z */
final class C3519z extends C3486g {

    /* renamed from: a */
    private final /* synthetic */ Intent f10084a;

    /* renamed from: b */
    private final /* synthetic */ Activity f10085b;

    /* renamed from: c */
    private final /* synthetic */ int f10086c;

    C3519z(Intent intent, Activity activity, int i) {
        this.f10084a = intent;
        this.f10085b = activity;
        this.f10086c = i;
    }

    /* renamed from: a */
    public final void mo13482a() {
        if (this.f10084a != null) {
            this.f10085b.startActivityForResult(this.f10084a, this.f10086c);
        }
    }
}
