package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.abe.C3640e;

final class ada implements acj {

    /* renamed from: a */
    private final acl f10522a;

    /* renamed from: b */
    private final String f10523b;

    /* renamed from: c */
    private final adb f10524c;

    ada(acl acl, String str, Object[] objArr) {
        this.f10522a = acl;
        this.f10523b = str;
        this.f10524c = new adb(acl.getClass(), str, objArr);
    }

    /* renamed from: a */
    public final int mo14064a() {
        return (this.f10524c.f10534d & 1) == 1 ? C3640e.f10425h : C3640e.f10426i;
    }

    /* renamed from: b */
    public final boolean mo14065b() {
        return (this.f10524c.f10534d & 2) == 2;
    }

    /* renamed from: c */
    public final acl mo14066c() {
        return this.f10522a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final adb mo14086d() {
        return this.f10524c;
    }

    /* renamed from: e */
    public final int mo14087e() {
        return this.f10524c.f10538h;
    }

    /* renamed from: f */
    public final int mo14088f() {
        return this.f10524c.f10539i;
    }

    /* renamed from: g */
    public final int mo14089g() {
        return this.f10524c.f10535e;
    }

    /* renamed from: h */
    public final int mo14090h() {
        return this.f10524c.f10540j;
    }

    /* renamed from: i */
    public final int mo14091i() {
        return this.f10524c.f10543m;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final int[] mo14092j() {
        return this.f10524c.f10544n;
    }

    /* renamed from: k */
    public final int mo14093k() {
        return this.f10524c.f10542l;
    }

    /* renamed from: l */
    public final int mo14094l() {
        return this.f10524c.f10541k;
    }
}
