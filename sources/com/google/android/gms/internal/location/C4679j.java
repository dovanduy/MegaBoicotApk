package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.C3365f;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.LocationSettingsRequest;

/* renamed from: com.google.android.gms.internal.location.j */
public final class C4679j extends C4654a implements C4678i {
    C4679j(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    /* renamed from: a */
    public final void mo16924a(PendingIntent pendingIntent, C3365f fVar) throws RemoteException {
        Parcel a = mo16905a();
        C4658ad.m20188a(a, (Parcelable) pendingIntent);
        C4658ad.m20187a(a, (IInterface) fVar);
        mo16906a(73, a);
    }

    /* renamed from: a */
    public final void mo16925a(zzbf zzbf) throws RemoteException {
        Parcel a = mo16905a();
        C4658ad.m20188a(a, (Parcelable) zzbf);
        mo16906a(59, a);
    }

    /* renamed from: a */
    public final void mo16926a(zzo zzo) throws RemoteException {
        Parcel a = mo16905a();
        C4658ad.m20188a(a, (Parcelable) zzo);
        mo16906a(75, a);
    }

    /* renamed from: a */
    public final void mo16927a(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent, C3365f fVar) throws RemoteException {
        Parcel a = mo16905a();
        C4658ad.m20188a(a, (Parcelable) activityTransitionRequest);
        C4658ad.m20188a(a, (Parcelable) pendingIntent);
        C4658ad.m20187a(a, (IInterface) fVar);
        mo16906a(72, a);
    }

    /* renamed from: a */
    public final void mo16928a(LocationSettingsRequest locationSettingsRequest, C4680k kVar, String str) throws RemoteException {
        Parcel a = mo16905a();
        C4658ad.m20188a(a, (Parcelable) locationSettingsRequest);
        C4658ad.m20187a(a, (IInterface) kVar);
        a.writeString(str);
        mo16906a(63, a);
    }

    /* renamed from: a */
    public final void mo16929a(boolean z) throws RemoteException {
        Parcel a = mo16905a();
        C4658ad.m20189a(a, z);
        mo16906a(12, a);
    }
}
