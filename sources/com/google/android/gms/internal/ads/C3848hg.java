package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.p137b.C3235a.C3236a;

/* renamed from: com.google.android.gms.internal.ads.hg */
public abstract class C3848hg extends aja implements C3847hf {
    public C3848hg() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    /* renamed from: a */
    public static C3847hf m16848a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        return queryLocalInterface instanceof C3847hf ? (C3847hf) queryLocalInterface : new C3849hh(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                mo15341a(C3236a.m11572a(parcel.readStrongBinder()));
                break;
            case 2:
                mo15342a(C3236a.m11572a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 3:
                mo15347b(C3236a.m11572a(parcel.readStrongBinder()));
                break;
            case 4:
                mo15349c(C3236a.m11572a(parcel.readStrongBinder()));
                break;
            case 5:
                mo15350d(C3236a.m11572a(parcel.readStrongBinder()));
                break;
            case 6:
                mo15351e(C3236a.m11572a(parcel.readStrongBinder()));
                break;
            case 7:
                mo15343a(C3236a.m11572a(parcel.readStrongBinder()), (zzaig) ajb.m14214a(parcel, zzaig.CREATOR));
                break;
            case 8:
                mo15352f(C3236a.m11572a(parcel.readStrongBinder()));
                break;
            case 9:
                mo15348b(C3236a.m11572a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 10:
                mo15353g(C3236a.m11572a(parcel.readStrongBinder()));
                break;
            case 11:
                mo15354h(C3236a.m11572a(parcel.readStrongBinder()));
                break;
            case 12:
                mo15340a((Bundle) ajb.m14214a(parcel, Bundle.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
