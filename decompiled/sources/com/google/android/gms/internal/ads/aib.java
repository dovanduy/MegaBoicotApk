package com.google.android.gms.internal.ads;

import android.provider.Settings.SettingNotFoundException;
import java.lang.reflect.InvocationTargetException;

public final class aib extends aiy {
    public aib(ahn ahn, String str, String str2, C4378zo zoVar, int i, int i2) {
        super(ahn, str, str2, zoVar, i, 49);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14345a() throws IllegalAccessException, InvocationTargetException {
        this.f11165b.f14291F = Integer.valueOf(2);
        try {
            boolean booleanValue = ((Boolean) this.f11166c.invoke(null, new Object[]{this.f11164a.mo14301a()})).booleanValue();
            this.f11165b.f14291F = Integer.valueOf(booleanValue ? 1 : 0);
        } catch (InvocationTargetException e) {
            if (!(e.getTargetException() instanceof SettingNotFoundException)) {
                throw e;
            }
        }
    }
}
