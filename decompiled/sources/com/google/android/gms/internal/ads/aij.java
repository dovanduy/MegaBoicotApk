package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

public final class aij extends aiy {

    /* renamed from: d */
    private static volatile Long f11140d;

    /* renamed from: e */
    private static final Object f11141e = new Object();

    public aij(ahn ahn, String str, String str2, C4378zo zoVar, int i, int i2) {
        super(ahn, str, str2, zoVar, i, 22);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14345a() throws IllegalAccessException, InvocationTargetException {
        if (f11140d == null) {
            synchronized (f11141e) {
                if (f11140d == null) {
                    f11140d = (Long) this.f11166c.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f11165b) {
            this.f11165b.f14340l = f11140d;
        }
    }
}
