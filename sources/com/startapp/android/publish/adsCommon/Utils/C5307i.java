package com.startapp.android.publish.adsCommon.Utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Base64;
import android.util.Log;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.appnext.core.C1286Ad;
import com.facebook.ads.AudienceNetworkActivity;
import com.startapp.android.publish.GeneratedConstants;
import com.startapp.android.publish.adsCommon.AdsConstants;
import com.startapp.android.publish.adsCommon.C5414k;
import com.startapp.android.publish.adsCommon.p182f.C5376d;
import com.startapp.android.publish.adsCommon.p182f.C5378f;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.common.C5552e;
import com.startapp.common.p193a.C5509c;
import com.startapp.common.p193a.C5518g;
import com.startapp.common.p196c.C5544b;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.startapp.android.publish.adsCommon.Utils.i */
/* compiled from: StartAppSDK */
public class C5307i {

    /* renamed from: a */
    protected static int f17041a = 0;

    /* renamed from: b */
    private static Map<Activity, Integer> f17042b = new WeakHashMap();

    /* renamed from: c */
    private static boolean f17043c = false;

    /* renamed from: com.startapp.android.publish.adsCommon.Utils.i$a */
    /* compiled from: StartAppSDK */
    public interface C5312a {
        /* renamed from: a */
        void mo19638a();

        /* renamed from: a */
        void mo19639a(String str);
    }

    /* renamed from: a */
    public static boolean m22673a() {
        return new BigInteger(AdsConstants.f17012i, 10).intValue() == 0;
    }

    /* renamed from: b */
    public static String m22679b() {
        String str = GeneratedConstants.INAPP_VERSION;
        if (str.equals("${version}")) {
            str = "0";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SDK version: [");
        sb.append(str);
        sb.append("]");
        C5518g.m23561a(3, sb.toString());
        return str;
    }

    /* renamed from: c */
    public static String m22683c() {
        String str = GeneratedConstants.INAPP_FLAVOR;
        if (str.equals("${flavor}")) {
            str = GeneratedConstants.INAPP_FLAVOR;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SDK Flavor: [");
        sb.append(str);
        sb.append("]");
        C5518g.m23561a(3, sb.toString());
        return str;
    }

    /* renamed from: d */
    public static String m22685d() {
        String str = GeneratedConstants.INAPP_PACKAGING;
        return str.equals("${packaging}") ? "" : str;
    }

    /* renamed from: a */
    public static boolean m22674a(long j) {
        String str = AdsConstants.f17012i;
        boolean z = true;
        if (str.equals("${flavor}")) {
            return true;
        }
        if ((new BigInteger(str, 2).longValue() & j) == 0) {
            z = false;
        }
        return z;
    }

    /* renamed from: e */
    public static boolean m22687e() {
        return m22674a(2) || m22674a(16) || m22674a(32) || m22674a(4);
    }

    /* renamed from: a */
    public static String m22658a(Double d) {
        if (d == null) {
            return null;
        }
        return String.format(Locale.US, "%.2f", new Object[]{d});
    }

    /* renamed from: a */
    public static boolean m22675a(Context context) {
        if (AdsConstants.OVERRIDE_HOST != null || AdsConstants.OVERRIDE_NETWORK.booleanValue()) {
            return true;
        }
        if (C5509c.m23516a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            try {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    return false;
                }
                return true;
            } catch (Exception e) {
                C5378f.m23016a(context, C5376d.EXCEPTION, "Util.isNetworkAvailable - system service failed", e.getMessage(), "");
                return false;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static void m22667a(Editor editor) {
        C5509c.m23507a(editor);
    }

    /* renamed from: a */
    public static String m22659a(String str, String str2, String str3) {
        if (str == null || str2 == null || str3 == null) {
            return null;
        }
        int indexOf = str.indexOf(str2);
        if (indexOf != -1) {
            int indexOf2 = str.indexOf(str3, str2.length() + indexOf);
            if (indexOf2 != -1) {
                return str.substring(indexOf + str2.length(), indexOf2);
            }
        }
        return null;
    }

    /* renamed from: b */
    public static String m22680b(Context context) {
        if (context.getResources().getConfiguration().orientation == 2) {
            return C1286Ad.ORIENTATION_LANDSCAPE;
        }
        return context.getResources().getConfiguration().orientation == 1 ? C1286Ad.ORIENTATION_PORTRAIT : "undefined";
    }

    /* renamed from: a */
    public static int m22651a(Activity activity, int i, boolean z) {
        if (z) {
            if (!f17042b.containsKey(activity)) {
                f17042b.put(activity, Integer.valueOf(activity.getRequestedOrientation()));
            }
            if (i == activity.getResources().getConfiguration().orientation) {
                return C5509c.m23498a(activity, i, false);
            }
            return C5509c.m23498a(activity, i, true);
        }
        int i2 = -1;
        if (f17042b.containsKey(activity)) {
            i2 = ((Integer) f17042b.get(activity)).intValue();
            C5509c.m23506a(activity, i2);
            f17042b.remove(activity);
        }
        return i2;
    }

    /* renamed from: a */
    public static void m22662a(Activity activity, boolean z) {
        m22651a(activity, activity.getResources().getConfiguration().orientation, z);
    }

    /* renamed from: a */
    private static List<Field> m22660a(Class cls) {
        return m22661a((List<Field>) new LinkedList<Field>(), cls);
    }

    /* renamed from: a */
    private static List<Field> m22661a(List<Field> list, Class<?> cls) {
        list.addAll(Arrays.asList(cls.getDeclaredFields()));
        if (cls.getSuperclass() != null) {
            m22661a(list, cls.getSuperclass());
        }
        return list;
    }

    /* renamed from: a */
    public static <T> boolean m22678a(T t, T t2) {
        boolean z = false;
        try {
            for (Field field : m22660a(t2.getClass())) {
                int modifiers = field.getModifiers();
                if (!Modifier.isTransient(modifiers)) {
                    if (!Modifier.isStatic(modifiers)) {
                        field.setAccessible(true);
                        if (field.get(t) == null) {
                            Object obj = field.get(t2);
                            if (obj != null) {
                                field.set(t, obj);
                                z = true;
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Util.mergeDefaultValues failed: ");
            sb.append(e.getMessage());
            C5518g.m23561a(3, sb.toString());
        }
        return z;
    }

    /* renamed from: a */
    public static void m22664a(Context context, AdPreferences adPreferences) {
        String a = C5414k.m23096a(context, "shared_prefs_devId", (String) null);
        String a2 = C5414k.m23096a(context, "shared_prefs_appId", (String) null);
        if (adPreferences.getPublisherId() == null) {
            adPreferences.setPublisherId(a);
        }
        if (adPreferences.getProductId() == null) {
            adPreferences.setProductId(a2);
        }
        if (adPreferences.getProductId() == null && !f17043c) {
            f17043c = true;
            Log.e("StartApp", "Integration Error - App ID is missing");
        }
    }

    /* renamed from: a */
    public static void m22666a(Context context, String str, String str2) {
        if (str != null) {
            C5414k.m23103b(context, "shared_prefs_devId", str.trim());
        } else {
            C5414k.m23103b(context, "shared_prefs_devId", (String) null);
        }
        C5414k.m23103b(context, "shared_prefs_appId", str2.trim());
    }

    /* renamed from: a */
    public static void m22665a(Context context, String str, final C5312a aVar) {
        if ("true".equals(m22659a(str, "@doNotRender@", "@doNotRender@"))) {
            aVar.mo19638a();
            return;
        }
        try {
            final WebView webView = new WebView(context);
            final Handler handler = new Handler();
            if (AdsConstants.OVERRIDE_NETWORK.booleanValue()) {
                f17041a = 25000;
                webView.getSettings().setBlockNetworkImage(false);
                webView.getSettings().setLoadsImagesAutomatically(true);
                webView.getSettings().setJavaScriptEnabled(true);
            } else {
                f17041a = 0;
            }
            webView.setWebChromeClient(new WebChromeClient());
            webView.setWebViewClient(new WebViewClient() {
                public void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    StringBuilder sb = new StringBuilder();
                    sb.append("onPageFinished url=[");
                    sb.append(str);
                    sb.append("]");
                    C5518g.m23563a("StartAppWall.Util", 4, sb.toString());
                    handler.removeCallbacksAndMessages(null);
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            webView.destroy();
                            C5518g.m23563a("StartAppWall.Util", 4, "webview destroyed");
                            aVar.mo19638a();
                        }
                    }, (long) C5307i.f17041a);
                }

                public void onReceivedError(final WebView webView, int i, final String str, String str2) {
                    super.onReceivedError(webView, i, str, str2);
                    StringBuilder sb = new StringBuilder();
                    sb.append("onReceivedError failingUrl=[");
                    sb.append(str2);
                    sb.append("], description=[");
                    sb.append(str);
                    sb.append("]");
                    C5518g.m23563a("StartAppWall.Util", 6, sb.toString());
                    handler.removeCallbacksAndMessages(null);
                    handler.post(new Runnable() {
                        public void run() {
                            webView.destroy();
                            aVar.mo19639a(str);
                        }
                    });
                }

                public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("shouldOverrideUrlLoading url=[");
                    sb.append(str);
                    sb.append("]");
                    C5518g.m23563a("StartAppWall.Util", 4, sb.toString());
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            });
            m22663a(context, webView, str);
            C5518g.m23563a("StartAppWall.Util", 4, "Data loaded to webview");
            handler.postDelayed(new Runnable() {
                public void run() {
                    webView.destroy();
                    aVar.mo19638a();
                    C5518g.m23563a("StartAppWall.Util", 4, "webview destroyed pos 2");
                }
            }, 25000);
        } catch (Exception e) {
            C5378f.m23016a(context, C5376d.EXCEPTION, "Util.loadHtmlToCacheWebView - webview failed", e.getMessage(), "");
            aVar.mo19639a("WebView instantiation Error");
        }
    }

    /* renamed from: a */
    public static void m22663a(Context context, WebView webView, String str) {
        try {
            webView.loadDataWithBaseURL(MetaData.getInstance().getHostForWebview(), str, AudienceNetworkActivity.WEBVIEW_MIME_TYPE, AudienceNetworkActivity.WEBVIEW_ENCODING, null);
        } catch (Exception e) {
            if (context != null) {
                C5378f.m23016a(context, C5376d.EXCEPTION, "Util.loadDataToWebview failed", e.getMessage(), "");
            }
            C5518g.m23561a(6, "StartAppWall.UtilError while encoding html");
        }
    }

    /* renamed from: c */
    public static String m22684c(Context context) {
        String str = "";
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 0);
            if (resolveActivity == null || resolveActivity.activityInfo == null) {
                return str;
            }
            String str2 = resolveActivity.activityInfo.packageName;
            if (str2 != null) {
                try {
                    return str2.toLowerCase();
                } catch (Exception unused) {
                }
            }
            return str2;
        } catch (Exception unused2) {
            return str;
        }
    }

    /* renamed from: a */
    public static boolean m22677a(AdPreferences adPreferences, String str) {
        Object a = m22655a(adPreferences.getClass(), str, (Object) adPreferences);
        if (a == null || !(a instanceof Boolean)) {
            return false;
        }
        return ((Boolean) a).booleanValue();
    }

    /* renamed from: b */
    public static String m22681b(AdPreferences adPreferences, String str) {
        Object a = m22655a(adPreferences.getClass(), str, (Object) adPreferences);
        if (a == null || !(a instanceof String)) {
            return null;
        }
        return (String) a;
    }

    /* renamed from: a */
    public static void m22670a(AdPreferences adPreferences, String str, boolean z) {
        m22671a(adPreferences.getClass(), str, (Object) adPreferences, (Object) Boolean.valueOf(z));
    }

    /* renamed from: a */
    public static Object m22655a(Class cls, String str, Object obj) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(obj);
        } catch (NoSuchFieldException e) {
            C5518g.m23563a("StartAppWall.Util", 6, e.getLocalizedMessage());
            return null;
        } catch (IllegalArgumentException e2) {
            C5518g.m23563a("StartAppWall.Util", 6, e2.getLocalizedMessage());
            return null;
        } catch (IllegalAccessException e3) {
            C5518g.m23563a("StartAppWall.Util", 6, e3.getLocalizedMessage());
            return null;
        }
    }

    /* renamed from: a */
    public static void m22671a(Class cls, String str, Object obj, Object obj2) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            declaredField.set(obj, obj2);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
        } catch (IllegalAccessException e3) {
            e3.printStackTrace();
        }
    }

    /* renamed from: d */
    public static String m22686d(Context context) {
        return context.getPackageManager().getInstallerPackageName(context.getPackageName());
    }

    /* renamed from: a */
    public static void m22668a(WebView webView, String str, Object... objArr) {
        m22669a(webView, true, str, objArr);
    }

    /* renamed from: a */
    public static void m22669a(WebView webView, boolean z, String str, Object... objArr) {
        if (webView != null) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("(");
                if (objArr != null) {
                    for (int i = 0; i < objArr.length; i++) {
                        if (!z || !(objArr[i] instanceof String)) {
                            sb.append(objArr[i]);
                        } else {
                            sb.append("\"");
                            sb.append(objArr[i]);
                            sb.append("\"");
                        }
                        if (i < objArr.length - 1) {
                            sb.append(",");
                        }
                    }
                }
                sb.append(")");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("runJavascript: ");
                sb2.append(sb.toString());
                C5518g.m23563a("StartAppWall.Util", 3, sb2.toString());
                StringBuilder sb3 = new StringBuilder();
                sb3.append("javascript:");
                sb3.append(sb.toString());
                webView.loadUrl(sb3.toString());
            } catch (Exception e) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("runJavascript Exception: ");
                sb4.append(e.getMessage());
                C5518g.m23563a("StartAppWall.Util", 6, sb4.toString());
            }
        }
    }

    /* renamed from: a */
    public static Class<?> m22654a(Context context, Class<? extends Activity> cls, Class<? extends Activity> cls2) {
        if (m22676a(context, cls) || !m22676a(context, cls2)) {
            return cls;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected activity ");
        sb.append(cls.getName());
        sb.append(" is missing from AndroidManifest.xml");
        Log.w("StartAppWall.Util", sb.toString());
        return cls2;
    }

    /* renamed from: a */
    public static boolean m22676a(Context context, Class<? extends Activity> cls) {
        try {
            for (ActivityInfo activityInfo : context.getPackageManager().getPackageInfo(context.getPackageName(), 1).activities) {
                if (activityInfo.name.equals(cls.getName())) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m22688e(Context context) {
        for (RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
            if (runningAppProcessInfo.importance == 100 && runningAppProcessInfo.processName.equals(context.getPackageName())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m22689f(Context context) {
        try {
            ActivityInfo[] activityInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 1).activities;
            boolean z = false;
            int i = 0;
            while (!z) {
                try {
                    if (i >= activityInfoArr.length) {
                        return z;
                    }
                    int i2 = i + 1;
                    ActivityInfo activityInfo = activityInfoArr[i];
                    if (activityInfo.name.equals("com.startapp.android.publish.AppWallActivity") || activityInfo.name.equals("com.startapp.android.publish.adsCommon.OverlayActivity") || activityInfo.name.equals("com.startapp.android.publish.FullScreenActivity")) {
                        z = (activityInfo.flags & 512) == 0;
                    }
                    i = i2;
                } catch (NameNotFoundException | Exception unused) {
                    return z;
                }
            }
            return z;
        } catch (NameNotFoundException | Exception unused2) {
            return false;
        }
    }

    /* renamed from: a */
    public String mo19631a(String str, Context context) {
        try {
            return new C5509c().mo20485a(str, context);
        } catch (Exception e) {
            C5378f.m23016a(context, C5376d.EXCEPTION, "Util.getApkHash - system service failed", e.getMessage(), "");
            return null;
        }
    }

    /* renamed from: a */
    public static long m22653a(File file, long j) {
        return C5509c.m23500a(file, j);
    }

    /* renamed from: a */
    public static String m22657a(Context context, int i) {
        try {
            Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), i);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            decodeResource.compress(CompressFormat.PNG, 100, byteArrayOutputStream);
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static <T> T m22656a(String str, Class<T> cls) {
        T a = C5544b.m23666a(str, cls);
        if (a != null) {
            return a;
        }
        throw new C5552e();
    }

    /* renamed from: a */
    public static void m22672a(Object obj, long j) {
        new Handler(Looper.getMainLooper()).postAtTime(null, obj, SystemClock.uptimeMillis() + j);
    }

    /* renamed from: a */
    public static int m22652a(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    /* renamed from: b */
    public static <T> boolean m22682b(T t, T t2) {
        if (t == null) {
            return t2 == null;
        }
        return t.equals(t2);
    }
}
