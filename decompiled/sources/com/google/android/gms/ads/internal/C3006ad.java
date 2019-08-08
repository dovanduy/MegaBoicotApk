package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.p017v4.p023d.C0398m;
import android.util.Log;
import android.view.View;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.internal.ads.C3663ao;
import com.google.android.gms.internal.ads.C3695bq;
import com.google.android.gms.internal.ads.C3699bu;
import com.google.android.gms.internal.ads.C3718cm;
import com.google.android.gms.internal.ads.C3878ij;
import com.google.android.gms.internal.ads.C3879ik;
import com.google.android.gms.internal.ads.C3900je;
import com.google.android.gms.internal.ads.C3907jl;
import com.google.android.gms.internal.ads.C3909jn;
import com.google.android.gms.internal.ads.C3987mk;
import com.google.android.gms.internal.ads.C4008ne;
import com.google.android.gms.internal.ads.C4019np;
import com.google.android.gms.internal.ads.C4089qe;
import com.google.android.gms.internal.ads.C4100qp;
import com.google.android.gms.internal.ads.C4335y;
import com.google.android.gms.internal.ads.ajl;
import com.google.android.gms.internal.ads.akv;
import com.google.android.gms.internal.ads.aoq;
import com.google.android.gms.internal.ads.aqe;
import com.google.android.gms.internal.ads.aqh;
import com.google.android.gms.internal.ads.aru;
import com.google.android.gms.internal.ads.ash;
import com.google.android.gms.internal.ads.aso;
import com.google.android.gms.internal.ads.asz;
import com.google.android.gms.internal.ads.atb;
import com.google.android.gms.internal.ads.atd;
import com.google.android.gms.internal.ads.atg;
import com.google.android.gms.internal.ads.ati;
import com.google.android.gms.internal.ads.atj;
import com.google.android.gms.internal.ads.atk;
import com.google.android.gms.internal.ads.atm;
import com.google.android.gms.internal.ads.atn;
import com.google.android.gms.internal.ads.auh;
import com.google.android.gms.internal.ads.ave;
import com.google.android.gms.internal.ads.avp;
import com.google.android.gms.internal.ads.avs;
import com.google.android.gms.internal.ads.bbk;
import com.google.android.gms.internal.ads.bca;
import com.google.android.gms.internal.ads.bcd;
import com.google.android.gms.internal.ads.bcm;
import com.google.android.gms.internal.ads.bcq;
import com.google.android.gms.internal.ads.bct;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzjj;
import com.google.android.gms.internal.ads.zzjn;
import com.google.android.gms.p137b.C3235a;
import com.google.android.gms.p137b.C3238b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
@C3718cm
/* renamed from: com.google.android.gms.ads.internal.ad */
public final class C3006ad extends C3030ba implements atm {

    /* renamed from: k */
    private final Object f8746k;

    /* renamed from: l */
    private boolean f8747l;

    /* renamed from: m */
    private C4019np<atn> f8748m;

    /* renamed from: n */
    private C4089qe f8749n;

    /* renamed from: o */
    private C4089qe f8750o;

    /* renamed from: p */
    private boolean f8751p;

    /* renamed from: q */
    private int f8752q;
    @GuardedBy("mLock")

    /* renamed from: r */
    private C3695bq f8753r;

    /* renamed from: s */
    private final String f8754s;

    public C3006ad(Context context, C3049bt btVar, zzjn zzjn, String str, bca bca, zzang zzang) {
        this(context, btVar, zzjn, str, bca, zzang, false);
    }

    public C3006ad(Context context, C3049bt btVar, zzjn zzjn, String str, bca bca, zzang zzang, boolean z) {
        super(context, zzjn, str, bca, zzang, btVar);
        this.f8746k = new Object();
        this.f8748m = new C4019np<>();
        this.f8752q = 1;
        this.f8754s = UUID.randomUUID().toString();
        this.f8747l = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m10792a(C3026ax axVar, C3026ax axVar2) {
        if (axVar2.f8873r == null) {
            axVar2.f8873r = axVar.f8873r;
        }
        if (axVar2.f8874s == null) {
            axVar2.f8874s = axVar.f8874s;
        }
        if (axVar2.f8876u == null) {
            axVar2.f8876u = axVar.f8876u;
        }
        if (axVar2.f8877v == null) {
            axVar2.f8877v = axVar.f8877v;
        }
        if (axVar2.f8879x == null) {
            axVar2.f8879x = axVar.f8879x;
        }
        if (axVar2.f8878w == null) {
            axVar2.f8878w = axVar.f8878w;
        }
        if (axVar2.f8844F == null) {
            axVar2.f8844F = axVar.f8844F;
        }
        if (axVar2.f8867l == null) {
            axVar2.f8867l = axVar.f8867l;
        }
        if (axVar2.f8845G == null) {
            axVar2.f8845G = axVar.f8845G;
        }
        if (axVar2.f8868m == null) {
            axVar2.f8868m = axVar.f8868m;
        }
        if (axVar2.f8869n == null) {
            axVar2.f8869n = axVar.f8869n;
        }
        if (axVar2.f8864i == null) {
            axVar2.f8864i = axVar.f8864i;
        }
        if (axVar2.f8865j == null) {
            axVar2.f8865j = axVar.f8865j;
        }
        if (axVar2.f8866k == null) {
            axVar2.f8866k = axVar.f8866k;
        }
    }

    /* renamed from: a */
    private final void m10793a(asz asz) {
        C3909jn.f13411a.post(new C3010ah(this, asz));
    }

    /* renamed from: a */
    private final void m10794a(atb atb) {
        C3909jn.f13411a.post(new C3012aj(this, atb));
    }

    /* renamed from: a */
    private final void m10795a(atg atg) {
        C3909jn.f13411a.post(new C3011ai(this, atg));
    }

    /* renamed from: ad */
    private final boolean m10796ad() {
        return this.f8733e.f8865j != null && this.f8733e.f8865j.f13259N;
    }

    /* renamed from: ae */
    private final bbk m10797ae() {
        if (this.f8733e.f8865j == null || !this.f8733e.f8865j.f13278n) {
            return null;
        }
        return this.f8733e.f8865j.f13282r;
    }

    /* renamed from: af */
    private final void m10798af() {
        C3695bq J = mo12457J();
        if (J != null) {
            J.mo15205a();
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00a8  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.atg m10799b(com.google.android.gms.internal.ads.atn r20) {
        /*
            r0 = r20
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.atb
            r2 = 0
            if (r1 == 0) goto L_0x0053
            com.google.android.gms.internal.ads.atb r0 = (com.google.android.gms.internal.ads.atb) r0
            com.google.android.gms.internal.ads.atg r1 = new com.google.android.gms.internal.ads.atg
            java.lang.String r4 = r0.mo14780a()
            java.util.List r5 = r0.mo14759b()
            java.lang.String r6 = r0.mo14786e()
            com.google.android.gms.internal.ads.auh r7 = r0.mo14787f()
            java.lang.String r8 = r0.mo14788g()
            java.lang.String r9 = r0.mo14789h()
            r10 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r12 = 0
            r13 = 0
            com.google.android.gms.internal.ads.asu r14 = r0.mo14772m()
            com.google.android.gms.internal.ads.aqe r15 = r0.mo14790i()
            android.view.View r16 = r0.mo14774o()
            com.google.android.gms.b.a r17 = r0.mo14783c()
            java.lang.String r18 = r0.mo14785d()
            android.os.Bundle r19 = r0.mo14792n()
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r16, r17, r18, r19)
            com.google.android.gms.b.a r3 = r0.mo14791j()
            if (r3 == 0) goto L_0x00a4
            com.google.android.gms.b.a r0 = r0.mo14791j()
        L_0x004d:
            java.lang.Object r0 = com.google.android.gms.p137b.C3238b.m11574a(r0)
            r2 = r0
            goto L_0x00a4
        L_0x0053:
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.asz
            if (r1 == 0) goto L_0x00a3
            com.google.android.gms.internal.ads.asz r0 = (com.google.android.gms.internal.ads.asz) r0
            com.google.android.gms.internal.ads.atg r1 = new com.google.android.gms.internal.ads.atg
            java.lang.String r4 = r0.mo14756a()
            java.util.List r5 = r0.mo14759b()
            java.lang.String r6 = r0.mo14761c()
            com.google.android.gms.internal.ads.auh r7 = r0.mo14763d()
            java.lang.String r8 = r0.mo14764e()
            r9 = 0
            double r10 = r0.mo14765f()
            java.lang.String r12 = r0.mo14766g()
            java.lang.String r13 = r0.mo14767h()
            com.google.android.gms.internal.ads.asu r14 = r0.mo14772m()
            com.google.android.gms.internal.ads.aqe r15 = r0.mo14768i()
            android.view.View r16 = r0.mo14774o()
            com.google.android.gms.b.a r17 = r0.mo14775p()
            java.lang.String r18 = r0.mo14776q()
            android.os.Bundle r19 = r0.mo14773n()
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r16, r17, r18, r19)
            com.google.android.gms.b.a r3 = r0.mo14769j()
            if (r3 == 0) goto L_0x00a4
            com.google.android.gms.b.a r0 = r0.mo14769j()
            goto L_0x004d
        L_0x00a3:
            r1 = r2
        L_0x00a4:
            boolean r0 = r2 instanceof com.google.android.gms.internal.ads.atp
            if (r0 == 0) goto L_0x00ad
            com.google.android.gms.internal.ads.atp r2 = (com.google.android.gms.internal.ads.atp) r2
            r1.mo14758a(r2)
        L_0x00ad:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.C3006ad.m10799b(com.google.android.gms.internal.ads.atn):com.google.android.gms.internal.ads.atg");
    }

    /* renamed from: D */
    public final String mo12395D() {
        return this.f8733e.f8857b;
    }

    /* renamed from: I */
    public final void mo12456I() {
        throw new IllegalStateException("Interstitial is NOT supported by NativeAdManager.");
    }

    /* renamed from: J */
    public final C3695bq mo12457J() {
        C3695bq bqVar;
        synchronized (this.f8746k) {
            bqVar = this.f8753r;
        }
        return bqVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final Future<atn> mo12458K() {
        return this.f8748m;
    }

    /* renamed from: L */
    public final void mo12459L() {
        if (m10796ad() && this.f8736h != null) {
            C4089qe qeVar = null;
            if (this.f8750o != null) {
                qeVar = this.f8750o;
            } else if (this.f8749n != null) {
                qeVar = this.f8749n;
            }
            if (qeVar != null) {
                qeVar.mo14986a("onSdkImpression", (Map) new HashMap());
            }
        }
    }

    /* renamed from: M */
    public final void mo12460M() {
        if (this.f8733e.f8865j == null || this.f8749n == null) {
            this.f8751p = true;
            C3900je.m17435e("Request to enable ActiveView before adState is available.");
            return;
        }
        C3025aw.m10921i().mo15444g().mo14378a(this.f8733e.f8864i, this.f8733e.f8865j, this.f8749n.getView(), this.f8749n);
        this.f8751p = false;
    }

    /* renamed from: N */
    public final void mo12461N() {
        this.f8751p = false;
        if (this.f8733e.f8865j == null || this.f8749n == null) {
            C3900je.m17435e("Request to enable ActiveView before adState is available.");
        } else {
            C3025aw.m10921i().mo15444g().mo14375a(this.f8733e.f8865j);
        }
    }

    /* renamed from: O */
    public final C0398m<String, avs> mo12462O() {
        C3513t.m12634b("getOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
        return this.f8733e.f8877v;
    }

    /* renamed from: P */
    public final void mo12463P() {
        if (this.f8749n != null) {
            this.f8749n.destroy();
            this.f8749n = null;
        }
    }

    /* renamed from: Q */
    public final void mo12464Q() {
        super.mo12398G();
        if (this.f8750o != null) {
            this.f8750o.destroy();
            this.f8750o = null;
        }
    }

    /* renamed from: R */
    public final void mo12465R() {
        if (this.f8749n != null && this.f8749n.mo15799b() != null && this.f8733e.f8878w != null && this.f8733e.f8878w.f14565f != null) {
            this.f8749n.mo15799b().mo15985a(this.f8733e.f8878w.f14565f);
        }
    }

    /* renamed from: S */
    public final boolean mo12466S() {
        if (m10797ae() != null) {
            return m10797ae().f12578p;
        }
        return false;
    }

    /* renamed from: T */
    public final boolean mo12467T() {
        if (m10797ae() != null) {
            return m10797ae().f12579q;
        }
        return false;
    }

    /* renamed from: U */
    public final void mo12468U() {
        if (this.f8733e.f8865j == null || !"com.google.ads.mediation.admob.AdMobAdapter".equals(this.f8733e.f8865j.f13281q)) {
            super.mo12468U();
        } else {
            mo12453z();
        }
    }

    /* renamed from: V */
    public final void mo12469V() {
        if (this.f8733e.f8865j == null || !"com.google.ads.mediation.admob.AdMobAdapter".equals(this.f8733e.f8865j.f13281q)) {
            super.mo12469V();
        } else {
            mo12452y();
        }
    }

    /* renamed from: W */
    public final void mo12470W() {
        C3878ij ijVar = this.f8733e.f8865j;
        if (ijVar.f13280p == null) {
            super.mo12470W();
            return;
        }
        try {
            bcd bcd = ijVar.f13280p;
            aqe aqe = null;
            bcm h = bcd.mo15101h();
            if (h != null) {
                aqe = h.mo15126m();
            } else {
                bcq i = bcd.mo15102i();
                if (i != null) {
                    aqe = i.mo15147l();
                } else {
                    ave n = bcd.mo15107n();
                    if (n != null) {
                        aqe = n.mo14801c();
                    }
                }
            }
            if (aqe != null) {
                aqh h2 = aqe.mo14573h();
                if (h2 != null) {
                    h2.mo14580d();
                }
            }
        } catch (RemoteException e) {
            C3900je.m17434d("#007 Could not call remote method.", e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo12401a(int i) {
        mo12402a(i, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo12402a(int i, boolean z) {
        m10798af();
        super.mo12402a(i, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo12471a(C3235a aVar) {
        Object a = aVar != null ? C3238b.m11574a(aVar) : null;
        if (a instanceof atk) {
            ((atk) a).mo14841d();
        }
        super.mo12552b(this.f8733e.f8865j, false);
    }

    /* renamed from: a */
    public final void mo12411a(aso aso) {
        throw new IllegalStateException("CustomRendering is NOT supported by NativeAdManager.");
    }

    /* renamed from: a */
    public final void mo12472a(ati ati) {
        if (this.f8749n != null) {
            this.f8749n.mo15877a(ati);
        }
    }

    /* renamed from: a */
    public final void mo12473a(atk atk) {
        if (this.f8733e.f8865j.f13275k != null) {
            C3025aw.m10921i().mo15444g().mo14379a(this.f8733e.f8864i, this.f8733e.f8865j, (akv) new ajl(atk), (C4089qe) null);
        }
    }

    /* renamed from: a */
    public final void mo12415a(C3879ik ikVar, ash ash) {
        if (ikVar.f13294d != null) {
            this.f8733e.f8864i = ikVar.f13294d;
        }
        if (ikVar.f13295e != -2) {
            C3909jn.f13411a.post(new C3007ae(this, ikVar));
            return;
        }
        int i = ikVar.f13291a.f14397Y;
        if (i == 1) {
            this.f8733e.f8847I = 0;
            C3026ax axVar = this.f8733e;
            C3025aw.m10916d();
            axVar.f8863h = C3663ao.m14575a(this.f8733e.f8858c, this, ikVar, this.f8733e.f8859d, null, this.f8888j, this, ash);
            String str = "AdRenderer: ";
            String valueOf = String.valueOf(this.f8733e.f8863h.getClass().getName());
            C3900je.m17429b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            return;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            JSONArray jSONArray2 = new JSONObject(ikVar.f13292b.f14453b).getJSONArray("slots");
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                JSONArray jSONArray3 = jSONArray2.getJSONObject(i2).getJSONArray("ads");
                for (int i3 = 0; i3 < jSONArray3.length(); i3++) {
                    jSONArray.put(jSONArray3.get(i3));
                }
            }
            m10798af();
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < i; i4++) {
                C3008af afVar = new C3008af(this, i4, jSONArray, i, ikVar);
                arrayList.add(C3907jl.m17119a((Callable<T>) afVar));
            }
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                try {
                    C3909jn.f13411a.post(new C3009ag(this, (atn) ((C4008ne) arrayList.get(i5)).get(((Long) aoq.m14620f().mo14695a(aru.f11830bB)).longValue(), TimeUnit.MILLISECONDS), i5, arrayList));
                } catch (InterruptedException e) {
                    C3987mk.m17432c("", e);
                    Thread.currentThread().interrupt();
                } catch (CancellationException | ExecutionException | TimeoutException e2) {
                    C3987mk.m17432c("", e2);
                }
            }
        } catch (JSONException e3) {
            C3900je.m17432c("Malformed native ad response", e3);
            mo12401a(0);
        }
    }

    /* renamed from: a */
    public final void mo12474a(C4089qe qeVar) {
        this.f8749n = qeVar;
    }

    /* renamed from: a */
    public final void mo12416a(C4335y yVar) {
        throw new IllegalStateException("In App Purchase is NOT supported by NativeAdManager.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo12425a(C3878ij ijVar, C3878ij ijVar2) {
        atg atg;
        C3878ij ijVar3 = ijVar2;
        View view = null;
        mo12480c(null);
        if (!this.f8733e.mo12527d()) {
            throw new IllegalStateException("Native ad DOES NOT have custom rendering mode.");
        }
        if (ijVar3.f13278n) {
            m10798af();
            try {
                bct p = ijVar3.f13280p != null ? ijVar3.f13280p.mo15109p() : null;
                bcm h = ijVar3.f13280p != null ? ijVar3.f13280p.mo15101h() : null;
                bcq i = ijVar3.f13280p != null ? ijVar3.f13280p.mo15102i() : null;
                ave n = ijVar3.f13280p != null ? ijVar3.f13280p.mo15107n() : null;
                String c = m10956c(ijVar2);
                if (p != null && this.f8733e.f8875t != null) {
                    String a = p.mo15151a();
                    List b = p.mo15154b();
                    String c2 = p.mo15156c();
                    auh d = p.mo15157d() != null ? p.mo15157d() : null;
                    String e = p.mo15158e();
                    String f = p.mo15159f();
                    double g = p.mo15160g();
                    String h2 = p.mo15161h();
                    String i2 = p.mo15162i();
                    aqe j = p.mo15163j();
                    if (p.mo15166m() != null) {
                        view = (View) C3238b.m11574a(p.mo15166m());
                    }
                    atg = new atg(a, b, c2, d, e, f, g, h2, i2, null, j, view, p.mo15167n(), c, p.mo15168o());
                    atj atj = new atj(this.f8733e.f8858c, (atm) this, this.f8733e.f8859d, p, (atn) atg);
                    atg.mo14758a((atk) atj);
                } else if (h != null && this.f8733e.f8875t != null) {
                    String a2 = h.mo15110a();
                    List b2 = h.mo15113b();
                    String c3 = h.mo15115c();
                    auh d2 = h.mo15117d() != null ? h.mo15117d() : null;
                    String e2 = h.mo15118e();
                    double f2 = h.mo15119f();
                    String g2 = h.mo15120g();
                    String h3 = h.mo15121h();
                    aqe m = h.mo15126m();
                    if (h.mo15129p() != null) {
                        view = (View) C3238b.m11574a(h.mo15129p());
                    }
                    atg = new atg(a2, b2, c3, d2, e2, null, f2, g2, h3, null, m, view, h.mo15130q(), c, h.mo15125l());
                    atj atj2 = new atj(this.f8733e.f8858c, (atm) this, this.f8733e.f8859d, h, (atn) atg);
                    atg.mo14758a((atk) atj2);
                } else if (h != null && this.f8733e.f8873r != null) {
                    String a3 = h.mo15110a();
                    List b3 = h.mo15113b();
                    String c4 = h.mo15115c();
                    auh d3 = h.mo15117d() != null ? h.mo15117d() : null;
                    String e3 = h.mo15118e();
                    double f3 = h.mo15119f();
                    String g3 = h.mo15120g();
                    String h4 = h.mo15121h();
                    Bundle l = h.mo15125l();
                    aqe m2 = h.mo15126m();
                    if (h.mo15129p() != null) {
                        view = (View) C3238b.m11574a(h.mo15129p());
                    }
                    asz asz = new asz(a3, b3, c4, d3, e3, f3, g3, h4, null, l, m2, view, h.mo15130q(), c);
                    atj atj3 = new atj(this.f8733e.f8858c, (atm) this, this.f8733e.f8859d, h, (atn) asz);
                    asz.mo14758a((atk) atj3);
                    m10793a(asz);
                } else if (i != null && this.f8733e.f8875t != null) {
                    String a4 = i.mo15132a();
                    List b4 = i.mo15135b();
                    String c5 = i.mo15137c();
                    auh d4 = i.mo15139d() != null ? i.mo15139d() : null;
                    String e4 = i.mo15140e();
                    String f4 = i.mo15141f();
                    aqe l2 = i.mo15147l();
                    if (i.mo15149n() != null) {
                        view = (View) C3238b.m11574a(i.mo15149n());
                    }
                    atg atg2 = new atg(a4, b4, c5, d4, e4, f4, -1.0d, null, null, null, l2, view, i.mo15150o(), c, i.mo15145j());
                    bcq bcq = i;
                    atg = atg2;
                    atj atj4 = new atj(this.f8733e.f8858c, (atm) this, this.f8733e.f8859d, bcq, (atn) atg2);
                    atg.mo14758a((atk) atj4);
                } else if (i != null && this.f8733e.f8874s != null) {
                    String a5 = i.mo15132a();
                    List b5 = i.mo15135b();
                    String c6 = i.mo15137c();
                    auh d5 = i.mo15139d() != null ? i.mo15139d() : null;
                    String e5 = i.mo15140e();
                    String f5 = i.mo15141f();
                    Bundle j2 = i.mo15145j();
                    aqe l3 = i.mo15147l();
                    if (i.mo15149n() != null) {
                        view = (View) C3238b.m11574a(i.mo15149n());
                    }
                    atb atb = new atb(a5, b5, c6, d5, e5, f5, null, j2, l3, view, i.mo15150o(), c);
                    bcq bcq2 = i;
                    atb atb2 = atb;
                    atj atj5 = new atj(this.f8733e.f8858c, (atm) this, this.f8733e.f8859d, bcq2, (atn) atb);
                    atb2.mo14758a((atk) atj5);
                    m10794a(atb2);
                } else if (n == null || this.f8733e.f8877v == null || this.f8733e.f8877v.get(n.mo14771l()) == null) {
                    C3900je.m17435e("No matching mapper/listener for retrieved native ad template.");
                    mo12401a(0);
                    return false;
                } else {
                    C3909jn.f13411a.post(new C3014al(this, n));
                }
                m10795a(atg);
            } catch (RemoteException e6) {
                C3900je.m17434d("#007 Could not call remote method.", e6);
            }
        } else {
            atn atn = ijVar3.f13248C;
            if (this.f8747l) {
                this.f8748m.mo15686b(atn);
            } else {
                boolean z = atn instanceof atb;
                if (!z || this.f8733e.f8875t == null) {
                    if (!z || this.f8733e.f8874s == null) {
                        boolean z2 = atn instanceof asz;
                        if (!z2 || this.f8733e.f8875t == null) {
                            if (!z2 || this.f8733e.f8873r == null) {
                                if ((atn instanceof atd) && this.f8733e.f8877v != null) {
                                    atd atd = (atd) atn;
                                    if (this.f8733e.f8877v.get(atd.mo14771l()) != null) {
                                        C3909jn.f13411a.post(new C3013ak(this, atd.mo14771l(), ijVar3));
                                    }
                                }
                                C3900je.m17435e("No matching listener for retrieved native ad template.");
                                mo12401a(0);
                                return false;
                            }
                            m10793a((asz) ijVar3.f13248C);
                        }
                    } else {
                        m10794a((atb) ijVar3.f13248C);
                    }
                }
                m10795a(m10799b(ijVar3.f13248C));
            }
        }
        return super.mo12425a(ijVar, ijVar2);
    }

    /* renamed from: a */
    public final boolean mo12426a(zzjj zzjj, ash ash) {
        try {
            mo12482m_();
            return super.mo12548a(zzjj, ash, this.f8752q);
        } catch (Exception e) {
            String str = "Error initializing webview.";
            if (C3987mk.m17428a(4)) {
                Log.i("Ads", str, e);
            }
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo12475a(zzjj zzjj, C3878ij ijVar, boolean z) {
        return this.f8732d.mo12498e();
    }

    /* renamed from: b */
    public final avp mo12476b(String str) {
        C3513t.m12634b("getOnCustomClickListener must be called on the main UI thread.");
        if (this.f8733e.f8876u == null) {
            return null;
        }
        return (avp) this.f8733e.f8876u.get(str);
    }

    /* renamed from: b */
    public final void mo12477b(int i) {
        C3513t.m12634b("setMaxNumberOfAds must be called on the main UI thread.");
        this.f8752q = i;
    }

    /* renamed from: b */
    public final void mo12478b(View view) {
        if (this.f8736h != null) {
            C3025aw.m10933u().mo15784a(this.f8736h, view);
        }
    }

    /* renamed from: b */
    public final void mo12479b(C4089qe qeVar) {
        this.f8750o = qeVar;
    }

    /* renamed from: c */
    public final void mo12480c(List<String> list) {
        C3513t.m12634b("setNativeTemplates must be called on the main UI thread.");
        this.f8733e.f8844F = list;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo12434d(boolean z) {
        String str;
        super.mo12434d(z);
        if (this.f8751p) {
            if (((Boolean) aoq.m14620f().mo14695a(aru.f11914cg)).booleanValue()) {
                mo12460M();
            }
        }
        if (!m10796ad()) {
            return;
        }
        if (this.f8750o != null || this.f8749n != null) {
            C4089qe qeVar = null;
            if (this.f8750o != null) {
                str = null;
                qeVar = this.f8750o;
            } else if (this.f8749n != null) {
                qeVar = this.f8749n;
                str = "javascript";
            } else {
                str = null;
            }
            if (qeVar.getWebView() != null && C3025aw.m10933u().mo15785a(this.f8733e.f8858c)) {
                int i = this.f8733e.f8860e.f14506b;
                int i2 = this.f8733e.f8860e.f14507c;
                StringBuilder sb = new StringBuilder(23);
                sb.append(i);
                sb.append(".");
                sb.append(i2);
                this.f8736h = C3025aw.m10933u().mo15782a(sb.toString(), qeVar.getWebView(), "", "javascript", str);
                if (this.f8736h != null) {
                    C3025aw.m10933u().mo15783a(this.f8736h);
                }
            }
        }
    }

    /* renamed from: l_ */
    public final String mo12481l_() {
        return this.f8754s;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m_ */
    public final void mo12482m_() throws C4100qp {
        synchronized (this.f8746k) {
            C3900je.m17043a("Initializing webview native ads utills");
            C3699bu buVar = new C3699bu(this.f8733e.f8858c, this, this.f8754s, this.f8733e.f8859d, this.f8733e.f8860e);
            this.f8753r = buVar;
        }
    }

    /* renamed from: o */
    public final void mo12442o() {
        throw new IllegalStateException("Native Ad DOES NOT support pause().");
    }

    /* renamed from: p */
    public final void mo12443p() {
        throw new IllegalStateException("Native Ad DOES NOT support resume().");
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo12451x() {
        mo12434d(false);
    }
}
