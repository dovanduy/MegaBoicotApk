package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class afj extends aew<afj> {

    /* renamed from: a */
    public afi[] f10726a;

    /* renamed from: b */
    private afk f10727b;

    /* renamed from: c */
    private byte[] f10728c;

    /* renamed from: d */
    private byte[] f10729d;

    /* renamed from: e */
    private Integer f10730e;

    public afj() {
        this.f10727b = null;
        this.f10726a = afi.m13993b();
        this.f10728c = null;
        this.f10729d = null;
        this.f10730e = null;
        this.f10676Y = null;
        this.f10689Z = -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo13936a() {
        int a = super.mo13936a();
        if (this.f10727b != null) {
            a += aeu.m13935b(1, (afc) this.f10727b);
        }
        if (this.f10726a != null && this.f10726a.length > 0) {
            for (afi afi : this.f10726a) {
                if (afi != null) {
                    a += aeu.m13935b(2, (afc) afi);
                }
            }
        }
        if (this.f10728c != null) {
            a += aeu.m13937b(3, this.f10728c);
        }
        if (this.f10729d != null) {
            a += aeu.m13937b(4, this.f10729d);
        }
        return this.f10730e != null ? a + aeu.m13934b(5, this.f10730e.intValue()) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ afc mo13937a(aes aes) throws IOException {
        while (true) {
            int a = aes.mo14217a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                if (this.f10727b == null) {
                    this.f10727b = new afk();
                }
                aes.mo14219a((afc) this.f10727b);
            } else if (a == 18) {
                int a2 = aff.m13985a(aes, 18);
                int length = this.f10726a == null ? 0 : this.f10726a.length;
                afi[] afiArr = new afi[(a2 + length)];
                if (length != 0) {
                    System.arraycopy(this.f10726a, 0, afiArr, 0, length);
                }
                while (length < afiArr.length - 1) {
                    afiArr[length] = new afi();
                    aes.mo14219a((afc) afiArr[length]);
                    aes.mo14217a();
                    length++;
                }
                afiArr[length] = new afi();
                aes.mo14219a((afc) afiArr[length]);
                this.f10726a = afiArr;
            } else if (a == 26) {
                this.f10728c = aes.mo14230f();
            } else if (a == 34) {
                this.f10729d = aes.mo14230f();
            } else if (a == 40) {
                this.f10730e = Integer.valueOf(aes.mo14224c());
            } else if (!super.mo14246a(aes, a)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo13938a(aeu aeu) throws IOException {
        if (this.f10727b != null) {
            aeu.mo14238a(1, (afc) this.f10727b);
        }
        if (this.f10726a != null && this.f10726a.length > 0) {
            for (afi afi : this.f10726a) {
                if (afi != null) {
                    aeu.mo14238a(2, (afc) afi);
                }
            }
        }
        if (this.f10728c != null) {
            aeu.mo14241a(3, this.f10728c);
        }
        if (this.f10729d != null) {
            aeu.mo14241a(4, this.f10729d);
        }
        if (this.f10730e != null) {
            aeu.mo14236a(5, this.f10730e.intValue());
        }
        super.mo13938a(aeu);
    }
}
