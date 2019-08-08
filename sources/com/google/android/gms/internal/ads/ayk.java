package com.google.android.gms.internal.ads;

import android.os.Bundle;

@C3718cm
public final class ayk {

    /* renamed from: a */
    private static ayk f12402a = new ayk();

    /* renamed from: b */
    private int f12403b;

    /* renamed from: c */
    private int f12404c;

    /* renamed from: d */
    private int f12405d;

    /* renamed from: e */
    private int f12406e;

    /* renamed from: f */
    private int f12407f;

    /* renamed from: a */
    public static ayk m15729a() {
        return f12402a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo14975a(int i) {
        this.f12403b += i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo14976b() {
        this.f12404c++;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo14977c() {
        this.f12405d++;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo14978d() {
        this.f12406e++;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo14979e() {
        this.f12407f++;
    }

    /* renamed from: f */
    public final int mo14980f() {
        return this.f12404c;
    }

    /* renamed from: g */
    public final int mo14981g() {
        return this.f12405d;
    }

    /* renamed from: h */
    public final int mo14982h() {
        return this.f12406e;
    }

    /* renamed from: i */
    public final int mo14983i() {
        return this.f12407f;
    }

    /* renamed from: j */
    public final Bundle mo14984j() {
        Bundle bundle = new Bundle();
        bundle.putInt("ipl", this.f12403b);
        bundle.putInt("ipds", this.f12404c);
        bundle.putInt("ipde", this.f12405d);
        bundle.putInt("iph", this.f12406e);
        bundle.putInt("ipm", this.f12407f);
        return bundle;
    }
}
