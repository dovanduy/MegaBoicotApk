package org.apache.p199a.p208c.p211c;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import org.apache.p199a.p208c.C6331f;
import org.apache.p199a.p227i.C6530c;
import org.apache.p199a.p227i.C6531d;

/* renamed from: org.apache.a.c.c.c */
/* compiled from: PlainSocketFactory */
public class C6316c implements C6319f {

    /* renamed from: a */
    private final C6314a f20852a = null;

    /* renamed from: a */
    public static C6316c m24978a() {
        return new C6316c();
    }

    /* renamed from: a */
    public Socket mo22513a(C6531d dVar) {
        return new Socket();
    }

    /* renamed from: b */
    public Socket mo22515b() {
        return new Socket();
    }

    /* renamed from: a */
    public Socket mo22512a(Socket socket, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, C6531d dVar) throws IOException, C6331f {
        if (inetSocketAddress == null) {
            throw new IllegalArgumentException("Remote address may not be null");
        } else if (dVar == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        } else {
            if (socket == null) {
                socket = mo22515b();
            }
            if (inetSocketAddress2 != null) {
                socket.setReuseAddress(C6530c.m25864b(dVar));
                socket.bind(inetSocketAddress2);
            }
            int f = C6530c.m25869f(dVar);
            try {
                socket.setSoTimeout(C6530c.m25860a(dVar));
                socket.connect(inetSocketAddress, f);
                return socket;
            } catch (SocketTimeoutException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Connect to ");
                sb.append(inetSocketAddress.getHostName());
                sb.append("/");
                sb.append(inetSocketAddress.getAddress());
                sb.append(" timed out");
                throw new C6331f(sb.toString());
            }
        }
    }

    /* renamed from: a */
    public final boolean mo22514a(Socket socket) throws IllegalArgumentException {
        if (socket == null) {
            throw new IllegalArgumentException("Socket may not be null.");
        } else if (!socket.isClosed()) {
            return false;
        } else {
            throw new IllegalArgumentException("Socket is closed.");
        }
    }
}
