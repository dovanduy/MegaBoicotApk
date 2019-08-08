package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.C3244a.C3246b;
import com.google.android.gms.common.api.C3266f;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C3332c.C3334b;
import com.google.android.gms.location.ActivityTransitionRequest;

/* renamed from: com.google.android.gms.internal.location.ag */
final class C4661ag extends C4663ai {

    /* renamed from: b */
    private final /* synthetic */ ActivityTransitionRequest f15218b;

    /* renamed from: c */
    private final /* synthetic */ PendingIntent f15219c;

    C4661ag(C4660af afVar, C3266f fVar, ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent) {
        this.f15218b = activityTransitionRequest;
        this.f15219c = pendingIntent;
        super(fVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo13022a(C3246b bVar) throws RemoteException {
        ((C4689t) bVar).mo16942a(this.f15218b, this.f15219c, (C3334b<Status>) this);
    }
}
