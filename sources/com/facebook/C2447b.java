package com.facebook;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.p017v4.content.C0362f;
import android.util.Log;
import com.appnext.base.p046b.C1244c;
import com.facebook.AccessToken.C1491a;
import com.facebook.C2658q.C2659a;
import com.facebook.GraphRequest.C1503b;
import com.facebook.internal.C2479ad;
import com.facebook.internal.C2484ae;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.b */
/* compiled from: AccessTokenManager */
public final class C2447b {

    /* renamed from: a */
    private static volatile C2447b f7735a;

    /* renamed from: b */
    private final C0362f f7736b;

    /* renamed from: c */
    private final C1510a f7737c;

    /* renamed from: d */
    private AccessToken f7738d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public AtomicBoolean f7739e = new AtomicBoolean(false);

    /* renamed from: f */
    private Date f7740f = new Date(0);

    /* renamed from: com.facebook.b$a */
    /* compiled from: AccessTokenManager */
    private static class C2452a {

        /* renamed from: a */
        public String f7756a;

        /* renamed from: b */
        public int f7757b;

        private C2452a() {
        }
    }

    C2447b(C0362f fVar, C1510a aVar) {
        C2484ae.m9489a((Object) fVar, "localBroadcastManager");
        C2484ae.m9489a((Object) aVar, "accessTokenCache");
        this.f7736b = fVar;
        this.f7737c = aVar;
    }

    /* renamed from: a */
    static C2447b m9350a() {
        if (f7735a == null) {
            synchronized (C2447b.class) {
                if (f7735a == null) {
                    f7735a = new C2447b(C0362f.m1362a(C2649m.m10133f()), new C1510a());
                }
            }
        }
        return f7735a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public AccessToken mo8871b() {
        return this.f7738d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo8872c() {
        AccessToken a = this.f7737c.mo6728a();
        if (a == null) {
            return false;
        }
        m9353a(a, false);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8870a(AccessToken accessToken) {
        m9353a(accessToken, true);
    }

    /* renamed from: a */
    private void m9353a(AccessToken accessToken, boolean z) {
        AccessToken accessToken2 = this.f7738d;
        this.f7738d = accessToken;
        this.f7739e.set(false);
        this.f7740f = new Date(0);
        if (z) {
            if (accessToken != null) {
                this.f7737c.mo6729a(accessToken);
            } else {
                this.f7737c.mo6730b();
                C2479ad.m9462b(C2649m.m10133f());
            }
        }
        if (!C2479ad.m9455a(accessToken2, accessToken)) {
            m9352a(accessToken2, accessToken);
            m9357f();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo8873d() {
        m9352a(this.f7738d, this.f7738d);
    }

    /* renamed from: a */
    private void m9352a(AccessToken accessToken, AccessToken accessToken2) {
        Intent intent = new Intent(C2649m.m10133f(), CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", accessToken);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", accessToken2);
        this.f7736b.mo1252a(intent);
    }

    /* renamed from: f */
    private void m9357f() {
        Context f = C2649m.m10133f();
        AccessToken a = AccessToken.m6161a();
        AlarmManager alarmManager = (AlarmManager) f.getSystemService("alarm");
        if (AccessToken.m6168b() && a.mo6616e() != null && alarmManager != null) {
            Intent intent = new Intent(f, CurrentAccessTokenExpirationBroadcastReceiver.class);
            intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
            alarmManager.set(1, a.mo6616e().getTime(), PendingIntent.getBroadcast(f, 0, intent, 0));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo8874e() {
        if (m9358g()) {
            mo8869a((C1491a) null);
        }
    }

    /* renamed from: g */
    private boolean m9358g() {
        boolean z = false;
        if (this.f7738d == null) {
            return false;
        }
        Long valueOf = Long.valueOf(new Date().getTime());
        if (this.f7738d.mo6620h().mo8877a() && valueOf.longValue() - this.f7740f.getTime() > 3600000 && valueOf.longValue() - this.f7738d.mo6622i().getTime() > 86400000) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    private static GraphRequest m9349a(AccessToken accessToken, C1503b bVar) {
        AccessToken accessToken2 = accessToken;
        GraphRequest graphRequest = new GraphRequest(accessToken2, "me/permissions", new Bundle(), C2662s.GET, bVar);
        return graphRequest;
    }

    /* renamed from: b */
    private static GraphRequest m9355b(AccessToken accessToken, C1503b bVar) {
        Bundle bundle = new Bundle();
        bundle.putString("grant_type", "fb_extend_sso_token");
        GraphRequest graphRequest = new GraphRequest(accessToken, "oauth/access_token", bundle, C2662s.GET, bVar);
        return graphRequest;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8869a(final C1491a aVar) {
        if (Looper.getMainLooper().equals(Looper.myLooper())) {
            m9356b(aVar);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    C2447b.this.m9356b(aVar);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m9356b(C1491a aVar) {
        final AccessToken accessToken = this.f7738d;
        if (accessToken == null) {
            if (aVar != null) {
                aVar.mo6634a(new C2579j("No current access token to refresh"));
            }
        } else if (!this.f7739e.compareAndSet(false, true)) {
            if (aVar != null) {
                aVar.mo6634a(new C2579j("Refresh already in progress"));
            }
        } else {
            this.f7740f = new Date();
            final HashSet hashSet = new HashSet();
            final HashSet hashSet2 = new HashSet();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final C2452a aVar2 = new C2452a();
            C2658q qVar = new C2658q(m9349a(accessToken, (C1503b) new C1503b() {
                /* renamed from: a */
                public void mo6691a(C2661r rVar) {
                    JSONObject b = rVar.mo9371b();
                    if (b != null) {
                        JSONArray optJSONArray = b.optJSONArray("data");
                        if (optJSONArray != null) {
                            atomicBoolean.set(true);
                            for (int i = 0; i < optJSONArray.length(); i++) {
                                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                                if (optJSONObject != null) {
                                    String optString = optJSONObject.optString("permission");
                                    String optString2 = optJSONObject.optString(C1244c.STATUS);
                                    if (!C2479ad.m9456a(optString) && !C2479ad.m9456a(optString2)) {
                                        String lowerCase = optString2.toLowerCase(Locale.US);
                                        if (lowerCase.equals("granted")) {
                                            hashSet.add(optString);
                                        } else if (lowerCase.equals("declined")) {
                                            hashSet2.add(optString);
                                        } else {
                                            StringBuilder sb = new StringBuilder();
                                            sb.append("Unexpected status: ");
                                            sb.append(lowerCase);
                                            Log.w("AccessTokenManager", sb.toString());
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }), m9355b(accessToken, new C1503b() {
                /* renamed from: a */
                public void mo6691a(C2661r rVar) {
                    JSONObject b = rVar.mo9371b();
                    if (b != null) {
                        aVar2.f7756a = b.optString("access_token");
                        aVar2.f7757b = b.optInt("expires_at");
                    }
                }
            }));
            final C1491a aVar3 = aVar;
            C24514 r0 = new C2659a() {
                /* JADX WARNING: Unknown top exception splitter block from list: {B:18:0x0052=Splitter:B:18:0x0052, B:47:0x00e3=Splitter:B:47:0x00e3} */
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void mo8876a(com.facebook.C2658q r15) {
                    /*
                        r14 = this;
                        r15 = 0
                        r0 = 0
                        com.facebook.b r1 = com.facebook.C2447b.m9350a()     // Catch:{ all -> 0x00ff }
                        com.facebook.AccessToken r1 = r1.mo8871b()     // Catch:{ all -> 0x00ff }
                        if (r1 == 0) goto L_0x00e3
                        com.facebook.b r1 = com.facebook.C2447b.m9350a()     // Catch:{ all -> 0x00ff }
                        com.facebook.AccessToken r1 = r1.mo8871b()     // Catch:{ all -> 0x00ff }
                        java.lang.String r1 = r1.mo6624k()     // Catch:{ all -> 0x00ff }
                        com.facebook.AccessToken r2 = r2     // Catch:{ all -> 0x00ff }
                        java.lang.String r2 = r2.mo6624k()     // Catch:{ all -> 0x00ff }
                        if (r1 == r2) goto L_0x0022
                        goto L_0x00e3
                    L_0x0022:
                        java.util.concurrent.atomic.AtomicBoolean r1 = r4     // Catch:{ all -> 0x00ff }
                        boolean r1 = r1.get()     // Catch:{ all -> 0x00ff }
                        if (r1 != 0) goto L_0x0052
                        com.facebook.b$a r1 = r5     // Catch:{ all -> 0x00ff }
                        java.lang.String r1 = r1.f7756a     // Catch:{ all -> 0x00ff }
                        if (r1 != 0) goto L_0x0052
                        com.facebook.b$a r1 = r5     // Catch:{ all -> 0x00ff }
                        int r1 = r1.f7757b     // Catch:{ all -> 0x00ff }
                        if (r1 != 0) goto L_0x0052
                        com.facebook.AccessToken$a r1 = r3     // Catch:{ all -> 0x00ff }
                        if (r1 == 0) goto L_0x0046
                        com.facebook.AccessToken$a r1 = r3     // Catch:{ all -> 0x00ff }
                        com.facebook.j r2 = new com.facebook.j     // Catch:{ all -> 0x00ff }
                        java.lang.String r3 = "Failed to refresh access token"
                        r2.<init>(r3)     // Catch:{ all -> 0x00ff }
                        r1.mo6634a(r2)     // Catch:{ all -> 0x00ff }
                    L_0x0046:
                        com.facebook.b r0 = com.facebook.C2447b.this
                        java.util.concurrent.atomic.AtomicBoolean r0 = r0.f7739e
                        r0.set(r15)
                        com.facebook.AccessToken$a r15 = r3
                        return
                    L_0x0052:
                        com.facebook.AccessToken r1 = new com.facebook.AccessToken     // Catch:{ all -> 0x00ff }
                        com.facebook.b$a r2 = r5     // Catch:{ all -> 0x00ff }
                        java.lang.String r2 = r2.f7756a     // Catch:{ all -> 0x00ff }
                        if (r2 == 0) goto L_0x005f
                        com.facebook.b$a r2 = r5     // Catch:{ all -> 0x00ff }
                        java.lang.String r2 = r2.f7756a     // Catch:{ all -> 0x00ff }
                        goto L_0x0065
                    L_0x005f:
                        com.facebook.AccessToken r2 = r2     // Catch:{ all -> 0x00ff }
                        java.lang.String r2 = r2.mo6614d()     // Catch:{ all -> 0x00ff }
                    L_0x0065:
                        r3 = r2
                        com.facebook.AccessToken r2 = r2     // Catch:{ all -> 0x00ff }
                        java.lang.String r4 = r2.mo6623j()     // Catch:{ all -> 0x00ff }
                        com.facebook.AccessToken r2 = r2     // Catch:{ all -> 0x00ff }
                        java.lang.String r5 = r2.mo6624k()     // Catch:{ all -> 0x00ff }
                        java.util.concurrent.atomic.AtomicBoolean r2 = r4     // Catch:{ all -> 0x00ff }
                        boolean r2 = r2.get()     // Catch:{ all -> 0x00ff }
                        if (r2 == 0) goto L_0x007e
                        java.util.Set r2 = r6     // Catch:{ all -> 0x00ff }
                    L_0x007c:
                        r6 = r2
                        goto L_0x0085
                    L_0x007e:
                        com.facebook.AccessToken r2 = r2     // Catch:{ all -> 0x00ff }
                        java.util.Set r2 = r2.mo6618f()     // Catch:{ all -> 0x00ff }
                        goto L_0x007c
                    L_0x0085:
                        java.util.concurrent.atomic.AtomicBoolean r2 = r4     // Catch:{ all -> 0x00ff }
                        boolean r2 = r2.get()     // Catch:{ all -> 0x00ff }
                        if (r2 == 0) goto L_0x0091
                        java.util.Set r2 = r7     // Catch:{ all -> 0x00ff }
                    L_0x008f:
                        r7 = r2
                        goto L_0x0098
                    L_0x0091:
                        com.facebook.AccessToken r2 = r2     // Catch:{ all -> 0x00ff }
                        java.util.Set r2 = r2.mo6619g()     // Catch:{ all -> 0x00ff }
                        goto L_0x008f
                    L_0x0098:
                        com.facebook.AccessToken r2 = r2     // Catch:{ all -> 0x00ff }
                        com.facebook.c r8 = r2.mo6620h()     // Catch:{ all -> 0x00ff }
                        com.facebook.b$a r2 = r5     // Catch:{ all -> 0x00ff }
                        int r2 = r2.f7757b     // Catch:{ all -> 0x00ff }
                        if (r2 == 0) goto L_0x00b2
                        java.util.Date r2 = new java.util.Date     // Catch:{ all -> 0x00ff }
                        com.facebook.b$a r9 = r5     // Catch:{ all -> 0x00ff }
                        int r9 = r9.f7757b     // Catch:{ all -> 0x00ff }
                        long r9 = (long) r9     // Catch:{ all -> 0x00ff }
                        r11 = 1000(0x3e8, double:4.94E-321)
                        long r9 = r9 * r11
                        r2.<init>(r9)     // Catch:{ all -> 0x00ff }
                        goto L_0x00b8
                    L_0x00b2:
                        com.facebook.AccessToken r2 = r2     // Catch:{ all -> 0x00ff }
                        java.util.Date r2 = r2.mo6616e()     // Catch:{ all -> 0x00ff }
                    L_0x00b8:
                        r9 = r2
                        java.util.Date r10 = new java.util.Date     // Catch:{ all -> 0x00ff }
                        r10.<init>()     // Catch:{ all -> 0x00ff }
                        r2 = r1
                        r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x00ff }
                        com.facebook.b r0 = com.facebook.C2447b.m9350a()     // Catch:{ all -> 0x00de }
                        r0.mo8870a(r1)     // Catch:{ all -> 0x00de }
                        com.facebook.b r0 = com.facebook.C2447b.this
                        java.util.concurrent.atomic.AtomicBoolean r0 = r0.f7739e
                        r0.set(r15)
                        com.facebook.AccessToken$a r15 = r3
                        if (r15 == 0) goto L_0x00dd
                        if (r1 == 0) goto L_0x00dd
                        com.facebook.AccessToken$a r15 = r3
                        r15.mo6633a(r1)
                    L_0x00dd:
                        return
                    L_0x00de:
                        r0 = move-exception
                        r13 = r1
                        r1 = r0
                        r0 = r13
                        goto L_0x0100
                    L_0x00e3:
                        com.facebook.AccessToken$a r1 = r3     // Catch:{ all -> 0x00ff }
                        if (r1 == 0) goto L_0x00f3
                        com.facebook.AccessToken$a r1 = r3     // Catch:{ all -> 0x00ff }
                        com.facebook.j r2 = new com.facebook.j     // Catch:{ all -> 0x00ff }
                        java.lang.String r3 = "No current access token to refresh"
                        r2.<init>(r3)     // Catch:{ all -> 0x00ff }
                        r1.mo6634a(r2)     // Catch:{ all -> 0x00ff }
                    L_0x00f3:
                        com.facebook.b r0 = com.facebook.C2447b.this
                        java.util.concurrent.atomic.AtomicBoolean r0 = r0.f7739e
                        r0.set(r15)
                        com.facebook.AccessToken$a r15 = r3
                        return
                    L_0x00ff:
                        r1 = move-exception
                    L_0x0100:
                        com.facebook.b r2 = com.facebook.C2447b.this
                        java.util.concurrent.atomic.AtomicBoolean r2 = r2.f7739e
                        r2.set(r15)
                        com.facebook.AccessToken$a r15 = r3
                        if (r15 == 0) goto L_0x0114
                        if (r0 == 0) goto L_0x0114
                        com.facebook.AccessToken$a r15 = r3
                        r15.mo6633a(r0)
                    L_0x0114:
                        throw r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.C2447b.C24514.mo8876a(com.facebook.q):void");
                }
            };
            qVar.mo9349a((C2659a) r0);
            qVar.mo9363h();
        }
    }
}
