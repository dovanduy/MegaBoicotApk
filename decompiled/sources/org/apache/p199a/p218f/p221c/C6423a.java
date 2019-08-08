package org.apache.p199a.p218f.p221c;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.apache.p199a.C6534j;
import org.apache.p199a.C6547k;
import org.apache.p199a.C6558o;
import org.apache.p199a.C6560q;
import org.apache.p199a.p208c.C6304b;
import org.apache.p199a.p208c.C6339n;
import org.apache.p199a.p208c.C6340o;
import org.apache.p199a.p228j.C6539e;

/* renamed from: org.apache.a.f.c.a */
/* compiled from: AbstractClientConnAdapter */
public abstract class C6423a implements C6339n, C6539e {

    /* renamed from: a */
    private volatile C6304b f21056a;

    /* renamed from: b */
    private volatile C6340o f21057b;

    /* renamed from: c */
    private volatile boolean f21058c = false;

    /* renamed from: d */
    private volatile boolean f21059d = false;

    /* renamed from: e */
    private volatile long f21060e = Long.MAX_VALUE;

    protected C6423a(C6304b bVar, C6340o oVar) {
        this.f21056a = bVar;
        this.f21057b = oVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public synchronized void mo22784o() {
        this.f21057b = null;
        this.f21056a = null;
        this.f21060e = Long.MAX_VALUE;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public C6340o mo22785p() {
        return this.f21057b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public C6304b mo22786q() {
        return this.f21056a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public boolean mo22787r() {
        return this.f21059d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo22779a(C6340o oVar) throws C6426d {
        if (mo22787r() || oVar == null) {
            throw new C6426d();
        }
    }

    /* renamed from: d */
    public boolean mo22781d() {
        C6340o p = mo22785p();
        if (p == null) {
            return false;
        }
        return p.mo22781d();
    }

    /* renamed from: e */
    public boolean mo22669e() {
        if (mo22787r()) {
            return true;
        }
        C6340o p = mo22785p();
        if (p == null) {
            return true;
        }
        return p.mo22669e();
    }

    /* renamed from: b */
    public void mo22780b(int i) {
        C6340o p = mo22785p();
        mo22779a(p);
        p.mo22780b(i);
    }

    /* renamed from: b */
    public void mo22668b() throws IOException {
        C6340o p = mo22785p();
        mo22779a(p);
        p.mo22668b();
    }

    /* renamed from: a */
    public boolean mo22667a(int i) throws IOException {
        C6340o p = mo22785p();
        mo22779a(p);
        return p.mo22667a(i);
    }

    /* renamed from: a */
    public void mo22666a(C6560q qVar) throws C6547k, IOException {
        C6340o p = mo22785p();
        mo22779a(p);
        mo22788s();
        p.mo22666a(qVar);
    }

    /* renamed from: a */
    public C6560q mo22662a() throws C6547k, IOException {
        C6340o p = mo22785p();
        mo22779a(p);
        mo22788s();
        return p.mo22662a();
    }

    /* renamed from: a */
    public void mo22664a(C6534j jVar) throws C6547k, IOException {
        C6340o p = mo22785p();
        mo22779a(p);
        mo22788s();
        p.mo22664a(jVar);
    }

    /* renamed from: a */
    public void mo22665a(C6558o oVar) throws C6547k, IOException {
        C6340o p = mo22785p();
        mo22779a(p);
        mo22788s();
        p.mo22665a(oVar);
    }

    /* renamed from: g */
    public InetAddress mo22782g() {
        C6340o p = mo22785p();
        mo22779a(p);
        return p.mo22782g();
    }

    /* renamed from: h */
    public int mo22783h() {
        C6340o p = mo22785p();
        mo22779a(p);
        return p.mo22783h();
    }

    /* renamed from: k */
    public boolean mo22554k() {
        C6340o p = mo22785p();
        mo22779a(p);
        return p.mo22567i();
    }

    /* renamed from: m */
    public SSLSession mo22556m() {
        C6340o p = mo22785p();
        mo22779a(p);
        SSLSession sSLSession = null;
        if (!mo22781d()) {
            return null;
        }
        Socket j = p.mo22568j();
        if (j instanceof SSLSocket) {
            sSLSession = ((SSLSocket) j).getSession();
        }
        return sSLSession;
    }

    /* renamed from: n */
    public void mo22563n() {
        this.f21058c = true;
    }

    /* renamed from: s */
    public void mo22788s() {
        this.f21058c = false;
    }

    /* renamed from: t */
    public boolean mo22789t() {
        return this.f21058c;
    }

    /* renamed from: a */
    public void mo22557a(long j, TimeUnit timeUnit) {
        if (j > 0) {
            this.f21060e = timeUnit.toMillis(j);
        } else {
            this.f21060e = -1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        return;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo22475i() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f21059d     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r4)
            return
        L_0x0007:
            r0 = 1
            r4.f21059d = r0     // Catch:{ all -> 0x0019 }
            org.apache.a.c.b r0 = r4.f21056a     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0017
            org.apache.a.c.b r0 = r4.f21056a     // Catch:{ all -> 0x0019 }
            long r1 = r4.f21060e     // Catch:{ all -> 0x0019 }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0019 }
            r0.mo22480a(r4, r1, r3)     // Catch:{ all -> 0x0019 }
        L_0x0017:
            monitor-exit(r4)
            return
        L_0x0019:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.p199a.p218f.p221c.C6423a.mo22475i():void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:6|7|8|9|10|11|12|(1:14)) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001e, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0010 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0014  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo22476j() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f21059d     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r4)
            return
        L_0x0007:
            r0 = 1
            r4.f21059d = r0     // Catch:{ all -> 0x001f }
            r4.mo22788s()     // Catch:{ all -> 0x001f }
            r4.mo22798f()     // Catch:{ IOException -> 0x0010 }
        L_0x0010:
            org.apache.a.c.b r0 = r4.f21056a     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x001d
            org.apache.a.c.b r0 = r4.f21056a     // Catch:{ all -> 0x001f }
            long r1 = r4.f21060e     // Catch:{ all -> 0x001f }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x001f }
            r0.mo22480a(r4, r1, r3)     // Catch:{ all -> 0x001f }
        L_0x001d:
            monitor-exit(r4)
            return
        L_0x001f:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.p199a.p218f.p221c.C6423a.mo22476j():void");
    }

    /* renamed from: a */
    public synchronized Object mo22777a(String str) {
        C6340o p = mo22785p();
        mo22779a(p);
        if (!(p instanceof C6539e)) {
            return null;
        }
        return ((C6539e) p).mo22777a(str);
    }

    /* renamed from: a */
    public synchronized void mo22778a(String str, Object obj) {
        C6340o p = mo22785p();
        mo22779a(p);
        if (p instanceof C6539e) {
            ((C6539e) p).mo22778a(str, obj);
        }
    }
}
