package com.google.android.gms.internal.ads;

final class acw {

    /* renamed from: a */
    private static final acu f10515a = m13510c();

    /* renamed from: b */
    private static final acu f10516b = new acv();

    /* renamed from: a */
    static acu m13508a() {
        return f10515a;
    }

    /* renamed from: b */
    static acu m13509b() {
        return f10516b;
    }

    /* renamed from: c */
    private static acu m13510c() {
        try {
            return (acu) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
