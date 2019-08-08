package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.xp */
public enum C4323xp implements abh {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: g */
    private static final abi<C4323xp> f14208g = null;

    /* renamed from: h */
    private final int f14210h;

    static {
        f14208g = new C4324xq();
    }

    private C4323xp(int i) {
        this.f14210h = i;
    }

    /* renamed from: a */
    public static C4323xp m18636a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_PREFIX;
            case 1:
                return TINK;
            case 2:
                return LEGACY;
            case 3:
                return RAW;
            case 4:
                return CRUNCHY;
            default:
                return null;
        }
    }

    /* renamed from: a */
    public final int mo14004a() {
        if (this != UNRECOGNIZED) {
            return this.f14210h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
