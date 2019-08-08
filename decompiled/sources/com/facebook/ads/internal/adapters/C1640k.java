package com.facebook.ads.internal.adapters;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.support.p017v4.content.C0362f;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.adapters.p072b.C1585a;
import com.facebook.ads.internal.adapters.p072b.C1588d;
import com.facebook.ads.internal.adapters.p072b.C1595f;
import com.facebook.ads.internal.adapters.p072b.C1605n;
import com.facebook.ads.internal.adapters.p072b.C1606o;
import com.facebook.ads.internal.adapters.p072b.C1608q;
import com.facebook.ads.internal.adapters.p073c.C1610a;
import com.facebook.ads.internal.adapters.p073c.C1610a.C1613b;
import com.facebook.ads.internal.p081h.C1723a;
import com.facebook.ads.internal.p081h.C1724b;
import com.facebook.ads.internal.p091r.C1795a;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import com.facebook.ads.internal.settings.C1810a.C1811a;
import com.facebook.ads.internal.view.p105e.C2057c;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.internal.adapters.k */
public class C1640k extends C1655s {

    /* renamed from: c */
    private final String f5119c = UUID.randomUUID().toString();

    /* renamed from: d */
    private final AtomicBoolean f5120d = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Context f5121e;

    /* renamed from: f */
    private C1656t f5122f;

    /* renamed from: g */
    private String f5123g;

    /* renamed from: h */
    private String f5124h;

    /* renamed from: i */
    private long f5125i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C1585a f5126j;

    /* renamed from: k */
    private C1657u f5127k;

    /* renamed from: l */
    private C1811a f5128l;

    /* renamed from: m */
    private String f5129m;

    /* renamed from: n */
    private C1643a f5130n;

    /* renamed from: com.facebook.ads.internal.adapters.k$a */
    private static class C1643a implements C1613b {

        /* renamed from: a */
        final WeakReference<C1640k> f5136a;

        /* renamed from: b */
        final WeakReference<C1656t> f5137b;

        /* renamed from: c */
        final AtomicBoolean f5138c;

        C1643a(C1640k kVar, C1656t tVar, AtomicBoolean atomicBoolean) {
            this.f5136a = new WeakReference<>(kVar);
            this.f5137b = new WeakReference<>(tVar);
            this.f5138c = atomicBoolean;
        }

        /* renamed from: a */
        public void mo7240a() {
            this.f5138c.set(true);
            if (this.f5137b.get() != null && this.f5136a.get() != null) {
                ((C1656t) this.f5137b.get()).mo7351a((C1655s) this.f5136a.get());
            }
        }

        /* renamed from: a */
        public void mo7241a(AdError adError) {
            if (this.f5137b.get() != null && this.f5136a.get() != null) {
                ((C1656t) this.f5137b.get()).mo7352a((C1655s) this.f5136a.get(), adError);
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.adapters.k$b */
    private static abstract class C1644b implements C1723a {

        /* renamed from: d */
        final WeakReference<C1640k> f5139d;

        /* renamed from: e */
        final WeakReference<C1656t> f5140e;

        /* renamed from: f */
        final C1724b f5141f;

        /* renamed from: g */
        final AtomicBoolean f5142g;

        /* renamed from: h */
        final boolean f5143h;

        private C1644b(C1640k kVar, C1656t tVar, C1724b bVar, AtomicBoolean atomicBoolean, boolean z) {
            this.f5139d = new WeakReference<>(kVar);
            this.f5140e = new WeakReference<>(tVar);
            this.f5141f = bVar;
            this.f5142g = atomicBoolean;
            this.f5143h = z;
        }

        /* renamed from: a */
        public void mo7016a() {
            mo7319a(true, (C1640k) this.f5139d.get(), (C1656t) this.f5140e.get());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo7319a(boolean z, C1640k kVar, C1656t tVar);

        /* renamed from: b */
        public void mo7017b() {
            if (this.f5140e.get() != null && this.f5139d.get() != null) {
                if (this.f5143h) {
                    ((C1656t) this.f5140e.get()).mo7352a((C1655s) this.f5139d.get(), AdError.CACHE_ERROR);
                } else {
                    mo7319a(false, (C1640k) this.f5139d.get(), (C1656t) this.f5140e.get());
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m6865a(Context context, boolean z, C1608q qVar) {
        this.f5130n = new C1643a(this, this.f5122f, this.f5120d);
        C1610a.m6725a(context, C1606o.m6700a(qVar), z, this.f5130n);
    }

    /* renamed from: a */
    private void m6867a(C1724b bVar, C1608q qVar) {
        bVar.mo7494a(qVar.mo7231f().mo7201b(), C2057c.f6537a, C2057c.f6537a);
        bVar.mo7493a(qVar.mo7235j().mo7126a());
        String g = qVar.mo7235j().mo7133g();
        Context context = this.f5121e;
        C1588d j = qVar.mo7235j();
        int min = C1795a.m7425S(context) ? Math.min(C2342x.f7368a.heightPixels, j.mo7135i()) : j.mo7135i();
        Context context2 = this.f5121e;
        C1588d j2 = qVar.mo7235j();
        bVar.mo7494a(g, min, C1795a.m7425S(context2) ? Math.min(C2342x.f7368a.widthPixels, j2.mo7134h()) : j2.mo7134h());
        for (String a : qVar.mo7236k().mo7184d()) {
            bVar.mo7494a(a, -1, -1);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m6870b(C1608q qVar, boolean z) {
        C1605n j = qVar.mo7235j().mo7136j();
        return j != null && (!z || !j.mo7218i());
    }

    /* renamed from: a */
    public int mo7316a() {
        if (this.f5126j == null) {
            return -1;
        }
        if (this.f5128l != C1811a.REWARDED_VIDEO_CHOOSE_YOUR_OWN_AD) {
            return ((C1608q) this.f5126j).mo7235j().mo7130d();
        }
        int i = 0;
        for (C1608q j : ((C1595f) this.f5126j).mo7167j()) {
            int d = j.mo7235j().mo7130d();
            if (i < d) {
                i = d;
            }
        }
        return i;
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [com.facebook.ads.internal.adapters.k$2] */
    /* JADX WARNING: type inference failed for: r10v5, types: [com.facebook.ads.internal.h.a] */
    /* JADX WARNING: type inference failed for: r0v12, types: [com.facebook.ads.internal.adapters.k$1] */
    /* JADX WARNING: type inference failed for: r0v13, types: [com.facebook.ads.internal.adapters.k$2] */
    /* JADX WARNING: type inference failed for: r0v14, types: [com.facebook.ads.internal.adapters.k$1] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v13, types: [com.facebook.ads.internal.adapters.k$2]
      assigns: [com.facebook.ads.internal.adapters.k$2, com.facebook.ads.internal.adapters.k$1]
      uses: [com.facebook.ads.internal.adapters.k$2, com.facebook.ads.internal.h.a, com.facebook.ads.internal.adapters.k$1]
      mth insns count: 116
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7317a(android.content.Context r10, com.facebook.ads.internal.adapters.C1656t r11, java.util.Map<java.lang.String, java.lang.Object> r12, boolean r13, java.lang.String r14) {
        /*
            r9 = this;
            r9.f5121e = r10
            r9.f5122f = r11
            java.util.concurrent.atomic.AtomicBoolean r0 = r9.f5120d
            r1 = 0
            r0.set(r1)
            java.lang.String r0 = "placementId"
            java.lang.Object r0 = r12.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r9.f5124h = r0
            java.lang.String r0 = "requestTime"
            java.lang.Object r0 = r12.get(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            r9.f5125i = r2
            java.lang.String r0 = "definition"
            java.lang.Object r0 = r12.get(r0)
            com.facebook.ads.internal.m.d r0 = (com.facebook.ads.internal.p086m.C1765d) r0
            int r0 = r0.mo7615k()
            r9.f5129m = r14
            java.lang.String r14 = r9.f5124h
            if (r14 == 0) goto L_0x003f
            java.lang.String r14 = r9.f5124h
            java.lang.String r2 = "_"
            java.lang.String[] r14 = r14.split(r2)
            r14 = r14[r1]
            goto L_0x0041
        L_0x003f:
            java.lang.String r14 = ""
        L_0x0041:
            r9.f5123g = r14
            java.lang.String r14 = "choose_your_own_ad_rewarded_video"
            java.lang.String r1 = "data_model_type"
            java.lang.Object r1 = r12.get(r1)
            boolean r14 = r14.equals(r1)
            java.lang.String r1 = "data"
            java.lang.Object r12 = r12.get(r1)
            org.json.JSONObject r12 = (org.json.JSONObject) r12
            com.facebook.ads.internal.adapters.b.a r12 = com.facebook.ads.internal.adapters.p072b.C1585a.m6558a(r14, r12)
            r9.f5126j = r12
            if (r14 == 0) goto L_0x0062
            com.facebook.ads.internal.settings.a$a r12 = com.facebook.ads.internal.settings.C1810a.C1811a.REWARDED_VIDEO_CHOOSE_YOUR_OWN_AD
            goto L_0x0072
        L_0x0062:
            com.facebook.ads.internal.adapters.b.a r12 = r9.f5126j
            com.facebook.ads.internal.adapters.b.q r12 = (com.facebook.ads.internal.adapters.p072b.C1608q) r12
            r14 = 1
            boolean r12 = m6870b(r12, r14)
            if (r12 == 0) goto L_0x0070
            com.facebook.ads.internal.settings.a$a r12 = com.facebook.ads.internal.settings.C1810a.C1811a.REWARDED_PLAYABLE
            goto L_0x0072
        L_0x0070:
            com.facebook.ads.internal.settings.a$a r12 = com.facebook.ads.internal.settings.C1810a.C1811a.REWARDED_VIDEO
        L_0x0072:
            r9.f5128l = r12
            com.facebook.ads.internal.adapters.b.a r12 = r9.f5126j
            java.lang.String r14 = r9.f5129m
            r12.mo7117b(r14)
            com.facebook.ads.internal.adapters.b.a r12 = r9.f5126j
            r12.mo7114a(r0)
            com.facebook.ads.internal.settings.a$a r12 = r9.f5128l
            com.facebook.ads.internal.settings.a$a r14 = com.facebook.ads.internal.settings.C1810a.C1811a.REWARDED_VIDEO
            if (r12 != r14) goto L_0x00a4
            com.facebook.ads.internal.adapters.b.a r12 = r9.f5126j
            com.facebook.ads.internal.adapters.b.q r12 = (com.facebook.ads.internal.adapters.p072b.C1608q) r12
            com.facebook.ads.internal.adapters.b.d r12 = r12.mo7235j()
            java.lang.String r12 = r12.mo7126a()
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 == 0) goto L_0x00a4
            com.facebook.ads.internal.adapters.t r10 = r9.f5122f
            r11 = 2003(0x7d3, float:2.807E-42)
            com.facebook.ads.AdError r11 = com.facebook.ads.AdError.internalError(r11)
            r10.mo7352a(r9, r11)
            return
        L_0x00a4:
            com.facebook.ads.internal.adapters.u r12 = new com.facebook.ads.internal.adapters.u
            java.lang.String r14 = r9.f5119c
            r12.<init>(r14, r9, r11)
            r9.f5127k = r12
            android.content.Context r11 = r9.f5121e
            android.support.v4.content.f r11 = android.support.p017v4.content.C0362f.m1362a(r11)
            com.facebook.ads.internal.adapters.u r12 = r9.f5127k
            com.facebook.ads.internal.adapters.u r14 = r9.f5127k
            android.content.IntentFilter r14 = r14.mo7359a()
            r11.mo1251a(r12, r14)
            com.facebook.ads.internal.settings.a$a r11 = r9.f5128l
            com.facebook.ads.internal.settings.a$a r12 = com.facebook.ads.internal.settings.C1810a.C1811a.REWARDED_VIDEO
            if (r11 != r12) goto L_0x00e4
            com.facebook.ads.internal.h.b r11 = new com.facebook.ads.internal.h.b
            r11.<init>(r10)
            com.facebook.ads.internal.adapters.b.a r10 = r9.f5126j
            r7 = r10
            com.facebook.ads.internal.adapters.b.q r7 = (com.facebook.ads.internal.adapters.p072b.C1608q) r7
            r9.m6867a(r11, r7)
            com.facebook.ads.internal.adapters.k$1 r10 = new com.facebook.ads.internal.adapters.k$1
            com.facebook.ads.internal.adapters.t r3 = r9.f5122f
            java.util.concurrent.atomic.AtomicBoolean r5 = r9.f5120d
            r0 = r10
            r1 = r9
            r2 = r9
            r4 = r11
            r6 = r13
            r8 = r13
            r0.<init>(r2, r3, r4, r5, r6, r7, r8)
        L_0x00e0:
            r11.mo7492a(r10)
            return
        L_0x00e4:
            com.facebook.ads.internal.settings.a$a r11 = r9.f5128l
            com.facebook.ads.internal.settings.a$a r12 = com.facebook.ads.internal.settings.C1810a.C1811a.REWARDED_PLAYABLE
            if (r11 != r12) goto L_0x00f2
            com.facebook.ads.internal.adapters.b.a r11 = r9.f5126j
            com.facebook.ads.internal.adapters.b.q r11 = (com.facebook.ads.internal.adapters.p072b.C1608q) r11
            r9.m6865a(r10, r13, r11)
            return
        L_0x00f2:
            com.facebook.ads.internal.h.b r11 = new com.facebook.ads.internal.h.b
            r11.<init>(r10)
            com.facebook.ads.internal.adapters.b.a r10 = r9.f5126j
            r7 = r10
            com.facebook.ads.internal.adapters.b.f r7 = (com.facebook.ads.internal.adapters.p072b.C1595f) r7
            java.util.List r10 = r7.mo7167j()
            java.util.Iterator r10 = r10.iterator()
        L_0x0104:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L_0x0114
            java.lang.Object r12 = r10.next()
            com.facebook.ads.internal.adapters.b.q r12 = (com.facebook.ads.internal.adapters.p072b.C1608q) r12
            r9.m6867a(r11, r12)
            goto L_0x0104
        L_0x0114:
            com.facebook.ads.internal.adapters.k$2 r10 = new com.facebook.ads.internal.adapters.k$2
            com.facebook.ads.internal.adapters.t r3 = r9.f5122f
            java.util.concurrent.atomic.AtomicBoolean r5 = r9.f5120d
            r0 = r10
            r1 = r9
            r2 = r9
            r4 = r11
            r6 = r13
            r0.<init>(r2, r3, r4, r5, r6, r7)
            goto L_0x00e0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.adapters.C1640k.mo7317a(android.content.Context, com.facebook.ads.internal.adapters.t, java.util.Map, boolean, java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ea  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo7318b() {
        /*
            r6 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.f5120d
            boolean r0 = r0.get()
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            com.facebook.ads.RewardData r0 = r6.f5190a
            r2 = 1
            if (r0 == 0) goto L_0x0084
            java.lang.String r0 = com.facebook.ads.AdSettings.getUrlPrefix()
            if (r0 == 0) goto L_0x0029
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x001c
            goto L_0x0029
        L_0x001c:
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r4 = "https://www.%s.facebook.com/audience_network/server_side_reward"
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r5[r1] = r0
            java.lang.String r0 = java.lang.String.format(r3, r4, r5)
            goto L_0x002b
        L_0x0029:
            java.lang.String r0 = "https://www.facebook.com/audience_network/server_side_reward"
        L_0x002b:
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.net.Uri$Builder r3 = new android.net.Uri$Builder
            r3.<init>()
            java.lang.String r4 = r0.getScheme()
            r3.scheme(r4)
            java.lang.String r4 = r0.getAuthority()
            r3.authority(r4)
            java.lang.String r4 = r0.getPath()
            r3.path(r4)
            java.lang.String r4 = r0.getQuery()
            r3.query(r4)
            java.lang.String r0 = r0.getFragment()
            r3.fragment(r0)
            java.lang.String r0 = "puid"
            com.facebook.ads.RewardData r4 = r6.f5190a
            java.lang.String r4 = r4.getUserID()
            r3.appendQueryParameter(r0, r4)
            java.lang.String r0 = "pc"
            com.facebook.ads.RewardData r4 = r6.f5190a
            java.lang.String r4 = r4.getCurrency()
            r3.appendQueryParameter(r0, r4)
            java.lang.String r0 = "ptid"
            java.lang.String r4 = r6.f5119c
            r3.appendQueryParameter(r0, r4)
            java.lang.String r0 = "appid"
            java.lang.String r4 = r6.f5123g
            r3.appendQueryParameter(r0, r4)
            android.net.Uri r0 = r3.build()
            java.lang.String r0 = r0.toString()
            goto L_0x0085
        L_0x0084:
            r0 = 0
        L_0x0085:
            com.facebook.ads.internal.adapters.b.a r3 = r6.f5126j
            r3.mo7115a(r0)
            android.content.Intent r3 = new android.content.Intent
            android.content.Context r4 = r6.f5121e
            java.lang.Class r5 = com.facebook.ads.AudienceNetworkActivity.getAdActivity()
            r3.<init>(r4, r5)
            java.lang.String r4 = "viewType"
            com.facebook.ads.internal.settings.a$a r5 = r6.f5128l
            r3.putExtra(r4, r5)
            java.lang.String r4 = "rewardedVideoAdDataBundle"
            com.facebook.ads.internal.adapters.b.a r5 = r6.f5126j
            r3.putExtra(r4, r5)
            java.lang.String r4 = "uniqueId"
            java.lang.String r5 = r6.f5119c
            r3.putExtra(r4, r5)
            java.lang.String r4 = "rewardServerURL"
            r3.putExtra(r4, r0)
            java.lang.String r0 = "placementId"
            java.lang.String r4 = r6.f5124h
            r3.putExtra(r0, r4)
            java.lang.String r0 = "requestTime"
            long r4 = r6.f5125i
            r3.putExtra(r0, r4)
            int r0 = r6.f5191b
            r4 = -1
            if (r0 == r4) goto L_0x00d8
            android.content.Context r0 = r6.f5121e
            android.content.ContentResolver r0 = r0.getContentResolver()
            java.lang.String r4 = "accelerometer_rotation"
            int r0 = android.provider.Settings.System.getInt(r0, r4, r1)
            if (r0 == r2) goto L_0x00d8
            java.lang.String r0 = "predefinedOrientationKey"
            int r1 = r6.f5191b
        L_0x00d4:
            r3.putExtra(r0, r1)
            goto L_0x00e4
        L_0x00d8:
            android.content.Context r0 = r6.f5121e
            boolean r0 = com.facebook.ads.internal.p091r.C1795a.m7466y(r0)
            if (r0 != 0) goto L_0x00e4
            java.lang.String r0 = "predefinedOrientationKey"
            r1 = 6
            goto L_0x00d4
        L_0x00e4:
            android.content.Context r0 = r6.f5121e
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 != 0) goto L_0x00f4
            int r0 = r3.getFlags()
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r0 = r0 | r1
            r3.setFlags(r0)
        L_0x00f4:
            android.content.Context r0 = r6.f5121e
            r0.startActivity(r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.adapters.C1640k.mo7318b():boolean");
    }

    public String getClientToken() {
        return this.f5126j.mo7113a();
    }

    public void onDestroy() {
        if (this.f5127k != null) {
            try {
                C0362f.m1362a(this.f5121e).mo1250a((BroadcastReceiver) this.f5127k);
            } catch (Exception unused) {
            }
        }
    }
}
