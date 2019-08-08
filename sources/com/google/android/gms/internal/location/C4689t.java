package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.C3266f.C3268b;
import com.google.android.gms.common.api.C3266f.C3269c;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C3332c.C3334b;
import com.google.android.gms.common.api.internal.C3365f;
import com.google.android.gms.common.api.internal.C3369i;
import com.google.android.gms.common.api.internal.C3369i.C3370a;
import com.google.android.gms.common.api.internal.C3376m;
import com.google.android.gms.common.internal.C3482e;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.C4718g;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import javax.annotation.Nullable;

/* renamed from: com.google.android.gms.internal.location.t */
public final class C4689t extends C4664aj {

    /* renamed from: f */
    private final C4682m f15240f;

    public C4689t(Context context, Looper looper, C3268b bVar, C3269c cVar, String str) {
        this(context, looper, bVar, cVar, str, C3482e.m12478a(context));
    }

    public C4689t(Context context, Looper looper, C3268b bVar, C3269c cVar, String str, @Nullable C3482e eVar) {
        super(context, looper, bVar, cVar, str, eVar);
        this.f15240f = new C4682m(context, this.f15221e);
    }

    /* renamed from: a */
    public final void mo16940a(PendingIntent pendingIntent, C3334b<Status> bVar) throws RemoteException {
        mo13556v();
        C3513t.m12626a(bVar, (Object) "ResultHolder not provided.");
        ((C4678i) mo13557w()).mo16924a(pendingIntent, new C3376m(bVar));
    }

    /* renamed from: a */
    public final void mo16941a(C3370a<C4718g> aVar, C4675f fVar) throws RemoteException {
        this.f15240f.mo16932a(aVar, fVar);
    }

    /* renamed from: a */
    public final void mo16942a(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent, C3334b<Status> bVar) throws RemoteException {
        mo13556v();
        C3513t.m12626a(bVar, (Object) "ResultHolder not provided.");
        ((C4678i) mo13557w()).mo16927a(activityTransitionRequest, pendingIntent, (C3365f) new C3376m(bVar));
    }

    /* renamed from: a */
    public final void mo16943a(LocationRequest locationRequest, C3369i<C4718g> iVar, C4675f fVar) throws RemoteException {
        synchronized (this.f15240f) {
            this.f15240f.mo16933a(locationRequest, iVar, fVar);
        }
    }

    /* renamed from: a */
    public final void mo16944a(LocationSettingsRequest locationSettingsRequest, C3334b<LocationSettingsResult> bVar, @Nullable String str) throws RemoteException {
        mo13556v();
        boolean z = false;
        C3513t.m12636b(locationSettingsRequest != null, "locationSettingsRequest can't be null nor empty.");
        if (bVar != null) {
            z = true;
        }
        C3513t.m12636b(z, "listener can't be null.");
        ((C4678i) mo13557w()).mo16928a(locationSettingsRequest, (C4680k) new C4691v(bVar), str);
    }

    /* renamed from: g */
    public final void mo13541g() {
        synchronized (this.f15240f) {
            if (mo13542h()) {
                try {
                    this.f15240f.mo16931a();
                    this.f15240f.mo16935b();
                } catch (Exception e) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e);
                }
            }
            super.mo13541g();
        }
    }
}
