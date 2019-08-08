package com.google.android.gms.measurement.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.internal.p148e.C4434ab;
import com.google.android.gms.internal.p148e.C4442aj;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.k */
public final class C4886k extends C4434ab implements C4884i {
    C4886k(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* renamed from: a */
    public final void mo17267a(zzag zzag, zzk zzk) throws RemoteException {
        Parcel a = mo16331a();
        C4442aj.m18888a(a, (Parcelable) zzag);
        C4442aj.m18888a(a, (Parcelable) zzk);
        mo16334b(1, a);
    }

    /* renamed from: a */
    public final void mo17269a(zzfv zzfv, zzk zzk) throws RemoteException {
        Parcel a = mo16331a();
        C4442aj.m18888a(a, (Parcelable) zzfv);
        C4442aj.m18888a(a, (Parcelable) zzk);
        mo16334b(2, a);
    }

    /* renamed from: a */
    public final void mo17270a(zzk zzk) throws RemoteException {
        Parcel a = mo16331a();
        C4442aj.m18888a(a, (Parcelable) zzk);
        mo16334b(4, a);
    }

    /* renamed from: a */
    public final void mo17268a(zzag zzag, String str, String str2) throws RemoteException {
        Parcel a = mo16331a();
        C4442aj.m18888a(a, (Parcelable) zzag);
        a.writeString(str);
        a.writeString(str2);
        mo16334b(5, a);
    }

    /* renamed from: b */
    public final void mo17275b(zzk zzk) throws RemoteException {
        Parcel a = mo16331a();
        C4442aj.m18888a(a, (Parcelable) zzk);
        mo16334b(6, a);
    }

    /* renamed from: a */
    public final List<zzfv> mo17261a(zzk zzk, boolean z) throws RemoteException {
        Parcel a = mo16331a();
        C4442aj.m18888a(a, (Parcelable) zzk);
        C4442aj.m18889a(a, z);
        Parcel a2 = mo16332a(7, a);
        ArrayList createTypedArrayList = a2.createTypedArrayList(zzfv.CREATOR);
        a2.recycle();
        return createTypedArrayList;
    }

    /* renamed from: a */
    public final byte[] mo17273a(zzag zzag, String str) throws RemoteException {
        Parcel a = mo16331a();
        C4442aj.m18888a(a, (Parcelable) zzag);
        a.writeString(str);
        Parcel a2 = mo16332a(9, a);
        byte[] createByteArray = a2.createByteArray();
        a2.recycle();
        return createByteArray;
    }

    /* renamed from: a */
    public final void mo17266a(long j, String str, String str2, String str3) throws RemoteException {
        Parcel a = mo16331a();
        a.writeLong(j);
        a.writeString(str);
        a.writeString(str2);
        a.writeString(str3);
        mo16334b(10, a);
    }

    /* renamed from: c */
    public final String mo17276c(zzk zzk) throws RemoteException {
        Parcel a = mo16331a();
        C4442aj.m18888a(a, (Parcelable) zzk);
        Parcel a2 = mo16332a(11, a);
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    /* renamed from: a */
    public final void mo17272a(zzo zzo, zzk zzk) throws RemoteException {
        Parcel a = mo16331a();
        C4442aj.m18888a(a, (Parcelable) zzo);
        C4442aj.m18888a(a, (Parcelable) zzk);
        mo16334b(12, a);
    }

    /* renamed from: a */
    public final void mo17271a(zzo zzo) throws RemoteException {
        Parcel a = mo16331a();
        C4442aj.m18888a(a, (Parcelable) zzo);
        mo16334b(13, a);
    }

    /* renamed from: a */
    public final List<zzfv> mo17265a(String str, String str2, boolean z, zzk zzk) throws RemoteException {
        Parcel a = mo16331a();
        a.writeString(str);
        a.writeString(str2);
        C4442aj.m18889a(a, z);
        C4442aj.m18888a(a, (Parcelable) zzk);
        Parcel a2 = mo16332a(14, a);
        ArrayList createTypedArrayList = a2.createTypedArrayList(zzfv.CREATOR);
        a2.recycle();
        return createTypedArrayList;
    }

    /* renamed from: a */
    public final List<zzfv> mo17264a(String str, String str2, String str3, boolean z) throws RemoteException {
        Parcel a = mo16331a();
        a.writeString(str);
        a.writeString(str2);
        a.writeString(str3);
        C4442aj.m18889a(a, z);
        Parcel a2 = mo16332a(15, a);
        ArrayList createTypedArrayList = a2.createTypedArrayList(zzfv.CREATOR);
        a2.recycle();
        return createTypedArrayList;
    }

    /* renamed from: a */
    public final List<zzo> mo17262a(String str, String str2, zzk zzk) throws RemoteException {
        Parcel a = mo16331a();
        a.writeString(str);
        a.writeString(str2);
        C4442aj.m18888a(a, (Parcelable) zzk);
        Parcel a2 = mo16332a(16, a);
        ArrayList createTypedArrayList = a2.createTypedArrayList(zzo.CREATOR);
        a2.recycle();
        return createTypedArrayList;
    }

    /* renamed from: a */
    public final List<zzo> mo17263a(String str, String str2, String str3) throws RemoteException {
        Parcel a = mo16331a();
        a.writeString(str);
        a.writeString(str2);
        a.writeString(str3);
        Parcel a2 = mo16332a(17, a);
        ArrayList createTypedArrayList = a2.createTypedArrayList(zzo.CREATOR);
        a2.recycle();
        return createTypedArrayList;
    }

    /* renamed from: d */
    public final void mo17277d(zzk zzk) throws RemoteException {
        Parcel a = mo16331a();
        C4442aj.m18888a(a, (Parcelable) zzk);
        mo16334b(18, a);
    }
}
