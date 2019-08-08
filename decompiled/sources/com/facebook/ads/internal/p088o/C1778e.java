package com.facebook.ads.internal.p088o;

import com.facebook.ads.internal.p088o.C1777d;
import com.facebook.ads.internal.p088o.C1779f;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* renamed from: com.facebook.ads.internal.o.e */
public class C1778e<T extends C1779f, E extends C1777d> {

    /* renamed from: a */
    private final Map<Class<E>, List<WeakReference<T>>> f5575a = new HashMap();

    /* renamed from: b */
    private final Queue<E> f5576b = new ArrayDeque();

    /* renamed from: a */
    private void m7369a(List<WeakReference<T>> list) {
        if (list != null) {
            int i = 0;
            for (int i2 = 0; i2 < list.size(); i2++) {
                WeakReference weakReference = (WeakReference) list.get(i2);
                if (weakReference.get() != null) {
                    int i3 = i + 1;
                    list.set(i, weakReference);
                    i = i3;
                }
            }
            for (int size = list.size() - 1; size >= i; size--) {
                list.remove(size);
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo7625a(E e) {
        if (this.f5576b.isEmpty()) {
            this.f5576b.add(e);
            while (!this.f5576b.isEmpty()) {
                C1777d dVar = (C1777d) this.f5576b.peek();
                if (this.f5575a != null) {
                    List list = (List) this.f5575a.get(dVar.getClass());
                    if (list != null) {
                        m7369a(list);
                        if (!list.isEmpty()) {
                            for (WeakReference weakReference : new ArrayList(list)) {
                                C1779f fVar = (C1779f) weakReference.get();
                                if (fVar != null && fVar.mo7630b(dVar)) {
                                    fVar.mo6895a(dVar);
                                }
                            }
                        }
                    }
                }
                this.f5576b.remove();
            }
        } else {
            this.f5576b.add(e);
        }
    }

    /* renamed from: a */
    public synchronized void mo7626a(T... tArr) {
        if (tArr != null) {
            for (T a : tArr) {
                mo7627a(a);
            }
        }
    }

    /* renamed from: a */
    public synchronized boolean mo7627a(T t) {
        if (t == null) {
            return false;
        }
        Class a = t.mo7260a();
        if (this.f5575a.get(a) == null) {
            this.f5575a.put(a, new ArrayList());
        }
        List list = (List) this.f5575a.get(a);
        m7369a(list);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((WeakReference) list.get(i)).get() == t) {
                return false;
            }
        }
        return list.add(new WeakReference(t));
    }

    /* renamed from: b */
    public synchronized void mo7628b(T... tArr) {
        if (tArr != null) {
            for (T b : tArr) {
                mo7629b(b);
            }
        }
    }

    /* renamed from: b */
    public synchronized boolean mo7629b(T t) {
        if (t == null) {
            return false;
        }
        List list = (List) this.f5575a.get(t.mo7260a());
        if (list == null) {
            return false;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((WeakReference) list.get(i)).get() == t) {
                ((WeakReference) list.get(i)).clear();
                return true;
            }
        }
        return false;
    }
}
