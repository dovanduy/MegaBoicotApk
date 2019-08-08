package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsResult;

/* renamed from: com.google.android.gms.internal.ads.py */
final class C4082py implements OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ JsResult f13808a;

    C4082py(JsResult jsResult) {
        this.f13808a = jsResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f13808a.cancel();
    }
}
