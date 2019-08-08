package org.apache.p199a.p218f.p220b;

import java.util.List;
import java.util.Map;
import org.apache.p199a.C6301c;
import org.apache.p199a.C6560q;
import org.apache.p199a.p200a.C6258j;
import org.apache.p199a.p228j.C6539e;

/* renamed from: org.apache.a.f.b.m */
/* compiled from: DefaultTargetAuthenticationHandler */
public class C6414m extends C6402a {
    /* renamed from: a */
    public boolean mo22440a(C6560q qVar, C6539e eVar) {
        if (qVar != null) {
            return qVar.mo22937a().mo22430b() == 401;
        }
        throw new IllegalArgumentException("HTTP response may not be null");
    }

    /* renamed from: b */
    public Map<String, C6301c> mo22441b(C6560q qVar, C6539e eVar) throws C6258j {
        if (qVar != null) {
            return mo22711a(qVar.mo22910b("WWW-Authenticate"));
        }
        throw new IllegalArgumentException("HTTP response may not be null");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public List<String> mo22712c(C6560q qVar, C6539e eVar) {
        List<String> list = (List) qVar.mo22915f().mo22751a("http.auth.target-scheme-pref");
        if (list != null) {
            return list;
        }
        return super.mo22712c(qVar, eVar);
    }
}
