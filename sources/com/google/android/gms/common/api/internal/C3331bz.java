package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.C3260b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C3360d.C3361a;
import com.google.android.gms.p143d.C3584h;

/* renamed from: com.google.android.gms.common.api.internal.bz */
abstract class C3331bz<T> extends C3317bl {

    /* renamed from: a */
    protected final C3584h<T> f9652a;

    public C3331bz(int i, C3584h<T> hVar) {
        super(i);
        this.f9652a = hVar;
    }

    /* renamed from: a */
    public void mo13203a(C3381r rVar, boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo13265d(C3361a<?> aVar) throws RemoteException;

    /* renamed from: a */
    public void mo13201a(Status status) {
        this.f9652a.mo13723b((Exception) new C3260b(status));
    }

    /* renamed from: a */
    public void mo13204a(RuntimeException runtimeException) {
        this.f9652a.mo13723b((Exception) runtimeException);
    }

    /* renamed from: a */
    public final void mo13202a(C3361a<?> aVar) throws DeadObjectException {
        try {
            mo13265d(aVar);
        } catch (DeadObjectException e) {
            mo13201a(C3293ap.m11771b(e));
            throw e;
        } catch (RemoteException e2) {
            mo13201a(C3293ap.m11771b(e2));
        } catch (RuntimeException e3) {
            mo13204a(e3);
        }
    }
}
