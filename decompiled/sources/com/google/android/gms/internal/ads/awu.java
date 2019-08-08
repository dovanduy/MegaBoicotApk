package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.C3025aw;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.concurrent.GuardedBy;

@C3718cm
public final class awu implements aqp {
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: a */
    public awp f12322a;
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: b */
    public boolean f12323b;

    /* renamed from: c */
    private final Context f12324c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Object f12325d = new Object();

    public awu(Context context) {
        this.f12324c = context;
    }

    /* renamed from: a */
    private final Future<ParcelFileDescriptor> m15617a(zzsg zzsg) {
        awv awv = new awv(this);
        aww aww = new aww(this, awv, zzsg);
        awz awz = new awz(this, awv);
        synchronized (this.f12325d) {
            this.f12322a = new awp(this.f12324c, C3025aw.m10932t().mo15603a(), aww, awz);
            this.f12322a.mo13551q();
        }
        return awv;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m15618a() {
        synchronized (this.f12325d) {
            if (this.f12322a != null) {
                this.f12322a.mo13541g();
                this.f12322a = null;
                Binder.flushPendingCommands();
            }
        }
    }

    /* renamed from: a */
    public final atl mo14633a(avm<?> avm) throws C3738df {
        atl atl;
        zzsg a = zzsg.m18810a(avm);
        long intValue = (long) ((Integer) aoq.m14620f().mo14695a(aru.f11892cK)).intValue();
        long b = C3025aw.m10924l().mo13695b();
        try {
            zzsi zzsi = (zzsi) new zzaev((ParcelFileDescriptor) m15617a(a).get(intValue, TimeUnit.MILLISECONDS)).mo16246a(zzsi.CREATOR);
            if (zzsi.f14569a) {
                throw new C3738df(zzsi.f14570b);
            }
            if (zzsi.f14573e.length != zzsi.f14574f.length) {
                atl = null;
            } else {
                HashMap hashMap = new HashMap();
                for (int i = 0; i < zzsi.f14573e.length; i++) {
                    hashMap.put(zzsi.f14573e[i], zzsi.f14574f[i]);
                }
                atl = new atl(zzsi.f14571c, zzsi.f14572d, (Map<String, String>) hashMap, zzsi.f14575g, zzsi.f14576h);
            }
            return atl;
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            return null;
        } finally {
            long j = C3025aw.m10924l().mo13695b() - b;
            StringBuilder sb = new StringBuilder(52);
            sb.append("Http assets remote cache took ");
            sb.append(j);
            sb.append("ms");
            C3900je.m17043a(sb.toString());
        }
    }
}
