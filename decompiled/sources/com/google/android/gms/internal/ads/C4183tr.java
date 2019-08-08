package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.android.gms.internal.ads.tr */
public final class C4183tr {

    /* renamed from: a */
    private static final CopyOnWriteArrayList<C4182tq> f14080a = new CopyOnWriteArrayList<>();

    /* renamed from: a */
    public static C4182tq m18192a(String str) throws GeneralSecurityException {
        Iterator it = f14080a.iterator();
        while (it.hasNext()) {
            C4182tq tqVar = (C4182tq) it.next();
            if (tqVar.mo16086a(str)) {
                return tqVar;
            }
        }
        String str2 = "No KMS client does support: ";
        String valueOf = String.valueOf(str);
        throw new GeneralSecurityException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }
}
