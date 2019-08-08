package org.apache.p199a.p218f.p219a;

import org.apache.p199a.C6301c;
import org.apache.p199a.C6558o;
import org.apache.p199a.p200a.C6254f;
import org.apache.p199a.p200a.C6256h;
import org.apache.p199a.p200a.C6257i;
import org.apache.p199a.p200a.C6258j;
import org.apache.p199a.p200a.C6259k;
import org.apache.p199a.p226h.C6521p;
import org.apache.p199a.p229k.C6549b;

/* renamed from: org.apache.a.f.a.i */
/* compiled from: NTLMScheme */
public class C6392i extends C6378a {

    /* renamed from: a */
    private final C6383f f20966a;

    /* renamed from: b */
    private C6393a f20967b;

    /* renamed from: c */
    private String f20968c;

    /* renamed from: org.apache.a.f.a.i$a */
    /* compiled from: NTLMScheme */
    enum C6393a {
        UNINITIATED,
        CHALLENGE_RECEIVED,
        MSG_TYPE1_GENERATED,
        MSG_TYPE2_RECEVIED,
        MSG_TYPE3_GENERATED,
        FAILED
    }

    /* renamed from: a */
    public String mo22389a() {
        return "ntlm";
    }

    /* renamed from: b */
    public String mo22392b() {
        return null;
    }

    /* renamed from: c */
    public boolean mo22393c() {
        return true;
    }

    public C6392i(C6383f fVar) {
        if (fVar == null) {
            throw new IllegalArgumentException("NTLM engine may not be null");
        }
        this.f20966a = fVar;
        this.f20967b = C6393a.UNINITIATED;
        this.f20968c = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22676a(C6549b bVar, int i, int i2) throws C6258j {
        String b = bVar.mo23049b(i, i2);
        if (b.length() == 0) {
            if (this.f20967b == C6393a.UNINITIATED) {
                this.f20967b = C6393a.CHALLENGE_RECEIVED;
            } else {
                this.f20967b = C6393a.FAILED;
            }
            this.f20968c = null;
            return;
        }
        this.f20967b = C6393a.MSG_TYPE2_RECEVIED;
        this.f20968c = b;
    }

    /* renamed from: a */
    public C6301c mo22390a(C6256h hVar, C6558o oVar) throws C6254f {
        String str;
        try {
            C6259k kVar = (C6259k) hVar;
            if (this.f20967b == C6393a.CHALLENGE_RECEIVED || this.f20967b == C6393a.FAILED) {
                str = this.f20966a.mo22679a(kVar.mo22415d(), kVar.mo22416e());
                this.f20967b = C6393a.MSG_TYPE1_GENERATED;
            } else if (this.f20967b == C6393a.MSG_TYPE2_RECEVIED) {
                str = this.f20966a.mo22680a(kVar.mo22414c(), kVar.mo22413b(), kVar.mo22415d(), kVar.mo22416e(), this.f20968c);
                this.f20967b = C6393a.MSG_TYPE3_GENERATED;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected state: ");
                sb.append(this.f20967b);
                throw new C6254f(sb.toString());
            }
            C6549b bVar = new C6549b(32);
            if (mo22677e()) {
                bVar.mo23044a("Proxy-Authorization");
            } else {
                bVar.mo23044a("Authorization");
            }
            bVar.mo23044a(": NTLM ");
            bVar.mo23044a(str);
            return new C6521p(bVar);
        } catch (ClassCastException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Credentials cannot be used for NTLM authentication: ");
            sb2.append(hVar.getClass().getName());
            throw new C6257i(sb2.toString());
        }
    }

    /* renamed from: d */
    public boolean mo22394d() {
        return this.f20967b == C6393a.MSG_TYPE3_GENERATED || this.f20967b == C6393a.FAILED;
    }
}
