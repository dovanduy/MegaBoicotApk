package com.google.android.gms.internal.p148e;

import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.e.dh */
final class C4532dh<K> implements Entry<K, Object> {

    /* renamed from: a */
    private Entry<K, C4529de> f14883a;

    private C4532dh(Entry<K, C4529de> entry) {
        this.f14883a = entry;
    }

    public final K getKey() {
        return this.f14883a.getKey();
    }

    public final Object getValue() {
        if (((C4529de) this.f14883a.getValue()) == null) {
            return null;
        }
        return C4529de.m19468a();
    }

    /* renamed from: a */
    public final C4529de mo16637a() {
        return (C4529de) this.f14883a.getValue();
    }

    public final Object setValue(Object obj) {
        if (obj instanceof C4554ec) {
            return ((C4529de) this.f14883a.getValue()).mo16644a((C4554ec) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
