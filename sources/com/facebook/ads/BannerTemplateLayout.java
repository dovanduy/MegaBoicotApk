package com.facebook.ads;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import com.facebook.ads.internal.p093t.C1812a;
import com.facebook.ads.internal.p093t.C1837j;
import com.facebook.ads.internal.p093t.C1838k;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import com.facebook.ads.internal.view.p109h.C2096b;
import com.facebook.ads.internal.view.p109h.C2097c;

public class BannerTemplateLayout extends NativeAdLayout {

    /* renamed from: a */
    private static final int f4653a = ((int) (C2342x.f7369b * 280.0f));

    /* renamed from: b */
    private static final int f4654b = ((int) (C2342x.f7369b * 375.0f));

    /* renamed from: c */
    private final C2097c f4655c;

    BannerTemplateLayout(Context context, NativeBannerAd nativeBannerAd, C1837j jVar) {
        super(context);
        MediaView mediaView = new MediaView(getContext());
        AdOptionsView adOptionsView = new AdOptionsView(getContext(), nativeBannerAd, this);
        adOptionsView.setIconColor(jVar.mo7794c());
        C1838k a = nativeBannerAd.mo7020a().mo7024a();
        if (a == C1838k.HEIGHT_50) {
            C2096b bVar = new C2096b(context, nativeBannerAd.mo6927f(), jVar, a, mediaView, adOptionsView);
            this.f4655c = bVar;
            setMinWidth(f4653a);
        } else {
            C1812a aVar = new C1812a(context, nativeBannerAd.mo6927f(), adOptionsView, null, mediaView, a, jVar);
            this.f4655c = aVar;
            setMinWidth(f4653a);
            setMaxWidth(f4654b);
        }
        C2342x.m9082a((View) this, jVar.mo7790b());
        nativeBannerAd.registerViewForInteraction(this, mediaView, this.f4655c.getViewsForInteraction());
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(this.f4655c.getView(), layoutParams);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f4655c.mo7716a();
    }
}
