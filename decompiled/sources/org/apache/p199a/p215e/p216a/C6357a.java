package org.apache.p199a.p215e.p216a;

import org.apache.p199a.p215e.p216a.p217a.C6360c;

/* renamed from: org.apache.a.e.a.a */
/* compiled from: FormBodyPart */
public class C6357a {

    /* renamed from: a */
    private final String f20883a;

    /* renamed from: b */
    private final C6364b f20884b;

    /* renamed from: c */
    private final C6360c f20885c;

    public C6357a(String str, C6360c cVar) {
        if (str == null) {
            throw new IllegalArgumentException("Name may not be null");
        } else if (cVar == null) {
            throw new IllegalArgumentException("Body may not be null");
        } else {
            this.f20883a = str;
            this.f20885c = cVar;
            this.f20884b = new C6364b();
            mo22624a(cVar);
            mo22626b(cVar);
            mo22628c(cVar);
        }
    }

    /* renamed from: a */
    public String mo22622a() {
        return this.f20883a;
    }

    /* renamed from: b */
    public C6360c mo22625b() {
        return this.f20885c;
    }

    /* renamed from: c */
    public C6364b mo22627c() {
        return this.f20884b;
    }

    /* renamed from: a */
    public void mo22623a(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Field name may not be null");
        }
        this.f20884b.mo22636a(new C6369f(str, str2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22624a(C6360c cVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("form-data; name=\"");
        sb.append(mo22622a());
        sb.append("\"");
        if (cVar.mo22631b() != null) {
            sb.append("; filename=\"");
            sb.append(cVar.mo22631b());
            sb.append("\"");
        }
        mo22623a("Content-Disposition", sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo22626b(C6360c cVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(cVar.mo22629a());
        if (cVar.mo22632c() != null) {
            sb.append("; charset=");
            sb.append(cVar.mo22632c());
        }
        mo22623a("Content-Type", sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo22628c(C6360c cVar) {
        mo22623a("Content-Transfer-Encoding", cVar.mo22633d());
    }
}
