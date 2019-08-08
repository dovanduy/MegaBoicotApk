package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class afm extends aew<afm> {

    /* renamed from: a */
    private Integer f10740a;

    /* renamed from: b */
    private byte[] f10741b;

    /* renamed from: c */
    private byte[] f10742c;

    public afm() {
        this.f10740a = null;
        this.f10741b = null;
        this.f10742c = null;
        this.f10676Y = null;
        this.f10689Z = -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo13936a() {
        int a = super.mo13936a();
        if (this.f10740a != null) {
            a += aeu.m13934b(1, this.f10740a.intValue());
        }
        if (this.f10741b != null) {
            a += aeu.m13937b(2, this.f10741b);
        }
        return this.f10742c != null ? a + aeu.m13937b(3, this.f10742c) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ afc mo13937a(aes aes) throws IOException {
        while (true) {
            int a = aes.mo14217a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f10740a = Integer.valueOf(aes.mo14224c());
            } else if (a == 18) {
                this.f10741b = aes.mo14230f();
            } else if (a == 26) {
                this.f10742c = aes.mo14230f();
            } else if (!super.mo14246a(aes, a)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo13938a(aeu aeu) throws IOException {
        if (this.f10740a != null) {
            aeu.mo14236a(1, this.f10740a.intValue());
        }
        if (this.f10741b != null) {
            aeu.mo14241a(2, this.f10741b);
        }
        if (this.f10742c != null) {
            aeu.mo14241a(3, this.f10742c);
        }
        super.mo13938a(aeu);
    }
}
