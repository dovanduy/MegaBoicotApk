package org.apache.p199a.p218f.p220b;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLException;
import org.apache.p199a.C6534j;
import org.apache.p199a.C6558o;
import org.apache.p199a.p202b.C6294h;
import org.apache.p199a.p228j.C6539e;

/* renamed from: org.apache.a.f.b.i */
/* compiled from: DefaultHttpRequestRetryHandler */
public class C6410i implements C6294h {

    /* renamed from: a */
    private final int f21018a;

    /* renamed from: b */
    private final boolean f21019b;

    public C6410i(int i, boolean z) {
        this.f21018a = i;
        this.f21019b = z;
    }

    public C6410i() {
        this(3, false);
    }

    /* renamed from: a */
    public boolean mo22460a(IOException iOException, int i, C6539e eVar) {
        if (iOException == null) {
            throw new IllegalArgumentException("Exception parameter may not be null");
        } else if (eVar == null) {
            throw new IllegalArgumentException("HTTP context may not be null");
        } else if (i > this.f21018a || (iOException instanceof InterruptedIOException) || (iOException instanceof UnknownHostException) || (iOException instanceof ConnectException) || (iOException instanceof SSLException)) {
            return false;
        } else {
            if (m25375a((C6558o) eVar.mo22777a("http.request"))) {
                return true;
            }
            Boolean bool = (Boolean) eVar.mo22777a("http.request_sent");
            if (!(bool != null && bool.booleanValue()) || this.f21019b) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    private boolean m25375a(C6558o oVar) {
        return !(oVar instanceof C6534j);
    }
}
