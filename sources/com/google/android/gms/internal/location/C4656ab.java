package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.C3244a.C3246b;
import com.google.android.gms.common.api.C3266f;
import com.google.android.gms.common.api.C3391k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C3332c.C3334b;
import com.google.android.gms.location.C4719h.C4720a;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;

/* renamed from: com.google.android.gms.internal.location.ab */
final class C4656ab extends C4720a<LocationSettingsResult> {

    /* renamed from: b */
    private final /* synthetic */ LocationSettingsRequest f15215b;

    /* renamed from: c */
    private final /* synthetic */ String f15216c = null;

    C4656ab(C4655aa aaVar, C3266f fVar, LocationSettingsRequest locationSettingsRequest, String str) {
        this.f15215b = locationSettingsRequest;
        super(fVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C3391k mo13021a(Status status) {
        return new LocationSettingsResult(status);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo13022a(C3246b bVar) throws RemoteException {
        ((C4689t) bVar).mo16944a(this.f15215b, (C3334b<LocationSettingsResult>) this, this.f15216c);
    }
}
