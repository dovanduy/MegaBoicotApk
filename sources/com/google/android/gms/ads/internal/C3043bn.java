package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.internal.ads.C3718cm;
import com.google.android.gms.internal.ads.C3878ij;
import com.google.android.gms.internal.ads.C3879ik;
import com.google.android.gms.internal.ads.C3900je;
import com.google.android.gms.internal.ads.C3909jn;
import com.google.android.gms.internal.ads.C3987mk;
import com.google.android.gms.internal.ads.C4089qe;
import com.google.android.gms.internal.ads.amj;
import com.google.android.gms.internal.ads.aqe;
import com.google.android.gms.internal.ads.aso;
import com.google.android.gms.internal.ads.asz;
import com.google.android.gms.internal.ads.atb;
import com.google.android.gms.internal.ads.atg;
import com.google.android.gms.internal.ads.ati;
import com.google.android.gms.internal.ads.atj;
import com.google.android.gms.internal.ads.atk;
import com.google.android.gms.internal.ads.atm;
import com.google.android.gms.internal.ads.atn;
import com.google.android.gms.internal.ads.auh;
import com.google.android.gms.internal.ads.ave;
import com.google.android.gms.internal.ads.avp;
import com.google.android.gms.internal.ads.bbk;
import com.google.android.gms.internal.ads.bca;
import com.google.android.gms.internal.ads.bcm;
import com.google.android.gms.internal.ads.bcq;
import com.google.android.gms.internal.ads.bct;
import com.google.android.gms.internal.ads.zzael;
import com.google.android.gms.internal.ads.zzaig;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzjj;
import com.google.android.gms.internal.ads.zzjn;
import com.google.android.gms.p137b.C3235a;
import com.google.android.gms.p137b.C3238b;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
@C3718cm
/* renamed from: com.google.android.gms.ads.internal.bn */
public final class C3043bn extends C3030ba implements atm {

    /* renamed from: k */
    private boolean f8907k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C3878ij f8908l;

    /* renamed from: m */
    private boolean f8909m = false;

    public C3043bn(Context context, C3049bt btVar, zzjn zzjn, String str, bca bca, zzang zzang) {
        super(context, zzjn, str, bca, zzang, btVar);
    }

    /* renamed from: J */
    private final bbk m11007J() {
        if (this.f8733e.f8865j == null || !this.f8733e.f8865j.f13278n) {
            return null;
        }
        return this.f8733e.f8865j.f13282r;
    }

    /* renamed from: a */
    private static C3878ij m11009a(C3879ik ikVar, int i) {
        C3879ik ikVar2 = ikVar;
        zzjj zzjj = ikVar2.f13291a.f14404c;
        List<String> list = ikVar2.f13292b.f14454c;
        List<String> list2 = ikVar2.f13292b.f14456e;
        List<String> list3 = ikVar2.f13292b.f14460i;
        int i2 = ikVar2.f13292b.f14462k;
        long j = ikVar2.f13292b.f14461j;
        String str = ikVar2.f13291a.f14410i;
        boolean z = ikVar2.f13292b.f14458g;
        bbk bbk = ikVar2.f13293c;
        long j2 = ikVar2.f13292b.f14459h;
        zzjn zzjn = ikVar2.f13294d;
        long j3 = j2;
        bbk bbk2 = bbk;
        long j4 = ikVar2.f13292b.f14457f;
        long j5 = ikVar2.f13296f;
        long j6 = ikVar2.f13297g;
        String str2 = ikVar2.f13292b.f14465n;
        JSONObject jSONObject = ikVar2.f13298h;
        zzaig zzaig = ikVar2.f13292b.f14428A;
        List<String> list4 = ikVar2.f13292b.f14429B;
        List<String> list5 = ikVar2.f13292b.f14429B;
        boolean z2 = ikVar2.f13292b.f14431D;
        zzael zzael = ikVar2.f13292b.f14432E;
        List<String> list6 = ikVar2.f13292b.f14435H;
        String str3 = ikVar2.f13292b.f14439L;
        long j7 = j6;
        amj amj = ikVar2.f13299i;
        boolean z3 = ikVar2.f13292b.f14442O;
        amj amj2 = amj;
        boolean z4 = ikVar2.f13300j;
        String str4 = str3;
        boolean z5 = ikVar2.f13292b.f14444Q;
        List<String> list7 = ikVar2.f13292b.f14445R;
        zzaig zzaig2 = zzaig;
        List<String> list8 = list4;
        List<String> list9 = list5;
        boolean z6 = z2;
        zzael zzael2 = zzael;
        List<String> list10 = list6;
        String str5 = str4;
        boolean z7 = z5;
        List<String> list11 = list7;
        JSONObject jSONObject2 = jSONObject;
        int i3 = i;
        String str6 = str2;
        boolean z8 = z3;
        bbk bbk3 = bbk2;
        long j8 = j3;
        zzjn zzjn2 = zzjn;
        long j9 = j4;
        long j10 = j5;
        long j11 = j7;
        amj amj3 = amj2;
        boolean z9 = z8;
        boolean z10 = z4;
        C3878ij ijVar = new C3878ij(zzjj, null, list, i3, list2, list3, i2, j, str, z, null, null, null, bbk3, null, j8, zzjn2, j9, j10, j11, str6, jSONObject2, null, zzaig2, list8, list9, z6, zzael2, null, list10, str5, amj3, z9, z10, z7, list11, ikVar2.f13292b.f14446S, ikVar2.f13292b.f14447T);
        return ijVar;
    }

    /* renamed from: a */
    private final void m11010a(atg atg) {
        C3909jn.f13411a.post(new C3045bp(this, atg));
    }

    /* renamed from: b */
    private final boolean m11011b(C3878ij ijVar, C3878ij ijVar2) {
        Handler handler;
        Runnable brVar;
        atg atg;
        C3878ij ijVar3 = ijVar2;
        View view = null;
        mo12578c(null);
        if (!this.f8733e.mo12527d()) {
            C3900je.m17435e("Native ad does not have custom rendering mode.");
        } else {
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
                } else if (h == null || this.f8733e.f8875t == null) {
                    if (h != null && this.f8733e.f8873r != null) {
                        String a2 = h.mo15110a();
                        List b2 = h.mo15113b();
                        String c3 = h.mo15115c();
                        auh d2 = h.mo15117d() != null ? h.mo15117d() : null;
                        String e2 = h.mo15118e();
                        double f2 = h.mo15119f();
                        String g2 = h.mo15120g();
                        String h3 = h.mo15121h();
                        Bundle l = h.mo15125l();
                        aqe m = h.mo15126m();
                        if (h.mo15129p() != null) {
                            view = (View) C3238b.m11574a(h.mo15129p());
                        }
                        asz asz = new asz(a2, b2, c3, d2, e2, f2, g2, h3, null, l, m, view, h.mo15130q(), c);
                        atj atj2 = new atj(this.f8733e.f8858c, (atm) this, this.f8733e.f8859d, h, (atn) asz);
                        asz.mo14758a((atk) atj2);
                        handler = C3909jn.f13411a;
                        brVar = new C3046bq(this, asz);
                    } else if (i != null && this.f8733e.f8875t != null) {
                        String a3 = i.mo15132a();
                        List b3 = i.mo15135b();
                        String c4 = i.mo15137c();
                        auh d3 = i.mo15139d() != null ? i.mo15139d() : null;
                        String e3 = i.mo15140e();
                        String f3 = i.mo15141f();
                        aqe l2 = i.mo15147l();
                        if (i.mo15149n() != null) {
                            view = (View) C3238b.m11574a(i.mo15149n());
                        }
                        atg atg2 = new atg(a3, b3, c4, d3, e3, f3, -1.0d, null, null, null, l2, view, i.mo15150o(), c, i.mo15145j());
                        bcq bcq = i;
                        atg = atg2;
                        atj atj3 = new atj(this.f8733e.f8858c, (atm) this, this.f8733e.f8859d, bcq, (atn) atg2);
                        atg.mo14758a((atk) atj3);
                    } else if (i != null && this.f8733e.f8874s != null) {
                        String a4 = i.mo15132a();
                        List b4 = i.mo15135b();
                        String c5 = i.mo15137c();
                        auh d4 = i.mo15139d() != null ? i.mo15139d() : null;
                        String e4 = i.mo15140e();
                        String f4 = i.mo15141f();
                        Bundle j2 = i.mo15145j();
                        aqe l3 = i.mo15147l();
                        if (i.mo15149n() != null) {
                            view = (View) C3238b.m11574a(i.mo15149n());
                        }
                        atb atb = new atb(a4, b4, c5, d4, e4, f4, null, j2, l3, view, i.mo15150o(), c);
                        bcq bcq2 = i;
                        atb atb2 = atb;
                        atj atj4 = new atj(this.f8733e.f8858c, (atm) this, this.f8733e.f8859d, bcq2, (atn) atb);
                        atb2.mo14758a((atk) atj4);
                        handler = C3909jn.f13411a;
                        brVar = new C3047br(this, atb2);
                    } else if (n == null || this.f8733e.f8877v == null || this.f8733e.f8877v.get(n.mo14771l()) == null) {
                        C3900je.m17435e("No matching mapper/listener for retrieved native ad template.");
                        mo12401a(0);
                        return false;
                    } else {
                        C3909jn.f13411a.post(new C3048bs(this, n));
                        return super.mo12425a(ijVar, ijVar2);
                    }
                    handler.post(brVar);
                    return super.mo12425a(ijVar, ijVar2);
                } else {
                    String a5 = h.mo15110a();
                    List b5 = h.mo15113b();
                    String c6 = h.mo15115c();
                    auh d5 = h.mo15117d() != null ? h.mo15117d() : null;
                    String e5 = h.mo15118e();
                    double f5 = h.mo15119f();
                    String g3 = h.mo15120g();
                    String h4 = h.mo15121h();
                    aqe m2 = h.mo15126m();
                    if (h.mo15129p() != null) {
                        view = (View) C3238b.m11574a(h.mo15129p());
                    }
                    atg = new atg(a5, b5, c6, d5, e5, null, f5, g3, h4, null, m2, view, h.mo15130q(), c, h.mo15125l());
                    atj atj5 = new atj(this.f8733e.f8858c, (atm) this, this.f8733e.f8859d, h, (atn) atg);
                    atg.mo14758a((atk) atj5);
                }
                m11010a(atg);
                return super.mo12425a(ijVar, ijVar2);
            } catch (RemoteException e6) {
                C3900je.m17434d("#007 Could not call remote method.", e6);
            }
        }
        mo12401a(0);
        return false;
    }

    /* renamed from: c */
    private final boolean m11012c(C3878ij ijVar, C3878ij ijVar2) {
        View a = C3132s.m11231a(ijVar2);
        if (a == null) {
            return false;
        }
        View nextView = this.f8733e.f8861f.getNextView();
        if (nextView != null) {
            if (nextView instanceof C4089qe) {
                ((C4089qe) nextView).destroy();
            }
            this.f8733e.f8861f.removeView(nextView);
        }
        if (!C3132s.m11243b(ijVar2)) {
            try {
                mo12403a(a);
            } catch (Throwable th) {
                C3025aw.m10921i().mo15436a(th, "AdLoaderManager.swapBannerViews");
                C3900je.m17432c("Could not add mediation view to view hierarchy.", th);
                return false;
            }
        }
        if (this.f8733e.f8861f.getChildCount() > 1) {
            this.f8733e.f8861f.showNext();
        }
        if (ijVar != null) {
            View nextView2 = this.f8733e.f8861f.getNextView();
            if (nextView2 != null) {
                this.f8733e.f8861f.removeView(nextView2);
            }
            this.f8733e.mo12526c();
        }
        this.f8733e.f8861f.setMinimumWidth(mo12439l().f14548f);
        this.f8733e.f8861f.setMinimumHeight(mo12439l().f14545c);
        this.f8733e.f8861f.requestLayout();
        this.f8733e.f8861f.setVisibility(0);
        return true;
    }

    /* renamed from: I */
    public final void mo12456I() {
        throw new IllegalStateException("Interstitial is not supported by AdLoaderManager.");
    }

    /* renamed from: L */
    public final void mo12459L() {
        C3987mk.m17434d("#005 Unexpected call to an abstract (unimplemented) method.", null);
    }

    /* renamed from: P */
    public final void mo12463P() {
        C3987mk.m17434d("#005 Unexpected call to an abstract (unimplemented) method.", null);
    }

    /* renamed from: Q */
    public final void mo12464Q() {
        C3987mk.m17434d("#005 Unexpected call to an abstract (unimplemented) method.", null);
    }

    /* renamed from: S */
    public final boolean mo12466S() {
        if (m11007J() != null) {
            return m11007J().f12578p;
        }
        return false;
    }

    /* renamed from: T */
    public final boolean mo12467T() {
        if (m11007J() != null) {
            return m11007J().f12579q;
        }
        return false;
    }

    /* renamed from: U */
    public final void mo12468U() {
        if (this.f8733e.f8865j == null || !"com.google.ads.mediation.admob.AdMobAdapter".equals(this.f8733e.f8865j.f13281q) || this.f8733e.f8865j.f13279o == null || !this.f8733e.f8865j.f13279o.mo15055b()) {
            super.mo12468U();
        } else {
            mo12453z();
        }
    }

    /* renamed from: V */
    public final void mo12469V() {
        if (this.f8733e.f8865j == null || !"com.google.ads.mediation.admob.AdMobAdapter".equals(this.f8733e.f8865j.f13281q) || this.f8733e.f8865j.f13279o == null || !this.f8733e.f8865j.f13279o.mo15055b()) {
            super.mo12469V();
        } else {
            mo12452y();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo12577a(C3235a aVar) {
        Object a = aVar != null ? C3238b.m11574a(aVar) : null;
        if (a instanceof atk) {
            ((atk) a).mo14841d();
        }
        super.mo12552b(this.f8733e.f8865j, false);
    }

    /* renamed from: a */
    public final void mo12411a(aso aso) {
        throw new IllegalStateException("CustomRendering is not supported by AdLoaderManager.");
    }

    /* renamed from: a */
    public final void mo12472a(ati ati) {
        C3987mk.m17434d("#005 Unexpected call to an abstract (unimplemented) method.", null);
    }

    /* renamed from: a */
    public final void mo12473a(atk atk) {
        C3987mk.m17434d("#005 Unexpected call to an abstract (unimplemented) method.", null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0026  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12415a(com.google.android.gms.internal.ads.C3879ik r11, com.google.android.gms.internal.ads.ash r12) {
        /*
            r10 = this;
            r0 = 0
            r10.f8908l = r0
            int r0 = r11.f13295e
            r1 = 0
            r2 = -2
            if (r0 == r2) goto L_0x0012
            int r0 = r11.f13295e
            com.google.android.gms.internal.ads.ij r0 = m11009a(r11, r0)
        L_0x000f:
            r10.f8908l = r0
            goto L_0x0022
        L_0x0012:
            com.google.android.gms.internal.ads.zzaej r0 = r11.f13292b
            boolean r0 = r0.f14458g
            if (r0 != 0) goto L_0x0022
            java.lang.String r0 = "partialAdState is not mediation"
            com.google.android.gms.internal.ads.C3900je.m17435e(r0)
            com.google.android.gms.internal.ads.ij r0 = m11009a(r11, r1)
            goto L_0x000f
        L_0x0022:
            com.google.android.gms.internal.ads.ij r0 = r10.f8908l
            if (r0 == 0) goto L_0x0031
            android.os.Handler r11 = com.google.android.gms.internal.ads.C3909jn.f13411a
            com.google.android.gms.ads.internal.bo r12 = new com.google.android.gms.ads.internal.bo
            r12.<init>(r10)
            r11.post(r12)
            return
        L_0x0031:
            com.google.android.gms.internal.ads.zzjn r0 = r11.f13294d
            if (r0 == 0) goto L_0x003b
            com.google.android.gms.ads.internal.ax r0 = r10.f8733e
            com.google.android.gms.internal.ads.zzjn r2 = r11.f13294d
            r0.f8864i = r2
        L_0x003b:
            com.google.android.gms.ads.internal.ax r0 = r10.f8733e
            r0.f8847I = r1
            com.google.android.gms.ads.internal.ax r0 = r10.f8733e
            com.google.android.gms.ads.internal.C3025aw.m10916d()
            com.google.android.gms.ads.internal.ax r1 = r10.f8733e
            android.content.Context r2 = r1.f8858c
            com.google.android.gms.ads.internal.ax r1 = r10.f8733e
            com.google.android.gms.internal.ads.agw r5 = r1.f8859d
            r6 = 0
            com.google.android.gms.internal.ads.bca r7 = r10.f8888j
            r3 = r10
            r4 = r11
            r8 = r10
            r9 = r12
            com.google.android.gms.internal.ads.kg r11 = com.google.android.gms.internal.ads.C3663ao.m14575a(r2, r3, r4, r5, r6, r7, r8, r9)
            r0.f8863h = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.C3043bn.mo12415a(com.google.android.gms.internal.ads.ik, com.google.android.gms.internal.ads.ash):void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo12425a(com.google.android.gms.internal.ads.C3878ij r5, com.google.android.gms.internal.ads.C3878ij r6) {
        /*
            r4 = this;
            com.google.android.gms.ads.internal.ax r0 = r4.f8733e
            boolean r0 = r0.mo12527d()
            if (r0 != 0) goto L_0x0010
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "AdLoader API does not support custom rendering."
            r5.<init>(r6)
            throw r5
        L_0x0010:
            boolean r0 = r6.f13278n
            r1 = 0
            if (r0 != 0) goto L_0x001e
            r4.mo12401a(r1)
            java.lang.String r5 = "newState is not mediation."
        L_0x001a:
            com.google.android.gms.internal.ads.C3900je.m17435e(r5)
            return r1
        L_0x001e:
            com.google.android.gms.internal.ads.bbj r0 = r6.f13279o
            r2 = 1
            if (r0 == 0) goto L_0x0072
            com.google.android.gms.internal.ads.bbj r0 = r6.f13279o
            boolean r0 = r0.mo15054a()
            if (r0 == 0) goto L_0x0072
            com.google.android.gms.ads.internal.ax r0 = r4.f8733e
            boolean r0 = r0.mo12527d()
            if (r0 == 0) goto L_0x0046
            com.google.android.gms.ads.internal.ax r0 = r4.f8733e
            com.google.android.gms.ads.internal.ay r0 = r0.f8861f
            if (r0 == 0) goto L_0x0046
            com.google.android.gms.ads.internal.ax r0 = r4.f8733e
            com.google.android.gms.ads.internal.ay r0 = r0.f8861f
            com.google.android.gms.internal.ads.kh r0 = r0.mo12532a()
            java.lang.String r3 = r6.f13246A
            r0.mo15568c(r3)
        L_0x0046:
            boolean r0 = super.mo12425a(r5, r6)
            if (r0 != 0) goto L_0x004e
        L_0x004c:
            r5 = r1
            goto L_0x006c
        L_0x004e:
            com.google.android.gms.ads.internal.ax r0 = r4.f8733e
            boolean r0 = r0.mo12527d()
            if (r0 == 0) goto L_0x0060
            boolean r5 = r4.m11012c(r5, r6)
            if (r5 != 0) goto L_0x0060
            r4.mo12401a(r1)
            goto L_0x004c
        L_0x0060:
            com.google.android.gms.ads.internal.ax r5 = r4.f8733e
            boolean r5 = r5.mo12528e()
            if (r5 != 0) goto L_0x006b
            super.mo12546a(r6, r1)
        L_0x006b:
            r5 = r2
        L_0x006c:
            if (r5 != 0) goto L_0x006f
            return r1
        L_0x006f:
            r4.f8909m = r2
            goto L_0x0085
        L_0x0072:
            com.google.android.gms.internal.ads.bbj r0 = r6.f13279o
            if (r0 == 0) goto L_0x009b
            com.google.android.gms.internal.ads.bbj r0 = r6.f13279o
            boolean r0 = r0.mo15055b()
            if (r0 == 0) goto L_0x009b
            boolean r5 = r4.m11011b(r5, r6)
            if (r5 != 0) goto L_0x0085
            return r1
        L_0x0085:
            java.util.ArrayList r5 = new java.util.ArrayList
            java.lang.Integer[] r6 = new java.lang.Integer[r2]
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r1] = r0
            java.util.List r6 = java.util.Arrays.asList(r6)
            r5.<init>(r6)
            r4.mo12579d(r5)
            return r2
        L_0x009b:
            r4.mo12401a(r1)
            java.lang.String r5 = "Response is neither banner nor native."
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.C3043bn.mo12425a(com.google.android.gms.internal.ads.ij, com.google.android.gms.internal.ads.ij):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo12475a(zzjj zzjj, C3878ij ijVar, boolean z) {
        return false;
    }

    /* renamed from: b */
    public final avp mo12476b(String str) {
        C3513t.m12634b("getOnCustomClickListener must be called on the main UI thread.");
        return (avp) this.f8733e.f8876u.get(str);
    }

    /* renamed from: b */
    public final void mo12478b(View view) {
        C3987mk.m17434d("#005 Unexpected call to an abstract (unimplemented) method.", null);
    }

    /* renamed from: b */
    public final void mo12430b(boolean z) {
        C3513t.m12634b("setManualImpressionsEnabled must be called from the main thread.");
        this.f8907k = z;
    }

    /* renamed from: b */
    public final boolean mo12431b(zzjj zzjj) {
        C3043bn bnVar = this;
        zzjj zzjj2 = zzjj;
        if (bnVar.f8733e.f8839A != null && bnVar.f8733e.f8839A.size() == 1 && ((Integer) bnVar.f8733e.f8839A.get(0)).intValue() == 2) {
            C3900je.m17431c("Requesting only banner Ad from AdLoader or calling loadAd on returned banner is not yet supported");
            bnVar.mo12401a(0);
            return false;
        } else if (bnVar.f8733e.f8881z == null) {
            return super.mo12431b(zzjj);
        } else {
            if (zzjj2.f14532h != bnVar.f8907k) {
                int i = zzjj2.f14525a;
                long j = zzjj2.f14526b;
                Bundle bundle = zzjj2.f14527c;
                int i2 = zzjj2.f14528d;
                List<String> list = zzjj2.f14529e;
                boolean z = zzjj2.f14530f;
                int i3 = zzjj2.f14531g;
                boolean z2 = zzjj2.f14532h || bnVar.f8907k;
                zzjj zzjj3 = new zzjj(i, j, bundle, i2, list, z, i3, z2, zzjj2.f14533i, zzjj2.f14534j, zzjj2.f14535k, zzjj2.f14536l, zzjj2.f14537m, zzjj2.f14538n, zzjj2.f14539o, zzjj2.f14540p, zzjj2.f14541q, zzjj2.f14542r);
                zzjj2 = zzjj3;
                bnVar = this;
            }
            return super.mo12431b(zzjj2);
        }
    }

    /* renamed from: c */
    public final void mo12578c(List<String> list) {
        C3513t.m12634b("setNativeTemplates must be called on the main UI thread.");
        this.f8733e.f8844F = list;
    }

    /* renamed from: d */
    public final void mo12579d(List<Integer> list) {
        C3513t.m12634b("setAllowedAdTypes must be called on the main UI thread.");
        this.f8733e.f8839A = list;
    }

    /* renamed from: o */
    public final void mo12442o() {
        if (!this.f8909m) {
            throw new IllegalStateException("Native Ad does not support pause().");
        }
        super.mo12442o();
    }

    /* renamed from: p */
    public final void mo12443p() {
        if (!this.f8909m) {
            throw new IllegalStateException("Native Ad does not support resume().");
        }
        super.mo12443p();
    }

    /* renamed from: t */
    public final aqe mo12447t() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo12451x() {
        super.mo12451x();
        C3878ij ijVar = this.f8733e.f8865j;
        if (!(ijVar == null || ijVar.f13279o == null || !ijVar.f13279o.mo15054a() || this.f8733e.f8881z == null)) {
            try {
                this.f8733e.f8881z.mo14916a(this, C3238b.m11573a(this.f8733e.f8858c));
                super.mo12552b(this.f8733e.f8865j, false);
            } catch (RemoteException e) {
                C3900je.m17434d("#007 Could not call remote method.", e);
            }
        }
    }
}
