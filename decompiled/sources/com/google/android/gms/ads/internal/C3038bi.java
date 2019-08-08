package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C3663ao;
import com.google.android.gms.internal.ads.C3862hu;
import com.google.android.gms.internal.ads.C3879ik;
import com.google.android.gms.internal.ads.C3900je;
import com.google.android.gms.internal.ads.C3909jn;
import com.google.android.gms.internal.ads.C4089qe;
import com.google.android.gms.internal.ads.C4100qp;
import com.google.android.gms.internal.ads.ash;
import com.google.android.gms.internal.ads.asi;

/* renamed from: com.google.android.gms.ads.internal.bi */
final class C3038bi implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C3879ik f8898a;

    /* renamed from: b */
    final /* synthetic */ C3862hu f8899b;

    /* renamed from: c */
    final /* synthetic */ C3035bf f8900c;

    /* renamed from: d */
    private final /* synthetic */ ash f8901d;

    C3038bi(C3035bf bfVar, C3879ik ikVar, C3862hu huVar, ash ash) {
        this.f8900c = bfVar;
        this.f8898a = ikVar;
        this.f8899b = huVar;
        this.f8901d = ash;
    }

    public final void run() {
        if (this.f8898a.f13292b.f14469r && this.f8900c.f8733e.f8840B != null) {
            String str = null;
            if (this.f8898a.f13292b.f14452a != null) {
                C3025aw.m10917e();
                str = C3909jn.m17132a(this.f8898a.f13292b.f14452a);
            }
            asi asi = new asi(this.f8900c, str, this.f8898a.f13292b.f14453b);
            this.f8900c.f8733e.f8847I = 1;
            try {
                this.f8900c.f8731c = false;
                this.f8900c.f8733e.f8840B.mo14732a(asi);
                return;
            } catch (RemoteException e) {
                C3900je.m17434d("#007 Could not call remote method.", e);
                this.f8900c.f8731c = true;
            }
        }
        C3050bu buVar = new C3050bu(this.f8900c.f8733e.f8858c, this.f8899b, this.f8898a.f13292b.f14432E);
        try {
            C4089qe a = this.f8900c.mo12564a(this.f8898a, buVar, this.f8899b);
            a.setOnTouchListener(new C3040bk(this, buVar));
            a.setOnClickListener(new C3041bl(this, buVar));
            this.f8900c.f8733e.f8847I = 0;
            C3026ax axVar = this.f8900c.f8733e;
            C3025aw.m10916d();
            axVar.f8863h = C3663ao.m14575a(this.f8900c.f8733e.f8858c, this.f8900c, this.f8898a, this.f8900c.f8733e.f8859d, a, this.f8900c.f8888j, this.f8900c, this.f8901d);
        } catch (C4100qp e2) {
            C3900je.m17430b("Could not obtain webview.", e2);
            C3909jn.f13411a.post(new C3039bj(this));
        }
    }
}
