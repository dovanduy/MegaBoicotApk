package com.facebook;

import android.os.Handler;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.x */
/* compiled from: ProgressNoopOutputStream */
class C2760x extends OutputStream implements C2763z {

    /* renamed from: a */
    private final Map<GraphRequest, C1512aa> f8567a = new HashMap();

    /* renamed from: b */
    private final Handler f8568b;

    /* renamed from: c */
    private GraphRequest f8569c;

    /* renamed from: d */
    private C1512aa f8570d;

    /* renamed from: e */
    private int f8571e;

    C2760x(Handler handler) {
        this.f8568b = handler;
    }

    /* renamed from: a */
    public void mo9605a(GraphRequest graphRequest) {
        this.f8569c = graphRequest;
        this.f8570d = graphRequest != null ? (C1512aa) this.f8567a.get(graphRequest) : null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo9603a() {
        return this.f8571e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public Map<GraphRequest, C1512aa> mo9606b() {
        return this.f8567a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9604a(long j) {
        if (this.f8570d == null) {
            this.f8570d = new C1512aa(this.f8568b, this.f8569c);
            this.f8567a.put(this.f8569c, this.f8570d);
        }
        this.f8570d.mo6734b(j);
        this.f8571e = (int) (((long) this.f8571e) + j);
    }

    public void write(byte[] bArr) {
        mo9604a((long) bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) {
        mo9604a((long) i2);
    }

    public void write(int i) {
        mo9604a(1);
    }
}
