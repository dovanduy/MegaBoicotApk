package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.util.Arrays;

final class adb {

    /* renamed from: A */
    private int f10525A;

    /* renamed from: B */
    private int f10526B;

    /* renamed from: C */
    private Field f10527C;

    /* renamed from: D */
    private Object f10528D;

    /* renamed from: E */
    private Object f10529E;

    /* renamed from: F */
    private Object f10530F;

    /* renamed from: a */
    private final adc f10531a;

    /* renamed from: b */
    private final Object[] f10532b;

    /* renamed from: c */
    private Class<?> f10533c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final int f10534d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final int f10535e;

    /* renamed from: f */
    private final int f10536f;

    /* renamed from: g */
    private final int f10537g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final int f10538h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final int f10539i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final int f10540j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final int f10541k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final int f10542l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final int f10543m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final int[] f10544n;

    /* renamed from: o */
    private int f10545o;

    /* renamed from: p */
    private int f10546p;

    /* renamed from: q */
    private int f10547q = Integer.MAX_VALUE;

    /* renamed from: r */
    private int f10548r = Integer.MIN_VALUE;

    /* renamed from: s */
    private int f10549s = 0;

    /* renamed from: t */
    private int f10550t = 0;

    /* renamed from: u */
    private int f10551u = 0;

    /* renamed from: v */
    private int f10552v = 0;

    /* renamed from: w */
    private int f10553w = 0;

    /* renamed from: x */
    private int f10554x;

    /* renamed from: y */
    private int f10555y;

    /* renamed from: z */
    private int f10556z;

    adb(Class<?> cls, String str, Object[] objArr) {
        this.f10533c = cls;
        this.f10531a = new adc(str);
        this.f10532b = objArr;
        this.f10534d = this.f10531a.mo14111b();
        this.f10535e = this.f10531a.mo14111b();
        int[] iArr = null;
        if (this.f10535e == 0) {
            this.f10536f = 0;
            this.f10537g = 0;
            this.f10538h = 0;
            this.f10539i = 0;
            this.f10540j = 0;
            this.f10542l = 0;
            this.f10541k = 0;
            this.f10543m = 0;
            this.f10544n = null;
            return;
        }
        this.f10536f = this.f10531a.mo14111b();
        this.f10537g = this.f10531a.mo14111b();
        this.f10538h = this.f10531a.mo14111b();
        this.f10539i = this.f10531a.mo14111b();
        this.f10542l = this.f10531a.mo14111b();
        this.f10541k = this.f10531a.mo14111b();
        this.f10540j = this.f10531a.mo14111b();
        this.f10543m = this.f10531a.mo14111b();
        int b = this.f10531a.mo14111b();
        if (b != 0) {
            iArr = new int[b];
        }
        this.f10544n = iArr;
        this.f10545o = (this.f10536f << 1) + this.f10537g;
    }

    /* renamed from: a */
    private static Field m13531a(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(40 + String.valueOf(str).length() + String.valueOf(name).length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    /* renamed from: p */
    private final Object m13540p() {
        Object[] objArr = this.f10532b;
        int i = this.f10545o;
        this.f10545o = i + 1;
        return objArr[i];
    }

    /* renamed from: q */
    private final boolean m13541q() {
        return (this.f10534d & 1) == 1;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d5, code lost:
        if (m13541q() != false) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0161, code lost:
        if (r1 != false) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0169, code lost:
        if (m13541q() != false) goto L_0x00d7;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo14095a() {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.adc r0 = r5.f10531a
            boolean r0 = r0.mo14110a()
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            com.google.android.gms.internal.ads.adc r0 = r5.f10531a
            int r0 = r0.mo14111b()
            r5.f10554x = r0
            com.google.android.gms.internal.ads.adc r0 = r5.f10531a
            int r0 = r0.mo14111b()
            r5.f10555y = r0
            int r0 = r5.f10555y
            r0 = r0 & 255(0xff, float:3.57E-43)
            r5.f10556z = r0
            int r0 = r5.f10554x
            int r2 = r5.f10547q
            if (r0 >= r2) goto L_0x002a
            int r0 = r5.f10554x
            r5.f10547q = r0
        L_0x002a:
            int r0 = r5.f10554x
            int r2 = r5.f10548r
            if (r0 <= r2) goto L_0x0034
            int r0 = r5.f10554x
            r5.f10548r = r0
        L_0x0034:
            int r0 = r5.f10556z
            com.google.android.gms.internal.ads.aaz r2 = com.google.android.gms.internal.ads.aaz.MAP
            int r2 = r2.mo13972a()
            r3 = 1
            if (r0 != r2) goto L_0x0045
            int r0 = r5.f10549s
            int r0 = r0 + r3
            r5.f10549s = r0
            goto L_0x005e
        L_0x0045:
            int r0 = r5.f10556z
            com.google.android.gms.internal.ads.aaz r2 = com.google.android.gms.internal.ads.aaz.DOUBLE_LIST
            int r2 = r2.mo13972a()
            if (r0 < r2) goto L_0x005e
            int r0 = r5.f10556z
            com.google.android.gms.internal.ads.aaz r2 = com.google.android.gms.internal.ads.aaz.GROUP_LIST
            int r2 = r2.mo13972a()
            if (r0 > r2) goto L_0x005e
            int r0 = r5.f10550t
            int r0 = r0 + r3
            r5.f10550t = r0
        L_0x005e:
            int r0 = r5.f10553w
            int r0 = r0 + r3
            r5.f10553w = r0
            int r0 = r5.f10547q
            int r2 = r5.f10554x
            int r4 = r5.f10553w
            boolean r0 = com.google.android.gms.internal.ads.adg.m13628a(r0, r2, r4)
            if (r0 == 0) goto L_0x007c
            int r0 = r5.f10554x
            int r0 = r0 + r3
            r5.f10552v = r0
            int r0 = r5.f10552v
            int r2 = r5.f10547q
            int r0 = r0 - r2
        L_0x0079:
            r5.f10551u = r0
            goto L_0x0080
        L_0x007c:
            int r0 = r5.f10551u
            int r0 = r0 + r3
            goto L_0x0079
        L_0x0080:
            int r0 = r5.f10555y
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0088
            r0 = r3
            goto L_0x0089
        L_0x0088:
            r0 = r1
        L_0x0089:
            if (r0 == 0) goto L_0x0097
            int[] r0 = r5.f10544n
            int r2 = r5.f10546p
            int r4 = r2 + 1
            r5.f10546p = r4
            int r4 = r5.f10554x
            r0[r2] = r4
        L_0x0097:
            r0 = 0
            r5.f10528D = r0
            r5.f10529E = r0
            r5.f10530F = r0
            boolean r0 = r5.mo14098d()
            if (r0 == 0) goto L_0x00e5
            com.google.android.gms.internal.ads.adc r0 = r5.f10531a
            int r0 = r0.mo14111b()
            r5.f10525A = r0
            int r0 = r5.f10556z
            com.google.android.gms.internal.ads.aaz r1 = com.google.android.gms.internal.ads.aaz.MESSAGE
            int r1 = r1.mo13972a()
            int r1 = r1 + 51
            if (r0 == r1) goto L_0x00de
            int r0 = r5.f10556z
            com.google.android.gms.internal.ads.aaz r1 = com.google.android.gms.internal.ads.aaz.GROUP
            int r1 = r1.mo13972a()
            int r1 = r1 + 51
            if (r0 != r1) goto L_0x00c5
            goto L_0x00de
        L_0x00c5:
            int r0 = r5.f10556z
            com.google.android.gms.internal.ads.aaz r1 = com.google.android.gms.internal.ads.aaz.ENUM
            int r1 = r1.mo13972a()
            int r1 = r1 + 51
            if (r0 != r1) goto L_0x0175
            boolean r0 = r5.m13541q()
            if (r0 == 0) goto L_0x0175
        L_0x00d7:
            java.lang.Object r0 = r5.m13540p()
            r5.f10529E = r0
            return r3
        L_0x00de:
            java.lang.Object r0 = r5.m13540p()
        L_0x00e2:
            r5.f10528D = r0
            return r3
        L_0x00e5:
            java.lang.Class<?> r0 = r5.f10533c
            java.lang.Object r2 = r5.m13540p()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.reflect.Field r0 = m13531a(r0, r2)
            r5.f10527C = r0
            boolean r0 = r5.mo14102h()
            if (r0 == 0) goto L_0x0101
            com.google.android.gms.internal.ads.adc r0 = r5.f10531a
            int r0 = r0.mo14111b()
            r5.f10526B = r0
        L_0x0101:
            int r0 = r5.f10556z
            com.google.android.gms.internal.ads.aaz r2 = com.google.android.gms.internal.ads.aaz.MESSAGE
            int r2 = r2.mo13972a()
            if (r0 == r2) goto L_0x016d
            int r0 = r5.f10556z
            com.google.android.gms.internal.ads.aaz r2 = com.google.android.gms.internal.ads.aaz.GROUP
            int r2 = r2.mo13972a()
            if (r0 != r2) goto L_0x0116
            goto L_0x016d
        L_0x0116:
            int r0 = r5.f10556z
            com.google.android.gms.internal.ads.aaz r2 = com.google.android.gms.internal.ads.aaz.MESSAGE_LIST
            int r2 = r2.mo13972a()
            if (r0 == r2) goto L_0x00de
            int r0 = r5.f10556z
            com.google.android.gms.internal.ads.aaz r2 = com.google.android.gms.internal.ads.aaz.GROUP_LIST
            int r2 = r2.mo13972a()
            if (r0 != r2) goto L_0x012b
            goto L_0x00de
        L_0x012b:
            int r0 = r5.f10556z
            com.google.android.gms.internal.ads.aaz r2 = com.google.android.gms.internal.ads.aaz.ENUM
            int r2 = r2.mo13972a()
            if (r0 == r2) goto L_0x0165
            int r0 = r5.f10556z
            com.google.android.gms.internal.ads.aaz r2 = com.google.android.gms.internal.ads.aaz.ENUM_LIST
            int r2 = r2.mo13972a()
            if (r0 == r2) goto L_0x0165
            int r0 = r5.f10556z
            com.google.android.gms.internal.ads.aaz r2 = com.google.android.gms.internal.ads.aaz.ENUM_LIST_PACKED
            int r2 = r2.mo13972a()
            if (r0 != r2) goto L_0x014a
            goto L_0x0165
        L_0x014a:
            int r0 = r5.f10556z
            com.google.android.gms.internal.ads.aaz r2 = com.google.android.gms.internal.ads.aaz.MAP
            int r2 = r2.mo13972a()
            if (r0 != r2) goto L_0x0175
            java.lang.Object r0 = r5.m13540p()
            r5.f10530F = r0
            int r0 = r5.f10555y
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0161
            r1 = r3
        L_0x0161:
            if (r1 == 0) goto L_0x0175
            goto L_0x00d7
        L_0x0165:
            boolean r0 = r5.m13541q()
            if (r0 == 0) goto L_0x0175
            goto L_0x00d7
        L_0x016d:
            java.lang.reflect.Field r0 = r5.f10527C
            java.lang.Class r0 = r0.getType()
            goto L_0x00e2
        L_0x0175:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.adb.mo14095a():boolean");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo14096b() {
        return this.f10554x;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final int mo14097c() {
        return this.f10556z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final boolean mo14098d() {
        return this.f10556z > aaz.MAP.mo13972a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final Field mo14099e() {
        int i = this.f10525A << 1;
        Object obj = this.f10532b[i];
        if (obj instanceof Field) {
            return (Field) obj;
        }
        Field a = m13531a(this.f10533c, (String) obj);
        this.f10532b[i] = a;
        return a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final Field mo14100f() {
        int i = (this.f10525A << 1) + 1;
        Object obj = this.f10532b[i];
        if (obj instanceof Field) {
            return (Field) obj;
        }
        Field a = m13531a(this.f10533c, (String) obj);
        this.f10532b[i] = a;
        return a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final Field mo14101g() {
        return this.f10527C;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final boolean mo14102h() {
        return m13541q() && this.f10556z <= aaz.GROUP.mo13972a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final Field mo14103i() {
        int i = (this.f10536f << 1) + (this.f10526B / 32);
        Object obj = this.f10532b[i];
        if (obj instanceof Field) {
            return (Field) obj;
        }
        Field a = m13531a(this.f10533c, (String) obj);
        this.f10532b[i] = a;
        return a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final int mo14104j() {
        return this.f10526B % 32;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final boolean mo14105k() {
        return (this.f10555y & 256) != 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public final boolean mo14106l() {
        return (this.f10555y & 512) != 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public final Object mo14107m() {
        return this.f10528D;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public final Object mo14108n() {
        return this.f10529E;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public final Object mo14109o() {
        return this.f10530F;
    }
}
