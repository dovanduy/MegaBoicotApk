package com.google.android.gms.common.api.internal;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p145b.C4411b;
import com.google.android.gms.internal.p145b.C4412c;

/* renamed from: com.google.android.gms.common.api.internal.f */
public interface C3365f extends IInterface {

    /* renamed from: com.google.android.gms.common.api.internal.f$a */
    public static abstract class C3366a extends C4411b implements C3365f {
        public C3366a() {
            super("com.google.android.gms.common.api.internal.IStatusCallback");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo13342a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1) {
                return false;
            }
            mo13341a((Status) C4412c.m18836a(parcel, Status.CREATOR));
            return true;
        }
    }

    /* renamed from: a */
    void mo13341a(Status status) throws RemoteException;
}
