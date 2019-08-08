package com.appnext.base.operations.imp;

import android.net.NetworkInfo;
import android.os.Bundle;
import android.text.TextUtils;
import com.appnext.base.operations.C1269d;
import com.appnext.base.p042a.C1224a;
import com.appnext.base.p042a.p044b.C1230b;
import com.appnext.base.p042a.p044b.C1231c;
import com.appnext.base.p046b.C1245d;
import com.appnext.base.p046b.C1245d.C1246a;
import com.appnext.base.p046b.C1247e;
import com.appnext.base.p046b.C1248f;
import java.util.ArrayList;
import java.util.List;

public class ctype extends C1269d {
    private final String KEY = ctype.class.getSimpleName();

    public ctype(C1231c cVar, Bundle bundle, Object obj) {
        super(cVar, bundle, obj);
    }

    /* renamed from: bA */
    public final boolean mo5999bA() {
        return C1248f.m5280g(C1247e.getContext().getApplicationContext(), "android.permission.ACCESS_NETWORK_STATE");
    }

    /* access modifiers changed from: protected */
    public List<C1230b> getData() {
        if (!mo5999bA()) {
            return null;
        }
        C1231c ac = C1224a.m5161aN().mo5888aR().mo5929ac(this.KEY);
        if (ac != null && !C1245d.f3958ja.equalsIgnoreCase(ac.mo5905bb())) {
            NetworkInfo j = C1248f.m5283j(C1247e.getContext());
            if (j != null && j.isConnected()) {
                ArrayList arrayList = new ArrayList();
                String typeName = j.getTypeName();
                if (!TextUtils.isEmpty(typeName)) {
                    arrayList.add(new C1230b(this.KEY, "ctype", typeName, C1246a.String.getType()));
                }
                String subtypeName = j.getSubtypeName();
                if (!TextUtils.isEmpty(subtypeName)) {
                    arrayList.add(new C1230b(this.KEY, "mctype", subtypeName, C1246a.String.getType()));
                }
                if (mo6012e(arrayList)) {
                    return arrayList;
                }
                return null;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final String getKey() {
        return ctype.class.getSimpleName();
    }
}
