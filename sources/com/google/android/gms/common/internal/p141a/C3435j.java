package com.google.android.gms.common.internal.p141a;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.C3266f.C3268b;
import com.google.android.gms.common.api.C3266f.C3269c;
import com.google.android.gms.common.internal.C3482e;
import com.google.android.gms.common.internal.C3487h;

/* renamed from: com.google.android.gms.common.internal.a.j */
public final class C3435j extends C3487h<C3438m> {
    public C3435j(Context context, Looper looper, C3482e eVar, C3268b bVar, C3269c cVar) {
        super(context, looper, 39, eVar, bVar, cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo13015b() {
        return "com.google.android.gms.common.internal.service.ICommonService";
    }

    /* renamed from: n_ */
    public final String mo13020n_() {
        return "com.google.android.gms.common.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ IInterface mo13014a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.ICommonService");
        if (queryLocalInterface instanceof C3438m) {
            return (C3438m) queryLocalInterface;
        }
        return new C3439n(iBinder);
    }
}
