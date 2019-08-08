package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vu */
public enum C4251vu implements abh {
    UNKNOWN_FORMAT(0),
    UNCOMPRESSED(1),
    COMPRESSED(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private static final abi<C4251vu> f14141e = null;

    /* renamed from: f */
    private final int f14143f;

    static {
        f14141e = new C4252vv();
    }

    private C4251vu(int i) {
        this.f14143f = i;
    }

    /* renamed from: a */
    public static C4251vu m18412a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_FORMAT;
            case 1:
                return UNCOMPRESSED;
            case 2:
                return COMPRESSED;
            default:
                return null;
        }
    }

    /* renamed from: a */
    public final int mo14004a() {
        if (this != UNRECOGNIZED) {
            return this.f14143f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
