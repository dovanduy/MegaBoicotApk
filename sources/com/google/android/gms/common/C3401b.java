package com.google.android.gms.common;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import com.google.android.gms.common.internal.C3513t;

/* renamed from: com.google.android.gms.common.b */
public class C3401b extends DialogFragment {

    /* renamed from: a */
    private Dialog f9835a = null;

    /* renamed from: b */
    private OnCancelListener f9836b = null;

    public Dialog onCreateDialog(Bundle bundle) {
        if (this.f9835a == null) {
            setShowsDialog(false);
        }
        return this.f9835a;
    }

    public void onCancel(DialogInterface dialogInterface) {
        if (this.f9836b != null) {
            this.f9836b.onCancel(dialogInterface);
        }
    }

    /* renamed from: a */
    public static C3401b m12219a(Dialog dialog, OnCancelListener onCancelListener) {
        C3401b bVar = new C3401b();
        Dialog dialog2 = (Dialog) C3513t.m12626a(dialog, (Object) "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        bVar.f9835a = dialog2;
        if (onCancelListener != null) {
            bVar.f9836b = onCancelListener;
        }
        return bVar;
    }

    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
