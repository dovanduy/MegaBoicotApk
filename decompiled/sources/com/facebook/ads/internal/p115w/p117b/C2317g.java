package com.facebook.ads.internal.p115w.p117b;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.facebook.ads.internal.p091r.C1795a;

/* renamed from: com.facebook.ads.internal.w.b.g */
public class C2317g {
    /* renamed from: a */
    public static void m9038a(final OnClickListener onClickListener, final OnClickListener onClickListener2, Context context) {
        if (context == null || !(context instanceof Activity)) {
            onClickListener.onClick(null, 0);
        } else {
            new Builder(context).setTitle(C1795a.m7447f(context)).setMessage(C1795a.m7448g(context)).setPositiveButton(C1795a.m7449h(context), new OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    onClickListener.onClick(dialogInterface, i);
                }
            }).setNegativeButton(C1795a.m7450i(context), new OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    onClickListener2.onClick(dialogInterface, i);
                }
            }).show();
        }
    }
}
