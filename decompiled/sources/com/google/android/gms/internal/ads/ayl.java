package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.C3025aw;
import com.google.android.gms.ads.internal.C3049bt;
import com.google.android.gms.ads.internal.C3102m;
import com.google.android.gms.p137b.C3235a;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3718cm
public final class ayl extends C3666api {

    /* renamed from: a */
    private final String f12408a;

    /* renamed from: b */
    private boolean f12409b;

    /* renamed from: c */
    private final axa f12410c;

    /* renamed from: d */
    private C3102m f12411d;

    /* renamed from: e */
    private final ayc f12412e;

    public ayl(Context context, String str, bca bca, zzang zzang, C3049bt btVar) {
        this(str, new axa(context, bca, zzang, btVar));
    }

    private ayl(String str, axa axa) {
        this.f12408a = str;
        this.f12410c = axa;
        this.f12412e = new ayc();
        C3025aw.m10930r().mo14958a(axa);
    }

    /* renamed from: c */
    private final void m15740c() {
        if (this.f12411d == null) {
            this.f12411d = this.f12410c.mo14932a(this.f12408a);
            this.f12412e.mo14954a(this.f12411d);
        }
    }

    /* renamed from: D */
    public final String mo12395D() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    /* renamed from: E */
    public final apq mo12396E() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    /* renamed from: F */
    public final aow mo12397F() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    /* renamed from: I */
    public final void mo12456I() throws RemoteException {
        if (this.f12411d != null) {
            this.f12411d.mo12432c(this.f12409b);
            this.f12411d.mo12456I();
            return;
        }
        C3900je.m17435e("Interstitial ad must be loaded before showInterstitial().");
    }

    /* renamed from: a */
    public final String mo12504a() throws RemoteException {
        if (this.f12411d != null) {
            return this.f12411d.mo12504a();
        }
        return null;
    }

    /* renamed from: a */
    public final void mo12404a(C3649af afVar, String str) throws RemoteException {
        C3900je.m17435e("setPlayStorePurchaseParams is deprecated and should not be called.");
    }

    /* renamed from: a */
    public final void mo12405a(aot aot) throws RemoteException {
        this.f12412e.f12377e = aot;
        if (this.f12411d != null) {
            this.f12412e.mo14954a(this.f12411d);
        }
    }

    /* renamed from: a */
    public final void mo12406a(aow aow) throws RemoteException {
        this.f12412e.f12373a = aow;
        if (this.f12411d != null) {
            this.f12412e.mo14954a(this.f12411d);
        }
    }

    /* renamed from: a */
    public final void mo12407a(apm apm) throws RemoteException {
        this.f12412e.f12374b = apm;
        if (this.f12411d != null) {
            this.f12412e.mo14954a(this.f12411d);
        }
    }

    /* renamed from: a */
    public final void mo12408a(apq apq) throws RemoteException {
        this.f12412e.f12375c = apq;
        if (this.f12411d != null) {
            this.f12412e.mo14954a(this.f12411d);
        }
    }

    /* renamed from: a */
    public final void mo12409a(apw apw) throws RemoteException {
        m15740c();
        if (this.f12411d != null) {
            this.f12411d.mo12409a(apw);
        }
    }

    /* renamed from: a */
    public final void mo12411a(aso aso) throws RemoteException {
        this.f12412e.f12376d = aso;
        if (this.f12411d != null) {
            this.f12412e.mo14954a(this.f12411d);
        }
    }

    /* renamed from: a */
    public final void mo12413a(C3822gh ghVar) {
        this.f12412e.f12378f = ghVar;
        if (this.f12411d != null) {
            this.f12412e.mo14954a(this.f12411d);
        }
    }

    /* renamed from: a */
    public final void mo12416a(C4335y yVar) throws RemoteException {
        C3900je.m17435e("setInAppPurchaseListener is deprecated and should not be called.");
    }

    /* renamed from: a */
    public final void mo12417a(zzjn zzjn) throws RemoteException {
        if (this.f12411d != null) {
            this.f12411d.mo12417a(zzjn);
        }
    }

    /* renamed from: a */
    public final void mo12418a(zzlu zzlu) {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: a */
    public final void mo12419a(zzmu zzmu) {
        throw new IllegalStateException("getVideoController not implemented for interstitials");
    }

    /* renamed from: a */
    public final void mo12420a(String str) {
    }

    /* renamed from: b */
    public final void mo12430b(boolean z) throws RemoteException {
        m15740c();
        if (this.f12411d != null) {
            this.f12411d.mo12430b(z);
        }
    }

    /* renamed from: b */
    public final boolean mo12431b(zzjj zzjj) throws RemoteException {
        if (!ayf.m15701a(zzjj).contains("gw")) {
            m15740c();
        }
        if (ayf.m15701a(zzjj).contains("_skipMediation")) {
            m15740c();
        }
        if (zzjj.f14534j != null) {
            m15740c();
        }
        if (this.f12411d != null) {
            return this.f12411d.mo12431b(zzjj);
        }
        ayf r = C3025aw.m10930r();
        if (ayf.m15701a(zzjj).contains("_ad")) {
            r.mo14959b(zzjj, this.f12408a);
        }
        ayi a = r.mo14956a(zzjj, this.f12408a);
        if (a != null) {
            if (!a.f12394e) {
                a.mo14974a();
                ayk.m15729a().mo14979e();
            } else {
                ayk.m15729a().mo14978d();
            }
            this.f12411d = a.f12390a;
            a.f12392c.mo14935a(this.f12412e);
            this.f12412e.mo14954a(this.f12411d);
            return a.f12395f;
        }
        m15740c();
        ayk.m15729a().mo14979e();
        return this.f12411d.mo12431b(zzjj);
    }

    /* renamed from: c */
    public final void mo12432c(boolean z) {
        this.f12409b = z;
    }

    /* renamed from: j */
    public final void mo12437j() throws RemoteException {
        if (this.f12411d != null) {
            this.f12411d.mo12437j();
        }
    }

    /* renamed from: k */
    public final C3235a mo12438k() throws RemoteException {
        if (this.f12411d != null) {
            return this.f12411d.mo12438k();
        }
        return null;
    }

    /* renamed from: l */
    public final zzjn mo12439l() throws RemoteException {
        if (this.f12411d != null) {
            return this.f12411d.mo12439l();
        }
        return null;
    }

    /* renamed from: m */
    public final boolean mo12440m() throws RemoteException {
        return this.f12411d != null && this.f12411d.mo12440m();
    }

    /* renamed from: n */
    public final void mo12441n() throws RemoteException {
        if (this.f12411d != null) {
            this.f12411d.mo12441n();
        } else {
            C3900je.m17435e("Interstitial ad must be loaded before pingManualTrackingUrl().");
        }
    }

    /* renamed from: o */
    public final void mo12442o() throws RemoteException {
        if (this.f12411d != null) {
            this.f12411d.mo12442o();
        }
    }

    /* renamed from: p */
    public final void mo12443p() throws RemoteException {
        if (this.f12411d != null) {
            this.f12411d.mo12443p();
        }
    }

    /* renamed from: q */
    public final Bundle mo12444q() throws RemoteException {
        return this.f12411d != null ? this.f12411d.mo12444q() : new Bundle();
    }

    /* renamed from: r */
    public final void mo12445r() throws RemoteException {
        if (this.f12411d != null) {
            this.f12411d.mo12445r();
        }
    }

    /* renamed from: s */
    public final boolean mo12446s() throws RemoteException {
        return this.f12411d != null && this.f12411d.mo12446s();
    }

    /* renamed from: t */
    public final aqe mo12447t() {
        throw new IllegalStateException("getVideoController not implemented for interstitials");
    }

    /* renamed from: u_ */
    public final String mo12509u_() throws RemoteException {
        if (this.f12411d != null) {
            return this.f12411d.mo12509u_();
        }
        return null;
    }
}
