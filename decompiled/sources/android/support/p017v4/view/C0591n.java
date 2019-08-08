package android.support.p017v4.view;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v4.view.n */
/* compiled from: NestedScrollingParentHelper */
public class C0591n {

    /* renamed from: a */
    private final ViewGroup f1431a;

    /* renamed from: b */
    private int f1432b;

    public C0591n(ViewGroup viewGroup) {
        this.f1431a = viewGroup;
    }

    /* renamed from: a */
    public void mo2086a(View view, View view2, int i) {
        mo2087a(view, view2, i, 0);
    }

    /* renamed from: a */
    public void mo2087a(View view, View view2, int i, int i2) {
        this.f1432b = i;
    }

    /* renamed from: a */
    public int mo2083a() {
        return this.f1432b;
    }

    /* renamed from: a */
    public void mo2084a(View view) {
        mo2085a(view, 0);
    }

    /* renamed from: a */
    public void mo2085a(View view, int i) {
        this.f1432b = 0;
    }
}
