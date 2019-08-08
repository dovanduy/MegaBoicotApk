package com.appnext.base.services;

import android.content.Context;
import android.os.Bundle;
import com.appnext.base.operations.C1265a.C1266a;
import com.appnext.base.operations.C1268c;
import com.appnext.base.p042a.C1224a;
import com.appnext.base.p042a.p044b.C1231c;
import com.appnext.base.p046b.C1247e;
import com.appnext.base.p046b.C1251i;
import com.google.android.gms.ads.p135a.C2961a;
import com.google.android.gms.ads.p135a.C2961a.C2962a;

/* renamed from: com.appnext.base.services.b */
public final class C1284b {
    /* renamed from: a */
    public final void mo6050a(Context context, String str, String str2, Bundle bundle, Object obj, C1266a aVar) {
        try {
            C1251i.m5302ck().init(context.getApplicationContext());
            C1247e.init(context.getApplicationContext());
            C2962a a = C2961a.m10593a(context.getApplicationContext());
            if (a != null && a.mo12187b()) {
                C1251i.m5302ck().putBoolean(C1251i.f3980jC, true);
                m5548b(aVar);
                return;
            }
            C1231c ac = C1224a.m5161aN().mo5888aR().mo5929ac(str);
            if (ac == null) {
                m5548b(aVar);
            } else {
                C1268c.m5390bF().mo6021a(ac.getKey(), ac, bundle, obj, aVar);
            }
        } catch (Throwable unused) {
            m5548b(aVar);
        }
    }

    /* renamed from: b */
    private static void m5548b(C1266a aVar) {
        if (aVar != null) {
            try {
                aVar.mo6017bC();
            } catch (Throwable unused) {
            }
        }
    }
}
