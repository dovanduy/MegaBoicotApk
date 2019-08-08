package com.google.android.gms.internal.ads;

import android.os.RemoteException;

final class bdw implements C4153so<Object, Object> {

    /* renamed from: a */
    private final /* synthetic */ bdl f12697a;

    /* renamed from: b */
    private final /* synthetic */ bcg f12698b;

    bdw(bdv bdv, bdl bdl, bcg bcg) {
        this.f12697a = bdl;
        this.f12698b = bcg;
    }

    /* renamed from: a */
    public final void mo15187a(String str) {
        try {
            this.f12697a.mo15178a(str);
        } catch (RemoteException e) {
            C3987mk.m17430b("", e);
        }
    }
}
