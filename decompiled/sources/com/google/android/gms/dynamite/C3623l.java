package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.p146c.C4417a;
import com.google.android.gms.internal.p146c.C4419c;
import com.google.android.gms.p137b.C3235a;
import com.google.android.gms.p137b.C3235a.C3236a;

/* renamed from: com.google.android.gms.dynamite.l */
public final class C3623l extends C4417a implements C3622k {
    C3623l(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    /* renamed from: a */
    public final C3235a mo13754a(C3235a aVar, String str, int i, C3235a aVar2) throws RemoteException {
        Parcel c = mo16317c();
        C4419c.m18845a(c, (IInterface) aVar);
        c.writeString(str);
        c.writeInt(i);
        C4419c.m18845a(c, (IInterface) aVar2);
        Parcel a = mo16314a(2, c);
        C3235a a2 = C3236a.m11572a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: b */
    public final C3235a mo13755b(C3235a aVar, String str, int i, C3235a aVar2) throws RemoteException {
        Parcel c = mo16317c();
        C4419c.m18845a(c, (IInterface) aVar);
        c.writeString(str);
        c.writeInt(i);
        C4419c.m18845a(c, (IInterface) aVar2);
        Parcel a = mo16314a(3, c);
        C3235a a2 = C3236a.m11572a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
