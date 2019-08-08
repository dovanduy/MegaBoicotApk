package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsPromptResult;
import android.widget.EditText;

/* renamed from: com.google.android.gms.internal.ads.qc */
final class C4087qc implements OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ JsPromptResult f13812a;

    /* renamed from: b */
    private final /* synthetic */ EditText f13813b;

    C4087qc(JsPromptResult jsPromptResult, EditText editText) {
        this.f13812a = jsPromptResult;
        this.f13813b = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f13812a.confirm(this.f13813b.getText().toString());
    }
}
