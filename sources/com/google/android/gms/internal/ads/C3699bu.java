package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C3006ad;
import com.google.android.gms.ads.internal.C3025aw;
import com.google.android.gms.ads.internal.C3050bu;
import com.google.android.gms.ads.internal.gmsg.C3067ae;
import com.google.android.gms.ads.internal.gmsg.C3073c;
import org.json.JSONObject;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.bu */
public final class C3699bu implements C3695bq<C4089qe> {

    /* renamed from: a */
    private C4008ne<C4089qe> f12764a;

    /* renamed from: b */
    private final C3073c f12765b = new C3073c(this.f12767d);

    /* renamed from: c */
    private final atq f12766c;

    /* renamed from: d */
    private final Context f12767d;

    /* renamed from: e */
    private final zzang f12768e;

    /* renamed from: f */
    private final C3006ad f12769f;

    /* renamed from: g */
    private final agw f12770g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public String f12771h;

    public C3699bu(Context context, C3006ad adVar, String str, agw agw, zzang zzang) {
        C3900je.m17433d("Webview loading for native ads.");
        this.f12767d = context;
        this.f12769f = adVar;
        this.f12770g = agw;
        this.f12768e = zzang;
        this.f12771h = str;
        C3025aw.m10918f();
        C4008ne a = C4096ql.m17759a(this.f12767d, this.f12768e, (String) aoq.m14620f().mo14695a(aru.f11852bX), this.f12770g, this.f12769f.mo12436i());
        this.f12766c = new atq(adVar, str);
        this.f12764a = C3996mt.m17450a(a, (C3991mo<? super A, ? extends B>) new C3700bv<Object,Object>(this), C4014nk.f13618b);
        C3994mr.m17444a(this.f12764a, "WebViewNativeAdsUtil.constructor");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C4008ne mo15212a(C4089qe qeVar) throws Exception {
        C3900je.m17433d("Javascript has loaded for native ads.");
        qeVar.mo15919v().mo15930a(this.f12769f, this.f12769f, this.f12769f, this.f12769f, this.f12769f, false, null, new C3050bu(this.f12767d, null, null), null, null);
        qeVar.mo15880a("/logScionEvent", (C3067ae<? super C4089qe>) this.f12765b);
        qeVar.mo15880a("/logScionEvent", (C3067ae<? super C4089qe>) this.f12766c);
        return C3996mt.m17448a(qeVar);
    }

    /* renamed from: a */
    public final C4008ne<JSONObject> mo15204a(JSONObject jSONObject) {
        return C3996mt.m17450a(this.f12764a, (C3991mo<? super A, ? extends B>) new C3701bw<Object,Object>(this, jSONObject), C4014nk.f13617a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C4008ne mo15213a(JSONObject jSONObject, C4089qe qeVar) throws Exception {
        jSONObject.put("ads_id", this.f12771h);
        qeVar.mo14994b("google.afma.nativeAds.handleDownloadedImpressionPing", jSONObject);
        return C3996mt.m17448a(new JSONObject());
    }

    /* renamed from: a */
    public final void mo15205a() {
        C3996mt.m17455a(this.f12764a, (C3993mq<V>) new C3711cf<V>(this), C4014nk.f13617a);
    }

    /* renamed from: a */
    public final void mo15206a(String str, C3067ae<? super C4089qe> aeVar) {
        C3996mt.m17455a(this.f12764a, (C3993mq<V>) new C3707cb<V>(this, str, aeVar), C4014nk.f13617a);
    }

    /* renamed from: a */
    public final void mo15207a(String str, JSONObject jSONObject) {
        C3996mt.m17455a(this.f12764a, (C3993mq<V>) new C3709cd<V>(this, str, jSONObject), C4014nk.f13617a);
    }

    /* renamed from: b */
    public final C4008ne<JSONObject> mo15208b(JSONObject jSONObject) {
        return C3996mt.m17450a(this.f12764a, (C3991mo<? super A, ? extends B>) new C3702bx<Object,Object>(this, jSONObject), C4014nk.f13617a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ C4008ne mo15214b(JSONObject jSONObject, C4089qe qeVar) throws Exception {
        jSONObject.put("ads_id", this.f12771h);
        qeVar.mo14994b("google.afma.nativeAds.handleImpressionPing", jSONObject);
        return C3996mt.m17448a(new JSONObject());
    }

    /* renamed from: b */
    public final void mo15209b(String str, C3067ae<? super C4089qe> aeVar) {
        C3996mt.m17455a(this.f12764a, (C3993mq<V>) new C3708cc<V>(this, str, aeVar), C4014nk.f13617a);
    }

    /* renamed from: c */
    public final C4008ne<JSONObject> mo15210c(JSONObject jSONObject) {
        return C3996mt.m17450a(this.f12764a, (C3991mo<? super A, ? extends B>) new C3703by<Object,Object>(this, jSONObject), C4014nk.f13617a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ C4008ne mo15215c(JSONObject jSONObject, C4089qe qeVar) throws Exception {
        jSONObject.put("ads_id", this.f12771h);
        qeVar.mo14994b("google.afma.nativeAds.handleClickGmsg", jSONObject);
        return C3996mt.m17448a(new JSONObject());
    }

    /* renamed from: d */
    public final C4008ne<JSONObject> mo15211d(JSONObject jSONObject) {
        return C3996mt.m17450a(this.f12764a, (C3991mo<? super A, ? extends B>) new C3704bz<Object,Object>(this, jSONObject), C4014nk.f13617a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ C4008ne mo15216d(JSONObject jSONObject, C4089qe qeVar) throws Exception {
        jSONObject.put("ads_id", this.f12771h);
        C4019np npVar = new C4019np();
        qeVar.mo15880a("/nativeAdPreProcess", (C3067ae<? super C4089qe>) new C3706ca<Object>(this, qeVar, npVar));
        qeVar.mo14994b("google.afma.nativeAds.preProcessJsonGmsg", jSONObject);
        return npVar;
    }
}
