package com.google.android.gms.internal.ads;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

@C3718cm
public final class asu extends aue {

    /* renamed from: a */
    private static final int f12098a = Color.rgb(12, 174, 206);

    /* renamed from: b */
    private static final int f12099b;

    /* renamed from: c */
    private static final int f12100c;

    /* renamed from: d */
    private static final int f12101d = f12098a;

    /* renamed from: e */
    private final String f12102e;

    /* renamed from: f */
    private final List<asy> f12103f = new ArrayList();

    /* renamed from: g */
    private final List<auh> f12104g = new ArrayList();

    /* renamed from: h */
    private final int f12105h;

    /* renamed from: i */
    private final int f12106i;

    /* renamed from: j */
    private final int f12107j;

    /* renamed from: k */
    private final int f12108k;

    /* renamed from: l */
    private final int f12109l;

    /* renamed from: m */
    private final boolean f12110m;

    static {
        int rgb = Color.rgb(204, 204, 204);
        f12099b = rgb;
        f12100c = rgb;
    }

    public asu(String str, List<asy> list, Integer num, Integer num2, Integer num3, int i, int i2, boolean z) {
        this.f12102e = str;
        if (list != null) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                asy asy = (asy) list.get(i3);
                this.f12103f.add(asy);
                this.f12104g.add(asy);
            }
        }
        this.f12105h = num != null ? num.intValue() : f12100c;
        this.f12106i = num2 != null ? num2.intValue() : f12101d;
        this.f12107j = num3 != null ? num3.intValue() : 12;
        this.f12108k = i;
        this.f12109l = i2;
        this.f12110m = z;
    }

    /* renamed from: a */
    public final String mo14739a() {
        return this.f12102e;
    }

    /* renamed from: b */
    public final List<auh> mo14740b() {
        return this.f12104g;
    }

    /* renamed from: c */
    public final List<asy> mo14741c() {
        return this.f12103f;
    }

    /* renamed from: d */
    public final int mo14742d() {
        return this.f12105h;
    }

    /* renamed from: e */
    public final int mo14743e() {
        return this.f12106i;
    }

    /* renamed from: f */
    public final int mo14744f() {
        return this.f12107j;
    }

    /* renamed from: g */
    public final int mo14745g() {
        return this.f12108k;
    }

    /* renamed from: h */
    public final int mo14746h() {
        return this.f12109l;
    }

    /* renamed from: i */
    public final boolean mo14747i() {
        return this.f12110m;
    }
}
