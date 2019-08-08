package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class acy {

    /* renamed from: a */
    private static final acy f10517a = new acy();

    /* renamed from: b */
    private final adf f10518b;

    /* renamed from: c */
    private final ConcurrentMap<Class<?>, ade<?>> f10519c = new ConcurrentHashMap();

    private acy() {
        String[] strArr = {"com.google.protobuf.AndroidProto3SchemaFactory"};
        adf adf = null;
        for (int i = 0; i <= 0; i++) {
            adf = m13512a(strArr[0]);
            if (adf != null) {
                break;
            }
        }
        if (adf == null) {
            adf = new aca();
        }
        this.f10518b = adf;
    }

    /* renamed from: a */
    public static acy m13511a() {
        return f10517a;
    }

    /* renamed from: a */
    private static adf m13512a(String str) {
        try {
            return (adf) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final <T> ade<T> mo14082a(Class<T> cls) {
        abg.m13322a(cls, "messageType");
        ade<T> ade = (ade) this.f10519c.get(cls);
        if (ade != null) {
            return ade;
        }
        ade<T> a = this.f10518b.mo14044a(cls);
        abg.m13322a(cls, "messageType");
        abg.m13322a(a, "schema");
        ade ade2 = (ade) this.f10519c.putIfAbsent(cls, a);
        return ade2 != null ? ade2 : a;
    }

    /* renamed from: a */
    public final <T> ade<T> mo14083a(T t) {
        return mo14082a(t.getClass());
    }
}
