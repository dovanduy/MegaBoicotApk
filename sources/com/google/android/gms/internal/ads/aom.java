package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.p137b.C3238b;

final class aom extends C3664a<aum> {

    /* renamed from: a */
    private final /* synthetic */ FrameLayout f11628a;

    /* renamed from: b */
    private final /* synthetic */ FrameLayout f11629b;

    /* renamed from: c */
    private final /* synthetic */ Context f11630c;

    /* renamed from: d */
    private final /* synthetic */ aoh f11631d;

    aom(aoh aoh, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.f11631d = aoh;
        this.f11628a = frameLayout;
        this.f11629b = frameLayout2;
        this.f11630c = context;
        super();
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo14549a() throws RemoteException {
        aum a = this.f11631d.f11605f.mo14920a(this.f11630c, this.f11628a, this.f11629b);
        if (a != null) {
            return a;
        }
        aoh.m14586a(this.f11630c, "native_ad_view_delegate");
        return new aqz();
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo14550a(apt apt) throws RemoteException {
        return apt.createNativeAdViewDelegate(C3238b.m11573a(this.f11628a), C3238b.m11573a(this.f11629b));
    }
}
