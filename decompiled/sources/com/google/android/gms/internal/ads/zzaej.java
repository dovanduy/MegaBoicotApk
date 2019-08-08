package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3718cm
public final class zzaej extends AbstractSafeParcelable {
    public static final Creator<zzaej> CREATOR = new C3747do();

    /* renamed from: A */
    public final zzaig f14428A;

    /* renamed from: B */
    public final List<String> f14429B;

    /* renamed from: C */
    public final List<String> f14430C;

    /* renamed from: D */
    public final boolean f14431D;

    /* renamed from: E */
    public final zzael f14432E;

    /* renamed from: F */
    public final boolean f14433F;

    /* renamed from: G */
    public String f14434G;

    /* renamed from: H */
    public final List<String> f14435H;

    /* renamed from: I */
    public final boolean f14436I;

    /* renamed from: J */
    public final String f14437J;

    /* renamed from: K */
    public final zzaiq f14438K;

    /* renamed from: L */
    public final String f14439L;

    /* renamed from: M */
    public final boolean f14440M;

    /* renamed from: N */
    public final boolean f14441N;

    /* renamed from: O */
    public final boolean f14442O;

    /* renamed from: P */
    public final int f14443P;

    /* renamed from: Q */
    public final boolean f14444Q;

    /* renamed from: R */
    public final List<String> f14445R;

    /* renamed from: S */
    public final boolean f14446S;

    /* renamed from: T */
    public final String f14447T;

    /* renamed from: U */
    private zzaef f14448U;

    /* renamed from: V */
    private final int f14449V;

    /* renamed from: W */
    private zzaev f14450W;

    /* renamed from: X */
    private Bundle f14451X;

    /* renamed from: a */
    public final String f14452a;

    /* renamed from: b */
    public String f14453b;

    /* renamed from: c */
    public final List<String> f14454c;

    /* renamed from: d */
    public final int f14455d;

    /* renamed from: e */
    public final List<String> f14456e;

    /* renamed from: f */
    public final long f14457f;

    /* renamed from: g */
    public final boolean f14458g;

    /* renamed from: h */
    public final long f14459h;

    /* renamed from: i */
    public final List<String> f14460i;

    /* renamed from: j */
    public final long f14461j;

    /* renamed from: k */
    public final int f14462k;

    /* renamed from: l */
    public final String f14463l;

    /* renamed from: m */
    public final long f14464m;

    /* renamed from: n */
    public final String f14465n;

    /* renamed from: o */
    public final boolean f14466o;

    /* renamed from: p */
    public final String f14467p;

    /* renamed from: q */
    public final String f14468q;

    /* renamed from: r */
    public final boolean f14469r;

    /* renamed from: s */
    public final boolean f14470s;

    /* renamed from: t */
    public final boolean f14471t;

    /* renamed from: u */
    public final boolean f14472u;

    /* renamed from: v */
    public final boolean f14473v;

    /* renamed from: w */
    public String f14474w;

    /* renamed from: x */
    public final String f14475x;

    /* renamed from: y */
    public final boolean f14476y;

    /* renamed from: z */
    public final boolean f14477z;

    public zzaej(int i) {
        this(19, null, null, null, i, null, -1, false, -1, null, -1, -1, null, -1, null, false, null, null, false, false, false, true, false, null, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, true, false, null, false, 0, false, null, false, null);
    }

    public zzaej(int i, long j) {
        this(19, null, null, null, i, null, -1, false, -1, null, j, -1, null, -1, null, false, null, null, false, false, false, true, false, null, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, true, false, null, false, 0, false, null, false, null);
    }

    zzaej(int i, String str, String str2, List<String> list, int i2, List<String> list2, long j, boolean z, long j2, List<String> list3, long j3, int i3, String str3, long j4, String str4, boolean z2, String str5, String str6, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, zzaev zzaev, String str7, String str8, boolean z8, boolean z9, zzaig zzaig, List<String> list4, List<String> list5, boolean z10, zzael zzael, boolean z11, String str9, List<String> list6, boolean z12, String str10, zzaiq zzaiq, String str11, boolean z13, boolean z14, Bundle bundle, boolean z15, int i4, boolean z16, List<String> list7, boolean z17, String str12) {
        this.f14449V = i;
        this.f14452a = str;
        this.f14453b = str2;
        List<String> list8 = null;
        this.f14454c = list != null ? Collections.unmodifiableList(list) : null;
        this.f14455d = i2;
        this.f14456e = list2 != null ? Collections.unmodifiableList(list2) : null;
        this.f14457f = j;
        this.f14458g = z;
        this.f14459h = j2;
        this.f14460i = list3 != null ? Collections.unmodifiableList(list3) : null;
        this.f14461j = j3;
        this.f14462k = i3;
        this.f14463l = str3;
        this.f14464m = j4;
        this.f14465n = str4;
        this.f14466o = z2;
        this.f14467p = str5;
        this.f14468q = str6;
        this.f14469r = z3;
        this.f14470s = z4;
        this.f14471t = z5;
        this.f14472u = z6;
        this.f14440M = z13;
        this.f14473v = z7;
        this.f14450W = zzaev;
        this.f14474w = str7;
        this.f14475x = str8;
        if (this.f14453b == null && this.f14450W != null) {
            zzafj zzafj = (zzafj) this.f14450W.mo16246a(zzafj.CREATOR);
            if (zzafj != null && !TextUtils.isEmpty(zzafj.f14492a)) {
                this.f14453b = zzafj.f14492a;
            }
        }
        this.f14476y = z8;
        this.f14477z = z9;
        this.f14428A = zzaig;
        this.f14429B = list4;
        this.f14430C = list5;
        this.f14431D = z10;
        this.f14432E = zzael;
        this.f14433F = z11;
        this.f14434G = str9;
        this.f14435H = list6;
        this.f14436I = z12;
        this.f14437J = str10;
        this.f14438K = zzaiq;
        this.f14439L = str11;
        this.f14441N = z14;
        this.f14451X = bundle;
        this.f14442O = z15;
        this.f14443P = i4;
        this.f14444Q = z16;
        if (list7 != null) {
            list8 = Collections.unmodifiableList(list7);
        }
        this.f14445R = list8;
        this.f14446S = z17;
        this.f14447T = str12;
    }

    public zzaej(zzaef zzaef, String str, String str2, List<String> list, List<String> list2, long j, boolean z, long j2, List<String> list3, long j3, int i, String str3, long j4, String str4, String str5, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str6, boolean z7, boolean z8, zzaig zzaig, List<String> list4, List<String> list5, boolean z9, zzael zzael, boolean z10, String str7, List<String> list6, boolean z11, String str8, zzaiq zzaiq, String str9, boolean z12, boolean z13, boolean z14, int i2, boolean z15, List<String> list7, boolean z16, String str10) {
        this(19, str, str2, list, -2, list2, j, z, -1, list3, j3, i, str3, j4, str4, false, null, str5, z2, z3, z4, z5, false, null, null, str6, z7, z8, zzaig, list4, list5, z9, zzael, z10, str7, list6, z11, str8, zzaiq, str9, z12, z13, null, z14, i2, z15, list7, z16, str10);
        this.f14448U = zzaef;
    }

    public zzaej(zzaef zzaef, String str, String str2, List<String> list, List<String> list2, long j, boolean z, long j2, List<String> list3, long j3, int i, String str3, long j4, String str4, boolean z2, String str5, String str6, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str7, boolean z8, boolean z9, zzaig zzaig, List<String> list4, List<String> list5, boolean z10, zzael zzael, boolean z11, String str8, List<String> list6, boolean z12, String str9, zzaiq zzaiq, String str10, boolean z13, boolean z14, boolean z15, int i2, boolean z16, List<String> list7, boolean z17, String str11) {
        this(19, str, str2, list, -2, list2, j, z, j2, list3, j3, i, str3, j4, str4, z2, str5, str6, z3, z4, z5, z6, z7, null, null, str7, z8, z9, zzaig, list4, list5, z10, zzael, z11, str8, list6, z12, str9, zzaiq, str10, z13, z14, null, z15, 0, z16, list7, z17, str11);
        this.f14448U = zzaef;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (this.f14448U != null && this.f14448U.f14399a >= 9 && !TextUtils.isEmpty(this.f14453b)) {
            this.f14450W = new zzaev((SafeParcelable) new zzafj(this.f14453b));
            this.f14453b = null;
        }
        int a = C3511b.m12595a(parcel);
        C3511b.m12599a(parcel, 1, this.f14449V);
        C3511b.m12609a(parcel, 2, this.f14452a, false);
        C3511b.m12609a(parcel, 3, this.f14453b, false);
        C3511b.m12619b(parcel, 4, this.f14454c, false);
        C3511b.m12599a(parcel, 5, this.f14455d);
        C3511b.m12619b(parcel, 6, this.f14456e, false);
        C3511b.m12600a(parcel, 7, this.f14457f);
        C3511b.m12612a(parcel, 8, this.f14458g);
        C3511b.m12600a(parcel, 9, this.f14459h);
        C3511b.m12619b(parcel, 10, this.f14460i, false);
        C3511b.m12600a(parcel, 11, this.f14461j);
        C3511b.m12599a(parcel, 12, this.f14462k);
        C3511b.m12609a(parcel, 13, this.f14463l, false);
        C3511b.m12600a(parcel, 14, this.f14464m);
        C3511b.m12609a(parcel, 15, this.f14465n, false);
        C3511b.m12612a(parcel, 18, this.f14466o);
        C3511b.m12609a(parcel, 19, this.f14467p, false);
        C3511b.m12609a(parcel, 21, this.f14468q, false);
        C3511b.m12612a(parcel, 22, this.f14469r);
        C3511b.m12612a(parcel, 23, this.f14470s);
        C3511b.m12612a(parcel, 24, this.f14471t);
        C3511b.m12612a(parcel, 25, this.f14472u);
        C3511b.m12612a(parcel, 26, this.f14473v);
        C3511b.m12604a(parcel, 28, (Parcelable) this.f14450W, i, false);
        C3511b.m12609a(parcel, 29, this.f14474w, false);
        C3511b.m12609a(parcel, 30, this.f14475x, false);
        C3511b.m12612a(parcel, 31, this.f14476y);
        C3511b.m12612a(parcel, 32, this.f14477z);
        C3511b.m12604a(parcel, 33, (Parcelable) this.f14428A, i, false);
        C3511b.m12619b(parcel, 34, this.f14429B, false);
        C3511b.m12619b(parcel, 35, this.f14430C, false);
        C3511b.m12612a(parcel, 36, this.f14431D);
        C3511b.m12604a(parcel, 37, (Parcelable) this.f14432E, i, false);
        C3511b.m12612a(parcel, 38, this.f14433F);
        C3511b.m12609a(parcel, 39, this.f14434G, false);
        C3511b.m12619b(parcel, 40, this.f14435H, false);
        C3511b.m12612a(parcel, 42, this.f14436I);
        C3511b.m12609a(parcel, 43, this.f14437J, false);
        C3511b.m12604a(parcel, 44, (Parcelable) this.f14438K, i, false);
        C3511b.m12609a(parcel, 45, this.f14439L, false);
        C3511b.m12612a(parcel, 46, this.f14440M);
        C3511b.m12612a(parcel, 47, this.f14441N);
        C3511b.m12601a(parcel, 48, this.f14451X, false);
        C3511b.m12612a(parcel, 49, this.f14442O);
        C3511b.m12599a(parcel, 50, this.f14443P);
        C3511b.m12612a(parcel, 51, this.f14444Q);
        C3511b.m12619b(parcel, 52, this.f14445R, false);
        C3511b.m12612a(parcel, 53, this.f14446S);
        C3511b.m12609a(parcel, 54, this.f14447T, false);
        C3511b.m12596a(parcel, a);
    }
}
