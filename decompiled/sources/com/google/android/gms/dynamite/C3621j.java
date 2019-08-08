package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.p146c.C4417a;
import com.google.android.gms.internal.p146c.C4419c;
import com.google.android.gms.p137b.C3235a;
import com.google.android.gms.p137b.C3235a.C3236a;

/* renamed from: com.google.android.gms.dynamite.j */
public final class C3621j extends C4417a implements C3620i {
    C3621j(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    /* renamed from: a */
    public final C3235a mo13751a(C3235a aVar, String str, int i) throws RemoteException {
        Parcel c = mo16317c();
        C4419c.m18845a(c, (IInterface) aVar);
        c.writeString(str);
        c.writeInt(i);
        Parcel a = mo16314a(2, c);
        C3235a a2 = C3236a.m11572a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final int mo13750a(C3235a aVar, String str, boolean z) throws RemoteException {
        Parcel c = mo16317c();
        C4419c.m18845a(c, (IInterface) aVar);
        c.writeString(str);
        C4419c.m18847a(c, z);
        Parcel a = mo16314a(3, c);
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    /* renamed from: b */
    public final C3235a mo13753b(C3235a aVar, String str, int i) throws RemoteException {
        Parcel c = mo16317c();
        C4419c.m18845a(c, (IInterface) aVar);
        c.writeString(str);
        c.writeInt(i);
        Parcel a = mo16314a(4, c);
        C3235a a2 = C3236a.m11572a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: b */
    public final int mo13752b(C3235a aVar, String str, boolean z) throws RemoteException {
        Parcel c = mo16317c();
        C4419c.m18845a(c, (IInterface) aVar);
        c.writeString(str);
        C4419c.m18847a(c, z);
        Parcel a = mo16314a(5, c);
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    /* renamed from: a */
    public final int mo13749a() throws RemoteException {
        Parcel a = mo16314a(6, mo16317c());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
