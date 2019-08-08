package com.facebook.ads.internal.p077d;

import android.os.Bundle;
import com.facebook.ads.internal.p115w.p117b.C2331r;

/* renamed from: com.facebook.ads.internal.d.d */
public class C1707d implements C2331r<Bundle> {

    /* renamed from: a */
    private C1705c f5345a;

    /* renamed from: b */
    private final C1705c f5346b;

    /* renamed from: c */
    private final C1704b f5347c;

    /* renamed from: d */
    private boolean f5348d = false;

    /* renamed from: e */
    private boolean f5349e = false;

    /* renamed from: f */
    private boolean f5350f = false;

    public C1707d(C1704b bVar) {
        this.f5347c = bVar;
        this.f5346b = new C1705c(bVar.f5328b);
        this.f5345a = new C1705c(bVar.f5328b);
    }

    public C1707d(C1704b bVar, Bundle bundle) {
        this.f5347c = bVar;
        this.f5346b = (C1705c) bundle.getSerializable("testStats");
        this.f5345a = (C1705c) bundle.getSerializable("viewableStats");
        this.f5348d = bundle.getBoolean("ended");
        this.f5349e = bundle.getBoolean("passed");
        this.f5350f = bundle.getBoolean("complete");
    }

    /* renamed from: b */
    private void m7110b() {
        this.f5350f = true;
        this.f5348d = true;
        this.f5347c.mo7265a(this.f5350f, this.f5349e, this.f5349e ? this.f5345a : this.f5346b);
    }

    /* renamed from: a */
    public void mo7457a() {
        if (!this.f5348d) {
            this.f5345a.mo7444b();
        }
    }

    /* renamed from: a */
    public void mo7458a(double d, double d2) {
        if (!this.f5348d) {
            this.f5346b.mo7443a(d, d2);
            this.f5345a.mo7443a(d, d2);
            double h = this.f5347c.f5331e ? this.f5345a.mo7446c().mo7456h() : this.f5345a.mo7446c().mo7455g();
            if (this.f5347c.f5329c < 0.0d || this.f5346b.mo7446c().mo7454f() <= this.f5347c.f5329c || h != 0.0d) {
                if (h >= this.f5347c.f5330d) {
                    this.f5349e = true;
                    m7110b();
                }
                return;
            }
            m7110b();
        }
    }

    /* renamed from: g */
    public Bundle mo7259g() {
        Bundle bundle = new Bundle();
        bundle.putSerializable("viewableStats", this.f5345a);
        bundle.putSerializable("testStats", this.f5346b);
        bundle.putBoolean("ended", this.f5348d);
        bundle.putBoolean("passed", this.f5349e);
        bundle.putBoolean("complete", this.f5350f);
        return bundle;
    }
}
