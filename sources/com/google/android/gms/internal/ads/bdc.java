package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.C3140j;
import com.google.android.gms.ads.formats.C2983b;
import com.google.android.gms.ads.formats.C2983b.C2984a;
import com.google.android.gms.ads.mediation.C3160i;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@C3718cm
public final class bdc implements C3160i {

    /* renamed from: a */
    private final Date f12676a;

    /* renamed from: b */
    private final int f12677b;

    /* renamed from: c */
    private final Set<String> f12678c;

    /* renamed from: d */
    private final boolean f12679d;

    /* renamed from: e */
    private final Location f12680e;

    /* renamed from: f */
    private final int f12681f;

    /* renamed from: g */
    private final zzpl f12682g;

    /* renamed from: h */
    private final List<String> f12683h = new ArrayList();

    /* renamed from: i */
    private final boolean f12684i;

    /* renamed from: j */
    private final Map<String, Boolean> f12685j = new HashMap();

    public bdc(Date date, int i, Set<String> set, Location location, boolean z, int i2, zzpl zzpl, List<String> list, boolean z2) {
        Map<String, Boolean> map;
        String str;
        Boolean valueOf;
        this.f12676a = date;
        this.f12677b = i;
        this.f12678c = set;
        this.f12680e = location;
        this.f12679d = z;
        this.f12681f = i2;
        this.f12682g = zzpl;
        this.f12684i = z2;
        String str2 = "custom:";
        if (list != null) {
            for (String str3 : list) {
                if (str3.startsWith(str2)) {
                    String[] split = str3.split(":", 3);
                    if (split.length == 3) {
                        if ("true".equals(split[2])) {
                            map = this.f12685j;
                            str = split[1];
                            valueOf = Boolean.valueOf(true);
                        } else if ("false".equals(split[2])) {
                            map = this.f12685j;
                            str = split[1];
                            valueOf = Boolean.valueOf(false);
                        }
                        map.put(str, valueOf);
                    }
                } else {
                    this.f12683h.add(str3);
                }
            }
        }
    }

    /* renamed from: a */
    public final Date mo12712a() {
        return this.f12676a;
    }

    /* renamed from: b */
    public final int mo12713b() {
        return this.f12677b;
    }

    /* renamed from: c */
    public final Set<String> mo12714c() {
        return this.f12678c;
    }

    /* renamed from: d */
    public final Location mo12715d() {
        return this.f12680e;
    }

    /* renamed from: e */
    public final int mo12716e() {
        return this.f12681f;
    }

    /* renamed from: f */
    public final boolean mo12717f() {
        return this.f12679d;
    }

    /* renamed from: g */
    public final boolean mo12718g() {
        return this.f12684i;
    }

    /* renamed from: h */
    public final C2983b mo12794h() {
        if (this.f12682g == null) {
            return null;
        }
        C2984a b = new C2984a().mo12336a(this.f12682g.f14561b).mo12334a(this.f12682g.f14562c).mo12339b(this.f12682g.f14563d);
        if (this.f12682g.f14560a >= 2) {
            b.mo12338b(this.f12682g.f14564e);
        }
        if (this.f12682g.f14560a >= 3 && this.f12682g.f14565f != null) {
            b.mo12335a(new C3140j(this.f12682g.f14565f));
        }
        return b.mo12337a();
    }

    /* renamed from: i */
    public final boolean mo12795i() {
        return this.f12683h != null && (this.f12683h.contains("2") || this.f12683h.contains("6"));
    }

    /* renamed from: j */
    public final boolean mo12796j() {
        return this.f12683h != null && this.f12683h.contains("6");
    }

    /* renamed from: k */
    public final boolean mo12797k() {
        return this.f12683h != null && (this.f12683h.contains("1") || this.f12683h.contains("6"));
    }

    /* renamed from: l */
    public final boolean mo12798l() {
        return this.f12683h != null && this.f12683h.contains("3");
    }

    /* renamed from: m */
    public final Map<String, Boolean> mo12799m() {
        return this.f12685j;
    }
}
