package com.google.android.gms.common.api.internal;

import android.support.p017v4.p023d.C0376a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3261c;
import com.google.android.gms.common.api.C3263e;
import com.google.android.gms.p143d.C3583g;
import com.google.android.gms.p143d.C3584h;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.internal.ce */
public final class C3340ce {

    /* renamed from: a */
    private final C0376a<C3337cc<?>, ConnectionResult> f9666a = new C0376a<>();

    /* renamed from: b */
    private final C0376a<C3337cc<?>, String> f9667b = new C0376a<>();

    /* renamed from: c */
    private final C3584h<Map<C3337cc<?>, String>> f9668c = new C3584h<>();

    /* renamed from: d */
    private int f9669d;

    /* renamed from: e */
    private boolean f9670e = false;

    public C3340ce(Iterable<? extends C3263e<?>> iterable) {
        for (C3263e d : iterable) {
            this.f9666a.put(d.mo13119d(), null);
        }
        this.f9669d = this.f9666a.keySet().size();
    }

    /* renamed from: a */
    public final Set<C3337cc<?>> mo13279a() {
        return this.f9666a.keySet();
    }

    /* renamed from: b */
    public final C3583g<Map<C3337cc<?>, String>> mo13281b() {
        return this.f9668c.mo13720a();
    }

    /* renamed from: a */
    public final void mo13280a(C3337cc<?> ccVar, ConnectionResult connectionResult, String str) {
        this.f9666a.put(ccVar, connectionResult);
        this.f9667b.put(ccVar, str);
        this.f9669d--;
        if (!connectionResult.mo13042b()) {
            this.f9670e = true;
        }
        if (this.f9669d == 0) {
            if (this.f9670e) {
                this.f9668c.mo13721a((Exception) new C3261c(this.f9666a));
                return;
            }
            this.f9668c.mo13722a(this.f9667b);
        }
    }
}
