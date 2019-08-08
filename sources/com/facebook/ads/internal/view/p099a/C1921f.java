package com.facebook.ads.internal.view.p099a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import com.facebook.ads.internal.p115w.p118c.C2347b;
import com.facebook.ads.internal.p115w.p118c.C2348c;

/* renamed from: com.facebook.ads.internal.view.a.f */
public class C1921f extends LinearLayout {

    /* renamed from: a */
    private static final int f6047a = ((int) (C2342x.f7369b * 16.0f));

    /* renamed from: b */
    private static final int f6048b = ((int) (C2342x.f7369b * 12.0f));

    /* renamed from: c */
    private static final int f6049c = ((int) (12.0f * C2342x.f7369b));

    /* renamed from: d */
    private static final int f6050d = ((int) (16.0f * C2342x.f7369b));

    /* renamed from: e */
    private boolean f6051e = false;

    /* renamed from: f */
    private final ImageView f6052f;

    /* renamed from: g */
    private final TextView f6053g;

    public C1921f(Context context) {
        super(context);
        setOrientation(0);
        setPadding(f6047a, f6048b, f6047a, f6048b);
        this.f6052f = new ImageView(getContext());
        LayoutParams layoutParams = new LayoutParams(f6050d, f6050d);
        layoutParams.gravity = 17;
        this.f6053g = new TextView(getContext());
        LayoutParams layoutParams2 = new LayoutParams(-2, -2);
        addView(this.f6052f, layoutParams);
        addView(this.f6053g, layoutParams2);
        m8041b();
    }

    /* renamed from: b */
    private void m8041b() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(this.f6051e ? -13272859 : -1315344);
        gradientDrawable.setCornerRadius(50.0f);
        C2342x.m9083a((View) this, (Drawable) gradientDrawable);
        C2342x.m9089a(this.f6053g, false, 14);
        int i = this.f6051e ? -1 : -10459280;
        this.f6053g.setTextColor(i);
        this.f6052f.setColorFilter(i);
    }

    /* renamed from: a */
    public void mo7989a() {
        setSelected(!this.f6051e);
    }

    /* renamed from: a */
    public void mo7990a(String str, C2347b bVar) {
        this.f6053g.setText(str);
        if (bVar != null) {
            this.f6052f.setImageBitmap(C2348c.m9100a(bVar));
            this.f6052f.setVisibility(0);
            this.f6053g.setPadding(f6049c, 0, 0, 0);
        } else {
            this.f6052f.setVisibility(8);
            this.f6053g.setPadding(0, 0, 0, 0);
        }
        m8041b();
    }

    public void setSelected(boolean z) {
        this.f6051e = z;
        m8041b();
    }
}
