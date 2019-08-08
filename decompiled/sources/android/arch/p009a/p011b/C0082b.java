package android.arch.p009a.p011b;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.WeakHashMap;

/* renamed from: android.arch.a.b.b */
/* compiled from: SafeIterableMap */
public class C0082b<K, V> implements Iterable<Entry<K, V>> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C0086c<K, V> f40a;

    /* renamed from: b */
    private C0086c<K, V> f41b;

    /* renamed from: c */
    private WeakHashMap<C0089f<K, V>, Boolean> f42c = new WeakHashMap<>();

    /* renamed from: d */
    private int f43d = 0;

    /* renamed from: android.arch.a.b.b$a */
    /* compiled from: SafeIterableMap */
    static class C0084a<K, V> extends C0088e<K, V> {
        C0084a(C0086c<K, V> cVar, C0086c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C0086c<K, V> mo94a(C0086c<K, V> cVar) {
            return cVar.f46c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C0086c<K, V> mo95b(C0086c<K, V> cVar) {
            return cVar.f47d;
        }
    }

    /* renamed from: android.arch.a.b.b$b */
    /* compiled from: SafeIterableMap */
    private static class C0085b<K, V> extends C0088e<K, V> {
        C0085b(C0086c<K, V> cVar, C0086c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C0086c<K, V> mo94a(C0086c<K, V> cVar) {
            return cVar.f47d;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C0086c<K, V> mo95b(C0086c<K, V> cVar) {
            return cVar.f46c;
        }
    }

    /* renamed from: android.arch.a.b.b$c */
    /* compiled from: SafeIterableMap */
    static class C0086c<K, V> implements Entry<K, V> {

        /* renamed from: a */
        final K f44a;

        /* renamed from: b */
        final V f45b;

        /* renamed from: c */
        C0086c<K, V> f46c;

        /* renamed from: d */
        C0086c<K, V> f47d;

        C0086c(K k, V v) {
            this.f44a = k;
            this.f45b = v;
        }

        public K getKey() {
            return this.f44a;
        }

        public V getValue() {
            return this.f45b;
        }

        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f44a);
            sb.append("=");
            sb.append(this.f45b);
            return sb.toString();
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0086c)) {
                return false;
            }
            C0086c cVar = (C0086c) obj;
            if (!this.f44a.equals(cVar.f44a) || !this.f45b.equals(cVar.f45b)) {
                z = false;
            }
            return z;
        }
    }

    /* renamed from: android.arch.a.b.b$d */
    /* compiled from: SafeIterableMap */
    private class C0087d implements C0089f<K, V>, Iterator<Entry<K, V>> {

        /* renamed from: b */
        private C0086c<K, V> f49b;

        /* renamed from: c */
        private boolean f50c;

        private C0087d() {
            this.f50c = true;
        }

        /* renamed from: a_ */
        public void mo102a_(C0086c<K, V> cVar) {
            if (cVar == this.f49b) {
                this.f49b = this.f49b.f47d;
                this.f50c = this.f49b == null;
            }
        }

        public boolean hasNext() {
            boolean z = false;
            if (this.f50c) {
                if (C0082b.this.f40a != null) {
                    z = true;
                }
                return z;
            }
            if (!(this.f49b == null || this.f49b.f46c == null)) {
                z = true;
            }
            return z;
        }

        /* renamed from: a */
        public Entry<K, V> next() {
            if (this.f50c) {
                this.f50c = false;
                this.f49b = C0082b.this.f40a;
            } else {
                this.f49b = this.f49b != null ? this.f49b.f46c : null;
            }
            return this.f49b;
        }
    }

    /* renamed from: android.arch.a.b.b$e */
    /* compiled from: SafeIterableMap */
    private static abstract class C0088e<K, V> implements C0089f<K, V>, Iterator<Entry<K, V>> {

        /* renamed from: a */
        C0086c<K, V> f51a;

        /* renamed from: b */
        C0086c<K, V> f52b;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract C0086c<K, V> mo94a(C0086c<K, V> cVar);

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public abstract C0086c<K, V> mo95b(C0086c<K, V> cVar);

        C0088e(C0086c<K, V> cVar, C0086c<K, V> cVar2) {
            this.f51a = cVar2;
            this.f52b = cVar;
        }

        public boolean hasNext() {
            return this.f52b != null;
        }

        /* renamed from: a_ */
        public void mo102a_(C0086c<K, V> cVar) {
            if (this.f51a == cVar && cVar == this.f52b) {
                this.f52b = null;
                this.f51a = null;
            }
            if (this.f51a == cVar) {
                this.f51a = mo95b(this.f51a);
            }
            if (this.f52b == cVar) {
                this.f52b = m99b();
            }
        }

        /* renamed from: b */
        private C0086c<K, V> m99b() {
            if (this.f52b == this.f51a || this.f51a == null) {
                return null;
            }
            return mo94a(this.f52b);
        }

        /* renamed from: a */
        public Entry<K, V> next() {
            C0086c<K, V> cVar = this.f52b;
            this.f52b = m99b();
            return cVar;
        }
    }

    /* renamed from: android.arch.a.b.b$f */
    /* compiled from: SafeIterableMap */
    interface C0089f<K, V> {
        /* renamed from: a_ */
        void mo102a_(C0086c<K, V> cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0086c<K, V> mo80a(K k) {
        C0086c<K, V> cVar = this.f40a;
        while (cVar != null && !cVar.f44a.equals(k)) {
            cVar = cVar.f46c;
        }
        return cVar;
    }

    /* renamed from: a */
    public V mo81a(K k, V v) {
        C0086c a = mo80a(k);
        if (a != null) {
            return a.f45b;
        }
        mo86b(k, v);
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C0086c<K, V> mo86b(K k, V v) {
        C0086c<K, V> cVar = new C0086c<>(k, v);
        this.f43d++;
        if (this.f41b == null) {
            this.f40a = cVar;
            this.f41b = this.f40a;
            return cVar;
        }
        this.f41b.f46c = cVar;
        cVar.f47d = this.f41b;
        this.f41b = cVar;
        return cVar;
    }

    /* renamed from: b */
    public V mo82b(K k) {
        C0086c a = mo80a(k);
        if (a == null) {
            return null;
        }
        this.f43d--;
        if (!this.f42c.isEmpty()) {
            for (C0089f a_ : this.f42c.keySet()) {
                a_.mo102a_(a);
            }
        }
        if (a.f47d != null) {
            a.f47d.f46c = a.f46c;
        } else {
            this.f40a = a.f46c;
        }
        if (a.f46c != null) {
            a.f46c.f47d = a.f47d;
        } else {
            this.f41b = a.f47d;
        }
        a.f46c = null;
        a.f47d = null;
        return a.f45b;
    }

    /* renamed from: a */
    public int mo85a() {
        return this.f43d;
    }

    public Iterator<Entry<K, V>> iterator() {
        C0084a aVar = new C0084a(this.f40a, this.f41b);
        this.f42c.put(aVar, Boolean.valueOf(false));
        return aVar;
    }

    /* renamed from: b */
    public Iterator<Entry<K, V>> mo87b() {
        C0085b bVar = new C0085b(this.f41b, this.f40a);
        this.f42c.put(bVar, Boolean.valueOf(false));
        return bVar;
    }

    /* renamed from: c */
    public C0087d mo88c() {
        C0087d dVar = new C0087d<>();
        this.f42c.put(dVar, Boolean.valueOf(false));
        return dVar;
    }

    /* renamed from: d */
    public Entry<K, V> mo89d() {
        return this.f40a;
    }

    /* renamed from: e */
    public Entry<K, V> mo90e() {
        return this.f41b;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0082b)) {
            return false;
        }
        C0082b bVar = (C0082b) obj;
        if (mo85a() != bVar.mo85a()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Entry entry = (Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        if (it.hasNext() || it2.hasNext()) {
            z = false;
        }
        return z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
