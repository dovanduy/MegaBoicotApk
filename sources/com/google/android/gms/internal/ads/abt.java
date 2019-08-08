package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class abt extends C4380zq<String> implements abu, RandomAccess {

    /* renamed from: a */
    private static final abt f10466a;

    /* renamed from: b */
    private static final abu f10467b = f10466a;

    /* renamed from: c */
    private final List<Object> f10468c;

    static {
        abt abt = new abt();
        f10466a = abt;
        abt.mo14007b();
    }

    public abt() {
        this(10);
    }

    public abt(int i) {
        this(new ArrayList<>(i));
    }

    private abt(ArrayList<Object> arrayList) {
        this.f10468c = arrayList;
    }

    /* renamed from: a */
    private static String m13351a(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof C4386zw ? ((C4386zw) obj).mo16235c() : abg.m13325b((byte[]) obj);
    }

    /* renamed from: a */
    public final /* synthetic */ abj mo13924a(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.f10468c);
        return new abt(arrayList);
    }

    /* renamed from: a */
    public final void mo14023a(C4386zw zwVar) {
        mo16229c();
        this.f10468c.add(zwVar);
        this.modCount++;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo14006a() {
        return super.mo14006a();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        String str = (String) obj;
        mo16229c();
        this.f10468c.add(i, str);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        mo16229c();
        if (collection instanceof abu) {
            collection = ((abu) collection).mo14027d();
        }
        boolean addAll = this.f10468c.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    /* renamed from: b */
    public final Object mo14025b(int i) {
        return this.f10468c.get(i);
    }

    public final void clear() {
        mo16229c();
        this.f10468c.clear();
        this.modCount++;
    }

    /* renamed from: d */
    public final List<?> mo14027d() {
        return Collections.unmodifiableList(this.f10468c);
    }

    /* renamed from: e */
    public final abu mo14028e() {
        return mo14006a() ? new aea(this) : this;
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final /* synthetic */ Object get(int i) {
        Object obj = this.f10468c.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C4386zw) {
            C4386zw zwVar = (C4386zw) obj;
            String c = zwVar.mo16235c();
            if (zwVar.mo13775d()) {
                this.f10468c.set(i, c);
            }
            return c;
        }
        byte[] bArr = (byte[]) obj;
        String b = abg.m13325b(bArr);
        if (abg.m13324a(bArr)) {
            this.f10468c.set(i, b);
        }
        return b;
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public final /* synthetic */ Object remove(int i) {
        mo16229c();
        Object remove = this.f10468c.remove(i);
        this.modCount++;
        return m13351a(remove);
    }

    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        String str = (String) obj;
        mo16229c();
        return m13351a(this.f10468c.set(i, str));
    }

    public final int size() {
        return this.f10468c.size();
    }
}
