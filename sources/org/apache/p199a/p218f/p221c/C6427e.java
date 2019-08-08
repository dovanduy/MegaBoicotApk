package org.apache.p199a.p218f.p221c;

import java.io.IOException;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.p199a.C6301c;
import org.apache.p199a.C6547k;
import org.apache.p199a.C6555l;
import org.apache.p199a.C6558o;
import org.apache.p199a.C6560q;
import org.apache.p199a.C6561r;
import org.apache.p199a.p208c.C6340o;
import org.apache.p199a.p218f.C6481f;
import org.apache.p199a.p225g.C6500c;
import org.apache.p199a.p225g.C6503f;
import org.apache.p199a.p225g.C6504g;
import org.apache.p199a.p227i.C6531d;
import org.apache.p199a.p227i.C6532e;
import org.apache.p199a.p228j.C6539e;

/* renamed from: org.apache.a.f.c.e */
/* compiled from: DefaultClientConnection */
public class C6427e extends C6481f implements C6340o, C6539e {

    /* renamed from: a */
    private final Log f21067a = LogFactory.getLog(getClass());

    /* renamed from: b */
    private final Log f21068b = LogFactory.getLog("org.apache.http.headers");

    /* renamed from: c */
    private final Log f21069c = LogFactory.getLog("org.apache.http.wire");

    /* renamed from: d */
    private volatile Socket f21070d;

    /* renamed from: e */
    private C6555l f21071e;

    /* renamed from: f */
    private boolean f21072f;

    /* renamed from: g */
    private volatile boolean f21073g;

    /* renamed from: h */
    private final Map<String, Object> f21074h = new HashMap();

    /* renamed from: i */
    public final boolean mo22567i() {
        return this.f21072f;
    }

    /* renamed from: j */
    public final Socket mo22568j() {
        return this.f21070d;
    }

    /* renamed from: a */
    public void mo22564a(Socket socket, C6555l lVar) throws IOException {
        mo22856q();
        this.f21070d = socket;
        this.f21071e = lVar;
        if (this.f21073g) {
            socket.close();
            throw new IOException("Connection already shutdown");
        }
    }

    /* renamed from: a */
    public void mo22566a(boolean z, C6531d dVar) throws IOException {
        mo22856q();
        if (dVar == null) {
            throw new IllegalArgumentException("Parameters must not be null.");
        }
        this.f21072f = z;
        mo22855a(this.f21070d, dVar);
    }

    /* renamed from: f */
    public void mo22798f() throws IOException {
        this.f21073g = true;
        try {
            super.mo22798f();
            this.f21067a.debug("Connection shut down");
            Socket socket = this.f21070d;
            if (socket != null) {
                socket.close();
            }
        } catch (IOException e) {
            this.f21067a.debug("I/O error shutting down connection", e);
        }
    }

    /* renamed from: c */
    public void mo22797c() throws IOException {
        try {
            super.mo22797c();
            this.f21067a.debug("Connection closed");
        } catch (IOException e) {
            this.f21067a.debug("I/O error closing connection", e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C6503f mo22800a(Socket socket, int i, C6531d dVar) throws IOException {
        if (i == -1) {
            i = 8192;
        }
        C6503f a = super.mo22800a(socket, i, dVar);
        return this.f21069c.isDebugEnabled() ? new C6431i(a, new C6438m(this.f21069c), C6532e.m25879a(dVar)) : a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C6504g mo22801b(Socket socket, int i, C6531d dVar) throws IOException {
        if (i == -1) {
            i = 8192;
        }
        C6504g b = super.mo22801b(socket, i, dVar);
        return this.f21069c.isDebugEnabled() ? new C6432j(b, new C6438m(this.f21069c), C6532e.m25879a(dVar)) : b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C6500c mo22660a(C6503f fVar, C6561r rVar, C6531d dVar) {
        return new C6430h(fVar, null, rVar, dVar);
    }

    /* renamed from: a */
    public void mo22565a(Socket socket, C6555l lVar, boolean z, C6531d dVar) throws IOException {
        mo22670k();
        if (lVar == null) {
            throw new IllegalArgumentException("Target host must not be null.");
        } else if (dVar == null) {
            throw new IllegalArgumentException("Parameters must not be null.");
        } else {
            if (socket != null) {
                this.f21070d = socket;
                mo22855a(socket, dVar);
            }
            this.f21071e = lVar;
            this.f21072f = z;
        }
    }

    /* renamed from: a */
    public C6560q mo22662a() throws C6547k, IOException {
        C6301c[] d;
        C6560q a = super.mo22662a();
        if (this.f21067a.isDebugEnabled()) {
            Log log = this.f21067a;
            StringBuilder sb = new StringBuilder();
            sb.append("Receiving response: ");
            sb.append(a.mo22937a());
            log.debug(sb.toString());
        }
        if (this.f21068b.isDebugEnabled()) {
            Log log2 = this.f21068b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("<< ");
            sb2.append(a.mo22937a().toString());
            log2.debug(sb2.toString());
            for (C6301c cVar : a.mo22913d()) {
                Log log3 = this.f21068b;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("<< ");
                sb3.append(cVar.toString());
                log3.debug(sb3.toString());
            }
        }
        return a;
    }

    /* renamed from: a */
    public void mo22665a(C6558o oVar) throws C6547k, IOException {
        C6301c[] d;
        if (this.f21067a.isDebugEnabled()) {
            Log log = this.f21067a;
            StringBuilder sb = new StringBuilder();
            sb.append("Sending request: ");
            sb.append(oVar.mo22451g());
            log.debug(sb.toString());
        }
        super.mo22665a(oVar);
        if (this.f21068b.isDebugEnabled()) {
            Log log2 = this.f21068b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(">> ");
            sb2.append(oVar.mo22451g().toString());
            log2.debug(sb2.toString());
            for (C6301c cVar : oVar.mo22913d()) {
                Log log3 = this.f21068b;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(">> ");
                sb3.append(cVar.toString());
                log3.debug(sb3.toString());
            }
        }
    }

    /* renamed from: a */
    public Object mo22777a(String str) {
        return this.f21074h.get(str);
    }

    /* renamed from: a */
    public void mo22778a(String str, Object obj) {
        this.f21074h.put(str, obj);
    }
}
