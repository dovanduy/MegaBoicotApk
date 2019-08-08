package com.google.android.gms.signin.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.signin.internal.d */
public interface C4911d extends IInterface {
    /* renamed from: a */
    void mo17800a(ConnectionResult connectionResult, zaa zaa) throws RemoteException;

    /* renamed from: a */
    void mo17801a(Status status) throws RemoteException;

    /* renamed from: a */
    void mo17802a(Status status, GoogleSignInAccount googleSignInAccount) throws RemoteException;

    /* renamed from: a */
    void mo13183a(zaj zaj) throws RemoteException;

    /* renamed from: b */
    void mo17803b(Status status) throws RemoteException;
}
