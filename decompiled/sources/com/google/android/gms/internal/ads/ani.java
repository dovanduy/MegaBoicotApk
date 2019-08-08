package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class ani extends aew<ani> {

    /* renamed from: a */
    private Integer f11521a;

    /* renamed from: b */
    private Integer f11522b;

    public ani() {
        this.f11521a = null;
        this.f11522b = null;
        this.f10676Y = null;
        this.f10689Z = -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo13936a() {
        int a = super.mo13936a();
        if (this.f11521a != null) {
            a += aeu.m13934b(1, this.f11521a.intValue());
        }
        return this.f11522b != null ? a + aeu.m13934b(2, this.f11522b.intValue()) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ afc mo13937a(aes aes) throws IOException {
        while (true) {
            int a = aes.mo14217a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f11521a = Integer.valueOf(aes.mo14231g());
            } else if (a == 16) {
                this.f11522b = Integer.valueOf(aes.mo14231g());
            } else if (!super.mo14246a(aes, a)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo13938a(aeu aeu) throws IOException {
        if (this.f11521a != null) {
            aeu.mo14236a(1, this.f11521a.intValue());
        }
        if (this.f11522b != null) {
            aeu.mo14236a(2, this.f11522b.intValue());
        }
        super.mo13938a(aeu);
    }
}
