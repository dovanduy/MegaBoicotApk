package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.Window;
import com.appnext.base.p046b.C1245d;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.internal.gmsg.C3067ae;
import com.google.android.gms.ads.internal.gmsg.C3071ai;
import com.google.android.gms.ads.internal.gmsg.C3079i;
import com.google.android.gms.ads.internal.gmsg.C3080j;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.C3107c;
import com.google.android.gms.ads.internal.overlay.C3115k;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.common.util.C3563o;
import com.google.android.gms.internal.ads.C3718cm;
import com.google.android.gms.internal.ads.C3780et;
import com.google.android.gms.internal.ads.C3804fq;
import com.google.android.gms.internal.ads.C3862hu;
import com.google.android.gms.internal.ads.C3866hy;
import com.google.android.gms.internal.ads.C3878ij;
import com.google.android.gms.internal.ads.C3879ik;
import com.google.android.gms.internal.ads.C3900je;
import com.google.android.gms.internal.ads.C3909jn;
import com.google.android.gms.internal.ads.C3915jt;
import com.google.android.gms.internal.ads.C4089qe;
import com.google.android.gms.internal.ads.C4096ql;
import com.google.android.gms.internal.ads.C4100qp;
import com.google.android.gms.internal.ads.C4124rm;
import com.google.android.gms.internal.ads.C4127rp;
import com.google.android.gms.internal.ads.C4130rs;
import com.google.android.gms.internal.ads.akg;
import com.google.android.gms.internal.ads.akk;
import com.google.android.gms.internal.ads.aoq;
import com.google.android.gms.internal.ads.aru;
import com.google.android.gms.internal.ads.ash;
import com.google.android.gms.internal.ads.bbj;
import com.google.android.gms.internal.ads.bbk;
import com.google.android.gms.internal.ads.bca;
import com.google.android.gms.internal.ads.zzaef;
import com.google.android.gms.internal.ads.zzaej;
import com.google.android.gms.internal.ads.zzael;
import com.google.android.gms.internal.ads.zzaig;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzjj;
import com.google.android.gms.internal.ads.zzjn;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
@C3718cm
/* renamed from: com.google.android.gms.ads.internal.m */
public final class C3102m extends C3035bf implements C3071ai, C3080j {

    /* renamed from: k */
    private transient boolean f9051k;

    /* renamed from: l */
    private int f9052l = -1;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f9053m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public float f9054n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f9055o;

    /* renamed from: p */
    private C3866hy f9056p;

    /* renamed from: q */
    private String f9057q;

    /* renamed from: r */
    private final String f9058r;

    /* renamed from: s */
    private final C3804fq f9059s;

    public C3102m(Context context, zzjn zzjn, String str, bca bca, zzang zzang, C3049bt btVar) {
        super(context, zzjn, str, bca, zzang, btVar);
        boolean z = false;
        this.f9051k = false;
        if (zzjn != null && "reward_mb".equals(zzjn.f14543a)) {
            z = true;
        }
        this.f9058r = z ? "/Rewarded" : "/Interstitial";
        this.f9059s = z ? new C3804fq(this.f8733e, this.f8888j, new C3104o(this), this, this) : null;
    }

    /* renamed from: a */
    private final void m11138a(Bundle bundle) {
        C3025aw.m10917e().mo15522b(this.f8733e.f8858c, this.f8733e.f8860e.f14505a, "gmob-apps", bundle, false);
    }

    /* renamed from: b */
    private static C3879ik m11141b(C3879ik ikVar) {
        C3879ik ikVar2 = ikVar;
        try {
            String jSONObject = C3780et.m16592a(ikVar2.f13292b).toString();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ikVar2.f13291a.f14406e);
            bbj bbj = new bbj(jSONObject, null, Collections.singletonList("com.google.ads.mediation.admob.AdMobAdapter"), null, null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), jSONObject2.toString(), null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, null, null, null, Collections.emptyList(), null, -1);
            zzaej zzaej = ikVar2.f13292b;
            bbk bbk = new bbk(Collections.singletonList(bbj), ((Long) aoq.m14620f().mo14695a(aru.f11830bB)).longValue(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), zzaej.f14435H, zzaej.f14436I, "", -1, 0, 1, null, 0, -1, -1, false);
            zzaef zzaef = ikVar2.f13291a;
            String str = zzaej.f14452a;
            String str2 = zzaej.f14453b;
            List emptyList = Collections.emptyList();
            List emptyList2 = Collections.emptyList();
            long j = zzaej.f14457f;
            long j2 = zzaej.f14459h;
            List emptyList3 = Collections.emptyList();
            long j3 = zzaej.f14461j;
            int i = zzaej.f14462k;
            String str3 = zzaej.f14463l;
            long j4 = zzaej.f14464m;
            String str4 = zzaej.f14465n;
            boolean z = zzaej.f14466o;
            String str5 = zzaej.f14467p;
            boolean z2 = zzaej.f14469r;
            boolean z3 = zzaej.f14470s;
            boolean z4 = zzaej.f14471t;
            boolean z5 = zzaej.f14472u;
            boolean z6 = zzaej.f14473v;
            String str6 = zzaej.f14475x;
            boolean z7 = zzaej.f14476y;
            boolean z8 = zzaej.f14477z;
            List emptyList4 = Collections.emptyList();
            List emptyList5 = Collections.emptyList();
            boolean z9 = z8;
            boolean z10 = zzaej.f14431D;
            zzael zzael = zzaej.f14432E;
            boolean z11 = zzaej.f14433F;
            String str7 = zzaej.f14434G;
            List<String> list = zzaej.f14435H;
            boolean z12 = zzaej.f14436I;
            String str8 = zzaej.f14437J;
            String str9 = zzaej.f14439L;
            boolean z13 = zzaej.f14440M;
            boolean z14 = zzaej.f14441N;
            boolean z15 = zzaej.f14442O;
            boolean z16 = zzaej.f14444Q;
            boolean z17 = z16;
            zzaej zzaej2 = new zzaej(zzaef, str, str2, emptyList, emptyList2, j, true, j2, emptyList3, j3, i, str3, j4, str4, z, str5, null, z2, z3, z4, z5, z6, str6, z7, z9, null, emptyList4, emptyList5, z10, zzael, z11, str7, list, z12, str8, null, str9, z13, z14, z15, 0, z17, Collections.emptyList(), zzaej.f14446S, zzaej.f14447T);
            C3879ik ikVar3 = ikVar;
            C3879ik ikVar4 = new C3879ik(ikVar3.f13291a, zzaej2, bbk, ikVar3.f13294d, ikVar3.f13295e, ikVar3.f13296f, ikVar3.f13297g, null, ikVar3.f13299i, null);
            return ikVar4;
        } catch (JSONException e) {
            C3879ik ikVar5 = ikVar2;
            C3900je.m17430b("Unable to generate ad state for an interstitial ad with pooling.", e);
            return ikVar5;
        }
    }

    /* renamed from: e */
    private final boolean m11143e(boolean z) {
        return this.f9059s != null && z;
    }

    /* renamed from: I */
    public final void mo12456I() {
        Bitmap bitmap;
        C3513t.m12634b("showInterstitial must be called on the main UI thread.");
        if (m11143e(this.f8733e.f8865j != null && this.f8733e.f8865j.f13278n)) {
            this.f9059s.mo15299a(this.f9055o);
            return;
        }
        if (C3025aw.m10908B().mo15394d(this.f8733e.f8858c)) {
            this.f9057q = C3025aw.m10908B().mo15399g(this.f8733e.f8858c);
            String valueOf = String.valueOf(this.f9057q);
            String valueOf2 = String.valueOf(this.f9058r);
            this.f9057q = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        }
        if (this.f8733e.f8865j == null) {
            C3900je.m17435e("The interstitial has not loaded.");
            return;
        }
        if (((Boolean) aoq.m14620f().mo14695a(aru.f11872br)).booleanValue()) {
            String packageName = (this.f8733e.f8858c.getApplicationContext() != null ? this.f8733e.f8858c.getApplicationContext() : this.f8733e.f8858c).getPackageName();
            if (!this.f9051k) {
                C3900je.m17435e("It is not recommended to show an interstitial before onAdLoaded completes.");
                Bundle bundle = new Bundle();
                bundle.putString("appid", packageName);
                bundle.putString(C1245d.f3959jb, "show_interstitial_before_load_finish");
                m11138a(bundle);
            }
            C3025aw.m10917e();
            if (!C3909jn.m17169g(this.f8733e.f8858c)) {
                C3900je.m17435e("It is not recommended to show an interstitial when app is not in foreground.");
                Bundle bundle2 = new Bundle();
                bundle2.putString("appid", packageName);
                bundle2.putString(C1245d.f3959jb, "show_interstitial_app_not_in_foreground");
                m11138a(bundle2);
            }
        }
        if (!this.f8733e.mo12528e()) {
            if (this.f8733e.f8865j.f13278n && this.f8733e.f8865j.f13280p != null) {
                try {
                    if (((Boolean) aoq.m14620f().mo14695a(aru.f11792aQ)).booleanValue()) {
                        this.f8733e.f8865j.f13280p.mo15094a(this.f9055o);
                    }
                    this.f8733e.f8865j.f13280p.mo15095b();
                } catch (RemoteException e) {
                    C3900je.m17432c("Could not show interstitial.", e);
                    mo12649K();
                }
            } else if (this.f8733e.f8865j.f13266b == null) {
                C3900je.m17435e("The interstitial failed to load.");
            } else if (this.f8733e.f8865j.f13266b.mo15923z()) {
                C3900je.m17435e("The interstitial is already showing.");
            } else {
                this.f8733e.f8865j.f13266b.mo15885b(true);
                this.f8733e.mo12522a(this.f8733e.f8865j.f13266b.getView());
                if (this.f8733e.f8865j.f13275k != null) {
                    this.f8735g.mo14376a(this.f8733e.f8864i, this.f8733e.f8865j);
                }
                if (C3563o.m12763b()) {
                    C3878ij ijVar = this.f8733e.f8865j;
                    if (ijVar.mo15412a()) {
                        new akg(this.f8733e.f8858c, ijVar.f13266b.getView()).mo14416a((akk) ijVar.f13266b);
                    } else {
                        ijVar.f13266b.mo15919v().mo15933a((C4127rp) new C3103n(this, ijVar));
                    }
                }
                if (this.f8733e.f8848J) {
                    C3025aw.m10917e();
                    bitmap = C3909jn.m17170h(this.f8733e.f8858c);
                } else {
                    bitmap = null;
                }
                this.f9052l = C3025aw.m10937y().mo15605a(bitmap);
                if (!((Boolean) aoq.m14620f().mo14695a(aru.f11846bR)).booleanValue() || bitmap == null) {
                    zzaq zzaq = new zzaq(this.f8733e.f8848J, mo12648J(), false, 0.0f, -1, this.f9055o, this.f8733e.f8865j.f13257L, this.f8733e.f8865j.f13260O);
                    int requestedOrientation = this.f8733e.f8865j.f13266b.getRequestedOrientation();
                    if (requestedOrientation == -1) {
                        requestedOrientation = this.f8733e.f8865j.f13272h;
                    }
                    AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(this, this, this, this.f8733e.f8865j.f13266b, requestedOrientation, this.f8733e.f8860e, this.f8733e.f8865j.f13246A, zzaq);
                    C3025aw.m10915c();
                    C3115k.m11206a(this.f8733e.f8858c, adOverlayInfoParcel, true);
                    return;
                }
                new C3129p(this, this.f9052l).mo15475h();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final boolean mo12648J() {
        if (!(this.f8733e.f8858c instanceof Activity)) {
            return false;
        }
        Window window = ((Activity) this.f8733e.f8858c).getWindow();
        if (window == null || window.getDecorView() == null) {
            return false;
        }
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        window.getDecorView().getGlobalVisibleRect(rect, null);
        window.getDecorView().getWindowVisibleDisplayFrame(rect2);
        if (!(rect.bottom == 0 || rect2.bottom == 0 || rect.top != rect2.top)) {
            return true;
        }
        return false;
    }

    /* renamed from: K */
    public final void mo12649K() {
        C3025aw.m10937y().mo15607b(Integer.valueOf(this.f9052l));
        if (this.f8733e.mo12527d()) {
            this.f8733e.mo12525b();
            this.f8733e.f8865j = null;
            this.f8733e.f8848J = false;
            this.f9051k = false;
        }
    }

    /* renamed from: L */
    public final void mo12588L() {
        C3107c r = this.f8733e.f8865j.f13266b.mo15909r();
        if (r != null) {
            r.mo12660a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C4089qe mo12564a(C3879ik ikVar, C3050bu buVar, C3862hu huVar) throws C4100qp {
        C3025aw.m10918f();
        C4089qe a = C4096ql.m17760a(this.f8733e.f8858c, C4130rs.m17979a(this.f8733e.f8864i), this.f8733e.f8864i.f14543a, false, false, this.f8733e.f8859d, this.f8733e.f8860e, this.f8729a, this, this.f8737i, ikVar.f13299i);
        a.mo15919v().mo15930a(this, this, null, this, this, ((Boolean) aoq.m14620f().mo14695a(aru.f11810ai)).booleanValue(), this, buVar, this, huVar);
        mo12566a(a);
        a.mo15879a(ikVar.f13291a.f14423v);
        a.mo15880a("/reward", (C3067ae<? super C4089qe>) new C3079i<Object>(this));
        return a;
    }

    /* renamed from: a */
    public final void mo12415a(C3879ik ikVar, ash ash) {
        if (ikVar.f13295e != -2) {
            super.mo12415a(ikVar, ash);
            return;
        }
        if (m11143e(ikVar.f13293c != null)) {
            this.f9059s.mo15301c();
            return;
        }
        if (!((Boolean) aoq.m14620f().mo14695a(aru.f11795aT)).booleanValue()) {
            super.mo12415a(ikVar, ash);
            return;
        }
        boolean z = !ikVar.f13292b.f14458g;
        if (m10725a(ikVar.f13291a.f14404c) && z) {
            this.f8733e.f8866k = m11141b(ikVar);
        }
        super.mo12415a(this.f8733e.f8866k, ash);
    }

    /* renamed from: a */
    public final void mo12621a(zzaig zzaig) {
        if (m11143e(this.f8733e.f8865j != null && this.f8733e.f8865j.f13278n)) {
            mo12429b(this.f9059s.mo15297a(zzaig));
            return;
        }
        if (this.f8733e.f8865j != null) {
            if (this.f8733e.f8865j.f13288x != null) {
                C3025aw.m10917e();
                C3909jn.m17139a(this.f8733e.f8858c, this.f8733e.f8860e.f14505a, this.f8733e.f8865j.f13288x);
            }
            if (this.f8733e.f8865j.f13286v != null) {
                zzaig = this.f8733e.f8865j.f13286v;
            }
        }
        mo12429b(zzaig);
    }

    /* renamed from: a */
    public final void mo12613a(boolean z) {
        this.f8733e.f8848J = z;
    }

    /* renamed from: a */
    public final void mo12614a(boolean z, float f) {
        this.f9053m = z;
        this.f9054n = f;
    }

    /* renamed from: a */
    public final boolean mo12425a(C3878ij ijVar, C3878ij ijVar2) {
        if (m11143e(ijVar2.f13278n)) {
            return C3804fq.m16641a(ijVar, ijVar2);
        }
        if (!super.mo12425a(ijVar, ijVar2)) {
            return false;
        }
        if (!(this.f8733e.mo12527d() || this.f8733e.f8846H == null || ijVar2.f13275k == null)) {
            this.f8735g.mo14377a(this.f8733e.f8864i, ijVar2, this.f8733e.f8846H);
        }
        mo12552b(ijVar2, false);
        return true;
    }

    /* renamed from: a */
    public final boolean mo12426a(zzjj zzjj, ash ash) {
        if (this.f8733e.f8865j != null) {
            C3900je.m17435e("An interstitial is already loading. Aborting.");
            return false;
        }
        if (this.f9056p == null && m10725a(zzjj) && C3025aw.m10908B().mo15394d(this.f8733e.f8858c) && !TextUtils.isEmpty(this.f8733e.f8857b)) {
            this.f9056p = new C3866hy(this.f8733e.f8858c, this.f8733e.f8857b);
        }
        return super.mo12426a(zzjj, ash);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo12475a(zzjj zzjj, C3878ij ijVar, boolean z) {
        if (this.f8733e.mo12527d() && ijVar.f13266b != null) {
            C3025aw.m10919g();
            C3915jt.m17195a(ijVar.f13266b);
        }
        return this.f8732d.mo12498e();
    }

    /* renamed from: c */
    public final void mo12432c(boolean z) {
        C3513t.m12634b("setImmersiveMode must be called on the main UI thread.");
        this.f9055o = z;
    }

    /* renamed from: f_ */
    public final void mo12622f_() {
        if (m11143e(this.f8733e.f8865j != null && this.f8733e.f8865j.f13278n)) {
            this.f9059s.mo15305g();
            mo12392A();
            return;
        }
        if (!(this.f8733e.f8865j == null || this.f8733e.f8865j.f13287w == null)) {
            C3025aw.m10917e();
            C3909jn.m17139a(this.f8733e.f8858c, this.f8733e.f8860e.f14505a, this.f8733e.f8865j.f13287w);
        }
        mo12392A();
    }

    /* renamed from: g */
    public final void mo12556g() {
        mo12551ac();
        super.mo12556g();
        if (!(this.f8733e.f8865j == null || this.f8733e.f8865j.f13266b == null)) {
            C4124rm v = this.f8733e.f8865j.f13266b.mo15919v();
            if (v != null) {
                v.mo15947g();
            }
        }
        if (!(!C3025aw.m10908B().mo15394d(this.f8733e.f8858c) || this.f8733e.f8865j == null || this.f8733e.f8865j.f13266b == null)) {
            C3025aw.m10908B().mo15391c(this.f8733e.f8865j.f13266b.getContext(), this.f9057q);
        }
        if (this.f9056p != null) {
            this.f9056p.mo15384a(true);
        }
        if (this.f8736h != null && this.f8733e.f8865j != null && this.f8733e.f8865j.f13266b != null) {
            this.f8733e.f8865j.f13266b.mo14986a("onSdkImpression", (Map<String, ?>) new HashMap<String,Object>());
        }
    }

    /* renamed from: g_ */
    public final void mo12623g_() {
        if (m11143e(this.f8733e.f8865j != null && this.f8733e.f8865j.f13278n)) {
            this.f9059s.mo15306h();
        }
        mo12393B();
    }

    /* renamed from: t_ */
    public final void mo12557t_() {
        super.mo12557t_();
        this.f8735g.mo14375a(this.f8733e.f8865j);
        if (this.f9056p != null) {
            this.f9056p.mo15384a(false);
        }
        mo12398G();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo12448u() {
        mo12649K();
        super.mo12448u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo12451x() {
        C4089qe qeVar = this.f8733e.f8865j != null ? this.f8733e.f8865j.f13266b : null;
        C3879ik ikVar = this.f8733e.f8866k;
        if (!(ikVar == null || ikVar.f13292b == null || !ikVar.f13292b.f14444Q || qeVar == null || !C3025aw.m10933u().mo15785a(this.f8733e.f8858c))) {
            int i = this.f8733e.f8860e.f14506b;
            int i2 = this.f8733e.f8860e.f14507c;
            StringBuilder sb = new StringBuilder(23);
            sb.append(i);
            sb.append(".");
            sb.append(i2);
            this.f8736h = C3025aw.m10933u().mo15782a(sb.toString(), qeVar.getWebView(), "", "javascript", mo12399H());
            if (!(this.f8736h == null || qeVar.getView() == null)) {
                C3025aw.m10933u().mo15784a(this.f8736h, qeVar.getView());
                C3025aw.m10933u().mo15783a(this.f8736h);
            }
        }
        super.mo12451x();
        this.f9051k = true;
    }
}
