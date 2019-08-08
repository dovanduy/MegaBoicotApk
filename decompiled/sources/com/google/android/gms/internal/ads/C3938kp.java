package com.google.android.gms.internal.ads;

import android.app.AlertDialog.Builder;
import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.kp */
final class C3938kp implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f13463a;

    /* renamed from: b */
    private final /* synthetic */ String f13464b;

    /* renamed from: c */
    private final /* synthetic */ boolean f13465c;

    /* renamed from: d */
    private final /* synthetic */ boolean f13466d;

    C3938kp(C3937ko koVar, Context context, String str, boolean z, boolean z2) {
        this.f13463a = context;
        this.f13464b = str;
        this.f13465c = z;
        this.f13466d = z2;
    }

    public final void run() {
        Builder builder = new Builder(this.f13463a);
        builder.setMessage(this.f13464b);
        builder.setTitle(this.f13465c ? "Error" : "Info");
        if (this.f13466d) {
            builder.setNeutralButton("Dismiss", null);
        } else {
            builder.setPositiveButton("Learn More", new C3939kq(this));
            builder.setNegativeButton("Dismiss", null);
        }
        builder.create().show();
    }
}
