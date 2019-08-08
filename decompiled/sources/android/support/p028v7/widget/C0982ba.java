package android.support.p028v7.widget;

import android.os.Build.VERSION;
import android.view.View;

/* renamed from: android.support.v7.widget.ba */
/* compiled from: TooltipCompat */
public class C0982ba {
    /* renamed from: a */
    public static void m4432a(View view, CharSequence charSequence) {
        if (VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        } else {
            C0983bb.m4434a(view, charSequence);
        }
    }
}
