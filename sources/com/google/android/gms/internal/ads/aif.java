package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

public final class aif extends aiy {

    /* renamed from: d */
    private static volatile Long f11135d;

    /* renamed from: e */
    private static final Object f11136e = new Object();

    public aif(ahn ahn, String str, String str2, C4378zo zoVar, int i, int i2) {
        super(ahn, str, str2, zoVar, i, 44);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14345a() throws IllegalAccessException, InvocationTargetException {
        if (f11135d == null) {
            synchronized (f11136e) {
                if (f11135d == null) {
                    f11135d = (Long) this.f11166c.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f11165b) {
            this.f11165b.f14286A = f11135d;
        }
    }
}
