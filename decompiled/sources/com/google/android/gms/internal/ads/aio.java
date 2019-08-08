package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

public final class aio extends aiy {

    /* renamed from: d */
    private final boolean f11146d;

    public aio(ahn ahn, String str, String str2, C4378zo zoVar, int i, int i2) {
        super(ahn, str, str2, zoVar, i, 61);
        this.f11146d = ahn.mo14314j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14345a() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.f11166c.invoke(null, new Object[]{this.f11164a.mo14301a(), Boolean.valueOf(this.f11146d)})).longValue();
        synchronized (this.f11165b) {
            this.f11165b.f14301P = Long.valueOf(longValue);
        }
    }
}
