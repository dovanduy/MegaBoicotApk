package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.p146c.C4418b;

/* renamed from: com.google.android.gms.common.internal.aw */
public abstract class C3462aw extends C4418b implements C3461av {
    /* renamed from: a */
    public static C3461av m12387a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        if (queryLocalInterface instanceof C3461av) {
            return (C3461av) queryLocalInterface;
        }
        return new C3463ax(iBinder);
    }
}
