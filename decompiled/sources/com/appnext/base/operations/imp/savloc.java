package com.appnext.base.operations.imp;

import android.location.Location;
import android.os.Bundle;
import com.appnext.base.operations.C1269d;
import com.appnext.base.p042a.p044b.C1230b;
import com.appnext.base.p042a.p044b.C1231c;
import com.appnext.base.p046b.C1245d.C1246a;
import com.appnext.base.p046b.C1247e;
import com.appnext.base.p046b.C1248f;
import com.appnext.base.p046b.C1252j;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class savloc extends C1269d {

    /* renamed from: hN */
    private static final String f4045hN = "savloc";

    /* renamed from: hO */
    private long f4046hO = 0;

    public savloc(C1231c cVar, Bundle bundle, Object obj) {
        super(cVar, bundle, obj);
    }

    /* renamed from: bA */
    public final boolean mo5999bA() {
        return C1248f.m5280g(C1247e.getContext(), "android.permission.ACCESS_FINE_LOCATION") || C1248f.m5280g(C1247e.getContext(), "android.permission.ACCESS_COARSE_LOCATION");
    }

    /* access modifiers changed from: protected */
    public List<C1230b> getData() {
        try {
            Location cm = C1252j.m5317cm();
            if (cm == null) {
                return null;
            }
            this.f4046hO = cm.getTime();
            StringBuilder sb = new StringBuilder();
            sb.append(cm.getLatitude());
            sb.append(",");
            sb.append(cm.getLongitude());
            String sb2 = sb.toString();
            ArrayList arrayList = new ArrayList();
            String str = f4045hN;
            C1230b bVar = new C1230b(str, str, sb2, new Date(this.f4046hO), C1246a.String.getType());
            arrayList.add(bVar);
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final Date getDate() {
        return new Date(this.f4046hO);
    }

    public final String getKey() {
        return savloc.class.getSimpleName();
    }
}
