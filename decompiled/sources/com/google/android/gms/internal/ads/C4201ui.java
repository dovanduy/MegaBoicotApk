package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;

/* renamed from: com.google.android.gms.internal.ads.ui */
public class C4201ui extends avm<String> {

    /* renamed from: a */
    private final Object f14099a = new Object();

    /* renamed from: b */
    private bdg<String> f14100b;

    public C4201ui(int i, String str, bdg<String> bdg, bcn bcn) {
        super(i, str, bcn);
        this.f14100b = bdg;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bbm<String> mo14892a(atl atl) {
        String str;
        try {
            byte[] bArr = atl.f12194b;
            String str2 = "ISO-8859-1";
            String str3 = (String) atl.f12195c.get("Content-Type");
            if (str3 != null) {
                String[] split = str3.split(";");
                int i = 1;
                while (true) {
                    if (i >= split.length) {
                        break;
                    }
                    String[] split2 = split[i].trim().split("=");
                    if (split2.length == 2 && split2[0].equals("charset")) {
                        str2 = split2[1];
                        break;
                    }
                    i++;
                }
            }
            str = new String(bArr, str2);
        } catch (UnsupportedEncodingException unused) {
            str = new String(atl.f12194b);
        }
        return bbm.m15927a(str, C4037og.m17522a(atl));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo14896a(String str) {
        bdg<String> bdg;
        synchronized (this.f14099a) {
            bdg = this.f14100b;
        }
        if (bdg != null) {
            bdg.mo15176a(str);
        }
    }
}
