package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class aet extends aew<aet> {

    /* renamed from: a */
    public Long f10672a;

    /* renamed from: b */
    private String f10673b;

    /* renamed from: c */
    private byte[] f10674c;

    public aet() {
        this.f10672a = null;
        this.f10673b = null;
        this.f10674c = null;
        this.f10689Z = -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo13936a() {
        int a = super.mo13936a();
        if (this.f10672a != null) {
            a += aeu.m13942d(1, this.f10672a.longValue());
        }
        if (this.f10673b != null) {
            a += aeu.m13936b(3, this.f10673b);
        }
        return this.f10674c != null ? a + aeu.m13937b(4, this.f10674c) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ afc mo13937a(aes aes) throws IOException {
        while (true) {
            int a = aes.mo14217a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f10672a = Long.valueOf(aes.mo14232h());
            } else if (a == 26) {
                this.f10673b = aes.mo14228e();
            } else if (a == 34) {
                this.f10674c = aes.mo14230f();
            } else if (!super.mo14246a(aes, a)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo13938a(aeu aeu) throws IOException {
        if (this.f10672a != null) {
            aeu.mo14242b(1, this.f10672a.longValue());
        }
        if (this.f10673b != null) {
            aeu.mo14239a(3, this.f10673b);
        }
        if (this.f10674c != null) {
            aeu.mo14241a(4, this.f10674c);
        }
        super.mo13938a(aeu);
    }
}
