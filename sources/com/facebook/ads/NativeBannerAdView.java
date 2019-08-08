package com.facebook.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.facebook.ads.internal.p093t.C1838k;
import com.facebook.ads.internal.p115w.p117b.C2324l;
import com.facebook.ads.internal.p115w.p117b.C2342x;

public class NativeBannerAdView {

    public enum Type {
        HEIGHT_50(C1838k.HEIGHT_50),
        HEIGHT_100(C1838k.HEIGHT_100),
        HEIGHT_120(C1838k.HEIGHT_120);
        

        /* renamed from: a */
        private final C1838k f4767a;

        private Type(C1838k kVar) {
            this.f4767a = kVar;
        }

        /* renamed from: a */
        static Type m6463a(C1838k kVar) {
            if (kVar == C1838k.HEIGHT_50) {
                return HEIGHT_50;
            }
            if (kVar == C1838k.HEIGHT_100) {
                return HEIGHT_100;
            }
            if (kVar == C1838k.HEIGHT_120) {
                return HEIGHT_120;
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C1838k mo7024a() {
            return this.f4767a;
        }

        public int getHeight() {
            return this.f4767a.mo7809b();
        }

        public int getValue() {
            return this.f4767a.mo7809b();
        }

        public int getWidth() {
            return this.f4767a.mo7808a();
        }
    }

    public static View render(Context context, NativeBannerAd nativeBannerAd, Type type) {
        return render(context, nativeBannerAd, type, null);
    }

    public static View render(Context context, NativeBannerAd nativeBannerAd, Type type, NativeAdViewAttributes nativeAdViewAttributes) {
        C2324l.m9048a(context, "context must be not null");
        C2324l.m9048a(nativeBannerAd, "nativeBannerAd must be not null");
        C2324l.m9048a(type, "type must be not null");
        if (nativeBannerAd.isNativeConfigEnabled()) {
            nativeAdViewAttributes = nativeBannerAd.getAdViewAttributes();
        }
        if (nativeAdViewAttributes == null) {
            nativeAdViewAttributes = new NativeAdViewAttributes();
        }
        nativeBannerAd.mo7021a(type);
        BannerTemplateLayout bannerTemplateLayout = new BannerTemplateLayout(context, nativeBannerAd, nativeAdViewAttributes.mo6985a());
        bannerTemplateLayout.setLayoutParams(new LayoutParams(-1, (int) (C2342x.f7369b * ((float) type.getHeight()))));
        return bannerTemplateLayout;
    }
}
