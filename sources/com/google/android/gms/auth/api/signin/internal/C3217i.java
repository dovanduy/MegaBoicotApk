package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.C3202d;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.C3266f;
import com.google.android.gms.common.api.C3270g;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C3360d;
import com.google.android.gms.common.p139a.C3243a;

/* renamed from: com.google.android.gms.auth.api.signin.internal.i */
public final class C3217i {

    /* renamed from: a */
    private static C3243a f9421a = new C3243a("GoogleSignInCommon", new String[0]);

    /* renamed from: a */
    public static Intent m11547a(Context context, GoogleSignInOptions googleSignInOptions) {
        f9421a.mo13066a("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    /* renamed from: b */
    public static Intent m11551b(Context context, GoogleSignInOptions googleSignInOptions) {
        f9421a.mo13066a("getFallbackSignInIntent()", new Object[0]);
        Intent a = m11547a(context, googleSignInOptions);
        a.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
        return a;
    }

    /* renamed from: c */
    public static Intent m11552c(Context context, GoogleSignInOptions googleSignInOptions) {
        f9421a.mo13066a("getNoImplementationSignInIntent()", new Object[0]);
        Intent a = m11547a(context, googleSignInOptions);
        a.setAction("com.google.android.gms.auth.NO_IMPL");
        return a;
    }

    /* renamed from: a */
    public static C3270g<Status> m11549a(C3266f fVar, Context context, boolean z) {
        f9421a.mo13066a("Revoking access", new Object[0]);
        String c = C3210b.m11519a(context).mo13004c();
        m11550a(context);
        if (z) {
            return C3213e.m11534a(c);
        }
        return fVar.mo13135b(new C3218j(fVar));
    }

    /* renamed from: a */
    private static void m11550a(Context context) {
        C3221m.m11556a(context).mo13023a();
        for (C3266f d : C3266f.m11650a()) {
            d.mo13139d();
        }
        C3360d.m12034b();
    }

    /* renamed from: a */
    public static C3202d m11548a(Intent intent) {
        if (intent == null || (!intent.hasExtra("googleSignInStatus") && !intent.hasExtra("googleSignInAccount"))) {
            return null;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
        Status status = (Status) intent.getParcelableExtra("googleSignInStatus");
        if (googleSignInAccount != null) {
            status = Status.f9455a;
        }
        return new C3202d(googleSignInAccount, status);
    }
}
