package com.google.android.gms.internal.auth-api;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.C3172a.C3173a;
import com.google.android.gms.common.api.C3266f.C3268b;
import com.google.android.gms.common.api.C3266f.C3269c;
import com.google.android.gms.common.internal.C3482e;
import com.google.android.gms.common.internal.C3487h;

/* renamed from: com.google.android.gms.internal.auth-api.f */
public final class C4395f extends C3487h<C4397h> {

    /* renamed from: e */
    private final C3173a f14587e;

    public C4395f(Context context, Looper looper, C3482e eVar, C3173a aVar, C3268b bVar, C3269c cVar) {
        super(context, looper, 68, eVar, bVar, cVar);
        this.f14587e = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo13015b() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    /* renamed from: f */
    public final int mo13019f() {
        return 12800000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n_ */
    public final String mo13020n_() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final Bundle mo13555u() {
        return this.f14587e == null ? new Bundle() : this.f14587e.mo12870a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ IInterface mo13014a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        if (queryLocalInterface instanceof C4397h) {
            return (C4397h) queryLocalInterface;
        }
        return new C4398i(iBinder);
    }
}
