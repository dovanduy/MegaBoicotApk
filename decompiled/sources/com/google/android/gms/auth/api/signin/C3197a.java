package com.google.android.gms.auth.api.signin;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.auth.api.signin.internal.C3217i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C3466b;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.p143d.C3583g;
import com.google.android.gms.p143d.C3587j;

/* renamed from: com.google.android.gms.auth.api.signin.a */
public final class C3197a {
    /* renamed from: a */
    public static C3199c m11497a(Activity activity, GoogleSignInOptions googleSignInOptions) {
        return new C3199c(activity, (GoogleSignInOptions) C3513t.m12625a(googleSignInOptions));
    }

    /* renamed from: a */
    public static C3583g<GoogleSignInAccount> m11498a(Intent intent) {
        C3202d a = C3217i.m11548a(intent);
        if (a == null) {
            return C3587j.m12816a((Exception) C3466b.m12392a(Status.f9457c));
        }
        if (!a.mo12984b().mo13080d() || a.mo12983a() == null) {
            return C3587j.m12816a((Exception) C3466b.m12392a(a.mo12984b()));
        }
        return C3587j.m12817a(a.mo12983a());
    }
}
