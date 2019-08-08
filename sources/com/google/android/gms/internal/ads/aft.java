package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class aft extends aew<aft> {

    /* renamed from: a */
    public byte[][] f10761a;

    /* renamed from: b */
    public byte[] f10762b;

    /* renamed from: c */
    public Integer f10763c;

    /* renamed from: d */
    private Integer f10764d;

    public aft() {
        this.f10761a = aff.f10695d;
        this.f10762b = null;
        this.f10689Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final aft mo13937a(aes aes) throws IOException {
        int i;
        while (true) {
            int a = aes.mo14217a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                int a2 = aff.m13985a(aes, 10);
                int length = this.f10761a == null ? 0 : this.f10761a.length;
                byte[][] bArr = new byte[(a2 + length)][];
                if (length != 0) {
                    System.arraycopy(this.f10761a, 0, bArr, 0, length);
                }
                while (length < bArr.length - 1) {
                    bArr[length] = aes.mo14230f();
                    aes.mo14217a();
                    length++;
                }
                bArr[length] = aes.mo14230f();
                this.f10761a = bArr;
            } else if (a == 18) {
                this.f10762b = aes.mo14230f();
            } else if (a == 24) {
                i = aes.mo14234j();
                this.f10764d = Integer.valueOf(C4348ym.m18681b(aes.mo14231g()));
            } else if (a == 32) {
                i = aes.mo14234j();
                try {
                    this.f10763c = Integer.valueOf(C4348ym.m18682c(aes.mo14231g()));
                } catch (IllegalArgumentException unused) {
                    aes.mo14229e(i);
                    mo14246a(aes, a);
                }
            } else if (!super.mo14246a(aes, a)) {
                return this;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo13936a() {
        int a = super.mo13936a();
        if (this.f10761a != null && this.f10761a.length > 0) {
            int i = 0;
            int i2 = 0;
            for (byte[] bArr : this.f10761a) {
                if (bArr != null) {
                    i2++;
                    i += aeu.m13938b(bArr);
                }
            }
            a = a + i + (1 * i2);
        }
        if (this.f10762b != null) {
            a += aeu.m13937b(2, this.f10762b);
        }
        if (this.f10764d != null) {
            a += aeu.m13934b(3, this.f10764d.intValue());
        }
        return this.f10763c != null ? a + aeu.m13934b(4, this.f10763c.intValue()) : a;
    }

    /* renamed from: a */
    public final void mo13938a(aeu aeu) throws IOException {
        if (this.f10761a != null && this.f10761a.length > 0) {
            for (byte[] bArr : this.f10761a) {
                if (bArr != null) {
                    aeu.mo14241a(1, bArr);
                }
            }
        }
        if (this.f10762b != null) {
            aeu.mo14241a(2, this.f10762b);
        }
        if (this.f10764d != null) {
            aeu.mo14236a(3, this.f10764d.intValue());
        }
        if (this.f10763c != null) {
            aeu.mo14236a(4, this.f10763c.intValue());
        }
        super.mo13938a(aeu);
    }
}
