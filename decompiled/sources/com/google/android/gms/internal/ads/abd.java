package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.abe.C3640e;

final class abd implements ack {

    /* renamed from: a */
    private static final abd f10413a = new abd();

    private abd() {
    }

    /* renamed from: a */
    public static abd m13277a() {
        return f10413a;
    }

    /* renamed from: a */
    public final boolean mo13977a(Class<?> cls) {
        return abe.class.isAssignableFrom(cls);
    }

    /* renamed from: b */
    public final acj mo13978b(Class<?> cls) {
        if (!abe.class.isAssignableFrom(cls)) {
            String str = "Unsupported message type: ";
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
        try {
            return (acj) abe.m13284a(cls.asSubclass(abe.class)).mo13979a(C3640e.f10420c, (Object) null, (Object) null);
        } catch (Exception e) {
            String str2 = "Unable to get message info for ";
            String valueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2), e);
        }
    }
}
