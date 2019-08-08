package com.appnext.base.operations.imp;

import android.os.Bundle;
import android.provider.Settings.System;
import com.appnext.base.operations.C1269d;
import com.appnext.base.p042a.p044b.C1230b;
import com.appnext.base.p042a.p044b.C1231c;
import com.appnext.base.p046b.C1245d.C1246a;
import com.appnext.base.p046b.C1247e;
import java.util.ArrayList;
import java.util.List;

public class scb extends C1269d {
    /* renamed from: bA */
    public final boolean mo5999bA() {
        return true;
    }

    public scb(C1231c cVar, Bundle bundle, Object obj) {
        super(cVar, bundle, obj);
    }

    /* access modifiers changed from: protected */
    public List<C1230b> getData() {
        try {
            int i = System.getInt(C1247e.getContext().getContentResolver(), "screen_brightness");
            if (i == 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            String simpleName = scb.class.getSimpleName();
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            arrayList.add(new C1230b(simpleName, sb.toString(), C1246a.Integer.getType()));
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final String getKey() {
        return scb.class.getSimpleName();
    }
}
