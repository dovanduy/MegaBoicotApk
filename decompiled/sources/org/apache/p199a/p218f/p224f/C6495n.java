package org.apache.p199a.p218f.p224f;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import org.apache.p199a.p225g.C6499b;
import org.apache.p199a.p227i.C6531d;

/* renamed from: org.apache.a.f.f.n */
/* compiled from: SocketInputBuffer */
public class C6495n extends C6484c implements C6499b {

    /* renamed from: a */
    private static final Class f21201a = m25707h();

    /* renamed from: b */
    private final Socket f21202b;

    /* renamed from: c */
    private boolean f21203c;

    /* renamed from: h */
    private static Class m25707h() {
        try {
            return Class.forName("java.net.SocketTimeoutException");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static boolean m25706a(InterruptedIOException interruptedIOException) {
        if (f21201a != null) {
            return f21201a.isInstance(interruptedIOException);
        }
        return true;
    }

    public C6495n(Socket socket, int i, C6531d dVar) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("Socket may not be null");
        }
        this.f21202b = socket;
        this.f21203c = false;
        if (i < 0) {
            i = socket.getReceiveBufferSize();
        }
        if (i < 1024) {
            i = 1024;
        }
        mo22860a(socket.getInputStream(), i, dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public int mo22863f() throws IOException {
        int f = super.mo22863f();
        this.f21203c = f == -1;
        return f;
    }

    /* renamed from: a */
    public boolean mo22808a(int i) throws IOException {
        boolean g = mo22864g();
        if (!g) {
            int soTimeout = this.f21202b.getSoTimeout();
            try {
                this.f21202b.setSoTimeout(i);
                mo22863f();
                return mo22864g();
            } catch (InterruptedIOException e) {
                if (!m25706a(e)) {
                    throw e;
                }
            } finally {
                this.f21202b.setSoTimeout(soTimeout);
            }
        }
        return g;
    }

    /* renamed from: c */
    public boolean mo22810c() {
        return this.f21203c;
    }
}
