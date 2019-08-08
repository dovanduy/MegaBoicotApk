package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.C3511b;
import java.util.List;

public final class WakeLockEvent extends StatsEvent {
    public static final Creator<WakeLockEvent> CREATOR = new C3542b();

    /* renamed from: a */
    private final int f10143a;

    /* renamed from: b */
    private final long f10144b;

    /* renamed from: c */
    private int f10145c;

    /* renamed from: d */
    private final String f10146d;

    /* renamed from: e */
    private final String f10147e;

    /* renamed from: f */
    private final String f10148f;

    /* renamed from: g */
    private final int f10149g;

    /* renamed from: h */
    private final List<String> f10150h;

    /* renamed from: i */
    private final String f10151i;

    /* renamed from: j */
    private final long f10152j;

    /* renamed from: k */
    private int f10153k;

    /* renamed from: l */
    private final String f10154l;

    /* renamed from: m */
    private final float f10155m;

    /* renamed from: n */
    private final long f10156n;

    /* renamed from: o */
    private long f10157o = -1;

    WakeLockEvent(int i, long j, int i2, String str, int i3, List<String> list, String str2, long j2, int i4, String str3, String str4, float f, long j3, String str5) {
        this.f10143a = i;
        this.f10144b = j;
        this.f10145c = i2;
        this.f10146d = str;
        this.f10147e = str3;
        this.f10148f = str5;
        this.f10149g = i3;
        this.f10150h = list;
        this.f10151i = str2;
        this.f10152j = j2;
        this.f10153k = i4;
        this.f10154l = str4;
        this.f10155m = f;
        this.f10156n = j3;
    }

    /* renamed from: a */
    public final long mo13679a() {
        return this.f10144b;
    }

    /* renamed from: b */
    public final int mo13680b() {
        return this.f10145c;
    }

    /* renamed from: c */
    public final long mo13681c() {
        return this.f10157o;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12599a(parcel, 1, this.f10143a);
        C3511b.m12600a(parcel, 2, mo13679a());
        C3511b.m12609a(parcel, 4, this.f10146d, false);
        C3511b.m12599a(parcel, 5, this.f10149g);
        C3511b.m12619b(parcel, 6, this.f10150h, false);
        C3511b.m12600a(parcel, 8, this.f10152j);
        C3511b.m12609a(parcel, 10, this.f10147e, false);
        C3511b.m12599a(parcel, 11, mo13680b());
        C3511b.m12609a(parcel, 12, this.f10151i, false);
        C3511b.m12609a(parcel, 13, this.f10154l, false);
        C3511b.m12599a(parcel, 14, this.f10153k);
        C3511b.m12598a(parcel, 15, this.f10155m);
        C3511b.m12600a(parcel, 16, this.f10156n);
        C3511b.m12609a(parcel, 17, this.f10148f, false);
        C3511b.m12596a(parcel, a);
    }

    /* renamed from: d */
    public final String mo13682d() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5 = this.f10146d;
        int i = this.f10149g;
        if (this.f10150h == null) {
            str = "";
        } else {
            str = TextUtils.join(",", this.f10150h);
        }
        int i2 = this.f10153k;
        if (this.f10147e == null) {
            str2 = "";
        } else {
            str2 = this.f10147e;
        }
        if (this.f10154l == null) {
            str3 = "";
        } else {
            str3 = this.f10154l;
        }
        float f = this.f10155m;
        if (this.f10148f == null) {
            str4 = "";
        } else {
            str4 = this.f10148f;
        }
        StringBuilder sb = new StringBuilder(45 + String.valueOf(str5).length() + String.valueOf(str).length() + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append("\t");
        sb.append(str5);
        sb.append("\t");
        sb.append(i);
        sb.append("\t");
        sb.append(str);
        sb.append("\t");
        sb.append(i2);
        sb.append("\t");
        sb.append(str2);
        sb.append("\t");
        sb.append(str3);
        sb.append("\t");
        sb.append(f);
        sb.append("\t");
        sb.append(str4);
        return sb.toString();
    }
}
