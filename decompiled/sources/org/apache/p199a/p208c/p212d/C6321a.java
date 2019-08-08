package org.apache.p199a.p208c.p212d;

import java.io.IOException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.apache.p199a.p208c.p213e.C6330a;

/* renamed from: org.apache.a.c.d.a */
/* compiled from: AbstractVerifier */
public abstract class C6321a implements C6328h {

    /* renamed from: a */
    private static final String[] f20859a = {"ac", "co", "com", "ed", "edu", "go", "gouv", "gov", "info", "lg", "ne", "net", "or", "org"};

    static {
        Arrays.sort(f20859a);
    }

    /* renamed from: a */
    public final void mo22532a(String str, SSLSocket sSLSocket) throws IOException {
        if (str == null) {
            throw new NullPointerException("host to verify is null");
        }
        SSLSession session = sSLSocket.getSession();
        if (session == null) {
            sSLSocket.getInputStream().available();
            session = sSLSocket.getSession();
            if (session == null) {
                sSLSocket.startHandshake();
                session = sSLSocket.getSession();
            }
        }
        mo22531a(str, (X509Certificate) session.getPeerCertificates()[0]);
    }

    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            mo22531a(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
            return true;
        } catch (SSLException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final void mo22531a(String str, X509Certificate x509Certificate) throws SSLException {
        mo22535a(str, m24999a(x509Certificate), m25000a(x509Certificate, str));
    }

    /* renamed from: a */
    public final void mo22533a(String str, String[] strArr, String[] strArr2, boolean z) throws SSLException {
        LinkedList linkedList = new LinkedList();
        if (!(strArr == null || strArr.length <= 0 || strArr[0] == null)) {
            linkedList.add(strArr[0]);
        }
        if (strArr2 != null) {
            for (String str2 : strArr2) {
                if (str2 != null) {
                    linkedList.add(str2);
                }
            }
        }
        if (linkedList.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Certificate for <");
            sb.append(str);
            sb.append("> doesn't contain CN or DNS subjectAlt");
            throw new SSLException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        String lowerCase = str.trim().toLowerCase(Locale.ENGLISH);
        Iterator it = linkedList.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            String lowerCase2 = ((String) it.next()).toLowerCase(Locale.ENGLISH);
            sb2.append(" <");
            sb2.append(lowerCase2);
            sb2.append('>');
            if (it.hasNext()) {
                sb2.append(" OR");
            }
            boolean z3 = true;
            if (lowerCase2.startsWith("*.") && lowerCase2.lastIndexOf(46) >= 0 && m24998a(lowerCase2) && !m25002c(str)) {
                boolean endsWith = lowerCase.endsWith(lowerCase2.substring(1));
                if (!endsWith || !z) {
                    z2 = endsWith;
                    continue;
                } else {
                    if (m25001b(lowerCase) != m25001b(lowerCase2)) {
                        z3 = false;
                    }
                    z2 = z3;
                    continue;
                }
            } else {
                z2 = lowerCase.equals(lowerCase2);
                continue;
            }
            if (z2) {
                break;
            }
        }
        if (!z2) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("hostname in certificate didn't match: <");
            sb3.append(str);
            sb3.append("> !=");
            sb3.append(sb2);
            throw new SSLException(sb3.toString());
        }
    }

    /* renamed from: a */
    public static boolean m24998a(String str) {
        int length = str.length();
        boolean z = true;
        if (length >= 7 && length <= 9) {
            int i = length - 3;
            if (str.charAt(i) == '.') {
                if (Arrays.binarySearch(f20859a, str.substring(2, i)) >= 0) {
                    z = false;
                }
                return z;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static String[] m24999a(X509Certificate x509Certificate) {
        LinkedList linkedList = new LinkedList();
        StringTokenizer stringTokenizer = new StringTokenizer(x509Certificate.getSubjectX500Principal().toString(), ",");
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            int indexOf = nextToken.indexOf("CN=");
            if (indexOf >= 0) {
                linkedList.add(nextToken.substring(indexOf + 3));
            }
        }
        if (linkedList.isEmpty()) {
            return null;
        }
        String[] strArr = new String[linkedList.size()];
        linkedList.toArray(strArr);
        return strArr;
    }

    /* renamed from: a */
    private static String[] m25000a(X509Certificate x509Certificate, String str) {
        Collection<List> collection;
        int i = m25002c(str) ? 7 : 2;
        LinkedList linkedList = new LinkedList();
        try {
            collection = x509Certificate.getSubjectAlternativeNames();
        } catch (CertificateParsingException e) {
            Logger.getLogger(C6321a.class.getName()).log(Level.FINE, "Error parsing certificate.", e);
            collection = null;
        }
        if (collection != null) {
            for (List list : collection) {
                if (((Integer) list.get(0)).intValue() == i) {
                    linkedList.add((String) list.get(1));
                }
            }
        }
        if (linkedList.isEmpty()) {
            return null;
        }
        String[] strArr = new String[linkedList.size()];
        linkedList.toArray(strArr);
        return strArr;
    }

    /* renamed from: b */
    public static int m25001b(String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == '.') {
                i++;
            }
        }
        return i;
    }

    /* renamed from: c */
    private static boolean m25002c(String str) {
        return str != null && (C6330a.m25020a(str) || C6330a.m25023d(str));
    }
}
