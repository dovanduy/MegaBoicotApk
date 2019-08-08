package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.search.C3170a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

@C3718cm
public final class aoe {

    /* renamed from: a */
    public static final aoe f11598a = new aoe();

    protected aoe() {
    }

    /* renamed from: a */
    public static zzjj m14581a(Context context, aql aql) {
        List list;
        Context context2;
        String str;
        aql aql2 = aql;
        Date a = aql.mo14584a();
        long time = a != null ? a.getTime() : -1;
        String b = aql.mo14586b();
        int c = aql.mo14587c();
        Set d = aql.mo14588d();
        if (!d.isEmpty()) {
            list = Collections.unmodifiableList(new ArrayList(d));
            context2 = context;
        } else {
            context2 = context;
            list = null;
        }
        boolean a2 = aql2.mo14585a(context2);
        int l = aql.mo14596l();
        Location e = aql.mo14589e();
        Bundle a3 = aql2.mo14583a(AdMobAdapter.class);
        boolean f = aql.mo14590f();
        String g = aql.mo14591g();
        C3170a i = aql.mo14593i();
        zzmq zzmq = i != null ? new zzmq(i) : null;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            aoq.m14615a();
            str = C3975lz.m17373a(Thread.currentThread().getStackTrace(), packageName);
        } else {
            str = null;
        }
        zzjj zzjj = new zzjj(7, time, a3, c, list, a2, l, f, g, zzmq, e, b, aql.mo14595k(), aql.mo14597m(), Collections.unmodifiableList(new ArrayList(aql.mo14598n())), aql.mo14592h(), str, aql.mo14599o());
        return zzjj;
    }
}
