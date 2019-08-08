package com.facebook.ads.internal.view.component.p102a;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.internal.adapters.p072b.C1597h;
import com.facebook.ads.internal.p115w.p117b.C2342x;

/* renamed from: com.facebook.ads.internal.view.component.a.b */
public class C2003b extends C2004c {
    public C2003b(C2006e eVar, C1597h hVar, boolean z) {
        super(eVar, hVar, true);
        RelativeLayout relativeLayout = new RelativeLayout(eVar.mo8180a());
        LayoutParams layoutParams = new LayoutParams(-1, -2);
        layoutParams.addRule(12);
        GradientDrawable gradientDrawable = new GradientDrawable(Orientation.BOTTOM_TOP, new int[]{-1778384896, 0});
        gradientDrawable.setCornerRadius(0.0f);
        gradientDrawable.setGradientType(0);
        C2342x.m9083a((View) relativeLayout, (Drawable) gradientDrawable);
        LinearLayout linearLayout = new LinearLayout(eVar.mo8180a());
        linearLayout.setOrientation(z ^ true ? 1 : 0);
        linearLayout.setGravity(80);
        C2342x.m9081a((View) linearLayout);
        LayoutParams layoutParams2 = new LayoutParams(-1, -2);
        layoutParams2.setMargins(f6311a, 0, f6311a, eVar.mo8187h() == null ? f6311a : f6311a / 2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(z ? -2 : -1, -2);
        layoutParams3.setMargins(z ? f6311a : 0, z ? 0 : f6311a, 0, 0);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(z ? 0 : -1, -2);
        layoutParams4.setMargins(0, 0, 0, 0);
        layoutParams4.weight = 1.0f;
        linearLayout.addView(getTitleDescContainer(), layoutParams4);
        linearLayout.addView(getCtaButton(), layoutParams3);
        relativeLayout.addView(linearLayout, layoutParams2);
        if (eVar.mo8187h() != null) {
            LayoutParams layoutParams5 = new LayoutParams(-1, -2);
            layoutParams5.setMargins(0, 0, 0, 0);
            layoutParams5.addRule(3, linearLayout.getId());
            relativeLayout.addView(eVar.mo8187h(), layoutParams5);
        }
        addView(eVar.mo8183d(), new LayoutParams(-1, -1));
        addView(relativeLayout, layoutParams);
        if (eVar.mo8188i() != null) {
            LayoutParams layoutParams6 = new LayoutParams(f6312b, f6312b);
            layoutParams6.addRule(10);
            layoutParams6.addRule(11);
            layoutParams6.setMargins(f6311a, f6311a + eVar.mo8189j(), f6311a, f6311a);
            addView(eVar.mo8188i(), layoutParams6);
        }
    }

    /* renamed from: a */
    public boolean mo8144a() {
        return true;
    }
}
