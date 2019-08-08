package com.appnext.base.p042a;

import com.appnext.base.p042a.p045c.C1234a;
import com.appnext.base.p042a.p045c.C1235b;
import com.appnext.base.p042a.p045c.C1236c;
import com.appnext.base.p042a.p045c.C1240f;

/* renamed from: com.appnext.base.a.a */
public class C1224a {

    /* renamed from: gk */
    private static volatile C1224a f3881gk;

    /* renamed from: gg */
    private C1234a f3882gg = new C1234a();

    /* renamed from: gh */
    private C1235b f3883gh = new C1235b();

    /* renamed from: gi */
    private C1236c f3884gi = new C1236c();

    /* renamed from: gj */
    private C1240f f3885gj = new C1240f();

    /* renamed from: aN */
    public static C1224a m5161aN() {
        if (f3881gk == null) {
            synchronized (C1224a.class) {
                if (f3881gk == null) {
                    f3881gk = new C1224a();
                }
            }
        }
        return f3881gk;
    }

    private C1224a() {
    }

    /* renamed from: aO */
    private void m5162aO() {
        this.f3882gg = new C1234a();
        this.f3883gh = new C1235b();
        this.f3884gi = new C1236c();
        this.f3885gj = new C1240f();
    }

    /* renamed from: aP */
    public final C1234a mo5886aP() {
        return this.f3882gg;
    }

    /* renamed from: aQ */
    public final C1235b mo5887aQ() {
        return this.f3883gh;
    }

    /* renamed from: aR */
    public final C1236c mo5888aR() {
        return this.f3884gi;
    }

    /* renamed from: aS */
    public final C1240f mo5889aS() {
        return this.f3885gj;
    }
}
