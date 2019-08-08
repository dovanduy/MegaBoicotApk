package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

public final class aim extends aiy {
    public aim(ahn ahn, String str, String str2, C4378zo zoVar, int i, int i2) {
        super(ahn, str, str2, zoVar, i, 3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14345a() throws IllegalAccessException, InvocationTargetException {
        synchronized (this.f11165b) {
            aha aha = new aha((String) this.f11166c.invoke(null, new Object[]{this.f11164a.mo14301a()}));
            synchronized (this.f11165b) {
                this.f11165b.f14331c = Long.valueOf(aha.f11037a);
                this.f11165b.f14300O = Long.valueOf(aha.f11038b);
            }
        }
    }
}
