package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.support.p017v4.p023d.C0376a;
import android.support.p017v4.p023d.C0378b;
import android.util.Log;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.gms.common.C3405c;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C3244a;
import com.google.android.gms.common.api.C3244a.C3246b;
import com.google.android.gms.common.api.C3244a.C3248d;
import com.google.android.gms.common.api.C3244a.C3255f;
import com.google.android.gms.common.api.C3263e;
import com.google.android.gms.common.api.C3266f.C3268b;
import com.google.android.gms.common.api.C3266f.C3269c;
import com.google.android.gms.common.api.C3391k;
import com.google.android.gms.common.api.C3396p;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C3304b.C3305a;
import com.google.android.gms.common.api.internal.C3332c.C3333a;
import com.google.android.gms.common.api.internal.C3369i.C3370a;
import com.google.android.gms.common.internal.C3469d.C3472c;
import com.google.android.gms.common.internal.C3469d.C3474e;
import com.google.android.gms.common.internal.C3493l;
import com.google.android.gms.common.internal.C3494m;
import com.google.android.gms.common.internal.C3504r;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.common.internal.C3515v;
import com.google.android.gms.common.util.C3550b;
import com.google.android.gms.common.util.C3563o;
import com.google.android.gms.internal.p145b.C4415f;
import com.google.android.gms.p143d.C3583g;
import com.google.android.gms.p143d.C3584h;
import com.google.android.gms.signin.C4907e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.api.internal.d */
public class C3360d implements Callback {

    /* renamed from: a */
    public static final Status f9738a = new Status(4, "Sign-out occurred while this API call was in progress.");
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Status f9739b = new Status(4, "The user must be signed in to make this API call.");
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final Object f9740f = new Object();
    @GuardedBy("lock")

    /* renamed from: g */
    private static C3360d f9741g;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public long f9742c = DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public long f9743d = 120000;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public long f9744e = 10000;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final Context f9745h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C3405c f9746i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C3493l f9747j;

    /* renamed from: k */
    private final AtomicInteger f9748k = new AtomicInteger(1);

    /* renamed from: l */
    private final AtomicInteger f9749l = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final Map<C3337cc<?>, C3361a<?>> f9750m = new ConcurrentHashMap(5, 0.75f, 1);
    /* access modifiers changed from: private */
    @GuardedBy("lock")

    /* renamed from: n */
    public C3383t f9751n = null;
    /* access modifiers changed from: private */
    @GuardedBy("lock")

    /* renamed from: o */
    public final Set<C3337cc<?>> f9752o = new C0378b();

    /* renamed from: p */
    private final Set<C3337cc<?>> f9753p = new C0378b();
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final Handler f9754q;

    /* renamed from: com.google.android.gms.common.api.internal.d$a */
    public class C3361a<O extends C3248d> implements C3268b, C3269c, C3347cl {

        /* renamed from: b */
        private final Queue<C3293ap> f9756b = new LinkedList();
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final C3255f f9757c;

        /* renamed from: d */
        private final C3246b f9758d;

        /* renamed from: e */
        private final C3337cc<O> f9759e;

        /* renamed from: f */
        private final C3381r f9760f;

        /* renamed from: g */
        private final Set<C3340ce> f9761g = new HashSet();

        /* renamed from: h */
        private final Map<C3370a<?>, C3316bk> f9762h = new HashMap();

        /* renamed from: i */
        private final int f9763i;

        /* renamed from: j */
        private final C3320bo f9764j;

        /* renamed from: k */
        private boolean f9765k;

        /* renamed from: l */
        private final List<C3362b> f9766l = new ArrayList();

        /* renamed from: m */
        private ConnectionResult f9767m = null;

        public C3361a(C3263e<O> eVar) {
            this.f9757c = eVar.mo13113a(C3360d.this.f9754q.getLooper(), this);
            if (this.f9757c instanceof C3515v) {
                this.f9758d = ((C3515v) this.f9757c).mo13018e();
            } else {
                this.f9758d = this.f9757c;
            }
            this.f9759e = eVar.mo13119d();
            this.f9760f = new C3381r();
            this.f9763i = eVar.mo13120e();
            if (this.f9757c.mo13101j()) {
                this.f9764j = eVar.mo13114a(C3360d.this.f9745h, C3360d.this.f9754q);
            } else {
                this.f9764j = null;
            }
        }

        public final void onConnected(Bundle bundle) {
            if (Looper.myLooper() == C3360d.this.f9754q.getLooper()) {
                m12071n();
            } else {
                C3360d.this.f9754q.post(new C3303az(this));
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: n */
        public final void m12071n() {
            mo13328d();
            m12069c(ConnectionResult.f9434a);
            m12074q();
            Iterator it = this.f9762h.values().iterator();
            while (it.hasNext()) {
                C3316bk bkVar = (C3316bk) it.next();
                if (m12057a(bkVar.f9616a.mo13360b()) != null) {
                    it.remove();
                } else {
                    try {
                        bkVar.f9616a.mo13359a(this.f9758d, new C3584h());
                    } catch (DeadObjectException unused) {
                        onConnectionSuspended(1);
                        this.f9757c.mo13098g();
                    } catch (RemoteException unused2) {
                        it.remove();
                    }
                }
            }
            m12073p();
            m12075r();
        }

        public final void onConnectionSuspended(int i) {
            if (Looper.myLooper() == C3360d.this.f9754q.getLooper()) {
                m12072o();
            } else {
                C3360d.this.f9754q.post(new C3306ba(this));
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: o */
        public final void m12072o() {
            mo13328d();
            this.f9765k = true;
            this.f9760f.mo13367c();
            C3360d.this.f9754q.sendMessageDelayed(Message.obtain(C3360d.this.f9754q, 9, this.f9759e), C3360d.this.f9742c);
            C3360d.this.f9754q.sendMessageDelayed(Message.obtain(C3360d.this.f9754q, 11, this.f9759e), C3360d.this.f9743d);
            C3360d.this.f9747j.mo13608a();
        }

        /* renamed from: a */
        public final void mo13322a(ConnectionResult connectionResult) {
            C3513t.m12630a(C3360d.this.f9754q);
            this.f9757c.mo13098g();
            onConnectionFailed(connectionResult);
        }

        /* renamed from: b */
        private final boolean m12066b(ConnectionResult connectionResult) {
            synchronized (C3360d.f9740f) {
                if (C3360d.this.f9751n == null || !C3360d.this.f9752o.contains(this.f9759e)) {
                    return false;
                }
                C3360d.this.f9751n.mo13282b(connectionResult, this.f9763i);
                return true;
            }
        }

        /* renamed from: a */
        public final void mo13210a(ConnectionResult connectionResult, C3244a<?> aVar, boolean z) {
            if (Looper.myLooper() == C3360d.this.f9754q.getLooper()) {
                onConnectionFailed(connectionResult);
            } else {
                C3360d.this.f9754q.post(new C3307bb(this, connectionResult));
            }
        }

        public final void onConnectionFailed(ConnectionResult connectionResult) {
            C3513t.m12630a(C3360d.this.f9754q);
            if (this.f9764j != null) {
                this.f9764j.mo13251b();
            }
            mo13328d();
            C3360d.this.f9747j.mo13608a();
            m12069c(connectionResult);
            if (connectionResult.mo13043c() == 4) {
                mo13323a(C3360d.f9739b);
            } else if (this.f9756b.isEmpty()) {
                this.f9767m = connectionResult;
            } else {
                if (!m12066b(connectionResult) && !C3360d.this.mo13314a(connectionResult, this.f9763i)) {
                    if (connectionResult.mo13043c() == 18) {
                        this.f9765k = true;
                    }
                    if (this.f9765k) {
                        C3360d.this.f9754q.sendMessageDelayed(Message.obtain(C3360d.this.f9754q, 9, this.f9759e), C3360d.this.f9742c);
                        return;
                    }
                    String a = this.f9759e.mo13272a();
                    StringBuilder sb = new StringBuilder(38 + String.valueOf(a).length());
                    sb.append("API: ");
                    sb.append(a);
                    sb.append(" is not available on this device.");
                    mo13323a(new Status(17, sb.toString()));
                }
            }
        }

        /* renamed from: p */
        private final void m12073p() {
            ArrayList arrayList = new ArrayList(this.f9756b);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                C3293ap apVar = (C3293ap) obj;
                if (!this.f9757c.mo13099h()) {
                    return;
                }
                if (m12067b(apVar)) {
                    this.f9756b.remove(apVar);
                }
            }
        }

        /* renamed from: a */
        public final void mo13324a(C3293ap apVar) {
            C3513t.m12630a(C3360d.this.f9754q);
            if (!this.f9757c.mo13099h()) {
                this.f9756b.add(apVar);
                if (this.f9767m == null || !this.f9767m.mo13041a()) {
                    mo13333i();
                } else {
                    onConnectionFailed(this.f9767m);
                }
            } else if (m12067b(apVar)) {
                m12075r();
            } else {
                this.f9756b.add(apVar);
            }
        }

        /* renamed from: a */
        public final void mo13321a() {
            C3513t.m12630a(C3360d.this.f9754q);
            mo13323a(C3360d.f9738a);
            this.f9760f.mo13366b();
            for (C3370a cbVar : (C3370a[]) this.f9762h.keySet().toArray(new C3370a[this.f9762h.size()])) {
                mo13324a((C3293ap) new C3336cb(cbVar, new C3584h()));
            }
            m12069c(new ConnectionResult(4));
            if (this.f9757c.mo13099h()) {
                this.f9757c.mo13095a((C3474e) new C3308bc(this));
            }
        }

        /* renamed from: b */
        public final C3255f mo13326b() {
            return this.f9757c;
        }

        /* renamed from: c */
        public final Map<C3370a<?>, C3316bk> mo13327c() {
            return this.f9762h;
        }

        /* renamed from: d */
        public final void mo13328d() {
            C3513t.m12630a(C3360d.this.f9754q);
            this.f9767m = null;
        }

        /* renamed from: e */
        public final ConnectionResult mo13329e() {
            C3513t.m12630a(C3360d.this.f9754q);
            return this.f9767m;
        }

        /* renamed from: b */
        private final boolean m12067b(C3293ap apVar) {
            if (!(apVar instanceof C3317bl)) {
                m12070c(apVar);
                return true;
            }
            C3317bl blVar = (C3317bl) apVar;
            Feature a = m12057a(blVar.mo13246b(this));
            if (a == null) {
                m12070c(apVar);
                return true;
            }
            if (blVar.mo13247c(this)) {
                C3362b bVar = new C3362b(this.f9759e, a, null);
                int indexOf = this.f9766l.indexOf(bVar);
                if (indexOf >= 0) {
                    C3362b bVar2 = (C3362b) this.f9766l.get(indexOf);
                    C3360d.this.f9754q.removeMessages(15, bVar2);
                    C3360d.this.f9754q.sendMessageDelayed(Message.obtain(C3360d.this.f9754q, 15, bVar2), C3360d.this.f9742c);
                } else {
                    this.f9766l.add(bVar);
                    C3360d.this.f9754q.sendMessageDelayed(Message.obtain(C3360d.this.f9754q, 15, bVar), C3360d.this.f9742c);
                    C3360d.this.f9754q.sendMessageDelayed(Message.obtain(C3360d.this.f9754q, 16, bVar), C3360d.this.f9743d);
                    ConnectionResult connectionResult = new ConnectionResult(2, null);
                    if (!m12066b(connectionResult)) {
                        C3360d.this.mo13314a(connectionResult, this.f9763i);
                    }
                }
            } else {
                blVar.mo13204a((RuntimeException) new C3396p(a));
            }
            return false;
        }

        /* renamed from: c */
        private final void m12070c(C3293ap apVar) {
            apVar.mo13203a(this.f9760f, mo13335k());
            try {
                apVar.mo13202a(this);
            } catch (DeadObjectException unused) {
                onConnectionSuspended(1);
                this.f9757c.mo13098g();
            }
        }

        /* renamed from: a */
        public final void mo13323a(Status status) {
            C3513t.m12630a(C3360d.this.f9754q);
            for (C3293ap a : this.f9756b) {
                a.mo13201a(status);
            }
            this.f9756b.clear();
        }

        /* renamed from: f */
        public final void mo13330f() {
            C3513t.m12630a(C3360d.this.f9754q);
            if (this.f9765k) {
                mo13333i();
            }
        }

        /* renamed from: q */
        private final void m12074q() {
            if (this.f9765k) {
                C3360d.this.f9754q.removeMessages(11, this.f9759e);
                C3360d.this.f9754q.removeMessages(9, this.f9759e);
                this.f9765k = false;
            }
        }

        /* renamed from: g */
        public final void mo13331g() {
            Status status;
            C3513t.m12630a(C3360d.this.f9754q);
            if (this.f9765k) {
                m12074q();
                if (C3360d.this.f9746i.mo13397a(C3360d.this.f9745h) == 18) {
                    status = new Status(8, "Connection timed out while waiting for Google Play services update to complete.");
                } else {
                    status = new Status(8, "API failed to connect while resuming due to an unknown error.");
                }
                mo13323a(status);
                this.f9757c.mo13098g();
            }
        }

        /* renamed from: r */
        private final void m12075r() {
            C3360d.this.f9754q.removeMessages(12, this.f9759e);
            C3360d.this.f9754q.sendMessageDelayed(C3360d.this.f9754q.obtainMessage(12, this.f9759e), C3360d.this.f9744e);
        }

        /* renamed from: h */
        public final boolean mo13332h() {
            return m12062a(true);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final boolean m12062a(boolean z) {
            C3513t.m12630a(C3360d.this.f9754q);
            if (!this.f9757c.mo13099h() || this.f9762h.size() != 0) {
                return false;
            }
            if (this.f9760f.mo13365a()) {
                if (z) {
                    m12075r();
                }
                return false;
            }
            this.f9757c.mo13098g();
            return true;
        }

        /* renamed from: i */
        public final void mo13333i() {
            C3513t.m12630a(C3360d.this.f9754q);
            if (!this.f9757c.mo13099h() && !this.f9757c.mo13100i()) {
                int a = C3360d.this.f9747j.mo13607a(C3360d.this.f9745h, this.f9757c);
                if (a != 0) {
                    onConnectionFailed(new ConnectionResult(a, null));
                    return;
                }
                C3363c cVar = new C3363c(this.f9757c, this.f9759e);
                if (this.f9757c.mo13101j()) {
                    this.f9764j.mo13250a((C3323br) cVar);
                }
                this.f9757c.mo13094a((C3472c) cVar);
            }
        }

        /* renamed from: a */
        public final void mo13325a(C3340ce ceVar) {
            C3513t.m12630a(C3360d.this.f9754q);
            this.f9761g.add(ceVar);
        }

        /* renamed from: c */
        private final void m12069c(ConnectionResult connectionResult) {
            for (C3340ce ceVar : this.f9761g) {
                String str = null;
                if (C3504r.m12550a(connectionResult, ConnectionResult.f9434a)) {
                    str = this.f9757c.mo13104m();
                }
                ceVar.mo13280a(this.f9759e, connectionResult, str);
            }
            this.f9761g.clear();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public final boolean mo13334j() {
            return this.f9757c.mo13099h();
        }

        /* renamed from: k */
        public final boolean mo13335k() {
            return this.f9757c.mo13101j();
        }

        /* renamed from: l */
        public final int mo13336l() {
            return this.f9763i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: m */
        public final C4907e mo13337m() {
            if (this.f9764j == null) {
                return null;
            }
            return this.f9764j.mo13249a();
        }

        /* renamed from: a */
        private final Feature m12057a(Feature[] featureArr) {
            if (featureArr == null || featureArr.length == 0) {
                return null;
            }
            Feature[] n = this.f9757c.mo13105n();
            if (n == null) {
                n = new Feature[0];
            }
            C0376a aVar = new C0376a(n.length);
            for (Feature feature : n) {
                aVar.put(feature.mo13050a(), Long.valueOf(feature.mo13051b()));
            }
            for (Feature feature2 : featureArr) {
                if (!aVar.containsKey(feature2.mo13050a()) || ((Long) aVar.get(feature2.mo13050a())).longValue() < feature2.mo13051b()) {
                    return feature2;
                }
            }
            return null;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m12060a(C3362b bVar) {
            if (this.f9766l.contains(bVar) && !this.f9765k) {
                if (!this.f9757c.mo13099h()) {
                    mo13333i();
                    return;
                }
                m12073p();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final void m12065b(C3362b bVar) {
            if (this.f9766l.remove(bVar)) {
                C3360d.this.f9754q.removeMessages(15, bVar);
                C3360d.this.f9754q.removeMessages(16, bVar);
                Feature b = bVar.f9769b;
                ArrayList arrayList = new ArrayList(this.f9756b.size());
                for (C3293ap apVar : this.f9756b) {
                    if (apVar instanceof C3317bl) {
                        Feature[] b2 = ((C3317bl) apVar).mo13246b(this);
                        if (b2 != null && C3550b.m12724a((T[]) b2, b)) {
                            arrayList.add(apVar);
                        }
                    }
                }
                ArrayList arrayList2 = arrayList;
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    C3293ap apVar2 = (C3293ap) obj;
                    this.f9756b.remove(apVar2);
                    apVar2.mo13204a((RuntimeException) new C3396p(b));
                }
            }
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.d$b */
    private static class C3362b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C3337cc<?> f9768a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final Feature f9769b;

        private C3362b(C3337cc<?> ccVar, Feature feature) {
            this.f9768a = ccVar;
            this.f9769b = feature;
        }

        public final boolean equals(Object obj) {
            if (obj == null || !(obj instanceof C3362b)) {
                return false;
            }
            C3362b bVar = (C3362b) obj;
            if (!C3504r.m12550a(this.f9768a, bVar.f9768a) || !C3504r.m12550a(this.f9769b, bVar.f9769b)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return C3504r.m12548a(this.f9768a, this.f9769b);
        }

        public final String toString() {
            return C3504r.m12549a((Object) this).mo13613a("key", this.f9768a).mo13613a("feature", this.f9769b).toString();
        }

        /* synthetic */ C3362b(C3337cc ccVar, Feature feature, C3302ay ayVar) {
            this(ccVar, feature);
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.d$c */
    private class C3363c implements C3323br, C3472c {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C3255f f9771b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final C3337cc<?> f9772c;

        /* renamed from: d */
        private C3494m f9773d = null;

        /* renamed from: e */
        private Set<Scope> f9774e = null;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public boolean f9775f = false;

        public C3363c(C3255f fVar, C3337cc<?> ccVar) {
            this.f9771b = fVar;
            this.f9772c = ccVar;
        }

        /* renamed from: a */
        public final void mo13180a(ConnectionResult connectionResult) {
            C3360d.this.f9754q.post(new C3310be(this, connectionResult));
        }

        /* renamed from: b */
        public final void mo13255b(ConnectionResult connectionResult) {
            ((C3361a) C3360d.this.f9750m.get(this.f9772c)).mo13322a(connectionResult);
        }

        /* renamed from: a */
        public final void mo13254a(C3494m mVar, Set<Scope> set) {
            if (mVar == null || set == null) {
                Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                mo13255b(new ConnectionResult(4));
                return;
            }
            this.f9773d = mVar;
            this.f9774e = set;
            m12097a();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m12097a() {
            if (this.f9775f && this.f9773d != null) {
                this.f9771b.mo13096a(this.f9773d, this.f9774e);
            }
        }
    }

    /* renamed from: a */
    public static C3360d m12032a(Context context) {
        C3360d dVar;
        synchronized (f9740f) {
            if (f9741g == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                f9741g = new C3360d(context.getApplicationContext(), handlerThread.getLooper(), C3405c.m12234a());
            }
            dVar = f9741g;
        }
        return dVar;
    }

    /* renamed from: a */
    public static C3360d m12031a() {
        C3360d dVar;
        synchronized (f9740f) {
            C3513t.m12626a(f9741g, (Object) "Must guarantee manager is non-null before using getInstance");
            dVar = f9741g;
        }
        return dVar;
    }

    /* renamed from: b */
    public static void m12034b() {
        synchronized (f9740f) {
            if (f9741g != null) {
                C3360d dVar = f9741g;
                dVar.f9749l.incrementAndGet();
                dVar.f9754q.sendMessageAtFrontOfQueue(dVar.f9754q.obtainMessage(10));
            }
        }
    }

    private C3360d(Context context, Looper looper, C3405c cVar) {
        this.f9745h = context;
        this.f9754q = new C4415f(looper, this);
        this.f9746i = cVar;
        this.f9747j = new C3493l(cVar);
        this.f9754q.sendMessage(this.f9754q.obtainMessage(6));
    }

    /* renamed from: c */
    public final int mo13317c() {
        return this.f9748k.getAndIncrement();
    }

    /* renamed from: a */
    public final void mo13311a(C3263e<?> eVar) {
        this.f9754q.sendMessage(this.f9754q.obtainMessage(7, eVar));
    }

    /* renamed from: b */
    private final void m12035b(C3263e<?> eVar) {
        C3337cc d = eVar.mo13119d();
        C3361a aVar = (C3361a) this.f9750m.get(d);
        if (aVar == null) {
            aVar = new C3361a(eVar);
            this.f9750m.put(d, aVar);
        }
        if (aVar.mo13335k()) {
            this.f9753p.add(d);
        }
        aVar.mo13333i();
    }

    /* renamed from: a */
    public final void mo13313a(C3383t tVar) {
        synchronized (f9740f) {
            if (this.f9751n != tVar) {
                this.f9751n = tVar;
                this.f9752o.clear();
            }
            this.f9752o.addAll(tVar.mo13368g());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo13316b(C3383t tVar) {
        synchronized (f9740f) {
            if (this.f9751n == tVar) {
                this.f9751n = null;
                this.f9752o.clear();
            }
        }
    }

    /* renamed from: a */
    public final C3583g<Map<C3337cc<?>, String>> mo13310a(Iterable<? extends C3263e<?>> iterable) {
        C3340ce ceVar = new C3340ce(iterable);
        this.f9754q.sendMessage(this.f9754q.obtainMessage(2, ceVar));
        return ceVar.mo13281b();
    }

    /* renamed from: d */
    public final void mo13318d() {
        this.f9754q.sendMessage(this.f9754q.obtainMessage(3));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo13319e() {
        this.f9749l.incrementAndGet();
        this.f9754q.sendMessage(this.f9754q.obtainMessage(10));
    }

    /* renamed from: a */
    public final <O extends C3248d> void mo13312a(C3263e<O> eVar, int i, C3333a<? extends C3391k, C3246b> aVar) {
        this.f9754q.sendMessage(this.f9754q.obtainMessage(4, new C3315bj(new C3335ca(i, aVar), this.f9749l.get(), eVar)));
    }

    public boolean handleMessage(Message message) {
        C3361a aVar;
        long j = 300000;
        switch (message.what) {
            case 1:
                if (((Boolean) message.obj).booleanValue()) {
                    j = 10000;
                }
                this.f9744e = j;
                this.f9754q.removeMessages(12);
                for (C3337cc obtainMessage : this.f9750m.keySet()) {
                    this.f9754q.sendMessageDelayed(this.f9754q.obtainMessage(12, obtainMessage), this.f9744e);
                }
                break;
            case 2:
                C3340ce ceVar = (C3340ce) message.obj;
                Iterator it = ceVar.mo13279a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        C3337cc ccVar = (C3337cc) it.next();
                        C3361a aVar2 = (C3361a) this.f9750m.get(ccVar);
                        if (aVar2 == null) {
                            ceVar.mo13280a(ccVar, new ConnectionResult(13), null);
                            break;
                        } else if (aVar2.mo13334j()) {
                            ceVar.mo13280a(ccVar, ConnectionResult.f9434a, aVar2.mo13326b().mo13104m());
                        } else if (aVar2.mo13329e() != null) {
                            ceVar.mo13280a(ccVar, aVar2.mo13329e(), null);
                        } else {
                            aVar2.mo13325a(ceVar);
                            aVar2.mo13333i();
                        }
                    }
                }
            case 3:
                for (C3361a aVar3 : this.f9750m.values()) {
                    aVar3.mo13328d();
                    aVar3.mo13333i();
                }
                break;
            case 4:
            case 8:
            case 13:
                C3315bj bjVar = (C3315bj) message.obj;
                C3361a aVar4 = (C3361a) this.f9750m.get(bjVar.f9615c.mo13119d());
                if (aVar4 == null) {
                    m12035b(bjVar.f9615c);
                    aVar4 = (C3361a) this.f9750m.get(bjVar.f9615c.mo13119d());
                }
                if (aVar4.mo13335k() && this.f9749l.get() != bjVar.f9614b) {
                    bjVar.f9613a.mo13201a(f9738a);
                    aVar4.mo13321a();
                    break;
                } else {
                    aVar4.mo13324a(bjVar.f9613a);
                    break;
                }
            case 5:
                int i = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator it2 = this.f9750m.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        aVar = (C3361a) it2.next();
                        if (aVar.mo13336l() == i) {
                        }
                    } else {
                        aVar = null;
                    }
                }
                if (aVar == null) {
                    StringBuilder sb = new StringBuilder(76);
                    sb.append("Could not find API instance ");
                    sb.append(i);
                    sb.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb.toString(), new Exception());
                    break;
                } else {
                    String b = this.f9746i.mo13409b(connectionResult.mo13043c());
                    String e = connectionResult.mo13045e();
                    StringBuilder sb2 = new StringBuilder(69 + String.valueOf(b).length() + String.valueOf(e).length());
                    sb2.append("Error resolution was canceled by the user, original error message: ");
                    sb2.append(b);
                    sb2.append(": ");
                    sb2.append(e);
                    aVar.mo13323a(new Status(17, sb2.toString()));
                    break;
                }
            case 6:
                if (C3563o.m12763b() && (this.f9745h.getApplicationContext() instanceof Application)) {
                    C3304b.m11809a((Application) this.f9745h.getApplicationContext());
                    C3304b.m11808a().mo13228a((C3305a) new C3302ay(this));
                    if (!C3304b.m11808a().mo13229a(true)) {
                        this.f9744e = 300000;
                        break;
                    }
                }
                break;
            case 7:
                m12035b((C3263e) message.obj);
                break;
            case 9:
                if (this.f9750m.containsKey(message.obj)) {
                    ((C3361a) this.f9750m.get(message.obj)).mo13330f();
                    break;
                }
                break;
            case 10:
                for (C3337cc remove : this.f9753p) {
                    ((C3361a) this.f9750m.remove(remove)).mo13321a();
                }
                this.f9753p.clear();
                break;
            case 11:
                if (this.f9750m.containsKey(message.obj)) {
                    ((C3361a) this.f9750m.get(message.obj)).mo13331g();
                    break;
                }
                break;
            case 12:
                if (this.f9750m.containsKey(message.obj)) {
                    ((C3361a) this.f9750m.get(message.obj)).mo13332h();
                    break;
                }
                break;
            case 14:
                C3384u uVar = (C3384u) message.obj;
                C3337cc a = uVar.mo13369a();
                if (this.f9750m.containsKey(a)) {
                    uVar.mo13370b().mo13722a(Boolean.valueOf(((C3361a) this.f9750m.get(a)).m12062a(false)));
                    break;
                } else {
                    uVar.mo13370b().mo13722a(Boolean.valueOf(false));
                    break;
                }
            case 15:
                C3362b bVar = (C3362b) message.obj;
                if (this.f9750m.containsKey(bVar.f9768a)) {
                    ((C3361a) this.f9750m.get(bVar.f9768a)).m12060a(bVar);
                    break;
                }
                break;
            case 16:
                C3362b bVar2 = (C3362b) message.obj;
                if (this.f9750m.containsKey(bVar2.f9768a)) {
                    ((C3361a) this.f9750m.get(bVar2.f9768a)).m12065b(bVar2);
                    break;
                }
                break;
            default:
                int i2 = message.what;
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i2);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final PendingIntent mo13309a(C3337cc<?> ccVar, int i) {
        C3361a aVar = (C3361a) this.f9750m.get(ccVar);
        if (aVar == null) {
            return null;
        }
        C4907e m = aVar.mo13337m();
        if (m == null) {
            return null;
        }
        return PendingIntent.getActivity(this.f9745h, i, m.mo13017d(), 134217728);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo13314a(ConnectionResult connectionResult, int i) {
        return this.f9746i.mo13407a(this.f9745h, connectionResult, i);
    }

    /* renamed from: b */
    public final void mo13315b(ConnectionResult connectionResult, int i) {
        if (!mo13314a(connectionResult, i)) {
            this.f9754q.sendMessage(this.f9754q.obtainMessage(5, i, 0, connectionResult));
        }
    }
}
