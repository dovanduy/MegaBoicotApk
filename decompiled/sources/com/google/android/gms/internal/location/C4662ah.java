package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.C3244a.C3246b;
import com.google.android.gms.common.api.C3266f;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C3332c.C3334b;

/* renamed from: com.google.android.gms.internal.location.ah */
final class C4662ah extends C4663ai {

    /* renamed from: b */
    private final /* synthetic */ PendingIntent f15220b;

    C4662ah(C4660af afVar, C3266f fVar, PendingIntent pendingIntent) {
        this.f15220b = pendingIntent;
        super(fVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo13022a(C3246b bVar) throws RemoteException {
        ((C4689t) bVar).mo16940a(this.f15220b, (C3334b<Status>) this);
    }
}
