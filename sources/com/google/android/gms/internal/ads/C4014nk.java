package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.nk */
public final class C4014nk {

    /* renamed from: a */
    public static final Executor f13617a = new C4015nl();

    /* renamed from: b */
    public static final Executor f13618b = new C4016nm();

    /* renamed from: c */
    private static final C4013nj f13619c = m17475a(f13617a);

    /* renamed from: d */
    private static final C4013nj f13620d = m17475a(f13618b);

    /* renamed from: a */
    public static C4013nj m17475a(Executor executor) {
        return new C4017nn(executor, null);
    }
}
