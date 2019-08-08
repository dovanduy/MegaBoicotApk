package com.startapp.android.publish.adsCommon;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import android.util.Pair;
import com.startapp.android.publish.adsCommon.p182f.C5376d;
import com.startapp.android.publish.adsCommon.p182f.C5378f;
import com.startapp.android.publish.common.metaData.C5481d;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.common.C5553f;
import com.startapp.common.C5554g;
import com.startapp.common.C5554g.C5558a;
import com.startapp.common.Constants;
import com.startapp.common.p193a.C5509c;
import com.startapp.common.p193a.C5518g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.startapp.android.publish.adsCommon.l */
/* compiled from: StartAppSDK */
public class C5416l {

    /* renamed from: a */
    private static List<PackageInfo> f17307a = null;

    /* renamed from: b */
    private static List<PackageInfo> f17308b = null;

    /* renamed from: c */
    private static long f17309c = 0;

    /* renamed from: d */
    private static volatile Pair<C5421a, String> f17310d = null;

    /* renamed from: e */
    private static volatile Pair<C5421a, String> f17311e = null;

    /* renamed from: f */
    private static boolean f17312f = true;

    /* renamed from: g */
    private static boolean f17313g = false;

    /* renamed from: h */
    private static C5421a f17314h = C5421a.UNDEFINED;

    /* renamed from: com.startapp.android.publish.adsCommon.l$a */
    /* compiled from: StartAppSDK */
    private enum C5421a {
        T1("token"),
        T2("token2"),
        UNDEFINED("");
        
        private final String text;

        private C5421a(String str) {
            this.text = str;
        }

        public String toString() {
            return this.text;
        }
    }

    /* renamed from: a */
    public static long m23113a() {
        return f17309c;
    }

    /* renamed from: a */
    public static void m23116a(final Context context) {
        m23124c(context);
        f17312f = true;
        f17313g = false;
        f17314h = C5421a.UNDEFINED;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        context.getApplicationContext().registerReceiver(new BroadcastReceiver() {
            public void onReceive(Context context, Intent intent) {
                C5416l.m23121b();
                C5416l.m23124c(context);
            }
        }, intentFilter);
        MetaData.getInstance().addMetaDataListener(new C5481d() {
            /* renamed from: a */
            public void mo19192a(boolean z) {
                if (z) {
                    C5416l.m23121b();
                    C5416l.m23124c(context);
                }
                MetaData.getInstance().addMetaDataListener(this);
            }

            /* renamed from: a */
            public void mo19191a() {
                MetaData.getInstance().addMetaDataListener(this);
            }
        });
    }

    /* renamed from: b */
    public static void m23122b(Context context) {
        m23117a(context, MetaData.getInstance().getSimpleTokenConfig().mo20294b(context));
    }

    /* renamed from: c */
    public static void m23124c(final Context context) {
        C5518g.m23563a("SimpleToken", 3, "initSimpleTokenAsync entered");
        try {
            if ((f17310d == null || f17311e == null) && MetaData.getInstance().getSimpleTokenConfig().mo20294b(context)) {
                C5554g.m23702a(C5558a.HIGH, (Runnable) new Runnable() {
                    public void run() {
                        C5416l.m23122b(context);
                    }
                });
            }
        } catch (Exception e) {
            C5518g.m23564a("SimpleToken", 6, "initSimpleTokenAsync failed", e);
            C5378f.m23016a(context, C5376d.EXCEPTION, "initSimpleTokenAsync", e.getMessage(), "");
        }
    }

    /* renamed from: a */
    static synchronized void m23117a(Context context, boolean z) {
        synchronized (C5416l.class) {
            C5518g.m23563a("SimpleToken", 3, "initSimpleToken entered");
            if ((f17310d == null || f17311e == null) && z) {
                try {
                    m23130g(context);
                    f17310d = new Pair<>(C5421a.T1, C5553f.m23699a(m23115a(f17307a)));
                    f17311e = new Pair<>(C5421a.T2, C5553f.m23699a(m23115a(f17308b)));
                    StringBuilder sb = new StringBuilder();
                    sb.append("simpleToken : [");
                    sb.append(f17310d);
                    sb.append("]");
                    C5518g.m23563a("SimpleToken", 3, sb.toString());
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("simpleToken2 : [");
                    sb2.append(f17311e);
                    sb2.append("]");
                    C5518g.m23563a("SimpleToken", 3, sb2.toString());
                } catch (Exception e) {
                    C5518g.m23564a("SimpleToken", 6, "initSimpleToken failed", e);
                    C5378f.m23016a(context, C5376d.EXCEPTION, "initSimpleToken", e.getMessage(), "");
                }
            }
        }
        return;
    }

    /* renamed from: b */
    public static void m23121b() {
        f17310d = null;
        f17311e = null;
    }

    /* renamed from: d */
    static Pair<String, String> m23127d(Context context) {
        return m23114a(context, MetaData.getInstance().getSimpleTokenConfig().mo20294b(context), MetaData.getInstance().isAlwaysSendToken(), MetaData.getInstance().isToken1Mandatory());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004d, code lost:
        if (com.startapp.android.publish.adsCommon.C5414k.m23096a(r4, "shared_prefs_simple_token", "").equals(r2.second) == false) goto L_0x004f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0032 A[Catch:{ Exception -> 0x0062 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0033 A[Catch:{ Exception -> 0x0062 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x003e A[Catch:{ Exception -> 0x0062 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x003f A[Catch:{ Exception -> 0x0062 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static synchronized android.util.Pair<java.lang.String, java.lang.String> m23114a(android.content.Context r4, boolean r5, boolean r6, boolean r7) {
        /*
            java.lang.Class<com.startapp.android.publish.adsCommon.l> r0 = com.startapp.android.publish.adsCommon.C5416l.class
            monitor-enter(r0)
            java.lang.String r1 = "SimpleToken"
            r2 = 3
            java.lang.String r3 = "getSimpleToken entered"
            com.startapp.common.p193a.C5518g.m23563a(r1, r2, r3)     // Catch:{ all -> 0x007c }
            android.util.Pair r1 = new android.util.Pair     // Catch:{ all -> 0x007c }
            com.startapp.android.publish.adsCommon.l$a r2 = com.startapp.android.publish.adsCommon.C5416l.C5421a.T1     // Catch:{ all -> 0x007c }
            java.lang.String r3 = ""
            r1.<init>(r2, r3)     // Catch:{ all -> 0x007c }
            if (r5 == 0) goto L_0x006b
            com.startapp.android.publish.adsCommon.l$a r5 = f17314h     // Catch:{ Exception -> 0x0062 }
            com.startapp.android.publish.adsCommon.l$a r2 = com.startapp.android.publish.adsCommon.C5416l.C5421a.UNDEFINED     // Catch:{ Exception -> 0x0062 }
            if (r5 != r2) goto L_0x0051
            boolean r5 = f17312f     // Catch:{ Exception -> 0x0062 }
            boolean r2 = f17313g     // Catch:{ Exception -> 0x0062 }
            if (r2 == 0) goto L_0x002c
            boolean r2 = f17312f     // Catch:{ Exception -> 0x0062 }
            if (r2 == 0) goto L_0x0027
            goto L_0x002c
        L_0x0027:
            android.util.Pair r2 = m23129f(r4)     // Catch:{ Exception -> 0x0062 }
            goto L_0x0030
        L_0x002c:
            android.util.Pair r2 = m23128e(r4)     // Catch:{ Exception -> 0x0062 }
        L_0x0030:
            if (r7 == 0) goto L_0x0033
            goto L_0x003a
        L_0x0033:
            boolean r5 = f17313g     // Catch:{ Exception -> 0x0062 }
            if (r5 != 0) goto L_0x0039
            r5 = 1
            goto L_0x003a
        L_0x0039:
            r5 = 0
        L_0x003a:
            f17313g = r5     // Catch:{ Exception -> 0x0062 }
            if (r6 == 0) goto L_0x003f
            goto L_0x004f
        L_0x003f:
            java.lang.String r5 = "shared_prefs_simple_token"
            java.lang.String r6 = ""
            java.lang.String r4 = com.startapp.android.publish.adsCommon.C5414k.m23096a(r4, r5, r6)     // Catch:{ Exception -> 0x0062 }
            java.lang.Object r5 = r2.second     // Catch:{ Exception -> 0x0062 }
            boolean r4 = r4.equals(r5)     // Catch:{ Exception -> 0x0062 }
            if (r4 != 0) goto L_0x006b
        L_0x004f:
            r1 = r2
            goto L_0x006b
        L_0x0051:
            com.startapp.android.publish.adsCommon.l$a r5 = f17314h     // Catch:{ Exception -> 0x0062 }
            com.startapp.android.publish.adsCommon.l$a r6 = com.startapp.android.publish.adsCommon.C5416l.C5421a.T1     // Catch:{ Exception -> 0x0062 }
            if (r5 != r6) goto L_0x005c
            android.util.Pair r4 = m23128e(r4)     // Catch:{ Exception -> 0x0062 }
            goto L_0x0060
        L_0x005c:
            android.util.Pair r4 = m23129f(r4)     // Catch:{ Exception -> 0x0062 }
        L_0x0060:
            r1 = r4
            goto L_0x006b
        L_0x0062:
            r4 = move-exception
            java.lang.String r5 = "SimpleToken"
            r6 = 6
            java.lang.String r7 = "failed to get simpleToken "
            com.startapp.common.p193a.C5518g.m23564a(r5, r6, r7, r4)     // Catch:{ all -> 0x007c }
        L_0x006b:
            android.util.Pair r4 = new android.util.Pair     // Catch:{ all -> 0x007c }
            java.lang.Object r5 = r1.first     // Catch:{ all -> 0x007c }
            com.startapp.android.publish.adsCommon.l$a r5 = (com.startapp.android.publish.adsCommon.C5416l.C5421a) r5     // Catch:{ all -> 0x007c }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x007c }
            java.lang.Object r6 = r1.second     // Catch:{ all -> 0x007c }
            r4.<init>(r5, r6)     // Catch:{ all -> 0x007c }
            monitor-exit(r0)
            return r4
        L_0x007c:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.android.publish.adsCommon.C5416l.m23114a(android.content.Context, boolean, boolean, boolean):android.util.Pair");
    }

    /* renamed from: a */
    static void m23119a(Pair<String, String> pair) {
        C5518g.m23563a("SimpleToken", 3, "errorSendingToken entered");
        f17314h = C5421a.valueOf((String) pair.first);
    }

    /* renamed from: c */
    public static Pair<String, String> m23123c() {
        if (f17310d != null) {
            return new Pair<>(((C5421a) f17310d.first).toString(), f17310d.second);
        }
        return new Pair<>(C5421a.T1.toString(), "");
    }

    /* renamed from: d */
    public static Pair<String, String> m23126d() {
        if (f17311e != null) {
            return new Pair<>(((C5421a) f17311e.first).toString(), f17311e.second);
        }
        return new Pair<>(C5421a.T2.toString(), "");
    }

    /* renamed from: e */
    private static Pair<C5421a, String> m23128e(Context context) {
        if (f17310d == null) {
            m23122b(context);
        }
        C5414k.m23103b(context, "shared_prefs_simple_token", (String) f17310d.second);
        f17312f = false;
        f17314h = C5421a.UNDEFINED;
        return new Pair<>(C5421a.T1, f17310d.second);
    }

    /* renamed from: f */
    private static Pair<C5421a, String> m23129f(Context context) {
        if (f17311e == null) {
            m23122b(context);
        }
        C5414k.m23103b(context, "shared_prefs_simple_token2", (String) f17311e.second);
        f17312f = false;
        f17314h = C5421a.UNDEFINED;
        return new Pair<>(C5421a.T2, f17311e.second);
    }

    /* renamed from: g */
    private static synchronized void m23130g(Context context) {
        synchronized (C5416l.class) {
            C5518g.m23563a("SimpleToken", 3, "getPackages entered");
            PackageManager packageManager = context.getPackageManager();
            Set installersList = MetaData.getInstance().getInstallersList();
            Set preInstalledPackages = MetaData.getInstance().getPreInstalledPackages();
            f17307a = new CopyOnWriteArrayList();
            f17308b = new CopyOnWriteArrayList();
            try {
                List<PackageInfo> a = C5509c.m23504a(packageManager);
                f17309c = VERSION.SDK_INT >= 9 ? Long.MAX_VALUE : 0;
                PackageInfo packageInfo = null;
                for (PackageInfo packageInfo2 : a) {
                    if (VERSION.SDK_INT >= 9 && f17309c > packageInfo2.firstInstallTime) {
                        f17309c = packageInfo2.firstInstallTime;
                    }
                    if (!C5509c.m23518a(packageInfo2)) {
                        f17307a.add(packageInfo2);
                        m23118a(packageInfo2, packageManager, installersList);
                    } else if (preInstalledPackages.contains(packageInfo2.packageName)) {
                        f17307a.add(packageInfo2);
                    } else if (packageInfo2.packageName.equals(Constants.f17536a)) {
                        packageInfo = packageInfo2;
                    }
                }
                f17307a = m23120b(f17307a);
                f17308b = m23120b(f17308b);
                if (packageInfo != null) {
                    f17307a.add(0, packageInfo);
                }
            } catch (Exception e) {
                C5518g.m23564a("SimpleToken", 6, "Could not complete getInstalledPackages", e);
            }
        }
    }

    /* renamed from: a */
    private static void m23118a(PackageInfo packageInfo, PackageManager packageManager, Set<String> set) {
        try {
            String installerPackageName = packageManager.getInstallerPackageName(packageInfo.packageName);
            if (set != null && set.contains(installerPackageName)) {
                f17308b.add(packageInfo);
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("addToPackagesFromInstallers - can't add app to list ");
            sb.append(e.getMessage());
            C5518g.m23563a("SimpleToken", 6, sb.toString());
        }
    }

    /* renamed from: a */
    private static List<String> m23115a(List<PackageInfo> list) {
        C5518g.m23563a("SimpleToken", 3, "getPackagesNames entered");
        ArrayList arrayList = new ArrayList();
        for (PackageInfo packageInfo : list) {
            arrayList.add(packageInfo.packageName);
        }
        return arrayList;
    }

    /* renamed from: b */
    private static List<PackageInfo> m23120b(List<PackageInfo> list) {
        if (list.size() <= 100) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        m23125c((List<PackageInfo>) arrayList);
        return arrayList.subList(0, 100);
    }

    /* renamed from: c */
    private static void m23125c(List<PackageInfo> list) {
        if (VERSION.SDK_INT >= 9) {
            Collections.sort(list, new Comparator<PackageInfo>() {
                @SuppressLint({"InlinedApi"})
                /* renamed from: a */
                public int compare(PackageInfo packageInfo, PackageInfo packageInfo2) {
                    long j = packageInfo.firstInstallTime;
                    long j2 = packageInfo2.firstInstallTime;
                    if (j > j2) {
                        return -1;
                    }
                    return j == j2 ? 0 : 1;
                }
            });
        }
    }
}
