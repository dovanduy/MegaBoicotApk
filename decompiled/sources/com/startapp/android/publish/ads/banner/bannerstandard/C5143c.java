package com.startapp.android.publish.ads.banner.bannerstandard;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.startapp.android.publish.ads.banner.bannerstandard.c */
/* compiled from: StartAppSDK */
public class C5143c {
    /* renamed from: a */
    public static void m22084a(View view) {
        if (!(view == null || view.getParent() == null || !(view.getParent() instanceof ViewGroup))) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
    }

    /* renamed from: a */
    public static View m22083a(Context context, View view) {
        View a = m22082a(context);
        return a != null ? a : m22085b(view);
    }

    /* renamed from: a */
    private static View m22082a(Context context) {
        if (!(context instanceof Activity)) {
            return null;
        }
        return ((Activity) context).getWindow().getDecorView().findViewById(16908290);
    }

    /* renamed from: b */
    private static View m22085b(View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        if (rootView == null) {
            return null;
        }
        View findViewById = rootView.findViewById(16908290);
        if (findViewById != null) {
            rootView = findViewById;
        }
        return rootView;
    }
}
