package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C3360d.C3361a;
import com.google.android.gms.common.util.C3563o;

/* renamed from: com.google.android.gms.common.api.internal.ap */
public abstract class C3293ap {

    /* renamed from: a */
    private final int f9573a;

    public C3293ap(int i) {
        this.f9573a = i;
    }

    /* renamed from: a */
    public abstract void mo13201a(Status status);

    /* renamed from: a */
    public abstract void mo13202a(C3361a<?> aVar) throws DeadObjectException;

    /* renamed from: a */
    public abstract void mo13203a(C3381r rVar, boolean z);

    /* renamed from: a */
    public abstract void mo13204a(RuntimeException runtimeException);

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static Status m11771b(RemoteException remoteException) {
        StringBuilder sb = new StringBuilder();
        if (C3563o.m12764c() && (remoteException instanceof TransactionTooLargeException)) {
            sb.append("TransactionTooLargeException: ");
        }
        sb.append(remoteException.getLocalizedMessage());
        return new Status(8, sb.toString());
    }
}
