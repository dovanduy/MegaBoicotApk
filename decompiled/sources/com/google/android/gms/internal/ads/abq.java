package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class abq extends aew<abq> {

    /* renamed from: a */
    public Long f10456a;

    /* renamed from: b */
    public Long f10457b;

    /* renamed from: c */
    public Long f10458c;

    /* renamed from: d */
    private Long f10459d;

    /* renamed from: e */
    private Long f10460e;

    public abq() {
        this.f10459d = null;
        this.f10460e = null;
        this.f10456a = null;
        this.f10457b = null;
        this.f10458c = null;
        this.f10689Z = -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo13936a() {
        int a = super.mo13936a();
        if (this.f10459d != null) {
            a += aeu.m13942d(1, this.f10459d.longValue());
        }
        if (this.f10460e != null) {
            a += aeu.m13942d(2, this.f10460e.longValue());
        }
        if (this.f10456a != null) {
            a += aeu.m13942d(3, this.f10456a.longValue());
        }
        if (this.f10457b != null) {
            a += aeu.m13942d(4, this.f10457b.longValue());
        }
        return this.f10458c != null ? a + aeu.m13942d(5, this.f10458c.longValue()) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ afc mo13937a(aes aes) throws IOException {
        while (true) {
            int a = aes.mo14217a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f10459d = Long.valueOf(aes.mo14232h());
            } else if (a == 16) {
                this.f10460e = Long.valueOf(aes.mo14232h());
            } else if (a == 24) {
                this.f10456a = Long.valueOf(aes.mo14232h());
            } else if (a == 32) {
                this.f10457b = Long.valueOf(aes.mo14232h());
            } else if (a == 40) {
                this.f10458c = Long.valueOf(aes.mo14232h());
            } else if (!super.mo14246a(aes, a)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo13938a(aeu aeu) throws IOException {
        if (this.f10459d != null) {
            aeu.mo14242b(1, this.f10459d.longValue());
        }
        if (this.f10460e != null) {
            aeu.mo14242b(2, this.f10460e.longValue());
        }
        if (this.f10456a != null) {
            aeu.mo14242b(3, this.f10456a.longValue());
        }
        if (this.f10457b != null) {
            aeu.mo14242b(4, this.f10457b.longValue());
        }
        if (this.f10458c != null) {
            aeu.mo14242b(5, this.f10458c.longValue());
        }
        super.mo13938a(aeu);
    }
}
