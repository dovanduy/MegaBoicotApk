package android.support.p028v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p017v4.view.C0594q;
import android.support.p017v4.widget.C0663p;
import android.support.p028v7.p029a.C0672a.C0673a;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.AppCompatEditText */
public class AppCompatEditText extends EditText implements C0594q {

    /* renamed from: a */
    private final C1005e f2599a;

    /* renamed from: b */
    private final C1017l f2600b;

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0673a.editTextStyle);
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet, int i) {
        super(C0974av.m4362a(context), attributeSet, i);
        this.f2599a = new C1005e(this);
        this.f2599a.mo5226a(attributeSet, i);
        this.f2600b = new C1017l(this);
        this.f2600b.mo5265a(attributeSet, i);
        this.f2600b.mo5260a();
    }

    public Editable getText() {
        if (VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f2599a != null) {
            this.f2599a.mo5222a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f2599a != null) {
            this.f2599a.mo5225a(drawable);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f2599a != null) {
            this.f2599a.mo5223a(colorStateList);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (this.f2599a != null) {
            return this.f2599a.mo5221a();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        if (this.f2599a != null) {
            this.f2599a.mo5224a(mode);
        }
    }

    public Mode getSupportBackgroundTintMode() {
        if (this.f2599a != null) {
            return this.f2599a.mo5227b();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f2599a != null) {
            this.f2599a.mo5229c();
        }
        if (this.f2600b != null) {
            this.f2600b.mo5260a();
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f2600b != null) {
            this.f2600b.mo5264a(context, i);
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C1013h.m4599a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(C0663p.m2621a((TextView) this, callback));
    }
}
