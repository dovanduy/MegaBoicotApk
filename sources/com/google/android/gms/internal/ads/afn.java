package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class afn extends aew<afn> {

    /* renamed from: a */
    public Integer f10743a;

    /* renamed from: b */
    public String f10744b;

    /* renamed from: c */
    public byte[] f10745c;

    public afn() {
        this.f10743a = null;
        this.f10744b = null;
        this.f10745c = null;
        this.f10676Y = null;
        this.f10689Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final afn mo13937a(aes aes) throws IOException {
        int c;
        while (true) {
            int a = aes.mo14217a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                try {
                    c = aes.mo14224c();
                    if (c < 0 || c > 1) {
                        StringBuilder sb = new StringBuilder(36);
                        sb.append(c);
                        sb.append(" is not a valid enum Type");
                    } else {
                        this.f10743a = Integer.valueOf(c);
                    }
                } catch (IllegalArgumentException unused) {
                    aes.mo14229e(aes.mo14234j());
                    mo14246a(aes, a);
                }
            } else if (a == 18) {
                this.f10744b = aes.mo14228e();
            } else if (a == 26) {
                this.f10745c = aes.mo14230f();
            } else if (!super.mo14246a(aes, a)) {
                return this;
            }
        }
        StringBuilder sb2 = new StringBuilder(36);
        sb2.append(c);
        sb2.append(" is not a valid enum Type");
        throw new IllegalArgumentException(sb2.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo13936a() {
        int a = super.mo13936a();
        if (this.f10743a != null) {
            a += aeu.m13934b(1, this.f10743a.intValue());
        }
        if (this.f10744b != null) {
            a += aeu.m13936b(2, this.f10744b);
        }
        return this.f10745c != null ? a + aeu.m13937b(3, this.f10745c) : a;
    }

    /* renamed from: a */
    public final void mo13938a(aeu aeu) throws IOException {
        if (this.f10743a != null) {
            aeu.mo14236a(1, this.f10743a.intValue());
        }
        if (this.f10744b != null) {
            aeu.mo14239a(2, this.f10744b);
        }
        if (this.f10745c != null) {
            aeu.mo14241a(3, this.f10745c);
        }
        super.mo13938a(aeu);
    }
}
