package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

public final class ais extends aiy {

    /* renamed from: d */
    private final ahx f11150d;

    /* renamed from: e */
    private long f11151e;

    public ais(ahn ahn, String str, String str2, C4378zo zoVar, int i, int i2, ahx ahx) {
        super(ahn, str, str2, zoVar, i, 53);
        this.f11150d = ahx;
        if (ahx != null) {
            this.f11151e = ahx.mo14326a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14345a() throws IllegalAccessException, InvocationTargetException {
        if (this.f11150d != null) {
            this.f11165b.f14294I = (Long) this.f11166c.invoke(null, new Object[]{Long.valueOf(this.f11151e)});
        }
    }
}
