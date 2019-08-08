package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: com.google.android.gms.internal.ads.i */
final class C3868i implements OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ C3814g f13236a;

    C3868i(C3814g gVar) {
        this.f13236a = gVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f13236a.mo15652a("User canceled the download.");
    }
}
