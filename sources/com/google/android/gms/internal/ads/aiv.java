package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import java.lang.reflect.InvocationTargetException;

public final class aiv extends aiy {

    /* renamed from: d */
    private final View f11154d;

    public aiv(ahn ahn, String str, String str2, C4378zo zoVar, int i, int i2, View view) {
        super(ahn, str, str2, zoVar, i, 57);
        this.f11154d = view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14345a() throws IllegalAccessException, InvocationTargetException {
        if (this.f11154d != null) {
            DisplayMetrics displayMetrics = this.f11164a.mo14301a().getResources().getDisplayMetrics();
            ahw ahw = new ahw((String) this.f11166c.invoke(null, new Object[]{this.f11154d, displayMetrics}));
            abq abq = new abq();
            abq.f10456a = ahw.f11102a;
            abq.f10457b = ahw.f11103b;
            abq.f10458c = ahw.f11104c;
            this.f11165b.f14298M = abq;
        }
    }
}
