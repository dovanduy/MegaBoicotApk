package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.wl */
public enum C4275wl implements abh {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA224(2),
    SHA256(3),
    SHA512(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: g */
    private static final abi<C4275wl> f14165g = null;

    /* renamed from: h */
    private final int f14167h;

    static {
        f14165g = new C4276wm();
    }

    private C4275wl(int i) {
        this.f14167h = i;
    }

    /* renamed from: a */
    public static C4275wl m18479a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_HASH;
            case 1:
                return SHA1;
            case 2:
                return SHA224;
            case 3:
                return SHA256;
            case 4:
                return SHA512;
            default:
                return null;
        }
    }

    /* renamed from: a */
    public final int mo14004a() {
        if (this != UNRECOGNIZED) {
            return this.f14167h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
