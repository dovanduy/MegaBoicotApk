package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.C3368h;

/* renamed from: com.google.android.gms.common.internal.aa */
final class C3440aa extends C3486g {

    /* renamed from: a */
    private final /* synthetic */ Intent f9956a;

    /* renamed from: b */
    private final /* synthetic */ C3368h f9957b;

    /* renamed from: c */
    private final /* synthetic */ int f9958c;

    C3440aa(Intent intent, C3368h hVar, int i) {
        this.f9956a = intent;
        this.f9957b = hVar;
        this.f9958c = i;
    }

    /* renamed from: a */
    public final void mo13482a() {
        if (this.f9956a != null) {
            this.f9957b.startActivityForResult(this.f9956a, this.f9958c);
        }
    }
}
