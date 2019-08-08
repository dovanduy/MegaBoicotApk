package com.facebook.ads.internal;

import android.util.Log;

public class DisplayAdController {

    /* renamed from: a */
    private static final String f4783a = "DisplayAdController";

    /* renamed from: b */
    private static boolean f4784b = false;

    @Deprecated
    protected static synchronized void setMainThreadForced(boolean z) {
        synchronized (DisplayAdController.class) {
            String str = f4783a;
            StringBuilder sb = new StringBuilder();
            sb.append("BaseAdController changed main thread forced from ");
            sb.append(f4784b);
            sb.append(" to ");
            sb.append(z);
            Log.d(str, sb.toString());
            f4784b = z;
        }
    }
}
