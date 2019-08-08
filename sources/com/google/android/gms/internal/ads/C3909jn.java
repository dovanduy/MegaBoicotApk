package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager.RunningTaskInfo;
import android.app.AlertDialog.Builder;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Debug;
import android.os.Debug.MemoryInfo;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import com.appnext.base.p046b.C1245d;
import com.google.android.exoplayer2.C2793C;
import com.google.android.gms.ads.internal.C3025aw;
import com.google.android.gms.common.p140b.C3404c;
import com.google.android.gms.common.util.C3555g;
import com.google.android.gms.common.util.C3559k;
import com.google.android.gms.common.util.C3563o;
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.jn */
public final class C3909jn {

    /* renamed from: a */
    public static final Handler f13411a = new C3901jf(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f13412b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f13413c = true;
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: d */
    public String f13414d;

    /* renamed from: e */
    private boolean f13415e = false;

    /* renamed from: f */
    private boolean f13416f = false;
    @GuardedBy("this")

    /* renamed from: g */
    private Pattern f13417g;
    @GuardedBy("this")

    /* renamed from: h */
    private Pattern f13418h;

    /* renamed from: a */
    public static Bitmap m17122a(View view) {
        view.setDrawingCacheEnabled(true);
        Bitmap createBitmap = Bitmap.createBitmap(view.getDrawingCache());
        view.setDrawingCacheEnabled(false);
        return createBitmap;
    }

    /* renamed from: a */
    public static Bundle m17123a(alc alc) {
        String str;
        String str2;
        String str3;
        if (alc == null) {
            return null;
        }
        if (!((Boolean) aoq.m14620f().mo14695a(aru.f11771W)).booleanValue()) {
            if (!((Boolean) aoq.m14620f().mo14695a(aru.f11773Y)).booleanValue()) {
                return null;
            }
        }
        if (C3025aw.m10921i().mo15449l().mo15494b() && C3025aw.m10921i().mo15449l().mo15500d()) {
            return null;
        }
        if (alc.mo14483d()) {
            alc.mo14482c();
        }
        akw b = alc.mo14481b();
        if (b != null) {
            str3 = b.mo14443b();
            str2 = b.mo14445c();
            str = b.mo14446d();
            if (str3 != null) {
                C3025aw.m10921i().mo15449l().mo15486a(str3);
            }
            if (str != null) {
                C3025aw.m10921i().mo15449l().mo15492b(str);
            }
        } else {
            str3 = C3025aw.m10921i().mo15449l().mo15495c();
            str = C3025aw.m10921i().mo15449l().mo15501e();
            str2 = null;
        }
        Bundle bundle = new Bundle(1);
        if (str != null) {
            if (((Boolean) aoq.m14620f().mo14695a(aru.f11773Y)).booleanValue() && !C3025aw.m10921i().mo15449l().mo15500d()) {
                bundle.putString("v_fp_vertical", str);
            }
        }
        if (str3 != null) {
            if (((Boolean) aoq.m14620f().mo14695a(aru.f11771W)).booleanValue() && !C3025aw.m10921i().mo15449l().mo15494b()) {
                bundle.putString("fingerprint", str3);
                if (!str3.equals(str2)) {
                    bundle.putString("v_fp", str2);
                }
            }
        }
        if (!bundle.isEmpty()) {
            return bundle;
        }
        return null;
    }

    /* renamed from: a */
    public static DisplayMetrics m17124a(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    /* renamed from: a */
    public static WebResourceResponse m17125a(HttpURLConnection httpURLConnection) throws IOException {
        String str;
        C3025aw.m10917e();
        String contentType = httpURLConnection.getContentType();
        String trim = TextUtils.isEmpty(contentType) ? "" : contentType.split(";")[0].trim();
        C3025aw.m10917e();
        String contentType2 = httpURLConnection.getContentType();
        if (!TextUtils.isEmpty(contentType2)) {
            String[] split = contentType2.split(";");
            if (split.length != 1) {
                int i = 1;
                while (true) {
                    if (i >= split.length) {
                        break;
                    }
                    if (split[i].trim().startsWith("charset")) {
                        String[] split2 = split[i].trim().split("=");
                        if (split2.length > 1) {
                            str = split2[1].trim();
                            break;
                        }
                    }
                    i++;
                }
            }
        }
        str = "";
        String str2 = str;
        Map headerFields = httpURLConnection.getHeaderFields();
        HashMap hashMap = new HashMap(headerFields.size());
        for (Entry entry : headerFields.entrySet()) {
            if (!(entry.getKey() == null || entry.getValue() == null || ((List) entry.getValue()).size() <= 0)) {
                hashMap.put((String) entry.getKey(), (String) ((List) entry.getValue()).get(0));
            }
        }
        return C3025aw.m10919g().mo15535a(trim, str2, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), hashMap, httpURLConnection.getInputStream());
    }

    /* renamed from: a */
    public static PopupWindow m17126a(View view, int i, int i2, boolean z) {
        return new PopupWindow(view, i, i2, false);
    }

    /* renamed from: a */
    public static String m17128a() {
        return UUID.randomUUID().toString();
    }

    /* renamed from: a */
    public static String m17129a(Context context, View view, zzjn zzjn) {
        if (!((Boolean) aoq.m14620f().mo14695a(aru.f11812ak)).booleanValue()) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", zzjn.f14547e);
            jSONObject2.put("height", zzjn.f14544b);
            jSONObject.put("size", jSONObject2);
            jSONObject.put("activity", m17174l(context));
            if (!zzjn.f14546d) {
                JSONArray jSONArray = new JSONArray();
                while (view != null) {
                    ViewParent parent = view.getParent();
                    if (parent != null) {
                        int i = -1;
                        if (parent instanceof ViewGroup) {
                            i = ((ViewGroup) parent).indexOfChild(view);
                        }
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put(C1245d.f3961jd, parent.getClass().getName());
                        jSONObject3.put("index_of_child", i);
                        jSONArray.put(jSONObject3);
                    }
                    view = (parent == null || !(parent instanceof View)) ? null : (View) parent;
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put("parents", jSONArray);
                }
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            C3900je.m17432c("Fail to get view hierarchy json", e);
            return null;
        }
    }

    /* renamed from: a */
    public static String m17131a(InputStreamReader inputStreamReader) throws IOException {
        StringBuilder sb = new StringBuilder(8192);
        char[] cArr = new char[2048];
        while (true) {
            int read = inputStreamReader.read(cArr);
            if (read == -1) {
                return sb.toString();
            }
            sb.append(cArr, 0, read);
        }
    }

    /* renamed from: a */
    public static String m17132a(String str) {
        return Uri.parse(str).buildUpon().query(null).build().toString();
    }

    /* renamed from: a */
    public static Map<String, String> m17133a(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : C3025aw.m10919g().mo15539a(uri)) {
            hashMap.put(str, uri.getQueryParameter(str));
        }
        return hashMap;
    }

    /* renamed from: a */
    private final JSONArray m17134a(Collection<?> collection) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (Object a : collection) {
            m17142a(jSONArray, a);
        }
        return jSONArray;
    }

    /* renamed from: a */
    private final JSONObject m17135a(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            m17143a(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m17136a(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    @TargetApi(18)
    /* renamed from: a */
    public static void m17137a(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            if (((Boolean) aoq.m14620f().mo14695a(aru.f11893cL)).booleanValue()) {
                m17154b(context, intent);
            }
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            String uri2 = uri.toString();
            StringBuilder sb = new StringBuilder(26 + String.valueOf(uri2).length());
            sb.append("Opening ");
            sb.append(uri2);
            sb.append(" in a new browser.");
            C3900je.m17429b(sb.toString());
        } catch (ActivityNotFoundException e) {
            C3900je.m17430b("No browser is found.", e);
        }
    }

    /* renamed from: a */
    public static void m17138a(Context context, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        m17139a(context, str, (List<String>) arrayList);
    }

    /* renamed from: a */
    public static void m17139a(Context context, String str, List<String> list) {
        for (String lnVar : list) {
            new C3963ln(context, str, lnVar).mo14344c();
        }
    }

    /* renamed from: a */
    public static void m17140a(Context context, Throwable th) {
        if (context != null) {
            boolean z = false;
            try {
                z = ((Boolean) aoq.m14620f().mo14695a(aru.f11881c)).booleanValue();
            } catch (IllegalStateException unused) {
            }
            if (z) {
                C3555g.m12743a(context, th);
            }
        }
    }

    /* renamed from: a */
    public static void m17141a(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            runnable.run();
        } else {
            C3907jl.m17118a(runnable);
        }
    }

    /* renamed from: a */
    private final void m17142a(JSONArray jSONArray, Object obj) throws JSONException {
        Object a;
        if (obj instanceof Bundle) {
            a = m17135a((Bundle) obj);
        } else if (obj instanceof Map) {
            a = mo15514a((Map) obj);
        } else if (obj instanceof Collection) {
            a = m17134a((Collection) obj);
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            JSONArray jSONArray2 = new JSONArray();
            for (Object a2 : objArr) {
                m17142a(jSONArray2, a2);
            }
            jSONArray.put(jSONArray2);
            return;
        } else {
            jSONArray.put(obj);
            return;
        }
        jSONArray.put(a);
    }

    /* renamed from: a */
    private final void m17143a(JSONObject jSONObject, String str, Object obj) throws JSONException {
        Collection asList;
        Object a;
        if (obj instanceof Bundle) {
            a = m17135a((Bundle) obj);
        } else if (obj instanceof Map) {
            a = mo15514a((Map) obj);
        } else {
            if (obj instanceof Collection) {
                if (str == null) {
                    str = "null";
                }
                asList = (Collection) obj;
            } else if (obj instanceof Object[]) {
                asList = Arrays.asList((Object[]) obj);
            } else {
                jSONObject.put(str, obj);
                return;
            }
            a = m17134a(asList);
        }
        jSONObject.put(str, a);
    }

    /* renamed from: a */
    private static boolean m17144a(int i, int i2, int i3) {
        return Math.abs(i - i2) <= i3;
    }

    @TargetApi(24)
    /* renamed from: a */
    public static boolean m17145a(Activity activity, Configuration configuration) {
        aoq.m14615a();
        int a = C3975lz.m17369a((Context) activity, configuration.screenHeightDp);
        int a2 = C3975lz.m17369a((Context) activity, configuration.screenWidthDp);
        DisplayMetrics a3 = m17124a((WindowManager) activity.getApplicationContext().getSystemService("window"));
        int i = a3.heightPixels;
        int i2 = a3.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        int round = ((int) Math.round(((double) activity.getResources().getDisplayMetrics().density) + 0.5d)) * ((Integer) aoq.m14620f().mo14695a(aru.f11905cX)).intValue();
        return m17144a(i, a + dimensionPixelSize, round) && m17144a(i2, a2, round);
    }

    /* renamed from: a */
    public static boolean m17146a(Context context) {
        String str;
        boolean z;
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        try {
            ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, C2793C.DEFAULT_BUFFER_SEGMENT_SIZE);
            if (resolveActivity == null || resolveActivity.activityInfo == null) {
                str = "Could not find com.google.android.gms.ads.AdActivity, please make sure it is declared in AndroidManifest.xml.";
            } else {
                String str2 = "com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".";
                if ((resolveActivity.activityInfo.configChanges & 16) == 0) {
                    C3900je.m17435e(String.format(str2, new Object[]{"keyboard"}));
                    z = false;
                } else {
                    z = true;
                }
                if ((resolveActivity.activityInfo.configChanges & 32) == 0) {
                    C3900je.m17435e(String.format(str2, new Object[]{"keyboardHidden"}));
                    z = false;
                }
                if ((resolveActivity.activityInfo.configChanges & 128) == 0) {
                    C3900je.m17435e(String.format(str2, new Object[]{"orientation"}));
                    z = false;
                }
                if ((resolveActivity.activityInfo.configChanges & 256) == 0) {
                    C3900je.m17435e(String.format(str2, new Object[]{"screenLayout"}));
                    z = false;
                }
                if ((resolveActivity.activityInfo.configChanges & 512) == 0) {
                    C3900je.m17435e(String.format(str2, new Object[]{"uiMode"}));
                    z = false;
                }
                if ((resolveActivity.activityInfo.configChanges & C1245d.f3947iP) == 0) {
                    C3900je.m17435e(String.format(str2, new Object[]{"screenSize"}));
                    z = false;
                }
                if ((resolveActivity.activityInfo.configChanges & 2048) != 0) {
                    return z;
                }
                str = String.format(str2, new Object[]{"smallestScreenSize"});
            }
            C3900je.m17435e(str);
            return false;
        } catch (Exception e) {
            C3900je.m17432c("Could not verify that com.google.android.gms.ads.AdActivity is declared in AndroidManifest.xml", e);
            C3025aw.m10921i().mo15436a((Throwable) e, "AdUtil.hasAdActivity");
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m17147a(Context context, String str) {
        return C3404c.m12230a(context).mo13389a(str, context.getPackageName()) == 0;
    }

    /* renamed from: a */
    public static boolean m17149a(ClassLoader classLoader, Class<?> cls, String str) {
        try {
            return cls.isAssignableFrom(Class.forName(str, false, classLoader));
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static int[] m17150a(Activity activity) {
        Window window = activity.getWindow();
        if (window != null) {
            View findViewById = window.findViewById(16908290);
            if (findViewById != null) {
                return new int[]{findViewById.getWidth(), findViewById.getHeight()};
            }
        }
        return m17166e();
    }

    /* renamed from: b */
    public static int m17151b(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(22 + String.valueOf(valueOf).length());
            sb.append("Could not parse value:");
            sb.append(valueOf);
            C3900je.m17435e(sb.toString());
            return 0;
        }
    }

    /* renamed from: b */
    public static Bitmap m17152b(View view) {
        if (view == null) {
            return null;
        }
        Bitmap f = m17167f(view);
        if (f == null) {
            f = m17165e(view);
        }
        return f;
    }

    /* renamed from: b */
    public static String m17153b() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        StringBuilder sb = new StringBuilder(1 + String.valueOf(str).length() + String.valueOf(str2).length());
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        return sb.toString();
    }

    @TargetApi(18)
    /* renamed from: b */
    public static void m17154b(Context context, Intent intent) {
        if (intent != null && C3563o.m12767f()) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            extras.putBinder("android.support.customtabs.extra.SESSION", null);
            extras.putString("com.android.browser.application_id", context.getPackageName());
            intent.putExtras(extras);
        }
    }

    /* renamed from: b */
    public static void m17155b(Context context, String str, String str2) {
        try {
            FileOutputStream openFileOutput = context.openFileOutput(str, 0);
            openFileOutput.write(str2.getBytes(C2793C.UTF8_NAME));
            openFileOutput.close();
        } catch (Exception e) {
            C3900je.m17430b("Error writing to file in internal storage.", e);
        }
    }

    /* renamed from: c */
    public static Bundle m17156c() {
        Bundle bundle = new Bundle();
        try {
            if (((Boolean) aoq.m14620f().mo14695a(aru.f11751C)).booleanValue()) {
                MemoryInfo memoryInfo = new MemoryInfo();
                Debug.getMemoryInfo(memoryInfo);
                bundle.putParcelable("debug_memory_info", memoryInfo);
            }
            if (((Boolean) aoq.m14620f().mo14695a(aru.f11752D)).booleanValue()) {
                Runtime runtime = Runtime.getRuntime();
                bundle.putLong("runtime_free_memory", runtime.freeMemory());
                bundle.putLong("runtime_max_memory", runtime.maxMemory());
                bundle.putLong("runtime_total_memory", runtime.totalMemory());
            }
            bundle.putInt("web_view_count", C3025aw.m10921i().mo15448k());
            return bundle;
        } catch (Exception e) {
            C3900je.m17432c("Unable to gather memory stats", e);
            return bundle;
        }
    }

    /* renamed from: c */
    public static WebResourceResponse m17157c(Context context, String str, String str2) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("User-Agent", C3025aw.m10917e().mo15521b(context, str));
            hashMap.put("Cache-Control", "max-stale=3600");
            String str3 = (String) new C3946kx(context).mo15593a(str2, (Map<String, String>) hashMap).get(60, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", C2793C.UTF8_NAME, new ByteArrayInputStream(str3.getBytes(C2793C.UTF8_NAME)));
            }
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e) {
            C3900je.m17432c("Could not fetch MRAID JS.", e);
        }
        return null;
    }

    /* renamed from: c */
    public static String m17158c(Context context, String str) {
        try {
            return new String(C3559k.m12758a(context.openFileInput(str), true), C2793C.UTF8_NAME);
        } catch (IOException unused) {
            C3900je.m17429b("Error reading from internal storage.");
            return "";
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0017  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m17159c(android.view.View r2) {
        /*
            android.view.View r2 = r2.getRootView()
            r0 = 0
            if (r2 == 0) goto L_0x0012
            android.content.Context r2 = r2.getContext()
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0012
            android.app.Activity r2 = (android.app.Activity) r2
            goto L_0x0013
        L_0x0012:
            r2 = r0
        L_0x0013:
            r1 = 0
            if (r2 != 0) goto L_0x0017
            return r1
        L_0x0017:
            android.view.Window r2 = r2.getWindow()
            if (r2 != 0) goto L_0x001e
            goto L_0x0022
        L_0x001e:
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
        L_0x0022:
            if (r0 == 0) goto L_0x002d
            int r2 = r0.flags
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x002d
            r2 = 1
            return r2
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3909jn.m17159c(android.view.View):boolean");
    }

    /* renamed from: c */
    public static boolean m17160c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)");
    }

    /* renamed from: d */
    public static int m17161d(View view) {
        if (view == null) {
            return -1;
        }
        ViewParent parent = view.getParent();
        while (parent != null && !(parent instanceof AdapterView)) {
            parent = parent.getParent();
        }
        if (parent == null) {
            return -1;
        }
        return ((AdapterView) parent).getPositionForView(view);
    }

    /* renamed from: d */
    private static String m17162d() {
        StringBuilder sb = new StringBuilder(256);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        if (VERSION.RELEASE != null) {
            sb.append(" ");
            sb.append(VERSION.RELEASE);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        if (Build.DEVICE != null) {
            sb.append("; ");
            sb.append(Build.DEVICE);
            if (Build.DISPLAY != null) {
                sb.append(" Build/");
                sb.append(Build.DISPLAY);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    /* renamed from: d */
    protected static String m17163d(Context context) {
        try {
            return new WebView(context).getSettings().getUserAgentString();
        } catch (Throwable unused) {
            return m17162d();
        }
    }

    /* renamed from: e */
    public static Builder m17164e(Context context) {
        return new Builder(context);
    }

    /* renamed from: e */
    private static Bitmap m17165e(View view) {
        try {
            int width = view.getWidth();
            int height = view.getHeight();
            if (width != 0) {
                if (height != 0) {
                    Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Config.RGB_565);
                    Canvas canvas = new Canvas(createBitmap);
                    view.layout(0, 0, width, height);
                    view.draw(canvas);
                    return createBitmap;
                }
            }
            C3900je.m17435e("Width or height of view is zero");
            return null;
        } catch (RuntimeException e) {
            C3900je.m17430b("Fail to capture the webview", e);
            return null;
        }
    }

    /* renamed from: e */
    private static int[] m17166e() {
        return new int[]{0, 0};
    }

    /* renamed from: f */
    private static Bitmap m17167f(View view) {
        Bitmap bitmap = null;
        try {
            boolean isDrawingCacheEnabled = view.isDrawingCacheEnabled();
            view.setDrawingCacheEnabled(true);
            Bitmap drawingCache = view.getDrawingCache();
            if (drawingCache != null) {
                bitmap = Bitmap.createBitmap(drawingCache);
            }
            view.setDrawingCacheEnabled(isDrawingCacheEnabled);
            return bitmap;
        } catch (RuntimeException e) {
            C3900je.m17430b("Fail to capture the web view", e);
            return null;
        }
    }

    /* renamed from: f */
    public static arf m17168f(Context context) {
        return new arf(context);
    }

    /* renamed from: g */
    public static boolean m17169g(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null) {
                return false;
            }
            List runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses == null) {
                return false;
            }
            Iterator it = runningAppProcesses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                RunningAppProcessInfo runningAppProcessInfo = (RunningAppProcessInfo) it.next();
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode()) {
                        PowerManager powerManager = (PowerManager) context.getSystemService("power");
                        if (powerManager == null ? false : powerManager.isScreenOn()) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: h */
    public static Bitmap m17170h(Context context) {
        Bitmap bitmap;
        if (!(context instanceof Activity)) {
            return null;
        }
        try {
            if (((Boolean) aoq.m14620f().mo14695a(aru.f11847bS)).booleanValue()) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    bitmap = m17167f(window.getDecorView().getRootView());
                }
                return null;
            }
            bitmap = m17165e(((Activity) context).getWindow().getDecorView());
            return bitmap;
        } catch (RuntimeException e) {
            C3900je.m17430b("Fail to capture screen shot", e);
        }
    }

    /* renamed from: i */
    public static int m17171i(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null) {
            return 0;
        }
        return applicationInfo.targetSdkVersion;
    }

    @TargetApi(16)
    /* renamed from: j */
    public static boolean m17172j(Context context) {
        if (context == null || !C3563o.m12765d()) {
            return false;
        }
        KeyguardManager m = m17175m(context);
        if (m != null && m.isKeyguardLocked()) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public static boolean m17173k(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            C3900je.m17430b("Error loading class.", th);
            C3025aw.m10921i().mo15436a(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    /* renamed from: l */
    private static String m17174l(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null) {
                return null;
            }
            List runningTasks = activityManager.getRunningTasks(1);
            if (runningTasks != null && !runningTasks.isEmpty()) {
                RunningTaskInfo runningTaskInfo = (RunningTaskInfo) runningTasks.get(0);
                if (!(runningTaskInfo == null || runningTaskInfo.topActivity == null)) {
                    return runningTaskInfo.topActivity.getClassName();
                }
            }
            return null;
        } catch (Exception unused) {
        }
    }

    /* renamed from: m */
    private static KeyguardManager m17175m(Context context) {
        Object systemService = context.getSystemService("keyguard");
        if (systemService == null || !(systemService instanceof KeyguardManager)) {
            return null;
        }
        return (KeyguardManager) systemService;
    }

    /* renamed from: a */
    public final JSONObject mo15513a(Bundle bundle, JSONObject jSONObject) {
        if (bundle != null) {
            try {
                return m17135a(bundle);
            } catch (JSONException e) {
                C3900je.m17430b("Error converting Bundle to JSON", e);
            }
        }
        return null;
    }

    /* renamed from: a */
    public final JSONObject mo15514a(Map<String, ?> map) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                m17143a(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e) {
            String str2 = "Could not convert map to JSON: ";
            String valueOf = String.valueOf(e.getMessage());
            throw new JSONException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
    }

    /* renamed from: a */
    public final void mo15515a(Context context, String str, WebSettings webSettings) {
        webSettings.setUserAgentString(mo15521b(context, str));
    }

    /* renamed from: a */
    public final void mo15516a(Context context, String str, String str2, Bundle bundle, boolean z) {
        if (z) {
            C3025aw.m10917e();
            bundle.putString("device", m17153b());
            bundle.putString("eids", TextUtils.join(",", aru.m15023a()));
        }
        aoq.m14615a();
        C3975lz.m17375a(context, str, str2, bundle, z, new C3912jq(this, context, str));
    }

    /* renamed from: a */
    public final void mo15517a(Context context, String str, boolean z, HttpURLConnection httpURLConnection) {
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(60000);
        httpURLConnection.setRequestProperty("User-Agent", mo15521b(context, str));
        httpURLConnection.setUseCaches(false);
    }

    /* renamed from: a */
    public final void mo15518a(Context context, List<String> list) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (!TextUtils.isEmpty(afq.m14021a(activity))) {
                if (list == null) {
                    C3900je.m17043a("Cannot ping urls: empty list.");
                } else if (!ass.m15081a(context)) {
                    C3900je.m17043a("Cannot ping url because custom tabs is not supported");
                } else {
                    ass ass = new ass();
                    ass.mo14734a((ast) new C3910jo(this, list, ass, context));
                    ass.mo14736b(activity);
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo15519a(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        return mo15520a(view, applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null, m17175m(context));
    }

    /* renamed from: a */
    public final boolean mo15520a(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z;
        if (!C3025aw.m10917e().f13413c) {
            if (keyguardManager == null ? false : keyguardManager.inKeyguardRestrictedInputMode()) {
                if (!((Boolean) aoq.m14620f().mo14695a(aru.f11869bo)).booleanValue() || !m17159c(view)) {
                    z = false;
                    if (view.getVisibility() == 0 && view.isShown()) {
                        if ((powerManager != null || powerManager.isScreenOn()) && z) {
                            if (((Boolean) aoq.m14620f().mo14695a(aru.f11867bm)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        z = true;
        if (((Boolean) aoq.m14620f().mo14695a(aru.f11867bm)).booleanValue()) {
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x003b, code lost:
        continue;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x001d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0045 */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0025 A[Catch:{ Exception -> 0x00b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0059 A[Catch:{ Exception -> 0x00b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005e A[Catch:{ Exception -> 0x00b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a8 A[Catch:{ Exception -> 0x00b7 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo15521b(android.content.Context r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f13412b
            monitor-enter(r0)
            java.lang.String r1 = r4.f13414d     // Catch:{ all -> 0x00d3 }
            if (r1 == 0) goto L_0x000b
            java.lang.String r5 = r4.f13414d     // Catch:{ all -> 0x00d3 }
            monitor-exit(r0)     // Catch:{ all -> 0x00d3 }
            return r5
        L_0x000b:
            if (r6 != 0) goto L_0x0013
            java.lang.String r5 = m17162d()     // Catch:{ all -> 0x00d3 }
            monitor-exit(r0)     // Catch:{ all -> 0x00d3 }
            return r5
        L_0x0013:
            com.google.android.gms.internal.ads.jt r1 = com.google.android.gms.ads.internal.C3025aw.m10919g()     // Catch:{ Exception -> 0x001d }
            java.lang.String r1 = r1.mo15537a(r5)     // Catch:{ Exception -> 0x001d }
            r4.f13414d = r1     // Catch:{ Exception -> 0x001d }
        L_0x001d:
            java.lang.String r1 = r4.f13414d     // Catch:{ all -> 0x00d3 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x00d3 }
            if (r1 == 0) goto L_0x006e
            com.google.android.gms.internal.ads.aoq.m14615a()     // Catch:{ all -> 0x00d3 }
            boolean r1 = com.google.android.gms.internal.ads.C3975lz.m17382b()     // Catch:{ all -> 0x00d3 }
            if (r1 != 0) goto L_0x0068
            r1 = 0
            r4.f13414d = r1     // Catch:{ all -> 0x00d3 }
            android.os.Handler r1 = f13411a     // Catch:{ all -> 0x00d3 }
            com.google.android.gms.internal.ads.jp r2 = new com.google.android.gms.internal.ads.jp     // Catch:{ all -> 0x00d3 }
            r2.<init>(r4, r5)     // Catch:{ all -> 0x00d3 }
            r1.post(r2)     // Catch:{ all -> 0x00d3 }
        L_0x003b:
            java.lang.String r1 = r4.f13414d     // Catch:{ all -> 0x00d3 }
            if (r1 != 0) goto L_0x006e
            java.lang.Object r1 = r4.f13412b     // Catch:{ InterruptedException -> 0x0045 }
            r1.wait()     // Catch:{ InterruptedException -> 0x0045 }
            goto L_0x003b
        L_0x0045:
            java.lang.String r1 = m17162d()     // Catch:{ all -> 0x00d3 }
            r4.f13414d = r1     // Catch:{ all -> 0x00d3 }
            java.lang.String r1 = "Interrupted, use default user agent: "
            java.lang.String r2 = r4.f13414d     // Catch:{ all -> 0x00d3 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x00d3 }
            int r3 = r2.length()     // Catch:{ all -> 0x00d3 }
            if (r3 == 0) goto L_0x005e
            java.lang.String r1 = r1.concat(r2)     // Catch:{ all -> 0x00d3 }
            goto L_0x0064
        L_0x005e:
            java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x00d3 }
            r2.<init>(r1)     // Catch:{ all -> 0x00d3 }
            r1 = r2
        L_0x0064:
            com.google.android.gms.internal.ads.C3900je.m17435e(r1)     // Catch:{ all -> 0x00d3 }
            goto L_0x003b
        L_0x0068:
            java.lang.String r1 = m17163d(r5)     // Catch:{ all -> 0x00d3 }
            r4.f13414d = r1     // Catch:{ all -> 0x00d3 }
        L_0x006e:
            java.lang.String r1 = r4.f13414d     // Catch:{ all -> 0x00d3 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00d3 }
            r2 = 10
            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00d3 }
            int r3 = r3.length()     // Catch:{ all -> 0x00d3 }
            int r2 = r2 + r3
            java.lang.String r3 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x00d3 }
            int r3 = r3.length()     // Catch:{ all -> 0x00d3 }
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d3 }
            r3.<init>(r2)     // Catch:{ all -> 0x00d3 }
            r3.append(r1)     // Catch:{ all -> 0x00d3 }
            java.lang.String r1 = " (Mobile; "
            r3.append(r1)     // Catch:{ all -> 0x00d3 }
            r3.append(r6)     // Catch:{ all -> 0x00d3 }
            java.lang.String r6 = r3.toString()     // Catch:{ all -> 0x00d3 }
            r4.f13414d = r6     // Catch:{ all -> 0x00d3 }
            com.google.android.gms.common.b.b r5 = com.google.android.gms.common.p140b.C3404c.m12230a(r5)     // Catch:{ Exception -> 0x00b7 }
            boolean r5 = r5.mo13392a()     // Catch:{ Exception -> 0x00b7 }
            if (r5 == 0) goto L_0x00c1
            java.lang.String r5 = r4.f13414d     // Catch:{ Exception -> 0x00b7 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x00b7 }
            java.lang.String r6 = ";aia"
            java.lang.String r5 = r5.concat(r6)     // Catch:{ Exception -> 0x00b7 }
            r4.f13414d = r5     // Catch:{ Exception -> 0x00b7 }
            goto L_0x00c1
        L_0x00b7:
            r5 = move-exception
            com.google.android.gms.internal.ads.io r6 = com.google.android.gms.ads.internal.C3025aw.m10921i()     // Catch:{ all -> 0x00d3 }
            java.lang.String r1 = "AdUtil.getUserAgent"
            r6.mo15436a(r5, r1)     // Catch:{ all -> 0x00d3 }
        L_0x00c1:
            java.lang.String r5 = r4.f13414d     // Catch:{ all -> 0x00d3 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x00d3 }
            java.lang.String r6 = ")"
            java.lang.String r5 = r5.concat(r6)     // Catch:{ all -> 0x00d3 }
            r4.f13414d = r5     // Catch:{ all -> 0x00d3 }
            java.lang.String r5 = r4.f13414d     // Catch:{ all -> 0x00d3 }
            monitor-exit(r0)     // Catch:{ all -> 0x00d3 }
            return r5
        L_0x00d3:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00d3 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3909jn.mo15521b(android.content.Context, java.lang.String):java.lang.String");
    }

    /* renamed from: b */
    public final void mo15522b(Context context, String str, String str2, Bundle bundle, boolean z) {
        if (((Boolean) aoq.m14620f().mo14695a(aru.f11872br)).booleanValue()) {
            mo15516a(context, str, str2, bundle, z);
        }
    }

    /* renamed from: b */
    public final boolean mo15523b(Context context) {
        if (this.f13415e) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.getApplicationContext().registerReceiver(new C3914js(this, null), intentFilter);
        this.f13415e = true;
        return true;
    }

    /* renamed from: b */
    public final int[] mo15524b(Activity activity) {
        int[] a = m17150a(activity);
        aoq.m14615a();
        aoq.m14615a();
        return new int[]{C3975lz.m17379b((Context) activity, a[0]), C3975lz.m17379b((Context) activity, a[1])};
    }

    /* renamed from: c */
    public final boolean mo15525c(Context context) {
        if (this.f13416f) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        context.getApplicationContext().registerReceiver(new C3913jr(this, null), intentFilter);
        this.f13416f = true;
        return true;
    }

    /* renamed from: c */
    public final int[] mo15526c(Activity activity) {
        int[] iArr;
        Window window = activity.getWindow();
        if (window != null) {
            View findViewById = window.findViewById(16908290);
            if (findViewById != null) {
                iArr = new int[]{findViewById.getTop(), findViewById.getBottom()};
                aoq.m14615a();
                aoq.m14615a();
                return new int[]{C3975lz.m17379b((Context) activity, iArr[0]), C3975lz.m17379b((Context) activity, iArr[1])};
            }
        }
        iArr = m17166e();
        aoq.m14615a();
        aoq.m14615a();
        return new int[]{C3975lz.m17379b((Context) activity, iArr[0]), C3975lz.m17379b((Context) activity, iArr[1])};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        if (((java.lang.String) com.google.android.gms.internal.ads.aoq.m14620f().mo14695a(com.google.android.gms.internal.ads.aru.f11818aq)).equals(r3.f13417g.pattern()) == false) goto L_0x0025;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo15527d(java.lang.String r4) {
        /*
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            monitor-enter(r3)     // Catch:{ PatternSyntaxException -> 0x0046 }
            java.util.regex.Pattern r0 = r3.f13417g     // Catch:{ all -> 0x0043 }
            if (r0 == 0) goto L_0x0025
            com.google.android.gms.internal.ads.ark<java.lang.String> r0 = com.google.android.gms.internal.ads.aru.f11818aq     // Catch:{ all -> 0x0043 }
            com.google.android.gms.internal.ads.ars r2 = com.google.android.gms.internal.ads.aoq.m14620f()     // Catch:{ all -> 0x0043 }
            java.lang.Object r0 = r2.mo14695a(r0)     // Catch:{ all -> 0x0043 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0043 }
            java.util.regex.Pattern r2 = r3.f13417g     // Catch:{ all -> 0x0043 }
            java.lang.String r2 = r2.pattern()     // Catch:{ all -> 0x0043 }
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x0043 }
            if (r0 != 0) goto L_0x0037
        L_0x0025:
            com.google.android.gms.internal.ads.ark<java.lang.String> r0 = com.google.android.gms.internal.ads.aru.f11818aq     // Catch:{ all -> 0x0043 }
            com.google.android.gms.internal.ads.ars r2 = com.google.android.gms.internal.ads.aoq.m14620f()     // Catch:{ all -> 0x0043 }
            java.lang.Object r0 = r2.mo14695a(r0)     // Catch:{ all -> 0x0043 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0043 }
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)     // Catch:{ all -> 0x0043 }
            r3.f13417g = r0     // Catch:{ all -> 0x0043 }
        L_0x0037:
            java.util.regex.Pattern r0 = r3.f13417g     // Catch:{ all -> 0x0043 }
            java.util.regex.Matcher r4 = r0.matcher(r4)     // Catch:{ all -> 0x0043 }
            boolean r4 = r4.matches()     // Catch:{ all -> 0x0043 }
            monitor-exit(r3)     // Catch:{ all -> 0x0043 }
            return r4
        L_0x0043:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0043 }
            throw r4     // Catch:{ PatternSyntaxException -> 0x0046 }
        L_0x0046:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3909jn.mo15527d(java.lang.String):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        if (((java.lang.String) com.google.android.gms.internal.ads.aoq.m14620f().mo14695a(com.google.android.gms.internal.ads.aru.f11819ar)).equals(r3.f13418h.pattern()) == false) goto L_0x0025;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo15528e(java.lang.String r4) {
        /*
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            monitor-enter(r3)     // Catch:{ PatternSyntaxException -> 0x0046 }
            java.util.regex.Pattern r0 = r3.f13418h     // Catch:{ all -> 0x0043 }
            if (r0 == 0) goto L_0x0025
            com.google.android.gms.internal.ads.ark<java.lang.String> r0 = com.google.android.gms.internal.ads.aru.f11819ar     // Catch:{ all -> 0x0043 }
            com.google.android.gms.internal.ads.ars r2 = com.google.android.gms.internal.ads.aoq.m14620f()     // Catch:{ all -> 0x0043 }
            java.lang.Object r0 = r2.mo14695a(r0)     // Catch:{ all -> 0x0043 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0043 }
            java.util.regex.Pattern r2 = r3.f13418h     // Catch:{ all -> 0x0043 }
            java.lang.String r2 = r2.pattern()     // Catch:{ all -> 0x0043 }
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x0043 }
            if (r0 != 0) goto L_0x0037
        L_0x0025:
            com.google.android.gms.internal.ads.ark<java.lang.String> r0 = com.google.android.gms.internal.ads.aru.f11819ar     // Catch:{ all -> 0x0043 }
            com.google.android.gms.internal.ads.ars r2 = com.google.android.gms.internal.ads.aoq.m14620f()     // Catch:{ all -> 0x0043 }
            java.lang.Object r0 = r2.mo14695a(r0)     // Catch:{ all -> 0x0043 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0043 }
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)     // Catch:{ all -> 0x0043 }
            r3.f13418h = r0     // Catch:{ all -> 0x0043 }
        L_0x0037:
            java.util.regex.Pattern r0 = r3.f13418h     // Catch:{ all -> 0x0043 }
            java.util.regex.Matcher r4 = r0.matcher(r4)     // Catch:{ all -> 0x0043 }
            boolean r4 = r4.matches()     // Catch:{ all -> 0x0043 }
            monitor-exit(r3)     // Catch:{ all -> 0x0043 }
            return r4
        L_0x0043:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0043 }
            throw r4     // Catch:{ PatternSyntaxException -> 0x0046 }
        L_0x0046:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3909jn.mo15528e(java.lang.String):boolean");
    }
}
