package com.appnext.core.result;

/* renamed from: com.appnext.core.result.d */
public final class C1372d {

    /* renamed from: mg */
    private static C1372d f4286mg;

    /* renamed from: mb */
    private C1371c f4287mb;

    private C1372d() {
    }

    /* renamed from: cO */
    public static synchronized C1372d m5794cO() {
        C1372d dVar;
        synchronized (C1372d.class) {
            if (f4286mg == null) {
                f4286mg = new C1372d();
            }
            dVar = f4286mg;
        }
        return dVar;
    }

    /* renamed from: cP */
    public final C1371c mo6318cP() {
        return this.f4287mb;
    }

    /* renamed from: a */
    public final void mo6317a(C1371c cVar) {
        this.f4287mb = cVar;
    }
}
