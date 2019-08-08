package org.apache.p199a.p218f.p223e;

import org.apache.p199a.C6301c;
import org.apache.p199a.C6547k;
import org.apache.p199a.C6557n;
import org.apache.p199a.C6563t;
import org.apache.p199a.C6568y;
import org.apache.p199a.p215e.C6373d;

/* renamed from: org.apache.a.f.e.d */
/* compiled from: StrictContentLengthStrategy */
public class C6480d implements C6373d {
    /* renamed from: a */
    public long mo22655a(C6557n nVar) throws C6547k {
        if (nVar == null) {
            throw new IllegalArgumentException("HTTP message may not be null");
        }
        C6301c c = nVar.mo22911c("Transfer-Encoding");
        C6301c c2 = nVar.mo22911c("Content-Length");
        if (c != null) {
            String d = c.mo22466d();
            if ("chunked".equalsIgnoreCase(d)) {
                if (!nVar.mo22450c().mo23073c(C6563t.f21277b)) {
                    return -2;
                }
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Chunked transfer encoding not allowed for ");
                stringBuffer.append(nVar.mo22450c());
                throw new C6568y(stringBuffer.toString());
            } else if ("identity".equalsIgnoreCase(d)) {
                return -1;
            } else {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("Unsupported transfer encoding: ");
                stringBuffer2.append(d);
                throw new C6568y(stringBuffer2.toString());
            }
        } else if (c2 == null) {
            return -1;
        } else {
            String d2 = c2.mo22466d();
            try {
                return Long.parseLong(d2);
            } catch (NumberFormatException unused) {
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("Invalid content length: ");
                stringBuffer3.append(d2);
                throw new C6568y(stringBuffer3.toString());
            }
        }
    }
}
