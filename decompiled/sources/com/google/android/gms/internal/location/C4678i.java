package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.C3365f;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.LocationSettingsRequest;

/* renamed from: com.google.android.gms.internal.location.i */
public interface C4678i extends IInterface {
    /* renamed from: a */
    void mo16924a(PendingIntent pendingIntent, C3365f fVar) throws RemoteException;

    /* renamed from: a */
    void mo16925a(zzbf zzbf) throws RemoteException;

    /* renamed from: a */
    void mo16926a(zzo zzo) throws RemoteException;

    /* renamed from: a */
    void mo16927a(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent, C3365f fVar) throws RemoteException;

    /* renamed from: a */
    void mo16928a(LocationSettingsRequest locationSettingsRequest, C4680k kVar, String str) throws RemoteException;

    /* renamed from: a */
    void mo16929a(boolean z) throws RemoteException;
}
