package org.apache.p199a.p202b.p203a;

import java.io.UnsupportedEncodingException;
import java.util.List;
import org.apache.p199a.C6565v;
import org.apache.p199a.p202b.p207e.C6291c;
import org.apache.p199a.p215e.C6375f;

/* renamed from: org.apache.a.b.a.a */
/* compiled from: UrlEncodedFormEntity */
public class C6268a extends C6375f {
    public C6268a(List<? extends C6565v> list, String str) throws UnsupportedEncodingException {
        super(C6291c.m24909a(list, str), str);
        StringBuilder sb = new StringBuilder();
        sb.append("application/x-www-form-urlencoded; charset=");
        if (str == null) {
            str = "ISO-8859-1";
        }
        sb.append(str);
        mo22615a(sb.toString());
    }

    public C6268a(List<? extends C6565v> list) throws UnsupportedEncodingException {
        this(list, "ISO-8859-1");
    }
}
