package android.support.p028v7.widget;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p017v4.graphics.drawable.C0407a;
import android.support.p017v4.widget.C0647e;
import android.support.p028v7.p029a.C0672a.C0682j;
import android.support.p028v7.p031c.p032a.C0740a;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* renamed from: android.support.v7.widget.f */
/* compiled from: AppCompatCompoundButtonHelper */
class C1006f {

    /* renamed from: a */
    private final CompoundButton f3328a;

    /* renamed from: b */
    private ColorStateList f3329b = null;

    /* renamed from: c */
    private Mode f3330c = null;

    /* renamed from: d */
    private boolean f3331d = false;

    /* renamed from: e */
    private boolean f3332e = false;

    /* renamed from: f */
    private boolean f3333f;

    C1006f(CompoundButton compoundButton) {
        this.f3328a = compoundButton;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5234a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f3328a.getContext().obtainStyledAttributes(attributeSet, C0682j.CompoundButton, i, 0);
        try {
            if (obtainStyledAttributes.hasValue(C0682j.CompoundButton_android_button)) {
                int resourceId = obtainStyledAttributes.getResourceId(C0682j.CompoundButton_android_button, 0);
                if (resourceId != 0) {
                    this.f3328a.setButtonDrawable(C0740a.m3008b(this.f3328a.getContext(), resourceId));
                }
            }
            if (obtainStyledAttributes.hasValue(C0682j.CompoundButton_buttonTint)) {
                C0647e.m2570a(this.f3328a, obtainStyledAttributes.getColorStateList(C0682j.CompoundButton_buttonTint));
            }
            if (obtainStyledAttributes.hasValue(C0682j.CompoundButton_buttonTintMode)) {
                C0647e.m2571a(this.f3328a, C1043w.m4824a(obtainStyledAttributes.getInt(C0682j.CompoundButton_buttonTintMode, -1), null));
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5232a(ColorStateList colorStateList) {
        this.f3329b = colorStateList;
        this.f3331d = true;
        mo5237d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public ColorStateList mo5231a() {
        return this.f3329b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5233a(Mode mode) {
        this.f3330c = mode;
        this.f3332e = true;
        mo5237d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public Mode mo5235b() {
        return this.f3330c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo5236c() {
        if (this.f3333f) {
            this.f3333f = false;
            return;
        }
        this.f3333f = true;
        mo5237d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo5237d() {
        Drawable a = C0647e.m2569a(this.f3328a);
        if (a == null) {
            return;
        }
        if (this.f3331d || this.f3332e) {
            Drawable mutate = C0407a.m1550f(a).mutate();
            if (this.f3331d) {
                C0407a.m1540a(mutate, this.f3329b);
            }
            if (this.f3332e) {
                C0407a.m1543a(mutate, this.f3330c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f3328a.getDrawableState());
            }
            this.f3328a.setButtonDrawable(mutate);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo5230a(int i) {
        if (VERSION.SDK_INT >= 17) {
            return i;
        }
        Drawable a = C0647e.m2569a(this.f3328a);
        return a != null ? i + a.getIntrinsicWidth() : i;
    }
}
