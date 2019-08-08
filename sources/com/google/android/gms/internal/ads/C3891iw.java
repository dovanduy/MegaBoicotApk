package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.C3025aw;
import javax.annotation.concurrent.GuardedBy;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.iw */
public final class C3891iw {

    /* renamed from: a */
    private final Object f13357a;
    @GuardedBy("mLock")

    /* renamed from: b */
    private int f13358b;
    @GuardedBy("mLock")

    /* renamed from: c */
    private int f13359c;

    /* renamed from: d */
    private final C3892ix f13360d;

    /* renamed from: e */
    private final String f13361e;

    private C3891iw(C3892ix ixVar, String str) {
        this.f13357a = new Object();
        this.f13360d = ixVar;
        this.f13361e = str;
    }

    public C3891iw(String str) {
        this(C3025aw.m10922j(), str);
    }

    /* renamed from: a */
    public final String mo15463a() {
        return this.f13361e;
    }

    /* renamed from: a */
    public final void mo15464a(int i, int i2) {
        synchronized (this.f13357a) {
            this.f13358b = i;
            this.f13359c = i2;
            this.f13360d.mo15471a(this);
        }
    }

    /* renamed from: b */
    public final Bundle mo15465b() {
        Bundle bundle;
        synchronized (this.f13357a) {
            bundle = new Bundle();
            bundle.putInt("pmnli", this.f13358b);
            bundle.putInt("pmnll", this.f13359c);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3891iw iwVar = (C3891iw) obj;
        return this.f13361e != null ? this.f13361e.equals(iwVar.f13361e) : iwVar.f13361e == null;
    }

    public final int hashCode() {
        if (this.f13361e != null) {
            return this.f13361e.hashCode();
        }
        return 0;
    }
}
