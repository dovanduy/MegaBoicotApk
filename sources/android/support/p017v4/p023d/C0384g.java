package android.support.p017v4.p023d;

import java.util.LinkedHashMap;
import java.util.Locale;

/* renamed from: android.support.v4.d.g */
/* compiled from: LruCache */
public class C0384g<K, V> {

    /* renamed from: a */
    private final LinkedHashMap<K, V> f970a;

    /* renamed from: b */
    private int f971b;

    /* renamed from: c */
    private int f972c;

    /* renamed from: d */
    private int f973d;

    /* renamed from: e */
    private int f974e;

    /* renamed from: f */
    private int f975f;

    /* renamed from: g */
    private int f976g;

    /* renamed from: h */
    private int f977h;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1322a(boolean z, K k, V v, V v2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo1323b(K k, V v) {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public V mo1324b(K k) {
        return null;
    }

    public C0384g(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f972c = i;
        this.f970a = new LinkedHashMap<>(0, 0.75f, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        r0 = mo1324b(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        if (r0 != null) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r4.f974e++;
        r1 = r4.f970a.put(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
        if (r1 == null) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0039, code lost:
        r4.f970a.put(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
        r4.f971b += m1431c(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0049, code lost:
        if (r1 == null) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004b, code lost:
        mo1322a(false, r5, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004f, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0050, code lost:
        mo1321a(r4.f972c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0055, code lost:
        return r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V mo1318a(K r5) {
        /*
            r4 = this;
            if (r5 != 0) goto L_0x000a
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "key == null"
            r5.<init>(r0)
            throw r5
        L_0x000a:
            monitor-enter(r4)
            java.util.LinkedHashMap<K, V> r0 = r4.f970a     // Catch:{ all -> 0x0059 }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x0059 }
            if (r0 == 0) goto L_0x001b
            int r5 = r4.f976g     // Catch:{ all -> 0x0059 }
            int r5 = r5 + 1
            r4.f976g = r5     // Catch:{ all -> 0x0059 }
            monitor-exit(r4)     // Catch:{ all -> 0x0059 }
            return r0
        L_0x001b:
            int r0 = r4.f977h     // Catch:{ all -> 0x0059 }
            int r0 = r0 + 1
            r4.f977h = r0     // Catch:{ all -> 0x0059 }
            monitor-exit(r4)     // Catch:{ all -> 0x0059 }
            java.lang.Object r0 = r4.mo1324b(r5)
            if (r0 != 0) goto L_0x002a
            r5 = 0
            return r5
        L_0x002a:
            monitor-enter(r4)
            int r1 = r4.f974e     // Catch:{ all -> 0x0056 }
            int r1 = r1 + 1
            r4.f974e = r1     // Catch:{ all -> 0x0056 }
            java.util.LinkedHashMap<K, V> r1 = r4.f970a     // Catch:{ all -> 0x0056 }
            java.lang.Object r1 = r1.put(r5, r0)     // Catch:{ all -> 0x0056 }
            if (r1 == 0) goto L_0x003f
            java.util.LinkedHashMap<K, V> r2 = r4.f970a     // Catch:{ all -> 0x0056 }
            r2.put(r5, r1)     // Catch:{ all -> 0x0056 }
            goto L_0x0048
        L_0x003f:
            int r2 = r4.f971b     // Catch:{ all -> 0x0056 }
            int r3 = r4.m1431c(r5, r0)     // Catch:{ all -> 0x0056 }
            int r2 = r2 + r3
            r4.f971b = r2     // Catch:{ all -> 0x0056 }
        L_0x0048:
            monitor-exit(r4)     // Catch:{ all -> 0x0056 }
            if (r1 == 0) goto L_0x0050
            r2 = 0
            r4.mo1322a(r2, r5, r0, r1)
            return r1
        L_0x0050:
            int r5 = r4.f972c
            r4.mo1321a(r5)
            return r0
        L_0x0056:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0056 }
            throw r5
        L_0x0059:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0059 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p017v4.p023d.C0384g.mo1318a(java.lang.Object):java.lang.Object");
    }

    /* renamed from: a */
    public final V mo1319a(K k, V v) {
        V put;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f973d++;
            this.f971b += m1431c(k, v);
            put = this.f970a.put(k, v);
            if (put != null) {
                this.f971b -= m1431c(k, put);
            }
        }
        if (put != null) {
            mo1322a(false, k, put, v);
        }
        mo1321a(this.f972c);
        return put;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0053, code lost:
        r0 = new java.lang.StringBuilder();
        r0.append(getClass().getName());
        r0.append(".sizeOf() is reporting inconsistent results!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0071, code lost:
        throw new java.lang.IllegalStateException(r0.toString());
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1321a(int r5) {
        /*
            r4 = this;
        L_0x0000:
            monitor-enter(r4)
            int r0 = r4.f971b     // Catch:{ all -> 0x0072 }
            if (r0 < 0) goto L_0x0053
            java.util.LinkedHashMap<K, V> r0 = r4.f970a     // Catch:{ all -> 0x0072 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0072 }
            if (r0 == 0) goto L_0x0012
            int r0 = r4.f971b     // Catch:{ all -> 0x0072 }
            if (r0 == 0) goto L_0x0012
            goto L_0x0053
        L_0x0012:
            int r0 = r4.f971b     // Catch:{ all -> 0x0072 }
            if (r0 <= r5) goto L_0x0051
            java.util.LinkedHashMap<K, V> r0 = r4.f970a     // Catch:{ all -> 0x0072 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0072 }
            if (r0 == 0) goto L_0x001f
            goto L_0x0051
        L_0x001f:
            java.util.LinkedHashMap<K, V> r0 = r4.f970a     // Catch:{ all -> 0x0072 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0072 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0072 }
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x0072 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0072 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x0072 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0072 }
            java.util.LinkedHashMap<K, V> r2 = r4.f970a     // Catch:{ all -> 0x0072 }
            r2.remove(r1)     // Catch:{ all -> 0x0072 }
            int r2 = r4.f971b     // Catch:{ all -> 0x0072 }
            int r3 = r4.m1431c(r1, r0)     // Catch:{ all -> 0x0072 }
            int r2 = r2 - r3
            r4.f971b = r2     // Catch:{ all -> 0x0072 }
            int r2 = r4.f975f     // Catch:{ all -> 0x0072 }
            r3 = 1
            int r2 = r2 + r3
            r4.f975f = r2     // Catch:{ all -> 0x0072 }
            monitor-exit(r4)     // Catch:{ all -> 0x0072 }
            r2 = 0
            r4.mo1322a(r3, r1, r0, r2)
            goto L_0x0000
        L_0x0051:
            monitor-exit(r4)     // Catch:{ all -> 0x0072 }
            return
        L_0x0053:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0072 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0072 }
            r0.<init>()     // Catch:{ all -> 0x0072 }
            java.lang.Class r1 = r4.getClass()     // Catch:{ all -> 0x0072 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0072 }
            r0.append(r1)     // Catch:{ all -> 0x0072 }
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch:{ all -> 0x0072 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0072 }
            r5.<init>(r0)     // Catch:{ all -> 0x0072 }
            throw r5     // Catch:{ all -> 0x0072 }
        L_0x0072:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0072 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p017v4.p023d.C0384g.mo1321a(int):void");
    }

    /* renamed from: c */
    private int m1431c(K k, V v) {
        int b = mo1323b(k, v);
        if (b >= 0) {
            return b;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Negative size: ");
        sb.append(k);
        sb.append("=");
        sb.append(v);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public final void mo1320a() {
        mo1321a(-1);
    }

    public final synchronized String toString() {
        int i;
        i = this.f976g + this.f977h;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.f972c), Integer.valueOf(this.f976g), Integer.valueOf(this.f977h), Integer.valueOf(i != 0 ? (100 * this.f976g) / i : 0)});
    }
}
