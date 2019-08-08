package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.C2973d;
import com.google.android.gms.ads.C3142l;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;

@C3718cm
public class zzjn extends AbstractSafeParcelable {
    public static final Creator<zzjn> CREATOR = new aof();

    /* renamed from: a */
    public final String f14543a;

    /* renamed from: b */
    public final int f14544b;

    /* renamed from: c */
    public final int f14545c;

    /* renamed from: d */
    public final boolean f14546d;

    /* renamed from: e */
    public final int f14547e;

    /* renamed from: f */
    public final int f14548f;

    /* renamed from: g */
    public final zzjn[] f14549g;

    /* renamed from: h */
    public final boolean f14550h;

    /* renamed from: i */
    public final boolean f14551i;

    /* renamed from: j */
    public boolean f14552j;

    public zzjn() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false);
    }

    public zzjn(Context context, C2973d dVar) {
        this(context, new C2973d[]{dVar});
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x007d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzjn(android.content.Context r13, com.google.android.gms.ads.C2973d[] r14) {
        /*
            r12 = this;
            r12.<init>()
            r0 = 0
            r1 = r14[r0]
            r12.f14546d = r0
            boolean r2 = r1.mo12216c()
            r12.f14551i = r2
            boolean r2 = r12.f14551i
            if (r2 == 0) goto L_0x0023
            com.google.android.gms.ads.d r2 = com.google.android.gms.ads.C2973d.f8691a
            int r2 = r2.mo12214b()
            r12.f14547e = r2
            com.google.android.gms.ads.d r2 = com.google.android.gms.ads.C2973d.f8691a
            int r2 = r2.mo12212a()
        L_0x0020:
            r12.f14544b = r2
            goto L_0x002e
        L_0x0023:
            int r2 = r1.mo12214b()
            r12.f14547e = r2
            int r2 = r1.mo12212a()
            goto L_0x0020
        L_0x002e:
            int r2 = r12.f14547e
            r3 = -1
            r4 = 1
            if (r2 != r3) goto L_0x0036
            r2 = r4
            goto L_0x0037
        L_0x0036:
            r2 = r0
        L_0x0037:
            int r3 = r12.f14544b
            r5 = -2
            if (r3 != r5) goto L_0x003e
            r3 = r4
            goto L_0x003f
        L_0x003e:
            r3 = r0
        L_0x003f:
            android.content.res.Resources r5 = r13.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            if (r2 == 0) goto L_0x0080
            com.google.android.gms.internal.ads.aoq.m14615a()
            boolean r6 = com.google.android.gms.internal.ads.C3975lz.m17389g(r13)
            if (r6 == 0) goto L_0x0066
            com.google.android.gms.internal.ads.aoq.m14615a()
            boolean r6 = com.google.android.gms.internal.ads.C3975lz.m17390h(r13)
            if (r6 == 0) goto L_0x0066
            int r6 = r5.widthPixels
            com.google.android.gms.internal.ads.aoq.m14615a()
            int r7 = com.google.android.gms.internal.ads.C3975lz.m17391i(r13)
            int r6 = r6 - r7
            goto L_0x0068
        L_0x0066:
            int r6 = r5.widthPixels
        L_0x0068:
            r12.f14548f = r6
            int r6 = r12.f14548f
            float r6 = (float) r6
            float r7 = r5.density
            float r6 = r6 / r7
            double r6 = (double) r6
            int r8 = (int) r6
            double r9 = (double) r8
            double r6 = r6 - r9
            r9 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x008d
            int r8 = r8 + 1
            goto L_0x008d
        L_0x0080:
            int r8 = r12.f14547e
            com.google.android.gms.internal.ads.aoq.m14615a()
            int r6 = r12.f14547e
            int r6 = com.google.android.gms.internal.ads.C3975lz.m17370a(r5, r6)
            r12.f14548f = r6
        L_0x008d:
            if (r3 == 0) goto L_0x0094
            int r6 = m18805c(r5)
            goto L_0x0096
        L_0x0094:
            int r6 = r12.f14544b
        L_0x0096:
            com.google.android.gms.internal.ads.aoq.m14615a()
            int r5 = com.google.android.gms.internal.ads.C3975lz.m17370a(r5, r6)
            r12.f14545c = r5
            if (r2 != 0) goto L_0x00b0
            if (r3 == 0) goto L_0x00a4
            goto L_0x00b0
        L_0x00a4:
            boolean r2 = r12.f14551i
            if (r2 == 0) goto L_0x00ab
            java.lang.String r1 = "320x50_mb"
            goto L_0x00cb
        L_0x00ab:
            java.lang.String r1 = r1.toString()
            goto L_0x00cb
        L_0x00b0:
            r1 = 26
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r2.append(r8)
            java.lang.String r1 = "x"
            r2.append(r1)
            r2.append(r6)
            java.lang.String r1 = "_as"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
        L_0x00cb:
            r12.f14543a = r1
            int r1 = r14.length
            if (r1 <= r4) goto L_0x00e7
            int r1 = r14.length
            com.google.android.gms.internal.ads.zzjn[] r1 = new com.google.android.gms.internal.ads.zzjn[r1]
            r12.f14549g = r1
            r1 = r0
        L_0x00d6:
            int r2 = r14.length
            if (r1 >= r2) goto L_0x00ea
            com.google.android.gms.internal.ads.zzjn[] r2 = r12.f14549g
            com.google.android.gms.internal.ads.zzjn r3 = new com.google.android.gms.internal.ads.zzjn
            r4 = r14[r1]
            r3.<init>(r13, r4)
            r2[r1] = r3
            int r1 = r1 + 1
            goto L_0x00d6
        L_0x00e7:
            r13 = 0
            r12.f14549g = r13
        L_0x00ea:
            r12.f14550h = r0
            r12.f14552j = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjn.<init>(android.content.Context, com.google.android.gms.ads.d[]):void");
    }

    public zzjn(zzjn zzjn, zzjn[] zzjnArr) {
        this(zzjn.f14543a, zzjn.f14544b, zzjn.f14545c, zzjn.f14546d, zzjn.f14547e, zzjn.f14548f, zzjnArr, zzjn.f14550h, zzjn.f14551i, zzjn.f14552j);
    }

    zzjn(String str, int i, int i2, boolean z, int i3, int i4, zzjn[] zzjnArr, boolean z2, boolean z3, boolean z4) {
        this.f14543a = str;
        this.f14544b = i;
        this.f14545c = i2;
        this.f14546d = z;
        this.f14547e = i3;
        this.f14548f = i4;
        this.f14549g = zzjnArr;
        this.f14550h = z2;
        this.f14551i = z3;
        this.f14552j = z4;
    }

    /* renamed from: a */
    public static int m18801a(DisplayMetrics displayMetrics) {
        return displayMetrics.widthPixels;
    }

    /* renamed from: a */
    public static zzjn m18802a() {
        zzjn zzjn = new zzjn("reward_mb", 0, 0, true, 0, 0, null, false, false, false);
        return zzjn;
    }

    /* renamed from: a */
    public static zzjn m18803a(Context context) {
        zzjn zzjn = new zzjn("320x50_mb", 0, 0, false, 0, 0, null, true, false, false);
        return zzjn;
    }

    /* renamed from: b */
    public static int m18804b(DisplayMetrics displayMetrics) {
        return (int) (((float) m18805c(displayMetrics)) * displayMetrics.density);
    }

    /* renamed from: c */
    private static int m18805c(DisplayMetrics displayMetrics) {
        int i = (int) (((float) displayMetrics.heightPixels) / displayMetrics.density);
        if (i <= 400) {
            return 32;
        }
        return i <= 720 ? 50 : 90;
    }

    /* renamed from: b */
    public final C2973d mo16268b() {
        return C3142l.m11259a(this.f14547e, this.f14544b, this.f14543a);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12609a(parcel, 2, this.f14543a, false);
        C3511b.m12599a(parcel, 3, this.f14544b);
        C3511b.m12599a(parcel, 4, this.f14545c);
        C3511b.m12612a(parcel, 5, this.f14546d);
        C3511b.m12599a(parcel, 6, this.f14547e);
        C3511b.m12599a(parcel, 7, this.f14548f);
        C3511b.m12614a(parcel, 8, (T[]) this.f14549g, i, false);
        C3511b.m12612a(parcel, 9, this.f14550h);
        C3511b.m12612a(parcel, 10, this.f14551i);
        C3511b.m12612a(parcel, 11, this.f14552j);
        C3511b.m12596a(parcel, a);
    }
}
