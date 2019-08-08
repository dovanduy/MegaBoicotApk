package com.google.android.gms.common;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.support.p017v4.app.C0250e;
import android.support.p017v4.app.C0254i;
import com.google.android.gms.common.internal.C3513t;

/* renamed from: com.google.android.gms.common.k */
public class C3522k extends C0250e {

    /* renamed from: ag */
    private Dialog f10090ag = null;

    /* renamed from: ah */
    private OnCancelListener f10091ah = null;

    /* renamed from: c */
    public Dialog mo831c(Bundle bundle) {
        if (this.f10090ag == null) {
            mo832c(false);
        }
        return this.f10090ag;
    }

    public void onCancel(DialogInterface dialogInterface) {
        if (this.f10091ah != null) {
            this.f10091ah.onCancel(dialogInterface);
        }
    }

    /* renamed from: a */
    public static C3522k m12651a(Dialog dialog, OnCancelListener onCancelListener) {
        C3522k kVar = new C3522k();
        Dialog dialog2 = (Dialog) C3513t.m12626a(dialog, (Object) "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        kVar.f10090ag = dialog2;
        if (onCancelListener != null) {
            kVar.f10091ah = onCancelListener;
        }
        return kVar;
    }

    /* renamed from: a */
    public void mo827a(C0254i iVar, String str) {
        super.mo827a(iVar, str);
    }
}
