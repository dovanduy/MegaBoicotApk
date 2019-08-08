package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.C3172a;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.C3414g;
import com.google.android.gms.common.api.C3266f;
import com.google.android.gms.common.api.C3266f.C3267a;

/* renamed from: com.google.android.gms.auth.api.signin.internal.t */
public final class C3228t extends C3223o {

    /* renamed from: a */
    private final Context f9427a;

    public C3228t(Context context) {
        this.f9427a = context;
    }

    /* renamed from: a */
    public final void mo13025a() {
        m11569c();
        C3210b a = C3210b.m11519a(this.f9427a);
        GoogleSignInAccount a2 = a.mo13001a();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.f9362f;
        if (a2 != null) {
            googleSignInOptions = a.mo13003b();
        }
        C3266f b = new C3267a(this.f9427a).mo13148a(C3172a.f9241e, googleSignInOptions).mo13152b();
        try {
            if (b.mo13141f().mo13042b()) {
                if (a2 != null) {
                    C3172a.f9244h.mo12980a(b);
                } else {
                    b.mo13144i();
                }
            }
        } finally {
            b.mo13142g();
        }
    }

    /* renamed from: b */
    public final void mo13026b() {
        m11569c();
        C3221m.m11556a(this.f9427a).mo13023a();
    }

    /* renamed from: c */
    private final void m11569c() {
        if (!C3414g.m12284c(this.f9427a, Binder.getCallingUid())) {
            int callingUid = Binder.getCallingUid();
            StringBuilder sb = new StringBuilder(52);
            sb.append("Calling UID ");
            sb.append(callingUid);
            sb.append(" is not Google Play services.");
            throw new SecurityException(sb.toString());
        }
    }
}
