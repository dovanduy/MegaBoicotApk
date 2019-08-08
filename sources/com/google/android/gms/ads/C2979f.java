package com.google.android.gms.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.reward.C3167c;
import com.google.android.gms.ads.reward.C3168d;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.internal.ads.anw;
import com.google.android.gms.internal.ads.aqq;

/* renamed from: com.google.android.gms.ads.f */
public final class C2979f {

    /* renamed from: a */
    private final aqq f8706a;

    public C2979f(Context context) {
        this.f8706a = new aqq(context);
        C3513t.m12626a(context, (Object) "Context cannot be null");
    }

    /* renamed from: a */
    public final void mo12241a(C2960a aVar) {
        this.f8706a.mo14634a(aVar);
        if (aVar == null || !(aVar instanceof anw)) {
            if (aVar == null) {
                this.f8706a.mo14637a((anw) null);
            }
            return;
        }
        this.f8706a.mo14637a((anw) aVar);
    }

    /* renamed from: a */
    public final void mo12242a(C2971c cVar) {
        this.f8706a.mo14638a(cVar.mo12202a());
    }

    /* renamed from: a */
    public final void mo12243a(C3167c cVar) {
        this.f8706a.mo14635a(cVar);
    }

    /* renamed from: a */
    public final void mo12244a(C3168d dVar) {
        this.f8706a.mo14636a(dVar);
    }

    /* renamed from: a */
    public final void mo12245a(String str) {
        this.f8706a.mo14639a(str);
    }

    /* renamed from: a */
    public final void mo12246a(boolean z) {
        this.f8706a.mo14640a(true);
    }

    /* renamed from: a */
    public final boolean mo12247a() {
        return this.f8706a.mo14641a();
    }

    /* renamed from: b */
    public final void mo12248b() {
        this.f8706a.mo14644c();
    }

    /* renamed from: b */
    public final void mo12249b(boolean z) {
        this.f8706a.mo14643b(z);
    }

    /* renamed from: c */
    public final Bundle mo12250c() {
        return this.f8706a.mo14642b();
    }
}
