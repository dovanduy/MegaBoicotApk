package com.google.android.gms.common.api.internal;

import android.support.p017v4.p023d.C0376a;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3261c;
import com.google.android.gms.p143d.C3579c;
import com.google.android.gms.p143d.C3583g;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.gms.common.api.internal.ct */
final class C3355ct implements C3579c<Map<C3337cc<?>, String>> {

    /* renamed from: a */
    private final /* synthetic */ C3353cr f9723a;

    private C3355ct(C3353cr crVar) {
        this.f9723a = crVar;
    }

    /* renamed from: a */
    public final void mo13295a(C3583g<Map<C3337cc<?>, String>> gVar) {
        this.f9723a.f9710f.lock();
        try {
            if (this.f9723a.f9718n) {
                if (gVar.mo13716b()) {
                    this.f9723a.f9719o = new C0376a(this.f9723a.f9705a.size());
                    for (C3352cq d : this.f9723a.f9705a.values()) {
                        this.f9723a.f9719o.put(d.mo13119d(), ConnectionResult.f9434a);
                    }
                } else if (gVar.mo13719e() instanceof C3261c) {
                    C3261c cVar = (C3261c) gVar.mo13719e();
                    if (this.f9723a.f9716l) {
                        this.f9723a.f9719o = new C0376a(this.f9723a.f9705a.size());
                        for (C3352cq cqVar : this.f9723a.f9705a.values()) {
                            C3337cc d2 = cqVar.mo13119d();
                            ConnectionResult a = cVar.mo13111a(cqVar);
                            if (this.f9723a.m11976a(cqVar, a)) {
                                this.f9723a.f9719o.put(d2, new ConnectionResult(16));
                            } else {
                                this.f9723a.f9719o.put(d2, a);
                            }
                        }
                    } else {
                        this.f9723a.f9719o = cVar.mo13110a();
                    }
                    this.f9723a.f9722r = this.f9723a.m11993k();
                } else {
                    Log.e("ConnectionlessGAC", "Unexpected availability exception", gVar.mo13719e());
                    this.f9723a.f9719o = Collections.emptyMap();
                    this.f9723a.f9722r = new ConnectionResult(8);
                }
                if (this.f9723a.f9720p != null) {
                    this.f9723a.f9719o.putAll(this.f9723a.f9720p);
                    this.f9723a.f9722r = this.f9723a.m11993k();
                }
                if (this.f9723a.f9722r == null) {
                    this.f9723a.m11988g();
                    this.f9723a.m11991j();
                } else {
                    this.f9723a.f9718n = false;
                    this.f9723a.f9709e.mo13195a(this.f9723a.f9722r);
                }
                this.f9723a.f9713i.signalAll();
                this.f9723a.f9710f.unlock();
            }
        } finally {
            this.f9723a.f9710f.unlock();
        }
    }
}
