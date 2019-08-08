package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsResult;

/* renamed from: com.google.android.gms.internal.ads.pz */
final class C4083pz implements OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ JsResult f13809a;

    C4083pz(JsResult jsResult) {
        this.f13809a = jsResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f13809a.confirm();
    }
}
