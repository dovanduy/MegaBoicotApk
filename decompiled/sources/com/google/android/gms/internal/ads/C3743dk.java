package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.C3469d;
import com.google.android.gms.common.internal.C3469d.C3470a;
import com.google.android.gms.common.internal.C3469d.C3471b;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.dk */
public final class C3743dk extends C3469d<C3749dq> {
    public C3743dk(Context context, Looper looper, C3470a aVar, C3471b bVar) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        super(context, looper, 8, aVar, bVar, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ IInterface mo13014a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        return queryLocalInterface instanceof C3749dq ? (C3749dq) queryLocalInterface : new C3751ds(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo13015b() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    /* renamed from: e */
    public final C3749dq mo13018e() throws DeadObjectException {
        return (C3749dq) super.mo13557w();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n_ */
    public final String mo13020n_() {
        return "com.google.android.gms.ads.service.START";
    }
}
