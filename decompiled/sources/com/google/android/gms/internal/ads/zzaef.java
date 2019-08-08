package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3718cm
public final class zzaef extends AbstractSafeParcelable {
    public static final Creator<zzaef> CREATOR = new C3745dm();

    /* renamed from: A */
    public final long f14373A;

    /* renamed from: B */
    public final String f14374B;

    /* renamed from: C */
    public final float f14375C;

    /* renamed from: D */
    public final int f14376D;

    /* renamed from: E */
    public final int f14377E;

    /* renamed from: F */
    public final boolean f14378F;

    /* renamed from: G */
    public final boolean f14379G;

    /* renamed from: H */
    public final String f14380H;

    /* renamed from: I */
    public final boolean f14381I;

    /* renamed from: J */
    public final String f14382J;

    /* renamed from: K */
    public final boolean f14383K;

    /* renamed from: L */
    public final int f14384L;

    /* renamed from: M */
    public final Bundle f14385M;

    /* renamed from: N */
    public final String f14386N;

    /* renamed from: O */
    public final zzlu f14387O;

    /* renamed from: P */
    public final boolean f14388P;

    /* renamed from: Q */
    public final Bundle f14389Q;

    /* renamed from: R */
    public final String f14390R;

    /* renamed from: S */
    public final String f14391S;

    /* renamed from: T */
    public final String f14392T;

    /* renamed from: U */
    public final boolean f14393U;

    /* renamed from: V */
    public final List<Integer> f14394V;

    /* renamed from: W */
    public final String f14395W;

    /* renamed from: X */
    public final List<String> f14396X;

    /* renamed from: Y */
    public final int f14397Y;

    /* renamed from: Z */
    public final boolean f14398Z;

    /* renamed from: a */
    public final int f14399a;

    /* renamed from: aa */
    public final boolean f14400aa;

    /* renamed from: ab */
    public final boolean f14401ab;

    /* renamed from: ac */
    public final ArrayList<String> f14402ac;

    /* renamed from: b */
    public final Bundle f14403b;

    /* renamed from: c */
    public final zzjj f14404c;

    /* renamed from: d */
    public final zzjn f14405d;

    /* renamed from: e */
    public final String f14406e;

    /* renamed from: f */
    public final ApplicationInfo f14407f;

    /* renamed from: g */
    public final PackageInfo f14408g;

    /* renamed from: h */
    public final String f14409h;

    /* renamed from: i */
    public final String f14410i;

    /* renamed from: j */
    public final String f14411j;

    /* renamed from: k */
    public final zzang f14412k;

    /* renamed from: l */
    public final Bundle f14413l;

    /* renamed from: m */
    public final int f14414m;

    /* renamed from: n */
    public final List<String> f14415n;

    /* renamed from: o */
    public final Bundle f14416o;

    /* renamed from: p */
    public final boolean f14417p;

    /* renamed from: q */
    public final int f14418q;

    /* renamed from: r */
    public final int f14419r;

    /* renamed from: s */
    public final float f14420s;

    /* renamed from: t */
    public final String f14421t;

    /* renamed from: u */
    public final long f14422u;

    /* renamed from: v */
    public final String f14423v;

    /* renamed from: w */
    public final List<String> f14424w;

    /* renamed from: x */
    public final String f14425x;

    /* renamed from: y */
    public final zzpl f14426y;

    /* renamed from: z */
    public final List<String> f14427z;

    zzaef(int i, Bundle bundle, zzjj zzjj, zzjn zzjn, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, zzang zzang, Bundle bundle2, int i2, List<String> list, Bundle bundle3, boolean z, int i3, int i4, float f, String str5, long j, String str6, List<String> list2, String str7, zzpl zzpl, List<String> list3, long j2, String str8, float f2, boolean z2, int i5, int i6, boolean z3, boolean z4, String str9, String str10, boolean z5, int i7, Bundle bundle4, String str11, zzlu zzlu, boolean z6, Bundle bundle5, String str12, String str13, String str14, boolean z7, List<Integer> list4, String str15, List<String> list5, int i8, boolean z8, boolean z9, boolean z10, ArrayList<String> arrayList) {
        this.f14399a = i;
        this.f14403b = bundle;
        this.f14404c = zzjj;
        this.f14405d = zzjn;
        this.f14406e = str;
        this.f14407f = applicationInfo;
        this.f14408g = packageInfo;
        this.f14409h = str2;
        this.f14410i = str3;
        this.f14411j = str4;
        this.f14412k = zzang;
        this.f14413l = bundle2;
        this.f14414m = i2;
        this.f14415n = list;
        this.f14427z = list3 == null ? Collections.emptyList() : Collections.unmodifiableList(list3);
        this.f14416o = bundle3;
        this.f14417p = z;
        this.f14418q = i3;
        this.f14419r = i4;
        this.f14420s = f;
        this.f14421t = str5;
        this.f14422u = j;
        this.f14423v = str6;
        this.f14424w = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.f14425x = str7;
        this.f14426y = zzpl;
        this.f14373A = j2;
        this.f14374B = str8;
        this.f14375C = f2;
        this.f14381I = z2;
        this.f14376D = i5;
        this.f14377E = i6;
        this.f14378F = z3;
        this.f14379G = z4;
        this.f14380H = str9;
        this.f14382J = str10;
        this.f14383K = z5;
        this.f14384L = i7;
        this.f14385M = bundle4;
        this.f14386N = str11;
        this.f14387O = zzlu;
        this.f14388P = z6;
        this.f14389Q = bundle5;
        this.f14390R = str12;
        this.f14391S = str13;
        this.f14392T = str14;
        this.f14393U = z7;
        this.f14394V = list4;
        this.f14395W = str15;
        this.f14396X = list5;
        this.f14397Y = i8;
        this.f14398Z = z8;
        this.f14400aa = z9;
        this.f14401ab = z10;
        this.f14402ac = arrayList;
    }

    private zzaef(Bundle bundle, zzjj zzjj, zzjn zzjn, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, zzang zzang, Bundle bundle2, int i, List<String> list, List<String> list2, Bundle bundle3, boolean z, int i2, int i3, float f, String str5, long j, String str6, List<String> list3, String str7, zzpl zzpl, long j2, String str8, float f2, boolean z2, int i4, int i5, boolean z3, boolean z4, String str9, String str10, boolean z5, int i6, Bundle bundle4, String str11, zzlu zzlu, boolean z6, Bundle bundle5, String str12, String str13, String str14, boolean z7, List<Integer> list4, String str15, List<String> list5, int i7, boolean z8, boolean z9, boolean z10, ArrayList<String> arrayList) {
        this(24, bundle, zzjj, zzjn, str, applicationInfo, packageInfo, str2, str3, str4, zzang, bundle2, i, list, bundle3, z, i2, i3, f, str5, j, str6, list3, str7, zzpl, list2, j2, str8, f2, z2, i4, i5, z3, z4, str9, str10, z5, i6, bundle4, str11, zzlu, z6, bundle5, str12, str13, str14, z7, list4, str15, list5, i7, z8, z9, z10, arrayList);
    }

    public zzaef(C3744dl dlVar, long j, String str, String str2, String str3) {
        C3744dl dlVar2 = dlVar;
        Bundle bundle = dlVar2.f12886a;
        zzjj zzjj = dlVar2.f12887b;
        zzjn zzjn = dlVar2.f12888c;
        String str4 = dlVar2.f12889d;
        ApplicationInfo applicationInfo = dlVar2.f12890e;
        PackageInfo packageInfo = dlVar2.f12891f;
        String str5 = (String) C3996mt.m17453a(dlVar2.f12878Q, "");
        String str6 = dlVar2.f12892g;
        String str7 = dlVar2.f12893h;
        zzang zzang = dlVar2.f12895j;
        Bundle bundle2 = dlVar2.f12894i;
        int i = dlVar2.f12896k;
        List<String> list = dlVar2.f12897l;
        List<String> list2 = dlVar2.f12898m;
        Bundle bundle3 = dlVar2.f12900o;
        boolean z = dlVar2.f12901p;
        int i2 = dlVar2.f12902q;
        int i3 = dlVar2.f12903r;
        float f = dlVar2.f12904s;
        List<String> list3 = list2;
        String str8 = dlVar2.f12905t;
        long j2 = dlVar2.f12906u;
        String str9 = dlVar2.f12907v;
        List<String> list4 = dlVar2.f12908w;
        String str10 = str9;
        String str11 = dlVar2.f12909x;
        zzpl zzpl = dlVar2.f12910y;
        String str12 = dlVar2.f12911z;
        float f2 = dlVar2.f12862A;
        boolean z2 = dlVar2.f12863B;
        int i4 = dlVar2.f12864C;
        int i5 = dlVar2.f12865D;
        boolean z3 = dlVar2.f12866E;
        List<String> list5 = list4;
        boolean z4 = dlVar2.f12867F;
        List<String> list6 = list;
        Bundle bundle4 = bundle2;
        int i6 = i;
        String str13 = (String) C3996mt.m17454a(dlVar2.f12868G, "", 1, TimeUnit.SECONDS);
        String str14 = dlVar2.f12869H;
        boolean z5 = dlVar2.f12870I;
        int i7 = dlVar2.f12871J;
        Bundle bundle5 = dlVar2.f12872K;
        String str15 = dlVar2.f12873L;
        String str16 = str14;
        zzlu zzlu = dlVar2.f12874M;
        boolean z6 = dlVar2.f12875N;
        Bundle bundle6 = dlVar2.f12876O;
        boolean z7 = dlVar2.f12877P;
        List<Integer> list7 = dlVar2.f12879R;
        String str17 = dlVar2.f12880S;
        List<String> list8 = dlVar2.f12899n;
        int i8 = dlVar2.f12881T;
        boolean z8 = dlVar2.f12882U;
        boolean z9 = dlVar2.f12883V;
        boolean z10 = dlVar2.f12884W;
        ArrayList<String> arrayList = dlVar2.f12885X;
        Bundle bundle7 = bundle5;
        int i9 = i7;
        boolean z11 = z5;
        List<String> list9 = list3;
        boolean z12 = z10;
        boolean z13 = z;
        int i10 = i2;
        int i11 = i3;
        float f3 = f;
        String str18 = str8;
        String str19 = str10;
        Bundle bundle8 = bundle3;
        long j3 = j;
        this(bundle, zzjj, zzjn, str4, applicationInfo, packageInfo, str5, str6, str7, zzang, bundle4, i6, list6, list9, bundle8, z13, i10, i11, f3, str18, j2, str19, list5, str11, zzpl, j3, str12, f2, z2, i4, i5, z3, z4, str13, str16, z11, i9, bundle7, str15, zzlu, z6, bundle6, str, str2, str3, z7, list7, str17, list8, i8, z8, z9, z12, arrayList);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12599a(parcel, 1, this.f14399a);
        C3511b.m12601a(parcel, 2, this.f14403b, false);
        C3511b.m12604a(parcel, 3, (Parcelable) this.f14404c, i, false);
        C3511b.m12604a(parcel, 4, (Parcelable) this.f14405d, i, false);
        C3511b.m12609a(parcel, 5, this.f14406e, false);
        C3511b.m12604a(parcel, 6, (Parcelable) this.f14407f, i, false);
        C3511b.m12604a(parcel, 7, (Parcelable) this.f14408g, i, false);
        C3511b.m12609a(parcel, 8, this.f14409h, false);
        C3511b.m12609a(parcel, 9, this.f14410i, false);
        C3511b.m12609a(parcel, 10, this.f14411j, false);
        C3511b.m12604a(parcel, 11, (Parcelable) this.f14412k, i, false);
        C3511b.m12601a(parcel, 12, this.f14413l, false);
        C3511b.m12599a(parcel, 13, this.f14414m);
        C3511b.m12619b(parcel, 14, this.f14415n, false);
        C3511b.m12601a(parcel, 15, this.f14416o, false);
        C3511b.m12612a(parcel, 16, this.f14417p);
        C3511b.m12599a(parcel, 18, this.f14418q);
        C3511b.m12599a(parcel, 19, this.f14419r);
        C3511b.m12598a(parcel, 20, this.f14420s);
        C3511b.m12609a(parcel, 21, this.f14421t, false);
        C3511b.m12600a(parcel, 25, this.f14422u);
        C3511b.m12609a(parcel, 26, this.f14423v, false);
        C3511b.m12619b(parcel, 27, this.f14424w, false);
        C3511b.m12609a(parcel, 28, this.f14425x, false);
        C3511b.m12604a(parcel, 29, (Parcelable) this.f14426y, i, false);
        C3511b.m12619b(parcel, 30, this.f14427z, false);
        C3511b.m12600a(parcel, 31, this.f14373A);
        C3511b.m12609a(parcel, 33, this.f14374B, false);
        C3511b.m12598a(parcel, 34, this.f14375C);
        C3511b.m12599a(parcel, 35, this.f14376D);
        C3511b.m12599a(parcel, 36, this.f14377E);
        C3511b.m12612a(parcel, 37, this.f14378F);
        C3511b.m12612a(parcel, 38, this.f14379G);
        C3511b.m12609a(parcel, 39, this.f14380H, false);
        C3511b.m12612a(parcel, 40, this.f14381I);
        C3511b.m12609a(parcel, 41, this.f14382J, false);
        C3511b.m12612a(parcel, 42, this.f14383K);
        C3511b.m12599a(parcel, 43, this.f14384L);
        C3511b.m12601a(parcel, 44, this.f14385M, false);
        C3511b.m12609a(parcel, 45, this.f14386N, false);
        C3511b.m12604a(parcel, 46, (Parcelable) this.f14387O, i, false);
        C3511b.m12612a(parcel, 47, this.f14388P);
        C3511b.m12601a(parcel, 48, this.f14389Q, false);
        C3511b.m12609a(parcel, 49, this.f14390R, false);
        C3511b.m12609a(parcel, 50, this.f14391S, false);
        C3511b.m12609a(parcel, 51, this.f14392T, false);
        C3511b.m12612a(parcel, 52, this.f14393U);
        C3511b.m12610a(parcel, 53, this.f14394V, false);
        C3511b.m12609a(parcel, 54, this.f14395W, false);
        C3511b.m12619b(parcel, 55, this.f14396X, false);
        C3511b.m12599a(parcel, 56, this.f14397Y);
        C3511b.m12612a(parcel, 57, this.f14398Z);
        C3511b.m12612a(parcel, 58, this.f14400aa);
        C3511b.m12612a(parcel, 59, this.f14401ab);
        C3511b.m12619b(parcel, 60, this.f14402ac, false);
        C3511b.m12596a(parcel, a);
    }
}
