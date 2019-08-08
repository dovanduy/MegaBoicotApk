package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.internal.C3369i.C3371b;
import com.google.android.gms.location.C4718g;

/* renamed from: com.google.android.gms.internal.location.s */
final class C4688s implements C3371b<C4718g> {

    /* renamed from: a */
    private final /* synthetic */ Location f15239a;

    C4688s(C4687r rVar, Location location) {
        this.f15239a = location;
    }

    /* renamed from: a */
    public final void mo13354a() {
    }

    /* renamed from: a */
    public final /* synthetic */ void mo13355a(Object obj) {
        ((C4718g) obj).onLocationChanged(this.f15239a);
    }
}
