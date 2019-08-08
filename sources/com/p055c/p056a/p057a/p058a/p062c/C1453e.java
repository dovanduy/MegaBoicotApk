package com.p055c.p056a.p057a.p058a.p062c;

import android.content.Context;
import android.os.Handler;
import com.p055c.p056a.p057a.p058a.p059a.C1430b;
import com.p055c.p056a.p057a.p058a.p059a.C1431c;
import com.p055c.p056a.p057a.p058a.p059a.C1432d;
import com.p055c.p056a.p057a.p058a.p059a.C1433e;
import com.p055c.p056a.p057a.p058a.p060b.C1444i;
import com.p055c.p056a.p057a.p058a.p062c.C1447b.C1449a;
import com.p055c.p056a.p057a.p058a.p067h.C1474a;

/* renamed from: com.c.a.a.a.c.e */
public class C1453e implements C1431c, C1449a {

    /* renamed from: a */
    private static C1453e f4425a;

    /* renamed from: b */
    private float f4426b = 0.0f;

    /* renamed from: c */
    private final C1433e f4427c;

    /* renamed from: d */
    private final C1430b f4428d;

    /* renamed from: e */
    private C1432d f4429e;

    /* renamed from: f */
    private C1446a f4430f;

    public C1453e(C1433e eVar, C1430b bVar) {
        this.f4427c = eVar;
        this.f4428d = bVar;
    }

    /* renamed from: a */
    public static C1453e m6020a() {
        if (f4425a == null) {
            f4425a = new C1453e(new C1433e(), new C1430b());
        }
        return f4425a;
    }

    /* renamed from: e */
    private C1446a m6021e() {
        if (this.f4430f == null) {
            this.f4430f = C1446a.m5984a();
        }
        return this.f4430f;
    }

    /* renamed from: a */
    public void mo6468a(float f) {
        this.f4426b = f;
        for (C1444i f2 : m6021e().mo6524c()) {
            f2.mo6507f().mo6560a(f);
        }
    }

    /* renamed from: a */
    public void mo6550a(Context context) {
        this.f4429e = this.f4427c.mo6472a(new Handler(), context, this.f4428d.mo6467a(), this);
    }

    /* renamed from: a */
    public void mo6533a(boolean z) {
        if (z) {
            C1474a.m6108a().mo6581b();
        } else {
            C1474a.m6108a().mo6583d();
        }
    }

    /* renamed from: b */
    public void mo6551b() {
        C1447b.m5991a().mo6528a((C1449a) this);
        C1447b.m5991a().mo6529b();
        if (C1447b.m5991a().mo6531d()) {
            C1474a.m6108a().mo6581b();
        }
        this.f4429e.mo6469a();
    }

    /* renamed from: c */
    public void mo6552c() {
        C1474a.m6108a().mo6582c();
        C1447b.m5991a().mo6530c();
        this.f4429e.mo6470b();
    }

    /* renamed from: d */
    public float mo6553d() {
        return this.f4426b;
    }
}
