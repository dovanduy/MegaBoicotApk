package com.google.android.gms.ads.internal;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.p017v4.p023d.C0376a;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.webkit.WebView;
import com.google.android.gms.ads.C2973d;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.internal.ads.C3718cm;
import com.google.android.gms.internal.ads.C3862hu;
import com.google.android.gms.internal.ads.C3866hy;
import com.google.android.gms.internal.ads.C3878ij;
import com.google.android.gms.internal.ads.C3879ik;
import com.google.android.gms.internal.ads.C3900je;
import com.google.android.gms.internal.ads.C3909jn;
import com.google.android.gms.internal.ads.C4089qe;
import com.google.android.gms.internal.ads.C4100qp;
import com.google.android.gms.internal.ads.C4128rq;
import com.google.android.gms.internal.ads.C4130rs;
import com.google.android.gms.internal.ads.akg;
import com.google.android.gms.internal.ads.akk;
import com.google.android.gms.internal.ads.aoq;
import com.google.android.gms.internal.ads.aqe;
import com.google.android.gms.internal.ads.bca;
import com.google.android.gms.internal.ads.bcm;
import com.google.android.gms.internal.ads.bcq;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzjj;
import com.google.android.gms.internal.ads.zzjn;
import com.google.android.gms.p137b.C3238b;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3718cm
/* renamed from: com.google.android.gms.ads.internal.bv */
public final class C3051bv extends C3035bf implements OnGlobalLayoutListener, OnScrollChangedListener {

    /* renamed from: k */
    private boolean f8927k;

    /* renamed from: l */
    private boolean f8928l;

    /* renamed from: m */
    private WeakReference<Object> f8929m = new WeakReference<>(null);

    public C3051bv(Context context, zzjn zzjn, String str, bca bca, zzang zzang, C3049bt btVar) {
        super(context, zzjn, str, bca, zzang, btVar);
    }

    /* renamed from: b */
    private final boolean m11043b(C3878ij ijVar, C3878ij ijVar2) {
        if (ijVar2.f13278n) {
            View a = C3132s.m11231a(ijVar2);
            if (a == null) {
                C3900je.m17435e("Could not get mediation view");
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
                    if (C3025aw.m10908B().mo15390b(this.f8733e.f8858c)) {
                        new akg(this.f8733e.f8858c, a).mo14416a((akk) new C3866hy(this.f8733e.f8858c, this.f8733e.f8857b));
                    }
                    if (ijVar2.f13285u != null) {
                        this.f8733e.f8861f.setMinimumWidth(ijVar2.f13285u.f14548f);
                        this.f8733e.f8861f.setMinimumHeight(ijVar2.f13285u.f14545c);
                    }
                    mo12403a(a);
                } catch (Exception e) {
                    C3025aw.m10921i().mo15436a((Throwable) e, "BannerAdManager.swapViews");
                    C3900je.m17432c("Could not add mediation view to view hierarchy.", e);
                    return false;
                }
            }
        } else if (!(ijVar2.f13285u == null || ijVar2.f13266b == null)) {
            ijVar2.f13266b.mo15878a(C4130rs.m17979a(ijVar2.f13285u));
            this.f8733e.f8861f.removeAllViews();
            this.f8733e.f8861f.setMinimumWidth(ijVar2.f13285u.f14548f);
            this.f8733e.f8861f.setMinimumHeight(ijVar2.f13285u.f14545c);
            mo12403a(ijVar2.f13266b.getView());
        }
        if (this.f8733e.f8861f.getChildCount() > 1) {
            this.f8733e.f8861f.showNext();
        }
        if (ijVar != null) {
            View nextView2 = this.f8733e.f8861f.getNextView();
            if (nextView2 instanceof C4089qe) {
                ((C4089qe) nextView2).destroy();
            } else if (nextView2 != null) {
                this.f8733e.f8861f.removeView(nextView2);
            }
            this.f8733e.mo12526c();
        }
        this.f8733e.f8861f.setVisibility(0);
        return true;
    }

    /* renamed from: c */
    private final void m11044c(C4089qe qeVar) {
        if (mo12562M()) {
            WebView webView = qeVar.getWebView();
            if (webView != null) {
                View view = qeVar.getView();
                if (view != null && C3025aw.m10933u().mo15785a(this.f8733e.f8858c)) {
                    int i = this.f8733e.f8860e.f14506b;
                    int i2 = this.f8733e.f8860e.f14507c;
                    StringBuilder sb = new StringBuilder(23);
                    sb.append(i);
                    sb.append(".");
                    sb.append(i2);
                    this.f8736h = C3025aw.m10933u().mo15782a(sb.toString(), webView, "", "javascript", mo12399H());
                    if (this.f8736h != null) {
                        C3025aw.m10933u().mo15784a(this.f8736h, view);
                        C3025aw.m10933u().mo15783a(this.f8736h);
                        this.f8928l = true;
                    }
                }
            }
        }
    }

    /* renamed from: I */
    public final void mo12456I() {
        throw new IllegalStateException("Interstitial is NOT supported by BannerAdManager.");
    }

    /* renamed from: L */
    public final void mo12588L() {
        this.f8732d.mo12497d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: X */
    public final boolean mo12542X() {
        boolean z;
        C3025aw.m10917e();
        if (!C3909jn.m17147a(this.f8733e.f8858c, "android.permission.INTERNET")) {
            aoq.m14615a().mo15624a(this.f8733e.f8861f, this.f8733e.f8864i, "Missing internet permission in AndroidManifest.xml.", "Missing internet permission in AndroidManifest.xml. You must have the following declaration: <uses-permission android:name=\"android.permission.INTERNET\" />");
            z = false;
        } else {
            z = true;
        }
        C3025aw.m10917e();
        if (!C3909jn.m17146a(this.f8733e.f8858c)) {
            aoq.m14615a().mo15624a(this.f8733e.f8861f, this.f8733e.f8864i, "Missing AdActivity with android:configChanges in AndroidManifest.xml.", "Missing AdActivity with android:configChanges in AndroidManifest.xml. You must have the following declaration within the <application> element: <activity android:name=\"com.google.android.gms.ads.AdActivity\" android:configChanges=\"keyboard|keyboardHidden|orientation|screenLayout|uiMode|screenSize|smallestScreenSize\" />");
            z = false;
        }
        if (!z && this.f8733e.f8861f != null) {
            this.f8733e.f8861f.setVisibility(0);
        }
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C4089qe mo12564a(C3879ik ikVar, C3050bu buVar, C3862hu huVar) throws C4100qp {
        zzjn zzjn;
        C2973d dVar;
        if (this.f8733e.f8864i.f14549g == null && this.f8733e.f8864i.f14551i) {
            C3026ax axVar = this.f8733e;
            if (ikVar.f13292b.f14476y) {
                zzjn = this.f8733e.f8864i;
            } else {
                String str = ikVar.f13292b.f14463l;
                if (str != null) {
                    String[] split = str.split("[xX]");
                    split[0] = split[0].trim();
                    split[1] = split[1].trim();
                    dVar = new C2973d(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
                } else {
                    dVar = this.f8733e.f8864i.mo16268b();
                }
                zzjn = new zzjn(this.f8733e.f8858c, dVar);
            }
            axVar.f8864i = zzjn;
        }
        return super.mo12564a(ikVar, buVar, huVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo12546a(C3878ij ijVar, boolean z) {
        if (mo12562M()) {
            C4089qe qeVar = ijVar != null ? ijVar.f13266b : null;
            if (qeVar != null) {
                if (!this.f8928l) {
                    m11044c(qeVar);
                }
                if (this.f8736h != null) {
                    qeVar.mo14986a("onSdkImpression", (Map) new C0376a());
                }
            }
        }
        super.mo12546a(ijVar, z);
        if (C3132s.m11243b(ijVar)) {
            C3054d dVar = new C3054d(this);
            if (ijVar != null && C3132s.m11243b(ijVar)) {
                C4089qe qeVar2 = ijVar.f13266b;
                Object view = qeVar2 != null ? qeVar2.getView() : null;
                if (view == null) {
                    C3900je.m17435e("AdWebView is null");
                    return;
                }
                try {
                    List list = ijVar.f13279o != null ? ijVar.f13279o.f12559r : null;
                    if (list != null) {
                        if (!list.isEmpty()) {
                            bcm h = ijVar.f13280p != null ? ijVar.f13280p.mo15101h() : null;
                            bcq i = ijVar.f13280p != null ? ijVar.f13280p.mo15102i() : null;
                            if (list.contains("2") && h != null) {
                                h.mo15114b(C3238b.m11573a(view));
                                if (!h.mo15123j()) {
                                    h.mo15122i();
                                }
                                qeVar2.mo15880a("/nativeExpressViewClicked", C3132s.m11232a(h, (bcq) null, dVar));
                                return;
                            } else if (!list.contains("1") || i == null) {
                                C3900je.m17435e("No matching template id and mapper");
                                return;
                            } else {
                                i.mo15136b(C3238b.m11573a(view));
                                if (!i.mo15143h()) {
                                    i.mo15142g();
                                }
                                qeVar2.mo15880a("/nativeExpressViewClicked", C3132s.m11232a((bcm) null, i, dVar));
                                return;
                            }
                        }
                    }
                    C3900je.m17435e("No template ids present in mediation response");
                } catch (RemoteException e) {
                    C3900je.m17432c("Error occurred while recording impression and registering for clicks", e);
                }
            }
        }
    }

    /* JADX INFO: used method not loaded: com.google.android.gms.internal.ads.ars.a(com.google.android.gms.internal.ads.ark):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007c, code lost:
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.aoq.m14620f().mo14695a((com.google.android.gms.internal.ads.ark) com.google.android.gms.internal.ads.aru.f11851bW)).booleanValue() != false) goto L_0x007e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo12425a(com.google.android.gms.internal.ads.C3878ij r5, com.google.android.gms.internal.ads.C3878ij r6) {
        /*
            r4 = this;
            boolean r0 = super.mo12425a(r5, r6)
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            com.google.android.gms.ads.internal.ax r0 = r4.f8733e
            boolean r0 = r0.mo12527d()
            if (r0 == 0) goto L_0x0025
            boolean r5 = r4.m11043b(r5, r6)
            if (r5 != 0) goto L_0x0025
            com.google.android.gms.internal.ads.amj r5 = r6.f13256K
            if (r5 == 0) goto L_0x0021
            com.google.android.gms.internal.ads.amj r5 = r6.f13256K
            com.google.android.gms.internal.ads.aml$a$b r6 = com.google.android.gms.internal.ads.aml.C3658a.C3660b.AD_FAILED_TO_LOAD
            r5.mo14518a(r6)
        L_0x0021:
            r4.mo12401a(r1)
            return r1
        L_0x0025:
            r4.mo12552b(r6, r1)
            boolean r5 = r6.f13276l
            r0 = 0
            if (r5 == 0) goto L_0x0064
            r4.mo12589d(r6)
            com.google.android.gms.ads.internal.C3025aw.m10907A()
            com.google.android.gms.ads.internal.ax r5 = r4.f8733e
            com.google.android.gms.ads.internal.ay r5 = r5.f8861f
            com.google.android.gms.internal.ads.C4027nx.m17491a(r5, r4)
            com.google.android.gms.ads.internal.C3025aw.m10907A()
            com.google.android.gms.ads.internal.ax r5 = r4.f8733e
            com.google.android.gms.ads.internal.ay r5 = r5.f8861f
            com.google.android.gms.internal.ads.C4027nx.m17492a(r5, r4)
            boolean r5 = r6.f13277m
            if (r5 != 0) goto L_0x0081
            com.google.android.gms.ads.internal.c r5 = new com.google.android.gms.ads.internal.c
            r5.<init>(r4)
            com.google.android.gms.internal.ads.qe r1 = r6.f13266b
            if (r1 == 0) goto L_0x0058
            com.google.android.gms.internal.ads.qe r1 = r6.f13266b
            com.google.android.gms.internal.ads.rm r1 = r1.mo15919v()
            goto L_0x0059
        L_0x0058:
            r1 = r0
        L_0x0059:
            if (r1 == 0) goto L_0x0081
            com.google.android.gms.ads.internal.bw r2 = new com.google.android.gms.ads.internal.bw
            r2.<init>(r6, r5)
            r1.mo15934a(r2)
            goto L_0x0081
        L_0x0064:
            com.google.android.gms.ads.internal.ax r5 = r4.f8733e
            boolean r5 = r5.mo12528e()
            if (r5 == 0) goto L_0x007e
            com.google.android.gms.internal.ads.ark<java.lang.Boolean> r5 = com.google.android.gms.internal.ads.aru.f11851bW
            com.google.android.gms.internal.ads.ars r2 = com.google.android.gms.internal.ads.aoq.m14620f()
            java.lang.Object r5 = r2.mo14695a(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0081
        L_0x007e:
            r4.mo12546a(r6, r1)
        L_0x0081:
            com.google.android.gms.internal.ads.qe r5 = r6.f13266b
            if (r5 == 0) goto L_0x00a5
            com.google.android.gms.internal.ads.qe r5 = r6.f13266b
            com.google.android.gms.internal.ads.qu r5 = r5.mo15799b()
            com.google.android.gms.internal.ads.qe r1 = r6.f13266b
            com.google.android.gms.internal.ads.rm r1 = r1.mo15919v()
            if (r1 == 0) goto L_0x0096
            r1.mo15947g()
        L_0x0096:
            com.google.android.gms.ads.internal.ax r1 = r4.f8733e
            com.google.android.gms.internal.ads.zzmu r1 = r1.f8879x
            if (r1 == 0) goto L_0x00a5
            if (r5 == 0) goto L_0x00a5
            com.google.android.gms.ads.internal.ax r1 = r4.f8733e
            com.google.android.gms.internal.ads.zzmu r1 = r1.f8879x
            r5.mo15985a(r1)
        L_0x00a5:
            boolean r5 = com.google.android.gms.common.util.C3563o.m12763b()
            if (r5 == 0) goto L_0x0142
            com.google.android.gms.ads.internal.ax r5 = r4.f8733e
            boolean r5 = r5.mo12527d()
            if (r5 == 0) goto L_0x011e
            com.google.android.gms.internal.ads.qe r5 = r6.f13266b
            if (r5 == 0) goto L_0x0139
            org.json.JSONObject r5 = r6.f13275k
            if (r5 == 0) goto L_0x00c4
            com.google.android.gms.internal.ads.aji r5 = r4.f8735g
            com.google.android.gms.ads.internal.ax r0 = r4.f8733e
            com.google.android.gms.internal.ads.zzjn r0 = r0.f8864i
            r5.mo14376a(r0, r6)
        L_0x00c4:
            com.google.android.gms.internal.ads.qe r5 = r6.f13266b
            android.view.View r0 = r5.getView()
            com.google.android.gms.internal.ads.akg r5 = new com.google.android.gms.internal.ads.akg
            com.google.android.gms.ads.internal.ax r1 = r4.f8733e
            android.content.Context r1 = r1.f8858c
            r5.<init>(r1, r0)
            com.google.android.gms.internal.ads.hz r1 = com.google.android.gms.ads.internal.C3025aw.m10908B()
            com.google.android.gms.ads.internal.ax r2 = r4.f8733e
            android.content.Context r2 = r2.f8858c
            boolean r1 = r1.mo15390b(r2)
            if (r1 == 0) goto L_0x0103
            com.google.android.gms.internal.ads.zzjj r1 = r6.f13265a
            boolean r1 = m10725a(r1)
            if (r1 == 0) goto L_0x0103
            com.google.android.gms.ads.internal.ax r1 = r4.f8733e
            java.lang.String r1 = r1.f8857b
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0103
            com.google.android.gms.internal.ads.hy r1 = new com.google.android.gms.internal.ads.hy
            com.google.android.gms.ads.internal.ax r2 = r4.f8733e
            android.content.Context r2 = r2.f8858c
            com.google.android.gms.ads.internal.ax r3 = r4.f8733e
            java.lang.String r3 = r3.f8857b
            r1.<init>(r2, r3)
            r5.mo14416a(r1)
        L_0x0103:
            boolean r1 = r6.mo15412a()
            if (r1 == 0) goto L_0x010f
            com.google.android.gms.internal.ads.qe r1 = r6.f13266b
            r5.mo14416a(r1)
            goto L_0x0139
        L_0x010f:
            com.google.android.gms.internal.ads.qe r1 = r6.f13266b
            com.google.android.gms.internal.ads.rm r1 = r1.mo15919v()
            com.google.android.gms.ads.internal.b r2 = new com.google.android.gms.ads.internal.b
            r2.<init>(r5, r6)
            r1.mo15933a(r2)
            goto L_0x0139
        L_0x011e:
            com.google.android.gms.ads.internal.ax r5 = r4.f8733e
            android.view.View r5 = r5.f8846H
            if (r5 == 0) goto L_0x0139
            org.json.JSONObject r5 = r6.f13275k
            if (r5 == 0) goto L_0x0139
            com.google.android.gms.internal.ads.aji r5 = r4.f8735g
            com.google.android.gms.ads.internal.ax r0 = r4.f8733e
            com.google.android.gms.internal.ads.zzjn r0 = r0.f8864i
            com.google.android.gms.ads.internal.ax r1 = r4.f8733e
            android.view.View r1 = r1.f8846H
            r5.mo14377a(r0, r6, r1)
            com.google.android.gms.ads.internal.ax r5 = r4.f8733e
            android.view.View r0 = r5.f8846H
        L_0x0139:
            boolean r5 = r6.f13278n
            if (r5 != 0) goto L_0x0142
            com.google.android.gms.ads.internal.ax r5 = r4.f8733e
            r5.mo12522a(r0)
        L_0x0142:
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.C3051bv.mo12425a(com.google.android.gms.internal.ads.ij, com.google.android.gms.internal.ads.ij):boolean");
    }

    /* renamed from: b */
    public final void mo12430b(boolean z) {
        C3513t.m12634b("setManualImpressionsEnabled must be called from the main thread.");
        this.f8927k = z;
    }

    /* renamed from: b */
    public final boolean mo12431b(zzjj zzjj) {
        C3051bv bvVar = this;
        zzjj zzjj2 = zzjj;
        if (zzjj2.f14532h != bvVar.f8927k) {
            int i = zzjj2.f14525a;
            long j = zzjj2.f14526b;
            Bundle bundle = zzjj2.f14527c;
            int i2 = zzjj2.f14528d;
            List<String> list = zzjj2.f14529e;
            boolean z = zzjj2.f14530f;
            int i3 = zzjj2.f14531g;
            zzjj zzjj3 = new zzjj(i, j, bundle, i2, list, z, i3, zzjj2.f14532h || bvVar.f8927k, zzjj2.f14533i, zzjj2.f14534j, zzjj2.f14535k, zzjj2.f14536l, zzjj2.f14537m, zzjj2.f14538n, zzjj2.f14539o, zzjj2.f14540p, zzjj2.f14541q, zzjj2.f14542r);
            zzjj2 = zzjj3;
            bvVar = this;
        }
        return super.mo12431b(zzjj2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo12589d(C3878ij ijVar) {
        if (ijVar != null && !ijVar.f13277m && this.f8733e.f8861f != null && C3025aw.m10917e().mo15519a((View) this.f8733e.f8861f, this.f8733e.f8858c) && this.f8733e.f8861f.getGlobalVisibleRect(new Rect(), null)) {
            if (!(ijVar == null || ijVar.f13266b == null || ijVar.f13266b.mo15919v() == null)) {
                ijVar.f13266b.mo15919v().mo15934a((C4128rq) null);
            }
            mo12546a(ijVar, false);
            ijVar.f13277m = true;
        }
    }

    public final void onGlobalLayout() {
        mo12589d(this.f8733e.f8865j);
    }

    public final void onScrollChanged() {
        mo12589d(this.f8733e.f8865j);
    }

    /* renamed from: t */
    public final aqe mo12447t() {
        C3513t.m12634b("getVideoController must be called from the main thread.");
        if (this.f8733e.f8865j == null || this.f8733e.f8865j.f13266b == null) {
            return null;
        }
        return this.f8733e.f8865j.f13266b.mo15799b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo12451x() {
        C4089qe qeVar = this.f8733e.f8865j != null ? this.f8733e.f8865j.f13266b : null;
        if (!this.f8928l && qeVar != null) {
            m11044c(qeVar);
        }
        super.mo12451x();
    }
}
