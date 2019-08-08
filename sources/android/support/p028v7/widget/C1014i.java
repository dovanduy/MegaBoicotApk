package android.support.p028v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.support.p017v4.widget.C0655j;
import android.support.p028v7.p029a.C0672a.C0682j;
import android.support.p028v7.p031c.p032a.C0740a;
import android.util.AttributeSet;
import android.widget.ImageView;

/* renamed from: android.support.v7.widget.i */
/* compiled from: AppCompatImageHelper */
public class C1014i {

    /* renamed from: a */
    private final ImageView f3349a;

    /* renamed from: b */
    private C0975aw f3350b;

    /* renamed from: c */
    private C0975aw f3351c;

    /* renamed from: d */
    private C0975aw f3352d;

    public C1014i(ImageView imageView) {
        this.f3349a = imageView;
    }

    /* renamed from: a */
    public void mo5249a(AttributeSet attributeSet, int i) {
        C0977ay a = C0977ay.m4367a(this.f3349a.getContext(), attributeSet, C0682j.AppCompatImageView, i, 0);
        try {
            Drawable drawable = this.f3349a.getDrawable();
            if (drawable == null) {
                int g = a.mo5099g(C0682j.AppCompatImageView_srcCompat, -1);
                if (g != -1) {
                    drawable = C0740a.m3008b(this.f3349a.getContext(), g);
                    if (drawable != null) {
                        this.f3349a.setImageDrawable(drawable);
                    }
                }
            }
            if (drawable != null) {
                C1043w.m4826b(drawable);
            }
            if (a.mo5100g(C0682j.AppCompatImageView_tint)) {
                C0655j.m2597a(this.f3349a, a.mo5096e(C0682j.AppCompatImageView_tint));
            }
            if (a.mo5100g(C0682j.AppCompatImageView_tintMode)) {
                C0655j.m2598a(this.f3349a, C1043w.m4824a(a.mo5084a(C0682j.AppCompatImageView_tintMode, -1), null));
            }
        } finally {
            a.mo5087a();
        }
    }

    /* renamed from: a */
    public void mo5246a(int i) {
        if (i != 0) {
            Drawable b = C0740a.m3008b(this.f3349a.getContext(), i);
            if (b != null) {
                C1043w.m4826b(b);
            }
            this.f3349a.setImageDrawable(b);
        } else {
            this.f3349a.setImageDrawable(null);
        }
        mo5253d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo5250a() {
        return VERSION.SDK_INT < 21 || !(this.f3349a.getBackground() instanceof RippleDrawable);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5247a(ColorStateList colorStateList) {
        if (this.f3351c == null) {
            this.f3351c = new C0975aw();
        }
        this.f3351c.f3221a = colorStateList;
        this.f3351c.f3224d = true;
        mo5253d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public ColorStateList mo5251b() {
        if (this.f3351c != null) {
            return this.f3351c.f3221a;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5248a(Mode mode) {
        if (this.f3351c == null) {
            this.f3351c = new C0975aw();
        }
        this.f3351c.f3222b = mode;
        this.f3351c.f3223c = true;
        mo5253d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public Mode mo5252c() {
        if (this.f3351c != null) {
            return this.f3351c.f3222b;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo5253d() {
        Drawable drawable = this.f3349a.getDrawable();
        if (drawable != null) {
            C1043w.m4826b(drawable);
        }
        if (drawable != null && (!m4601e() || !m4600a(drawable))) {
            if (this.f3351c != null) {
                C1007g.m4571a(drawable, this.f3351c, this.f3349a.getDrawableState());
            } else if (this.f3350b != null) {
                C1007g.m4571a(drawable, this.f3350b, this.f3349a.getDrawableState());
            }
        }
    }

    /* renamed from: e */
    private boolean m4601e() {
        int i = VERSION.SDK_INT;
        boolean z = false;
        if (i <= 21) {
            return i == 21;
        }
        if (this.f3350b != null) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    private boolean m4600a(Drawable drawable) {
        if (this.f3352d == null) {
            this.f3352d = new C0975aw();
        }
        C0975aw awVar = this.f3352d;
        awVar.mo5082a();
        ColorStateList a = C0655j.m2596a(this.f3349a);
        if (a != null) {
            awVar.f3224d = true;
            awVar.f3221a = a;
        }
        Mode b = C0655j.m2599b(this.f3349a);
        if (b != null) {
            awVar.f3223c = true;
            awVar.f3222b = b;
        }
        if (!awVar.f3224d && !awVar.f3223c) {
            return false;
        }
        C1007g.m4571a(drawable, awVar, this.f3349a.getDrawableState());
        return true;
    }
}
