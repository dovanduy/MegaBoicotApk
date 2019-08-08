package com.google.android.gms.internal.p148e;

import android.content.ContentResolver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.support.p017v4.p023d.C0376a;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.e.ag */
public final class C4439ag implements C4444al {

    /* renamed from: a */
    static final Map<Uri, C4439ag> f14654a = new C0376a();

    /* renamed from: g */
    private static final String[] f14655g = {"key", "value"};

    /* renamed from: b */
    private final ContentResolver f14656b;

    /* renamed from: c */
    private final Uri f14657c;

    /* renamed from: d */
    private final Object f14658d = new Object();

    /* renamed from: e */
    private volatile Map<String, String> f14659e;

    /* renamed from: f */
    private final List<C4443ak> f14660f = new ArrayList();

    private C4439ag(ContentResolver contentResolver, Uri uri) {
        this.f14656b = contentResolver;
        this.f14657c = uri;
        this.f14656b.registerContentObserver(uri, false, new C4441ai(this, null));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(5:5|6|7|8|9)|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0018 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.p148e.C4439ag m18880a(android.content.ContentResolver r3, android.net.Uri r4) {
        /*
            java.lang.Class<com.google.android.gms.internal.e.ag> r0 = com.google.android.gms.internal.p148e.C4439ag.class
            monitor-enter(r0)
            java.util.Map<android.net.Uri, com.google.android.gms.internal.e.ag> r1 = f14654a     // Catch:{ all -> 0x001a }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x001a }
            com.google.android.gms.internal.e.ag r1 = (com.google.android.gms.internal.p148e.C4439ag) r1     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0018
            com.google.android.gms.internal.e.ag r2 = new com.google.android.gms.internal.e.ag     // Catch:{ SecurityException -> 0x0018 }
            r2.<init>(r3, r4)     // Catch:{ SecurityException -> 0x0018 }
            java.util.Map<android.net.Uri, com.google.android.gms.internal.e.ag> r3 = f14654a     // Catch:{ SecurityException -> 0x0017 }
            r3.put(r4, r2)     // Catch:{ SecurityException -> 0x0017 }
        L_0x0017:
            r1 = r2
        L_0x0018:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r1
        L_0x001a:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p148e.C4439ag.m18880a(android.content.ContentResolver, android.net.Uri):com.google.android.gms.internal.e.ag");
    }

    /* renamed from: a */
    public final Map<String, String> mo16340a() {
        Map<String, String> map = this.f14659e;
        if (map == null) {
            synchronized (this.f14658d) {
                map = this.f14659e;
                if (map == null) {
                    map = m18881d();
                    this.f14659e = map;
                }
            }
        }
        if (map != null) {
            return map;
        }
        return Collections.emptyMap();
    }

    /* renamed from: b */
    public final void mo16341b() {
        synchronized (this.f14658d) {
            this.f14659e = null;
            C4451as.m18907a();
        }
        synchronized (this) {
            for (C4443ak a : this.f14660f) {
                a.mo16345a();
            }
        }
    }

    /* renamed from: d */
    private final Map<String, String> m18881d() {
        try {
            return (Map) C4445am.m18893a(new C4440ah(this));
        } catch (SQLiteException | SecurityException unused) {
            Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
            return null;
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo16339a(String str) {
        return (String) mo16340a().get(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ Map mo16342c() {
        Map map;
        Cursor query = this.f14656b.query(this.f14657c, f14655g, null, null, null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            if (count <= 256) {
                map = new C0376a(count);
            } else {
                map = new HashMap(count, 1.0f);
            }
            while (query.moveToNext()) {
                map.put(query.getString(0), query.getString(1));
            }
            query.close();
            return map;
        } finally {
            query.close();
        }
    }
}
