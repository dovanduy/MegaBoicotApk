package org.apache.p199a.p226h;

import org.apache.p199a.C6565v;
import org.apache.p199a.p229k.C6549b;

/* renamed from: org.apache.a.h.e */
/* compiled from: BasicHeaderValueFormatter */
public class C6510e {

    /* renamed from: a */
    public static final C6510e f21216a = new C6510e();

    /* renamed from: a */
    public C6549b mo22925a(C6549b bVar, C6565v vVar, boolean z) {
        if (vVar == null) {
            throw new IllegalArgumentException("NameValuePair must not be null.");
        }
        int a = mo22924a(vVar);
        if (bVar == null) {
            bVar = new C6549b(a);
        } else {
            bVar.mo23050b(a);
        }
        bVar.mo23044a(vVar.mo22961a());
        String b = vVar.mo22962b();
        if (b != null) {
            bVar.mo23042a('=');
            mo22926a(bVar, b, z);
        }
        return bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo22924a(C6565v vVar) {
        if (vVar == null) {
            return 0;
        }
        int length = vVar.mo22961a().length();
        String b = vVar.mo22962b();
        if (b != null) {
            length += 3 + b.length();
        }
        return length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22926a(C6549b bVar, String str, boolean z) {
        if (!z) {
            boolean z2 = z;
            for (int i = 0; i < str.length() && !z2; i++) {
                z2 = mo22927a(str.charAt(i));
            }
            z = z2;
        }
        if (z) {
            bVar.mo23042a('\"');
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (mo22928b(charAt)) {
                bVar.mo23042a('\\');
            }
            bVar.mo23042a(charAt);
        }
        if (z) {
            bVar.mo23042a('\"');
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo22927a(char c) {
        return " ;,:@()<>\\\"/[]?={}\t".indexOf(c) >= 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo22928b(char c) {
        return "\"\\".indexOf(c) >= 0;
    }
}
