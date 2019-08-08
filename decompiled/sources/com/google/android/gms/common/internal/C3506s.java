package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.C3260b;
import com.google.android.gms.common.api.C3270g;
import com.google.android.gms.common.api.C3270g.C3271a;
import com.google.android.gms.common.api.C3391k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.p143d.C3583g;
import com.google.android.gms.p143d.C3584h;

/* renamed from: com.google.android.gms.common.internal.s */
public class C3506s {

    /* renamed from: a */
    private static final C3508b f10079a = new C3444ae();

    /* renamed from: com.google.android.gms.common.internal.s$a */
    public interface C3507a<R extends C3391k, T> {
        /* renamed from: a */
        T mo12982a(R r);
    }

    /* renamed from: com.google.android.gms.common.internal.s$b */
    public interface C3508b {
        /* renamed from: a */
        C3260b mo13487a(Status status);
    }

    /* renamed from: a */
    public static <R extends C3391k, T> C3583g<T> m12553a(C3270g<R> gVar, C3507a<R, T> aVar) {
        C3508b bVar = f10079a;
        C3584h hVar = new C3584h();
        gVar.mo13155a((C3271a) new C3445af(gVar, hVar, aVar, bVar));
        return hVar.mo13720a();
    }

    /* renamed from: a */
    public static <R extends C3391k> C3583g<Void> m12552a(C3270g<R> gVar) {
        return m12553a(gVar, new C3446ag());
    }
}
