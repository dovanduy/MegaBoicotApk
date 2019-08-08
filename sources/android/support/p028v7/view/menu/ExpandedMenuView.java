package android.support.p028v7.view.menu;

import android.content.Context;
import android.support.p028v7.view.menu.C0790h.C0792b;
import android.support.p028v7.widget.C0977ay;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

/* renamed from: android.support.v7.view.menu.ExpandedMenuView */
public final class ExpandedMenuView extends ListView implements C0792b, C0808p, OnItemClickListener {

    /* renamed from: a */
    private static final int[] f2234a = {16842964, 16843049};

    /* renamed from: b */
    private C0790h f2235b;

    /* renamed from: c */
    private int f2236c;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0977ay a = C0977ay.m4367a(context, attributeSet, f2234a, i, 0);
        if (a.mo5100g(0)) {
            setBackgroundDrawable(a.mo5086a(0));
        }
        if (a.mo5100g(1)) {
            setDivider(a.mo5086a(1));
        }
        a.mo5087a();
    }

    /* renamed from: a */
    public void mo3039a(C0790h hVar) {
        this.f2235b = hVar;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    /* renamed from: a */
    public boolean mo3040a(C0794j jVar) {
        return this.f2235b.mo3172a((MenuItem) jVar, 0);
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo3040a((C0794j) getAdapter().getItem(i));
    }

    public int getWindowAnimations() {
        return this.f2236c;
    }
}
