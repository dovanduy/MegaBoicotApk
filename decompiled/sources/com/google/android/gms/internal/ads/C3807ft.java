package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.internal.C3025aw;
import com.google.android.gms.ads.internal.C3030ba;
import com.google.android.gms.ads.internal.C3049bt;
import com.google.android.gms.common.internal.C3513t;
import java.util.Arrays;
import java.util.Collections;
import org.json.JSONException;
import org.json.JSONObject;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.ft */
public final class C3807ft extends C3030ba implements C3837gw {

    /* renamed from: k */
    private static C3807ft f13130k;

    /* renamed from: l */
    private boolean f13131l;

    /* renamed from: m */
    private boolean f13132m;

    /* renamed from: n */
    private final C3866hy f13133n;

    /* renamed from: o */
    private final C3804fq f13134o;

    public C3807ft(Context context, C3049bt btVar, zzjn zzjn, bca bca, zzang zzang) {
        super(context, zzjn, null, bca, zzang, btVar);
        f13130k = this;
        this.f13133n = new C3866hy(context, null);
        C3804fq fqVar = new C3804fq(this.f8733e, this.f8888j, this, this, this);
        this.f13134o = fqVar;
    }

    /* renamed from: J */
    public static C3807ft m16672J() {
        return f13130k;
    }

    /* renamed from: b */
    private static C3879ik m16674b(C3879ik ikVar) {
        C3879ik ikVar2 = ikVar;
        C3900je.m17043a("Creating mediation ad response for non-mediated rewarded ad.");
        try {
            JSONObject a = C3780et.m16592a(ikVar2.f13292b);
            a.remove("impression_urls");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ikVar2.f13291a.f14406e);
            String jSONObject2 = jSONObject.toString();
            bbj bbj = new bbj(a.toString(), null, Arrays.asList(new String[]{"com.google.ads.mediation.admob.AdMobAdapter"}), null, null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), jSONObject2, null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, null, null, null, Collections.emptyList(), null, -1);
            bbk bbk = new bbk(Arrays.asList(new bbj[]{bbj}), ((Long) aoq.m14620f().mo14695a(aru.f11830bB)).longValue(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), false, "", -1, 0, 1, null, 0, -1, -1, false);
            C3879ik ikVar3 = new C3879ik(ikVar2.f13291a, ikVar2.f13292b, bbk, ikVar2.f13294d, ikVar2.f13295e, ikVar2.f13296f, ikVar2.f13297g, ikVar2.f13298h, ikVar2.f13299i, null);
            return ikVar3;
        } catch (JSONException e) {
            C3900je.m17430b("Unable to generate ad state for non-mediated rewarded video.", e);
            C3879ik ikVar4 = new C3879ik(ikVar2.f13291a, ikVar2.f13292b, null, ikVar2.f13294d, 0, ikVar2.f13296f, ikVar2.f13297g, ikVar2.f13298h, ikVar2.f13299i, null);
            return ikVar4;
        }
    }

    /* renamed from: K */
    public final void mo15310K() {
        C3513t.m12634b("showAd must be called on the main UI thread.");
        if (!mo15311L()) {
            C3900je.m17435e("The reward video has not loaded.");
        } else {
            this.f13134o.mo15299a(this.f13132m);
        }
    }

    /* renamed from: L */
    public final boolean mo15311L() {
        C3513t.m12634b("isLoaded must be called on the main UI thread.");
        return this.f8733e.f8862g == null && this.f8733e.f8863h == null && this.f8733e.f8865j != null;
    }

    /* renamed from: a */
    public final void mo15312a(Context context) {
        this.f13134o.mo15298a(context);
    }

    /* renamed from: a */
    public final void mo12415a(C3879ik ikVar, ash ash) {
        if (ikVar.f13295e != -2) {
            C3909jn.f13411a.post(new C3809fv(this, ikVar));
            return;
        }
        this.f8733e.f8866k = ikVar;
        if (ikVar.f13293c == null) {
            this.f8733e.f8866k = m16674b(ikVar);
        }
        this.f13134o.mo15301c();
    }

    /* renamed from: a */
    public final void mo15313a(zzahk zzahk) {
        C3513t.m12634b("loadAd must be called on the main UI thread.");
        if (TextUtils.isEmpty(zzahk.f14494b)) {
            C3900je.m17435e("Invalid ad unit id. Aborting.");
            C3909jn.f13411a.post(new C3808fu(this));
            return;
        }
        this.f13131l = false;
        this.f8733e.f8857b = zzahk.f14494b;
        this.f13133n.mo15383a(zzahk.f14494b);
        super.mo12431b(zzahk.f14493a);
    }

    /* renamed from: a */
    public final void mo12650a(zzaig zzaig) {
        zzaig a = this.f13134o.mo15297a(zzaig);
        if (C3025aw.m10908B().mo15396e(this.f8733e.f8858c) && a != null) {
            C3025aw.m10908B().mo15387a(this.f8733e.f8858c, C3025aw.m10908B().mo15402j(this.f8733e.f8858c), this.f8733e.f8857b, a.f14495a, a.f14496b);
        }
        mo12429b(a);
    }

    /* renamed from: a */
    public final boolean mo12425a(C3878ij ijVar, C3878ij ijVar2) {
        mo12552b(ijVar2, false);
        return C3804fq.m16641a(ijVar, ijVar2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo12475a(zzjj zzjj, C3878ij ijVar, boolean z) {
        return false;
    }

    /* renamed from: b */
    public final C3846he mo12476b(String str) {
        return this.f13134o.mo15296a(str);
    }

    /* renamed from: b */
    public final void mo12651b() {
        this.f13134o.mo15305g();
        mo12392A();
    }

    /* renamed from: c */
    public final void mo12652c() {
        if (C3025aw.m10908B().mo15396e(this.f8733e.f8858c)) {
            this.f13133n.mo15384a(false);
        }
        mo12448u();
    }

    /* renamed from: c */
    public final void mo12432c(boolean z) {
        C3513t.m12634b("setImmersiveMode must be called on the main UI thread.");
        this.f13132m = z;
    }

    /* renamed from: j */
    public final void mo12437j() {
        this.f13134o.mo15304f();
        super.mo12437j();
    }

    /* renamed from: o */
    public final void mo12442o() {
        this.f13134o.mo15302d();
    }

    /* renamed from: p */
    public final void mo12443p() {
        this.f13134o.mo15303e();
    }

    /* renamed from: p_ */
    public final void mo12653p_() {
        if (C3025aw.m10908B().mo15396e(this.f8733e.f8858c)) {
            this.f13133n.mo15384a(true);
        }
        mo12546a(this.f8733e.f8865j, false);
        mo12450w();
    }

    /* renamed from: q_ */
    public final void mo12654q_() {
        this.f13134o.mo15306h();
        mo12393B();
    }

    /* renamed from: r_ */
    public final void mo12655r_() {
        mo9646e();
    }

    /* renamed from: s_ */
    public final void mo12656s_() {
        mo12449v();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo12448u() {
        this.f8733e.f8865j = null;
        super.mo12448u();
    }
}
