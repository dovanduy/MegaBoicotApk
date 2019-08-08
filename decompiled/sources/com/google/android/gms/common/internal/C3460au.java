package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.internal.p146c.C4417a;
import com.google.android.gms.internal.p146c.C4419c;

/* renamed from: com.google.android.gms.common.internal.au */
public final class C3460au extends C4417a implements C3498o {
    C3460au(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGmsCallbacks");
    }

    /* renamed from: a */
    public final void mo13523a(int i, IBinder iBinder, Bundle bundle) throws RemoteException {
        Parcel c = mo16317c();
        c.writeInt(i);
        c.writeStrongBinder(iBinder);
        C4419c.m18846a(c, (Parcelable) bundle);
        mo16316b(1, c);
    }

    /* renamed from: a */
    public final void mo13522a(int i, Bundle bundle) throws RemoteException {
        Parcel c = mo16317c();
        c.writeInt(i);
        C4419c.m18846a(c, (Parcelable) bundle);
        mo16316b(2, c);
    }

    /* renamed from: a */
    public final void mo13524a(int i, IBinder iBinder, zzb zzb) throws RemoteException {
        Parcel c = mo16317c();
        c.writeInt(i);
        c.writeStrongBinder(iBinder);
        C4419c.m18846a(c, (Parcelable) zzb);
        mo16316b(3, c);
    }
}
