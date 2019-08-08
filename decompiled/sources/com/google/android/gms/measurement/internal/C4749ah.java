package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences.Editor;
import android.util.Pair;
import com.google.android.gms.common.internal.C3513t;

/* renamed from: com.google.android.gms.measurement.internal.ah */
public final class C4749ah {

    /* renamed from: a */
    private final String f15414a;

    /* renamed from: b */
    private final String f15415b;

    /* renamed from: c */
    private final String f15416c;

    /* renamed from: d */
    private final long f15417d;

    /* renamed from: e */
    private final /* synthetic */ C4745ad f15418e;

    private C4749ah(C4745ad adVar, String str, long j) {
        this.f15418e = adVar;
        C3513t.m12627a(str);
        C3513t.m12635b(j > 0);
        this.f15414a = String.valueOf(str).concat(":start");
        this.f15415b = String.valueOf(str).concat(":count");
        this.f15416c = String.valueOf(str).concat(":value");
        this.f15417d = j;
    }

    /* renamed from: b */
    private final void m20391b() {
        this.f15418e.mo17144d();
        long a = this.f15418e.mo17153m().mo13694a();
        Editor edit = this.f15418e.m20367y().edit();
        edit.remove(this.f15415b);
        edit.remove(this.f15416c);
        edit.putLong(this.f15414a, a);
        edit.apply();
    }

    /* renamed from: a */
    public final void mo17191a(String str, long j) {
        this.f15418e.mo17144d();
        if (m20392c() == 0) {
            m20391b();
        }
        if (str == null) {
            str = "";
        }
        long j2 = this.f15418e.m20367y().getLong(this.f15415b, 0);
        if (j2 <= 0) {
            Editor edit = this.f15418e.m20367y().edit();
            edit.putString(this.f15416c, str);
            edit.putLong(this.f15415b, 1);
            edit.apply();
            return;
        }
        long j3 = j2 + 1;
        boolean z = (this.f15418e.mo17156p().mo17504h().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j3;
        Editor edit2 = this.f15418e.m20367y().edit();
        if (z) {
            edit2.putString(this.f15416c, str);
        }
        edit2.putLong(this.f15415b, j3);
        edit2.apply();
    }

    /* renamed from: a */
    public final Pair<String, Long> mo17190a() {
        long j;
        this.f15418e.mo17144d();
        this.f15418e.mo17144d();
        long c = m20392c();
        if (c == 0) {
            m20391b();
            j = 0;
        } else {
            j = Math.abs(c - this.f15418e.mo17153m().mo13694a());
        }
        if (j < this.f15417d) {
            return null;
        }
        if (j > (this.f15417d << 1)) {
            m20391b();
            return null;
        }
        String string = this.f15418e.m20367y().getString(this.f15416c, null);
        long j2 = this.f15418e.m20367y().getLong(this.f15415b, 0);
        m20391b();
        if (string == null || j2 <= 0) {
            return C4745ad.f15384a;
        }
        return new Pair<>(string, Long.valueOf(j2));
    }

    /* renamed from: c */
    private final long m20392c() {
        return this.f15418e.m20367y().getLong(this.f15414a, 0);
    }
}
