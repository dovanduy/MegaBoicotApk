package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

public final class ail extends aiy {

    /* renamed from: d */
    private static volatile String f11143d;

    /* renamed from: e */
    private static final Object f11144e = new Object();

    public ail(ahn ahn, String str, String str2, C4378zo zoVar, int i, int i2) {
        super(ahn, str, str2, zoVar, i, 1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14345a() throws IllegalAccessException, InvocationTargetException {
        this.f11165b.f14310a = "E";
        if (f11143d == null) {
            synchronized (f11144e) {
                if (f11143d == null) {
                    f11143d = (String) this.f11166c.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f11165b) {
            this.f11165b.f14310a = f11143d;
        }
    }
}
