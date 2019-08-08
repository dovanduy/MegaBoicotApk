package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3718cm
public final class aoc {

    /* renamed from: a */
    private long f11581a;

    /* renamed from: b */
    private Bundle f11582b;

    /* renamed from: c */
    private int f11583c;

    /* renamed from: d */
    private List<String> f11584d;

    /* renamed from: e */
    private boolean f11585e;

    /* renamed from: f */
    private int f11586f;

    /* renamed from: g */
    private boolean f11587g;

    /* renamed from: h */
    private String f11588h;

    /* renamed from: i */
    private zzmq f11589i;

    /* renamed from: j */
    private Location f11590j;

    /* renamed from: k */
    private String f11591k;

    /* renamed from: l */
    private Bundle f11592l;

    /* renamed from: m */
    private Bundle f11593m;

    /* renamed from: n */
    private List<String> f11594n;

    /* renamed from: o */
    private String f11595o;

    /* renamed from: p */
    private String f11596p;

    /* renamed from: q */
    private boolean f11597q;

    public aoc() {
        this.f11581a = -1;
        this.f11582b = new Bundle();
        this.f11583c = -1;
        this.f11584d = new ArrayList();
        this.f11585e = false;
        this.f11586f = -1;
        this.f11587g = false;
        this.f11588h = null;
        this.f11589i = null;
        this.f11590j = null;
        this.f11591k = null;
        this.f11592l = new Bundle();
        this.f11593m = new Bundle();
        this.f11594n = new ArrayList();
        this.f11595o = null;
        this.f11596p = null;
        this.f11597q = false;
    }

    public aoc(zzjj zzjj) {
        this.f11581a = zzjj.f14526b;
        this.f11582b = zzjj.f14527c;
        this.f11583c = zzjj.f14528d;
        this.f11584d = zzjj.f14529e;
        this.f11585e = zzjj.f14530f;
        this.f11586f = zzjj.f14531g;
        this.f11587g = zzjj.f14532h;
        this.f11588h = zzjj.f14533i;
        this.f11589i = zzjj.f14534j;
        this.f11590j = zzjj.f14535k;
        this.f11591k = zzjj.f14536l;
        this.f11592l = zzjj.f14537m;
        this.f11593m = zzjj.f14538n;
        this.f11594n = zzjj.f14539o;
        this.f11595o = zzjj.f14540p;
        this.f11596p = zzjj.f14541q;
    }

    /* renamed from: a */
    public final aoc mo14539a(Location location) {
        this.f11590j = null;
        return this;
    }

    /* renamed from: a */
    public final zzjj mo14540a() {
        long j = this.f11581a;
        Bundle bundle = this.f11582b;
        int i = this.f11583c;
        List<String> list = this.f11584d;
        boolean z = this.f11585e;
        int i2 = this.f11586f;
        boolean z2 = this.f11587g;
        String str = this.f11588h;
        zzmq zzmq = this.f11589i;
        Location location = this.f11590j;
        String str2 = this.f11591k;
        Bundle bundle2 = this.f11592l;
        Bundle bundle3 = this.f11593m;
        Bundle bundle4 = bundle3;
        Bundle bundle5 = bundle4;
        zzjj zzjj = new zzjj(7, j, bundle, i, list, z, i2, z2, str, zzmq, location, str2, bundle2, bundle5, this.f11594n, this.f11595o, this.f11596p, false);
        return zzjj;
    }
}
