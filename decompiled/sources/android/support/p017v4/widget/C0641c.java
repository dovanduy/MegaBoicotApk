package android.support.p017v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build.VERSION;
import android.support.p017v4.view.C0595r;
import android.view.View;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;

/* renamed from: android.support.v4.widget.c */
/* compiled from: CircleImageView */
class C0641c extends ImageView {

    /* renamed from: a */
    int f1674a;

    /* renamed from: b */
    private AnimationListener f1675b;

    /* renamed from: android.support.v4.widget.c$a */
    /* compiled from: CircleImageView */
    private class C0642a extends OvalShape {

        /* renamed from: b */
        private RadialGradient f1677b;

        /* renamed from: c */
        private Paint f1678c = new Paint();

        C0642a(int i) {
            C0641c.this.f1674a = i;
            m2527a((int) rect().width());
        }

        /* access modifiers changed from: protected */
        public void onResize(float f, float f2) {
            super.onResize(f, f2);
            m2527a((int) f);
        }

        public void draw(Canvas canvas, Paint paint) {
            int width = C0641c.this.getWidth() / 2;
            float f = (float) width;
            float height = (float) (C0641c.this.getHeight() / 2);
            canvas.drawCircle(f, height, f, this.f1678c);
            canvas.drawCircle(f, height, (float) (width - C0641c.this.f1674a), paint);
        }

        /* renamed from: a */
        private void m2527a(int i) {
            float f = (float) (i / 2);
            RadialGradient radialGradient = new RadialGradient(f, f, (float) C0641c.this.f1674a, new int[]{1023410176, 0}, null, TileMode.CLAMP);
            this.f1677b = radialGradient;
            this.f1678c.setShader(this.f1677b);
        }
    }

    C0641c(Context context, int i) {
        ShapeDrawable shapeDrawable;
        super(context);
        float f = getContext().getResources().getDisplayMetrics().density;
        int i2 = (int) (1.75f * f);
        int i3 = (int) (0.0f * f);
        this.f1674a = (int) (3.5f * f);
        if (m2525a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            C0595r.m2232a((View) this, 4.0f * f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C0642a(this.f1674a));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer((float) this.f1674a, (float) i3, (float) i2, 503316480);
            int i4 = this.f1674a;
            setPadding(i4, i4, i4, i4);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(i);
        C0595r.m2239a((View) this, (Drawable) shapeDrawable);
    }

    /* renamed from: a */
    private boolean m2525a() {
        return VERSION.SDK_INT >= 21;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!m2525a()) {
            setMeasuredDimension(getMeasuredWidth() + (this.f1674a * 2), getMeasuredHeight() + (this.f1674a * 2));
        }
    }

    /* renamed from: a */
    public void mo2444a(AnimationListener animationListener) {
        this.f1675b = animationListener;
    }

    public void onAnimationStart() {
        super.onAnimationStart();
        if (this.f1675b != null) {
            this.f1675b.onAnimationStart(getAnimation());
        }
    }

    public void onAnimationEnd() {
        super.onAnimationEnd();
        if (this.f1675b != null) {
            this.f1675b.onAnimationEnd(getAnimation());
        }
    }

    public void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }
}
