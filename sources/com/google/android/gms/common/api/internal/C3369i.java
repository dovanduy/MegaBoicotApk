package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.internal.p145b.C4415f;

/* renamed from: com.google.android.gms.common.api.internal.i */
public final class C3369i<L> {

    /* renamed from: a */
    private final C3372c f9783a;

    /* renamed from: b */
    private volatile L f9784b;

    /* renamed from: c */
    private final C3370a<L> f9785c;

    /* renamed from: com.google.android.gms.common.api.internal.i$a */
    public static final class C3370a<L> {

        /* renamed from: a */
        private final L f9786a;

        /* renamed from: b */
        private final String f9787b;

        C3370a(L l, String str) {
            this.f9786a = l;
            this.f9787b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3370a)) {
                return false;
            }
            C3370a aVar = (C3370a) obj;
            return this.f9786a == aVar.f9786a && this.f9787b.equals(aVar.f9787b);
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f9786a) * 31) + this.f9787b.hashCode();
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.i$b */
    public interface C3371b<L> {
        /* renamed from: a */
        void mo13354a();

        /* renamed from: a */
        void mo13355a(L l);
    }

    /* renamed from: com.google.android.gms.common.api.internal.i$c */
    private final class C3372c extends C4415f {
        public C3372c(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            boolean z = true;
            if (message.what != 1) {
                z = false;
            }
            C3513t.m12635b(z);
            C3369i.this.mo13351b((C3371b) message.obj);
        }
    }

    C3369i(Looper looper, L l, String str) {
        this.f9783a = new C3372c(looper);
        this.f9784b = C3513t.m12626a(l, (Object) "Listener must not be null");
        this.f9785c = new C3370a<>(l, C3513t.m12627a(str));
    }

    /* renamed from: a */
    public final void mo13349a(C3371b<? super L> bVar) {
        C3513t.m12626a(bVar, (Object) "Notifier must not be null");
        this.f9783a.sendMessage(this.f9783a.obtainMessage(1, bVar));
    }

    /* renamed from: a */
    public final void mo13348a() {
        this.f9784b = null;
    }

    /* renamed from: b */
    public final C3370a<L> mo13350b() {
        return this.f9785c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo13351b(C3371b<? super L> bVar) {
        L l = this.f9784b;
        if (l == null) {
            bVar.mo13354a();
            return;
        }
        try {
            bVar.mo13355a(l);
        } catch (RuntimeException e) {
            bVar.mo13354a();
            throw e;
        }
    }
}
