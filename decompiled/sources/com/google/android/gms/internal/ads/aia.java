package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import java.lang.reflect.InvocationTargetException;

public final class aia extends aiy {

    /* renamed from: d */
    private final Activity f11128d;

    /* renamed from: e */
    private final View f11129e;

    public aia(ahn ahn, String str, String str2, C4378zo zoVar, int i, int i2, View view, Activity activity) {
        super(ahn, str, str2, zoVar, i, 62);
        this.f11129e = view;
        this.f11128d = activity;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14345a() throws IllegalAccessException, InvocationTargetException {
        if (this.f11129e != null) {
            boolean booleanValue = ((Boolean) aoq.m14620f().mo14695a(aru.f11834bF)).booleanValue();
            Object[] objArr = (Object[]) this.f11166c.invoke(null, new Object[]{this.f11129e, this.f11128d, Boolean.valueOf(booleanValue)});
            synchronized (this.f11165b) {
                this.f11165b.f14302Q = Long.valueOf(((Long) objArr[0]).longValue());
                this.f11165b.f14303R = Long.valueOf(((Long) objArr[1]).longValue());
                if (booleanValue) {
                    this.f11165b.f14304S = (String) objArr[2];
                }
            }
        }
    }
}
