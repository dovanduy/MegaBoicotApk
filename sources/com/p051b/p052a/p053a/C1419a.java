package com.p051b.p052a.p053a;

import android.content.Context;
import android.os.RemoteException;

/* renamed from: com.b.a.a.a */
/* compiled from: InstallReferrerClient */
public abstract class C1419a {

    /* renamed from: com.b.a.a.a$a */
    /* compiled from: InstallReferrerClient */
    public static final class C1421a {

        /* renamed from: a */
        private final Context f4360a;

        private C1421a(Context context) {
            this.f4360a = context;
        }

        /* renamed from: a */
        public C1419a mo6459a() {
            if (this.f4360a != null) {
                return new C1422b(this.f4360a);
            }
            throw new IllegalArgumentException("Please provide a valid Context.");
        }
    }

    /* renamed from: a */
    public abstract C1426d mo6457a() throws RemoteException;

    /* renamed from: a */
    public abstract void mo6458a(C1425c cVar);

    /* renamed from: a */
    public static C1421a m5889a(Context context) {
        return new C1421a(context);
    }
}
