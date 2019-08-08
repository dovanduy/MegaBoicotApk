package com.google.android.gms.internal.ads;

final class aci {

    /* renamed from: a */
    private static final acg f10484a = m13419c();

    /* renamed from: b */
    private static final acg f10485b = new ach();

    /* renamed from: a */
    static acg m13417a() {
        return f10484a;
    }

    /* renamed from: b */
    static acg m13418b() {
        return f10485b;
    }

    /* renamed from: c */
    private static acg m13419c() {
        try {
            return (acg) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
