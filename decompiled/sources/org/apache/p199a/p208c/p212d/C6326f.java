package org.apache.p199a.p208c.p212d;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* renamed from: org.apache.a.c.d.f */
/* compiled from: TrustManagerDecorator */
class C6326f implements X509TrustManager {

    /* renamed from: a */
    private final X509TrustManager f20866a;

    /* renamed from: b */
    private final C6327g f20867b;

    C6326f(X509TrustManager x509TrustManager, C6327g gVar) {
        this.f20866a = x509TrustManager;
        this.f20867b = gVar;
    }

    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        this.f20866a.checkClientTrusted(x509CertificateArr, str);
    }

    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        if (!this.f20867b.mo22542a(x509CertificateArr, str)) {
            this.f20866a.checkServerTrusted(x509CertificateArr, str);
        }
    }

    public X509Certificate[] getAcceptedIssuers() {
        return this.f20866a.getAcceptedIssuers();
    }
}
