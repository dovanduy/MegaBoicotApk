package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

public final class aie extends aiy {
    public aie(ahn ahn, String str, String str2, C4378zo zoVar, int i, int i2) {
        super(ahn, str, str2, zoVar, i, 5);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14345a() throws IllegalAccessException, InvocationTargetException {
        this.f11165b.f14332d = Long.valueOf(-1);
        this.f11165b.f14333e = Long.valueOf(-1);
        int[] iArr = (int[]) this.f11166c.invoke(null, new Object[]{this.f11164a.mo14301a()});
        synchronized (this.f11165b) {
            this.f11165b.f14332d = Long.valueOf((long) iArr[0]);
            this.f11165b.f14333e = Long.valueOf((long) iArr[1]);
            if (iArr[2] != Integer.MIN_VALUE) {
                this.f11165b.f14299N = Long.valueOf((long) iArr[2]);
            }
        }
    }
}
