package android.support.p028v7.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.p017v4.widget.C0658m;
import android.support.p028v7.p029a.C0672a.C0682j;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* renamed from: android.support.v7.widget.AppCompatPopupWindow */
class AppCompatPopupWindow extends PopupWindow {

    /* renamed from: a */
    private static final boolean f2608a = (VERSION.SDK_INT < 21);

    /* renamed from: b */
    private boolean f2609b;

    public AppCompatPopupWindow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m3588a(context, attributeSet, i, 0);
    }

    public AppCompatPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m3588a(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    private void m3588a(Context context, AttributeSet attributeSet, int i, int i2) {
        C0977ay a = C0977ay.m4367a(context, attributeSet, C0682j.PopupWindow, i, i2);
        if (a.mo5100g(C0682j.PopupWindow_overlapAnchor)) {
            m3589a(a.mo5088a(C0682j.PopupWindow_overlapAnchor, false));
        }
        setBackgroundDrawable(a.mo5086a(C0682j.PopupWindow_android_popupBackground));
        a.mo5087a();
    }

    public void showAsDropDown(View view, int i, int i2) {
        if (f2608a && this.f2609b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f2608a && this.f2609b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    public void update(View view, int i, int i2, int i3, int i4) {
        if (f2608a && this.f2609b) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }

    /* renamed from: a */
    private void m3589a(boolean z) {
        if (f2608a) {
            this.f2609b = z;
        } else {
            C0658m.m2607a((PopupWindow) this, z);
        }
    }
}
