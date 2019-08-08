package com.facebook.ads.internal.p115w.p117b;

import android.content.Context;
import android.content.pm.Signature;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.security.MessageDigest;
import java.security.cert.CertificateFactory;

/* renamed from: com.facebook.ads.internal.w.b.f */
public class C2315f {

    /* renamed from: a */
    private static final String f7288a = "f";

    /* renamed from: com.facebook.ads.internal.w.b.f$a */
    public enum C2316a {
        UNKNOWN(0),
        UNROOTED(1),
        ROOTED(2);
        

        /* renamed from: d */
        public final int f7293d;

        private C2316a(int i) {
            this.f7293d = i;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        if (m9037a("su") == false) goto L_0x0029;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.facebook.ads.internal.p115w.p117b.C2315f.C2316a m9035a() {
        /*
            java.io.File r0 = new java.io.File     // Catch:{ Throwable -> 0x0031 }
            java.lang.String r1 = "/system/app/Superuser.apk"
            r0.<init>(r1)     // Catch:{ Throwable -> 0x0031 }
            boolean r0 = r0.exists()     // Catch:{ Throwable -> 0x0031 }
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0028
            java.lang.String r0 = android.os.Build.TAGS     // Catch:{ Throwable -> 0x0031 }
            if (r0 == 0) goto L_0x001d
            java.lang.String r3 = "test-keys"
            boolean r0 = r0.contains(r3)     // Catch:{ Throwable -> 0x0031 }
            if (r0 == 0) goto L_0x001d
            r0 = r2
            goto L_0x001e
        L_0x001d:
            r0 = r1
        L_0x001e:
            if (r0 != 0) goto L_0x0028
            java.lang.String r0 = "su"
            boolean r0 = m9037a(r0)     // Catch:{ Throwable -> 0x0031 }
            if (r0 == 0) goto L_0x0029
        L_0x0028:
            r1 = r2
        L_0x0029:
            if (r1 == 0) goto L_0x002e
            com.facebook.ads.internal.w.b.f$a r0 = com.facebook.ads.internal.p115w.p117b.C2315f.C2316a.ROOTED     // Catch:{ Throwable -> 0x0031 }
            return r0
        L_0x002e:
            com.facebook.ads.internal.w.b.f$a r0 = com.facebook.ads.internal.p115w.p117b.C2315f.C2316a.UNROOTED     // Catch:{ Throwable -> 0x0031 }
            return r0
        L_0x0031:
            com.facebook.ads.internal.w.b.f$a r0 = com.facebook.ads.internal.p115w.p117b.C2315f.C2316a.UNKNOWN
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.p115w.p117b.C2315f.m9035a():com.facebook.ads.internal.w.b.f$a");
    }

    /* renamed from: a */
    public static String m9036a(Context context) {
        try {
            StringBuilder sb = new StringBuilder();
            for (Signature byteArray : context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures) {
                sb.append(C2321i.m9042a(MessageDigest.getInstance("SHA1").digest(CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(byteArray.toByteArray())).getPublicKey().getEncoded())));
                sb.append(";");
            }
            return sb.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static boolean m9037a(String str) {
        for (String file : System.getenv("PATH").split(":")) {
            File file2 = new File(file);
            if (file2.exists() && file2.isDirectory()) {
                File[] listFiles = file2.listFiles();
                if (listFiles == null) {
                    continue;
                } else {
                    for (File name : listFiles) {
                        if (name.getName().equals(str)) {
                            return true;
                        }
                    }
                    continue;
                }
            }
        }
        return false;
    }
}
