package com.google.firebase.components;

import com.google.android.gms.common.internal.C3513t;
import com.google.firebase.p149a.C4918a;
import com.google.firebase.p149a.C4919b;
import com.google.firebase.p149a.C4920c;
import com.google.firebase.p149a.C4921d;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.components.o */
/* compiled from: com.google.firebase:firebase-common@@16.0.2 */
class C4953o implements C4920c, C4921d {

    /* renamed from: a */
    private final Map<Class<?>, ConcurrentHashMap<C4919b<Object>, Executor>> f16135a = new HashMap();

    /* renamed from: b */
    private Queue<C4918a<?>> f16136b = new ArrayDeque();

    /* renamed from: c */
    private final Executor f16137c;

    C4953o(Executor executor) {
        this.f16137c = executor;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r0.hasNext() == false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        r1 = (java.util.Map.Entry) r0.next();
        ((java.util.concurrent.Executor) r1.getValue()).execute(com.google.firebase.components.C4954p.m21570a(r1, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0010, code lost:
        r0 = m21565b(r4).iterator();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo17879a(com.google.firebase.p149a.C4918a<?> r4) {
        /*
            r3 = this;
            com.google.android.gms.common.internal.C3513t.m12625a(r4)
            monitor-enter(r3)
            java.util.Queue<com.google.firebase.a.a<?>> r0 = r3.f16136b     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x000f
            java.util.Queue<com.google.firebase.a.a<?>> r0 = r3.f16136b     // Catch:{ all -> 0x0033 }
            r0.add(r4)     // Catch:{ all -> 0x0033 }
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x000f:
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            java.util.Set r0 = r3.m21565b(r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0032
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            java.lang.Runnable r1 = com.google.firebase.components.C4954p.m21570a(r1, r4)
            r2.execute(r1)
            goto L_0x0018
        L_0x0032:
            return
        L_0x0033:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.components.C4953o.mo17879a(com.google.firebase.a.a):void");
    }

    /* renamed from: b */
    private synchronized Set<Entry<C4919b<Object>, Executor>> m21565b(C4918a<?> aVar) {
        Map map = (Map) this.f16135a.get(aVar.mo17816a());
        if (map == null) {
            return Collections.emptySet();
        }
        return map.entrySet();
    }

    /* renamed from: a */
    public synchronized <T> void mo17821a(Class<T> cls, Executor executor, C4919b<? super T> bVar) {
        C3513t.m12625a(cls);
        C3513t.m12625a(bVar);
        C3513t.m12625a(executor);
        if (!this.f16135a.containsKey(cls)) {
            this.f16135a.put(cls, new ConcurrentHashMap());
        }
        ((ConcurrentHashMap) this.f16135a.get(cls)).put(bVar, executor);
    }

    /* renamed from: a */
    public <T> void mo17820a(Class<T> cls, C4919b<? super T> bVar) {
        mo17821a(cls, this.f16137c, bVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo17878a() {
        Queue<C4918a> queue;
        synchronized (this) {
            if (this.f16136b != null) {
                queue = this.f16136b;
                this.f16136b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (C4918a a : queue) {
                mo17879a(a);
            }
        }
    }
}
