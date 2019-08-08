package com.startapp.android.publish.adsCommon.Utils;

import android.content.Context;
import android.graphics.Bitmap;
import com.startapp.common.C5554g;
import com.startapp.common.C5554g.C5558a;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.startapp.android.publish.adsCommon.Utils.a */
/* compiled from: StartAppSDK */
public class C5295a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Map<String, Bitmap> f17027a = new ConcurrentHashMap();

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005b A[SYNTHETIC, Splitter:B:21:0x005b] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0062 A[SYNTHETIC, Splitter:B:29:0x0062] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Bitmap m22609a(android.content.Context r3, java.lang.String r4, boolean r5) {
        /*
            java.util.Map<java.lang.String, android.graphics.Bitmap> r0 = f17027a
            java.lang.Object r0 = r0.get(r4)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r0 == 0) goto L_0x000b
            return r0
        L_0x000b:
            com.startapp.android.publish.adsCommon.Utils.C5303f.m22633a(r3, r5)
            r5 = 0
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ Exception -> 0x005f, all -> 0x0058 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x005f, all -> 0x0058 }
            r1.<init>()     // Catch:{ Exception -> 0x005f, all -> 0x0058 }
            java.io.File r2 = r3.getFilesDir()     // Catch:{ Exception -> 0x005f, all -> 0x0058 }
            java.lang.String r2 = r2.getPath()     // Catch:{ Exception -> 0x005f, all -> 0x0058 }
            r1.append(r2)     // Catch:{ Exception -> 0x005f, all -> 0x0058 }
            java.lang.String r2 = "/"
            r1.append(r2)     // Catch:{ Exception -> 0x005f, all -> 0x0058 }
            r1.append(r4)     // Catch:{ Exception -> 0x005f, all -> 0x0058 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x005f, all -> 0x0058 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x005f, all -> 0x0058 }
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeStream(r0)     // Catch:{ Exception -> 0x0060, all -> 0x0055 }
            android.content.res.Resources r2 = r3.getResources()     // Catch:{ Exception -> 0x0060, all -> 0x0055 }
            android.content.res.Resources r3 = r3.getResources()     // Catch:{ Exception -> 0x0060, all -> 0x0055 }
            if (r3 == 0) goto L_0x0045
            android.util.DisplayMetrics r3 = r2.getDisplayMetrics()     // Catch:{ Exception -> 0x0060, all -> 0x0055 }
            int r3 = r3.densityDpi     // Catch:{ Exception -> 0x0060, all -> 0x0055 }
            goto L_0x0047
        L_0x0045:
            r3 = 160(0xa0, float:2.24E-43)
        L_0x0047:
            r1.setDensity(r3)     // Catch:{ Exception -> 0x0060, all -> 0x0055 }
            java.util.Map<java.lang.String, android.graphics.Bitmap> r3 = f17027a     // Catch:{ Exception -> 0x0060, all -> 0x0055 }
            r3.put(r4, r1)     // Catch:{ Exception -> 0x0060, all -> 0x0055 }
            if (r0 == 0) goto L_0x0054
            r0.close()     // Catch:{ IOException -> 0x0054 }
        L_0x0054:
            return r1
        L_0x0055:
            r3 = move-exception
            r5 = r0
            goto L_0x0059
        L_0x0058:
            r3 = move-exception
        L_0x0059:
            if (r5 == 0) goto L_0x005e
            r5.close()     // Catch:{ IOException -> 0x005e }
        L_0x005e:
            throw r3
        L_0x005f:
            r0 = r5
        L_0x0060:
            if (r0 == 0) goto L_0x0065
            r0.close()     // Catch:{ IOException -> 0x0065 }
        L_0x0065:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.android.publish.adsCommon.Utils.C5295a.m22609a(android.content.Context, java.lang.String, boolean):android.graphics.Bitmap");
    }

    /* renamed from: a */
    public static Bitmap m22608a(Context context, String str) {
        Bitmap a = m22609a(context, str, false);
        return a == null ? m22609a(context, str, true) : a;
    }

    /* renamed from: a */
    public static void m22611a(final Context context, final Bitmap bitmap, final String str, final String str2) {
        C5554g.m23702a(C5558a.DEFAULT, (Runnable) new Runnable() {
            /* JADX WARNING: Removed duplicated region for block: B:17:0x0068 A[SYNTHETIC, Splitter:B:17:0x0068] */
            /* JADX WARNING: Removed duplicated region for block: B:22:0x0073 A[SYNTHETIC, Splitter:B:22:0x0073] */
            /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r5 = this;
                    java.util.Map r0 = com.startapp.android.publish.adsCommon.Utils.C5295a.f17027a
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = r4
                    r1.append(r2)
                    java.lang.String r2 = r5
                    r1.append(r2)
                    java.lang.String r1 = r1.toString()
                    android.graphics.Bitmap r2 = r3
                    r0.put(r1, r2)
                    r0 = 0
                    java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0062 }
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0062 }
                    r2.<init>()     // Catch:{ Exception -> 0x0062 }
                    android.content.Context r3 = r2     // Catch:{ Exception -> 0x0062 }
                    java.io.File r3 = r3.getFilesDir()     // Catch:{ Exception -> 0x0062 }
                    java.lang.String r3 = r3.getPath()     // Catch:{ Exception -> 0x0062 }
                    r2.append(r3)     // Catch:{ Exception -> 0x0062 }
                    java.lang.String r3 = "/"
                    r2.append(r3)     // Catch:{ Exception -> 0x0062 }
                    java.lang.String r3 = r4     // Catch:{ Exception -> 0x0062 }
                    r2.append(r3)     // Catch:{ Exception -> 0x0062 }
                    java.lang.String r3 = r5     // Catch:{ Exception -> 0x0062 }
                    r2.append(r3)     // Catch:{ Exception -> 0x0062 }
                    java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0062 }
                    r1.<init>(r2)     // Catch:{ Exception -> 0x0062 }
                    android.graphics.Bitmap r0 = r3     // Catch:{ Exception -> 0x005b, all -> 0x0056 }
                    android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ Exception -> 0x005b, all -> 0x0056 }
                    r3 = 100
                    r0.compress(r2, r3, r1)     // Catch:{ Exception -> 0x005b, all -> 0x0056 }
                    if (r1 == 0) goto L_0x0070
                    r1.close()     // Catch:{ IOException -> 0x006c }
                    goto L_0x0070
                L_0x0056:
                    r0 = move-exception
                    r4 = r1
                    r1 = r0
                    r0 = r4
                    goto L_0x0071
                L_0x005b:
                    r0 = move-exception
                    r4 = r1
                    r1 = r0
                    r0 = r4
                    goto L_0x0063
                L_0x0060:
                    r1 = move-exception
                    goto L_0x0071
                L_0x0062:
                    r1 = move-exception
                L_0x0063:
                    r1.printStackTrace()     // Catch:{ all -> 0x0060 }
                    if (r0 == 0) goto L_0x0070
                    r0.close()     // Catch:{ IOException -> 0x006c }
                    goto L_0x0070
                L_0x006c:
                    r0 = move-exception
                    r0.printStackTrace()
                L_0x0070:
                    return
                L_0x0071:
                    if (r0 == 0) goto L_0x007b
                    r0.close()     // Catch:{ IOException -> 0x0077 }
                    goto L_0x007b
                L_0x0077:
                    r0 = move-exception
                    r0.printStackTrace()
                L_0x007b:
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.startapp.android.publish.adsCommon.Utils.C5295a.C52961.run():void");
            }
        });
    }

    /* renamed from: a */
    public static boolean m22612a(Context context, String str, String str2) {
        if (!str.endsWith(str2)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            str = sb.toString();
        }
        if (!f17027a.containsKey(str)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(context.getFilesDir().getPath());
            sb2.append("/");
            sb2.append(str);
            if (!new File(sb2.toString()).exists()) {
                return false;
            }
        }
        return true;
    }
}
