package com.facebook.ads.internal.view.p105e;

import android.content.Context;
import android.text.TextUtils.TruncateAt;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.facebook.ads.internal.adapters.p072b.C1602m;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import com.facebook.ads.internal.view.component.C2026f;
import com.facebook.ads.internal.view.p101c.C1980d;

/* renamed from: com.facebook.ads.internal.view.e.c */
public class C2057c extends LinearLayout {

    /* renamed from: a */
    public static final int f6537a = ((int) (C2342x.f7369b * 32.0f));

    /* renamed from: b */
    private static final int f6538b = ((int) (C2342x.f7369b * 8.0f));

    /* renamed from: c */
    private C2026f f6539c;

    /* renamed from: d */
    private TextView f6540d;

    /* renamed from: e */
    private TextView f6541e;

    public C2057c(Context context) {
        super(context);
        mo8294a(context);
    }

    /* renamed from: a */
    public void mo8293a(int i, int i2) {
        this.f6540d.setTextColor(i);
        this.f6541e.setTextColor(i2);
    }

    /* renamed from: a */
    public void mo8294a(Context context) {
        setGravity(16);
        this.f6539c = new C2026f(context);
        this.f6539c.setFullCircleCorners(true);
        LayoutParams layoutParams = new LayoutParams(f6537a, f6537a);
        layoutParams.setMargins(0, 0, f6538b, 0);
        addView(this.f6539c, layoutParams);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        this.f6540d = new TextView(context);
        LayoutParams layoutParams2 = new LayoutParams(-1, -2);
        C2342x.m9089a(this.f6540d, true, 16);
        this.f6540d.setEllipsize(TruncateAt.END);
        this.f6540d.setSingleLine(true);
        this.f6541e = new TextView(context);
        C2342x.m9089a(this.f6541e, false, 14);
        linearLayout.addView(this.f6540d);
        linearLayout.addView(this.f6541e);
        addView(linearLayout, layoutParams2);
    }

    public void setPageDetails(C1602m mVar) {
        C1980d dVar = new C1980d((ImageView) this.f6539c);
        dVar.mo8115a(f6537a, f6537a);
        dVar.mo8118a(mVar.mo7201b());
        this.f6540d.setText(mVar.mo7200a());
        this.f6541e.setText(mVar.mo7203d());
    }
}
