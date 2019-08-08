package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.C3266f;
import com.google.android.gms.common.api.C3270g;
import com.google.android.gms.common.api.C3274i;
import com.google.android.gms.common.api.C3391k;
import com.google.android.gms.common.api.C3392l;
import com.google.android.gms.common.api.C3393m;
import com.google.android.gms.common.api.C3394n;
import com.google.android.gms.common.api.C3395o;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C3513t;
import java.lang.ref.WeakReference;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.api.internal.bs */
public final class C3324bs<R extends C3391k> extends C3395o<R> implements C3392l<R> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C3394n<? super R, ? extends C3391k> f9631a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C3324bs<? extends C3391k> f9632b;

    /* renamed from: c */
    private volatile C3393m<? super R> f9633c;

    /* renamed from: d */
    private C3270g<R> f9634d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Object f9635e;

    /* renamed from: f */
    private Status f9636f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final WeakReference<C3266f> f9637g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C3326bu f9638h;

    /* renamed from: i */
    private boolean f9639i;

    public final void onResult(R r) {
        synchronized (this.f9635e) {
            if (!r.mo12984b().mo13080d()) {
                m11856a(r.mo12984b());
                m11859a((C3391k) r);
            } else if (this.f9631a != null) {
                C3318bm.m11838a().submit(new C3325bt(this, r));
            } else if (m11864c()) {
                this.f9633c.mo13376a(r);
            }
        }
    }

    /* renamed from: a */
    public final void mo13257a(C3270g<?> gVar) {
        synchronized (this.f9635e) {
            this.f9634d = gVar;
            m11861b();
        }
    }

    @GuardedBy("mSyncToken")
    /* renamed from: b */
    private final void m11861b() {
        if (this.f9631a != null || this.f9633c != null) {
            C3266f fVar = (C3266f) this.f9637g.get();
            if (!(this.f9639i || this.f9631a == null || fVar == null)) {
                fVar.mo13131a(this);
                this.f9639i = true;
            }
            if (this.f9636f != null) {
                m11862b(this.f9636f);
                return;
            }
            if (this.f9634d != null) {
                this.f9634d.mo13156a((C3392l<? super R>) this);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m11856a(Status status) {
        synchronized (this.f9635e) {
            this.f9636f = status;
            m11862b(this.f9636f);
        }
    }

    /* renamed from: b */
    private final void m11862b(Status status) {
        synchronized (this.f9635e) {
            if (this.f9631a != null) {
                Status a = this.f9631a.mo13377a(status);
                C3513t.m12626a(a, (Object) "onFailure must not return null");
                this.f9632b.m11856a(a);
            } else if (m11864c()) {
                this.f9633c.mo13375a(status);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo13256a() {
        this.f9633c = null;
    }

    @GuardedBy("mSyncToken")
    /* renamed from: c */
    private final boolean m11864c() {
        return (this.f9633c == null || ((C3266f) this.f9637g.get()) == null) ? false : true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m11859a(C3391k kVar) {
        if (kVar instanceof C3274i) {
            try {
                ((C3274i) kVar).mo13160a();
            } catch (RuntimeException e) {
                String valueOf = String.valueOf(kVar);
                StringBuilder sb = new StringBuilder(18 + String.valueOf(valueOf).length());
                sb.append("Unable to release ");
                sb.append(valueOf);
                Log.w("TransformedResultImpl", sb.toString(), e);
            }
        }
    }
}
