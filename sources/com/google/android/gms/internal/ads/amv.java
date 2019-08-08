package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class amv extends aew<amv> {

    /* renamed from: a */
    private String f11457a;

    /* renamed from: b */
    private amu[] f11458b;

    /* renamed from: c */
    private Integer f11459c;

    public amv() {
        this.f11457a = null;
        this.f11458b = amu.m14458b();
        this.f11459c = null;
        this.f10676Y = null;
        this.f10689Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final amv mo13937a(aes aes) throws IOException {
        while (true) {
            int a = aes.mo14217a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f11457a = aes.mo14228e();
            } else if (a == 18) {
                int a2 = aff.m13985a(aes, 18);
                int length = this.f11458b == null ? 0 : this.f11458b.length;
                amu[] amuArr = new amu[(a2 + length)];
                if (length != 0) {
                    System.arraycopy(this.f11458b, 0, amuArr, 0, length);
                }
                while (length < amuArr.length - 1) {
                    amuArr[length] = new amu();
                    aes.mo14219a((afc) amuArr[length]);
                    aes.mo14217a();
                    length++;
                }
                amuArr[length] = new amu();
                aes.mo14219a((afc) amuArr[length]);
                this.f11458b = amuArr;
            } else if (a == 24) {
                int j = aes.mo14234j();
                try {
                    this.f11459c = Integer.valueOf(ams.m14452a(aes.mo14231g()));
                } catch (IllegalArgumentException unused) {
                    aes.mo14229e(j);
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
        if (this.f11457a != null) {
            a += aeu.m13936b(1, this.f11457a);
        }
        if (this.f11458b != null && this.f11458b.length > 0) {
            for (amu amu : this.f11458b) {
                if (amu != null) {
                    a += aeu.m13935b(2, (afc) amu);
                }
            }
        }
        return this.f11459c != null ? a + aeu.m13934b(3, this.f11459c.intValue()) : a;
    }

    /* renamed from: a */
    public final void mo13938a(aeu aeu) throws IOException {
        if (this.f11457a != null) {
            aeu.mo14239a(1, this.f11457a);
        }
        if (this.f11458b != null && this.f11458b.length > 0) {
            for (amu amu : this.f11458b) {
                if (amu != null) {
                    aeu.mo14238a(2, (afc) amu);
                }
            }
        }
        if (this.f11459c != null) {
            aeu.mo14236a(3, this.f11459c.intValue());
        }
        super.mo13938a(aeu);
    }
}
