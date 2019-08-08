package android.support.p028v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p017v4.view.C0595r;
import android.support.p028v7.p029a.C0672a.C0682j;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: android.support.v7.widget.e */
/* compiled from: AppCompatBackgroundHelper */
class C1005e {

    /* renamed from: a */
    private final View f3322a;

    /* renamed from: b */
    private final C1007g f3323b;

    /* renamed from: c */
    private int f3324c = -1;

    /* renamed from: d */
    private C0975aw f3325d;

    /* renamed from: e */
    private C0975aw f3326e;

    /* renamed from: f */
    private C0975aw f3327f;

    C1005e(View view) {
        this.f3322a = view;
        this.f3323b = C1007g.m4568a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5226a(AttributeSet attributeSet, int i) {
        C0977ay a = C0977ay.m4367a(this.f3322a.getContext(), attributeSet, C0682j.ViewBackgroundHelper, i, 0);
        try {
            if (a.mo5100g(C0682j.ViewBackgroundHelper_android_background)) {
                this.f3324c = a.mo5099g(C0682j.ViewBackgroundHelper_android_background, -1);
                ColorStateList b = this.f3323b.mo5242b(this.f3322a.getContext(), this.f3324c);
                if (b != null) {
                    mo5228b(b);
                }
            }
            if (a.mo5100g(C0682j.ViewBackgroundHelper_backgroundTint)) {
                C0595r.m2236a(this.f3322a, a.mo5096e(C0682j.ViewBackgroundHelper_backgroundTint));
            }
            if (a.mo5100g(C0682j.ViewBackgroundHelper_backgroundTintMode)) {
                C0595r.m2238a(this.f3322a, C1043w.m4824a(a.mo5084a(C0682j.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
        } finally {
            a.mo5087a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5222a(int i) {
        this.f3324c = i;
        mo5228b(this.f3323b != null ? this.f3323b.mo5242b(this.f3322a.getContext(), i) : null);
        mo5229c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5225a(Drawable drawable) {
        this.f3324c = -1;
        mo5228b((ColorStateList) null);
        mo5229c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5223a(ColorStateList colorStateList) {
        if (this.f3326e == null) {
            this.f3326e = new C0975aw();
        }
        this.f3326e.f3221a = colorStateList;
        this.f3326e.f3224d = true;
        mo5229c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public ColorStateList mo5221a() {
        if (this.f3326e != null) {
            return this.f3326e.f3221a;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5224a(Mode mode) {
        if (this.f3326e == null) {
            this.f3326e = new C0975aw();
        }
        this.f3326e.f3222b = mode;
        this.f3326e.f3223c = true;
        mo5229c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public Mode mo5227b() {
        if (this.f3326e != null) {
            return this.f3326e.f3222b;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo5229c() {
        Drawable background = this.f3322a.getBackground();
        if (background != null && (!m4544d() || !m4543b(background))) {
            if (this.f3326e != null) {
                C1007g.m4571a(background, this.f3326e, this.f3322a.getDrawableState());
            } else if (this.f3325d != null) {
                C1007g.m4571a(background, this.f3325d, this.f3322a.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo5228b(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f3325d == null) {
                this.f3325d = new C0975aw();
            }
            this.f3325d.f3221a = colorStateList;
            this.f3325d.f3224d = true;
        } else {
            this.f3325d = null;
        }
        mo5229c();
    }

    /* renamed from: d */
    private boolean m4544d() {
        int i = VERSION.SDK_INT;
        boolean z = false;
        if (i <= 21) {
            return i == 21;
        }
        if (this.f3325d != null) {
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    private boolean m4543b(Drawable drawable) {
        if (this.f3327f == null) {
            this.f3327f = new C0975aw();
        }
        C0975aw awVar = this.f3327f;
        awVar.mo5082a();
        ColorStateList s = C0595r.m2270s(this.f3322a);
        if (s != null) {
            awVar.f3224d = true;
            awVar.f3221a = s;
        }
        Mode t = C0595r.m2271t(this.f3322a);
        if (t != null) {
            awVar.f3223c = true;
            awVar.f3222b = t;
        }
        if (!awVar.f3224d && !awVar.f3223c) {
            return false;
        }
        C1007g.m4571a(drawable, awVar, this.f3322a.getDrawableState());
        return true;
    }
}
