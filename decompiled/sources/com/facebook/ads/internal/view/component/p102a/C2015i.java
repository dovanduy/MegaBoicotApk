package com.facebook.ads.internal.view.component.p102a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.internal.adapters.p072b.C1597h;
import com.facebook.ads.internal.p115w.p117b.C2342x;

/* renamed from: com.facebook.ads.internal.view.component.a.i */
public class C2015i extends C2004c {

    /* renamed from: c */
    private static final int f6361c = Resources.getSystem().getDisplayMetrics().widthPixels;

    public C2015i(C2006e eVar, C1597h hVar) {
        super(eVar, hVar, true);
        RelativeLayout relativeLayout = new RelativeLayout(eVar.mo8180a());
        LayoutParams layoutParams = new LayoutParams(f6361c / 2, -2);
        layoutParams.addRule(12);
        GradientDrawable gradientDrawable = new GradientDrawable(Orientation.BOTTOM_TOP, new int[]{-1778384896, 0});
        gradientDrawable.setCornerRadius(0.0f);
        gradientDrawable.setGradientType(0);
        C2342x.m9083a((View) relativeLayout, (Drawable) gradientDrawable);
        new LinearLayout.LayoutParams(-2, -2).setMargins(f6311a, 0, 0, 0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
        layoutParams2.setMargins(0, 0, 0, 0);
        layoutParams2.weight = 1.0f;
        if (eVar.mo8187h() != null) {
            LayoutParams layoutParams3 = new LayoutParams(-1, -2);
            layoutParams3.setMargins(0, 0, 0, 0);
            relativeLayout.addView(eVar.mo8187h(), layoutParams3);
        }
        View d = eVar.mo8183d();
        LayoutParams layoutParams4 = new LayoutParams(f6361c / 2, -1);
        layoutParams4.addRule(13);
        layoutParams4.addRule(9);
        addView(d, layoutParams4);
        addView(relativeLayout, layoutParams);
        if (eVar.mo8188i() != null) {
            LayoutParams layoutParams5 = new LayoutParams(f6312b, f6312b);
            layoutParams5.addRule(12);
            layoutParams5.setMargins(f6311a, f6311a + eVar.mo8189j(), f6311a, f6311a);
            addView(eVar.mo8188i(), layoutParams5);
        }
    }

    /* renamed from: a */
    public boolean mo8144a() {
        return true;
    }

    public int getExactMediaWidthIfAvailable() {
        return f6361c / 2;
    }
}
