package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.C3407d;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3244a;
import com.google.android.gms.common.api.C3244a.C3245a;
import com.google.android.gms.common.api.C3244a.C3246b;
import com.google.android.gms.common.api.C3244a.C3247c;
import com.google.android.gms.common.api.C3244a.C3255f;
import com.google.android.gms.common.api.C3391k;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.C3332c.C3333a;
import com.google.android.gms.common.internal.C3482e;
import com.google.android.gms.common.internal.C3482e.C3484b;
import com.google.android.gms.common.internal.C3494m;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.C4902a;
import com.google.android.gms.signin.C4907e;
import com.google.android.gms.signin.internal.zaj;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.api.internal.z */
public final class C3389z implements C3297at {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3298au f9809a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Lock f9810b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Context f9811c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C3407d f9812d;

    /* renamed from: e */
    private ConnectionResult f9813e;

    /* renamed from: f */
    private int f9814f;

    /* renamed from: g */
    private int f9815g = 0;

    /* renamed from: h */
    private int f9816h;

    /* renamed from: i */
    private final Bundle f9817i = new Bundle();

    /* renamed from: j */
    private final Set<C3247c> f9818j = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C4907e f9819k;

    /* renamed from: l */
    private boolean f9820l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f9821m;

    /* renamed from: n */
    private boolean f9822n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C3494m f9823o;

    /* renamed from: p */
    private boolean f9824p;

    /* renamed from: q */
    private boolean f9825q;

    /* renamed from: r */
    private final C3482e f9826r;

    /* renamed from: s */
    private final Map<C3244a<?>, Boolean> f9827s;

    /* renamed from: t */
    private final C3245a<? extends C4907e, C4902a> f9828t;

    /* renamed from: u */
    private ArrayList<Future<?>> f9829u = new ArrayList<>();

    public C3389z(C3298au auVar, C3482e eVar, Map<C3244a<?>, Boolean> map, C3407d dVar, C3245a<? extends C4907e, C4902a> aVar, Lock lock, Context context) {
        this.f9809a = auVar;
        this.f9826r = eVar;
        this.f9827s = map;
        this.f9812d = dVar;
        this.f9828t = aVar;
        this.f9810b = lock;
        this.f9811c = context;
    }

    /* renamed from: c */
    private static String m12187c(int i) {
        switch (i) {
            case 0:
                return "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
            case 1:
                return "STEP_GETTING_REMOTE_SERVICE";
            default:
                return "UNKNOWN";
        }
    }

    /* renamed from: c */
    public final void mo13192c() {
    }

    /* renamed from: a */
    public final void mo13186a() {
        this.f9809a.f9581b.clear();
        this.f9821m = false;
        this.f9813e = null;
        this.f9815g = 0;
        this.f9820l = true;
        this.f9822n = false;
        this.f9824p = false;
        HashMap hashMap = new HashMap();
        boolean z = false;
        for (C3244a aVar : this.f9827s.keySet()) {
            C3255f fVar = (C3255f) this.f9809a.f9580a.get(aVar.mo13089c());
            z |= aVar.mo13087a().mo13093a() == 1;
            boolean booleanValue = ((Boolean) this.f9827s.get(aVar)).booleanValue();
            if (fVar.mo13101j()) {
                this.f9821m = true;
                if (booleanValue) {
                    this.f9818j.add(aVar.mo13089c());
                } else {
                    this.f9820l = false;
                }
            }
            hashMap.put(fVar, new C3279ab(this, aVar, booleanValue));
        }
        if (z) {
            this.f9821m = false;
        }
        if (this.f9821m) {
            this.f9826r.mo13572a(Integer.valueOf(System.identityHashCode(this.f9809a.f9583d)));
            C3286ai aiVar = new C3286ai(this, null);
            this.f9819k = (C4907e) this.f9828t.mo12938a(this.f9811c, this.f9809a.f9583d.mo13138c(), this.f9826r, this.f9826r.mo13580i(), aiVar, aiVar);
        }
        this.f9816h = this.f9809a.f9580a.size();
        this.f9829u.add(C3301ax.m11806a().submit(new C3280ac(this, hashMap)));
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: d */
    public final boolean m12190d() {
        this.f9816h--;
        if (this.f9816h > 0) {
            return false;
        }
        if (this.f9816h < 0) {
            Log.w("GoogleApiClientConnecting", this.f9809a.f9583d.mo13198n());
            Log.wtf("GoogleApiClientConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            m12183b(new ConnectionResult(8, null));
            return false;
        } else if (this.f9813e == null) {
            return true;
        } else {
            this.f9809a.f9582c = this.f9814f;
            m12183b(this.f9813e);
            return false;
        }
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: a */
    public final void m12178a(zaj zaj) {
        if (m12185b(0)) {
            ConnectionResult a = zaj.mo17813a();
            if (a.mo13042b()) {
                ResolveAccountResponse b = zaj.mo17814b();
                ConnectionResult b2 = b.mo13467b();
                if (!b2.mo13042b()) {
                    String valueOf = String.valueOf(b2);
                    StringBuilder sb = new StringBuilder(48 + String.valueOf(valueOf).length());
                    sb.append("Sign-in succeeded with resolve account failure: ");
                    sb.append(valueOf);
                    Log.wtf("GoogleApiClientConnecting", sb.toString(), new Exception());
                    m12183b(b2);
                    return;
                }
                this.f9822n = true;
                this.f9823o = b.mo13466a();
                this.f9824p = b.mo13468c();
                this.f9825q = b.mo13469d();
                m12191e();
            } else if (m12180a(a)) {
                m12196g();
                m12191e();
            } else {
                m12183b(a);
            }
        }
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: e */
    public final void m12191e() {
        if (this.f9816h == 0) {
            if (!this.f9821m || this.f9822n) {
                ArrayList arrayList = new ArrayList();
                this.f9815g = 1;
                this.f9816h = this.f9809a.f9580a.size();
                for (C3247c cVar : this.f9809a.f9580a.keySet()) {
                    if (!this.f9809a.f9581b.containsKey(cVar)) {
                        arrayList.add((C3255f) this.f9809a.f9580a.get(cVar));
                    } else if (m12190d()) {
                        m12194f();
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.f9829u.add(C3301ax.m11806a().submit(new C3283af(this, arrayList)));
                }
            }
        }
    }

    @GuardedBy("mLock")
    /* renamed from: a */
    public final void mo13188a(Bundle bundle) {
        if (m12185b(1)) {
            if (bundle != null) {
                this.f9817i.putAll(bundle);
            }
            if (m12190d()) {
                m12194f();
            }
        }
    }

    @GuardedBy("mLock")
    /* renamed from: a */
    public final void mo13189a(ConnectionResult connectionResult, C3244a<?> aVar, boolean z) {
        if (m12185b(1)) {
            m12184b(connectionResult, aVar, z);
            if (m12190d()) {
                m12194f();
            }
        }
    }

    @GuardedBy("mLock")
    /* renamed from: f */
    private final void m12194f() {
        this.f9809a.mo13219e();
        C3301ax.m11806a().execute(new C3278aa(this));
        if (this.f9819k != null) {
            if (this.f9824p) {
                this.f9819k.mo17795a(this.f9823o, this.f9825q);
            }
            m12179a(false);
        }
        for (C3247c cVar : this.f9809a.f9581b.keySet()) {
            ((C3255f) this.f9809a.f9580a.get(cVar)).mo13098g();
        }
        this.f9809a.f9584e.mo13194a(this.f9817i.isEmpty() ? null : this.f9817i);
    }

    /* renamed from: a */
    public final <A extends C3246b, R extends C3391k, T extends C3333a<R, A>> T mo13185a(T t) {
        this.f9809a.f9583d.f9543a.add(t);
        return t;
    }

    /* renamed from: b */
    public final <A extends C3246b, T extends C3333a<? extends C3391k, A>> T mo13190b(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    /* renamed from: b */
    public final boolean mo13191b() {
        m12198h();
        m12179a(true);
        this.f9809a.mo13209a((ConnectionResult) null);
        return true;
    }

    @GuardedBy("mLock")
    /* renamed from: a */
    public final void mo13187a(int i) {
        m12183b(new ConnectionResult(8, null));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        if (r7 != false) goto L_0x0024;
     */
    @javax.annotation.concurrent.GuardedBy("mLock")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m12184b(com.google.android.gms.common.ConnectionResult r5, com.google.android.gms.common.api.C3244a<?> r6, boolean r7) {
        /*
            r4 = this;
            com.google.android.gms.common.api.a$e r0 = r6.mo13087a()
            int r0 = r0.mo13093a()
            r1 = 0
            r2 = 1
            if (r7 == 0) goto L_0x0024
            boolean r7 = r5.mo13041a()
            if (r7 == 0) goto L_0x0014
        L_0x0012:
            r7 = r2
            goto L_0x0022
        L_0x0014:
            com.google.android.gms.common.d r7 = r4.f9812d
            int r3 = r5.mo13043c()
            android.content.Intent r7 = r7.mo13415c(r3)
            if (r7 == 0) goto L_0x0021
            goto L_0x0012
        L_0x0021:
            r7 = r1
        L_0x0022:
            if (r7 == 0) goto L_0x002d
        L_0x0024:
            com.google.android.gms.common.ConnectionResult r7 = r4.f9813e
            if (r7 == 0) goto L_0x002c
            int r7 = r4.f9814f
            if (r0 >= r7) goto L_0x002d
        L_0x002c:
            r1 = r2
        L_0x002d:
            if (r1 == 0) goto L_0x0033
            r4.f9813e = r5
            r4.f9814f = r0
        L_0x0033:
            com.google.android.gms.common.api.internal.au r7 = r4.f9809a
            java.util.Map<com.google.android.gms.common.api.a$c<?>, com.google.android.gms.common.ConnectionResult> r7 = r7.f9581b
            com.google.android.gms.common.api.a$c r6 = r6.mo13089c()
            r7.put(r6, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C3389z.m12184b(com.google.android.gms.common.ConnectionResult, com.google.android.gms.common.api.a, boolean):void");
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: g */
    public final void m12196g() {
        this.f9821m = false;
        this.f9809a.f9583d.f9545c = Collections.emptySet();
        for (C3247c cVar : this.f9818j) {
            if (!this.f9809a.f9581b.containsKey(cVar)) {
                this.f9809a.f9581b.put(cVar, new ConnectionResult(17, null));
            }
        }
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: a */
    public final boolean m12180a(ConnectionResult connectionResult) {
        return this.f9820l && !connectionResult.mo13041a();
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: b */
    public final void m12183b(ConnectionResult connectionResult) {
        m12198h();
        m12179a(!connectionResult.mo13041a());
        this.f9809a.mo13209a(connectionResult);
        this.f9809a.f9584e.mo13195a(connectionResult);
    }

    /* renamed from: a */
    private final void m12179a(boolean z) {
        if (this.f9819k != null) {
            if (this.f9819k.mo13099h() && z) {
                this.f9819k.mo17797e();
            }
            this.f9819k.mo13098g();
            this.f9823o = null;
        }
    }

    /* renamed from: h */
    private final void m12198h() {
        ArrayList arrayList = this.f9829u;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((Future) obj).cancel(true);
        }
        this.f9829u.clear();
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final Set<Scope> m12199i() {
        if (this.f9826r == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(this.f9826r.mo13575d());
        Map f = this.f9826r.mo13577f();
        for (C3244a aVar : f.keySet()) {
            if (!this.f9809a.f9581b.containsKey(aVar.mo13089c())) {
                hashSet.addAll(((C3484b) f.get(aVar)).f10050a);
            }
        }
        return hashSet;
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: b */
    public final boolean m12185b(int i) {
        if (this.f9815g == i) {
            return true;
        }
        Log.w("GoogleApiClientConnecting", this.f9809a.f9583d.mo13198n());
        String valueOf = String.valueOf(this);
        StringBuilder sb = new StringBuilder(23 + String.valueOf(valueOf).length());
        sb.append("Unexpected callback in ");
        sb.append(valueOf);
        Log.w("GoogleApiClientConnecting", sb.toString());
        int i2 = this.f9816h;
        StringBuilder sb2 = new StringBuilder(33);
        sb2.append("mRemainingConnections=");
        sb2.append(i2);
        Log.w("GoogleApiClientConnecting", sb2.toString());
        String c = m12187c(this.f9815g);
        String c2 = m12187c(i);
        StringBuilder sb3 = new StringBuilder(70 + String.valueOf(c).length() + String.valueOf(c2).length());
        sb3.append("GoogleApiClient connecting is in step ");
        sb3.append(c);
        sb3.append(" but received callback for step ");
        sb3.append(c2);
        Log.wtf("GoogleApiClientConnecting", sb3.toString(), new Exception());
        m12183b(new ConnectionResult(8, null));
        return false;
    }
}
