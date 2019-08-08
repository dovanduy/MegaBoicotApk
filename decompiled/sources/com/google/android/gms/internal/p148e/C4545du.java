package com.google.android.gms.internal.p148e;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.e.du */
public final class C4545du<K, V> {
    /* renamed from: a */
    static <K, V> void m19514a(C4487ca caVar, C4546dv<K, V> dvVar, K k, V v) throws IOException {
        C4504cl.m19372a(caVar, dvVar.f14901a, 1, k);
        C4504cl.m19372a(caVar, dvVar.f14903c, 2, v);
    }

    /* renamed from: a */
    static <K, V> int m19513a(C4546dv<K, V> dvVar, K k, V v) {
        return C4504cl.m19368a(dvVar.f14901a, 1, k) + C4504cl.m19368a(dvVar.f14903c, 2, v);
    }
}
