package android.support.p028v7.view;

import android.support.p017v4.view.C0602v;
import android.support.p017v4.view.C0606w;
import android.support.p017v4.view.C0607x;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: android.support.v7.view.h */
/* compiled from: ViewPropertyAnimatorCompatSet */
public class C0772h {

    /* renamed from: a */
    final ArrayList<C0602v> f2212a = new ArrayList<>();

    /* renamed from: b */
    C0606w f2213b;

    /* renamed from: c */
    private long f2214c = -1;

    /* renamed from: d */
    private Interpolator f2215d;

    /* renamed from: e */
    private boolean f2216e;

    /* renamed from: f */
    private final C0607x f2217f = new C0607x() {

        /* renamed from: b */
        private boolean f2219b = false;

        /* renamed from: c */
        private int f2220c = 0;

        /* renamed from: a */
        public void mo2131a(View view) {
            if (!this.f2219b) {
                this.f2219b = true;
                if (C0772h.this.f2213b != null) {
                    C0772h.this.f2213b.mo2131a(null);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3001a() {
            this.f2220c = 0;
            this.f2219b = false;
            C0772h.this.mo2999b();
        }

        /* renamed from: b */
        public void mo2132b(View view) {
            int i = this.f2220c + 1;
            this.f2220c = i;
            if (i == C0772h.this.f2212a.size()) {
                if (C0772h.this.f2213b != null) {
                    C0772h.this.f2213b.mo2132b(null);
                }
                mo3001a();
            }
        }
    };

    /* renamed from: a */
    public C0772h mo2994a(C0602v vVar) {
        if (!this.f2216e) {
            this.f2212a.add(vVar);
        }
        return this;
    }

    /* renamed from: a */
    public C0772h mo2995a(C0602v vVar, C0602v vVar2) {
        this.f2212a.add(vVar);
        vVar2.mo2124b(vVar.mo2117a());
        this.f2212a.add(vVar2);
        return this;
    }

    /* renamed from: a */
    public void mo2998a() {
        if (!this.f2216e) {
            Iterator it = this.f2212a.iterator();
            while (it.hasNext()) {
                C0602v vVar = (C0602v) it.next();
                if (this.f2214c >= 0) {
                    vVar.mo2119a(this.f2214c);
                }
                if (this.f2215d != null) {
                    vVar.mo2122a(this.f2215d);
                }
                if (this.f2213b != null) {
                    vVar.mo2120a((C0606w) this.f2217f);
                }
                vVar.mo2126c();
            }
            this.f2216e = true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2999b() {
        this.f2216e = false;
    }

    /* renamed from: c */
    public void mo3000c() {
        if (this.f2216e) {
            Iterator it = this.f2212a.iterator();
            while (it.hasNext()) {
                ((C0602v) it.next()).mo2125b();
            }
            this.f2216e = false;
        }
    }

    /* renamed from: a */
    public C0772h mo2993a(long j) {
        if (!this.f2216e) {
            this.f2214c = j;
        }
        return this;
    }

    /* renamed from: a */
    public C0772h mo2997a(Interpolator interpolator) {
        if (!this.f2216e) {
            this.f2215d = interpolator;
        }
        return this;
    }

    /* renamed from: a */
    public C0772h mo2996a(C0606w wVar) {
        if (!this.f2216e) {
            this.f2213b = wVar;
        }
        return this;
    }
}
