package android.support.p028v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.p017v4.view.C0594q;
import android.support.p028v7.p029a.C0672a.C0673a;
import android.support.p028v7.p031c.p032a.C0740a;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

/* renamed from: android.support.v7.widget.AppCompatMultiAutoCompleteTextView */
public class AppCompatMultiAutoCompleteTextView extends MultiAutoCompleteTextView implements C0594q {

    /* renamed from: a */
    private static final int[] f2605a = {16843126};

    /* renamed from: b */
    private final C1005e f2606b;

    /* renamed from: c */
    private final C1017l f2607c;

    public AppCompatMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0673a.autoCompleteTextViewStyle);
    }

    public AppCompatMultiAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(C0974av.m4362a(context), attributeSet, i);
        C0977ay a = C0977ay.m4367a(getContext(), attributeSet, f2605a, i, 0);
        if (a.mo5100g(0)) {
            setDropDownBackgroundDrawable(a.mo5086a(0));
        }
        a.mo5087a();
        this.f2606b = new C1005e(this);
        this.f2606b.mo5226a(attributeSet, i);
        this.f2607c = new C1017l(this);
        this.f2607c.mo5265a(attributeSet, i);
        this.f2607c.mo5260a();
    }

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C0740a.m3008b(getContext(), i));
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f2606b != null) {
            this.f2606b.mo5222a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f2606b != null) {
            this.f2606b.mo5225a(drawable);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f2606b != null) {
            this.f2606b.mo5223a(colorStateList);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (this.f2606b != null) {
            return this.f2606b.mo5221a();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        if (this.f2606b != null) {
            this.f2606b.mo5224a(mode);
        }
    }

    public Mode getSupportBackgroundTintMode() {
        if (this.f2606b != null) {
            return this.f2606b.mo5227b();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f2606b != null) {
            this.f2606b.mo5229c();
        }
        if (this.f2607c != null) {
            this.f2607c.mo5260a();
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f2607c != null) {
            this.f2607c.mo5264a(context, i);
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C1013h.m4599a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }
}
