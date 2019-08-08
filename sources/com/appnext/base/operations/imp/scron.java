package com.appnext.base.operations.imp;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.PowerManager;
import com.appnext.base.operations.C1269d;
import com.appnext.base.p042a.p044b.C1230b;
import com.appnext.base.p042a.p044b.C1231c;
import com.appnext.base.p046b.C1245d.C1246a;
import com.appnext.base.p046b.C1247e;
import java.util.ArrayList;
import java.util.List;

public class scron extends C1269d {
    private final String KEY = scron.class.getSimpleName();

    /* renamed from: bA */
    public final boolean mo5999bA() {
        return true;
    }

    public scron(C1231c cVar, Bundle bundle, Object obj) {
        super(cVar, bundle, obj);
    }

    /* access modifiers changed from: protected */
    public List<C1230b> getData() {
        try {
            ArrayList arrayList = new ArrayList();
            String str = this.KEY;
            StringBuilder sb = new StringBuilder();
            PowerManager powerManager = (PowerManager) C1247e.getContext().getSystemService("power");
            sb.append((VERSION.SDK_INT >= 20 && powerManager.isInteractive()) || (VERSION.SDK_INT < 20 && powerManager.isScreenOn()));
            arrayList.add(new C1230b(str, sb.toString(), C1246a.Boolean.getType()));
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
        return scron.class.getSimpleName();
    }

    private static boolean isScreenOn() {
        PowerManager powerManager = (PowerManager) C1247e.getContext().getSystemService("power");
        return (VERSION.SDK_INT >= 20 && powerManager.isInteractive()) || (VERSION.SDK_INT < 20 && powerManager.isScreenOn());
    }
}
