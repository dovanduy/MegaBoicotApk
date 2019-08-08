package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.gms.common.C3405c;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3244a;
import com.google.android.gms.common.api.C3244a.C3245a;
import com.google.android.gms.common.api.C3244a.C3246b;
import com.google.android.gms.common.api.C3244a.C3247c;
import com.google.android.gms.common.api.C3244a.C3255f;
import com.google.android.gms.common.api.C3266f;
import com.google.android.gms.common.api.C3266f.C3267a;
import com.google.android.gms.common.api.C3266f.C3268b;
import com.google.android.gms.common.api.C3266f.C3269c;
import com.google.android.gms.common.api.C3270g;
import com.google.android.gms.common.api.C3391k;
import com.google.android.gms.common.api.C3392l;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C3332c.C3333a;
import com.google.android.gms.common.internal.C3482e;
import com.google.android.gms.common.internal.C3488i;
import com.google.android.gms.common.internal.C3488i.C3489a;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.common.internal.p141a.C3426a;
import com.google.android.gms.common.util.C3552d;
import com.google.android.gms.signin.C4902a;
import com.google.android.gms.signin.C4907e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.api.internal.al */
public final class C3289al extends C3266f implements C3314bi {

    /* renamed from: a */
    final Queue<C3333a<?, ?>> f9543a = new LinkedList();

    /* renamed from: b */
    final Map<C3247c<?>, C3255f> f9544b;

    /* renamed from: c */
    Set<Scope> f9545c;

    /* renamed from: d */
    Set<C3324bs> f9546d;

    /* renamed from: e */
    final C3327bv f9547e;

    /* renamed from: f */
    private final Lock f9548f;

    /* renamed from: g */
    private boolean f9549g;

    /* renamed from: h */
    private final C3488i f9550h;

    /* renamed from: i */
    private C3313bh f9551i = null;

    /* renamed from: j */
    private final int f9552j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final Context f9553k;

    /* renamed from: l */
    private final Looper f9554l;

    /* renamed from: m */
    private volatile boolean f9555m;

    /* renamed from: n */
    private long f9556n;

    /* renamed from: o */
    private long f9557o;

    /* renamed from: p */
    private final C3295ar f9558p;

    /* renamed from: q */
    private final C3405c f9559q;

    /* renamed from: r */
    private zabq f9560r;

    /* renamed from: s */
    private final C3482e f9561s;

    /* renamed from: t */
    private final Map<C3244a<?>, Boolean> f9562t;

    /* renamed from: u */
    private final C3245a<? extends C4907e, C4902a> f9563u;

    /* renamed from: v */
    private final C3373j f9564v;

    /* renamed from: w */
    private final ArrayList<C3346ck> f9565w;

    /* renamed from: x */
    private Integer f9566x;

    /* renamed from: y */
    private final C3489a f9567y;

    public C3289al(Context context, Lock lock, Looper looper, C3482e eVar, C3405c cVar, C3245a<? extends C4907e, C4902a> aVar, Map<C3244a<?>, Boolean> map, List<C3268b> list, List<C3269c> list2, Map<C3247c<?>, C3255f> map2, int i, int i2, ArrayList<C3346ck> arrayList, boolean z) {
        Looper looper2 = looper;
        this.f9556n = C3552d.m12729a() ? 10000 : 120000;
        this.f9557o = DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS;
        this.f9545c = new HashSet();
        this.f9564v = new C3373j();
        this.f9566x = null;
        this.f9546d = null;
        this.f9567y = new C3290am(this);
        this.f9553k = context;
        this.f9548f = lock;
        this.f9549g = false;
        this.f9550h = new C3488i(looper2, this.f9567y);
        this.f9554l = looper2;
        this.f9558p = new C3295ar(this, looper2);
        this.f9559q = cVar;
        this.f9552j = i;
        if (this.f9552j >= 0) {
            this.f9566x = Integer.valueOf(i2);
        }
        this.f9562t = map;
        this.f9544b = map2;
        this.f9565w = arrayList;
        this.f9547e = new C3327bv(this.f9544b);
        for (C3268b a : list) {
            this.f9550h.mo13594a(a);
        }
        for (C3269c a2 : list2) {
            this.f9550h.mo13595a(a2);
        }
        this.f9561s = eVar;
        this.f9563u = aVar;
    }

    /* renamed from: c */
    private static String m11740c(int i) {
        switch (i) {
            case 1:
                return "SIGN_IN_MODE_REQUIRED";
            case 2:
                return "SIGN_IN_MODE_OPTIONAL";
            case 3:
                return "SIGN_IN_MODE_NONE";
            default:
                return "UNKNOWN";
        }
    }

    /* renamed from: a */
    public final <A extends C3246b, R extends C3391k, T extends C3333a<R, A>> T mo13128a(T t) {
        C3513t.m12636b(t.mo13270d() != null, "This task can not be enqueued (it's probably a Batch or malformed)");
        boolean containsKey = this.f9544b.containsKey(t.mo13270d());
        String d = t.mo13271e() != null ? t.mo13271e().mo13090d() : "the API";
        StringBuilder sb = new StringBuilder(65 + String.valueOf(d).length());
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(d);
        sb.append(" required for this call.");
        C3513t.m12636b(containsKey, sb.toString());
        this.f9548f.lock();
        try {
            if (this.f9551i == null) {
                this.f9543a.add(t);
                return t;
            }
            T a = this.f9551i.mo13207a(t);
            this.f9548f.unlock();
            return a;
        } finally {
            this.f9548f.unlock();
        }
    }

    /* renamed from: b */
    public final <A extends C3246b, T extends C3333a<? extends C3391k, A>> T mo13135b(T t) {
        C3513t.m12636b(t.mo13270d() != null, "This task can not be executed (it's probably a Batch or malformed)");
        boolean containsKey = this.f9544b.containsKey(t.mo13270d());
        String d = t.mo13271e() != null ? t.mo13271e().mo13090d() : "the API";
        StringBuilder sb = new StringBuilder(65 + String.valueOf(d).length());
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(d);
        sb.append(" required for this call.");
        C3513t.m12636b(containsKey, sb.toString());
        this.f9548f.lock();
        try {
            if (this.f9551i == null) {
                throw new IllegalStateException("GoogleApiClient is not connected yet.");
            } else if (this.f9555m) {
                this.f9543a.add(t);
                while (!this.f9543a.isEmpty()) {
                    C3333a aVar = (C3333a) this.f9543a.remove();
                    this.f9547e.mo13261a(aVar);
                    aVar.mo13268b(Status.f9457c);
                }
                return t;
            } else {
                T b = this.f9551i.mo13216b(t);
                this.f9548f.unlock();
                return b;
            }
        } finally {
            this.f9548f.unlock();
        }
    }

    /* renamed from: e */
    public final void mo13140e() {
        this.f9548f.lock();
        try {
            boolean z = false;
            if (this.f9552j >= 0) {
                if (this.f9566x != null) {
                    z = true;
                }
                C3513t.m12632a(z, (Object) "Sign-in mode should have been set explicitly by auto-manage.");
            } else if (this.f9566x == null) {
                this.f9566x = Integer.valueOf(m11733a((Iterable<C3255f>) this.f9544b.values(), false));
            } else if (this.f9566x.intValue() == 2) {
                throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            mo13129a(this.f9566x.intValue());
        } finally {
            this.f9548f.unlock();
        }
    }

    /* renamed from: a */
    public final void mo13129a(int i) {
        this.f9548f.lock();
        boolean z = true;
        if (!(i == 3 || i == 1 || i == 2)) {
            z = false;
        }
        try {
            StringBuilder sb = new StringBuilder(33);
            sb.append("Illegal sign-in mode: ");
            sb.append(i);
            C3513t.m12636b(z, sb.toString());
            m11737b(i);
            m11741o();
        } finally {
            this.f9548f.unlock();
        }
    }

    /* renamed from: f */
    public final ConnectionResult mo13141f() {
        boolean z = true;
        C3513t.m12632a(Looper.myLooper() != Looper.getMainLooper(), (Object) "blockingConnect must not be called on the UI thread");
        this.f9548f.lock();
        try {
            if (this.f9552j >= 0) {
                if (this.f9566x == null) {
                    z = false;
                }
                C3513t.m12632a(z, (Object) "Sign-in mode should have been set explicitly by auto-manage.");
            } else if (this.f9566x == null) {
                this.f9566x = Integer.valueOf(m11733a((Iterable<C3255f>) this.f9544b.values(), false));
            } else if (this.f9566x.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            m11737b(this.f9566x.intValue());
            this.f9550h.mo13596b();
            return this.f9551i.mo13215b();
        } finally {
            this.f9548f.unlock();
        }
    }

    /* renamed from: g */
    public final void mo13142g() {
        this.f9548f.lock();
        try {
            this.f9547e.mo13260a();
            if (this.f9551i != null) {
                this.f9551i.mo13217c();
            }
            this.f9564v.mo13357a();
            for (C3333a aVar : this.f9543a) {
                aVar.mo13161a((C3330by) null);
                aVar.mo13154a();
            }
            this.f9543a.clear();
            if (this.f9551i != null) {
                mo13196l();
                this.f9550h.mo13590a();
                this.f9548f.unlock();
            }
        } finally {
            this.f9548f.unlock();
        }
    }

    /* renamed from: h */
    public final void mo13143h() {
        mo13142g();
        mo13140e();
    }

    /* renamed from: i */
    public final C3270g<Status> mo13144i() {
        C3513t.m12632a(mo13145j(), (Object) "GoogleApiClient is not connected yet.");
        C3513t.m12632a(this.f9566x.intValue() != 2, (Object) "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
        C3378o oVar = new C3378o(this);
        if (this.f9544b.containsKey(C3426a.f9951a)) {
            m11734a(this, oVar, false);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            C3266f b = new C3267a(this.f9553k).mo13147a(C3426a.f9952b).mo13149a((C3268b) new C3291an(this, atomicReference, oVar)).mo13150a((C3269c) new C3292ao(this, oVar)).mo13146a((Handler) this.f9558p).mo13152b();
            atomicReference.set(b);
            b.mo13140e();
        }
        return oVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m11734a(C3266f fVar, C3378o oVar, boolean z) {
        C3426a.f9953c.mo13480a(fVar).mo13156a((C3392l<? super R>) new C3294aq<Object>(this, oVar, z, fVar));
    }

    /* renamed from: j */
    public final boolean mo13145j() {
        return this.f9551i != null && this.f9551i.mo13220f();
    }

    /* renamed from: b */
    private final void m11737b(int i) {
        if (this.f9566x == null) {
            this.f9566x = Integer.valueOf(i);
        } else if (this.f9566x.intValue() != i) {
            String c = m11740c(i);
            String c2 = m11740c(this.f9566x.intValue());
            StringBuilder sb = new StringBuilder(51 + String.valueOf(c).length() + String.valueOf(c2).length());
            sb.append("Cannot use sign-in mode: ");
            sb.append(c);
            sb.append(". Mode was already set to ");
            sb.append(c2);
            throw new IllegalStateException(sb.toString());
        }
        if (this.f9551i == null) {
            boolean z = false;
            boolean z2 = false;
            for (C3255f fVar : this.f9544b.values()) {
                if (fVar.mo13101j()) {
                    z = true;
                }
                if (fVar.mo13016c()) {
                    z2 = true;
                }
            }
            switch (this.f9566x.intValue()) {
                case 1:
                    if (!z) {
                        throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
                    } else if (z2) {
                        throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
                    }
                    break;
                case 2:
                    if (z) {
                        if (this.f9549g) {
                            C3353cr crVar = new C3353cr(this.f9553k, this.f9548f, this.f9554l, this.f9559q, this.f9544b, this.f9561s, this.f9562t, this.f9563u, this.f9565w, this, true);
                            this.f9551i = crVar;
                            return;
                        }
                        this.f9551i = C3348cm.m11932a(this.f9553k, this, this.f9548f, this.f9554l, this.f9559q, this.f9544b, this.f9561s, this.f9562t, this.f9563u, this.f9565w);
                        return;
                    }
                    break;
            }
            if (!this.f9549g || z2) {
                C3298au auVar = new C3298au(this.f9553k, this, this.f9548f, this.f9554l, this.f9559q, this.f9544b, this.f9561s, this.f9562t, this.f9563u, this.f9565w, this);
                this.f9551i = auVar;
                return;
            }
            C3353cr crVar2 = new C3353cr(this.f9553k, this.f9548f, this.f9554l, this.f9559q, this.f9544b, this.f9561s, this.f9562t, this.f9563u, this.f9565w, this, false);
            this.f9551i = crVar2;
        }
    }

    @GuardedBy("mLock")
    /* renamed from: o */
    private final void m11741o() {
        this.f9550h.mo13596b();
        this.f9551i.mo13208a();
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public final void m11742p() {
        this.f9548f.lock();
        try {
            if (this.f9555m) {
                m11741o();
            }
        } finally {
            this.f9548f.unlock();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public final void m11743q() {
        this.f9548f.lock();
        try {
            if (mo13196l()) {
                m11741o();
            }
        } finally {
            this.f9548f.unlock();
        }
    }

    /* access modifiers changed from: 0000 */
    @GuardedBy("mLock")
    /* renamed from: l */
    public final boolean mo13196l() {
        if (!this.f9555m) {
            return false;
        }
        this.f9555m = false;
        this.f9558p.removeMessages(2);
        this.f9558p.removeMessages(1);
        if (this.f9560r != null) {
            this.f9560r.mo13372a();
            this.f9560r = null;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo13130a(C3269c cVar) {
        this.f9550h.mo13595a(cVar);
    }

    /* renamed from: b */
    public final void mo13136b(C3269c cVar) {
        this.f9550h.mo13597b(cVar);
    }

    @GuardedBy("mLock")
    /* renamed from: a */
    public final void mo13194a(Bundle bundle) {
        while (!this.f9543a.isEmpty()) {
            mo13135b((C3333a) this.f9543a.remove());
        }
        this.f9550h.mo13592a(bundle);
    }

    @GuardedBy("mLock")
    /* renamed from: a */
    public final void mo13195a(ConnectionResult connectionResult) {
        if (!this.f9559q.mo13419d(this.f9553k, connectionResult.mo13043c())) {
            mo13196l();
        }
        if (!this.f9555m) {
            this.f9550h.mo13593a(connectionResult);
            this.f9550h.mo13590a();
        }
    }

    @GuardedBy("mLock")
    /* renamed from: a */
    public final void mo13193a(int i, boolean z) {
        if (i == 1 && !z && !this.f9555m) {
            this.f9555m = true;
            if (this.f9560r == null && !C3552d.m12729a()) {
                this.f9560r = this.f9559q.mo13403a(this.f9553k.getApplicationContext(), (C3312bg) new C3296as(this));
            }
            this.f9558p.sendMessageDelayed(this.f9558p.obtainMessage(1), this.f9556n);
            this.f9558p.sendMessageDelayed(this.f9558p.obtainMessage(2), this.f9557o);
        }
        this.f9547e.mo13262b();
        this.f9550h.mo13591a(i);
        this.f9550h.mo13590a();
        if (i == 2) {
            m11741o();
        }
    }

    /* renamed from: b */
    public final Context mo13134b() {
        return this.f9553k;
    }

    /* renamed from: c */
    public final Looper mo13138c() {
        return this.f9554l;
    }

    /* renamed from: a */
    public final boolean mo13133a(C3375l lVar) {
        return this.f9551i != null && this.f9551i.mo13214a(lVar);
    }

    /* renamed from: d */
    public final void mo13139d() {
        if (this.f9551i != null) {
            this.f9551i.mo13222h();
        }
    }

    /* renamed from: a */
    public final void mo13131a(C3324bs bsVar) {
        this.f9548f.lock();
        try {
            if (this.f9546d == null) {
                this.f9546d = new HashSet();
            }
            this.f9546d.add(bsVar);
        } finally {
            this.f9548f.unlock();
        }
    }

    /* renamed from: b */
    public final void mo13137b(C3324bs bsVar) {
        this.f9548f.lock();
        try {
            if (this.f9546d == null) {
                Log.wtf("GoogleApiClientImpl", "Attempted to remove pending transform when no transforms are registered.", new Exception());
            } else if (!this.f9546d.remove(bsVar)) {
                Log.wtf("GoogleApiClientImpl", "Failed to remove pending transform - this may lead to memory leaks!", new Exception());
            } else if (!mo13197m()) {
                this.f9551i.mo13223i();
            }
        } finally {
            this.f9548f.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public final boolean mo13197m() {
        this.f9548f.lock();
        try {
            if (this.f9546d == null) {
                this.f9548f.unlock();
                return false;
            }
            boolean z = !this.f9546d.isEmpty();
            this.f9548f.unlock();
            return z;
        } catch (Throwable th) {
            this.f9548f.unlock();
            throw th;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public final String mo13198n() {
        StringWriter stringWriter = new StringWriter();
        mo13132a("", null, new PrintWriter(stringWriter), null);
        return stringWriter.toString();
    }

    /* renamed from: a */
    public final void mo13132a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("mContext=").println(this.f9553k);
        printWriter.append(str).append("mResuming=").print(this.f9555m);
        printWriter.append(" mWorkQueue.size()=").print(this.f9543a.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.f9547e.f9645b.size());
        if (this.f9551i != null) {
            this.f9551i.mo13213a(str, fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: a */
    public static int m11733a(Iterable<C3255f> iterable, boolean z) {
        boolean z2 = false;
        boolean z3 = false;
        for (C3255f fVar : iterable) {
            if (fVar.mo13101j()) {
                z2 = true;
            }
            if (fVar.mo13016c()) {
                z3 = true;
            }
        }
        if (!z2) {
            return 3;
        }
        if (!z3 || !z) {
            return 1;
        }
        return 2;
    }
}
