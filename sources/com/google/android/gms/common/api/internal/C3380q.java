package com.google.android.gms.common.api.internal;

import android.support.p017v4.p023d.C0376a;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3261c;
import com.google.android.gms.p143d.C3579c;
import com.google.android.gms.p143d.C3583g;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.gms.common.api.internal.q */
final class C3380q implements C3579c<Map<C3337cc<?>, String>> {

    /* renamed from: a */
    private C3375l f9794a;

    /* renamed from: b */
    private final /* synthetic */ C3353cr f9795b;

    C3380q(C3353cr crVar, C3375l lVar) {
        this.f9795b = crVar;
        this.f9794a = lVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo13363a() {
        this.f9794a.mo13013h();
    }

    /* renamed from: a */
    public final void mo13295a(C3583g<Map<C3337cc<?>, String>> gVar) {
        this.f9795b.f9710f.lock();
        try {
            if (!this.f9795b.f9718n) {
                this.f9794a.mo13013h();
                return;
            }
            if (gVar.mo13716b()) {
                this.f9795b.f9720p = new C0376a(this.f9795b.f9706b.size());
                for (C3352cq d : this.f9795b.f9706b.values()) {
                    this.f9795b.f9720p.put(d.mo13119d(), ConnectionResult.f9434a);
                }
            } else if (gVar.mo13719e() instanceof C3261c) {
                C3261c cVar = (C3261c) gVar.mo13719e();
                if (this.f9795b.f9716l) {
                    this.f9795b.f9720p = new C0376a(this.f9795b.f9706b.size());
                    for (C3352cq cqVar : this.f9795b.f9706b.values()) {
                        C3337cc d2 = cqVar.mo13119d();
                        ConnectionResult a = cVar.mo13111a(cqVar);
                        if (this.f9795b.m11976a(cqVar, a)) {
                            this.f9795b.f9720p.put(d2, new ConnectionResult(16));
                        } else {
                            this.f9795b.f9720p.put(d2, a);
                        }
                    }
                } else {
                    this.f9795b.f9720p = cVar.mo13110a();
                }
            } else {
                Log.e("ConnectionlessGAC", "Unexpected availability exception", gVar.mo13719e());
                this.f9795b.f9720p = Collections.emptyMap();
            }
            if (this.f9795b.mo13220f()) {
                this.f9795b.f9719o.putAll(this.f9795b.f9720p);
                if (this.f9795b.m11993k() == null) {
                    this.f9795b.m11988g();
                    this.f9795b.m11991j();
                    this.f9795b.f9713i.signalAll();
                }
            }
            this.f9794a.mo13013h();
            this.f9795b.f9710f.unlock();
        } finally {
            this.f9795b.f9710f.unlock();
        }
    }
}
