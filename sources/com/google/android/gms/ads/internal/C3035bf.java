package com.google.android.gms.ads.internal;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.gmsg.C3067ae;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.internal.ads.C3663ao;
import com.google.android.gms.internal.ads.C3718cm;
import com.google.android.gms.internal.ads.C3862hu;
import com.google.android.gms.internal.ads.C3878ij;
import com.google.android.gms.internal.ads.C3879ik;
import com.google.android.gms.internal.ads.C3900je;
import com.google.android.gms.internal.ads.C3909jn;
import com.google.android.gms.internal.ads.C4030o;
import com.google.android.gms.internal.ads.C4089qe;
import com.google.android.gms.internal.ads.C4096ql;
import com.google.android.gms.internal.ads.C4100qp;
import com.google.android.gms.internal.ads.C4130rs;
import com.google.android.gms.internal.ads.aoq;
import com.google.android.gms.internal.ads.aru;
import com.google.android.gms.internal.ads.ash;
import com.google.android.gms.internal.ads.aso;
import com.google.android.gms.internal.ads.bca;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzjn;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3718cm
/* renamed from: com.google.android.gms.ads.internal.bf */
public abstract class C3035bf extends C3030ba implements C3057g, C4030o {

    /* renamed from: k */
    private boolean f8894k;

    public C3035bf(Context context, zzjn zzjn, String str, bca bca, zzang zzang, C3049bt btVar) {
        super(context, zzjn, str, bca, zzang, btVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public final boolean mo12562M() {
        return (this.f8733e.f8866k == null || this.f8733e.f8866k.f13292b == null || !this.f8733e.f8866k.f13292b.f14444Q) ? false : true;
    }

    /* renamed from: N */
    public final void mo12563N() {
        mo12448u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C4089qe mo12564a(C3879ik ikVar, C3050bu buVar, C3862hu huVar) throws C4100qp {
        C3879ik ikVar2 = ikVar;
        View nextView = this.f8733e.f8861f.getNextView();
        if (nextView instanceof C4089qe) {
            ((C4089qe) nextView).destroy();
        }
        if (nextView != null) {
            this.f8733e.f8861f.removeView(nextView);
        }
        C3025aw.m10918f();
        C4089qe a = C4096ql.m17760a(this.f8733e.f8858c, C4130rs.m17979a(this.f8733e.f8864i), this.f8733e.f8864i.f14543a, false, false, this.f8733e.f8859d, this.f8733e.f8860e, this.f8729a, this, this.f8737i, ikVar2.f13299i);
        if (this.f8733e.f8864i.f14549g == null) {
            mo12403a(a.getView());
        }
        a.mo15919v().mo15930a(this, this, this, this, this, false, null, buVar, this, huVar);
        mo12566a(a);
        a.mo15879a(ikVar2.f13291a.f14423v);
        return a;
    }

    /* renamed from: a */
    public final void mo12565a(int i, int i2, int i3, int i4) {
        mo12450w();
    }

    /* renamed from: a */
    public final void mo12411a(aso aso) {
        C3513t.m12634b("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f8733e.f8840B = aso;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12415a(C3879ik ikVar, ash ash) {
        if (ikVar.f13295e != -2) {
            C3909jn.f13411a.post(new C3037bh(this, ikVar));
            return;
        }
        if (ikVar.f13294d != null) {
            this.f8733e.f8864i = ikVar.f13294d;
        }
        if (!ikVar.f13292b.f14458g || ikVar.f13292b.f14477z) {
            C3909jn.f13411a.post(new C3038bi(this, ikVar, this.f8737i.f8921c.mo15378a(this.f8733e.f8858c, this.f8733e.f8860e, ikVar.f13292b), ash));
            return;
        }
        this.f8733e.f8847I = 0;
        C3026ax axVar = this.f8733e;
        C3025aw.m10916d();
        axVar.f8863h = C3663ao.m14575a(this.f8733e.f8858c, this, ikVar, this.f8733e.f8859d, null, this.f8888j, this, ash);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo12566a(C4089qe qeVar) {
        qeVar.mo15880a("/trackActiveViewUnit", (C3067ae<? super C4089qe>) new C3036bg<Object>(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo12425a(C3878ij ijVar, C3878ij ijVar2) {
        if (this.f8733e.mo12527d() && this.f8733e.f8861f != null) {
            this.f8733e.f8861f.mo12532a().mo15568c(ijVar2.f13246A);
        }
        try {
            if (ijVar2.f13266b != null && !ijVar2.f13278n && ijVar2.f13258M) {
                if (((Boolean) aoq.m14620f().mo14695a(aru.f11972dl)).booleanValue() && !ijVar2.f13265a.f14527c.containsKey("sdk_less_server_data")) {
                    try {
                        ijVar2.f13266b.mo15873J();
                    } catch (Throwable unused) {
                        C3900je.m17043a("Could not render test Ad label.");
                    }
                }
            }
        } catch (RuntimeException unused2) {
            C3900je.m17043a("Could not render test AdLabel.");
        }
        return super.mo12425a(ijVar, ijVar2);
    }

    /* renamed from: a_ */
    public final void mo12567a_(View view) {
        this.f8733e.f8846H = view;
        C3878ij ijVar = new C3878ij(this.f8733e.f8866k, null, null, null, null, null, null, null);
        mo12428b(ijVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo12568b(C4089qe qeVar) {
        if (this.f8733e.f8865j != null) {
            this.f8735g.mo14378a(this.f8733e.f8864i, this.f8733e.f8865j, qeVar.getView(), qeVar);
            this.f8894k = false;
            return;
        }
        this.f8894k = true;
        C3900je.m17435e("Request to enable ActiveView before adState is available.");
    }

    /* renamed from: h_ */
    public final void mo12569h_() {
        mo9646e();
    }

    /* renamed from: i_ */
    public final void mo12570i_() {
        mo12551ac();
        mo12441n();
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo12451x() {
        super.mo12451x();
        if (this.f8894k) {
            if (((Boolean) aoq.m14620f().mo14695a(aru.f11914cg)).booleanValue()) {
                mo12568b(this.f8733e.f8865j.f13266b);
            }
        }
    }
}
