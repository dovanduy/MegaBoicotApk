package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class afi extends aew<afi> {

    /* renamed from: c */
    private static volatile afi[] f10723c;

    /* renamed from: a */
    public byte[] f10724a;

    /* renamed from: b */
    public byte[] f10725b;

    public afi() {
        this.f10724a = null;
        this.f10725b = null;
        this.f10676Y = null;
        this.f10689Z = -1;
    }

    /* renamed from: b */
    public static afi[] m13993b() {
        if (f10723c == null) {
            synchronized (afa.f10687b) {
                if (f10723c == null) {
                    f10723c = new afi[0];
                }
            }
        }
        return f10723c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo13936a() {
        int a = super.mo13936a() + aeu.m13937b(1, this.f10724a);
        return this.f10725b != null ? a + aeu.m13937b(2, this.f10725b) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ afc mo13937a(aes aes) throws IOException {
        while (true) {
            int a = aes.mo14217a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f10724a = aes.mo14230f();
            } else if (a == 18) {
                this.f10725b = aes.mo14230f();
            } else if (!super.mo14246a(aes, a)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo13938a(aeu aeu) throws IOException {
        aeu.mo14241a(1, this.f10724a);
        if (this.f10725b != null) {
            aeu.mo14241a(2, this.f10725b);
        }
        super.mo13938a(aeu);
    }
}
