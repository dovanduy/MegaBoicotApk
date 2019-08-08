package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

public final class aiu extends aiy {
    public aiu(ahn ahn, String str, String str2, C4378zo zoVar, int i, int i2) {
        super(ahn, str, str2, zoVar, i, 48);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14345a() throws IllegalAccessException, InvocationTargetException {
        C4378zo zoVar;
        Integer valueOf;
        this.f11165b.f14290E = Integer.valueOf(2);
        boolean booleanValue = ((Boolean) this.f11166c.invoke(null, new Object[]{this.f11164a.mo14301a()})).booleanValue();
        synchronized (this.f11165b) {
            if (booleanValue) {
                try {
                    zoVar = this.f11165b;
                    valueOf = Integer.valueOf(1);
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                zoVar = this.f11165b;
                valueOf = Integer.valueOf(0);
            }
            zoVar.f14290E = valueOf;
        }
    }
}
