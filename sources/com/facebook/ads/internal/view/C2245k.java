package com.facebook.ads.internal.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.facebook.ads.internal.p093t.C1833f;
import com.facebook.ads.internal.p115w.p117b.C2322j;
import com.facebook.ads.internal.p115w.p117b.C2342x;

/* renamed from: com.facebook.ads.internal.view.k */
public class C2245k extends C1833f {

    /* renamed from: a */
    private static final int f7067a = ((int) (1.0f * C2342x.f7369b));

    /* renamed from: b */
    private final ImageView f7068b;

    public C2245k(Context context) {
        super(context);
        this.f7068b = new C2295x(context);
        this.f7068b.setScaleType(ScaleType.CENTER_CROP);
        C2322j.m9044a(this.f7068b, C2322j.INTERNAL_AD_MEDIA);
        addView(this.f7068b, new LayoutParams(-1, -1));
        C2342x.m9082a((View) this.f7068b, -2130706433);
        setPadding(f7067a, f7067a, f7067a, f7067a);
    }

    public View getAdContentsView() {
        return this.f7068b;
    }

    public ImageView getImageCardView() {
        return this.f7068b;
    }
}
