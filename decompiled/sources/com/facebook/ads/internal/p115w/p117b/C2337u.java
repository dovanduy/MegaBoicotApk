package com.facebook.ads.internal.p115w.p117b;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: com.facebook.ads.internal.w.b.u */
public class C2337u {

    /* renamed from: com.facebook.ads.internal.w.b.u$a */
    public enum C2338a {
        UNKNOWN(0),
        NONE(0),
        MOBILE_INTERNET(1),
        MOBILE_2G(2),
        MOBILE_3G(3),
        MOBILE_4G(4);
        

        /* renamed from: g */
        public final int f7347g;

        private C2338a(int i) {
            this.f7347g = i;
        }
    }

    /* renamed from: a */
    public static C2338a m9066a(Context context) {
        if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
            return C2338a.UNKNOWN;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return C2338a.NONE;
        }
        if (activeNetworkInfo.getType() != 0) {
            return C2338a.MOBILE_INTERNET;
        }
        switch (activeNetworkInfo.getSubtype()) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return C2338a.MOBILE_2G;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return C2338a.MOBILE_3G;
            case 13:
                return C2338a.MOBILE_4G;
            default:
                return C2338a.UNKNOWN;
        }
    }
}
