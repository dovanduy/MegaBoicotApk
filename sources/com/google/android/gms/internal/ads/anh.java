package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class anh extends aew<anh> {

    /* renamed from: a */
    private Integer f11519a;

    /* renamed from: b */
    private Integer f11520b;

    public anh() {
        this.f11519a = null;
        this.f11520b = null;
        this.f10676Y = null;
        this.f10689Z = -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo13936a() {
        int a = super.mo13936a();
        if (this.f11519a != null) {
            a += aeu.m13934b(1, this.f11519a.intValue());
        }
        return this.f11520b != null ? a + aeu.m13934b(2, this.f11520b.intValue()) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ afc mo13937a(aes aes) throws IOException {
        while (true) {
            int a = aes.mo14217a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f11519a = Integer.valueOf(aes.mo14231g());
            } else if (a == 16) {
                this.f11520b = Integer.valueOf(aes.mo14231g());
            } else if (!super.mo14246a(aes, a)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo13938a(aeu aeu) throws IOException {
        if (this.f11519a != null) {
            aeu.mo14236a(1, this.f11519a.intValue());
        }
        if (this.f11520b != null) {
            aeu.mo14236a(2, this.f11520b.intValue());
        }
        super.mo13938a(aeu);
    }
}
