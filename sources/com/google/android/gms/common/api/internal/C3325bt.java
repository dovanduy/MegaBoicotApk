package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C3266f;
import com.google.android.gms.common.api.C3391k;

/* renamed from: com.google.android.gms.common.api.internal.bt */
final class C3325bt implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C3391k f9640a;

    /* renamed from: b */
    private final /* synthetic */ C3324bs f9641b;

    C3325bt(C3324bs bsVar, C3391k kVar) {
        this.f9641b = bsVar;
        this.f9640a = kVar;
    }

    public final void run() {
        try {
            BasePendingResult.f9508a.set(Boolean.valueOf(true));
            this.f9641b.f9638h.sendMessage(this.f9641b.f9638h.obtainMessage(0, this.f9641b.f9631a.mo13378a(this.f9640a)));
            BasePendingResult.f9508a.set(Boolean.valueOf(false));
            C3324bs.m11859a(this.f9640a);
            C3266f fVar = (C3266f) this.f9641b.f9637g.get();
            if (fVar != null) {
                fVar.mo13137b(this.f9641b);
            }
        } catch (RuntimeException e) {
            this.f9641b.f9638h.sendMessage(this.f9641b.f9638h.obtainMessage(1, e));
            BasePendingResult.f9508a.set(Boolean.valueOf(false));
            C3324bs.m11859a(this.f9640a);
            C3266f fVar2 = (C3266f) this.f9641b.f9637g.get();
            if (fVar2 != null) {
                fVar2.mo13137b(this.f9641b);
            }
        } catch (Throwable th) {
            BasePendingResult.f9508a.set(Boolean.valueOf(false));
            C3324bs.m11859a(this.f9640a);
            C3266f fVar3 = (C3266f) this.f9641b.f9637g.get();
            if (fVar3 != null) {
                fVar3.mo13137b(this.f9641b);
            }
            throw th;
        }
    }
}
