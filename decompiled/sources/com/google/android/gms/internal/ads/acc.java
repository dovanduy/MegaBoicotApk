package com.google.android.gms.internal.ads;

final class acc implements ack {

    /* renamed from: a */
    private ack[] f10477a;

    acc(ack... ackArr) {
        this.f10477a = ackArr;
    }

    /* renamed from: a */
    public final boolean mo13977a(Class<?> cls) {
        for (ack a : this.f10477a) {
            if (a.mo13977a(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final acj mo13978b(Class<?> cls) {
        ack[] ackArr;
        for (ack ack : this.f10477a) {
            if (ack.mo13977a(cls)) {
                return ack.mo13978b(cls);
            }
        }
        String str = "No factory is available for message type: ";
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }
}
