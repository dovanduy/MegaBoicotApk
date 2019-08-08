package com.facebook.ads.internal.view.component.p102a.p103a;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.internal.adapters.p072b.C1597h;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import com.facebook.ads.internal.view.component.C2030j;
import com.facebook.ads.internal.view.component.p102a.C2006e;
import com.facebook.ads.internal.view.p105e.p106a.C2041a;

/* renamed from: com.facebook.ads.internal.view.component.a.a.d */
public class C2002d extends C1990b {

    /* renamed from: c */
    private static final int f6309c = ((int) (20.0f * C2342x.f7369b));

    /* renamed from: d */
    private static final int f6310d = ((int) (16.0f * C2342x.f7369b));

    C2002d(C2006e eVar, C1597h hVar, String str, C2041a aVar) {
        super(eVar, hVar, false, str, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8138a(Context context) {
        C2030j titleDescContainer = getTitleDescContainer();
        titleDescContainer.setAlignment(3);
        titleDescContainer.setLayoutParams(new LayoutParams(-1, -2));
        titleDescContainer.setPadding(0, 0, 0, f6309c);
        getCtaButton().setLayoutParams(new LayoutParams(-1, -2));
        LinearLayout linearLayout = new LinearLayout(context);
        C2342x.m9083a((View) linearLayout, (Drawable) new ColorDrawable(-1));
        LayoutParams layoutParams = new LayoutParams(-1, -2);
        layoutParams.addRule(3, getMediaContainer().getId());
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(f6310d, f6310d, f6310d, f6310d);
        linearLayout.addView(titleDescContainer);
        linearLayout.addView(getCtaButton());
        addView(getMediaContainer());
        addView(linearLayout);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo8172b() {
        return false;
    }
}
