package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* renamed from: com.google.android.gms.auth.api.signin.internal.m */
public final class C3221m {

    /* renamed from: a */
    private static C3221m f9423a;

    /* renamed from: b */
    private C3210b f9424b;

    /* renamed from: c */
    private GoogleSignInAccount f9425c = this.f9424b.mo13001a();

    /* renamed from: d */
    private GoogleSignInOptions f9426d = this.f9424b.mo13003b();

    private C3221m(Context context) {
        this.f9424b = C3210b.m11519a(context);
    }

    /* renamed from: a */
    public static synchronized C3221m m11556a(Context context) {
        C3221m b;
        synchronized (C3221m.class) {
            b = m11557b(context.getApplicationContext());
        }
        return b;
    }

    /* renamed from: b */
    private static synchronized C3221m m11557b(Context context) {
        C3221m mVar;
        synchronized (C3221m.class) {
            if (f9423a == null) {
                f9423a = new C3221m(context);
            }
            mVar = f9423a;
        }
        return mVar;
    }

    /* renamed from: a */
    public final synchronized void mo13023a() {
        this.f9424b.mo13006e();
        this.f9425c = null;
        this.f9426d = null;
    }

    /* renamed from: a */
    public final synchronized void mo13024a(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.f9424b.mo13002a(googleSignInAccount, googleSignInOptions);
        this.f9425c = googleSignInAccount;
        this.f9426d = googleSignInOptions;
    }
}
