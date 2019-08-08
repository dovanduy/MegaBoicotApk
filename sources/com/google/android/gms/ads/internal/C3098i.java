package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.RemoteException;
import android.support.p017v4.p023d.C0398m;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.internal.ads.C3718cm;
import com.google.android.gms.internal.ads.C3900je;
import com.google.android.gms.internal.ads.C3909jn;
import com.google.android.gms.internal.ads.aoq;
import com.google.android.gms.internal.ads.aow;
import com.google.android.gms.internal.ads.apa;
import com.google.android.gms.internal.ads.apw;
import com.google.android.gms.internal.ads.aru;
import com.google.android.gms.internal.ads.avi;
import com.google.android.gms.internal.ads.avl;
import com.google.android.gms.internal.ads.avp;
import com.google.android.gms.internal.ads.avs;
import com.google.android.gms.internal.ads.avv;
import com.google.android.gms.internal.ads.avy;
import com.google.android.gms.internal.ads.bca;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzjj;
import com.google.android.gms.internal.ads.zzjn;
import com.google.android.gms.internal.ads.zzpl;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3718cm
/* renamed from: com.google.android.gms.ads.internal.i */
public final class C3098i extends apa {

    /* renamed from: a */
    private final Context f9011a;

    /* renamed from: b */
    private final aow f9012b;

    /* renamed from: c */
    private final bca f9013c;

    /* renamed from: d */
    private final avi f9014d;

    /* renamed from: e */
    private final avy f9015e;

    /* renamed from: f */
    private final avl f9016f;

    /* renamed from: g */
    private final avv f9017g;

    /* renamed from: h */
    private final zzjn f9018h;

    /* renamed from: i */
    private final PublisherAdViewOptions f9019i;

    /* renamed from: j */
    private final C0398m<String, avs> f9020j;

    /* renamed from: k */
    private final C0398m<String, avp> f9021k;

    /* renamed from: l */
    private final zzpl f9022l;

    /* renamed from: m */
    private final List<String> f9023m;

    /* renamed from: n */
    private final apw f9024n;

    /* renamed from: o */
    private final String f9025o;

    /* renamed from: p */
    private final zzang f9026p;

    /* renamed from: q */
    private WeakReference<C3030ba> f9027q;

    /* renamed from: r */
    private final C3049bt f9028r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final Object f9029s = new Object();

    C3098i(Context context, String str, bca bca, zzang zzang, aow aow, avi avi, avy avy, avl avl, C0398m<String, avs> mVar, C0398m<String, avp> mVar2, zzpl zzpl, apw apw, C3049bt btVar, avv avv, zzjn zzjn, PublisherAdViewOptions publisherAdViewOptions) {
        this.f9011a = context;
        this.f9025o = str;
        this.f9013c = bca;
        this.f9026p = zzang;
        this.f9012b = aow;
        this.f9016f = avl;
        this.f9014d = avi;
        this.f9015e = avy;
        this.f9020j = mVar;
        this.f9021k = mVar2;
        this.f9022l = zzpl;
        this.f9023m = m11122f();
        this.f9024n = apw;
        this.f9028r = btVar;
        this.f9017g = avv;
        this.f9018h = zzjn;
        this.f9019i = publisherAdViewOptions;
        aru.m15024a(this.f9011a);
    }

    /* renamed from: a */
    private final void m11113a(int i) {
        if (this.f9012b != null) {
            try {
                this.f9012b.mo14530a(0);
            } catch (RemoteException e) {
                C3900je.m17432c("Failed calling onAdFailedToLoad.", e);
            }
        }
    }

    /* renamed from: a */
    private static void m11116a(Runnable runnable) {
        C3909jn.f13411a.post(runnable);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m11117b(zzjj zzjj) {
        if (((Boolean) aoq.m14620f().mo14695a(aru.f11919cl)).booleanValue() || this.f9015e == null) {
            C3043bn bnVar = new C3043bn(this.f9011a, this.f9028r, this.f9018h, this.f9025o, this.f9013c, this.f9026p);
            this.f9027q = new WeakReference<>(bnVar);
            avv avv = this.f9017g;
            C3513t.m12634b("setOnPublisherAdViewLoadedListener must be called on the main UI thread.");
            bnVar.f8733e.f8881z = avv;
            if (this.f9019i != null) {
                if (this.f9019i.mo12294b() != null) {
                    bnVar.mo12408a(this.f9019i.mo12294b());
                }
                bnVar.mo12430b(this.f9019i.mo12293a());
            }
            avi avi = this.f9014d;
            C3513t.m12634b("setOnAppInstallAdLoadedListener must be called on the main UI thread.");
            bnVar.f8733e.f8873r = avi;
            avy avy = this.f9015e;
            C3513t.m12634b("setOnUnifiedNativeAdLoadedListener must be called on the main UI thread.");
            bnVar.f8733e.f8875t = avy;
            avl avl = this.f9016f;
            C3513t.m12634b("setOnContentAdLoadedListener must be called on the main UI thread.");
            bnVar.f8733e.f8874s = avl;
            C0398m<String, avs> mVar = this.f9020j;
            C3513t.m12634b("setOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
            bnVar.f8733e.f8877v = mVar;
            C0398m<String, avp> mVar2 = this.f9021k;
            C3513t.m12634b("setOnCustomClickListener must be called on the main UI thread.");
            bnVar.f8733e.f8876u = mVar2;
            zzpl zzpl = this.f9022l;
            C3513t.m12634b("setNativeAdOptions must be called on the main UI thread.");
            bnVar.f8733e.f8878w = zzpl;
            bnVar.mo12578c(m11122f());
            bnVar.mo12406a(this.f9012b);
            bnVar.mo12409a(this.f9024n);
            ArrayList arrayList = new ArrayList();
            if (m11121e()) {
                arrayList.add(Integer.valueOf(1));
            }
            if (this.f9017g != null) {
                arrayList.add(Integer.valueOf(2));
            }
            bnVar.mo12579d(arrayList);
            if (m11121e()) {
                zzjj.f14527c.putBoolean("ina", true);
            }
            if (this.f9017g != null) {
                zzjj.f14527c.putBoolean("iba", true);
            }
            bnVar.mo12431b(zzjj);
            return;
        }
        m11113a(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m11118b(zzjj zzjj, int i) {
        if (((Boolean) aoq.m14620f().mo14695a(aru.f11919cl)).booleanValue() || this.f9015e == null) {
            C3006ad adVar = new C3006ad(this.f9011a, this.f9028r, zzjn.m18803a(this.f9011a), this.f9025o, this.f9013c, this.f9026p);
            this.f9027q = new WeakReference<>(adVar);
            avi avi = this.f9014d;
            C3513t.m12634b("setOnAppInstallAdLoadedListener must be called on the main UI thread.");
            adVar.f8733e.f8873r = avi;
            avy avy = this.f9015e;
            C3513t.m12634b("setOnUnifiedNativeAdLoadedListener must be called on the main UI thread.");
            adVar.f8733e.f8875t = avy;
            avl avl = this.f9016f;
            C3513t.m12634b("setOnContentAdLoadedListener must be called on the main UI thread.");
            adVar.f8733e.f8874s = avl;
            C0398m<String, avs> mVar = this.f9020j;
            C3513t.m12634b("setOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
            adVar.f8733e.f8877v = mVar;
            adVar.mo12406a(this.f9012b);
            C0398m<String, avp> mVar2 = this.f9021k;
            C3513t.m12634b("setOnCustomClickListener must be called on the main UI thread.");
            adVar.f8733e.f8876u = mVar2;
            adVar.mo12480c(m11122f());
            zzpl zzpl = this.f9022l;
            C3513t.m12634b("setNativeAdOptions must be called on the main UI thread.");
            adVar.f8733e.f8878w = zzpl;
            adVar.mo12409a(this.f9024n);
            adVar.mo12477b(i);
            adVar.mo12431b(zzjj);
            return;
        }
        m11113a(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final boolean m11120d() {
        return ((Boolean) aoq.m14620f().mo14695a(aru.f11788aM)).booleanValue() && this.f9017g != null;
    }

    /* renamed from: e */
    private final boolean m11121e() {
        return (this.f9014d == null && this.f9016f == null && this.f9015e == null && (this.f9020j == null || this.f9020j.size() <= 0)) ? false : true;
    }

    /* renamed from: f */
    private final List<String> m11122f() {
        ArrayList arrayList = new ArrayList();
        if (this.f9016f != null) {
            arrayList.add("1");
        }
        if (this.f9014d != null) {
            arrayList.add("2");
        }
        if (this.f9015e != null) {
            arrayList.add("6");
        }
        if (this.f9020j.size() > 0) {
            arrayList.add("3");
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        return r2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo12631a() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f9029s
            monitor-enter(r0)
            java.lang.ref.WeakReference<com.google.android.gms.ads.internal.ba> r1 = r3.f9027q     // Catch:{ all -> 0x001a }
            r2 = 0
            if (r1 == 0) goto L_0x0018
            java.lang.ref.WeakReference<com.google.android.gms.ads.internal.ba> r1 = r3.f9027q     // Catch:{ all -> 0x001a }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x001a }
            com.google.android.gms.ads.internal.ba r1 = (com.google.android.gms.ads.internal.C3030ba) r1     // Catch:{ all -> 0x001a }
            if (r1 == 0) goto L_0x0016
            java.lang.String r2 = r1.mo12504a()     // Catch:{ all -> 0x001a }
        L_0x0016:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r2
        L_0x0018:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r2
        L_0x001a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.C3098i.mo12631a():java.lang.String");
    }

    /* renamed from: a */
    public final void mo12632a(zzjj zzjj) {
        m11116a((Runnable) new C3099j(this, zzjj));
    }

    /* renamed from: a */
    public final void mo12633a(zzjj zzjj, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Number of ads has to be more than 0");
        }
        m11116a((Runnable) new C3100k(this, zzjj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        return r2;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo12634b() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f9029s
            monitor-enter(r0)
            java.lang.ref.WeakReference<com.google.android.gms.ads.internal.ba> r1 = r3.f9027q     // Catch:{ all -> 0x001a }
            r2 = 0
            if (r1 == 0) goto L_0x0018
            java.lang.ref.WeakReference<com.google.android.gms.ads.internal.ba> r1 = r3.f9027q     // Catch:{ all -> 0x001a }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x001a }
            com.google.android.gms.ads.internal.ba r1 = (com.google.android.gms.ads.internal.C3030ba) r1     // Catch:{ all -> 0x001a }
            if (r1 == 0) goto L_0x0016
            java.lang.String r2 = r1.mo12509u_()     // Catch:{ all -> 0x001a }
        L_0x0016:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r2
        L_0x0018:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r2
        L_0x001a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.C3098i.mo12634b():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        return r2;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo12635c() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f9029s
            monitor-enter(r0)
            java.lang.ref.WeakReference<com.google.android.gms.ads.internal.ba> r1 = r3.f9027q     // Catch:{ all -> 0x001a }
            r2 = 0
            if (r1 == 0) goto L_0x0018
            java.lang.ref.WeakReference<com.google.android.gms.ads.internal.ba> r1 = r3.f9027q     // Catch:{ all -> 0x001a }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x001a }
            com.google.android.gms.ads.internal.ba r1 = (com.google.android.gms.ads.internal.C3030ba) r1     // Catch:{ all -> 0x001a }
            if (r1 == 0) goto L_0x0016
            boolean r2 = r1.mo12446s()     // Catch:{ all -> 0x001a }
        L_0x0016:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r2
        L_0x0018:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r2
        L_0x001a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.C3098i.mo12635c():boolean");
    }
}
