package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.support.p017v4.p023d.C0376a;
import android.util.Log;
import com.google.android.gms.common.C3407d;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3244a;
import com.google.android.gms.common.api.C3244a.C3245a;
import com.google.android.gms.common.api.C3244a.C3246b;
import com.google.android.gms.common.api.C3244a.C3247c;
import com.google.android.gms.common.api.C3244a.C3255f;
import com.google.android.gms.common.api.C3391k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C3332c.C3333a;
import com.google.android.gms.common.internal.C3482e;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.internal.p145b.C4415f;
import com.google.android.gms.signin.C4902a;
import com.google.android.gms.signin.C4907e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.api.internal.cm */
final class C3348cm implements C3313bh {

    /* renamed from: a */
    private final Context f9684a;

    /* renamed from: b */
    private final C3289al f9685b;

    /* renamed from: c */
    private final Looper f9686c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C3298au f9687d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C3298au f9688e;

    /* renamed from: f */
    private final Map<C3247c<?>, C3298au> f9689f;

    /* renamed from: g */
    private final Set<C3375l> f9690g = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: h */
    private final C3255f f9691h;

    /* renamed from: i */
    private Bundle f9692i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public ConnectionResult f9693j = null;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public ConnectionResult f9694k = null;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f9695l = false;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final Lock f9696m;
    @GuardedBy("mLock")

    /* renamed from: n */
    private int f9697n = 0;

    /* renamed from: a */
    public static C3348cm m11932a(Context context, C3289al alVar, Lock lock, Looper looper, C3407d dVar, Map<C3247c<?>, C3255f> map, C3482e eVar, Map<C3244a<?>, Boolean> map2, C3245a<? extends C4907e, C4902a> aVar, ArrayList<C3346ck> arrayList) {
        Map<C3244a<?>, Boolean> map3 = map2;
        C0376a aVar2 = new C0376a();
        C0376a aVar3 = new C0376a();
        C3255f fVar = null;
        for (Entry entry : map.entrySet()) {
            C3255f fVar2 = (C3255f) entry.getValue();
            if (fVar2.mo13016c()) {
                fVar = fVar2;
            }
            if (fVar2.mo13101j()) {
                aVar2.put((C3247c) entry.getKey(), fVar2);
            } else {
                aVar3.put((C3247c) entry.getKey(), fVar2);
            }
        }
        C3513t.m12632a(!aVar2.isEmpty(), (Object) "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        C0376a aVar4 = new C0376a();
        C0376a aVar5 = new C0376a();
        for (C3244a aVar6 : map2.keySet()) {
            C3247c c = aVar6.mo13089c();
            if (aVar2.containsKey(c)) {
                aVar4.put(aVar6, (Boolean) map3.get(aVar6));
            } else if (aVar3.containsKey(c)) {
                aVar5.put(aVar6, (Boolean) map3.get(aVar6));
            } else {
                throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = arrayList;
        int size = arrayList4.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList4.get(i);
            i++;
            C3346ck ckVar = (C3346ck) obj;
            if (aVar4.containsKey(ckVar.f9681a)) {
                arrayList2.add(ckVar);
            } else if (aVar5.containsKey(ckVar.f9681a)) {
                arrayList3.add(ckVar);
            } else {
                throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
            }
        }
        C3348cm cmVar = new C3348cm(context, alVar, lock, looper, dVar, aVar2, aVar3, eVar, aVar, fVar, arrayList2, arrayList3, aVar4, aVar5);
        return cmVar;
    }

    private C3348cm(Context context, C3289al alVar, Lock lock, Looper looper, C3407d dVar, Map<C3247c<?>, C3255f> map, Map<C3247c<?>, C3255f> map2, C3482e eVar, C3245a<? extends C4907e, C4902a> aVar, C3255f fVar, ArrayList<C3346ck> arrayList, ArrayList<C3346ck> arrayList2, Map<C3244a<?>, Boolean> map3, Map<C3244a<?>, Boolean> map4) {
        Context context2 = context;
        this.f9684a = context2;
        this.f9685b = alVar;
        Lock lock2 = lock;
        this.f9696m = lock2;
        Looper looper2 = looper;
        this.f9686c = looper2;
        this.f9691h = fVar;
        Context context3 = context2;
        Lock lock3 = lock2;
        C3407d dVar2 = dVar;
        C3298au auVar = r3;
        C3298au auVar2 = new C3298au(context3, this.f9685b, lock3, looper2, dVar2, map2, null, map4, null, arrayList2, new C3350co(this, null));
        this.f9687d = auVar;
        C3298au auVar3 = new C3298au(context3, this.f9685b, lock3, looper, dVar2, map, eVar, map3, aVar, arrayList, new C3351cp(this, null));
        this.f9688e = auVar3;
        C0376a aVar2 = new C0376a();
        for (C3247c put : map2.keySet()) {
            aVar2.put(put, this.f9687d);
        }
        for (C3247c put2 : map.keySet()) {
            aVar2.put(put2, this.f9688e);
        }
        this.f9689f = Collections.unmodifiableMap(aVar2);
    }

    @GuardedBy("mLock")
    /* renamed from: a */
    public final <A extends C3246b, R extends C3391k, T extends C3333a<R, A>> T mo13207a(T t) {
        if (!m11943c((C3333a<? extends C3391k, ? extends C3246b>) t)) {
            return this.f9687d.mo13207a(t);
        }
        if (!m11950j()) {
            return this.f9688e.mo13207a(t);
        }
        t.mo13268b(new Status(4, null, m11951k()));
        return t;
    }

    @GuardedBy("mLock")
    /* renamed from: b */
    public final <A extends C3246b, T extends C3333a<? extends C3391k, A>> T mo13216b(T t) {
        if (!m11943c((C3333a<? extends C3391k, ? extends C3246b>) t)) {
            return this.f9687d.mo13216b(t);
        }
        if (!m11950j()) {
            return this.f9688e.mo13216b(t);
        }
        t.mo13268b(new Status(4, null, m11951k()));
        return t;
    }

    @GuardedBy("mLock")
    /* renamed from: a */
    public final void mo13208a() {
        this.f9697n = 2;
        this.f9695l = false;
        this.f9694k = null;
        this.f9693j = null;
        this.f9687d.mo13208a();
        this.f9688e.mo13208a();
    }

    @GuardedBy("mLock")
    /* renamed from: b */
    public final ConnectionResult mo13215b() {
        throw new UnsupportedOperationException();
    }

    @GuardedBy("mLock")
    /* renamed from: c */
    public final void mo13217c() {
        this.f9694k = null;
        this.f9693j = null;
        this.f9697n = 0;
        this.f9687d.mo13217c();
        this.f9688e.mo13217c();
        m11949g();
    }

    /* renamed from: f */
    public final boolean mo13220f() {
        this.f9696m.lock();
        try {
            boolean z = true;
            if (!this.f9687d.mo13220f() || (!this.f9688e.mo13220f() && !m11950j() && this.f9697n != 1)) {
                z = false;
            }
            return z;
        } finally {
            this.f9696m.unlock();
        }
    }

    /* renamed from: d */
    public final boolean mo13290d() {
        this.f9696m.lock();
        try {
            return this.f9697n == 2;
        } finally {
            this.f9696m.unlock();
        }
    }

    /* renamed from: a */
    public final boolean mo13214a(C3375l lVar) {
        this.f9696m.lock();
        try {
            if ((mo13290d() || mo13220f()) && !this.f9688e.mo13220f()) {
                this.f9690g.add(lVar);
                if (this.f9697n == 0) {
                    this.f9697n = 1;
                }
                this.f9694k = null;
                this.f9688e.mo13208a();
                return true;
            }
            this.f9696m.unlock();
            return false;
        } finally {
            this.f9696m.unlock();
        }
    }

    @GuardedBy("mLock")
    /* renamed from: i */
    public final void mo13223i() {
        this.f9687d.mo13223i();
        this.f9688e.mo13223i();
    }

    /* renamed from: h */
    public final void mo13222h() {
        this.f9696m.lock();
        try {
            boolean d = mo13290d();
            this.f9688e.mo13217c();
            this.f9694k = new ConnectionResult(4);
            if (d) {
                new C4415f(this.f9686c).post(new C3349cn(this));
            } else {
                m11949g();
            }
        } finally {
            this.f9696m.unlock();
        }
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: e */
    public final void m11947e() {
        if (m11942b(this.f9693j)) {
            if (m11942b(this.f9694k) || m11950j()) {
                switch (this.f9697n) {
                    case 1:
                        break;
                    case 2:
                        this.f9685b.mo13194a(this.f9692i);
                        break;
                    default:
                        Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                        break;
                }
                m11949g();
                this.f9697n = 0;
            } else if (this.f9694k != null) {
                if (this.f9697n == 1) {
                    m11949g();
                    return;
                }
                m11936a(this.f9694k);
                this.f9687d.mo13217c();
            }
        } else if (this.f9693j != null && m11942b(this.f9694k)) {
            this.f9688e.mo13217c();
            m11936a(this.f9693j);
        } else if (!(this.f9693j == null || this.f9694k == null)) {
            ConnectionResult connectionResult = this.f9693j;
            if (this.f9688e.f9582c < this.f9687d.f9582c) {
                connectionResult = this.f9694k;
            }
            m11936a(connectionResult);
        }
    }

    @GuardedBy("mLock")
    /* renamed from: a */
    private final void m11936a(ConnectionResult connectionResult) {
        switch (this.f9697n) {
            case 1:
                break;
            case 2:
                this.f9685b.mo13195a(connectionResult);
                break;
            default:
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                break;
        }
        m11949g();
        this.f9697n = 0;
    }

    @GuardedBy("mLock")
    /* renamed from: g */
    private final void m11949g() {
        for (C3375l h : this.f9690g) {
            h.mo13013h();
        }
        this.f9690g.clear();
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: a */
    public final void m11934a(int i, boolean z) {
        this.f9685b.mo13193a(i, z);
        this.f9694k = null;
        this.f9693j = null;
    }

    @GuardedBy("mLock")
    /* renamed from: j */
    private final boolean m11950j() {
        return this.f9694k != null && this.f9694k.mo13043c() == 4;
    }

    /* renamed from: c */
    private final boolean m11943c(C3333a<? extends C3391k, ? extends C3246b> aVar) {
        C3247c d = aVar.mo13270d();
        C3513t.m12636b(this.f9689f.containsKey(d), "GoogleApiClient is not configured to use the API required for this call.");
        return ((C3298au) this.f9689f.get(d)).equals(this.f9688e);
    }

    /* renamed from: k */
    private final PendingIntent m11951k() {
        if (this.f9691h == null) {
            return null;
        }
        return PendingIntent.getActivity(this.f9684a, System.identityHashCode(this.f9685b), this.f9691h.mo13017d(), 134217728);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m11935a(Bundle bundle) {
        if (this.f9692i == null) {
            this.f9692i = bundle;
            return;
        }
        if (bundle != null) {
            this.f9692i.putAll(bundle);
        }
    }

    /* renamed from: b */
    private static boolean m11942b(ConnectionResult connectionResult) {
        return connectionResult != null && connectionResult.mo13042b();
    }

    /* renamed from: a */
    public final void mo13213a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("authClient").println(":");
        this.f9688e.mo13213a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append(str).append("anonClient").println(":");
        this.f9687d.mo13213a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }
}
