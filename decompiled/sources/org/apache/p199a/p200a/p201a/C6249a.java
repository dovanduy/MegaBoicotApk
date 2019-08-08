package org.apache.p199a.p200a.p201a;

import com.google.android.exoplayer2.C2793C;
import org.apache.p199a.p227i.C6531d;

/* renamed from: org.apache.a.a.a.a */
/* compiled from: AuthParams */
public final class C6249a {
    /* renamed from: a */
    public static String m24827a(C6531d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        String str = (String) dVar.mo22751a("http.auth.credential-charset");
        return str == null ? C2793C.ASCII_NAME : str;
    }
}
