package com.startapp.android.publish.common.metaData;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.startapp.android.publish.ads.banner.C5144c;
import com.startapp.android.publish.ads.splash.C5194f;
import com.startapp.android.publish.adsCommon.AdsConstants;
import com.startapp.android.publish.adsCommon.AdsConstants.ServiceApiType;
import com.startapp.android.publish.adsCommon.C5344b;
import com.startapp.android.publish.adsCommon.Utils.C5307i;
import com.startapp.android.publish.adsCommon.adinformation.C5329a;
import com.startapp.android.publish.adsCommon.p182f.C5376d;
import com.startapp.android.publish.adsCommon.p182f.C5377e;
import com.startapp.android.publish.adsCommon.p182f.C5378f;
import com.startapp.android.publish.adsCommon.p191k.C5415a;
import com.startapp.android.publish.cache.C5446d;
import com.startapp.android.publish.common.metaData.MetaDataRequest.C5474a;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.common.C5554g;
import com.startapp.common.C5554g.C5558a;
import com.startapp.common.p193a.C5518g;
import java.net.UnknownHostException;

/* renamed from: com.startapp.android.publish.common.metaData.c */
/* compiled from: StartAppSDK */
public class C5478c {

    /* renamed from: a */
    protected boolean f17463a = false;

    /* renamed from: b */
    private final Context f17464b;

    /* renamed from: c */
    private final AdPreferences f17465c;

    /* renamed from: d */
    private C5474a f17466d;

    /* renamed from: e */
    private MetaData f17467e = null;

    /* renamed from: f */
    private C5144c f17468f = null;

    /* renamed from: g */
    private C5194f f17469g = null;

    /* renamed from: h */
    private C5446d f17470h = null;

    /* renamed from: i */
    private C5329a f17471i = null;

    /* renamed from: j */
    private C5344b f17472j = null;

    /* renamed from: k */
    private boolean f17473k = false;

    public C5478c(Context context, AdPreferences adPreferences, C5474a aVar) {
        this.f17464b = context;
        this.f17465c = adPreferences;
        this.f17466d = aVar;
    }

    /* renamed from: a */
    public void mo20272a() {
        C5554g.m23702a(C5558a.HIGH, (Runnable) new Runnable() {
            public void run() {
                final Boolean c = C5478c.this.mo20275c();
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public void run() {
                        C5478c.this.mo20273a(c);
                    }
                });
            }
        });
    }

    /* renamed from: b */
    public void mo20274b() {
        this.f17473k = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Boolean mo20275c() {
        C5518g.m23561a(3, "Loading MetaData");
        MetaDataRequest metaDataRequest = new MetaDataRequest(this.f17464b, this.f17466d);
        try {
            metaDataRequest.fillApplicationDetails(this.f17464b, this.f17465c, false);
            metaDataRequest.fillLocationDetails(this.f17465c, this.f17464b);
            C5518g.m23561a(3, "Networking MetaData");
            String a = C5415a.m23105a(this.f17464b, AdsConstants.m22606a(ServiceApiType.METADATA), metaDataRequest, null).mo20491a();
            this.f17467e = (MetaData) C5307i.m22656a(a, MetaData.class);
            if (!C5307i.m22673a()) {
                this.f17472j = (C5344b) C5307i.m22656a(a, C5344b.class);
                if (C5307i.m22674a(16) || C5307i.m22674a(32)) {
                    this.f17468f = (C5144c) C5307i.m22656a(a, C5144c.class);
                }
                if (C5307i.m22674a(8)) {
                    this.f17469g = (C5194f) C5307i.m22656a(a, C5194f.class);
                }
                if (C5307i.m22674a(512)) {
                    this.f17470h = (C5446d) C5307i.m22656a(a, C5446d.class);
                }
                if (C5307i.m22687e()) {
                    this.f17471i = (C5329a) C5307i.m22656a(a, C5329a.class);
                }
            }
            m23390d();
            return Boolean.TRUE;
        } catch (Exception e) {
            C5518g.m23562a(6, "Unable to handle GetMetaData command!!!!", (Throwable) e);
            if (!(e instanceof UnknownHostException) || !e.getMessage().contains("init.startappservice.com")) {
                C5378f.m23016a(this.f17464b, C5376d.EXCEPTION, "GetMetaDataAsync.doInBackground - MetaData request failed", e.getMessage(), "");
            }
            return Boolean.FALSE;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(4:9|(12:11|12|13|(1:15)|20|(3:24|25|(1:27))|32|(4:34|35|36|(1:38))|43|(3:45|46|(1:48))|53|(3:55|56|(1:58)))|63|64)|65|66) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x00f4 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m23390d() {
        /*
            r4 = this;
            java.lang.Object r0 = com.startapp.android.publish.common.metaData.MetaData.getLock()
            monitor-enter(r0)
            boolean r1 = r4.f17473k     // Catch:{ all -> 0x00f6 }
            if (r1 != 0) goto L_0x00f4
            com.startapp.android.publish.common.metaData.MetaData r1 = r4.f17467e     // Catch:{ all -> 0x00f6 }
            if (r1 == 0) goto L_0x00f4
            android.content.Context r1 = r4.f17464b     // Catch:{ all -> 0x00f6 }
            if (r1 == 0) goto L_0x00f4
            boolean r1 = com.startapp.android.publish.adsCommon.Utils.C5307i.m22673a()     // Catch:{ all -> 0x00f6 }
            if (r1 != 0) goto L_0x00e9
            r1 = 1
            com.startapp.android.publish.adsCommon.b r2 = com.startapp.android.publish.adsCommon.C5344b.m22784a()     // Catch:{ Exception -> 0x002e }
            com.startapp.android.publish.adsCommon.b r3 = r4.f17472j     // Catch:{ Exception -> 0x002e }
            boolean r2 = com.startapp.android.publish.adsCommon.Utils.C5307i.m22682b(r2, r3)     // Catch:{ Exception -> 0x002e }
            if (r2 != 0) goto L_0x0038
            r4.f17463a = r1     // Catch:{ Exception -> 0x002e }
            android.content.Context r2 = r4.f17464b     // Catch:{ Exception -> 0x002e }
            com.startapp.android.publish.adsCommon.b r3 = r4.f17472j     // Catch:{ Exception -> 0x002e }
            com.startapp.android.publish.adsCommon.C5344b.m22786a(r2, r3)     // Catch:{ Exception -> 0x002e }
            goto L_0x0038
        L_0x002e:
            r2 = move-exception
            java.lang.String r3 = "GetMetaDataAsyncTask-adscommon update fail"
            java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x00f6 }
            r4.m23389a(r3, r2)     // Catch:{ all -> 0x00f6 }
        L_0x0038:
            r2 = 16
            boolean r2 = com.startapp.android.publish.adsCommon.Utils.C5307i.m22674a(r2)     // Catch:{ all -> 0x00f6 }
            if (r2 != 0) goto L_0x0048
            r2 = 32
            boolean r2 = com.startapp.android.publish.adsCommon.Utils.C5307i.m22674a(r2)     // Catch:{ all -> 0x00f6 }
            if (r2 == 0) goto L_0x0068
        L_0x0048:
            com.startapp.android.publish.ads.banner.c r2 = com.startapp.android.publish.ads.banner.C5144c.m22086a()     // Catch:{ Exception -> 0x005e }
            com.startapp.android.publish.ads.banner.c r3 = r4.f17468f     // Catch:{ Exception -> 0x005e }
            boolean r2 = com.startapp.android.publish.adsCommon.Utils.C5307i.m22682b(r2, r3)     // Catch:{ Exception -> 0x005e }
            if (r2 != 0) goto L_0x0068
            r4.f17463a = r1     // Catch:{ Exception -> 0x005e }
            android.content.Context r2 = r4.f17464b     // Catch:{ Exception -> 0x005e }
            com.startapp.android.publish.ads.banner.c r3 = r4.f17468f     // Catch:{ Exception -> 0x005e }
            com.startapp.android.publish.ads.banner.C5144c.m22088a(r2, r3)     // Catch:{ Exception -> 0x005e }
            goto L_0x0068
        L_0x005e:
            r2 = move-exception
            java.lang.String r3 = "GetMetaDataAsyncTask-banner update fail"
            java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x00f6 }
            r4.m23389a(r3, r2)     // Catch:{ all -> 0x00f6 }
        L_0x0068:
            r2 = 8
            boolean r2 = com.startapp.android.publish.adsCommon.Utils.C5307i.m22674a(r2)     // Catch:{ all -> 0x00f6 }
            if (r2 == 0) goto L_0x009b
            com.startapp.android.publish.ads.splash.f r2 = r4.f17469g     // Catch:{ all -> 0x00f6 }
            com.startapp.android.publish.ads.splash.SplashConfig r2 = r2.mo19203a()     // Catch:{ all -> 0x00f6 }
            android.content.Context r3 = r4.f17464b     // Catch:{ all -> 0x00f6 }
            r2.setDefaults(r3)     // Catch:{ all -> 0x00f6 }
            com.startapp.android.publish.ads.splash.f r2 = com.startapp.android.publish.ads.splash.C5194f.m22266b()     // Catch:{ Exception -> 0x0091 }
            com.startapp.android.publish.ads.splash.f r3 = r4.f17469g     // Catch:{ Exception -> 0x0091 }
            boolean r2 = com.startapp.android.publish.adsCommon.Utils.C5307i.m22682b(r2, r3)     // Catch:{ Exception -> 0x0091 }
            if (r2 != 0) goto L_0x009b
            r4.f17463a = r1     // Catch:{ Exception -> 0x0091 }
            android.content.Context r2 = r4.f17464b     // Catch:{ Exception -> 0x0091 }
            com.startapp.android.publish.ads.splash.f r3 = r4.f17469g     // Catch:{ Exception -> 0x0091 }
            com.startapp.android.publish.ads.splash.C5194f.m22265a(r2, r3)     // Catch:{ Exception -> 0x0091 }
            goto L_0x009b
        L_0x0091:
            r2 = move-exception
            java.lang.String r3 = "GetMetaDataAsyncTask-splash update fail"
            java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x00f6 }
            r4.m23389a(r3, r2)     // Catch:{ all -> 0x00f6 }
        L_0x009b:
            r2 = 512(0x200, double:2.53E-321)
            boolean r2 = com.startapp.android.publish.adsCommon.Utils.C5307i.m22674a(r2)     // Catch:{ all -> 0x00f6 }
            if (r2 == 0) goto L_0x00c3
            com.startapp.android.publish.cache.d r2 = com.startapp.android.publish.cache.C5446d.m23293a()     // Catch:{ Exception -> 0x00b9 }
            com.startapp.android.publish.cache.d r3 = r4.f17470h     // Catch:{ Exception -> 0x00b9 }
            boolean r2 = com.startapp.android.publish.adsCommon.Utils.C5307i.m22682b(r2, r3)     // Catch:{ Exception -> 0x00b9 }
            if (r2 != 0) goto L_0x00c3
            r4.f17463a = r1     // Catch:{ Exception -> 0x00b9 }
            android.content.Context r2 = r4.f17464b     // Catch:{ Exception -> 0x00b9 }
            com.startapp.android.publish.cache.d r3 = r4.f17470h     // Catch:{ Exception -> 0x00b9 }
            com.startapp.android.publish.cache.C5446d.m23295a(r2, r3)     // Catch:{ Exception -> 0x00b9 }
            goto L_0x00c3
        L_0x00b9:
            r2 = move-exception
            java.lang.String r3 = "GetMetaDataAsyncTask-cache update fail"
            java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x00f6 }
            r4.m23389a(r3, r2)     // Catch:{ all -> 0x00f6 }
        L_0x00c3:
            boolean r2 = com.startapp.android.publish.adsCommon.Utils.C5307i.m22687e()     // Catch:{ all -> 0x00f6 }
            if (r2 == 0) goto L_0x00e9
            com.startapp.android.publish.adsCommon.adinformation.a r2 = com.startapp.android.publish.adsCommon.adinformation.C5329a.m22737b()     // Catch:{ Exception -> 0x00df }
            com.startapp.android.publish.adsCommon.adinformation.a r3 = r4.f17471i     // Catch:{ Exception -> 0x00df }
            boolean r2 = com.startapp.android.publish.adsCommon.Utils.C5307i.m22682b(r2, r3)     // Catch:{ Exception -> 0x00df }
            if (r2 != 0) goto L_0x00e9
            r4.f17463a = r1     // Catch:{ Exception -> 0x00df }
            android.content.Context r1 = r4.f17464b     // Catch:{ Exception -> 0x00df }
            com.startapp.android.publish.adsCommon.adinformation.a r2 = r4.f17471i     // Catch:{ Exception -> 0x00df }
            com.startapp.android.publish.adsCommon.adinformation.C5329a.m22736a(r1, r2)     // Catch:{ Exception -> 0x00df }
            goto L_0x00e9
        L_0x00df:
            r1 = move-exception
            java.lang.String r2 = "GetMetaDataAsyncTask-adInfo update fail"
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x00f6 }
            r4.m23389a(r2, r1)     // Catch:{ all -> 0x00f6 }
        L_0x00e9:
            android.content.Context r1 = r4.f17464b     // Catch:{ Exception -> 0x00f4 }
            com.startapp.android.publish.common.metaData.MetaData r2 = r4.f17467e     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r2 = r2.getAssetsBaseUrl()     // Catch:{ Exception -> 0x00f4 }
            com.startapp.android.publish.common.metaData.MetaData.preCacheResources(r1, r2)     // Catch:{ Exception -> 0x00f4 }
        L_0x00f4:
            monitor-exit(r0)     // Catch:{ all -> 0x00f6 }
            return
        L_0x00f6:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00f6 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.android.publish.common.metaData.C5478c.m23390d():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo20273a(Boolean bool) {
        synchronized (MetaData.getLock()) {
            if (!this.f17473k) {
                if (!bool.booleanValue() || this.f17467e == null || this.f17464b == null) {
                    MetaData.failedLoading();
                } else {
                    try {
                        MetaData.update(this.f17464b, this.f17467e, this.f17463a);
                    } catch (Exception e) {
                        m23389a("GetMetaDataAsyncTask.onPostExecute-metadata update fail", e.getMessage());
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m23389a(String str, String str2) {
        C5378f.m23018a(this.f17464b, new C5377e(C5376d.EXCEPTION, str, str2), "");
    }
}
