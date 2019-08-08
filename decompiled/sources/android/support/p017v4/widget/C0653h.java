package android.support.p017v4.widget;

import android.support.p017v4.p023d.C0393k.C0394a;
import android.support.p017v4.p023d.C0393k.C0395b;
import android.support.p017v4.p023d.C0398m;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: android.support.v4.widget.h */
/* compiled from: DirectedAcyclicGraph */
public final class C0653h<T> {

    /* renamed from: a */
    private final C0394a<ArrayList<T>> f1727a = new C0395b(10);

    /* renamed from: b */
    private final C0398m<T, ArrayList<T>> f1728b = new C0398m<>();

    /* renamed from: c */
    private final ArrayList<T> f1729c = new ArrayList<>();

    /* renamed from: d */
    private final HashSet<T> f1730d = new HashSet<>();

    /* renamed from: a */
    public void mo2525a(T t) {
        if (!this.f1728b.containsKey(t)) {
            this.f1728b.put(t, null);
        }
    }

    /* renamed from: b */
    public boolean mo2528b(T t) {
        return this.f1728b.containsKey(t);
    }

    /* renamed from: a */
    public void mo2526a(T t, T t2) {
        if (!this.f1728b.containsKey(t) || !this.f1728b.containsKey(t2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayList = (ArrayList) this.f1728b.get(t);
        if (arrayList == null) {
            arrayList = m2588c();
            this.f1728b.put(t, arrayList);
        }
        arrayList.add(t2);
    }

    /* renamed from: c */
    public boolean mo2529c(T t) {
        int size = this.f1728b.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = (ArrayList) this.f1728b.mo1400c(i);
            if (arrayList != null && arrayList.contains(t)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo2524a() {
        int size = this.f1728b.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = (ArrayList) this.f1728b.mo1400c(i);
            if (arrayList != null) {
                m2587a(arrayList);
            }
        }
        this.f1728b.clear();
    }

    /* renamed from: b */
    public ArrayList<T> mo2527b() {
        this.f1729c.clear();
        this.f1730d.clear();
        int size = this.f1728b.size();
        for (int i = 0; i < size; i++) {
            m2586a(this.f1728b.mo1399b(i), this.f1729c, this.f1730d);
        }
        return this.f1729c;
    }

    /* renamed from: a */
    private void m2586a(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t)) {
            if (hashSet.contains(t)) {
                throw new RuntimeException("This graph contains cyclic dependencies");
            }
            hashSet.add(t);
            ArrayList arrayList2 = (ArrayList) this.f1728b.get(t);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    m2586a(arrayList2.get(i), arrayList, hashSet);
                }
            }
            hashSet.remove(t);
            arrayList.add(t);
        }
    }

    /* renamed from: c */
    private ArrayList<T> m2588c() {
        ArrayList<T> arrayList = (ArrayList) this.f1727a.mo1391a();
        return arrayList == null ? new ArrayList<>() : arrayList;
    }

    /* renamed from: a */
    private void m2587a(ArrayList<T> arrayList) {
        arrayList.clear();
        this.f1727a.mo1392a(arrayList);
    }
}
