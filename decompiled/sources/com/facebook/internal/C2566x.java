package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.C2579j;
import com.facebook.C2581l;
import com.facebook.C2649m;
import com.facebook.login.C2606a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.internal.x */
/* compiled from: NativeProtocol */
public final class C2566x {

    /* renamed from: a */
    private static final String f8024a = "com.facebook.internal.x";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final List<C2572e> f8025b = m9761e();

    /* renamed from: c */
    private static final List<C2572e> f8026c = m9762f();

    /* renamed from: d */
    private static final Map<String, List<C2572e>> f8027d = m9765g();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final AtomicBoolean f8028e = new AtomicBoolean(false);

    /* renamed from: f */
    private static final List<Integer> f8029f = Arrays.asList(new Integer[]{Integer.valueOf(20170417), Integer.valueOf(20160327), Integer.valueOf(20141218), Integer.valueOf(20141107), Integer.valueOf(20141028), Integer.valueOf(20141001), Integer.valueOf(20140701), Integer.valueOf(20140324), Integer.valueOf(20140204), Integer.valueOf(20131107), Integer.valueOf(20130618), Integer.valueOf(20130502), Integer.valueOf(20121101)});

    /* renamed from: com.facebook.internal.x$a */
    /* compiled from: NativeProtocol */
    private static class C2568a extends C2572e {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String mo9078a() {
            return "com.facebook.arstudio.player";
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public String mo9079b() {
            return null;
        }

        private C2568a() {
            super();
        }
    }

    /* renamed from: com.facebook.internal.x$b */
    /* compiled from: NativeProtocol */
    private static class C2569b extends C2572e {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String mo9078a() {
            return "com.facebook.lite";
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public String mo9079b() {
            return "com.facebook.lite.platform.LoginGDPDialogActivity";
        }

        private C2569b() {
            super();
        }
    }

    /* renamed from: com.facebook.internal.x$c */
    /* compiled from: NativeProtocol */
    private static class C2570c extends C2572e {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String mo9078a() {
            return "com.facebook.katana";
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public String mo9079b() {
            return "com.facebook.katana.ProxyAuth";
        }

        private C2570c() {
            super();
        }
    }

    /* renamed from: com.facebook.internal.x$d */
    /* compiled from: NativeProtocol */
    private static class C2571d extends C2572e {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String mo9078a() {
            return "com.facebook.orca";
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public String mo9079b() {
            return null;
        }

        private C2571d() {
            super();
        }
    }

    /* renamed from: com.facebook.internal.x$e */
    /* compiled from: NativeProtocol */
    private static abstract class C2572e {

        /* renamed from: a */
        private TreeSet<Integer> f8030a;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract String mo9078a();

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract String mo9079b();

        private C2572e() {
        }

        /* renamed from: c */
        public TreeSet<Integer> mo9080c() {
            if (this.f8030a == null) {
                m9775a(false);
            }
            return this.f8030a;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public synchronized void m9775a(boolean z) {
            if (!z) {
                try {
                    if (this.f8030a == null) {
                    }
                } finally {
                }
            }
            this.f8030a = C2566x.m9752b(this);
        }
    }

    /* renamed from: com.facebook.internal.x$f */
    /* compiled from: NativeProtocol */
    public static class C2573f {

        /* renamed from: a */
        private C2572e f8031a;

        /* renamed from: b */
        private int f8032b;

        /* renamed from: a */
        public static C2573f m9780a(C2572e eVar, int i) {
            C2573f fVar = new C2573f();
            fVar.f8031a = eVar;
            fVar.f8032b = i;
            return fVar;
        }

        /* renamed from: a */
        public static C2573f m9779a() {
            C2573f fVar = new C2573f();
            fVar.f8032b = -1;
            return fVar;
        }

        private C2573f() {
        }

        /* renamed from: b */
        public int mo9081b() {
            return this.f8032b;
        }
    }

    /* renamed from: com.facebook.internal.x$g */
    /* compiled from: NativeProtocol */
    private static class C2574g extends C2572e {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String mo9078a() {
            return "com.facebook.wakizashi";
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public String mo9079b() {
            return "com.facebook.katana.ProxyAuth";
        }

        private C2574g() {
            super();
        }
    }

    /* renamed from: e */
    private static List<C2572e> m9761e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C2570c());
        arrayList.add(new C2574g());
        return arrayList;
    }

    /* renamed from: f */
    private static List<C2572e> m9762f() {
        ArrayList arrayList = new ArrayList(m9761e());
        arrayList.add(0, new C2568a());
        return arrayList;
    }

    /* renamed from: g */
    private static Map<String, List<C2572e>> m9765g() {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C2571d());
        hashMap.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", f8025b);
        hashMap.put("com.facebook.platform.action.request.FEED_DIALOG", f8025b);
        hashMap.put("com.facebook.platform.action.request.LIKE_DIALOG", f8025b);
        hashMap.put("com.facebook.platform.action.request.APPINVITES_DIALOG", f8025b);
        hashMap.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arrayList);
        hashMap.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arrayList);
        hashMap.put("com.facebook.platform.action.request.CAMERA_EFFECT", f8026c);
        return hashMap;
    }

    /* renamed from: a */
    static Intent m9740a(Context context, Intent intent, C2572e eVar) {
        if (intent == null) {
            return null;
        }
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 0);
        if (resolveActivity != null && C2524i.m9612a(context, resolveActivity.activityInfo.packageName)) {
            return intent;
        }
        return null;
    }

    /* renamed from: b */
    static Intent m9750b(Context context, Intent intent, C2572e eVar) {
        if (intent == null) {
            return null;
        }
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
        if (resolveService != null && C2524i.m9612a(context, resolveService.serviceInfo.packageName)) {
            return intent;
        }
        return null;
    }

    /* renamed from: a */
    public static Intent m9741a(Context context, String str, Collection<String> collection, String str2, boolean z, boolean z2, C2606a aVar, String str3, String str4) {
        C2569b bVar = new C2569b();
        return m9740a(context, m9743a((C2572e) bVar, str, collection, str2, z, z2, aVar, str3, str4), (C2572e) bVar);
    }

    /* renamed from: a */
    private static Intent m9743a(C2572e eVar, String str, Collection<String> collection, String str2, boolean z, boolean z2, C2606a aVar, String str3, String str4) {
        String b = eVar.mo9079b();
        if (b == null) {
            return null;
        }
        Intent putExtra = new Intent().setClassName(eVar.mo9078a(), b).putExtra("client_id", str);
        putExtra.putExtra("facebook_sdk_version", C2649m.m10135h());
        if (!C2479ad.m9457a(collection)) {
            putExtra.putExtra("scope", TextUtils.join(",", collection));
        }
        if (!C2479ad.m9456a(str2)) {
            putExtra.putExtra("e2e", str2);
        }
        putExtra.putExtra("state", str3);
        putExtra.putExtra("response_type", "token,signed_request");
        putExtra.putExtra("return_scopes", "true");
        if (z2) {
            putExtra.putExtra("default_audience", aVar.mo9224a());
        }
        putExtra.putExtra("legacy_override", C2649m.m10134g());
        putExtra.putExtra("auth_type", str4);
        return putExtra;
    }

    /* renamed from: b */
    public static Intent m9751b(Context context, String str, Collection<String> collection, String str2, boolean z, boolean z2, C2606a aVar, String str3, String str4) {
        for (C2572e eVar : f8025b) {
            Intent a = m9740a(context, m9743a(eVar, str, collection, str2, z, z2, aVar, str3, str4), eVar);
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static final int m9736a() {
        return ((Integer) f8029f.get(0)).intValue();
    }

    /* renamed from: a */
    public static boolean m9748a(int i) {
        return f8029f.contains(Integer.valueOf(i)) && i >= 20140701;
    }

    /* renamed from: a */
    public static Intent m9742a(Intent intent, Bundle bundle, C2579j jVar) {
        UUID b = m9753b(intent);
        if (b == null) {
            return null;
        }
        Intent intent2 = new Intent();
        intent2.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", m9737a(intent));
        Bundle bundle2 = new Bundle();
        bundle2.putString("action_id", b.toString());
        if (jVar != null) {
            bundle2.putBundle("error", m9744a(jVar));
        }
        intent2.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
        if (bundle != null) {
            intent2.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
        }
        return intent2;
    }

    /* renamed from: a */
    public static Intent m9739a(Context context) {
        for (C2572e eVar : f8025b) {
            Intent b = m9750b(context, new Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage(eVar.mo9078a()).addCategory("android.intent.category.DEFAULT"), eVar);
            if (b != null) {
                return b;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static int m9737a(Intent intent) {
        return intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
    }

    /* renamed from: b */
    public static UUID m9753b(Intent intent) {
        String str;
        UUID uuid;
        if (intent == null) {
            return null;
        }
        if (m9748a(m9737a(intent))) {
            Bundle bundleExtra = intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
            str = bundleExtra != null ? bundleExtra.getString("action_id") : null;
        } else {
            str = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
        }
        if (str != null) {
            try {
                uuid = UUID.fromString(str);
            } catch (IllegalArgumentException unused) {
            }
            return uuid;
        }
        uuid = null;
        return uuid;
    }

    /* renamed from: c */
    public static Bundle m9756c(Intent intent) {
        if (!m9748a(m9737a(intent))) {
            return null;
        }
        return intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
    }

    /* renamed from: d */
    public static Bundle m9758d(Intent intent) {
        if (!m9748a(m9737a(intent))) {
            return intent.getExtras();
        }
        return intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
    }

    /* renamed from: e */
    public static Bundle m9760e(Intent intent) {
        int a = m9737a(intent);
        Bundle extras = intent.getExtras();
        return (!m9748a(a) || extras == null) ? extras : extras.getBundle("com.facebook.platform.protocol.RESULT_ARGS");
    }

    /* renamed from: f */
    public static boolean m9763f(Intent intent) {
        Bundle c = m9756c(intent);
        if (c != null) {
            return c.containsKey("error");
        }
        return intent.hasExtra("com.facebook.platform.status.ERROR_TYPE");
    }

    /* renamed from: g */
    public static Bundle m9764g(Intent intent) {
        if (!m9763f(intent)) {
            return null;
        }
        Bundle c = m9756c(intent);
        if (c != null) {
            return c.getBundle("error");
        }
        return intent.getExtras();
    }

    /* renamed from: a */
    public static C2579j m9746a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        String string = bundle.getString("error_type");
        if (string == null) {
            string = bundle.getString("com.facebook.platform.status.ERROR_TYPE");
        }
        String string2 = bundle.getString("error_description");
        if (string2 == null) {
            string2 = bundle.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
        }
        if (string == null || !string.equalsIgnoreCase("UserCanceled")) {
            return new C2579j(string2);
        }
        return new C2581l(string2);
    }

    /* renamed from: a */
    public static Bundle m9744a(C2579j jVar) {
        if (jVar == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("error_description", jVar.toString());
        if (jVar instanceof C2581l) {
            bundle.putString("error_type", "UserCanceled");
        }
        return bundle;
    }

    /* renamed from: b */
    public static int m9749b(int i) {
        return m9745a(f8025b, new int[]{i}).mo9081b();
    }

    /* renamed from: a */
    private static C2573f m9745a(List<C2572e> list, int[] iArr) {
        m9754b();
        if (list == null) {
            return C2573f.m9779a();
        }
        for (C2572e eVar : list) {
            int a = m9738a(eVar.mo9080c(), m9736a(), iArr);
            if (a != -1) {
                return C2573f.m9780a(eVar, a);
            }
        }
        return C2573f.m9779a();
    }

    /* renamed from: b */
    public static void m9754b() {
        if (f8028e.compareAndSet(false, true)) {
            C2649m.m10131d().execute(new Runnable() {
                public void run() {
                    try {
                        for (C2572e a : C2566x.f8025b) {
                            a.m9775a(true);
                        }
                    } finally {
                        C2566x.f8028e.set(false);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        android.util.Log.e(f8024a, "Failed to query content resolver.");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0051 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.TreeSet<java.lang.Integer> m9752b(com.facebook.internal.C2566x.C2572e r9) {
        /*
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>()
            android.content.Context r1 = com.facebook.C2649m.m10133f()
            android.content.ContentResolver r2 = r1.getContentResolver()
            r1 = 1
            java.lang.String[] r4 = new java.lang.String[r1]
            java.lang.String r1 = "version"
            r3 = 0
            r4[r3] = r1
            android.net.Uri r1 = m9755c(r9)
            r8 = 0
            android.content.Context r5 = com.facebook.C2649m.m10133f()     // Catch:{ all -> 0x0078 }
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch:{ all -> 0x0078 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0078 }
            r6.<init>()     // Catch:{ all -> 0x0078 }
            java.lang.String r9 = r9.mo9078a()     // Catch:{ all -> 0x0078 }
            r6.append(r9)     // Catch:{ all -> 0x0078 }
            java.lang.String r9 = ".provider.PlatformProvider"
            r6.append(r9)     // Catch:{ all -> 0x0078 }
            java.lang.String r9 = r6.toString()     // Catch:{ all -> 0x0078 }
            android.content.pm.ProviderInfo r9 = r5.resolveContentProvider(r9, r3)     // Catch:{ RuntimeException -> 0x003c }
            goto L_0x0045
        L_0x003c:
            r9 = move-exception
            java.lang.String r3 = f8024a     // Catch:{ all -> 0x0078 }
            java.lang.String r5 = "Failed to query content resolver."
            android.util.Log.e(r3, r5, r9)     // Catch:{ all -> 0x0078 }
            r9 = r8
        L_0x0045:
            if (r9 == 0) goto L_0x0072
            r5 = 0
            r6 = 0
            r7 = 0
            r3 = r1
            android.database.Cursor r9 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ IllegalArgumentException | NullPointerException | SecurityException -> 0x0051 }
            r8 = r9
            goto L_0x0058
        L_0x0051:
            java.lang.String r9 = f8024a     // Catch:{ all -> 0x0078 }
            java.lang.String r1 = "Failed to query content resolver."
            android.util.Log.e(r9, r1)     // Catch:{ all -> 0x0078 }
        L_0x0058:
            if (r8 == 0) goto L_0x0072
        L_0x005a:
            boolean r9 = r8.moveToNext()     // Catch:{ all -> 0x0078 }
            if (r9 == 0) goto L_0x0072
            java.lang.String r9 = "version"
            int r9 = r8.getColumnIndex(r9)     // Catch:{ all -> 0x0078 }
            int r9 = r8.getInt(r9)     // Catch:{ all -> 0x0078 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0078 }
            r0.add(r9)     // Catch:{ all -> 0x0078 }
            goto L_0x005a
        L_0x0072:
            if (r8 == 0) goto L_0x0077
            r8.close()
        L_0x0077:
            return r0
        L_0x0078:
            r9 = move-exception
            if (r8 == 0) goto L_0x007e
            r8.close()
        L_0x007e:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C2566x.m9752b(com.facebook.internal.x$e):java.util.TreeSet");
    }

    /* renamed from: a */
    public static int m9738a(TreeSet<Integer> treeSet, int i, int[] iArr) {
        int i2 = -1;
        int length = iArr.length - 1;
        Iterator descendingIterator = treeSet.descendingIterator();
        int i3 = length;
        int i4 = -1;
        while (descendingIterator.hasNext()) {
            int intValue = ((Integer) descendingIterator.next()).intValue();
            i4 = Math.max(i4, intValue);
            while (i3 >= 0 && iArr[i3] > intValue) {
                i3--;
            }
            if (i3 < 0) {
                return -1;
            }
            if (iArr[i3] == intValue) {
                if (i3 % 2 == 0) {
                    i2 = Math.min(i4, i);
                }
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: c */
    private static Uri m9755c(C2572e eVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("content://");
        sb.append(eVar.mo9078a());
        sb.append(".provider.PlatformProvider/versions");
        return Uri.parse(sb.toString());
    }
}
