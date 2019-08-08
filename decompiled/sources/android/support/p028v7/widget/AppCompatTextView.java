package android.support.p028v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p017v4.p021c.C0333a;
import android.support.p017v4.p021c.C0333a.C0334a;
import android.support.p017v4.view.C0594q;
import android.support.p017v4.widget.C0640b;
import android.support.p017v4.widget.C0663p;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: android.support.v7.widget.AppCompatTextView */
public class AppCompatTextView extends TextView implements C0594q, C0640b {

    /* renamed from: b */
    private final C1005e f2636b;

    /* renamed from: c */
    private final C1017l f2637c;

    /* renamed from: d */
    private Future<C0333a> f2638d;

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(C0974av.m4362a(context), attributeSet, i);
        this.f2636b = new C1005e(this);
        this.f2636b.mo5226a(attributeSet, i);
        this.f2637c = new C1017l(this);
        this.f2637c.mo5265a(attributeSet, i);
        this.f2637c.mo5260a();
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f2636b != null) {
            this.f2636b.mo5222a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f2636b != null) {
            this.f2636b.mo5225a(drawable);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f2636b != null) {
            this.f2636b.mo5223a(colorStateList);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (this.f2636b != null) {
            return this.f2636b.mo5221a();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        if (this.f2636b != null) {
            this.f2636b.mo5224a(mode);
        }
    }

    public Mode getSupportBackgroundTintMode() {
        if (this.f2636b != null) {
            return this.f2636b.mo5227b();
        }
        return null;
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f2637c != null) {
            this.f2637c.mo5264a(context, i);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f2636b != null) {
            this.f2636b.mo5229c();
        }
        if (this.f2637c != null) {
            this.f2637c.mo5260a();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f2637c != null) {
            this.f2637c.mo5268a(z, i, i2, i3, i4);
        }
    }

    public void setTextSize(int i, float f) {
        if (f1673a) {
            super.setTextSize(i, f);
        } else if (this.f2637c != null) {
            this.f2637c.mo5262a(i, f);
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.f2637c != null && !f1673a && this.f2637c.mo5271c()) {
            this.f2637c.mo5270b();
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (f1673a) {
            super.setAutoSizeTextTypeWithDefaults(i);
        } else if (this.f2637c != null) {
            this.f2637c.mo5261a(i);
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (f1673a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        } else if (this.f2637c != null) {
            this.f2637c.mo5263a(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) throws IllegalArgumentException {
        if (f1673a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        } else if (this.f2637c != null) {
            this.f2637c.mo5269a(iArr, i);
        }
    }

    public int getAutoSizeTextType() {
        int i = 0;
        if (f1673a) {
            if (super.getAutoSizeTextType() == 1) {
                i = 1;
            }
            return i;
        } else if (this.f2637c != null) {
            return this.f2637c.mo5272d();
        } else {
            return 0;
        }
    }

    public int getAutoSizeStepGranularity() {
        if (f1673a) {
            return super.getAutoSizeStepGranularity();
        }
        if (this.f2637c != null) {
            return this.f2637c.mo5273e();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (f1673a) {
            return super.getAutoSizeMinTextSize();
        }
        if (this.f2637c != null) {
            return this.f2637c.mo5274f();
        }
        return -1;
    }

    public int getAutoSizeMaxTextSize() {
        if (f1673a) {
            return super.getAutoSizeMaxTextSize();
        }
        if (this.f2637c != null) {
            return this.f2637c.mo5275g();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (f1673a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        if (this.f2637c != null) {
            return this.f2637c.mo5276h();
        }
        return new int[0];
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C1013h.m4599a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setFirstBaselineToTopHeight(int i) {
        if (VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            C0663p.m2626b(this, i);
        }
    }

    public void setLastBaselineToBottomHeight(int i) {
        if (VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            C0663p.m2628c(this, i);
        }
    }

    public int getFirstBaselineToTopHeight() {
        return C0663p.m2620a((TextView) this);
    }

    public int getLastBaselineToBottomHeight() {
        return C0663p.m2625b(this);
    }

    public void setLineHeight(int i) {
        C0663p.m2630d(this, i);
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(C0663p.m2621a((TextView) this, callback));
    }

    public C0334a getTextMetricsParamsCompat() {
        return C0663p.m2627c(this);
    }

    public void setTextMetricsParamsCompat(C0334a aVar) {
        C0663p.m2623a((TextView) this, aVar);
    }

    public void setPrecomputedText(C0333a aVar) {
        C0663p.m2624a((TextView) this, aVar);
    }

    /* renamed from: a */
    private void mo3018a() {
        if (this.f2638d != null) {
            try {
                Future<C0333a> future = this.f2638d;
                this.f2638d = null;
                C0663p.m2624a((TextView) this, (C0333a) future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    public CharSequence getText() {
        mo3018a();
        return super.getText();
    }

    public void setTextFuture(Future<C0333a> future) {
        this.f2638d = future;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        mo3018a();
        super.onMeasure(i, i2);
    }
}
