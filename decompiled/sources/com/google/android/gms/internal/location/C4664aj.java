package com.google.android.gms.internal.location;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.C3266f.C3268b;
import com.google.android.gms.common.api.C3266f.C3269c;
import com.google.android.gms.common.internal.C3482e;
import com.google.android.gms.common.internal.C3487h;

/* renamed from: com.google.android.gms.internal.location.aj */
public class C4664aj extends C3487h<C4678i> {

    /* renamed from: e */
    protected final C4695z<C4678i> f15221e = new C4665ak(this);

    /* renamed from: f */
    private final String f15222f;

    public C4664aj(Context context, Looper looper, C3268b bVar, C3269c cVar, String str, C3482e eVar) {
        super(context, looper, 23, eVar, bVar, cVar);
        this.f15222f = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public /* synthetic */ IInterface mo13014a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return queryLocalInterface instanceof C4678i ? (C4678i) queryLocalInterface : new C4679j(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo13015b() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    /* renamed from: f */
    public int mo13019f() {
        return 11925000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n_ */
    public String mo13020n_() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public Bundle mo13555u() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.f15222f);
        return bundle;
    }
}
