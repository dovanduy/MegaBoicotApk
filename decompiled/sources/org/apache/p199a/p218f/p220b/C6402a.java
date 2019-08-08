package org.apache.p199a.p218f.p220b;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.p199a.C6266b;
import org.apache.p199a.C6301c;
import org.apache.p199a.C6560q;
import org.apache.p199a.p200a.C6248a;
import org.apache.p199a.p200a.C6251c;
import org.apache.p199a.p200a.C6254f;
import org.apache.p199a.p200a.C6258j;
import org.apache.p199a.p202b.C6269b;
import org.apache.p199a.p228j.C6538d;
import org.apache.p199a.p228j.C6539e;
import org.apache.p199a.p229k.C6549b;

/* renamed from: org.apache.a.f.b.a */
/* compiled from: AbstractAuthenticationHandler */
public abstract class C6402a implements C6269b {

    /* renamed from: b */
    private static final List<String> f20991b = Collections.unmodifiableList(Arrays.asList(new String[]{"negotiate", "NTLM", "Digest", "Basic"}));

    /* renamed from: a */
    private final Log f20992a = LogFactory.getLog(getClass());

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Map<String, C6301c> mo22711a(C6301c[] cVarArr) throws C6258j {
        C6549b bVar;
        int i;
        HashMap hashMap = new HashMap(cVarArr.length);
        for (C6301c cVar : cVarArr) {
            if (cVar instanceof C6266b) {
                C6266b bVar2 = (C6266b) cVar;
                bVar = bVar2.mo22434a();
                i = bVar2.mo22435b();
            } else {
                String d = cVar.mo22466d();
                if (d == null) {
                    throw new C6258j("Header value is null");
                }
                bVar = new C6549b(d.length());
                bVar.mo23044a(d);
                i = 0;
            }
            while (i < bVar.mo23052c() && C6538d.m25905a(bVar.mo23038a(i))) {
                i++;
            }
            int i2 = i;
            while (i2 < bVar.mo23052c() && !C6538d.m25905a(bVar.mo23038a(i2))) {
                i2++;
            }
            hashMap.put(bVar.mo23040a(i, i2).toLowerCase(Locale.ENGLISH), cVar);
        }
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public List<String> mo22710a() {
        return f20991b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public List<String> mo22712c(C6560q qVar, C6539e eVar) {
        return mo22710a();
    }

    /* renamed from: a */
    public C6248a mo22439a(Map<String, C6301c> map, C6560q qVar, C6539e eVar) throws C6254f {
        C6251c cVar = (C6251c) eVar.mo22777a("http.authscheme-registry");
        if (cVar == null) {
            throw new IllegalStateException("AuthScheme registry not set in HTTP context");
        }
        List<String> c = mo22712c(qVar, eVar);
        if (c == null) {
            c = f20991b;
        }
        if (this.f20992a.isDebugEnabled()) {
            Log log = this.f20992a;
            StringBuilder sb = new StringBuilder();
            sb.append("Authentication schemes in the order of preference: ");
            sb.append(c);
            log.debug(sb.toString());
        }
        C6248a aVar = null;
        Iterator it = c.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            if (((C6301c) map.get(str.toLowerCase(Locale.ENGLISH))) != null) {
                if (this.f20992a.isDebugEnabled()) {
                    Log log2 = this.f20992a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(" authentication scheme selected");
                    log2.debug(sb2.toString());
                }
                try {
                    aVar = cVar.mo22396a(str, qVar.mo22915f());
                    break;
                } catch (IllegalStateException unused) {
                    if (this.f20992a.isWarnEnabled()) {
                        Log log3 = this.f20992a;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Authentication scheme ");
                        sb3.append(str);
                        sb3.append(" not supported");
                        log3.warn(sb3.toString());
                    }
                }
            } else if (this.f20992a.isDebugEnabled()) {
                Log log4 = this.f20992a;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Challenge for ");
                sb4.append(str);
                sb4.append(" authentication scheme not available");
                log4.debug(sb4.toString());
            }
        }
        if (aVar != null) {
            return aVar;
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append("Unable to respond to any of these challenges: ");
        sb5.append(map);
        throw new C6254f(sb5.toString());
    }
}
