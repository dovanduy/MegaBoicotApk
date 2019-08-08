package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.C3067ae;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

@C3718cm
public final class bap implements ayy, bao {

    /* renamed from: a */
    private final ban f12515a;

    /* renamed from: b */
    private final HashSet<SimpleEntry<String, C3067ae<? super ban>>> f12516b = new HashSet<>();

    public bap(ban ban) {
        this.f12515a = ban;
    }

    /* renamed from: a */
    public final void mo15043a() {
        Iterator it = this.f12516b.iterator();
        while (it.hasNext()) {
            SimpleEntry simpleEntry = (SimpleEntry) it.next();
            String str = "Unregistering eventhandler: ";
            String valueOf = String.valueOf(((C3067ae) simpleEntry.getValue()).toString());
            C3900je.m17043a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            this.f12515a.mo15017b((String) simpleEntry.getKey(), (C3067ae) simpleEntry.getValue());
        }
        this.f12516b.clear();
    }

    /* renamed from: a */
    public final void mo15016a(String str, C3067ae<? super ban> aeVar) {
        this.f12515a.mo15016a(str, aeVar);
        this.f12516b.add(new SimpleEntry(str, aeVar));
    }

    /* renamed from: a */
    public final void mo14991a(String str, String str2) {
        ayz.m15801a((ayy) this, str, str2);
    }

    /* renamed from: a */
    public final void mo14986a(String str, Map map) {
        ayz.m15802a((ayy) this, str, map);
    }

    /* renamed from: a */
    public final void mo14987a(String str, JSONObject jSONObject) {
        ayz.m15804b(this, str, jSONObject);
    }

    /* renamed from: b */
    public final void mo14993b(String str) {
        this.f12515a.mo14993b(str);
    }

    /* renamed from: b */
    public final void mo15017b(String str, C3067ae<? super ban> aeVar) {
        this.f12515a.mo15017b(str, aeVar);
        this.f12516b.remove(new SimpleEntry(str, aeVar));
    }

    /* renamed from: b */
    public final void mo14994b(String str, JSONObject jSONObject) {
        ayz.m15803a((ayy) this, str, jSONObject);
    }
}
