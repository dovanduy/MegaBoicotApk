package com.google.android.gms.internal.p148e;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.e.dk */
public final class C4535dk extends C4465bf<String> implements C4536dl, RandomAccess {

    /* renamed from: a */
    private static final C4535dk f14889a;

    /* renamed from: b */
    private static final C4536dl f14890b = f14889a;

    /* renamed from: c */
    private final List<Object> f14891c;

    public C4535dk() {
        this(10);
    }

    public C4535dk(int i) {
        this(new ArrayList<>(i));
    }

    private C4535dk(ArrayList<Object> arrayList) {
        this.f14891c = arrayList;
    }

    public final int size() {
        return this.f14891c.size();
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        mo16373c();
        if (collection instanceof C4536dl) {
            collection = ((C4536dl) collection).mo16649d();
        }
        boolean addAll = this.f14891c.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final void clear() {
        mo16373c();
        this.f14891c.clear();
        this.modCount++;
    }

    /* renamed from: a */
    public final void mo16647a(C4469bj bjVar) {
        mo16373c();
        this.f14891c.add(bjVar);
        this.modCount++;
    }

    /* renamed from: b */
    public final Object mo16648b(int i) {
        return this.f14891c.get(i);
    }

    /* renamed from: a */
    private static String m19475a(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C4469bj) {
            return ((C4469bj) obj).mo16395b();
        }
        return C4520cw.m19451b((byte[]) obj);
    }

    /* renamed from: d */
    public final List<?> mo16649d() {
        return Collections.unmodifiableList(this.f14891c);
    }

    /* renamed from: e */
    public final C4536dl mo16650e() {
        return mo16367a() ? new C4598fo(this) : this;
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        String str = (String) obj;
        mo16373c();
        return m19475a(this.f14891c.set(i, str));
    }

    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public final /* synthetic */ Object remove(int i) {
        mo16373c();
        Object remove = this.f14891c.remove(i);
        this.modCount++;
        return m19475a(remove);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo16367a() {
        return super.mo16367a();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        String str = (String) obj;
        mo16373c();
        this.f14891c.add(i, str);
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: a */
    public final /* synthetic */ C4525da mo16382a(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.f14891c);
        return new C4535dk(arrayList);
    }

    public final /* synthetic */ Object get(int i) {
        Object obj = this.f14891c.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C4469bj) {
            C4469bj bjVar = (C4469bj) obj;
            String b = bjVar.mo16395b();
            if (bjVar.mo16396c()) {
                this.f14891c.set(i, b);
            }
            return b;
        }
        byte[] bArr = (byte[]) obj;
        String b2 = C4520cw.m19451b(bArr);
        if (C4520cw.m19450a(bArr)) {
            this.f14891c.set(i, b2);
        }
        return b2;
    }

    static {
        C4535dk dkVar = new C4535dk();
        f14889a = dkVar;
        dkVar.mo16372b();
    }
}
