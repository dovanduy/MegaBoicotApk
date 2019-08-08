package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.annotation.concurrent.GuardedBy;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.ak */
public abstract class C3655ak extends C3894iz {

    /* renamed from: a */
    protected final C3665ap f11242a;

    /* renamed from: b */
    protected final Context f11243b;

    /* renamed from: c */
    protected final Object f11244c = new Object();

    /* renamed from: d */
    protected final Object f11245d = new Object();

    /* renamed from: e */
    protected final C3879ik f11246e;
    @GuardedBy("mLock")

    /* renamed from: f */
    protected zzaej f11247f;

    protected C3655ak(Context context, C3879ik ikVar, C3665ap apVar) {
        super(true);
        this.f11243b = context;
        this.f11246e = ikVar;
        this.f11247f = ikVar.f13292b;
        this.f11242a = apVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C3878ij mo14413a(int i);

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0033 A[Catch:{ an -> 0x0014 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003b A[Catch:{ an -> 0x0014 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12687a() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f11244c
            monitor-enter(r0)
            java.lang.String r1 = "AdRendererBackgroundTask started."
            com.google.android.gms.internal.ads.C3900je.m17429b(r1)     // Catch:{ all -> 0x0060 }
            com.google.android.gms.internal.ads.ik r1 = r5.f11246e     // Catch:{ all -> 0x0060 }
            int r1 = r1.f13295e     // Catch:{ all -> 0x0060 }
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ an -> 0x0014 }
            r5.mo14414a(r2)     // Catch:{ an -> 0x0014 }
            goto L_0x0050
        L_0x0014:
            r1 = move-exception
            int r2 = r1.mo14526a()     // Catch:{ all -> 0x0060 }
            r3 = 3
            if (r2 == r3) goto L_0x0028
            r3 = -1
            if (r2 != r3) goto L_0x0020
            goto L_0x0028
        L_0x0020:
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x0060 }
            com.google.android.gms.internal.ads.C3900je.m17435e(r1)     // Catch:{ all -> 0x0060 }
            goto L_0x002f
        L_0x0028:
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x0060 }
            com.google.android.gms.internal.ads.C3900je.m17433d(r1)     // Catch:{ all -> 0x0060 }
        L_0x002f:
            com.google.android.gms.internal.ads.zzaej r1 = r5.f11247f     // Catch:{ all -> 0x0060 }
            if (r1 != 0) goto L_0x003b
            com.google.android.gms.internal.ads.zzaej r1 = new com.google.android.gms.internal.ads.zzaej     // Catch:{ all -> 0x0060 }
            r1.<init>(r2)     // Catch:{ all -> 0x0060 }
        L_0x0038:
            r5.f11247f = r1     // Catch:{ all -> 0x0060 }
            goto L_0x0045
        L_0x003b:
            com.google.android.gms.internal.ads.zzaej r1 = new com.google.android.gms.internal.ads.zzaej     // Catch:{ all -> 0x0060 }
            com.google.android.gms.internal.ads.zzaej r3 = r5.f11247f     // Catch:{ all -> 0x0060 }
            long r3 = r3.f14461j     // Catch:{ all -> 0x0060 }
            r1.<init>(r2, r3)     // Catch:{ all -> 0x0060 }
            goto L_0x0038
        L_0x0045:
            android.os.Handler r1 = com.google.android.gms.internal.ads.C3909jn.f13411a     // Catch:{ all -> 0x0060 }
            com.google.android.gms.internal.ads.al r3 = new com.google.android.gms.internal.ads.al     // Catch:{ all -> 0x0060 }
            r3.<init>(r5)     // Catch:{ all -> 0x0060 }
            r1.post(r3)     // Catch:{ all -> 0x0060 }
            r1 = r2
        L_0x0050:
            com.google.android.gms.internal.ads.ij r1 = r5.mo14413a(r1)     // Catch:{ all -> 0x0060 }
            android.os.Handler r2 = com.google.android.gms.internal.ads.C3909jn.f13411a     // Catch:{ all -> 0x0060 }
            com.google.android.gms.internal.ads.am r3 = new com.google.android.gms.internal.ads.am     // Catch:{ all -> 0x0060 }
            r3.<init>(r5, r1)     // Catch:{ all -> 0x0060 }
            r2.post(r3)     // Catch:{ all -> 0x0060 }
            monitor-exit(r0)     // Catch:{ all -> 0x0060 }
            return
        L_0x0060:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0060 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3655ak.mo12687a():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo14414a(long j) throws C3662an;

    /* renamed from: e_ */
    public void mo12688e_() {
    }
}
