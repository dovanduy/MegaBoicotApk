package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.webkit.JsPromptResult;

/* renamed from: com.google.android.gms.internal.ads.qa */
final class C4085qa implements OnCancelListener {

    /* renamed from: a */
    private final /* synthetic */ JsPromptResult f13810a;

    C4085qa(JsPromptResult jsPromptResult) {
        this.f13810a = jsPromptResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f13810a.cancel();
    }
}
