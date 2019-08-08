package android.arch.p009a.p011b;

import java.util.HashMap;
import java.util.Map.Entry;

/* renamed from: android.arch.a.b.a */
/* compiled from: FastSafeIterableMap */
public class C0081a<K, V> extends C0082b<K, V> {

    /* renamed from: a */
    private HashMap<K, C0086c<K, V>> f39a = new HashMap<>();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0086c<K, V> mo80a(K k) {
        return (C0086c) this.f39a.get(k);
    }

    /* renamed from: a */
    public V mo81a(K k, V v) {
        C0086c a = mo80a(k);
        if (a != null) {
            return a.f45b;
        }
        this.f39a.put(k, mo86b(k, v));
        return null;
    }

    /* renamed from: b */
    public V mo82b(K k) {
        V b = super.mo82b(k);
        this.f39a.remove(k);
        return b;
    }

    /* renamed from: c */
    public boolean mo83c(K k) {
        return this.f39a.containsKey(k);
    }

    /* renamed from: d */
    public Entry<K, V> mo84d(K k) {
        if (mo83c(k)) {
            return ((C0086c) this.f39a.get(k)).f47d;
        }
        return null;
    }
}
