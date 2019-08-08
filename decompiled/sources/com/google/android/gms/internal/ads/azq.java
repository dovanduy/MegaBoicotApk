package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C3025aw;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3718cm
public final class azq {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Object f12464a;

    /* renamed from: b */
    private final Context f12465b;

    /* renamed from: c */
    private final String f12466c;

    /* renamed from: d */
    private final zzang f12467d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C3941ks<aze> f12468e;

    /* renamed from: f */
    private C3941ks<aze> f12469f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public bah f12470g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f12471h;

    public azq(Context context, zzang zzang, String str) {
        this.f12464a = new Object();
        this.f12471h = 1;
        this.f12466c = str;
        this.f12465b = context.getApplicationContext();
        this.f12467d = zzang;
        this.f12468e = new bac();
        this.f12469f = new bac();
    }

    public azq(Context context, zzang zzang, String str, C3941ks<aze> ksVar, C3941ks<aze> ksVar2) {
        this(context, zzang, str);
        this.f12468e = ksVar;
        this.f12469f = ksVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bah mo15027a(agw agw) {
        bah bah = new bah(this.f12469f);
        C4014nk.f13617a.execute(new azr(this, agw, bah));
        bah.mo15691a(new azz(this, bah), new baa(this, bah));
        return bah;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo15028a(agw agw, bah bah) {
        try {
            Context context = this.f12465b;
            zzang zzang = this.f12467d;
            aze ayp = ((Boolean) aoq.m14620f().mo14695a(aru.f11776aA)).booleanValue() ? new ayp(context, zzang) : new azg(context, zzang, agw, null);
            ayp.mo14989a((azf) new azs(this, bah, ayp));
            ayp.mo15016a("/jsLoaded", new azv(this, bah, ayp));
            C3965lp lpVar = new C3965lp();
            azw azw = new azw(this, agw, ayp, lpVar);
            lpVar.mo15610a(azw);
            ayp.mo15016a("/requestReload", azw);
            if (this.f12466c.endsWith(".js")) {
                ayp.mo14990a(this.f12466c);
            } else if (this.f12466c.startsWith("<html>")) {
                ayp.mo14995c(this.f12466c);
            } else {
                ayp.mo14996d(this.f12466c);
            }
            C3909jn.f13411a.postDelayed(new azx(this, bah, ayp), (long) bab.f12499a);
        } catch (Throwable th) {
            C3900je.m17430b("Error creating webview.", th);
            C3025aw.m10921i().mo15436a(th, "SdkJavascriptFactory.loadJavascriptEngine");
            bah.mo15693a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo15029a(com.google.android.gms.internal.ads.bah r4, com.google.android.gms.internal.ads.aze r5) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f12464a
            monitor-enter(r0)
            int r1 = r4.mo15694b()     // Catch:{ all -> 0x002a }
            r2 = -1
            if (r1 == r2) goto L_0x0028
            int r1 = r4.mo15694b()     // Catch:{ all -> 0x002a }
            r2 = 1
            if (r1 != r2) goto L_0x0012
            goto L_0x0028
        L_0x0012:
            r4.mo15693a()     // Catch:{ all -> 0x002a }
            java.util.concurrent.Executor r4 = com.google.android.gms.internal.ads.C4014nk.f13617a     // Catch:{ all -> 0x002a }
            r5.getClass()     // Catch:{ all -> 0x002a }
            java.lang.Runnable r5 = com.google.android.gms.internal.ads.azu.m15856a(r5)     // Catch:{ all -> 0x002a }
            r4.execute(r5)     // Catch:{ all -> 0x002a }
            java.lang.String r4 = "Could not receive loaded message in a timely manner. Rejecting."
            com.google.android.gms.internal.ads.C3900je.m17043a(r4)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x0028:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x002a:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.azq.mo15029a(com.google.android.gms.internal.ads.bah, com.google.android.gms.internal.ads.aze):void");
    }

    /* renamed from: b */
    public final bad mo15030b(agw agw) {
        synchronized (this.f12464a) {
            if (this.f12470g != null) {
                if (this.f12470g.mo15694b() != -1) {
                    if (this.f12471h == 0) {
                        bad c = this.f12470g.mo15038c();
                        return c;
                    } else if (this.f12471h == 1) {
                        this.f12471h = 2;
                        mo15027a((agw) null);
                        bad c2 = this.f12470g.mo15038c();
                        return c2;
                    } else if (this.f12471h == 2) {
                        bad c3 = this.f12470g.mo15038c();
                        return c3;
                    } else {
                        bad c4 = this.f12470g.mo15038c();
                        return c4;
                    }
                }
            }
            this.f12471h = 2;
            this.f12470g = mo15027a((agw) null);
            bad c5 = this.f12470g.mo15038c();
            return c5;
        }
    }
}
