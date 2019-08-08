package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.C2960a;
import com.google.android.gms.ads.C2973d;
import com.google.android.gms.ads.C2978e;
import com.google.android.gms.ads.C3000i;
import com.google.android.gms.ads.C3140j;
import com.google.android.gms.ads.doubleclick.C2974a;
import com.google.android.gms.ads.doubleclick.C2976c;
import com.google.android.gms.p137b.C3235a;
import com.google.android.gms.p137b.C3238b;
import java.util.concurrent.atomic.AtomicBoolean;

@C3718cm
public final class aqn {

    /* renamed from: a */
    private final bbz f11684a;

    /* renamed from: b */
    private final aoe f11685b;

    /* renamed from: c */
    private final AtomicBoolean f11686c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C3000i f11687d;

    /* renamed from: e */
    private final aos f11688e;

    /* renamed from: f */
    private anw f11689f;

    /* renamed from: g */
    private C2960a f11690g;

    /* renamed from: h */
    private C2973d[] f11691h;

    /* renamed from: i */
    private C2974a f11692i;

    /* renamed from: j */
    private C2978e f11693j;

    /* renamed from: k */
    private aph f11694k;

    /* renamed from: l */
    private C2976c f11695l;

    /* renamed from: m */
    private C3140j f11696m;

    /* renamed from: n */
    private String f11697n;

    /* renamed from: o */
    private ViewGroup f11698o;

    /* renamed from: p */
    private int f11699p;

    /* renamed from: q */
    private boolean f11700q;

    public aqn(ViewGroup viewGroup, int i) {
        this(viewGroup, null, false, aoe.f11598a, i);
    }

    public aqn(ViewGroup viewGroup, AttributeSet attributeSet, boolean z) {
        this(viewGroup, attributeSet, z, aoe.f11598a, 0);
    }

    public aqn(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, int i) {
        this(viewGroup, attributeSet, false, aoe.f11598a, i);
    }

    private aqn(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, aoe aoe, int i) {
        this(viewGroup, attributeSet, z, aoe, null, i);
    }

    private aqn(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, aoe aoe, aph aph, int i) {
        this.f11684a = new bbz();
        this.f11687d = new C3000i();
        this.f11688e = new aqo(this);
        this.f11698o = viewGroup;
        this.f11685b = aoe;
        this.f11694k = null;
        this.f11686c = new AtomicBoolean(false);
        this.f11699p = i;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                zzjq zzjq = new zzjq(context, attributeSet);
                this.f11691h = zzjq.mo16271a(z);
                this.f11697n = zzjq.mo16270a();
                if (viewGroup.isInEditMode()) {
                    C3975lz a = aoq.m14615a();
                    C2973d dVar = this.f11691h[0];
                    int i2 = this.f11699p;
                    zzjn zzjn = new zzjn(context, dVar);
                    zzjn.f14552j = m14853a(i2);
                    a.mo15623a(viewGroup, zzjn, "Ads by Google");
                }
            } catch (IllegalArgumentException e) {
                aoq.m14615a().mo15624a(viewGroup, new zzjn(context, C2973d.f8691a), e.getMessage(), e.getMessage());
            }
        }
    }

    /* renamed from: a */
    private static zzjn m14852a(Context context, C2973d[] dVarArr, int i) {
        zzjn zzjn = new zzjn(context, dVarArr);
        zzjn.f14552j = m14853a(i);
        return zzjn;
    }

    /* renamed from: a */
    private static boolean m14853a(int i) {
        return i == 1;
    }

    /* renamed from: a */
    public final void mo14609a() {
        try {
            if (this.f11694k != null) {
                this.f11694k.mo12437j();
            }
        } catch (RemoteException e) {
            C3987mk.m17434d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo14610a(C2960a aVar) {
        this.f11690g = aVar;
        this.f11688e.mo14555a(aVar);
    }

    /* renamed from: a */
    public final void mo14611a(C2974a aVar) {
        try {
            this.f11692i = aVar;
            if (this.f11694k != null) {
                this.f11694k.mo12408a((apq) aVar != null ? new aog(aVar) : null);
            }
        } catch (RemoteException e) {
            C3987mk.m17434d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo14612a(C2976c cVar) {
        this.f11695l = cVar;
        try {
            if (this.f11694k != null) {
                this.f11694k.mo12411a((aso) cVar != null ? new asr(cVar) : null);
            }
        } catch (RemoteException e) {
            C3987mk.m17434d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo14613a(C2978e eVar) {
        this.f11693j = eVar;
        try {
            if (this.f11694k != null) {
                this.f11694k.mo12409a((apw) this.f11693j == null ? null : this.f11693j.mo12240a());
            }
        } catch (RemoteException e) {
            C3987mk.m17434d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo14614a(C3140j jVar) {
        this.f11696m = jVar;
        try {
            if (this.f11694k != null) {
                this.f11694k.mo12419a(jVar == null ? null : new zzmu(jVar));
            }
        } catch (RemoteException e) {
            C3987mk.m17434d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo14615a(anw anw) {
        try {
            this.f11689f = anw;
            if (this.f11694k != null) {
                this.f11694k.mo12405a((aot) anw != null ? new anx(anw) : null);
            }
        } catch (RemoteException e) {
            C3987mk.m17434d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo14616a(aql aql) {
        Object a;
        try {
            if (this.f11694k == null) {
                if ((this.f11691h == null || this.f11697n == null) && this.f11694k == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Context context = this.f11698o.getContext();
                zzjn a2 = m14852a(context, this.f11691h, this.f11699p);
                if ("search_v2".equals(a2.f14543a)) {
                    a = aoh.m14585a(context, false, (C3664a<T>) new aoj<T>(aoq.m14616b(), context, a2, this.f11697n));
                } else {
                    aoi aoi = new aoi(aoq.m14616b(), context, a2, this.f11697n, this.f11684a);
                    a = aoh.m14585a(context, false, (C3664a<T>) aoi);
                }
                this.f11694k = (aph) a;
                this.f11694k.mo12406a((aow) new any(this.f11688e));
                if (this.f11689f != null) {
                    this.f11694k.mo12405a((aot) new anx(this.f11689f));
                }
                if (this.f11692i != null) {
                    this.f11694k.mo12408a((apq) new aog(this.f11692i));
                }
                if (this.f11695l != null) {
                    this.f11694k.mo12411a((aso) new asr(this.f11695l));
                }
                if (this.f11693j != null) {
                    this.f11694k.mo12409a((apw) this.f11693j.mo12240a());
                }
                if (this.f11696m != null) {
                    this.f11694k.mo12419a(new zzmu(this.f11696m));
                }
                this.f11694k.mo12430b(this.f11700q);
                try {
                    C3235a k = this.f11694k.mo12438k();
                    if (k != null) {
                        this.f11698o.addView((View) C3238b.m11574a(k));
                    }
                } catch (RemoteException e) {
                    C3987mk.m17434d("#007 Could not call remote method.", e);
                }
            }
            if (this.f11694k.mo12431b(aoe.m14581a(this.f11698o.getContext(), aql))) {
                this.f11684a.mo15080a(aql.mo14594j());
            }
        } catch (RemoteException e2) {
            C3987mk.m17434d("#007 Could not call remote method.", e2);
        }
    }

    /* renamed from: a */
    public final void mo14617a(String str) {
        if (this.f11697n != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        this.f11697n = str;
    }

    /* renamed from: a */
    public final void mo14618a(boolean z) {
        this.f11700q = z;
        try {
            if (this.f11694k != null) {
                this.f11694k.mo12430b(this.f11700q);
            }
        } catch (RemoteException e) {
            C3987mk.m17434d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo14619a(C2973d... dVarArr) {
        if (this.f11691h != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        mo14621b(dVarArr);
    }

    /* renamed from: b */
    public final C2960a mo14620b() {
        return this.f11690g;
    }

    /* renamed from: b */
    public final void mo14621b(C2973d... dVarArr) {
        this.f11691h = dVarArr;
        try {
            if (this.f11694k != null) {
                this.f11694k.mo12417a(m14852a(this.f11698o.getContext(), this.f11691h, this.f11699p));
            }
        } catch (RemoteException e) {
            C3987mk.m17434d("#007 Could not call remote method.", e);
        }
        this.f11698o.requestLayout();
    }

    /* renamed from: c */
    public final C2973d mo14622c() {
        try {
            if (this.f11694k != null) {
                zzjn l = this.f11694k.mo12439l();
                if (l != null) {
                    return l.mo16268b();
                }
            }
        } catch (RemoteException e) {
            C3987mk.m17434d("#007 Could not call remote method.", e);
        }
        if (this.f11691h != null) {
            return this.f11691h[0];
        }
        return null;
    }

    /* renamed from: d */
    public final C2973d[] mo14623d() {
        return this.f11691h;
    }

    /* renamed from: e */
    public final String mo14624e() {
        if (this.f11697n == null && this.f11694k != null) {
            try {
                this.f11697n = this.f11694k.mo12395D();
            } catch (RemoteException e) {
                C3987mk.m17434d("#007 Could not call remote method.", e);
            }
        }
        return this.f11697n;
    }

    /* renamed from: f */
    public final C2974a mo14625f() {
        return this.f11692i;
    }

    /* renamed from: g */
    public final C2976c mo14626g() {
        return this.f11695l;
    }

    /* renamed from: h */
    public final void mo14627h() {
        try {
            if (this.f11694k != null) {
                this.f11694k.mo12442o();
            }
        } catch (RemoteException e) {
            C3987mk.m17434d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: i */
    public final void mo14628i() {
        try {
            if (this.f11694k != null) {
                this.f11694k.mo12443p();
            }
        } catch (RemoteException e) {
            C3987mk.m17434d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: j */
    public final String mo14629j() {
        try {
            if (this.f11694k != null) {
                return this.f11694k.mo12509u_();
            }
        } catch (RemoteException e) {
            C3987mk.m17434d("#007 Could not call remote method.", e);
        }
        return null;
    }

    /* renamed from: k */
    public final C3000i mo14630k() {
        return this.f11687d;
    }

    /* renamed from: l */
    public final aqe mo14631l() {
        if (this.f11694k == null) {
            return null;
        }
        try {
            return this.f11694k.mo12447t();
        } catch (RemoteException e) {
            C3987mk.m17434d("#007 Could not call remote method.", e);
            return null;
        }
    }

    /* renamed from: m */
    public final C3140j mo14632m() {
        return this.f11696m;
    }
}
