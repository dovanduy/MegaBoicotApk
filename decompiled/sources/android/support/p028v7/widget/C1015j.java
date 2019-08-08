package android.support.p028v7.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.support.p017v4.graphics.drawable.C0409c;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* renamed from: android.support.v7.widget.j */
/* compiled from: AppCompatProgressBarHelper */
class C1015j {

    /* renamed from: a */
    private static final int[] f3353a = {16843067, 16843068};

    /* renamed from: b */
    private final ProgressBar f3354b;

    /* renamed from: c */
    private Bitmap f3355c;

    C1015j(ProgressBar progressBar) {
        this.f3354b = progressBar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5255a(AttributeSet attributeSet, int i) {
        C0977ay a = C0977ay.m4367a(this.f3354b.getContext(), attributeSet, f3353a, i, 0);
        Drawable b = a.mo5090b(0);
        if (b != null) {
            this.f3354b.setIndeterminateDrawable(mo5257a(b));
        }
        Drawable b2 = a.mo5090b(1);
        if (b2 != null) {
            this.f3354b.setProgressDrawable(m4611a(b2, false));
        }
        a.mo5087a();
    }

    /* renamed from: a */
    private Drawable m4611a(Drawable drawable, boolean z) {
        if (drawable instanceof C0409c) {
            C0409c cVar = (C0409c) drawable;
            Drawable a = cVar.mo1434a();
            if (a != null) {
                cVar.mo1435a(m4611a(a, z));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                drawableArr[i] = m4611a(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f3355c == null) {
                this.f3355c = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(mo5258b());
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, TileMode.REPEAT, TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }

    /* renamed from: a */
    private Drawable mo5257a(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i = 0; i < numberOfFrames; i++) {
            Drawable a = m4611a(animationDrawable.getFrame(i), true);
            a.setLevel(10000);
            animationDrawable2.addFrame(a, animationDrawable.getDuration(i));
        }
        animationDrawable2.setLevel(10000);
        return animationDrawable2;
    }

    /* renamed from: b */
    private Shape mo5258b() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Bitmap mo5254a() {
        return this.f3355c;
    }
}
