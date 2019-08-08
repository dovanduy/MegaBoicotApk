package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.webkit.JsResult;

/* renamed from: com.google.android.gms.internal.ads.px */
final class C4081px implements OnCancelListener {

    /* renamed from: a */
    private final /* synthetic */ JsResult f13807a;

    C4081px(JsResult jsResult) {
        this.f13807a = jsResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f13807a.cancel();
    }
}
