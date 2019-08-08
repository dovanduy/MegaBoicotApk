package com.google.android.gms.internal.p148e;

import android.os.Binder;

/* renamed from: com.google.android.gms.internal.e.am */
public final /* synthetic */ class C4445am {
    /* renamed from: a */
    public static <V> V m18893a(C4446an<V> anVar) {
        long clearCallingIdentity;
        try {
            return anVar.mo16343a();
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            V a = anVar.mo16343a();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return a;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }
}
