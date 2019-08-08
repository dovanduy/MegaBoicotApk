package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.exoplayer2.C2793C;
import com.google.android.gms.internal.ads.C3975lz;
import com.google.android.gms.internal.ads.aoq;
import com.google.android.gms.internal.ads.zzjn;

/* renamed from: com.google.android.gms.ads.d */
public final class C2973d {

    /* renamed from: a */
    public static final C2973d f8691a = new C2973d(320, 50, "320x50_mb");

    /* renamed from: b */
    public static final C2973d f8692b = new C2973d(468, 60, "468x60_as");

    /* renamed from: c */
    public static final C2973d f8693c = new C2973d(320, 100, "320x100_as");

    /* renamed from: d */
    public static final C2973d f8694d = new C2973d(728, 90, "728x90_as");

    /* renamed from: e */
    public static final C2973d f8695e = new C2973d(300, 250, "300x250_as");

    /* renamed from: f */
    public static final C2973d f8696f = new C2973d(160, 600, "160x600_as");

    /* renamed from: g */
    public static final C2973d f8697g = new C2973d(-1, -2, "smart_banner");

    /* renamed from: h */
    public static final C2973d f8698h = new C2973d(-3, -4, "fluid");

    /* renamed from: i */
    public static final C2973d f8699i = new C2973d(50, 50, "50x50_mb");

    /* renamed from: j */
    public static final C2973d f8700j = new C2973d(-3, 0, "search_v2");

    /* renamed from: k */
    private final int f8701k;

    /* renamed from: l */
    private final int f8702l;

    /* renamed from: m */
    private final String f8703m;

    public C2973d(int i, int i2) {
        String valueOf = i == -1 ? "FULL" : String.valueOf(i);
        String valueOf2 = i2 == -2 ? "AUTO" : String.valueOf(i2);
        StringBuilder sb = new StringBuilder(4 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("x");
        sb.append(valueOf2);
        sb.append("_as");
        this(i, i2, sb.toString());
    }

    C2973d(int i, int i2, String str) {
        if (i < 0 && i != -1 && i != -3) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Invalid width for AdSize: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 >= 0 || i2 == -2 || i2 == -4) {
            this.f8701k = i;
            this.f8702l = i2;
            this.f8703m = str;
        } else {
            StringBuilder sb2 = new StringBuilder(38);
            sb2.append("Invalid height for AdSize: ");
            sb2.append(i2);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: a */
    public final int mo12212a() {
        return this.f8702l;
    }

    /* renamed from: a */
    public final int mo12213a(Context context) {
        switch (this.f8702l) {
            case C2793C.RESULT_BUFFER_READ /*-4*/:
            case -3:
                return -1;
            case -2:
                return zzjn.m18804b(context.getResources().getDisplayMetrics());
            default:
                aoq.m14615a();
                return C3975lz.m17369a(context, this.f8702l);
        }
    }

    /* renamed from: b */
    public final int mo12214b() {
        return this.f8701k;
    }

    /* renamed from: b */
    public final int mo12215b(Context context) {
        int i = this.f8701k;
        if (i == -1) {
            return zzjn.m18801a(context.getResources().getDisplayMetrics());
        }
        switch (i) {
            case C2793C.RESULT_BUFFER_READ /*-4*/:
            case -3:
                return -1;
            default:
                aoq.m14615a();
                return C3975lz.m17369a(context, this.f8701k);
        }
    }

    /* renamed from: c */
    public final boolean mo12216c() {
        return this.f8701k == -3 && this.f8702l == -4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2973d)) {
            return false;
        }
        C2973d dVar = (C2973d) obj;
        return this.f8701k == dVar.f8701k && this.f8702l == dVar.f8702l && this.f8703m.equals(dVar.f8703m);
    }

    public final int hashCode() {
        return this.f8703m.hashCode();
    }

    public final String toString() {
        return this.f8703m;
    }
}
