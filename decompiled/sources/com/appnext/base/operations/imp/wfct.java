package com.appnext.base.operations.imp;

import android.net.NetworkInfo;
import android.os.Bundle;
import com.appnext.base.operations.C1269d;
import com.appnext.base.p042a.p044b.C1230b;
import com.appnext.base.p042a.p044b.C1231c;
import com.appnext.base.p046b.C1245d.C1246a;
import com.appnext.base.p046b.C1247e;
import com.appnext.base.p046b.C1248f;
import java.util.ArrayList;
import java.util.List;

public class wfct extends C1269d {
    public wfct(C1231c cVar, Bundle bundle, Object obj) {
        super(cVar, bundle, obj);
    }

    /* access modifiers changed from: protected */
    public List<C1230b> getData() {
        NetworkInfo j = C1248f.m5283j(C1247e.getContext());
        if (j != null && j.isConnected()) {
            boolean equalsIgnoreCase = j.getTypeName().equalsIgnoreCase("WIFI");
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C1230b(wfct.class.getSimpleName(), String.valueOf(equalsIgnoreCase), C1246a.Boolean.getType()));
            if (mo6012e(arrayList)) {
                return arrayList;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final String getKey() {
        return wfct.class.getSimpleName();
    }
}
