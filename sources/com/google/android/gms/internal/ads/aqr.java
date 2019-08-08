package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.reward.C3166b;
import javax.annotation.concurrent.GuardedBy;

@C3718cm
public final class aqr {
    @GuardedBy("sLock")

    /* renamed from: a */
    private static aqr f11716a;

    /* renamed from: b */
    private static final Object f11717b = new Object();

    /* renamed from: c */
    private C3166b f11718c;

    private aqr() {
    }

    /* renamed from: a */
    public static aqr m14893a() {
        aqr aqr;
        synchronized (f11717b) {
            if (f11716a == null) {
                f11716a = new aqr();
            }
            aqr = f11716a;
        }
        return aqr;
    }

    /* renamed from: a */
    public final C3166b mo14645a(Context context) {
        synchronized (f11717b) {
            if (this.f11718c != null) {
                C3166b bVar = this.f11718c;
                return bVar;
            }
            this.f11718c = new C3829go(context, (C3816gb) aoh.m14585a(context, false, (C3664a<T>) new aon<T>(aoq.m14616b(), context, new bbz())));
            C3166b bVar2 = this.f11718c;
            return bVar2;
        }
    }
}
