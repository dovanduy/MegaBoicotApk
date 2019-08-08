package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

public final class aic extends aiy {

    /* renamed from: d */
    private static volatile String f11130d;

    /* renamed from: e */
    private static final Object f11131e = new Object();

    public aic(ahn ahn, String str, String str2, C4378zo zoVar, int i, int i2) {
        super(ahn, str, str2, zoVar, i, 29);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14345a() throws IllegalAccessException, InvocationTargetException {
        this.f11165b.f14343o = "E";
        if (f11130d == null) {
            synchronized (f11131e) {
                if (f11130d == null) {
                    f11130d = (String) this.f11166c.invoke(null, new Object[]{this.f11164a.mo14301a()});
                }
            }
        }
        synchronized (this.f11165b) {
            this.f11165b.f14343o = afv.m14033a(f11130d.getBytes(), true);
        }
    }
}
