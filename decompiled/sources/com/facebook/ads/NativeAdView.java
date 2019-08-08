package com.facebook.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.facebook.ads.internal.p093t.C1838k;
import com.facebook.ads.internal.p115w.p117b.C2324l;
import com.facebook.ads.internal.p115w.p117b.C2342x;

public class NativeAdView {

    public enum Type {
        HEIGHT_300(C1838k.HEIGHT_300),
        HEIGHT_400(C1838k.HEIGHT_400);
        

        /* renamed from: a */
        private final C1838k f4749a;

        private Type(C1838k kVar) {
            this.f4749a = kVar;
        }

        /* renamed from: a */
        static Type m6448a(C1838k kVar) {
            if (kVar == C1838k.HEIGHT_300) {
                return HEIGHT_300;
            }
            if (kVar == C1838k.HEIGHT_400) {
                return HEIGHT_400;
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C1838k mo6981a() {
            return this.f4749a;
        }

        public int getHeight() {
            return this.f4749a.mo7809b();
        }

        public int getValue() {
            return this.f4749a.mo7809b();
        }

        public int getWidth() {
            return this.f4749a.mo7808a();
        }
    }

    public static View render(Context context, NativeAd nativeAd, Type type) {
        return render(context, nativeAd, type, null);
    }

    public static View render(Context context, NativeAd nativeAd, Type type, NativeAdViewAttributes nativeAdViewAttributes) {
        C2324l.m9048a(context, "context must be not null");
        C2324l.m9048a(nativeAd, "nativeAd must be not null");
        C2324l.m9048a(type, "type must be not null");
        if (nativeAd.isNativeConfigEnabled()) {
            nativeAdViewAttributes = nativeAd.getAdViewAttributes();
        }
        if (nativeAdViewAttributes == null) {
            nativeAdViewAttributes = new NativeAdViewAttributes();
        }
        nativeAd.mo6910a(type);
        MediumRectTemplateLayout mediumRectTemplateLayout = new MediumRectTemplateLayout(context, nativeAd, nativeAdViewAttributes.mo6985a());
        mediumRectTemplateLayout.setLayoutParams(new LayoutParams(-1, (int) (C2342x.f7369b * ((float) type.getHeight()))));
        return mediumRectTemplateLayout;
    }
}
