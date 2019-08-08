package org.apache.p199a.p200a;

/* renamed from: org.apache.a.a.e */
/* compiled from: AuthState */
public class C6253e {

    /* renamed from: a */
    private C6248a f20806a;

    /* renamed from: b */
    private C6252d f20807b;

    /* renamed from: c */
    private C6256h f20808c;

    /* renamed from: a */
    public void mo22402a() {
        this.f20806a = null;
        this.f20807b = null;
        this.f20808c = null;
    }

    /* renamed from: b */
    public boolean mo22406b() {
        return this.f20806a != null;
    }

    /* renamed from: a */
    public void mo22403a(C6248a aVar) {
        if (aVar == null) {
            mo22402a();
        } else {
            this.f20806a = aVar;
        }
    }

    /* renamed from: c */
    public C6248a mo22407c() {
        return this.f20806a;
    }

    /* renamed from: d */
    public C6256h mo22408d() {
        return this.f20808c;
    }

    /* renamed from: a */
    public void mo22405a(C6256h hVar) {
        this.f20808c = hVar;
    }

    /* renamed from: e */
    public C6252d mo22409e() {
        return this.f20807b;
    }

    /* renamed from: a */
    public void mo22404a(C6252d dVar) {
        this.f20807b = dVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("auth scope [");
        sb.append(this.f20807b);
        sb.append("]; credentials set [");
        sb.append(this.f20808c != null ? "true" : "false");
        sb.append("]");
        return sb.toString();
    }
}
