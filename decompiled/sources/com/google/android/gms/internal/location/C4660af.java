package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.C3266f;
import com.google.android.gms.common.api.C3270g;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.C4713b;

/* renamed from: com.google.android.gms.internal.location.af */
public final class C4660af implements C4713b {
    /* renamed from: a */
    public final C3270g<Status> mo16910a(C3266f fVar, PendingIntent pendingIntent) {
        return fVar.mo13135b(new C4662ah(this, fVar, pendingIntent));
    }

    /* renamed from: a */
    public final C3270g<Status> mo16911a(C3266f fVar, ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent) {
        return fVar.mo13135b(new C4661ag(this, fVar, activityTransitionRequest, pendingIntent));
    }
}
