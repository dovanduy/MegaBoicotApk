package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.exoplayer2.extractor.MpegAudioHeader;
import com.google.android.gms.ads.internal.C3025aw;
import com.google.android.gms.common.p140b.C3404c;
import com.google.android.gms.common.util.C3563o;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.DynamiteModule.C3606a;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3718cm
/* renamed from: com.google.android.gms.internal.ads.io */
public final class C3883io implements C3906jk {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Object f13322a = new Object();

    /* renamed from: b */
    private aji f13323b;

    /* renamed from: c */
    private final C3890iv f13324c = new C3890iv();

    /* renamed from: d */
    private final C3902jg f13325d = new C3902jg();

    /* renamed from: e */
    private boolean f13326e = false;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Context f13327f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public zzang f13328g;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: h */
    public arx f13329h = null;
    @Nullable

    /* renamed from: i */
    private alc f13330i = null;
    @Nullable

    /* renamed from: j */
    private akx f13331j = null;
    @Nullable

    /* renamed from: k */
    private Boolean f13332k = null;

    /* renamed from: l */
    private String f13333l;

    /* renamed from: m */
    private final AtomicInteger f13334m = new AtomicInteger(0);

    /* renamed from: n */
    private final C3886ir f13335n = new C3886ir(null);

    /* renamed from: o */
    private final Object f13336o = new Object();

    /* renamed from: p */
    private C4008ne<ArrayList<String>> f13337p;

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007e, code lost:
        return null;
     */
    @javax.annotation.Nullable
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.ads.alc m16975a(@javax.annotation.Nullable android.content.Context r4, boolean r5, boolean r6) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.ark<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.aru.f11765Q
            com.google.android.gms.internal.ads.ars r1 = com.google.android.gms.internal.ads.aoq.m14620f()
            java.lang.Object r0 = r1.mo14695a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 != 0) goto L_0x0014
            return r1
        L_0x0014:
            boolean r0 = com.google.android.gms.common.util.C3563o.m12763b()
            if (r0 != 0) goto L_0x001b
            return r1
        L_0x001b:
            com.google.android.gms.internal.ads.ark<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.aru.f11773Y
            com.google.android.gms.internal.ads.ars r2 = com.google.android.gms.internal.ads.aoq.m14620f()
            java.lang.Object r0 = r2.mo14695a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0040
            com.google.android.gms.internal.ads.ark<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.aru.f11771W
            com.google.android.gms.internal.ads.ars r2 = com.google.android.gms.internal.ads.aoq.m14620f()
            java.lang.Object r0 = r2.mo14695a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0040
            return r1
        L_0x0040:
            if (r5 == 0) goto L_0x0045
            if (r6 == 0) goto L_0x0045
            return r1
        L_0x0045:
            java.lang.Object r5 = r3.f13322a
            monitor-enter(r5)
            android.os.Looper r6 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x007f }
            if (r6 == 0) goto L_0x007d
            if (r4 != 0) goto L_0x0051
            goto L_0x007d
        L_0x0051:
            com.google.android.gms.internal.ads.akx r6 = r3.f13331j     // Catch:{ all -> 0x007f }
            if (r6 != 0) goto L_0x005c
            com.google.android.gms.internal.ads.akx r6 = new com.google.android.gms.internal.ads.akx     // Catch:{ all -> 0x007f }
            r6.<init>()     // Catch:{ all -> 0x007f }
            r3.f13331j = r6     // Catch:{ all -> 0x007f }
        L_0x005c:
            com.google.android.gms.internal.ads.alc r6 = r3.f13330i     // Catch:{ all -> 0x007f }
            if (r6 != 0) goto L_0x006f
            com.google.android.gms.internal.ads.alc r6 = new com.google.android.gms.internal.ads.alc     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.ads.akx r0 = r3.f13331j     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.ads.zzang r1 = r3.f13328g     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.ads.ck r4 = com.google.android.gms.internal.ads.C3712cg.m16480a(r4, r1)     // Catch:{ all -> 0x007f }
            r6.<init>(r0, r4)     // Catch:{ all -> 0x007f }
            r3.f13330i = r6     // Catch:{ all -> 0x007f }
        L_0x006f:
            com.google.android.gms.internal.ads.alc r4 = r3.f13330i     // Catch:{ all -> 0x007f }
            r4.mo14478a()     // Catch:{ all -> 0x007f }
            java.lang.String r4 = "start fetching content..."
            com.google.android.gms.internal.ads.C3900je.m17433d(r4)     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.ads.alc r4 = r3.f13330i     // Catch:{ all -> 0x007f }
            monitor-exit(r5)     // Catch:{ all -> 0x007f }
            return r4
        L_0x007d:
            monitor-exit(r5)     // Catch:{ all -> 0x007f }
            return r1
        L_0x007f:
            r4 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x007f }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3883io.m16975a(android.content.Context, boolean, boolean):com.google.android.gms.internal.ads.alc");
    }

    @TargetApi(16)
    /* renamed from: b */
    private static ArrayList<String> m16977b(Context context) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            PackageInfo b = C3404c.m12230a(context).mo13395b(context.getApplicationInfo().packageName, MpegAudioHeader.MAX_FRAME_SIZE_BYTES);
            if (b.requestedPermissions == null || b.requestedPermissionsFlags == null) {
                return arrayList;
            }
            for (int i = 0; i < b.requestedPermissions.length; i++) {
                if ((b.requestedPermissionsFlags[i] & 2) != 0) {
                    arrayList.add(b.requestedPermissions[i]);
                }
            }
            return arrayList;
        } catch (NameNotFoundException unused) {
        }
    }

    @Nullable
    /* renamed from: a */
    public final alc mo15431a(@Nullable Context context) {
        return m16975a(context, this.f13325d.mo15494b(), this.f13325d.mo15500d());
    }

    /* renamed from: a */
    public final C3890iv mo15432a() {
        return this.f13324c;
    }

    @TargetApi(23)
    /* renamed from: a */
    public final void mo15433a(Context context, zzang zzang) {
        arx arx;
        synchronized (this.f13322a) {
            if (!this.f13326e) {
                this.f13327f = context.getApplicationContext();
                this.f13328g = zzang;
                C3025aw.m10920h().mo14462a((alb) C3025aw.m10922j());
                this.f13325d.mo15484a(this.f13327f);
                this.f13325d.mo15485a((C3906jk) this);
                C3712cg.m16480a(this.f13327f, this.f13328g);
                this.f13333l = C3025aw.m10917e().mo15521b(context, zzang.f14505a);
                this.f13323b = new aji(context.getApplicationContext(), this.f13328g);
                C3025aw.m10926n();
                if (!((Boolean) aoq.m14620f().mo14695a(aru.f11762N)).booleanValue()) {
                    C3900je.m17043a("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                    arx = null;
                } else {
                    arx = new arx();
                }
                this.f13329h = arx;
                C3994mr.m17444a((C4008ne) new C3885iq(this).mo14344c(), "AppState.registerCsiReporter");
                this.f13326e = true;
                mo15451n();
            }
        }
    }

    /* renamed from: a */
    public final void mo15434a(Bundle bundle) {
        if (bundle.containsKey("content_url_opted_out") && bundle.containsKey("content_vertical_opted_out")) {
            m16975a(this.f13327f, bundle.getBoolean("content_url_opted_out"), bundle.getBoolean("content_vertical_opted_out"));
        }
    }

    /* renamed from: a */
    public final void mo15435a(Boolean bool) {
        synchronized (this.f13322a) {
            this.f13332k = bool;
        }
    }

    /* renamed from: a */
    public final void mo15436a(Throwable th, String str) {
        C3712cg.m16480a(this.f13327f, this.f13328g).mo15221a(th, str);
    }

    /* renamed from: a */
    public final void mo15437a(boolean z) {
        this.f13335n.mo15454a(z);
    }

    @Nullable
    /* renamed from: b */
    public final arx mo15438b() {
        arx arx;
        synchronized (this.f13322a) {
            arx = this.f13329h;
        }
        return arx;
    }

    /* renamed from: b */
    public final void mo15439b(Throwable th, String str) {
        C3712cg.m16480a(this.f13327f, this.f13328g).mo15222a(th, str, ((Float) aoq.m14620f().mo14695a(aru.f12037f)).floatValue());
    }

    /* renamed from: c */
    public final Boolean mo15440c() {
        Boolean bool;
        synchronized (this.f13322a) {
            bool = this.f13332k;
        }
        return bool;
    }

    /* renamed from: d */
    public final boolean mo15441d() {
        return this.f13335n.mo15455a();
    }

    /* renamed from: e */
    public final boolean mo15442e() {
        return this.f13335n.mo15456b();
    }

    /* renamed from: f */
    public final void mo15443f() {
        this.f13335n.mo15457c();
    }

    /* renamed from: g */
    public final aji mo15444g() {
        return this.f13323b;
    }

    @Nullable
    /* renamed from: h */
    public final Resources mo15445h() {
        if (this.f13328g.f14508d) {
            return this.f13327f.getResources();
        }
        try {
            DynamiteModule a = DynamiteModule.m12874a(this.f13327f, DynamiteModule.f10249a, ModuleDescriptor.MODULE_ID);
            if (a != null) {
                return a.mo13743a().getResources();
            }
            return null;
        } catch (C3606a e) {
            C3900je.m17432c("Cannot load resource from dynamite apk or local jar", e);
            return null;
        }
    }

    /* renamed from: i */
    public final void mo15446i() {
        this.f13334m.incrementAndGet();
    }

    /* renamed from: j */
    public final void mo15447j() {
        this.f13334m.decrementAndGet();
    }

    /* renamed from: k */
    public final int mo15448k() {
        return this.f13334m.get();
    }

    /* renamed from: l */
    public final C3902jg mo15449l() {
        C3902jg jgVar;
        synchronized (this.f13322a) {
            jgVar = this.f13325d;
        }
        return jgVar;
    }

    @Nullable
    /* renamed from: m */
    public final Context mo15450m() {
        return this.f13327f;
    }

    /* renamed from: n */
    public final C4008ne<ArrayList<String>> mo15451n() {
        if (this.f13327f != null && C3563o.m12765d()) {
            if (!((Boolean) aoq.m14620f().mo14695a(aru.f11836bH)).booleanValue()) {
                synchronized (this.f13336o) {
                    if (this.f13337p != null) {
                        C4008ne<ArrayList<String>> neVar = this.f13337p;
                        return neVar;
                    }
                    C4008ne<ArrayList<String>> a = C3907jl.m17119a((Callable<T>) new C3884ip<T>(this));
                    this.f13337p = a;
                    return a;
                }
            }
        }
        return C3996mt.m17448a(new ArrayList());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public final /* synthetic */ ArrayList mo15452o() throws Exception {
        return m16977b(this.f13327f);
    }
}
