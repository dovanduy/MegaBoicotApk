package com.facebook.ads.internal.p095v.p096a;

import android.os.Build.VERSION;
import com.facebook.ads.AdError;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: com.facebook.ads.internal.v.a.a */
public class C1855a {

    /* renamed from: f */
    private static int[] f5903f = new int[20];

    /* renamed from: g */
    private static final String f5904g = "a";

    /* renamed from: j */
    private static C1857a f5905j;

    /* renamed from: a */
    protected final C1873q f5906a = new C1862f() {
    };

    /* renamed from: b */
    protected final C1860d f5907b = new C1861e();

    /* renamed from: c */
    protected C1874r f5908c = new C1863g();

    /* renamed from: d */
    protected int f5909d = 2000;

    /* renamed from: e */
    protected int f5910e = 8000;

    /* renamed from: h */
    private int f5911h = 3;

    /* renamed from: i */
    private Map<String, String> f5912i = new TreeMap();

    /* renamed from: k */
    private boolean f5913k;

    /* renamed from: l */
    private Set<String> f5914l;

    /* renamed from: m */
    private Set<String> f5915m;

    /* renamed from: com.facebook.ads.internal.v.a.a$a */
    public interface C1857a {
        /* renamed from: a */
        Map<String, String> mo7623a();
    }

    static {
        if (VERSION.SDK_INT < 8) {
            System.setProperty("http.keepAlive", "false");
        }
        if (VERSION.SDK_INT > 8 && CookieHandler.getDefault() == null) {
            CookieHandler.setDefault(new CookieManager());
        }
    }

    /* renamed from: a */
    public static synchronized void m7794a(C1857a aVar) {
        synchronized (C1855a.class) {
            f5905j = aVar;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo7836a(int i) {
        return AdError.NETWORK_ERROR_CODE * f5903f[i + 2];
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x001f A[SYNTHETIC, Splitter:B:17:0x001f] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo7837a(java.net.HttpURLConnection r3, byte[] r4) {
        /*
            r2 = this;
            r0 = 0
            com.facebook.ads.internal.v.a.q r1 = r2.f5906a     // Catch:{ all -> 0x001b }
            java.io.OutputStream r1 = r1.mo7862a(r3)     // Catch:{ all -> 0x001b }
            if (r1 == 0) goto L_0x0011
            com.facebook.ads.internal.v.a.q r0 = r2.f5906a     // Catch:{ all -> 0x000f }
            r0.mo7864a(r1, r4)     // Catch:{ all -> 0x000f }
            goto L_0x0011
        L_0x000f:
            r3 = move-exception
            goto L_0x001d
        L_0x0011:
            int r3 = r3.getResponseCode()     // Catch:{ all -> 0x000f }
            if (r1 == 0) goto L_0x001a
            r1.close()     // Catch:{ Exception -> 0x001a }
        L_0x001a:
            return r3
        L_0x001b:
            r3 = move-exception
            r1 = r0
        L_0x001d:
            if (r1 == 0) goto L_0x0022
            r1.close()     // Catch:{ Exception -> 0x0022 }
        L_0x0022:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.p095v.p096a.C1855a.mo7837a(java.net.HttpURLConnection, byte[]):int");
    }

    /* renamed from: a */
    public C1855a mo7838a(String str, String str2) {
        this.f5912i.put(str, str2);
        return this;
    }

    /* renamed from: a */
    public C1870n mo7839a(C1868l lVar) {
        long currentTimeMillis = System.currentTimeMillis();
        int i = 0;
        while (i < this.f5911h) {
            try {
                mo7858c(mo7836a(i));
                if (this.f5908c.mo7872a()) {
                    C1874r rVar = this.f5908c;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i + 1);
                    sb.append("of");
                    sb.append(this.f5911h);
                    sb.append(", trying ");
                    sb.append(lVar.mo7881a());
                    rVar.mo7870a(sb.toString());
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                try {
                    C1870n a = mo7840a(lVar.mo7881a(), lVar.mo7882b(), lVar.mo7883c(), lVar.mo7884d());
                    if (a != null) {
                        return a;
                    }
                    currentTimeMillis = currentTimeMillis2;
                    i++;
                } catch (C1869m e) {
                    long j = currentTimeMillis2;
                    e = e;
                    currentTimeMillis = j;
                    if (!mo7850a((Throwable) e, currentTimeMillis) && i < this.f5911h - 1) {
                        continue;
                        i++;
                    } else if (this.f5906a.mo7866a(e) || i >= this.f5911h - 1) {
                        throw e;
                    } else {
                        try {
                            Thread.sleep((long) this.f5909d);
                            i++;
                        } catch (InterruptedException unused) {
                            throw e;
                        }
                    }
                }
            } catch (C1869m e2) {
                e = e2;
                if (!mo7850a((Throwable) e, currentTimeMillis)) {
                }
                if (this.f5906a.mo7866a(e)) {
                }
                throw e;
            }
        }
        return null;
    }

    /* JADX INFO: used method not loaded: com.facebook.ads.internal.v.a.r.a(com.facebook.ads.internal.v.a.n):null, types can be incorrect */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:86|87|88|89|90) */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00d5, code lost:
        r7 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        r7.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x010e, code lost:
        throw new com.facebook.ads.internal.p095v.p096a.C1869m(r7, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0114, code lost:
        throw new com.facebook.ads.internal.p095v.p096a.C1869m(r7, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x011d, code lost:
        r5.f5908c.mo7869a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0124, code lost:
        r6.disconnect();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:86:0x0106 */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0124  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.facebook.ads.internal.p095v.p096a.C1870n mo7840a(java.lang.String r6, com.facebook.ads.internal.p095v.p096a.C1866j r7, java.lang.String r8, byte[] r9) {
        /*
            r5 = this;
            r0 = 0
            r1 = 0
            r5.f5913k = r0     // Catch:{ Exception -> 0x00dc, all -> 0x00d9 }
            java.net.HttpURLConnection r6 = r5.mo7845a(r6)     // Catch:{ Exception -> 0x00dc, all -> 0x00d9 }
            r5.mo7848a(r6, r7, r8)     // Catch:{ Exception -> 0x00d7 }
            java.util.Map<java.lang.String, java.lang.String> r7 = r5.f5912i     // Catch:{ Exception -> 0x00d7 }
            java.util.Set r7 = r7.keySet()     // Catch:{ Exception -> 0x00d7 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ Exception -> 0x00d7 }
        L_0x0015:
            boolean r8 = r7.hasNext()     // Catch:{ Exception -> 0x00d7 }
            if (r8 == 0) goto L_0x002d
            java.lang.Object r8 = r7.next()     // Catch:{ Exception -> 0x00d7 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x00d7 }
            java.util.Map<java.lang.String, java.lang.String> r2 = r5.f5912i     // Catch:{ Exception -> 0x00d7 }
            java.lang.Object r2 = r2.get(r8)     // Catch:{ Exception -> 0x00d7 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00d7 }
            r6.setRequestProperty(r8, r2)     // Catch:{ Exception -> 0x00d7 }
            goto L_0x0015
        L_0x002d:
            java.lang.Class<com.facebook.ads.internal.v.a.a> r7 = com.facebook.ads.internal.p095v.p096a.C1855a.class
            monitor-enter(r7)     // Catch:{ Exception -> 0x00d7 }
            com.facebook.ads.internal.v.a.a$a r8 = f5905j     // Catch:{ all -> 0x00d2 }
            if (r8 == 0) goto L_0x0058
            com.facebook.ads.internal.v.a.a$a r8 = f5905j     // Catch:{ all -> 0x00d2 }
            java.util.Map r8 = r8.mo7623a()     // Catch:{ all -> 0x00d2 }
            java.util.Set r2 = r8.keySet()     // Catch:{ all -> 0x00d2 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00d2 }
        L_0x0042:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x00d2 }
            if (r3 == 0) goto L_0x0058
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x00d2 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x00d2 }
            java.lang.Object r4 = r8.get(r3)     // Catch:{ all -> 0x00d2 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x00d2 }
            r6.setRequestProperty(r3, r4)     // Catch:{ all -> 0x00d2 }
            goto L_0x0042
        L_0x0058:
            monitor-exit(r7)     // Catch:{ all -> 0x00d2 }
            com.facebook.ads.internal.v.a.r r7 = r5.f5908c     // Catch:{ Exception -> 0x00d7 }
            boolean r7 = r7.mo7872a()     // Catch:{ Exception -> 0x00d7 }
            if (r7 == 0) goto L_0x0066
            com.facebook.ads.internal.v.a.r r7 = r5.f5908c     // Catch:{ Exception -> 0x00d7 }
            r7.mo7871a(r6, r9)     // Catch:{ Exception -> 0x00d7 }
        L_0x0066:
            r6.connect()     // Catch:{ Exception -> 0x00d7 }
            r7 = 1
            r5.f5913k = r7     // Catch:{ Exception -> 0x00d7 }
            java.util.Set<java.lang.String> r8 = r5.f5915m     // Catch:{ Exception -> 0x00d7 }
            if (r8 == 0) goto L_0x007a
            java.util.Set<java.lang.String> r8 = r5.f5915m     // Catch:{ Exception -> 0x00d7 }
            boolean r8 = r8.isEmpty()     // Catch:{ Exception -> 0x00d7 }
            if (r8 != 0) goto L_0x007a
            r8 = r7
            goto L_0x007b
        L_0x007a:
            r8 = r0
        L_0x007b:
            java.util.Set<java.lang.String> r2 = r5.f5914l     // Catch:{ Exception -> 0x00d7 }
            if (r2 == 0) goto L_0x0088
            java.util.Set<java.lang.String> r2 = r5.f5914l     // Catch:{ Exception -> 0x00d7 }
            boolean r2 = r2.isEmpty()     // Catch:{ Exception -> 0x00d7 }
            if (r2 != 0) goto L_0x0088
            goto L_0x0089
        L_0x0088:
            r7 = r0
        L_0x0089:
            boolean r0 = r6 instanceof javax.net.ssl.HttpsURLConnection     // Catch:{ Exception -> 0x00d7 }
            if (r0 == 0) goto L_0x00a4
            if (r8 != 0) goto L_0x0091
            if (r7 == 0) goto L_0x00a4
        L_0x0091:
            r7 = r6
            javax.net.ssl.HttpsURLConnection r7 = (javax.net.ssl.HttpsURLConnection) r7     // Catch:{ Exception -> 0x009c }
            java.util.Set<java.lang.String> r8 = r5.f5915m     // Catch:{ Exception -> 0x009c }
            java.util.Set<java.lang.String> r0 = r5.f5914l     // Catch:{ Exception -> 0x009c }
            com.facebook.ads.internal.p095v.p096a.C1871o.m7854a(r7, r8, r0)     // Catch:{ Exception -> 0x009c }
            goto L_0x00a4
        L_0x009c:
            r7 = move-exception
            java.lang.String r8 = f5904g     // Catch:{ Exception -> 0x00d7 }
            java.lang.String r0 = "Unable to validate SSL certificates."
            android.util.Log.e(r8, r0, r7)     // Catch:{ Exception -> 0x00d7 }
        L_0x00a4:
            boolean r7 = r6.getDoOutput()     // Catch:{ Exception -> 0x00d7 }
            if (r7 == 0) goto L_0x00af
            if (r9 == 0) goto L_0x00af
            r5.mo7837a(r6, r9)     // Catch:{ Exception -> 0x00d7 }
        L_0x00af:
            boolean r7 = r6.getDoInput()     // Catch:{ Exception -> 0x00d7 }
            if (r7 == 0) goto L_0x00ba
            com.facebook.ads.internal.v.a.n r7 = r5.mo7843a(r6)     // Catch:{ Exception -> 0x00d7 }
            goto L_0x00bf
        L_0x00ba:
            com.facebook.ads.internal.v.a.n r7 = new com.facebook.ads.internal.v.a.n     // Catch:{ Exception -> 0x00d7 }
            r7.<init>(r6, r1)     // Catch:{ Exception -> 0x00d7 }
        L_0x00bf:
            com.facebook.ads.internal.v.a.r r8 = r5.f5908c
            boolean r8 = r8.mo7872a()
            if (r8 == 0) goto L_0x00cc
            com.facebook.ads.internal.v.a.r r8 = r5.f5908c
            r8.mo7869a(r7)
        L_0x00cc:
            if (r6 == 0) goto L_0x00d1
            r6.disconnect()
        L_0x00d1:
            return r7
        L_0x00d2:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00d2 }
            throw r8     // Catch:{ Exception -> 0x00d7 }
        L_0x00d5:
            r7 = move-exception
            goto L_0x0115
        L_0x00d7:
            r7 = move-exception
            goto L_0x00de
        L_0x00d9:
            r7 = move-exception
            r6 = r1
            goto L_0x0115
        L_0x00dc:
            r7 = move-exception
            r6 = r1
        L_0x00de:
            com.facebook.ads.internal.v.a.n r8 = r5.mo7853b(r6)     // Catch:{ Exception -> 0x0106 }
            if (r8 == 0) goto L_0x0100
            int r9 = r8.mo7886a()     // Catch:{ all -> 0x00fd }
            if (r9 <= 0) goto L_0x0100
            com.facebook.ads.internal.v.a.r r7 = r5.f5908c
            boolean r7 = r7.mo7872a()
            if (r7 == 0) goto L_0x00f7
            com.facebook.ads.internal.v.a.r r7 = r5.f5908c
            r7.mo7869a(r8)
        L_0x00f7:
            if (r6 == 0) goto L_0x00fc
            r6.disconnect()
        L_0x00fc:
            return r8
        L_0x00fd:
            r7 = move-exception
            r1 = r8
            goto L_0x0115
        L_0x0100:
            com.facebook.ads.internal.v.a.m r9 = new com.facebook.ads.internal.v.a.m     // Catch:{ all -> 0x00fd }
            r9.<init>(r7, r8)     // Catch:{ all -> 0x00fd }
            throw r9     // Catch:{ all -> 0x00fd }
        L_0x0106:
            r7.printStackTrace()     // Catch:{ all -> 0x010f }
            com.facebook.ads.internal.v.a.m r8 = new com.facebook.ads.internal.v.a.m     // Catch:{ all -> 0x00d5 }
            r8.<init>(r7, r1)     // Catch:{ all -> 0x00d5 }
            throw r8     // Catch:{ all -> 0x00d5 }
        L_0x010f:
            com.facebook.ads.internal.v.a.m r8 = new com.facebook.ads.internal.v.a.m     // Catch:{ all -> 0x00d5 }
            r8.<init>(r7, r1)     // Catch:{ all -> 0x00d5 }
            throw r8     // Catch:{ all -> 0x00d5 }
        L_0x0115:
            com.facebook.ads.internal.v.a.r r8 = r5.f5908c
            boolean r8 = r8.mo7872a()
            if (r8 == 0) goto L_0x0122
            com.facebook.ads.internal.v.a.r r8 = r5.f5908c
            r8.mo7869a(r1)
        L_0x0122:
            if (r6 == 0) goto L_0x0127
            r6.disconnect()
        L_0x0127:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.p095v.p096a.C1855a.mo7840a(java.lang.String, com.facebook.ads.internal.v.a.j, java.lang.String, byte[]):com.facebook.ads.internal.v.a.n");
    }

    /* renamed from: a */
    public C1870n mo7841a(String str, C1872p pVar) {
        return mo7851b((C1868l) new C1865i(str, pVar));
    }

    /* renamed from: a */
    public C1870n mo7842a(String str, String str2, byte[] bArr) {
        return mo7851b((C1868l) new C1867k(str, null, str2, bArr));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0021 A[SYNTHETIC, Splitter:B:17:0x0021] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.facebook.ads.internal.p095v.p096a.C1870n mo7843a(java.net.HttpURLConnection r4) {
        /*
            r3 = this;
            r0 = 0
            com.facebook.ads.internal.v.a.q r1 = r3.f5906a     // Catch:{ all -> 0x001d }
            java.io.InputStream r1 = r1.mo7868b(r4)     // Catch:{ all -> 0x001d }
            if (r1 == 0) goto L_0x0012
            com.facebook.ads.internal.v.a.q r0 = r3.f5906a     // Catch:{ all -> 0x0010 }
            byte[] r0 = r0.mo7867a(r1)     // Catch:{ all -> 0x0010 }
            goto L_0x0012
        L_0x0010:
            r4 = move-exception
            goto L_0x001f
        L_0x0012:
            com.facebook.ads.internal.v.a.n r2 = new com.facebook.ads.internal.v.a.n     // Catch:{ all -> 0x0010 }
            r2.<init>(r4, r0)     // Catch:{ all -> 0x0010 }
            if (r1 == 0) goto L_0x001c
            r1.close()     // Catch:{ Exception -> 0x001c }
        L_0x001c:
            return r2
        L_0x001d:
            r4 = move-exception
            r1 = r0
        L_0x001f:
            if (r1 == 0) goto L_0x0024
            r1.close()     // Catch:{ Exception -> 0x0024 }
        L_0x0024:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.p095v.p096a.C1855a.mo7843a(java.net.HttpURLConnection):com.facebook.ads.internal.v.a.n");
    }

    /* renamed from: a */
    public C1872p mo7844a() {
        return new C1872p();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public HttpURLConnection mo7845a(String str) {
        try {
            new URL(str);
            return this.f5906a.mo7863a(str);
        } catch (MalformedURLException e) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" is not a valid URL");
            throw new IllegalArgumentException(sb.toString(), e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7846a(C1868l lVar, C1858b bVar) {
        this.f5907b.mo7861a(this, bVar).mo7860a(lVar);
    }

    /* renamed from: a */
    public void mo7847a(String str, C1872p pVar, C1858b bVar) {
        mo7846a((C1868l) new C1865i(str, pVar), bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7848a(HttpURLConnection httpURLConnection, C1866j jVar, String str) {
        httpURLConnection.setConnectTimeout(this.f5909d);
        httpURLConnection.setReadTimeout(this.f5910e);
        this.f5906a.mo7865a(httpURLConnection, jVar, str);
    }

    /* renamed from: a */
    public void mo7849a(Set<String> set) {
        this.f5915m = set;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo7850a(Throwable th, long j) {
        long currentTimeMillis = (System.currentTimeMillis() - j) + 10;
        if (this.f5908c.mo7872a()) {
            C1874r rVar = this.f5908c;
            StringBuilder sb = new StringBuilder();
            sb.append("ELAPSED TIME = ");
            sb.append(currentTimeMillis);
            sb.append(", CT = ");
            sb.append(this.f5909d);
            sb.append(", RT = ");
            sb.append(this.f5910e);
            rVar.mo7870a(sb.toString());
        }
        boolean z = false;
        if (this.f5913k) {
            if (currentTimeMillis >= ((long) this.f5910e)) {
                z = true;
            }
            return z;
        }
        if (currentTimeMillis >= ((long) this.f5909d)) {
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    public C1870n mo7851b(C1868l lVar) {
        try {
            return mo7840a(lVar.mo7881a(), lVar.mo7882b(), lVar.mo7883c(), lVar.mo7884d());
        } catch (C1869m e) {
            this.f5906a.mo7866a(e);
            return null;
        } catch (Exception e2) {
            this.f5906a.mo7866a(new C1869m(e2, null));
            return null;
        }
    }

    /* renamed from: b */
    public C1870n mo7852b(String str, C1872p pVar) {
        return mo7851b((C1868l) new C1867k(str, pVar));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x001f A[SYNTHETIC, Splitter:B:17:0x001f] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.facebook.ads.internal.p095v.p096a.C1870n mo7853b(java.net.HttpURLConnection r4) {
        /*
            r3 = this;
            r0 = 0
            java.io.InputStream r1 = r4.getErrorStream()     // Catch:{ all -> 0x001b }
            if (r1 == 0) goto L_0x0010
            com.facebook.ads.internal.v.a.q r0 = r3.f5906a     // Catch:{ all -> 0x000e }
            byte[] r0 = r0.mo7867a(r1)     // Catch:{ all -> 0x000e }
            goto L_0x0010
        L_0x000e:
            r4 = move-exception
            goto L_0x001d
        L_0x0010:
            com.facebook.ads.internal.v.a.n r2 = new com.facebook.ads.internal.v.a.n     // Catch:{ all -> 0x000e }
            r2.<init>(r4, r0)     // Catch:{ all -> 0x000e }
            if (r1 == 0) goto L_0x001a
            r1.close()     // Catch:{ Exception -> 0x001a }
        L_0x001a:
            return r2
        L_0x001b:
            r4 = move-exception
            r1 = r0
        L_0x001d:
            if (r1 == 0) goto L_0x0022
            r1.close()     // Catch:{ Exception -> 0x0022 }
        L_0x0022:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.p095v.p096a.C1855a.mo7853b(java.net.HttpURLConnection):com.facebook.ads.internal.v.a.n");
    }

    /* renamed from: b */
    public void mo7854b() {
        this.f5912i.clear();
    }

    /* renamed from: b */
    public void mo7855b(int i) {
        if (i < 1 || i > 18) {
            throw new IllegalArgumentException("Maximum retries must be between 1 and 18");
        }
        this.f5911h = i;
    }

    /* renamed from: b */
    public void mo7856b(String str, C1872p pVar, C1858b bVar) {
        mo7846a((C1868l) new C1867k(str, pVar), bVar);
    }

    /* renamed from: b */
    public void mo7857b(Set<String> set) {
        this.f5914l = set;
    }

    /* renamed from: c */
    public void mo7858c(int i) {
        this.f5909d = i;
    }

    /* renamed from: d */
    public void mo7859d(int i) {
        this.f5910e = i;
    }
}
