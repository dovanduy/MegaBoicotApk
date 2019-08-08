package org.apache.p199a.p218f.p221c;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.p199a.p208c.C6304b;
import org.apache.p199a.p208c.C6320d;
import org.apache.p199a.p208c.C6329e;
import org.apache.p199a.p208c.C6339n;
import org.apache.p199a.p208c.p210b.C6306b;
import org.apache.p199a.p208c.p211c.C6318e;

/* renamed from: org.apache.a.f.c.l */
/* compiled from: SingleClientConnManager */
public class C6434l implements C6304b {

    /* renamed from: a */
    protected final C6318e f21089a;

    /* renamed from: b */
    protected final C6320d f21090b;

    /* renamed from: c */
    protected final boolean f21091c;

    /* renamed from: d */
    protected C6437b f21092d;

    /* renamed from: e */
    protected C6436a f21093e;

    /* renamed from: f */
    protected long f21094f;

    /* renamed from: g */
    protected long f21095g;

    /* renamed from: h */
    protected volatile boolean f21096h;

    /* renamed from: i */
    private final Log f21097i;

    /* renamed from: org.apache.a.f.c.l$a */
    /* compiled from: SingleClientConnManager */
    protected class C6436a extends C6425c {
        protected C6436a(C6437b bVar, C6306b bVar2) {
            super(C6434l.this, bVar);
            mo22563n();
            bVar.f21063c = bVar2;
        }
    }

    /* renamed from: org.apache.a.f.c.l$b */
    /* compiled from: SingleClientConnManager */
    protected class C6437b extends C6424b {
        protected C6437b() {
            super(C6434l.this.f21090b, null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo22823b() throws IOException {
            mo22790a();
            if (this.f21062b.mo22781d()) {
                this.f21062b.mo22797c();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo22824c() throws IOException {
            mo22790a();
            if (this.f21062b.mo22781d()) {
                this.f21062b.mo22798f();
            }
        }
    }

    public C6434l(C6318e eVar) {
        this.f21097i = LogFactory.getLog(getClass());
        if (eVar == null) {
            throw new IllegalArgumentException("Scheme registry must not be null.");
        }
        this.f21089a = eVar;
        this.f21090b = mo22817a(eVar);
        this.f21092d = new C6437b();
        this.f21093e = null;
        this.f21094f = -1;
        this.f21091c = false;
        this.f21096h = false;
    }

    public C6434l() {
        this(C6433k.m25505a());
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        try {
            mo22481b();
        } finally {
            super.finalize();
        }
    }

    /* renamed from: a */
    public C6318e mo22478a() {
        return this.f21089a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C6320d mo22817a(C6318e eVar) {
        return new C6428f(eVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo22820c() throws IllegalStateException {
        if (this.f21096h) {
            throw new IllegalStateException("Manager is shut down.");
        }
    }

    /* renamed from: a */
    public final C6329e mo22479a(final C6306b bVar, final Object obj) {
        return new C6329e() {
            /* renamed from: a */
            public C6339n mo22543a(long j, TimeUnit timeUnit) {
                return C6434l.this.mo22819b(bVar, obj);
            }
        };
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0069, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r3.f21097i.debug("Problem shutting down connection.", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008a, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:2:0x0003, B:24:0x0063] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized org.apache.p199a.p208c.C6339n mo22819b(org.apache.p199a.p208c.p210b.C6306b r4, java.lang.Object r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            if (r4 != 0) goto L_0x000e
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x000b }
            java.lang.String r5 = "Route may not be null."
            r4.<init>(r5)     // Catch:{ all -> 0x000b }
            throw r4     // Catch:{ all -> 0x000b }
        L_0x000b:
            r4 = move-exception
            goto L_0x0089
        L_0x000e:
            r3.mo22820c()     // Catch:{ all -> 0x000b }
            org.apache.commons.logging.Log r5 = r3.f21097i     // Catch:{ all -> 0x000b }
            boolean r5 = r5.isDebugEnabled()     // Catch:{ all -> 0x000b }
            if (r5 == 0) goto L_0x002f
            org.apache.commons.logging.Log r5 = r3.f21097i     // Catch:{ all -> 0x000b }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x000b }
            r0.<init>()     // Catch:{ all -> 0x000b }
            java.lang.String r1 = "Get connection for route "
            r0.append(r1)     // Catch:{ all -> 0x000b }
            r0.append(r4)     // Catch:{ all -> 0x000b }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x000b }
            r5.debug(r0)     // Catch:{ all -> 0x000b }
        L_0x002f:
            org.apache.a.f.c.l$a r5 = r3.f21093e     // Catch:{ all -> 0x000b }
            if (r5 == 0) goto L_0x003b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x000b }
            java.lang.String r5 = "Invalid use of SingleClientConnManager: connection still allocated.\nMake sure to release the connection before allocating another one."
            r4.<init>(r5)     // Catch:{ all -> 0x000b }
            throw r4     // Catch:{ all -> 0x000b }
        L_0x003b:
            r3.mo22821d()     // Catch:{ all -> 0x000b }
            org.apache.a.f.c.l$b r5 = r3.f21092d     // Catch:{ all -> 0x000b }
            org.apache.a.c.o r5 = r5.f21062b     // Catch:{ all -> 0x000b }
            boolean r5 = r5.mo22781d()     // Catch:{ all -> 0x000b }
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L_0x005f
            org.apache.a.f.c.l$b r5 = r3.f21092d     // Catch:{ all -> 0x000b }
            org.apache.a.c.b.f r5 = r5.f21065e     // Catch:{ all -> 0x000b }
            if (r5 == 0) goto L_0x005d
            org.apache.a.c.b.b r5 = r5.mo22507h()     // Catch:{ all -> 0x000b }
            boolean r5 = r5.equals(r4)     // Catch:{ all -> 0x000b }
            if (r5 != 0) goto L_0x005b
            goto L_0x005d
        L_0x005b:
            r5 = r1
            goto L_0x0061
        L_0x005d:
            r5 = r0
            goto L_0x0061
        L_0x005f:
            r5 = r1
            r1 = r0
        L_0x0061:
            if (r5 == 0) goto L_0x0072
            org.apache.a.f.c.l$b r5 = r3.f21092d     // Catch:{ IOException -> 0x0069 }
            r5.mo22824c()     // Catch:{ IOException -> 0x0069 }
            goto L_0x0073
        L_0x0069:
            r5 = move-exception
            org.apache.commons.logging.Log r1 = r3.f21097i     // Catch:{ all -> 0x000b }
            java.lang.String r2 = "Problem shutting down connection."
            r1.debug(r2, r5)     // Catch:{ all -> 0x000b }
            goto L_0x0073
        L_0x0072:
            r0 = r1
        L_0x0073:
            if (r0 == 0) goto L_0x007c
            org.apache.a.f.c.l$b r5 = new org.apache.a.f.c.l$b     // Catch:{ all -> 0x000b }
            r5.<init>()     // Catch:{ all -> 0x000b }
            r3.f21092d = r5     // Catch:{ all -> 0x000b }
        L_0x007c:
            org.apache.a.f.c.l$a r5 = new org.apache.a.f.c.l$a     // Catch:{ all -> 0x000b }
            org.apache.a.f.c.l$b r0 = r3.f21092d     // Catch:{ all -> 0x000b }
            r5.<init>(r0, r4)     // Catch:{ all -> 0x000b }
            r3.f21093e = r5     // Catch:{ all -> 0x000b }
            org.apache.a.f.c.l$a r4 = r3.f21093e     // Catch:{ all -> 0x000b }
            monitor-exit(r3)
            return r4
        L_0x0089:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.p199a.p218f.p221c.C6434l.mo22819b(org.apache.a.c.b.b, java.lang.Object):org.apache.a.c.n");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b6, code lost:
        return;
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:31:0x0070=Splitter:B:31:0x0070, B:43:0x009f=Splitter:B:43:0x009f} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo22480a(org.apache.p199a.p208c.C6339n r9, long r10, java.util.concurrent.TimeUnit r12) {
        /*
            r8 = this;
            monitor-enter(r8)
            r8.mo22820c()     // Catch:{ all -> 0x00d4 }
            boolean r0 = r9 instanceof org.apache.p199a.p218f.p221c.C6434l.C6436a     // Catch:{ all -> 0x00d4 }
            if (r0 != 0) goto L_0x0010
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00d4 }
            java.lang.String r10 = "Connection class mismatch, connection not obtained from this manager."
            r9.<init>(r10)     // Catch:{ all -> 0x00d4 }
            throw r9     // Catch:{ all -> 0x00d4 }
        L_0x0010:
            org.apache.commons.logging.Log r0 = r8.f21097i     // Catch:{ all -> 0x00d4 }
            boolean r0 = r0.isDebugEnabled()     // Catch:{ all -> 0x00d4 }
            if (r0 == 0) goto L_0x002e
            org.apache.commons.logging.Log r0 = r8.f21097i     // Catch:{ all -> 0x00d4 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d4 }
            r1.<init>()     // Catch:{ all -> 0x00d4 }
            java.lang.String r2 = "Releasing connection "
            r1.append(r2)     // Catch:{ all -> 0x00d4 }
            r1.append(r9)     // Catch:{ all -> 0x00d4 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00d4 }
            r0.debug(r1)     // Catch:{ all -> 0x00d4 }
        L_0x002e:
            org.apache.a.f.c.l$a r9 = (org.apache.p199a.p218f.p221c.C6434l.C6436a) r9     // Catch:{ all -> 0x00d4 }
            org.apache.a.f.c.b r0 = r9.f21066a     // Catch:{ all -> 0x00d4 }
            if (r0 != 0) goto L_0x0036
            monitor-exit(r8)
            return
        L_0x0036:
            org.apache.a.c.b r0 = r9.mo22786q()     // Catch:{ all -> 0x00d4 }
            if (r0 == 0) goto L_0x0046
            if (r0 == r8) goto L_0x0046
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00d4 }
            java.lang.String r10 = "Connection not obtained from this manager."
            r9.<init>(r10)     // Catch:{ all -> 0x00d4 }
            throw r9     // Catch:{ all -> 0x00d4 }
        L_0x0046:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r2 = 0
            r4 = 0
            boolean r5 = r9.mo22781d()     // Catch:{ IOException -> 0x008f }
            if (r5 == 0) goto L_0x0070
            boolean r5 = r8.f21091c     // Catch:{ IOException -> 0x008f }
            if (r5 != 0) goto L_0x005e
            boolean r5 = r9.mo22789t()     // Catch:{ IOException -> 0x008f }
            if (r5 != 0) goto L_0x0070
        L_0x005e:
            org.apache.commons.logging.Log r5 = r8.f21097i     // Catch:{ IOException -> 0x008f }
            boolean r5 = r5.isDebugEnabled()     // Catch:{ IOException -> 0x008f }
            if (r5 == 0) goto L_0x006d
            org.apache.commons.logging.Log r5 = r8.f21097i     // Catch:{ IOException -> 0x008f }
            java.lang.String r6 = "Released connection open but not reusable."
            r5.debug(r6)     // Catch:{ IOException -> 0x008f }
        L_0x006d:
            r9.mo22798f()     // Catch:{ IOException -> 0x008f }
        L_0x0070:
            r9.mo22784o()     // Catch:{ all -> 0x00d4 }
            r8.f21093e = r4     // Catch:{ all -> 0x00d4 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00d4 }
            r8.f21094f = r4     // Catch:{ all -> 0x00d4 }
            int r9 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r9 <= 0) goto L_0x008a
            long r9 = r12.toMillis(r10)     // Catch:{ all -> 0x00d4 }
            long r11 = r8.f21094f     // Catch:{ all -> 0x00d4 }
        L_0x0085:
            long r0 = r9 + r11
            r8.f21095g = r0     // Catch:{ all -> 0x00d4 }
            goto L_0x00b5
        L_0x008a:
            r8.f21095g = r0     // Catch:{ all -> 0x00d4 }
            goto L_0x00b5
        L_0x008d:
            r5 = move-exception
            goto L_0x00b7
        L_0x008f:
            r5 = move-exception
            org.apache.commons.logging.Log r6 = r8.f21097i     // Catch:{ all -> 0x008d }
            boolean r6 = r6.isDebugEnabled()     // Catch:{ all -> 0x008d }
            if (r6 == 0) goto L_0x009f
            org.apache.commons.logging.Log r6 = r8.f21097i     // Catch:{ all -> 0x008d }
            java.lang.String r7 = "Exception shutting down released connection."
            r6.debug(r7, r5)     // Catch:{ all -> 0x008d }
        L_0x009f:
            r9.mo22784o()     // Catch:{ all -> 0x00d4 }
            r8.f21093e = r4     // Catch:{ all -> 0x00d4 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00d4 }
            r8.f21094f = r4     // Catch:{ all -> 0x00d4 }
            int r9 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r9 <= 0) goto L_0x008a
            long r9 = r12.toMillis(r10)     // Catch:{ all -> 0x00d4 }
            long r11 = r8.f21094f     // Catch:{ all -> 0x00d4 }
            goto L_0x0085
        L_0x00b5:
            monitor-exit(r8)
            return
        L_0x00b7:
            r9.mo22784o()     // Catch:{ all -> 0x00d4 }
            r8.f21093e = r4     // Catch:{ all -> 0x00d4 }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00d4 }
            r8.f21094f = r6     // Catch:{ all -> 0x00d4 }
            int r9 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r9 <= 0) goto L_0x00d1
            long r9 = r12.toMillis(r10)     // Catch:{ all -> 0x00d4 }
            long r11 = r8.f21094f     // Catch:{ all -> 0x00d4 }
            long r0 = r9 + r11
            r8.f21095g = r0     // Catch:{ all -> 0x00d4 }
            goto L_0x00d3
        L_0x00d1:
            r8.f21095g = r0     // Catch:{ all -> 0x00d4 }
        L_0x00d3:
            throw r5     // Catch:{ all -> 0x00d4 }
        L_0x00d4:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.p199a.p218f.p221c.C6434l.mo22480a(org.apache.a.c.n, long, java.util.concurrent.TimeUnit):void");
    }

    /* renamed from: d */
    public synchronized void mo22821d() {
        if (System.currentTimeMillis() >= this.f21095g) {
            mo22818a(0, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: a */
    public synchronized void mo22818a(long j, TimeUnit timeUnit) {
        mo22820c();
        if (timeUnit == null) {
            throw new IllegalArgumentException("Time unit must not be null.");
        } else if (this.f21093e == null && this.f21092d.f21062b.mo22781d()) {
            if (this.f21094f <= System.currentTimeMillis() - timeUnit.toMillis(j)) {
                try {
                    this.f21092d.mo22823b();
                } catch (IOException e) {
                    this.f21097i.debug("Problem closing idle connection.", e);
                }
            }
        }
        return;
    }

    /* renamed from: b */
    public synchronized void mo22481b() {
        this.f21096h = true;
        if (this.f21093e != null) {
            this.f21093e.mo22784o();
        }
        try {
            if (this.f21092d != null) {
                this.f21092d.mo22824c();
            }
        } catch (IOException e) {
            try {
                this.f21097i.debug("Problem while shutting down manager.", e);
            } catch (Throwable th) {
                this.f21092d = null;
                throw th;
            }
        }
        this.f21092d = null;
    }
}
