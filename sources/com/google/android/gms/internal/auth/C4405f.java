package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.auth.api.C3180b;
import com.google.android.gms.auth.api.C3181c;
import com.google.android.gms.common.C3415h;
import com.google.android.gms.common.api.C3266f.C3268b;
import com.google.android.gms.common.api.C3266f.C3269c;
import com.google.android.gms.common.internal.C3482e;
import com.google.android.gms.common.internal.C3487h;

/* renamed from: com.google.android.gms.internal.auth.f */
public final class C4405f extends C3487h<C4406g> {

    /* renamed from: e */
    private final Bundle f14592e;

    public C4405f(Context context, Looper looper, C3482e eVar, C3181c cVar, C3268b bVar, C3269c cVar2) {
        super(context, looper, 16, eVar, bVar, cVar2);
        if (cVar == null) {
            this.f14592e = new Bundle();
            return;
        }
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo13015b() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    /* renamed from: f */
    public final int mo13019f() {
        return C3415h.f9877b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n_ */
    public final String mo13020n_() {
        return "com.google.android.gms.auth.service.START";
    }

    /* renamed from: j */
    public final boolean mo13544j() {
        C3482e z = mo13589z();
        return !TextUtils.isEmpty(z.mo13570a()) && !z.mo13571a(C3180b.f9283a).isEmpty();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final Bundle mo13555u() {
        return this.f14592e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ IInterface mo13014a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        if (queryLocalInterface instanceof C4406g) {
            return (C4406g) queryLocalInterface;
        }
        return new C4407h(iBinder);
    }
}
