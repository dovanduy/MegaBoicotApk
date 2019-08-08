package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.support.p017v4.p023d.C0378b;
import android.view.View;
import com.google.android.gms.common.api.C3244a;
import com.google.android.gms.common.api.C3266f.C3267a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.signin.C4902a;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

/* renamed from: com.google.android.gms.common.internal.e */
public final class C3482e {

    /* renamed from: a */
    private final Account f10032a;

    /* renamed from: b */
    private final Set<Scope> f10033b;

    /* renamed from: c */
    private final Set<Scope> f10034c;

    /* renamed from: d */
    private final Map<C3244a<?>, C3484b> f10035d;

    /* renamed from: e */
    private final int f10036e;

    /* renamed from: f */
    private final View f10037f;

    /* renamed from: g */
    private final String f10038g;

    /* renamed from: h */
    private final String f10039h;

    /* renamed from: i */
    private final C4902a f10040i;

    /* renamed from: j */
    private Integer f10041j;

    /* renamed from: com.google.android.gms.common.internal.e$a */
    public static final class C3483a {

        /* renamed from: a */
        private Account f10042a;

        /* renamed from: b */
        private C0378b<Scope> f10043b;

        /* renamed from: c */
        private Map<C3244a<?>, C3484b> f10044c;

        /* renamed from: d */
        private int f10045d = 0;

        /* renamed from: e */
        private View f10046e;

        /* renamed from: f */
        private String f10047f;

        /* renamed from: g */
        private String f10048g;

        /* renamed from: h */
        private C4902a f10049h = C4902a.f16032a;

        /* renamed from: a */
        public final C3483a mo13582a(Account account) {
            this.f10042a = account;
            return this;
        }

        /* renamed from: a */
        public final C3483a mo13584a(Collection<Scope> collection) {
            if (this.f10043b == null) {
                this.f10043b = new C0378b<>();
            }
            this.f10043b.addAll(collection);
            return this;
        }

        /* renamed from: a */
        public final C3483a mo13583a(String str) {
            this.f10047f = str;
            return this;
        }

        /* renamed from: b */
        public final C3483a mo13586b(String str) {
            this.f10048g = str;
            return this;
        }

        /* renamed from: a */
        public final C3482e mo13585a() {
            C3482e eVar = new C3482e(this.f10042a, this.f10043b, this.f10044c, this.f10045d, this.f10046e, this.f10047f, this.f10048g, this.f10049h);
            return eVar;
        }
    }

    /* renamed from: com.google.android.gms.common.internal.e$b */
    public static final class C3484b {

        /* renamed from: a */
        public final Set<Scope> f10050a;
    }

    /* renamed from: a */
    public static C3482e m12478a(Context context) {
        return new C3267a(context).mo13151a();
    }

    public C3482e(Account account, Set<Scope> set, Map<C3244a<?>, C3484b> map, int i, View view, String str, String str2, C4902a aVar) {
        this.f10032a = account;
        this.f10033b = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        if (map == null) {
            map = Collections.EMPTY_MAP;
        }
        this.f10035d = map;
        this.f10037f = view;
        this.f10036e = i;
        this.f10038g = str;
        this.f10039h = str2;
        this.f10040i = aVar;
        HashSet hashSet = new HashSet(this.f10033b);
        for (C3484b bVar : this.f10035d.values()) {
            hashSet.addAll(bVar.f10050a);
        }
        this.f10034c = Collections.unmodifiableSet(hashSet);
    }

    @Deprecated
    @Nullable
    /* renamed from: a */
    public final String mo13570a() {
        if (this.f10032a != null) {
            return this.f10032a.name;
        }
        return null;
    }

    @Nullable
    /* renamed from: b */
    public final Account mo13573b() {
        return this.f10032a;
    }

    /* renamed from: c */
    public final Account mo13574c() {
        if (this.f10032a != null) {
            return this.f10032a;
        }
        return new Account("<<default account>>", "com.google");
    }

    /* renamed from: d */
    public final Set<Scope> mo13575d() {
        return this.f10033b;
    }

    /* renamed from: e */
    public final Set<Scope> mo13576e() {
        return this.f10034c;
    }

    /* renamed from: f */
    public final Map<C3244a<?>, C3484b> mo13577f() {
        return this.f10035d;
    }

    @Nullable
    /* renamed from: g */
    public final String mo13578g() {
        return this.f10038g;
    }

    @Nullable
    /* renamed from: h */
    public final String mo13579h() {
        return this.f10039h;
    }

    @Nullable
    /* renamed from: i */
    public final C4902a mo13580i() {
        return this.f10040i;
    }

    @Nullable
    /* renamed from: j */
    public final Integer mo13581j() {
        return this.f10041j;
    }

    /* renamed from: a */
    public final void mo13572a(Integer num) {
        this.f10041j = num;
    }

    /* renamed from: a */
    public final Set<Scope> mo13571a(C3244a<?> aVar) {
        C3484b bVar = (C3484b) this.f10035d.get(aVar);
        if (bVar == null || bVar.f10050a.isEmpty()) {
            return this.f10033b;
        }
        HashSet hashSet = new HashSet(this.f10033b);
        hashSet.addAll(bVar.f10050a);
        return hashSet;
    }
}
