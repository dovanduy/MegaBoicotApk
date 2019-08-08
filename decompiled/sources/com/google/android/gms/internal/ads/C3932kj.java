package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: com.google.android.gms.internal.ads.kj */
final /* synthetic */ class C3932kj implements OnClickListener {

    /* renamed from: a */
    private final C3930kh f13449a;

    /* renamed from: b */
    private final int f13450b;

    /* renamed from: c */
    private final int f13451c;

    /* renamed from: d */
    private final int f13452d;

    C3932kj(C3930kh khVar, int i, int i2, int i3) {
        this.f13449a = khVar;
        this.f13450b = i;
        this.f13451c = i2;
        this.f13452d = i3;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f13449a.mo15561a(this.f13450b, this.f13451c, this.f13452d, dialogInterface, i);
    }
}
