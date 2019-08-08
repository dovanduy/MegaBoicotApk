package com.google.android.gms.measurement.internal;

import com.appnext.base.p046b.C1245d;

/* renamed from: com.google.android.gms.measurement.internal.s */
final class C4894s implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ int f15969a;

    /* renamed from: b */
    private final /* synthetic */ String f15970b;

    /* renamed from: c */
    private final /* synthetic */ Object f15971c;

    /* renamed from: d */
    private final /* synthetic */ Object f15972d;

    /* renamed from: e */
    private final /* synthetic */ Object f15973e;

    /* renamed from: f */
    private final /* synthetic */ C4893r f15974f;

    C4894s(C4893r rVar, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f15974f = rVar;
        this.f15969a = i;
        this.f15970b = str;
        this.f15971c = obj;
        this.f15972d = obj2;
        this.f15973e = obj3;
    }

    public final void run() {
        C4745ad c = this.f15974f.f15564q.mo17241c();
        if (!c.mo17303z()) {
            this.f15974f.mo17749a(6, "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (this.f15974f.f15957a == 0) {
            if (this.f15974f.mo17160t().mo17649g()) {
                C4893r rVar = this.f15974f;
                this.f15974f.mo17161u();
                rVar.f15957a = 'C';
            } else {
                C4893r rVar2 = this.f15974f;
                this.f15974f.mo17161u();
                rVar2.f15957a = 'c';
            }
        }
        if (this.f15974f.f15958b < 0) {
            this.f15974f.f15958b = this.f15974f.mo17160t().mo17647f();
        }
        char charAt = "01VDIWEA?".charAt(this.f15969a);
        char a = this.f15974f.f15957a;
        long b = this.f15974f.f15958b;
        String a2 = C4893r.m21362a(true, this.f15970b, this.f15971c, this.f15972d, this.f15973e);
        StringBuilder sb = new StringBuilder(24 + String.valueOf(a2).length());
        sb.append("2");
        sb.append(charAt);
        sb.append(a);
        sb.append(b);
        sb.append(":");
        sb.append(a2);
        String sb2 = sb.toString();
        if (sb2.length() > 1024) {
            sb2 = this.f15970b.substring(0, C1245d.f3947iP);
        }
        c.f15385b.mo17191a(sb2, 1);
    }
}
