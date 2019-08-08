package com.facebook.ads;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import com.facebook.ads.internal.p093t.C1812a;
import com.facebook.ads.internal.p093t.C1837j;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import java.util.List;

public class MediumRectTemplateLayout extends NativeAdLayout {

    /* renamed from: a */
    private static final int f4722a = ((int) (C2342x.f7369b * 280.0f));

    /* renamed from: b */
    private static final int f4723b = ((int) (C2342x.f7369b * 375.0f));

    /* renamed from: c */
    private final C1812a f4724c;

    MediumRectTemplateLayout(Context context, NativeAd nativeAd, C1837j jVar) {
        super(context);
        MediaView mediaView = new MediaView(getContext());
        MediaView mediaView2 = new MediaView(getContext());
        AdOptionsView adOptionsView = new AdOptionsView(getContext(), nativeAd, this);
        adOptionsView.setIconColor(jVar.mo7794c());
        C1812a aVar = new C1812a(context, nativeAd.mo6927f(), adOptionsView, mediaView2, mediaView, nativeAd.mo6914e().mo6981a(), jVar);
        this.f4724c = aVar;
        setMinWidth(f4722a);
        setMaxWidth(f4723b);
        C2342x.m9082a((View) this, jVar.mo7790b());
        nativeAd.registerViewForInteraction((View) this, mediaView2, mediaView, (List<View>) this.f4724c.getViewsForInteraction());
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(this.f4724c, layoutParams);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f4724c.mo7716a();
    }
}
