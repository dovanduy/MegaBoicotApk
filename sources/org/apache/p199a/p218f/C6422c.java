package org.apache.p199a.p218f;

import java.util.Locale;
import org.apache.p199a.C6261aa;
import org.apache.p199a.C6263ac;
import org.apache.p199a.C6560q;
import org.apache.p199a.C6561r;
import org.apache.p199a.p226h.C6513h;
import org.apache.p199a.p228j.C6539e;

/* renamed from: org.apache.a.f.c */
/* compiled from: DefaultHttpResponseFactory */
public class C6422c implements C6561r {

    /* renamed from: a */
    protected final C6261aa f21055a;

    public C6422c(C6261aa aaVar) {
        if (aaVar == null) {
            throw new IllegalArgumentException("Reason phrase catalog must not be null.");
        }
        this.f21055a = aaVar;
    }

    public C6422c() {
        this(C6439d.f21104a);
    }

    /* renamed from: a */
    public C6560q mo22776a(C6263ac acVar, C6539e eVar) {
        if (acVar == null) {
            throw new IllegalArgumentException("Status line may not be null");
        }
        return new C6513h(acVar, this.f21055a, mo22775a(eVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Locale mo22775a(C6539e eVar) {
        return Locale.getDefault();
    }
}
