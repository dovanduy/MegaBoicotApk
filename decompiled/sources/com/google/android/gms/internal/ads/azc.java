package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.internal.C3025aw;
import com.google.android.gms.ads.internal.gmsg.C3067ae;
import com.google.android.gms.common.util.C3564p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3718cm
public abstract class azc<ReferenceT> {

    /* renamed from: a */
    private final Map<String, CopyOnWriteArrayList<C3067ae<? super ReferenceT>>> f12436a = new HashMap();

    /* renamed from: a */
    private final synchronized void mo14986a(String str, Map<String, String> map) {
        if (C3900je.m17428a(2)) {
            String str2 = "Received GMSG: ";
            String valueOf = String.valueOf(str);
            C3900je.m17043a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            for (String str3 : map.keySet()) {
                String str4 = (String) map.get(str3);
                StringBuilder sb = new StringBuilder(4 + String.valueOf(str3).length() + String.valueOf(str4).length());
                sb.append("  ");
                sb.append(str3);
                sb.append(": ");
                sb.append(str4);
                C3900je.m17043a(sb.toString());
            }
        }
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f12436a.get(str);
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C4014nk.f13617a.execute(new azd(this, (C3067ae) it.next(), map));
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo15009a(String str, C3067ae<? super ReferenceT> aeVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f12436a.get(str);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            this.f12436a.put(str, copyOnWriteArrayList);
        }
        copyOnWriteArrayList.add(aeVar);
    }

    /* renamed from: a */
    public final synchronized void mo15010a(String str, C3564p<C3067ae<? super ReferenceT>> pVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f12436a.get(str);
        if (copyOnWriteArrayList != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C3067ae aeVar = (C3067ae) it.next();
                if (pVar.mo13697a(aeVar)) {
                    arrayList.add(aeVar);
                }
            }
            copyOnWriteArrayList.removeAll(arrayList);
        }
    }

    /* renamed from: a */
    public final boolean mo15011a(Uri uri) {
        if (!"gmsg".equalsIgnoreCase(uri.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            return false;
        }
        String path = uri.getPath();
        C3025aw.m10917e();
        mo14986a(path, C3909jn.m17133a(uri));
        return true;
    }

    /* renamed from: b */
    public final synchronized void mo15012b(String str, C3067ae<? super ReferenceT> aeVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f12436a.get(str);
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(aeVar);
        }
    }

    /* renamed from: k */
    public synchronized void mo15013k() {
        this.f12436a.clear();
    }

    /* renamed from: o */
    public abstract ReferenceT mo15000o();
}
