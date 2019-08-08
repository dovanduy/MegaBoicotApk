package com.appnext.core;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.ads.p135a.C2961a;
import com.google.android.gms.ads.p135a.C2961a.C2962a;
import com.google.android.gms.common.C3412e;
import com.google.android.gms.common.C3413f;
import java.io.IOException;

public class AdsIDHelper {
    /* renamed from: a */
    protected static String m5554a(Context context, boolean z) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return "";
        }
        try {
            C2962a a = C2961a.m10593a(context);
            if (a == null) {
                return "";
            }
            if (!z || !a.mo12187b()) {
                return a.mo12186a();
            }
            return "";
        } catch (C3412e | C3413f | IOException unused) {
            return "";
        }
    }
}
