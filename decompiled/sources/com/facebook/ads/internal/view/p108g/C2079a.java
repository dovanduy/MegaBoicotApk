package com.facebook.ads.internal.view.p108g;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.internal.adapters.p072b.C1597h;
import com.facebook.ads.internal.adapters.p072b.C1608q;
import com.facebook.ads.internal.p092s.C1802c;
import com.facebook.ads.internal.p115w.p117b.C2341w;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import com.facebook.ads.internal.p125x.C2376a;
import com.facebook.ads.internal.view.C1910a.C1911a;
import com.facebook.ads.internal.view.component.C1983a;
import com.facebook.ads.internal.view.component.C2026f;
import com.facebook.ads.internal.view.component.C2030j;
import com.facebook.ads.internal.view.p101c.C1980d;
import com.facebook.ads.internal.view.p110i.p112b.C2133aa;
import java.util.HashMap;

/* renamed from: com.facebook.ads.internal.view.g.a */
public class C2079a extends LinearLayout {

    /* renamed from: a */
    private static final int f6619a = ((int) (12.0f * C2342x.f7369b));

    /* renamed from: b */
    private static final int f6620b = ((int) (16.0f * C2342x.f7369b));

    /* renamed from: c */
    private final C2030j f6621c;

    /* renamed from: d */
    private final ImageView f6622d;

    /* renamed from: e */
    private final RelativeLayout f6623e;

    /* renamed from: f */
    private final C1983a f6624f;

    /* renamed from: g */
    private final int f6625g;

    public C2079a(Context context, int i, C1597h hVar, C1802c cVar, C1911a aVar, boolean z, boolean z2, C2376a aVar2, C2341w wVar) {
        Context context2 = context;
        int i2 = i;
        super(context);
        this.f6625g = i2;
        this.f6622d = new C2026f(context2);
        C2342x.m9082a((View) this.f6622d, 0);
        C2342x.m9081a((View) this.f6622d);
        LayoutParams layoutParams = new LayoutParams(i2, i2);
        layoutParams.addRule(15);
        layoutParams.addRule(9);
        layoutParams.setMargins(0, 0, f6619a, 0);
        if (z2) {
            this.f6622d.setVisibility(8);
        }
        C2030j jVar = new C2030j(context2, hVar, true, z, true);
        this.f6621c = jVar;
        this.f6621c.setAlignment(8388611);
        LayoutParams layoutParams2 = new LayoutParams(-2, -2);
        layoutParams2.addRule(1, this.f6622d.getId());
        layoutParams2.addRule(15);
        C1983a aVar3 = r1;
        C1983a aVar4 = new C1983a(context2, true, false, C2133aa.REWARDED_VIDEO_AD_CLICK.mo8442a(), hVar, cVar, aVar, aVar2, wVar);
        this.f6624f = aVar3;
        this.f6624f.setVisibility(8);
        this.f6623e = new RelativeLayout(context2);
        C2342x.m9081a((View) this.f6623e);
        this.f6623e.addView(this.f6622d, layoutParams);
        this.f6623e.addView(this.f6621c, layoutParams2);
        addView(this.f6623e, new LinearLayout.LayoutParams(-2, -2));
        GradientDrawable gradientDrawable = new GradientDrawable(Orientation.TOP_BOTTOM, new int[]{0, -15658735});
        gradientDrawable.setCornerRadius(0.0f);
        C2342x.m9083a((View) this, (Drawable) gradientDrawable);
    }

    /* renamed from: a */
    public void mo8324a() {
        this.f6624f.setVisibility(0);
    }

    /* renamed from: a */
    public void mo8325a(int i) {
        C2342x.m9091b(this.f6624f);
        int i2 = 1;
        if (i != 1) {
            i2 = 0;
        }
        setOrientation(i2);
        int i3 = -1;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2 != 0 ? -1 : 0, -2);
        layoutParams.weight = 1.0f;
        if (i2 == 0) {
            i3 = -2;
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i3, -2);
        layoutParams2.setMargins(i2 != 0 ? 0 : f6620b, i2 != 0 ? f6620b : 0, 0, 0);
        layoutParams2.gravity = 80;
        this.f6623e.setLayoutParams(layoutParams);
        addView(this.f6624f, layoutParams2);
    }

    public void setInfo(C1608q qVar) {
        this.f6621c.mo8234a(qVar.mo7232g().mo7147a(), qVar.mo7232g().mo7148b(), null, false, false);
        this.f6624f.mo8130a(qVar.mo7233h(), qVar.mo7113a(), new HashMap());
        new C1980d(this.f6622d).mo8115a(this.f6625g, this.f6625g).mo8118a(qVar.mo7231f().mo7201b());
    }
}
