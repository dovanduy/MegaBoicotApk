package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class anl extends aew<anl> {

    /* renamed from: a */
    public Integer f11530a;

    /* renamed from: b */
    public Integer f11531b;

    /* renamed from: c */
    public Integer f11532c;

    public anl() {
        this.f11530a = null;
        this.f11531b = null;
        this.f11532c = null;
        this.f10676Y = null;
        this.f10689Z = -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo13936a() {
        int a = super.mo13936a();
        if (this.f11530a != null) {
            a += aeu.m13934b(1, this.f11530a.intValue());
        }
        if (this.f11531b != null) {
            a += aeu.m13934b(2, this.f11531b.intValue());
        }
        return this.f11532c != null ? a + aeu.m13934b(3, this.f11532c.intValue()) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ afc mo13937a(aes aes) throws IOException {
        while (true) {
            int a = aes.mo14217a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f11530a = Integer.valueOf(aes.mo14231g());
            } else if (a == 16) {
                this.f11531b = Integer.valueOf(aes.mo14231g());
            } else if (a == 24) {
                this.f11532c = Integer.valueOf(aes.mo14231g());
            } else if (!super.mo14246a(aes, a)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo13938a(aeu aeu) throws IOException {
        if (this.f11530a != null) {
            aeu.mo14236a(1, this.f11530a.intValue());
        }
        if (this.f11531b != null) {
            aeu.mo14236a(2, this.f11531b.intValue());
        }
        if (this.f11532c != null) {
            aeu.mo14236a(3, this.f11532c.intValue());
        }
        super.mo13938a(aeu);
    }
}
