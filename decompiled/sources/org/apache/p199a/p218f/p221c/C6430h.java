package org.apache.p199a.p218f.p221c;

import java.io.IOException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.p199a.C6547k;
import org.apache.p199a.C6557n;
import org.apache.p199a.C6561r;
import org.apache.p199a.C6566w;
import org.apache.p199a.C6568y;
import org.apache.p199a.p218f.p224f.C6482a;
import org.apache.p199a.p225g.C6503f;
import org.apache.p199a.p226h.C6525t;
import org.apache.p199a.p226h.C6526u;
import org.apache.p199a.p227i.C6531d;
import org.apache.p199a.p229k.C6549b;

/* renamed from: org.apache.a.f.c.h */
/* compiled from: DefaultResponseParser */
public class C6430h extends C6482a {

    /* renamed from: b */
    private final Log f21078b = LogFactory.getLog(getClass());

    /* renamed from: c */
    private final C6561r f21079c;

    /* renamed from: d */
    private final C6549b f21080d;

    /* renamed from: e */
    private final int f21081e;

    public C6430h(C6503f fVar, C6525t tVar, C6561r rVar, C6531d dVar) {
        super(fVar, tVar, dVar);
        if (rVar == null) {
            throw new IllegalArgumentException("Response factory may not be null");
        }
        this.f21079c = rVar;
        this.f21080d = new C6549b(128);
        this.f21081e = dVar.mo23001a("http.connection.max-status-line-garbage", Integer.MAX_VALUE);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C6557n mo22804a(C6503f fVar) throws IOException, C6547k {
        int i = 0;
        while (true) {
            this.f21080d.mo23041a();
            int a = fVar.mo22806a(this.f21080d);
            if (a == -1 && i == 0) {
                throw new C6566w("The target server failed to respond");
            }
            C6526u uVar = new C6526u(0, this.f21080d.mo23052c());
            if (this.f21146a.mo22954b(this.f21080d, uVar)) {
                return this.f21079c.mo22776a(this.f21146a.mo22955c(this.f21080d, uVar), null);
            } else if (a != -1 && i < this.f21081e) {
                if (this.f21078b.isDebugEnabled()) {
                    Log log = this.f21078b;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Garbage in response: ");
                    sb.append(this.f21080d.toString());
                    log.debug(sb.toString());
                }
                i++;
            }
        }
        throw new C6568y("The server failed to respond with a valid HTTP response");
    }
}
