package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.p017v4.p023d.C0376a;
import android.view.View;
import com.google.android.gms.common.C3405c;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3244a.C3245a;
import com.google.android.gms.common.api.C3244a.C3246b;
import com.google.android.gms.common.api.C3244a.C3248d;
import com.google.android.gms.common.api.C3244a.C3248d.C3251c;
import com.google.android.gms.common.api.C3244a.C3248d.C3252d;
import com.google.android.gms.common.api.C3244a.C3255f;
import com.google.android.gms.common.api.internal.C3289al;
import com.google.android.gms.common.api.internal.C3324bs;
import com.google.android.gms.common.api.internal.C3332c.C3333a;
import com.google.android.gms.common.api.internal.C3338cd;
import com.google.android.gms.common.api.internal.C3346ck;
import com.google.android.gms.common.api.internal.C3367g;
import com.google.android.gms.common.api.internal.C3375l;
import com.google.android.gms.common.internal.C3482e;
import com.google.android.gms.common.internal.C3482e.C3484b;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.signin.C4902a;
import com.google.android.gms.signin.C4904b;
import com.google.android.gms.signin.C4907e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.api.f */
public abstract class C3266f {
    /* access modifiers changed from: private */
    @GuardedBy("sAllClients")

    /* renamed from: a */
    public static final Set<C3266f> f9487a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: com.google.android.gms.common.api.f$a */
    public static final class C3267a {

        /* renamed from: a */
        private Account f9488a;

        /* renamed from: b */
        private final Set<Scope> f9489b = new HashSet();

        /* renamed from: c */
        private final Set<Scope> f9490c = new HashSet();

        /* renamed from: d */
        private int f9491d;

        /* renamed from: e */
        private View f9492e;

        /* renamed from: f */
        private String f9493f;

        /* renamed from: g */
        private String f9494g;

        /* renamed from: h */
        private final Map<C3244a<?>, C3484b> f9495h = new C0376a();

        /* renamed from: i */
        private final Context f9496i;

        /* renamed from: j */
        private final Map<C3244a<?>, C3248d> f9497j = new C0376a();

        /* renamed from: k */
        private C3367g f9498k;

        /* renamed from: l */
        private int f9499l = -1;

        /* renamed from: m */
        private C3269c f9500m;

        /* renamed from: n */
        private Looper f9501n;

        /* renamed from: o */
        private C3405c f9502o = C3405c.m12234a();

        /* renamed from: p */
        private C3245a<? extends C4907e, C4902a> f9503p = C4904b.f16041a;

        /* renamed from: q */
        private final ArrayList<C3268b> f9504q = new ArrayList<>();

        /* renamed from: r */
        private final ArrayList<C3269c> f9505r = new ArrayList<>();

        /* renamed from: s */
        private boolean f9506s = false;

        public C3267a(Context context) {
            this.f9496i = context;
            this.f9501n = context.getMainLooper();
            this.f9493f = context.getPackageName();
            this.f9494g = context.getClass().getName();
        }

        /* renamed from: a */
        public final C3267a mo13146a(Handler handler) {
            C3513t.m12626a(handler, (Object) "Handler must not be null");
            this.f9501n = handler.getLooper();
            return this;
        }

        /* renamed from: a */
        public final C3267a mo13149a(C3268b bVar) {
            C3513t.m12626a(bVar, (Object) "Listener must not be null");
            this.f9504q.add(bVar);
            return this;
        }

        /* renamed from: a */
        public final C3267a mo13150a(C3269c cVar) {
            C3513t.m12626a(cVar, (Object) "Listener must not be null");
            this.f9505r.add(cVar);
            return this;
        }

        /* renamed from: a */
        public final C3267a mo13147a(C3244a<? extends C3252d> aVar) {
            C3513t.m12626a(aVar, (Object) "Api must not be null");
            this.f9497j.put(aVar, null);
            List a = aVar.mo13087a().mo12939a(null);
            this.f9490c.addAll(a);
            this.f9489b.addAll(a);
            return this;
        }

        /* renamed from: a */
        public final <O extends C3251c> C3267a mo13148a(C3244a<O> aVar, O o) {
            C3513t.m12626a(aVar, (Object) "Api must not be null");
            C3513t.m12626a(o, (Object) "Null options are not permitted for this Api");
            this.f9497j.put(aVar, o);
            List a = aVar.mo13087a().mo12939a(o);
            this.f9490c.addAll(a);
            this.f9489b.addAll(a);
            return this;
        }

        /* renamed from: a */
        public final C3482e mo13151a() {
            C4902a aVar = C4902a.f16032a;
            if (this.f9497j.containsKey(C4904b.f16042b)) {
                aVar = (C4902a) this.f9497j.get(C4904b.f16042b);
            }
            C3482e eVar = new C3482e(this.f9488a, this.f9489b, this.f9495h, this.f9491d, this.f9492e, this.f9493f, this.f9494g, aVar);
            return eVar;
        }

        /* renamed from: b */
        public final C3266f mo13152b() {
            boolean z;
            boolean z2 = true;
            C3513t.m12636b(!this.f9497j.isEmpty(), "must call addApi() to add at least one API");
            C3482e a = mo13151a();
            C3244a aVar = null;
            Map f = a.mo13577f();
            C0376a aVar2 = new C0376a();
            C0376a aVar3 = new C0376a();
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f9497j.keySet().iterator();
            boolean z3 = false;
            while (it.hasNext()) {
                C3244a aVar4 = (C3244a) it.next();
                Object obj = this.f9497j.get(aVar4);
                boolean z4 = f.get(aVar4) != null ? z2 : false;
                aVar2.put(aVar4, Boolean.valueOf(z4));
                C3346ck ckVar = new C3346ck(aVar4, z4);
                arrayList.add(ckVar);
                C3245a b = aVar4.mo13088b();
                C3245a aVar5 = b;
                C3346ck ckVar2 = ckVar;
                Map map = f;
                C3244a aVar6 = aVar4;
                Iterator it2 = it;
                C3255f a2 = b.mo12938a(this.f9496i, this.f9501n, a, obj, ckVar2, ckVar2);
                aVar3.put(aVar6.mo13089c(), a2);
                if (aVar5.mo13093a() == 1) {
                    z3 = obj != null;
                }
                if (a2.mo13016c()) {
                    if (aVar != null) {
                        String d = aVar6.mo13090d();
                        String d2 = aVar.mo13090d();
                        StringBuilder sb = new StringBuilder(21 + String.valueOf(d).length() + String.valueOf(d2).length());
                        sb.append(d);
                        sb.append(" cannot be used with ");
                        sb.append(d2);
                        throw new IllegalStateException(sb.toString());
                    }
                    aVar = aVar6;
                }
                f = map;
                it = it2;
                z2 = true;
            }
            if (aVar == null) {
                z = true;
            } else if (z3) {
                String d3 = aVar.mo13090d();
                StringBuilder sb2 = new StringBuilder(82 + String.valueOf(d3).length());
                sb2.append("With using ");
                sb2.append(d3);
                sb2.append(", GamesOptions can only be specified within GoogleSignInOptions.Builder");
                throw new IllegalStateException(sb2.toString());
            } else {
                z = true;
                C3513t.m12633a(this.f9488a == null, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", aVar.mo13090d());
                C3513t.m12633a(this.f9489b.equals(this.f9490c), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", aVar.mo13090d());
            }
            C3482e eVar = a;
            C3289al alVar = new C3289al(this.f9496i, new ReentrantLock(), this.f9501n, eVar, this.f9502o, this.f9503p, aVar2, this.f9504q, this.f9505r, aVar3, this.f9499l, C3289al.m11733a((Iterable<C3255f>) aVar3.values(), z), arrayList, false);
            synchronized (C3266f.f9487a) {
                try {
                    C3266f.f9487a.add(alVar);
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            if (this.f9499l >= 0) {
                C3338cd.m11904b(this.f9498k).mo13276a(this.f9499l, alVar, this.f9500m);
            }
            return alVar;
        }
    }

    /* renamed from: com.google.android.gms.common.api.f$b */
    public interface C3268b {
        void onConnected(Bundle bundle);

        void onConnectionSuspended(int i);
    }

    /* renamed from: com.google.android.gms.common.api.f$c */
    public interface C3269c {
        void onConnectionFailed(ConnectionResult connectionResult);
    }

    /* renamed from: a */
    public abstract void mo13130a(C3269c cVar);

    /* renamed from: a */
    public abstract void mo13132a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: b */
    public abstract void mo13136b(C3269c cVar);

    /* renamed from: e */
    public abstract void mo13140e();

    /* renamed from: f */
    public abstract ConnectionResult mo13141f();

    /* renamed from: g */
    public abstract void mo13142g();

    /* renamed from: h */
    public abstract void mo13143h();

    /* renamed from: i */
    public abstract C3270g<Status> mo13144i();

    /* renamed from: j */
    public abstract boolean mo13145j();

    /* renamed from: a */
    public static Set<C3266f> m11650a() {
        Set<C3266f> set;
        synchronized (f9487a) {
            set = f9487a;
        }
        return set;
    }

    /* renamed from: a */
    public <A extends C3246b, R extends C3391k, T extends C3333a<R, A>> T mo13128a(T t) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public <A extends C3246b, T extends C3333a<? extends C3391k, A>> T mo13135b(T t) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public Context mo13134b() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public Looper mo13138c() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public boolean mo13133a(C3375l lVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public void mo13139d() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo13129a(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo13131a(C3324bs bsVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public void mo13137b(C3324bs bsVar) {
        throw new UnsupportedOperationException();
    }
}
