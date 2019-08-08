package com.google.android.gms.internal.p148e;

import java.lang.reflect.Type;

/* renamed from: com.google.android.gms.internal.e.co */
public enum C4507co {
    DOUBLE(0, C4509cq.SCALAR, C4528dd.DOUBLE),
    FLOAT(1, C4509cq.SCALAR, C4528dd.FLOAT),
    INT64(2, C4509cq.SCALAR, C4528dd.LONG),
    UINT64(3, C4509cq.SCALAR, C4528dd.LONG),
    INT32(4, C4509cq.SCALAR, C4528dd.INT),
    FIXED64(5, C4509cq.SCALAR, C4528dd.LONG),
    FIXED32(6, C4509cq.SCALAR, C4528dd.INT),
    BOOL(7, C4509cq.SCALAR, C4528dd.BOOLEAN),
    STRING(8, C4509cq.SCALAR, C4528dd.STRING),
    MESSAGE(9, C4509cq.SCALAR, C4528dd.MESSAGE),
    BYTES(10, C4509cq.SCALAR, C4528dd.BYTE_STRING),
    UINT32(11, C4509cq.SCALAR, C4528dd.INT),
    ENUM(12, C4509cq.SCALAR, C4528dd.ENUM),
    SFIXED32(13, C4509cq.SCALAR, C4528dd.INT),
    SFIXED64(14, C4509cq.SCALAR, C4528dd.LONG),
    SINT32(15, C4509cq.SCALAR, C4528dd.INT),
    SINT64(16, C4509cq.SCALAR, C4528dd.LONG),
    GROUP(17, C4509cq.SCALAR, C4528dd.MESSAGE),
    DOUBLE_LIST(18, C4509cq.VECTOR, C4528dd.DOUBLE),
    FLOAT_LIST(19, C4509cq.VECTOR, C4528dd.FLOAT),
    INT64_LIST(20, C4509cq.VECTOR, C4528dd.LONG),
    UINT64_LIST(21, C4509cq.VECTOR, C4528dd.LONG),
    INT32_LIST(22, C4509cq.VECTOR, C4528dd.INT),
    FIXED64_LIST(23, C4509cq.VECTOR, C4528dd.LONG),
    FIXED32_LIST(24, C4509cq.VECTOR, C4528dd.INT),
    BOOL_LIST(25, C4509cq.VECTOR, C4528dd.BOOLEAN),
    STRING_LIST(26, C4509cq.VECTOR, C4528dd.STRING),
    MESSAGE_LIST(27, C4509cq.VECTOR, C4528dd.MESSAGE),
    BYTES_LIST(28, C4509cq.VECTOR, C4528dd.BYTE_STRING),
    UINT32_LIST(29, C4509cq.VECTOR, C4528dd.INT),
    ENUM_LIST(30, C4509cq.VECTOR, C4528dd.ENUM),
    SFIXED32_LIST(31, C4509cq.VECTOR, C4528dd.INT),
    SFIXED64_LIST(32, C4509cq.VECTOR, C4528dd.LONG),
    SINT32_LIST(33, C4509cq.VECTOR, C4528dd.INT),
    SINT64_LIST(34, C4509cq.VECTOR, C4528dd.LONG),
    DOUBLE_LIST_PACKED(35, C4509cq.PACKED_VECTOR, C4528dd.DOUBLE),
    FLOAT_LIST_PACKED(36, C4509cq.PACKED_VECTOR, C4528dd.FLOAT),
    INT64_LIST_PACKED(37, C4509cq.PACKED_VECTOR, C4528dd.LONG),
    UINT64_LIST_PACKED(38, C4509cq.PACKED_VECTOR, C4528dd.LONG),
    INT32_LIST_PACKED(39, C4509cq.PACKED_VECTOR, C4528dd.INT),
    FIXED64_LIST_PACKED(40, C4509cq.PACKED_VECTOR, C4528dd.LONG),
    FIXED32_LIST_PACKED(41, C4509cq.PACKED_VECTOR, C4528dd.INT),
    BOOL_LIST_PACKED(42, C4509cq.PACKED_VECTOR, C4528dd.BOOLEAN),
    UINT32_LIST_PACKED(43, C4509cq.PACKED_VECTOR, C4528dd.INT),
    ENUM_LIST_PACKED(44, C4509cq.PACKED_VECTOR, C4528dd.ENUM),
    SFIXED32_LIST_PACKED(45, C4509cq.PACKED_VECTOR, C4528dd.INT),
    SFIXED64_LIST_PACKED(46, C4509cq.PACKED_VECTOR, C4528dd.LONG),
    SINT32_LIST_PACKED(47, C4509cq.PACKED_VECTOR, C4528dd.INT),
    SINT64_LIST_PACKED(48, C4509cq.PACKED_VECTOR, C4528dd.LONG),
    GROUP_LIST(49, C4509cq.VECTOR, C4528dd.MESSAGE),
    MAP(50, C4509cq.MAP, C4528dd.VOID);
    

    /* renamed from: ae */
    private static final C4507co[] f14794ae = null;

    /* renamed from: af */
    private static final Type[] f14795af = null;

    /* renamed from: Z */
    private final C4528dd f14822Z;

    /* renamed from: aa */
    private final int f14823aa;

    /* renamed from: ab */
    private final C4509cq f14824ab;

    /* renamed from: ac */
    private final Class<?> f14825ac;

    /* renamed from: ad */
    private final boolean f14826ad;

    private C4507co(int i, C4509cq cqVar, C4528dd ddVar) {
        this.f14823aa = i;
        this.f14824ab = cqVar;
        this.f14822Z = ddVar;
        switch (cqVar) {
            case MAP:
                this.f14825ac = ddVar.mo16633a();
                break;
            case VECTOR:
                this.f14825ac = ddVar.mo16633a();
                break;
            default:
                this.f14825ac = null;
                break;
        }
        boolean z = false;
        if (cqVar == C4509cq.SCALAR) {
            switch (ddVar) {
                case BYTE_STRING:
                case MESSAGE:
                case STRING:
                    break;
                default:
                    z = true;
                    break;
            }
        }
        this.f14826ad = z;
    }

    /* renamed from: a */
    public final int mo16598a() {
        return this.f14823aa;
    }

    static {
        int i;
        f14795af = new Type[0];
        C4507co[] values = values();
        f14794ae = new C4507co[values.length];
        for (C4507co coVar : values) {
            f14794ae[coVar.f14823aa] = coVar;
        }
    }
}
