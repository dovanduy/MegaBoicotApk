package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Map;
import org.apache.p199a.C6301c;
import org.apache.p199a.C6560q;
import org.apache.p199a.p208c.C6331f;

/* renamed from: com.google.android.gms.internal.ads.gc */
final class C3817gc extends C3844hc {

    /* renamed from: a */
    private final C4093qi f13140a;

    C3817gc(C4093qi qiVar) {
        this.f13140a = qiVar;
    }

    /* renamed from: a */
    public final C4065ph mo15318a(avm<?> avm, Map<String, String> map) throws IOException, C3631a {
        try {
            C6560q b = this.f13140a.mo15360b(avm, map);
            int b2 = b.mo22937a().mo22430b();
            C6301c[] d = b.mo22913d();
            ArrayList arrayList = new ArrayList(d.length);
            for (C6301c cVar : d) {
                arrayList.add(new C3667app(cVar.mo22465c(), cVar.mo22466d()));
            }
            if (b.mo22939b() == null) {
                return new C4065ph(b2, arrayList);
            }
            long c = b.mo22939b().mo22650c();
            if (((long) ((int) c)) == c) {
                return new C4065ph(b2, arrayList, (int) b.mo22939b().mo22650c(), b.mo22939b().mo22473f());
            }
            StringBuilder sb = new StringBuilder(40);
            sb.append("Response too large: ");
            sb.append(c);
            throw new IOException(sb.toString());
        } catch (C6331f e) {
            throw new SocketTimeoutException(e.getMessage());
        }
    }
}
