package com.p055c.p056a.p057a.p058a.p060b;

import com.p055c.p056a.p057a.p058a.p064e.C1461b;
import com.p055c.p056a.p057a.p058a.p064e.C1465e;
import org.json.JSONObject;

/* renamed from: com.c.a.a.a.b.c */
public class C1438c {

    /* renamed from: a */
    private final C1441f f4376a;

    /* renamed from: b */
    private final C1441f f4377b;

    /* renamed from: c */
    private final boolean f4378c;

    private C1438c(C1441f fVar, C1441f fVar2, boolean z) {
        this.f4376a = fVar;
        if (fVar2 == null) {
            this.f4377b = C1441f.NONE;
        } else {
            this.f4377b = fVar2;
        }
        this.f4378c = z;
    }

    /* renamed from: a */
    public static C1438c m5937a(C1441f fVar, C1441f fVar2, boolean z) {
        C1465e.m6070a((Object) fVar, "Impression owner is null");
        C1465e.m6068a(fVar);
        return new C1438c(fVar, fVar2, z);
    }

    /* renamed from: a */
    public boolean mo6488a() {
        return C1441f.NATIVE == this.f4376a;
    }

    /* renamed from: b */
    public boolean mo6489b() {
        return C1441f.NATIVE == this.f4377b;
    }

    /* renamed from: c */
    public JSONObject mo6490c() {
        JSONObject jSONObject = new JSONObject();
        C1461b.m6054a(jSONObject, "impressionOwner", this.f4376a);
        C1461b.m6054a(jSONObject, "videoEventsOwner", this.f4377b);
        C1461b.m6054a(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.f4378c));
        return jSONObject;
    }
}
