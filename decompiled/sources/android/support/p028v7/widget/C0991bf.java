package android.support.p028v7.widget;

import android.support.p017v4.p023d.C0376a;
import android.support.p017v4.p023d.C0383f;
import android.support.p017v4.p023d.C0393k.C0394a;
import android.support.p017v4.p023d.C0393k.C0395b;
import android.support.p028v7.widget.RecyclerView.C0875f.C0878c;
import android.support.p028v7.widget.RecyclerView.C0901v;

/* renamed from: android.support.v7.widget.bf */
/* compiled from: ViewInfoStore */
class C0991bf {

    /* renamed from: a */
    final C0376a<C0901v, C0992a> f3281a = new C0376a<>();

    /* renamed from: b */
    final C0383f<C0901v> f3282b = new C0383f<>();

    /* renamed from: android.support.v7.widget.bf$a */
    /* compiled from: ViewInfoStore */
    static class C0992a {

        /* renamed from: d */
        static C0394a<C0992a> f3283d = new C0395b(20);

        /* renamed from: a */
        int f3284a;

        /* renamed from: b */
        C0878c f3285b;

        /* renamed from: c */
        C0878c f3286c;

        private C0992a() {
        }

        /* renamed from: a */
        static C0992a m4478a() {
            C0992a aVar = (C0992a) f3283d.mo1391a();
            return aVar == null ? new C0992a() : aVar;
        }

        /* renamed from: a */
        static void m4479a(C0992a aVar) {
            aVar.f3284a = 0;
            aVar.f3285b = null;
            aVar.f3286c = null;
            f3283d.mo1392a(aVar);
        }

        /* renamed from: b */
        static void m4480b() {
            do {
            } while (f3283d.mo1391a() != null);
        }
    }

    /* renamed from: android.support.v7.widget.bf$b */
    /* compiled from: ViewInfoStore */
    interface C0993b {
        /* renamed from: a */
        void mo4168a(C0901v vVar);

        /* renamed from: a */
        void mo4169a(C0901v vVar, C0878c cVar, C0878c cVar2);

        /* renamed from: b */
        void mo4170b(C0901v vVar, C0878c cVar, C0878c cVar2);

        /* renamed from: c */
        void mo4171c(C0901v vVar, C0878c cVar, C0878c cVar2);
    }

    C0991bf() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5166a() {
        this.f3281a.clear();
        this.f3282b.mo1314c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5168a(C0901v vVar, C0878c cVar) {
        C0992a aVar = (C0992a) this.f3281a.get(vVar);
        if (aVar == null) {
            aVar = C0992a.m4478a();
            this.f3281a.put(vVar, aVar);
        }
        aVar.f3285b = cVar;
        aVar.f3284a |= 4;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo5170a(C0901v vVar) {
        C0992a aVar = (C0992a) this.f3281a.get(vVar);
        if (aVar == null || (aVar.f3284a & 1) == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C0878c mo5171b(C0901v vVar) {
        return m4461a(vVar, 4);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C0878c mo5174c(C0901v vVar) {
        return m4461a(vVar, 8);
    }

    /* renamed from: a */
    private C0878c m4461a(C0901v vVar, int i) {
        C0878c cVar;
        int a = this.f3281a.mo1394a((Object) vVar);
        if (a < 0) {
            return null;
        }
        C0992a aVar = (C0992a) this.f3281a.mo1400c(a);
        if (aVar == null || (aVar.f3284a & i) == 0) {
            return null;
        }
        aVar.f3284a &= i ^ -1;
        if (i == 4) {
            cVar = aVar.f3285b;
        } else if (i == 8) {
            cVar = aVar.f3286c;
        } else {
            throw new IllegalArgumentException("Must provide flag PRE or POST");
        }
        if ((aVar.f3284a & 12) == 0) {
            this.f3281a.mo1404d(a);
            C0992a.m4479a(aVar);
        }
        return cVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5167a(long j, C0901v vVar) {
        this.f3282b.mo1312b(j, vVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo5173b(C0901v vVar, C0878c cVar) {
        C0992a aVar = (C0992a) this.f3281a.get(vVar);
        if (aVar == null) {
            aVar = C0992a.m4478a();
            this.f3281a.put(vVar, aVar);
        }
        aVar.f3284a |= 2;
        aVar.f3285b = cVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo5176d(C0901v vVar) {
        C0992a aVar = (C0992a) this.f3281a.get(vVar);
        return (aVar == null || (aVar.f3284a & 4) == 0) ? false : true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0901v mo5165a(long j) {
        return (C0901v) this.f3282b.mo1306a(j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo5175c(C0901v vVar, C0878c cVar) {
        C0992a aVar = (C0992a) this.f3281a.get(vVar);
        if (aVar == null) {
            aVar = C0992a.m4478a();
            this.f3281a.put(vVar, aVar);
        }
        aVar.f3286c = cVar;
        aVar.f3284a |= 8;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo5177e(C0901v vVar) {
        C0992a aVar = (C0992a) this.f3281a.get(vVar);
        if (aVar == null) {
            aVar = C0992a.m4478a();
            this.f3281a.put(vVar, aVar);
        }
        aVar.f3284a |= 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo5178f(C0901v vVar) {
        C0992a aVar = (C0992a) this.f3281a.get(vVar);
        if (aVar != null) {
            aVar.f3284a &= -2;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5169a(C0993b bVar) {
        for (int size = this.f3281a.size() - 1; size >= 0; size--) {
            C0901v vVar = (C0901v) this.f3281a.mo1399b(size);
            C0992a aVar = (C0992a) this.f3281a.mo1404d(size);
            if ((aVar.f3284a & 3) == 3) {
                bVar.mo4168a(vVar);
            } else if ((aVar.f3284a & 1) != 0) {
                if (aVar.f3285b == null) {
                    bVar.mo4168a(vVar);
                } else {
                    bVar.mo4169a(vVar, aVar.f3285b, aVar.f3286c);
                }
            } else if ((aVar.f3284a & 14) == 14) {
                bVar.mo4170b(vVar, aVar.f3285b, aVar.f3286c);
            } else if ((aVar.f3284a & 12) == 12) {
                bVar.mo4171c(vVar, aVar.f3285b, aVar.f3286c);
            } else if ((aVar.f3284a & 4) != 0) {
                bVar.mo4169a(vVar, aVar.f3285b, null);
            } else if ((aVar.f3284a & 8) != 0) {
                bVar.mo4170b(vVar, aVar.f3285b, aVar.f3286c);
            } else {
                int i = aVar.f3284a;
            }
            C0992a.m4479a(aVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo5179g(C0901v vVar) {
        int b = this.f3282b.mo1309b() - 1;
        while (true) {
            if (b < 0) {
                break;
            } else if (vVar == this.f3282b.mo1313c(b)) {
                this.f3282b.mo1308a(b);
                break;
            } else {
                b--;
            }
        }
        C0992a aVar = (C0992a) this.f3281a.remove(vVar);
        if (aVar != null) {
            C0992a.m4479a(aVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo5172b() {
        C0992a.m4480b();
    }

    /* renamed from: h */
    public void mo5180h(C0901v vVar) {
        mo5178f(vVar);
    }
}
