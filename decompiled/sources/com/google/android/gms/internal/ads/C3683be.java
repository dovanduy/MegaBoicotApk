package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.be */
final class C3683be implements C3992mp<List<asy>, asu> {

    /* renamed from: a */
    private final /* synthetic */ String f12703a;

    /* renamed from: b */
    private final /* synthetic */ Integer f12704b;

    /* renamed from: c */
    private final /* synthetic */ Integer f12705c;

    /* renamed from: d */
    private final /* synthetic */ int f12706d;

    /* renamed from: e */
    private final /* synthetic */ int f12707e;

    /* renamed from: f */
    private final /* synthetic */ int f12708f;

    /* renamed from: g */
    private final /* synthetic */ int f12709g;

    /* renamed from: h */
    private final /* synthetic */ boolean f12710h;

    C3683be(C3676ay ayVar, String str, Integer num, Integer num2, int i, int i2, int i3, int i4, boolean z) {
        this.f12703a = str;
        this.f12704b = num;
        this.f12705c = num2;
        this.f12706d = i;
        this.f12707e = i2;
        this.f12708f = i3;
        this.f12709g = i4;
        this.f12710h = z;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo15190a(Object obj) {
        List list = (List) obj;
        Integer num = null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        String str = this.f12703a;
        Integer num2 = this.f12704b;
        Integer num3 = this.f12705c;
        if (this.f12706d > 0) {
            num = Integer.valueOf(this.f12706d);
        }
        asu asu = new asu(str, list, num2, num3, num, this.f12707e + this.f12708f, this.f12709g, this.f12710h);
        return asu;
    }
}
