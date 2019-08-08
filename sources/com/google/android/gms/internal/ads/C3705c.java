package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: com.google.android.gms.internal.ads.c */
final class C3705c implements OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ bec f12781a;

    C3705c(bec bec) {
        this.f12781a = bec;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f12781a.mo15652a("Operation denied by user.");
    }
}
