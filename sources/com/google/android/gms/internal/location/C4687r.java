package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.internal.C3369i;
import com.google.android.gms.location.C4711al;
import com.google.android.gms.location.C4718g;

/* renamed from: com.google.android.gms.internal.location.r */
final class C4687r extends C4711al {

    /* renamed from: a */
    private final C3369i<C4718g> f15238a;

    C4687r(C3369i<C4718g> iVar) {
        this.f15238a = iVar;
    }

    /* renamed from: a */
    public final synchronized void mo16938a() {
        this.f15238a.mo13348a();
    }

    /* renamed from: a */
    public final synchronized void mo16939a(Location location) {
        this.f15238a.mo13349a(new C4688s(this, location));
    }
}
