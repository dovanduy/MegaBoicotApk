package com.startapp.android.publish.ads.video.p173c.p174a.p175a;

import com.startapp.common.p193a.C5518g;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.startapp.android.publish.ads.video.c.a.a.a */
/* compiled from: StartAppSDK */
public class C5235a {

    /* renamed from: a */
    private String f16813a;

    /* renamed from: b */
    private Integer f16814b;

    /* renamed from: c */
    private Integer f16815c;

    /* renamed from: d */
    private Integer f16816d;

    /* renamed from: e */
    private Integer f16817e;

    /* renamed from: f */
    private Integer f16818f;

    /* renamed from: g */
    private Integer f16819g;

    /* renamed from: h */
    private String f16820h;

    /* renamed from: i */
    private Integer f16821i;

    /* renamed from: j */
    private List<C5238d> f16822j;

    /* renamed from: k */
    private String f16823k;

    /* renamed from: l */
    private List<String> f16824l;

    /* renamed from: m */
    private List<String> f16825m;

    /* renamed from: a */
    private boolean m22386a(int i) {
        return i > 0;
    }

    /* renamed from: a */
    public void mo19294a(String str) {
        this.f16813a = str;
    }

    /* renamed from: a */
    public Integer mo19292a() {
        return this.f16814b;
    }

    /* renamed from: a */
    public void mo19293a(Integer num) {
        this.f16814b = num;
    }

    /* renamed from: b */
    public Integer mo19295b() {
        return this.f16815c;
    }

    /* renamed from: b */
    public void mo19296b(Integer num) {
        this.f16815c = num;
    }

    /* renamed from: c */
    public Integer mo19298c() {
        return this.f16816d;
    }

    /* renamed from: c */
    public void mo19299c(Integer num) {
        this.f16816d = num;
    }

    /* renamed from: d */
    public Integer mo19301d() {
        return this.f16817e;
    }

    /* renamed from: d */
    public void mo19302d(Integer num) {
        this.f16817e = num;
    }

    /* renamed from: e */
    public void mo19304e(Integer num) {
        this.f16818f = num;
    }

    /* renamed from: f */
    public void mo19306f(Integer num) {
        this.f16819g = num;
    }

    /* renamed from: b */
    public void mo19297b(String str) {
        this.f16820h = str;
    }

    /* renamed from: g */
    public void mo19308g(Integer num) {
        this.f16821i = num;
    }

    /* renamed from: e */
    public List<C5238d> mo19303e() {
        if (this.f16822j == null) {
            this.f16822j = new ArrayList();
        }
        return this.f16822j;
    }

    /* renamed from: c */
    public void mo19300c(String str) {
        this.f16823k = str;
    }

    /* renamed from: f */
    public List<String> mo19305f() {
        if (this.f16824l == null) {
            this.f16824l = new ArrayList();
        }
        return this.f16824l;
    }

    /* renamed from: g */
    public List<String> mo19307g() {
        if (this.f16825m == null) {
            this.f16825m = new ArrayList();
        }
        return this.f16825m;
    }

    /* renamed from: h */
    public boolean mo19309h() {
        Integer b = mo19295b();
        Integer a = mo19292a();
        if (b == null || a == null || !m22386a(b.intValue()) || !m22386a(a.intValue())) {
            C5518g.m23563a("VASTIcon", 3, "Validator error: VASTIcon invalid size");
            return false;
        }
        Integer c = mo19298c();
        Integer d = mo19301d();
        if (c == null || d == null || !m22386a(c.intValue()) || !m22386a(d.intValue())) {
            C5518g.m23563a("VASTIcon", 3, "Validator error: VASTIcon invalid position");
            return false;
        } else if (mo19303e().size() != 0) {
            return true;
        } else {
            C5518g.m23563a("VASTIcon", 3, "Validator error: VASTIcon no resources");
            return false;
        }
    }
}
