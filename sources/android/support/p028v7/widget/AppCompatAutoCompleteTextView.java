package android.support.p028v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.p017v4.view.C0594q;
import android.support.p017v4.widget.C0663p;
import android.support.p028v7.p029a.C0672a.C0673a;
import android.support.p028v7.p031c.p032a.C0740a;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.AppCompatAutoCompleteTextView */
public class AppCompatAutoCompleteTextView extends AutoCompleteTextView implements C0594q {

    /* renamed from: a */
    private static final int[] f2591a = {16843126};

    /* renamed from: b */
    private final C1005e f2592b;

    /* renamed from: c */
    private final C1017l f2593c;

    public AppCompatAutoCompleteTextView(Context context) {
        this(context, null);
    }

    public AppCompatAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0673a.autoCompleteTextViewStyle);
    }

    public AppCompatAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(C0974av.m4362a(context), attributeSet, i);
        C0977ay a = C0977ay.m4367a(getContext(), attributeSet, f2591a, i, 0);
        if (a.mo5100g(0)) {
            setDropDownBackgroundDrawable(a.mo5086a(0));
        }
        a.mo5087a();
        this.f2592b = new C1005e(this);
        this.f2592b.mo5226a(attributeSet, i);
        this.f2593c = new C1017l(this);
        this.f2593c.mo5265a(attributeSet, i);
        this.f2593c.mo5260a();
    }

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C0740a.m3008b(getContext(), i));
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f2592b != null) {
            this.f2592b.mo5222a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f2592b != null) {
            this.f2592b.mo5225a(drawable);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f2592b != null) {
            this.f2592b.mo5223a(colorStateList);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (this.f2592b != null) {
            return this.f2592b.mo5221a();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        if (this.f2592b != null) {
            this.f2592b.mo5224a(mode);
        }
    }

    public Mode getSupportBackgroundTintMode() {
        if (this.f2592b != null) {
            return this.f2592b.mo5227b();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f2592b != null) {
            this.f2592b.mo5229c();
        }
        if (this.f2593c != null) {
            this.f2593c.mo5260a();
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f2593c != null) {
            this.f2593c.mo5264a(context, i);
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C1013h.m4599a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(C0663p.m2621a((TextView) this, callback));
    }
}
