package org.apache.p199a.p218f.p224f;

import com.google.android.exoplayer2.C2793C;
import java.io.IOException;
import java.io.InputStream;
import org.apache.p199a.p225g.C6498a;
import org.apache.p199a.p225g.C6502e;
import org.apache.p199a.p225g.C6503f;
import org.apache.p199a.p227i.C6531d;
import org.apache.p199a.p227i.C6532e;
import org.apache.p199a.p229k.C6548a;
import org.apache.p199a.p229k.C6549b;

/* renamed from: org.apache.a.f.f.c */
/* compiled from: AbstractSessionInputBuffer */
public abstract class C6484c implements C6498a, C6503f {

    /* renamed from: a */
    private InputStream f21156a;

    /* renamed from: b */
    private byte[] f21157b;

    /* renamed from: c */
    private int f21158c;

    /* renamed from: d */
    private int f21159d;

    /* renamed from: e */
    private C6548a f21160e = null;

    /* renamed from: f */
    private String f21161f = C2793C.ASCII_NAME;

    /* renamed from: g */
    private boolean f21162g = true;

    /* renamed from: h */
    private int f21163h = -1;

    /* renamed from: i */
    private int f21164i = 512;

    /* renamed from: j */
    private C6492k f21165j;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22860a(InputStream inputStream, int i, C6531d dVar) {
        if (inputStream == null) {
            throw new IllegalArgumentException("Input stream may not be null");
        } else if (i <= 0) {
            throw new IllegalArgumentException("Buffer size may not be negative or zero");
        } else if (dVar == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        } else {
            this.f21156a = inputStream;
            this.f21157b = new byte[i];
            boolean z = false;
            this.f21158c = 0;
            this.f21159d = 0;
            this.f21160e = new C6548a(i);
            this.f21161f = C6532e.m25879a(dVar);
            if (this.f21161f.equalsIgnoreCase(C2793C.ASCII_NAME) || this.f21161f.equalsIgnoreCase("ASCII")) {
                z = true;
            }
            this.f21162g = z;
            this.f21163h = dVar.mo23001a("http.connection.max-line-length", -1);
            this.f21164i = dVar.mo23001a("http.connection.min-chunk-limit", 512);
            this.f21165j = mo22861d();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C6492k mo22861d() {
        return new C6492k();
    }

    /* renamed from: e */
    public int mo22862e() {
        return this.f21159d - this.f21158c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public int mo22863f() throws IOException {
        if (this.f21158c > 0) {
            int i = this.f21159d - this.f21158c;
            if (i > 0) {
                System.arraycopy(this.f21157b, this.f21158c, this.f21157b, 0, i);
            }
            this.f21158c = 0;
            this.f21159d = i;
        }
        int i2 = this.f21159d;
        int read = this.f21156a.read(this.f21157b, i2, this.f21157b.length - i2);
        if (read == -1) {
            return -1;
        }
        this.f21159d = i2 + read;
        this.f21165j.mo22894a((long) read);
        return read;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo22864g() {
        return this.f21158c < this.f21159d;
    }

    /* renamed from: a */
    public int mo22805a() throws IOException {
        while (!mo22864g()) {
            if (mo22863f() == -1) {
                return -1;
            }
        }
        byte[] bArr = this.f21157b;
        int i = this.f21158c;
        this.f21158c = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: a */
    public int mo22807a(byte[] bArr, int i, int i2) throws IOException {
        if (bArr == null) {
            return 0;
        }
        if (mo22864g()) {
            int min = Math.min(i2, this.f21159d - this.f21158c);
            System.arraycopy(this.f21157b, this.f21158c, bArr, i, min);
            this.f21158c += min;
            return min;
        } else if (i2 > this.f21164i) {
            return this.f21156a.read(bArr, i, i2);
        } else {
            while (!mo22864g()) {
                if (mo22863f() == -1) {
                    return -1;
                }
            }
            int min2 = Math.min(i2, this.f21159d - this.f21158c);
            System.arraycopy(this.f21157b, this.f21158c, bArr, i, min2);
            this.f21158c += min2;
            return min2;
        }
    }

    /* renamed from: c */
    private int mo22810c() {
        for (int i = this.f21158c; i < this.f21159d; i++) {
            if (this.f21157b[i] == 10) {
                return i;
            }
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0052, code lost:
        if (r2 == -1) goto L_0x0034;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo22806a(org.apache.p199a.p229k.C6549b r8) throws java.io.IOException {
        /*
            r7 = this;
            if (r8 != 0) goto L_0x000a
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Char array buffer may not be null"
            r8.<init>(r0)
            throw r8
        L_0x000a:
            r0 = 1
            r1 = 0
            r2 = r1
        L_0x000d:
            r3 = -1
            if (r0 == 0) goto L_0x006b
            int r4 = r7.mo22810c()
            if (r4 == r3) goto L_0x0036
            org.apache.a.k.a r0 = r7.f21160e
            boolean r0 = r0.mo23036f()
            if (r0 == 0) goto L_0x0023
            int r8 = r7.m25673a(r8, r4)
            return r8
        L_0x0023:
            int r4 = r4 + 1
            int r0 = r7.f21158c
            int r0 = r4 - r0
            org.apache.a.k.a r3 = r7.f21160e
            byte[] r5 = r7.f21157b
            int r6 = r7.f21158c
            r3.mo23028a(r5, r6, r0)
            r7.f21158c = r4
        L_0x0034:
            r0 = r1
            goto L_0x0055
        L_0x0036:
            boolean r2 = r7.mo22864g()
            if (r2 == 0) goto L_0x004e
            int r2 = r7.f21159d
            int r4 = r7.f21158c
            int r2 = r2 - r4
            org.apache.a.k.a r4 = r7.f21160e
            byte[] r5 = r7.f21157b
            int r6 = r7.f21158c
            r4.mo23028a(r5, r6, r2)
            int r2 = r7.f21159d
            r7.f21158c = r2
        L_0x004e:
            int r2 = r7.mo22863f()
            if (r2 != r3) goto L_0x0055
            goto L_0x0034
        L_0x0055:
            int r3 = r7.f21163h
            if (r3 <= 0) goto L_0x000d
            org.apache.a.k.a r3 = r7.f21160e
            int r3 = r3.mo23034d()
            int r4 = r7.f21163h
            if (r3 < r4) goto L_0x000d
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r0 = "Maximum line length limit exceeded"
            r8.<init>(r0)
            throw r8
        L_0x006b:
            if (r2 != r3) goto L_0x0076
            org.apache.a.k.a r0 = r7.f21160e
            boolean r0 = r0.mo23036f()
            if (r0 == 0) goto L_0x0076
            return r3
        L_0x0076:
            int r8 = r7.m25674b(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.p199a.p218f.p224f.C6484c.mo22806a(org.apache.a.k.b):int");
    }

    /* renamed from: b */
    private int m25674b(C6549b bVar) throws IOException {
        int d = this.f21160e.mo23034d();
        if (d > 0) {
            if (this.f21160e.mo23030b(d - 1) == 10) {
                d--;
                this.f21160e.mo23033c(d);
            }
            if (d > 0 && this.f21160e.mo23030b(d - 1) == 13) {
                this.f21160e.mo23033c(d - 1);
            }
        }
        int d2 = this.f21160e.mo23034d();
        if (this.f21162g) {
            bVar.mo23045a(this.f21160e, 0, d2);
        } else {
            String str = new String(this.f21160e.mo23035e(), 0, d2, this.f21161f);
            d2 = str.length();
            bVar.mo23044a(str);
        }
        this.f21160e.mo23025a();
        return d2;
    }

    /* renamed from: a */
    private int m25673a(C6549b bVar, int i) throws IOException {
        int i2 = this.f21158c;
        this.f21158c = i + 1;
        if (i > 0 && this.f21157b[i - 1] == 13) {
            i--;
        }
        int i3 = i - i2;
        if (this.f21162g) {
            bVar.mo23047a(this.f21157b, i2, i3);
            return i3;
        }
        String str = new String(this.f21157b, i2, i3, this.f21161f);
        bVar.mo23044a(str);
        return str.length();
    }

    /* renamed from: b */
    public C6502e mo22809b() {
        return this.f21165j;
    }
}
