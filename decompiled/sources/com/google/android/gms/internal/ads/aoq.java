package com.google.android.gms.internal.ads;

@C3718cm
public final class aoq {

    /* renamed from: a */
    private static final Object f11640a = new Object();

    /* renamed from: b */
    private static aoq f11641b;

    /* renamed from: c */
    private final C3975lz f11642c = new C3975lz();

    /* renamed from: d */
    private final aoh f11643d;

    /* renamed from: e */
    private final String f11644e;

    /* renamed from: f */
    private final arq f11645f;

    /* renamed from: g */
    private final arr f11646g;

    /* renamed from: h */
    private final ars f11647h;

    static {
        aoq aoq = new aoq();
        synchronized (f11640a) {
            f11641b = aoq;
        }
    }

    protected aoq() {
        aoh aoh = new aoh(new aoa(), new anz(), new aqs(), new awh(), new C3826gl(), new C4084q(), new awi());
        this.f11643d = aoh;
        this.f11644e = C3975lz.m17384c();
        this.f11645f = new arq();
        this.f11646g = new arr();
        this.f11647h = new ars();
    }

    /* renamed from: a */
    public static C3975lz m14615a() {
        return m14621g().f11642c;
    }

    /* renamed from: b */
    public static aoh m14616b() {
        return m14621g().f11643d;
    }

    /* renamed from: c */
    public static String m14617c() {
        return m14621g().f11644e;
    }

    /* renamed from: d */
    public static arr m14618d() {
        return m14621g().f11646g;
    }

    /* renamed from: e */
    public static arq m14619e() {
        return m14621g().f11645f;
    }

    /* renamed from: f */
    public static ars m14620f() {
        return m14621g().f11647h;
    }

    /* renamed from: g */
    private static aoq m14621g() {
        aoq aoq;
        synchronized (f11640a) {
            aoq = f11641b;
        }
        return aoq;
    }
}
