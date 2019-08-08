package org.apache.p199a.p226h;

import java.util.Locale;
import org.apache.p199a.C6261aa;
import org.apache.p199a.C6263ac;
import org.apache.p199a.C6527i;
import org.apache.p199a.C6560q;
import org.apache.p199a.C6569z;

/* renamed from: org.apache.a.h.h */
/* compiled from: BasicHttpResponse */
public class C6513h extends C6506a implements C6560q {

    /* renamed from: c */
    private C6263ac f21222c;

    /* renamed from: d */
    private C6527i f21223d;

    /* renamed from: e */
    private C6261aa f21224e;

    /* renamed from: f */
    private Locale f21225f;

    public C6513h(C6263ac acVar, C6261aa aaVar, Locale locale) {
        if (acVar == null) {
            throw new IllegalArgumentException("Status line may not be null.");
        }
        this.f21222c = acVar;
        this.f21224e = aaVar;
        if (locale == null) {
            locale = Locale.getDefault();
        }
        this.f21225f = locale;
    }

    public C6513h(C6263ac acVar) {
        this(acVar, null, null);
    }

    /* renamed from: c */
    public C6569z mo22450c() {
        return this.f21222c.mo22429a();
    }

    /* renamed from: a */
    public C6263ac mo22937a() {
        return this.f21222c;
    }

    /* renamed from: b */
    public C6527i mo22939b() {
        return this.f21223d;
    }

    /* renamed from: a */
    public void mo22938a(C6527i iVar) {
        this.f21223d = iVar;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f21222c);
        stringBuffer.append(" ");
        stringBuffer.append(this.f21204a);
        return stringBuffer.toString();
    }
}
