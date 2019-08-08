package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.C2960a;
import com.google.android.gms.ads.C2978e;
import com.google.android.gms.ads.doubleclick.C2974a;
import com.google.android.gms.ads.doubleclick.C2976c;
import com.google.android.gms.ads.doubleclick.C2977d;
import com.google.android.gms.ads.reward.C3167c;
import com.google.android.gms.ads.reward.C3168d;

@C3718cm
public final class aqq {

    /* renamed from: a */
    private final bbz f11702a;

    /* renamed from: b */
    private final Context f11703b;

    /* renamed from: c */
    private final aoe f11704c;

    /* renamed from: d */
    private C2960a f11705d;

    /* renamed from: e */
    private anw f11706e;

    /* renamed from: f */
    private aph f11707f;

    /* renamed from: g */
    private String f11708g;

    /* renamed from: h */
    private C3168d f11709h;

    /* renamed from: i */
    private C2974a f11710i;

    /* renamed from: j */
    private C2976c f11711j;

    /* renamed from: k */
    private C2978e f11712k;

    /* renamed from: l */
    private C3167c f11713l;

    /* renamed from: m */
    private boolean f11714m;

    /* renamed from: n */
    private boolean f11715n;

    public aqq(Context context) {
        this(context, aoe.f11598a, null);
    }

    private aqq(Context context, aoe aoe, C2977d dVar) {
        this.f11702a = new bbz();
        this.f11703b = context;
        this.f11704c = aoe;
    }

    /* renamed from: b */
    private final void m14881b(String str) {
        if (this.f11707f == null) {
            StringBuilder sb = new StringBuilder(63 + String.valueOf(str).length());
            sb.append("The ad unit ID must be set on InterstitialAd before ");
            sb.append(str);
            sb.append(" is called.");
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo14634a(C2960a aVar) {
        try {
            this.f11705d = aVar;
            if (this.f11707f != null) {
                this.f11707f.mo12406a((aow) aVar != null ? new any(aVar) : null);
            }
        } catch (RemoteException e) {
            C3987mk.m17434d("#008 Must be called on the main UI thread.", e);
        }
    }

    /* renamed from: a */
    public final void mo14635a(C3167c cVar) {
        try {
            this.f11713l = cVar;
            if (this.f11707f != null) {
                this.f11707f.mo12413a((C3822gh) cVar != null ? new C3827gm(cVar) : null);
            }
        } catch (RemoteException e) {
            C3987mk.m17434d("#008 Must be called on the main UI thread.", e);
        }
    }

    /* renamed from: a */
    public final void mo14636a(C3168d dVar) {
        try {
            this.f11709h = dVar;
            if (this.f11707f != null) {
                this.f11707f.mo12407a((apm) dVar != null ? new aob(dVar) : null);
            }
        } catch (RemoteException e) {
            C3987mk.m17434d("#008 Must be called on the main UI thread.", e);
        }
    }

    /* renamed from: a */
    public final void mo14637a(anw anw) {
        try {
            this.f11706e = anw;
            if (this.f11707f != null) {
                this.f11707f.mo12405a((aot) anw != null ? new anx(anw) : null);
            }
        } catch (RemoteException e) {
            C3987mk.m17434d("#008 Must be called on the main UI thread.", e);
        }
    }

    /* renamed from: a */
    public final void mo14638a(aql aql) {
        try {
            if (this.f11707f == null) {
                String str = "loadAd";
                if (this.f11708g == null) {
                    m14881b(str);
                }
                zzjn a = this.f11714m ? zzjn.m18802a() : new zzjn();
                aoh b = aoq.m14616b();
                Context context = this.f11703b;
                aok aok = new aok(b, context, a, this.f11708g, this.f11702a);
                this.f11707f = (aph) aoh.m14585a(context, false, (C3664a<T>) aok);
                if (this.f11705d != null) {
                    this.f11707f.mo12406a((aow) new any(this.f11705d));
                }
                if (this.f11706e != null) {
                    this.f11707f.mo12405a((aot) new anx(this.f11706e));
                }
                if (this.f11709h != null) {
                    this.f11707f.mo12407a((apm) new aob(this.f11709h));
                }
                if (this.f11710i != null) {
                    this.f11707f.mo12408a((apq) new aog(this.f11710i));
                }
                if (this.f11711j != null) {
                    this.f11707f.mo12411a((aso) new asr(this.f11711j));
                }
                if (this.f11712k != null) {
                    this.f11707f.mo12409a((apw) this.f11712k.mo12240a());
                }
                if (this.f11713l != null) {
                    this.f11707f.mo12413a((C3822gh) new C3827gm(this.f11713l));
                }
                this.f11707f.mo12432c(this.f11715n);
            }
            if (this.f11707f.mo12431b(aoe.m14581a(this.f11703b, aql))) {
                this.f11702a.mo15080a(aql.mo14594j());
            }
        } catch (RemoteException e) {
            C3987mk.m17434d("#008 Must be called on the main UI thread.", e);
        }
    }

    /* renamed from: a */
    public final void mo14639a(String str) {
        if (this.f11708g != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
        }
        this.f11708g = str;
    }

    /* renamed from: a */
    public final void mo14640a(boolean z) {
        this.f11714m = true;
    }

    /* renamed from: a */
    public final boolean mo14641a() {
        try {
            if (this.f11707f == null) {
                return false;
            }
            return this.f11707f.mo12440m();
        } catch (RemoteException e) {
            C3987mk.m17434d("#008 Must be called on the main UI thread.", e);
            return false;
        }
    }

    /* renamed from: b */
    public final Bundle mo14642b() {
        try {
            if (this.f11707f != null) {
                return this.f11707f.mo12444q();
            }
        } catch (RemoteException e) {
            C3987mk.m17434d("#008 Must be called on the main UI thread.", e);
        }
        return new Bundle();
    }

    /* renamed from: b */
    public final void mo14643b(boolean z) {
        try {
            this.f11715n = z;
            if (this.f11707f != null) {
                this.f11707f.mo12432c(z);
            }
        } catch (RemoteException e) {
            C3987mk.m17434d("#008 Must be called on the main UI thread.", e);
        }
    }

    /* renamed from: c */
    public final void mo14644c() {
        try {
            m14881b("show");
            this.f11707f.mo12456I();
        } catch (RemoteException e) {
            C3987mk.m17434d("#008 Must be called on the main UI thread.", e);
        }
    }
}
