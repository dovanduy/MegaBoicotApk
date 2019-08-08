package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.support.p017v4.p023d.C0376a;
import com.google.android.gms.common.C3407d;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3244a;
import com.google.android.gms.common.api.C3244a.C3245a;
import com.google.android.gms.common.api.C3244a.C3246b;
import com.google.android.gms.common.api.C3244a.C3247c;
import com.google.android.gms.common.api.C3244a.C3255f;
import com.google.android.gms.common.api.C3263e;
import com.google.android.gms.common.api.C3391k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C3332c.C3333a;
import com.google.android.gms.common.internal.C3482e;
import com.google.android.gms.common.internal.C3482e.C3484b;
import com.google.android.gms.common.util.p142a.C3546a;
import com.google.android.gms.p143d.C3579c;
import com.google.android.gms.signin.C4902a;
import com.google.android.gms.signin.C4907e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.api.internal.cr */
public final class C3353cr implements C3313bh {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Map<C3247c<?>, C3352cq<?>> f9705a = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Map<C3247c<?>, C3352cq<?>> f9706b = new HashMap();

    /* renamed from: c */
    private final Map<C3244a<?>, Boolean> f9707c;

    /* renamed from: d */
    private final C3360d f9708d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C3289al f9709e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Lock f9710f;

    /* renamed from: g */
    private final Looper f9711g;

    /* renamed from: h */
    private final C3407d f9712h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Condition f9713i;

    /* renamed from: j */
    private final C3482e f9714j;

    /* renamed from: k */
    private final boolean f9715k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final boolean f9716l;

    /* renamed from: m */
    private final Queue<C3333a<?, ?>> f9717m = new LinkedList();
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: n */
    public boolean f9718n;
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: o */
    public Map<C3337cc<?>, ConnectionResult> f9719o;
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: p */
    public Map<C3337cc<?>, ConnectionResult> f9720p;
    @GuardedBy("mLock")

    /* renamed from: q */
    private C3380q f9721q;
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: r */
    public ConnectionResult f9722r;

    public C3353cr(Context context, Lock lock, Looper looper, C3407d dVar, Map<C3247c<?>, C3255f> map, C3482e eVar, Map<C3244a<?>, Boolean> map2, C3245a<? extends C4907e, C4902a> aVar, ArrayList<C3346ck> arrayList, C3289al alVar, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        this.f9710f = lock;
        Looper looper2 = looper;
        this.f9711g = looper2;
        this.f9713i = lock.newCondition();
        this.f9712h = dVar;
        this.f9709e = alVar;
        this.f9707c = map2;
        C3482e eVar2 = eVar;
        this.f9714j = eVar2;
        this.f9715k = z;
        HashMap hashMap = new HashMap();
        for (C3244a aVar2 : map2.keySet()) {
            hashMap.put(aVar2.mo13089c(), aVar2);
        }
        HashMap hashMap2 = new HashMap();
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            C3346ck ckVar = (C3346ck) obj;
            hashMap2.put(ckVar.f9681a, ckVar);
        }
        boolean z5 = false;
        boolean z6 = true;
        boolean z7 = false;
        for (Entry entry : map.entrySet()) {
            C3244a aVar3 = (C3244a) hashMap.get(entry.getKey());
            C3255f fVar = (C3255f) entry.getValue();
            if (fVar.mo13102k()) {
                if (!((Boolean) this.f9707c.get(aVar3)).booleanValue()) {
                    z3 = z6;
                    z4 = true;
                } else {
                    z3 = z6;
                    z4 = z7;
                }
                z2 = true;
            } else {
                z2 = z5;
                z4 = z7;
                z3 = false;
            }
            C3352cq cqVar = r1;
            C3255f fVar2 = fVar;
            Entry entry2 = entry;
            C3352cq cqVar2 = new C3352cq(context, aVar3, looper2, fVar, (C3346ck) hashMap2.get(aVar3), eVar2, aVar);
            this.f9705a.put((C3247c) entry2.getKey(), cqVar);
            if (fVar2.mo13101j()) {
                this.f9706b.put((C3247c) entry2.getKey(), cqVar);
            }
            z7 = z4;
            z6 = z3;
            z5 = z2;
            looper2 = looper;
        }
        this.f9716l = z5 && !z6 && !z7;
        this.f9708d = C3360d.m12031a();
    }

    /* renamed from: a */
    public final void mo13213a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: i */
    public final void mo13223i() {
    }

    /* renamed from: a */
    public final <A extends C3246b, R extends C3391k, T extends C3333a<R, A>> T mo13207a(T t) {
        if (this.f9715k && m11982c(t)) {
            return t;
        }
        if (!mo13220f()) {
            this.f9717m.add(t);
            return t;
        }
        this.f9709e.f9547e.mo13261a(t);
        return ((C3352cq) this.f9705a.get(t.mo13270d())).mo13115a(t);
    }

    /* renamed from: b */
    public final <A extends C3246b, T extends C3333a<? extends C3391k, A>> T mo13216b(T t) {
        C3247c d = t.mo13270d();
        if (this.f9715k && m11982c(t)) {
            return t;
        }
        this.f9709e.f9547e.mo13261a(t);
        return ((C3352cq) this.f9705a.get(d)).mo13117b(t);
    }

    /* renamed from: c */
    private final <T extends C3333a<? extends C3391k, ? extends C3246b>> boolean m11982c(T t) {
        C3247c d = t.mo13270d();
        ConnectionResult a = m11972a(d);
        if (a == null || a.mo13043c() != 4) {
            return false;
        }
        t.mo13268b(new Status(4, null, this.f9708d.mo13309a(((C3352cq) this.f9705a.get(d)).mo13119d(), System.identityHashCode(this.f9709e))));
        return true;
    }

    /* renamed from: a */
    public final void mo13208a() {
        this.f9710f.lock();
        try {
            if (!this.f9718n) {
                this.f9718n = true;
                this.f9719o = null;
                this.f9720p = null;
                this.f9721q = null;
                this.f9722r = null;
                this.f9708d.mo13318d();
                this.f9708d.mo13310a((Iterable<? extends C3263e<?>>) this.f9705a.values()).mo13710a((Executor) new C3546a(this.f9711g), (C3579c<TResult>) new C3355ct<TResult>(this));
                this.f9710f.unlock();
            }
        } finally {
            this.f9710f.unlock();
        }
    }

    @GuardedBy("mLock")
    /* renamed from: b */
    public final ConnectionResult mo13215b() {
        mo13208a();
        while (mo13294d()) {
            try {
                this.f9713i.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
        }
        if (mo13220f()) {
            return ConnectionResult.f9434a;
        }
        if (this.f9722r != null) {
            return this.f9722r;
        }
        return new ConnectionResult(13, null);
    }

    /* renamed from: c */
    public final void mo13217c() {
        this.f9710f.lock();
        try {
            this.f9718n = false;
            this.f9719o = null;
            this.f9720p = null;
            if (this.f9721q != null) {
                this.f9721q.mo13363a();
                this.f9721q = null;
            }
            this.f9722r = null;
            while (!this.f9717m.isEmpty()) {
                C3333a aVar = (C3333a) this.f9717m.remove();
                aVar.mo13161a((C3330by) null);
                aVar.mo13154a();
            }
            this.f9713i.signalAll();
        } finally {
            this.f9710f.unlock();
        }
    }

    /* renamed from: a */
    public final ConnectionResult mo13293a(C3244a<?> aVar) {
        return m11972a(aVar.mo13089c());
    }

    /* renamed from: a */
    private final ConnectionResult m11972a(C3247c<?> cVar) {
        this.f9710f.lock();
        try {
            C3352cq cqVar = (C3352cq) this.f9705a.get(cVar);
            if (this.f9719o != null && cqVar != null) {
                return (ConnectionResult) this.f9719o.get(cqVar.mo13119d());
            }
            this.f9710f.unlock();
            return null;
        } finally {
            this.f9710f.unlock();
        }
    }

    /* renamed from: f */
    public final boolean mo13220f() {
        this.f9710f.lock();
        try {
            return this.f9719o != null && this.f9722r == null;
        } finally {
            this.f9710f.unlock();
        }
    }

    /* renamed from: d */
    public final boolean mo13294d() {
        this.f9710f.lock();
        try {
            return this.f9719o == null && this.f9718n;
        } finally {
            this.f9710f.unlock();
        }
    }

    /* renamed from: e */
    private final boolean m11984e() {
        this.f9710f.lock();
        try {
            if (this.f9718n) {
                if (this.f9715k) {
                    for (C3247c a : this.f9706b.keySet()) {
                        ConnectionResult a2 = m11972a(a);
                        if (a2 != null) {
                            if (!a2.mo13042b()) {
                            }
                        }
                        this.f9710f.unlock();
                        return false;
                    }
                    this.f9710f.unlock();
                    return true;
                }
            }
            return false;
        } finally {
            this.f9710f.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final boolean mo13214a(C3375l lVar) {
        this.f9710f.lock();
        try {
            if (!this.f9718n || m11984e()) {
                this.f9710f.unlock();
                return false;
            }
            this.f9708d.mo13318d();
            this.f9721q = new C3380q(this, lVar);
            this.f9708d.mo13310a((Iterable<? extends C3263e<?>>) this.f9706b.values()).mo13710a((Executor) new C3546a(this.f9711g), (C3579c<TResult>) this.f9721q);
            this.f9710f.unlock();
            return true;
        } catch (Throwable th) {
            this.f9710f.unlock();
            throw th;
        }
    }

    /* renamed from: h */
    public final void mo13222h() {
        this.f9710f.lock();
        try {
            this.f9708d.mo13319e();
            if (this.f9721q != null) {
                this.f9721q.mo13363a();
                this.f9721q = null;
            }
            if (this.f9720p == null) {
                this.f9720p = new C0376a(this.f9706b.size());
            }
            ConnectionResult connectionResult = new ConnectionResult(4);
            for (C3352cq d : this.f9706b.values()) {
                this.f9720p.put(d.mo13119d(), connectionResult);
            }
            if (this.f9719o != null) {
                this.f9719o.putAll(this.f9720p);
            }
        } finally {
            this.f9710f.unlock();
        }
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: g */
    public final void m11988g() {
        if (this.f9714j == null) {
            this.f9709e.f9545c = Collections.emptySet();
            return;
        }
        HashSet hashSet = new HashSet(this.f9714j.mo13575d());
        Map f = this.f9714j.mo13577f();
        for (C3244a aVar : f.keySet()) {
            ConnectionResult a = mo13293a(aVar);
            if (a != null && a.mo13042b()) {
                hashSet.addAll(((C3484b) f.get(aVar)).f10050a);
            }
        }
        this.f9709e.f9545c = hashSet;
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: j */
    public final void m11991j() {
        while (!this.f9717m.isEmpty()) {
            mo13216b((T) (C3333a) this.f9717m.remove());
        }
        this.f9709e.mo13194a((Bundle) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final boolean m11976a(C3352cq<?> cqVar, ConnectionResult connectionResult) {
        return !connectionResult.mo13042b() && !connectionResult.mo13041a() && ((Boolean) this.f9707c.get(cqVar.mo13116b())).booleanValue() && cqVar.mo13292a().mo13102k() && this.f9712h.mo13405a(connectionResult.mo13043c());
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: k */
    public final ConnectionResult m11993k() {
        ConnectionResult connectionResult = null;
        int i = 0;
        int i2 = 0;
        ConnectionResult connectionResult2 = null;
        for (C3352cq cqVar : this.f9705a.values()) {
            C3244a b = cqVar.mo13116b();
            ConnectionResult connectionResult3 = (ConnectionResult) this.f9719o.get(cqVar.mo13119d());
            if (!connectionResult3.mo13042b() && (!((Boolean) this.f9707c.get(b)).booleanValue() || connectionResult3.mo13041a() || this.f9712h.mo13405a(connectionResult3.mo13043c()))) {
                if (connectionResult3.mo13043c() != 4 || !this.f9715k) {
                    int a = b.mo13087a().mo13093a();
                    if (connectionResult == null || i > a) {
                        connectionResult = connectionResult3;
                        i = a;
                    }
                } else {
                    int a2 = b.mo13087a().mo13093a();
                    if (connectionResult2 == null || i2 > a2) {
                        connectionResult2 = connectionResult3;
                        i2 = a2;
                    }
                }
            }
        }
        return (connectionResult == null || connectionResult2 == null || i <= i2) ? connectionResult : connectionResult2;
    }
}
