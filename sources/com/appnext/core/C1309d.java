package com.appnext.core;

import android.accounts.AccountManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.google.android.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.appnext.core.d */
public abstract class C1309d {
    /* access modifiers changed from: private */

    /* renamed from: jY */
    public static int f4134jY = 200;

    /* renamed from: jZ */
    protected final int f4135jZ = 0;

    /* renamed from: ka */
    protected final int f4136ka = 1;

    /* renamed from: kb */
    protected final int f4137kb = 2;

    /* renamed from: kc */
    protected final int f4138kc = 3;
    /* access modifiers changed from: private */

    /* renamed from: kd */
    public final HashMap<C1307b, C1301a> f4139kd = new HashMap<>();

    /* renamed from: com.appnext.core.d$a */
    public interface C1316a {
        /* renamed from: a */
        <T> void mo5540a(T t);

        void error(String str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo5551a(Context context, C1331g gVar);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo5554a(Context context, C1286Ad ad, String str, ArrayList<Pair<String, String>> arrayList);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo5555a(Context context, C1286Ad ad, C1301a aVar) throws Exception;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo5556a(C1286Ad ad, String str, String str2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract <T> void mo5558a(String str, C1286Ad ad, T t);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo5559a(Context context, C1286Ad ad, ArrayList<?> arrayList);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract C1345p mo5562d(C1286Ad ad);

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public int mo6229k() {
        return 8000;
    }

    /* renamed from: a */
    public void mo6217a(Context context, C1286Ad ad, String str, C1316a aVar) {
        mo6218a(context, ad, str, aVar, true);
    }

    /* renamed from: a */
    public final void mo6218a(Context context, C1286Ad ad, String str, C1316a aVar, boolean z) {
        final C1286Ad ad2 = ad;
        final Context context2 = context;
        final C1316a aVar2 = aVar;
        final String str2 = str;
        final boolean z2 = z;
        C13101 r1 = new Runnable() {
            public final void run() {
                try {
                    if (C1309d.this.mo5560a(ad2) || (C1309d.this.mo6223b(ad2) && C1309d.this.mo6225c(ad2))) {
                        C1309d.this.mo5555a(context2, ad2, C1309d.this.mo6230k(ad2));
                    }
                } catch (Throwable unused) {
                }
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public final void run() {
                        try {
                            if (C1309d.this.mo5560a(ad2) || (C1309d.this.mo6223b(ad2) && C1309d.this.mo6225c(ad2))) {
                                ArrayList ads = C1309d.this.mo6230k(ad2).getAds();
                                if (ads.size() == 0) {
                                    aVar2.error(AppnextError.NO_ADS);
                                    return;
                                } else if (C1309d.this.mo5559a(context2, ad2, ads)) {
                                    if (aVar2 != null) {
                                        aVar2.mo5540a(ads);
                                    }
                                    return;
                                } else {
                                    C1309d.this.mo6215U(str2);
                                }
                            }
                        } catch (Throwable unused) {
                            if (aVar2 != null) {
                                aVar2.error(AppnextError.NO_ADS);
                            }
                        }
                        try {
                            if (!C1326f.m5683cD().equals("")) {
                                C1309d.this.m5603b(context2, ad2, str2, aVar2, z2);
                                return;
                            }
                            C1326f.m5697t(context2);
                            C1309d.this.m5603b(context2, ad2, str2, aVar2, z2);
                        } catch (Throwable unused2) {
                            if (aVar2 != null) {
                                aVar2.error(AppnextError.NO_ADS);
                            }
                        }
                    }
                });
            }
        };
        new Thread(r1).start();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m5603b(Context context, C1286Ad ad, String str, C1316a aVar, boolean z) {
        final C1286Ad ad2 = ad;
        final Context context2 = context;
        final C1316a aVar2 = aVar;
        final String str2 = str;
        final boolean z2 = z;
        C13122 r0 = new Thread() {
            /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
                return;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:18:0x006b, code lost:
                r0 = 0;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
                r1 = new java.util.ArrayList();
                r2 = r7.f4148kf.mo5554a(r3, r2, r5, r1);
                new java.lang.StringBuilder("AdsManager request url: ").append(r2);
                r1 = com.appnext.core.C1326f.m5658a(r2, r1, r7.f4148kf.mo6229k());
             */
            /* JADX WARNING: Code restructure failed: missing block: B:24:0x0097, code lost:
                if (r1.equals("{}") != false) goto L_0x0138;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:26:0x009f, code lost:
                if (r7.f4148kf.mo6227f(r1) == false) goto L_0x00a3;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
                r2 = r7.f4148kf.mo6216a(r3, r2, r1, com.appnext.core.C1309d.m5597Q());
             */
            /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b1, code lost:
                if (r2 != null) goto L_0x00bd;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
                r7.f4148kf.mo6220a(com.appnext.core.AppnextError.NO_ADS, r1, r2);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bc, code lost:
                return;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c1, code lost:
                if (r2.size() != 0) goto L_0x00cd;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c3, code lost:
                r7.f4148kf.mo6222b(com.appnext.core.AppnextError.NO_ADS, r2);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:36:0x00cc, code lost:
                return;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cd, code lost:
                r7.f4148kf.mo6230k(r2).mo6192g(r2);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:38:0x00db, code lost:
                if (r6 == false) goto L_0x010c;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e7, code lost:
                if (r7.f4148kf.mo5559a(r3, r2, r2) != false) goto L_0x00f0;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e9, code lost:
                r7.f4148kf.mo6215U(r5);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f1, code lost:
                if (r0 >= 3) goto L_0x010c;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
                r7.f4148kf.mo5555a(r3, r2, r7.f4148kf.mo6230k(r2));
             */
            /* JADX WARNING: Code restructure failed: missing block: B:51:0x010c, code lost:
                r7.f4148kf.mo6230k(r2).setState(2);
                new android.os.Handler(android.os.Looper.getMainLooper()).post(new com.appnext.core.C1309d.C13122.C13131(r7));
             */
            /* JADX WARNING: Code restructure failed: missing block: B:52:0x0128, code lost:
                return;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:53:0x0129, code lost:
                r0 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:54:0x012a, code lost:
                r7.f4148kf.mo6220a(com.appnext.core.AppnextError.INTERNAL_ERROR, com.appnext.core.C1326f.m5677b(r0), r2);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:55:0x0137, code lost:
                return;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:56:0x0138, code lost:
                r7.f4148kf.mo6220a(com.appnext.core.AppnextError.NO_ADS, r1, r2);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:57:0x0141, code lost:
                return;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:58:0x0142, code lost:
                r0 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:59:0x0143, code lost:
                r7.f4148kf.mo6220a(com.appnext.core.AppnextError.INTERNAL_ERROR, com.appnext.core.C1326f.m5677b(r0), r2);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:60:0x0150, code lost:
                return;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:61:0x0151, code lost:
                r1 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:62:0x0152, code lost:
                r7.f4148kf.mo6221a(com.appnext.core.AppnextError.CONNECTION_ERROR, com.appnext.core.C1326f.m5677b((java.lang.Throwable) r1), r2, 0);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:63:0x015f, code lost:
                return;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:64:0x0160, code lost:
                r1 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:65:0x0161, code lost:
                r7.f4148kf.mo6221a(com.appnext.core.AppnextError.TIMEOUT, com.appnext.core.C1326f.m5677b((java.lang.Throwable) r1), r2, 0);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:66:0x016e, code lost:
                return;
             */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000e */
            /* JADX WARNING: Removed duplicated region for block: B:6:0x0015 A[SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r7 = this;
                    super.run()
                    com.appnext.core.Ad r0 = r2     // Catch:{ Throwable -> 0x000e }
                    android.content.Context r1 = r3     // Catch:{ Throwable -> 0x000e }
                    java.lang.String r1 = com.appnext.core.C1326f.m5702y(r1)     // Catch:{ Throwable -> 0x000e }
                    r0.setSessionId(r1)     // Catch:{ Throwable -> 0x000e }
                L_0x000e:
                    com.appnext.core.d r0 = com.appnext.core.C1309d.this     // Catch:{ Throwable -> 0x0172 }
                    java.util.HashMap r0 = r0.f4139kd     // Catch:{ Throwable -> 0x0172 }
                    monitor-enter(r0)     // Catch:{ Throwable -> 0x0172 }
                    com.appnext.core.d r1 = com.appnext.core.C1309d.this     // Catch:{ all -> 0x016f }
                    com.appnext.core.Ad r2 = r2     // Catch:{ all -> 0x016f }
                    com.appnext.core.a r1 = r1.mo6230k(r2)     // Catch:{ all -> 0x016f }
                    r2 = 1
                    if (r1 == 0) goto L_0x0041
                    com.appnext.core.d r1 = com.appnext.core.C1309d.this     // Catch:{ all -> 0x016f }
                    com.appnext.core.Ad r3 = r2     // Catch:{ all -> 0x016f }
                    com.appnext.core.a r1 = r1.mo6230k(r3)     // Catch:{ all -> 0x016f }
                    int r1 = r1.getState()     // Catch:{ all -> 0x016f }
                    if (r1 != r2) goto L_0x0041
                    com.appnext.core.d$a r1 = r4     // Catch:{ all -> 0x016f }
                    if (r1 == 0) goto L_0x003f
                    com.appnext.core.d r1 = com.appnext.core.C1309d.this     // Catch:{ all -> 0x016f }
                    com.appnext.core.Ad r2 = r2     // Catch:{ all -> 0x016f }
                    com.appnext.core.a r1 = r1.mo6230k(r2)     // Catch:{ all -> 0x016f }
                    com.appnext.core.d$a r2 = r4     // Catch:{ all -> 0x016f }
                    r1.mo6184a(r2)     // Catch:{ all -> 0x016f }
                L_0x003f:
                    monitor-exit(r0)     // Catch:{ all -> 0x016f }
                    return
                L_0x0041:
                    com.appnext.core.a r1 = new com.appnext.core.a     // Catch:{ all -> 0x016f }
                    r1.<init>()     // Catch:{ all -> 0x016f }
                    com.appnext.core.d$a r3 = r4     // Catch:{ all -> 0x016f }
                    r1.mo6184a(r3)     // Catch:{ all -> 0x016f }
                    java.lang.String r3 = r5     // Catch:{ all -> 0x016f }
                    r1.setPlacementID(r3)     // Catch:{ all -> 0x016f }
                    r1.setState(r2)     // Catch:{ all -> 0x016f }
                    com.appnext.core.d r2 = com.appnext.core.C1309d.this     // Catch:{ all -> 0x016f }
                    java.util.HashMap r2 = r2.f4139kd     // Catch:{ all -> 0x016f }
                    com.appnext.core.b r3 = new com.appnext.core.b     // Catch:{ all -> 0x016f }
                    com.appnext.core.Ad r4 = r2     // Catch:{ all -> 0x016f }
                    r3.<init>(r4)     // Catch:{ all -> 0x016f }
                    r2.remove(r3)     // Catch:{ all -> 0x016f }
                    com.appnext.core.d r2 = com.appnext.core.C1309d.this     // Catch:{ all -> 0x016f }
                    com.appnext.core.Ad r3 = r2     // Catch:{ all -> 0x016f }
                    r2.mo6219a(r3, r1)     // Catch:{ all -> 0x016f }
                    monitor-exit(r0)     // Catch:{ all -> 0x016f }
                    r0 = 0
                    java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ SocketTimeoutException -> 0x0160, UnknownHostException -> 0x0151, Throwable -> 0x0142 }
                    r1.<init>()     // Catch:{ SocketTimeoutException -> 0x0160, UnknownHostException -> 0x0151, Throwable -> 0x0142 }
                    com.appnext.core.d r2 = com.appnext.core.C1309d.this     // Catch:{ SocketTimeoutException -> 0x0160, UnknownHostException -> 0x0151, Throwable -> 0x0142 }
                    android.content.Context r3 = r3     // Catch:{ SocketTimeoutException -> 0x0160, UnknownHostException -> 0x0151, Throwable -> 0x0142 }
                    com.appnext.core.Ad r4 = r2     // Catch:{ SocketTimeoutException -> 0x0160, UnknownHostException -> 0x0151, Throwable -> 0x0142 }
                    java.lang.String r5 = r5     // Catch:{ SocketTimeoutException -> 0x0160, UnknownHostException -> 0x0151, Throwable -> 0x0142 }
                    java.lang.String r2 = r2.mo5554a(r3, r4, r5, r1)     // Catch:{ SocketTimeoutException -> 0x0160, UnknownHostException -> 0x0151, Throwable -> 0x0142 }
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x0160, UnknownHostException -> 0x0151, Throwable -> 0x0142 }
                    java.lang.String r4 = "AdsManager request url: "
                    r3.<init>(r4)     // Catch:{ SocketTimeoutException -> 0x0160, UnknownHostException -> 0x0151, Throwable -> 0x0142 }
                    r3.append(r2)     // Catch:{ SocketTimeoutException -> 0x0160, UnknownHostException -> 0x0151, Throwable -> 0x0142 }
                    com.appnext.core.d r3 = com.appnext.core.C1309d.this     // Catch:{ SocketTimeoutException -> 0x0160, UnknownHostException -> 0x0151, Throwable -> 0x0142 }
                    int r3 = r3.mo6229k()     // Catch:{ SocketTimeoutException -> 0x0160, UnknownHostException -> 0x0151, Throwable -> 0x0142 }
                    java.lang.String r1 = com.appnext.core.C1326f.m5658a(r2, r1, r3)     // Catch:{ SocketTimeoutException -> 0x0160, UnknownHostException -> 0x0151, Throwable -> 0x0142 }
                    java.lang.String r2 = "{}"
                    boolean r2 = r1.equals(r2)     // Catch:{ Throwable -> 0x0172 }
                    if (r2 != 0) goto L_0x0138
                    com.appnext.core.d r2 = com.appnext.core.C1309d.this     // Catch:{ Throwable -> 0x0172 }
                    boolean r2 = r2.mo6227f(r1)     // Catch:{ Throwable -> 0x0172 }
                    if (r2 == 0) goto L_0x00a3
                    goto L_0x0138
                L_0x00a3:
                    com.appnext.core.d r2 = com.appnext.core.C1309d.this     // Catch:{ Throwable -> 0x0129 }
                    android.content.Context r3 = r3     // Catch:{ Throwable -> 0x0129 }
                    com.appnext.core.Ad r4 = r2     // Catch:{ Throwable -> 0x0129 }
                    int r5 = com.appnext.core.C1309d.f4134jY     // Catch:{ Throwable -> 0x0129 }
                    java.util.ArrayList r2 = r2.mo6216a(r3, r4, r1, r5)     // Catch:{ Throwable -> 0x0129 }
                    if (r2 != 0) goto L_0x00bd
                    com.appnext.core.d r0 = com.appnext.core.C1309d.this     // Catch:{ Throwable -> 0x0172 }
                    java.lang.String r2 = "No Ads"
                    com.appnext.core.Ad r3 = r2     // Catch:{ Throwable -> 0x0172 }
                    r0.mo6220a(r2, r1, r3)     // Catch:{ Throwable -> 0x0172 }
                    return
                L_0x00bd:
                    int r1 = r2.size()     // Catch:{ Throwable -> 0x0172 }
                    if (r1 != 0) goto L_0x00cd
                    com.appnext.core.d r0 = com.appnext.core.C1309d.this     // Catch:{ Throwable -> 0x0172 }
                    java.lang.String r1 = "No Ads"
                    com.appnext.core.Ad r2 = r2     // Catch:{ Throwable -> 0x0172 }
                    r0.mo6222b(r1, r2)     // Catch:{ Throwable -> 0x0172 }
                    return
                L_0x00cd:
                    com.appnext.core.d r1 = com.appnext.core.C1309d.this     // Catch:{ Throwable -> 0x0172 }
                    com.appnext.core.Ad r3 = r2     // Catch:{ Throwable -> 0x0172 }
                    com.appnext.core.a r1 = r1.mo6230k(r3)     // Catch:{ Throwable -> 0x0172 }
                    r1.mo6192g(r2)     // Catch:{ Throwable -> 0x0172 }
                    boolean r1 = r6     // Catch:{ Throwable -> 0x0172 }
                    r3 = 2
                    if (r1 == 0) goto L_0x010c
                    com.appnext.core.d r1 = com.appnext.core.C1309d.this     // Catch:{ Throwable -> 0x0172 }
                    android.content.Context r4 = r3     // Catch:{ Throwable -> 0x0172 }
                    com.appnext.core.Ad r5 = r2     // Catch:{ Throwable -> 0x0172 }
                    boolean r1 = r1.mo5559a(r4, r5, r2)     // Catch:{ Throwable -> 0x0172 }
                    if (r1 != 0) goto L_0x00f0
                    com.appnext.core.d r1 = com.appnext.core.C1309d.this     // Catch:{ Throwable -> 0x0172 }
                    java.lang.String r2 = r5     // Catch:{ Throwable -> 0x0172 }
                    r1.mo6215U(r2)     // Catch:{ Throwable -> 0x0172 }
                L_0x00f0:
                    r1 = 3
                    if (r0 >= r1) goto L_0x010c
                    com.appnext.core.d r1 = com.appnext.core.C1309d.this     // Catch:{ Throwable -> 0x0105 }
                    android.content.Context r2 = r3     // Catch:{ Throwable -> 0x0105 }
                    com.appnext.core.Ad r4 = r2     // Catch:{ Throwable -> 0x0105 }
                    com.appnext.core.d r5 = com.appnext.core.C1309d.this     // Catch:{ Throwable -> 0x0105 }
                    com.appnext.core.Ad r6 = r2     // Catch:{ Throwable -> 0x0105 }
                    com.appnext.core.a r5 = r5.mo6230k(r6)     // Catch:{ Throwable -> 0x0105 }
                    r1.mo5555a(r2, r4, r5)     // Catch:{ Throwable -> 0x0105 }
                    goto L_0x010c
                L_0x0105:
                    r1 = move-exception
                    if (r0 != r3) goto L_0x0109
                    throw r1     // Catch:{ Throwable -> 0x0172 }
                L_0x0109:
                    int r0 = r0 + 1
                    goto L_0x00f0
                L_0x010c:
                    com.appnext.core.d r0 = com.appnext.core.C1309d.this     // Catch:{ Throwable -> 0x0172 }
                    com.appnext.core.Ad r1 = r2     // Catch:{ Throwable -> 0x0172 }
                    com.appnext.core.a r0 = r0.mo6230k(r1)     // Catch:{ Throwable -> 0x0172 }
                    r0.setState(r3)     // Catch:{ Throwable -> 0x0172 }
                    android.os.Handler r0 = new android.os.Handler     // Catch:{ Throwable -> 0x0172 }
                    android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch:{ Throwable -> 0x0172 }
                    r0.<init>(r1)     // Catch:{ Throwable -> 0x0172 }
                    com.appnext.core.d$2$1 r1 = new com.appnext.core.d$2$1     // Catch:{ Throwable -> 0x0172 }
                    r1.<init>()     // Catch:{ Throwable -> 0x0172 }
                    r0.post(r1)     // Catch:{ Throwable -> 0x0172 }
                    return
                L_0x0129:
                    r0 = move-exception
                    com.appnext.core.d r1 = com.appnext.core.C1309d.this     // Catch:{ Throwable -> 0x0172 }
                    java.lang.String r2 = "Internal error"
                    java.lang.String r0 = com.appnext.core.C1326f.m5677b(r0)     // Catch:{ Throwable -> 0x0172 }
                    com.appnext.core.Ad r3 = r2     // Catch:{ Throwable -> 0x0172 }
                    r1.mo6220a(r2, r0, r3)     // Catch:{ Throwable -> 0x0172 }
                    return
                L_0x0138:
                    com.appnext.core.d r0 = com.appnext.core.C1309d.this     // Catch:{ Throwable -> 0x0172 }
                    java.lang.String r2 = "No Ads"
                    com.appnext.core.Ad r3 = r2     // Catch:{ Throwable -> 0x0172 }
                    r0.mo6220a(r2, r1, r3)     // Catch:{ Throwable -> 0x0172 }
                    return
                L_0x0142:
                    r0 = move-exception
                    com.appnext.core.d r1 = com.appnext.core.C1309d.this     // Catch:{ Throwable -> 0x0172 }
                    java.lang.String r2 = "Internal error"
                    java.lang.String r0 = com.appnext.core.C1326f.m5677b(r0)     // Catch:{ Throwable -> 0x0172 }
                    com.appnext.core.Ad r3 = r2     // Catch:{ Throwable -> 0x0172 }
                    r1.mo6220a(r2, r0, r3)     // Catch:{ Throwable -> 0x0172 }
                    return
                L_0x0151:
                    r1 = move-exception
                    com.appnext.core.d r2 = com.appnext.core.C1309d.this     // Catch:{ Throwable -> 0x0172 }
                    java.lang.String r3 = "Connection Error"
                    java.lang.String r1 = com.appnext.core.C1326f.m5677b(r1)     // Catch:{ Throwable -> 0x0172 }
                    com.appnext.core.Ad r4 = r2     // Catch:{ Throwable -> 0x0172 }
                    r2.mo6221a(r3, r1, r4, r0)     // Catch:{ Throwable -> 0x0172 }
                    return
                L_0x0160:
                    r1 = move-exception
                    com.appnext.core.d r2 = com.appnext.core.C1309d.this     // Catch:{ Throwable -> 0x0172 }
                    java.lang.String r3 = "Timeout"
                    java.lang.String r1 = com.appnext.core.C1326f.m5677b(r1)     // Catch:{ Throwable -> 0x0172 }
                    com.appnext.core.Ad r4 = r2     // Catch:{ Throwable -> 0x0172 }
                    r2.mo6221a(r3, r1, r4, r0)     // Catch:{ Throwable -> 0x0172 }
                    return
                L_0x016f:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x016f }
                    throw r1     // Catch:{ Throwable -> 0x0172 }
                L_0x0172:
                    r0 = move-exception
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    java.lang.String r2 = "finished custom after load with error "
                    r1.<init>(r2)
                    java.lang.String r2 = com.appnext.core.C1326f.m5677b(r0)
                    r1.append(r2)
                    com.appnext.core.d r1 = com.appnext.core.C1309d.this
                    java.lang.String r0 = r0.getMessage()
                    com.appnext.core.Ad r2 = r2
                    r1.mo6222b(r0, r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.appnext.core.C1309d.C13122.run():void");
            }
        };
        r0.start();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo5560a(C1286Ad ad) {
        try {
            return mo6223b(ad) && mo6225c(ad);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo6223b(C1286Ad ad) {
        return (this.f4139kd == null || mo6230k(ad) == null || mo6230k(ad).getState() != 2 || mo6230k(ad).getAds() == null) ? false : true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo6225c(C1286Ad ad) {
        return mo6228j(ad) == 0 ? this.f4139kd != null && mo6230k(ad) != null && mo6230k(ad).getAds().size() == 0 && mo6230k(ad).mo6191cv().longValue() + ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS > System.currentTimeMillis() : (this.f4139kd == null || mo6230k(ad) == null || mo6230k(ad).mo6191cv().longValue() + mo6228j(ad) <= System.currentTimeMillis()) ? false : true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final long mo6228j(C1286Ad ad) {
        try {
            return mo5562d(ad).get("_cachingRequest") == null ? ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS * m5598a(ad, "ads_caching_time_minutes") : 1000 * m5598a(ad, "_cachingRequest");
        } catch (Throwable unused) {
            return ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS * m5598a(ad, "ads_caching_time_minutes");
        }
    }

    /* renamed from: a */
    private long m5598a(C1286Ad ad, String str) {
        return Long.valueOf(mo5562d(ad).get(str)).longValue();
    }

    /* renamed from: c */
    public final void mo6224c(Context context, C1286Ad ad, String str) {
        this.f4139kd.remove(new C1307b(ad));
        m5603b(context, ad, str, null, true);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0088, code lost:
        if (r13.getRevenueType().equals("cpc") != false) goto L_0x008a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList<? extends com.appnext.core.C1331g> mo6216a(android.content.Context r17, com.appnext.core.C1286Ad r18, java.lang.String r19, int r20) throws org.json.JSONException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r19
            r3 = r18
            com.appnext.core.a r4 = r0.mo6230k(r3)
            r4.mo6187aE(r2)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>(r2)
            java.lang.String r2 = "apps"
            org.json.JSONArray r2 = r6.getJSONArray(r2)
            r6 = 0
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
        L_0x002a:
            int r12 = r2.length()
            if (r7 >= r12) goto L_0x00bb
            org.json.JSONObject r12 = r2.getJSONObject(r7)
            java.lang.String r12 = r12.toString()     // Catch:{ Throwable -> 0x00b5 }
            com.appnext.core.g r12 = r0.parseAd(r12)     // Catch:{ Throwable -> 0x00b5 }
            com.appnext.core.AppnextAd r12 = (com.appnext.core.AppnextAd) r12     // Catch:{ Throwable -> 0x00b5 }
            int r13 = r4.size()     // Catch:{ Throwable -> 0x00b5 }
            r12.setAdID(r13)     // Catch:{ Throwable -> 0x00b5 }
            java.lang.String r13 = r18.getPlacementID()     // Catch:{ Throwable -> 0x00b5 }
            r12.setPlacementID(r13)     // Catch:{ Throwable -> 0x00b5 }
            int r13 = r0.mo5551a(r1, r12)     // Catch:{ Throwable -> 0x00b5 }
            if (r13 != 0) goto L_0x0094
            com.appnext.core.AppnextAd r13 = m5602b(r4, r12)     // Catch:{ Throwable -> 0x00b5 }
            if (r13 == 0) goto L_0x008e
            r4.remove(r13)     // Catch:{ Throwable -> 0x00b5 }
            java.lang.String r14 = r13.getRevenueType()     // Catch:{ Throwable -> 0x00b5 }
            java.lang.String r15 = r12.getRevenueType()     // Catch:{ Throwable -> 0x00b5 }
            boolean r14 = r14.equals(r15)     // Catch:{ Throwable -> 0x00b5 }
            if (r14 == 0) goto L_0x007e
            java.lang.String r14 = r13.getRevenueRate()     // Catch:{ Throwable -> 0x00b5 }
            float r14 = java.lang.Float.parseFloat(r14)     // Catch:{ Throwable -> 0x00b5 }
            java.lang.String r15 = r12.getRevenueRate()     // Catch:{ Throwable -> 0x00b5 }
            float r15 = java.lang.Float.parseFloat(r15)     // Catch:{ Throwable -> 0x00b5 }
            int r14 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r14 < 0) goto L_0x008b
            goto L_0x008a
        L_0x007e:
            java.lang.String r14 = r13.getRevenueType()     // Catch:{ Throwable -> 0x00b5 }
            java.lang.String r15 = "cpc"
            boolean r14 = r14.equals(r15)     // Catch:{ Throwable -> 0x00b5 }
            if (r14 == 0) goto L_0x008b
        L_0x008a:
            r12 = r13
        L_0x008b:
            int r11 = r11 + 1
            goto L_0x0090
        L_0x008e:
            int r8 = r8 + 1
        L_0x0090:
            r4.add(r12)     // Catch:{ Throwable -> 0x00b5 }
            goto L_0x00ac
        L_0x0094:
            java.lang.String r12 = r12.getBannerID()     // Catch:{ Throwable -> 0x00b5 }
            r5.append(r12)     // Catch:{ Throwable -> 0x00b5 }
            java.lang.String r12 = ","
            r5.append(r12)     // Catch:{ Throwable -> 0x00b5 }
            switch(r13) {
                case 1: goto L_0x00aa;
                case 2: goto L_0x00a7;
                case 3: goto L_0x00a4;
                default: goto L_0x00a3;
            }     // Catch:{ Throwable -> 0x00b5 }
        L_0x00a3:
            goto L_0x00ac
        L_0x00a4:
            int r11 = r11 + 1
            goto L_0x00ac
        L_0x00a7:
            int r10 = r10 + 1
            goto L_0x00ac
        L_0x00aa:
            int r9 = r9 + 1
        L_0x00ac:
            int r12 = r4.size()     // Catch:{ Throwable -> 0x00b5 }
            r13 = r20
            if (r12 != r13) goto L_0x00b7
            goto L_0x00bb
        L_0x00b5:
            r13 = r20
        L_0x00b7:
            int r7 = r7 + 1
            goto L_0x002a
        L_0x00bb:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Filtering values {count = "
            r2.<init>(r3)
            r2.append(r8)
            java.lang.String r3 = ", new filtered = "
            r2.append(r3)
            r2.append(r9)
            java.lang.String r3 = ", existing  filtered = "
            r2.append(r3)
            r2.append(r10)
            java.lang.String r3 = ",  other = "
            r2.append(r3)
            r2.append(r11)
            java.lang.Object r2 = r4.get(r6)
            com.appnext.core.AppnextAd r2 = (com.appnext.core.AppnextAd) r2
            r2.getSession()
            java.lang.Thread r2 = new java.lang.Thread
            com.appnext.core.d$3 r3 = new com.appnext.core.d$3
            r3.<init>(r5, r1)
            r2.<init>(r3)
            r2.start()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.core.C1309d.mo6216a(android.content.Context, com.appnext.core.Ad, java.lang.String, int):java.util.ArrayList");
    }

    /* renamed from: a */
    private static AppnextAd m5599a(AppnextAd appnextAd, AppnextAd appnextAd2) {
        return appnextAd.getRevenueType().equals(appnextAd2.getRevenueType()) ? Float.parseFloat(appnextAd.getRevenueRate()) < Float.parseFloat(appnextAd2.getRevenueRate()) ? appnextAd2 : appnextAd : appnextAd.getRevenueType().equals("cpc") ? appnextAd : appnextAd2;
    }

    /* renamed from: b */
    private static AppnextAd m5602b(ArrayList<AppnextAd> arrayList, AppnextAd appnextAd) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AppnextAd appnextAd2 = (AppnextAd) it.next();
            if (appnextAd2.getAdPackage().equals(appnextAd.getAdPackage())) {
                return appnextAd2;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo6227f(String str) {
        try {
            return new JSONObject(str).has("rnd");
        } catch (Throwable unused) {
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo5722d(ArrayList<AppnextAd> arrayList) {
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                jSONArray.put(new JSONObject(((AppnextAd) it.next()).getAdJSON()));
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("apps", jSONArray);
            return jSONObject.toString().replace(" ", "\\u2028").replace(" ", "\\u2029");
        } catch (Throwable unused) {
            return "";
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo6222b(String str, C1286Ad ad) {
        mo6220a(str, "", ad);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6220a(String str, String str2, C1286Ad ad) {
        mo6221a(str, str2, ad, 2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6221a(String str, String str2, C1286Ad ad, int i) {
        Handler handler = new Handler(Looper.getMainLooper());
        final C1286Ad ad2 = ad;
        final int i2 = i;
        final String str3 = str;
        final String str4 = str2;
        C13154 r2 = new Runnable() {
            public final void run() {
                C1301a k = C1309d.this.mo6230k(ad2);
                if (k != null) {
                    if (k.getAds() == null) {
                        k.mo6192g(new ArrayList());
                    } else {
                        k.mo6192g(k.getAds());
                    }
                    k.setState(i2);
                    k.mo6188aF(str3);
                    C1309d dVar = C1309d.this;
                    C1286Ad ad = ad2;
                    StringBuilder sb = new StringBuilder();
                    sb.append(str3);
                    sb.append(" ");
                    sb.append(str4);
                    dVar.mo5556a(ad, sb.toString(), k.getPlacementID());
                }
            }
        };
        handler.post(r2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final C1301a mo6230k(C1286Ad ad) {
        return (C1301a) this.f4139kd.get(new C1307b(ad));
    }

    /* access modifiers changed from: protected */
    /* renamed from: cw */
    public final HashMap<C1307b, C1301a> mo6226cw() {
        return this.f4139kd;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6219a(C1286Ad ad, C1301a aVar) {
        this.f4139kd.put(new C1307b(ad), aVar);
    }

    /* renamed from: d */
    public static String m5605d(AppnextAd appnextAd) {
        return appnextAd.getAdJSON();
    }

    /* renamed from: l */
    public final String mo6231l(C1286Ad ad) {
        return mo6230k(ad).mo6189ar();
    }

    public C1331g parseAd(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            AppnextAd appnextAd = (AppnextAd) C1340l.m5717a(AppnextAd.class, jSONObject);
            if (appnextAd != null) {
                appnextAd.setAdJSON(jSONObject.toString());
                if (jSONObject.has("sid")) {
                    appnextAd.setSession(jSONObject.getString("sid"));
                }
                if (appnextAd.getStoreRating().equals("")) {
                    appnextAd.setStoreRating("0");
                }
            }
            return appnextAd;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    protected static boolean m5604b(String str, String str2) {
        return C1334j.m5708cI().mo6266p(str, str2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: U */
    public void mo6215U(String str) {
        C1334j.m5708cI().mo6262aO(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo5557a(String str, C1286Ad ad) {
        C1334j.m5708cI().mo6265o(str, ad.getPlacementID());
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: q */
    protected static int m5606q(Context context) {
        try {
            if (!C1326f.m5692g(context, "android.permission.READ_CONTACTS") || !C1326f.m5692g(context, "android.permission.GET_ACCOUNTS")) {
                return 2;
            }
            return AccountManager.get(context).getAccountsByType("com.google").length > 0 ? 0 : 1;
        } catch (Throwable unused) {
            return 2;
        }
    }
}
