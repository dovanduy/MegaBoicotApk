package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class and extends aew<and> {

    /* renamed from: a */
    private anb f11500a;

    /* renamed from: b */
    private anj[] f11501b;

    /* renamed from: c */
    private Integer f11502c;

    /* renamed from: d */
    private ank f11503d;

    public and() {
        this.f11500a = null;
        this.f11501b = anj.m14517b();
        this.f11502c = null;
        this.f11503d = null;
        this.f10676Y = null;
        this.f10689Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final and mo13937a(aes aes) throws IOException {
        afc afc;
        while (true) {
            int a = aes.mo14217a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                if (this.f11500a == null) {
                    this.f11500a = new anb();
                }
                afc = this.f11500a;
            } else if (a == 18) {
                int a2 = aff.m13985a(aes, 18);
                int length = this.f11501b == null ? 0 : this.f11501b.length;
                anj[] anjArr = new anj[(a2 + length)];
                if (length != 0) {
                    System.arraycopy(this.f11501b, 0, anjArr, 0, length);
                }
                while (length < anjArr.length - 1) {
                    anjArr[length] = new anj();
                    aes.mo14219a((afc) anjArr[length]);
                    aes.mo14217a();
                    length++;
                }
                anjArr[length] = new anj();
                aes.mo14219a((afc) anjArr[length]);
                this.f11501b = anjArr;
            } else if (a == 24) {
                int j = aes.mo14234j();
                try {
                    this.f11502c = Integer.valueOf(ams.m14452a(aes.mo14231g()));
                } catch (IllegalArgumentException unused) {
                    aes.mo14229e(j);
                    mo14246a(aes, a);
                }
            } else if (a == 34) {
                if (this.f11503d == null) {
                    this.f11503d = new ank();
                }
                afc = this.f11503d;
            } else if (!super.mo14246a(aes, a)) {
                return this;
            }
            aes.mo14219a(afc);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo13936a() {
        int a = super.mo13936a();
        if (this.f11500a != null) {
            a += aeu.m13935b(1, (afc) this.f11500a);
        }
        if (this.f11501b != null && this.f11501b.length > 0) {
            for (anj anj : this.f11501b) {
                if (anj != null) {
                    a += aeu.m13935b(2, (afc) anj);
                }
            }
        }
        if (this.f11502c != null) {
            a += aeu.m13934b(3, this.f11502c.intValue());
        }
        return this.f11503d != null ? a + aeu.m13935b(4, (afc) this.f11503d) : a;
    }

    /* renamed from: a */
    public final void mo13938a(aeu aeu) throws IOException {
        if (this.f11500a != null) {
            aeu.mo14238a(1, (afc) this.f11500a);
        }
        if (this.f11501b != null && this.f11501b.length > 0) {
            for (anj anj : this.f11501b) {
                if (anj != null) {
                    aeu.mo14238a(2, (afc) anj);
                }
            }
        }
        if (this.f11502c != null) {
            aeu.mo14236a(3, this.f11502c.intValue());
        }
        if (this.f11503d != null) {
            aeu.mo14238a(4, (afc) this.f11503d);
        }
        super.mo13938a(aeu);
    }
}
