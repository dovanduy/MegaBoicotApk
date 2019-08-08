package com.facebook.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcel;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import android.view.autofill.AutofillManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.appnext.base.p046b.C1244c;
import com.facebook.AccessToken;
import com.facebook.C2579j;
import com.facebook.C2649m;
import com.facebook.C2661r;
import com.facebook.C2662s;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest.C1503b;
import com.google.android.exoplayer2.C2793C;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.TimeZone;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* renamed from: com.facebook.internal.ad */
/* compiled from: Utility */
public final class C2479ad {

    /* renamed from: a */
    private static int f7807a = 0;

    /* renamed from: b */
    private static long f7808b = -1;

    /* renamed from: c */
    private static long f7809c = -1;

    /* renamed from: d */
    private static long f7810d = -1;

    /* renamed from: e */
    private static String f7811e = "";

    /* renamed from: f */
    private static String f7812f = "";

    /* renamed from: g */
    private static String f7813g = "NoCarrier";

    /* renamed from: com.facebook.internal.ad$a */
    /* compiled from: Utility */
    public interface C2482a {
        /* renamed from: a */
        void mo6722a(C2579j jVar);

        /* renamed from: a */
        void mo6723a(JSONObject jSONObject);
    }

    /* renamed from: com.facebook.internal.ad$b */
    /* compiled from: Utility */
    public static class C2483b {

        /* renamed from: a */
        List<String> f7816a;

        /* renamed from: b */
        List<String> f7817b;

        public C2483b(List<String> list, List<String> list2) {
            this.f7816a = list;
            this.f7817b = list2;
        }

        /* renamed from: a */
        public List<String> mo8924a() {
            return this.f7816a;
        }

        /* renamed from: b */
        public List<String> mo8925b() {
            return this.f7817b;
        }
    }

    /* renamed from: a */
    public static <T> boolean m9457a(Collection<T> collection) {
        return collection == null || collection.size() == 0;
    }

    /* renamed from: a */
    public static boolean m9456a(String str) {
        return str == null || str.length() == 0;
    }

    /* renamed from: a */
    public static String m9428a(String str, String str2) {
        return m9456a(str) ? str2 : str;
    }

    /* renamed from: a */
    public static <T> Collection<T> m9435a(T... tArr) {
        return Collections.unmodifiableCollection(Arrays.asList(tArr));
    }

    /* renamed from: b */
    public static String m9459b(String str) {
        return m9467c("MD5", str);
    }

    /* renamed from: a */
    public static String m9432a(byte[] bArr) {
        return m9429a("SHA-1", bArr);
    }

    /* renamed from: c */
    private static String m9467c(String str, String str2) {
        return m9429a(str, str2.getBytes());
    }

    /* renamed from: a */
    private static String m9429a(String str, byte[] bArr) {
        try {
            return m9430a(MessageDigest.getInstance(str), bArr);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static String m9430a(MessageDigest messageDigest, byte[] bArr) {
        messageDigest.update(bArr);
        byte[] digest = messageDigest.digest();
        StringBuilder sb = new StringBuilder();
        for (byte b : digest) {
            sb.append(Integer.toHexString((b >> 4) & 15));
            sb.append(Integer.toHexString((b >> 0) & 15));
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static Uri m9421a(String str, String str2, Bundle bundle) {
        Builder builder = new Builder();
        builder.scheme("https");
        builder.authority(str);
        builder.path(str2);
        if (bundle != null) {
            for (String str3 : bundle.keySet()) {
                Object obj = bundle.get(str3);
                if (obj instanceof String) {
                    builder.appendQueryParameter(str3, (String) obj);
                }
            }
        }
        return builder.build();
    }

    /* renamed from: c */
    public static Bundle m9465c(String str) {
        Bundle bundle = new Bundle();
        if (!m9456a(str)) {
            for (String split : str.split("&")) {
                String[] split2 = split.split("=");
                try {
                    if (split2.length == 2) {
                        bundle.putString(URLDecoder.decode(split2[0], C2793C.UTF8_NAME), URLDecoder.decode(split2[1], C2793C.UTF8_NAME));
                    } else if (split2.length == 1) {
                        bundle.putString(URLDecoder.decode(split2[0], C2793C.UTF8_NAME), "");
                    }
                } catch (UnsupportedEncodingException e) {
                    m9447a("FacebookSDK", (Exception) e);
                }
            }
        }
        return bundle;
    }

    /* renamed from: a */
    public static void m9442a(Bundle bundle, String str, String str2) {
        if (!m9456a(str2)) {
            bundle.putString(str, str2);
        }
    }

    /* renamed from: a */
    public static void m9441a(Bundle bundle, String str, Uri uri) {
        if (uri != null) {
            m9442a(bundle, str, uri.toString());
        }
    }

    /* renamed from: a */
    public static boolean m9453a(Bundle bundle, String str, Object obj) {
        if (obj == null) {
            bundle.remove(str);
        } else if (obj instanceof Boolean) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof boolean[]) {
            bundle.putBooleanArray(str, (boolean[]) obj);
        } else if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof double[]) {
            bundle.putDoubleArray(str, (double[]) obj);
        } else if (obj instanceof Integer) {
            bundle.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof int[]) {
            bundle.putIntArray(str, (int[]) obj);
        } else if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof long[]) {
            bundle.putLongArray(str, (long[]) obj);
        } else if (obj instanceof String) {
            bundle.putString(str, (String) obj);
        } else if (obj instanceof JSONArray) {
            bundle.putString(str, obj.toString());
        } else if (!(obj instanceof JSONObject)) {
            return false;
        } else {
            bundle.putString(str, obj.toString());
        }
        return true;
    }

    /* renamed from: a */
    public static void m9444a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m9449a(URLConnection uRLConnection) {
        if (uRLConnection != null && (uRLConnection instanceof HttpURLConnection)) {
            ((HttpURLConnection) uRLConnection).disconnect();
        }
    }

    /* renamed from: a */
    public static String m9426a(Context context) {
        C2484ae.m9489a((Object) context, "context");
        C2649m.m10121a(context);
        return C2649m.m10137j();
    }

    /* renamed from: a */
    public static Object m9424a(JSONObject jSONObject, String str, String str2) throws JSONException {
        Object opt = jSONObject.opt(str);
        if (opt != null && (opt instanceof String)) {
            opt = new JSONTokener((String) opt).nextValue();
        }
        if (opt == null || (opt instanceof JSONObject) || (opt instanceof JSONArray)) {
            return opt;
        }
        if (str2 != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt(str2, opt);
            return jSONObject2;
        }
        throw new C2579j("Got an unexpected non-JSON object.");
    }

    /* renamed from: a */
    public static String m9427a(InputStream inputStream) throws IOException {
        InputStreamReader inputStreamReader;
        BufferedInputStream bufferedInputStream;
        Throwable th;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                inputStreamReader = new InputStreamReader(bufferedInputStream);
                try {
                    StringBuilder sb = new StringBuilder();
                    char[] cArr = new char[2048];
                    while (true) {
                        int read = inputStreamReader.read(cArr);
                        if (read != -1) {
                            sb.append(cArr, 0, read);
                        } else {
                            String sb2 = sb.toString();
                            m9444a((Closeable) bufferedInputStream);
                            m9444a((Closeable) inputStreamReader);
                            return sb2;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    m9444a((Closeable) bufferedInputStream);
                    m9444a((Closeable) inputStreamReader);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStreamReader = null;
                m9444a((Closeable) bufferedInputStream);
                m9444a((Closeable) inputStreamReader);
                throw th;
            }
        } catch (Throwable th4) {
            bufferedInputStream = null;
            th = th4;
            inputStreamReader = null;
            m9444a((Closeable) bufferedInputStream);
            m9444a((Closeable) inputStreamReader);
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m9419a(java.io.InputStream r6, java.io.OutputStream r7) throws java.io.IOException {
        /*
            r0 = 0
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0025 }
            r1.<init>(r6)     // Catch:{ all -> 0x0025 }
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0023 }
            r2 = 0
            r3 = r2
        L_0x000c:
            int r4 = r1.read(r0)     // Catch:{ all -> 0x0023 }
            r5 = -1
            if (r4 == r5) goto L_0x0018
            r7.write(r0, r2, r4)     // Catch:{ all -> 0x0023 }
            int r3 = r3 + r4
            goto L_0x000c
        L_0x0018:
            if (r1 == 0) goto L_0x001d
            r1.close()
        L_0x001d:
            if (r6 == 0) goto L_0x0022
            r6.close()
        L_0x0022:
            return r3
        L_0x0023:
            r7 = move-exception
            goto L_0x0027
        L_0x0025:
            r7 = move-exception
            r1 = r0
        L_0x0027:
            if (r1 == 0) goto L_0x002c
            r1.close()
        L_0x002c:
            if (r6 == 0) goto L_0x0031
            r6.close()
        L_0x0031:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C2479ad.m9419a(java.io.InputStream, java.io.OutputStream):int");
    }

    /* renamed from: a */
    private static void m9440a(Context context, String str) {
        CookieSyncManager.createInstance(context).sync();
        CookieManager instance = CookieManager.getInstance();
        String cookie = instance.getCookie(str);
        if (cookie != null) {
            for (String split : cookie.split(";")) {
                String[] split2 = split.split("=");
                if (split2.length > 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(split2[0].trim());
                    sb.append("=;expires=Sat, 1 Jan 2000 00:00:01 UTC;");
                    instance.setCookie(str, sb.toString());
                }
            }
            instance.removeExpiredCookie();
        }
    }

    /* renamed from: b */
    public static void m9462b(Context context) {
        m9440a(context, "facebook.com");
        m9440a(context, ".facebook.com");
        m9440a(context, "https://facebook.com");
        m9440a(context, "https://.facebook.com");
    }

    /* renamed from: a */
    public static void m9447a(String str, Exception exc) {
        if (C2649m.m10127b() && str != null && exc != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(exc.getClass().getSimpleName());
            sb.append(": ");
            sb.append(exc.getMessage());
            Log.d(str, sb.toString());
        }
    }

    /* renamed from: b */
    public static void m9463b(String str, String str2) {
        if (C2649m.m10127b() && str != null && str2 != null) {
            Log.d(str, str2);
        }
    }

    /* renamed from: a */
    public static void m9448a(String str, String str2, Throwable th) {
        if (C2649m.m10127b() && !m9456a(str)) {
            Log.d(str, str2, th);
        }
    }

    /* renamed from: a */
    public static <T> boolean m9455a(T t, T t2) {
        if (t != null) {
            return t.equals(t2);
        }
        return t2 == null;
    }

    /* renamed from: a */
    public static String m9431a(JSONObject jSONObject, String str) {
        return jSONObject != null ? jSONObject.optString(str, "") : "";
    }

    /* renamed from: b */
    public static JSONObject m9461b(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(str);
        }
        return null;
    }

    /* renamed from: c */
    public static JSONArray m9468c(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONArray(str);
        }
        return null;
    }

    /* renamed from: a */
    public static void m9445a(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File a : listFiles) {
                        m9445a(a);
                    }
                }
            }
            file.delete();
        }
    }

    /* renamed from: b */
    public static <T> List<T> m9460b(T... tArr) {
        ArrayList arrayList = new ArrayList();
        for (T t : tArr) {
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static List<String> m9437a(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m9451a(JSONObject jSONObject, C2499b bVar, String str, boolean z) throws JSONException {
        if (!(bVar == null || bVar.mo8975a() == null)) {
            jSONObject.put("attribution", bVar.mo8975a());
        }
        if (!(bVar == null || bVar.mo8976b() == null)) {
            jSONObject.put("advertiser_id", bVar.mo8976b());
            jSONObject.put("advertiser_tracking_enabled", !bVar.mo8978d());
        }
        if (!(bVar == null || bVar.mo8977c() == null)) {
            jSONObject.put("installer_package", bVar.mo8977c());
        }
        jSONObject.put("anon_id", str);
        jSONObject.put("application_tracking_enabled", !z);
    }

    /* renamed from: a */
    public static void m9450a(JSONObject jSONObject, Context context) throws JSONException {
        int i;
        Locale locale;
        int i2;
        int i3;
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("a2");
        m9480g(context);
        String packageName = context.getPackageName();
        String str = "";
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            i = packageInfo.versionCode;
            try {
                str = packageInfo.versionName;
            } catch (NameNotFoundException unused) {
            }
        } catch (NameNotFoundException unused2) {
            i = -1;
        }
        jSONArray.put(packageName);
        jSONArray.put(i);
        jSONArray.put(str);
        jSONArray.put(VERSION.RELEASE);
        jSONArray.put(Build.MODEL);
        try {
            locale = context.getResources().getConfiguration().locale;
        } catch (Exception unused3) {
            locale = Locale.getDefault();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(locale.getLanguage());
        sb.append("_");
        sb.append(locale.getCountry());
        jSONArray.put(sb.toString());
        jSONArray.put(f7811e);
        jSONArray.put(f7813g);
        double d = 0.0d;
        try {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                Display defaultDisplay = windowManager.getDefaultDisplay();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                defaultDisplay.getMetrics(displayMetrics);
                i2 = displayMetrics.widthPixels;
                try {
                    i3 = displayMetrics.heightPixels;
                    try {
                        d = (double) displayMetrics.density;
                    } catch (Exception unused4) {
                    }
                } catch (Exception unused5) {
                    i3 = 0;
                }
                jSONArray.put(i2);
                jSONArray.put(i3);
                jSONArray.put(String.format("%.2f", new Object[]{Double.valueOf(d)}));
                jSONArray.put(m9458b());
                jSONArray.put(f7809c);
                jSONArray.put(f7810d);
                jSONArray.put(f7812f);
                jSONObject.put("extinfo", jSONArray.toString());
            }
        } catch (Exception unused6) {
        }
        i2 = 0;
        i3 = 0;
        jSONArray.put(i2);
        jSONArray.put(i3);
        jSONArray.put(String.format("%.2f", new Object[]{Double.valueOf(d)}));
        jSONArray.put(m9458b());
        jSONArray.put(f7809c);
        jSONArray.put(f7810d);
        jSONArray.put(f7812f);
        jSONObject.put("extinfo", jSONArray.toString());
    }

    /* renamed from: a */
    public static Method m9433a(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static Method m9434a(String str, String str2, Class<?>... clsArr) {
        try {
            return m9433a(Class.forName(str), str2, clsArr);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static Object m9423a(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException unused) {
            return null;
        } catch (InvocationTargetException unused2) {
            return null;
        }
    }

    /* renamed from: c */
    public static String m9466c(Context context) {
        if (context == null) {
            return "null";
        }
        if (context == context.getApplicationContext()) {
            return "unknown";
        }
        return context.getClass().getSimpleName();
    }

    /* renamed from: a */
    public static boolean m9452a(Uri uri) {
        return uri != null && ("http".equalsIgnoreCase(uri.getScheme()) || "https".equalsIgnoreCase(uri.getScheme()) || "fbstaging".equalsIgnoreCase(uri.getScheme()));
    }

    /* renamed from: b */
    public static boolean m9464b(Uri uri) {
        return uri != null && "content".equalsIgnoreCase(uri.getScheme());
    }

    /* renamed from: c */
    public static boolean m9470c(Uri uri) {
        return uri != null && "file".equalsIgnoreCase(uri.getScheme());
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002d  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m9471d(android.net.Uri r9) {
        /*
            r0 = 0
            android.content.Context r1 = com.facebook.C2649m.m10133f()     // Catch:{ all -> 0x0027 }
            android.content.ContentResolver r2 = r1.getContentResolver()     // Catch:{ all -> 0x0027 }
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r3 = r9
            android.database.Cursor r9 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0027 }
            java.lang.String r0 = "_size"
            int r0 = r9.getColumnIndex(r0)     // Catch:{ all -> 0x0025 }
            r9.moveToFirst()     // Catch:{ all -> 0x0025 }
            long r0 = r9.getLong(r0)     // Catch:{ all -> 0x0025 }
            if (r9 == 0) goto L_0x0024
            r9.close()
        L_0x0024:
            return r0
        L_0x0025:
            r0 = move-exception
            goto L_0x002b
        L_0x0027:
            r9 = move-exception
            r8 = r0
            r0 = r9
            r9 = r8
        L_0x002b:
            if (r9 == 0) goto L_0x0030
            r9.close()
        L_0x0030:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C2479ad.m9471d(android.net.Uri):long");
    }

    /* renamed from: a */
    public static Date m9436a(Bundle bundle, String str, Date date) {
        long j;
        if (bundle == null) {
            return null;
        }
        Object obj = bundle.get(str);
        if (obj instanceof Long) {
            j = ((Long) obj).longValue();
        } else if (!(obj instanceof String)) {
            return null;
        } else {
            try {
                j = Long.parseLong((String) obj);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        if (j == 0) {
            return new Date(Long.MAX_VALUE);
        }
        return new Date(date.getTime() + (j * 1000));
    }

    /* renamed from: a */
    public static void m9443a(Parcel parcel, Map<String, String> map) {
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }

    /* renamed from: a */
    public static Map<String, String> m9439a(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < readInt; i++) {
            hashMap.put(parcel.readString(), parcel.readString());
        }
        return hashMap;
    }

    /* renamed from: a */
    public static boolean m9454a(AccessToken accessToken) {
        return accessToken != null && accessToken.equals(AccessToken.m6161a());
    }

    /* renamed from: a */
    public static void m9446a(final String str, final C2482a aVar) {
        JSONObject a = C2578z.m9792a(str);
        if (a != null) {
            aVar.mo6723a(a);
            return;
        }
        C24801 r0 = new C1503b() {
            /* renamed from: a */
            public void mo6691a(C2661r rVar) {
                if (rVar.mo9370a() != null) {
                    aVar.mo6722a(rVar.mo9370a().mo6663g());
                    return;
                }
                C2578z.m9793a(str, rVar.mo9371b());
                aVar.mo6723a(rVar.mo9371b());
            }
        };
        GraphRequest e = m9475e(str);
        e.mo6673a((C1503b) r0);
        e.mo6687j();
    }

    /* renamed from: d */
    public static JSONObject m9472d(String str) {
        JSONObject a = C2578z.m9792a(str);
        if (a != null) {
            return a;
        }
        C2661r i = m9475e(str).mo6686i();
        if (i.mo9370a() != null) {
            return null;
        }
        return i.mo9371b();
    }

    /* renamed from: e */
    private static GraphRequest m9475e(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,name,first_name,middle_name,last_name,link");
        bundle.putString("access_token", str);
        GraphRequest graphRequest = new GraphRequest(null, "me", bundle, C2662s.GET, null);
        return graphRequest;
    }

    /* renamed from: b */
    private static int m9458b() {
        if (f7807a > 0) {
            return f7807a;
        }
        try {
            File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(new FilenameFilter() {
                public boolean accept(File file, String str) {
                    return Pattern.matches("cpu[0-9]+", str);
                }
            });
            if (listFiles != null) {
                f7807a = listFiles.length;
            }
        } catch (Exception unused) {
        }
        if (f7807a <= 0) {
            f7807a = Math.max(Runtime.getRuntime().availableProcessors(), 1);
        }
        return f7807a;
    }

    /* renamed from: g */
    private static void m9480g(Context context) {
        if (f7808b == -1 || System.currentTimeMillis() - f7808b >= 1800000) {
            f7808b = System.currentTimeMillis();
            m9469c();
            m9481h(context);
            m9478f();
            m9476e();
        }
    }

    /* renamed from: c */
    private static void m9469c() {
        try {
            TimeZone timeZone = TimeZone.getDefault();
            f7811e = timeZone.getDisplayName(timeZone.inDaylightTime(new Date()), 0);
            f7812f = timeZone.getID();
        } catch (Exception unused) {
        }
    }

    /* renamed from: h */
    private static void m9481h(Context context) {
        if (f7813g.equals("NoCarrier")) {
            try {
                f7813g = ((TelephonyManager) context.getSystemService("phone")).getNetworkOperatorName();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: d */
    private static boolean m9473d() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    /* renamed from: e */
    private static void m9476e() {
        try {
            if (m9473d()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                f7810d = ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
            }
            f7810d = m9420a((double) f7810d);
        } catch (Exception unused) {
        }
    }

    /* renamed from: f */
    private static void m9478f() {
        try {
            if (m9473d()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                f7809c = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
            }
            f7809c = m9420a((double) f7809c);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private static long m9420a(double d) {
        return Math.round(d / 1.073741824E9d);
    }

    /* renamed from: a */
    public static C2483b m9422a(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONObject("permissions").getJSONArray("data");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        ArrayList arrayList2 = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            String optString = optJSONObject.optString("permission");
            if (optString != null && !optString.equals("installed")) {
                String optString2 = optJSONObject.optString(C1244c.STATUS);
                if (optString2 != null) {
                    if (optString2.equals("granted")) {
                        arrayList.add(optString);
                    } else if (optString2.equals("declined")) {
                        arrayList2.add(optString);
                    }
                }
            }
        }
        return new C2483b(arrayList, arrayList2);
    }

    /* renamed from: a */
    public static String m9425a(int i) {
        return new BigInteger(i * 5, new Random()).toString(32);
    }

    /* renamed from: d */
    public static boolean m9474d(Context context) {
        return m9477e(context);
    }

    /* renamed from: e */
    public static boolean m9477e(Context context) {
        boolean z = false;
        if (VERSION.SDK_INT < 26) {
            return false;
        }
        AutofillManager autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class);
        if (autofillManager != null && autofillManager.isAutofillSupported() && autofillManager.isEnabled()) {
            z = true;
        }
        return z;
    }

    /* renamed from: f */
    public static boolean m9479f(Context context) {
        if (VERSION.SDK_INT >= 27) {
            return context.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        }
        return Build.DEVICE != null && Build.DEVICE.matches(".+_cheets|cheets_.+");
    }

    /* renamed from: a */
    public static Locale m9438a() {
        try {
            return C2649m.m10133f().getResources().getConfiguration().locale;
        } catch (Exception unused) {
            return Locale.getDefault();
        }
    }
}
