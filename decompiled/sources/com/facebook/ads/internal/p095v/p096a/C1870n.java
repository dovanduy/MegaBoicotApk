package com.facebook.ads.internal.p095v.p096a;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.v.a.n */
public class C1870n {

    /* renamed from: a */
    private int f5932a;

    /* renamed from: b */
    private String f5933b;

    /* renamed from: c */
    private Map<String, List<String>> f5934c;

    /* renamed from: d */
    private byte[] f5935d;

    public C1870n(HttpURLConnection httpURLConnection, byte[] bArr) {
        try {
            this.f5932a = httpURLConnection.getResponseCode();
            this.f5933b = httpURLConnection.getURL().toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.f5934c = httpURLConnection.getHeaderFields();
        this.f5935d = bArr;
    }

    /* renamed from: a */
    public int mo7886a() {
        return this.f5932a;
    }

    /* renamed from: b */
    public String mo7887b() {
        return this.f5933b;
    }

    /* renamed from: c */
    public Map<String, List<String>> mo7888c() {
        return this.f5934c;
    }

    /* renamed from: d */
    public byte[] mo7889d() {
        return this.f5935d;
    }

    /* renamed from: e */
    public String mo7890e() {
        if (this.f5935d != null) {
            return new String(this.f5935d);
        }
        return null;
    }
}
