package com.appnext.core;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Process;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.WebView;
import com.appnext.ads.C1066a;
import com.appnext.base.p046b.C1245d;
import com.appnext.base.p046b.C1245d.C1246a;
import com.appnext.base.p046b.C1247e;
import com.google.android.exoplayer2.C2793C;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PushbackInputStream;
import java.io.StringWriter;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.GZIPInputStream;
import org.json.JSONObject;

/* renamed from: com.appnext.core.f */
public final class C1326f {
    private static final boolean DEBUG = false;
    public static final String VID = "2.4.5.472";

    /* renamed from: iR */
    static final int f4184iR = 8000;

    /* renamed from: kN */
    private static final String f4185kN = "expiredTimems";

    /* renamed from: kO */
    private static double f4186kO = -1.0d;

    /* renamed from: kP */
    private static HashMap<String, Bitmap> f4187kP = new HashMap<>();

    /* renamed from: kQ */
    private static String f4188kQ = "";

    /* renamed from: kR */
    private static String f4189kR = "";

    /* renamed from: kS */
    private static String f4190kS = "";

    /* renamed from: kT */
    public static final Executor f4191kT;

    /* renamed from: X */
    public static void m5656X(String str) {
    }

    /* renamed from: c */
    public static void m5681c(Throwable th) {
    }

    /* renamed from: cG */
    public static double m5686cG() {
        return 0.0d;
    }

    static {
        CookieHandler.setDefault(new CookieManager());
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(Runtime.getRuntime().availableProcessors() + 1, (Runtime.getRuntime().availableProcessors() * 2) + 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue(128), new ThreadFactory() {

            /* renamed from: kU */
            private final AtomicInteger f4192kU = new AtomicInteger(1);

            public final Thread newThread(Runnable runnable) {
                StringBuilder sb = new StringBuilder("AsyncTask #");
                sb.append(this.f4192kU.getAndIncrement());
                return new Thread(runnable, sb.toString());
            }
        });
        f4191kT = threadPoolExecutor;
    }

    /* renamed from: s */
    public static String m5696s(Context context) {
        return m5675b(context, true);
    }

    /* renamed from: b */
    public static String m5675b(Context context, boolean z) {
        String str;
        if (context == null || context.getApplicationContext() == null) {
            return "";
        }
        try {
            Class.forName("com.google.android.gms.ads.a.a");
            str = AdsIDHelper.m5554a(context.getApplicationContext(), z);
        } catch (ClassNotFoundException unused) {
            str = "";
        }
        try {
            f4189kR = str;
        } catch (Throwable unused2) {
            if (!f4189kR.equals("")) {
                return f4189kR;
            }
            str = "";
        }
        return str;
    }

    /* renamed from: t */
    static void m5697t(Context context) {
        try {
            WebView webView = new WebView(context);
            f4188kQ = webView.getSettings().getUserAgentString();
            webView.destroy();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: cD */
    static String m5683cD() {
        return f4188kQ;
    }

    /* renamed from: aI */
    private static void m5668aI(String str) {
        f4188kQ = str;
    }

    /* renamed from: cE */
    public static String m5684cE() {
        try {
            StringBuilder sb = new StringBuilder("android ");
            sb.append(VERSION.SDK_INT);
            sb.append(" ");
            sb.append(Build.MANUFACTURER);
            sb.append(" ");
            sb.append(Build.MODEL);
            return URLEncoder.encode(sb.toString(), C2793C.UTF8_NAME);
        } catch (Throwable unused) {
            return "android";
        }
    }

    /* renamed from: cF */
    public static int m5685cF() {
        Runtime runtime = Runtime.getRuntime();
        return (int) ((runtime.maxMemory() / C1245d.f3948iQ) - ((runtime.totalMemory() - runtime.freeMemory()) / C1245d.f3948iQ));
    }

    /* renamed from: a */
    public static String m5659a(String str, HashMap<String, String> hashMap) throws IOException {
        return m5662a(str, hashMap, true, 8000);
    }

    /* renamed from: a */
    public static String m5661a(String str, HashMap<String, String> hashMap, boolean z) throws IOException {
        return m5662a(str, hashMap, z, 8000);
    }

    /* renamed from: a */
    public static String m5660a(String str, HashMap<String, String> hashMap, int i) throws IOException {
        return m5662a(str, null, true, i);
    }

    /* renamed from: a */
    public static String m5662a(String str, HashMap<String, String> hashMap, boolean z, int i) throws IOException {
        return new String(m5680b(str, hashMap, z, i, C1246a.HashMap), C2793C.UTF8_NAME);
    }

    /* renamed from: e */
    public static String m5690e(String str, ArrayList<Pair<String, String>> arrayList) throws IOException {
        return m5658a(str, arrayList, 8000);
    }

    /* renamed from: a */
    public static String m5658a(String str, ArrayList<Pair<String, String>> arrayList, int i) throws IOException {
        return new String(m5680b(str, arrayList, true, i, C1246a.ArrayList), C2793C.UTF8_NAME);
    }

    /* renamed from: b */
    public static String m5676b(String str, JSONObject jSONObject) throws IOException {
        return new String(m5680b(str, jSONObject, true, 8000, C1246a.JSONObject), C2793C.UTF8_NAME);
    }

    /* renamed from: a */
    public static byte[] m5666a(String str, Object obj, boolean z, int i) throws IOException {
        return m5680b(str, obj, z, i, C1246a.HashMap);
    }

    /* renamed from: aJ */
    private static boolean m5669aJ(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("aid")) {
                return false;
            }
            String string = jSONObject.getString("aid");
            if (TextUtils.isEmpty(string) || !string.equals(m5675b(C1247e.getContext(), true))) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: aK */
    private static boolean m5670aK(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has(f4185kN)) {
                return true;
            }
            if (System.currentTimeMillis() >= jSONObject.getLong(f4185kN)) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x020f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m5667a(java.lang.String r10, java.lang.Object r11, boolean r12, int r13, com.appnext.base.p046b.C1245d.C1246a r14) throws java.lang.Exception {
        /*
            com.appnext.base.services.a r12 = com.appnext.base.services.C1280a.m5525cb()
            java.lang.String r12 = r12.getKey()
            boolean r13 = android.text.TextUtils.isEmpty(r12)
            r0 = 15000(0x3a98, float:2.102E-41)
            r1 = 0
            r2 = 1
            r3 = 0
            if (r13 != 0) goto L_0x001f
            boolean r13 = m5669aJ(r12)
            if (r13 == 0) goto L_0x001f
            boolean r13 = m5670aK(r12)
            if (r13 == 0) goto L_0x008f
        L_0x001f:
            java.util.HashMap r12 = new java.util.HashMap
            r12.<init>()
            java.lang.String r13 = "aid"
            com.appnext.base.b.h r4 = com.appnext.base.p046b.C1250h.m5296ci()
            android.content.Context r5 = com.appnext.base.p046b.C1247e.getContext()
            java.lang.String r5 = m5675b(r5, r2)
            java.lang.String r4 = r4.mo5959aC(r5)
            r12.put(r13, r4)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0215 }
            java.lang.String r4 = "https://api.appnxt.net"
            r13.<init>(r4)     // Catch:{ Throwable -> 0x0215 }
            java.lang.String r4 = "/api/token"
            r13.append(r4)     // Catch:{ Throwable -> 0x0215 }
            java.lang.String r13 = r13.toString()     // Catch:{ Throwable -> 0x0215 }
            com.appnext.base.b.d$a r4 = com.appnext.base.p046b.C1245d.C1246a.HashMap     // Catch:{ Throwable -> 0x0215 }
            byte[] r12 = m5680b(r13, r12, r1, r0, r4)     // Catch:{ Throwable -> 0x0215 }
            if (r12 != 0) goto L_0x0052
            return r3
        L_0x0052:
            java.lang.String r13 = new java.lang.String     // Catch:{ Throwable -> 0x0215 }
            java.lang.String r4 = "UTF-8"
            r13.<init>(r12, r4)     // Catch:{ Throwable -> 0x0215 }
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0215 }
            r12.<init>(r13)     // Catch:{ Throwable -> 0x0215 }
            java.lang.String r4 = "aid"
            android.content.Context r5 = com.appnext.base.p046b.C1247e.getContext()     // Catch:{ Throwable -> 0x0215 }
            java.lang.String r5 = m5675b(r5, r2)     // Catch:{ Throwable -> 0x0215 }
            r12.put(r4, r5)     // Catch:{ Throwable -> 0x0215 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x0215 }
            java.lang.String r6 = "expire"
            long r6 = r12.getLong(r6)     // Catch:{ Throwable -> 0x0215 }
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r8
            long r8 = r4 + r6
            r4 = 10000(0x2710, double:4.9407E-320)
            long r6 = r8 - r4
            java.lang.String r4 = "expiredTimems"
            r12.put(r4, r6)     // Catch:{ Throwable -> 0x0215 }
            com.appnext.base.services.a r4 = com.appnext.base.services.C1280a.m5525cb()     // Catch:{ Throwable -> 0x0215 }
            java.lang.String r12 = r12.toString()     // Catch:{ Throwable -> 0x0215 }
            r4.setKey(r12)     // Catch:{ Throwable -> 0x0215 }
            r12 = r13
        L_0x008f:
            org.json.JSONObject r13 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0214 }
            r13.<init>(r12)     // Catch:{ Throwable -> 0x0214 }
            java.lang.String r12 = "secret"
            boolean r12 = r13.has(r12)     // Catch:{ Throwable -> 0x0214 }
            if (r12 == 0) goto L_0x0213
            java.lang.String r12 = "rnd"
            boolean r12 = r13.has(r12)     // Catch:{ Throwable -> 0x0214 }
            if (r12 != 0) goto L_0x00a6
            goto L_0x0213
        L_0x00a6:
            java.lang.String r12 = "rnd"
            java.lang.String r12 = r13.getString(r12)     // Catch:{ Throwable -> 0x0214 }
            java.lang.String r4 = "secret"
            java.lang.String r13 = r13.getString(r4)     // Catch:{ Throwable -> 0x0214 }
            java.net.URL r4 = new java.net.URL
            r4.<init>(r10)
            java.net.URLConnection r10 = r4.openConnection()     // Catch:{ all -> 0x0206 }
            java.net.HttpURLConnection r10 = (java.net.HttpURLConnection) r10     // Catch:{ all -> 0x0206 }
            r10.setReadTimeout(r0)     // Catch:{ all -> 0x0204 }
            r10.setConnectTimeout(r0)     // Catch:{ all -> 0x0204 }
            java.lang.String r4 = "Accept-Encoding"
            java.lang.String r5 = "gzip"
            r10.setRequestProperty(r4, r5)     // Catch:{ all -> 0x0204 }
            java.lang.String r4 = "User-Agent"
            java.lang.String r5 = f4188kQ     // Catch:{ all -> 0x0204 }
            r10.setRequestProperty(r4, r5)     // Catch:{ all -> 0x0204 }
            java.lang.String r4 = "rnd"
            r10.setRequestProperty(r4, r12)     // Catch:{ all -> 0x0204 }
            android.content.Context r12 = com.appnext.base.p046b.C1247e.getContext()     // Catch:{ all -> 0x0204 }
            java.lang.String r12 = m5675b(r12, r2)     // Catch:{ all -> 0x0204 }
            boolean r4 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x0204 }
            if (r4 == 0) goto L_0x00fb
            java.lang.String r12 = "aidForSend"
            com.appnext.base.b.d$a r4 = com.appnext.base.p046b.C1245d.C1246a.String     // Catch:{ all -> 0x0204 }
            java.lang.Object r12 = com.appnext.base.p046b.C1259k.m5329a(r12, r4)     // Catch:{ all -> 0x0204 }
            if (r12 == 0) goto L_0x00f5
            boolean r4 = r12 instanceof java.lang.String     // Catch:{ all -> 0x0204 }
            if (r4 == 0) goto L_0x00f5
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0204 }
            goto L_0x0102
        L_0x00f5:
            if (r10 == 0) goto L_0x00fa
            r10.disconnect()
        L_0x00fa:
            return r3
        L_0x00fb:
            java.lang.String r4 = "aidForSend"
            com.appnext.base.b.d$a r5 = com.appnext.base.p046b.C1245d.C1246a.String     // Catch:{ all -> 0x0204 }
            com.appnext.base.p046b.C1259k.m5337b(r4, r12, r5)     // Catch:{ all -> 0x0204 }
        L_0x0102:
            boolean r4 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x0204 }
            if (r4 == 0) goto L_0x010e
            if (r10 == 0) goto L_0x010d
            r10.disconnect()
        L_0x010d:
            return r3
        L_0x010e:
            java.lang.String r4 = "aid"
            com.appnext.base.b.h r5 = com.appnext.base.p046b.C1250h.m5296ci()     // Catch:{ all -> 0x0204 }
            java.lang.String r12 = r5.mo5959aC(r12)     // Catch:{ all -> 0x0204 }
            r10.setRequestProperty(r4, r12)     // Catch:{ all -> 0x0204 }
            r10.setDoOutput(r2)     // Catch:{ all -> 0x0204 }
            java.lang.String r12 = "POST"
            r10.setRequestMethod(r12)     // Catch:{ all -> 0x0204 }
            com.appnext.base.b.d$a r12 = com.appnext.base.p046b.C1245d.C1246a.JSONObject     // Catch:{ all -> 0x0204 }
            if (r14 == r12) goto L_0x012b
            com.appnext.base.b.d$a r12 = com.appnext.base.p046b.C1245d.C1246a.JSONArray     // Catch:{ all -> 0x0204 }
            if (r14 != r12) goto L_0x0140
        L_0x012b:
            java.lang.String r12 = "Content-Type"
            java.lang.String r2 = "application/json"
            r10.setRequestProperty(r12, r2)     // Catch:{ all -> 0x0204 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0204 }
            java.lang.String r2 = "report params "
            r12.<init>(r2)     // Catch:{ all -> 0x0204 }
            java.lang.String r2 = r11.toString()     // Catch:{ all -> 0x0204 }
            r12.append(r2)     // Catch:{ all -> 0x0204 }
        L_0x0140:
            java.lang.String r12 = ""
            com.appnext.base.b.d$a r2 = com.appnext.base.p046b.C1245d.C1246a.JSONArray     // Catch:{ all -> 0x0204 }
            if (r14 != r2) goto L_0x014e
            r12 = r11
            org.json.JSONArray r12 = (org.json.JSONArray) r12     // Catch:{ all -> 0x0204 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x0204 }
            goto L_0x019b
        L_0x014e:
            com.appnext.base.b.d$a r2 = com.appnext.base.p046b.C1245d.C1246a.JSONObject     // Catch:{ all -> 0x0204 }
            if (r14 != r2) goto L_0x015a
            r12 = r11
            org.json.JSONObject r12 = (org.json.JSONObject) r12     // Catch:{ all -> 0x0204 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x0204 }
            goto L_0x019b
        L_0x015a:
            com.appnext.base.b.d$a r2 = com.appnext.base.p046b.C1245d.C1246a.HashMap     // Catch:{ all -> 0x0204 }
            if (r14 != r2) goto L_0x0190
            r12 = r11
            java.util.HashMap r12 = (java.util.HashMap) r12     // Catch:{ all -> 0x0204 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0204 }
            r2.<init>()     // Catch:{ all -> 0x0204 }
            java.util.Set r12 = r12.entrySet()     // Catch:{ all -> 0x0204 }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ all -> 0x0204 }
        L_0x016e:
            boolean r4 = r12.hasNext()     // Catch:{ all -> 0x0204 }
            if (r4 == 0) goto L_0x018b
            java.lang.Object r4 = r12.next()     // Catch:{ all -> 0x0204 }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ all -> 0x0204 }
            android.util.Pair r5 = new android.util.Pair     // Catch:{ all -> 0x0204 }
            java.lang.Object r6 = r4.getKey()     // Catch:{ all -> 0x0204 }
            java.lang.Object r4 = r4.getValue()     // Catch:{ all -> 0x0204 }
            r5.<init>(r6, r4)     // Catch:{ all -> 0x0204 }
            r2.add(r5)     // Catch:{ all -> 0x0204 }
            goto L_0x016e
        L_0x018b:
            java.lang.String r12 = m5678b(r2, r1)     // Catch:{ all -> 0x0204 }
            goto L_0x019b
        L_0x0190:
            com.appnext.base.b.d$a r2 = com.appnext.base.p046b.C1245d.C1246a.ArrayList     // Catch:{ all -> 0x0204 }
            if (r14 != r2) goto L_0x019b
            r12 = r11
            java.util.ArrayList r12 = (java.util.ArrayList) r12     // Catch:{ all -> 0x0204 }
            java.lang.String r12 = m5678b(r12, r1)     // Catch:{ all -> 0x0204 }
        L_0x019b:
            com.appnext.base.b.h r2 = com.appnext.base.p046b.C1250h.m5296ci()     // Catch:{ all -> 0x0204 }
            byte[] r12 = r2.mo5961g(r12, r13)     // Catch:{ all -> 0x0204 }
            java.io.OutputStream r13 = r10.getOutputStream()     // Catch:{ all -> 0x0204 }
            if (r12 == 0) goto L_0x01ac
            r13.write(r12)     // Catch:{ all -> 0x0204 }
        L_0x01ac:
            r13.close()     // Catch:{ all -> 0x0204 }
            int r12 = r10.getResponseCode()     // Catch:{ all -> 0x0204 }
            r13 = 200(0xc8, float:2.8E-43)
            if (r12 != r13) goto L_0x01d2
            java.io.InputStream r11 = r10.getInputStream()     // Catch:{ all -> 0x0204 }
            java.io.InputStream r12 = m5674b(r11)     // Catch:{ all -> 0x01ce }
            byte[] r12 = m5682c(r12)     // Catch:{ all -> 0x01ce }
            if (r11 == 0) goto L_0x01c8
            r11.close()
        L_0x01c8:
            if (r10 == 0) goto L_0x01cd
            r10.disconnect()
        L_0x01cd:
            return r12
        L_0x01ce:
            r12 = move-exception
            r3 = r11
            r11 = r12
            goto L_0x0208
        L_0x01d2:
            r13 = 301(0x12d, float:4.22E-43)
            if (r12 == r13) goto L_0x01f4
            r13 = 302(0x12e, float:4.23E-43)
            if (r12 == r13) goto L_0x01f4
            r13 = 303(0x12f, float:4.25E-43)
            if (r12 != r13) goto L_0x01df
            goto L_0x01f4
        L_0x01df:
            java.io.InputStream r11 = r10.getErrorStream()     // Catch:{ all -> 0x0204 }
            byte[] r13 = m5682c(r11)     // Catch:{ all -> 0x01ce }
            java.lang.String r14 = new java.lang.String     // Catch:{ all -> 0x01ce }
            java.lang.String r0 = "UTF-8"
            r14.<init>(r13, r0)     // Catch:{ all -> 0x01ce }
            java.net.HttpRetryException r13 = new java.net.HttpRetryException     // Catch:{ all -> 0x01ce }
            r13.<init>(r14, r12)     // Catch:{ all -> 0x01ce }
            throw r13     // Catch:{ all -> 0x01ce }
        L_0x01f4:
            java.lang.String r12 = "Location"
            java.lang.String r12 = r10.getHeaderField(r12)     // Catch:{ all -> 0x0204 }
            byte[] r11 = m5680b(r12, r11, r1, r0, r14)     // Catch:{ all -> 0x0204 }
            if (r10 == 0) goto L_0x0203
            r10.disconnect()
        L_0x0203:
            return r11
        L_0x0204:
            r11 = move-exception
            goto L_0x0208
        L_0x0206:
            r11 = move-exception
            r10 = r3
        L_0x0208:
            if (r3 == 0) goto L_0x020d
            r3.close()
        L_0x020d:
            if (r10 == 0) goto L_0x0212
            r10.disconnect()
        L_0x0212:
            throw r11
        L_0x0213:
            return r3
        L_0x0214:
            return r3
        L_0x0215:
            r10 = move-exception
            java.lang.Exception r11 = new java.lang.Exception
            java.lang.String r10 = r10.getMessage()
            r11.<init>(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.core.C1326f.m5667a(java.lang.String, java.lang.Object, boolean, int, com.appnext.base.b.d$a):byte[]");
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0139  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m5680b(java.lang.String r9, java.lang.Object r10, boolean r11, int r12, com.appnext.base.p046b.C1245d.C1246a r13) throws java.io.IOException {
        /*
            java.net.URL r0 = new java.net.URL
            r0.<init>(r9)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "performURLCall "
            r1.<init>(r2)
            r1.append(r9)
            r9 = 0
            java.net.URLConnection r0 = r0.openConnection()     // Catch:{ all -> 0x0130 }
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ all -> 0x0130 }
            r0.setReadTimeout(r12)     // Catch:{ all -> 0x012e }
            r0.setConnectTimeout(r12)     // Catch:{ all -> 0x012e }
            java.lang.String r1 = "Accept-Encoding"
            java.lang.String r2 = "gzip"
            r0.setRequestProperty(r1, r2)     // Catch:{ all -> 0x012e }
            java.lang.String r1 = "User-Agent"
            java.lang.String r2 = f4188kQ     // Catch:{ all -> 0x012e }
            r0.setRequestProperty(r1, r2)     // Catch:{ all -> 0x012e }
            if (r10 == 0) goto L_0x00d0
            r1 = 1
            r0.setDoOutput(r1)     // Catch:{ all -> 0x012e }
            java.lang.String r1 = "POST"
            r0.setRequestMethod(r1)     // Catch:{ all -> 0x012e }
            com.appnext.base.b.d$a r1 = com.appnext.base.p046b.C1245d.C1246a.JSONObject     // Catch:{ all -> 0x012e }
            if (r13 == r1) goto L_0x003d
            com.appnext.base.b.d$a r1 = com.appnext.base.p046b.C1245d.C1246a.JSONArray     // Catch:{ all -> 0x012e }
            if (r13 != r1) goto L_0x0052
        L_0x003d:
            java.lang.String r1 = "Content-Type"
            java.lang.String r2 = "application/json"
            r0.setRequestProperty(r1, r2)     // Catch:{ all -> 0x012e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x012e }
            java.lang.String r2 = "report params "
            r1.<init>(r2)     // Catch:{ all -> 0x012e }
            java.lang.String r2 = r10.toString()     // Catch:{ all -> 0x012e }
            r1.append(r2)     // Catch:{ all -> 0x012e }
        L_0x0052:
            java.io.OutputStream r1 = r0.getOutputStream()     // Catch:{ all -> 0x012e }
            java.io.BufferedWriter r2 = new java.io.BufferedWriter     // Catch:{ all -> 0x012e }
            java.io.OutputStreamWriter r3 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x012e }
            java.lang.String r4 = "UTF-8"
            r3.<init>(r1, r4)     // Catch:{ all -> 0x012e }
            r2.<init>(r3)     // Catch:{ all -> 0x012e }
            com.appnext.base.b.d$a r3 = com.appnext.base.p046b.C1245d.C1246a.JSONArray     // Catch:{ all -> 0x012e }
            if (r13 != r3) goto L_0x0071
            r3 = r10
            org.json.JSONArray r3 = (org.json.JSONArray) r3     // Catch:{ all -> 0x012e }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x012e }
            r2.write(r3)     // Catch:{ all -> 0x012e }
            goto L_0x00c7
        L_0x0071:
            com.appnext.base.b.d$a r3 = com.appnext.base.p046b.C1245d.C1246a.JSONObject     // Catch:{ all -> 0x012e }
            if (r13 != r3) goto L_0x0080
            r3 = r10
            org.json.JSONObject r3 = (org.json.JSONObject) r3     // Catch:{ all -> 0x012e }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x012e }
            r2.write(r3)     // Catch:{ all -> 0x012e }
            goto L_0x00c7
        L_0x0080:
            com.appnext.base.b.d$a r3 = com.appnext.base.p046b.C1245d.C1246a.HashMap     // Catch:{ all -> 0x012e }
            if (r13 != r3) goto L_0x00b9
            r3 = r10
            java.util.HashMap r3 = (java.util.HashMap) r3     // Catch:{ all -> 0x012e }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x012e }
            r4.<init>()     // Catch:{ all -> 0x012e }
            java.util.Set r3 = r3.entrySet()     // Catch:{ all -> 0x012e }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x012e }
        L_0x0094:
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x012e }
            if (r5 == 0) goto L_0x00b1
            java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x012e }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ all -> 0x012e }
            android.util.Pair r6 = new android.util.Pair     // Catch:{ all -> 0x012e }
            java.lang.Object r7 = r5.getKey()     // Catch:{ all -> 0x012e }
            java.lang.Object r5 = r5.getValue()     // Catch:{ all -> 0x012e }
            r6.<init>(r7, r5)     // Catch:{ all -> 0x012e }
            r4.add(r6)     // Catch:{ all -> 0x012e }
            goto L_0x0094
        L_0x00b1:
            java.lang.String r3 = m5678b(r4, r11)     // Catch:{ all -> 0x012e }
            r2.write(r3)     // Catch:{ all -> 0x012e }
            goto L_0x00c7
        L_0x00b9:
            com.appnext.base.b.d$a r3 = com.appnext.base.p046b.C1245d.C1246a.ArrayList     // Catch:{ all -> 0x012e }
            if (r13 != r3) goto L_0x00c7
            r3 = r10
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ all -> 0x012e }
            java.lang.String r3 = m5678b(r3, r11)     // Catch:{ all -> 0x012e }
            r2.write(r3)     // Catch:{ all -> 0x012e }
        L_0x00c7:
            r2.flush()     // Catch:{ all -> 0x012e }
            r2.close()     // Catch:{ all -> 0x012e }
            r1.close()     // Catch:{ all -> 0x012e }
        L_0x00d0:
            int r1 = r0.getResponseCode()     // Catch:{ all -> 0x012e }
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 != r2) goto L_0x00f4
            java.io.InputStream r10 = r0.getInputStream()     // Catch:{ all -> 0x012e }
            java.io.InputStream r9 = m5674b(r10)     // Catch:{ all -> 0x00ef }
            byte[] r9 = m5682c(r9)     // Catch:{ all -> 0x00ef }
            if (r10 == 0) goto L_0x00e9
            r10.close()
        L_0x00e9:
            if (r0 == 0) goto L_0x00ee
            r0.disconnect()
        L_0x00ee:
            return r9
        L_0x00ef:
            r9 = move-exception
            r8 = r10
            r10 = r9
            r9 = r8
            goto L_0x0132
        L_0x00f4:
            r2 = 301(0x12d, float:4.22E-43)
            if (r1 == r2) goto L_0x011e
            r2 = 302(0x12e, float:4.23E-43)
            if (r1 == r2) goto L_0x011e
            r2 = 303(0x12f, float:4.25E-43)
            if (r1 != r2) goto L_0x0101
            goto L_0x011e
        L_0x0101:
            java.lang.String r10 = ""
            java.io.InputStream r11 = r0.getErrorStream()     // Catch:{ all -> 0x012e }
            if (r11 == 0) goto L_0x0118
            byte[] r9 = m5682c(r11)     // Catch:{ all -> 0x0115 }
            java.lang.String r10 = new java.lang.String     // Catch:{ all -> 0x0115 }
            java.lang.String r12 = "UTF-8"
            r10.<init>(r9, r12)     // Catch:{ all -> 0x0115 }
            goto L_0x0118
        L_0x0115:
            r10 = move-exception
            r9 = r11
            goto L_0x0132
        L_0x0118:
            java.net.HttpRetryException r9 = new java.net.HttpRetryException     // Catch:{ all -> 0x0115 }
            r9.<init>(r10, r1)     // Catch:{ all -> 0x0115 }
            throw r9     // Catch:{ all -> 0x0115 }
        L_0x011e:
            java.lang.String r1 = "Location"
            java.lang.String r1 = r0.getHeaderField(r1)     // Catch:{ all -> 0x012e }
            byte[] r10 = m5680b(r1, r10, r11, r12, r13)     // Catch:{ all -> 0x012e }
            if (r0 == 0) goto L_0x012d
            r0.disconnect()
        L_0x012d:
            return r10
        L_0x012e:
            r10 = move-exception
            goto L_0x0132
        L_0x0130:
            r10 = move-exception
            r0 = r9
        L_0x0132:
            if (r9 == 0) goto L_0x0137
            r9.close()
        L_0x0137:
            if (r0 == 0) goto L_0x013c
            r0.disconnect()
        L_0x013c:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.core.C1326f.m5680b(java.lang.String, java.lang.Object, boolean, int, com.appnext.base.b.d$a):byte[]");
    }

    /* renamed from: b */
    public static InputStream m5674b(InputStream inputStream) throws IOException {
        PushbackInputStream pushbackInputStream = new PushbackInputStream(inputStream, 2);
        byte[] bArr = new byte[2];
        try {
            pushbackInputStream.unread(bArr, 0, pushbackInputStream.read(bArr));
            return (bArr[0] == 31 && bArr[1] == -117) ? new GZIPInputStream(pushbackInputStream) : pushbackInputStream;
        } catch (Throwable unused) {
            return inputStream;
        }
    }

    /* renamed from: c */
    private static byte[] m5682c(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[C1245d.f3947iP];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                inputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0087, code lost:
        r4 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008a, code lost:
        r0.disconnect();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0042 */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0071 A[SYNTHETIC, Splitter:B:25:0x0071] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0087 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x0001] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0091  */
    /* renamed from: aL */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap m5671aL(java.lang.String r4) {
        /*
            r0 = 0
            java.util.HashMap<java.lang.String, android.graphics.Bitmap> r1 = f4187kP     // Catch:{ Throwable -> 0x008e, all -> 0x0087 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ Throwable -> 0x008e, all -> 0x0087 }
            if (r1 == 0) goto L_0x0012
            java.util.HashMap<java.lang.String, android.graphics.Bitmap> r1 = f4187kP     // Catch:{ Throwable -> 0x008e, all -> 0x0087 }
            java.lang.Object r4 = r1.get(r4)     // Catch:{ Throwable -> 0x008e, all -> 0x0087 }
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4     // Catch:{ Throwable -> 0x008e, all -> 0x0087 }
            return r4
        L_0x0012:
            java.util.HashMap<java.lang.String, android.graphics.Bitmap> r1 = f4187kP     // Catch:{ Throwable -> 0x008e, all -> 0x0087 }
            java.util.Set r1 = r1.keySet()     // Catch:{ Throwable -> 0x008e, all -> 0x0087 }
            int r1 = r1.size()     // Catch:{ Throwable -> 0x008e, all -> 0x0087 }
            r2 = 50
            if (r1 <= r2) goto L_0x0042
            java.util.HashMap<java.lang.String, android.graphics.Bitmap> r1 = f4187kP     // Catch:{ Throwable -> 0x008e, all -> 0x0087 }
            java.util.Set r1 = r1.keySet()     // Catch:{ Throwable -> 0x0042, all -> 0x0087 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Throwable -> 0x0042, all -> 0x0087 }
        L_0x002a:
            boolean r2 = r1.hasNext()     // Catch:{ Throwable -> 0x0042, all -> 0x0087 }
            if (r2 == 0) goto L_0x0042
            r1.next()     // Catch:{ Throwable -> 0x0042, all -> 0x0087 }
            java.util.Random r2 = new java.util.Random     // Catch:{ Throwable -> 0x0042, all -> 0x0087 }
            r2.<init>()     // Catch:{ Throwable -> 0x0042, all -> 0x0087 }
            boolean r2 = r2.nextBoolean()     // Catch:{ Throwable -> 0x0042, all -> 0x0087 }
            if (r2 == 0) goto L_0x002a
            r1.remove()     // Catch:{ Throwable -> 0x0042, all -> 0x0087 }
            goto L_0x002a
        L_0x0042:
            java.net.URL r1 = new java.net.URL     // Catch:{ Throwable -> 0x008e, all -> 0x0087 }
            r1.<init>(r4)     // Catch:{ Throwable -> 0x008e, all -> 0x0087 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x008e, all -> 0x0087 }
            java.lang.String r3 = "performURLCall "
            r2.<init>(r3)     // Catch:{ Throwable -> 0x008e, all -> 0x0087 }
            r2.append(r4)     // Catch:{ Throwable -> 0x008e, all -> 0x0087 }
            java.net.URLConnection r1 = r1.openConnection()     // Catch:{ Throwable -> 0x008e, all -> 0x0087 }
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ Throwable -> 0x008e, all -> 0x0087 }
            r2 = 1
            r1.setDoInput(r2)     // Catch:{ Throwable -> 0x008f, all -> 0x0084 }
            r1.connect()     // Catch:{ Throwable -> 0x008f, all -> 0x0084 }
            java.io.InputStream r2 = r1.getInputStream()     // Catch:{ Throwable -> 0x008f, all -> 0x0084 }
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeStream(r2)     // Catch:{ Throwable -> 0x008f, all -> 0x0084 }
            r2.close()     // Catch:{ Throwable -> 0x008f, all -> 0x0084 }
            if (r3 != 0) goto L_0x0071
            if (r1 == 0) goto L_0x0070
            r1.disconnect()
        L_0x0070:
            return r0
        L_0x0071:
            java.util.HashMap<java.lang.String, android.graphics.Bitmap> r2 = f4187kP     // Catch:{ Throwable -> 0x008f, all -> 0x0084 }
            boolean r2 = r2.containsKey(r4)     // Catch:{ Throwable -> 0x008f, all -> 0x0084 }
            if (r2 != 0) goto L_0x007e
            java.util.HashMap<java.lang.String, android.graphics.Bitmap> r2 = f4187kP     // Catch:{ Throwable -> 0x008f, all -> 0x0084 }
            r2.put(r4, r3)     // Catch:{ Throwable -> 0x008f, all -> 0x0084 }
        L_0x007e:
            if (r1 == 0) goto L_0x0083
            r1.disconnect()
        L_0x0083:
            return r3
        L_0x0084:
            r4 = move-exception
            r0 = r1
            goto L_0x0088
        L_0x0087:
            r4 = move-exception
        L_0x0088:
            if (r0 == 0) goto L_0x008d
            r0.disconnect()
        L_0x008d:
            throw r4
        L_0x008e:
            r1 = r0
        L_0x008f:
            if (r1 == 0) goto L_0x0094
            r1.disconnect()
        L_0x0094:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.core.C1326f.m5671aL(java.lang.String):android.graphics.Bitmap");
    }

    /* renamed from: d */
    private static void m5689d(HashMap<String, Bitmap> hashMap) {
        try {
            Iterator it = hashMap.keySet().iterator();
            while (it.hasNext()) {
                it.next();
                if (new Random().nextBoolean()) {
                    it.remove();
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    private static String m5678b(List<Pair<String, String>> list, boolean z) {
        StringBuilder sb = new StringBuilder();
        boolean z2 = true;
        for (Pair pair : list) {
            try {
                if (pair.first != null) {
                    if (pair.second != null) {
                        StringBuilder sb2 = new StringBuilder();
                        if (z2) {
                            z2 = false;
                        } else {
                            sb2.append("&");
                        }
                        if (z) {
                            sb2.append(URLEncoder.encode(URLDecoder.decode((String) pair.first, C2793C.UTF8_NAME), C2793C.UTF8_NAME));
                            sb2.append("=");
                            sb2.append(URLEncoder.encode(URLDecoder.decode((String) pair.second, C2793C.UTF8_NAME), C2793C.UTF8_NAME));
                        } else {
                            sb2.append(URLEncoder.encode((String) pair.first, C2793C.UTF8_NAME));
                            sb2.append("=");
                            sb2.append(URLEncoder.encode((String) pair.second, C2793C.UTF8_NAME));
                        }
                        StringBuilder sb3 = new StringBuilder("params: key: ");
                        sb3.append((String) pair.first);
                        sb3.append(" value: ");
                        sb3.append((String) pair.second);
                        sb.append(sb2);
                    }
                }
            } catch (Throwable unused) {
            }
        }
        new StringBuilder("raw params: ").append(sb.toString());
        return sb.toString();
    }

    /* renamed from: a */
    public static int m5657a(Context context, float f) {
        return (int) (f * (((float) context.getResources().getDisplayMetrics().densityDpi) / 160.0f));
    }

    /* renamed from: a */
    public static void m5665a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        final String str10 = str6;
        try {
            if (str10.equals(C1066a.f3526cL) || str10.equals(C1066a.f3530cP)) {
                final String str11 = str5;
                final String str12 = str;
                final String str13 = str2;
                final String str14 = str3;
                final String str15 = str4;
                final String str16 = str7;
                final String str17 = str8;
                final String str18 = str9;
                C13282 r0 = new Runnable() {
                    /* JADX WARNING: Failed to process nested try/catch */
                    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0015 */
                    /* JADX WARNING: Removed duplicated region for block: B:10:0x005c  */
                    /* JADX WARNING: Removed duplicated region for block: B:11:0x005f  */
                    /* JADX WARNING: Removed duplicated region for block: B:14:0x006f  */
                    /* JADX WARNING: Removed duplicated region for block: B:15:0x0072  */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void run() {
                        /*
                            r6 = this;
                            java.lang.String r0 = ""
                            java.lang.String r1 = ""
                            java.lang.String r2 = r1     // Catch:{ Throwable -> 0x0015 }
                            java.lang.String r3 = " "
                            java.lang.String r4 = "_"
                            java.lang.String r2 = r2.replace(r3, r4)     // Catch:{ Throwable -> 0x0015 }
                            java.lang.String r3 = "UTF-8"
                            java.lang.String r2 = java.net.URLEncoder.encode(r2, r3)     // Catch:{ Throwable -> 0x0015 }
                            r0 = r2
                        L_0x0015:
                            java.lang.String r2 = r2     // Catch:{ Throwable -> 0x0026 }
                            java.lang.String r3 = " "
                            java.lang.String r4 = "_"
                            java.lang.String r2 = r2.replace(r3, r4)     // Catch:{ Throwable -> 0x0026 }
                            java.lang.String r3 = "UTF-8"
                            java.lang.String r2 = java.net.URLEncoder.encode(r2, r3)     // Catch:{ Throwable -> 0x0026 }
                            r1 = r2
                        L_0x0026:
                            java.lang.String r2 = "https://admin.appnext.com/tp12.aspx?tid=%s&vid=%s&osid=%s&auid=%s&session_id=%s&pid=%s&ref=%s&ads_type=%s&bid=%s&cid=%s"
                            r3 = 10
                            java.lang.Object[] r3 = new java.lang.Object[r3]
                            r4 = 0
                            java.lang.String r5 = r3
                            r3[r4] = r5
                            r4 = 1
                            java.lang.String r5 = r4
                            r3[r4] = r5
                            r4 = 2
                            java.lang.String r5 = "100"
                            r3[r4] = r5
                            r4 = 3
                            java.lang.String r5 = r5
                            r3[r4] = r5
                            r4 = 4
                            r3[r4] = r0
                            r0 = 5
                            java.lang.String r4 = r6
                            r3[r0] = r4
                            r0 = 6
                            r3[r0] = r1
                            r0 = 7
                            java.lang.String r1 = r7
                            r3[r0] = r1
                            r0 = 8
                            java.lang.String r1 = r8
                            java.lang.String r4 = ""
                            boolean r1 = r1.equals(r4)
                            if (r1 == 0) goto L_0x005f
                            java.lang.String r1 = "0"
                            goto L_0x0061
                        L_0x005f:
                            java.lang.String r1 = r8
                        L_0x0061:
                            r3[r0] = r1
                            r0 = 9
                            java.lang.String r1 = r9
                            java.lang.String r4 = ""
                            boolean r1 = r1.equals(r4)
                            if (r1 == 0) goto L_0x0072
                            java.lang.String r1 = "0"
                            goto L_0x0074
                        L_0x0072:
                            java.lang.String r1 = r9
                        L_0x0074:
                            r3[r0] = r1
                            java.lang.String r0 = java.lang.String.format(r2, r3)
                            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0089 }
                            java.lang.String r2 = "report: "
                            r1.<init>(r2)     // Catch:{ Throwable -> 0x0089 }
                            r1.append(r0)     // Catch:{ Throwable -> 0x0089 }
                            r1 = 0
                            com.appnext.core.C1326f.m5659a(r0, r1)     // Catch:{ Throwable -> 0x0089 }
                            return
                        L_0x0089:
                            r0 = move-exception
                            java.lang.StringBuilder r1 = new java.lang.StringBuilder
                            java.lang.String r2 = "report error: "
                            r1.<init>(r2)
                            java.lang.String r0 = r0.getMessage()
                            r1.append(r0)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.appnext.core.C1326f.C13282.run():void");
                    }
                };
                new Thread(r0).start();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private static void m5663a(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        try {
            final Context context2 = context;
            final String str9 = str;
            final String str10 = str2;
            final String str11 = str3;
            final String str12 = str4;
            final String str13 = str5;
            final String str14 = str6;
            final String str15 = str7;
            final String str16 = str8;
            C13293 r1 = new Runnable() {
                public final void run() {
                    String str;
                    try {
                        str = C1326f.m5701x(context2);
                    } catch (Throwable unused) {
                        str = "";
                    }
                    C1326f.m5665a(str9, str10, str11, str12, str, str13, str14, str15, str16);
                }
            };
            new Thread(r1).start();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m5664a(C1286Ad ad, AppnextAd appnextAd, String str, String str2, C1345p pVar) {
        final C1345p pVar2 = pVar;
        final C1286Ad ad2 = ad;
        final AppnextAd appnextAd2 = appnextAd;
        final String str3 = str2;
        final String str4 = str;
        C13304 r1 = new Runnable() {
            public final void run() {
                try {
                    if (Boolean.parseBoolean(pVar2.get("stp_flag"))) {
                        ArrayList arrayList = new ArrayList();
                        StringBuilder sb = new StringBuilder();
                        sb.append(System.currentTimeMillis());
                        arrayList.add(new Pair("client_date", sb.toString()));
                        arrayList.add(new Pair("did", C1326f.m5675b(ad2.getContext(), true)));
                        arrayList.add(new Pair("session_id", appnextAd2.getSession()));
                        arrayList.add(new Pair("tid", ad2.getTID()));
                        arrayList.add(new Pair("vid", ad2.getVID()));
                        arrayList.add(new Pair("auid", ad2.getAUID()));
                        arrayList.add(new Pair("osid", "100"));
                        arrayList.add(new Pair("tem_id", str3));
                        arrayList.add(new Pair("pid", ad2.getPlacementID()));
                        arrayList.add(new Pair("banner_id", appnextAd2.getBannerID()));
                        arrayList.add(new Pair("cm_id", appnextAd2.getCampaignID()));
                        arrayList.add(new Pair("event_name", str4));
                        arrayList.add(new Pair("package_id", ad2.getContext().getPackageName()));
                        C1326f.m5658a("https://global.appnext.com/stp.aspx", arrayList, 8000);
                    }
                } catch (Throwable unused) {
                }
            }
        };
        new Thread(r1).start();
    }

    /* renamed from: i */
    public static boolean m5694i(Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo(str, 128);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: n */
    public static String m5695n(String str, String str2) {
        String[] split;
        String str3 = "";
        String cookie = android.webkit.CookieManager.getInstance().getCookie(str);
        if (cookie == null) {
            return "";
        }
        for (String str4 : cookie.split(";")) {
            if (str4.contains(str2)) {
                String[] split2 = str4.split("=");
                if (split2.length <= 1) {
                    return "";
                }
                str3 = split2[1];
            }
        }
        return str3;
    }

    /* renamed from: u */
    public static String m5698u(Context context) {
        if (context.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) != 0) {
            return "Unknown";
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return "-";
        }
        if (activeNetworkInfo.getType() == 1) {
            return "wifi";
        }
        if (activeNetworkInfo.getType() != 0) {
            return "Unknown";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(activeNetworkInfo.getSubtype());
        return sb.toString();
    }

    /* renamed from: v */
    public static String m5699v(Context context) {
        if (context == null) {
            return "Unknown";
        }
        if (context.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) != 0) {
            return "Unknown";
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return "-";
        }
        if (activeNetworkInfo.getType() == 1) {
            return "wifi";
        }
        if (activeNetworkInfo.getType() != 0) {
            return "Unknown";
        }
        switch (activeNetworkInfo.getSubtype()) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return "2G";
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return "3G";
            case 13:
                return "4G";
            default:
                return "Unknown";
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x004d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0050 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0051 A[RETURN] */
    /* renamed from: aM */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m5672aM(java.lang.String r7) {
        /*
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r7 = r7.toLowerCase(r0)
            int r0 = r7.hashCode()
            r1 = 1653(0x675, float:2.316E-42)
            r2 = 0
            r3 = 1
            r4 = 2
            r5 = 3
            r6 = -1
            if (r0 == r1) goto L_0x003f
            r1 = 1684(0x694, float:2.36E-42)
            if (r0 == r1) goto L_0x0035
            r1 = 1715(0x6b3, float:2.403E-42)
            if (r0 == r1) goto L_0x002b
            r1 = 3649301(0x37af15, float:5.11376E-39)
            if (r0 == r1) goto L_0x0021
            goto L_0x0049
        L_0x0021:
            java.lang.String r0 = "wifi"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0049
            r7 = r5
            goto L_0x004a
        L_0x002b:
            java.lang.String r0 = "4g"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0049
            r7 = r4
            goto L_0x004a
        L_0x0035:
            java.lang.String r0 = "3g"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0049
            r7 = r3
            goto L_0x004a
        L_0x003f:
            java.lang.String r0 = "2g"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0049
            r7 = r2
            goto L_0x004a
        L_0x0049:
            r7 = r6
        L_0x004a:
            switch(r7) {
                case 0: goto L_0x0051;
                case 1: goto L_0x0050;
                case 2: goto L_0x004f;
                case 3: goto L_0x004e;
                default: goto L_0x004d;
            }
        L_0x004d:
            return r6
        L_0x004e:
            return r5
        L_0x004f:
            return r4
        L_0x0050:
            return r3
        L_0x0051:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.core.C1326f.m5672aM(java.lang.String):int");
    }

    /* renamed from: b */
    public static String m5677b(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String obj = stringWriter.toString();
        return obj.length() > 512 ? obj.substring(0, 512) : obj;
    }

    /* renamed from: g */
    public static boolean m5692g(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str) || context.checkPermission(str, Process.myPid(), Process.myUid()) != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: w */
    public static String m5700w(Context context) {
        String str = "";
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager.getSimState() != 5) {
            return str;
        }
        String simOperator = telephonyManager.getSimOperator();
        StringBuilder sb = new StringBuilder();
        sb.append(simOperator.substring(0, 3));
        sb.append("_");
        sb.append(simOperator.substring(3));
        return sb.toString();
    }

    /* renamed from: cg */
    public static String m5688cg() {
        return Locale.getDefault().getLanguage();
    }

    /* renamed from: x */
    public static String m5701x(Context context) {
        if (f4190kS.equals("")) {
            synchronized ("2.4.5.472") {
                if (f4190kS.equals("")) {
                    f4190kS = m5702y(context);
                }
            }
        }
        return f4190kS;
    }

    /* renamed from: aN */
    private static String m5673aN(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.reset();
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            int length = digest.length;
            StringBuilder sb = new StringBuilder(length << 1);
            for (int i = 0; i < length; i++) {
                sb.append(Character.forDigit((digest[i] & 240) >> 4, 16));
                sb.append(Character.forDigit(digest[i] & 15, 16));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            return m5693i(32);
        }
    }

    /* renamed from: i */
    private static String m5693i(int i) {
        char[] charArray = "0123456789abcdef".toCharArray();
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < 32; i2++) {
            sb.append(charArray[random.nextInt(charArray.length)]);
        }
        return sb.toString();
    }

    /* renamed from: N */
    public static String m5655N(String str) {
        String substring = str.substring(str.lastIndexOf("/") + 1);
        if (substring.contains("?")) {
            substring = substring.substring(0, substring.indexOf("?"));
        }
        try {
            String queryParameter = Uri.parse(str).getQueryParameter("rnd");
            if (queryParameter == null || queryParameter.equals("")) {
                return substring;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(substring.substring(0, substring.lastIndexOf(46)));
            sb.append("_");
            sb.append(queryParameter);
            sb.append(substring.substring(substring.lastIndexOf(46)));
            return sb.toString();
        } catch (Throwable unused) {
            return substring;
        }
    }

    /* renamed from: f */
    public static String m5691f(AppnextAd appnextAd) {
        String str;
        StringBuilder sb = new StringBuilder("https://www.appnext.com/privacy_policy/index.html?z=");
        sb.append(new Random().nextInt(10));
        sb.append(appnextAd.getZoneID());
        sb.append(new Random().nextInt(10));
        if (appnextAd.isGdpr()) {
            StringBuilder sb2 = new StringBuilder("&edda=1&geo=");
            sb2.append(appnextAd.getCountry());
            str = sb2.toString();
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: z */
    public static boolean m5703z(Context context) {
        try {
            if (context.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) != 0) {
                m5659a("http://www.appnext.com/myid.html", null);
            } else {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    if (!activeNetworkInfo.isConnected()) {
                    }
                }
                throw new IOException();
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: cH */
    public static String m5687cH() {
        String[] split = "2.4.5.472".split("\\.");
        if (split.length < 4) {
            return "2.4.5.472";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            sb.append(split[i]);
            if (i < 2) {
                sb.append(".");
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static void m5679b(File file) {
        if (file.isDirectory()) {
            for (File b : file.listFiles()) {
                m5679b(b);
            }
        }
        file.delete();
    }

    /* renamed from: y */
    public static String m5702y(Context context) {
        String b = m5675b(context, true);
        if (b.equals("")) {
            return m5693i(32);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(b);
        sb.append("_");
        sb.append(System.currentTimeMillis() / 1000);
        return m5673aN(sb.toString());
    }
}
