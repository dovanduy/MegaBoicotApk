package com.facebook.ads.internal.p115w.p117b;

import android.os.Handler;

/* renamed from: com.facebook.ads.internal.w.b.e */
public class C2312e {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Handler f7282a;

    /* renamed from: b */
    private final C2314a f7283b;

    /* renamed from: c */
    private int f7284c;

    /* renamed from: d */
    private boolean f7285d;

    /* renamed from: e */
    private boolean f7286e;

    /* renamed from: com.facebook.ads.internal.w.b.e$a */
    public interface C2314a {
        /* renamed from: a */
        void mo8306a();

        /* renamed from: a */
        void mo8307a(int i);
    }

    public C2312e(int i, C2314a aVar) {
        this(i, aVar, new Handler());
    }

    C2312e(int i, C2314a aVar, Handler handler) {
        this.f7285d = false;
        this.f7284c = i;
        this.f7283b = aVar;
        this.f7282a = handler;
    }

    /* renamed from: a */
    static /* synthetic */ void m9026a(C2312e eVar) {
        eVar.f7284c--;
        eVar.f7283b.mo8307a(eVar.f7284c);
        if (eVar.f7284c == 0 && !eVar.f7286e) {
            eVar.f7286e = true;
            eVar.f7283b.mo8306a();
            eVar.f7285d = false;
        }
    }

    /* renamed from: a */
    public boolean mo8716a() {
        if (mo8719d() && !this.f7286e) {
            this.f7283b.mo8306a();
        }
        if (mo8719d() || mo8718c()) {
            return false;
        }
        this.f7285d = true;
        this.f7283b.mo8307a(this.f7284c);
        this.f7282a.postDelayed(new Runnable() {
            public void run() {
                if (C2312e.this.mo8718c()) {
                    C2312e.m9026a(C2312e.this);
                    C2312e.this.f7282a.postDelayed(this, 1000);
                }
            }
        }, 1000);
        return true;
    }

    /* renamed from: b */
    public boolean mo8717b() {
        if (!mo8718c()) {
            return false;
        }
        this.f7285d = false;
        return true;
    }

    /* renamed from: c */
    public boolean mo8718c() {
        return this.f7285d;
    }

    /* renamed from: d */
    public boolean mo8719d() {
        return this.f7284c <= 0;
    }

    /* renamed from: e */
    public int mo8720e() {
        return this.f7284c;
    }
}
