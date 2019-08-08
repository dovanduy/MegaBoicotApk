package com.facebook.ads.internal.protocol;

import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout.LayoutParams;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.protocol.f */
public class C1788f {

    /* renamed from: a */
    private static final Map<C1786d, C1787e> f5633a = new HashMap();

    static {
        f5633a.put(C1786d.RECTANGLE_HEIGHT_250, C1787e.WEBVIEW_BANNER_250);
        f5633a.put(C1786d.BANNER_HEIGHT_90, C1787e.WEBVIEW_BANNER_90);
        f5633a.put(C1786d.BANNER_HEIGHT_50, C1787e.WEBVIEW_BANNER_50);
    }

    /* renamed from: a */
    public static C1787e m7393a(DisplayMetrics displayMetrics) {
        int i = (int) (((float) displayMetrics.widthPixels) / displayMetrics.density);
        int i2 = (int) (((float) displayMetrics.heightPixels) / displayMetrics.density);
        return i >= 640 && i2 >= 640 ? C1787e.WEBVIEW_INTERSTITIAL_TABLET : i2 > i ? C1787e.WEBVIEW_INTERSTITIAL_VERTICAL : C1787e.WEBVIEW_INTERSTITIAL_HORIZONTAL;
    }

    /* renamed from: a */
    public static C1787e m7394a(C1786d dVar) {
        C1787e eVar = (C1787e) f5633a.get(dVar);
        return eVar == null ? C1787e.WEBVIEW_BANNER_LEGACY : eVar;
    }

    /* renamed from: a */
    public static void m7395a(DisplayMetrics displayMetrics, View view, C1786d dVar) {
        LayoutParams layoutParams = new LayoutParams(((int) (((float) displayMetrics.widthPixels) / displayMetrics.density)) >= dVar.mo7640a() ? displayMetrics.widthPixels : (int) Math.ceil((double) (((float) dVar.mo7640a()) * displayMetrics.density)), (int) Math.ceil((double) (((float) dVar.mo7641b()) * displayMetrics.density)));
        layoutParams.addRule(14, -1);
        view.setLayoutParams(layoutParams);
    }
}
