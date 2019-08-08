package com.facebook.ads.internal.view.component;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.p017v4.graphics.C0401a;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.facebook.ads.internal.adapters.p072b.C1597h;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.internal.view.component.e */
public class C2025e extends LinearLayout {

    /* renamed from: a */
    private final int f6392a;

    /* renamed from: b */
    private final int f6393b;

    /* renamed from: c */
    private final int f6394c;

    /* renamed from: d */
    private int f6395d = -1;

    /* renamed from: e */
    private List<GradientDrawable> f6396e;

    public C2025e(Context context, C1597h hVar, int i) {
        super(context);
        setOrientation(0);
        setGravity(17);
        float f = C2342x.f7369b;
        int i2 = (int) (8.0f * f);
        int i3 = (int) (6.0f * f);
        this.f6394c = (int) (1.0f * f);
        this.f6392a = hVar.mo7170a(false);
        this.f6393b = C0401a.m1505b(this.f6392a, 128);
        this.f6396e = new ArrayList();
        for (int i4 = 0; i4 < i; i4++) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setSize(i2, i2);
            gradientDrawable.setStroke(this.f6394c, 0);
            ImageView imageView = new ImageView(context);
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            layoutParams.setMargins(0, 0, i3, 0);
            layoutParams.gravity = 17;
            imageView.setLayoutParams(layoutParams);
            imageView.setImageDrawable(gradientDrawable);
            this.f6396e.add(gradientDrawable);
            addView(imageView);
        }
        mo8223a(0);
    }

    /* renamed from: a */
    public void mo8223a(int i) {
        int i2;
        int i3;
        if (this.f6395d != i) {
            this.f6395d = i;
            for (int i4 = 0; i4 < this.f6396e.size(); i4++) {
                if (i4 == i) {
                    i3 = this.f6392a;
                    i2 = this.f6392a;
                } else {
                    i3 = this.f6393b;
                    i2 = 0;
                }
                ((GradientDrawable) this.f6396e.get(i4)).setStroke(this.f6394c, i2);
                ((GradientDrawable) this.f6396e.get(i4)).setColor(i3);
                ((GradientDrawable) this.f6396e.get(i4)).invalidateSelf();
            }
        }
    }
}
