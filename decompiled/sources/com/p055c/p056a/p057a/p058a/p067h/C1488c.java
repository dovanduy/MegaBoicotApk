package com.p055c.p056a.p057a.p058a.p067h;

import com.p055c.p056a.p057a.p058a.p067h.p068a.C1480b.C1482b;
import com.p055c.p056a.p057a.p058a.p067h.p068a.C1483c;
import com.p055c.p056a.p057a.p058a.p067h.p068a.C1484d;
import com.p055c.p056a.p057a.p058a.p067h.p068a.C1485e;
import com.p055c.p056a.p057a.p058a.p067h.p068a.C1486f;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.c.a.a.a.h.c */
public class C1488c implements C1482b {

    /* renamed from: a */
    private JSONObject f4487a;

    /* renamed from: b */
    private final C1483c f4488b;

    public C1488c(C1483c cVar) {
        this.f4488b = cVar;
    }

    /* renamed from: a */
    public JSONObject mo6594a() {
        return this.f4487a;
    }

    /* renamed from: a */
    public void mo6595a(JSONObject jSONObject) {
        this.f4487a = jSONObject;
    }

    /* renamed from: a */
    public void mo6611a(JSONObject jSONObject, HashSet<String> hashSet, double d) {
        C1483c cVar = this.f4488b;
        C1486f fVar = new C1486f(this, hashSet, jSONObject, d);
        cVar.mo6596b(fVar);
    }

    /* renamed from: b */
    public void mo6612b() {
        this.f4488b.mo6596b(new C1484d(this));
    }

    /* renamed from: b */
    public void mo6613b(JSONObject jSONObject, HashSet<String> hashSet, double d) {
        C1483c cVar = this.f4488b;
        C1485e eVar = new C1485e(this, hashSet, jSONObject, d);
        cVar.mo6596b(eVar);
    }
}
