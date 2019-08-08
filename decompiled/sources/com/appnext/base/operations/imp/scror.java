package com.appnext.base.operations.imp;

import android.os.Bundle;
import com.appnext.base.operations.C1269d;
import com.appnext.base.p042a.p044b.C1230b;
import com.appnext.base.p042a.p044b.C1231c;
import com.appnext.base.p046b.C1245d.C1246a;
import com.appnext.base.p046b.C1247e;
import java.util.ArrayList;
import java.util.List;

public class scror extends C1269d {
    private final String KEY = scror.class.getSimpleName();

    /* renamed from: bA */
    public final boolean mo5999bA() {
        return true;
    }

    public scror(C1231c cVar, Bundle bundle, Object obj) {
        super(cVar, bundle, obj);
    }

    /* access modifiers changed from: protected */
    public List<C1230b> getData() {
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C1230b(this.KEY, C1247e.getContext().getResources().getConfiguration().orientation == 1 ? "PORTRAIT" : "LANDSCAPE", C1246a.String.getType()));
            if (mo6012e(arrayList)) {
                return arrayList;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final String getKey() {
        return scror.class.getSimpleName();
    }
}
