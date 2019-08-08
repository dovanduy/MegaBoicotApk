package com.google.android.gms.internal.ads;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.iz */
public abstract class C3894iz implements C3929kg<C4008ne> {

    /* renamed from: a */
    private final Runnable f13368a = new C3896ja(this);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public volatile Thread f13369b;

    /* renamed from: c */
    private boolean f13370c = false;

    public C3894iz() {
    }

    public C3894iz(boolean z) {
    }

    /* renamed from: a */
    public abstract void mo12687a();

    /* renamed from: b */
    public final void mo14343b() {
        mo12688e_();
        if (this.f13369b != null) {
            this.f13369b.interrupt();
        }
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo14344c() {
        return this.f13370c ? C3907jl.m17121b(this.f13368a) : C3907jl.m17118a(this.f13368a);
    }

    /* renamed from: e_ */
    public abstract void mo12688e_();

    /* renamed from: h */
    public final C4008ne mo15475h() {
        return this.f13370c ? C3907jl.m17121b(this.f13368a) : C3907jl.m17118a(this.f13368a);
    }
}
