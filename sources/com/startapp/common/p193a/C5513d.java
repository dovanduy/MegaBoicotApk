package com.startapp.common.p193a;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: com.startapp.common.a.d */
/* compiled from: StartAppSDK */
public class C5513d {

    /* renamed from: com.startapp.common.a.d$a */
    /* compiled from: StartAppSDK */
    static class C5514a extends FilterInputStream {
        public C5514a(InputStream inputStream) {
            super(inputStream);
        }

        public long skip(long j) {
            long j2 = 0;
            while (j2 < j) {
                long skip = this.in.skip(j - j2);
                if (skip == 0) {
                    if (read() < 0) {
                        break;
                    }
                    skip = 1;
                }
                j2 += skip;
            }
            return j2;
        }
    }

    /* renamed from: a */
    public static Bitmap m23539a(String str) {
        byte[] decode = Base64.decode(str, 0);
        return BitmapFactory.decodeByteArray(decode, 0, decode.length);
    }

    /* renamed from: a */
    public static Drawable m23540a(Resources resources, String str) {
        return new BitmapDrawable(resources, m23539a(str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
        if (r5 == null) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0040, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0027, code lost:
        if (r5 != null) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
        r5.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002d, code lost:
        r0 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002d A[ExcHandler: all (th java.lang.Throwable), Splitter:B:3:0x000c] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap m23541b(java.lang.String r5) {
        /*
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x003b, all -> 0x0031 }
            r1.<init>(r5)     // Catch:{ Exception -> 0x003b, all -> 0x0031 }
            java.net.URLConnection r5 = r1.openConnection()     // Catch:{ Exception -> 0x003b, all -> 0x0031 }
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ Exception -> 0x003b, all -> 0x0031 }
            r5.connect()     // Catch:{ Exception -> 0x002f, all -> 0x002d }
            java.io.InputStream r1 = r5.getInputStream()     // Catch:{ Exception -> 0x002f, all -> 0x002d }
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x002f, all -> 0x002d }
            r2.<init>(r1)     // Catch:{ Exception -> 0x002f, all -> 0x002d }
            com.startapp.common.a.d$a r3 = new com.startapp.common.a.d$a     // Catch:{ Exception -> 0x002f, all -> 0x002d }
            r3.<init>(r1)     // Catch:{ Exception -> 0x002f, all -> 0x002d }
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeStream(r3)     // Catch:{ Exception -> 0x002f, all -> 0x002d }
            r2.close()     // Catch:{ Exception -> 0x003d, all -> 0x002d }
            r1.close()     // Catch:{ Exception -> 0x003d, all -> 0x002d }
            if (r5 == 0) goto L_0x0040
        L_0x0029:
            r5.disconnect()
            goto L_0x0040
        L_0x002d:
            r0 = move-exception
            goto L_0x0035
        L_0x002f:
            r3 = r0
            goto L_0x003d
        L_0x0031:
            r5 = move-exception
            r4 = r0
            r0 = r5
            r5 = r4
        L_0x0035:
            if (r5 == 0) goto L_0x003a
            r5.disconnect()
        L_0x003a:
            throw r0
        L_0x003b:
            r5 = r0
            r3 = r5
        L_0x003d:
            if (r5 == 0) goto L_0x0040
            goto L_0x0029
        L_0x0040:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.common.p193a.C5513d.m23541b(java.lang.String):android.graphics.Bitmap");
    }
}
