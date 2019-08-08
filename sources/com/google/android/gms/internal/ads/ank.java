package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class ank extends aew<ank> {

    /* renamed from: a */
    private static volatile ank[] f11527a;

    /* renamed from: b */
    private Integer f11528b;

    /* renamed from: c */
    private Integer f11529c;

    public ank() {
        this.f11528b = null;
        this.f11529c = null;
        this.f10676Y = null;
        this.f10689Z = -1;
    }

    /* renamed from: b */
    public static ank[] m14521b() {
        if (f11527a == null) {
            synchronized (afa.f10687b) {
                if (f11527a == null) {
                    f11527a = new ank[0];
                }
            }
        }
        return f11527a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo13936a() {
        int a = super.mo13936a();
        if (this.f11528b != null) {
            a += aeu.m13934b(1, this.f11528b.intValue());
        }
        return this.f11529c != null ? a + aeu.m13934b(2, this.f11529c.intValue()) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ afc mo13937a(aes aes) throws IOException {
        while (true) {
            int a = aes.mo14217a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f11528b = Integer.valueOf(aes.mo14231g());
            } else if (a == 16) {
                this.f11529c = Integer.valueOf(aes.mo14231g());
            } else if (!super.mo14246a(aes, a)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo13938a(aeu aeu) throws IOException {
        if (this.f11528b != null) {
            aeu.mo14236a(1, this.f11528b.intValue());
        }
        if (this.f11529c != null) {
            aeu.mo14236a(2, this.f11529c.intValue());
        }
        super.mo13938a(aeu);
    }
}
