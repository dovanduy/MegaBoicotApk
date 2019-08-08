package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.C3469d;
import com.google.android.gms.common.internal.C3469d.C3470a;
import com.google.android.gms.common.internal.C3469d.C3471b;

@C3718cm
public final class awp extends C3469d<aws> {
    awp(Context context, Looper looper, C3470a aVar, C3471b bVar) {
        super(context, looper, 166, aVar, bVar, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ IInterface mo13014a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
        return queryLocalInterface instanceof aws ? (aws) queryLocalInterface : new awt(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo13015b() {
        return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
    }

    /* renamed from: e */
    public final aws mo13018e() throws DeadObjectException {
        return (aws) super.mo13557w();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n_ */
    public final String mo13020n_() {
        return "com.google.android.gms.ads.service.HTTP";
    }
}
