package com.google.android.gms.common.api.internal;

import android.content.DialogInterface.OnCancelListener;
import com.google.android.gms.common.C3405c;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;

/* renamed from: com.google.android.gms.common.api.internal.ch */
final class C3343ch implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C3341cf f9677a;

    /* renamed from: b */
    private final C3342cg f9678b;

    C3343ch(C3341cf cfVar, C3342cg cgVar) {
        this.f9677a = cfVar;
        this.f9678b = cgVar;
    }

    public final void run() {
        if (this.f9677a.f9671b) {
            ConnectionResult b = this.f9678b.mo13286b();
            if (b.mo13041a()) {
                this.f9677a.f9525a.startActivityForResult(GoogleApiActivity.m11595a(this.f9677a.mo13170a(), b.mo13044d(), this.f9678b.mo13285a(), false), 1);
            } else if (this.f9677a.f9673d.mo13405a(b.mo13043c())) {
                this.f9677a.f9673d.mo13406a(this.f9677a.mo13170a(), this.f9677a.f9525a, b.mo13043c(), 2, this.f9677a);
            } else if (b.mo13043c() == 18) {
                this.f9677a.f9673d.mo13403a(this.f9677a.mo13170a().getApplicationContext(), (C3312bg) new C3344ci(this, C3405c.m12232a(this.f9677a.mo13170a(), (OnCancelListener) this.f9677a)));
            } else {
                this.f9677a.mo13277a(b, this.f9678b.mo13285a());
            }
        }
    }
}
