package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.C3415h;
import com.google.android.gms.p137b.C3238b;
import com.google.android.gms.p137b.C3239c;
import com.google.android.gms.p137b.C3239c.C3240a;

@C3718cm
public final class anz extends C3239c<apf> {
    public anz() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    /* renamed from: a */
    public final apc mo14536a(Context context, String str, bca bca) {
        try {
            IBinder a = ((apf) mo13039a(context)).mo14556a(C3238b.m11573a(context), str, bca, C3415h.f9877b);
            if (a == null) {
                return null;
            }
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return queryLocalInterface instanceof apc ? (apc) queryLocalInterface : new ape(a);
        } catch (RemoteException | C3240a e) {
            C3987mk.m17432c("Could not create remote builder for AdLoader.", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ Object mo13040b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        return queryLocalInterface instanceof apf ? (apf) queryLocalInterface : new apg(iBinder);
    }
}
