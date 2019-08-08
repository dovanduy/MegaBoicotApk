package com.facebook.ads.internal.p095v.p097b.p098a;

import android.text.TextUtils;
import com.facebook.ads.internal.p095v.p097b.C1906m;

/* renamed from: com.facebook.ads.internal.v.b.a.f */
public class C1884f implements C1878c {
    /* renamed from: a */
    public String mo7917a(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        String substring = (lastIndexOf == -1 || lastIndexOf <= str.lastIndexOf(47) || (lastIndexOf + 2) + 4 <= str.length()) ? "" : str.substring(lastIndexOf + 1, str.length());
        String c = C1906m.m7950c(str);
        if (TextUtils.isEmpty(substring)) {
            return c;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(c);
        sb.append(".");
        sb.append(substring);
        return sb.toString();
    }
}
