package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class afk extends aew<afk> {

    /* renamed from: a */
    private byte[] f10731a;

    /* renamed from: b */
    private byte[] f10732b;

    /* renamed from: c */
    private byte[] f10733c;

    public afk() {
        this.f10731a = null;
        this.f10732b = null;
        this.f10733c = null;
        this.f10676Y = null;
        this.f10689Z = -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo13936a() {
        int a = super.mo13936a();
        if (this.f10731a != null) {
            a += aeu.m13937b(1, this.f10731a);
        }
        if (this.f10732b != null) {
            a += aeu.m13937b(2, this.f10732b);
        }
        return this.f10733c != null ? a + aeu.m13937b(3, this.f10733c) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ afc mo13937a(aes aes) throws IOException {
        while (true) {
            int a = aes.mo14217a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f10731a = aes.mo14230f();
            } else if (a == 18) {
                this.f10732b = aes.mo14230f();
            } else if (a == 26) {
                this.f10733c = aes.mo14230f();
            } else if (!super.mo14246a(aes, a)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo13938a(aeu aeu) throws IOException {
        if (this.f10731a != null) {
            aeu.mo14241a(1, this.f10731a);
        }
        if (this.f10732b != null) {
            aeu.mo14241a(2, this.f10732b);
        }
        if (this.f10733c != null) {
            aeu.mo14241a(3, this.f10733c);
        }
        super.mo13938a(aeu);
    }
}
