package com.facebook;

import android.os.Handler;
import com.facebook.C2658q.C2659a;
import com.facebook.C2658q.C2660b;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

/* renamed from: com.facebook.y */
/* compiled from: ProgressOutputStream */
class C2761y extends FilterOutputStream implements C2763z {

    /* renamed from: a */
    private final Map<GraphRequest, C1512aa> f8572a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C2658q f8573b;

    /* renamed from: c */
    private final long f8574c = C2649m.m10136i();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public long f8575d;

    /* renamed from: e */
    private long f8576e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public long f8577f;

    /* renamed from: g */
    private C1512aa f8578g;

    C2761y(OutputStream outputStream, C2658q qVar, Map<GraphRequest, C1512aa> map, long j) {
        super(outputStream);
        this.f8573b = qVar;
        this.f8572a = map;
        this.f8577f = j;
    }

    /* renamed from: a */
    private void m10519a(long j) {
        if (this.f8578g != null) {
            this.f8578g.mo6733a(j);
        }
        this.f8575d += j;
        if (this.f8575d >= this.f8576e + this.f8574c || this.f8575d >= this.f8577f) {
            m10518a();
        }
    }

    /* renamed from: a */
    private void m10518a() {
        if (this.f8575d > this.f8576e) {
            for (C2659a aVar : this.f8573b.mo9359e()) {
                if (aVar instanceof C2660b) {
                    Handler c = this.f8573b.mo9356c();
                    final C2660b bVar = (C2660b) aVar;
                    if (c == null) {
                        bVar.mo9369a(this.f8573b, this.f8575d, this.f8577f);
                    } else {
                        c.post(new Runnable() {
                            public void run() {
                                bVar.mo9369a(C2761y.this.f8573b, C2761y.this.f8575d, C2761y.this.f8577f);
                            }
                        });
                    }
                }
            }
            this.f8576e = this.f8575d;
        }
    }

    /* renamed from: a */
    public void mo9605a(GraphRequest graphRequest) {
        this.f8578g = graphRequest != null ? (C1512aa) this.f8572a.get(graphRequest) : null;
    }

    public void write(byte[] bArr) throws IOException {
        this.out.write(bArr);
        m10519a((long) bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.out.write(bArr, i, i2);
        m10519a((long) i2);
    }

    public void write(int i) throws IOException {
        this.out.write(i);
        m10519a(1);
    }

    public void close() throws IOException {
        super.close();
        for (C1512aa a : this.f8572a.values()) {
            a.mo6732a();
        }
        m10518a();
    }
}
