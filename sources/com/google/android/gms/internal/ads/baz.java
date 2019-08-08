package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3718cm
public final class baz {

    /* renamed from: a */
    private static final C3941ks<aze> f12523a = new bba();

    /* renamed from: b */
    private static final C3941ks<aze> f12524b = new bbb();

    /* renamed from: c */
    private final azq f12525c;

    public baz(Context context, zzang zzang, String str) {
        azq azq = new azq(context, zzang, str, f12523a, f12524b);
        this.f12525c = azq;
    }

    /* renamed from: a */
    public final <I, O> bar<I, O> mo15048a(String str, bau<I> bau, bat<O> bat) {
        return new bbc(this.f12525c, str, bau, bat);
    }
}
