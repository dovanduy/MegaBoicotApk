package com.facebook.ads.internal.p083j;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Looper;
import com.facebook.ads.internal.p083j.C1747f.C1748a;
import com.facebook.ads.internal.p115w.p117b.C2328p;
import com.facebook.ads.internal.p115w.p123h.C2370a;
import com.facebook.ads.internal.p115w.p123h.C2373b;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.facebook.ads.internal.j.d */
public class C1743d {

    /* renamed from: a */
    private static final String f5452a;

    /* renamed from: b */
    private static final ReentrantReadWriteLock f5453b = new ReentrantReadWriteLock();

    /* renamed from: c */
    private static final Lock f5454c = f5453b.readLock();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final Lock f5455d = f5453b.writeLock();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Context f5456e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C1750h f5457f = new C1750h(this);
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C1742c f5458g = new C1742c(this);

    /* renamed from: h */
    private SQLiteOpenHelper f5459h;

    /* renamed from: com.facebook.ads.internal.j.d$a */
    private static class C1745a<T> extends AsyncTask<Void, Void, T> {

        /* renamed from: a */
        private final C1747f<T> f5468a;

        /* renamed from: b */
        private final C1740a<T> f5469b;

        /* renamed from: c */
        private final Context f5470c;

        /* renamed from: d */
        private C1748a f5471d;

        C1745a(Context context, C1747f<T> fVar, C1740a<T> aVar) {
            this.f5468a = fVar;
            this.f5469b = aVar;
            this.f5470c = context;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public T doInBackground(Void... voidArr) {
            Exception e;
            T t;
            try {
                t = this.f5468a.mo7550b();
                try {
                    this.f5471d = this.f5468a.mo7559c();
                    return t;
                } catch (Exception e2) {
                    e = e2;
                    C2370a.m9149b(this.f5470c, "database", C2373b.f7522x, e);
                    this.f5471d = C1748a.UNKNOWN;
                    return t;
                }
            } catch (Exception e3) {
                Exception exc = e3;
                t = null;
                e = exc;
                C2370a.m9149b(this.f5470c, "database", C2373b.f7522x, e);
                this.f5471d = C1748a.UNKNOWN;
                return t;
            }
        }

        /* access modifiers changed from: protected */
        public void onPostExecute(T t) {
            if (this.f5471d == null) {
                this.f5469b.mo7528a(t);
            } else {
                this.f5469b.mo7527a(this.f5471d.mo7560a(), this.f5471d.mo7561b());
            }
            this.f5469b.mo7526a();
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT tokens.");
        sb.append(C1750h.f5484a.f5439b);
        sb.append(", ");
        sb.append("tokens");
        sb.append(".");
        sb.append(C1750h.f5485b.f5439b);
        sb.append(", ");
        sb.append("events");
        sb.append(".");
        sb.append(C1742c.f5441a.f5439b);
        sb.append(", ");
        sb.append("events");
        sb.append(".");
        sb.append(C1742c.f5443c.f5439b);
        sb.append(", ");
        sb.append("events");
        sb.append(".");
        sb.append(C1742c.f5444d.f5439b);
        sb.append(", ");
        sb.append("events");
        sb.append(".");
        sb.append(C1742c.f5445e.f5439b);
        sb.append(", ");
        sb.append("events");
        sb.append(".");
        sb.append(C1742c.f5446f.f5439b);
        sb.append(", ");
        sb.append("events");
        sb.append(".");
        sb.append(C1742c.f5447g.f5439b);
        sb.append(", ");
        sb.append("events");
        sb.append(".");
        sb.append(C1742c.f5448h.f5439b);
        sb.append(", ");
        sb.append("events");
        sb.append(".");
        sb.append(C1742c.f5449i.f5439b);
        sb.append(" FROM ");
        sb.append("events");
        sb.append(" JOIN ");
        sb.append("tokens");
        sb.append(" ON ");
        sb.append("events");
        sb.append(".");
        sb.append(C1742c.f5442b.f5439b);
        sb.append(" = ");
        sb.append("tokens");
        sb.append(".");
        sb.append(C1750h.f5484a.f5439b);
        sb.append(" ORDER BY ");
        sb.append("events");
        sb.append(".");
        sb.append(C1742c.f5445e.f5439b);
        sb.append(" ASC");
        f5452a = sb.toString();
    }

    public C1743d(Context context) {
        this.f5456e = context;
    }

    /* renamed from: j */
    private synchronized SQLiteDatabase m7234j() {
        if (this.f5459h == null) {
            this.f5459h = new C1746e(this.f5456e, this);
        }
        return this.f5459h.getWritableDatabase();
    }

    /* renamed from: a */
    public Cursor mo7536a(int i) {
        f5454c.lock();
        try {
            SQLiteDatabase a = mo7537a();
            StringBuilder sb = new StringBuilder();
            sb.append(f5452a);
            sb.append(" LIMIT ");
            sb.append(String.valueOf(i));
            Cursor rawQuery = a.rawQuery(sb.toString(), null);
            return rawQuery;
        } finally {
            f5454c.unlock();
        }
    }

    /* renamed from: a */
    public SQLiteDatabase mo7537a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return m7234j();
        }
        throw new IllegalStateException("Cannot call getDatabase from the UI thread!");
    }

    /* renamed from: a */
    public <T> AsyncTask mo7538a(C1747f<T> fVar, C1740a<T> aVar) {
        Executor executor = C2328p.f7323b;
        C1745a aVar2 = new C1745a(this.f5456e.getApplicationContext(), fVar, aVar);
        Void[] voidArr = new Void[0];
        if (VERSION.SDK_INT >= 11) {
            aVar2.executeOnExecutor(executor, voidArr);
            return aVar2;
        }
        aVar2.execute(voidArr);
        return aVar2;
    }

    /* renamed from: a */
    public AsyncTask mo7539a(String str, int i, String str2, double d, double d2, String str3, Map<String, String> map, C1740a<String> aVar) {
        final String str4 = str;
        final int i2 = i;
        final String str5 = str2;
        final double d3 = d;
        final double d4 = d2;
        final String str6 = str3;
        final Map<String, String> map2 = map;
        C17441 r0 = new C1751i<String>() {
            /* JADX WARNING: Removed duplicated region for block: B:32:0x0090 A[Catch:{ Exception -> 0x0094 }] */
            /* JADX WARNING: Removed duplicated region for block: B:44:0x00b9 A[Catch:{ Exception -> 0x00bd }] */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.String mo7550b() {
                /*
                    r14 = this;
                    java.lang.String r0 = r2
                    boolean r0 = android.text.TextUtils.isEmpty(r0)
                    r1 = 0
                    if (r0 == 0) goto L_0x000a
                    return r1
                L_0x000a:
                    java.util.concurrent.locks.Lock r0 = com.facebook.ads.internal.p083j.C1743d.f5455d
                    r0.lock()
                    com.facebook.ads.internal.j.d r0 = com.facebook.ads.internal.p083j.C1743d.this     // Catch:{ Exception -> 0x006e, all -> 0x0069 }
                    android.database.sqlite.SQLiteDatabase r0 = r0.mo7537a()     // Catch:{ Exception -> 0x006e, all -> 0x0069 }
                    r0.beginTransaction()     // Catch:{ Exception -> 0x0067 }
                    com.facebook.ads.internal.j.d r2 = com.facebook.ads.internal.p083j.C1743d.this     // Catch:{ Exception -> 0x0067 }
                    com.facebook.ads.internal.j.c r3 = r2.f5458g     // Catch:{ Exception -> 0x0067 }
                    com.facebook.ads.internal.j.d r2 = com.facebook.ads.internal.p083j.C1743d.this     // Catch:{ Exception -> 0x0067 }
                    com.facebook.ads.internal.j.h r2 = r2.f5457f     // Catch:{ Exception -> 0x0067 }
                    java.lang.String r4 = r2     // Catch:{ Exception -> 0x0067 }
                    java.lang.String r4 = r2.mo7567a(r4)     // Catch:{ Exception -> 0x0067 }
                    int r5 = r3     // Catch:{ Exception -> 0x0067 }
                    java.lang.String r6 = r4     // Catch:{ Exception -> 0x0067 }
                    double r7 = r5     // Catch:{ Exception -> 0x0067 }
                    double r9 = r7     // Catch:{ Exception -> 0x0067 }
                    java.lang.String r11 = r9     // Catch:{ Exception -> 0x0067 }
                    java.util.Map r12 = r10     // Catch:{ Exception -> 0x0067 }
                    java.lang.String r2 = r3.mo7531a(r4, r5, r6, r7, r9, r11, r12)     // Catch:{ Exception -> 0x0067 }
                    r0.setTransactionSuccessful()     // Catch:{ Exception -> 0x0067 }
                    if (r0 == 0) goto L_0x005f
                    boolean r1 = r0.isOpen()
                    if (r1 == 0) goto L_0x005f
                    boolean r1 = r0.inTransaction()     // Catch:{ Exception -> 0x0051 }
                    if (r1 == 0) goto L_0x005f
                    r0.endTransaction()     // Catch:{ Exception -> 0x0051 }
                    goto L_0x005f
                L_0x0051:
                    r0 = move-exception
                    com.facebook.ads.internal.j.d r1 = com.facebook.ads.internal.p083j.C1743d.this
                    android.content.Context r1 = r1.f5456e
                    java.lang.String r3 = "database"
                    int r4 = com.facebook.ads.internal.p115w.p123h.C2373b.f7521w
                    com.facebook.ads.internal.p115w.p123h.C2370a.m9149b(r1, r3, r4, r0)
                L_0x005f:
                    java.util.concurrent.locks.Lock r0 = com.facebook.ads.internal.p083j.C1743d.f5455d
                    r0.unlock()
                    return r2
                L_0x0067:
                    r2 = move-exception
                    goto L_0x0070
                L_0x0069:
                    r0 = move-exception
                    r13 = r1
                    r1 = r0
                    r0 = r13
                    goto L_0x00ab
                L_0x006e:
                    r2 = move-exception
                    r0 = r1
                L_0x0070:
                    com.facebook.ads.internal.j.f$a r3 = com.facebook.ads.internal.p083j.C1747f.C1748a.DATABASE_INSERT     // Catch:{ all -> 0x00aa }
                    r14.mo7558a(r3)     // Catch:{ all -> 0x00aa }
                    com.facebook.ads.internal.j.d r3 = com.facebook.ads.internal.p083j.C1743d.this     // Catch:{ all -> 0x00aa }
                    android.content.Context r3 = r3.f5456e     // Catch:{ all -> 0x00aa }
                    java.lang.String r4 = "database"
                    int r5 = com.facebook.ads.internal.p115w.p123h.C2373b.f7519u     // Catch:{ all -> 0x00aa }
                    com.facebook.ads.internal.p115w.p123h.C2370a.m9149b(r3, r4, r5, r2)     // Catch:{ all -> 0x00aa }
                    if (r0 == 0) goto L_0x00a2
                    boolean r2 = r0.isOpen()
                    if (r2 == 0) goto L_0x00a2
                    boolean r2 = r0.inTransaction()     // Catch:{ Exception -> 0x0094 }
                    if (r2 == 0) goto L_0x00a2
                    r0.endTransaction()     // Catch:{ Exception -> 0x0094 }
                    goto L_0x00a2
                L_0x0094:
                    r0 = move-exception
                    com.facebook.ads.internal.j.d r2 = com.facebook.ads.internal.p083j.C1743d.this
                    android.content.Context r2 = r2.f5456e
                    java.lang.String r3 = "database"
                    int r4 = com.facebook.ads.internal.p115w.p123h.C2373b.f7521w
                    com.facebook.ads.internal.p115w.p123h.C2370a.m9149b(r2, r3, r4, r0)
                L_0x00a2:
                    java.util.concurrent.locks.Lock r0 = com.facebook.ads.internal.p083j.C1743d.f5455d
                    r0.unlock()
                    return r1
                L_0x00aa:
                    r1 = move-exception
                L_0x00ab:
                    if (r0 == 0) goto L_0x00cb
                    boolean r2 = r0.isOpen()
                    if (r2 == 0) goto L_0x00cb
                    boolean r2 = r0.inTransaction()     // Catch:{ Exception -> 0x00bd }
                    if (r2 == 0) goto L_0x00cb
                    r0.endTransaction()     // Catch:{ Exception -> 0x00bd }
                    goto L_0x00cb
                L_0x00bd:
                    r0 = move-exception
                    com.facebook.ads.internal.j.d r2 = com.facebook.ads.internal.p083j.C1743d.this
                    android.content.Context r2 = r2.f5456e
                    java.lang.String r3 = "database"
                    int r4 = com.facebook.ads.internal.p115w.p123h.C2373b.f7521w
                    com.facebook.ads.internal.p115w.p123h.C2370a.m9149b(r2, r3, r4, r0)
                L_0x00cb:
                    java.util.concurrent.locks.Lock r0 = com.facebook.ads.internal.p083j.C1743d.f5455d
                    r0.unlock()
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.p083j.C1743d.C17441.mo7550b():java.lang.String");
            }
        };
        return mo7538a(r0, aVar);
    }

    /* renamed from: a */
    public boolean mo7540a(String str) {
        f5455d.lock();
        boolean z = false;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("UPDATE ");
            sb.append("events");
            sb.append(" SET ");
            sb.append(C1742c.f5449i.f5439b);
            sb.append("=");
            sb.append(C1742c.f5449i.f5439b);
            sb.append("+1");
            sb.append(" WHERE ");
            sb.append(C1742c.f5441a.f5439b);
            sb.append("=?");
            mo7537a().execSQL(sb.toString(), new String[]{str});
            z = true;
        } catch (SQLiteException unused) {
        }
        f5455d.unlock();
        return z;
    }

    /* renamed from: b */
    public synchronized void mo7541b() {
        for (C1749g e : mo7543c()) {
            e.mo7564e();
        }
        if (this.f5459h != null) {
            this.f5459h.close();
            this.f5459h = null;
        }
    }

    /* renamed from: b */
    public boolean mo7542b(String str) {
        f5455d.lock();
        try {
            return this.f5458g.mo7532a(str);
        } finally {
            f5455d.unlock();
        }
    }

    /* renamed from: c */
    public C1749g[] mo7543c() {
        return new C1749g[]{this.f5457f, this.f5458g};
    }

    /* renamed from: d */
    public Cursor mo7544d() {
        f5454c.lock();
        try {
            return this.f5458g.mo7534c();
        } finally {
            f5454c.unlock();
        }
    }

    /* renamed from: e */
    public Cursor mo7545e() {
        f5454c.lock();
        try {
            return this.f5458g.mo7535d();
        } finally {
            f5454c.unlock();
        }
    }

    /* renamed from: f */
    public Cursor mo7546f() {
        f5454c.lock();
        try {
            return this.f5457f.mo7534c();
        } finally {
            f5454c.unlock();
        }
    }

    /* renamed from: g */
    public void mo7547g() {
        f5455d.lock();
        try {
            this.f5457f.mo7568d();
        } finally {
            f5455d.unlock();
        }
    }

    /* renamed from: h */
    public void mo7548h() {
        f5455d.lock();
        try {
            this.f5458g.mo7566g();
            this.f5457f.mo7566g();
        } finally {
            f5455d.unlock();
        }
    }
}
