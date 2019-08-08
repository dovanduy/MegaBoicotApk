package com.appnext.base.operations;

import android.os.Bundle;
import com.appnext.base.C1222a;
import com.appnext.base.C1222a.C1223a;
import com.appnext.base.p042a.p044b.C1231c;
import com.appnext.base.p046b.C1245d;
import com.appnext.base.p046b.C1245d.C1246a;
import com.appnext.base.p046b.C1259k;

/* renamed from: com.appnext.base.operations.d */
public abstract class C1269d extends C1265a {
    /* renamed from: by */
    public final void mo6008by() {
    }

    public C1269d(C1231c cVar, Bundle bundle, Object obj) {
        super(cVar, bundle, obj);
    }

    /* renamed from: bx */
    public final void mo6007bx() {
        boolean z = false;
        try {
            Object a = C1259k.m5329a(C1245d.f3962je, C1246a.Boolean);
            if (a != null && (a instanceof Boolean)) {
                z = !((Boolean) a).booleanValue();
            }
            if (mo6009bz()) {
                if (!z) {
                    mo6001bq();
                    return;
                }
            }
            mo5996a(new C1222a(C1223a.NoPermission$1d8b5b4a));
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: bB */
    public C1246a mo6000bB() {
        return C1246a.String;
    }
}
