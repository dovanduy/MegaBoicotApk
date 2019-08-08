package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3244a;
import com.google.android.gms.common.api.C3244a.C3246b;
import com.google.android.gms.common.api.C3391k;
import com.google.android.gms.common.api.internal.C3332c.C3333a;

/* renamed from: com.google.android.gms.common.api.internal.w */
public final class C3386w implements C3297at {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3298au f9805a;

    /* renamed from: b */
    private boolean f9806b = false;

    public C3386w(C3298au auVar) {
        this.f9805a = auVar;
    }

    /* renamed from: a */
    public final void mo13186a() {
    }

    /* renamed from: a */
    public final void mo13188a(Bundle bundle) {
    }

    /* renamed from: a */
    public final void mo13189a(ConnectionResult connectionResult, C3244a<?> aVar, boolean z) {
    }

    /* renamed from: a */
    public final <A extends C3246b, R extends C3391k, T extends C3333a<R, A>> T mo13185a(T t) {
        return mo13190b(t);
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [com.google.android.gms.common.api.a$h] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <A extends com.google.android.gms.common.api.C3244a.C3246b, T extends com.google.android.gms.common.api.internal.C3332c.C3333a<? extends com.google.android.gms.common.api.C3391k, A>> T mo13190b(T r4) {
        /*
            r3 = this;
            com.google.android.gms.common.api.internal.au r0 = r3.f9805a     // Catch:{ DeadObjectException -> 0x004b }
            com.google.android.gms.common.api.internal.al r0 = r0.f9583d     // Catch:{ DeadObjectException -> 0x004b }
            com.google.android.gms.common.api.internal.bv r0 = r0.f9547e     // Catch:{ DeadObjectException -> 0x004b }
            r0.mo13261a(r4)     // Catch:{ DeadObjectException -> 0x004b }
            com.google.android.gms.common.api.internal.au r0 = r3.f9805a     // Catch:{ DeadObjectException -> 0x004b }
            com.google.android.gms.common.api.internal.al r0 = r0.f9583d     // Catch:{ DeadObjectException -> 0x004b }
            com.google.android.gms.common.api.a$c r1 = r4.mo13270d()     // Catch:{ DeadObjectException -> 0x004b }
            java.util.Map<com.google.android.gms.common.api.a$c<?>, com.google.android.gms.common.api.a$f> r0 = r0.f9544b     // Catch:{ DeadObjectException -> 0x004b }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ DeadObjectException -> 0x004b }
            com.google.android.gms.common.api.a$f r0 = (com.google.android.gms.common.api.C3244a.C3255f) r0     // Catch:{ DeadObjectException -> 0x004b }
            java.lang.String r1 = "Appropriate Api was not requested."
            com.google.android.gms.common.internal.C3513t.m12626a(r0, r1)     // Catch:{ DeadObjectException -> 0x004b }
            boolean r1 = r0.mo13099h()     // Catch:{ DeadObjectException -> 0x004b }
            if (r1 != 0) goto L_0x003d
            com.google.android.gms.common.api.internal.au r1 = r3.f9805a     // Catch:{ DeadObjectException -> 0x004b }
            java.util.Map<com.google.android.gms.common.api.a$c<?>, com.google.android.gms.common.ConnectionResult> r1 = r1.f9581b     // Catch:{ DeadObjectException -> 0x004b }
            com.google.android.gms.common.api.a$c r2 = r4.mo13270d()     // Catch:{ DeadObjectException -> 0x004b }
            boolean r1 = r1.containsKey(r2)     // Catch:{ DeadObjectException -> 0x004b }
            if (r1 == 0) goto L_0x003d
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status     // Catch:{ DeadObjectException -> 0x004b }
            r1 = 17
            r0.<init>(r1)     // Catch:{ DeadObjectException -> 0x004b }
            r4.mo13268b(r0)     // Catch:{ DeadObjectException -> 0x004b }
            goto L_0x0055
        L_0x003d:
            boolean r1 = r0 instanceof com.google.android.gms.common.internal.C3515v     // Catch:{ DeadObjectException -> 0x004b }
            if (r1 == 0) goto L_0x0047
            com.google.android.gms.common.internal.v r0 = (com.google.android.gms.common.internal.C3515v) r0     // Catch:{ DeadObjectException -> 0x004b }
            com.google.android.gms.common.api.a$h r0 = r0.mo13018e()     // Catch:{ DeadObjectException -> 0x004b }
        L_0x0047:
            r4.mo13269b(r0)     // Catch:{ DeadObjectException -> 0x004b }
            goto L_0x0055
        L_0x004b:
            com.google.android.gms.common.api.internal.au r0 = r3.f9805a
            com.google.android.gms.common.api.internal.x r1 = new com.google.android.gms.common.api.internal.x
            r1.<init>(r3, r3)
            r0.mo13211a(r1)
        L_0x0055:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C3386w.mo13190b(com.google.android.gms.common.api.internal.c$a):com.google.android.gms.common.api.internal.c$a");
    }

    /* renamed from: b */
    public final boolean mo13191b() {
        if (this.f9806b) {
            return false;
        }
        if (this.f9805a.f9583d.mo13197m()) {
            this.f9806b = true;
            for (C3324bs a : this.f9805a.f9583d.f9546d) {
                a.mo13256a();
            }
            return false;
        }
        this.f9805a.mo13209a((ConnectionResult) null);
        return true;
    }

    /* renamed from: c */
    public final void mo13192c() {
        if (this.f9806b) {
            this.f9806b = false;
            this.f9805a.mo13211a((C3299av) new C3388y(this, this));
        }
    }

    /* renamed from: a */
    public final void mo13187a(int i) {
        this.f9805a.mo13209a((ConnectionResult) null);
        this.f9805a.f9584e.mo13193a(i, this.f9806b);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo13371d() {
        if (this.f9806b) {
            this.f9806b = false;
            this.f9805a.f9583d.f9547e.mo13260a();
            mo13191b();
        }
    }
}
