package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.p137b.C3238b;
import com.google.android.gms.p137b.C3239c;
import com.google.android.gms.p137b.C3239c.C3240a;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.q */
public final class C4084q extends C3239c<C4192u> {
    public C4084q() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    /* renamed from: a */
    public final C4111r mo15860a(Activity activity) {
        try {
            IBinder a = ((C4192u) mo13039a(activity)).mo16094a(C3238b.m11573a(activity));
            if (a == null) {
                return null;
            }
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return queryLocalInterface instanceof C4111r ? (C4111r) queryLocalInterface : new C4165t(a);
        } catch (RemoteException | C3240a e) {
            C3987mk.m17432c("Could not create remote AdOverlay.", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ Object mo13040b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return queryLocalInterface instanceof C4192u ? (C4192u) queryLocalInterface : new C4221v(iBinder);
    }
}
