package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

public final class aig extends aiy {

    /* renamed from: d */
    private long f11137d;

    public aig(ahn ahn, String str, String str2, C4378zo zoVar, long j, int i, int i2) {
        super(ahn, str, str2, zoVar, i, 25);
        this.f11137d = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14345a() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.f11166c.invoke(null, new Object[0])).longValue();
        synchronized (this.f11165b) {
            this.f11165b.f14308W = Long.valueOf(longValue);
            if (this.f11137d != 0) {
                this.f11165b.f14338j = Long.valueOf(longValue - this.f11137d);
                this.f11165b.f14341m = Long.valueOf(this.f11137d);
            }
        }
    }
}
