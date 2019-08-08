package com.google.android.gms.internal.ads;

import android.os.RemoteException;

final class bdx implements C4153so<C4154sp, Object> {

    /* renamed from: a */
    private final /* synthetic */ bdn f12699a;

    /* renamed from: b */
    private final /* synthetic */ bcg f12700b;

    /* renamed from: c */
    private final /* synthetic */ bdv f12701c;

    bdx(bdv bdv, bdn bdn, bcg bcg) {
        this.f12701c = bdv;
        this.f12699a = bdn;
        this.f12700b = bcg;
    }

    /* renamed from: a */
    public final void mo15187a(String str) {
        try {
            this.f12699a.mo15179a(str);
        } catch (RemoteException e) {
            C3987mk.m17430b("", e);
        }
    }
}
