package com.facebook.ads.internal.p115w.p119d;

import android.content.Context;
import com.facebook.ads.internal.p115w.p123h.C2370a;
import com.facebook.ads.internal.p115w.p123h.C2373b;
import java.io.File;

/* renamed from: com.facebook.ads.internal.w.d.a */
public final class C2353a {
    /* renamed from: a */
    public static boolean m9109a(Context context) {
        try {
            return new File(context.getFilesDir(), "com.facebook.ads.ipc").exists();
        } catch (Exception e) {
            C2370a.m9146a(context, "ipc", C2373b.f7495ac, e);
            return false;
        }
    }
}
