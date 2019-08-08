package com.truenet.android;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.appnext.core.p049a.C1305b;
import com.facebook.ads.AdError;
import com.truenet.android.p198a.C5581i;
import java.io.BufferedReader;
import java.io.InputStream;
import java.net.HttpCookie;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0041c;
import p000a.p001a.C0046d;
import p000a.p001a.C0073h;
import p000a.p001a.p002a.C0007g;
import p000a.p001a.p003b.p004a.C0022a;
import p000a.p001a.p003b.p005b.C0032h;
import p000a.p001a.p003b.p005b.C0033i;
import p000a.p001a.p003b.p005b.C0035k;
import p000a.p001a.p003b.p005b.C0036l;
import p000a.p001a.p003b.p005b.C0037m.C0038a;
import p000a.p001a.p003b.p005b.C0039n;
import p000a.p001a.p007d.C0051e;
import p000a.p001a.p008e.C0055b;
import p000a.p001a.p008e.C0059c;

/* renamed from: com.truenet.android.b */
public final class C5585b {

    /* renamed from: a */
    static final /* synthetic */ C0051e[] f17680a = {C0039n.m52a((C0035k) new C0036l(C0039n.m50a(C5585b.class), "queue", "getQueue()Ljava/util/concurrent/SynchronousQueue;")), C0039n.m52a((C0035k) new C0036l(C0039n.m50a(C5585b.class), "webView", "getWebView()Landroid/webkit/WebView;"))};

    /* renamed from: b */
    public static final C5586a f17681b = new C5586a(null);
    /* access modifiers changed from: private */

    /* renamed from: n */
    public static final String f17682n = f17681b.getClass().getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static final C0055b f17683o = new C0055b("^\\w+(://){1}.+$");
    @Nullable

    /* renamed from: c */
    private Bitmap f17684c;

    /* renamed from: d */
    private long f17685d;
    @NotNull

    /* renamed from: e */
    private String f17686e = this.f17692k;
    @Nullable

    /* renamed from: f */
    private String f17687f;

    /* renamed from: g */
    private final List<C5587b> f17688g = new ArrayList();

    /* renamed from: h */
    private final C0041c f17689h = C0046d.m61a(C5592f.f17710a);

    /* renamed from: i */
    private final C0041c f17690i = C0046d.m61a(new C5593g(this));
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final Context f17691j;

    /* renamed from: k */
    private final String f17692k;

    /* renamed from: l */
    private final int f17693l;

    /* renamed from: m */
    private final long f17694m;

    /* renamed from: com.truenet.android.b$a */
    public static final class C5586a {
        private C5586a() {
        }

        public /* synthetic */ C5586a(C0029e eVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final boolean m23779a(String str) {
            if (!C0059c.m65a(str, "http://play.google.com", false, 2, null) && !C0059c.m65a(str, "https://play.google.com", false, 2, null) && !C0059c.m65a(str, "http://itunes.apple.com", false, 2, null) && !C0059c.m65a(str, "https://itunes.apple.com", false, 2, null)) {
                return !C0059c.m65a(str, "http://", false, 2, null) && !C0059c.m65a(str, "https://", false, 2, null) && C5585b.f17683o.mo70a(str);
            }
            return true;
        }
    }

    /* renamed from: com.truenet.android.b$b */
    public static final class C5587b {
        @NotNull

        /* renamed from: a */
        private final String f17695a;

        /* renamed from: b */
        private final long f17696b;

        /* renamed from: c */
        private final int f17697c;
        @Nullable

        /* renamed from: d */
        private final List<String> f17698d;
        @Nullable

        /* renamed from: e */
        private final String f17699e;
        @Nullable

        /* renamed from: f */
        private final String f17700f;

        public C5587b(@NotNull String str, long j, int i, @Nullable List<String> list, @Nullable String str2, @Nullable String str3) {
            C0032h.m45b(str, "url");
            this.f17695a = str;
            this.f17696b = j;
            this.f17697c = i;
            this.f17698d = list;
            this.f17699e = str2;
            this.f17700f = str3;
        }

        public /* synthetic */ C5587b(String str, long j, int i, List list, String str2, String str3, int i2, C0029e eVar) {
            this(str, j, i, list, str2, (i2 & 32) != 0 ? null : str3);
        }

        /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<java.lang.String>, for r10v0, types: [java.util.List] */
        @org.jetbrains.annotations.NotNull
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static /* synthetic */ com.truenet.android.C5585b.C5587b m23780a(com.truenet.android.C5585b.C5587b r5, java.lang.String r6, long r7, int r9, java.util.List<java.lang.String> r10, java.lang.String r11, java.lang.String r12, int r13, java.lang.Object r14) {
            /*
                r14 = r13 & 1
                if (r14 == 0) goto L_0x0006
                java.lang.String r6 = r5.f17695a
            L_0x0006:
                r14 = r13 & 2
                if (r14 == 0) goto L_0x000c
                long r7 = r5.f17696b
            L_0x000c:
                r0 = r7
                r7 = r13 & 4
                if (r7 == 0) goto L_0x0013
                int r9 = r5.f17697c
            L_0x0013:
                r14 = r9
                r7 = r13 & 8
                if (r7 == 0) goto L_0x001a
                java.util.List<java.lang.String> r10 = r5.f17698d
            L_0x001a:
                r2 = r10
                r7 = r13 & 16
                if (r7 == 0) goto L_0x0021
                java.lang.String r11 = r5.f17699e
            L_0x0021:
                r3 = r11
                r7 = r13 & 32
                if (r7 == 0) goto L_0x0028
                java.lang.String r12 = r5.f17700f
            L_0x0028:
                r4 = r12
                r7 = r5
                r8 = r6
                r9 = r0
                r11 = r14
                r12 = r2
                r13 = r3
                r14 = r4
                com.truenet.android.b$b r5 = r7.mo20694a(r8, r9, r11, r12, r13, r14)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.truenet.android.C5585b.C5587b.m23780a(com.truenet.android.b$b, java.lang.String, long, int, java.util.List, java.lang.String, java.lang.String, int, java.lang.Object):com.truenet.android.b$b");
        }

        @NotNull
        /* renamed from: a */
        public final C5587b mo20694a(@NotNull String str, long j, int i, @Nullable List<String> list, @Nullable String str2, @Nullable String str3) {
            String str4 = str;
            C0032h.m45b(str4, "url");
            C5587b bVar = new C5587b(str4, j, i, list, str2, str3);
            return bVar;
        }

        @NotNull
        /* renamed from: a */
        public final String mo20695a() {
            return this.f17695a;
        }

        /* renamed from: b */
        public final long mo20696b() {
            return this.f17696b;
        }

        /* renamed from: c */
        public final int mo20697c() {
            return this.f17697c;
        }

        @Nullable
        /* renamed from: d */
        public final List<String> mo20698d() {
            return this.f17698d;
        }

        @Nullable
        /* renamed from: e */
        public final String mo20699e() {
            return this.f17699e;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C5587b) {
                C5587b bVar = (C5587b) obj;
                if (C0032h.m44a((Object) this.f17695a, (Object) bVar.f17695a)) {
                    if (this.f17696b == bVar.f17696b) {
                        return (this.f17697c == bVar.f17697c) && C0032h.m44a((Object) this.f17698d, (Object) bVar.f17698d) && C0032h.m44a((Object) this.f17699e, (Object) bVar.f17699e) && C0032h.m44a((Object) this.f17700f, (Object) bVar.f17700f);
                    }
                }
            }
        }

        @Nullable
        /* renamed from: f */
        public final String mo20701f() {
            return this.f17700f;
        }

        public int hashCode() {
            String str = this.f17695a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            long j = this.f17696b;
            int i2 = (((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.f17697c) * 31;
            List<String> list = this.f17698d;
            int hashCode2 = (i2 + (list != null ? list.hashCode() : 0)) * 31;
            String str2 = this.f17699e;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f17700f;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return hashCode3 + i;
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ConnectionInfo(url=");
            sb.append(this.f17695a);
            sb.append(", loadTime=");
            sb.append(this.f17696b);
            sb.append(", httpCode=");
            sb.append(this.f17697c);
            sb.append(", cookie=");
            sb.append(this.f17698d);
            sb.append(", redirectUrl=");
            sb.append(this.f17699e);
            sb.append(", error=");
            sb.append(this.f17700f);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.truenet.android.b$c */
    public final class C5588c extends WebViewClient {

        /* renamed from: b */
        private ScheduledExecutorService f17702b = Executors.newScheduledThreadPool(1);

        /* renamed from: c */
        private ScheduledFuture<?> f17703c;

        /* renamed from: com.truenet.android.b$c$a */
        static final class C5589a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C5588c f17704a;

            C5589a(C5588c cVar) {
                this.f17704a = cVar;
            }

            public final void run() {
                C5585b.this.m23769j().offer("");
            }
        }

        public C5588c() {
        }

        /* renamed from: a */
        private final void m23788a() {
            ScheduledFuture<?> scheduledFuture = this.f17703c;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.f17703c = null;
        }

        /* renamed from: a */
        private final void m23789a(WebView webView, String str) {
            m23788a();
            if (str != null) {
                if (webView != null) {
                    webView.stopLoading();
                }
                C5585b.this.m23769j().offer(str);
            }
        }

        public void onPageFinished(@Nullable WebView webView, @Nullable String str) {
            m23788a();
            this.f17703c = this.f17702b.schedule(new C5589a(this), 1, TimeUnit.SECONDS);
            super.onPageFinished(webView, str);
        }

        public void onReceivedError(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest, @Nullable WebResourceError webResourceError) {
            m23788a();
            if (webView != null) {
                webView.stopLoading();
            }
            C5585b.this.m23769j().offer("");
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }

        @TargetApi(24)
        public boolean shouldOverrideUrlLoading(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest) {
            m23789a(webView, String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null));
            return true;
        }

        public boolean shouldOverrideUrlLoading(@Nullable WebView webView, @Nullable String str) {
            m23789a(webView, str);
            return true;
        }
    }

    /* renamed from: com.truenet.android.b$d */
    static final class C5590d extends C0033i implements C0022a<String> {

        /* renamed from: a */
        final /* synthetic */ C0038a f17705a;

        /* renamed from: b */
        final /* synthetic */ C0038a f17706b;

        C5590d(C0038a aVar, C0038a aVar2) {
            this.f17705a = aVar;
            this.f17706b = aVar2;
            super(0);
        }

        @Nullable
        /* renamed from: b */
        public final String mo45a() {
            this.f17705a.f11a = ((BufferedReader) this.f17706b.f11a).readLine();
            return (String) this.f17705a.f11a;
        }
    }

    /* renamed from: com.truenet.android.b$e */
    static final class C5591e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C5585b f17707a;

        /* renamed from: b */
        final /* synthetic */ String f17708b;

        /* renamed from: c */
        final /* synthetic */ C0038a f17709c;

        C5591e(C5585b bVar, String str, C0038a aVar) {
            this.f17707a = bVar;
            this.f17708b = str;
            this.f17709c = aVar;
        }

        public final void run() {
            WebView b = this.f17707a.m23770k();
            if (b != null) {
                b.loadDataWithBaseURL(this.f17708b, this.f17707a.mo20692f(), ((HttpURLConnection) this.f17709c.f11a).getContentType(), ((HttpURLConnection) this.f17709c.f11a).getContentEncoding(), null);
            }
        }
    }

    /* renamed from: com.truenet.android.b$f */
    static final class C5592f extends C0033i implements C0022a<SynchronousQueue<String>> {

        /* renamed from: a */
        public static final C5592f f17710a = new C5592f();

        C5592f() {
            super(0);
        }

        @NotNull
        /* renamed from: b */
        public final SynchronousQueue<String> mo45a() {
            return new SynchronousQueue<>();
        }
    }

    /* renamed from: com.truenet.android.b$g */
    static final class C5593g extends C0033i implements C0022a<WebView> {

        /* renamed from: a */
        final /* synthetic */ C5585b f17711a;

        C5593g(C5585b bVar) {
            this.f17711a = bVar;
            super(0);
        }

        @Nullable
        /* renamed from: b */
        public final WebView mo45a() {
            try {
                WebView webView = new WebView(this.f17711a.f17691j);
                if (VERSION.SDK_INT >= 11) {
                    webView.setLayerType(1, null);
                }
                WebSettings settings = webView.getSettings();
                C0032h.m42a((Object) settings, C1305b.f4125lS);
                settings.setJavaScriptEnabled(true);
                webView.setWebChromeClient(new WebChromeClient());
                webView.setWebViewClient(new C5588c());
                return webView;
            } catch (Exception e) {
                Log.e(C5585b.f17682n, e.getMessage());
                return null;
            }
        }
    }

    public C5585b(@NotNull Context context, @NotNull String str, int i, long j) {
        C0032h.m45b(context, "context");
        C0032h.m45b(str, "url");
        this.f17691j = context;
        this.f17692k = str;
        this.f17693l = i;
        this.f17694m = j;
    }

    /* renamed from: a */
    static /* synthetic */ C5587b m23760a(C5585b bVar, String str, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            list = null;
        }
        return bVar.m23761a(str, list);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private final C5587b m23761a(String str, List<String> list) {
        String str2;
        String str3 = str;
        this.f17687f = null;
        if (f17681b.m23779a(str3)) {
            C5587b bVar = new C5587b(str3, 0, 200, null, null, null, 32, null);
            return bVar;
        }
        C0038a aVar = new C0038a();
        aVar.f11a = (HttpURLConnection) null;
        try {
            URL url = new URL(str3);
            T openConnection = url.openConnection();
            if (openConnection == null) {
                throw new C0073h("null cannot be cast to non-null type java.net.HttpURLConnection");
            }
            T t = (HttpURLConnection) openConnection;
            boolean z = false;
            t.setInstanceFollowRedirects(false);
            t.setConnectTimeout(((int) this.f17694m) * AdError.NETWORK_ERROR_CODE);
            t.setReadTimeout(((int) this.f17694m) * AdError.NETWORK_ERROR_CODE);
            t.addRequestProperty("User-Agent", C5581i.f17675a.mo20685a(this.f17691j));
            if (list != null) {
                String str4 = "Cookie";
                CharSequence charSequence = ";";
                Iterable<String> iterable = list;
                Collection arrayList = new ArrayList(C0007g.m9a(iterable, 10));
                for (String parse : iterable) {
                    List parse2 = HttpCookie.parse(parse);
                    C0032h.m42a((Object) parse2, "HttpCookie.parse(value)");
                    arrayList.add((HttpCookie) C0007g.m14c(parse2));
                }
                t.setRequestProperty(str4, TextUtils.join(charSequence, (List) arrayList));
            }
            aVar.f11a = t;
            long currentTimeMillis = System.currentTimeMillis();
            ((HttpURLConnection) aVar.f11a).connect();
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            String headerField = ((HttpURLConnection) aVar.f11a).getHeaderField("Location");
            if (headerField != null) {
                C0055b bVar2 = f17683o;
                C0032h.m42a((Object) headerField, "nextUrl");
                if (!bVar2.mo70a(headerField)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(url.getProtocol());
                    sb.append("://");
                    sb.append(url.getHost());
                    C0032h.m42a((Object) headerField, "nextUrl");
                    if (!C0059c.m65a(headerField, "/", false, 2, null)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append('/');
                        sb2.append(headerField);
                        headerField = sb2.toString();
                    }
                    sb.append(headerField);
                    headerField = sb.toString();
                }
                str2 = headerField;
            } else {
                str2 = null;
            }
            String str5 = str3;
            long j = currentTimeMillis2;
            C5587b bVar3 = new C5587b(str5, j, ((HttpURLConnection) aVar.f11a).getResponseCode(), (List) ((HttpURLConnection) aVar.f11a).getHeaderFields().get("Set-Cookie"), str2, null, 32, null);
            int responseCode = ((HttpURLConnection) aVar.f11a).getResponseCode();
            if (200 <= responseCode) {
                if (299 >= responseCode) {
                    InputStream inputStream = ((HttpURLConnection) aVar.f11a).getInputStream();
                    C0032h.m42a((Object) inputStream, "connection.inputStream");
                    this.f17687f = m23762a(inputStream);
                    long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis;
                    new Handler(Looper.getMainLooper()).post(new C5591e(this, str3, aVar));
                    String str6 = (String) m23769j().take();
                    C0032h.m42a((Object) str6, "jsRedirectUrl");
                    if (str6.length() == 0) {
                        z = true;
                    }
                    if (z) {
                        C5587b a = C5587b.m23780a(bVar3, null, currentTimeMillis3, 0, null, null, null, 61, null);
                        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f11a;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        return a;
                    }
                    C5587b a2 = C5587b.m23780a(bVar3, null, currentTimeMillis3, 0, null, str6, null, 45, null);
                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) aVar.f11a;
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                    return a2;
                }
            }
            if (300 <= responseCode && 399 >= responseCode) {
                HttpURLConnection httpURLConnection3 = (HttpURLConnection) aVar.f11a;
                if (httpURLConnection3 != null) {
                    httpURLConnection3.disconnect();
                }
                return bVar3;
            }
            C5587b a3 = C5587b.m23780a(bVar3, null, 0, 0, null, null, null, 47, null);
            HttpURLConnection httpURLConnection4 = (HttpURLConnection) aVar.f11a;
            if (httpURLConnection4 != null) {
                httpURLConnection4.disconnect();
            }
            return a3;
        } catch (Exception e) {
            C5587b bVar4 = new C5587b(str3, 0, -1, null, null, e.getMessage());
            HttpURLConnection httpURLConnection5 = (HttpURLConnection) aVar.f11a;
            if (httpURLConnection5 != null) {
                httpURLConnection5.disconnect();
            }
            return bVar4;
        } catch (Throwable th) {
            Throwable th2 = th;
            HttpURLConnection httpURLConnection6 = (HttpURLConnection) aVar.f11a;
            if (httpURLConnection6 != null) {
                httpURLConnection6.disconnect();
            }
            throw th2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0076 A[Catch:{ Throwable -> 0x007f }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007b A[Catch:{ Throwable -> 0x007f }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String m23762a(java.io.InputStream r7) {
        /*
            r6 = this;
            r0 = 0
            r1 = r0
            java.io.BufferedInputStream r1 = (java.io.BufferedInputStream) r1
            a.a.b.b.m$a r2 = new a.a.b.b.m$a
            r2.<init>()
            r3 = r0
            java.io.BufferedReader r3 = (java.io.BufferedReader) r3
            r2.f11a = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x006e }
            r3.<init>()     // Catch:{ all -> 0x006e }
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch:{ all -> 0x006e }
            r4.<init>(r7)     // Catch:{ all -> 0x006e }
            java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch:{ all -> 0x006c }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ all -> 0x006c }
            r5 = r4
            java.io.InputStream r5 = (java.io.InputStream) r5     // Catch:{ all -> 0x006c }
            r1.<init>(r5)     // Catch:{ all -> 0x006c }
            java.io.Reader r1 = (java.io.Reader) r1     // Catch:{ all -> 0x006c }
            r7.<init>(r1)     // Catch:{ all -> 0x006c }
            r2.f11a = r7     // Catch:{ all -> 0x006c }
            a.a.b.b.m$a r7 = new a.a.b.b.m$a     // Catch:{ all -> 0x006c }
            r7.<init>()     // Catch:{ all -> 0x006c }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x006c }
            r7.f11a = r0     // Catch:{ all -> 0x006c }
        L_0x0032:
            com.truenet.android.b$d r0 = new com.truenet.android.b$d     // Catch:{ all -> 0x006c }
            r0.<init>(r7, r2)     // Catch:{ all -> 0x006c }
            a.a.b.a.a r0 = (p000a.p001a.p003b.p004a.C0022a) r0     // Catch:{ all -> 0x006c }
            java.lang.Object r0 = r0.mo45a()     // Catch:{ all -> 0x006c }
            if (r0 == 0) goto L_0x0047
            T r0 = r7.f11a     // Catch:{ all -> 0x006c }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x006c }
            r3.append(r0)     // Catch:{ all -> 0x006c }
            goto L_0x0032
        L_0x0047:
            java.lang.String r7 = r3.toString()     // Catch:{ all -> 0x006c }
            java.lang.String r0 = "result.toString()"
            p000a.p001a.p003b.p005b.C0032h.m42a(r7, r0)     // Catch:{ all -> 0x006c }
            T r0 = r2.f11a     // Catch:{ Throwable -> 0x005d }
            java.io.BufferedReader r0 = (java.io.BufferedReader) r0     // Catch:{ Throwable -> 0x005d }
            if (r0 == 0) goto L_0x0059
            r0.close()     // Catch:{ Throwable -> 0x005d }
        L_0x0059:
            r4.close()     // Catch:{ Throwable -> 0x005d }
            return r7
        L_0x005d:
            r0 = move-exception
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getCanonicalName()
            java.lang.String r2 = "stream closed with error!"
            android.util.Log.e(r1, r2, r0)
            return r7
        L_0x006c:
            r7 = move-exception
            goto L_0x0070
        L_0x006e:
            r7 = move-exception
            r4 = r1
        L_0x0070:
            T r0 = r2.f11a     // Catch:{ Throwable -> 0x007f }
            java.io.BufferedReader r0 = (java.io.BufferedReader) r0     // Catch:{ Throwable -> 0x007f }
            if (r0 == 0) goto L_0x0079
            r0.close()     // Catch:{ Throwable -> 0x007f }
        L_0x0079:
            if (r4 == 0) goto L_0x008d
            r4.close()     // Catch:{ Throwable -> 0x007f }
            goto L_0x008d
        L_0x007f:
            r0 = move-exception
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getCanonicalName()
            java.lang.String r2 = "stream closed with error!"
            android.util.Log.e(r1, r2, r0)
        L_0x008d:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.truenet.android.C5585b.m23762a(java.io.InputStream):java.lang.String");
    }

    /* renamed from: a */
    private final boolean m23764a(long j) {
        return (this.f17688g.size() < this.f17693l || this.f17693l == -1) && System.currentTimeMillis() - j < this.f17694m * ((long) AdError.NETWORK_ERROR_CODE);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final SynchronousQueue<String> m23769j() {
        C0041c cVar = this.f17689h;
        C0051e eVar = f17680a[0];
        return (SynchronousQueue) cVar.mo1a();
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final WebView m23770k() {
        C0041c cVar = this.f17690i;
        C0051e eVar = f17680a[1];
        return (WebView) cVar.mo1a();
    }

    @Nullable
    /* renamed from: a */
    public final Bitmap mo20687a() {
        return this.f17684c;
    }

    /* renamed from: b */
    public final int mo20688b() {
        return this.f17688g.size();
    }

    /* renamed from: c */
    public final long mo20689c() {
        return this.f17685d;
    }

    @NotNull
    /* renamed from: d */
    public final List<C5587b> mo20690d() {
        return C0007g.m11a((Iterable<? extends T>) this.f17688g);
    }

    @NotNull
    /* renamed from: e */
    public final String mo20691e() {
        return this.f17686e;
    }

    @Nullable
    /* renamed from: f */
    public final String mo20692f() {
        return this.f17687f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo20693g() {
        /*
            r9 = this;
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = r9.f17692k
            r3 = 0
            r4 = 2
            com.truenet.android.b$b r2 = m23760a(r9, r2, r3, r4, r3)
            if (r2 == 0) goto L_0x0084
        L_0x000e:
            java.util.List<com.truenet.android.b$b> r4 = r9.f17688g
            r4.add(r2)
        L_0x0013:
            if (r2 == 0) goto L_0x001a
            java.lang.String r4 = r2.mo20699e()
            goto L_0x001b
        L_0x001a:
            r4 = r3
        L_0x001b:
            if (r4 == 0) goto L_0x0037
            boolean r4 = r9.m23764a(r0)
            if (r4 == 0) goto L_0x0037
            java.lang.String r4 = r2.mo20699e()
            if (r4 != 0) goto L_0x002c
            p000a.p001a.p003b.p005b.C0032h.m41a()
        L_0x002c:
            java.util.List r2 = r2.mo20698d()
            com.truenet.android.b$b r2 = r9.m23761a(r4, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x000e
        L_0x0037:
            if (r2 == 0) goto L_0x0056
            r4 = 299(0x12b, float:4.19E-43)
            r5 = 200(0xc8, float:2.8E-43)
            int r2 = r2.mo20697c()
            if (r5 <= r2) goto L_0x0044
            goto L_0x0056
        L_0x0044:
            if (r4 < r2) goto L_0x0056
            java.lang.String r2 = r9.f17687f
            if (r2 == 0) goto L_0x0056
            android.webkit.WebView r2 = r9.m23770k()
            if (r2 == 0) goto L_0x0054
            android.graphics.Bitmap r3 = com.truenet.android.p198a.C5584j.m23759a(r2)
        L_0x0054:
            r9.f17684c = r3
        L_0x0056:
            java.util.List<com.truenet.android.b$b> r2 = r9.f17688g
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r3 = 0
            java.util.Iterator r2 = r2.iterator()
        L_0x0060:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0074
            java.lang.Object r5 = r2.next()
            com.truenet.android.b$b r5 = (com.truenet.android.C5585b.C5587b) r5
            long r5 = r5.mo20696b()
            long r7 = r3 + r5
            r3 = r7
            goto L_0x0060
        L_0x0074:
            r9.f17685d = r3
            java.util.List<com.truenet.android.b$b> r2 = r9.f17688g
            java.lang.Object r2 = p000a.p001a.p002a.C0007g.m16e(r2)
            com.truenet.android.b$b r2 = (com.truenet.android.C5585b.C5587b) r2
            java.lang.String r2 = r2.mo20695a()
            r9.f17686e = r2
        L_0x0084:
            java.util.List<com.truenet.android.b$b> r2 = r9.f17688g
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0094
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r2 - r0
            r9.f17685d = r4
        L_0x0094:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.truenet.android.C5585b.mo20693g():void");
    }
}
