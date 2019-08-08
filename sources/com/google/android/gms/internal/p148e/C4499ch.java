package com.google.android.gms.internal.p148e;

import com.google.android.gms.internal.p148e.C4513cu.C4517d;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.e.ch */
public class C4499ch {

    /* renamed from: a */
    static final C4499ch f14753a = new C4499ch(true);

    /* renamed from: b */
    private static volatile boolean f14754b = false;

    /* renamed from: c */
    private static final Class<?> f14755c = m19343d();

    /* renamed from: d */
    private static volatile C4499ch f14756d;

    /* renamed from: e */
    private final Map<C4500a, C4517d<?, ?>> f14757e;

    /* renamed from: com.google.android.gms.internal.e.ch$a */
    static final class C4500a {

        /* renamed from: a */
        private final Object f14758a;

        /* renamed from: b */
        private final int f14759b;

        C4500a(Object obj, int i) {
            this.f14758a = obj;
            this.f14759b = i;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f14758a) * 65535) + this.f14759b;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C4500a)) {
                return false;
            }
            C4500a aVar = (C4500a) obj;
            if (this.f14758a == aVar.f14758a && this.f14759b == aVar.f14759b) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: d */
    private static Class<?> m19343d() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static C4499ch m19340a() {
        return C4498cg.m19336a();
    }

    /* renamed from: b */
    public static C4499ch m19341b() {
        C4499ch chVar = f14756d;
        if (chVar == null) {
            synchronized (C4499ch.class) {
                chVar = f14756d;
                if (chVar == null) {
                    chVar = C4498cg.m19338b();
                    f14756d = chVar;
                }
            }
        }
        return chVar;
    }

    /* renamed from: c */
    static C4499ch m19342c() {
        return C4511cs.m19402a(C4499ch.class);
    }

    /* renamed from: a */
    public final <ContainingType extends C4554ec> C4517d<ContainingType, ?> mo16566a(ContainingType containingtype, int i) {
        return (C4517d) this.f14757e.get(new C4500a(containingtype, i));
    }

    C4499ch() {
        this.f14757e = new HashMap();
    }

    private C4499ch(boolean z) {
        this.f14757e = Collections.emptyMap();
    }
}
