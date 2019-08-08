package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ww */
public enum C4291ww implements abh {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: f */
    private static final abi<C4291ww> f14186f = null;

    /* renamed from: g */
    private final int f14188g;

    static {
        f14186f = new C4292wx();
    }

    private C4291ww(int i) {
        this.f14188g = i;
    }

    /* renamed from: a */
    public static C4291ww m18529a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_STATUS;
            case 1:
                return ENABLED;
            case 2:
                return DISABLED;
            case 3:
                return DESTROYED;
            default:
                return null;
        }
    }

    /* renamed from: a */
    public final int mo14004a() {
        if (this != UNRECOGNIZED) {
            return this.f14188g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
