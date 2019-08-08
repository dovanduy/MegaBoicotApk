package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class afl extends aew<afl> {

    /* renamed from: a */
    private afm f10734a;

    /* renamed from: b */
    private afi[] f10735b;

    /* renamed from: c */
    private byte[] f10736c;

    /* renamed from: d */
    private byte[] f10737d;

    /* renamed from: e */
    private Integer f10738e;

    /* renamed from: f */
    private byte[] f10739f;

    public afl() {
        this.f10734a = null;
        this.f10735b = afi.m13993b();
        this.f10736c = null;
        this.f10737d = null;
        this.f10738e = null;
        this.f10739f = null;
        this.f10676Y = null;
        this.f10689Z = -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo13936a() {
        int a = super.mo13936a();
        if (this.f10734a != null) {
            a += aeu.m13935b(1, (afc) this.f10734a);
        }
        if (this.f10735b != null && this.f10735b.length > 0) {
            for (afi afi : this.f10735b) {
                if (afi != null) {
                    a += aeu.m13935b(2, (afc) afi);
                }
            }
        }
        if (this.f10736c != null) {
            a += aeu.m13937b(3, this.f10736c);
        }
        if (this.f10737d != null) {
            a += aeu.m13937b(4, this.f10737d);
        }
        if (this.f10738e != null) {
            a += aeu.m13934b(5, this.f10738e.intValue());
        }
        return this.f10739f != null ? a + aeu.m13937b(6, this.f10739f) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ afc mo13937a(aes aes) throws IOException {
        while (true) {
            int a = aes.mo14217a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                if (this.f10734a == null) {
                    this.f10734a = new afm();
                }
                aes.mo14219a((afc) this.f10734a);
            } else if (a == 18) {
                int a2 = aff.m13985a(aes, 18);
                int length = this.f10735b == null ? 0 : this.f10735b.length;
                afi[] afiArr = new afi[(a2 + length)];
                if (length != 0) {
                    System.arraycopy(this.f10735b, 0, afiArr, 0, length);
                }
                while (length < afiArr.length - 1) {
                    afiArr[length] = new afi();
                    aes.mo14219a((afc) afiArr[length]);
                    aes.mo14217a();
                    length++;
                }
                afiArr[length] = new afi();
                aes.mo14219a((afc) afiArr[length]);
                this.f10735b = afiArr;
            } else if (a == 26) {
                this.f10736c = aes.mo14230f();
            } else if (a == 34) {
                this.f10737d = aes.mo14230f();
            } else if (a == 40) {
                this.f10738e = Integer.valueOf(aes.mo14224c());
            } else if (a == 50) {
                this.f10739f = aes.mo14230f();
            } else if (!super.mo14246a(aes, a)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo13938a(aeu aeu) throws IOException {
        if (this.f10734a != null) {
            aeu.mo14238a(1, (afc) this.f10734a);
        }
        if (this.f10735b != null && this.f10735b.length > 0) {
            for (afi afi : this.f10735b) {
                if (afi != null) {
                    aeu.mo14238a(2, (afc) afi);
                }
            }
        }
        if (this.f10736c != null) {
            aeu.mo14241a(3, this.f10736c);
        }
        if (this.f10737d != null) {
            aeu.mo14241a(4, this.f10737d);
        }
        if (this.f10738e != null) {
            aeu.mo14236a(5, this.f10738e.intValue());
        }
        if (this.f10739f != null) {
            aeu.mo14241a(6, this.f10739f);
        }
        super.mo13938a(aeu);
    }
}
