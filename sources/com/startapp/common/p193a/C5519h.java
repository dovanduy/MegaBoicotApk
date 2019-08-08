package com.startapp.common.p193a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import com.startapp.common.p197d.C5550a;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.nio.ByteOrder;
import java.util.Map;

/* renamed from: com.startapp.common.a.h */
/* compiled from: StartAppSDK */
public class C5519h {

    /* renamed from: com.startapp.common.a.h$a */
    /* compiled from: StartAppSDK */
    public static class C5520a {

        /* renamed from: a */
        private String f17567a;

        /* renamed from: b */
        private String f17568b;

        /* renamed from: a */
        public String mo20491a() {
            return this.f17567a;
        }

        /* renamed from: a */
        public void mo20492a(String str) {
            this.f17567a = str;
        }

        /* renamed from: b */
        public String mo20493b() {
            return this.f17568b;
        }

        /* renamed from: b */
        public void mo20494b(String str) {
            this.f17568b = str;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("HttpResult: ");
            sb.append(this.f17568b);
            sb.append(" ");
            sb.append(this.f17567a);
            return sb.toString();
        }
    }

    /* renamed from: com.startapp.common.a.h$b */
    /* compiled from: StartAppSDK */
    public static class C5521b {

        /* renamed from: a */
        private String f17569a;

        /* renamed from: b */
        private String f17570b;

        /* renamed from: c */
        private String f17571c;

        /* renamed from: a */
        public String mo20496a() {
            return this.f17569a;
        }

        /* renamed from: b */
        public String mo20498b() {
            return this.f17570b;
        }

        /* renamed from: c */
        public String mo20500c() {
            return this.f17571c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo20497a(String str) {
            this.f17569a = str;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo20499b(String str) {
            this.f17570b = str;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo20501c(String str) {
            this.f17571c = str;
        }
    }

    static {
        if (VERSION.SDK_INT < 8) {
            System.setProperty("http.keepAlive", "false");
        }
    }

    /* renamed from: a */
    public static String m23569a(Context context, String str, byte[] bArr, Map<String, String> map, String str2, boolean z) {
        return m23570a(context, str, bArr, map, str2, z, "application/json");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:14|(2:18|19)|20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0028, code lost:
        r5 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0029, code lost:
        r9 = null;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x002c, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x002d, code lost:
        r6 = r5;
        r5 = 0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0027 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0021 A[SYNTHETIC, Splitter:B:18:0x0021] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0028 A[Catch:{ Exception -> 0x002c, all -> 0x0028 }, ExcHandler: all (th java.lang.Throwable), Splitter:B:4:0x0008] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00ee A[SYNTHETIC, Splitter:B:78:0x00ee] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00f3  */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m23570a(android.content.Context r4, java.lang.String r5, byte[] r6, java.util.Map<java.lang.String, java.lang.String> r7, java.lang.String r8, boolean r9, java.lang.String r10) {
        /*
            r0 = 0
            r1 = 0
            java.net.HttpURLConnection r4 = m23573b(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x00cb, all -> 0x00c7 }
            if (r6 == 0) goto L_0x0033
            int r5 = r6.length     // Catch:{ Exception -> 0x002c, all -> 0x0028 }
            if (r5 <= 0) goto L_0x0033
            java.io.OutputStream r5 = r4.getOutputStream()     // Catch:{ all -> 0x001d }
            r5.write(r6)     // Catch:{ all -> 0x001b }
            if (r5 == 0) goto L_0x0033
            r5.flush()     // Catch:{ IOException -> 0x0033 }
            r5.close()     // Catch:{ IOException -> 0x0033 }
            goto L_0x0033
        L_0x001b:
            r6 = move-exception
            goto L_0x001f
        L_0x001d:
            r6 = move-exception
            r5 = r1
        L_0x001f:
            if (r5 == 0) goto L_0x0027
            r5.flush()     // Catch:{ IOException -> 0x0027 }
            r5.close()     // Catch:{ IOException -> 0x0027 }
        L_0x0027:
            throw r6     // Catch:{ Exception -> 0x002c, all -> 0x0028 }
        L_0x0028:
            r5 = move-exception
            r9 = r1
            goto L_0x00ec
        L_0x002c:
            r5 = move-exception
            r6 = r5
            r5 = r0
        L_0x002f:
            r9 = r1
        L_0x0030:
            r1 = r4
            goto L_0x00cf
        L_0x0033:
            int r5 = r4.getResponseCode()     // Catch:{ Exception -> 0x002c, all -> 0x0028 }
            r6 = 200(0xc8, float:2.8E-43)
            r7 = -1
            r8 = 1024(0x400, float:1.435E-42)
            if (r5 == r6) goto L_0x008c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x008a, all -> 0x0028 }
            r6.<init>()     // Catch:{ Exception -> 0x008a, all -> 0x0028 }
            java.lang.String r9 = "Error code = ["
            r6.append(r9)     // Catch:{ Exception -> 0x008a, all -> 0x0028 }
            r6.append(r5)     // Catch:{ Exception -> 0x008a, all -> 0x0028 }
            r9 = 93
            r6.append(r9)     // Catch:{ Exception -> 0x008a, all -> 0x0028 }
            java.io.InputStream r9 = r4.getErrorStream()     // Catch:{ Exception -> 0x008a, all -> 0x0028 }
            if (r9 == 0) goto L_0x0080
            java.io.StringWriter r10 = new java.io.StringWriter     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            r10.<init>()     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            char[] r8 = new char[r8]     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            java.lang.String r3 = "UTF-8"
            r2.<init>(r9, r3)     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            r1.<init>(r2)     // Catch:{ Exception -> 0x007e, all -> 0x007b }
        L_0x0069:
            int r2 = r1.read(r8)     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            if (r2 == r7) goto L_0x0073
            r10.write(r8, r0, r2)     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            goto L_0x0069
        L_0x0073:
            java.lang.String r7 = r10.toString()     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            r6.append(r7)     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            goto L_0x0080
        L_0x007b:
            r5 = move-exception
            goto L_0x00ec
        L_0x007e:
            r6 = move-exception
            goto L_0x0030
        L_0x0080:
            java.lang.Exception r7 = new java.lang.Exception     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            r7.<init>(r6)     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            throw r7     // Catch:{ Exception -> 0x007e, all -> 0x007b }
        L_0x008a:
            r6 = move-exception
            goto L_0x002f
        L_0x008c:
            java.io.InputStream r6 = r4.getInputStream()     // Catch:{ Exception -> 0x008a, all -> 0x0028 }
            if (r6 == 0) goto L_0x00bc
            java.io.StringWriter r9 = new java.io.StringWriter     // Catch:{ Exception -> 0x00b7, all -> 0x00b4 }
            r9.<init>()     // Catch:{ Exception -> 0x00b7, all -> 0x00b4 }
            char[] r8 = new char[r8]     // Catch:{ Exception -> 0x00b7, all -> 0x00b4 }
            java.io.BufferedReader r10 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00b7, all -> 0x00b4 }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00b7, all -> 0x00b4 }
            java.lang.String r2 = "UTF-8"
            r1.<init>(r6, r2)     // Catch:{ Exception -> 0x00b7, all -> 0x00b4 }
            r10.<init>(r1)     // Catch:{ Exception -> 0x00b7, all -> 0x00b4 }
        L_0x00a5:
            int r1 = r10.read(r8)     // Catch:{ Exception -> 0x00b7, all -> 0x00b4 }
            if (r1 == r7) goto L_0x00af
            r9.write(r8, r0, r1)     // Catch:{ Exception -> 0x00b7, all -> 0x00b4 }
            goto L_0x00a5
        L_0x00af:
            java.lang.String r1 = r9.toString()     // Catch:{ Exception -> 0x00b7, all -> 0x00b4 }
            goto L_0x00bc
        L_0x00b4:
            r5 = move-exception
            r9 = r6
            goto L_0x00ec
        L_0x00b7:
            r7 = move-exception
            r1 = r4
            r9 = r6
            r6 = r7
            goto L_0x00cf
        L_0x00bc:
            if (r6 == 0) goto L_0x00c1
            r6.close()     // Catch:{ IOException -> 0x00c1 }
        L_0x00c1:
            if (r4 == 0) goto L_0x00c6
            r4.disconnect()
        L_0x00c6:
            return r1
        L_0x00c7:
            r5 = move-exception
            r4 = r1
            r9 = r4
            goto L_0x00ec
        L_0x00cb:
            r5 = move-exception
            r6 = r5
            r5 = r0
            r9 = r1
        L_0x00cf:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ea }
            r4.<init>()     // Catch:{ all -> 0x00ea }
            java.lang.String r7 = "Error execute Exception "
            r4.append(r7)     // Catch:{ all -> 0x00ea }
            java.lang.String r7 = r6.getMessage()     // Catch:{ all -> 0x00ea }
            r4.append(r7)     // Catch:{ all -> 0x00ea }
            com.startapp.common.e r7 = new com.startapp.common.e     // Catch:{ all -> 0x00ea }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00ea }
            r7.<init>(r4, r6, r5)     // Catch:{ all -> 0x00ea }
            throw r7     // Catch:{ all -> 0x00ea }
        L_0x00ea:
            r5 = move-exception
            r4 = r1
        L_0x00ec:
            if (r9 == 0) goto L_0x00f1
            r9.close()     // Catch:{ IOException -> 0x00f1 }
        L_0x00f1:
            if (r4 == 0) goto L_0x00f6
            r4.disconnect()
        L_0x00f6:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.common.p193a.C5519h.m23570a(android.content.Context, java.lang.String, byte[], java.util.Map, java.lang.String, boolean, java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0065, code lost:
        r14 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0066, code lost:
        r12 = null;
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00bc, code lost:
        r13 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00bd, code lost:
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00bf, code lost:
        r14 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c0, code lost:
        r12 = null;
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00ef, code lost:
        r11.disconnect();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00bc A[ExcHandler: all (th java.lang.Throwable), Splitter:B:3:0x000e] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00ea A[SYNTHETIC, Splitter:B:61:0x00ea] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00ef  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.startapp.common.p193a.C5519h.C5520a m23566a(android.content.Context r11, java.lang.String r12, java.util.Map<java.lang.String, java.lang.String> r13, java.lang.String r14, boolean r15) {
        /*
            r2 = 0
            r6 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r0 = r11
            r1 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            java.net.HttpURLConnection r11 = m23573b(r0, r1, r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x00c8, all -> 0x00c4 }
            int r13 = r11.getResponseCode()     // Catch:{ Exception -> 0x00bf, all -> 0x00bc }
            r14 = 200(0xc8, float:2.8E-43)
            r15 = -1
            r0 = 1024(0x400, float:1.435E-42)
            if (r13 != r14) goto L_0x0069
            com.startapp.common.p197d.C5550a.m23690b(r11, r12)     // Catch:{ Exception -> 0x0065, all -> 0x00bc }
            java.io.InputStream r12 = r11.getInputStream()     // Catch:{ Exception -> 0x0065, all -> 0x00bc }
            com.startapp.common.a.h$a r14 = new com.startapp.common.a.h$a     // Catch:{ Exception -> 0x0060, all -> 0x005d }
            r14.<init>()     // Catch:{ Exception -> 0x0060, all -> 0x005d }
            java.lang.String r1 = r11.getContentType()     // Catch:{ Exception -> 0x0060, all -> 0x005d }
            r14.mo20494b(r1)     // Catch:{ Exception -> 0x0060, all -> 0x005d }
            if (r12 == 0) goto L_0x0052
            java.io.StringWriter r1 = new java.io.StringWriter     // Catch:{ Exception -> 0x0060, all -> 0x005d }
            r1.<init>()     // Catch:{ Exception -> 0x0060, all -> 0x005d }
            char[] r0 = new char[r0]     // Catch:{ Exception -> 0x0060, all -> 0x005d }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0060, all -> 0x005d }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0060, all -> 0x005d }
            java.lang.String r4 = "UTF-8"
            r3.<init>(r12, r4)     // Catch:{ Exception -> 0x0060, all -> 0x005d }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0060, all -> 0x005d }
        L_0x0041:
            int r3 = r2.read(r0)     // Catch:{ Exception -> 0x0060, all -> 0x005d }
            if (r3 == r15) goto L_0x004b
            r1.write(r0, r9, r3)     // Catch:{ Exception -> 0x0060, all -> 0x005d }
            goto L_0x0041
        L_0x004b:
            java.lang.String r15 = r1.toString()     // Catch:{ Exception -> 0x0060, all -> 0x005d }
            r14.mo20492a(r15)     // Catch:{ Exception -> 0x0060, all -> 0x005d }
        L_0x0052:
            if (r12 == 0) goto L_0x0057
            r12.close()     // Catch:{ IOException -> 0x0057 }
        L_0x0057:
            if (r11 == 0) goto L_0x005c
            r11.disconnect()
        L_0x005c:
            return r14
        L_0x005d:
            r13 = move-exception
            goto L_0x00e8
        L_0x0060:
            r14 = move-exception
            r8 = r11
            r7 = r9
            goto L_0x00cb
        L_0x0065:
            r14 = move-exception
            r12 = r8
            r7 = r9
            goto L_0x00c2
        L_0x0069:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b9, all -> 0x00bc }
            r12.<init>()     // Catch:{ Exception -> 0x00b9, all -> 0x00bc }
            java.lang.String r14 = "Error sendGetWithResponse code = ["
            r12.append(r14)     // Catch:{ Exception -> 0x00b9, all -> 0x00bc }
            r12.append(r13)     // Catch:{ Exception -> 0x00b9, all -> 0x00bc }
            r14 = 93
            r12.append(r14)     // Catch:{ Exception -> 0x00b9, all -> 0x00bc }
            java.io.InputStream r14 = r11.getErrorStream()     // Catch:{ Exception -> 0x00b9, all -> 0x00bc }
            if (r14 == 0) goto L_0x00af
            java.io.StringWriter r1 = new java.io.StringWriter     // Catch:{ Exception -> 0x00a9, all -> 0x00a6 }
            r1.<init>()     // Catch:{ Exception -> 0x00a9, all -> 0x00a6 }
            char[] r0 = new char[r0]     // Catch:{ Exception -> 0x00a9, all -> 0x00a6 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00a9, all -> 0x00a6 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00a9, all -> 0x00a6 }
            java.lang.String r4 = "UTF-8"
            r3.<init>(r14, r4)     // Catch:{ Exception -> 0x00a9, all -> 0x00a6 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x00a9, all -> 0x00a6 }
        L_0x0094:
            int r3 = r2.read(r0)     // Catch:{ Exception -> 0x00a9, all -> 0x00a6 }
            if (r3 == r15) goto L_0x009e
            r1.write(r0, r9, r3)     // Catch:{ Exception -> 0x00a9, all -> 0x00a6 }
            goto L_0x0094
        L_0x009e:
            java.lang.String r15 = r1.toString()     // Catch:{ Exception -> 0x00a9, all -> 0x00a6 }
            r12.append(r15)     // Catch:{ Exception -> 0x00a9, all -> 0x00a6 }
            goto L_0x00af
        L_0x00a6:
            r13 = move-exception
            r12 = r14
            goto L_0x00e8
        L_0x00a9:
            r12 = move-exception
            r8 = r11
            r10 = r14
            r14 = r12
            r12 = r10
            goto L_0x00cb
        L_0x00af:
            com.startapp.common.e r15 = new com.startapp.common.e     // Catch:{ Exception -> 0x00a9, all -> 0x00a6 }
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x00a9, all -> 0x00a6 }
            r15.<init>(r12, r8, r7, r13)     // Catch:{ Exception -> 0x00a9, all -> 0x00a6 }
            throw r15     // Catch:{ Exception -> 0x00a9, all -> 0x00a6 }
        L_0x00b9:
            r14 = move-exception
            r12 = r8
            goto L_0x00c2
        L_0x00bc:
            r13 = move-exception
            r12 = r8
            goto L_0x00e8
        L_0x00bf:
            r14 = move-exception
            r12 = r8
            r13 = r9
        L_0x00c2:
            r8 = r11
            goto L_0x00cb
        L_0x00c4:
            r13 = move-exception
            r11 = r8
            r12 = r11
            goto L_0x00e8
        L_0x00c8:
            r14 = move-exception
            r12 = r8
            r13 = r9
        L_0x00cb:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e6 }
            r11.<init>()     // Catch:{ all -> 0x00e6 }
            java.lang.String r15 = "Error execute Exception "
            r11.append(r15)     // Catch:{ all -> 0x00e6 }
            java.lang.String r15 = r14.getMessage()     // Catch:{ all -> 0x00e6 }
            r11.append(r15)     // Catch:{ all -> 0x00e6 }
            com.startapp.common.e r15 = new com.startapp.common.e     // Catch:{ all -> 0x00e6 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00e6 }
            r15.<init>(r11, r14, r7, r13)     // Catch:{ all -> 0x00e6 }
            throw r15     // Catch:{ all -> 0x00e6 }
        L_0x00e6:
            r13 = move-exception
            r11 = r8
        L_0x00e8:
            if (r12 == 0) goto L_0x00ed
            r12.close()     // Catch:{ IOException -> 0x00ed }
        L_0x00ed:
            if (r11 == 0) goto L_0x00f2
            r11.disconnect()
        L_0x00f2:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.common.p193a.C5519h.m23566a(android.content.Context, java.lang.String, java.util.Map, java.lang.String, boolean):com.startapp.common.a.h$a");
    }

    /* renamed from: b */
    private static HttpURLConnection m23573b(Context context, String str, byte[] bArr, Map<String, String> map, String str2, boolean z, String str3) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
        C5550a.m23688a(httpURLConnection, str);
        if (!(str2 == null || str2.compareTo("-1") == 0)) {
            httpURLConnection.addRequestProperty("User-Agent", str2);
        }
        httpURLConnection.setRequestProperty("Accept", "application/json;text/html;text/plain");
        httpURLConnection.setReadTimeout(10000);
        httpURLConnection.setConnectTimeout(10000);
        if (bArr != null) {
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.setRequestProperty("Content-Type", str3);
            if (z) {
                httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
            }
        } else {
            httpURLConnection.setRequestMethod("GET");
        }
        return httpURLConnection;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: a */
    public static String m23568a(Context context) {
        String c;
        String str = "e100";
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return str;
            }
            if (!C5509c.m23516a(context, "android.permission.ACCESS_NETWORK_STATE")) {
                return "e105";
            }
            String str2 = "e102";
            if (VERSION.SDK_INT >= 23) {
                Network activeNetwork = connectivityManager.getActiveNetwork();
                if (activeNetwork == null) {
                    return str2;
                }
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
                if (networkCapabilities == null) {
                    return str2;
                }
                if (networkCapabilities.hasTransport(1)) {
                    c = "WIFI";
                } else if (!networkCapabilities.hasTransport(0)) {
                    return str2;
                } else {
                    c = m23574c(context);
                }
            } else {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    return str2;
                }
                String typeName = activeNetworkInfo.getTypeName();
                if (typeName.toLowerCase().compareTo("WIFI".toLowerCase()) == 0) {
                    c = "WIFI";
                } else if (typeName.toLowerCase().compareTo("MOBILE".toLowerCase()) != 0) {
                    return str2;
                } else {
                    c = m23574c(context);
                }
            }
            return c;
        } catch (Exception unused) {
            return "e105";
        }
    }

    /* renamed from: c */
    private static String m23574c(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        return telephonyManager != null ? Integer.toString(telephonyManager.getNetworkType()) : "e101";
    }

    /* renamed from: a */
    public static C5521b m23567a(Context context, String str) {
        if (str.toLowerCase().compareTo("WIFI".toLowerCase()) == 0) {
            return m23575d(context);
        }
        return null;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: d */
    private static C5521b m23575d(Context context) {
        String str = "e103";
        C5521b bVar = new C5521b();
        try {
            if (C5509c.m23516a(context, "android.permission.ACCESS_WIFI_STATE")) {
                WifiInfo connectionInfo = ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getConnectionInfo();
                if (connectionInfo != null) {
                    int rssi = connectionInfo.getRssi();
                    bVar.mo20501c(Integer.toString(WifiManager.calculateSignalLevel(rssi, 5)));
                    bVar.mo20499b(Integer.toString(rssi));
                    str = null;
                }
            } else {
                str = "e105";
            }
        } catch (Exception unused) {
            str = "e100";
        }
        bVar.mo20497a(str);
        return bVar;
    }

    /* renamed from: b */
    public static Boolean m23572b(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null && C5509c.m23516a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                return Boolean.valueOf(activeNetworkInfo.isRoaming());
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m23571a(WifiInfo wifiInfo) {
        int ipAddress = wifiInfo.getIpAddress();
        if (ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN)) {
            ipAddress = Integer.reverseBytes(ipAddress);
        }
        try {
            return InetAddress.getByAddress(BigInteger.valueOf((long) ipAddress).toByteArray()).getHostAddress();
        } catch (Exception unused) {
            return null;
        }
    }
}
