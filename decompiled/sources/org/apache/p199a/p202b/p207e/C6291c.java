package org.apache.p199a.p202b.p207e;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import org.apache.p199a.C6565v;

/* renamed from: org.apache.a.b.e.c */
/* compiled from: URLEncodedUtils */
public class C6291c {
    /* renamed from: a */
    public static String m24909a(List<? extends C6565v> list, String str) {
        StringBuilder sb = new StringBuilder();
        for (C6565v vVar : list) {
            String a = m24908a(vVar.mo22961a(), str);
            String b = vVar.mo22962b();
            String a2 = b != null ? m24908a(b, str) : "";
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(a);
            sb.append("=");
            sb.append(a2);
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static String m24908a(String str, String str2) {
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
