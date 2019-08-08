package com.p055c.p056a.p057a.p058a.p066g;

import android.webkit.WebView;
import com.p055c.p056a.p057a.p058a.p060b.C1435a;
import com.p055c.p056a.p057a.p058a.p060b.C1438c;
import com.p055c.p056a.p057a.p058a.p060b.C1439d;
import com.p055c.p056a.p057a.p058a.p060b.C1443h;
import com.p055c.p056a.p057a.p058a.p060b.C1444i;
import com.p055c.p056a.p057a.p058a.p060b.p061a.C1436a;
import com.p055c.p056a.p057a.p058a.p062c.C1450c;
import com.p055c.p056a.p057a.p058a.p062c.C1451d;
import com.p055c.p056a.p057a.p058a.p064e.C1460a;
import com.p055c.p056a.p057a.p058a.p064e.C1461b;
import com.p055c.p056a.p057a.p058a.p064e.C1464d;
import com.p055c.p056a.p057a.p058a.p065f.C1468b;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.c.a.a.a.g.a */
public abstract class C1469a {

    /* renamed from: a */
    private C1468b f4446a = new C1468b(null);

    /* renamed from: b */
    private C1435a f4447b;

    /* renamed from: c */
    private C1436a f4448c;

    /* renamed from: d */
    private C1470a f4449d;

    /* renamed from: e */
    private double f4450e;

    /* renamed from: com.c.a.a.a.g.a$a */
    enum C1470a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_HIDDEN
    }

    public C1469a() {
        mo6578i();
    }

    /* renamed from: a */
    public void mo6559a() {
    }

    /* renamed from: a */
    public void mo6560a(float f) {
        C1451d.m6006a().mo6537a(mo6572c(), f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6561a(WebView webView) {
        this.f4446a = new C1468b(webView);
    }

    /* renamed from: a */
    public void mo6562a(C1436a aVar) {
        this.f4448c = aVar;
    }

    /* renamed from: a */
    public void mo6563a(C1435a aVar) {
        this.f4447b = aVar;
    }

    /* renamed from: a */
    public void mo6564a(C1438c cVar) {
        C1451d.m6006a().mo6542a(mo6572c(), cVar.mo6490c());
    }

    /* renamed from: a */
    public void mo6565a(C1444i iVar, C1439d dVar) {
        String g = iVar.mo6508g();
        JSONObject jSONObject = new JSONObject();
        C1461b.m6054a(jSONObject, "environment", "app");
        C1461b.m6054a(jSONObject, "adSessionType", dVar.mo6496f());
        C1461b.m6054a(jSONObject, "deviceInfo", C1460a.m6048d());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C1461b.m6054a(jSONObject, "supports", jSONArray);
        JSONObject jSONObject2 = new JSONObject();
        C1461b.m6054a(jSONObject2, "partnerName", dVar.mo6491a().mo6499a());
        C1461b.m6054a(jSONObject2, "partnerVersion", dVar.mo6491a().mo6500b());
        C1461b.m6054a(jSONObject, "omidNativeInfo", jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        C1461b.m6054a(jSONObject3, "libraryVersion", "1.2.0-Startapp");
        C1461b.m6054a(jSONObject3, "appId", C1450c.m6003a().mo6535b().getApplicationContext().getPackageName());
        C1461b.m6054a(jSONObject, "app", jSONObject3);
        if (dVar.mo6494d() != null) {
            C1461b.m6054a(jSONObject, "customReferenceData", dVar.mo6494d());
        }
        JSONObject jSONObject4 = new JSONObject();
        for (C1443h hVar : dVar.mo6492b()) {
            C1461b.m6054a(jSONObject4, hVar.mo6501a(), hVar.mo6503c());
        }
        C1451d.m6006a().mo6539a(mo6572c(), g, jSONObject, jSONObject4);
    }

    /* renamed from: a */
    public void mo6566a(String str) {
        C1451d.m6006a().mo6538a(mo6572c(), str, (JSONObject) null);
    }

    /* renamed from: a */
    public void mo6567a(String str, double d) {
        if (d > this.f4450e) {
            this.f4449d = C1470a.AD_STATE_VISIBLE;
            C1451d.m6006a().mo6547c(mo6572c(), str);
        }
    }

    /* renamed from: a */
    public void mo6568a(String str, JSONObject jSONObject) {
        C1451d.m6006a().mo6538a(mo6572c(), str, jSONObject);
    }

    /* renamed from: a */
    public void mo6569a(boolean z) {
        if (mo6575f()) {
            C1451d.m6006a().mo6548d(mo6572c(), z ? "foregrounded" : "backgrounded");
        }
    }

    /* renamed from: b */
    public void mo6570b() {
        this.f4446a.clear();
    }

    /* renamed from: b */
    public void mo6571b(String str, double d) {
        if (d > this.f4450e && this.f4449d != C1470a.AD_STATE_HIDDEN) {
            this.f4449d = C1470a.AD_STATE_HIDDEN;
            C1451d.m6006a().mo6547c(mo6572c(), str);
        }
    }

    /* renamed from: c */
    public WebView mo6572c() {
        return (WebView) this.f4446a.get();
    }

    /* renamed from: d */
    public C1435a mo6573d() {
        return this.f4447b;
    }

    /* renamed from: e */
    public C1436a mo6574e() {
        return this.f4448c;
    }

    /* renamed from: f */
    public boolean mo6575f() {
        return this.f4446a.get() != null;
    }

    /* renamed from: g */
    public void mo6576g() {
        C1451d.m6006a().mo6536a(mo6572c());
    }

    /* renamed from: h */
    public void mo6577h() {
        C1451d.m6006a().mo6545b(mo6572c());
    }

    /* renamed from: i */
    public void mo6578i() {
        this.f4450e = C1464d.m6066a();
        this.f4449d = C1470a.AD_STATE_IDLE;
    }
}
