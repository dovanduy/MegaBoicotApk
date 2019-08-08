package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.C3718cm;
import com.google.android.gms.internal.ads.C4089qe;

@C3718cm
/* renamed from: com.google.android.gms.ads.internal.overlay.h */
public final class C3112h {

    /* renamed from: a */
    public final int f9104a;

    /* renamed from: b */
    public final LayoutParams f9105b;

    /* renamed from: c */
    public final ViewGroup f9106c;

    /* renamed from: d */
    public final Context f9107d;

    public C3112h(C4089qe qeVar) throws C3110f {
        this.f9105b = qeVar.getLayoutParams();
        ViewParent parent = qeVar.getParent();
        this.f9107d = qeVar.mo15908q();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new C3110f("Could not get the parent of the WebView for an overlay.");
        }
        this.f9106c = (ViewGroup) parent;
        this.f9104a = this.f9106c.indexOfChild(qeVar.getView());
        this.f9106c.removeView(qeVar.getView());
        qeVar.mo15885b(true);
    }
}
