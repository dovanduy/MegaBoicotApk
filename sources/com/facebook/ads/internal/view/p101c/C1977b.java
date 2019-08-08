package com.facebook.ads.internal.view.p101c;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.facebook.ads.internal.p115w.p117b.C2322j;
import com.facebook.ads.internal.p115w.p117b.C2342x;

/* renamed from: com.facebook.ads.internal.view.c.b */
public class C1977b extends FrameLayout {

    /* renamed from: a */
    private final ImageView f6227a;

    /* renamed from: b */
    private int f6228b;

    /* renamed from: c */
    private int f6229c;

    public C1977b(Context context) {
        super(context);
        this.f6227a = new ImageView(context);
        m8132a();
    }

    public C1977b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6227a = new ImageView(context, attributeSet);
        m8132a();
    }

    public C1977b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6227a = new ImageView(context, attributeSet, i);
        m8132a();
    }

    @TargetApi(21)
    public C1977b(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f6227a = new ImageView(context, attributeSet, i, i2);
        m8132a();
    }

    /* renamed from: a */
    private void m8132a() {
        this.f6227a.setScaleType(ScaleType.FIT_XY);
        addView(this.f6227a, new LayoutParams(-2, -2));
        C2322j.m9044a(this.f6227a, C2322j.INTERNAL_AD_MEDIA);
    }

    /* renamed from: a */
    public void mo8098a(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap2 != null) {
            C2342x.m9083a((View) this, (Drawable) new BitmapDrawable(getContext().getResources(), bitmap2));
        } else {
            C2342x.m9082a((View) this, 0);
        }
        if (bitmap != null) {
            this.f6228b = bitmap.getWidth();
            this.f6229c = bitmap.getHeight();
            this.f6227a.setImageBitmap(Bitmap.createBitmap(bitmap));
            return;
        }
        this.f6227a.setImageDrawable(null);
    }

    public ImageView getBodyImageView() {
        return this.f6227a;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (this.f6228b <= 0 || this.f6229c <= 0) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        float min = Math.min(((float) i5) / ((float) this.f6228b), ((float) i6) / ((float) this.f6229c));
        int i7 = (int) (((float) this.f6228b) * min);
        int i8 = i + (i5 / 2);
        int i9 = i2 + (i6 / 2);
        int i10 = i7 / 2;
        int i11 = ((int) (min * ((float) this.f6229c))) / 2;
        this.f6227a.layout(i8 - i10, i9 - i11, i8 + i10, i9 + i11);
    }
}
