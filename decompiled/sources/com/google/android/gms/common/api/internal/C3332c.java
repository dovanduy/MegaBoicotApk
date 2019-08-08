package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.C3244a;
import com.google.android.gms.common.api.C3244a.C3246b;
import com.google.android.gms.common.api.C3244a.C3247c;
import com.google.android.gms.common.api.C3266f;
import com.google.android.gms.common.api.C3391k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.common.internal.C3515v;

/* renamed from: com.google.android.gms.common.api.internal.c */
public class C3332c {

    /* renamed from: com.google.android.gms.common.api.internal.c$a */
    public static abstract class C3333a<R extends C3391k, A extends C3246b> extends BasePendingResult<R> implements C3334b<R> {

        /* renamed from: b */
        private final C3247c<A> f9653b;

        /* renamed from: c */
        private final C3244a<?> f9654c;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo13022a(A a) throws RemoteException;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo13266a(R r) {
        }

        protected C3333a(C3244a<?> aVar, C3266f fVar) {
            super((C3266f) C3513t.m12626a(fVar, (Object) "GoogleApiClient must not be null"));
            C3513t.m12626a(aVar, (Object) "Api must not be null");
            this.f9653b = aVar.mo13089c();
            this.f9654c = aVar;
        }

        /* renamed from: d */
        public final C3247c<A> mo13270d() {
            return this.f9653b;
        }

        /* renamed from: e */
        public final C3244a<?> mo13271e() {
            return this.f9654c;
        }

        /* renamed from: b */
        public final void mo13269b(A a) throws DeadObjectException {
            if (a instanceof C3515v) {
                a = ((C3515v) a).mo13018e();
            }
            try {
                mo13022a(a);
            } catch (DeadObjectException e) {
                m11881a((RemoteException) e);
                throw e;
            } catch (RemoteException e2) {
                m11881a(e2);
            }
        }

        /* renamed from: b */
        public final void mo13268b(Status status) {
            C3513t.m12636b(!status.mo13080d(), "Failed result must not be success");
            C3391k a = mo13021a(status);
            mo13162b(a);
            mo13266a((R) a);
        }

        /* renamed from: a */
        private void m11881a(RemoteException remoteException) {
            mo13268b(new Status(8, remoteException.getLocalizedMessage(), null));
        }

        /* renamed from: a */
        public /* synthetic */ void mo13267a(Object obj) {
            super.mo13162b((C3391k) obj);
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.c$b */
    public interface C3334b<R> {
        /* renamed from: a */
        void mo13267a(R r);
    }
}
