package com.appnext.base.operations.imp;

import android.os.Bundle;
import com.appnext.base.operations.C1269d;
import com.appnext.base.p042a.C1224a;
import com.appnext.base.p042a.p044b.C1230b;
import com.appnext.base.p042a.p044b.C1231c;
import com.appnext.base.p046b.C1245d;
import com.appnext.base.p046b.C1247e;
import com.appnext.base.services.p048b.C1285a;
import java.util.List;

public class scdle extends C1269d {
    public scdle(C1231c cVar, Bundle bundle, Object obj) {
        super(cVar, bundle, obj);
    }

    /* access modifiers changed from: protected */
    public final String getKey() {
        return scdle.class.getSimpleName();
    }

    /* access modifiers changed from: protected */
    public List<C1230b> getData() {
        try {
            List<C1231c> bm = C1224a.m5161aN().mo5888aR().mo5931bm();
            if (bm != null) {
                for (C1231c cVar : bm) {
                    if (!cVar.getKey().equals(scdle.class.getSimpleName()) && cVar.mo5909bf().equals(C1245d.f3956iY)) {
                        C1285a.m5550g(C1247e.getContext()).mo6052c(cVar);
                        C1285a.m5550g(C1247e.getContext()).mo6051a(cVar, true);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
