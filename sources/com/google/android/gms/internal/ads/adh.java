package com.google.android.gms.internal.ads;

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

class adh<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a */
    private final int f10563a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public List<ado> f10564b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Map<K, V> f10565c;

    /* renamed from: d */
    private boolean f10566d;

    /* renamed from: e */
    private volatile adq f10567e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Map<K, V> f10568f;

    /* renamed from: g */
    private volatile adk f10569g;

    private adh(int i) {
        this.f10563a = i;
        this.f10564b = Collections.emptyList();
        this.f10565c = Collections.emptyMap();
        this.f10568f = Collections.emptyMap();
    }

    /* synthetic */ adh(int i, adi adi) {
        this(i);
    }

    /* renamed from: a */
    private final int m13669a(K k) {
        int size = this.f10564b.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo((Comparable) ((ado) this.f10564b.get(size)).getKey());
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
            int compareTo2 = k.compareTo((Comparable) ((ado) this.f10564b.get(i2)).getKey());
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

    /* renamed from: a */
    static <FieldDescriptorType extends aay<FieldDescriptorType>> adh<FieldDescriptorType, Object> m13670a(int i) {
        return new adi(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final V m13674c(int i) {
        m13677f();
        V value = ((ado) this.f10564b.remove(i)).getValue();
        if (!this.f10565c.isEmpty()) {
            Iterator it = m13678g().entrySet().iterator();
            this.f10564b.add(new ado(this, (Entry) it.next()));
            it.remove();
        }
        return value;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final void m13677f() {
        if (this.f10566d) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: g */
    private final SortedMap<K, V> m13678g() {
        m13677f();
        if (this.f10565c.isEmpty() && !(this.f10565c instanceof TreeMap)) {
            this.f10565c = new TreeMap();
            this.f10568f = ((TreeMap) this.f10565c).descendingMap();
        }
        return (SortedMap) this.f10565c;
    }

    /* renamed from: a */
    public final V put(K k, V v) {
        m13677f();
        int a = m13669a(k);
        if (a >= 0) {
            return ((ado) this.f10564b.get(a)).setValue(v);
        }
        m13677f();
        if (this.f10564b.isEmpty() && !(this.f10564b instanceof ArrayList)) {
            this.f10564b = new ArrayList(this.f10563a);
        }
        int i = -(a + 1);
        if (i >= this.f10563a) {
            return m13678g().put(k, v);
        }
        if (this.f10564b.size() == this.f10563a) {
            ado ado = (ado) this.f10564b.remove(this.f10563a - 1);
            m13678g().put((Comparable) ado.getKey(), ado.getValue());
        }
        this.f10564b.add(i, new ado(this, k, v));
        return null;
    }

    /* renamed from: a */
    public void mo14113a() {
        if (!this.f10566d) {
            this.f10565c = this.f10565c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f10565c);
            this.f10568f = this.f10568f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f10568f);
            this.f10566d = true;
        }
    }

    /* renamed from: b */
    public final Entry<K, V> mo14114b(int i) {
        return (Entry) this.f10564b.get(i);
    }

    /* renamed from: b */
    public final boolean mo14115b() {
        return this.f10566d;
    }

    /* renamed from: c */
    public final int mo14116c() {
        return this.f10564b.size();
    }

    public void clear() {
        m13677f();
        if (!this.f10564b.isEmpty()) {
            this.f10564b.clear();
        }
        if (!this.f10565c.isEmpty()) {
            this.f10565c.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m13669a((K) comparable) >= 0 || this.f10565c.containsKey(comparable);
    }

    /* renamed from: d */
    public final Iterable<Entry<K, V>> mo14119d() {
        return this.f10565c.isEmpty() ? adl.m13688a() : this.f10565c.entrySet();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final Set<Entry<K, V>> mo14120e() {
        if (this.f10569g == null) {
            this.f10569g = new adk(this, null);
        }
        return this.f10569g;
    }

    public Set<Entry<K, V>> entrySet() {
        if (this.f10567e == null) {
            this.f10567e = new adq(this, null);
        }
        return this.f10567e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof adh)) {
            return super.equals(obj);
        }
        adh adh = (adh) obj;
        int size = size();
        if (size != adh.size()) {
            return false;
        }
        int c = mo14116c();
        if (c != adh.mo14116c()) {
            return entrySet().equals(adh.entrySet());
        }
        for (int i = 0; i < c; i++) {
            if (!mo14114b(i).equals(adh.mo14114b(i))) {
                return false;
            }
        }
        if (c != size) {
            return this.f10565c.equals(adh.f10565c);
        }
        return true;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = m13669a((K) comparable);
        return a >= 0 ? ((ado) this.f10564b.get(a)).getValue() : this.f10565c.get(comparable);
    }

    public int hashCode() {
        int i = 0;
        for (int i2 = 0; i2 < mo14116c(); i2++) {
            i += ((ado) this.f10564b.get(i2)).hashCode();
        }
        return this.f10565c.size() > 0 ? i + this.f10565c.hashCode() : i;
    }

    public V remove(Object obj) {
        m13677f();
        Comparable comparable = (Comparable) obj;
        int a = m13669a((K) comparable);
        if (a >= 0) {
            return m13674c(a);
        }
        if (this.f10565c.isEmpty()) {
            return null;
        }
        return this.f10565c.remove(comparable);
    }

    public int size() {
        return this.f10564b.size() + this.f10565c.size();
    }
}
