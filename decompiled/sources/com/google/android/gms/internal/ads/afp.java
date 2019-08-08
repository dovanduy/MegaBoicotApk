package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class afp extends aew<afp> {

    /* renamed from: a */
    public String f10756a;

    /* renamed from: b */
    public Long f10757b;

    /* renamed from: c */
    public Boolean f10758c;

    public afp() {
        this.f10756a = null;
        this.f10757b = null;
        this.f10758c = null;
        this.f10676Y = null;
        this.f10689Z = -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo13936a() {
        int a = super.mo13936a();
        if (this.f10756a != null) {
            a += aeu.m13936b(1, this.f10756a);
        }
        if (this.f10757b != null) {
            a += aeu.m13942d(2, this.f10757b.longValue());
        }
        if (this.f10758c == null) {
            return a;
        }
        this.f10758c.booleanValue();
        return a + aeu.m13933b(3) + 1;
    }

    /* renamed from: a */
    public final /* synthetic */ afc mo13937a(aes aes) throws IOException {
        while (true) {
            int a = aes.mo14217a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f10756a = aes.mo14228e();
            } else if (a == 16) {
                this.f10757b = Long.valueOf(aes.mo14221b());
            } else if (a == 24) {
                this.f10758c = Boolean.valueOf(aes.mo14227d());
            } else if (!super.mo14246a(aes, a)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo13938a(aeu aeu) throws IOException {
        if (this.f10756a != null) {
            aeu.mo14239a(1, this.f10756a);
        }
        if (this.f10757b != null) {
            aeu.mo14242b(2, this.f10757b.longValue());
        }
        if (this.f10758c != null) {
            aeu.mo14240a(3, this.f10758c.booleanValue());
        }
        super.mo13938a(aeu);
    }
}
