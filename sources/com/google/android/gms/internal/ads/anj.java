package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class anj extends aew<anj> {

    /* renamed from: a */
    private static volatile anj[] f11523a;

    /* renamed from: b */
    private String f11524b;

    /* renamed from: c */
    private Integer f11525c;

    /* renamed from: d */
    private ank f11526d;

    public anj() {
        this.f11524b = null;
        this.f11525c = null;
        this.f11526d = null;
        this.f10676Y = null;
        this.f10689Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final anj mo13937a(aes aes) throws IOException {
        while (true) {
            int a = aes.mo14217a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f11524b = aes.mo14228e();
            } else if (a == 16) {
                int j = aes.mo14234j();
                try {
                    this.f11525c = Integer.valueOf(ams.m14452a(aes.mo14231g()));
                } catch (IllegalArgumentException unused) {
                    aes.mo14229e(j);
                    mo14246a(aes, a);
                }
            } else if (a == 26) {
                if (this.f11526d == null) {
                    this.f11526d = new ank();
                }
                aes.mo14219a((afc) this.f11526d);
            } else if (!super.mo14246a(aes, a)) {
                return this;
            }
        }
    }

    /* renamed from: b */
    public static anj[] m14517b() {
        if (f11523a == null) {
            synchronized (afa.f10687b) {
                if (f11523a == null) {
                    f11523a = new anj[0];
                }
            }
        }
        return f11523a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo13936a() {
        int a = super.mo13936a();
        if (this.f11524b != null) {
            a += aeu.m13936b(1, this.f11524b);
        }
        if (this.f11525c != null) {
            a += aeu.m13934b(2, this.f11525c.intValue());
        }
        return this.f11526d != null ? a + aeu.m13935b(3, (afc) this.f11526d) : a;
    }

    /* renamed from: a */
    public final void mo13938a(aeu aeu) throws IOException {
        if (this.f11524b != null) {
            aeu.mo14239a(1, this.f11524b);
        }
        if (this.f11525c != null) {
            aeu.mo14236a(2, this.f11525c.intValue());
        }
        if (this.f11526d != null) {
            aeu.mo14238a(3, (afc) this.f11526d);
        }
        super.mo13938a(aeu);
    }
}
