package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions.C3196a;
import com.google.android.gms.common.C3415h;
import com.google.android.gms.common.api.C3266f.C3268b;
import com.google.android.gms.common.api.C3266f.C3269c;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C3482e;
import com.google.android.gms.common.internal.C3487h;

/* renamed from: com.google.android.gms.auth.api.signin.internal.h */
public final class C3216h extends C3487h<C3226r> {

    /* renamed from: e */
    private final GoogleSignInOptions f9420e;

    public C3216h(Context context, Looper looper, C3482e eVar, GoogleSignInOptions googleSignInOptions, C3268b bVar, C3269c cVar) {
        super(context, looper, 91, eVar, bVar, cVar);
        if (googleSignInOptions == null) {
            googleSignInOptions = new C3196a().mo12976c();
        }
        if (!eVar.mo13576e().isEmpty()) {
            C3196a aVar = new C3196a(googleSignInOptions);
            for (Scope a : eVar.mo13576e()) {
                aVar.mo12974a(a, new Scope[0]);
            }
            googleSignInOptions = aVar.mo12976c();
        }
        this.f9420e = googleSignInOptions;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo13015b() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    /* renamed from: c */
    public final boolean mo13016c() {
        return true;
    }

    /* renamed from: f */
    public final int mo13019f() {
        return C3415h.f9877b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n_ */
    public final String mo13020n_() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    /* renamed from: d */
    public final Intent mo13017d() {
        return C3217i.m11547a(mo13552r(), this.f9420e);
    }

    /* renamed from: e */
    public final GoogleSignInOptions mo13018e() {
        return this.f9420e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ IInterface mo13014a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        if (queryLocalInterface instanceof C3226r) {
            return (C3226r) queryLocalInterface;
        }
        return new C3227s(iBinder);
    }
}
