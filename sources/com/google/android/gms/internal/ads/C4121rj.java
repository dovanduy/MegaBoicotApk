package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C2793C;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.google.android.gms.internal.ads.rj */
public final class C4121rj extends C3844hc {

    /* renamed from: a */
    private final C4149sk f13944a;

    /* renamed from: b */
    private final SSLSocketFactory f13945b;

    public C4121rj() {
        this(null);
    }

    private C4121rj(C4149sk skVar) {
        this(null, null);
    }

    private C4121rj(C4149sk skVar, SSLSocketFactory sSLSocketFactory) {
        this.f13944a = null;
        this.f13945b = null;
    }

    /* renamed from: a */
    private static InputStream m17949a(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    /* renamed from: a */
    private static List<C3667app> m17950a(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                for (String app : (List) entry.getValue()) {
                    arrayList.add(new C3667app((String) entry.getKey(), app));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static void m17951a(HttpURLConnection httpURLConnection, avm<?> avm) throws IOException, C3631a {
        byte[] a = avm.mo14897a();
        if (a != null) {
            httpURLConnection.setDoOutput(true);
            String str = "Content-Type";
            String str2 = "application/x-www-form-urlencoded; charset=";
            String valueOf = String.valueOf(C2793C.UTF8_NAME);
            httpURLConnection.addRequestProperty(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.write(a);
            dataOutputStream.close();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ab, code lost:
        r8.setRequestMethod(r0);
        m17951a(r8, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b4, code lost:
        r8.setRequestMethod(r0);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C4065ph mo15318a(com.google.android.gms.internal.ads.avm<?> r7, java.util.Map<java.lang.String, java.lang.String> r8) throws java.io.IOException, com.google.android.gms.internal.ads.C3631a {
        /*
            r6 = this;
            java.lang.String r0 = r7.mo14904e()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Map r2 = r7.mo14898b()
            r1.putAll(r2)
            r1.putAll(r8)
            com.google.android.gms.internal.ads.sk r8 = r6.f13944a
            if (r8 == 0) goto L_0x003c
            com.google.android.gms.internal.ads.sk r8 = r6.f13944a
            java.lang.String r8 = r8.mo16052a(r0)
            if (r8 != 0) goto L_0x003d
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r8 = "URL blocked by rewriter: "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            if (r1 == 0) goto L_0x0032
            java.lang.String r8 = r8.concat(r0)
            goto L_0x0038
        L_0x0032:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r8)
            r8 = r0
        L_0x0038:
            r7.<init>(r8)
            throw r7
        L_0x003c:
            r8 = r0
        L_0x003d:
            java.net.URL r0 = new java.net.URL
            r0.<init>(r8)
            java.net.URLConnection r8 = r0.openConnection()
            java.net.HttpURLConnection r8 = (java.net.HttpURLConnection) r8
            boolean r2 = java.net.HttpURLConnection.getFollowRedirects()
            r8.setInstanceFollowRedirects(r2)
            int r2 = r7.mo14908i()
            r8.setConnectTimeout(r2)
            r8.setReadTimeout(r2)
            r2 = 0
            r8.setUseCaches(r2)
            r3 = 1
            r8.setDoInput(r3)
            java.lang.String r4 = "https"
            java.lang.String r0 = r0.getProtocol()
            r4.equals(r0)
            java.util.Set r0 = r1.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0072:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0088
            java.lang.Object r4 = r0.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r1.get(r4)
            java.lang.String r5 = (java.lang.String) r5
            r8.addRequestProperty(r4, r5)
            goto L_0x0072
        L_0x0088:
            int r0 = r7.mo14900c()
            switch(r0) {
                case -1: goto L_0x00b7;
                case 0: goto L_0x00b2;
                case 1: goto L_0x00a9;
                case 2: goto L_0x00a6;
                case 3: goto L_0x00a3;
                case 4: goto L_0x00a0;
                case 5: goto L_0x009d;
                case 6: goto L_0x009a;
                case 7: goto L_0x0097;
                default: goto L_0x008f;
            }
        L_0x008f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Unknown method type."
            r7.<init>(r8)
            throw r7
        L_0x0097:
            java.lang.String r0 = "PATCH"
            goto L_0x00ab
        L_0x009a:
            java.lang.String r0 = "TRACE"
            goto L_0x00b4
        L_0x009d:
            java.lang.String r0 = "OPTIONS"
            goto L_0x00b4
        L_0x00a0:
            java.lang.String r0 = "HEAD"
            goto L_0x00b4
        L_0x00a3:
            java.lang.String r0 = "DELETE"
            goto L_0x00b4
        L_0x00a6:
            java.lang.String r0 = "PUT"
            goto L_0x00ab
        L_0x00a9:
            java.lang.String r0 = "POST"
        L_0x00ab:
            r8.setRequestMethod(r0)
            m17951a(r8, r7)
            goto L_0x00b7
        L_0x00b2:
            java.lang.String r0 = "GET"
        L_0x00b4:
            r8.setRequestMethod(r0)
        L_0x00b7:
            int r0 = r8.getResponseCode()
            r1 = -1
            if (r0 != r1) goto L_0x00c6
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r8 = "Could not retrieve response code from HttpUrlConnection."
            r7.<init>(r8)
            throw r7
        L_0x00c6:
            int r7 = r7.mo14900c()
            r1 = 4
            if (r7 == r1) goto L_0x00de
            r7 = 100
            if (r7 > r0) goto L_0x00d5
            r7 = 200(0xc8, float:2.8E-43)
            if (r0 < r7) goto L_0x00de
        L_0x00d5:
            r7 = 204(0xcc, float:2.86E-43)
            if (r0 == r7) goto L_0x00de
            r7 = 304(0x130, float:4.26E-43)
            if (r0 == r7) goto L_0x00de
            r2 = r3
        L_0x00de:
            if (r2 != 0) goto L_0x00ee
            com.google.android.gms.internal.ads.ph r7 = new com.google.android.gms.internal.ads.ph
            java.util.Map r8 = r8.getHeaderFields()
            java.util.List r8 = m17950a(r8)
            r7.<init>(r0, r8)
            return r7
        L_0x00ee:
            com.google.android.gms.internal.ads.ph r7 = new com.google.android.gms.internal.ads.ph
            java.util.Map r1 = r8.getHeaderFields()
            java.util.List r1 = m17950a(r1)
            int r2 = r8.getContentLength()
            java.io.InputStream r8 = m17949a(r8)
            r7.<init>(r0, r1, r2, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4121rj.mo15318a(com.google.android.gms.internal.ads.avm, java.util.Map):com.google.android.gms.internal.ads.ph");
    }
}
