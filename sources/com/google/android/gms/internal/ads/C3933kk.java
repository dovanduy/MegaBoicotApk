package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: com.google.android.gms.internal.ads.kk */
final /* synthetic */ class C3933kk implements OnClickListener {

    /* renamed from: a */
    private final C3930kh f13453a;

    /* renamed from: b */
    private final String f13454b;

    C3933kk(C3930kh khVar, String str) {
        this.f13453a = khVar;
        this.f13454b = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f13453a.mo15564a(this.f13454b, dialogInterface, i);
    }
}
