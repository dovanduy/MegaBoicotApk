package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.C3469d;
import com.google.android.gms.common.internal.C3469d.C3470a;
import com.google.android.gms.common.internal.C3469d.C3471b;

/* renamed from: com.google.android.gms.internal.ads.tb */
public final class C4167tb extends C3469d<C4170te> {
    public C4167tb(Context context, Looper looper, C3470a aVar, C3471b bVar) {
        super(context, looper, 116, aVar, bVar, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ IInterface mo13014a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return queryLocalInterface instanceof C4170te ? (C4170te) queryLocalInterface : new C4171tf(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo13015b() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    /* renamed from: e */
    public final C4170te mo13018e() throws DeadObjectException {
        return (C4170te) super.mo13557w();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n_ */
    public final String mo13020n_() {
        return "com.google.android.gms.gass.START";
    }
}
