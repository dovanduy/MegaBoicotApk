package android.support.p017v4.p023d;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: android.support.v4.d.a */
/* compiled from: ArrayMap */
public class C0376a<K, V> extends C0398m<K, V> implements Map<K, V> {

    /* renamed from: a */
    C0385h<K, V> f947a;

    public C0376a() {
    }

    public C0376a(int i) {
        super(i);
    }

    /* renamed from: b */
    private C0385h<K, V> m1382b() {
        if (this.f947a == null) {
            this.f947a = new C0385h<K, V>() {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public int mo1273a() {
                    return C0376a.this.f1004h;
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public Object mo1275a(int i, int i2) {
                    return C0376a.this.f1003g[(i << 1) + i2];
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public int mo1274a(Object obj) {
                    return C0376a.this.mo1394a(obj);
                }

                /* access modifiers changed from: protected */
                /* renamed from: b */
                public int mo1279b(Object obj) {
                    return C0376a.this.mo1398b(obj);
                }

                /* access modifiers changed from: protected */
                /* renamed from: b */
                public Map<K, V> mo1280b() {
                    return C0376a.this;
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public void mo1278a(K k, V v) {
                    C0376a.this.put(k, v);
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public V mo1276a(int i, V v) {
                    return C0376a.this.mo1396a(i, v);
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public void mo1277a(int i) {
                    C0376a.this.mo1404d(i);
                }

                /* access modifiers changed from: protected */
                /* renamed from: c */
                public void mo1281c() {
                    C0376a.this.clear();
                }
            };
        }
        return this.f947a;
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        mo1397a(this.f1004h + map.size());
        for (Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: a */
    public boolean mo1268a(Collection<?> collection) {
        return C0385h.m1442c(this, collection);
    }

    public Set<Entry<K, V>> entrySet() {
        return m1382b().mo1328d();
    }

    public Set<K> keySet() {
        return m1382b().mo1329e();
    }

    public Collection<V> values() {
        return m1382b().mo1330f();
    }
}
