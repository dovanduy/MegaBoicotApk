package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.C3407d;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3244a;
import com.google.android.gms.common.api.C3244a.C3245a;
import com.google.android.gms.common.api.C3244a.C3246b;
import com.google.android.gms.common.api.C3244a.C3247c;
import com.google.android.gms.common.api.C3244a.C3255f;
import com.google.android.gms.common.api.C3391k;
import com.google.android.gms.common.api.internal.C3332c.C3333a;
import com.google.android.gms.common.internal.C3482e;
import com.google.android.gms.signin.C4902a;
import com.google.android.gms.signin.C4907e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.api.internal.au */
public final class C3298au implements C3313bh, C3347cl {

    /* renamed from: a */
    final Map<C3247c<?>, C3255f> f9580a;

    /* renamed from: b */
    final Map<C3247c<?>, ConnectionResult> f9581b = new HashMap();

    /* renamed from: c */
    int f9582c;

    /* renamed from: d */
    final C3289al f9583d;

    /* renamed from: e */
    final C3314bi f9584e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Lock f9585f;

    /* renamed from: g */
    private final Condition f9586g;

    /* renamed from: h */
    private final Context f9587h;

    /* renamed from: i */
    private final C3407d f9588i;

    /* renamed from: j */
    private final C3300aw f9589j;

    /* renamed from: k */
    private final C3482e f9590k;

    /* renamed from: l */
    private final Map<C3244a<?>, Boolean> f9591l;

    /* renamed from: m */
    private final C3245a<? extends C4907e, C4902a> f9592m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public volatile C3297at f9593n;

    /* renamed from: o */
    private ConnectionResult f9594o = null;

    public C3298au(Context context, C3289al alVar, Lock lock, Looper looper, C3407d dVar, Map<C3247c<?>, C3255f> map, C3482e eVar, Map<C3244a<?>, Boolean> map2, C3245a<? extends C4907e, C4902a> aVar, ArrayList<C3346ck> arrayList, C3314bi biVar) {
        this.f9587h = context;
        this.f9585f = lock;
        this.f9588i = dVar;
        this.f9580a = map;
        this.f9590k = eVar;
        this.f9591l = map2;
        this.f9592m = aVar;
        this.f9583d = alVar;
        this.f9584e = biVar;
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            ((C3346ck) obj).mo13289a(this);
        }
        this.f9589j = new C3300aw(this, looper);
        this.f9586g = lock.newCondition();
        this.f9593n = new C3288ak(this);
    }

    /* renamed from: a */
    public final boolean mo13214a(C3375l lVar) {
        return false;
    }

    /* renamed from: h */
    public final void mo13222h() {
    }

    @GuardedBy("mLock")
    /* renamed from: a */
    public final <A extends C3246b, R extends C3391k, T extends C3333a<R, A>> T mo13207a(T t) {
        t.mo13166h();
        return this.f9593n.mo13185a(t);
    }

    @GuardedBy("mLock")
    /* renamed from: b */
    public final <A extends C3246b, T extends C3333a<? extends C3391k, A>> T mo13216b(T t) {
        t.mo13166h();
        return this.f9593n.mo13190b(t);
    }

    @GuardedBy("mLock")
    /* renamed from: a */
    public final void mo13208a() {
        this.f9593n.mo13192c();
    }

    @GuardedBy("mLock")
    /* renamed from: b */
    public final ConnectionResult mo13215b() {
        mo13208a();
        while (mo13221g()) {
            try {
                this.f9586g.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
        }
        if (mo13220f()) {
            return ConnectionResult.f9434a;
        }
        if (this.f9594o != null) {
            return this.f9594o;
        }
        return new ConnectionResult(13, null);
    }

    @GuardedBy("mLock")
    /* renamed from: c */
    public final void mo13217c() {
        if (this.f9593n.mo13191b()) {
            this.f9581b.clear();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo13218d() {
        this.f9585f.lock();
        try {
            C3389z zVar = new C3389z(this, this.f9590k, this.f9591l, this.f9588i, this.f9592m, this.f9585f, this.f9587h);
            this.f9593n = zVar;
            this.f9593n.mo13186a();
            this.f9586g.signalAll();
        } finally {
            this.f9585f.unlock();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo13219e() {
        this.f9585f.lock();
        try {
            this.f9583d.mo13196l();
            this.f9593n = new C3386w(this);
            this.f9593n.mo13186a();
            this.f9586g.signalAll();
        } finally {
            this.f9585f.unlock();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo13209a(ConnectionResult connectionResult) {
        this.f9585f.lock();
        try {
            this.f9594o = connectionResult;
            this.f9593n = new C3288ak(this);
            this.f9593n.mo13186a();
            this.f9586g.signalAll();
        } finally {
            this.f9585f.unlock();
        }
    }

    /* renamed from: f */
    public final boolean mo13220f() {
        return this.f9593n instanceof C3386w;
    }

    /* renamed from: g */
    public final boolean mo13221g() {
        return this.f9593n instanceof C3389z;
    }

    @GuardedBy("mLock")
    /* renamed from: i */
    public final void mo13223i() {
        if (mo13220f()) {
            ((C3386w) this.f9593n).mo13371d();
        }
    }

    /* renamed from: a */
    public final void mo13210a(ConnectionResult connectionResult, C3244a<?> aVar, boolean z) {
        this.f9585f.lock();
        try {
            this.f9593n.mo13189a(connectionResult, aVar, z);
        } finally {
            this.f9585f.unlock();
        }
    }

    public final void onConnected(Bundle bundle) {
        this.f9585f.lock();
        try {
            this.f9593n.mo13188a(bundle);
        } finally {
            this.f9585f.unlock();
        }
    }

    public final void onConnectionSuspended(int i) {
        this.f9585f.lock();
        try {
            this.f9593n.mo13187a(i);
        } finally {
            this.f9585f.unlock();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo13211a(C3299av avVar) {
        this.f9589j.sendMessage(this.f9589j.obtainMessage(1, avVar));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo13212a(RuntimeException runtimeException) {
        this.f9589j.sendMessage(this.f9589j.obtainMessage(2, runtimeException));
    }

    /* renamed from: a */
    public final void mo13213a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String concat = String.valueOf(str).concat("  ");
        printWriter.append(str).append("mState=").println(this.f9593n);
        for (C3244a aVar : this.f9591l.keySet()) {
            printWriter.append(str).append(aVar.mo13090d()).println(":");
            ((C3255f) this.f9580a.get(aVar.mo13089c())).mo13097a(concat, fileDescriptor, printWriter, strArr);
        }
    }
}
