package com.google.android.gms.internal.ads;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.rs */
public final class C4130rs {

    /* renamed from: a */
    public final int f13949a;

    /* renamed from: b */
    public final int f13950b;

    /* renamed from: c */
    private final int f13951c;

    private C4130rs(int i, int i2, int i3) {
        this.f13951c = i;
        this.f13950b = i2;
        this.f13949a = i3;
    }

    /* renamed from: a */
    public static C4130rs m17977a() {
        return new C4130rs(0, 0, 0);
    }

    /* renamed from: a */
    public static C4130rs m17978a(int i, int i2) {
        return new C4130rs(1, i, i2);
    }

    /* renamed from: a */
    public static C4130rs m17979a(zzjn zzjn) {
        return zzjn.f14546d ? new C4130rs(3, 0, 0) : zzjn.f14551i ? new C4130rs(2, 0, 0) : zzjn.f14550h ? m17977a() : m17978a(zzjn.f14548f, zzjn.f14545c);
    }

    /* renamed from: b */
    public static C4130rs m17980b() {
        return new C4130rs(4, 0, 0);
    }

    /* renamed from: c */
    public final boolean mo15996c() {
        return this.f13951c == 2;
    }

    /* renamed from: d */
    public final boolean mo15997d() {
        return this.f13951c == 3;
    }

    /* renamed from: e */
    public final boolean mo15998e() {
        return this.f13951c == 0;
    }

    /* renamed from: f */
    public final boolean mo15999f() {
        return this.f13951c == 4;
    }
}
