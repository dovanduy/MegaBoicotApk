package com.google.android.gms.ads;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.internal.ads.C3718cm;
import com.google.android.gms.internal.ads.C3987mk;
import com.google.android.gms.internal.ads.aqe;
import com.google.android.gms.internal.ads.aqh;
import com.google.android.gms.internal.ads.ard;
import javax.annotation.concurrent.GuardedBy;

@C3718cm
/* renamed from: com.google.android.gms.ads.i */
public final class C3000i {

    /* renamed from: a */
    private final Object f8726a = new Object();
    @GuardedBy("mLock")

    /* renamed from: b */
    private aqe f8727b;
    @GuardedBy("mLock")

    /* renamed from: c */
    private C3001a f8728c;

    /* renamed from: com.google.android.gms.ads.i$a */
    public static abstract class C3001a {
        /* renamed from: a */
        public void mo12376a() {
        }

        /* renamed from: a */
        public void mo12377a(boolean z) {
        }

        /* renamed from: b */
        public void mo12378b() {
        }

        /* renamed from: c */
        public void mo12379c() {
        }

        /* renamed from: d */
        public void mo12380d() {
        }
    }

    /* renamed from: a */
    public final aqe mo12373a() {
        aqe aqe;
        synchronized (this.f8726a) {
            aqe = this.f8727b;
        }
        return aqe;
    }

    /* renamed from: a */
    public final void mo12374a(C3001a aVar) {
        C3513t.m12626a(aVar, (Object) "VideoLifecycleCallbacks may not be null.");
        synchronized (this.f8726a) {
            this.f8728c = aVar;
            if (this.f8727b != null) {
                try {
                    this.f8727b.mo14565a((aqh) new ard(aVar));
                } catch (RemoteException e) {
                    C3987mk.m17430b("Unable to call setVideoLifecycleCallbacks on video controller.", e);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo12375a(aqe aqe) {
        synchronized (this.f8726a) {
            this.f8727b = aqe;
            if (this.f8728c != null) {
                mo12374a(this.f8728c);
            }
        }
    }
}
