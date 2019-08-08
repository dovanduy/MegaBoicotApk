package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public final class ain extends aiy {

    /* renamed from: d */
    private List<Long> f11145d = null;

    public ain(ahn ahn, String str, String str2, C4378zo zoVar, int i, int i2) {
        super(ahn, str, str2, zoVar, i, 31);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14345a() throws IllegalAccessException, InvocationTargetException {
        this.f11165b.f14344p = Long.valueOf(-1);
        this.f11165b.f14345q = Long.valueOf(-1);
        if (this.f11145d == null) {
            this.f11145d = (List) this.f11166c.invoke(null, new Object[]{this.f11164a.mo14301a()});
        }
        if (this.f11145d != null && this.f11145d.size() == 2) {
            synchronized (this.f11165b) {
                this.f11165b.f14344p = Long.valueOf(((Long) this.f11145d.get(0)).longValue());
                this.f11165b.f14345q = Long.valueOf(((Long) this.f11145d.get(1)).longValue());
            }
        }
    }
}
