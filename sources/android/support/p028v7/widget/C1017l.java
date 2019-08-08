package android.support.p028v7.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p017v4.content.p022a.C0350f.C0351a;
import android.support.p017v4.widget.C0640b;
import android.support.p017v4.widget.C0663p;
import android.support.p028v7.p029a.C0672a.C0682j;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.widget.l */
/* compiled from: AppCompatTextHelper */
class C1017l {

    /* renamed from: a */
    private final TextView f3362a;

    /* renamed from: b */
    private C0975aw f3363b;

    /* renamed from: c */
    private C0975aw f3364c;

    /* renamed from: d */
    private C0975aw f3365d;

    /* renamed from: e */
    private C0975aw f3366e;

    /* renamed from: f */
    private C0975aw f3367f;

    /* renamed from: g */
    private C0975aw f3368g;

    /* renamed from: h */
    private final C1019m f3369h;

    /* renamed from: i */
    private int f3370i = 0;

    /* renamed from: j */
    private Typeface f3371j;

    /* renamed from: k */
    private boolean f3372k;

    C1017l(TextView textView) {
        this.f3362a = textView;
        this.f3369h = new C1019m(this.f3362a);
    }

    /* access modifiers changed from: 0000 */
    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public void mo5265a(AttributeSet attributeSet, int i) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        boolean z;
        boolean z2;
        AttributeSet attributeSet2 = attributeSet;
        int i2 = i;
        Context context = this.f3362a.getContext();
        C1007g a = C1007g.m4568a();
        C0977ay a2 = C0977ay.m4367a(context, attributeSet2, C0682j.AppCompatTextHelper, i2, 0);
        int g = a2.mo5099g(C0682j.AppCompatTextHelper_android_textAppearance, -1);
        if (a2.mo5100g(C0682j.AppCompatTextHelper_android_drawableLeft)) {
            this.f3363b = m4621a(context, a, a2.mo5099g(C0682j.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (a2.mo5100g(C0682j.AppCompatTextHelper_android_drawableTop)) {
            this.f3364c = m4621a(context, a, a2.mo5099g(C0682j.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (a2.mo5100g(C0682j.AppCompatTextHelper_android_drawableRight)) {
            this.f3365d = m4621a(context, a, a2.mo5099g(C0682j.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (a2.mo5100g(C0682j.AppCompatTextHelper_android_drawableBottom)) {
            this.f3366e = m4621a(context, a, a2.mo5099g(C0682j.AppCompatTextHelper_android_drawableBottom, 0));
        }
        if (VERSION.SDK_INT >= 17) {
            if (a2.mo5100g(C0682j.AppCompatTextHelper_android_drawableStart)) {
                this.f3367f = m4621a(context, a, a2.mo5099g(C0682j.AppCompatTextHelper_android_drawableStart, 0));
            }
            if (a2.mo5100g(C0682j.AppCompatTextHelper_android_drawableEnd)) {
                this.f3368g = m4621a(context, a, a2.mo5099g(C0682j.AppCompatTextHelper_android_drawableEnd, 0));
            }
        }
        a2.mo5087a();
        boolean z3 = this.f3362a.getTransformationMethod() instanceof PasswordTransformationMethod;
        ColorStateList colorStateList3 = null;
        if (g != -1) {
            C0977ay a3 = C0977ay.m4365a(context, g, C0682j.TextAppearance);
            if (z3 || !a3.mo5100g(C0682j.TextAppearance_textAllCaps)) {
                z2 = false;
                z = false;
            } else {
                z = a3.mo5088a(C0682j.TextAppearance_textAllCaps, false);
                z2 = true;
            }
            m4622a(context, a3);
            if (VERSION.SDK_INT < 23) {
                ColorStateList e = a3.mo5100g(C0682j.TextAppearance_android_textColor) ? a3.mo5096e(C0682j.TextAppearance_android_textColor) : null;
                colorStateList = a3.mo5100g(C0682j.TextAppearance_android_textColorHint) ? a3.mo5096e(C0682j.TextAppearance_android_textColorHint) : null;
                if (a3.mo5100g(C0682j.TextAppearance_android_textColorLink)) {
                    colorStateList3 = a3.mo5096e(C0682j.TextAppearance_android_textColorLink);
                }
                ColorStateList colorStateList4 = e;
                colorStateList2 = colorStateList3;
                colorStateList3 = colorStateList4;
            } else {
                colorStateList2 = null;
                colorStateList = null;
            }
            a3.mo5087a();
        } else {
            z2 = false;
            z = false;
            colorStateList2 = null;
            colorStateList = null;
        }
        C0977ay a4 = C0977ay.m4367a(context, attributeSet2, C0682j.TextAppearance, i2, 0);
        if (!z3 && a4.mo5100g(C0682j.TextAppearance_textAllCaps)) {
            z = a4.mo5088a(C0682j.TextAppearance_textAllCaps, false);
            z2 = true;
        }
        if (VERSION.SDK_INT < 23) {
            if (a4.mo5100g(C0682j.TextAppearance_android_textColor)) {
                colorStateList3 = a4.mo5096e(C0682j.TextAppearance_android_textColor);
            }
            if (a4.mo5100g(C0682j.TextAppearance_android_textColorHint)) {
                colorStateList = a4.mo5096e(C0682j.TextAppearance_android_textColorHint);
            }
            if (a4.mo5100g(C0682j.TextAppearance_android_textColorLink)) {
                colorStateList2 = a4.mo5096e(C0682j.TextAppearance_android_textColorLink);
            }
        }
        if (VERSION.SDK_INT >= 28 && a4.mo5100g(C0682j.TextAppearance_android_textSize) && a4.mo5095e(C0682j.TextAppearance_android_textSize, -1) == 0) {
            this.f3362a.setTextSize(0, 0.0f);
        }
        m4622a(context, a4);
        a4.mo5087a();
        if (colorStateList3 != null) {
            this.f3362a.setTextColor(colorStateList3);
        }
        if (colorStateList != null) {
            this.f3362a.setHintTextColor(colorStateList);
        }
        if (colorStateList2 != null) {
            this.f3362a.setLinkTextColor(colorStateList2);
        }
        if (!z3 && z2) {
            mo5267a(z);
        }
        if (this.f3371j != null) {
            this.f3362a.setTypeface(this.f3371j, this.f3370i);
        }
        this.f3369h.mo5281a(attributeSet2, i2);
        if (C0640b.f1673a && this.f3369h.mo5277a() != 0) {
            int[] e2 = this.f3369h.mo5286e();
            if (e2.length > 0) {
                if (((float) this.f3362a.getAutoSizeStepGranularity()) != -1.0f) {
                    this.f3362a.setAutoSizeTextTypeUniformWithConfiguration(this.f3369h.mo5284c(), this.f3369h.mo5285d(), this.f3369h.mo5283b(), 0);
                } else {
                    this.f3362a.setAutoSizeTextTypeUniformWithPresetSizes(e2, 0);
                }
            }
        }
        C0977ay a5 = C0977ay.m4366a(context, attributeSet2, C0682j.AppCompatTextView);
        int e3 = a5.mo5095e(C0682j.AppCompatTextView_firstBaselineToTopHeight, -1);
        int e4 = a5.mo5095e(C0682j.AppCompatTextView_lastBaselineToBottomHeight, -1);
        int e5 = a5.mo5095e(C0682j.AppCompatTextView_lineHeight, -1);
        a5.mo5087a();
        if (e3 != -1) {
            C0663p.m2626b(this.f3362a, e3);
        }
        if (e4 != -1) {
            C0663p.m2628c(this.f3362a, e4);
        }
        if (e5 != -1) {
            C0663p.m2630d(this.f3362a, e5);
        }
    }

    /* renamed from: a */
    private void m4622a(Context context, C0977ay ayVar) {
        this.f3370i = ayVar.mo5084a(C0682j.TextAppearance_android_textStyle, this.f3370i);
        boolean z = true;
        if (ayVar.mo5100g(C0682j.TextAppearance_android_fontFamily) || ayVar.mo5100g(C0682j.TextAppearance_fontFamily)) {
            this.f3371j = null;
            int i = ayVar.mo5100g(C0682j.TextAppearance_fontFamily) ? C0682j.TextAppearance_fontFamily : C0682j.TextAppearance_android_fontFamily;
            if (!context.isRestricted()) {
                final WeakReference weakReference = new WeakReference(this.f3362a);
                try {
                    this.f3371j = ayVar.mo5085a(i, this.f3370i, (C0351a) new C0351a() {
                        /* renamed from: a */
                        public void mo1213a(int i) {
                        }

                        /* renamed from: a */
                        public void mo1215a(Typeface typeface) {
                            C1017l.this.mo5266a(weakReference, typeface);
                        }
                    });
                    if (this.f3371j != null) {
                        z = false;
                    }
                    this.f3372k = z;
                } catch (NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f3371j == null) {
                String d = ayVar.mo5094d(i);
                if (d != null) {
                    this.f3371j = Typeface.create(d, this.f3370i);
                }
            }
            return;
        }
        if (ayVar.mo5100g(C0682j.TextAppearance_android_typeface)) {
            this.f3372k = false;
            switch (ayVar.mo5084a(C0682j.TextAppearance_android_typeface, 1)) {
                case 1:
                    this.f3371j = Typeface.SANS_SERIF;
                    break;
                case 2:
                    this.f3371j = Typeface.SERIF;
                    break;
                case 3:
                    this.f3371j = Typeface.MONOSPACE;
                    break;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5266a(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f3372k) {
            this.f3371j = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                textView.setTypeface(typeface, this.f3370i);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5264a(Context context, int i) {
        C0977ay a = C0977ay.m4365a(context, i, C0682j.TextAppearance);
        if (a.mo5100g(C0682j.TextAppearance_textAllCaps)) {
            mo5267a(a.mo5088a(C0682j.TextAppearance_textAllCaps, false));
        }
        if (VERSION.SDK_INT < 23 && a.mo5100g(C0682j.TextAppearance_android_textColor)) {
            ColorStateList e = a.mo5096e(C0682j.TextAppearance_android_textColor);
            if (e != null) {
                this.f3362a.setTextColor(e);
            }
        }
        if (a.mo5100g(C0682j.TextAppearance_android_textSize) && a.mo5095e(C0682j.TextAppearance_android_textSize, -1) == 0) {
            this.f3362a.setTextSize(0, 0.0f);
        }
        m4622a(context, a);
        a.mo5087a();
        if (this.f3371j != null) {
            this.f3362a.setTypeface(this.f3371j, this.f3370i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5267a(boolean z) {
        this.f3362a.setAllCaps(z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5260a() {
        if (!(this.f3363b == null && this.f3364c == null && this.f3365d == null && this.f3366e == null)) {
            Drawable[] compoundDrawables = this.f3362a.getCompoundDrawables();
            m4623a(compoundDrawables[0], this.f3363b);
            m4623a(compoundDrawables[1], this.f3364c);
            m4623a(compoundDrawables[2], this.f3365d);
            m4623a(compoundDrawables[3], this.f3366e);
        }
        if (VERSION.SDK_INT < 17) {
            return;
        }
        if (this.f3367f != null || this.f3368g != null) {
            Drawable[] compoundDrawablesRelative = this.f3362a.getCompoundDrawablesRelative();
            m4623a(compoundDrawablesRelative[0], this.f3367f);
            m4623a(compoundDrawablesRelative[2], this.f3368g);
        }
    }

    /* renamed from: a */
    private void m4623a(Drawable drawable, C0975aw awVar) {
        if (drawable != null && awVar != null) {
            C1007g.m4571a(drawable, awVar, this.f3362a.getDrawableState());
        }
    }

    /* renamed from: a */
    private static C0975aw m4621a(Context context, C1007g gVar, int i) {
        ColorStateList b = gVar.mo5242b(context, i);
        if (b == null) {
            return null;
        }
        C0975aw awVar = new C0975aw();
        awVar.f3224d = true;
        awVar.f3221a = b;
        return awVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5268a(boolean z, int i, int i2, int i3, int i4) {
        if (!C0640b.f1673a) {
            mo5270b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5262a(int i, float f) {
        if (!C0640b.f1673a && !mo5271c()) {
            m4624b(i, f);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo5270b() {
        this.f3369h.mo5287f();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo5271c() {
        return this.f3369h.mo5288g();
    }

    /* renamed from: b */
    private void m4624b(int i, float f) {
        this.f3369h.mo5279a(i, f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5261a(int i) {
        this.f3369h.mo5278a(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5263a(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        this.f3369h.mo5280a(i, i2, i3, i4);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5269a(int[] iArr, int i) throws IllegalArgumentException {
        this.f3369h.mo5282a(iArr, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo5272d() {
        return this.f3369h.mo5277a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo5273e() {
        return this.f3369h.mo5283b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public int mo5274f() {
        return this.f3369h.mo5284c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public int mo5275g() {
        return this.f3369h.mo5285d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public int[] mo5276h() {
        return this.f3369h.mo5286e();
    }
}
