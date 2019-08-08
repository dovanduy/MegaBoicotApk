package com.google.android.gms.internal.ads;

import java.lang.reflect.Type;

public enum aaz {
    DOUBLE(0, abb.SCALAR, abm.DOUBLE),
    FLOAT(1, abb.SCALAR, abm.FLOAT),
    INT64(2, abb.SCALAR, abm.LONG),
    UINT64(3, abb.SCALAR, abm.LONG),
    INT32(4, abb.SCALAR, abm.INT),
    FIXED64(5, abb.SCALAR, abm.LONG),
    FIXED32(6, abb.SCALAR, abm.INT),
    BOOL(7, abb.SCALAR, abm.BOOLEAN),
    STRING(8, abb.SCALAR, abm.STRING),
    MESSAGE(9, abb.SCALAR, abm.MESSAGE),
    BYTES(10, abb.SCALAR, abm.BYTE_STRING),
    UINT32(11, abb.SCALAR, abm.INT),
    ENUM(12, abb.SCALAR, abm.ENUM),
    SFIXED32(13, abb.SCALAR, abm.INT),
    SFIXED64(14, abb.SCALAR, abm.LONG),
    SINT32(15, abb.SCALAR, abm.INT),
    SINT64(16, abb.SCALAR, abm.LONG),
    GROUP(17, abb.SCALAR, abm.MESSAGE),
    DOUBLE_LIST(18, abb.VECTOR, abm.DOUBLE),
    FLOAT_LIST(19, abb.VECTOR, abm.FLOAT),
    INT64_LIST(20, abb.VECTOR, abm.LONG),
    UINT64_LIST(21, abb.VECTOR, abm.LONG),
    INT32_LIST(22, abb.VECTOR, abm.INT),
    FIXED64_LIST(23, abb.VECTOR, abm.LONG),
    FIXED32_LIST(24, abb.VECTOR, abm.INT),
    BOOL_LIST(25, abb.VECTOR, abm.BOOLEAN),
    STRING_LIST(26, abb.VECTOR, abm.STRING),
    MESSAGE_LIST(27, abb.VECTOR, abm.MESSAGE),
    BYTES_LIST(28, abb.VECTOR, abm.BYTE_STRING),
    UINT32_LIST(29, abb.VECTOR, abm.INT),
    ENUM_LIST(30, abb.VECTOR, abm.ENUM),
    SFIXED32_LIST(31, abb.VECTOR, abm.INT),
    SFIXED64_LIST(32, abb.VECTOR, abm.LONG),
    SINT32_LIST(33, abb.VECTOR, abm.INT),
    SINT64_LIST(34, abb.VECTOR, abm.LONG),
    DOUBLE_LIST_PACKED(35, abb.PACKED_VECTOR, abm.DOUBLE),
    FLOAT_LIST_PACKED(36, abb.PACKED_VECTOR, abm.FLOAT),
    INT64_LIST_PACKED(37, abb.PACKED_VECTOR, abm.LONG),
    UINT64_LIST_PACKED(38, abb.PACKED_VECTOR, abm.LONG),
    INT32_LIST_PACKED(39, abb.PACKED_VECTOR, abm.INT),
    FIXED64_LIST_PACKED(40, abb.PACKED_VECTOR, abm.LONG),
    FIXED32_LIST_PACKED(41, abb.PACKED_VECTOR, abm.INT),
    BOOL_LIST_PACKED(42, abb.PACKED_VECTOR, abm.BOOLEAN),
    UINT32_LIST_PACKED(43, abb.PACKED_VECTOR, abm.INT),
    ENUM_LIST_PACKED(44, abb.PACKED_VECTOR, abm.ENUM),
    SFIXED32_LIST_PACKED(45, abb.PACKED_VECTOR, abm.INT),
    SFIXED64_LIST_PACKED(46, abb.PACKED_VECTOR, abm.LONG),
    SINT32_LIST_PACKED(47, abb.PACKED_VECTOR, abm.INT),
    SINT64_LIST_PACKED(48, abb.PACKED_VECTOR, abm.LONG),
    GROUP_LIST(49, abb.VECTOR, abm.MESSAGE),
    MAP(50, abb.MAP, abm.VOID);
    

    /* renamed from: ae */
    private static final aaz[] f10369ae = null;

    /* renamed from: af */
    private static final Type[] f10370af = null;

    /* renamed from: Z */
    private final abm f10397Z;

    /* renamed from: aa */
    private final int f10398aa;

    /* renamed from: ab */
    private final abb f10399ab;

    /* renamed from: ac */
    private final Class<?> f10400ac;

    /* renamed from: ad */
    private final boolean f10401ad;

    static {
        int i;
        f10370af = new Type[0];
        aaz[] values = values();
        f10369ae = new aaz[values.length];
        for (aaz aaz : values) {
            f10369ae[aaz.f10398aa] = aaz;
        }
    }

    private aaz(int i, abb abb, abm abm) {
        Class<?> a;
        this.f10398aa = i;
        this.f10399ab = abb;
        this.f10397Z = abm;
        switch (aba.f10402a[abb.ordinal()]) {
            case 1:
            case 2:
                a = abm.mo14009a();
                break;
            default:
                a = null;
                break;
        }
        this.f10400ac = a;
        boolean z = false;
        if (abb == abb.SCALAR) {
            switch (aba.f10403b[abm.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    break;
                default:
                    z = true;
                    break;
            }
        }
        this.f10401ad = z;
    }

    /* renamed from: a */
    public final int mo13972a() {
        return this.f10398aa;
    }
}
