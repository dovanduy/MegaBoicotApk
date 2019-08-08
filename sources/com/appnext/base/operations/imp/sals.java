package com.appnext.base.operations.imp;

import android.os.Bundle;
import com.appnext.base.operations.C1269d;
import com.appnext.base.p042a.C1224a;
import com.appnext.base.p042a.p044b.C1230b;
import com.appnext.base.p042a.p044b.C1231c;
import com.appnext.base.p046b.C1245d;
import com.appnext.core.C1326f;
import java.util.List;
import org.json.JSONArray;

public class sals extends C1269d {
    /* renamed from: bA */
    public final boolean mo5999bA() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: bv */
    public final boolean mo6005bv() {
        return false;
    }

    public sals(C1231c cVar, Bundle bundle, Object obj) {
        super(cVar, bundle, obj);
    }

    /* access modifiers changed from: protected */
    public final String getKey() {
        return sals.class.getSimpleName();
    }

    /* access modifiers changed from: protected */
    public List<C1230b> getData() {
        try {
            String a = C1326f.m5662a(C1245d.f3946iO, null, true, 60000);
            C1224a.m5161aN().mo5886aP().delete();
            C1224a.m5161aN().mo5886aP().mo5920a(new JSONArray(a));
        } catch (Throwable th) {
            th.getMessage();
        }
        return null;
    }
}
