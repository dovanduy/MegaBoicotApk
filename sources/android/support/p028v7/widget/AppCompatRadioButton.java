package android.support.p028v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.p017v4.widget.C0665q;
import android.support.p028v7.p029a.C0672a.C0673a;
import android.support.p028v7.p031c.p032a.C0740a;
import android.util.AttributeSet;
import android.widget.RadioButton;

/* renamed from: android.support.v7.widget.AppCompatRadioButton */
public class AppCompatRadioButton extends RadioButton implements C0665q {

    /* renamed from: a */
    private final C1006f f2610a;

    /* renamed from: b */
    private final C1017l f2611b;

    public AppCompatRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0673a.radioButtonStyle);
    }

    public AppCompatRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(C0974av.m4362a(context), attributeSet, i);
        this.f2610a = new C1006f(this);
        this.f2610a.mo5234a(attributeSet, i);
        this.f2611b = new C1017l(this);
        this.f2611b.mo5265a(attributeSet, i);
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        if (this.f2610a != null) {
            this.f2610a.mo5236c();
        }
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(C0740a.m3008b(getContext(), i));
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        return this.f2610a != null ? this.f2610a.mo5230a(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        if (this.f2610a != null) {
            this.f2610a.mo5232a(colorStateList);
        }
    }

    public ColorStateList getSupportButtonTintList() {
        if (this.f2610a != null) {
            return this.f2610a.mo5231a();
        }
        return null;
    }

    public void setSupportButtonTintMode(Mode mode) {
        if (this.f2610a != null) {
            this.f2610a.mo5233a(mode);
        }
    }

    public Mode getSupportButtonTintMode() {
        if (this.f2610a != null) {
            return this.f2610a.mo5235b();
        }
        return null;
    }
}
