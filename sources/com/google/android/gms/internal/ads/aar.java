package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.abe.C3639d;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class aar {

    /* renamed from: a */
    static final aar f10329a = new aar(true);

    /* renamed from: b */
    private static volatile boolean f10330b = false;

    /* renamed from: c */
    private static final Class<?> f10331c = m13216b();

    /* renamed from: d */
    private final Map<aas, C3639d<?, ?>> f10332d;

    aar() {
        this.f10332d = new HashMap();
    }

    private aar(boolean z) {
        this.f10332d = Collections.emptyMap();
    }

    /* renamed from: a */
    public static aar m13215a() {
        return aaq.m13213a();
    }

    /* renamed from: b */
    private static Class<?> m13216b() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final <ContainingType extends acl> C3639d<ContainingType, ?> mo13939a(ContainingType containingtype, int i) {
        return (C3639d) this.f10332d.get(new aas(containingtype, i));
    }
}
