package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

public final class ait extends aiy {

    /* renamed from: d */
    private static volatile Long f11152d;

    /* renamed from: e */
    private static final Object f11153e = new Object();

    public ait(ahn ahn, String str, String str2, C4378zo zoVar, int i, int i2) {
        super(ahn, str, str2, zoVar, i, 33);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14345a() throws IllegalAccessException, InvocationTargetException {
        if (f11152d == null) {
            synchronized (f11153e) {
                if (f11152d == null) {
                    f11152d = (Long) this.f11166c.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f11165b) {
            this.f11165b.f14346r = f11152d;
        }
    }
}
