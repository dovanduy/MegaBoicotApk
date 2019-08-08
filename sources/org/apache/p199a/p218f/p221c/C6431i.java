package org.apache.p199a.p218f.p221c;

import java.io.IOException;
import org.apache.p199a.p225g.C6499b;
import org.apache.p199a.p225g.C6502e;
import org.apache.p199a.p225g.C6503f;
import org.apache.p199a.p229k.C6549b;

/* renamed from: org.apache.a.f.c.i */
/* compiled from: LoggingSessionInputBuffer */
public class C6431i implements C6499b, C6503f {

    /* renamed from: a */
    private final C6503f f21082a;

    /* renamed from: b */
    private final C6499b f21083b;

    /* renamed from: c */
    private final C6438m f21084c;

    /* renamed from: d */
    private final String f21085d;

    public C6431i(C6503f fVar, C6438m mVar, String str) {
        this.f21082a = fVar;
        this.f21083b = fVar instanceof C6499b ? (C6499b) fVar : null;
        this.f21084c = mVar;
        if (str == null) {
            str = "ASCII";
        }
        this.f21085d = str;
    }

    /* renamed from: a */
    public boolean mo22808a(int i) throws IOException {
        return this.f21082a.mo22808a(i);
    }

    /* renamed from: a */
    public int mo22807a(byte[] bArr, int i, int i2) throws IOException {
        int a = this.f21082a.mo22807a(bArr, i, i2);
        if (this.f21084c.mo22828a() && a > 0) {
            this.f21084c.mo22831b(bArr, i, a);
        }
        return a;
    }

    /* renamed from: a */
    public int mo22805a() throws IOException {
        int a = this.f21082a.mo22805a();
        if (this.f21084c.mo22828a() && a != -1) {
            this.f21084c.mo22829b(a);
        }
        return a;
    }

    /* renamed from: a */
    public int mo22806a(C6549b bVar) throws IOException {
        int a = this.f21082a.mo22806a(bVar);
        if (this.f21084c.mo22828a() && a >= 0) {
            String str = new String(bVar.mo23051b(), bVar.mo23052c() - a, a);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("\r\n");
            this.f21084c.mo22830b(sb.toString().getBytes(this.f21085d));
        }
        return a;
    }

    /* renamed from: b */
    public C6502e mo22809b() {
        return this.f21082a.mo22809b();
    }

    /* renamed from: c */
    public boolean mo22810c() {
        if (this.f21083b != null) {
            return this.f21083b.mo22810c();
        }
        return false;
    }
}
