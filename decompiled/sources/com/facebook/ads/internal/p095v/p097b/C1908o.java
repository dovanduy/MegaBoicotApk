package com.facebook.ads.internal.p095v.p097b;

import android.content.Context;
import android.os.Environment;
import android.util.Log;
import java.io.File;

/* renamed from: com.facebook.ads.internal.v.b.o */
public final class C1908o {
    /* renamed from: a */
    public static File m7955a(Context context) {
        return new File(m7956a(context, true), "video-cache");
    }

    /* renamed from: a */
    private static File m7956a(Context context, boolean z) {
        String str;
        try {
            str = Environment.getExternalStorageState();
        } catch (NullPointerException unused) {
            str = "";
        }
        File file = null;
        if (z && "mounted".equals(str)) {
            File file2 = new File(new File(new File(new File(Environment.getExternalStorageDirectory(), "Android"), "data"), context.getPackageName()), "cache");
            if (file2.exists() || file2.mkdirs()) {
                file = file2;
            } else {
                Log.w("ProxyCache", "Unable to create external cache directory");
            }
        }
        if (file == null) {
            file = context.getCacheDir();
        }
        if (file != null) {
            return file;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("/data/data/");
        sb.append(context.getPackageName());
        sb.append("/cache/");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Can't define system cache directory! '");
        sb3.append(sb2);
        sb3.append("%s' will be used.");
        Log.w("ProxyCache", sb3.toString());
        return new File(sb2);
    }
}
