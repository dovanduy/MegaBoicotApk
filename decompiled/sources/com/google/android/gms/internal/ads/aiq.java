package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

public final class aiq extends aiy {

    /* renamed from: d */
    private final StackTraceElement[] f11149d;

    public aiq(ahn ahn, String str, String str2, C4378zo zoVar, int i, int i2, StackTraceElement[] stackTraceElementArr) {
        super(ahn, str, str2, zoVar, i, 45);
        this.f11149d = stackTraceElementArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14345a() throws IllegalAccessException, InvocationTargetException {
        if (this.f11149d != null) {
            ahl ahl = new ahl((String) this.f11166c.invoke(null, new Object[]{this.f11149d}));
            synchronized (this.f11165b) {
                this.f11165b.f14287B = ahl.f11051a;
                if (ahl.f11052b.booleanValue()) {
                    this.f11165b.f14295J = Integer.valueOf(ahl.f11053c.booleanValue() ^ true ? 1 : 0);
                }
            }
        }
    }
}
