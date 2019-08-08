package com.p055c.p056a.p057a.p058a.p067h.p068a;

import com.p055c.p056a.p057a.p058a.p060b.C1444i;
import com.p055c.p056a.p057a.p058a.p062c.C1446a;
import com.p055c.p056a.p057a.p058a.p067h.p068a.C1480b.C1482b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.c.a.a.a.h.a.e */
public class C1485e extends C1479a {
    public C1485e(C1482b bVar, HashSet<String> hashSet, JSONObject jSONObject, double d) {
        super(bVar, hashSet, jSONObject, d);
    }

    /* renamed from: b */
    private void m6139b(String str) {
        C1446a a = C1446a.m5984a();
        if (a != null) {
            for (C1444i iVar : a.mo6522b()) {
                if (this.f4472a.contains(iVar.mo6508g())) {
                    iVar.mo6507f().mo6571b(str, this.f4474c);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        return this.f4473b.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        m6139b(str);
        super.onPostExecute(str);
    }
}
