package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.C3025aw;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.ix */
public final class C3892ix implements alb {

    /* renamed from: a */
    private final Object f13362a;

    /* renamed from: b */
    private final C3888it f13363b;

    /* renamed from: c */
    private final HashSet<C3880il> f13364c;

    /* renamed from: d */
    private final HashSet<C3891iw> f13365d;

    public C3892ix() {
        this(aoq.m14617c());
    }

    private C3892ix(String str) {
        this.f13362a = new Object();
        this.f13364c = new HashSet<>();
        this.f13365d = new HashSet<>();
        this.f13363b = new C3888it(str);
    }

    /* renamed from: a */
    public final Bundle mo15468a(Context context, C3889iu iuVar, String str) {
        Bundle bundle;
        synchronized (this.f13362a) {
            bundle = new Bundle();
            bundle.putBundle("app", this.f13363b.mo15458a(context, str));
            Bundle bundle2 = new Bundle();
            Iterator it = this.f13365d.iterator();
            while (it.hasNext()) {
                C3891iw iwVar = (C3891iw) it.next();
                bundle2.putBundle(iwVar.mo15463a(), iwVar.mo15465b());
            }
            bundle.putBundle("slots", bundle2);
            ArrayList arrayList = new ArrayList();
            Iterator it2 = this.f13364c.iterator();
            while (it2.hasNext()) {
                arrayList.add(((C3880il) it2.next()).mo15421d());
            }
            bundle.putParcelableArrayList("ads", arrayList);
            iuVar.mo12423a(this.f13364c);
            this.f13364c.clear();
        }
        return bundle;
    }

    /* renamed from: a */
    public final void mo15469a() {
        synchronized (this.f13362a) {
            this.f13363b.mo15459a();
        }
    }

    /* renamed from: a */
    public final void mo15470a(C3880il ilVar) {
        synchronized (this.f13362a) {
            this.f13364c.add(ilVar);
        }
    }

    /* renamed from: a */
    public final void mo15471a(C3891iw iwVar) {
        synchronized (this.f13362a) {
            this.f13365d.add(iwVar);
        }
    }

    /* renamed from: a */
    public final void mo15472a(zzjj zzjj, long j) {
        synchronized (this.f13362a) {
            this.f13363b.mo15460a(zzjj, j);
        }
    }

    /* renamed from: a */
    public final void mo15473a(HashSet<C3880il> hashSet) {
        synchronized (this.f13362a) {
            this.f13364c.addAll(hashSet);
        }
    }

    /* renamed from: a */
    public final void mo14477a(boolean z) {
        long a = C3025aw.m10924l().mo13694a();
        if (z) {
            if (a - C3025aw.m10921i().mo15449l().mo15507i() > ((Long) aoq.m14620f().mo14695a(aru.f11784aI)).longValue()) {
                this.f13363b.f13347a = -1;
                return;
            }
            this.f13363b.f13347a = C3025aw.m10921i().mo15449l().mo15508j();
            return;
        }
        C3025aw.m10921i().mo15449l().mo15483a(a);
        C3025aw.m10921i().mo15449l().mo15490b(this.f13363b.f13347a);
    }

    /* renamed from: b */
    public final void mo15474b() {
        synchronized (this.f13362a) {
            this.f13363b.mo15461b();
        }
    }
}
