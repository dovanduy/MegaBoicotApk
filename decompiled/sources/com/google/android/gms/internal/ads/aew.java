package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aew;
import java.io.IOException;

public abstract class aew<M extends aew<M>> extends afc {

    /* renamed from: Y */
    protected aey f10676Y;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo13936a() {
        if (this.f10676Y == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.f10676Y.mo14251a(); i2++) {
            i += this.f10676Y.mo14254b(i2).mo14258a();
        }
        return i;
    }

    /* renamed from: a */
    public void mo13938a(aeu aeu) throws IOException {
        if (this.f10676Y != null) {
            for (int i = 0; i < this.f10676Y.mo14251a(); i++) {
                this.f10676Y.mo14254b(i).mo14259a(aeu);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo14246a(aes aes, int i) throws IOException {
        int j = aes.mo14234j();
        if (!aes.mo14223b(i)) {
            return false;
        }
        int i2 = i >>> 3;
        afe afe = new afe(i, aes.mo14220a(j, aes.mo14234j() - j));
        aez aez = null;
        if (this.f10676Y == null) {
            this.f10676Y = new aey();
        } else {
            aez = this.f10676Y.mo14252a(i2);
        }
        if (aez == null) {
            aez = new aez();
            this.f10676Y.mo14253a(i2, aez);
        }
        aez.mo14260a(afe);
        return true;
    }

    /* renamed from: c */
    public final /* synthetic */ afc mo14247c() throws CloneNotSupportedException {
        return (aew) clone();
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        aew aew = (aew) super.clone();
        afa.m13970a(this, aew);
        return aew;
    }
}
