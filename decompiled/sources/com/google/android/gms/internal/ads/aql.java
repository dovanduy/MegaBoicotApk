package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.C3144b;
import com.google.android.gms.ads.search.C3170a;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.Set;

@C3718cm
public final class aql {

    /* renamed from: a */
    private final Date f11653a;

    /* renamed from: b */
    private final String f11654b;

    /* renamed from: c */
    private final int f11655c;

    /* renamed from: d */
    private final Set<String> f11656d;

    /* renamed from: e */
    private final Location f11657e;

    /* renamed from: f */
    private final boolean f11658f;

    /* renamed from: g */
    private final Bundle f11659g;

    /* renamed from: h */
    private final Map<Class<? extends Object>, Object> f11660h;

    /* renamed from: i */
    private final String f11661i;

    /* renamed from: j */
    private final String f11662j;

    /* renamed from: k */
    private final C3170a f11663k;

    /* renamed from: l */
    private final int f11664l;

    /* renamed from: m */
    private final Set<String> f11665m;

    /* renamed from: n */
    private final Bundle f11666n;

    /* renamed from: o */
    private final Set<String> f11667o;

    /* renamed from: p */
    private final boolean f11668p;

    public aql(aqm aqm) {
        this(aqm, null);
    }

    public aql(aqm aqm, C3170a aVar) {
        this.f11653a = aqm.f11675g;
        this.f11654b = aqm.f11676h;
        this.f11655c = aqm.f11677i;
        this.f11656d = Collections.unmodifiableSet(aqm.f11669a);
        this.f11657e = aqm.f11678j;
        this.f11658f = aqm.f11679k;
        this.f11659g = aqm.f11670b;
        this.f11660h = Collections.unmodifiableMap(aqm.f11671c);
        this.f11661i = aqm.f11680l;
        this.f11662j = aqm.f11681m;
        this.f11663k = aVar;
        this.f11664l = aqm.f11682n;
        this.f11665m = Collections.unmodifiableSet(aqm.f11672d);
        this.f11666n = aqm.f11673e;
        this.f11667o = Collections.unmodifiableSet(aqm.f11674f);
        this.f11668p = aqm.f11683o;
    }

    /* renamed from: a */
    public final Bundle mo14583a(Class<? extends C3144b> cls) {
        return this.f11659g.getBundle(cls.getName());
    }

    /* renamed from: a */
    public final Date mo14584a() {
        return this.f11653a;
    }

    /* renamed from: a */
    public final boolean mo14585a(Context context) {
        Set<String> set = this.f11665m;
        aoq.m14615a();
        return set.contains(C3975lz.m17371a(context));
    }

    /* renamed from: b */
    public final String mo14586b() {
        return this.f11654b;
    }

    /* renamed from: c */
    public final int mo14587c() {
        return this.f11655c;
    }

    /* renamed from: d */
    public final Set<String> mo14588d() {
        return this.f11656d;
    }

    /* renamed from: e */
    public final Location mo14589e() {
        return this.f11657e;
    }

    /* renamed from: f */
    public final boolean mo14590f() {
        return this.f11658f;
    }

    /* renamed from: g */
    public final String mo14591g() {
        return this.f11661i;
    }

    /* renamed from: h */
    public final String mo14592h() {
        return this.f11662j;
    }

    /* renamed from: i */
    public final C3170a mo14593i() {
        return this.f11663k;
    }

    /* renamed from: j */
    public final Map<Class<? extends Object>, Object> mo14594j() {
        return this.f11660h;
    }

    /* renamed from: k */
    public final Bundle mo14595k() {
        return this.f11659g;
    }

    /* renamed from: l */
    public final int mo14596l() {
        return this.f11664l;
    }

    /* renamed from: m */
    public final Bundle mo14597m() {
        return this.f11666n;
    }

    /* renamed from: n */
    public final Set<String> mo14598n() {
        return this.f11667o;
    }

    /* renamed from: o */
    public final boolean mo14599o() {
        return this.f11668p;
    }
}
