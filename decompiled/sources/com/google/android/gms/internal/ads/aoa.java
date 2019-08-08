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
public final class aoa extends C3239c<apk> {
    public aoa() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    /* renamed from: a */
    public final aph mo14537a(Context context, zzjn zzjn, String str, bca bca, int i) {
        try {
            IBinder a = ((apk) mo13039a(context)).mo14557a(C3238b.m11573a(context), zzjn, str, bca, C3415h.f9877b, i);
            if (a == null) {
                return null;
            }
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            return queryLocalInterface instanceof aph ? (aph) queryLocalInterface : new apj(a);
        } catch (RemoteException | C3240a e) {
            C3987mk.m17427a("Could not create remote AdManager.", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ Object mo13040b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return queryLocalInterface instanceof apk ? (apk) queryLocalInterface : new apl(iBinder);
    }
}
