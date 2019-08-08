package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.C3405c;
import com.google.android.gms.common.api.C3244a.C3255f;
import com.google.android.gms.common.api.C3266f.C3268b;
import com.google.android.gms.common.api.C3266f.C3269c;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C3469d.C3470a;
import com.google.android.gms.common.internal.C3469d.C3471b;
import com.google.android.gms.common.internal.C3488i.C3489a;
import java.util.Set;

/* renamed from: com.google.android.gms.common.internal.h */
public abstract class C3487h<T extends IInterface> extends C3469d<T> implements C3255f, C3489a {

    /* renamed from: e */
    private final C3482e f10052e;

    /* renamed from: f */
    private final Set<Scope> f10053f;

    /* renamed from: g */
    private final Account f10054g;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Set<Scope> mo13588a(Set<Scope> set) {
        return set;
    }

    protected C3487h(Context context, Looper looper, int i, C3482e eVar, C3268b bVar, C3269c cVar) {
        this(context, looper, C3490j.m12526a(context), C3405c.m12234a(), i, eVar, (C3268b) C3513t.m12625a(bVar), (C3269c) C3513t.m12625a(cVar));
    }

    protected C3487h(Context context, Looper looper, C3490j jVar, C3405c cVar, int i, C3482e eVar, C3268b bVar, C3269c cVar2) {
        super(context, looper, jVar, cVar, i, m12508a(bVar), m12509a(cVar2), eVar.mo13579h());
        this.f10052e = eVar;
        this.f10054g = eVar.mo13573b();
        this.f10053f = m12510b(eVar.mo13576e());
    }

    /* renamed from: b */
    private final Set<Scope> m12510b(Set<Scope> set) {
        Set<Scope> a = mo13588a(set);
        for (Scope contains : a) {
            if (!set.contains(contains)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return a;
    }

    /* renamed from: s */
    public final Account mo13553s() {
        return this.f10054g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final C3482e mo13589z() {
        return this.f10052e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final Set<Scope> mo13559y() {
        return this.f10053f;
    }

    /* renamed from: a */
    private static C3470a m12508a(C3268b bVar) {
        if (bVar == null) {
            return null;
        }
        return new C3441ab(bVar);
    }

    /* renamed from: a */
    private static C3471b m12509a(C3269c cVar) {
        if (cVar == null) {
            return null;
        }
        return new C3442ac(cVar);
    }

    /* renamed from: f */
    public int mo13019f() {
        return super.mo13019f();
    }
}
