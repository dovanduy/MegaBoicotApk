package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.xl */
public final class C4318xl extends aew<C4318xl> {

    /* renamed from: a */
    public String f14195a;

    /* renamed from: b */
    private String f14196b;

    /* renamed from: c */
    private String f14197c;

    /* renamed from: d */
    private String f14198d;

    /* renamed from: e */
    private String f14199e;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo13936a() {
        int a = super.mo13936a();
        if (this.f14195a != null) {
            a += aeu.m13936b(1, this.f14195a);
        }
        if (this.f14196b != null) {
            a += aeu.m13936b(2, this.f14196b);
        }
        if (this.f14197c != null) {
            a += aeu.m13936b(3, this.f14197c);
        }
        if (this.f14198d != null) {
            a += aeu.m13936b(4, this.f14198d);
        }
        return this.f14199e != null ? a + aeu.m13936b(5, this.f14199e) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ afc mo13937a(aes aes) throws IOException {
        while (true) {
            int a = aes.mo14217a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f14195a = aes.mo14228e();
            } else if (a == 18) {
                this.f14196b = aes.mo14228e();
            } else if (a == 26) {
                this.f14197c = aes.mo14228e();
            } else if (a == 34) {
                this.f14198d = aes.mo14228e();
            } else if (a == 42) {
                this.f14199e = aes.mo14228e();
            } else if (!super.mo14246a(aes, a)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo13938a(aeu aeu) throws IOException {
        if (this.f14195a != null) {
            aeu.mo14239a(1, this.f14195a);
        }
        if (this.f14196b != null) {
            aeu.mo14239a(2, this.f14196b);
        }
        if (this.f14197c != null) {
            aeu.mo14239a(3, this.f14197c);
        }
        if (this.f14198d != null) {
            aeu.mo14239a(4, this.f14198d);
        }
        if (this.f14199e != null) {
            aeu.mo14239a(5, this.f14199e);
        }
        super.mo13938a(aeu);
    }
}
