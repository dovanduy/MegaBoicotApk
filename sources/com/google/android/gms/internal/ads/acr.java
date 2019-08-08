package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class acr extends aew<acr> {

    /* renamed from: a */
    private Long f10506a;

    /* renamed from: b */
    private Integer f10507b;

    /* renamed from: c */
    private Boolean f10508c;

    /* renamed from: d */
    private int[] f10509d;

    /* renamed from: e */
    private Long f10510e;

    public acr() {
        this.f10506a = null;
        this.f10507b = null;
        this.f10508c = null;
        this.f10509d = aff.f10692a;
        this.f10510e = null;
        this.f10689Z = -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo13936a() {
        int a = super.mo13936a();
        if (this.f10506a != null) {
            a += aeu.m13942d(1, this.f10506a.longValue());
        }
        if (this.f10507b != null) {
            a += aeu.m13934b(2, this.f10507b.intValue());
        }
        if (this.f10508c != null) {
            this.f10508c.booleanValue();
            a += aeu.m13933b(3) + 1;
        }
        if (this.f10509d != null && this.f10509d.length > 0) {
            int i = 0;
            for (int a2 : this.f10509d) {
                i += aeu.m13926a(a2);
            }
            a = a + i + (1 * this.f10509d.length);
        }
        return this.f10510e != null ? a + aeu.m13940c(5, this.f10510e.longValue()) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ afc mo13937a(aes aes) throws IOException {
        while (true) {
            int a = aes.mo14217a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f10506a = Long.valueOf(aes.mo14232h());
            } else if (a == 16) {
                this.f10507b = Integer.valueOf(aes.mo14231g());
            } else if (a == 24) {
                this.f10508c = Boolean.valueOf(aes.mo14227d());
            } else if (a == 32) {
                int a2 = aff.m13985a(aes, 32);
                int length = this.f10509d == null ? 0 : this.f10509d.length;
                int[] iArr = new int[(a2 + length)];
                if (length != 0) {
                    System.arraycopy(this.f10509d, 0, iArr, 0, length);
                }
                while (length < iArr.length - 1) {
                    iArr[length] = aes.mo14231g();
                    aes.mo14217a();
                    length++;
                }
                iArr[length] = aes.mo14231g();
                this.f10509d = iArr;
            } else if (a == 34) {
                int c = aes.mo14225c(aes.mo14231g());
                int j = aes.mo14234j();
                int i = 0;
                while (aes.mo14233i() > 0) {
                    aes.mo14231g();
                    i++;
                }
                aes.mo14229e(j);
                int length2 = this.f10509d == null ? 0 : this.f10509d.length;
                int[] iArr2 = new int[(i + length2)];
                if (length2 != 0) {
                    System.arraycopy(this.f10509d, 0, iArr2, 0, length2);
                }
                while (length2 < iArr2.length) {
                    iArr2[length2] = aes.mo14231g();
                    length2++;
                }
                this.f10509d = iArr2;
                aes.mo14226d(c);
            } else if (a == 40) {
                this.f10510e = Long.valueOf(aes.mo14232h());
            } else if (!super.mo14246a(aes, a)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo13938a(aeu aeu) throws IOException {
        if (this.f10506a != null) {
            aeu.mo14242b(1, this.f10506a.longValue());
        }
        if (this.f10507b != null) {
            aeu.mo14236a(2, this.f10507b.intValue());
        }
        if (this.f10508c != null) {
            aeu.mo14240a(3, this.f10508c.booleanValue());
        }
        if (this.f10509d != null && this.f10509d.length > 0) {
            for (int a : this.f10509d) {
                aeu.mo14236a(4, a);
            }
        }
        if (this.f10510e != null) {
            aeu.mo14237a(5, this.f10510e.longValue());
        }
        super.mo13938a(aeu);
    }
}
