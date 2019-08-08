package com.google.android.gms.internal.p148e;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.e.ew */
class C4574ew<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a */
    private final int f14947a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public List<C4587fd> f14948b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Map<K, V> f14949c;

    /* renamed from: d */
    private boolean f14950d;

    /* renamed from: e */
    private volatile C4589ff f14951e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Map<K, V> f14952f;

    /* renamed from: g */
    private volatile C4577ez f14953g;

    /* renamed from: a */
    static <FieldDescriptorType extends C4506cn<FieldDescriptorType>> C4574ew<FieldDescriptorType, Object> m19737a(int i) {
        return new C4575ex(i);
    }

    private C4574ew(int i) {
        this.f14947a = i;
        this.f14948b = Collections.emptyList();
        this.f14949c = Collections.emptyMap();
        this.f14952f = Collections.emptyMap();
    }

    /* renamed from: a */
    public void mo16702a() {
        Map<K, V> map;
        Map<K, V> map2;
        if (!this.f14950d) {
            if (this.f14949c.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f14949c);
            }
            this.f14949c = map;
            if (this.f14952f.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f14952f);
            }
            this.f14952f = map2;
            this.f14950d = true;
        }
    }

    /* renamed from: b */
    public final boolean mo16704b() {
        return this.f14950d;
    }

    /* renamed from: c */
    public final int mo16705c() {
        return this.f14948b.size();
    }

    /* renamed from: b */
    public final Entry<K, V> mo16703b(int i) {
        return (Entry) this.f14948b.get(i);
    }

    /* renamed from: d */
    public final Iterable<Entry<K, V>> mo16708d() {
        if (this.f14949c.isEmpty()) {
            return C4584fa.m19774a();
        }
        return this.f14949c.entrySet();
    }

    public int size() {
        return this.f14948b.size() + this.f14949c.size();
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m19736a((K) comparable) >= 0 || this.f14949c.containsKey(comparable);
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = m19736a((K) comparable);
        if (a >= 0) {
            return ((C4587fd) this.f14948b.get(a)).getValue();
        }
        return this.f14949c.get(comparable);
    }

    /* renamed from: a */
    public final V put(K k, V v) {
        m19744f();
        int a = m19736a(k);
        if (a >= 0) {
            return ((C4587fd) this.f14948b.get(a)).setValue(v);
        }
        m19744f();
        if (this.f14948b.isEmpty() && !(this.f14948b instanceof ArrayList)) {
            this.f14948b = new ArrayList(this.f14947a);
        }
        int i = -(a + 1);
        if (i >= this.f14947a) {
            return m19745g().put(k, v);
        }
        if (this.f14948b.size() == this.f14947a) {
            C4587fd fdVar = (C4587fd) this.f14948b.remove(this.f14947a - 1);
            m19745g().put((Comparable) fdVar.getKey(), fdVar.getValue());
        }
        this.f14948b.add(i, new C4587fd(this, k, v));
        return null;
    }

    public void clear() {
        m19744f();
        if (!this.f14948b.isEmpty()) {
            this.f14948b.clear();
        }
        if (!this.f14949c.isEmpty()) {
            this.f14949c.clear();
        }
    }

    public V remove(Object obj) {
        m19744f();
        Comparable comparable = (Comparable) obj;
        int a = m19736a((K) comparable);
        if (a >= 0) {
            return m19741c(a);
        }
        if (this.f14949c.isEmpty()) {
            return null;
        }
        return this.f14949c.remove(comparable);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final V m19741c(int i) {
        m19744f();
        V value = ((C4587fd) this.f14948b.remove(i)).getValue();
        if (!this.f14949c.isEmpty()) {
            Iterator it = m19745g().entrySet().iterator();
            this.f14948b.add(new C4587fd(this, (Entry) it.next()));
            it.remove();
        }
        return value;
    }

    /* renamed from: a */
    private final int m19736a(K k) {
        int size = this.f14948b.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo((Comparable) ((C4587fd) this.f14948b.get(size)).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo((Comparable) ((C4587fd) this.f14948b.get(i2)).getKey());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    public Set<Entry<K, V>> entrySet() {
        if (this.f14951e == null) {
            this.f14951e = new C4589ff(this, null);
        }
        return this.f14951e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final Set<Entry<K, V>> mo16709e() {
        if (this.f14953g == null) {
            this.f14953g = new C4577ez(this, null);
        }
        return this.f14953g;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final void m19744f() {
        if (this.f14950d) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: g */
    private final SortedMap<K, V> m19745g() {
        m19744f();
        if (this.f14949c.isEmpty() && !(this.f14949c instanceof TreeMap)) {
            this.f14949c = new TreeMap();
            this.f14952f = ((TreeMap) this.f14949c).descendingMap();
        }
        return (SortedMap) this.f14949c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4574ew)) {
            return super.equals(obj);
        }
        C4574ew ewVar = (C4574ew) obj;
        int size = size();
        if (size != ewVar.size()) {
            return false;
        }
        int c = mo16705c();
        if (c != ewVar.mo16705c()) {
            return entrySet().equals(ewVar.entrySet());
        }
        for (int i = 0; i < c; i++) {
            if (!mo16703b(i).equals(ewVar.mo16703b(i))) {
                return false;
            }
        }
        if (c != size) {
            return this.f14949c.equals(ewVar.f14949c);
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        for (int i2 = 0; i2 < mo16705c(); i2++) {
            i += ((C4587fd) this.f14948b.get(i2)).hashCode();
        }
        return this.f14949c.size() > 0 ? i + this.f14949c.hashCode() : i;
    }

    /* synthetic */ C4574ew(int i, C4575ex exVar) {
        this(i);
    }
}
