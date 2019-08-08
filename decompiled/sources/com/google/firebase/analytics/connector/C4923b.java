package com.google.firebase.analytics.connector;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.internal.C4764aw;
import com.google.android.gms.measurement.internal.C4888m;
import com.google.firebase.C4917a;
import com.google.firebase.C4928b;
import com.google.firebase.analytics.connector.internal.C4927b;
import com.google.firebase.p149a.C4918a;
import com.google.firebase.p149a.C4921d;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.firebase.analytics.connector.b */
public class C4923b implements C4922a {

    /* renamed from: b */
    private static volatile C4922a f16068b;

    /* renamed from: a */
    final Map<String, Object> f16069a = new ConcurrentHashMap();

    /* renamed from: c */
    private final AppMeasurement f16070c;

    private C4923b(AppMeasurement appMeasurement) {
        C3513t.m12625a(appMeasurement);
        this.f16070c = appMeasurement;
    }

    /* renamed from: a */
    public static C4922a m21481a(C4928b bVar, Context context, C4921d dVar) {
        C3513t.m12625a(bVar);
        C3513t.m12625a(context);
        C3513t.m12625a(dVar);
        C3513t.m12625a(context.getApplicationContext());
        if (f16068b == null) {
            synchronized (C4923b.class) {
                if (f16068b == null) {
                    Bundle bundle = new Bundle(1);
                    if (bVar.mo17835f()) {
                        dVar.mo17821a(C4917a.class, C4924c.f16071a, C4925d.f16072a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", bVar.mo17833e());
                    }
                    f16068b = new C4923b(C4764aw.m20471a(context, C4888m.m21298a(bundle)).mo17247i());
                }
            }
        }
        return f16068b;
    }

    /* renamed from: a */
    public void mo17824a(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (C4927b.m21487a(str) && C4927b.m21488a(str2, bundle) && C4927b.m21490a(str, str2, bundle)) {
            this.f16070c.logEventInternal(str, str2, bundle);
        }
    }

    /* renamed from: a */
    public void mo17825a(String str, String str2, Object obj) {
        if (C4927b.m21487a(str) && C4927b.m21489a(str, str2)) {
            this.f16070c.mo17093a(str, str2, obj);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m21482a(C4918a aVar) {
        boolean z = ((C4917a) aVar.mo17817b()).f16062a;
        synchronized (C4923b.class) {
            ((C4923b) f16068b).f16070c.mo17094a(z);
        }
    }
}
