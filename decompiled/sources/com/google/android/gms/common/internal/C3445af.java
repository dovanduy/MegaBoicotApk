package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.C3270g;
import com.google.android.gms.common.api.C3270g.C3271a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C3506s.C3507a;
import com.google.android.gms.common.internal.C3506s.C3508b;
import com.google.android.gms.p143d.C3584h;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.common.internal.af */
final class C3445af implements C3271a {

    /* renamed from: a */
    private final /* synthetic */ C3270g f9961a;

    /* renamed from: b */
    private final /* synthetic */ C3584h f9962b;

    /* renamed from: c */
    private final /* synthetic */ C3507a f9963c;

    /* renamed from: d */
    private final /* synthetic */ C3508b f9964d;

    C3445af(C3270g gVar, C3584h hVar, C3507a aVar, C3508b bVar) {
        this.f9961a = gVar;
        this.f9962b = hVar;
        this.f9963c = aVar;
        this.f9964d = bVar;
    }

    /* renamed from: a */
    public final void mo13159a(Status status) {
        if (status.mo13080d()) {
            this.f9962b.mo13722a(this.f9963c.mo12982a(this.f9961a.mo13153a(0, TimeUnit.MILLISECONDS)));
            return;
        }
        this.f9962b.mo13721a((Exception) this.f9964d.mo13487a(status));
    }
}
