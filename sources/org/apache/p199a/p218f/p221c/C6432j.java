package org.apache.p199a.p218f.p221c;

import java.io.IOException;
import org.apache.p199a.p225g.C6502e;
import org.apache.p199a.p225g.C6504g;
import org.apache.p199a.p229k.C6549b;

/* renamed from: org.apache.a.f.c.j */
/* compiled from: LoggingSessionOutputBuffer */
public class C6432j implements C6504g {

    /* renamed from: a */
    private final C6504g f21086a;

    /* renamed from: b */
    private final C6438m f21087b;

    /* renamed from: c */
    private final String f21088c;

    public C6432j(C6504g gVar, C6438m mVar, String str) {
        this.f21086a = gVar;
        this.f21087b = mVar;
        if (str == null) {
            str = "ASCII";
        }
        this.f21088c = str;
    }

    /* renamed from: a */
    public void mo22815a(byte[] bArr, int i, int i2) throws IOException {
        this.f21086a.mo22815a(bArr, i, i2);
        if (this.f21087b.mo22828a()) {
            this.f21087b.mo22827a(bArr, i, i2);
        }
    }

    /* renamed from: a */
    public void mo22812a(int i) throws IOException {
        this.f21086a.mo22812a(i);
        if (this.f21087b.mo22828a()) {
            this.f21087b.mo22825a(i);
        }
    }

    /* renamed from: a */
    public void mo22811a() throws IOException {
        this.f21086a.mo22811a();
    }

    /* renamed from: a */
    public void mo22814a(C6549b bVar) throws IOException {
        this.f21086a.mo22814a(bVar);
        if (this.f21087b.mo22828a()) {
            String str = new String(bVar.mo23051b(), 0, bVar.mo23052c());
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("\r\n");
            this.f21087b.mo22826a(sb.toString().getBytes(this.f21088c));
        }
    }

    /* renamed from: a */
    public void mo22813a(String str) throws IOException {
        this.f21086a.mo22813a(str);
        if (this.f21087b.mo22828a()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("\r\n");
            this.f21087b.mo22826a(sb.toString().getBytes(this.f21088c));
        }
    }

    /* renamed from: b */
    public C6502e mo22816b() {
        return this.f21086a.mo22816b();
    }
}
