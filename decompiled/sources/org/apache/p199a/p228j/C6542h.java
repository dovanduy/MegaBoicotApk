package org.apache.p199a.p228j;

import java.io.IOException;
import org.apache.p199a.C6547k;
import org.apache.p199a.C6558o;
import org.apache.p199a.C6559p;
import org.apache.p199a.C6560q;
import org.apache.p199a.C6562s;

/* renamed from: org.apache.a.j.h */
/* compiled from: ImmutableHttpProcessor */
public final class C6542h implements C6540f {

    /* renamed from: a */
    private final C6559p[] f21259a;

    /* renamed from: b */
    private final C6562s[] f21260b;

    public C6542h(C6559p[] pVarArr, C6562s[] sVarArr) {
        if (pVarArr != null) {
            int length = pVarArr.length;
            this.f21259a = new C6559p[length];
            for (int i = 0; i < length; i++) {
                this.f21259a[i] = pVarArr[i];
            }
        } else {
            this.f21259a = new C6559p[0];
        }
        if (sVarArr != null) {
            int length2 = sVarArr.length;
            this.f21260b = new C6562s[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                this.f21260b[i2] = sVarArr[i2];
            }
            return;
        }
        this.f21260b = new C6562s[0];
    }

    /* renamed from: a */
    public void mo22453a(C6558o oVar, C6539e eVar) throws IOException, C6547k {
        for (C6559p a : this.f21259a) {
            a.mo22453a(oVar, eVar);
        }
    }

    /* renamed from: a */
    public void mo22454a(C6560q qVar, C6539e eVar) throws IOException, C6547k {
        for (C6562s a : this.f21260b) {
            a.mo22454a(qVar, eVar);
        }
    }
}
