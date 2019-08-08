package com.google.android.gms.internal.ads;

import java.util.Map.Entry;

final class abp<K> implements Entry<K, Object> {

    /* renamed from: a */
    private Entry<K, abn> f10455a;

    private abp(Entry<K, abn> entry) {
        this.f10455a = entry;
    }

    /* renamed from: a */
    public final abn mo14013a() {
        return (abn) this.f10455a.getValue();
    }

    public final K getKey() {
        return this.f10455a.getKey();
    }

    public final Object getValue() {
        if (((abn) this.f10455a.getValue()) == null) {
            return null;
        }
        return abn.m13342a();
    }

    public final Object setValue(Object obj) {
        if (obj instanceof acl) {
            return ((abn) this.f10455a.getValue()).mo14020a((acl) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
