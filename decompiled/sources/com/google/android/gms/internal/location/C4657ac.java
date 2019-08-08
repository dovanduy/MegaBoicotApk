package com.google.android.gms.internal.location;

import android.os.Looper;
import com.google.android.gms.common.internal.C3513t;

/* renamed from: com.google.android.gms.internal.location.ac */
public final class C4657ac {
    /* renamed from: a */
    public static Looper m20185a() {
        C3513t.m12632a(Looper.myLooper() != null, (Object) "Can't create handler inside thread that has not called Looper.prepare()");
        return Looper.myLooper();
    }
}
