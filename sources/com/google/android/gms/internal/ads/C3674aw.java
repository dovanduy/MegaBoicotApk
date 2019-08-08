package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C3006ad;
import java.util.concurrent.Future;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.aw */
public final class C3674aw extends C3894iz {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3665ap f12303a;

    /* renamed from: b */
    private final zzaej f12304b;

    /* renamed from: c */
    private final C3879ik f12305c;

    /* renamed from: d */
    private final C3676ay f12306d;

    /* renamed from: e */
    private final Object f12307e;

    /* renamed from: f */
    private Future<C3878ij> f12308f;

    public C3674aw(Context context, C3006ad adVar, C3879ik ikVar, agw agw, C3665ap apVar, ash ash) {
        C3676ay ayVar = new C3676ay(context, adVar, new C3946kx(context), agw, ikVar, ash);
        this(ikVar, apVar, ayVar);
    }

    private C3674aw(C3879ik ikVar, C3665ap apVar, C3676ay ayVar) {
        this.f12307e = new Object();
        this.f12305c = ikVar;
        this.f12304b = ikVar.f13292b;
        this.f12303a = apVar;
        this.f12306d = ayVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0037  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12687a() {
        /*
            r60 = this;
            r1 = r60
            r2 = 0
            r3 = 0
            java.lang.Object r4 = r1.f12307e     // Catch:{ TimeoutException -> 0x0025, InterruptedException | CancellationException | ExecutionException -> 0x0031 }
            monitor-enter(r4)     // Catch:{ TimeoutException -> 0x0025, InterruptedException | CancellationException | ExecutionException -> 0x0031 }
            com.google.android.gms.internal.ads.ay r5 = r1.f12306d     // Catch:{ all -> 0x0021 }
            com.google.android.gms.internal.ads.ne r5 = com.google.android.gms.internal.ads.C3907jl.m17119a(r5)     // Catch:{ all -> 0x0021 }
            r1.f12308f = r5     // Catch:{ all -> 0x0021 }
            monitor-exit(r4)     // Catch:{ all -> 0x0021 }
            java.util.concurrent.Future<com.google.android.gms.internal.ads.ij> r4 = r1.f12308f     // Catch:{ TimeoutException -> 0x0025, InterruptedException | CancellationException | ExecutionException -> 0x0031 }
            r5 = 60000(0xea60, double:2.9644E-319)
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ TimeoutException -> 0x0025, InterruptedException | CancellationException | ExecutionException -> 0x0031 }
            java.lang.Object r4 = r4.get(r5, r7)     // Catch:{ TimeoutException -> 0x0025, InterruptedException | CancellationException | ExecutionException -> 0x0031 }
            com.google.android.gms.internal.ads.ij r4 = (com.google.android.gms.internal.ads.C3878ij) r4     // Catch:{ TimeoutException -> 0x0025, InterruptedException | CancellationException | ExecutionException -> 0x0031 }
            r2 = -2
            r8 = r2
            r3 = r4
            goto L_0x0032
        L_0x0021:
            r0 = move-exception
            r5 = r0
            monitor-exit(r4)     // Catch:{ all -> 0x0021 }
            throw r5     // Catch:{ TimeoutException -> 0x0025, InterruptedException | CancellationException | ExecutionException -> 0x0031 }
        L_0x0025:
            java.lang.String r2 = "Timed out waiting for native ad."
            com.google.android.gms.internal.ads.C3900je.m17435e(r2)
            r2 = 2
            java.util.concurrent.Future<com.google.android.gms.internal.ads.ij> r4 = r1.f12308f
            r5 = 1
            r4.cancel(r5)
        L_0x0031:
            r8 = r2
        L_0x0032:
            if (r3 == 0) goto L_0x0037
            r2 = r3
            goto L_0x00ea
        L_0x0037:
            com.google.android.gms.internal.ads.ij r2 = new com.google.android.gms.internal.ads.ij
            com.google.android.gms.internal.ads.ik r3 = r1.f12305c
            com.google.android.gms.internal.ads.zzaef r3 = r3.f13291a
            com.google.android.gms.internal.ads.zzjj r5 = r3.f14404c
            com.google.android.gms.internal.ads.zzaej r3 = r1.f12304b
            int r11 = r3.f14462k
            com.google.android.gms.internal.ads.zzaej r3 = r1.f12304b
            long r12 = r3.f14461j
            com.google.android.gms.internal.ads.ik r3 = r1.f12305c
            com.google.android.gms.internal.ads.zzaef r3 = r3.f13291a
            java.lang.String r14 = r3.f14410i
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            com.google.android.gms.internal.ads.zzaej r3 = r1.f12304b
            long r3 = r3.f14459h
            com.google.android.gms.internal.ads.ik r15 = r1.f12305c
            com.google.android.gms.internal.ads.zzjn r15 = r15.f13294d
            com.google.android.gms.internal.ads.zzaej r10 = r1.f12304b
            r48 = r11
            long r10 = r10.f14457f
            com.google.android.gms.internal.ads.ik r9 = r1.f12305c
            r49 = r10
            long r10 = r9.f13296f
            com.google.android.gms.internal.ads.zzaej r9 = r1.f12304b
            r51 = r10
            long r10 = r9.f14464m
            com.google.android.gms.internal.ads.zzaej r9 = r1.f12304b
            java.lang.String r9 = r9.f14465n
            com.google.android.gms.internal.ads.ik r7 = r1.f12305c
            org.json.JSONObject r7 = r7.f13298h
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            com.google.android.gms.internal.ads.ik r6 = r1.f12305c
            com.google.android.gms.internal.ads.zzaej r6 = r6.f13292b
            boolean r6 = r6.f14431D
            r53 = r3
            com.google.android.gms.internal.ads.ik r3 = r1.f12305c
            com.google.android.gms.internal.ads.zzaej r3 = r3.f13292b
            com.google.android.gms.internal.ads.zzael r3 = r3.f14432E
            r38 = 0
            r39 = 0
            com.google.android.gms.internal.ads.zzaej r4 = r1.f12304b
            java.lang.String r4 = r4.f14439L
            r55 = r4
            com.google.android.gms.internal.ads.ik r4 = r1.f12305c
            com.google.android.gms.internal.ads.amj r4 = r4.f13299i
            r56 = r4
            com.google.android.gms.internal.ads.ik r4 = r1.f12305c
            com.google.android.gms.internal.ads.zzaej r4 = r4.f13292b
            boolean r4 = r4.f14442O
            r43 = 0
            r57 = r4
            com.google.android.gms.internal.ads.ik r4 = r1.f12305c
            com.google.android.gms.internal.ads.zzaej r4 = r4.f13292b
            boolean r4 = r4.f14444Q
            r45 = 0
            r58 = r4
            com.google.android.gms.internal.ads.ik r4 = r1.f12305c
            com.google.android.gms.internal.ads.zzaej r4 = r4.f13292b
            boolean r4 = r4.f14446S
            r59 = r4
            com.google.android.gms.internal.ads.ik r4 = r1.f12305c
            com.google.android.gms.internal.ads.zzaej r4 = r4.f13292b
            java.lang.String r4 = r4.f14447T
            r47 = r4
            r21 = r53
            r40 = r55
            r41 = r56
            r42 = r57
            r44 = r58
            r46 = r59
            r4 = r2
            r36 = r6
            r6 = 0
            r31 = r7
            r7 = 0
            r30 = r9
            r9 = 0
            r28 = r10
            r24 = r49
            r26 = r51
            r10 = 0
            r11 = r48
            r23 = r15
            r15 = 0
            r37 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19, r20, r21, r23, r24, r26, r28, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47)
        L_0x00ea:
            android.os.Handler r3 = com.google.android.gms.internal.ads.C3909jn.f13411a
            com.google.android.gms.internal.ads.ax r4 = new com.google.android.gms.internal.ads.ax
            r4.<init>(r1, r2)
            r3.post(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3674aw.mo12687a():void");
    }

    /* renamed from: e_ */
    public final void mo12688e_() {
        synchronized (this.f12307e) {
            if (this.f12308f != null) {
                this.f12308f.cancel(true);
            }
        }
    }
}
