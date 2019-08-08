package com.google.android.gms.common.util;

import com.facebook.ads.AdError;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.common.util.u */
public final class C3569u {

    /* renamed from: a */
    private static Pattern f10194a;

    /* renamed from: a */
    public static int m12782a(int i) {
        if (i == -1) {
            return -1;
        }
        return i / AdError.NETWORK_ERROR_CODE;
    }
}
