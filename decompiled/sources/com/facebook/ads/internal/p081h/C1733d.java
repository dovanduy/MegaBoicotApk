package com.facebook.ads.internal.p081h;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import com.facebook.ads.internal.p091r.C1795a;
import com.facebook.ads.internal.p095v.p096a.C1872p;
import com.facebook.ads.internal.p115w.p118c.C2348c;
import com.facebook.ads.internal.p115w.p120e.C2357d;
import com.facebook.ads.internal.p115w.p123h.C2370a;
import com.facebook.ads.internal.p115w.p123h.C2373b;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.C1783b;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: com.facebook.ads.internal.h.d */
public class C1733d {

    /* renamed from: a */
    private static final String f5420a = "d";

    /* renamed from: b */
    private static C1733d f5421b;

    /* renamed from: c */
    private final Context f5422c;

    private C1733d(Context context) {
        this.f5422c = context;
    }

    /* renamed from: a */
    private Bitmap m7201a(String str) {
        byte[] d = C2357d.m9115a(this.f5422c).mo7841a(str, (C1872p) null).mo7889d();
        return BitmapFactory.decodeByteArray(d, 0, d.length);
    }

    /* renamed from: a */
    public static C1733d m7202a(Context context) {
        if (f5421b == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (C1733d.class) {
                if (f5421b == null) {
                    f5421b = new C1733d(applicationContext);
                }
            }
        }
        return f5421b;
    }

    /* renamed from: a */
    private static void m7203a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:54:0x00b5=Splitter:B:54:0x00b5, B:39:0x0078=Splitter:B:39:0x0078} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m7204a(java.lang.String r6, android.graphics.Bitmap r7) {
        /*
            r5 = this;
            r0 = 0
            if (r7 != 0) goto L_0x0007
            r5.m7205a(r0)
            return
        L_0x0007:
            java.io.File r1 = new java.io.File
            android.content.Context r2 = r5.f5422c
            java.io.File r2 = r2.getCacheDir()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            int r4 = r6.hashCode()
            r3.append(r4)
            java.lang.String r4 = ".png"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.<init>(r2, r3)
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ FileNotFoundException -> 0x00b3, IOException -> 0x0089, OutOfMemoryError -> 0x0076, all -> 0x0073 }
            r2.<init>()     // Catch:{ FileNotFoundException -> 0x00b3, IOException -> 0x0089, OutOfMemoryError -> 0x0076, all -> 0x0073 }
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ FileNotFoundException -> 0x006f, IOException -> 0x006b, OutOfMemoryError -> 0x0067, all -> 0x0062 }
            r4 = 100
            r7.compress(r3, r4, r2)     // Catch:{ FileNotFoundException -> 0x006f, IOException -> 0x006b, OutOfMemoryError -> 0x0067, all -> 0x0062 }
            int r7 = r2.size()     // Catch:{ FileNotFoundException -> 0x006f, IOException -> 0x006b, OutOfMemoryError -> 0x0067, all -> 0x0062 }
            r3 = 3145728(0x300000, float:4.408104E-39)
            if (r7 < r3) goto L_0x0049
            java.lang.String r7 = f5420a     // Catch:{ FileNotFoundException -> 0x006f, IOException -> 0x006b, OutOfMemoryError -> 0x0067, all -> 0x0062 }
            java.lang.String r3 = "Bitmap size exceeds max size for storage"
            android.util.Log.d(r7, r3)     // Catch:{ FileNotFoundException -> 0x006f, IOException -> 0x006b, OutOfMemoryError -> 0x0067, all -> 0x0062 }
            m7203a(r2)
            m7203a(r0)
            return
        L_0x0049:
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x006f, IOException -> 0x006b, OutOfMemoryError -> 0x0067, all -> 0x0062 }
            r7.<init>(r1)     // Catch:{ FileNotFoundException -> 0x006f, IOException -> 0x006b, OutOfMemoryError -> 0x0067, all -> 0x0062 }
            r2.writeTo(r7)     // Catch:{ FileNotFoundException -> 0x0060, IOException -> 0x005c, OutOfMemoryError -> 0x005a, all -> 0x0058 }
            r7.flush()     // Catch:{ FileNotFoundException -> 0x0060, IOException -> 0x005c, OutOfMemoryError -> 0x005a, all -> 0x0058 }
            m7203a(r2)
            goto L_0x0085
        L_0x0058:
            r6 = move-exception
            goto L_0x0064
        L_0x005a:
            r6 = move-exception
            goto L_0x0069
        L_0x005c:
            r0 = move-exception
            r1 = r7
            r7 = r0
            goto L_0x006d
        L_0x0060:
            r6 = move-exception
            goto L_0x0071
        L_0x0062:
            r6 = move-exception
            r7 = r0
        L_0x0064:
            r0 = r2
            goto L_0x00da
        L_0x0067:
            r6 = move-exception
            r7 = r0
        L_0x0069:
            r0 = r2
            goto L_0x0078
        L_0x006b:
            r7 = move-exception
            r1 = r0
        L_0x006d:
            r0 = r2
            goto L_0x008b
        L_0x006f:
            r6 = move-exception
            r7 = r0
        L_0x0071:
            r0 = r2
            goto L_0x00b5
        L_0x0073:
            r6 = move-exception
            r7 = r0
            goto L_0x00da
        L_0x0076:
            r6 = move-exception
            r7 = r0
        L_0x0078:
            r5.m7205a(r6)     // Catch:{ all -> 0x00d9 }
            java.lang.String r1 = f5420a     // Catch:{ all -> 0x00d9 }
            java.lang.String r2 = "Unable to write bitmap to output stream"
            android.util.Log.e(r1, r2, r6)     // Catch:{ all -> 0x00d9 }
        L_0x0082:
            m7203a(r0)
        L_0x0085:
            m7203a(r7)
            return
        L_0x0089:
            r7 = move-exception
            r1 = r0
        L_0x008b:
            r5.m7205a(r7)     // Catch:{ all -> 0x00b0 }
            java.lang.String r2 = f5420a     // Catch:{ all -> 0x00b0 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b0 }
            r3.<init>()     // Catch:{ all -> 0x00b0 }
            java.lang.String r4 = "Unable to write bitmap to file (url="
            r3.append(r4)     // Catch:{ all -> 0x00b0 }
            r3.append(r6)     // Catch:{ all -> 0x00b0 }
            java.lang.String r6 = ")."
            r3.append(r6)     // Catch:{ all -> 0x00b0 }
            java.lang.String r6 = r3.toString()     // Catch:{ all -> 0x00b0 }
            android.util.Log.e(r2, r6, r7)     // Catch:{ all -> 0x00b0 }
            m7203a(r0)
            m7203a(r1)
            return
        L_0x00b0:
            r6 = move-exception
            r7 = r1
            goto L_0x00da
        L_0x00b3:
            r6 = move-exception
            r7 = r0
        L_0x00b5:
            java.lang.String r2 = f5420a     // Catch:{ all -> 0x00d9 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d9 }
            r3.<init>()     // Catch:{ all -> 0x00d9 }
            java.lang.String r4 = "Bad output destination (file="
            r3.append(r4)     // Catch:{ all -> 0x00d9 }
            java.lang.String r1 = r1.getAbsolutePath()     // Catch:{ all -> 0x00d9 }
            r3.append(r1)     // Catch:{ all -> 0x00d9 }
            java.lang.String r1 = ")."
            r3.append(r1)     // Catch:{ all -> 0x00d9 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x00d9 }
            android.util.Log.e(r2, r1, r6)     // Catch:{ all -> 0x00d9 }
            r5.m7205a(r6)     // Catch:{ all -> 0x00d9 }
            goto L_0x0082
            return
        L_0x00d9:
            r6 = move-exception
        L_0x00da:
            m7203a(r0)
            m7203a(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.p081h.C1733d.m7204a(java.lang.String, android.graphics.Bitmap):void");
    }

    /* renamed from: a */
    private void m7205a(Throwable th) {
        C2370a.m9149b(this.f5422c, "image", C2373b.f7484S, new C1783b(AdErrorType.IMAGE_CACHE_ERROR, AdErrorType.IMAGE_CACHE_ERROR.getDefaultErrorMessage(), th));
    }

    /* renamed from: a */
    private boolean m7206a(int i, int i2) {
        return i > 0 && i2 > 0 && C1795a.m7453l(this.f5422c);
    }

    /* renamed from: b */
    private Bitmap m7207b(String str, int i, int i2) {
        try {
            Bitmap a = m7206a(i, i2) ? C2348c.m9102a(str.substring("file://".length()), i, i2) : BitmapFactory.decodeStream(new FileInputStream(str.substring("file://".length())), null, null);
            m7204a(str, a);
            return a;
        } catch (IOException e) {
            String str2 = f5420a;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to copy local image into cache (url=");
            sb.append(str);
            sb.append(").");
            Log.e(str2, sb.toString(), e);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0052  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:24:0x0045=Splitter:B:24:0x0045, B:17:0x003a=Splitter:B:17:0x003a} */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.Bitmap m7208c(java.lang.String r5, int r6, int r7) {
        /*
            r4 = this;
            java.lang.String r0 = "asset:///"
            boolean r0 = r5.startsWith(r0)
            if (r0 == 0) goto L_0x0056
            r0 = 0
            android.content.Context r1 = r4.f5422c     // Catch:{ IOException -> 0x0043, OutOfMemoryError -> 0x0038, all -> 0x0036 }
            android.content.res.AssetManager r1 = r1.getAssets()     // Catch:{ IOException -> 0x0043, OutOfMemoryError -> 0x0038, all -> 0x0036 }
            r2 = 9
            int r3 = r5.length()     // Catch:{ IOException -> 0x0043, OutOfMemoryError -> 0x0038, all -> 0x0036 }
            java.lang.String r2 = r5.substring(r2, r3)     // Catch:{ IOException -> 0x0043, OutOfMemoryError -> 0x0038, all -> 0x0036 }
            java.io.InputStream r1 = r1.open(r2)     // Catch:{ IOException -> 0x0043, OutOfMemoryError -> 0x0038, all -> 0x0036 }
            boolean r2 = r4.m7206a(r6, r7)     // Catch:{ IOException -> 0x0034, OutOfMemoryError -> 0x0032 }
            if (r2 == 0) goto L_0x0028
            android.graphics.Bitmap r6 = com.facebook.ads.internal.p115w.p118c.C2348c.m9101a(r1, r6, r7)     // Catch:{ IOException -> 0x0034, OutOfMemoryError -> 0x0032 }
            goto L_0x002c
        L_0x0028:
            android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeStream(r1)     // Catch:{ IOException -> 0x0034, OutOfMemoryError -> 0x0032 }
        L_0x002c:
            if (r1 == 0) goto L_0x0082
            m7203a(r1)
            goto L_0x0082
        L_0x0032:
            r5 = move-exception
            goto L_0x003a
        L_0x0034:
            r5 = move-exception
            goto L_0x0045
        L_0x0036:
            r5 = move-exception
            goto L_0x0050
        L_0x0038:
            r5 = move-exception
            r1 = r0
        L_0x003a:
            r4.m7205a(r5)     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x0042
            m7203a(r1)
        L_0x0042:
            return r0
        L_0x0043:
            r5 = move-exception
            r1 = r0
        L_0x0045:
            r4.m7205a(r5)     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x004d
            m7203a(r1)
        L_0x004d:
            return r0
        L_0x004e:
            r5 = move-exception
            r0 = r1
        L_0x0050:
            if (r0 == 0) goto L_0x0055
            m7203a(r0)
        L_0x0055:
            throw r5
        L_0x0056:
            boolean r0 = r4.m7206a(r6, r7)
            if (r0 == 0) goto L_0x007e
            java.net.URL r0 = new java.net.URL     // Catch:{ IOException -> 0x007a }
            r0.<init>(r5)     // Catch:{ IOException -> 0x007a }
            java.net.URLConnection r0 = r0.openConnection()     // Catch:{ IOException -> 0x007a }
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ IOException -> 0x007a }
            r1 = 1
            r0.setDoInput(r1)     // Catch:{ IOException -> 0x007a }
            r0.connect()     // Catch:{ IOException -> 0x007a }
            java.io.InputStream r0 = r0.getInputStream()     // Catch:{ IOException -> 0x007a }
            android.graphics.Bitmap r6 = com.facebook.ads.internal.p115w.p118c.C2348c.m9101a(r0, r6, r7)     // Catch:{ IOException -> 0x007a }
            m7203a(r0)     // Catch:{ IOException -> 0x007a }
            goto L_0x0082
        L_0x007a:
            r6 = move-exception
            r4.m7205a(r6)
        L_0x007e:
            android.graphics.Bitmap r6 = r4.m7201a(r5)
        L_0x0082:
            r4.m7204a(r5, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.p081h.C1733d.m7208c(java.lang.String, int, int):android.graphics.Bitmap");
    }

    /* renamed from: a */
    public Bitmap mo7512a(String str, int i, int i2) {
        File cacheDir = this.f5422c.getCacheDir();
        StringBuilder sb = new StringBuilder();
        sb.append(str.hashCode());
        sb.append(".png");
        File file = new File(cacheDir, sb.toString());
        return !file.exists() ? str.startsWith("file://") ? m7207b(str, i, i2) : m7208c(str, i, i2) : m7206a(i, i2) ? C2348c.m9102a(file.getAbsolutePath(), i, i2) : BitmapFactory.decodeFile(file.getAbsolutePath());
    }
}
