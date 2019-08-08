package com.appnext.base.operations.imp;

import android.os.Bundle;
import com.appnext.base.operations.C1269d;
import com.appnext.base.p042a.p044b.C1230b;
import com.appnext.base.p042a.p044b.C1231c;
import com.appnext.base.p046b.C1245d;
import com.appnext.base.p046b.C1245d.C1246a;
import com.appnext.base.p046b.C1259k;
import java.util.ArrayList;
import java.util.List;

public class ulve extends C1269d {
    /* renamed from: bA */
    public final boolean mo5999bA() {
        return true;
    }

    public ulve(C1231c cVar, Bundle bundle, Object obj) {
        super(cVar, bundle, obj);
    }

    /* access modifiers changed from: protected */
    public List<C1230b> getData() {
        long j = 0;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(wpul.class.getSimpleName());
            sb.append(C1245d.f3955iX);
            Object a = C1259k.m5329a(sb.toString(), C1246a.Long);
            if (a != null && (a instanceof Long)) {
                j = ((Long) a).longValue();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(wpul.class.getSimpleName());
            sb2.append(C1245d.f3955iX);
            C1259k.m5337b(sb2.toString(), String.valueOf(System.currentTimeMillis() + j), C1246a.Long);
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C1230b(ulve.class.getSimpleName(), "true", C1246a.String.getType()));
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final String getKey() {
        return ulve.class.getSimpleName();
    }
}
