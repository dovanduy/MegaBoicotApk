package com.facebook.login;

/* renamed from: com.facebook.login.d */
/* compiled from: LoginBehavior */
public enum C2609d {
    NATIVE_WITH_FALLBACK(true, true, true, false, true, true),
    NATIVE_ONLY(true, true, false, false, false, true),
    KATANA_ONLY(false, true, false, false, false, false),
    WEB_ONLY(false, false, true, false, true, false),
    WEB_VIEW_ONLY(false, false, true, false, false, false),
    DEVICE_AUTH(false, false, false, true, false, false);
    

    /* renamed from: g */
    private final boolean f8136g;

    /* renamed from: h */
    private final boolean f8137h;

    /* renamed from: i */
    private final boolean f8138i;

    /* renamed from: j */
    private final boolean f8139j;

    /* renamed from: k */
    private final boolean f8140k;

    /* renamed from: l */
    private final boolean f8141l;

    private C2609d(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f8136g = z;
        this.f8137h = z2;
        this.f8138i = z3;
        this.f8139j = z4;
        this.f8140k = z5;
        this.f8141l = z6;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo9228a() {
        return this.f8136g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo9229b() {
        return this.f8137h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo9230c() {
        return this.f8138i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo9231d() {
        return this.f8139j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo9232e() {
        return this.f8140k;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo9233f() {
        return this.f8141l;
    }
}
