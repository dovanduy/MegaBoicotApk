package com.facebook.ads.internal.view.p099a;

import android.content.Context;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.internal.adapters.C1650p.C1652b;
import com.facebook.ads.internal.p092s.C1802c;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import com.facebook.ads.internal.view.C1910a;
import com.facebook.ads.internal.view.C1910a.C1911a;

/* renamed from: com.facebook.ads.internal.view.a.d */
public class C1919d {

    /* renamed from: a */
    private static final int f6044a = ((int) (C2342x.f7369b * 200.0f));

    /* renamed from: b */
    private static final int f6045b = ((int) (200.0f * C2342x.f7369b));

    /* renamed from: c */
    private static final int f6046c = ((int) (50.0f * C2342x.f7369b));

    /* renamed from: a */
    public static C1652b m8031a(NativeAdLayout nativeAdLayout) {
        if (nativeAdLayout == null) {
            return C1652b.NO_NATIVE_AD_LAYOUT;
        }
        int width = nativeAdLayout.getWidth();
        int height = nativeAdLayout.getHeight();
        return (width < f6044a || height < f6044a) && (width < f6045b || height < f6046c) ? C1652b.TOO_SMALL : C1652b.AVAILABLE;
    }

    /* renamed from: a */
    public static C1917c m8032a(Context context, C1802c cVar, String str, NativeAdLayout nativeAdLayout) {
        if (nativeAdLayout == null) {
            return null;
        }
        int width = nativeAdLayout.getWidth();
        int height = nativeAdLayout.getHeight();
        if (width >= f6044a && height >= f6044a) {
            C1938k kVar = new C1938k(context, cVar, str, width, height);
            return kVar;
        } else if (width < f6045b || height < f6046c) {
            return null;
        } else {
            C1927h hVar = new C1927h(context, cVar, str, width, height);
            return hVar;
        }
    }

    /* renamed from: a */
    public static C1917c m8033a(Context context, C1802c cVar, String str, C1910a aVar, C1911a aVar2) {
        C1922g gVar = new C1922g(context, cVar, str, aVar, aVar2);
        return gVar;
    }
}
