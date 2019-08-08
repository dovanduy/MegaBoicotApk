package com.facebook.ads.internal.p086m;

import com.appnext.base.p042a.p045c.C1234a;
import com.facebook.ads.internal.p115w.p117b.C2339v;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.internal.m.c */
public class C1764c {

    /* renamed from: a */
    private List<C1762a> f5527a = new ArrayList();

    /* renamed from: b */
    private int f5528b = 0;

    /* renamed from: c */
    private C1765d f5529c;

    /* renamed from: d */
    private String f5530d;

    /* renamed from: e */
    private String f5531e;

    public C1764c(C1765d dVar, String str, String str2) {
        this.f5529c = dVar;
        this.f5530d = str;
        this.f5531e = str2;
    }

    /* renamed from: a */
    public C1765d mo7596a() {
        return this.f5529c;
    }

    /* renamed from: a */
    public void mo7597a(C1762a aVar) {
        this.f5527a.add(aVar);
    }

    /* renamed from: b */
    public String mo7598b() {
        return this.f5530d;
    }

    /* renamed from: c */
    public String mo7599c() {
        return this.f5531e;
    }

    /* renamed from: d */
    public int mo7600d() {
        return this.f5527a.size();
    }

    /* renamed from: e */
    public C1762a mo7601e() {
        if (this.f5528b >= this.f5527a.size()) {
            return null;
        }
        this.f5528b++;
        return (C1762a) this.f5527a.get(this.f5528b - 1);
    }

    /* renamed from: f */
    public String mo7602f() {
        if (this.f5528b <= 0 || this.f5528b > this.f5527a.size()) {
            return null;
        }
        return ((C1762a) this.f5527a.get(this.f5528b - 1)).mo7593c().optString(C1234a.f3911gK);
    }

    /* renamed from: g */
    public boolean mo7603g() {
        return this.f5529c == null || C2339v.m9067a() > this.f5529c.mo7605a() + ((long) this.f5529c.mo7616l());
    }

    /* renamed from: h */
    public long mo7604h() {
        if (this.f5529c != null) {
            return this.f5529c.mo7605a() + ((long) this.f5529c.mo7616l());
        }
        return -1;
    }
}
