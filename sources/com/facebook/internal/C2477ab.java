package com.facebook.internal;

import java.util.EnumSet;
import java.util.Iterator;

/* renamed from: com.facebook.internal.ab */
/* compiled from: SmartLoginOption */
public enum C2477ab {
    None(0),
    Enabled(1),
    RequireConfirm(2);
    

    /* renamed from: d */
    public static final EnumSet<C2477ab> f7801d = null;

    /* renamed from: e */
    private final long f7803e;

    static {
        f7801d = EnumSet.allOf(C2477ab.class);
    }

    /* renamed from: a */
    public static EnumSet<C2477ab> m9414a(long j) {
        EnumSet<C2477ab> noneOf = EnumSet.noneOf(C2477ab.class);
        Iterator it = f7801d.iterator();
        while (it.hasNext()) {
            C2477ab abVar = (C2477ab) it.next();
            if ((j & abVar.mo8922a()) != 0) {
                noneOf.add(abVar);
            }
        }
        return noneOf;
    }

    private C2477ab(long j) {
        this.f7803e = j;
    }

    /* renamed from: a */
    public long mo8922a() {
        return this.f7803e;
    }
}
