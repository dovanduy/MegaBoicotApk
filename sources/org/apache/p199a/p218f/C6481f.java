package org.apache.p199a.p218f;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import org.apache.p199a.C6556m;
import org.apache.p199a.p218f.p224f.C6495n;
import org.apache.p199a.p218f.p224f.C6496o;
import org.apache.p199a.p225g.C6503f;
import org.apache.p199a.p225g.C6504g;
import org.apache.p199a.p227i.C6530c;
import org.apache.p199a.p227i.C6531d;

/* renamed from: org.apache.a.f.f */
/* compiled from: SocketHttpClientConnection */
public class C6481f extends C6377a implements C6556m {

    /* renamed from: a */
    private volatile boolean f21144a;

    /* renamed from: b */
    private volatile Socket f21145b = null;

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo22856q() {
        if (this.f21144a) {
            throw new IllegalStateException("Connection is already open");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo22670k() {
        if (!this.f21144a) {
            throw new IllegalStateException("Connection is not open");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C6503f mo22800a(Socket socket, int i, C6531d dVar) throws IOException {
        return new C6495n(socket, i, dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C6504g mo22801b(Socket socket, int i, C6531d dVar) throws IOException {
        return new C6496o(socket, i, dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22855a(Socket socket, C6531d dVar) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("Socket may not be null");
        } else if (dVar == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        } else {
            this.f21145b = socket;
            int d = C6530c.m25867d(dVar);
            mo22663a(mo22800a(socket, d, dVar), mo22801b(socket, d, dVar), dVar);
            this.f21144a = true;
        }
    }

    /* renamed from: d */
    public boolean mo22781d() {
        return this.f21144a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public Socket mo22568j() {
        return this.f21145b;
    }

    /* renamed from: g */
    public InetAddress mo22782g() {
        if (this.f21145b != null) {
            return this.f21145b.getInetAddress();
        }
        return null;
    }

    /* renamed from: h */
    public int mo22783h() {
        if (this.f21145b != null) {
            return this.f21145b.getPort();
        }
        return -1;
    }

    /* renamed from: b */
    public void mo22780b(int i) {
        mo22670k();
        if (this.f21145b != null) {
            try {
                this.f21145b.setSoTimeout(i);
            } catch (SocketException unused) {
            }
        }
    }

    /* renamed from: f */
    public void mo22798f() throws IOException {
        this.f21144a = false;
        Socket socket = this.f21145b;
        if (socket != null) {
            socket.close();
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0010 */
    /* JADX WARNING: Removed duplicated region for block: B:11:? A[ExcHandler: UnsupportedOperationException (unused java.lang.UnsupportedOperationException), SYNTHETIC, Splitter:B:8:0x0010] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo22797c() throws java.io.IOException {
        /*
            r2 = this;
            boolean r0 = r2.f21144a
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 0
            r2.f21144a = r0
            java.net.Socket r0 = r2.f21145b
            r2.mo22674o()     // Catch:{ all -> 0x0017 }
            r0.shutdownOutput()     // Catch:{ IOException -> 0x0010 }
        L_0x0010:
            r0.shutdownInput()     // Catch:{ UnsupportedOperationException -> 0x0013, UnsupportedOperationException -> 0x0013 }
        L_0x0013:
            r0.close()
            return
        L_0x0017:
            r1 = move-exception
            r0.close()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.p199a.p218f.C6481f.mo22797c():void");
    }
}
