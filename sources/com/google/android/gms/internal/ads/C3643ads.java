package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.ads */
public final class C3643ads extends aew<C3643ads> {

    /* renamed from: a */
    public byte[] f10584a;

    /* renamed from: b */
    public byte[] f10585b;

    /* renamed from: c */
    public byte[] f10586c;

    /* renamed from: d */
    public byte[] f10587d;

    public C3643ads() {
        this.f10584a = null;
        this.f10585b = null;
        this.f10586c = null;
        this.f10587d = null;
        this.f10689Z = -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo13936a() {
        int a = super.mo13936a();
        if (this.f10584a != null) {
            a += aeu.m13937b(1, this.f10584a);
        }
        if (this.f10585b != null) {
            a += aeu.m13937b(2, this.f10585b);
        }
        if (this.f10586c != null) {
            a += aeu.m13937b(3, this.f10586c);
        }
        return this.f10587d != null ? a + aeu.m13937b(4, this.f10587d) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ afc mo13937a(aes aes) throws IOException {
        while (true) {
            int a = aes.mo14217a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f10584a = aes.mo14230f();
            } else if (a == 18) {
                this.f10585b = aes.mo14230f();
            } else if (a == 26) {
                this.f10586c = aes.mo14230f();
            } else if (a == 34) {
                this.f10587d = aes.mo14230f();
            } else if (!super.mo14246a(aes, a)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo13938a(aeu aeu) throws IOException {
        if (this.f10584a != null) {
            aeu.mo14241a(1, this.f10584a);
        }
        if (this.f10585b != null) {
            aeu.mo14241a(2, this.f10585b);
        }
        if (this.f10586c != null) {
            aeu.mo14241a(3, this.f10586c);
        }
        if (this.f10587d != null) {
            aeu.mo14241a(4, this.f10587d);
        }
        super.mo13938a(aeu);
    }
}
