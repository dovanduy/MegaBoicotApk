package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class anc extends aew<anc> {

    /* renamed from: a */
    private Integer f11498a;

    /* renamed from: b */
    private int[] f11499b;

    public anc() {
        this.f11498a = null;
        this.f11499b = aff.f10692a;
        this.f10676Y = null;
        this.f10689Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final anc mo13937a(aes aes) throws IOException {
        while (true) {
            int a = aes.mo14217a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                int j = aes.mo14234j();
                try {
                    this.f11498a = Integer.valueOf(ams.m14452a(aes.mo14231g()));
                } catch (IllegalArgumentException unused) {
                    aes.mo14229e(j);
                    mo14246a(aes, a);
                }
            } else if (a == 16) {
                int a2 = aff.m13985a(aes, 16);
                int length = this.f11499b == null ? 0 : this.f11499b.length;
                int[] iArr = new int[(a2 + length)];
                if (length != 0) {
                    System.arraycopy(this.f11499b, 0, iArr, 0, length);
                }
                while (length < iArr.length - 1) {
                    iArr[length] = aes.mo14231g();
                    aes.mo14217a();
                    length++;
                }
                iArr[length] = aes.mo14231g();
                this.f11499b = iArr;
            } else if (a == 18) {
                int c = aes.mo14225c(aes.mo14231g());
                int j2 = aes.mo14234j();
                int i = 0;
                while (aes.mo14233i() > 0) {
                    aes.mo14231g();
                    i++;
                }
                aes.mo14229e(j2);
                int length2 = this.f11499b == null ? 0 : this.f11499b.length;
                int[] iArr2 = new int[(i + length2)];
                if (length2 != 0) {
                    System.arraycopy(this.f11499b, 0, iArr2, 0, length2);
                }
                while (length2 < iArr2.length) {
                    iArr2[length2] = aes.mo14231g();
                    length2++;
                }
                this.f11499b = iArr2;
                aes.mo14226d(c);
            } else if (!super.mo14246a(aes, a)) {
                return this;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo13936a() {
        int a = super.mo13936a();
        if (this.f11498a != null) {
            a += aeu.m13934b(1, this.f11498a.intValue());
        }
        if (this.f11499b == null || this.f11499b.length <= 0) {
            return a;
        }
        int i = 0;
        for (int a2 : this.f11499b) {
            i += aeu.m13926a(a2);
        }
        return a + i + (1 * this.f11499b.length);
    }

    /* renamed from: a */
    public final void mo13938a(aeu aeu) throws IOException {
        if (this.f11498a != null) {
            aeu.mo14236a(1, this.f11498a.intValue());
        }
        if (this.f11499b != null && this.f11499b.length > 0) {
            for (int a : this.f11499b) {
                aeu.mo14236a(2, a);
            }
        }
        super.mo13938a(aeu);
    }
}
