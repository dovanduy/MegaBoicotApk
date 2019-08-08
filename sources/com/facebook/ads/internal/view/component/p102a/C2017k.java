package com.facebook.ads.internal.view.component.p102a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import com.facebook.ads.internal.view.component.C2027g;
import com.facebook.ads.internal.view.component.C2030j;

/* renamed from: com.facebook.ads.internal.view.component.a.k */
final class C2017k extends RelativeLayout {

    /* renamed from: a */
    private final View f6365a;

    /* renamed from: b */
    private final C2027g f6366b;

    public C2017k(Context context, View view) {
        super(context);
        this.f6365a = view;
        this.f6366b = new C2027g(context);
        C2342x.m9081a((View) this.f6366b);
    }

    /* renamed from: a */
    public void mo8208a(int i) {
        this.f6365a.setLayoutParams(new LayoutParams(-1, i));
    }

    /* renamed from: a */
    public void mo8209a(View view, View view2) {
        mo8210a(view, view2, 8, null, false);
    }

    /* renamed from: a */
    public void mo8210a(View view, View view2, int i, C2030j jVar, boolean z) {
        this.f6366b.addView(this.f6365a, new LayoutParams(-1, -2));
        if (view2 != null) {
            LayoutParams layoutParams = new LayoutParams(C2004c.f6312b, C2004c.f6312b);
            layoutParams.addRule(i, this.f6365a.getId());
            layoutParams.addRule(7, this.f6365a.getId());
            layoutParams.setMargins(C2004c.f6311a, C2004c.f6311a, C2004c.f6311a, C2004c.f6311a);
            this.f6366b.addView(view2, layoutParams);
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        LayoutParams layoutParams2 = new LayoutParams(-1, -2);
        layoutParams2.addRule(8, this.f6365a.getId());
        if (jVar != null) {
            if (z) {
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                jVar.setAlignment(3);
                layoutParams3.setMargins(C2004c.f6311a / 2, C2004c.f6311a / 2, C2004c.f6311a / 2, C2004c.f6311a / 2);
                linearLayout.addView(jVar, layoutParams3);
                GradientDrawable gradientDrawable = new GradientDrawable(Orientation.BOTTOM_TOP, new int[]{-1778384896, 0});
                gradientDrawable.setCornerRadius(0.0f);
                gradientDrawable.setGradientType(0);
                C2342x.m9083a((View) linearLayout, (Drawable) gradientDrawable);
            } else {
                LayoutParams layoutParams4 = new LayoutParams(-1, -2);
                layoutParams4.addRule(3, this.f6366b.getId());
                layoutParams4.setMargins(0, C2004c.f6311a, 0, 0);
                jVar.setAlignment(17);
                addView(jVar, layoutParams4);
            }
        }
        if (view != null) {
            linearLayout.addView(view, new LayoutParams(-1, -2));
        }
        this.f6366b.addView(linearLayout, layoutParams2);
        addView(this.f6366b, new LayoutParams(-1, -2));
    }
}
