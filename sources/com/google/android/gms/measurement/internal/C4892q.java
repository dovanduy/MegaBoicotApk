package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.C3415h;
import com.google.android.gms.common.internal.C3469d;
import com.google.android.gms.common.internal.C3469d.C3470a;
import com.google.android.gms.common.internal.C3469d.C3471b;

/* renamed from: com.google.android.gms.measurement.internal.q */
public final class C4892q extends C3469d<C4884i> {
    public C4892q(Context context, Looper looper, C3470a aVar, C3471b bVar) {
        super(context, looper, 93, aVar, bVar, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo13015b() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    /* renamed from: f */
    public final int mo13019f() {
        return C3415h.f9877b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n_ */
    public final String mo13020n_() {
        return "com.google.android.gms.measurement.START";
    }

    /* renamed from: a */
    public final /* synthetic */ IInterface mo13014a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        if (queryLocalInterface instanceof C4884i) {
            return (C4884i) queryLocalInterface;
        }
        return new C4886k(iBinder);
    }
}
