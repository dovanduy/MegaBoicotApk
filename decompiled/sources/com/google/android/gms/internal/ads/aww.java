package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.common.internal.C3469d.C3470a;

final class aww implements C3470a {

    /* renamed from: a */
    final /* synthetic */ awu f12327a;

    /* renamed from: b */
    private final /* synthetic */ C4019np f12328b;

    /* renamed from: c */
    private final /* synthetic */ zzsg f12329c;

    aww(awu awu, C4019np npVar, zzsg zzsg) {
        this.f12327a = awu;
        this.f12328b = npVar;
        this.f12329c = zzsg;
    }

    /* renamed from: a */
    public final void mo13483a(int i) {
    }

    /* renamed from: a */
    public final void mo13484a(Bundle bundle) {
        synchronized (this.f12327a.f12325d) {
            if (!this.f12327a.f12323b) {
                this.f12327a.f12323b = true;
                awp d = this.f12327a.f12322a;
                if (d != null) {
                    this.f12328b.mo15658a(new awy(this.f12328b, C3907jl.m17118a((Runnable) new awx(this, d, this.f12328b, this.f12329c))), C4014nk.f13618b);
                }
            }
        }
    }
}
