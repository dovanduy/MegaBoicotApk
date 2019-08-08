package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.DeadObjectException;
import com.appnext.base.p046b.C1245d;
import com.google.android.gms.ads.internal.C3025aw;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C3469d.C3470a;
import com.google.android.gms.common.internal.C3469d.C3471b;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.dj */
public final class C3742dj extends C3737de implements C3470a, C3471b {

    /* renamed from: a */
    private Context f12856a;

    /* renamed from: b */
    private zzang f12857b;

    /* renamed from: c */
    private C4021nr<zzaef> f12858c;

    /* renamed from: d */
    private final C3735dc f12859d;

    /* renamed from: e */
    private final Object f12860e = new Object();

    /* renamed from: f */
    private C3743dk f12861f;

    public C3742dj(Context context, zzang zzang, C4021nr<zzaef> nrVar, C3735dc dcVar) {
        super(nrVar, dcVar);
        this.f12856a = context;
        this.f12857b = zzang;
        this.f12858c = nrVar;
        this.f12859d = dcVar;
        this.f12861f = new C3743dk(context, ((Boolean) aoq.m14620f().mo14695a(aru.f11755G)).booleanValue() ? C3025aw.m10932t().mo15603a() : context.getMainLooper(), this, this);
        this.f12861f.mo13551q();
    }

    /* renamed from: a */
    public final void mo15239a() {
        synchronized (this.f12860e) {
            if (this.f12861f.mo13542h() || this.f12861f.mo13543i()) {
                this.f12861f.mo13541g();
            }
            Binder.flushPendingCommands();
        }
    }

    /* renamed from: a */
    public final void mo13483a(int i) {
        C3900je.m17429b("Disconnected from remote ad request service.");
    }

    /* renamed from: a */
    public final void mo13484a(Bundle bundle) {
        mo14344c();
    }

    /* renamed from: a */
    public final void mo13485a(ConnectionResult connectionResult) {
        C3900je.m17429b("Cannot connect to remote service, fallback to local instance.");
        new C3741di(this.f12856a, this.f12858c, this.f12859d).mo14344c();
        Bundle bundle = new Bundle();
        bundle.putString(C1245d.f3959jb, "gms_connection_failed_fallback_to_local");
        C3025aw.m10917e().mo15522b(this.f12856a, this.f12857b.f14505a, "gmob-apps", bundle, true);
    }

    /* renamed from: d */
    public final C3749dq mo15241d() {
        C3749dq e;
        synchronized (this.f12860e) {
            try {
                e = this.f12861f.mo13018e();
            } catch (DeadObjectException | IllegalStateException unused) {
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return e;
    }
}
