package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.common.C3415h;
import com.google.android.gms.p137b.C3238b;
import com.google.android.gms.p137b.C3239c;
import com.google.android.gms.p137b.C3239c.C3240a;

@C3718cm
public final class awh extends C3239c<aup> {
    public awh() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    /* renamed from: a */
    public final aum mo14920a(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        try {
            IBinder a = ((aup) mo13039a(context)).mo14884a(C3238b.m11573a(context), C3238b.m11573a(frameLayout), C3238b.m11573a(frameLayout2), C3415h.f9877b);
            if (a == null) {
                return null;
            }
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            return queryLocalInterface instanceof aum ? (aum) queryLocalInterface : new auo(a);
        } catch (RemoteException | C3240a e) {
            C3987mk.m17432c("Could not create remote NativeAdViewDelegate.", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ Object mo13040b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return queryLocalInterface instanceof aup ? (aup) queryLocalInterface : new auq(iBinder);
    }
}
