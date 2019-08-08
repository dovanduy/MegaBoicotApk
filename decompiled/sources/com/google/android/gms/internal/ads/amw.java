package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class amw extends aew<amw> {

    /* renamed from: a */
    private String f11460a;

    /* renamed from: b */
    private amu[] f11461b;

    /* renamed from: c */
    private Integer f11462c;

    /* renamed from: d */
    private Integer f11463d;

    /* renamed from: e */
    private Integer f11464e;

    public amw() {
        this.f11460a = null;
        this.f11461b = amu.m14458b();
        this.f11462c = null;
        this.f11463d = null;
        this.f11464e = null;
        this.f10676Y = null;
        this.f10689Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final amw mo13937a(aes aes) throws IOException {
        int i;
        while (true) {
            int a = aes.mo14217a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f11460a = aes.mo14228e();
            } else if (a == 18) {
                int a2 = aff.m13985a(aes, 18);
                int length = this.f11461b == null ? 0 : this.f11461b.length;
                amu[] amuArr = new amu[(a2 + length)];
                if (length != 0) {
                    System.arraycopy(this.f11461b, 0, amuArr, 0, length);
                }
                while (length < amuArr.length - 1) {
                    amuArr[length] = new amu();
                    aes.mo14219a((afc) amuArr[length]);
                    aes.mo14217a();
                    length++;
                }
                amuArr[length] = new amu();
                aes.mo14219a((afc) amuArr[length]);
                this.f11461b = amuArr;
            } else if (a == 24) {
                i = aes.mo14234j();
                this.f11462c = Integer.valueOf(ams.m14452a(aes.mo14231g()));
            } else if (a == 32) {
                i = aes.mo14234j();
                this.f11463d = Integer.valueOf(ams.m14452a(aes.mo14231g()));
            } else if (a == 40) {
                i = aes.mo14234j();
                try {
                    this.f11464e = Integer.valueOf(ams.m14452a(aes.mo14231g()));
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
        if (this.f11460a != null) {
            a += aeu.m13936b(1, this.f11460a);
        }
        if (this.f11461b != null && this.f11461b.length > 0) {
            for (amu amu : this.f11461b) {
                if (amu != null) {
                    a += aeu.m13935b(2, (afc) amu);
                }
            }
        }
        if (this.f11462c != null) {
            a += aeu.m13934b(3, this.f11462c.intValue());
        }
        if (this.f11463d != null) {
            a += aeu.m13934b(4, this.f11463d.intValue());
        }
        return this.f11464e != null ? a + aeu.m13934b(5, this.f11464e.intValue()) : a;
    }

    /* renamed from: a */
    public final void mo13938a(aeu aeu) throws IOException {
        if (this.f11460a != null) {
            aeu.mo14239a(1, this.f11460a);
        }
        if (this.f11461b != null && this.f11461b.length > 0) {
            for (amu amu : this.f11461b) {
                if (amu != null) {
                    aeu.mo14238a(2, (afc) amu);
                }
            }
        }
        if (this.f11462c != null) {
            aeu.mo14236a(3, this.f11462c.intValue());
        }
        if (this.f11463d != null) {
            aeu.mo14236a(4, this.f11463d.intValue());
        }
        if (this.f11464e != null) {
            aeu.mo14236a(5, this.f11464e.intValue());
        }
        super.mo13938a(aeu);
    }
}
