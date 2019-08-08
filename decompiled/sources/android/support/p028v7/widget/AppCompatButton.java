package android.support.p028v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.p017v4.view.C0594q;
import android.support.p017v4.widget.C0640b;
import android.support.p017v4.widget.C0663p;
import android.support.p028v7.p029a.C0672a.C0673a;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.AppCompatButton */
public class AppCompatButton extends Button implements C0594q, C0640b {

    /* renamed from: b */
    private final C1005e f2594b;

    /* renamed from: c */
    private final C1017l f2595c;

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0673a.buttonStyle);
    }

    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(C0974av.m4362a(context), attributeSet, i);
        this.f2594b = new C1005e(this);
        this.f2594b.mo5226a(attributeSet, i);
        this.f2595c = new C1017l(this);
        this.f2595c.mo5265a(attributeSet, i);
        this.f2595c.mo5260a();
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f2594b != null) {
            this.f2594b.mo5222a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f2594b != null) {
            this.f2594b.mo5225a(drawable);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f2594b != null) {
            this.f2594b.mo5223a(colorStateList);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (this.f2594b != null) {
            return this.f2594b.mo5221a();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        if (this.f2594b != null) {
            this.f2594b.mo5224a(mode);
        }
    }

    public Mode getSupportBackgroundTintMode() {
        if (this.f2594b != null) {
            return this.f2594b.mo5227b();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f2594b != null) {
            this.f2594b.mo5229c();
        }
        if (this.f2595c != null) {
            this.f2595c.mo5260a();
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f2595c != null) {
            this.f2595c.mo5264a(context, i);
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f2595c != null) {
            this.f2595c.mo5268a(z, i, i2, i3, i4);
        }
    }

    public void setTextSize(int i, float f) {
        if (f1673a) {
            super.setTextSize(i, f);
        } else if (this.f2595c != null) {
            this.f2595c.mo5262a(i, f);
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.f2595c != null && !f1673a && this.f2595c.mo5271c()) {
            this.f2595c.mo5270b();
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (f1673a) {
            super.setAutoSizeTextTypeWithDefaults(i);
        } else if (this.f2595c != null) {
            this.f2595c.mo5261a(i);
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (f1673a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        } else if (this.f2595c != null) {
            this.f2595c.mo5263a(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) throws IllegalArgumentException {
        if (f1673a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        } else if (this.f2595c != null) {
            this.f2595c.mo5269a(iArr, i);
        }
    }

    public int getAutoSizeTextType() {
        int i = 0;
        if (f1673a) {
            if (super.getAutoSizeTextType() == 1) {
                i = 1;
            }
            return i;
        } else if (this.f2595c != null) {
            return this.f2595c.mo5272d();
        } else {
            return 0;
        }
    }

    public int getAutoSizeStepGranularity() {
        if (f1673a) {
            return super.getAutoSizeStepGranularity();
        }
        if (this.f2595c != null) {
            return this.f2595c.mo5273e();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (f1673a) {
            return super.getAutoSizeMinTextSize();
        }
        if (this.f2595c != null) {
            return this.f2595c.mo5274f();
        }
        return -1;
    }

    public int getAutoSizeMaxTextSize() {
        if (f1673a) {
            return super.getAutoSizeMaxTextSize();
        }
        if (this.f2595c != null) {
            return this.f2595c.mo5275g();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (f1673a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        if (this.f2595c != null) {
            return this.f2595c.mo5276h();
        }
        return new int[0];
    }

    public void setSupportAllCaps(boolean z) {
        if (this.f2595c != null) {
            this.f2595c.mo5267a(z);
        }
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(C0663p.m2621a((TextView) this, callback));
    }
}
