package com.startapp.p154a.p155a.p161f;

import com.startapp.p154a.p155a.p156a.C5044c;
import com.startapp.p154a.p155a.p159d.C5057e;
import com.startapp.p154a.p155a.p160e.C5059b;
import com.startapp.p154a.p155a.p162g.C5065a;
import com.startapp.p154a.p155a.p162g.C5068c;

/* renamed from: com.startapp.a.a.f.a */
/* compiled from: StartAppSDK */
public class C5063a {

    /* renamed from: a */
    private final C5059b f16381a;

    /* renamed from: b */
    private final C5068c f16382b;

    public C5063a(C5059b bVar, C5068c cVar) {
        this.f16382b = cVar;
        this.f16381a = bVar;
    }

    /* renamed from: a */
    public String mo18671a(C5065a aVar, C5044c cVar, long j) {
        try {
            String a = this.f16381a.mo18665a(cVar);
            C5057e b = this.f16382b.mo18678b(aVar);
            StringBuilder sb = new StringBuilder();
            sb.append(j);
            sb.append("-");
            sb.append(aVar.mo18672a());
            sb.append("-");
            sb.append(b.mo18662a(a));
            return sb.toString();
        } catch (Throwable unused) {
            return null;
        }
    }
}
