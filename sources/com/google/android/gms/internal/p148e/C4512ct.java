package com.google.android.gms.internal.p148e;

import com.google.android.gms.internal.p148e.C4513cu.C4518e;

/* renamed from: com.google.android.gms.internal.e.ct */
final class C4512ct implements C4553eb {

    /* renamed from: a */
    private static final C4512ct f14840a = new C4512ct();

    private C4512ct() {
    }

    /* renamed from: a */
    public static C4512ct m19404a() {
        return f14840a;
    }

    /* renamed from: a */
    public final boolean mo16604a(Class<?> cls) {
        return C4513cu.class.isAssignableFrom(cls);
    }

    /* renamed from: b */
    public final C4552ea mo16605b(Class<?> cls) {
        if (!C4513cu.class.isAssignableFrom(cls)) {
            String str = "Unsupported message type: ";
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
        try {
            return (C4552ea) C4513cu.m19408a(cls.asSubclass(C4513cu.class)).mo16606a(C4518e.f14847c, (Object) null, (Object) null);
        } catch (Exception e) {
            String str2 = "Unable to get message info for ";
            String valueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2), e);
        }
    }
}
