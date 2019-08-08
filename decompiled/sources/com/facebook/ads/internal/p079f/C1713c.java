package com.facebook.ads.internal.p079f;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.internal.f.c */
public class C1713c implements Serializable {
    private static final long serialVersionUID = -3209129042070173126L;

    /* renamed from: a */
    private final int f5367a;

    /* renamed from: b */
    private final String f5368b;

    /* renamed from: c */
    private final String f5369c;

    /* renamed from: d */
    private final List<C1713c> f5370d;

    /* renamed from: e */
    private C1713c f5371e;

    C1713c(int i, String str, String str2) {
        this.f5370d = new ArrayList();
        this.f5367a = i;
        this.f5368b = str;
        this.f5369c = str2;
    }

    C1713c(String str) {
        this(0, null, str);
    }

    /* renamed from: a */
    public int mo7477a() {
        return this.f5367a;
    }

    /* renamed from: a */
    public void mo7478a(C1713c cVar) {
        cVar.f5371e = this;
        this.f5370d.add(cVar);
    }

    /* renamed from: b */
    public String mo7479b() {
        return this.f5368b;
    }

    /* renamed from: c */
    public String mo7480c() {
        return this.f5369c;
    }

    /* renamed from: d */
    public List<C1713c> mo7481d() {
        return this.f5370d;
    }

    /* renamed from: e */
    public C1713c mo7482e() {
        return this.f5371e;
    }
}
