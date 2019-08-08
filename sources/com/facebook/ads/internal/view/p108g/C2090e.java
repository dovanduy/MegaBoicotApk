package com.facebook.ads.internal.view.p108g;

import android.content.Context;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.internal.view.component.C2027g;
import com.facebook.ads.internal.view.p101c.C1980d;

/* renamed from: com.facebook.ads.internal.view.g.e */
class C2090e extends C2027g {

    /* renamed from: b */
    private final ImageView f6677b;

    public C2090e(Context context) {
        super(context);
        this.f6677b = new ImageView(context);
        this.f6677b.setAdjustViewBounds(true);
        addView(this.f6677b, new LayoutParams(-2, -1));
    }

    /* renamed from: a */
    public void mo8351a(String str) {
        C1980d dVar = new C1980d(this.f6677b);
        dVar.mo8114a();
        dVar.mo8118a(str);
    }
}
