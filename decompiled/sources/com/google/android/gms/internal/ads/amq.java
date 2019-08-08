package com.google.android.gms.internal.ads;

import android.os.RemoteException;

public final class amq {

    /* renamed from: a */
    private final byte[] f11438a;

    /* renamed from: b */
    private int f11439b;

    /* renamed from: c */
    private int f11440c;

    /* renamed from: d */
    private final /* synthetic */ amo f11441d;

    private amq(amo amo, byte[] bArr) {
        this.f11441d = amo;
        this.f11438a = bArr;
    }

    /* renamed from: a */
    public final amq mo14520a(int i) {
        this.f11439b = i;
        return this;
    }

    /* renamed from: a */
    public final synchronized void mo14521a() {
        try {
            if (this.f11441d.f11437b) {
                this.f11441d.f11436a.mo14364a(this.f11438a);
                this.f11441d.f11436a.mo14361a(this.f11439b);
                this.f11441d.f11436a.mo14366b(this.f11440c);
                this.f11441d.f11436a.mo14365a((int[]) null);
                this.f11441d.f11436a.mo14360a();
            }
        } catch (RemoteException e) {
            C3987mk.m17427a("Clearcut log failed", e);
        }
    }

    /* renamed from: b */
    public final amq mo14522b(int i) {
        this.f11440c = i;
        return this;
    }
}
