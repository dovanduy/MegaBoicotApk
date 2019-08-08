package com.google.android.gms.measurement.internal;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.google.android.gms.measurement.internal.em */
final class C4863em extends SSLSocketFactory {

    /* renamed from: a */
    private final SSLSocketFactory f15794a;

    C4863em() {
        this(HttpsURLConnection.getDefaultSSLSocketFactory());
    }

    private C4863em(SSLSocketFactory sSLSocketFactory) {
        this.f15794a = sSLSocketFactory;
    }

    public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        return m21023a((SSLSocket) this.f15794a.createSocket(socket, str, i, z));
    }

    public final String[] getDefaultCipherSuites() {
        return this.f15794a.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return this.f15794a.getSupportedCipherSuites();
    }

    public final Socket createSocket(String str, int i) throws IOException {
        return m21023a((SSLSocket) this.f15794a.createSocket(str, i));
    }

    public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return m21023a((SSLSocket) this.f15794a.createSocket(inetAddress, i));
    }

    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        return m21023a((SSLSocket) this.f15794a.createSocket(str, i, inetAddress, i2));
    }

    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return m21023a((SSLSocket) this.f15794a.createSocket(inetAddress, i, inetAddress2, i2));
    }

    public final Socket createSocket() throws IOException {
        return m21023a((SSLSocket) this.f15794a.createSocket());
    }

    /* renamed from: a */
    private final SSLSocket m21023a(SSLSocket sSLSocket) {
        return new C4865eo(this, sSLSocket);
    }
}
