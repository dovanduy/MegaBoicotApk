package android.support.p017v4.p023d;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: android.support.v4.d.h */
/* compiled from: MapCollections */
abstract class C0385h<K, V> {

    /* renamed from: b */
    C0387b f978b;

    /* renamed from: c */
    C0388c f979c;

    /* renamed from: d */
    C0390e f980d;

    /* renamed from: android.support.v4.d.h$a */
    /* compiled from: MapCollections */
    final class C0386a<T> implements Iterator<T> {

        /* renamed from: a */
        final int f981a;

        /* renamed from: b */
        int f982b;

        /* renamed from: c */
        int f983c;

        /* renamed from: d */
        boolean f984d = false;

        C0386a(int i) {
            this.f981a = i;
            this.f982b = C0385h.this.mo1273a();
        }

        public boolean hasNext() {
            return this.f983c < this.f982b;
        }

        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T a = C0385h.this.mo1275a(this.f983c, this.f981a);
            this.f983c++;
            this.f984d = true;
            return a;
        }

        public void remove() {
            if (!this.f984d) {
                throw new IllegalStateException();
            }
            this.f983c--;
            this.f982b--;
            this.f984d = false;
            C0385h.this.mo1277a(this.f983c);
        }
    }

    /* renamed from: android.support.v4.d.h$b */
    /* compiled from: MapCollections */
    final class C0387b implements Set<Entry<K, V>> {
        C0387b() {
        }

        /* renamed from: a */
        public boolean add(Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends Entry<K, V>> collection) {
            int a = C0385h.this.mo1273a();
            for (Entry entry : collection) {
                C0385h.this.mo1278a(entry.getKey(), entry.getValue());
            }
            return a != C0385h.this.mo1273a();
        }

        public void clear() {
            C0385h.this.mo1281c();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            int a = C0385h.this.mo1274a(entry.getKey());
            if (a < 0) {
                return false;
            }
            return C0380c.m1414a(C0385h.this.mo1275a(a, 1), entry.getValue());
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return C0385h.this.mo1273a() == 0;
        }

        public Iterator<Entry<K, V>> iterator() {
            return new C0389d();
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return C0385h.this.mo1273a();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }

        public boolean equals(Object obj) {
            return C0385h.m1440a((Set<T>) this, obj);
        }

        public int hashCode() {
            int i;
            int i2;
            int i3 = 0;
            for (int a = C0385h.this.mo1273a() - 1; a >= 0; a--) {
                Object a2 = C0385h.this.mo1275a(a, 0);
                Object a3 = C0385h.this.mo1275a(a, 1);
                if (a2 == null) {
                    i = 0;
                } else {
                    i = a2.hashCode();
                }
                if (a3 == null) {
                    i2 = 0;
                } else {
                    i2 = a3.hashCode();
                }
                i3 += i ^ i2;
            }
            return i3;
        }
    }

    /* renamed from: android.support.v4.d.h$c */
    /* compiled from: MapCollections */
    final class C0388c implements Set<K> {
        C0388c() {
        }

        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C0385h.this.mo1281c();
        }

        public boolean contains(Object obj) {
            return C0385h.this.mo1274a(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            return C0385h.m1439a(C0385h.this.mo1280b(), collection);
        }

        public boolean isEmpty() {
            return C0385h.this.mo1273a() == 0;
        }

        public Iterator<K> iterator() {
            return new C0386a(0);
        }

        public boolean remove(Object obj) {
            int a = C0385h.this.mo1274a(obj);
            if (a < 0) {
                return false;
            }
            C0385h.this.mo1277a(a);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            return C0385h.m1441b(C0385h.this.mo1280b(), collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return C0385h.m1442c(C0385h.this.mo1280b(), collection);
        }

        public int size() {
            return C0385h.this.mo1273a();
        }

        public Object[] toArray() {
            return C0385h.this.mo1327b(0);
        }

        public <T> T[] toArray(T[] tArr) {
            return C0385h.this.mo1326a(tArr, 0);
        }

        public boolean equals(Object obj) {
            return C0385h.m1440a((Set<T>) this, obj);
        }

        public int hashCode() {
            int i;
            int i2 = 0;
            for (int a = C0385h.this.mo1273a() - 1; a >= 0; a--) {
                Object a2 = C0385h.this.mo1275a(a, 0);
                if (a2 == null) {
                    i = 0;
                } else {
                    i = a2.hashCode();
                }
                i2 += i;
            }
            return i2;
        }
    }

    /* renamed from: android.support.v4.d.h$d */
    /* compiled from: MapCollections */
    final class C0389d implements Iterator<Entry<K, V>>, Entry<K, V> {

        /* renamed from: a */
        int f988a;

        /* renamed from: b */
        int f989b;

        /* renamed from: c */
        boolean f990c = false;

        C0389d() {
            this.f988a = C0385h.this.mo1273a() - 1;
            this.f989b = -1;
        }

        public boolean hasNext() {
            return this.f989b < this.f988a;
        }

        /* renamed from: a */
        public Entry<K, V> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f989b++;
            this.f990c = true;
            return this;
        }

        public void remove() {
            if (!this.f990c) {
                throw new IllegalStateException();
            }
            C0385h.this.mo1277a(this.f989b);
            this.f989b--;
            this.f988a--;
            this.f990c = false;
        }

        public K getKey() {
            if (this.f990c) {
                return C0385h.this.mo1275a(this.f989b, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V getValue() {
            if (this.f990c) {
                return C0385h.this.mo1275a(this.f989b, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V setValue(V v) {
            if (this.f990c) {
                return C0385h.this.mo1276a(this.f989b, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean equals(Object obj) {
            if (!this.f990c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            boolean z = false;
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            if (C0380c.m1414a(entry.getKey(), C0385h.this.mo1275a(this.f989b, 0)) && C0380c.m1414a(entry.getValue(), C0385h.this.mo1275a(this.f989b, 1))) {
                z = true;
            }
            return z;
        }

        public int hashCode() {
            int i;
            if (!this.f990c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            int i2 = 0;
            Object a = C0385h.this.mo1275a(this.f989b, 0);
            Object a2 = C0385h.this.mo1275a(this.f989b, 1);
            if (a == null) {
                i = 0;
            } else {
                i = a.hashCode();
            }
            if (a2 != null) {
                i2 = a2.hashCode();
            }
            return i ^ i2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append("=");
            sb.append(getValue());
            return sb.toString();
        }
    }

    /* renamed from: android.support.v4.d.h$e */
    /* compiled from: MapCollections */
    final class C0390e implements Collection<V> {
        C0390e() {
        }

        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C0385h.this.mo1281c();
        }

        public boolean contains(Object obj) {
            return C0385h.this.mo1279b(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return C0385h.this.mo1273a() == 0;
        }

        public Iterator<V> iterator() {
            return new C0386a(1);
        }

        public boolean remove(Object obj) {
            int b = C0385h.this.mo1279b(obj);
            if (b < 0) {
                return false;
            }
            C0385h.this.mo1277a(b);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            int a = C0385h.this.mo1273a();
            int i = 0;
            boolean z = false;
            while (i < a) {
                if (collection.contains(C0385h.this.mo1275a(i, 1))) {
                    C0385h.this.mo1277a(i);
                    i--;
                    a--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public boolean retainAll(Collection<?> collection) {
            int a = C0385h.this.mo1273a();
            int i = 0;
            boolean z = false;
            while (i < a) {
                if (!collection.contains(C0385h.this.mo1275a(i, 1))) {
                    C0385h.this.mo1277a(i);
                    i--;
                    a--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public int size() {
            return C0385h.this.mo1273a();
        }

        public Object[] toArray() {
            return C0385h.this.mo1327b(1);
        }

        public <T> T[] toArray(T[] tArr) {
            return C0385h.this.mo1326a(tArr, 1);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo1273a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo1274a(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo1275a(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract V mo1276a(int i, V v);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo1277a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo1278a(K k, V v);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo1279b(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Map<K, V> mo1280b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo1281c();

    C0385h() {
    }

    /* renamed from: a */
    public static <K, V> boolean m1439a(Map<K, V> map, Collection<?> collection) {
        for (Object containsKey : collection) {
            if (!map.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static <K, V> boolean m1441b(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        for (Object remove : collection) {
            map.remove(remove);
        }
        return size != map.size();
    }

    /* renamed from: c */
    public static <K, V> boolean m1442c(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* renamed from: b */
    public Object[] mo1327b(int i) {
        int a = mo1273a();
        Object[] objArr = new Object[a];
        for (int i2 = 0; i2 < a; i2++) {
            objArr[i2] = mo1275a(i2, i);
        }
        return objArr;
    }

    /* renamed from: a */
    public <T> T[] mo1326a(T[] tArr, int i) {
        int a = mo1273a();
        if (tArr.length < a) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), a);
        }
        for (int i2 = 0; i2 < a; i2++) {
            tArr[i2] = mo1275a(i2, i);
        }
        if (tArr.length > a) {
            tArr[a] = null;
        }
        return tArr;
    }

    /* renamed from: a */
    public static <T> boolean m1440a(Set<T> set, Object obj) {
        boolean z = true;
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() != set2.size() || !set.containsAll(set2)) {
                z = false;
            }
            return z;
        } catch (NullPointerException unused) {
            return false;
        } catch (ClassCastException unused2) {
            return false;
        }
    }

    /* renamed from: d */
    public Set<Entry<K, V>> mo1328d() {
        if (this.f978b == null) {
            this.f978b = new C0387b<>();
        }
        return this.f978b;
    }

    /* renamed from: e */
    public Set<K> mo1329e() {
        if (this.f979c == null) {
            this.f979c = new C0388c<>();
        }
        return this.f979c;
    }

    /* renamed from: f */
    public Collection<V> mo1330f() {
        if (this.f980d == null) {
            this.f980d = new C0390e<>();
        }
        return this.f980d;
    }
}
