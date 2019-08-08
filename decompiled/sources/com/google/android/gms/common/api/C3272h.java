package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.internal.C3513t;

/* renamed from: com.google.android.gms.common.api.h */
public final class C3272h {

    /* renamed from: com.google.android.gms.common.api.h$a */
    private static final class C3273a<R extends C3391k> extends BasePendingResult<R> {

        /* renamed from: b */
        private final R f9507b;

        public C3273a(C3266f fVar, R r) {
            super(fVar);
            this.f9507b = r;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final R mo13021a(Status status) {
            return this.f9507b;
        }
    }

    /* renamed from: a */
    public static <R extends C3391k> C3270g<R> m11684a(R r, C3266f fVar) {
        C3513t.m12626a(r, (Object) "Result must not be null");
        C3513t.m12636b(!r.mo12984b().mo13080d(), "Status code must not be SUCCESS");
        C3273a aVar = new C3273a(fVar, r);
        aVar.mo13162b(r);
        return aVar;
    }
}
