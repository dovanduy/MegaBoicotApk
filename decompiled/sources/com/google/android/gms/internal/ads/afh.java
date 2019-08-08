package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class afh extends aew<afh> {

    /* renamed from: a */
    public String f10722a;

    public afh() {
        this.f10722a = null;
        this.f10676Y = null;
        this.f10689Z = -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo13936a() {
        int a = super.mo13936a();
        return this.f10722a != null ? a + aeu.m13936b(1, this.f10722a) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ afc mo13937a(aes aes) throws IOException {
        while (true) {
            int a = aes.mo14217a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f10722a = aes.mo14228e();
            } else if (!super.mo14246a(aes, a)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo13938a(aeu aeu) throws IOException {
        if (this.f10722a != null) {
            aeu.mo14239a(1, this.f10722a);
        }
        super.mo13938a(aeu);
    }
}
