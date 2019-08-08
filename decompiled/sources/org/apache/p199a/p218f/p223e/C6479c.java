package org.apache.p199a.p218f.p223e;

import org.apache.p199a.C6301c;
import org.apache.p199a.C6341d;
import org.apache.p199a.C6547k;
import org.apache.p199a.C6557n;
import org.apache.p199a.C6567x;
import org.apache.p199a.C6568y;
import org.apache.p199a.p215e.C6373d;

/* renamed from: org.apache.a.f.e.c */
/* compiled from: LaxContentLengthStrategy */
public class C6479c implements C6373d {
    /* renamed from: a */
    public long mo22655a(C6557n nVar) throws C6547k {
        long j;
        if (nVar == null) {
            throw new IllegalArgumentException("HTTP message may not be null");
        }
        boolean b = nVar.mo22915f().mo23005b("http.protocol.strict-transfer-encoding");
        C6301c c = nVar.mo22911c("Transfer-Encoding");
        C6301c c2 = nVar.mo22911c("Content-Length");
        if (c != null) {
            try {
                C6341d[] e = c.mo22467e();
                if (b) {
                    int i = 0;
                    while (i < e.length) {
                        String a = e[i].mo22569a();
                        if (a == null || a.length() <= 0 || a.equalsIgnoreCase("chunked") || a.equalsIgnoreCase("identity")) {
                            i++;
                        } else {
                            StringBuffer stringBuffer = new StringBuffer();
                            stringBuffer.append("Unsupported transfer encoding: ");
                            stringBuffer.append(a);
                            throw new C6568y(stringBuffer.toString());
                        }
                    }
                }
                int length = e.length;
                if ("identity".equalsIgnoreCase(c.mo22466d())) {
                    return -1;
                }
                if (length > 0 && "chunked".equalsIgnoreCase(e[length - 1].mo22569a())) {
                    return -2;
                }
                if (!b) {
                    return -1;
                }
                throw new C6568y("Chunk-encoding must be the last one applied");
            } catch (C6567x e2) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("Invalid Transfer-Encoding header value: ");
                stringBuffer2.append(c);
                throw new C6568y(stringBuffer2.toString(), e2);
            }
        } else if (c2 == null) {
            return -1;
        } else {
            C6301c[] b2 = nVar.mo22910b("Content-Length");
            if (!b || b2.length <= 1) {
                int length2 = b2.length - 1;
                while (true) {
                    if (length2 < 0) {
                        j = -1;
                        break;
                    }
                    C6301c cVar = b2[length2];
                    try {
                        j = Long.parseLong(cVar.mo22466d());
                        break;
                    } catch (NumberFormatException unused) {
                        if (b) {
                            StringBuffer stringBuffer3 = new StringBuffer();
                            stringBuffer3.append("Invalid content length: ");
                            stringBuffer3.append(cVar.mo22466d());
                            throw new C6568y(stringBuffer3.toString());
                        }
                        length2--;
                    }
                }
                if (j >= 0) {
                    return j;
                }
                return -1;
            }
            throw new C6568y("Multiple content length headers");
        }
    }
}
