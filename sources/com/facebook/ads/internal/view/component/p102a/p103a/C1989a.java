package com.facebook.ads.internal.view.component.p102a.p103a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.view.View;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.internal.adapters.p072b.C1597h;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import com.facebook.ads.internal.view.component.C2030j;
import com.facebook.ads.internal.view.component.p102a.C2006e;
import com.facebook.ads.internal.view.p105e.p106a.C2041a;

/* renamed from: com.facebook.ads.internal.view.component.a.a.a */
public class C1989a extends C1990b {

    /* renamed from: c */
    private static final int f6282c = ((int) (12.0f * C2342x.f7369b));

    C1989a(C2006e eVar, C1597h hVar, String str, C2041a aVar) {
        super(eVar, hVar, true, str, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8138a(Context context) {
        C2030j titleDescContainer = getTitleDescContainer();
        titleDescContainer.setAlignment(3);
        LayoutParams layoutParams = new LayoutParams(-1, -2);
        layoutParams.addRule(8, getMediaContainer().getId());
        titleDescContainer.setLayoutParams(layoutParams);
        titleDescContainer.setPadding(f6282c, f6282c, f6282c, f6282c);
        GradientDrawable gradientDrawable = new GradientDrawable(Orientation.TOP_BOTTOM, new int[]{0, -15658735});
        gradientDrawable.setCornerRadius(0.0f);
        C2342x.m9083a((View) titleDescContainer, (Drawable) gradientDrawable);
        LayoutParams layoutParams2 = new LayoutParams(-1, -2);
        layoutParams2.addRule(3, getMediaContainer().getId());
        getCtaButton().setLayoutParams(layoutParams2);
        addView(getMediaContainer());
        addView(titleDescContainer);
        addView(getCtaButton());
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo8139d() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo8140e() {
        return false;
    }
}
