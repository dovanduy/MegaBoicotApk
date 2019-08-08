package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.C3391k;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.auth.api.signin.d */
public class C3202d implements C3391k {

    /* renamed from: a */
    private Status f9393a;

    /* renamed from: b */
    private GoogleSignInAccount f9394b;

    public C3202d(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f9394b = googleSignInAccount;
        this.f9393a = status;
    }

    /* renamed from: a */
    public GoogleSignInAccount mo12983a() {
        return this.f9394b;
    }

    /* renamed from: b */
    public Status mo12984b() {
        return this.f9393a;
    }
}
