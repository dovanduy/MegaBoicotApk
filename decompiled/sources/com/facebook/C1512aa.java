package com.facebook;

import android.os.Handler;
import com.facebook.GraphRequest.C1503b;
import com.facebook.GraphRequest.C1506e;

/* renamed from: com.facebook.aa */
/* compiled from: RequestProgress */
class C1512aa {

    /* renamed from: a */
    private final GraphRequest f4584a;

    /* renamed from: b */
    private final Handler f4585b;

    /* renamed from: c */
    private final long f4586c = C2649m.m10136i();

    /* renamed from: d */
    private long f4587d;

    /* renamed from: e */
    private long f4588e;

    /* renamed from: f */
    private long f4589f;

    C1512aa(Handler handler, GraphRequest graphRequest) {
        this.f4584a = graphRequest;
        this.f4585b = handler;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6733a(long j) {
        this.f4587d += j;
        if (this.f4587d >= this.f4588e + this.f4586c || this.f4587d >= this.f4589f) {
            mo6732a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo6734b(long j) {
        this.f4589f += j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6732a() {
        if (this.f4587d > this.f4588e) {
            C1503b g = this.f4584a.mo6684g();
            if (this.f4589f > 0 && (g instanceof C1506e)) {
                final long j = this.f4587d;
                final long j2 = this.f4589f;
                final C1506e eVar = (C1506e) g;
                if (this.f4585b == null) {
                    eVar.mo6705a(j, j2);
                } else {
                    Handler handler = this.f4585b;
                    C15131 r2 = new Runnable() {
                        public void run() {
                            eVar.mo6705a(j, j2);
                        }
                    };
                    handler.post(r2);
                }
                this.f4588e = this.f4587d;
            }
        }
    }
}
