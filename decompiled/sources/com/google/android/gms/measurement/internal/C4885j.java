package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.p148e.C4435ac;
import com.google.android.gms.internal.p148e.C4442aj;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.j */
public abstract class C4885j extends C4435ac implements C4884i {
    public C4885j() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo16335a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                mo17267a((zzag) C4442aj.m18887a(parcel, zzag.CREATOR), (zzk) C4442aj.m18887a(parcel, zzk.CREATOR));
                parcel2.writeNoException();
                break;
            case 2:
                mo17269a((zzfv) C4442aj.m18887a(parcel, zzfv.CREATOR), (zzk) C4442aj.m18887a(parcel, zzk.CREATOR));
                parcel2.writeNoException();
                break;
            case 4:
                mo17270a((zzk) C4442aj.m18887a(parcel, zzk.CREATOR));
                parcel2.writeNoException();
                break;
            case 5:
                mo17268a((zzag) C4442aj.m18887a(parcel, zzag.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                break;
            case 6:
                mo17275b((zzk) C4442aj.m18887a(parcel, zzk.CREATOR));
                parcel2.writeNoException();
                break;
            case 7:
                List a = mo17261a((zzk) C4442aj.m18887a(parcel, zzk.CREATOR), C4442aj.m18890a(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(a);
                break;
            case 9:
                byte[] a2 = mo17273a((zzag) C4442aj.m18887a(parcel, zzag.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeByteArray(a2);
                break;
            case 10:
                mo17266a(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                break;
            case 11:
                String c = mo17276c((zzk) C4442aj.m18887a(parcel, zzk.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(c);
                break;
            case 12:
                mo17272a((zzo) C4442aj.m18887a(parcel, zzo.CREATOR), (zzk) C4442aj.m18887a(parcel, zzk.CREATOR));
                parcel2.writeNoException();
                break;
            case 13:
                mo17271a((zzo) C4442aj.m18887a(parcel, zzo.CREATOR));
                parcel2.writeNoException();
                break;
            case 14:
                List a3 = mo17265a(parcel.readString(), parcel.readString(), C4442aj.m18890a(parcel), (zzk) C4442aj.m18887a(parcel, zzk.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(a3);
                break;
            case 15:
                List a4 = mo17264a(parcel.readString(), parcel.readString(), parcel.readString(), C4442aj.m18890a(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(a4);
                break;
            case 16:
                List a5 = mo17262a(parcel.readString(), parcel.readString(), (zzk) C4442aj.m18887a(parcel, zzk.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(a5);
                break;
            case 17:
                List a6 = mo17263a(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeTypedList(a6);
                break;
            case 18:
                mo17277d((zzk) C4442aj.m18887a(parcel, zzk.CREATOR));
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
