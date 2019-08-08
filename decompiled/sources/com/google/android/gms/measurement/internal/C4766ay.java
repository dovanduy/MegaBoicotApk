package com.google.android.gms.measurement.internal;

import android.os.Binder;
import android.text.TextUtils;
import com.google.android.gms.common.C3415h;
import com.google.android.gms.common.C3416i;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.common.util.C3568t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.gms.measurement.internal.ay */
public final class C4766ay extends C4885j {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C4852ec f15501a;

    /* renamed from: b */
    private Boolean f15502b;

    /* renamed from: c */
    private String f15503c;

    public C4766ay(C4852ec ecVar) {
        this(ecVar, null);
    }

    private C4766ay(C4852ec ecVar, String str) {
        C3513t.m12625a(ecVar);
        this.f15501a = ecVar;
        this.f15503c = null;
    }

    /* renamed from: b */
    public final void mo17275b(zzk zzk) {
        m20517b(zzk, false);
        m20515a((Runnable) new C4767az(this, zzk));
    }

    /* renamed from: a */
    public final void mo17267a(zzag zzag, zzk zzk) {
        C3513t.m12625a(zzag);
        m20517b(zzk, false);
        m20515a((Runnable) new C4779bk(this, zzag, zzk));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final zzag mo17274b(zzag zzag, zzk zzk) {
        boolean z = false;
        if (!(!"_cmp".equals(zzag.f15991a) || zzag.f15992b == null || zzag.f15992b.mo17771a() == 0)) {
            String d = zzag.f15992b.mo17776d("_cis");
            if (!TextUtils.isEmpty(d) && (("referrer broadcast".equals(d) || "referrer API".equals(d)) && this.f15501a.mo17444b().mo17659n(zzk.f16003a))) {
                z = true;
            }
        }
        if (!z) {
            return zzag;
        }
        this.f15501a.mo17158r().mo17757v().mo17764a("Event has been filtered ", zzag.toString());
        zzag zzag2 = new zzag("_cmpx", zzag.f15992b, zzag.f15993c, zzag.f15994d);
        return zzag2;
    }

    /* renamed from: a */
    public final void mo17268a(zzag zzag, String str, String str2) {
        C3513t.m12625a(zzag);
        C3513t.m12627a(str);
        m20516a(str, true);
        m20515a((Runnable) new C4780bl(this, zzag, str));
    }

    /* renamed from: a */
    public final byte[] mo17273a(zzag zzag, String str) {
        C3513t.m12627a(str);
        C3513t.m12625a(zzag);
        m20516a(str, true);
        this.f15501a.mo17158r().mo17758w().mo17764a("Log and bundle. event", this.f15501a.mo17456h().mo17746a(zzag.f15991a));
        long c = this.f15501a.mo17153m().mo13696c() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f15501a.mo17157q().mo17220b((Callable<V>) new C4781bm<V>(this, zzag, str)).get();
            if (bArr == null) {
                this.f15501a.mo17158r().mo17761y_().mo17764a("Log and bundle returned null. appId", C4893r.m21360a(str));
                bArr = new byte[0];
            }
            this.f15501a.mo17158r().mo17758w().mo17766a("Log and bundle processed. event, size, time_ms", this.f15501a.mo17456h().mo17746a(zzag.f15991a), Integer.valueOf(bArr.length), Long.valueOf((this.f15501a.mo17153m().mo13696c() / 1000000) - c));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            this.f15501a.mo17158r().mo17761y_().mo17766a("Failed to log and bundle. appId, event, error", C4893r.m21360a(str), this.f15501a.mo17456h().mo17746a(zzag.f15991a), e);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo17269a(zzfv zzfv, zzk zzk) {
        C3513t.m12625a(zzfv);
        m20517b(zzk, false);
        if (zzfv.mo17782a() == null) {
            m20515a((Runnable) new C4782bn(this, zzfv, zzk));
        } else {
            m20515a((Runnable) new C4783bo(this, zzfv, zzk));
        }
    }

    /* renamed from: a */
    public final List<zzfv> mo17261a(zzk zzk, boolean z) {
        m20517b(zzk, false);
        try {
            List<C4861ek> list = (List) this.f15501a.mo17157q().mo17218a((Callable<V>) new C4784bp<V>(this, zzk)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C4861ek ekVar : list) {
                if (z || !C4862el.m20978e(ekVar.f15786c)) {
                    arrayList.add(new zzfv(ekVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f15501a.mo17158r().mo17761y_().mo17765a("Failed to get user attributes. appId", C4893r.m21360a(zzk.f16003a), e);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo17270a(zzk zzk) {
        m20517b(zzk, false);
        m20515a((Runnable) new C4785bq(this, zzk));
    }

    /* renamed from: b */
    private final void m20517b(zzk zzk, boolean z) {
        C3513t.m12625a(zzk);
        m20516a(zzk.f16003a, false);
        this.f15501a.mo17457i().mo17498b(zzk.f16004b, zzk.f16020r);
    }

    /* renamed from: a */
    private final void m20516a(String str, boolean z) {
        boolean z2;
        if (TextUtils.isEmpty(str)) {
            this.f15501a.mo17158r().mo17761y_().mo17763a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z) {
            try {
                if (this.f15502b == null) {
                    if (!"com.google.android.gms".equals(this.f15503c) && !C3568t.m12780a(this.f15501a.mo17154n(), Binder.getCallingUid())) {
                        if (!C3416i.m12290a(this.f15501a.mo17154n()).mo13432a(Binder.getCallingUid())) {
                            z2 = false;
                            this.f15502b = Boolean.valueOf(z2);
                        }
                    }
                    z2 = true;
                    this.f15502b = Boolean.valueOf(z2);
                }
                if (this.f15502b.booleanValue()) {
                    return;
                }
            } catch (SecurityException e) {
                this.f15501a.mo17158r().mo17761y_().mo17764a("Measurement Service called with invalid calling package. appId", C4893r.m21360a(str));
                throw e;
            }
        }
        if (this.f15503c == null && C3415h.m12278a(this.f15501a.mo17154n(), Binder.getCallingUid(), str)) {
            this.f15503c = str;
        }
        if (!str.equals(this.f15503c)) {
            throw new SecurityException(String.format("Unknown calling package name '%s'.", new Object[]{str}));
        }
    }

    /* renamed from: a */
    public final void mo17266a(long j, String str, String str2, String str3) {
        C4786br brVar = new C4786br(this, str2, str3, str, j);
        m20515a((Runnable) brVar);
    }

    /* renamed from: c */
    public final String mo17276c(zzk zzk) {
        m20517b(zzk, false);
        return this.f15501a.mo17452d(zzk);
    }

    /* renamed from: a */
    public final void mo17272a(zzo zzo, zzk zzk) {
        C3513t.m12625a(zzo);
        C3513t.m12625a(zzo.f16023c);
        m20517b(zzk, false);
        zzo zzo2 = new zzo(zzo);
        zzo2.f16021a = zzk.f16003a;
        if (zzo.f16023c.mo17782a() == null) {
            m20515a((Runnable) new C4770bb(this, zzo2, zzk));
        } else {
            m20515a((Runnable) new C4771bc(this, zzo2, zzk));
        }
    }

    /* renamed from: a */
    public final void mo17271a(zzo zzo) {
        C3513t.m12625a(zzo);
        C3513t.m12625a(zzo.f16023c);
        m20516a(zzo.f16021a, true);
        zzo zzo2 = new zzo(zzo);
        if (zzo.f16023c.mo17782a() == null) {
            m20515a((Runnable) new C4772bd(this, zzo2));
        } else {
            m20515a((Runnable) new C4773be(this, zzo2));
        }
    }

    /* renamed from: a */
    public final List<zzfv> mo17265a(String str, String str2, boolean z, zzk zzk) {
        m20517b(zzk, false);
        try {
            List<C4861ek> list = (List) this.f15501a.mo17157q().mo17218a((Callable<V>) new C4774bf<V>(this, zzk, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C4861ek ekVar : list) {
                if (z || !C4862el.m20978e(ekVar.f15786c)) {
                    arrayList.add(new zzfv(ekVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f15501a.mo17158r().mo17761y_().mo17765a("Failed to get user attributes. appId", C4893r.m21360a(zzk.f16003a), e);
            return Collections.emptyList();
        }
    }

    /* renamed from: a */
    public final List<zzfv> mo17264a(String str, String str2, String str3, boolean z) {
        m20516a(str, true);
        try {
            List<C4861ek> list = (List) this.f15501a.mo17157q().mo17218a((Callable<V>) new C4775bg<V>(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C4861ek ekVar : list) {
                if (z || !C4862el.m20978e(ekVar.f15786c)) {
                    arrayList.add(new zzfv(ekVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f15501a.mo17158r().mo17761y_().mo17765a("Failed to get user attributes. appId", C4893r.m21360a(str), e);
            return Collections.emptyList();
        }
    }

    /* renamed from: a */
    public final List<zzo> mo17262a(String str, String str2, zzk zzk) {
        m20517b(zzk, false);
        try {
            return (List) this.f15501a.mo17157q().mo17218a((Callable<V>) new C4776bh<V>(this, zzk, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f15501a.mo17158r().mo17761y_().mo17764a("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    /* renamed from: a */
    public final List<zzo> mo17263a(String str, String str2, String str3) {
        m20516a(str, true);
        try {
            return (List) this.f15501a.mo17157q().mo17218a((Callable<V>) new C4777bi<V>(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f15501a.mo17158r().mo17761y_().mo17764a("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    /* renamed from: d */
    public final void mo17277d(zzk zzk) {
        m20516a(zzk.f16003a, false);
        m20515a((Runnable) new C4778bj(this, zzk));
    }

    /* renamed from: a */
    private final void m20515a(Runnable runnable) {
        C3513t.m12625a(runnable);
        if (!((Boolean) C4882h.f15879ab.mo17726b()).booleanValue() || !this.f15501a.mo17157q().mo17222g()) {
            this.f15501a.mo17157q().mo17219a(runnable);
        } else {
            runnable.run();
        }
    }
}
