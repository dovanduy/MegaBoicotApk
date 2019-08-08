package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsPromptResult;

/* renamed from: com.google.android.gms.internal.ads.qb */
final class C4086qb implements OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ JsPromptResult f13811a;

    C4086qb(JsPromptResult jsPromptResult) {
        this.f13811a = jsPromptResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f13811a.cancel();
    }
}
