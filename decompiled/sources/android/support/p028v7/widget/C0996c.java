package android.support.p028v7.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import com.appnext.base.p046b.C1245d;
import com.google.android.exoplayer2.C2793C;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.v7.widget.c */
/* compiled from: ActivityChooserModel */
class C0996c extends DataSetObservable {

    /* renamed from: a */
    static final String f3288a = "c";

    /* renamed from: e */
    private static final Object f3289e = new Object();

    /* renamed from: f */
    private static final Map<String, C0996c> f3290f = new HashMap();

    /* renamed from: b */
    final Context f3291b;

    /* renamed from: c */
    final String f3292c;

    /* renamed from: d */
    boolean f3293d;

    /* renamed from: g */
    private final Object f3294g;

    /* renamed from: h */
    private final List<C0997a> f3295h;

    /* renamed from: i */
    private final List<C0999c> f3296i;

    /* renamed from: j */
    private Intent f3297j;

    /* renamed from: k */
    private C0998b f3298k;

    /* renamed from: l */
    private int f3299l;

    /* renamed from: m */
    private boolean f3300m;

    /* renamed from: n */
    private boolean f3301n;

    /* renamed from: o */
    private boolean f3302o;

    /* renamed from: p */
    private C1000d f3303p;

    /* renamed from: android.support.v7.widget.c$a */
    /* compiled from: ActivityChooserModel */
    public static final class C0997a implements Comparable<C0997a> {

        /* renamed from: a */
        public final ResolveInfo f3304a;

        /* renamed from: b */
        public float f3305b;

        public C0997a(ResolveInfo resolveInfo) {
            this.f3304a = resolveInfo;
        }

        public int hashCode() {
            return 31 + Float.floatToIntBits(this.f3305b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return Float.floatToIntBits(this.f3305b) == Float.floatToIntBits(((C0997a) obj).f3305b);
        }

        /* renamed from: a */
        public int compareTo(C0997a aVar) {
            return Float.floatToIntBits(aVar.f3305b) - Float.floatToIntBits(this.f3305b);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append("resolveInfo:");
            sb.append(this.f3304a.toString());
            sb.append("; weight:");
            sb.append(new BigDecimal((double) this.f3305b));
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: android.support.v7.widget.c$b */
    /* compiled from: ActivityChooserModel */
    public interface C0998b {
        /* renamed from: a */
        void mo5194a(Intent intent, List<C0997a> list, List<C0999c> list2);
    }

    /* renamed from: android.support.v7.widget.c$c */
    /* compiled from: ActivityChooserModel */
    public static final class C0999c {

        /* renamed from: a */
        public final ComponentName f3306a;

        /* renamed from: b */
        public final long f3307b;

        /* renamed from: c */
        public final float f3308c;

        public C0999c(String str, long j, float f) {
            this(ComponentName.unflattenFromString(str), j, f);
        }

        public C0999c(ComponentName componentName, long j, float f) {
            this.f3306a = componentName;
            this.f3307b = j;
            this.f3308c = f;
        }

        public int hashCode() {
            return (31 * ((((this.f3306a == null ? 0 : this.f3306a.hashCode()) + 31) * 31) + ((int) (this.f3307b ^ (this.f3307b >>> 32))))) + Float.floatToIntBits(this.f3308c);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0999c cVar = (C0999c) obj;
            if (this.f3306a == null) {
                if (cVar.f3306a != null) {
                    return false;
                }
            } else if (!this.f3306a.equals(cVar.f3306a)) {
                return false;
            }
            return this.f3307b == cVar.f3307b && Float.floatToIntBits(this.f3308c) == Float.floatToIntBits(cVar.f3308c);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append("; activity:");
            sb.append(this.f3306a);
            sb.append("; time:");
            sb.append(this.f3307b);
            sb.append("; weight:");
            sb.append(new BigDecimal((double) this.f3308c));
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: android.support.v7.widget.c$d */
    /* compiled from: ActivityChooserModel */
    public interface C1000d {
        /* renamed from: a */
        boolean mo5198a(C0996c cVar, Intent intent);
    }

    /* renamed from: android.support.v7.widget.c$e */
    /* compiled from: ActivityChooserModel */
    private final class C1001e extends AsyncTask<Object, Void, Void> {
        C1001e() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x006f, code lost:
            if (r4 != null) goto L_0x0071;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
            r4.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0096, code lost:
            if (r4 == null) goto L_0x00dd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b8, code lost:
            if (r4 == null) goto L_0x00dd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00da, code lost:
            if (r4 == null) goto L_0x00dd;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void doInBackground(java.lang.Object... r12) {
            /*
                r11 = this;
                r0 = 0
                r1 = r12[r0]
                java.util.List r1 = (java.util.List) r1
                r2 = 1
                r12 = r12[r2]
                java.lang.String r12 = (java.lang.String) r12
                r3 = 0
                android.support.v7.widget.c r4 = android.support.p028v7.widget.C0996c.this     // Catch:{ FileNotFoundException -> 0x00e8 }
                android.content.Context r4 = r4.f3291b     // Catch:{ FileNotFoundException -> 0x00e8 }
                java.io.FileOutputStream r4 = r4.openFileOutput(r12, r0)     // Catch:{ FileNotFoundException -> 0x00e8 }
                org.xmlpull.v1.XmlSerializer r12 = android.util.Xml.newSerializer()
                r12.setOutput(r4, r3)     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                java.lang.String r5 = "UTF-8"
                java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                r12.startDocument(r5, r6)     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                java.lang.String r5 = "historical-records"
                r12.startTag(r3, r5)     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                int r5 = r1.size()     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                r6 = r0
            L_0x002d:
                if (r6 >= r5) goto L_0x0063
                java.lang.Object r7 = r1.remove(r0)     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                android.support.v7.widget.c$c r7 = (android.support.p028v7.widget.C0996c.C0999c) r7     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                java.lang.String r8 = "historical-record"
                r12.startTag(r3, r8)     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                java.lang.String r8 = "activity"
                android.content.ComponentName r9 = r7.f3306a     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                java.lang.String r9 = r9.flattenToString()     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                r12.attribute(r3, r8, r9)     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                java.lang.String r8 = "time"
                long r9 = r7.f3307b     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                r12.attribute(r3, r8, r9)     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                java.lang.String r8 = "weight"
                float r7 = r7.f3308c     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                r12.attribute(r3, r8, r7)     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                java.lang.String r7 = "historical-record"
                r12.endTag(r3, r7)     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                int r6 = r6 + 1
                goto L_0x002d
            L_0x0063:
                java.lang.String r0 = "historical-records"
                r12.endTag(r3, r0)     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                r12.endDocument()     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                android.support.v7.widget.c r12 = android.support.p028v7.widget.C0996c.this
                r12.f3293d = r2
                if (r4 == 0) goto L_0x00dd
            L_0x0071:
                r4.close()     // Catch:{ IOException -> 0x00dd }
                goto L_0x00dd
            L_0x0075:
                r12 = move-exception
                goto L_0x00de
            L_0x0077:
                r12 = move-exception
                java.lang.String r0 = android.support.p028v7.widget.C0996c.f3288a     // Catch:{ all -> 0x0075 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0075 }
                r1.<init>()     // Catch:{ all -> 0x0075 }
                java.lang.String r5 = "Error writing historical record file: "
                r1.append(r5)     // Catch:{ all -> 0x0075 }
                android.support.v7.widget.c r5 = android.support.p028v7.widget.C0996c.this     // Catch:{ all -> 0x0075 }
                java.lang.String r5 = r5.f3292c     // Catch:{ all -> 0x0075 }
                r1.append(r5)     // Catch:{ all -> 0x0075 }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0075 }
                android.util.Log.e(r0, r1, r12)     // Catch:{ all -> 0x0075 }
                android.support.v7.widget.c r12 = android.support.p028v7.widget.C0996c.this
                r12.f3293d = r2
                if (r4 == 0) goto L_0x00dd
                goto L_0x0071
            L_0x0099:
                r12 = move-exception
                java.lang.String r0 = android.support.p028v7.widget.C0996c.f3288a     // Catch:{ all -> 0x0075 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0075 }
                r1.<init>()     // Catch:{ all -> 0x0075 }
                java.lang.String r5 = "Error writing historical record file: "
                r1.append(r5)     // Catch:{ all -> 0x0075 }
                android.support.v7.widget.c r5 = android.support.p028v7.widget.C0996c.this     // Catch:{ all -> 0x0075 }
                java.lang.String r5 = r5.f3292c     // Catch:{ all -> 0x0075 }
                r1.append(r5)     // Catch:{ all -> 0x0075 }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0075 }
                android.util.Log.e(r0, r1, r12)     // Catch:{ all -> 0x0075 }
                android.support.v7.widget.c r12 = android.support.p028v7.widget.C0996c.this
                r12.f3293d = r2
                if (r4 == 0) goto L_0x00dd
                goto L_0x0071
            L_0x00bb:
                r12 = move-exception
                java.lang.String r0 = android.support.p028v7.widget.C0996c.f3288a     // Catch:{ all -> 0x0075 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0075 }
                r1.<init>()     // Catch:{ all -> 0x0075 }
                java.lang.String r5 = "Error writing historical record file: "
                r1.append(r5)     // Catch:{ all -> 0x0075 }
                android.support.v7.widget.c r5 = android.support.p028v7.widget.C0996c.this     // Catch:{ all -> 0x0075 }
                java.lang.String r5 = r5.f3292c     // Catch:{ all -> 0x0075 }
                r1.append(r5)     // Catch:{ all -> 0x0075 }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0075 }
                android.util.Log.e(r0, r1, r12)     // Catch:{ all -> 0x0075 }
                android.support.v7.widget.c r12 = android.support.p028v7.widget.C0996c.this
                r12.f3293d = r2
                if (r4 == 0) goto L_0x00dd
                goto L_0x0071
            L_0x00dd:
                return r3
            L_0x00de:
                android.support.v7.widget.c r0 = android.support.p028v7.widget.C0996c.this
                r0.f3293d = r2
                if (r4 == 0) goto L_0x00e7
                r4.close()     // Catch:{ IOException -> 0x00e7 }
            L_0x00e7:
                throw r12
            L_0x00e8:
                r0 = move-exception
                java.lang.String r1 = android.support.p028v7.widget.C0996c.f3288a
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r4 = "Error writing historical record file: "
                r2.append(r4)
                r2.append(r12)
                java.lang.String r12 = r2.toString()
                android.util.Log.e(r1, r12, r0)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p028v7.widget.C0996c.C1001e.doInBackground(java.lang.Object[]):java.lang.Void");
        }
    }

    /* renamed from: a */
    public int mo5182a() {
        int size;
        synchronized (this.f3294g) {
            m4491e();
            size = this.f3295h.size();
        }
        return size;
    }

    /* renamed from: a */
    public ResolveInfo mo5184a(int i) {
        ResolveInfo resolveInfo;
        synchronized (this.f3294g) {
            m4491e();
            resolveInfo = ((C0997a) this.f3295h.get(i)).f3304a;
        }
        return resolveInfo;
    }

    /* renamed from: a */
    public int mo5183a(ResolveInfo resolveInfo) {
        synchronized (this.f3294g) {
            m4491e();
            List<C0997a> list = this.f3295h;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((C0997a) list.get(i)).f3304a == resolveInfo) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* renamed from: b */
    public Intent mo5185b(int i) {
        synchronized (this.f3294g) {
            if (this.f3297j == null) {
                return null;
            }
            m4491e();
            C0997a aVar = (C0997a) this.f3295h.get(i);
            ComponentName componentName = new ComponentName(aVar.f3304a.activityInfo.packageName, aVar.f3304a.activityInfo.name);
            Intent intent = new Intent(this.f3297j);
            intent.setComponent(componentName);
            if (this.f3303p != null) {
                if (this.f3303p.mo5198a(this, new Intent(intent))) {
                    return null;
                }
            }
            m4489a(new C0999c(componentName, System.currentTimeMillis(), 1.0f));
            return intent;
        }
    }

    /* renamed from: b */
    public ResolveInfo mo5186b() {
        synchronized (this.f3294g) {
            m4491e();
            if (this.f3295h.isEmpty()) {
                return null;
            }
            ResolveInfo resolveInfo = ((C0997a) this.f3295h.get(0)).f3304a;
            return resolveInfo;
        }
    }

    /* renamed from: c */
    public void mo5188c(int i) {
        synchronized (this.f3294g) {
            m4491e();
            C0997a aVar = (C0997a) this.f3295h.get(i);
            C0997a aVar2 = (C0997a) this.f3295h.get(0);
            m4489a(new C0999c(new ComponentName(aVar.f3304a.activityInfo.packageName, aVar.f3304a.activityInfo.name), System.currentTimeMillis(), aVar2 != null ? (aVar2.f3305b - aVar.f3305b) + 5.0f : 1.0f));
        }
    }

    /* renamed from: d */
    private void m4490d() {
        if (!this.f3300m) {
            throw new IllegalStateException("No preceding call to #readHistoricalData");
        } else if (this.f3301n) {
            this.f3301n = false;
            if (!TextUtils.isEmpty(this.f3292c)) {
                new C1001e().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[]{new ArrayList(this.f3296i), this.f3292c});
            }
        }
    }

    /* renamed from: c */
    public int mo5187c() {
        int size;
        synchronized (this.f3294g) {
            m4491e();
            size = this.f3296i.size();
        }
        return size;
    }

    /* renamed from: e */
    private void m4491e() {
        boolean g = m4493g() | m4494h();
        m4495i();
        if (g) {
            m4492f();
            notifyChanged();
        }
    }

    /* renamed from: f */
    private boolean m4492f() {
        if (this.f3298k == null || this.f3297j == null || this.f3295h.isEmpty() || this.f3296i.isEmpty()) {
            return false;
        }
        this.f3298k.mo5194a(this.f3297j, this.f3295h, Collections.unmodifiableList(this.f3296i));
        return true;
    }

    /* renamed from: g */
    private boolean m4493g() {
        if (!this.f3302o || this.f3297j == null) {
            return false;
        }
        this.f3302o = false;
        this.f3295h.clear();
        List queryIntentActivities = this.f3291b.getPackageManager().queryIntentActivities(this.f3297j, 0);
        int size = queryIntentActivities.size();
        for (int i = 0; i < size; i++) {
            this.f3295h.add(new C0997a((ResolveInfo) queryIntentActivities.get(i)));
        }
        return true;
    }

    /* renamed from: h */
    private boolean m4494h() {
        if (!this.f3293d || !this.f3301n || TextUtils.isEmpty(this.f3292c)) {
            return false;
        }
        this.f3293d = false;
        this.f3300m = true;
        m4496j();
        return true;
    }

    /* renamed from: a */
    private boolean m4489a(C0999c cVar) {
        boolean add = this.f3296i.add(cVar);
        if (add) {
            this.f3301n = true;
            m4495i();
            m4490d();
            m4492f();
            notifyChanged();
        }
        return add;
    }

    /* renamed from: i */
    private void m4495i() {
        int size = this.f3296i.size() - this.f3299l;
        if (size > 0) {
            this.f3301n = true;
            for (int i = 0; i < size; i++) {
                C0999c cVar = (C0999c) this.f3296i.remove(0);
            }
        }
    }

    /* renamed from: j */
    private void m4496j() {
        try {
            FileInputStream openFileInput = this.f3291b.openFileInput(this.f3292c);
            try {
                XmlPullParser newPullParser = Xml.newPullParser();
                newPullParser.setInput(openFileInput, C2793C.UTF8_NAME);
                int i = 0;
                while (i != 1 && i != 2) {
                    i = newPullParser.next();
                }
                if (!"historical-records".equals(newPullParser.getName())) {
                    throw new XmlPullParserException("Share records file does not start with historical-records tag.");
                }
                List<C0999c> list = this.f3296i;
                list.clear();
                while (true) {
                    int next = newPullParser.next();
                    if (next != 1) {
                        if (!(next == 3 || next == 4)) {
                            if (!"historical-record".equals(newPullParser.getName())) {
                                throw new XmlPullParserException("Share records file not well-formed.");
                            }
                            list.add(new C0999c(newPullParser.getAttributeValue(null, "activity"), Long.parseLong(newPullParser.getAttributeValue(null, C1245d.f3955iX)), Float.parseFloat(newPullParser.getAttributeValue(null, "weight"))));
                        }
                    }
                }
            } catch (XmlPullParserException e) {
                String str = f3288a;
                StringBuilder sb = new StringBuilder();
                sb.append("Error reading historical recrod file: ");
                sb.append(this.f3292c);
                Log.e(str, sb.toString(), e);
            } catch (IOException e2) {
                String str2 = f3288a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Error reading historical recrod file: ");
                sb2.append(this.f3292c);
                Log.e(str2, sb2.toString(), e2);
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException unused) {
                    }
                }
            } finally {
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException unused2) {
                    }
                }
            }
        } catch (FileNotFoundException unused3) {
        }
    }
}
