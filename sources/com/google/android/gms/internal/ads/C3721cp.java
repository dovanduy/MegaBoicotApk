package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C3025aw;
import com.google.android.gms.internal.ads.aml.C3658a.C3660b;
import javax.annotation.concurrent.GuardedBy;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.cp */
public final class C3721cp extends C3894iz implements C3735dc {
    @GuardedBy("mCancelLock")

    /* renamed from: a */
    C3929kg f12805a;

    /* renamed from: b */
    private final C3720co f12806b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C3744dl f12807c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Object f12808d = new Object();

    /* renamed from: e */
    private final Context f12809e;

    /* renamed from: f */
    private final amj f12810f;

    /* renamed from: g */
    private final amo f12811g;

    /* renamed from: h */
    private zzaef f12812h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Runnable f12813i;

    /* renamed from: j */
    private zzaej f12814j;

    /* renamed from: k */
    private bbk f12815k;

    public C3721cp(Context context, C3744dl dlVar, C3720co coVar, amo amo) {
        amj amj;
        amk amk;
        this.f12806b = coVar;
        this.f12809e = context;
        this.f12807c = dlVar;
        this.f12811g = amo;
        this.f12810f = new amj(this.f12811g);
        this.f12810f.mo14517a((amk) new C3722cq(this));
        anl anl = new anl();
        anl.f11530a = Integer.valueOf(this.f12807c.f12895j.f14506b);
        anl.f11531b = Integer.valueOf(this.f12807c.f12895j.f14507c);
        anl.f11532c = Integer.valueOf(this.f12807c.f12895j.f14508d ? 0 : 2);
        this.f12810f.mo14517a((amk) new C3723cr(anl));
        if (this.f12807c.f12891f != null) {
            this.f12810f.mo14517a((amk) new C3724cs(this));
        }
        zzjn zzjn = this.f12807c.f12888c;
        if (zzjn.f14546d && "interstitial_mb".equals(zzjn.f14543a)) {
            amj = this.f12810f;
            amk = C3725ct.f12819a;
        } else if (zzjn.f14546d && "reward_mb".equals(zzjn.f14543a)) {
            amj = this.f12810f;
            amk = C3726cu.f12820a;
        } else if (zzjn.f14550h || zzjn.f14546d) {
            amj = this.f12810f;
            amk = C3728cw.f12822a;
        } else {
            amj = this.f12810f;
            amk = C3727cv.f12821a;
        }
        amj.mo14517a(amk);
        this.f12810f.mo14518a(C3660b.AD_REQUEST);
    }

    /* renamed from: a */
    private final zzjn m16489a(zzaef zzaef) throws C3731cz {
        zzjn[] zzjnArr;
        if (((this.f12812h == null || this.f12812h.f14394V == null || this.f12812h.f14394V.size() <= 1) ? false : true) && this.f12815k != null && !this.f12815k.f12582t) {
            return null;
        }
        if (this.f12814j.f14476y) {
            for (zzjn zzjn : zzaef.f14405d.f14549g) {
                if (zzjn.f14551i) {
                    return new zzjn(zzjn, zzaef.f14405d.f14549g);
                }
            }
        }
        if (this.f12814j.f14463l == null) {
            throw new C3731cz("The ad response must specify one of the supported ad sizes.", 0);
        }
        String[] split = this.f12814j.f14463l.split("x");
        if (split.length != 2) {
            String str = "Invalid ad size format from the ad response: ";
            String valueOf = String.valueOf(this.f12814j.f14463l);
            throw new C3731cz(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), 0);
        }
        try {
            int parseInt = Integer.parseInt(split[0]);
            int parseInt2 = Integer.parseInt(split[1]);
            zzjn[] zzjnArr2 = zzaef.f14405d.f14549g;
            int length = zzjnArr2.length;
            for (int i = 0; i < length; i++) {
                zzjn zzjn2 = zzjnArr2[i];
                float f = this.f12809e.getResources().getDisplayMetrics().density;
                int i2 = zzjn2.f14547e == -1 ? (int) (((float) zzjn2.f14548f) / f) : zzjn2.f14547e;
                int i3 = zzjn2.f14544b == -2 ? (int) (((float) zzjn2.f14545c) / f) : zzjn2.f14544b;
                if (parseInt == i2 && parseInt2 == i3 && !zzjn2.f14551i) {
                    return new zzjn(zzjn2, zzaef.f14405d.f14549g);
                }
            }
            String str2 = "The ad size from the ad response was not one of the requested sizes: ";
            String valueOf2 = String.valueOf(this.f12814j.f14463l);
            throw new C3731cz(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2), 0);
        } catch (NumberFormatException unused) {
            String str3 = "Invalid ad size number from the ad response: ";
            String valueOf3 = String.valueOf(this.f12814j.f14463l);
            throw new C3731cz(valueOf3.length() != 0 ? str3.concat(valueOf3) : new String(str3), 0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m16491a(int i, String str) {
        int i2 = i;
        if (i2 == 3 || i2 == -1) {
            C3900je.m17433d(str);
        } else {
            C3900je.m17435e(str);
        }
        this.f12814j = this.f12814j == null ? new zzaej(i2) : new zzaej(i2, this.f12814j.f14461j);
        C3879ik ikVar = new C3879ik(this.f12812h != null ? this.f12812h : new zzaef(this.f12807c, -1, null, null, null), this.f12814j, this.f12815k, null, i2, -1, this.f12814j.f14464m, null, this.f12810f, null);
        this.f12806b.mo12414a(ikVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C3929kg mo15226a(zzang zzang, C4021nr<zzaef> nrVar) {
        Context context = this.f12809e;
        if (new C3734db(context).mo15238a(zzang)) {
            C3900je.m17429b("Fetching ad response from local ad request service.");
            C3741di diVar = new C3741di(context, nrVar, this);
            diVar.mo14344c();
            return diVar;
        }
        C3900je.m17429b("Fetching ad response from remote ad request service.");
        aoq.m14615a();
        if (C3975lz.m17385c(context)) {
            return new C3742dj(context, zzang, nrVar, this);
        }
        C3900je.m17435e("Failed to connect to remote ad request service.");
        return null;
    }

    /* renamed from: a */
    public final void mo12687a() {
        C3900je.m17429b("AdLoaderBackgroundTask started.");
        this.f12813i = new C3729cx(this);
        C3909jn.f13411a.postDelayed(this.f12813i, ((Long) aoq.m14620f().mo14695a(aru.f11829bA)).longValue());
        long b = C3025aw.m10924l().mo13695b();
        if (((Boolean) aoq.m14620f().mo14695a(aru.f11879by)).booleanValue() && this.f12807c.f12887b.f14527c != null) {
            String string = this.f12807c.f12887b.f14527c.getString("_ad");
            if (string != null) {
                zzaef zzaef = new zzaef(this.f12807c, b, null, null, null);
                this.f12812h = zzaef;
                mo15228a(C3780et.m16587a(this.f12809e, this.f12812h, string));
                return;
            }
        }
        C4025nv nvVar = new C4025nv();
        C3907jl.m17118a((Runnable) new C3730cy(this, nvVar));
        String h = C3025aw.m10908B().mo15400h(this.f12809e);
        String i = C3025aw.m10908B().mo15401i(this.f12809e);
        String j = C3025aw.m10908B().mo15402j(this.f12809e);
        C3025aw.m10908B().mo15397f(this.f12809e, j);
        zzaef zzaef2 = new zzaef(this.f12807c, b, h, i, j);
        this.f12812h = zzaef2;
        nvVar.mo15692a(this.f12812h);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo15227a(ana ana) {
        ana.f11486c.f11471a = this.f12807c.f12891f.packageName;
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01e9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15228a(com.google.android.gms.internal.ads.zzaej r14) {
        /*
            r13 = this;
            java.lang.String r0 = "Received ad response."
            com.google.android.gms.internal.ads.C3900je.m17429b(r0)
            r13.f12814j = r14
            com.google.android.gms.common.util.e r14 = com.google.android.gms.ads.internal.C3025aw.m10924l()
            long r6 = r14.mo13695b()
            java.lang.Object r14 = r13.f12808d
            monitor-enter(r14)
            r0 = 0
            r13.f12805a = r0     // Catch:{ all -> 0x0217 }
            monitor-exit(r14)     // Catch:{ all -> 0x0217 }
            com.google.android.gms.internal.ads.io r14 = com.google.android.gms.ads.internal.C3025aw.m10921i()
            com.google.android.gms.internal.ads.jg r14 = r14.mo15449l()
            com.google.android.gms.internal.ads.zzaej r1 = r13.f12814j
            boolean r1 = r1.f14433F
            r14.mo15499d(r1)
            com.google.android.gms.internal.ads.ark<java.lang.Boolean> r14 = com.google.android.gms.internal.ads.aru.f11795aT
            com.google.android.gms.internal.ads.ars r1 = com.google.android.gms.internal.ads.aoq.m14620f()
            java.lang.Object r14 = r1.mo14695a(r14)
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L_0x005c
            com.google.android.gms.internal.ads.zzaej r14 = r13.f12814j
            boolean r14 = r14.f14441N
            if (r14 == 0) goto L_0x004d
            com.google.android.gms.internal.ads.io r14 = com.google.android.gms.ads.internal.C3025aw.m10921i()
            com.google.android.gms.internal.ads.jg r14 = r14.mo15449l()
            com.google.android.gms.internal.ads.zzaef r1 = r13.f12812h
            java.lang.String r1 = r1.f14406e
            r14.mo15496c(r1)
            goto L_0x005c
        L_0x004d:
            com.google.android.gms.internal.ads.io r14 = com.google.android.gms.ads.internal.C3025aw.m10921i()
            com.google.android.gms.internal.ads.jg r14 = r14.mo15449l()
            com.google.android.gms.internal.ads.zzaef r1 = r13.f12812h
            java.lang.String r1 = r1.f14406e
            r14.mo15498d(r1)
        L_0x005c:
            com.google.android.gms.internal.ads.zzaej r14 = r13.f12814j     // Catch:{ cz -> 0x020a }
            int r14 = r14.f14455d     // Catch:{ cz -> 0x020a }
            r1 = -2
            r2 = -3
            if (r14 == r1) goto L_0x008b
            com.google.android.gms.internal.ads.zzaej r14 = r13.f12814j     // Catch:{ cz -> 0x020a }
            int r14 = r14.f14455d     // Catch:{ cz -> 0x020a }
            if (r14 == r2) goto L_0x008b
            com.google.android.gms.internal.ads.cz r14 = new com.google.android.gms.internal.ads.cz     // Catch:{ cz -> 0x020a }
            com.google.android.gms.internal.ads.zzaej r0 = r13.f12814j     // Catch:{ cz -> 0x020a }
            int r0 = r0.f14455d     // Catch:{ cz -> 0x020a }
            r1 = 66
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ cz -> 0x020a }
            r2.<init>(r1)     // Catch:{ cz -> 0x020a }
            java.lang.String r1 = "There was a problem getting an ad response. ErrorCode: "
            r2.append(r1)     // Catch:{ cz -> 0x020a }
            r2.append(r0)     // Catch:{ cz -> 0x020a }
            java.lang.String r0 = r2.toString()     // Catch:{ cz -> 0x020a }
            com.google.android.gms.internal.ads.zzaej r1 = r13.f12814j     // Catch:{ cz -> 0x020a }
            int r1 = r1.f14455d     // Catch:{ cz -> 0x020a }
            r14.<init>(r0, r1)     // Catch:{ cz -> 0x020a }
            throw r14     // Catch:{ cz -> 0x020a }
        L_0x008b:
            com.google.android.gms.internal.ads.zzaej r14 = r13.f12814j     // Catch:{ cz -> 0x020a }
            int r14 = r14.f14455d     // Catch:{ cz -> 0x020a }
            r1 = 0
            if (r14 == r2) goto L_0x0139
            com.google.android.gms.internal.ads.zzaej r14 = r13.f12814j     // Catch:{ cz -> 0x020a }
            java.lang.String r14 = r14.f14453b     // Catch:{ cz -> 0x020a }
            boolean r14 = android.text.TextUtils.isEmpty(r14)     // Catch:{ cz -> 0x020a }
            if (r14 == 0) goto L_0x00a5
            com.google.android.gms.internal.ads.cz r14 = new com.google.android.gms.internal.ads.cz     // Catch:{ cz -> 0x020a }
            java.lang.String r0 = "No fill from ad server."
            r1 = 3
            r14.<init>(r0, r1)     // Catch:{ cz -> 0x020a }
            throw r14     // Catch:{ cz -> 0x020a }
        L_0x00a5:
            com.google.android.gms.internal.ads.io r14 = com.google.android.gms.ads.internal.C3025aw.m10921i()     // Catch:{ cz -> 0x020a }
            com.google.android.gms.internal.ads.jg r14 = r14.mo15449l()     // Catch:{ cz -> 0x020a }
            com.google.android.gms.internal.ads.zzaej r2 = r13.f12814j     // Catch:{ cz -> 0x020a }
            boolean r2 = r2.f14471t     // Catch:{ cz -> 0x020a }
            r14.mo15488a(r2)     // Catch:{ cz -> 0x020a }
            com.google.android.gms.internal.ads.zzaej r14 = r13.f12814j     // Catch:{ cz -> 0x020a }
            boolean r14 = r14.f14458g     // Catch:{ cz -> 0x020a }
            if (r14 == 0) goto L_0x00f8
            com.google.android.gms.internal.ads.bbk r14 = new com.google.android.gms.internal.ads.bbk     // Catch:{ JSONException -> 0x00d1 }
            com.google.android.gms.internal.ads.zzaej r2 = r13.f12814j     // Catch:{ JSONException -> 0x00d1 }
            java.lang.String r2 = r2.f14453b     // Catch:{ JSONException -> 0x00d1 }
            r14.<init>(r2)     // Catch:{ JSONException -> 0x00d1 }
            r13.f12815k = r14     // Catch:{ JSONException -> 0x00d1 }
            com.google.android.gms.internal.ads.io r14 = com.google.android.gms.ads.internal.C3025aw.m10921i()     // Catch:{ JSONException -> 0x00d1 }
            com.google.android.gms.internal.ads.bbk r2 = r13.f12815k     // Catch:{ JSONException -> 0x00d1 }
            boolean r2 = r2.f12570h     // Catch:{ JSONException -> 0x00d1 }
            r14.mo15437a(r2)     // Catch:{ JSONException -> 0x00d1 }
            goto L_0x0103
        L_0x00d1:
            r14 = move-exception
            java.lang.String r0 = "Could not parse mediation config."
            com.google.android.gms.internal.ads.C3900je.m17430b(r0, r14)     // Catch:{ cz -> 0x020a }
            com.google.android.gms.internal.ads.cz r14 = new com.google.android.gms.internal.ads.cz     // Catch:{ cz -> 0x020a }
            java.lang.String r0 = "Could not parse mediation config: "
            com.google.android.gms.internal.ads.zzaej r2 = r13.f12814j     // Catch:{ cz -> 0x020a }
            java.lang.String r2 = r2.f14453b     // Catch:{ cz -> 0x020a }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ cz -> 0x020a }
            int r3 = r2.length()     // Catch:{ cz -> 0x020a }
            if (r3 == 0) goto L_0x00ee
            java.lang.String r0 = r0.concat(r2)     // Catch:{ cz -> 0x020a }
            goto L_0x00f4
        L_0x00ee:
            java.lang.String r2 = new java.lang.String     // Catch:{ cz -> 0x020a }
            r2.<init>(r0)     // Catch:{ cz -> 0x020a }
            r0 = r2
        L_0x00f4:
            r14.<init>(r0, r1)     // Catch:{ cz -> 0x020a }
            throw r14     // Catch:{ cz -> 0x020a }
        L_0x00f8:
            com.google.android.gms.internal.ads.io r14 = com.google.android.gms.ads.internal.C3025aw.m10921i()     // Catch:{ cz -> 0x020a }
            com.google.android.gms.internal.ads.zzaej r2 = r13.f12814j     // Catch:{ cz -> 0x020a }
            boolean r2 = r2.f14436I     // Catch:{ cz -> 0x020a }
            r14.mo15437a(r2)     // Catch:{ cz -> 0x020a }
        L_0x0103:
            com.google.android.gms.internal.ads.zzaej r14 = r13.f12814j     // Catch:{ cz -> 0x020a }
            java.lang.String r14 = r14.f14434G     // Catch:{ cz -> 0x020a }
            boolean r14 = android.text.TextUtils.isEmpty(r14)     // Catch:{ cz -> 0x020a }
            if (r14 != 0) goto L_0x0139
            com.google.android.gms.internal.ads.ark<java.lang.Boolean> r14 = com.google.android.gms.internal.ads.aru.f11884cC     // Catch:{ cz -> 0x020a }
            com.google.android.gms.internal.ads.ars r2 = com.google.android.gms.internal.ads.aoq.m14620f()     // Catch:{ cz -> 0x020a }
            java.lang.Object r14 = r2.mo14695a(r14)     // Catch:{ cz -> 0x020a }
            java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch:{ cz -> 0x020a }
            boolean r14 = r14.booleanValue()     // Catch:{ cz -> 0x020a }
            if (r14 == 0) goto L_0x0139
            java.lang.String r14 = "Received cookie from server. Setting webview cookie in CookieManager."
            com.google.android.gms.internal.ads.C3900je.m17429b(r14)     // Catch:{ cz -> 0x020a }
            com.google.android.gms.internal.ads.jt r14 = com.google.android.gms.ads.internal.C3025aw.m10919g()     // Catch:{ cz -> 0x020a }
            android.content.Context r2 = r13.f12809e     // Catch:{ cz -> 0x020a }
            android.webkit.CookieManager r14 = r14.mo15550c(r2)     // Catch:{ cz -> 0x020a }
            if (r14 == 0) goto L_0x0139
            java.lang.String r2 = "googleads.g.doubleclick.net"
            com.google.android.gms.internal.ads.zzaej r3 = r13.f12814j     // Catch:{ cz -> 0x020a }
            java.lang.String r3 = r3.f14434G     // Catch:{ cz -> 0x020a }
            r14.setCookie(r2, r3)     // Catch:{ cz -> 0x020a }
        L_0x0139:
            com.google.android.gms.internal.ads.zzaef r14 = r13.f12812h     // Catch:{ cz -> 0x020a }
            com.google.android.gms.internal.ads.zzjn r14 = r14.f14405d     // Catch:{ cz -> 0x020a }
            com.google.android.gms.internal.ads.zzjn[] r14 = r14.f14549g     // Catch:{ cz -> 0x020a }
            if (r14 == 0) goto L_0x0149
            com.google.android.gms.internal.ads.zzaef r14 = r13.f12812h     // Catch:{ cz -> 0x020a }
            com.google.android.gms.internal.ads.zzjn r14 = r13.m16489a(r14)     // Catch:{ cz -> 0x020a }
            r4 = r14
            goto L_0x014a
        L_0x0149:
            r4 = r0
        L_0x014a:
            com.google.android.gms.internal.ads.io r14 = com.google.android.gms.ads.internal.C3025aw.m10921i()
            com.google.android.gms.internal.ads.jg r14 = r14.mo15449l()
            com.google.android.gms.internal.ads.zzaej r2 = r13.f12814j
            boolean r2 = r2.f14472u
            r14.mo15493b(r2)
            com.google.android.gms.internal.ads.io r14 = com.google.android.gms.ads.internal.C3025aw.m10921i()
            com.google.android.gms.internal.ads.jg r14 = r14.mo15449l()
            com.google.android.gms.internal.ads.zzaej r2 = r13.f12814j
            boolean r2 = r2.f14440M
            r14.mo15497c(r2)
            com.google.android.gms.internal.ads.zzaej r14 = r13.f12814j
            java.lang.String r14 = r14.f14468q
            boolean r14 = android.text.TextUtils.isEmpty(r14)
            if (r14 != 0) goto L_0x0183
            org.json.JSONObject r14 = new org.json.JSONObject     // Catch:{ Exception -> 0x017d }
            com.google.android.gms.internal.ads.zzaej r2 = r13.f12814j     // Catch:{ Exception -> 0x017d }
            java.lang.String r2 = r2.f14468q     // Catch:{ Exception -> 0x017d }
            r14.<init>(r2)     // Catch:{ Exception -> 0x017d }
            r10 = r14
            goto L_0x0184
        L_0x017d:
            r14 = move-exception
            java.lang.String r2 = "Error parsing the JSON for Active View."
            com.google.android.gms.internal.ads.C3900je.m17430b(r2, r14)
        L_0x0183:
            r10 = r0
        L_0x0184:
            com.google.android.gms.internal.ads.zzaej r14 = r13.f12814j
            int r14 = r14.f14443P
            r2 = 2
            r3 = 1
            if (r14 != r2) goto L_0x01cb
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            com.google.android.gms.internal.ads.zzaef r14 = r13.f12812h
            com.google.android.gms.internal.ads.zzjj r14 = r14.f14404c
            android.os.Bundle r2 = r14.f14537m
            if (r2 == 0) goto L_0x019b
            android.os.Bundle r14 = r14.f14537m
            goto L_0x01a0
        L_0x019b:
            android.os.Bundle r14 = new android.os.Bundle
            r14.<init>()
        L_0x01a0:
            java.lang.Class<com.google.ads.mediation.admob.AdMobAdapter> r2 = com.google.ads.mediation.admob.AdMobAdapter.class
            java.lang.String r2 = r2.getName()
            android.os.Bundle r2 = r14.getBundle(r2)
            if (r2 == 0) goto L_0x01b7
            java.lang.Class<com.google.ads.mediation.admob.AdMobAdapter> r2 = com.google.ads.mediation.admob.AdMobAdapter.class
            java.lang.String r2 = r2.getName()
            android.os.Bundle r14 = r14.getBundle(r2)
            goto L_0x01c6
        L_0x01b7:
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.Class<com.google.ads.mediation.admob.AdMobAdapter> r5 = com.google.ads.mediation.admob.AdMobAdapter.class
            java.lang.String r5 = r5.getName()
            r14.putBundle(r5, r2)
            r14 = r2
        L_0x01c6:
            java.lang.String r2 = "render_test_label"
            r14.putBoolean(r2, r3)
        L_0x01cb:
            com.google.android.gms.internal.ads.zzaej r14 = r13.f12814j
            int r14 = r14.f14443P
            if (r14 != r3) goto L_0x01d5
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
        L_0x01d5:
            com.google.android.gms.internal.ads.zzaej r14 = r13.f12814j
            int r14 = r14.f14443P
            if (r14 != 0) goto L_0x01e9
            com.google.android.gms.internal.ads.zzaef r14 = r13.f12812h
            com.google.android.gms.internal.ads.zzjj r14 = r14.f14404c
            boolean r14 = com.google.android.gms.internal.ads.C3967lr.m17352a(r14)
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            r12 = r14
            goto L_0x01ea
        L_0x01e9:
            r12 = r0
        L_0x01ea:
            com.google.android.gms.internal.ads.ik r14 = new com.google.android.gms.internal.ads.ik
            com.google.android.gms.internal.ads.zzaef r1 = r13.f12812h
            com.google.android.gms.internal.ads.zzaej r2 = r13.f12814j
            com.google.android.gms.internal.ads.bbk r3 = r13.f12815k
            r5 = -2
            com.google.android.gms.internal.ads.zzaej r0 = r13.f12814j
            long r8 = r0.f14464m
            com.google.android.gms.internal.ads.amj r11 = r13.f12810f
            r0 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r10, r11, r12)
            com.google.android.gms.internal.ads.co r0 = r13.f12806b
            r0.mo12414a(r14)
        L_0x0202:
            android.os.Handler r14 = com.google.android.gms.internal.ads.C3909jn.f13411a
            java.lang.Runnable r0 = r13.f12813i
            r14.removeCallbacks(r0)
            return
        L_0x020a:
            r14 = move-exception
            int r0 = r14.mo15232a()
            java.lang.String r14 = r14.getMessage()
            r13.m16491a(r0, r14)
            goto L_0x0202
        L_0x0217:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x0217 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3721cp.mo15228a(com.google.android.gms.internal.ads.zzaej):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo15229b(ana ana) {
        ana.f11484a = this.f12807c.f12907v;
    }

    /* renamed from: e_ */
    public final void mo12688e_() {
        synchronized (this.f12808d) {
            if (this.f12805a != null) {
                this.f12805a.mo14343b();
            }
        }
    }
}
