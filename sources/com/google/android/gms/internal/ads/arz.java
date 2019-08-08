package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3718cm
public final class arz {
    /* renamed from: a */
    public static void m15038a(arx arx, arw arw) {
        if (arw.mo14700b() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        } else if (TextUtils.isEmpty(arw.mo14701c())) {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        } else {
            arx.mo14705a(arw.mo14700b(), arw.mo14701c(), arw.mo14699a(), arw.mo14702d());
        }
    }
}
