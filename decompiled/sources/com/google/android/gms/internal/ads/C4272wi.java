package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.wi */
public enum C4272wi implements abh {
    UNKNOWN_CURVE(0),
    NIST_P224(1),
    NIST_P256(2),
    NIST_P384(3),
    NIST_P521(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: g */
    private static final abi<C4272wi> f14156g = null;

    /* renamed from: h */
    private final int f14158h;

    static {
        f14156g = new C4273wj();
    }

    private C4272wi(int i) {
        this.f14158h = i;
    }

    /* renamed from: a */
    public static C4272wi m18473a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_CURVE;
            case 1:
                return NIST_P224;
            case 2:
                return NIST_P256;
            case 3:
                return NIST_P384;
            case 4:
                return NIST_P521;
            default:
                return null;
        }
    }

    /* renamed from: a */
    public final int mo14004a() {
        if (this != UNRECOGNIZED) {
            return this.f14158h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
