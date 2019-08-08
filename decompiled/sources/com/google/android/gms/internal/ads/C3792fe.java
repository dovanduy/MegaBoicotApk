package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.fe */
public final class C3792fe {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public WeakHashMap<Context, C3794fg> f13102a = new WeakHashMap<>();

    /* renamed from: a */
    public final Future<C3790fc> mo15288a(Context context) {
        return C3907jl.m17119a((Callable<T>) new C3793ff<T>(this, context));
    }
}
