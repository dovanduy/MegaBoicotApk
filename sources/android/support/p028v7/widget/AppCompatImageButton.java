package android.support.p028v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.p017v4.view.C0594q;
import android.support.p017v4.widget.C0666r;
import android.support.p028v7.p029a.C0672a.C0673a;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* renamed from: android.support.v7.widget.AppCompatImageButton */
public class AppCompatImageButton extends ImageButton implements C0594q, C0666r {

    /* renamed from: a */
    private final C1005e f2601a;

    /* renamed from: b */
    private final C1014i f2602b;

    public AppCompatImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0673a.imageButtonStyle);
    }

    public AppCompatImageButton(Context context, AttributeSet attributeSet, int i) {
        super(C0974av.m4362a(context), attributeSet, i);
        this.f2601a = new C1005e(this);
        this.f2601a.mo5226a(attributeSet, i);
        this.f2602b = new C1014i(this);
        this.f2602b.mo5249a(attributeSet, i);
    }

    public void setImageResource(int i) {
        this.f2602b.mo5246a(i);
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (this.f2602b != null) {
            this.f2602b.mo5253d();
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        if (this.f2602b != null) {
            this.f2602b.mo5253d();
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        if (this.f2602b != null) {
            this.f2602b.mo5253d();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f2601a != null) {
            this.f2601a.mo5222a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f2601a != null) {
            this.f2601a.mo5225a(drawable);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f2601a != null) {
            this.f2601a.mo5223a(colorStateList);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (this.f2601a != null) {
            return this.f2601a.mo5221a();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        if (this.f2601a != null) {
            this.f2601a.mo5224a(mode);
        }
    }

    public Mode getSupportBackgroundTintMode() {
        if (this.f2601a != null) {
            return this.f2601a.mo5227b();
        }
        return null;
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f2602b != null) {
            this.f2602b.mo5247a(colorStateList);
        }
    }

    public ColorStateList getSupportImageTintList() {
        if (this.f2602b != null) {
            return this.f2602b.mo5251b();
        }
        return null;
    }

    public void setSupportImageTintMode(Mode mode) {
        if (this.f2602b != null) {
            this.f2602b.mo5248a(mode);
        }
    }

    public Mode getSupportImageTintMode() {
        if (this.f2602b != null) {
            return this.f2602b.mo5252c();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f2601a != null) {
            this.f2601a.mo5229c();
        }
        if (this.f2602b != null) {
            this.f2602b.mo5253d();
        }
    }

    public boolean hasOverlappingRendering() {
        return this.f2602b.mo5250a() && super.hasOverlappingRendering();
    }
}
