package com.appnext.base.operations;

import android.os.Bundle;
import com.appnext.base.operations.imp.C1271cd;
import com.appnext.base.p042a.C1224a;
import com.appnext.base.p042a.p044b.C1231c;
import com.appnext.base.p042a.p045c.C1237d;

/* renamed from: com.appnext.base.operations.b */
public abstract class C1267b extends C1265a {
    /* access modifiers changed from: protected */
    /* renamed from: aY */
    public abstract String mo6018aY();

    /* access modifiers changed from: protected */
    /* renamed from: bE */
    public abstract boolean mo6019bE();

    /* access modifiers changed from: protected */
    /* renamed from: bv */
    public final boolean mo6005bv() {
        return false;
    }

    public C1267b(C1231c cVar, Bundle bundle, Object obj) {
        super(cVar, bundle, obj);
    }

    /* renamed from: bx */
    public void mo6007bx() {
        if (mo6019bE()) {
            mo6001bq();
        }
    }

    /* renamed from: bD */
    protected static boolean m5382bD() {
        try {
            C1231c ac = C1224a.m5161aN().mo5888aR().mo5929ac(C1271cd.class.getSimpleName());
            if (ac != null) {
                return ac.mo5905bb().equalsIgnoreCase("on");
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: bw */
    public final C1237d mo6006bw() {
        return C1224a.m5161aN().mo5889aS();
    }
}
