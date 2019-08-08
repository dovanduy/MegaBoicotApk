package android.support.p017v4.widget;

import android.os.Build.VERSION;
import android.widget.EdgeEffect;

/* renamed from: android.support.v4.widget.i */
/* compiled from: EdgeEffectCompat */
public final class C0654i {
    /* renamed from: a */
    public static void m2595a(EdgeEffect edgeEffect, float f, float f2) {
        if (VERSION.SDK_INT >= 21) {
            edgeEffect.onPull(f, f2);
        } else {
            edgeEffect.onPull(f);
        }
    }
}
