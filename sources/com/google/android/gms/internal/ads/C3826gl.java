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
/* renamed from: com.google.android.gms.internal.ads.gl */
public final class C3826gl extends C3239c<C3820gf> {
    public C3826gl() {
        super("com.google.android.gms.ads.reward.RewardedVideoAdCreatorImpl");
    }

    /* renamed from: a */
    public final C3816gb mo15320a(Context context, bca bca) {
        try {
            IBinder a = ((C3820gf) mo13039a(context)).mo15319a(C3238b.m11573a(context), bca, C3415h.f9877b);
            if (a == null) {
                return null;
            }
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
            return queryLocalInterface instanceof C3816gb ? (C3816gb) queryLocalInterface : new C3819ge(a);
        } catch (RemoteException | C3240a e) {
            C3987mk.m17432c("Could not get remote RewardedVideoAd.", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ Object mo13040b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
        return queryLocalInterface instanceof C3820gf ? (C3820gf) queryLocalInterface : new C3821gg(iBinder);
    }
}
