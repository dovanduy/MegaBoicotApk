package com.appnext.base.operations;

import android.os.Bundle;
import com.appnext.base.operations.C1265a.C1266a;
import com.appnext.base.p042a.p044b.C1231c;
import com.appnext.base.p046b.C1251i;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.appnext.base.operations.c */
public class C1268c {

    /* renamed from: hk */
    private static final String f4016hk = "com.appnext.base.operations.imp";

    /* renamed from: hl */
    private static volatile C1268c f4017hl;

    /* renamed from: hm */
    private List<C1265a> f4018hm = new ArrayList();

    /* renamed from: bF */
    public static C1268c m5390bF() {
        if (f4017hl == null) {
            synchronized (C1268c.class) {
                if (f4017hl == null) {
                    f4017hl = new C1268c();
                }
            }
        }
        return f4017hl;
    }

    private C1268c() {
    }

    /* renamed from: a */
    private static C1265a m5388a(String str, C1231c cVar, Bundle bundle, Object obj) {
        if (cVar == null) {
            return null;
        }
        try {
            Object newInstance = Class.forName(m5389ak(str)).getConstructor(new Class[]{C1231c.class, Bundle.class, Object.class}).newInstance(new Object[]{cVar, bundle, obj});
            if (newInstance instanceof C1265a) {
                return (C1265a) newInstance;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* renamed from: a */
    public final void mo6021a(String str, C1231c cVar, Bundle bundle, Object obj, C1266a aVar) {
        if (cVar != null) {
            try {
                C1265a a = m5388a(str, cVar, bundle, obj);
                if (a != null) {
                    synchronized (this) {
                        this.f4018hm.add(a);
                    }
                    a.mo5997a(aVar);
                    C1251i ck = C1251i.m5302ck();
                    StringBuilder sb = new StringBuilder();
                    sb.append(cVar.getKey());
                    sb.append(C1251i.f3983jv);
                    ck.putLong(sb.toString(), System.currentTimeMillis());
                    a.mo6007bx();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public final void mo6022b(String str, C1231c cVar, Bundle bundle, Object obj) {
        if (cVar != null) {
            try {
                C1265a a = m5388a(str, cVar, null, null);
                if (a != null) {
                    a.cancel();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo6020a(C1265a aVar) {
        aVar.mo6008by();
        synchronized (this) {
            this.f4018hm.remove(aVar);
        }
    }

    /* renamed from: bG */
    public final void mo6023bG() {
        synchronized (this) {
            for (C1265a by : this.f4018hm) {
                by.mo6008by();
            }
            this.f4018hm.clear();
        }
    }

    /* renamed from: ak */
    public static String m5389ak(String str) {
        StringBuilder sb = new StringBuilder("com.appnext.base.operations.imp.");
        sb.append(str);
        return sb.toString();
    }
}
