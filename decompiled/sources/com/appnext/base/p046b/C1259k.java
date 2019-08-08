package com.appnext.base.p046b;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningTaskInfo;
import android.app.AppOpsManager;
import android.app.usage.UsageStats;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import com.appnext.base.operations.C1265a;
import com.appnext.base.operations.C1268c;
import com.appnext.base.p042a.C1224a;
import com.appnext.base.p042a.p044b.C1230b;
import com.appnext.base.p042a.p044b.C1231c;
import com.appnext.base.p046b.C1245d.C1246a;
import com.appnext.base.services.p048b.C1285a;
import com.appnext.core.C1326f;
import com.appnext.core.C1333i;
import com.google.android.exoplayer2.C2793C;
import com.google.android.exoplayer2.extractor.p132ts.TsExtractor;
import com.google.android.gms.ads.p135a.C2961a;
import com.google.android.gms.ads.p135a.C2961a.C2962a;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpRetryException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.appnext.base.b.k */
public final class C1259k {
    private static final String TAG = "SdkHelper";

    /* renamed from: iw */
    private static final long f4002iw = 1000;

    /* renamed from: ix */
    private static final long f4003ix = 60000;

    /* renamed from: iy */
    private static final long f4004iy = 3600000;

    /* renamed from: iz */
    private static final long f4005iz = 86400000;

    /* renamed from: a */
    public static List<ApplicationInfo> m5332a(PackageManager packageManager, int i) {
        ArrayList arrayList = new ArrayList();
        try {
            for (ApplicationInfo applicationInfo : packageManager.getInstalledApplications(128)) {
                if (applicationInfo != null && (applicationInfo.flags & 1) == 0) {
                    arrayList.add(applicationInfo);
                }
            }
        } catch (Throwable unused) {
        }
        return arrayList;
    }

    /* renamed from: a */
    public static boolean m5335a(String str, String str2, C1231c cVar) {
        char c = 65535;
        try {
            if (str2.hashCode() == 570418373) {
                if (str2.equals(C1245d.f3957iZ)) {
                    c = 0;
                }
            }
            if (c != 0) {
                return false;
            }
            return ((C1265a) Class.forName(C1268c.m5389ak(str)).getConstructor(new Class[]{C1231c.class, Bundle.class}).newInstance(new Object[]{cVar, null})).mo6009bz();
        } catch (InvocationTargetException e) {
            e.getCause().printStackTrace();
            e.getCause();
            return false;
        } catch (ClassNotFoundException unused) {
            return false;
        } catch (Throwable unused2) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m5334a(Class cls) {
        try {
            if (C1247e.getContext().getPackageManager().queryIntentServices(new Intent(C1247e.getContext(), cls), C2793C.DEFAULT_BUFFER_SEGMENT_SIZE).size() > 0) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static List<String> m5331a(Context context, long j, long j2) {
        ArrayList arrayList = new ArrayList();
        if (context == null) {
            return arrayList;
        }
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (VERSION.SDK_INT < 21) {
                if (C1248f.m5280g(C1247e.getContext(), "android.permission.GET_TASKS")) {
                    List<RunningTaskInfo> runningTasks = activityManager.getRunningTasks(20);
                    if (runningTasks != null && !runningTasks.isEmpty()) {
                        for (RunningTaskInfo runningTaskInfo : runningTasks) {
                            if (!m5341h(context, runningTaskInfo.baseActivity.getPackageName())) {
                                arrayList.add(runningTaskInfo.baseActivity.getPackageName());
                            }
                        }
                    }
                }
            } else if (VERSION.SDK_INT >= 21 && m5342m(context.getApplicationContext())) {
                UsageStatsManager usageStatsManager = (UsageStatsManager) context.getSystemService("usagestats");
                long currentTimeMillis = System.currentTimeMillis();
                List queryUsageStats = usageStatsManager.queryUsageStats(4, currentTimeMillis - j, currentTimeMillis);
                if (queryUsageStats == null) {
                    return arrayList;
                }
                ListIterator listIterator = queryUsageStats.listIterator();
                while (listIterator.hasNext()) {
                    UsageStats usageStats = (UsageStats) listIterator.next();
                    if (VERSION.SDK_INT >= 23) {
                        if (!usageStatsManager.isAppInactive(usageStats.getPackageName()) && usageStats.getTotalTimeInForeground() >= j2) {
                            if (!m5341h(context, usageStats.getPackageName())) {
                                arrayList.add(usageStats.getPackageName());
                            }
                        }
                        listIterator.remove();
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return arrayList;
    }

    /* renamed from: h */
    private static boolean m5341h(Context context, String str) {
        try {
            if (str.contains("com.android")) {
                return true;
            }
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, C2793C.DEFAULT_BUFFER_SEGMENT_SIZE);
            if (queryIntentActivities != null) {
                for (ResolveInfo resolveInfo : queryIntentActivities) {
                    if (resolveInfo.activityInfo != null && resolveInfo.activityInfo.packageName.equals(str)) {
                        return true;
                    }
                }
            }
            Intent intent2 = new Intent("android.intent.action.MAIN", null);
            intent2.addCategory("android.intent.category.LAUNCHER");
            List<ResolveInfo> queryIntentActivities2 = context.getPackageManager().queryIntentActivities(intent2, 0);
            if (queryIntentActivities2 != null) {
                for (ResolveInfo resolveInfo2 : queryIntentActivities2) {
                    if (resolveInfo2.activityInfo != null && resolveInfo2.activityInfo.packageName.equals(str)) {
                        return (resolveInfo2.activityInfo.flags & TsExtractor.TS_STREAM_TYPE_AC3) != 0;
                    }
                }
            }
            return false;
        } catch (Throwable unused) {
        }
    }

    @TargetApi(21)
    /* renamed from: m */
    public static boolean m5342m(Context context) {
        return ((AppOpsManager) context.getSystemService("appops")).checkOpNoThrow("android:get_usage_stats", Process.myUid(), context.getPackageName()) == 0;
    }

    /* renamed from: n */
    public static void m5343n(Context context) {
        try {
            List bm = C1224a.m5161aN().mo5888aR().mo5931bm();
            if (bm != null && bm.size() == 0) {
                StringBuilder sb = new StringBuilder("cdm");
                sb.append(System.currentTimeMillis());
                C1231c cVar = new C1231c("on", "1", C1245d.f3953iV, "1", C1245d.f3957iZ, "cdm", sb.toString(), null);
                C1224a.m5161aN().mo5888aR().mo5926a(cVar);
                C1285a.m5550g(context).mo6051a(cVar, true);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: o */
    public static boolean m5344o(Context context) throws Exception {
        C2962a a = C2961a.m10593a(context);
        return a != null && a.mo12187b();
    }

    /* renamed from: p */
    public static boolean m5345p(Context context) {
        try {
            C2962a a = C2961a.m10593a(context);
            if (a == null || a.mo12187b()) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return true;
        }
    }

    /* renamed from: b */
    public static boolean m5338b(String str, Map<String, String> map) {
        C1231c ac = C1224a.m5161aN().mo5888aR().mo5929ac(str);
        if (ac == null || C1245d.f3958ja.equalsIgnoreCase(ac.mo5905bb()) || map.isEmpty()) {
            return true;
        }
        StringBuilder sb = new StringBuilder(C1333i.f4228lk);
        sb.append("/data");
        String sb2 = sb.toString();
        HashMap hashMap = new HashMap();
        String b = C1326f.m5675b(C1247e.getContext(), true);
        if (TextUtils.isEmpty(b)) {
            b = C1251i.m5302ck().getString(C1251i.f3987jz, "");
        }
        if (TextUtils.isEmpty(b)) {
            return false;
        }
        hashMap.put("aid", b);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(b);
        sb3.append("_");
        sb3.append(System.currentTimeMillis());
        hashMap.put("cuid", sb3.toString());
        hashMap.put("lvid", "4.7.2");
        try {
            hashMap.put("localdate", m5330a(new Date()));
            hashMap.put("timezone", m5339cu());
            hashMap.put("app_package", C1247e.getPackageName());
        } catch (Throwable unused) {
            hashMap.put("app_package", "");
        }
        for (Entry entry : map.entrySet()) {
            hashMap.put((String) entry.getKey(), (String) entry.getValue());
        }
        StringBuilder sb4 = new StringBuilder("-------Sending to server data for key = ");
        sb4.append(str);
        sb4.append(" ----------");
        for (Entry entry2 : hashMap.entrySet()) {
            StringBuilder sb5 = new StringBuilder("---- ");
            sb5.append((String) entry2.getKey());
            sb5.append(" : ");
            sb5.append((String) entry2.getValue());
            sb5.append(" ----");
        }
        try {
            byte[] a = C1326f.m5667a(sb2, (Object) hashMap, false, 15000, C1246a.HashMap);
            if (a != null) {
                new StringBuilder("result send data: ").append(new String(a, C2793C.UTF8_NAME));
            }
            return true;
        } catch (HttpRetryException e) {
            int responseCode = e.responseCode();
            String message = e.getMessage();
            StringBuilder sb6 = new StringBuilder("(Type:HttpRetryException)");
            sb6.append(message);
            sb6.append("  ");
            sb6.append(responseCode);
            return false;
        } catch (Throwable th) {
            new StringBuilder("(Type:Throwable) ").append(th.getMessage());
            return false;
        }
    }

    /* renamed from: cu */
    public static String m5339cu() {
        StringBuilder sb = new StringBuilder(9);
        try {
            Calendar instance = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
            int i = (instance.get(15) + instance.get(16)) / 60000;
            char c = '+';
            if (i < 0) {
                c = '-';
                i = -i;
            }
            sb.append("GMT");
            sb.append(c);
            m5333a(sb, 2, i / 60);
            sb.append(':');
            m5333a(sb, 2, i % 60);
        } catch (Throwable unused) {
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static void m5333a(StringBuilder sb, int i, int i2) {
        try {
            String num = Integer.toString(i2);
            for (int i3 = 0; i3 < 2 - num.length(); i3++) {
                sb.append('0');
            }
            sb.append(num);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static String m5330a(Date date) {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append(new SimpleDateFormat("EEE MMM dd HH:mm:ss", Locale.US).format(date));
            sb.append(" ");
            sb.append(m5339cu());
            sb.append(" ");
            sb.append(new SimpleDateFormat("yyyy", Locale.US).format(date));
        } catch (Throwable unused) {
        }
        return sb.toString();
    }

    /* renamed from: h */
    public static int m5340h(String str, String str2) {
        try {
            if (!TextUtils.isEmpty(str) && TextUtils.isDigitsOnly(str)) {
                if (!TextUtils.isEmpty(str2)) {
                    int intValue = Integer.valueOf(str).intValue();
                    if (C1245d.f3951iT.equalsIgnoreCase(str2)) {
                        return intValue;
                    }
                    if (C1245d.f3952iU.equalsIgnoreCase(str2)) {
                        return (int) (((long) intValue) * 60000);
                    }
                    if (C1245d.f3953iV.equalsIgnoreCase(str2)) {
                        return (int) (((long) intValue) * f4004iy);
                    }
                    if (C1245d.f3954iW.equalsIgnoreCase(str2)) {
                        return (int) (((long) intValue) * f4005iz);
                    }
                    return -1;
                }
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: b */
    public static void m5337b(String str, String str2, C1246a aVar) {
        C1224a.m5161aN().mo5887aQ().mo5940b(new C1230b(str, str2, aVar.getType()));
    }

    /* renamed from: a */
    public static Object m5329a(String str, C1246a aVar) {
        try {
            List ae = C1224a.m5161aN().mo5887aQ().mo5936ae(str);
            if (ae != null && !ae.isEmpty()) {
                return m5336b(((C1230b) ae.get(0)).mo5898aZ(), aVar);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* renamed from: b */
    public static Object m5336b(String str, C1246a aVar) {
        try {
            switch (aVar) {
                case Integer:
                    return Integer.valueOf(str);
                case Double:
                    return Double.valueOf(str);
                case Long:
                    return Long.valueOf(str);
                case Boolean:
                    return Boolean.valueOf(str);
                case Set:
                    return new HashSet(Arrays.asList(str.split(",")));
                case JSONArray:
                    return new JSONArray(str);
                case JSONObject:
                    return new JSONObject(str);
                default:
                    return str;
            }
        } catch (Throwable unused) {
            return null;
        }
    }
}
