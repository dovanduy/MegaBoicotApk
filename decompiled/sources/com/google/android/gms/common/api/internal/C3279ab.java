package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3244a;
import com.google.android.gms.common.internal.C3469d.C3472c;
import com.google.android.gms.common.internal.C3513t;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.api.internal.ab */
final class C3279ab implements C3472c {

    /* renamed from: a */
    private final WeakReference<C3389z> f9527a;

    /* renamed from: b */
    private final C3244a<?> f9528b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final boolean f9529c;

    public C3279ab(C3389z zVar, C3244a<?> aVar, boolean z) {
        this.f9527a = new WeakReference<>(zVar);
        this.f9528b = aVar;
        this.f9529c = z;
    }

    /* renamed from: a */
    public final void mo13180a(ConnectionResult connectionResult) {
        C3389z zVar = (C3389z) this.f9527a.get();
        if (zVar != null) {
            C3513t.m12632a(Looper.myLooper() == zVar.f9809a.f9583d.mo13138c(), (Object) "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            zVar.f9810b.lock();
            try {
                if (zVar.m12185b(0)) {
                    if (!connectionResult.mo13042b()) {
                        zVar.m12184b(connectionResult, this.f9528b, this.f9529c);
                    }
                    if (zVar.m12190d()) {
                        zVar.m12191e();
                    }
                    zVar.f9810b.unlock();
                }
            } finally {
                zVar.f9810b.unlock();
            }
        }
    }
}
