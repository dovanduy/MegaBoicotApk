package org.apache.p199a.p208c.p212d;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.apache.p199a.p208c.C6331f;
import org.apache.p199a.p208c.p211c.C6314a;
import org.apache.p199a.p208c.p211c.C6315b;
import org.apache.p199a.p227i.C6530c;
import org.apache.p199a.p227i.C6531d;

/* renamed from: org.apache.a.c.d.d */
/* compiled from: SSLSocketFactory */
public class C6324d implements C6315b {

    /* renamed from: a */
    public static final C6328h f20860a = new C6322b();

    /* renamed from: b */
    public static final C6328h f20861b = new C6323c();

    /* renamed from: c */
    public static final C6328h f20862c = new C6325e();

    /* renamed from: d */
    private final SSLSocketFactory f20863d;

    /* renamed from: e */
    private final C6314a f20864e;

    /* renamed from: f */
    private volatile C6328h f20865f;

    /* renamed from: a */
    public static C6324d m25009a() {
        return new C6324d();
    }

    /* renamed from: a */
    private static SSLContext m25008a(String str, KeyStore keyStore, String str2, KeyStore keyStore2, SecureRandom secureRandom, C6327g gVar) throws NoSuchAlgorithmException, KeyStoreException, UnrecoverableKeyException, KeyManagementException {
        if (str == null) {
            str = "TLS";
        }
        KeyManagerFactory instance = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
        instance.init(keyStore, str2 != null ? str2.toCharArray() : null);
        KeyManager[] keyManagers = instance.getKeyManagers();
        TrustManagerFactory instance2 = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        instance2.init(keyStore2);
        TrustManager[] trustManagers = instance2.getTrustManagers();
        if (!(trustManagers == null || gVar == null)) {
            for (int i = 0; i < trustManagers.length; i++) {
                TrustManager trustManager = trustManagers[i];
                if (trustManager instanceof X509TrustManager) {
                    trustManagers[i] = new C6326f((X509TrustManager) trustManager, gVar);
                }
            }
        }
        SSLContext instance3 = SSLContext.getInstance(str);
        instance3.init(keyManagers, trustManagers, secureRandom);
        return instance3;
    }

    /* renamed from: b */
    private static SSLContext m25010b() {
        try {
            return m25008a("TLS", null, null, null, null, null);
        } catch (Exception e) {
            throw new IllegalStateException("Failure initializing default SSL context", e);
        }
    }

    public C6324d(SSLContext sSLContext) {
        this(sSLContext, f20861b);
    }

    public C6324d(SSLContext sSLContext, C6328h hVar) {
        this.f20863d = sSLContext.getSocketFactory();
        this.f20865f = hVar;
        this.f20864e = null;
    }

    private C6324d() {
        this(m25010b());
    }

    /* renamed from: a */
    public Socket mo22513a(C6531d dVar) throws IOException {
        return this.f20863d.createSocket();
    }

    /* renamed from: a */
    public Socket mo22512a(Socket socket, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, C6531d dVar) throws IOException, UnknownHostException, C6331f {
        SSLSocket sSLSocket;
        if (inetSocketAddress == null) {
            throw new IllegalArgumentException("Remote address may not be null");
        } else if (dVar == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        } else {
            if (socket == null) {
                socket = new Socket();
            }
            if (inetSocketAddress2 != null) {
                socket.setReuseAddress(C6530c.m25864b(dVar));
                socket.bind(inetSocketAddress2);
            }
            int f = C6530c.m25869f(dVar);
            try {
                socket.setSoTimeout(C6530c.m25860a(dVar));
                socket.connect(inetSocketAddress, f);
                if (socket instanceof SSLSocket) {
                    sSLSocket = (SSLSocket) socket;
                } else {
                    sSLSocket = (SSLSocket) this.f20863d.createSocket(socket, inetSocketAddress.getHostName(), inetSocketAddress.getPort(), true);
                }
                if (this.f20865f != null) {
                    try {
                        this.f20865f.mo22532a(inetSocketAddress.getHostName(), sSLSocket);
                    } catch (IOException e) {
                        try {
                            sSLSocket.close();
                        } catch (Exception unused) {
                        }
                        throw e;
                    }
                }
                return sSLSocket;
            } catch (SocketTimeoutException unused2) {
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
    public boolean mo22514a(Socket socket) throws IllegalArgumentException {
        if (socket == null) {
            throw new IllegalArgumentException("Socket may not be null");
        } else if (!(socket instanceof SSLSocket)) {
            throw new IllegalArgumentException("Socket not created by this factory");
        } else if (!socket.isClosed()) {
            return true;
        } else {
            throw new IllegalArgumentException("Socket is closed");
        }
    }

    /* renamed from: a */
    public Socket mo22511a(Socket socket, String str, int i, boolean z) throws IOException, UnknownHostException {
        SSLSocket sSLSocket = (SSLSocket) this.f20863d.createSocket(socket, str, i, z);
        if (this.f20865f != null) {
            this.f20865f.mo22532a(str, sSLSocket);
        }
        return sSLSocket;
    }
}
