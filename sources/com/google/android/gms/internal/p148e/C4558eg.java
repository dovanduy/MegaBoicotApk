package com.google.android.gms.internal.p148e;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.e.eg */
final class C4558eg<T> implements C4571et<T> {

    /* renamed from: a */
    private static final int[] f14909a = new int[0];

    /* renamed from: b */
    private static final Unsafe f14910b = C4601fr.m19862c();

    /* renamed from: c */
    private final int[] f14911c;

    /* renamed from: d */
    private final Object[] f14912d;

    /* renamed from: e */
    private final int f14913e;

    /* renamed from: f */
    private final int f14914f;

    /* renamed from: g */
    private final C4554ec f14915g;

    /* renamed from: h */
    private final boolean f14916h;

    /* renamed from: i */
    private final boolean f14917i;

    /* renamed from: j */
    private final boolean f14918j;

    /* renamed from: k */
    private final boolean f14919k;

    /* renamed from: l */
    private final int[] f14920l;

    /* renamed from: m */
    private final int f14921m;

    /* renamed from: n */
    private final int f14922n;

    /* renamed from: o */
    private final C4562ek f14923o;

    /* renamed from: p */
    private final C4537dm f14924p;

    /* renamed from: q */
    private final C4595fl<?, ?> f14925q;

    /* renamed from: r */
    private final C4501ci<?> f14926r;

    /* renamed from: s */
    private final C4548dx f14927s;

    private C4558eg(int[] iArr, Object[] objArr, int i, int i2, C4554ec ecVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, C4562ek ekVar, C4537dm dmVar, C4595fl<?, ?> flVar, C4501ci<?> ciVar, C4548dx dxVar) {
        this.f14911c = iArr;
        this.f14912d = objArr;
        this.f14913e = i;
        this.f14914f = i2;
        this.f14917i = ecVar instanceof C4513cu;
        this.f14918j = z;
        this.f14916h = ciVar != null && ciVar.mo16576a(ecVar);
        this.f14919k = false;
        this.f14920l = iArr2;
        this.f14921m = i3;
        this.f14922n = i4;
        this.f14923o = ekVar;
        this.f14924p = dmVar;
        this.f14925q = flVar;
        this.f14926r = ciVar;
        this.f14915g = ecVar;
        this.f14927s = dxVar;
    }

    /* renamed from: f */
    private static boolean m19589f(int i) {
        return (i & 536870912) != 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:166:0x0378  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> com.google.android.gms.internal.p148e.C4558eg<T> m19561a(java.lang.Class<T> r39, com.google.android.gms.internal.p148e.C4552ea r40, com.google.android.gms.internal.p148e.C4562ek r41, com.google.android.gms.internal.p148e.C4537dm r42, com.google.android.gms.internal.p148e.C4595fl<?, ?> r43, com.google.android.gms.internal.p148e.C4501ci<?> r44, com.google.android.gms.internal.p148e.C4548dx r45) {
        /*
            r0 = r40
            boolean r1 = r0 instanceof com.google.android.gms.internal.p148e.C4569er
            if (r1 == 0) goto L_0x043c
            com.google.android.gms.internal.e.er r0 = (com.google.android.gms.internal.p148e.C4569er) r0
            int r1 = r0.mo16681a()
            int r2 = com.google.android.gms.internal.p148e.C4513cu.C4518e.f14853i
            r3 = 0
            r4 = 1
            if (r1 != r2) goto L_0x0014
            r11 = r4
            goto L_0x0015
        L_0x0014:
            r11 = r3
        L_0x0015:
            java.lang.String r1 = r0.mo16699d()
            int r2 = r1.length()
            char r5 = r1.charAt(r3)
            r7 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r7) goto L_0x003f
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r8 = r5
            r9 = 13
            r5 = r4
        L_0x002c:
            int r10 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r7) goto L_0x003c
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r5 = r5 << r9
            r8 = r8 | r5
            int r9 = r9 + 13
            r5 = r10
            goto L_0x002c
        L_0x003c:
            int r5 = r5 << r9
            r5 = r5 | r8
            goto L_0x0040
        L_0x003f:
            r10 = r4
        L_0x0040:
            int r8 = r10 + 1
            char r9 = r1.charAt(r10)
            if (r9 < r7) goto L_0x005f
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x004c:
            int r12 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r7) goto L_0x005c
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r10
            r9 = r9 | r8
            int r10 = r10 + 13
            r8 = r12
            goto L_0x004c
        L_0x005c:
            int r8 = r8 << r10
            r9 = r9 | r8
            r8 = r12
        L_0x005f:
            if (r9 != 0) goto L_0x006d
            int[] r9 = f14909a
            r10 = r3
            r12 = r10
            r13 = r12
            r14 = r13
            r15 = r14
            r16 = r9
            r9 = r15
            goto L_0x019e
        L_0x006d:
            int r9 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r7) goto L_0x008c
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x0079:
            int r12 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r7) goto L_0x0089
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r10
            r8 = r8 | r9
            int r10 = r10 + 13
            r9 = r12
            goto L_0x0079
        L_0x0089:
            int r9 = r9 << r10
            r8 = r8 | r9
            r9 = r12
        L_0x008c:
            int r10 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r7) goto L_0x00ab
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x0098:
            int r13 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r7) goto L_0x00a8
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r12
            r9 = r9 | r10
            int r12 = r12 + 13
            r10 = r13
            goto L_0x0098
        L_0x00a8:
            int r10 = r10 << r12
            r9 = r9 | r10
            r10 = r13
        L_0x00ab:
            int r12 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r7) goto L_0x00ca
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00b7:
            int r14 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r7) goto L_0x00c7
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r10 = r10 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00b7
        L_0x00c7:
            int r12 = r12 << r13
            r10 = r10 | r12
            r12 = r14
        L_0x00ca:
            int r13 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r7) goto L_0x00e9
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00d6:
            int r15 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r7) goto L_0x00e6
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00d6
        L_0x00e6:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x00e9:
            int r14 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r7) goto L_0x010a
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x00f5:
            int r16 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r7) goto L_0x0106
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x00f5
        L_0x0106:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x010a:
            int r15 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r7) goto L_0x012d
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x0116:
            int r17 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r7) goto L_0x0128
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x0116
        L_0x0128:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x012d:
            int r16 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r7) goto L_0x0159
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r17 = 13
            r37 = r16
            r16 = r15
            r15 = r37
        L_0x013f:
            int r18 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r7) goto L_0x0152
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r17
            r16 = r16 | r15
            int r17 = r17 + 13
            r15 = r18
            goto L_0x013f
        L_0x0152:
            int r15 = r15 << r17
            r15 = r16 | r15
            r3 = r18
            goto L_0x015b
        L_0x0159:
            r3 = r16
        L_0x015b:
            int r16 = r3 + 1
            char r3 = r1.charAt(r3)
            if (r3 < r7) goto L_0x0186
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r17 = 13
            r37 = r16
            r16 = r3
            r3 = r37
        L_0x016d:
            int r18 = r3 + 1
            char r3 = r1.charAt(r3)
            if (r3 < r7) goto L_0x0180
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r17
            r16 = r16 | r3
            int r17 = r17 + 13
            r3 = r18
            goto L_0x016d
        L_0x0180:
            int r3 = r3 << r17
            r3 = r16 | r3
            r16 = r18
        L_0x0186:
            int r17 = r3 + r14
            int r15 = r17 + r15
            int[] r15 = new int[r15]
            int r17 = r8 << 1
            int r9 = r17 + r9
            r37 = r14
            r14 = r3
            r3 = r37
            r38 = r9
            r9 = r8
            r8 = r16
            r16 = r15
            r15 = r38
        L_0x019e:
            sun.misc.Unsafe r6 = f14910b
            java.lang.Object[] r17 = r0.mo16700e()
            com.google.android.gms.internal.e.ec r7 = r0.mo16683c()
            java.lang.Class r7 = r7.getClass()
            r22 = r8
            int r8 = r13 * 3
            int[] r8 = new int[r8]
            int r13 = r13 << r4
            java.lang.Object[] r13 = new java.lang.Object[r13]
            int r3 = r3 + r14
            r23 = r3
            r20 = r15
            r15 = r22
            r18 = 0
            r19 = 0
            r22 = r14
        L_0x01c2:
            if (r15 >= r2) goto L_0x0412
            int r24 = r15 + 1
            char r15 = r1.charAt(r15)
            r4 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r4) goto L_0x01f6
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r25 = 13
            r37 = r24
            r24 = r15
            r15 = r37
        L_0x01d9:
            int r26 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r4) goto L_0x01ef
            r4 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r25
            r24 = r24 | r4
            int r25 = r25 + 13
            r15 = r26
            r4 = 55296(0xd800, float:7.7486E-41)
            goto L_0x01d9
        L_0x01ef:
            int r4 = r15 << r25
            r15 = r24 | r4
            r4 = r26
            goto L_0x01f8
        L_0x01f6:
            r4 = r24
        L_0x01f8:
            int r24 = r4 + 1
            char r4 = r1.charAt(r4)
            r27 = r2
            r2 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r2) goto L_0x022c
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r25 = 13
            r37 = r24
            r24 = r4
            r4 = r37
        L_0x020f:
            int r26 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r2) goto L_0x0225
            r2 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r25
            r24 = r24 | r2
            int r25 = r25 + 13
            r4 = r26
            r2 = 55296(0xd800, float:7.7486E-41)
            goto L_0x020f
        L_0x0225:
            int r2 = r4 << r25
            r4 = r24 | r2
            r2 = r26
            goto L_0x022e
        L_0x022c:
            r2 = r24
        L_0x022e:
            r28 = r3
            r3 = r4 & 255(0xff, float:3.57E-43)
            r29 = r14
            r14 = r4 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x023e
            int r14 = r18 + 1
            r16[r18] = r19
            r18 = r14
        L_0x023e:
            r14 = 51
            r30 = r11
            if (r3 < r14) goto L_0x02e1
            int r14 = r2 + 1
            char r2 = r1.charAt(r2)
            r11 = 55296(0xd800, float:7.7486E-41)
            if (r2 < r11) goto L_0x026c
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r24 = 13
        L_0x0253:
            int r25 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r11) goto L_0x0268
            r11 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r24
            r2 = r2 | r11
            int r24 = r24 + 13
            r14 = r25
            r11 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0253
        L_0x0268:
            int r11 = r14 << r24
            r2 = r2 | r11
            goto L_0x026e
        L_0x026c:
            r25 = r14
        L_0x026e:
            int r11 = r3 + -51
            r14 = 9
            if (r11 == r14) goto L_0x0293
            r14 = 17
            if (r11 != r14) goto L_0x0279
            goto L_0x0293
        L_0x0279:
            r14 = 12
            if (r11 != r14) goto L_0x028f
            r11 = r5 & 1
            r14 = 1
            if (r11 != r14) goto L_0x028f
            int r11 = r19 / 3
            int r11 = r11 << r14
            int r11 = r11 + r14
            int r14 = r20 + 1
            r20 = r17[r20]
            r13[r11] = r20
            r24 = r14
            goto L_0x0291
        L_0x028f:
            r24 = r20
        L_0x0291:
            r14 = 1
            goto L_0x029e
        L_0x0293:
            int r11 = r19 / 3
            r14 = 1
            int r11 = r11 << r14
            int r11 = r11 + r14
            int r24 = r20 + 1
            r20 = r17[r20]
            r13[r11] = r20
        L_0x029e:
            int r2 = r2 << r14
            r11 = r17[r2]
            boolean r14 = r11 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x02aa
            java.lang.reflect.Field r11 = (java.lang.reflect.Field) r11
        L_0x02a7:
            r31 = r12
            goto L_0x02b3
        L_0x02aa:
            java.lang.String r11 = (java.lang.String) r11
            java.lang.reflect.Field r11 = m19565a(r7, r11)
            r17[r2] = r11
            goto L_0x02a7
        L_0x02b3:
            long r11 = r6.objectFieldOffset(r11)
            int r11 = (int) r11
            int r2 = r2 + 1
            r12 = r17[r2]
            boolean r14 = r12 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x02c5
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
        L_0x02c2:
            r32 = r11
            goto L_0x02ce
        L_0x02c5:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.reflect.Field r12 = m19565a(r7, r12)
            r17[r2] = r12
            goto L_0x02c2
        L_0x02ce:
            long r11 = r6.objectFieldOffset(r12)
            int r2 = (int) r11
            r35 = r9
            r33 = r10
            r20 = r24
            r36 = r25
            r11 = r32
            r9 = r2
            r2 = 0
            goto L_0x03db
        L_0x02e1:
            r31 = r12
            int r11 = r20 + 1
            r12 = r17[r20]
            java.lang.String r12 = (java.lang.String) r12
            java.lang.reflect.Field r12 = m19565a(r7, r12)
            r14 = 9
            if (r3 == r14) goto L_0x035f
            r14 = 17
            if (r3 != r14) goto L_0x02f7
            goto L_0x035f
        L_0x02f7:
            r14 = 27
            if (r3 == r14) goto L_0x034f
            r14 = 49
            if (r3 != r14) goto L_0x0300
            goto L_0x034f
        L_0x0300:
            r14 = 12
            if (r3 == r14) goto L_0x033d
            r14 = 30
            if (r3 == r14) goto L_0x033d
            r14 = 44
            if (r3 != r14) goto L_0x030d
            goto L_0x033d
        L_0x030d:
            r14 = 50
            if (r3 != r14) goto L_0x0339
            int r14 = r22 + 1
            r16[r22] = r19
            int r20 = r19 / 3
            r22 = 1
            int r20 = r20 << 1
            int r22 = r11 + 1
            r11 = r17[r11]
            r13[r20] = r11
            r11 = r4 & 2048(0x800, float:2.87E-42)
            if (r11 == 0) goto L_0x0332
            int r20 = r20 + 1
            int r11 = r22 + 1
            r22 = r17[r22]
            r13[r20] = r22
            r33 = r10
            r34 = r11
            goto L_0x0336
        L_0x0332:
            r33 = r10
            r34 = r22
        L_0x0336:
            r22 = r14
            goto L_0x036e
        L_0x0339:
            r33 = r10
            r10 = 1
            goto L_0x036c
        L_0x033d:
            r14 = r5 & 1
            r33 = r10
            r10 = 1
            if (r14 != r10) goto L_0x036c
            int r14 = r19 / 3
            int r14 = r14 << r10
            int r14 = r14 + r10
            int r20 = r11 + 1
            r11 = r17[r11]
            r13[r14] = r11
            goto L_0x035c
        L_0x034f:
            r33 = r10
            r10 = 1
            int r14 = r19 / 3
            int r14 = r14 << r10
            int r14 = r14 + r10
            int r20 = r11 + 1
            r11 = r17[r11]
            r13[r14] = r11
        L_0x035c:
            r34 = r20
            goto L_0x036e
        L_0x035f:
            r33 = r10
            r10 = 1
            int r14 = r19 / 3
            int r14 = r14 << r10
            int r14 = r14 + r10
            java.lang.Class r20 = r12.getType()
            r13[r14] = r20
        L_0x036c:
            r34 = r11
        L_0x036e:
            long r10 = r6.objectFieldOffset(r12)
            int r11 = (int) r10
            r10 = r5 & 1
            r12 = 1
            if (r10 != r12) goto L_0x03c5
            r10 = 17
            if (r3 > r10) goto L_0x03c5
            int r10 = r2 + 1
            char r2 = r1.charAt(r2)
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r2 < r12) goto L_0x03a0
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x038b:
            int r20 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r12) goto L_0x039c
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r14
            r2 = r2 | r10
            int r14 = r14 + 13
            r10 = r20
            goto L_0x038b
        L_0x039c:
            int r10 = r10 << r14
            r2 = r2 | r10
            r10 = r20
        L_0x03a0:
            r14 = 1
            int r20 = r9 << 1
            int r21 = r2 / 32
            int r20 = r20 + r21
            r12 = r17[r20]
            boolean r14 = r12 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x03b4
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
        L_0x03af:
            r35 = r9
            r36 = r10
            goto L_0x03bd
        L_0x03b4:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.reflect.Field r12 = m19565a(r7, r12)
            r17[r20] = r12
            goto L_0x03af
        L_0x03bd:
            long r9 = r6.objectFieldOffset(r12)
            int r9 = (int) r9
            int r2 = r2 % 32
            goto L_0x03cb
        L_0x03c5:
            r35 = r9
            r36 = r2
            r2 = 0
            r9 = 0
        L_0x03cb:
            r10 = 18
            if (r3 < r10) goto L_0x03d9
            r10 = 49
            if (r3 > r10) goto L_0x03d9
            int r10 = r23 + 1
            r16[r23] = r11
            r23 = r10
        L_0x03d9:
            r20 = r34
        L_0x03db:
            int r10 = r19 + 1
            r8[r19] = r15
            int r12 = r10 + 1
            r14 = r4 & 512(0x200, float:7.175E-43)
            if (r14 == 0) goto L_0x03e8
            r14 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x03e9
        L_0x03e8:
            r14 = 0
        L_0x03e9:
            r4 = r4 & 256(0x100, float:3.59E-43)
            if (r4 == 0) goto L_0x03f0
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03f1
        L_0x03f0:
            r4 = 0
        L_0x03f1:
            r4 = r4 | r14
            int r3 = r3 << 20
            r3 = r3 | r4
            r3 = r3 | r11
            r8[r10] = r3
            int r19 = r12 + 1
            int r2 = r2 << 20
            r2 = r2 | r9
            r8[r12] = r2
            r2 = r27
            r3 = r28
            r14 = r29
            r11 = r30
            r12 = r31
            r10 = r33
            r9 = r35
            r15 = r36
            r4 = 1
            goto L_0x01c2
        L_0x0412:
            r28 = r3
            r33 = r10
            r30 = r11
            r31 = r12
            r29 = r14
            com.google.android.gms.internal.e.eg r1 = new com.google.android.gms.internal.e.eg
            com.google.android.gms.internal.e.ec r10 = r0.mo16683c()
            r12 = 0
            r5 = r1
            r6 = r8
            r7 = r13
            r8 = r33
            r9 = r31
            r13 = r16
            r15 = r28
            r16 = r41
            r17 = r42
            r18 = r43
            r19 = r44
            r20 = r45
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r1
        L_0x043c:
            com.google.android.gms.internal.e.fg r0 = (com.google.android.gms.internal.p148e.C4590fg) r0
            r0.mo16681a()
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p148e.C4558eg.m19561a(java.lang.Class, com.google.android.gms.internal.e.ea, com.google.android.gms.internal.e.ek, com.google.android.gms.internal.e.dm, com.google.android.gms.internal.e.fl, com.google.android.gms.internal.e.ci, com.google.android.gms.internal.e.dx):com.google.android.gms.internal.e.eg");
    }

    /* renamed from: a */
    private static Field m19565a(Class<?> cls, String str) {
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

    /* renamed from: a */
    public final T mo16685a() {
        return this.f14923o.mo16694a(this.f14915g);
    }

    /* JADX INFO: used method not loaded: com.google.android.gms.internal.e.ev.a(java.lang.Object, java.lang.Object):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006a, code lost:
        if (com.google.android.gms.internal.p148e.C4573ev.m19696a(com.google.android.gms.internal.p148e.C4601fr.m19874f(r10, r6), com.google.android.gms.internal.p148e.C4601fr.m19874f(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007e, code lost:
        if (com.google.android.gms.internal.p148e.C4601fr.m19857b(r10, r6) == com.google.android.gms.internal.p148e.C4601fr.m19857b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0090, code lost:
        if (com.google.android.gms.internal.p148e.C4601fr.m19841a((java.lang.Object) r10, r6) == com.google.android.gms.internal.p148e.C4601fr.m19841a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a4, code lost:
        if (com.google.android.gms.internal.p148e.C4601fr.m19857b(r10, r6) == com.google.android.gms.internal.p148e.C4601fr.m19857b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b6, code lost:
        if (com.google.android.gms.internal.p148e.C4601fr.m19841a((java.lang.Object) r10, r6) == com.google.android.gms.internal.p148e.C4601fr.m19841a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c8, code lost:
        if (com.google.android.gms.internal.p148e.C4601fr.m19841a((java.lang.Object) r10, r6) == com.google.android.gms.internal.p148e.C4601fr.m19841a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00da, code lost:
        if (com.google.android.gms.internal.p148e.C4601fr.m19841a((java.lang.Object) r10, r6) == com.google.android.gms.internal.p148e.C4601fr.m19841a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f0, code lost:
        if (com.google.android.gms.internal.p148e.C4573ev.m19696a(com.google.android.gms.internal.p148e.C4601fr.m19874f(r10, r6), com.google.android.gms.internal.p148e.C4601fr.m19874f(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0106, code lost:
        if (com.google.android.gms.internal.p148e.C4573ev.m19696a(com.google.android.gms.internal.p148e.C4601fr.m19874f(r10, r6), com.google.android.gms.internal.p148e.C4601fr.m19874f(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x011c, code lost:
        if (com.google.android.gms.internal.p148e.C4573ev.m19696a(com.google.android.gms.internal.p148e.C4601fr.m19874f(r10, r6), com.google.android.gms.internal.p148e.C4601fr.m19874f(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012e, code lost:
        if (com.google.android.gms.internal.p148e.C4601fr.m19865c(r10, r6) == com.google.android.gms.internal.p148e.C4601fr.m19865c(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0140, code lost:
        if (com.google.android.gms.internal.p148e.C4601fr.m19841a((java.lang.Object) r10, r6) == com.google.android.gms.internal.p148e.C4601fr.m19841a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0154, code lost:
        if (com.google.android.gms.internal.p148e.C4601fr.m19857b(r10, r6) == com.google.android.gms.internal.p148e.C4601fr.m19857b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0165, code lost:
        if (com.google.android.gms.internal.p148e.C4601fr.m19841a((java.lang.Object) r10, r6) == com.google.android.gms.internal.p148e.C4601fr.m19841a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0178, code lost:
        if (com.google.android.gms.internal.p148e.C4601fr.m19857b(r10, r6) == com.google.android.gms.internal.p148e.C4601fr.m19857b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x018b, code lost:
        if (com.google.android.gms.internal.p148e.C4601fr.m19857b(r10, r6) == com.google.android.gms.internal.p148e.C4601fr.m19857b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01a4, code lost:
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.p148e.C4601fr.m19866d(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.p148e.C4601fr.m19866d(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01bf, code lost:
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.p148e.C4601fr.m19871e(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.p148e.C4601fr.m19871e(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01c1, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (com.google.android.gms.internal.p148e.C4573ev.m19696a(com.google.android.gms.internal.p148e.C4601fr.m19874f(r10, r6), com.google.android.gms.internal.p148e.C4601fr.m19874f(r11, r6)) != false) goto L_0x01c2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo16688a(T r10, T r11) {
        /*
            r9 = this;
            int[] r0 = r9.f14911c
            r1 = 0
            int r0 = r0.length
            r2 = r1
        L_0x0005:
            r3 = 1
            if (r2 >= r0) goto L_0x01c9
            int r4 = r9.m19585d(r2)
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r4 & r5
            long r6 = (long) r6
            r8 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r8
            int r4 = r4 >>> 20
            switch(r4) {
                case 0: goto L_0x01a7;
                case 1: goto L_0x018e;
                case 2: goto L_0x017b;
                case 3: goto L_0x0168;
                case 4: goto L_0x0157;
                case 5: goto L_0x0144;
                case 6: goto L_0x0132;
                case 7: goto L_0x0120;
                case 8: goto L_0x010a;
                case 9: goto L_0x00f4;
                case 10: goto L_0x00de;
                case 11: goto L_0x00cc;
                case 12: goto L_0x00ba;
                case 13: goto L_0x00a8;
                case 14: goto L_0x0094;
                case 15: goto L_0x0082;
                case 16: goto L_0x006e;
                case 17: goto L_0x0058;
                case 18: goto L_0x004a;
                case 19: goto L_0x004a;
                case 20: goto L_0x004a;
                case 21: goto L_0x004a;
                case 22: goto L_0x004a;
                case 23: goto L_0x004a;
                case 24: goto L_0x004a;
                case 25: goto L_0x004a;
                case 26: goto L_0x004a;
                case 27: goto L_0x004a;
                case 28: goto L_0x004a;
                case 29: goto L_0x004a;
                case 30: goto L_0x004a;
                case 31: goto L_0x004a;
                case 32: goto L_0x004a;
                case 33: goto L_0x004a;
                case 34: goto L_0x004a;
                case 35: goto L_0x004a;
                case 36: goto L_0x004a;
                case 37: goto L_0x004a;
                case 38: goto L_0x004a;
                case 39: goto L_0x004a;
                case 40: goto L_0x004a;
                case 41: goto L_0x004a;
                case 42: goto L_0x004a;
                case 43: goto L_0x004a;
                case 44: goto L_0x004a;
                case 45: goto L_0x004a;
                case 46: goto L_0x004a;
                case 47: goto L_0x004a;
                case 48: goto L_0x004a;
                case 49: goto L_0x004a;
                case 50: goto L_0x003c;
                case 51: goto L_0x001c;
                case 52: goto L_0x001c;
                case 53: goto L_0x001c;
                case 54: goto L_0x001c;
                case 55: goto L_0x001c;
                case 56: goto L_0x001c;
                case 57: goto L_0x001c;
                case 58: goto L_0x001c;
                case 59: goto L_0x001c;
                case 60: goto L_0x001c;
                case 61: goto L_0x001c;
                case 62: goto L_0x001c;
                case 63: goto L_0x001c;
                case 64: goto L_0x001c;
                case 65: goto L_0x001c;
                case 66: goto L_0x001c;
                case 67: goto L_0x001c;
                case 68: goto L_0x001c;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x01c2
        L_0x001c:
            int r4 = r9.m19587e(r2)
            r4 = r4 & r5
            long r4 = (long) r4
            int r8 = com.google.android.gms.internal.p148e.C4601fr.m19841a(r10, r4)
            int r4 = com.google.android.gms.internal.p148e.C4601fr.m19841a(r11, r4)
            if (r8 != r4) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r11, r6)
            boolean r4 = com.google.android.gms.internal.p148e.C4573ev.m19696a(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x003c:
            java.lang.Object r3 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r10, r6)
            java.lang.Object r4 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r11, r6)
            boolean r3 = com.google.android.gms.internal.p148e.C4573ev.m19696a(r3, r4)
            goto L_0x01c2
        L_0x004a:
            java.lang.Object r3 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r10, r6)
            java.lang.Object r4 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r11, r6)
            boolean r3 = com.google.android.gms.internal.p148e.C4573ev.m19696a(r3, r4)
            goto L_0x01c2
        L_0x0058:
            boolean r4 = r9.m19584c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r11, r6)
            boolean r4 = com.google.android.gms.internal.p148e.C4573ev.m19696a(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x006e:
            boolean r4 = r9.m19584c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.p148e.C4601fr.m19857b(r10, r6)
            long r6 = com.google.android.gms.internal.p148e.C4601fr.m19857b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0082:
            boolean r4 = r9.m19584c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.p148e.C4601fr.m19841a(r10, r6)
            int r5 = com.google.android.gms.internal.p148e.C4601fr.m19841a(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0094:
            boolean r4 = r9.m19584c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.p148e.C4601fr.m19857b(r10, r6)
            long r6 = com.google.android.gms.internal.p148e.C4601fr.m19857b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x00a8:
            boolean r4 = r9.m19584c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.p148e.C4601fr.m19841a(r10, r6)
            int r5 = com.google.android.gms.internal.p148e.C4601fr.m19841a(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00ba:
            boolean r4 = r9.m19584c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.p148e.C4601fr.m19841a(r10, r6)
            int r5 = com.google.android.gms.internal.p148e.C4601fr.m19841a(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00cc:
            boolean r4 = r9.m19584c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.p148e.C4601fr.m19841a(r10, r6)
            int r5 = com.google.android.gms.internal.p148e.C4601fr.m19841a(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00de:
            boolean r4 = r9.m19584c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r11, r6)
            boolean r4 = com.google.android.gms.internal.p148e.C4573ev.m19696a(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x00f4:
            boolean r4 = r9.m19584c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r11, r6)
            boolean r4 = com.google.android.gms.internal.p148e.C4573ev.m19696a(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x010a:
            boolean r4 = r9.m19584c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r11, r6)
            boolean r4 = com.google.android.gms.internal.p148e.C4573ev.m19696a(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0120:
            boolean r4 = r9.m19584c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            boolean r4 = com.google.android.gms.internal.p148e.C4601fr.m19865c(r10, r6)
            boolean r5 = com.google.android.gms.internal.p148e.C4601fr.m19865c(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0132:
            boolean r4 = r9.m19584c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.p148e.C4601fr.m19841a(r10, r6)
            int r5 = com.google.android.gms.internal.p148e.C4601fr.m19841a(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0144:
            boolean r4 = r9.m19584c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.p148e.C4601fr.m19857b(r10, r6)
            long r6 = com.google.android.gms.internal.p148e.C4601fr.m19857b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0157:
            boolean r4 = r9.m19584c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.p148e.C4601fr.m19841a(r10, r6)
            int r5 = com.google.android.gms.internal.p148e.C4601fr.m19841a(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0168:
            boolean r4 = r9.m19584c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.p148e.C4601fr.m19857b(r10, r6)
            long r6 = com.google.android.gms.internal.p148e.C4601fr.m19857b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x017b:
            boolean r4 = r9.m19584c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.p148e.C4601fr.m19857b(r10, r6)
            long r6 = com.google.android.gms.internal.p148e.C4601fr.m19857b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x018e:
            boolean r4 = r9.m19584c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            float r4 = com.google.android.gms.internal.p148e.C4601fr.m19866d(r10, r6)
            int r4 = java.lang.Float.floatToIntBits(r4)
            float r5 = com.google.android.gms.internal.p148e.C4601fr.m19866d(r11, r6)
            int r5 = java.lang.Float.floatToIntBits(r5)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x01a7:
            boolean r4 = r9.m19584c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            double r4 = com.google.android.gms.internal.p148e.C4601fr.m19871e(r10, r6)
            long r4 = java.lang.Double.doubleToLongBits(r4)
            double r6 = com.google.android.gms.internal.p148e.C4601fr.m19871e(r11, r6)
            long r6 = java.lang.Double.doubleToLongBits(r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
        L_0x01c1:
            r3 = r1
        L_0x01c2:
            if (r3 != 0) goto L_0x01c5
            return r1
        L_0x01c5:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x01c9:
            com.google.android.gms.internal.e.fl<?, ?> r0 = r9.f14925q
            java.lang.Object r0 = r0.mo16755b(r10)
            com.google.android.gms.internal.e.fl<?, ?> r2 = r9.f14925q
            java.lang.Object r2 = r2.mo16755b(r11)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01dc
            return r1
        L_0x01dc:
            boolean r0 = r9.f14916h
            if (r0 == 0) goto L_0x01f1
            com.google.android.gms.internal.e.ci<?> r0 = r9.f14926r
            com.google.android.gms.internal.e.cl r10 = r0.mo16570a(r10)
            com.google.android.gms.internal.e.ci<?> r0 = r9.f14926r
            com.google.android.gms.internal.e.cl r11 = r0.mo16570a(r11)
            boolean r10 = r10.equals(r11)
            return r10
        L_0x01f1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p148e.C4558eg.mo16688a(java.lang.Object, java.lang.Object):boolean");
    }

    /* renamed from: a */
    public final int mo16684a(T t) {
        int length = this.f14911c.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2 += 3) {
            int d = m19585d(i2);
            int i3 = this.f14911c[i2];
            long j = (long) (1048575 & d);
            int i4 = 37;
            switch ((d & 267386880) >>> 20) {
                case 0:
                    i = (i * 53) + C4520cw.m19444a(Double.doubleToLongBits(C4601fr.m19871e(t, j)));
                    break;
                case 1:
                    i = (i * 53) + Float.floatToIntBits(C4601fr.m19866d(t, j));
                    break;
                case 2:
                    i = (i * 53) + C4520cw.m19444a(C4601fr.m19857b(t, j));
                    break;
                case 3:
                    i = (i * 53) + C4520cw.m19444a(C4601fr.m19857b(t, j));
                    break;
                case 4:
                    i = (i * 53) + C4601fr.m19841a((Object) t, j);
                    break;
                case 5:
                    i = (i * 53) + C4520cw.m19444a(C4601fr.m19857b(t, j));
                    break;
                case 6:
                    i = (i * 53) + C4601fr.m19841a((Object) t, j);
                    break;
                case 7:
                    i = (i * 53) + C4520cw.m19445a(C4601fr.m19865c(t, j));
                    break;
                case 8:
                    i = (i * 53) + ((String) C4601fr.m19874f(t, j)).hashCode();
                    break;
                case 9:
                    Object f = C4601fr.m19874f(t, j);
                    if (f != null) {
                        i4 = f.hashCode();
                    }
                    i = (i * 53) + i4;
                    break;
                case 10:
                    i = (i * 53) + C4601fr.m19874f(t, j).hashCode();
                    break;
                case 11:
                    i = (i * 53) + C4601fr.m19841a((Object) t, j);
                    break;
                case 12:
                    i = (i * 53) + C4601fr.m19841a((Object) t, j);
                    break;
                case 13:
                    i = (i * 53) + C4601fr.m19841a((Object) t, j);
                    break;
                case 14:
                    i = (i * 53) + C4520cw.m19444a(C4601fr.m19857b(t, j));
                    break;
                case 15:
                    i = (i * 53) + C4601fr.m19841a((Object) t, j);
                    break;
                case 16:
                    i = (i * 53) + C4520cw.m19444a(C4601fr.m19857b(t, j));
                    break;
                case 17:
                    Object f2 = C4601fr.m19874f(t, j);
                    if (f2 != null) {
                        i4 = f2.hashCode();
                    }
                    i = (i * 53) + i4;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = (i * 53) + C4601fr.m19874f(t, j).hashCode();
                    break;
                case 50:
                    i = (i * 53) + C4601fr.m19874f(t, j).hashCode();
                    break;
                case 51:
                    if (!m19573a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + C4520cw.m19444a(Double.doubleToLongBits(m19576b(t, j)));
                        break;
                    }
                case 52:
                    if (!m19573a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + Float.floatToIntBits(m19582c(t, j));
                        break;
                    }
                case 53:
                    if (!m19573a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + C4520cw.m19444a(m19588e(t, j));
                        break;
                    }
                case 54:
                    if (!m19573a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + C4520cw.m19444a(m19588e(t, j));
                        break;
                    }
                case 55:
                    if (!m19573a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + m19586d(t, j);
                        break;
                    }
                case 56:
                    if (!m19573a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + C4520cw.m19444a(m19588e(t, j));
                        break;
                    }
                case 57:
                    if (!m19573a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + m19586d(t, j);
                        break;
                    }
                case 58:
                    if (!m19573a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + C4520cw.m19445a(m19590f(t, j));
                        break;
                    }
                case 59:
                    if (!m19573a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + ((String) C4601fr.m19874f(t, j)).hashCode();
                        break;
                    }
                case 60:
                    if (!m19573a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + C4601fr.m19874f(t, j).hashCode();
                        break;
                    }
                case 61:
                    if (!m19573a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + C4601fr.m19874f(t, j).hashCode();
                        break;
                    }
                case 62:
                    if (!m19573a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + m19586d(t, j);
                        break;
                    }
                case 63:
                    if (!m19573a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + m19586d(t, j);
                        break;
                    }
                case 64:
                    if (!m19573a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + m19586d(t, j);
                        break;
                    }
                case 65:
                    if (!m19573a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + C4520cw.m19444a(m19588e(t, j));
                        break;
                    }
                case 66:
                    if (!m19573a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + m19586d(t, j);
                        break;
                    }
                case 67:
                    if (!m19573a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + C4520cw.m19444a(m19588e(t, j));
                        break;
                    }
                case 68:
                    if (!m19573a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + C4601fr.m19874f(t, j).hashCode();
                        break;
                    }
            }
        }
        int hashCode = (i * 53) + this.f14925q.mo16755b(t).hashCode();
        return this.f14916h ? (hashCode * 53) + this.f14926r.mo16570a((Object) t).hashCode() : hashCode;
    }

    /* renamed from: b */
    public final void mo16690b(T t, T t2) {
        if (t2 == null) {
            throw new NullPointerException();
        }
        for (int i = 0; i < this.f14911c.length; i += 3) {
            int d = m19585d(i);
            long j = (long) (1048575 & d);
            int i2 = this.f14911c[i];
            switch ((d & 267386880) >>> 20) {
                case 0:
                    if (!m19572a(t2, i)) {
                        break;
                    } else {
                        C4601fr.m19847a((Object) t, j, C4601fr.m19871e(t2, j));
                        m19578b(t, i);
                        break;
                    }
                case 1:
                    if (!m19572a(t2, i)) {
                        break;
                    } else {
                        C4601fr.m19848a((Object) t, j, C4601fr.m19866d(t2, j));
                        m19578b(t, i);
                        break;
                    }
                case 2:
                    if (!m19572a(t2, i)) {
                        break;
                    } else {
                        C4601fr.m19850a((Object) t, j, C4601fr.m19857b(t2, j));
                        m19578b(t, i);
                        break;
                    }
                case 3:
                    if (!m19572a(t2, i)) {
                        break;
                    } else {
                        C4601fr.m19850a((Object) t, j, C4601fr.m19857b(t2, j));
                        m19578b(t, i);
                        break;
                    }
                case 4:
                    if (!m19572a(t2, i)) {
                        break;
                    } else {
                        C4601fr.m19849a((Object) t, j, C4601fr.m19841a((Object) t2, j));
                        m19578b(t, i);
                        break;
                    }
                case 5:
                    if (!m19572a(t2, i)) {
                        break;
                    } else {
                        C4601fr.m19850a((Object) t, j, C4601fr.m19857b(t2, j));
                        m19578b(t, i);
                        break;
                    }
                case 6:
                    if (!m19572a(t2, i)) {
                        break;
                    } else {
                        C4601fr.m19849a((Object) t, j, C4601fr.m19841a((Object) t2, j));
                        m19578b(t, i);
                        break;
                    }
                case 7:
                    if (!m19572a(t2, i)) {
                        break;
                    } else {
                        C4601fr.m19852a((Object) t, j, C4601fr.m19865c(t2, j));
                        m19578b(t, i);
                        break;
                    }
                case 8:
                    if (!m19572a(t2, i)) {
                        break;
                    } else {
                        C4601fr.m19851a((Object) t, j, C4601fr.m19874f(t2, j));
                        m19578b(t, i);
                        break;
                    }
                case 9:
                    m19571a(t, t2, i);
                    break;
                case 10:
                    if (!m19572a(t2, i)) {
                        break;
                    } else {
                        C4601fr.m19851a((Object) t, j, C4601fr.m19874f(t2, j));
                        m19578b(t, i);
                        break;
                    }
                case 11:
                    if (!m19572a(t2, i)) {
                        break;
                    } else {
                        C4601fr.m19849a((Object) t, j, C4601fr.m19841a((Object) t2, j));
                        m19578b(t, i);
                        break;
                    }
                case 12:
                    if (!m19572a(t2, i)) {
                        break;
                    } else {
                        C4601fr.m19849a((Object) t, j, C4601fr.m19841a((Object) t2, j));
                        m19578b(t, i);
                        break;
                    }
                case 13:
                    if (!m19572a(t2, i)) {
                        break;
                    } else {
                        C4601fr.m19849a((Object) t, j, C4601fr.m19841a((Object) t2, j));
                        m19578b(t, i);
                        break;
                    }
                case 14:
                    if (!m19572a(t2, i)) {
                        break;
                    } else {
                        C4601fr.m19850a((Object) t, j, C4601fr.m19857b(t2, j));
                        m19578b(t, i);
                        break;
                    }
                case 15:
                    if (!m19572a(t2, i)) {
                        break;
                    } else {
                        C4601fr.m19849a((Object) t, j, C4601fr.m19841a((Object) t2, j));
                        m19578b(t, i);
                        break;
                    }
                case 16:
                    if (!m19572a(t2, i)) {
                        break;
                    } else {
                        C4601fr.m19850a((Object) t, j, C4601fr.m19857b(t2, j));
                        m19578b(t, i);
                        break;
                    }
                case 17:
                    m19571a(t, t2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f14924p.mo16654a(t, t2, j);
                    break;
                case 50:
                    C4573ev.m19693a(this.f14927s, t, t2, j);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!m19573a(t2, i2, i)) {
                        break;
                    } else {
                        C4601fr.m19851a((Object) t, j, C4601fr.m19874f(t2, j));
                        m19579b(t, i2, i);
                        break;
                    }
                case 60:
                    m19581b(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!m19573a(t2, i2, i)) {
                        break;
                    } else {
                        C4601fr.m19851a((Object) t, j, C4601fr.m19874f(t2, j));
                        m19579b(t, i2, i);
                        break;
                    }
                case 68:
                    m19581b(t, t2, i);
                    break;
            }
        }
        if (!this.f14918j) {
            C4573ev.m19694a(this.f14925q, t, t2);
            if (this.f14916h) {
                C4573ev.m19692a(this.f14926r, t, t2);
            }
        }
    }

    /* renamed from: a */
    private final void m19571a(T t, T t2, int i) {
        long d = (long) (m19585d(i) & 1048575);
        if (m19572a(t2, i)) {
            Object f = C4601fr.m19874f(t, d);
            Object f2 = C4601fr.m19874f(t2, d);
            if (f == null || f2 == null) {
                if (f2 != null) {
                    C4601fr.m19851a((Object) t, d, f2);
                    m19578b(t, i);
                }
                return;
            }
            C4601fr.m19851a((Object) t, d, C4520cw.m19447a(f, f2));
            m19578b(t, i);
        }
    }

    /* renamed from: b */
    private final void m19581b(T t, T t2, int i) {
        int d = m19585d(i);
        int i2 = this.f14911c[i];
        long j = (long) (d & 1048575);
        if (m19573a(t2, i2, i)) {
            Object f = C4601fr.m19874f(t, j);
            Object f2 = C4601fr.m19874f(t2, j);
            if (f == null || f2 == null) {
                if (f2 != null) {
                    C4601fr.m19851a((Object) t, j, f2);
                    m19579b(t, i2, i);
                }
                return;
            }
            C4601fr.m19851a((Object) t, j, C4520cw.m19447a(f, f2));
            m19579b(t, i2, i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:410:0x09bd, code lost:
        r6 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x09cc, code lost:
        r9 = false;
        r18 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:473:0x0af0, code lost:
        r3 = r3 + 3;
        r11 = r6;
        r6 = r9;
        r9 = r18;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo16689b(T r22) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            boolean r2 = r0.f14918j
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            r6 = 0
            r7 = 1
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r9 = 0
            r11 = 0
            if (r2 == 0) goto L_0x055f
            sun.misc.Unsafe r2 = f14910b
            r12 = r11
            r13 = r12
        L_0x0016:
            int[] r14 = r0.f14911c
            int r14 = r14.length
            if (r12 >= r14) goto L_0x0557
            int r14 = r0.m19585d(r12)
            r15 = r14 & r3
            int r15 = r15 >>> 20
            int[] r3 = r0.f14911c
            r3 = r3[r12]
            r14 = r14 & r8
            long r4 = (long) r14
            com.google.android.gms.internal.e.co r14 = com.google.android.gms.internal.p148e.C4507co.DOUBLE_LIST_PACKED
            int r14 = r14.mo16598a()
            if (r15 < r14) goto L_0x0041
            com.google.android.gms.internal.e.co r14 = com.google.android.gms.internal.p148e.C4507co.SINT64_LIST_PACKED
            int r14 = r14.mo16598a()
            if (r15 > r14) goto L_0x0041
            int[] r14 = r0.f14911c
            int r17 = r12 + 2
            r14 = r14[r17]
            r14 = r14 & r8
            goto L_0x0042
        L_0x0041:
            r14 = r11
        L_0x0042:
            switch(r15) {
                case 0: goto L_0x0544;
                case 1: goto L_0x0538;
                case 2: goto L_0x0528;
                case 3: goto L_0x0518;
                case 4: goto L_0x0508;
                case 5: goto L_0x04fc;
                case 6: goto L_0x04f0;
                case 7: goto L_0x04e4;
                case 8: goto L_0x04c4;
                case 9: goto L_0x04af;
                case 10: goto L_0x049c;
                case 11: goto L_0x048b;
                case 12: goto L_0x047a;
                case 13: goto L_0x046d;
                case 14: goto L_0x0460;
                case 15: goto L_0x044f;
                case 16: goto L_0x043e;
                case 17: goto L_0x0427;
                case 18: goto L_0x041c;
                case 19: goto L_0x0411;
                case 20: goto L_0x0406;
                case 21: goto L_0x03fb;
                case 22: goto L_0x03f0;
                case 23: goto L_0x03e5;
                case 24: goto L_0x03da;
                case 25: goto L_0x03cf;
                case 26: goto L_0x03c4;
                case 27: goto L_0x03b5;
                case 28: goto L_0x03aa;
                case 29: goto L_0x039f;
                case 30: goto L_0x0394;
                case 31: goto L_0x0389;
                case 32: goto L_0x037e;
                case 33: goto L_0x0373;
                case 34: goto L_0x0368;
                case 35: goto L_0x0347;
                case 36: goto L_0x0326;
                case 37: goto L_0x0305;
                case 38: goto L_0x02e4;
                case 39: goto L_0x02c3;
                case 40: goto L_0x02a2;
                case 41: goto L_0x0281;
                case 42: goto L_0x0260;
                case 43: goto L_0x023f;
                case 44: goto L_0x021e;
                case 45: goto L_0x01fd;
                case 46: goto L_0x01dc;
                case 47: goto L_0x01bb;
                case 48: goto L_0x019a;
                case 49: goto L_0x018b;
                case 50: goto L_0x017a;
                case 51: goto L_0x016b;
                case 52: goto L_0x015e;
                case 53: goto L_0x014d;
                case 54: goto L_0x013c;
                case 55: goto L_0x012b;
                case 56: goto L_0x011e;
                case 57: goto L_0x0111;
                case 58: goto L_0x0104;
                case 59: goto L_0x00e4;
                case 60: goto L_0x00cf;
                case 61: goto L_0x00bc;
                case 62: goto L_0x00ab;
                case 63: goto L_0x009a;
                case 64: goto L_0x008d;
                case 65: goto L_0x0080;
                case 66: goto L_0x006f;
                case 67: goto L_0x005e;
                case 68: goto L_0x0047;
                default: goto L_0x0045;
            }
        L_0x0045:
            goto L_0x0551
        L_0x0047:
            boolean r14 = r0.m19573a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x0551
            java.lang.Object r4 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r1, r4)
            com.google.android.gms.internal.e.ec r4 = (com.google.android.gms.internal.p148e.C4554ec) r4
            com.google.android.gms.internal.e.et r5 = r0.m19562a(r12)
            int r3 = com.google.android.gms.internal.p148e.C4487ca.m19132c(r3, r4, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x005e:
            boolean r14 = r0.m19573a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x0551
            long r4 = m19588e(r1, r4)
            int r3 = com.google.android.gms.internal.p148e.C4487ca.m19144f(r3, r4)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x006f:
            boolean r14 = r0.m19573a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x0551
            int r4 = m19586d(r1, r4)
            int r3 = com.google.android.gms.internal.p148e.C4487ca.m19151h(r3, r4)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0080:
            boolean r4 = r0.m19573a((T) r1, r3, r12)
            if (r4 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.p148e.C4487ca.m19152h(r3, r9)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x008d:
            boolean r4 = r0.m19573a((T) r1, r3, r12)
            if (r4 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.p148e.C4487ca.m19158j(r3, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x009a:
            boolean r14 = r0.m19573a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x0551
            int r4 = m19586d(r1, r4)
            int r3 = com.google.android.gms.internal.p148e.C4487ca.m19160k(r3, r4)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x00ab:
            boolean r14 = r0.m19573a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x0551
            int r4 = m19586d(r1, r4)
            int r3 = com.google.android.gms.internal.p148e.C4487ca.m19147g(r3, r4)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x00bc:
            boolean r14 = r0.m19573a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x0551
            java.lang.Object r4 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r1, r4)
            com.google.android.gms.internal.e.bj r4 = (com.google.android.gms.internal.p148e.C4469bj) r4
            int r3 = com.google.android.gms.internal.p148e.C4487ca.m19130c(r3, r4)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x00cf:
            boolean r14 = r0.m19573a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x0551
            java.lang.Object r4 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r1, r4)
            com.google.android.gms.internal.e.et r5 = r0.m19562a(r12)
            int r3 = com.google.android.gms.internal.p148e.C4573ev.m19680a(r3, r4, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x00e4:
            boolean r14 = r0.m19573a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x0551
            java.lang.Object r4 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r1, r4)
            boolean r5 = r4 instanceof com.google.android.gms.internal.p148e.C4469bj
            if (r5 == 0) goto L_0x00fb
            com.google.android.gms.internal.e.bj r4 = (com.google.android.gms.internal.p148e.C4469bj) r4
            int r3 = com.google.android.gms.internal.p148e.C4487ca.m19130c(r3, r4)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x00fb:
            java.lang.String r4 = (java.lang.String) r4
            int r3 = com.google.android.gms.internal.p148e.C4487ca.m19122b(r3, r4)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0104:
            boolean r4 = r0.m19573a((T) r1, r3, r12)
            if (r4 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.p148e.C4487ca.m19123b(r3, r7)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0111:
            boolean r4 = r0.m19573a((T) r1, r3, r12)
            if (r4 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.p148e.C4487ca.m19155i(r3, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x011e:
            boolean r4 = r0.m19573a((T) r1, r3, r12)
            if (r4 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.p148e.C4487ca.m19148g(r3, r9)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x012b:
            boolean r14 = r0.m19573a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x0551
            int r4 = m19586d(r1, r4)
            int r3 = com.google.android.gms.internal.p148e.C4487ca.m19143f(r3, r4)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x013c:
            boolean r14 = r0.m19573a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x0551
            long r4 = m19588e(r1, r4)
            int r3 = com.google.android.gms.internal.p148e.C4487ca.m19140e(r3, r4)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x014d:
            boolean r14 = r0.m19573a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x0551
            long r4 = m19588e(r1, r4)
            int r3 = com.google.android.gms.internal.p148e.C4487ca.m19135d(r3, r4)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x015e:
            boolean r4 = r0.m19573a((T) r1, r3, r12)
            if (r4 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.p148e.C4487ca.m19119b(r3, r6)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x016b:
            boolean r4 = r0.m19573a((T) r1, r3, r12)
            if (r4 == 0) goto L_0x0551
            r4 = 0
            int r3 = com.google.android.gms.internal.p148e.C4487ca.m19118b(r3, r4)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x017a:
            com.google.android.gms.internal.e.dx r14 = r0.f14927s
            java.lang.Object r4 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r1, r4)
            java.lang.Object r5 = r0.m19577b(r12)
            int r3 = r14.mo16673a(r3, r4, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x018b:
            java.util.List r4 = m19566a(r1, r4)
            com.google.android.gms.internal.e.et r5 = r0.m19562a(r12)
            int r3 = com.google.android.gms.internal.p148e.C4573ev.m19698b(r3, r4, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x019a:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p148e.C4573ev.m19706c(r4)
            if (r4 <= 0) goto L_0x0551
            boolean r5 = r0.f14919k
            if (r5 == 0) goto L_0x01ae
            long r14 = (long) r14
            r2.putInt(r1, r14, r4)
        L_0x01ae:
            int r3 = com.google.android.gms.internal.p148e.C4487ca.m19139e(r3)
            int r5 = com.google.android.gms.internal.p148e.C4487ca.m19146g(r4)
            int r3 = r3 + r5
            int r3 = r3 + r4
            int r13 = r13 + r3
            goto L_0x0551
        L_0x01bb:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p148e.C4573ev.m19721g(r4)
            if (r4 <= 0) goto L_0x0551
            boolean r5 = r0.f14919k
            if (r5 == 0) goto L_0x01cf
            long r14 = (long) r14
            r2.putInt(r1, r14, r4)
        L_0x01cf:
            int r3 = com.google.android.gms.internal.p148e.C4487ca.m19139e(r3)
            int r5 = com.google.android.gms.internal.p148e.C4487ca.m19146g(r4)
            int r3 = r3 + r5
            int r3 = r3 + r4
            int r13 = r13 + r3
            goto L_0x0551
        L_0x01dc:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p148e.C4573ev.m19727i(r4)
            if (r4 <= 0) goto L_0x0551
            boolean r5 = r0.f14919k
            if (r5 == 0) goto L_0x01f0
            long r14 = (long) r14
            r2.putInt(r1, r14, r4)
        L_0x01f0:
            int r3 = com.google.android.gms.internal.p148e.C4487ca.m19139e(r3)
            int r5 = com.google.android.gms.internal.p148e.C4487ca.m19146g(r4)
            int r3 = r3 + r5
            int r3 = r3 + r4
            int r13 = r13 + r3
            goto L_0x0551
        L_0x01fd:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p148e.C4573ev.m19724h(r4)
            if (r4 <= 0) goto L_0x0551
            boolean r5 = r0.f14919k
            if (r5 == 0) goto L_0x0211
            long r14 = (long) r14
            r2.putInt(r1, r14, r4)
        L_0x0211:
            int r3 = com.google.android.gms.internal.p148e.C4487ca.m19139e(r3)
            int r5 = com.google.android.gms.internal.p148e.C4487ca.m19146g(r4)
            int r3 = r3 + r5
            int r3 = r3 + r4
            int r13 = r13 + r3
            goto L_0x0551
        L_0x021e:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p148e.C4573ev.m19710d(r4)
            if (r4 <= 0) goto L_0x0551
            boolean r5 = r0.f14919k
            if (r5 == 0) goto L_0x0232
            long r14 = (long) r14
            r2.putInt(r1, r14, r4)
        L_0x0232:
            int r3 = com.google.android.gms.internal.p148e.C4487ca.m19139e(r3)
            int r5 = com.google.android.gms.internal.p148e.C4487ca.m19146g(r4)
            int r3 = r3 + r5
            int r3 = r3 + r4
            int r13 = r13 + r3
            goto L_0x0551
        L_0x023f:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p148e.C4573ev.m19718f(r4)
            if (r4 <= 0) goto L_0x0551
            boolean r5 = r0.f14919k
            if (r5 == 0) goto L_0x0253
            long r14 = (long) r14
            r2.putInt(r1, r14, r4)
        L_0x0253:
            int r3 = com.google.android.gms.internal.p148e.C4487ca.m19139e(r3)
            int r5 = com.google.android.gms.internal.p148e.C4487ca.m19146g(r4)
            int r3 = r3 + r5
            int r3 = r3 + r4
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0260:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p148e.C4573ev.m19730j(r4)
            if (r4 <= 0) goto L_0x0551
            boolean r5 = r0.f14919k
            if (r5 == 0) goto L_0x0274
            long r14 = (long) r14
            r2.putInt(r1, r14, r4)
        L_0x0274:
            int r3 = com.google.android.gms.internal.p148e.C4487ca.m19139e(r3)
            int r5 = com.google.android.gms.internal.p148e.C4487ca.m19146g(r4)
            int r3 = r3 + r5
            int r3 = r3 + r4
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0281:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p148e.C4573ev.m19724h(r4)
            if (r4 <= 0) goto L_0x0551
            boolean r5 = r0.f14919k
            if (r5 == 0) goto L_0x0295
            long r14 = (long) r14
            r2.putInt(r1, r14, r4)
        L_0x0295:
            int r3 = com.google.android.gms.internal.p148e.C4487ca.m19139e(r3)
            int r5 = com.google.android.gms.internal.p148e.C4487ca.m19146g(r4)
            int r3 = r3 + r5
            int r3 = r3 + r4
            int r13 = r13 + r3
            goto L_0x0551
        L_0x02a2:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p148e.C4573ev.m19727i(r4)
            if (r4 <= 0) goto L_0x0551
            boolean r5 = r0.f14919k
            if (r5 == 0) goto L_0x02b6
            long r14 = (long) r14
            r2.putInt(r1, r14, r4)
        L_0x02b6:
            int r3 = com.google.android.gms.internal.p148e.C4487ca.m19139e(r3)
            int r5 = com.google.android.gms.internal.p148e.C4487ca.m19146g(r4)
            int r3 = r3 + r5
            int r3 = r3 + r4
            int r13 = r13 + r3
            goto L_0x0551
        L_0x02c3:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p148e.C4573ev.m19714e(r4)
            if (r4 <= 0) goto L_0x0551
            boolean r5 = r0.f14919k
            if (r5 == 0) goto L_0x02d7
            long r14 = (long) r14
            r2.putInt(r1, r14, r4)
        L_0x02d7:
            int r3 = com.google.android.gms.internal.p148e.C4487ca.m19139e(r3)
            int r5 = com.google.android.gms.internal.p148e.C4487ca.m19146g(r4)
            int r3 = r3 + r5
            int r3 = r3 + r4
            int r13 = r13 + r3
            goto L_0x0551
        L_0x02e4:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p148e.C4573ev.m19700b(r4)
            if (r4 <= 0) goto L_0x0551
            boolean r5 = r0.f14919k
            if (r5 == 0) goto L_0x02f8
            long r14 = (long) r14
            r2.putInt(r1, r14, r4)
        L_0x02f8:
            int r3 = com.google.android.gms.internal.p148e.C4487ca.m19139e(r3)
            int r5 = com.google.android.gms.internal.p148e.C4487ca.m19146g(r4)
            int r3 = r3 + r5
            int r3 = r3 + r4
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0305:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p148e.C4573ev.m19684a(r4)
            if (r4 <= 0) goto L_0x0551
            boolean r5 = r0.f14919k
            if (r5 == 0) goto L_0x0319
            long r14 = (long) r14
            r2.putInt(r1, r14, r4)
        L_0x0319:
            int r3 = com.google.android.gms.internal.p148e.C4487ca.m19139e(r3)
            int r5 = com.google.android.gms.internal.p148e.C4487ca.m19146g(r4)
            int r3 = r3 + r5
            int r3 = r3 + r4
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0326:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p148e.C4573ev.m19724h(r4)
            if (r4 <= 0) goto L_0x0551
            boolean r5 = r0.f14919k
            if (r5 == 0) goto L_0x033a
            long r14 = (long) r14
            r2.putInt(r1, r14, r4)
        L_0x033a:
            int r3 = com.google.android.gms.internal.p148e.C4487ca.m19139e(r3)
            int r5 = com.google.android.gms.internal.p148e.C4487ca.m19146g(r4)
            int r3 = r3 + r5
            int r3 = r3 + r4
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0347:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p148e.C4573ev.m19727i(r4)
            if (r4 <= 0) goto L_0x0551
            boolean r5 = r0.f14919k
            if (r5 == 0) goto L_0x035b
            long r14 = (long) r14
            r2.putInt(r1, r14, r4)
        L_0x035b:
            int r3 = com.google.android.gms.internal.p148e.C4487ca.m19139e(r3)
            int r5 = com.google.android.gms.internal.p148e.C4487ca.m19146g(r4)
            int r3 = r3 + r5
            int r3 = r3 + r4
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0368:
            java.util.List r4 = m19566a(r1, r4)
            int r3 = com.google.android.gms.internal.p148e.C4573ev.m19705c(r3, r4, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0373:
            java.util.List r4 = m19566a(r1, r4)
            int r3 = com.google.android.gms.internal.p148e.C4573ev.m19720g(r3, r4, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x037e:
            java.util.List r4 = m19566a(r1, r4)
            int r3 = com.google.android.gms.internal.p148e.C4573ev.m19726i(r3, r4, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0389:
            java.util.List r4 = m19566a(r1, r4)
            int r3 = com.google.android.gms.internal.p148e.C4573ev.m19723h(r3, r4, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0394:
            java.util.List r4 = m19566a(r1, r4)
            int r3 = com.google.android.gms.internal.p148e.C4573ev.m19709d(r3, r4, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x039f:
            java.util.List r4 = m19566a(r1, r4)
            int r3 = com.google.android.gms.internal.p148e.C4573ev.m19717f(r3, r4, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x03aa:
            java.util.List r4 = m19566a(r1, r4)
            int r3 = com.google.android.gms.internal.p148e.C4573ev.m19697b(r3, r4)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x03b5:
            java.util.List r4 = m19566a(r1, r4)
            com.google.android.gms.internal.e.et r5 = r0.m19562a(r12)
            int r3 = com.google.android.gms.internal.p148e.C4573ev.m19682a(r3, r4, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x03c4:
            java.util.List r4 = m19566a(r1, r4)
            int r3 = com.google.android.gms.internal.p148e.C4573ev.m19681a(r3, r4)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x03cf:
            java.util.List r4 = m19566a(r1, r4)
            int r3 = com.google.android.gms.internal.p148e.C4573ev.m19729j(r3, r4, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x03da:
            java.util.List r4 = m19566a(r1, r4)
            int r3 = com.google.android.gms.internal.p148e.C4573ev.m19723h(r3, r4, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x03e5:
            java.util.List r4 = m19566a(r1, r4)
            int r3 = com.google.android.gms.internal.p148e.C4573ev.m19726i(r3, r4, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x03f0:
            java.util.List r4 = m19566a(r1, r4)
            int r3 = com.google.android.gms.internal.p148e.C4573ev.m19713e(r3, r4, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x03fb:
            java.util.List r4 = m19566a(r1, r4)
            int r3 = com.google.android.gms.internal.p148e.C4573ev.m19699b(r3, r4, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0406:
            java.util.List r4 = m19566a(r1, r4)
            int r3 = com.google.android.gms.internal.p148e.C4573ev.m19683a(r3, r4, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0411:
            java.util.List r4 = m19566a(r1, r4)
            int r3 = com.google.android.gms.internal.p148e.C4573ev.m19723h(r3, r4, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x041c:
            java.util.List r4 = m19566a(r1, r4)
            int r3 = com.google.android.gms.internal.p148e.C4573ev.m19726i(r3, r4, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0427:
            boolean r14 = r0.m19572a((T) r1, r12)
            if (r14 == 0) goto L_0x0551
            java.lang.Object r4 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r1, r4)
            com.google.android.gms.internal.e.ec r4 = (com.google.android.gms.internal.p148e.C4554ec) r4
            com.google.android.gms.internal.e.et r5 = r0.m19562a(r12)
            int r3 = com.google.android.gms.internal.p148e.C4487ca.m19132c(r3, r4, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x043e:
            boolean r14 = r0.m19572a((T) r1, r12)
            if (r14 == 0) goto L_0x0551
            long r4 = com.google.android.gms.internal.p148e.C4601fr.m19857b(r1, r4)
            int r3 = com.google.android.gms.internal.p148e.C4487ca.m19144f(r3, r4)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x044f:
            boolean r14 = r0.m19572a((T) r1, r12)
            if (r14 == 0) goto L_0x0551
            int r4 = com.google.android.gms.internal.p148e.C4601fr.m19841a(r1, r4)
            int r3 = com.google.android.gms.internal.p148e.C4487ca.m19151h(r3, r4)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0460:
            boolean r4 = r0.m19572a((T) r1, r12)
            if (r4 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.p148e.C4487ca.m19152h(r3, r9)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x046d:
            boolean r4 = r0.m19572a((T) r1, r12)
            if (r4 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.p148e.C4487ca.m19158j(r3, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x047a:
            boolean r14 = r0.m19572a((T) r1, r12)
            if (r14 == 0) goto L_0x0551
            int r4 = com.google.android.gms.internal.p148e.C4601fr.m19841a(r1, r4)
            int r3 = com.google.android.gms.internal.p148e.C4487ca.m19160k(r3, r4)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x048b:
            boolean r14 = r0.m19572a((T) r1, r12)
            if (r14 == 0) goto L_0x0551
            int r4 = com.google.android.gms.internal.p148e.C4601fr.m19841a(r1, r4)
            int r3 = com.google.android.gms.internal.p148e.C4487ca.m19147g(r3, r4)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x049c:
            boolean r14 = r0.m19572a((T) r1, r12)
            if (r14 == 0) goto L_0x0551
            java.lang.Object r4 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r1, r4)
            com.google.android.gms.internal.e.bj r4 = (com.google.android.gms.internal.p148e.C4469bj) r4
            int r3 = com.google.android.gms.internal.p148e.C4487ca.m19130c(r3, r4)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x04af:
            boolean r14 = r0.m19572a((T) r1, r12)
            if (r14 == 0) goto L_0x0551
            java.lang.Object r4 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r1, r4)
            com.google.android.gms.internal.e.et r5 = r0.m19562a(r12)
            int r3 = com.google.android.gms.internal.p148e.C4573ev.m19680a(r3, r4, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x04c4:
            boolean r14 = r0.m19572a((T) r1, r12)
            if (r14 == 0) goto L_0x0551
            java.lang.Object r4 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r1, r4)
            boolean r5 = r4 instanceof com.google.android.gms.internal.p148e.C4469bj
            if (r5 == 0) goto L_0x04db
            com.google.android.gms.internal.e.bj r4 = (com.google.android.gms.internal.p148e.C4469bj) r4
            int r3 = com.google.android.gms.internal.p148e.C4487ca.m19130c(r3, r4)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x04db:
            java.lang.String r4 = (java.lang.String) r4
            int r3 = com.google.android.gms.internal.p148e.C4487ca.m19122b(r3, r4)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x04e4:
            boolean r4 = r0.m19572a((T) r1, r12)
            if (r4 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.p148e.C4487ca.m19123b(r3, r7)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x04f0:
            boolean r4 = r0.m19572a((T) r1, r12)
            if (r4 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.p148e.C4487ca.m19155i(r3, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x04fc:
            boolean r4 = r0.m19572a((T) r1, r12)
            if (r4 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.p148e.C4487ca.m19148g(r3, r9)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0508:
            boolean r14 = r0.m19572a((T) r1, r12)
            if (r14 == 0) goto L_0x0551
            int r4 = com.google.android.gms.internal.p148e.C4601fr.m19841a(r1, r4)
            int r3 = com.google.android.gms.internal.p148e.C4487ca.m19143f(r3, r4)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0518:
            boolean r14 = r0.m19572a((T) r1, r12)
            if (r14 == 0) goto L_0x0551
            long r4 = com.google.android.gms.internal.p148e.C4601fr.m19857b(r1, r4)
            int r3 = com.google.android.gms.internal.p148e.C4487ca.m19140e(r3, r4)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0528:
            boolean r14 = r0.m19572a((T) r1, r12)
            if (r14 == 0) goto L_0x0551
            long r4 = com.google.android.gms.internal.p148e.C4601fr.m19857b(r1, r4)
            int r3 = com.google.android.gms.internal.p148e.C4487ca.m19135d(r3, r4)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0538:
            boolean r4 = r0.m19572a((T) r1, r12)
            if (r4 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.p148e.C4487ca.m19119b(r3, r6)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0544:
            boolean r4 = r0.m19572a((T) r1, r12)
            if (r4 == 0) goto L_0x0551
            r4 = 0
            int r3 = com.google.android.gms.internal.p148e.C4487ca.m19118b(r3, r4)
            int r13 = r13 + r3
        L_0x0551:
            int r12 = r12 + 3
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            goto L_0x0016
        L_0x0557:
            com.google.android.gms.internal.e.fl<?, ?> r2 = r0.f14925q
            int r1 = m19560a(r2, (T) r1)
            int r13 = r13 + r1
            return r13
        L_0x055f:
            sun.misc.Unsafe r2 = f14910b
            r3 = -1
            r5 = r3
            r3 = r11
            r4 = r3
            r12 = r4
        L_0x0566:
            int[] r13 = r0.f14911c
            int r13 = r13.length
            if (r3 >= r13) goto L_0x0af8
            int r13 = r0.m19585d(r3)
            int[] r14 = r0.f14911c
            r14 = r14[r3]
            r15 = 267386880(0xff00000, float:2.3665827E-29)
            r16 = r13 & r15
            int r15 = r16 >>> 20
            r6 = 17
            if (r15 > r6) goto L_0x0592
            int[] r6 = r0.f14911c
            int r16 = r3 + 2
            r6 = r6[r16]
            r11 = r6 & r8
            int r16 = r6 >>> 20
            int r16 = r7 << r16
            if (r11 == r5) goto L_0x05b3
            long r9 = (long) r11
            int r12 = r2.getInt(r1, r9)
            r5 = r11
            goto L_0x05b3
        L_0x0592:
            boolean r6 = r0.f14919k
            if (r6 == 0) goto L_0x05b0
            com.google.android.gms.internal.e.co r6 = com.google.android.gms.internal.p148e.C4507co.DOUBLE_LIST_PACKED
            int r6 = r6.mo16598a()
            if (r15 < r6) goto L_0x05b0
            com.google.android.gms.internal.e.co r6 = com.google.android.gms.internal.p148e.C4507co.SINT64_LIST_PACKED
            int r6 = r6.mo16598a()
            if (r15 > r6) goto L_0x05b0
            int[] r6 = r0.f14911c
            int r9 = r3 + 2
            r6 = r6[r9]
            r11 = r6 & r8
            r6 = r11
            goto L_0x05b1
        L_0x05b0:
            r6 = 0
        L_0x05b1:
            r16 = 0
        L_0x05b3:
            r9 = r13 & r8
            long r9 = (long) r9
            switch(r15) {
                case 0: goto L_0x0ae1;
                case 1: goto L_0x0ad1;
                case 2: goto L_0x0abf;
                case 3: goto L_0x0aae;
                case 4: goto L_0x0a9d;
                case 5: goto L_0x0a8e;
                case 6: goto L_0x0a82;
                case 7: goto L_0x0a77;
                case 8: goto L_0x0a59;
                case 9: goto L_0x0a46;
                case 10: goto L_0x0a36;
                case 11: goto L_0x0a28;
                case 12: goto L_0x0a1a;
                case 13: goto L_0x0a0f;
                case 14: goto L_0x0a03;
                case 15: goto L_0x09f5;
                case 16: goto L_0x09e7;
                case 17: goto L_0x09d3;
                case 18: goto L_0x09bf;
                case 19: goto L_0x09b1;
                case 20: goto L_0x09a4;
                case 21: goto L_0x0997;
                case 22: goto L_0x098a;
                case 23: goto L_0x097d;
                case 24: goto L_0x0970;
                case 25: goto L_0x0963;
                case 26: goto L_0x0957;
                case 27: goto L_0x0946;
                case 28: goto L_0x0939;
                case 29: goto L_0x092b;
                case 30: goto L_0x091d;
                case 31: goto L_0x090f;
                case 32: goto L_0x0901;
                case 33: goto L_0x08f3;
                case 34: goto L_0x08e5;
                case 35: goto L_0x08c4;
                case 36: goto L_0x08a3;
                case 37: goto L_0x0882;
                case 38: goto L_0x0861;
                case 39: goto L_0x0840;
                case 40: goto L_0x081f;
                case 41: goto L_0x07fe;
                case 42: goto L_0x07dd;
                case 43: goto L_0x07bc;
                case 44: goto L_0x079b;
                case 45: goto L_0x077a;
                case 46: goto L_0x0759;
                case 47: goto L_0x0738;
                case 48: goto L_0x0717;
                case 49: goto L_0x0706;
                case 50: goto L_0x06f5;
                case 51: goto L_0x06e6;
                case 52: goto L_0x06d8;
                case 53: goto L_0x06c7;
                case 54: goto L_0x06b6;
                case 55: goto L_0x06a5;
                case 56: goto L_0x0696;
                case 57: goto L_0x0688;
                case 58: goto L_0x067b;
                case 59: goto L_0x065b;
                case 60: goto L_0x0646;
                case 61: goto L_0x0633;
                case 62: goto L_0x0622;
                case 63: goto L_0x0611;
                case 64: goto L_0x0603;
                case 65: goto L_0x05f4;
                case 66: goto L_0x05e3;
                case 67: goto L_0x05d2;
                case 68: goto L_0x05bb;
                default: goto L_0x05b9;
            }
        L_0x05b9:
            goto L_0x09cb
        L_0x05bb:
            boolean r6 = r0.m19573a((T) r1, r14, r3)
            if (r6 == 0) goto L_0x09cb
            java.lang.Object r6 = r2.getObject(r1, r9)
            com.google.android.gms.internal.e.ec r6 = (com.google.android.gms.internal.p148e.C4554ec) r6
            com.google.android.gms.internal.e.et r9 = r0.m19562a(r3)
            int r6 = com.google.android.gms.internal.p148e.C4487ca.m19132c(r14, r6, r9)
            int r4 = r4 + r6
            goto L_0x09cb
        L_0x05d2:
            boolean r6 = r0.m19573a((T) r1, r14, r3)
            if (r6 == 0) goto L_0x09cb
            long r9 = m19588e(r1, r9)
            int r6 = com.google.android.gms.internal.p148e.C4487ca.m19144f(r14, r9)
            int r4 = r4 + r6
            goto L_0x09cb
        L_0x05e3:
            boolean r6 = r0.m19573a((T) r1, r14, r3)
            if (r6 == 0) goto L_0x09cb
            int r6 = m19586d(r1, r9)
            int r6 = com.google.android.gms.internal.p148e.C4487ca.m19151h(r14, r6)
            int r4 = r4 + r6
            goto L_0x09cb
        L_0x05f4:
            boolean r6 = r0.m19573a((T) r1, r14, r3)
            if (r6 == 0) goto L_0x09cb
            r9 = 0
            int r6 = com.google.android.gms.internal.p148e.C4487ca.m19152h(r14, r9)
            int r4 = r4 + r6
            goto L_0x09cb
        L_0x0603:
            boolean r6 = r0.m19573a((T) r1, r14, r3)
            if (r6 == 0) goto L_0x09cb
            r6 = 0
            int r9 = com.google.android.gms.internal.p148e.C4487ca.m19158j(r14, r6)
            int r4 = r4 + r9
            goto L_0x09cb
        L_0x0611:
            boolean r6 = r0.m19573a((T) r1, r14, r3)
            if (r6 == 0) goto L_0x09cb
            int r6 = m19586d(r1, r9)
            int r6 = com.google.android.gms.internal.p148e.C4487ca.m19160k(r14, r6)
            int r4 = r4 + r6
            goto L_0x09cb
        L_0x0622:
            boolean r6 = r0.m19573a((T) r1, r14, r3)
            if (r6 == 0) goto L_0x09cb
            int r6 = m19586d(r1, r9)
            int r6 = com.google.android.gms.internal.p148e.C4487ca.m19147g(r14, r6)
            int r4 = r4 + r6
            goto L_0x09cb
        L_0x0633:
            boolean r6 = r0.m19573a((T) r1, r14, r3)
            if (r6 == 0) goto L_0x09cb
            java.lang.Object r6 = r2.getObject(r1, r9)
            com.google.android.gms.internal.e.bj r6 = (com.google.android.gms.internal.p148e.C4469bj) r6
            int r6 = com.google.android.gms.internal.p148e.C4487ca.m19130c(r14, r6)
            int r4 = r4 + r6
            goto L_0x09cb
        L_0x0646:
            boolean r6 = r0.m19573a((T) r1, r14, r3)
            if (r6 == 0) goto L_0x09cb
            java.lang.Object r6 = r2.getObject(r1, r9)
            com.google.android.gms.internal.e.et r9 = r0.m19562a(r3)
            int r6 = com.google.android.gms.internal.p148e.C4573ev.m19680a(r14, r6, r9)
            int r4 = r4 + r6
            goto L_0x09cb
        L_0x065b:
            boolean r6 = r0.m19573a((T) r1, r14, r3)
            if (r6 == 0) goto L_0x09cb
            java.lang.Object r6 = r2.getObject(r1, r9)
            boolean r9 = r6 instanceof com.google.android.gms.internal.p148e.C4469bj
            if (r9 == 0) goto L_0x0672
            com.google.android.gms.internal.e.bj r6 = (com.google.android.gms.internal.p148e.C4469bj) r6
            int r6 = com.google.android.gms.internal.p148e.C4487ca.m19130c(r14, r6)
            int r4 = r4 + r6
            goto L_0x09cb
        L_0x0672:
            java.lang.String r6 = (java.lang.String) r6
            int r6 = com.google.android.gms.internal.p148e.C4487ca.m19122b(r14, r6)
            int r4 = r4 + r6
            goto L_0x09cb
        L_0x067b:
            boolean r6 = r0.m19573a((T) r1, r14, r3)
            if (r6 == 0) goto L_0x09cb
            int r6 = com.google.android.gms.internal.p148e.C4487ca.m19123b(r14, r7)
            int r4 = r4 + r6
            goto L_0x09cb
        L_0x0688:
            boolean r6 = r0.m19573a((T) r1, r14, r3)
            if (r6 == 0) goto L_0x09cb
            r6 = 0
            int r9 = com.google.android.gms.internal.p148e.C4487ca.m19155i(r14, r6)
            int r4 = r4 + r9
            goto L_0x09cb
        L_0x0696:
            boolean r6 = r0.m19573a((T) r1, r14, r3)
            if (r6 == 0) goto L_0x09cb
            r9 = 0
            int r6 = com.google.android.gms.internal.p148e.C4487ca.m19148g(r14, r9)
            int r4 = r4 + r6
            goto L_0x09cb
        L_0x06a5:
            boolean r6 = r0.m19573a((T) r1, r14, r3)
            if (r6 == 0) goto L_0x09cb
            int r6 = m19586d(r1, r9)
            int r6 = com.google.android.gms.internal.p148e.C4487ca.m19143f(r14, r6)
            int r4 = r4 + r6
            goto L_0x09cb
        L_0x06b6:
            boolean r6 = r0.m19573a((T) r1, r14, r3)
            if (r6 == 0) goto L_0x09cb
            long r9 = m19588e(r1, r9)
            int r6 = com.google.android.gms.internal.p148e.C4487ca.m19140e(r14, r9)
            int r4 = r4 + r6
            goto L_0x09cb
        L_0x06c7:
            boolean r6 = r0.m19573a((T) r1, r14, r3)
            if (r6 == 0) goto L_0x09cb
            long r9 = m19588e(r1, r9)
            int r6 = com.google.android.gms.internal.p148e.C4487ca.m19135d(r14, r9)
            int r4 = r4 + r6
            goto L_0x09cb
        L_0x06d8:
            boolean r6 = r0.m19573a((T) r1, r14, r3)
            if (r6 == 0) goto L_0x09cb
            r6 = 0
            int r9 = com.google.android.gms.internal.p148e.C4487ca.m19119b(r14, r6)
            int r4 = r4 + r9
            goto L_0x09cb
        L_0x06e6:
            boolean r6 = r0.m19573a((T) r1, r14, r3)
            if (r6 == 0) goto L_0x09cb
            r9 = 0
            int r6 = com.google.android.gms.internal.p148e.C4487ca.m19118b(r14, r9)
            int r4 = r4 + r6
            goto L_0x09cb
        L_0x06f5:
            com.google.android.gms.internal.e.dx r6 = r0.f14927s
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.lang.Object r10 = r0.m19577b(r3)
            int r6 = r6.mo16673a(r14, r9, r10)
            int r4 = r4 + r6
            goto L_0x09cb
        L_0x0706:
            java.lang.Object r6 = r2.getObject(r1, r9)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.e.et r9 = r0.m19562a(r3)
            int r6 = com.google.android.gms.internal.p148e.C4573ev.m19698b(r14, r6, r9)
            int r4 = r4 + r6
            goto L_0x09cb
        L_0x0717:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.p148e.C4573ev.m19706c(r9)
            if (r9 <= 0) goto L_0x09cb
            boolean r10 = r0.f14919k
            if (r10 == 0) goto L_0x072b
            long r10 = (long) r6
            r2.putInt(r1, r10, r9)
        L_0x072b:
            int r6 = com.google.android.gms.internal.p148e.C4487ca.m19139e(r14)
            int r10 = com.google.android.gms.internal.p148e.C4487ca.m19146g(r9)
            int r6 = r6 + r10
            int r6 = r6 + r9
            int r4 = r4 + r6
            goto L_0x09cb
        L_0x0738:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.p148e.C4573ev.m19721g(r9)
            if (r9 <= 0) goto L_0x09cb
            boolean r10 = r0.f14919k
            if (r10 == 0) goto L_0x074c
            long r10 = (long) r6
            r2.putInt(r1, r10, r9)
        L_0x074c:
            int r6 = com.google.android.gms.internal.p148e.C4487ca.m19139e(r14)
            int r10 = com.google.android.gms.internal.p148e.C4487ca.m19146g(r9)
            int r6 = r6 + r10
            int r6 = r6 + r9
            int r4 = r4 + r6
            goto L_0x09cb
        L_0x0759:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.p148e.C4573ev.m19727i(r9)
            if (r9 <= 0) goto L_0x09cb
            boolean r10 = r0.f14919k
            if (r10 == 0) goto L_0x076d
            long r10 = (long) r6
            r2.putInt(r1, r10, r9)
        L_0x076d:
            int r6 = com.google.android.gms.internal.p148e.C4487ca.m19139e(r14)
            int r10 = com.google.android.gms.internal.p148e.C4487ca.m19146g(r9)
            int r6 = r6 + r10
            int r6 = r6 + r9
            int r4 = r4 + r6
            goto L_0x09cb
        L_0x077a:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.p148e.C4573ev.m19724h(r9)
            if (r9 <= 0) goto L_0x09cb
            boolean r10 = r0.f14919k
            if (r10 == 0) goto L_0x078e
            long r10 = (long) r6
            r2.putInt(r1, r10, r9)
        L_0x078e:
            int r6 = com.google.android.gms.internal.p148e.C4487ca.m19139e(r14)
            int r10 = com.google.android.gms.internal.p148e.C4487ca.m19146g(r9)
            int r6 = r6 + r10
            int r6 = r6 + r9
            int r4 = r4 + r6
            goto L_0x09cb
        L_0x079b:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.p148e.C4573ev.m19710d(r9)
            if (r9 <= 0) goto L_0x09cb
            boolean r10 = r0.f14919k
            if (r10 == 0) goto L_0x07af
            long r10 = (long) r6
            r2.putInt(r1, r10, r9)
        L_0x07af:
            int r6 = com.google.android.gms.internal.p148e.C4487ca.m19139e(r14)
            int r10 = com.google.android.gms.internal.p148e.C4487ca.m19146g(r9)
            int r6 = r6 + r10
            int r6 = r6 + r9
            int r4 = r4 + r6
            goto L_0x09cb
        L_0x07bc:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.p148e.C4573ev.m19718f(r9)
            if (r9 <= 0) goto L_0x09cb
            boolean r10 = r0.f14919k
            if (r10 == 0) goto L_0x07d0
            long r10 = (long) r6
            r2.putInt(r1, r10, r9)
        L_0x07d0:
            int r6 = com.google.android.gms.internal.p148e.C4487ca.m19139e(r14)
            int r10 = com.google.android.gms.internal.p148e.C4487ca.m19146g(r9)
            int r6 = r6 + r10
            int r6 = r6 + r9
            int r4 = r4 + r6
            goto L_0x09cb
        L_0x07dd:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.p148e.C4573ev.m19730j(r9)
            if (r9 <= 0) goto L_0x09cb
            boolean r10 = r0.f14919k
            if (r10 == 0) goto L_0x07f1
            long r10 = (long) r6
            r2.putInt(r1, r10, r9)
        L_0x07f1:
            int r6 = com.google.android.gms.internal.p148e.C4487ca.m19139e(r14)
            int r10 = com.google.android.gms.internal.p148e.C4487ca.m19146g(r9)
            int r6 = r6 + r10
            int r6 = r6 + r9
            int r4 = r4 + r6
            goto L_0x09cb
        L_0x07fe:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.p148e.C4573ev.m19724h(r9)
            if (r9 <= 0) goto L_0x09cb
            boolean r10 = r0.f14919k
            if (r10 == 0) goto L_0x0812
            long r10 = (long) r6
            r2.putInt(r1, r10, r9)
        L_0x0812:
            int r6 = com.google.android.gms.internal.p148e.C4487ca.m19139e(r14)
            int r10 = com.google.android.gms.internal.p148e.C4487ca.m19146g(r9)
            int r6 = r6 + r10
            int r6 = r6 + r9
            int r4 = r4 + r6
            goto L_0x09cb
        L_0x081f:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.p148e.C4573ev.m19727i(r9)
            if (r9 <= 0) goto L_0x09cb
            boolean r10 = r0.f14919k
            if (r10 == 0) goto L_0x0833
            long r10 = (long) r6
            r2.putInt(r1, r10, r9)
        L_0x0833:
            int r6 = com.google.android.gms.internal.p148e.C4487ca.m19139e(r14)
            int r10 = com.google.android.gms.internal.p148e.C4487ca.m19146g(r9)
            int r6 = r6 + r10
            int r6 = r6 + r9
            int r4 = r4 + r6
            goto L_0x09cb
        L_0x0840:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.p148e.C4573ev.m19714e(r9)
            if (r9 <= 0) goto L_0x09cb
            boolean r10 = r0.f14919k
            if (r10 == 0) goto L_0x0854
            long r10 = (long) r6
            r2.putInt(r1, r10, r9)
        L_0x0854:
            int r6 = com.google.android.gms.internal.p148e.C4487ca.m19139e(r14)
            int r10 = com.google.android.gms.internal.p148e.C4487ca.m19146g(r9)
            int r6 = r6 + r10
            int r6 = r6 + r9
            int r4 = r4 + r6
            goto L_0x09cb
        L_0x0861:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.p148e.C4573ev.m19700b(r9)
            if (r9 <= 0) goto L_0x09cb
            boolean r10 = r0.f14919k
            if (r10 == 0) goto L_0x0875
            long r10 = (long) r6
            r2.putInt(r1, r10, r9)
        L_0x0875:
            int r6 = com.google.android.gms.internal.p148e.C4487ca.m19139e(r14)
            int r10 = com.google.android.gms.internal.p148e.C4487ca.m19146g(r9)
            int r6 = r6 + r10
            int r6 = r6 + r9
            int r4 = r4 + r6
            goto L_0x09cb
        L_0x0882:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.p148e.C4573ev.m19684a(r9)
            if (r9 <= 0) goto L_0x09cb
            boolean r10 = r0.f14919k
            if (r10 == 0) goto L_0x0896
            long r10 = (long) r6
            r2.putInt(r1, r10, r9)
        L_0x0896:
            int r6 = com.google.android.gms.internal.p148e.C4487ca.m19139e(r14)
            int r10 = com.google.android.gms.internal.p148e.C4487ca.m19146g(r9)
            int r6 = r6 + r10
            int r6 = r6 + r9
            int r4 = r4 + r6
            goto L_0x09cb
        L_0x08a3:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.p148e.C4573ev.m19724h(r9)
            if (r9 <= 0) goto L_0x09cb
            boolean r10 = r0.f14919k
            if (r10 == 0) goto L_0x08b7
            long r10 = (long) r6
            r2.putInt(r1, r10, r9)
        L_0x08b7:
            int r6 = com.google.android.gms.internal.p148e.C4487ca.m19139e(r14)
            int r10 = com.google.android.gms.internal.p148e.C4487ca.m19146g(r9)
            int r6 = r6 + r10
            int r6 = r6 + r9
            int r4 = r4 + r6
            goto L_0x09cb
        L_0x08c4:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.p148e.C4573ev.m19727i(r9)
            if (r9 <= 0) goto L_0x09cb
            boolean r10 = r0.f14919k
            if (r10 == 0) goto L_0x08d8
            long r10 = (long) r6
            r2.putInt(r1, r10, r9)
        L_0x08d8:
            int r6 = com.google.android.gms.internal.p148e.C4487ca.m19139e(r14)
            int r10 = com.google.android.gms.internal.p148e.C4487ca.m19146g(r9)
            int r6 = r6 + r10
            int r6 = r6 + r9
            int r4 = r4 + r6
            goto L_0x09cb
        L_0x08e5:
            java.lang.Object r6 = r2.getObject(r1, r9)
            java.util.List r6 = (java.util.List) r6
            r11 = 0
            int r6 = com.google.android.gms.internal.p148e.C4573ev.m19705c(r14, r6, r11)
            int r4 = r4 + r6
            goto L_0x09bd
        L_0x08f3:
            r11 = 0
            java.lang.Object r6 = r2.getObject(r1, r9)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.p148e.C4573ev.m19720g(r14, r6, r11)
            int r4 = r4 + r6
            goto L_0x09bd
        L_0x0901:
            r11 = 0
            java.lang.Object r6 = r2.getObject(r1, r9)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.p148e.C4573ev.m19726i(r14, r6, r11)
            int r4 = r4 + r6
            goto L_0x09bd
        L_0x090f:
            r11 = 0
            java.lang.Object r6 = r2.getObject(r1, r9)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.p148e.C4573ev.m19723h(r14, r6, r11)
            int r4 = r4 + r6
            goto L_0x09bd
        L_0x091d:
            r11 = 0
            java.lang.Object r6 = r2.getObject(r1, r9)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.p148e.C4573ev.m19709d(r14, r6, r11)
            int r4 = r4 + r6
            goto L_0x09bd
        L_0x092b:
            r11 = 0
            java.lang.Object r6 = r2.getObject(r1, r9)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.p148e.C4573ev.m19717f(r14, r6, r11)
            int r4 = r4 + r6
            goto L_0x09cb
        L_0x0939:
            java.lang.Object r6 = r2.getObject(r1, r9)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.p148e.C4573ev.m19697b(r14, r6)
            int r4 = r4 + r6
            goto L_0x09cb
        L_0x0946:
            java.lang.Object r6 = r2.getObject(r1, r9)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.e.et r9 = r0.m19562a(r3)
            int r6 = com.google.android.gms.internal.p148e.C4573ev.m19682a(r14, r6, r9)
            int r4 = r4 + r6
            goto L_0x09cb
        L_0x0957:
            java.lang.Object r6 = r2.getObject(r1, r9)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.p148e.C4573ev.m19681a(r14, r6)
            int r4 = r4 + r6
            goto L_0x09cb
        L_0x0963:
            java.lang.Object r6 = r2.getObject(r1, r9)
            java.util.List r6 = (java.util.List) r6
            r11 = 0
            int r6 = com.google.android.gms.internal.p148e.C4573ev.m19729j(r14, r6, r11)
            int r4 = r4 + r6
            goto L_0x09bd
        L_0x0970:
            r11 = 0
            java.lang.Object r6 = r2.getObject(r1, r9)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.p148e.C4573ev.m19723h(r14, r6, r11)
            int r4 = r4 + r6
            goto L_0x09bd
        L_0x097d:
            r11 = 0
            java.lang.Object r6 = r2.getObject(r1, r9)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.p148e.C4573ev.m19726i(r14, r6, r11)
            int r4 = r4 + r6
            goto L_0x09bd
        L_0x098a:
            r11 = 0
            java.lang.Object r6 = r2.getObject(r1, r9)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.p148e.C4573ev.m19713e(r14, r6, r11)
            int r4 = r4 + r6
            goto L_0x09bd
        L_0x0997:
            r11 = 0
            java.lang.Object r6 = r2.getObject(r1, r9)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.p148e.C4573ev.m19699b(r14, r6, r11)
            int r4 = r4 + r6
            goto L_0x09bd
        L_0x09a4:
            r11 = 0
            java.lang.Object r6 = r2.getObject(r1, r9)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.p148e.C4573ev.m19683a(r14, r6, r11)
            int r4 = r4 + r6
            goto L_0x09bd
        L_0x09b1:
            r11 = 0
            java.lang.Object r6 = r2.getObject(r1, r9)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.p148e.C4573ev.m19723h(r14, r6, r11)
            int r4 = r4 + r6
        L_0x09bd:
            r6 = r11
            goto L_0x09cc
        L_0x09bf:
            r11 = 0
            java.lang.Object r6 = r2.getObject(r1, r9)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.p148e.C4573ev.m19726i(r14, r6, r11)
            int r4 = r4 + r6
        L_0x09cb:
            r6 = 0
        L_0x09cc:
            r9 = 0
            r10 = 0
            r18 = 0
            goto L_0x0af0
        L_0x09d3:
            r6 = r12 & r16
            if (r6 == 0) goto L_0x09cb
            java.lang.Object r6 = r2.getObject(r1, r9)
            com.google.android.gms.internal.e.ec r6 = (com.google.android.gms.internal.p148e.C4554ec) r6
            com.google.android.gms.internal.e.et r9 = r0.m19562a(r3)
            int r6 = com.google.android.gms.internal.p148e.C4487ca.m19132c(r14, r6, r9)
            int r4 = r4 + r6
            goto L_0x09cb
        L_0x09e7:
            r6 = r12 & r16
            if (r6 == 0) goto L_0x09cb
            long r9 = r2.getLong(r1, r9)
            int r6 = com.google.android.gms.internal.p148e.C4487ca.m19144f(r14, r9)
            int r4 = r4 + r6
            goto L_0x09cb
        L_0x09f5:
            r6 = r12 & r16
            if (r6 == 0) goto L_0x09cb
            int r6 = r2.getInt(r1, r9)
            int r6 = com.google.android.gms.internal.p148e.C4487ca.m19151h(r14, r6)
            int r4 = r4 + r6
            goto L_0x09cb
        L_0x0a03:
            r6 = r12 & r16
            if (r6 == 0) goto L_0x09cb
            r9 = 0
            int r6 = com.google.android.gms.internal.p148e.C4487ca.m19152h(r14, r9)
            int r4 = r4 + r6
            goto L_0x09cb
        L_0x0a0f:
            r6 = r12 & r16
            if (r6 == 0) goto L_0x09cb
            r6 = 0
            int r9 = com.google.android.gms.internal.p148e.C4487ca.m19158j(r14, r6)
            int r4 = r4 + r9
            goto L_0x09cb
        L_0x0a1a:
            r6 = r12 & r16
            if (r6 == 0) goto L_0x09cb
            int r6 = r2.getInt(r1, r9)
            int r6 = com.google.android.gms.internal.p148e.C4487ca.m19160k(r14, r6)
            int r4 = r4 + r6
            goto L_0x09cb
        L_0x0a28:
            r6 = r12 & r16
            if (r6 == 0) goto L_0x09cb
            int r6 = r2.getInt(r1, r9)
            int r6 = com.google.android.gms.internal.p148e.C4487ca.m19147g(r14, r6)
            int r4 = r4 + r6
            goto L_0x09cb
        L_0x0a36:
            r6 = r12 & r16
            if (r6 == 0) goto L_0x09cb
            java.lang.Object r6 = r2.getObject(r1, r9)
            com.google.android.gms.internal.e.bj r6 = (com.google.android.gms.internal.p148e.C4469bj) r6
            int r6 = com.google.android.gms.internal.p148e.C4487ca.m19130c(r14, r6)
            int r4 = r4 + r6
            goto L_0x09cb
        L_0x0a46:
            r6 = r12 & r16
            if (r6 == 0) goto L_0x09cb
            java.lang.Object r6 = r2.getObject(r1, r9)
            com.google.android.gms.internal.e.et r9 = r0.m19562a(r3)
            int r6 = com.google.android.gms.internal.p148e.C4573ev.m19680a(r14, r6, r9)
            int r4 = r4 + r6
            goto L_0x09cb
        L_0x0a59:
            r6 = r12 & r16
            if (r6 == 0) goto L_0x09cb
            java.lang.Object r6 = r2.getObject(r1, r9)
            boolean r9 = r6 instanceof com.google.android.gms.internal.p148e.C4469bj
            if (r9 == 0) goto L_0x0a6e
            com.google.android.gms.internal.e.bj r6 = (com.google.android.gms.internal.p148e.C4469bj) r6
            int r6 = com.google.android.gms.internal.p148e.C4487ca.m19130c(r14, r6)
            int r4 = r4 + r6
            goto L_0x09cb
        L_0x0a6e:
            java.lang.String r6 = (java.lang.String) r6
            int r6 = com.google.android.gms.internal.p148e.C4487ca.m19122b(r14, r6)
            int r4 = r4 + r6
            goto L_0x09cb
        L_0x0a77:
            r6 = r12 & r16
            if (r6 == 0) goto L_0x09cb
            int r6 = com.google.android.gms.internal.p148e.C4487ca.m19123b(r14, r7)
            int r4 = r4 + r6
            goto L_0x09cb
        L_0x0a82:
            r6 = r12 & r16
            if (r6 == 0) goto L_0x09cb
            r6 = 0
            int r9 = com.google.android.gms.internal.p148e.C4487ca.m19155i(r14, r6)
            int r4 = r4 + r9
            goto L_0x09cc
        L_0x0a8e:
            r6 = 0
            r9 = r12 & r16
            if (r9 == 0) goto L_0x09cc
            r9 = 0
            int r11 = com.google.android.gms.internal.p148e.C4487ca.m19148g(r14, r9)
            int r4 = r4 + r11
            r18 = r9
            goto L_0x0acf
        L_0x0a9d:
            r6 = 0
            r18 = 0
            r11 = r12 & r16
            if (r11 == 0) goto L_0x0acf
            int r9 = r2.getInt(r1, r9)
            int r9 = com.google.android.gms.internal.p148e.C4487ca.m19143f(r14, r9)
            int r4 = r4 + r9
            goto L_0x0acf
        L_0x0aae:
            r6 = 0
            r18 = 0
            r11 = r12 & r16
            if (r11 == 0) goto L_0x0acf
            long r9 = r2.getLong(r1, r9)
            int r9 = com.google.android.gms.internal.p148e.C4487ca.m19140e(r14, r9)
            int r4 = r4 + r9
            goto L_0x0acf
        L_0x0abf:
            r6 = 0
            r18 = 0
            r11 = r12 & r16
            if (r11 == 0) goto L_0x0acf
            long r9 = r2.getLong(r1, r9)
            int r9 = com.google.android.gms.internal.p148e.C4487ca.m19135d(r14, r9)
            int r4 = r4 + r9
        L_0x0acf:
            r9 = 0
            goto L_0x0ade
        L_0x0ad1:
            r6 = 0
            r18 = 0
            r9 = r12 & r16
            if (r9 == 0) goto L_0x0acf
            r9 = 0
            int r10 = com.google.android.gms.internal.p148e.C4487ca.m19119b(r14, r9)
            int r4 = r4 + r10
        L_0x0ade:
            r10 = 0
            goto L_0x0af0
        L_0x0ae1:
            r6 = 0
            r9 = 0
            r18 = 0
            r10 = r12 & r16
            if (r10 == 0) goto L_0x0ade
            r10 = 0
            int r13 = com.google.android.gms.internal.p148e.C4487ca.m19118b(r14, r10)
            int r4 = r4 + r13
        L_0x0af0:
            int r3 = r3 + 3
            r11 = r6
            r6 = r9
            r9 = r18
            goto L_0x0566
        L_0x0af8:
            com.google.android.gms.internal.e.fl<?, ?> r2 = r0.f14925q
            int r2 = m19560a(r2, (T) r1)
            int r4 = r4 + r2
            boolean r2 = r0.f14916h
            if (r2 == 0) goto L_0x0b0e
            com.google.android.gms.internal.e.ci<?> r2 = r0.f14926r
            com.google.android.gms.internal.e.cl r1 = r2.mo16570a(r1)
            int r1 = r1.mo16588h()
            int r4 = r4 + r1
        L_0x0b0e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p148e.C4558eg.mo16689b(java.lang.Object):int");
    }

    /* renamed from: a */
    private static <UT, UB> int m19560a(C4595fl<UT, UB> flVar, T t) {
        return flVar.mo16763f(flVar.mo16755b(t));
    }

    /* renamed from: a */
    private static <E> List<E> m19566a(Object obj, long j) {
        return (List) C4601fr.m19874f(obj, j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0511  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x054f  */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x0a27  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16687a(T r14, com.google.android.gms.internal.p148e.C4621gg r15) throws java.io.IOException {
        /*
            r13 = this;
            int r0 = r15.mo16520a()
            int r1 = com.google.android.gms.internal.p148e.C4513cu.C4518e.f14855k
            r2 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = 0
            r4 = 1
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 != r1) goto L_0x0527
            com.google.android.gms.internal.e.fl<?, ?> r0 = r13.f14925q
            m19568a(r0, (T) r14, r15)
            boolean r0 = r13.f14916h
            if (r0 == 0) goto L_0x0030
            com.google.android.gms.internal.e.ci<?> r0 = r13.f14926r
            com.google.android.gms.internal.e.cl r0 = r0.mo16570a(r14)
            boolean r1 = r0.mo16580b()
            if (r1 != 0) goto L_0x0030
            java.util.Iterator r0 = r0.mo16586f()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0032
        L_0x0030:
            r0 = r3
            r1 = r0
        L_0x0032:
            int[] r7 = r13.f14911c
            int r7 = r7.length
            int r7 = r7 + -3
        L_0x0037:
            if (r7 < 0) goto L_0x050f
            int r8 = r13.m19585d(r7)
            int[] r9 = r13.f14911c
            r9 = r9[r7]
        L_0x0041:
            if (r1 == 0) goto L_0x005f
            com.google.android.gms.internal.e.ci<?> r10 = r13.f14926r
            int r10 = r10.mo16569a(r1)
            if (r10 <= r9) goto L_0x005f
            com.google.android.gms.internal.e.ci<?> r10 = r13.f14926r
            r10.mo16575a(r15, r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x005d
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0041
        L_0x005d:
            r1 = r3
            goto L_0x0041
        L_0x005f:
            r10 = r8 & r2
            int r10 = r10 >>> 20
            switch(r10) {
                case 0: goto L_0x04fc;
                case 1: goto L_0x04ec;
                case 2: goto L_0x04dc;
                case 3: goto L_0x04cc;
                case 4: goto L_0x04bc;
                case 5: goto L_0x04ac;
                case 6: goto L_0x049c;
                case 7: goto L_0x048b;
                case 8: goto L_0x047a;
                case 9: goto L_0x0465;
                case 10: goto L_0x0452;
                case 11: goto L_0x0441;
                case 12: goto L_0x0430;
                case 13: goto L_0x041f;
                case 14: goto L_0x040e;
                case 15: goto L_0x03fd;
                case 16: goto L_0x03ec;
                case 17: goto L_0x03d7;
                case 18: goto L_0x03c6;
                case 19: goto L_0x03b5;
                case 20: goto L_0x03a4;
                case 21: goto L_0x0393;
                case 22: goto L_0x0382;
                case 23: goto L_0x0371;
                case 24: goto L_0x0360;
                case 25: goto L_0x034f;
                case 26: goto L_0x033e;
                case 27: goto L_0x0329;
                case 28: goto L_0x0318;
                case 29: goto L_0x0307;
                case 30: goto L_0x02f6;
                case 31: goto L_0x02e5;
                case 32: goto L_0x02d4;
                case 33: goto L_0x02c3;
                case 34: goto L_0x02b2;
                case 35: goto L_0x02a1;
                case 36: goto L_0x0290;
                case 37: goto L_0x027f;
                case 38: goto L_0x026e;
                case 39: goto L_0x025d;
                case 40: goto L_0x024c;
                case 41: goto L_0x023b;
                case 42: goto L_0x022a;
                case 43: goto L_0x0219;
                case 44: goto L_0x0208;
                case 45: goto L_0x01f7;
                case 46: goto L_0x01e6;
                case 47: goto L_0x01d5;
                case 48: goto L_0x01c4;
                case 49: goto L_0x01af;
                case 50: goto L_0x01a4;
                case 51: goto L_0x0193;
                case 52: goto L_0x0182;
                case 53: goto L_0x0171;
                case 54: goto L_0x0160;
                case 55: goto L_0x014f;
                case 56: goto L_0x013e;
                case 57: goto L_0x012d;
                case 58: goto L_0x011c;
                case 59: goto L_0x010b;
                case 60: goto L_0x00f6;
                case 61: goto L_0x00e3;
                case 62: goto L_0x00d2;
                case 63: goto L_0x00c1;
                case 64: goto L_0x00b0;
                case 65: goto L_0x009f;
                case 66: goto L_0x008e;
                case 67: goto L_0x007d;
                case 68: goto L_0x0068;
                default: goto L_0x0066;
            }
        L_0x0066:
            goto L_0x050b
        L_0x0068:
            boolean r10 = r13.m19573a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r10)
            com.google.android.gms.internal.e.et r10 = r13.m19562a(r7)
            r15.mo16538b(r9, r8, r10)
            goto L_0x050b
        L_0x007d:
            boolean r10 = r13.m19573a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m19588e(r14, r10)
            r15.mo16549e(r9, r10)
            goto L_0x050b
        L_0x008e:
            boolean r10 = r13.m19573a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m19586d(r14, r10)
            r15.mo16551f(r9, r8)
            goto L_0x050b
        L_0x009f:
            boolean r10 = r13.m19573a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m19588e(r14, r10)
            r15.mo16537b(r9, r10)
            goto L_0x050b
        L_0x00b0:
            boolean r10 = r13.m19573a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m19586d(r14, r10)
            r15.mo16524a(r9, r8)
            goto L_0x050b
        L_0x00c1:
            boolean r10 = r13.m19573a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m19586d(r14, r10)
            r15.mo16536b(r9, r8)
            goto L_0x050b
        L_0x00d2:
            boolean r10 = r13.m19573a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m19586d(r14, r10)
            r15.mo16548e(r9, r8)
            goto L_0x050b
        L_0x00e3:
            boolean r10 = r13.m19573a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r10)
            com.google.android.gms.internal.e.bj r8 = (com.google.android.gms.internal.p148e.C4469bj) r8
            r15.mo16526a(r9, r8)
            goto L_0x050b
        L_0x00f6:
            boolean r10 = r13.m19573a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r10)
            com.google.android.gms.internal.e.et r10 = r13.m19562a(r7)
            r15.mo16529a(r9, r8, r10)
            goto L_0x050b
        L_0x010b:
            boolean r10 = r13.m19573a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r10)
            m19567a(r9, r8, r15)
            goto L_0x050b
        L_0x011c:
            boolean r10 = r13.m19573a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            boolean r8 = m19590f(r14, r10)
            r15.mo16534a(r9, r8)
            goto L_0x050b
        L_0x012d:
            boolean r10 = r13.m19573a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m19586d(r14, r10)
            r15.mo16545d(r9, r8)
            goto L_0x050b
        L_0x013e:
            boolean r10 = r13.m19573a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m19588e(r14, r10)
            r15.mo16546d(r9, r10)
            goto L_0x050b
        L_0x014f:
            boolean r10 = r13.m19573a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m19586d(r14, r10)
            r15.mo16542c(r9, r8)
            goto L_0x050b
        L_0x0160:
            boolean r10 = r13.m19573a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m19588e(r14, r10)
            r15.mo16543c(r9, r10)
            goto L_0x050b
        L_0x0171:
            boolean r10 = r13.m19573a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m19588e(r14, r10)
            r15.mo16525a(r9, r10)
            goto L_0x050b
        L_0x0182:
            boolean r10 = r13.m19573a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            float r8 = m19582c(r14, r10)
            r15.mo16523a(r9, r8)
            goto L_0x050b
        L_0x0193:
            boolean r10 = r13.m19573a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            double r10 = m19576b((T) r14, r10)
            r15.mo16522a(r9, r10)
            goto L_0x050b
        L_0x01a4:
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r10)
            r13.m19569a(r15, r9, r8, r7)
            goto L_0x050b
        L_0x01af:
            int[] r9 = r13.f14911c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.e.et r10 = r13.m19562a(r7)
            com.google.android.gms.internal.p148e.C4573ev.m19703b(r9, r8, r15, r10)
            goto L_0x050b
        L_0x01c4:
            int[] r9 = r13.f14911c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.p148e.C4573ev.m19716e(r9, r8, r15, r4)
            goto L_0x050b
        L_0x01d5:
            int[] r9 = r13.f14911c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.p148e.C4573ev.m19731j(r9, r8, r15, r4)
            goto L_0x050b
        L_0x01e6:
            int[] r9 = r13.f14911c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.p148e.C4573ev.m19722g(r9, r8, r15, r4)
            goto L_0x050b
        L_0x01f7:
            int[] r9 = r13.f14911c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.p148e.C4573ev.m19733l(r9, r8, r15, r4)
            goto L_0x050b
        L_0x0208:
            int[] r9 = r13.f14911c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.p148e.C4573ev.m19734m(r9, r8, r15, r4)
            goto L_0x050b
        L_0x0219:
            int[] r9 = r13.f14911c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.p148e.C4573ev.m19728i(r9, r8, r15, r4)
            goto L_0x050b
        L_0x022a:
            int[] r9 = r13.f14911c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.p148e.C4573ev.m19735n(r9, r8, r15, r4)
            goto L_0x050b
        L_0x023b:
            int[] r9 = r13.f14911c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.p148e.C4573ev.m19732k(r9, r8, r15, r4)
            goto L_0x050b
        L_0x024c:
            int[] r9 = r13.f14911c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.p148e.C4573ev.m19719f(r9, r8, r15, r4)
            goto L_0x050b
        L_0x025d:
            int[] r9 = r13.f14911c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.p148e.C4573ev.m19725h(r9, r8, r15, r4)
            goto L_0x050b
        L_0x026e:
            int[] r9 = r13.f14911c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.p148e.C4573ev.m19712d(r9, r8, r15, r4)
            goto L_0x050b
        L_0x027f:
            int[] r9 = r13.f14911c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.p148e.C4573ev.m19708c(r9, r8, r15, r4)
            goto L_0x050b
        L_0x0290:
            int[] r9 = r13.f14911c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.p148e.C4573ev.m19704b(r9, r8, r15, r4)
            goto L_0x050b
        L_0x02a1:
            int[] r9 = r13.f14911c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.p148e.C4573ev.m19691a(r9, r8, r15, r4)
            goto L_0x050b
        L_0x02b2:
            int[] r9 = r13.f14911c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.p148e.C4573ev.m19716e(r9, r8, r15, r5)
            goto L_0x050b
        L_0x02c3:
            int[] r9 = r13.f14911c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.p148e.C4573ev.m19731j(r9, r8, r15, r5)
            goto L_0x050b
        L_0x02d4:
            int[] r9 = r13.f14911c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.p148e.C4573ev.m19722g(r9, r8, r15, r5)
            goto L_0x050b
        L_0x02e5:
            int[] r9 = r13.f14911c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.p148e.C4573ev.m19733l(r9, r8, r15, r5)
            goto L_0x050b
        L_0x02f6:
            int[] r9 = r13.f14911c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.p148e.C4573ev.m19734m(r9, r8, r15, r5)
            goto L_0x050b
        L_0x0307:
            int[] r9 = r13.f14911c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.p148e.C4573ev.m19728i(r9, r8, r15, r5)
            goto L_0x050b
        L_0x0318:
            int[] r9 = r13.f14911c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.p148e.C4573ev.m19702b(r9, r8, r15)
            goto L_0x050b
        L_0x0329:
            int[] r9 = r13.f14911c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.e.et r10 = r13.m19562a(r7)
            com.google.android.gms.internal.p148e.C4573ev.m19690a(r9, r8, r15, r10)
            goto L_0x050b
        L_0x033e:
            int[] r9 = r13.f14911c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.p148e.C4573ev.m19689a(r9, r8, r15)
            goto L_0x050b
        L_0x034f:
            int[] r9 = r13.f14911c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.p148e.C4573ev.m19735n(r9, r8, r15, r5)
            goto L_0x050b
        L_0x0360:
            int[] r9 = r13.f14911c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.p148e.C4573ev.m19732k(r9, r8, r15, r5)
            goto L_0x050b
        L_0x0371:
            int[] r9 = r13.f14911c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.p148e.C4573ev.m19719f(r9, r8, r15, r5)
            goto L_0x050b
        L_0x0382:
            int[] r9 = r13.f14911c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.p148e.C4573ev.m19725h(r9, r8, r15, r5)
            goto L_0x050b
        L_0x0393:
            int[] r9 = r13.f14911c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.p148e.C4573ev.m19712d(r9, r8, r15, r5)
            goto L_0x050b
        L_0x03a4:
            int[] r9 = r13.f14911c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.p148e.C4573ev.m19708c(r9, r8, r15, r5)
            goto L_0x050b
        L_0x03b5:
            int[] r9 = r13.f14911c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.p148e.C4573ev.m19704b(r9, r8, r15, r5)
            goto L_0x050b
        L_0x03c6:
            int[] r9 = r13.f14911c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.p148e.C4573ev.m19691a(r9, r8, r15, r5)
            goto L_0x050b
        L_0x03d7:
            boolean r10 = r13.m19572a((T) r14, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r10)
            com.google.android.gms.internal.e.et r10 = r13.m19562a(r7)
            r15.mo16538b(r9, r8, r10)
            goto L_0x050b
        L_0x03ec:
            boolean r10 = r13.m19572a((T) r14, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.p148e.C4601fr.m19857b(r14, r10)
            r15.mo16549e(r9, r10)
            goto L_0x050b
        L_0x03fd:
            boolean r10 = r13.m19572a((T) r14, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.p148e.C4601fr.m19841a(r14, r10)
            r15.mo16551f(r9, r8)
            goto L_0x050b
        L_0x040e:
            boolean r10 = r13.m19572a((T) r14, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.p148e.C4601fr.m19857b(r14, r10)
            r15.mo16537b(r9, r10)
            goto L_0x050b
        L_0x041f:
            boolean r10 = r13.m19572a((T) r14, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.p148e.C4601fr.m19841a(r14, r10)
            r15.mo16524a(r9, r8)
            goto L_0x050b
        L_0x0430:
            boolean r10 = r13.m19572a((T) r14, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.p148e.C4601fr.m19841a(r14, r10)
            r15.mo16536b(r9, r8)
            goto L_0x050b
        L_0x0441:
            boolean r10 = r13.m19572a((T) r14, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.p148e.C4601fr.m19841a(r14, r10)
            r15.mo16548e(r9, r8)
            goto L_0x050b
        L_0x0452:
            boolean r10 = r13.m19572a((T) r14, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r10)
            com.google.android.gms.internal.e.bj r8 = (com.google.android.gms.internal.p148e.C4469bj) r8
            r15.mo16526a(r9, r8)
            goto L_0x050b
        L_0x0465:
            boolean r10 = r13.m19572a((T) r14, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r10)
            com.google.android.gms.internal.e.et r10 = r13.m19562a(r7)
            r15.mo16529a(r9, r8, r10)
            goto L_0x050b
        L_0x047a:
            boolean r10 = r13.m19572a((T) r14, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r10)
            m19567a(r9, r8, r15)
            goto L_0x050b
        L_0x048b:
            boolean r10 = r13.m19572a((T) r14, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            boolean r8 = com.google.android.gms.internal.p148e.C4601fr.m19865c(r14, r10)
            r15.mo16534a(r9, r8)
            goto L_0x050b
        L_0x049c:
            boolean r10 = r13.m19572a((T) r14, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.p148e.C4601fr.m19841a(r14, r10)
            r15.mo16545d(r9, r8)
            goto L_0x050b
        L_0x04ac:
            boolean r10 = r13.m19572a((T) r14, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.p148e.C4601fr.m19857b(r14, r10)
            r15.mo16546d(r9, r10)
            goto L_0x050b
        L_0x04bc:
            boolean r10 = r13.m19572a((T) r14, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.p148e.C4601fr.m19841a(r14, r10)
            r15.mo16542c(r9, r8)
            goto L_0x050b
        L_0x04cc:
            boolean r10 = r13.m19572a((T) r14, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.p148e.C4601fr.m19857b(r14, r10)
            r15.mo16543c(r9, r10)
            goto L_0x050b
        L_0x04dc:
            boolean r10 = r13.m19572a((T) r14, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.p148e.C4601fr.m19857b(r14, r10)
            r15.mo16525a(r9, r10)
            goto L_0x050b
        L_0x04ec:
            boolean r10 = r13.m19572a((T) r14, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            float r8 = com.google.android.gms.internal.p148e.C4601fr.m19866d(r14, r10)
            r15.mo16523a(r9, r8)
            goto L_0x050b
        L_0x04fc:
            boolean r10 = r13.m19572a((T) r14, r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            double r10 = com.google.android.gms.internal.p148e.C4601fr.m19871e(r14, r10)
            r15.mo16522a(r9, r10)
        L_0x050b:
            int r7 = r7 + -3
            goto L_0x0037
        L_0x050f:
            if (r1 == 0) goto L_0x0526
            com.google.android.gms.internal.e.ci<?> r14 = r13.f14926r
            r14.mo16575a(r15, r1)
            boolean r14 = r0.hasNext()
            if (r14 == 0) goto L_0x0524
            java.lang.Object r14 = r0.next()
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14
            r1 = r14
            goto L_0x050f
        L_0x0524:
            r1 = r3
            goto L_0x050f
        L_0x0526:
            return
        L_0x0527:
            boolean r0 = r13.f14918j
            if (r0 == 0) goto L_0x0a42
            boolean r0 = r13.f14916h
            if (r0 == 0) goto L_0x0546
            com.google.android.gms.internal.e.ci<?> r0 = r13.f14926r
            com.google.android.gms.internal.e.cl r0 = r0.mo16570a(r14)
            boolean r1 = r0.mo16580b()
            if (r1 != 0) goto L_0x0546
            java.util.Iterator r0 = r0.mo16584e()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0548
        L_0x0546:
            r0 = r3
            r1 = r0
        L_0x0548:
            int[] r7 = r13.f14911c
            int r7 = r7.length
            r8 = r1
            r1 = r5
        L_0x054d:
            if (r1 >= r7) goto L_0x0a25
            int r9 = r13.m19585d(r1)
            int[] r10 = r13.f14911c
            r10 = r10[r1]
        L_0x0557:
            if (r8 == 0) goto L_0x0575
            com.google.android.gms.internal.e.ci<?> r11 = r13.f14926r
            int r11 = r11.mo16569a(r8)
            if (r11 > r10) goto L_0x0575
            com.google.android.gms.internal.e.ci<?> r11 = r13.f14926r
            r11.mo16575a(r15, r8)
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x0573
            java.lang.Object r8 = r0.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            goto L_0x0557
        L_0x0573:
            r8 = r3
            goto L_0x0557
        L_0x0575:
            r11 = r9 & r2
            int r11 = r11 >>> 20
            switch(r11) {
                case 0: goto L_0x0a12;
                case 1: goto L_0x0a02;
                case 2: goto L_0x09f2;
                case 3: goto L_0x09e2;
                case 4: goto L_0x09d2;
                case 5: goto L_0x09c2;
                case 6: goto L_0x09b2;
                case 7: goto L_0x09a1;
                case 8: goto L_0x0990;
                case 9: goto L_0x097b;
                case 10: goto L_0x0968;
                case 11: goto L_0x0957;
                case 12: goto L_0x0946;
                case 13: goto L_0x0935;
                case 14: goto L_0x0924;
                case 15: goto L_0x0913;
                case 16: goto L_0x0902;
                case 17: goto L_0x08ed;
                case 18: goto L_0x08dc;
                case 19: goto L_0x08cb;
                case 20: goto L_0x08ba;
                case 21: goto L_0x08a9;
                case 22: goto L_0x0898;
                case 23: goto L_0x0887;
                case 24: goto L_0x0876;
                case 25: goto L_0x0865;
                case 26: goto L_0x0854;
                case 27: goto L_0x083f;
                case 28: goto L_0x082e;
                case 29: goto L_0x081d;
                case 30: goto L_0x080c;
                case 31: goto L_0x07fb;
                case 32: goto L_0x07ea;
                case 33: goto L_0x07d9;
                case 34: goto L_0x07c8;
                case 35: goto L_0x07b7;
                case 36: goto L_0x07a6;
                case 37: goto L_0x0795;
                case 38: goto L_0x0784;
                case 39: goto L_0x0773;
                case 40: goto L_0x0762;
                case 41: goto L_0x0751;
                case 42: goto L_0x0740;
                case 43: goto L_0x072f;
                case 44: goto L_0x071e;
                case 45: goto L_0x070d;
                case 46: goto L_0x06fc;
                case 47: goto L_0x06eb;
                case 48: goto L_0x06da;
                case 49: goto L_0x06c5;
                case 50: goto L_0x06ba;
                case 51: goto L_0x06a9;
                case 52: goto L_0x0698;
                case 53: goto L_0x0687;
                case 54: goto L_0x0676;
                case 55: goto L_0x0665;
                case 56: goto L_0x0654;
                case 57: goto L_0x0643;
                case 58: goto L_0x0632;
                case 59: goto L_0x0621;
                case 60: goto L_0x060c;
                case 61: goto L_0x05f9;
                case 62: goto L_0x05e8;
                case 63: goto L_0x05d7;
                case 64: goto L_0x05c6;
                case 65: goto L_0x05b5;
                case 66: goto L_0x05a4;
                case 67: goto L_0x0593;
                case 68: goto L_0x057e;
                default: goto L_0x057c;
            }
        L_0x057c:
            goto L_0x0a21
        L_0x057e:
            boolean r11 = r13.m19573a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r11)
            com.google.android.gms.internal.e.et r11 = r13.m19562a(r1)
            r15.mo16538b(r10, r9, r11)
            goto L_0x0a21
        L_0x0593:
            boolean r11 = r13.m19573a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m19588e(r14, r11)
            r15.mo16549e(r10, r11)
            goto L_0x0a21
        L_0x05a4:
            boolean r11 = r13.m19573a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m19586d(r14, r11)
            r15.mo16551f(r10, r9)
            goto L_0x0a21
        L_0x05b5:
            boolean r11 = r13.m19573a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m19588e(r14, r11)
            r15.mo16537b(r10, r11)
            goto L_0x0a21
        L_0x05c6:
            boolean r11 = r13.m19573a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m19586d(r14, r11)
            r15.mo16524a(r10, r9)
            goto L_0x0a21
        L_0x05d7:
            boolean r11 = r13.m19573a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m19586d(r14, r11)
            r15.mo16536b(r10, r9)
            goto L_0x0a21
        L_0x05e8:
            boolean r11 = r13.m19573a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m19586d(r14, r11)
            r15.mo16548e(r10, r9)
            goto L_0x0a21
        L_0x05f9:
            boolean r11 = r13.m19573a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r11)
            com.google.android.gms.internal.e.bj r9 = (com.google.android.gms.internal.p148e.C4469bj) r9
            r15.mo16526a(r10, r9)
            goto L_0x0a21
        L_0x060c:
            boolean r11 = r13.m19573a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r11)
            com.google.android.gms.internal.e.et r11 = r13.m19562a(r1)
            r15.mo16529a(r10, r9, r11)
            goto L_0x0a21
        L_0x0621:
            boolean r11 = r13.m19573a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r11)
            m19567a(r10, r9, r15)
            goto L_0x0a21
        L_0x0632:
            boolean r11 = r13.m19573a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            boolean r9 = m19590f(r14, r11)
            r15.mo16534a(r10, r9)
            goto L_0x0a21
        L_0x0643:
            boolean r11 = r13.m19573a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m19586d(r14, r11)
            r15.mo16545d(r10, r9)
            goto L_0x0a21
        L_0x0654:
            boolean r11 = r13.m19573a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m19588e(r14, r11)
            r15.mo16546d(r10, r11)
            goto L_0x0a21
        L_0x0665:
            boolean r11 = r13.m19573a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m19586d(r14, r11)
            r15.mo16542c(r10, r9)
            goto L_0x0a21
        L_0x0676:
            boolean r11 = r13.m19573a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m19588e(r14, r11)
            r15.mo16543c(r10, r11)
            goto L_0x0a21
        L_0x0687:
            boolean r11 = r13.m19573a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m19588e(r14, r11)
            r15.mo16525a(r10, r11)
            goto L_0x0a21
        L_0x0698:
            boolean r11 = r13.m19573a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            float r9 = m19582c(r14, r11)
            r15.mo16523a(r10, r9)
            goto L_0x0a21
        L_0x06a9:
            boolean r11 = r13.m19573a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            double r11 = m19576b((T) r14, r11)
            r15.mo16522a(r10, r11)
            goto L_0x0a21
        L_0x06ba:
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r11)
            r13.m19569a(r15, r10, r9, r1)
            goto L_0x0a21
        L_0x06c5:
            int[] r10 = r13.f14911c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.e.et r11 = r13.m19562a(r1)
            com.google.android.gms.internal.p148e.C4573ev.m19703b(r10, r9, r15, r11)
            goto L_0x0a21
        L_0x06da:
            int[] r10 = r13.f14911c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.p148e.C4573ev.m19716e(r10, r9, r15, r4)
            goto L_0x0a21
        L_0x06eb:
            int[] r10 = r13.f14911c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.p148e.C4573ev.m19731j(r10, r9, r15, r4)
            goto L_0x0a21
        L_0x06fc:
            int[] r10 = r13.f14911c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.p148e.C4573ev.m19722g(r10, r9, r15, r4)
            goto L_0x0a21
        L_0x070d:
            int[] r10 = r13.f14911c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.p148e.C4573ev.m19733l(r10, r9, r15, r4)
            goto L_0x0a21
        L_0x071e:
            int[] r10 = r13.f14911c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.p148e.C4573ev.m19734m(r10, r9, r15, r4)
            goto L_0x0a21
        L_0x072f:
            int[] r10 = r13.f14911c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.p148e.C4573ev.m19728i(r10, r9, r15, r4)
            goto L_0x0a21
        L_0x0740:
            int[] r10 = r13.f14911c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.p148e.C4573ev.m19735n(r10, r9, r15, r4)
            goto L_0x0a21
        L_0x0751:
            int[] r10 = r13.f14911c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.p148e.C4573ev.m19732k(r10, r9, r15, r4)
            goto L_0x0a21
        L_0x0762:
            int[] r10 = r13.f14911c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.p148e.C4573ev.m19719f(r10, r9, r15, r4)
            goto L_0x0a21
        L_0x0773:
            int[] r10 = r13.f14911c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.p148e.C4573ev.m19725h(r10, r9, r15, r4)
            goto L_0x0a21
        L_0x0784:
            int[] r10 = r13.f14911c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.p148e.C4573ev.m19712d(r10, r9, r15, r4)
            goto L_0x0a21
        L_0x0795:
            int[] r10 = r13.f14911c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.p148e.C4573ev.m19708c(r10, r9, r15, r4)
            goto L_0x0a21
        L_0x07a6:
            int[] r10 = r13.f14911c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.p148e.C4573ev.m19704b(r10, r9, r15, r4)
            goto L_0x0a21
        L_0x07b7:
            int[] r10 = r13.f14911c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.p148e.C4573ev.m19691a(r10, r9, r15, r4)
            goto L_0x0a21
        L_0x07c8:
            int[] r10 = r13.f14911c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.p148e.C4573ev.m19716e(r10, r9, r15, r5)
            goto L_0x0a21
        L_0x07d9:
            int[] r10 = r13.f14911c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.p148e.C4573ev.m19731j(r10, r9, r15, r5)
            goto L_0x0a21
        L_0x07ea:
            int[] r10 = r13.f14911c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.p148e.C4573ev.m19722g(r10, r9, r15, r5)
            goto L_0x0a21
        L_0x07fb:
            int[] r10 = r13.f14911c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.p148e.C4573ev.m19733l(r10, r9, r15, r5)
            goto L_0x0a21
        L_0x080c:
            int[] r10 = r13.f14911c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.p148e.C4573ev.m19734m(r10, r9, r15, r5)
            goto L_0x0a21
        L_0x081d:
            int[] r10 = r13.f14911c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.p148e.C4573ev.m19728i(r10, r9, r15, r5)
            goto L_0x0a21
        L_0x082e:
            int[] r10 = r13.f14911c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.p148e.C4573ev.m19702b(r10, r9, r15)
            goto L_0x0a21
        L_0x083f:
            int[] r10 = r13.f14911c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.e.et r11 = r13.m19562a(r1)
            com.google.android.gms.internal.p148e.C4573ev.m19690a(r10, r9, r15, r11)
            goto L_0x0a21
        L_0x0854:
            int[] r10 = r13.f14911c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.p148e.C4573ev.m19689a(r10, r9, r15)
            goto L_0x0a21
        L_0x0865:
            int[] r10 = r13.f14911c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.p148e.C4573ev.m19735n(r10, r9, r15, r5)
            goto L_0x0a21
        L_0x0876:
            int[] r10 = r13.f14911c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.p148e.C4573ev.m19732k(r10, r9, r15, r5)
            goto L_0x0a21
        L_0x0887:
            int[] r10 = r13.f14911c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.p148e.C4573ev.m19719f(r10, r9, r15, r5)
            goto L_0x0a21
        L_0x0898:
            int[] r10 = r13.f14911c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.p148e.C4573ev.m19725h(r10, r9, r15, r5)
            goto L_0x0a21
        L_0x08a9:
            int[] r10 = r13.f14911c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.p148e.C4573ev.m19712d(r10, r9, r15, r5)
            goto L_0x0a21
        L_0x08ba:
            int[] r10 = r13.f14911c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.p148e.C4573ev.m19708c(r10, r9, r15, r5)
            goto L_0x0a21
        L_0x08cb:
            int[] r10 = r13.f14911c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.p148e.C4573ev.m19704b(r10, r9, r15, r5)
            goto L_0x0a21
        L_0x08dc:
            int[] r10 = r13.f14911c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.p148e.C4573ev.m19691a(r10, r9, r15, r5)
            goto L_0x0a21
        L_0x08ed:
            boolean r11 = r13.m19572a((T) r14, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r11)
            com.google.android.gms.internal.e.et r11 = r13.m19562a(r1)
            r15.mo16538b(r10, r9, r11)
            goto L_0x0a21
        L_0x0902:
            boolean r11 = r13.m19572a((T) r14, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.p148e.C4601fr.m19857b(r14, r11)
            r15.mo16549e(r10, r11)
            goto L_0x0a21
        L_0x0913:
            boolean r11 = r13.m19572a((T) r14, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.p148e.C4601fr.m19841a(r14, r11)
            r15.mo16551f(r10, r9)
            goto L_0x0a21
        L_0x0924:
            boolean r11 = r13.m19572a((T) r14, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.p148e.C4601fr.m19857b(r14, r11)
            r15.mo16537b(r10, r11)
            goto L_0x0a21
        L_0x0935:
            boolean r11 = r13.m19572a((T) r14, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.p148e.C4601fr.m19841a(r14, r11)
            r15.mo16524a(r10, r9)
            goto L_0x0a21
        L_0x0946:
            boolean r11 = r13.m19572a((T) r14, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.p148e.C4601fr.m19841a(r14, r11)
            r15.mo16536b(r10, r9)
            goto L_0x0a21
        L_0x0957:
            boolean r11 = r13.m19572a((T) r14, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.p148e.C4601fr.m19841a(r14, r11)
            r15.mo16548e(r10, r9)
            goto L_0x0a21
        L_0x0968:
            boolean r11 = r13.m19572a((T) r14, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r11)
            com.google.android.gms.internal.e.bj r9 = (com.google.android.gms.internal.p148e.C4469bj) r9
            r15.mo16526a(r10, r9)
            goto L_0x0a21
        L_0x097b:
            boolean r11 = r13.m19572a((T) r14, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r11)
            com.google.android.gms.internal.e.et r11 = r13.m19562a(r1)
            r15.mo16529a(r10, r9, r11)
            goto L_0x0a21
        L_0x0990:
            boolean r11 = r13.m19572a((T) r14, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r11)
            m19567a(r10, r9, r15)
            goto L_0x0a21
        L_0x09a1:
            boolean r11 = r13.m19572a((T) r14, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            boolean r9 = com.google.android.gms.internal.p148e.C4601fr.m19865c(r14, r11)
            r15.mo16534a(r10, r9)
            goto L_0x0a21
        L_0x09b2:
            boolean r11 = r13.m19572a((T) r14, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.p148e.C4601fr.m19841a(r14, r11)
            r15.mo16545d(r10, r9)
            goto L_0x0a21
        L_0x09c2:
            boolean r11 = r13.m19572a((T) r14, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.p148e.C4601fr.m19857b(r14, r11)
            r15.mo16546d(r10, r11)
            goto L_0x0a21
        L_0x09d2:
            boolean r11 = r13.m19572a((T) r14, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.p148e.C4601fr.m19841a(r14, r11)
            r15.mo16542c(r10, r9)
            goto L_0x0a21
        L_0x09e2:
            boolean r11 = r13.m19572a((T) r14, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.p148e.C4601fr.m19857b(r14, r11)
            r15.mo16543c(r10, r11)
            goto L_0x0a21
        L_0x09f2:
            boolean r11 = r13.m19572a((T) r14, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.p148e.C4601fr.m19857b(r14, r11)
            r15.mo16525a(r10, r11)
            goto L_0x0a21
        L_0x0a02:
            boolean r11 = r13.m19572a((T) r14, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            float r9 = com.google.android.gms.internal.p148e.C4601fr.m19866d(r14, r11)
            r15.mo16523a(r10, r9)
            goto L_0x0a21
        L_0x0a12:
            boolean r11 = r13.m19572a((T) r14, r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            double r11 = com.google.android.gms.internal.p148e.C4601fr.m19871e(r14, r11)
            r15.mo16522a(r10, r11)
        L_0x0a21:
            int r1 = r1 + 3
            goto L_0x054d
        L_0x0a25:
            if (r8 == 0) goto L_0x0a3c
            com.google.android.gms.internal.e.ci<?> r1 = r13.f14926r
            r1.mo16575a(r15, r8)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0a3a
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            r8 = r1
            goto L_0x0a25
        L_0x0a3a:
            r8 = r3
            goto L_0x0a25
        L_0x0a3c:
            com.google.android.gms.internal.e.fl<?, ?> r0 = r13.f14925q
            m19568a(r0, (T) r14, r15)
            return
        L_0x0a42:
            r13.m19580b((T) r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p148e.C4558eg.mo16687a(java.lang.Object, com.google.android.gms.internal.e.gg):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0344, code lost:
        r14 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x051d, code lost:
        r5 = r12 + 3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0523  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m19580b(T r21, com.google.android.gms.internal.p148e.C4621gg r22) throws java.io.IOException {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            boolean r3 = r0.f14916h
            if (r3 == 0) goto L_0x0021
            com.google.android.gms.internal.e.ci<?> r3 = r0.f14926r
            com.google.android.gms.internal.e.cl r3 = r3.mo16570a(r1)
            boolean r5 = r3.mo16580b()
            if (r5 != 0) goto L_0x0021
            java.util.Iterator r3 = r3.mo16584e()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0023
        L_0x0021:
            r3 = 0
            r5 = 0
        L_0x0023:
            r6 = -1
            int[] r7 = r0.f14911c
            int r7 = r7.length
            sun.misc.Unsafe r9 = f14910b
            r10 = r5
            r5 = 0
            r11 = 0
        L_0x002c:
            if (r5 >= r7) goto L_0x0521
            int r12 = r0.m19585d(r5)
            int[] r13 = r0.f14911c
            r13 = r13[r5]
            r14 = 267386880(0xff00000, float:2.3665827E-29)
            r14 = r14 & r12
            int r14 = r14 >>> 20
            boolean r15 = r0.f14918j
            r16 = 1048575(0xfffff, float:1.469367E-39)
            if (r15 != 0) goto L_0x0061
            r15 = 17
            if (r14 > r15) goto L_0x0061
            int[] r15 = r0.f14911c
            int r17 = r5 + 2
            r15 = r15[r17]
            r8 = r15 & r16
            if (r8 == r6) goto L_0x0059
            r18 = r5
            long r4 = (long) r8
            int r11 = r9.getInt(r1, r4)
            r6 = r8
            goto L_0x005b
        L_0x0059:
            r18 = r5
        L_0x005b:
            int r4 = r15 >>> 20
            r5 = 1
            int r8 = r5 << r4
            goto L_0x0064
        L_0x0061:
            r18 = r5
            r8 = 0
        L_0x0064:
            if (r10 == 0) goto L_0x0083
            com.google.android.gms.internal.e.ci<?> r4 = r0.f14926r
            int r4 = r4.mo16569a(r10)
            if (r4 > r13) goto L_0x0083
            com.google.android.gms.internal.e.ci<?> r4 = r0.f14926r
            r4.mo16575a(r2, r10)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0081
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            r10 = r4
            goto L_0x0064
        L_0x0081:
            r10 = 0
            goto L_0x0064
        L_0x0083:
            r4 = r12 & r16
            long r4 = (long) r4
            switch(r14) {
                case 0: goto L_0x0510;
                case 1: goto L_0x0502;
                case 2: goto L_0x04f4;
                case 3: goto L_0x04e6;
                case 4: goto L_0x04d8;
                case 5: goto L_0x04ca;
                case 6: goto L_0x04bc;
                case 7: goto L_0x04ae;
                case 8: goto L_0x049f;
                case 9: goto L_0x048c;
                case 10: goto L_0x047b;
                case 11: goto L_0x046c;
                case 12: goto L_0x045d;
                case 13: goto L_0x044e;
                case 14: goto L_0x043f;
                case 15: goto L_0x0430;
                case 16: goto L_0x0421;
                case 17: goto L_0x040e;
                case 18: goto L_0x03fc;
                case 19: goto L_0x03ea;
                case 20: goto L_0x03d8;
                case 21: goto L_0x03c6;
                case 22: goto L_0x03b4;
                case 23: goto L_0x03a2;
                case 24: goto L_0x0390;
                case 25: goto L_0x037e;
                case 26: goto L_0x036d;
                case 27: goto L_0x0358;
                case 28: goto L_0x0347;
                case 29: goto L_0x0334;
                case 30: goto L_0x0323;
                case 31: goto L_0x0312;
                case 32: goto L_0x0301;
                case 33: goto L_0x02f0;
                case 34: goto L_0x02df;
                case 35: goto L_0x02cd;
                case 36: goto L_0x02bb;
                case 37: goto L_0x02a9;
                case 38: goto L_0x0297;
                case 39: goto L_0x0285;
                case 40: goto L_0x0273;
                case 41: goto L_0x0261;
                case 42: goto L_0x024f;
                case 43: goto L_0x023d;
                case 44: goto L_0x022b;
                case 45: goto L_0x0219;
                case 46: goto L_0x0207;
                case 47: goto L_0x01f5;
                case 48: goto L_0x01e3;
                case 49: goto L_0x01ce;
                case 50: goto L_0x01c3;
                case 51: goto L_0x01b2;
                case 52: goto L_0x01a1;
                case 53: goto L_0x0190;
                case 54: goto L_0x017f;
                case 55: goto L_0x016e;
                case 56: goto L_0x015d;
                case 57: goto L_0x014c;
                case 58: goto L_0x013b;
                case 59: goto L_0x012a;
                case 60: goto L_0x0115;
                case 61: goto L_0x0102;
                case 62: goto L_0x00f2;
                case 63: goto L_0x00e2;
                case 64: goto L_0x00d2;
                case 65: goto L_0x00c2;
                case 66: goto L_0x00b2;
                case 67: goto L_0x00a2;
                case 68: goto L_0x008e;
                default: goto L_0x0089;
            }
        L_0x0089:
            r12 = r18
        L_0x008b:
            r14 = 0
            goto L_0x051d
        L_0x008e:
            r12 = r18
            boolean r8 = r0.m19573a((T) r1, r13, r12)
            if (r8 == 0) goto L_0x008b
            java.lang.Object r4 = r9.getObject(r1, r4)
            com.google.android.gms.internal.e.et r5 = r0.m19562a(r12)
            r2.mo16538b(r13, r4, r5)
            goto L_0x008b
        L_0x00a2:
            r12 = r18
            boolean r8 = r0.m19573a((T) r1, r13, r12)
            if (r8 == 0) goto L_0x008b
            long r4 = m19588e(r1, r4)
            r2.mo16549e(r13, r4)
            goto L_0x008b
        L_0x00b2:
            r12 = r18
            boolean r8 = r0.m19573a((T) r1, r13, r12)
            if (r8 == 0) goto L_0x008b
            int r4 = m19586d(r1, r4)
            r2.mo16551f(r13, r4)
            goto L_0x008b
        L_0x00c2:
            r12 = r18
            boolean r8 = r0.m19573a((T) r1, r13, r12)
            if (r8 == 0) goto L_0x008b
            long r4 = m19588e(r1, r4)
            r2.mo16537b(r13, r4)
            goto L_0x008b
        L_0x00d2:
            r12 = r18
            boolean r8 = r0.m19573a((T) r1, r13, r12)
            if (r8 == 0) goto L_0x008b
            int r4 = m19586d(r1, r4)
            r2.mo16524a(r13, r4)
            goto L_0x008b
        L_0x00e2:
            r12 = r18
            boolean r8 = r0.m19573a((T) r1, r13, r12)
            if (r8 == 0) goto L_0x008b
            int r4 = m19586d(r1, r4)
            r2.mo16536b(r13, r4)
            goto L_0x008b
        L_0x00f2:
            r12 = r18
            boolean r8 = r0.m19573a((T) r1, r13, r12)
            if (r8 == 0) goto L_0x008b
            int r4 = m19586d(r1, r4)
            r2.mo16548e(r13, r4)
            goto L_0x008b
        L_0x0102:
            r12 = r18
            boolean r8 = r0.m19573a((T) r1, r13, r12)
            if (r8 == 0) goto L_0x008b
            java.lang.Object r4 = r9.getObject(r1, r4)
            com.google.android.gms.internal.e.bj r4 = (com.google.android.gms.internal.p148e.C4469bj) r4
            r2.mo16526a(r13, r4)
            goto L_0x008b
        L_0x0115:
            r12 = r18
            boolean r8 = r0.m19573a((T) r1, r13, r12)
            if (r8 == 0) goto L_0x008b
            java.lang.Object r4 = r9.getObject(r1, r4)
            com.google.android.gms.internal.e.et r5 = r0.m19562a(r12)
            r2.mo16529a(r13, r4, r5)
            goto L_0x008b
        L_0x012a:
            r12 = r18
            boolean r8 = r0.m19573a((T) r1, r13, r12)
            if (r8 == 0) goto L_0x008b
            java.lang.Object r4 = r9.getObject(r1, r4)
            m19567a(r13, r4, r2)
            goto L_0x008b
        L_0x013b:
            r12 = r18
            boolean r8 = r0.m19573a((T) r1, r13, r12)
            if (r8 == 0) goto L_0x008b
            boolean r4 = m19590f(r1, r4)
            r2.mo16534a(r13, r4)
            goto L_0x008b
        L_0x014c:
            r12 = r18
            boolean r8 = r0.m19573a((T) r1, r13, r12)
            if (r8 == 0) goto L_0x008b
            int r4 = m19586d(r1, r4)
            r2.mo16545d(r13, r4)
            goto L_0x008b
        L_0x015d:
            r12 = r18
            boolean r8 = r0.m19573a((T) r1, r13, r12)
            if (r8 == 0) goto L_0x008b
            long r4 = m19588e(r1, r4)
            r2.mo16546d(r13, r4)
            goto L_0x008b
        L_0x016e:
            r12 = r18
            boolean r8 = r0.m19573a((T) r1, r13, r12)
            if (r8 == 0) goto L_0x008b
            int r4 = m19586d(r1, r4)
            r2.mo16542c(r13, r4)
            goto L_0x008b
        L_0x017f:
            r12 = r18
            boolean r8 = r0.m19573a((T) r1, r13, r12)
            if (r8 == 0) goto L_0x008b
            long r4 = m19588e(r1, r4)
            r2.mo16543c(r13, r4)
            goto L_0x008b
        L_0x0190:
            r12 = r18
            boolean r8 = r0.m19573a((T) r1, r13, r12)
            if (r8 == 0) goto L_0x008b
            long r4 = m19588e(r1, r4)
            r2.mo16525a(r13, r4)
            goto L_0x008b
        L_0x01a1:
            r12 = r18
            boolean r8 = r0.m19573a((T) r1, r13, r12)
            if (r8 == 0) goto L_0x008b
            float r4 = m19582c(r1, r4)
            r2.mo16523a(r13, r4)
            goto L_0x008b
        L_0x01b2:
            r12 = r18
            boolean r8 = r0.m19573a((T) r1, r13, r12)
            if (r8 == 0) goto L_0x008b
            double r4 = m19576b((T) r1, r4)
            r2.mo16522a(r13, r4)
            goto L_0x008b
        L_0x01c3:
            r12 = r18
            java.lang.Object r4 = r9.getObject(r1, r4)
            r0.m19569a(r2, r13, r4, r12)
            goto L_0x008b
        L_0x01ce:
            r12 = r18
            int[] r8 = r0.f14911c
            r8 = r8[r12]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.e.et r5 = r0.m19562a(r12)
            com.google.android.gms.internal.p148e.C4573ev.m19703b(r8, r4, r2, r5)
            goto L_0x008b
        L_0x01e3:
            r12 = r18
            int[] r8 = r0.f14911c
            r8 = r8[r12]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            r13 = 1
            com.google.android.gms.internal.p148e.C4573ev.m19716e(r8, r4, r2, r13)
            goto L_0x008b
        L_0x01f5:
            r12 = r18
            r13 = 1
            int[] r8 = r0.f14911c
            r8 = r8[r12]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.p148e.C4573ev.m19731j(r8, r4, r2, r13)
            goto L_0x008b
        L_0x0207:
            r12 = r18
            r13 = 1
            int[] r8 = r0.f14911c
            r8 = r8[r12]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.p148e.C4573ev.m19722g(r8, r4, r2, r13)
            goto L_0x008b
        L_0x0219:
            r12 = r18
            r13 = 1
            int[] r8 = r0.f14911c
            r8 = r8[r12]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.p148e.C4573ev.m19733l(r8, r4, r2, r13)
            goto L_0x008b
        L_0x022b:
            r12 = r18
            r13 = 1
            int[] r8 = r0.f14911c
            r8 = r8[r12]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.p148e.C4573ev.m19734m(r8, r4, r2, r13)
            goto L_0x008b
        L_0x023d:
            r12 = r18
            r13 = 1
            int[] r8 = r0.f14911c
            r8 = r8[r12]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.p148e.C4573ev.m19728i(r8, r4, r2, r13)
            goto L_0x008b
        L_0x024f:
            r12 = r18
            r13 = 1
            int[] r8 = r0.f14911c
            r8 = r8[r12]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.p148e.C4573ev.m19735n(r8, r4, r2, r13)
            goto L_0x008b
        L_0x0261:
            r12 = r18
            r13 = 1
            int[] r8 = r0.f14911c
            r8 = r8[r12]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.p148e.C4573ev.m19732k(r8, r4, r2, r13)
            goto L_0x008b
        L_0x0273:
            r12 = r18
            r13 = 1
            int[] r8 = r0.f14911c
            r8 = r8[r12]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.p148e.C4573ev.m19719f(r8, r4, r2, r13)
            goto L_0x008b
        L_0x0285:
            r12 = r18
            r13 = 1
            int[] r8 = r0.f14911c
            r8 = r8[r12]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.p148e.C4573ev.m19725h(r8, r4, r2, r13)
            goto L_0x008b
        L_0x0297:
            r12 = r18
            r13 = 1
            int[] r8 = r0.f14911c
            r8 = r8[r12]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.p148e.C4573ev.m19712d(r8, r4, r2, r13)
            goto L_0x008b
        L_0x02a9:
            r12 = r18
            r13 = 1
            int[] r8 = r0.f14911c
            r8 = r8[r12]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.p148e.C4573ev.m19708c(r8, r4, r2, r13)
            goto L_0x008b
        L_0x02bb:
            r12 = r18
            r13 = 1
            int[] r8 = r0.f14911c
            r8 = r8[r12]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.p148e.C4573ev.m19704b(r8, r4, r2, r13)
            goto L_0x008b
        L_0x02cd:
            r12 = r18
            r13 = 1
            int[] r8 = r0.f14911c
            r8 = r8[r12]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.p148e.C4573ev.m19691a(r8, r4, r2, r13)
            goto L_0x008b
        L_0x02df:
            r12 = r18
            int[] r8 = r0.f14911c
            r8 = r8[r12]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            r13 = 0
            com.google.android.gms.internal.p148e.C4573ev.m19716e(r8, r4, r2, r13)
            goto L_0x0344
        L_0x02f0:
            r12 = r18
            r13 = 0
            int[] r8 = r0.f14911c
            r8 = r8[r12]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.p148e.C4573ev.m19731j(r8, r4, r2, r13)
            goto L_0x0344
        L_0x0301:
            r12 = r18
            r13 = 0
            int[] r8 = r0.f14911c
            r8 = r8[r12]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.p148e.C4573ev.m19722g(r8, r4, r2, r13)
            goto L_0x0344
        L_0x0312:
            r12 = r18
            r13 = 0
            int[] r8 = r0.f14911c
            r8 = r8[r12]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.p148e.C4573ev.m19733l(r8, r4, r2, r13)
            goto L_0x0344
        L_0x0323:
            r12 = r18
            r13 = 0
            int[] r8 = r0.f14911c
            r8 = r8[r12]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.p148e.C4573ev.m19734m(r8, r4, r2, r13)
            goto L_0x0344
        L_0x0334:
            r12 = r18
            r13 = 0
            int[] r8 = r0.f14911c
            r8 = r8[r12]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.p148e.C4573ev.m19728i(r8, r4, r2, r13)
        L_0x0344:
            r14 = r13
            goto L_0x051d
        L_0x0347:
            r12 = r18
            int[] r8 = r0.f14911c
            r8 = r8[r12]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.p148e.C4573ev.m19702b(r8, r4, r2)
            goto L_0x008b
        L_0x0358:
            r12 = r18
            int[] r8 = r0.f14911c
            r8 = r8[r12]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.e.et r5 = r0.m19562a(r12)
            com.google.android.gms.internal.p148e.C4573ev.m19690a(r8, r4, r2, r5)
            goto L_0x008b
        L_0x036d:
            r12 = r18
            int[] r8 = r0.f14911c
            r8 = r8[r12]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.p148e.C4573ev.m19689a(r8, r4, r2)
            goto L_0x008b
        L_0x037e:
            r12 = r18
            int[] r8 = r0.f14911c
            r8 = r8[r12]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            r14 = 0
            com.google.android.gms.internal.p148e.C4573ev.m19735n(r8, r4, r2, r14)
            goto L_0x051d
        L_0x0390:
            r12 = r18
            r14 = 0
            int[] r8 = r0.f14911c
            r8 = r8[r12]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.p148e.C4573ev.m19732k(r8, r4, r2, r14)
            goto L_0x051d
        L_0x03a2:
            r12 = r18
            r14 = 0
            int[] r8 = r0.f14911c
            r8 = r8[r12]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.p148e.C4573ev.m19719f(r8, r4, r2, r14)
            goto L_0x051d
        L_0x03b4:
            r12 = r18
            r14 = 0
            int[] r8 = r0.f14911c
            r8 = r8[r12]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.p148e.C4573ev.m19725h(r8, r4, r2, r14)
            goto L_0x051d
        L_0x03c6:
            r12 = r18
            r14 = 0
            int[] r8 = r0.f14911c
            r8 = r8[r12]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.p148e.C4573ev.m19712d(r8, r4, r2, r14)
            goto L_0x051d
        L_0x03d8:
            r12 = r18
            r14 = 0
            int[] r8 = r0.f14911c
            r8 = r8[r12]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.p148e.C4573ev.m19708c(r8, r4, r2, r14)
            goto L_0x051d
        L_0x03ea:
            r12 = r18
            r14 = 0
            int[] r8 = r0.f14911c
            r8 = r8[r12]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.p148e.C4573ev.m19704b(r8, r4, r2, r14)
            goto L_0x051d
        L_0x03fc:
            r12 = r18
            r14 = 0
            int[] r8 = r0.f14911c
            r8 = r8[r12]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.p148e.C4573ev.m19691a(r8, r4, r2, r14)
            goto L_0x051d
        L_0x040e:
            r12 = r18
            r14 = 0
            r8 = r8 & r11
            if (r8 == 0) goto L_0x051d
            java.lang.Object r4 = r9.getObject(r1, r4)
            com.google.android.gms.internal.e.et r5 = r0.m19562a(r12)
            r2.mo16538b(r13, r4, r5)
            goto L_0x051d
        L_0x0421:
            r12 = r18
            r14 = 0
            r8 = r8 & r11
            if (r8 == 0) goto L_0x051d
            long r4 = r9.getLong(r1, r4)
            r2.mo16549e(r13, r4)
            goto L_0x051d
        L_0x0430:
            r12 = r18
            r14 = 0
            r8 = r8 & r11
            if (r8 == 0) goto L_0x051d
            int r4 = r9.getInt(r1, r4)
            r2.mo16551f(r13, r4)
            goto L_0x051d
        L_0x043f:
            r12 = r18
            r14 = 0
            r8 = r8 & r11
            if (r8 == 0) goto L_0x051d
            long r4 = r9.getLong(r1, r4)
            r2.mo16537b(r13, r4)
            goto L_0x051d
        L_0x044e:
            r12 = r18
            r14 = 0
            r8 = r8 & r11
            if (r8 == 0) goto L_0x051d
            int r4 = r9.getInt(r1, r4)
            r2.mo16524a(r13, r4)
            goto L_0x051d
        L_0x045d:
            r12 = r18
            r14 = 0
            r8 = r8 & r11
            if (r8 == 0) goto L_0x051d
            int r4 = r9.getInt(r1, r4)
            r2.mo16536b(r13, r4)
            goto L_0x051d
        L_0x046c:
            r12 = r18
            r14 = 0
            r8 = r8 & r11
            if (r8 == 0) goto L_0x051d
            int r4 = r9.getInt(r1, r4)
            r2.mo16548e(r13, r4)
            goto L_0x051d
        L_0x047b:
            r12 = r18
            r14 = 0
            r8 = r8 & r11
            if (r8 == 0) goto L_0x051d
            java.lang.Object r4 = r9.getObject(r1, r4)
            com.google.android.gms.internal.e.bj r4 = (com.google.android.gms.internal.p148e.C4469bj) r4
            r2.mo16526a(r13, r4)
            goto L_0x051d
        L_0x048c:
            r12 = r18
            r14 = 0
            r8 = r8 & r11
            if (r8 == 0) goto L_0x051d
            java.lang.Object r4 = r9.getObject(r1, r4)
            com.google.android.gms.internal.e.et r5 = r0.m19562a(r12)
            r2.mo16529a(r13, r4, r5)
            goto L_0x051d
        L_0x049f:
            r12 = r18
            r14 = 0
            r8 = r8 & r11
            if (r8 == 0) goto L_0x051d
            java.lang.Object r4 = r9.getObject(r1, r4)
            m19567a(r13, r4, r2)
            goto L_0x051d
        L_0x04ae:
            r12 = r18
            r14 = 0
            r8 = r8 & r11
            if (r8 == 0) goto L_0x051d
            boolean r4 = com.google.android.gms.internal.p148e.C4601fr.m19865c(r1, r4)
            r2.mo16534a(r13, r4)
            goto L_0x051d
        L_0x04bc:
            r12 = r18
            r14 = 0
            r8 = r8 & r11
            if (r8 == 0) goto L_0x051d
            int r4 = r9.getInt(r1, r4)
            r2.mo16545d(r13, r4)
            goto L_0x051d
        L_0x04ca:
            r12 = r18
            r14 = 0
            r8 = r8 & r11
            if (r8 == 0) goto L_0x051d
            long r4 = r9.getLong(r1, r4)
            r2.mo16546d(r13, r4)
            goto L_0x051d
        L_0x04d8:
            r12 = r18
            r14 = 0
            r8 = r8 & r11
            if (r8 == 0) goto L_0x051d
            int r4 = r9.getInt(r1, r4)
            r2.mo16542c(r13, r4)
            goto L_0x051d
        L_0x04e6:
            r12 = r18
            r14 = 0
            r8 = r8 & r11
            if (r8 == 0) goto L_0x051d
            long r4 = r9.getLong(r1, r4)
            r2.mo16543c(r13, r4)
            goto L_0x051d
        L_0x04f4:
            r12 = r18
            r14 = 0
            r8 = r8 & r11
            if (r8 == 0) goto L_0x051d
            long r4 = r9.getLong(r1, r4)
            r2.mo16525a(r13, r4)
            goto L_0x051d
        L_0x0502:
            r12 = r18
            r14 = 0
            r8 = r8 & r11
            if (r8 == 0) goto L_0x051d
            float r4 = com.google.android.gms.internal.p148e.C4601fr.m19866d(r1, r4)
            r2.mo16523a(r13, r4)
            goto L_0x051d
        L_0x0510:
            r12 = r18
            r14 = 0
            r8 = r8 & r11
            if (r8 == 0) goto L_0x051d
            double r4 = com.google.android.gms.internal.p148e.C4601fr.m19871e(r1, r4)
            r2.mo16522a(r13, r4)
        L_0x051d:
            int r5 = r12 + 3
            goto L_0x002c
        L_0x0521:
            if (r10 == 0) goto L_0x0538
            com.google.android.gms.internal.e.ci<?> r4 = r0.f14926r
            r4.mo16575a(r2, r10)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0536
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            r10 = r4
            goto L_0x0521
        L_0x0536:
            r10 = 0
            goto L_0x0521
        L_0x0538:
            com.google.android.gms.internal.e.fl<?, ?> r3 = r0.f14925q
            m19568a(r3, (T) r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p148e.C4558eg.m19580b(java.lang.Object, com.google.android.gms.internal.e.gg):void");
    }

    /* renamed from: a */
    private final <K, V> void m19569a(C4621gg ggVar, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            ggVar.mo16527a(i, this.f14927s.mo16680f(m19577b(i2)), this.f14927s.mo16676b(obj));
        }
    }

    /* renamed from: a */
    private static <UT, UB> void m19568a(C4595fl<UT, UB> flVar, T t, C4621gg ggVar) throws IOException {
        flVar.mo16751a(flVar.mo16755b(t), ggVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:168:?, code lost:
        r12.mo16753a(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x05bb, code lost:
        if (r15 == null) goto L_0x05bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x05bd, code lost:
        r15 = r12.mo16759c(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x05c6, code lost:
        if (r12.mo16754a(r15, r10) == false) goto L_0x05c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x05c8, code lost:
        r3 = r1.f14921m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x05cc, code lost:
        if (r3 < r1.f14922n) goto L_0x05ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x05ce, code lost:
        r15 = m19564a((java.lang.Object) r2, r1.f14920l[r3], (UB) r15, r12);
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x05d9, code lost:
        if (r15 != null) goto L_0x05db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x05db, code lost:
        r12.mo16758b((java.lang.Object) r2, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x05de, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:167:0x05b8 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16686a(T r18, com.google.android.gms.internal.p148e.C4570es r19, com.google.android.gms.internal.p148e.C4499ch r20) throws java.io.IOException {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            r10 = r19
            r11 = r20
            if (r11 != 0) goto L_0x0010
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            r2.<init>()
            throw r2
        L_0x0010:
            com.google.android.gms.internal.e.fl<?, ?> r12 = r1.f14925q
            com.google.android.gms.internal.e.ci<?> r13 = r1.f14926r
            r14 = 0
            r3 = r14
            r15 = r3
        L_0x0017:
            int r4 = r19.mo16440a()     // Catch:{ all -> 0x05df }
            int r5 = r1.f14913e     // Catch:{ all -> 0x05df }
            if (r4 < r5) goto L_0x0042
            int r5 = r1.f14914f     // Catch:{ all -> 0x05df }
            if (r4 > r5) goto L_0x0042
            r5 = 0
            int[] r7 = r1.f14911c     // Catch:{ all -> 0x05df }
            int r7 = r7.length     // Catch:{ all -> 0x05df }
            int r7 = r7 / 3
            int r7 = r7 + -1
        L_0x002b:
            if (r5 > r7) goto L_0x0042
            int r8 = r7 + r5
            int r8 = r8 >>> 1
            int r9 = r8 * 3
            int[] r6 = r1.f14911c     // Catch:{ all -> 0x05df }
            r6 = r6[r9]     // Catch:{ all -> 0x05df }
            if (r4 != r6) goto L_0x003a
            goto L_0x0043
        L_0x003a:
            if (r4 >= r6) goto L_0x003f
            int r7 = r8 + -1
            goto L_0x002b
        L_0x003f:
            int r5 = r8 + 1
            goto L_0x002b
        L_0x0042:
            r9 = -1
        L_0x0043:
            if (r9 >= 0) goto L_0x00ae
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 != r5) goto L_0x0061
            int r3 = r1.f14921m
        L_0x004c:
            int r4 = r1.f14922n
            if (r3 >= r4) goto L_0x005b
            int[] r4 = r1.f14920l
            r4 = r4[r3]
            java.lang.Object r15 = r1.m19564a(r2, r4, (UB) r15, r12)
            int r3 = r3 + 1
            goto L_0x004c
        L_0x005b:
            if (r15 == 0) goto L_0x0060
            r12.mo16758b(r2, r15)
        L_0x0060:
            return
        L_0x0061:
            boolean r5 = r1.f14916h     // Catch:{ all -> 0x05df }
            if (r5 != 0) goto L_0x0067
            r5 = r14
            goto L_0x006e
        L_0x0067:
            com.google.android.gms.internal.e.ec r5 = r1.f14915g     // Catch:{ all -> 0x05df }
            java.lang.Object r4 = r13.mo16571a(r11, r5, r4)     // Catch:{ all -> 0x05df }
            r5 = r4
        L_0x006e:
            if (r5 == 0) goto L_0x0087
            if (r3 != 0) goto L_0x0076
            com.google.android.gms.internal.e.cl r3 = r13.mo16577b(r2)     // Catch:{ all -> 0x05df }
        L_0x0076:
            r16 = r3
            r3 = r13
            r4 = r10
            r6 = r11
            r7 = r16
            r8 = r15
            r9 = r12
            java.lang.Object r3 = r3.mo16572a(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x05df }
            r15 = r3
            r3 = r16
            goto L_0x0017
        L_0x0087:
            r12.mo16753a(r10)     // Catch:{ all -> 0x05df }
            if (r15 != 0) goto L_0x0091
            java.lang.Object r4 = r12.mo16759c(r2)     // Catch:{ all -> 0x05df }
            r15 = r4
        L_0x0091:
            boolean r4 = r12.mo16754a(r15, r10)     // Catch:{ all -> 0x05df }
            if (r4 != 0) goto L_0x0017
            int r3 = r1.f14921m
        L_0x0099:
            int r4 = r1.f14922n
            if (r3 >= r4) goto L_0x00a8
            int[] r4 = r1.f14920l
            r4 = r4[r3]
            java.lang.Object r15 = r1.m19564a(r2, r4, (UB) r15, r12)
            int r3 = r3 + 1
            goto L_0x0099
        L_0x00a8:
            if (r15 == 0) goto L_0x00ad
            r12.mo16758b(r2, r15)
        L_0x00ad:
            return
        L_0x00ae:
            int r5 = r1.m19585d(r9)     // Catch:{ all -> 0x05df }
            r6 = 267386880(0xff00000, float:2.3665827E-29)
            r6 = r6 & r5
            int r6 = r6 >>> 20
            r7 = 1048575(0xfffff, float:1.469367E-39)
            switch(r6) {
                case 0: goto L_0x058b;
                case 1: goto L_0x057c;
                case 2: goto L_0x056d;
                case 3: goto L_0x055e;
                case 4: goto L_0x054f;
                case 5: goto L_0x0540;
                case 6: goto L_0x0531;
                case 7: goto L_0x0522;
                case 8: goto L_0x051a;
                case 9: goto L_0x04e9;
                case 10: goto L_0x04da;
                case 11: goto L_0x04cb;
                case 12: goto L_0x04a9;
                case 13: goto L_0x049a;
                case 14: goto L_0x048b;
                case 15: goto L_0x047c;
                case 16: goto L_0x046d;
                case 17: goto L_0x043c;
                case 18: goto L_0x042f;
                case 19: goto L_0x0422;
                case 20: goto L_0x0415;
                case 21: goto L_0x0408;
                case 22: goto L_0x03fb;
                case 23: goto L_0x03ee;
                case 24: goto L_0x03e1;
                case 25: goto L_0x03d4;
                case 26: goto L_0x03b4;
                case 27: goto L_0x03a3;
                case 28: goto L_0x0396;
                case 29: goto L_0x0389;
                case 30: goto L_0x0373;
                case 31: goto L_0x0366;
                case 32: goto L_0x0359;
                case 33: goto L_0x034c;
                case 34: goto L_0x033f;
                case 35: goto L_0x0332;
                case 36: goto L_0x0325;
                case 37: goto L_0x0318;
                case 38: goto L_0x030b;
                case 39: goto L_0x02fe;
                case 40: goto L_0x02f1;
                case 41: goto L_0x02e4;
                case 42: goto L_0x02d7;
                case 43: goto L_0x02ca;
                case 44: goto L_0x02b5;
                case 45: goto L_0x02a8;
                case 46: goto L_0x029b;
                case 47: goto L_0x028e;
                case 48: goto L_0x0281;
                case 49: goto L_0x026f;
                case 50: goto L_0x022d;
                case 51: goto L_0x021b;
                case 52: goto L_0x0209;
                case 53: goto L_0x01f7;
                case 54: goto L_0x01e5;
                case 55: goto L_0x01d3;
                case 56: goto L_0x01c1;
                case 57: goto L_0x01af;
                case 58: goto L_0x019d;
                case 59: goto L_0x0195;
                case 60: goto L_0x0164;
                case 61: goto L_0x0156;
                case 62: goto L_0x0144;
                case 63: goto L_0x011f;
                case 64: goto L_0x010d;
                case 65: goto L_0x00fb;
                case 66: goto L_0x00e9;
                case 67: goto L_0x00d7;
                case 68: goto L_0x00c5;
                default: goto L_0x00bd;
            }
        L_0x00bd:
            if (r15 != 0) goto L_0x059b
            java.lang.Object r4 = r12.mo16745a()     // Catch:{ dc -> 0x05b8 }
            goto L_0x059a
        L_0x00c5:
            r5 = r5 & r7
            long r5 = (long) r5     // Catch:{ dc -> 0x05b8 }
            com.google.android.gms.internal.e.et r7 = r1.m19562a(r9)     // Catch:{ dc -> 0x05b8 }
            java.lang.Object r7 = r10.mo16446b(r7, r11)     // Catch:{ dc -> 0x05b8 }
            com.google.android.gms.internal.p148e.C4601fr.m19851a(r2, r5, r7)     // Catch:{ dc -> 0x05b8 }
            r1.m19579b((T) r2, r4, r9)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x00d7:
            r5 = r5 & r7
            long r5 = (long) r5     // Catch:{ dc -> 0x05b8 }
            long r7 = r19.mo16481t()     // Catch:{ dc -> 0x05b8 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ dc -> 0x05b8 }
            com.google.android.gms.internal.p148e.C4601fr.m19851a(r2, r5, r7)     // Catch:{ dc -> 0x05b8 }
            r1.m19579b((T) r2, r4, r9)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x00e9:
            r5 = r5 & r7
            long r5 = (long) r5     // Catch:{ dc -> 0x05b8 }
            int r7 = r19.mo16480s()     // Catch:{ dc -> 0x05b8 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ dc -> 0x05b8 }
            com.google.android.gms.internal.p148e.C4601fr.m19851a(r2, r5, r7)     // Catch:{ dc -> 0x05b8 }
            r1.m19579b((T) r2, r4, r9)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x00fb:
            r5 = r5 & r7
            long r5 = (long) r5     // Catch:{ dc -> 0x05b8 }
            long r7 = r19.mo16479r()     // Catch:{ dc -> 0x05b8 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ dc -> 0x05b8 }
            com.google.android.gms.internal.p148e.C4601fr.m19851a(r2, r5, r7)     // Catch:{ dc -> 0x05b8 }
            r1.m19579b((T) r2, r4, r9)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x010d:
            r5 = r5 & r7
            long r5 = (long) r5     // Catch:{ dc -> 0x05b8 }
            int r7 = r19.mo16477q()     // Catch:{ dc -> 0x05b8 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ dc -> 0x05b8 }
            com.google.android.gms.internal.p148e.C4601fr.m19851a(r2, r5, r7)     // Catch:{ dc -> 0x05b8 }
            r1.m19579b((T) r2, r4, r9)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x011f:
            int r6 = r19.mo16475p()     // Catch:{ dc -> 0x05b8 }
            com.google.android.gms.internal.e.cz r8 = r1.m19583c(r9)     // Catch:{ dc -> 0x05b8 }
            if (r8 == 0) goto L_0x0136
            boolean r8 = r8.mo16630a(r6)     // Catch:{ dc -> 0x05b8 }
            if (r8 == 0) goto L_0x0130
            goto L_0x0136
        L_0x0130:
            java.lang.Object r4 = com.google.android.gms.internal.p148e.C4573ev.m19687a(r4, r6, r15, r12)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0386
        L_0x0136:
            r5 = r5 & r7
            long r7 = (long) r5     // Catch:{ dc -> 0x05b8 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)     // Catch:{ dc -> 0x05b8 }
            com.google.android.gms.internal.p148e.C4601fr.m19851a(r2, r7, r5)     // Catch:{ dc -> 0x05b8 }
            r1.m19579b((T) r2, r4, r9)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x0144:
            r5 = r5 & r7
            long r5 = (long) r5     // Catch:{ dc -> 0x05b8 }
            int r7 = r19.mo16473o()     // Catch:{ dc -> 0x05b8 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ dc -> 0x05b8 }
            com.google.android.gms.internal.p148e.C4601fr.m19851a(r2, r5, r7)     // Catch:{ dc -> 0x05b8 }
            r1.m19579b((T) r2, r4, r9)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x0156:
            r5 = r5 & r7
            long r5 = (long) r5     // Catch:{ dc -> 0x05b8 }
            com.google.android.gms.internal.e.bj r7 = r19.mo16471n()     // Catch:{ dc -> 0x05b8 }
            com.google.android.gms.internal.p148e.C4601fr.m19851a(r2, r5, r7)     // Catch:{ dc -> 0x05b8 }
            r1.m19579b((T) r2, r4, r9)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x0164:
            boolean r6 = r1.m19573a((T) r2, r4, r9)     // Catch:{ dc -> 0x05b8 }
            if (r6 == 0) goto L_0x0180
            r5 = r5 & r7
            long r5 = (long) r5     // Catch:{ dc -> 0x05b8 }
            java.lang.Object r7 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r2, r5)     // Catch:{ dc -> 0x05b8 }
            com.google.android.gms.internal.e.et r8 = r1.m19562a(r9)     // Catch:{ dc -> 0x05b8 }
            java.lang.Object r8 = r10.mo16441a(r8, r11)     // Catch:{ dc -> 0x05b8 }
            java.lang.Object r7 = com.google.android.gms.internal.p148e.C4520cw.m19447a(r7, r8)     // Catch:{ dc -> 0x05b8 }
            com.google.android.gms.internal.p148e.C4601fr.m19851a(r2, r5, r7)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0190
        L_0x0180:
            r5 = r5 & r7
            long r5 = (long) r5     // Catch:{ dc -> 0x05b8 }
            com.google.android.gms.internal.e.et r7 = r1.m19562a(r9)     // Catch:{ dc -> 0x05b8 }
            java.lang.Object r7 = r10.mo16441a(r7, r11)     // Catch:{ dc -> 0x05b8 }
            com.google.android.gms.internal.p148e.C4601fr.m19851a(r2, r5, r7)     // Catch:{ dc -> 0x05b8 }
            r1.m19578b((T) r2, r9)     // Catch:{ dc -> 0x05b8 }
        L_0x0190:
            r1.m19579b((T) r2, r4, r9)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x0195:
            r1.m19570a(r2, r5, r10)     // Catch:{ dc -> 0x05b8 }
            r1.m19579b((T) r2, r4, r9)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x019d:
            r5 = r5 & r7
            long r5 = (long) r5     // Catch:{ dc -> 0x05b8 }
            boolean r7 = r19.mo16466k()     // Catch:{ dc -> 0x05b8 }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ dc -> 0x05b8 }
            com.google.android.gms.internal.p148e.C4601fr.m19851a(r2, r5, r7)     // Catch:{ dc -> 0x05b8 }
            r1.m19579b((T) r2, r4, r9)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x01af:
            r5 = r5 & r7
            long r5 = (long) r5     // Catch:{ dc -> 0x05b8 }
            int r7 = r19.mo16463j()     // Catch:{ dc -> 0x05b8 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ dc -> 0x05b8 }
            com.google.android.gms.internal.p148e.C4601fr.m19851a(r2, r5, r7)     // Catch:{ dc -> 0x05b8 }
            r1.m19579b((T) r2, r4, r9)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x01c1:
            r5 = r5 & r7
            long r5 = (long) r5     // Catch:{ dc -> 0x05b8 }
            long r7 = r19.mo16461i()     // Catch:{ dc -> 0x05b8 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ dc -> 0x05b8 }
            com.google.android.gms.internal.p148e.C4601fr.m19851a(r2, r5, r7)     // Catch:{ dc -> 0x05b8 }
            r1.m19579b((T) r2, r4, r9)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x01d3:
            r5 = r5 & r7
            long r5 = (long) r5     // Catch:{ dc -> 0x05b8 }
            int r7 = r19.mo16459h()     // Catch:{ dc -> 0x05b8 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ dc -> 0x05b8 }
            com.google.android.gms.internal.p148e.C4601fr.m19851a(r2, r5, r7)     // Catch:{ dc -> 0x05b8 }
            r1.m19579b((T) r2, r4, r9)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x01e5:
            r5 = r5 & r7
            long r5 = (long) r5     // Catch:{ dc -> 0x05b8 }
            long r7 = r19.mo16455f()     // Catch:{ dc -> 0x05b8 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ dc -> 0x05b8 }
            com.google.android.gms.internal.p148e.C4601fr.m19851a(r2, r5, r7)     // Catch:{ dc -> 0x05b8 }
            r1.m19579b((T) r2, r4, r9)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x01f7:
            r5 = r5 & r7
            long r5 = (long) r5     // Catch:{ dc -> 0x05b8 }
            long r7 = r19.mo16457g()     // Catch:{ dc -> 0x05b8 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ dc -> 0x05b8 }
            com.google.android.gms.internal.p148e.C4601fr.m19851a(r2, r5, r7)     // Catch:{ dc -> 0x05b8 }
            r1.m19579b((T) r2, r4, r9)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x0209:
            r5 = r5 & r7
            long r5 = (long) r5     // Catch:{ dc -> 0x05b8 }
            float r7 = r19.mo16453e()     // Catch:{ dc -> 0x05b8 }
            java.lang.Float r7 = java.lang.Float.valueOf(r7)     // Catch:{ dc -> 0x05b8 }
            com.google.android.gms.internal.p148e.C4601fr.m19851a(r2, r5, r7)     // Catch:{ dc -> 0x05b8 }
            r1.m19579b((T) r2, r4, r9)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x021b:
            r5 = r5 & r7
            long r5 = (long) r5     // Catch:{ dc -> 0x05b8 }
            double r7 = r19.mo16451d()     // Catch:{ dc -> 0x05b8 }
            java.lang.Double r7 = java.lang.Double.valueOf(r7)     // Catch:{ dc -> 0x05b8 }
            com.google.android.gms.internal.p148e.C4601fr.m19851a(r2, r5, r7)     // Catch:{ dc -> 0x05b8 }
            r1.m19579b((T) r2, r4, r9)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x022d:
            java.lang.Object r4 = r1.m19577b(r9)     // Catch:{ dc -> 0x05b8 }
            int r5 = r1.m19585d(r9)     // Catch:{ dc -> 0x05b8 }
            r5 = r5 & r7
            long r5 = (long) r5     // Catch:{ dc -> 0x05b8 }
            java.lang.Object r7 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r2, r5)     // Catch:{ dc -> 0x05b8 }
            if (r7 != 0) goto L_0x0247
            com.google.android.gms.internal.e.dx r7 = r1.f14927s     // Catch:{ dc -> 0x05b8 }
            java.lang.Object r7 = r7.mo16679e(r4)     // Catch:{ dc -> 0x05b8 }
            com.google.android.gms.internal.p148e.C4601fr.m19851a(r2, r5, r7)     // Catch:{ dc -> 0x05b8 }
            goto L_0x025e
        L_0x0247:
            com.google.android.gms.internal.e.dx r8 = r1.f14927s     // Catch:{ dc -> 0x05b8 }
            boolean r8 = r8.mo16677c(r7)     // Catch:{ dc -> 0x05b8 }
            if (r8 == 0) goto L_0x025e
            com.google.android.gms.internal.e.dx r8 = r1.f14927s     // Catch:{ dc -> 0x05b8 }
            java.lang.Object r8 = r8.mo16679e(r4)     // Catch:{ dc -> 0x05b8 }
            com.google.android.gms.internal.e.dx r9 = r1.f14927s     // Catch:{ dc -> 0x05b8 }
            r9.mo16674a(r8, r7)     // Catch:{ dc -> 0x05b8 }
            com.google.android.gms.internal.p148e.C4601fr.m19851a(r2, r5, r8)     // Catch:{ dc -> 0x05b8 }
            r7 = r8
        L_0x025e:
            com.google.android.gms.internal.e.dx r5 = r1.f14927s     // Catch:{ dc -> 0x05b8 }
            java.util.Map r5 = r5.mo16675a(r7)     // Catch:{ dc -> 0x05b8 }
            com.google.android.gms.internal.e.dx r6 = r1.f14927s     // Catch:{ dc -> 0x05b8 }
            com.google.android.gms.internal.e.dv r4 = r6.mo16680f(r4)     // Catch:{ dc -> 0x05b8 }
            r10.mo16444a(r5, r4, r11)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x026f:
            r4 = r5 & r7
            long r4 = (long) r4     // Catch:{ dc -> 0x05b8 }
            com.google.android.gms.internal.e.et r6 = r1.m19562a(r9)     // Catch:{ dc -> 0x05b8 }
            com.google.android.gms.internal.e.dm r7 = r1.f14924p     // Catch:{ dc -> 0x05b8 }
            java.util.List r4 = r7.mo16653a(r2, r4)     // Catch:{ dc -> 0x05b8 }
            r10.mo16448b(r4, r6, r11)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x0281:
            com.google.android.gms.internal.e.dm r4 = r1.f14924p     // Catch:{ dc -> 0x05b8 }
            r5 = r5 & r7
            long r5 = (long) r5     // Catch:{ dc -> 0x05b8 }
            java.util.List r4 = r4.mo16653a(r2, r5)     // Catch:{ dc -> 0x05b8 }
            r10.mo16478q(r4)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x028e:
            com.google.android.gms.internal.e.dm r4 = r1.f14924p     // Catch:{ dc -> 0x05b8 }
            r5 = r5 & r7
            long r5 = (long) r5     // Catch:{ dc -> 0x05b8 }
            java.util.List r4 = r4.mo16653a(r2, r5)     // Catch:{ dc -> 0x05b8 }
            r10.mo16476p(r4)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x029b:
            com.google.android.gms.internal.e.dm r4 = r1.f14924p     // Catch:{ dc -> 0x05b8 }
            r5 = r5 & r7
            long r5 = (long) r5     // Catch:{ dc -> 0x05b8 }
            java.util.List r4 = r4.mo16653a(r2, r5)     // Catch:{ dc -> 0x05b8 }
            r10.mo16474o(r4)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x02a8:
            com.google.android.gms.internal.e.dm r4 = r1.f14924p     // Catch:{ dc -> 0x05b8 }
            r5 = r5 & r7
            long r5 = (long) r5     // Catch:{ dc -> 0x05b8 }
            java.util.List r4 = r4.mo16653a(r2, r5)     // Catch:{ dc -> 0x05b8 }
            r10.mo16472n(r4)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x02b5:
            com.google.android.gms.internal.e.dm r6 = r1.f14924p     // Catch:{ dc -> 0x05b8 }
            r5 = r5 & r7
            long r7 = (long) r5     // Catch:{ dc -> 0x05b8 }
            java.util.List r5 = r6.mo16653a(r2, r7)     // Catch:{ dc -> 0x05b8 }
            r10.mo16470m(r5)     // Catch:{ dc -> 0x05b8 }
            com.google.android.gms.internal.e.cz r6 = r1.m19583c(r9)     // Catch:{ dc -> 0x05b8 }
            java.lang.Object r4 = com.google.android.gms.internal.p148e.C4573ev.m19688a(r4, r5, r6, r15, r12)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0386
        L_0x02ca:
            com.google.android.gms.internal.e.dm r4 = r1.f14924p     // Catch:{ dc -> 0x05b8 }
            r5 = r5 & r7
            long r5 = (long) r5     // Catch:{ dc -> 0x05b8 }
            java.util.List r4 = r4.mo16653a(r2, r5)     // Catch:{ dc -> 0x05b8 }
            r10.mo16468l(r4)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x02d7:
            com.google.android.gms.internal.e.dm r4 = r1.f14924p     // Catch:{ dc -> 0x05b8 }
            r5 = r5 & r7
            long r5 = (long) r5     // Catch:{ dc -> 0x05b8 }
            java.util.List r4 = r4.mo16653a(r2, r5)     // Catch:{ dc -> 0x05b8 }
            r10.mo16460h(r4)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x02e4:
            com.google.android.gms.internal.e.dm r4 = r1.f14924p     // Catch:{ dc -> 0x05b8 }
            r5 = r5 & r7
            long r5 = (long) r5     // Catch:{ dc -> 0x05b8 }
            java.util.List r4 = r4.mo16653a(r2, r5)     // Catch:{ dc -> 0x05b8 }
            r10.mo16458g(r4)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x02f1:
            com.google.android.gms.internal.e.dm r4 = r1.f14924p     // Catch:{ dc -> 0x05b8 }
            r5 = r5 & r7
            long r5 = (long) r5     // Catch:{ dc -> 0x05b8 }
            java.util.List r4 = r4.mo16653a(r2, r5)     // Catch:{ dc -> 0x05b8 }
            r10.mo16456f(r4)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x02fe:
            com.google.android.gms.internal.e.dm r4 = r1.f14924p     // Catch:{ dc -> 0x05b8 }
            r5 = r5 & r7
            long r5 = (long) r5     // Catch:{ dc -> 0x05b8 }
            java.util.List r4 = r4.mo16653a(r2, r5)     // Catch:{ dc -> 0x05b8 }
            r10.mo16454e(r4)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x030b:
            com.google.android.gms.internal.e.dm r4 = r1.f14924p     // Catch:{ dc -> 0x05b8 }
            r5 = r5 & r7
            long r5 = (long) r5     // Catch:{ dc -> 0x05b8 }
            java.util.List r4 = r4.mo16653a(r2, r5)     // Catch:{ dc -> 0x05b8 }
            r10.mo16449c(r4)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x0318:
            com.google.android.gms.internal.e.dm r4 = r1.f14924p     // Catch:{ dc -> 0x05b8 }
            r5 = r5 & r7
            long r5 = (long) r5     // Catch:{ dc -> 0x05b8 }
            java.util.List r4 = r4.mo16653a(r2, r5)     // Catch:{ dc -> 0x05b8 }
            r10.mo16452d(r4)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x0325:
            com.google.android.gms.internal.e.dm r4 = r1.f14924p     // Catch:{ dc -> 0x05b8 }
            r5 = r5 & r7
            long r5 = (long) r5     // Catch:{ dc -> 0x05b8 }
            java.util.List r4 = r4.mo16653a(r2, r5)     // Catch:{ dc -> 0x05b8 }
            r10.mo16447b(r4)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x0332:
            com.google.android.gms.internal.e.dm r4 = r1.f14924p     // Catch:{ dc -> 0x05b8 }
            r5 = r5 & r7
            long r5 = (long) r5     // Catch:{ dc -> 0x05b8 }
            java.util.List r4 = r4.mo16653a(r2, r5)     // Catch:{ dc -> 0x05b8 }
            r10.mo16442a(r4)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x033f:
            com.google.android.gms.internal.e.dm r4 = r1.f14924p     // Catch:{ dc -> 0x05b8 }
            r5 = r5 & r7
            long r5 = (long) r5     // Catch:{ dc -> 0x05b8 }
            java.util.List r4 = r4.mo16653a(r2, r5)     // Catch:{ dc -> 0x05b8 }
            r10.mo16478q(r4)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x034c:
            com.google.android.gms.internal.e.dm r4 = r1.f14924p     // Catch:{ dc -> 0x05b8 }
            r5 = r5 & r7
            long r5 = (long) r5     // Catch:{ dc -> 0x05b8 }
            java.util.List r4 = r4.mo16653a(r2, r5)     // Catch:{ dc -> 0x05b8 }
            r10.mo16476p(r4)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x0359:
            com.google.android.gms.internal.e.dm r4 = r1.f14924p     // Catch:{ dc -> 0x05b8 }
            r5 = r5 & r7
            long r5 = (long) r5     // Catch:{ dc -> 0x05b8 }
            java.util.List r4 = r4.mo16653a(r2, r5)     // Catch:{ dc -> 0x05b8 }
            r10.mo16474o(r4)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x0366:
            com.google.android.gms.internal.e.dm r4 = r1.f14924p     // Catch:{ dc -> 0x05b8 }
            r5 = r5 & r7
            long r5 = (long) r5     // Catch:{ dc -> 0x05b8 }
            java.util.List r4 = r4.mo16653a(r2, r5)     // Catch:{ dc -> 0x05b8 }
            r10.mo16472n(r4)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x0373:
            com.google.android.gms.internal.e.dm r6 = r1.f14924p     // Catch:{ dc -> 0x05b8 }
            r5 = r5 & r7
            long r7 = (long) r5     // Catch:{ dc -> 0x05b8 }
            java.util.List r5 = r6.mo16653a(r2, r7)     // Catch:{ dc -> 0x05b8 }
            r10.mo16470m(r5)     // Catch:{ dc -> 0x05b8 }
            com.google.android.gms.internal.e.cz r6 = r1.m19583c(r9)     // Catch:{ dc -> 0x05b8 }
            java.lang.Object r4 = com.google.android.gms.internal.p148e.C4573ev.m19688a(r4, r5, r6, r15, r12)     // Catch:{ dc -> 0x05b8 }
        L_0x0386:
            r15 = r4
            goto L_0x0017
        L_0x0389:
            com.google.android.gms.internal.e.dm r4 = r1.f14924p     // Catch:{ dc -> 0x05b8 }
            r5 = r5 & r7
            long r5 = (long) r5     // Catch:{ dc -> 0x05b8 }
            java.util.List r4 = r4.mo16653a(r2, r5)     // Catch:{ dc -> 0x05b8 }
            r10.mo16468l(r4)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x0396:
            com.google.android.gms.internal.e.dm r4 = r1.f14924p     // Catch:{ dc -> 0x05b8 }
            r5 = r5 & r7
            long r5 = (long) r5     // Catch:{ dc -> 0x05b8 }
            java.util.List r4 = r4.mo16653a(r2, r5)     // Catch:{ dc -> 0x05b8 }
            r10.mo16465k(r4)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x03a3:
            com.google.android.gms.internal.e.et r4 = r1.m19562a(r9)     // Catch:{ dc -> 0x05b8 }
            r5 = r5 & r7
            long r5 = (long) r5     // Catch:{ dc -> 0x05b8 }
            com.google.android.gms.internal.e.dm r7 = r1.f14924p     // Catch:{ dc -> 0x05b8 }
            java.util.List r5 = r7.mo16653a(r2, r5)     // Catch:{ dc -> 0x05b8 }
            r10.mo16443a(r5, r4, r11)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x03b4:
            boolean r4 = m19589f(r5)     // Catch:{ dc -> 0x05b8 }
            if (r4 == 0) goto L_0x03c7
            com.google.android.gms.internal.e.dm r4 = r1.f14924p     // Catch:{ dc -> 0x05b8 }
            r5 = r5 & r7
            long r5 = (long) r5     // Catch:{ dc -> 0x05b8 }
            java.util.List r4 = r4.mo16653a(r2, r5)     // Catch:{ dc -> 0x05b8 }
            r10.mo16464j(r4)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x03c7:
            com.google.android.gms.internal.e.dm r4 = r1.f14924p     // Catch:{ dc -> 0x05b8 }
            r5 = r5 & r7
            long r5 = (long) r5     // Catch:{ dc -> 0x05b8 }
            java.util.List r4 = r4.mo16653a(r2, r5)     // Catch:{ dc -> 0x05b8 }
            r10.mo16462i(r4)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x03d4:
            com.google.android.gms.internal.e.dm r4 = r1.f14924p     // Catch:{ dc -> 0x05b8 }
            r5 = r5 & r7
            long r5 = (long) r5     // Catch:{ dc -> 0x05b8 }
            java.util.List r4 = r4.mo16653a(r2, r5)     // Catch:{ dc -> 0x05b8 }
            r10.mo16460h(r4)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x03e1:
            com.google.android.gms.internal.e.dm r4 = r1.f14924p     // Catch:{ dc -> 0x05b8 }
            r5 = r5 & r7
            long r5 = (long) r5     // Catch:{ dc -> 0x05b8 }
            java.util.List r4 = r4.mo16653a(r2, r5)     // Catch:{ dc -> 0x05b8 }
            r10.mo16458g(r4)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x03ee:
            com.google.android.gms.internal.e.dm r4 = r1.f14924p     // Catch:{ dc -> 0x05b8 }
            r5 = r5 & r7
            long r5 = (long) r5     // Catch:{ dc -> 0x05b8 }
            java.util.List r4 = r4.mo16653a(r2, r5)     // Catch:{ dc -> 0x05b8 }
            r10.mo16456f(r4)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x03fb:
            com.google.android.gms.internal.e.dm r4 = r1.f14924p     // Catch:{ dc -> 0x05b8 }
            r5 = r5 & r7
            long r5 = (long) r5     // Catch:{ dc -> 0x05b8 }
            java.util.List r4 = r4.mo16653a(r2, r5)     // Catch:{ dc -> 0x05b8 }
            r10.mo16454e(r4)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x0408:
            com.google.android.gms.internal.e.dm r4 = r1.f14924p     // Catch:{ dc -> 0x05b8 }
            r5 = r5 & r7
            long r5 = (long) r5     // Catch:{ dc -> 0x05b8 }
            java.util.List r4 = r4.mo16653a(r2, r5)     // Catch:{ dc -> 0x05b8 }
            r10.mo16449c(r4)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x0415:
            com.google.android.gms.internal.e.dm r4 = r1.f14924p     // Catch:{ dc -> 0x05b8 }
            r5 = r5 & r7
            long r5 = (long) r5     // Catch:{ dc -> 0x05b8 }
            java.util.List r4 = r4.mo16653a(r2, r5)     // Catch:{ dc -> 0x05b8 }
            r10.mo16452d(r4)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x0422:
            com.google.android.gms.internal.e.dm r4 = r1.f14924p     // Catch:{ dc -> 0x05b8 }
            r5 = r5 & r7
            long r5 = (long) r5     // Catch:{ dc -> 0x05b8 }
            java.util.List r4 = r4.mo16653a(r2, r5)     // Catch:{ dc -> 0x05b8 }
            r10.mo16447b(r4)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x042f:
            com.google.android.gms.internal.e.dm r4 = r1.f14924p     // Catch:{ dc -> 0x05b8 }
            r5 = r5 & r7
            long r5 = (long) r5     // Catch:{ dc -> 0x05b8 }
            java.util.List r4 = r4.mo16653a(r2, r5)     // Catch:{ dc -> 0x05b8 }
            r10.mo16442a(r4)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x043c:
            boolean r4 = r1.m19572a((T) r2, r9)     // Catch:{ dc -> 0x05b8 }
            if (r4 == 0) goto L_0x045a
            r4 = r5 & r7
            long r4 = (long) r4     // Catch:{ dc -> 0x05b8 }
            java.lang.Object r6 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r2, r4)     // Catch:{ dc -> 0x05b8 }
            com.google.android.gms.internal.e.et r7 = r1.m19562a(r9)     // Catch:{ dc -> 0x05b8 }
            java.lang.Object r7 = r10.mo16446b(r7, r11)     // Catch:{ dc -> 0x05b8 }
            java.lang.Object r6 = com.google.android.gms.internal.p148e.C4520cw.m19447a(r6, r7)     // Catch:{ dc -> 0x05b8 }
            com.google.android.gms.internal.p148e.C4601fr.m19851a(r2, r4, r6)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x045a:
            r4 = r5 & r7
            long r4 = (long) r4     // Catch:{ dc -> 0x05b8 }
            com.google.android.gms.internal.e.et r6 = r1.m19562a(r9)     // Catch:{ dc -> 0x05b8 }
            java.lang.Object r6 = r10.mo16446b(r6, r11)     // Catch:{ dc -> 0x05b8 }
            com.google.android.gms.internal.p148e.C4601fr.m19851a(r2, r4, r6)     // Catch:{ dc -> 0x05b8 }
            r1.m19578b((T) r2, r9)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x046d:
            r4 = r5 & r7
            long r4 = (long) r4     // Catch:{ dc -> 0x05b8 }
            long r6 = r19.mo16481t()     // Catch:{ dc -> 0x05b8 }
            com.google.android.gms.internal.p148e.C4601fr.m19850a(r2, r4, r6)     // Catch:{ dc -> 0x05b8 }
            r1.m19578b((T) r2, r9)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x047c:
            r4 = r5 & r7
            long r4 = (long) r4     // Catch:{ dc -> 0x05b8 }
            int r6 = r19.mo16480s()     // Catch:{ dc -> 0x05b8 }
            com.google.android.gms.internal.p148e.C4601fr.m19849a(r2, r4, r6)     // Catch:{ dc -> 0x05b8 }
            r1.m19578b((T) r2, r9)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x048b:
            r4 = r5 & r7
            long r4 = (long) r4     // Catch:{ dc -> 0x05b8 }
            long r6 = r19.mo16479r()     // Catch:{ dc -> 0x05b8 }
            com.google.android.gms.internal.p148e.C4601fr.m19850a(r2, r4, r6)     // Catch:{ dc -> 0x05b8 }
            r1.m19578b((T) r2, r9)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x049a:
            r4 = r5 & r7
            long r4 = (long) r4     // Catch:{ dc -> 0x05b8 }
            int r6 = r19.mo16477q()     // Catch:{ dc -> 0x05b8 }
            com.google.android.gms.internal.p148e.C4601fr.m19849a(r2, r4, r6)     // Catch:{ dc -> 0x05b8 }
            r1.m19578b((T) r2, r9)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x04a9:
            int r6 = r19.mo16475p()     // Catch:{ dc -> 0x05b8 }
            com.google.android.gms.internal.e.cz r8 = r1.m19583c(r9)     // Catch:{ dc -> 0x05b8 }
            if (r8 == 0) goto L_0x04c0
            boolean r8 = r8.mo16630a(r6)     // Catch:{ dc -> 0x05b8 }
            if (r8 == 0) goto L_0x04ba
            goto L_0x04c0
        L_0x04ba:
            java.lang.Object r4 = com.google.android.gms.internal.p148e.C4573ev.m19687a(r4, r6, r15, r12)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0386
        L_0x04c0:
            r4 = r5 & r7
            long r4 = (long) r4     // Catch:{ dc -> 0x05b8 }
            com.google.android.gms.internal.p148e.C4601fr.m19849a(r2, r4, r6)     // Catch:{ dc -> 0x05b8 }
            r1.m19578b((T) r2, r9)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x04cb:
            r4 = r5 & r7
            long r4 = (long) r4     // Catch:{ dc -> 0x05b8 }
            int r6 = r19.mo16473o()     // Catch:{ dc -> 0x05b8 }
            com.google.android.gms.internal.p148e.C4601fr.m19849a(r2, r4, r6)     // Catch:{ dc -> 0x05b8 }
            r1.m19578b((T) r2, r9)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x04da:
            r4 = r5 & r7
            long r4 = (long) r4     // Catch:{ dc -> 0x05b8 }
            com.google.android.gms.internal.e.bj r6 = r19.mo16471n()     // Catch:{ dc -> 0x05b8 }
            com.google.android.gms.internal.p148e.C4601fr.m19851a(r2, r4, r6)     // Catch:{ dc -> 0x05b8 }
            r1.m19578b((T) r2, r9)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x04e9:
            boolean r4 = r1.m19572a((T) r2, r9)     // Catch:{ dc -> 0x05b8 }
            if (r4 == 0) goto L_0x0507
            r4 = r5 & r7
            long r4 = (long) r4     // Catch:{ dc -> 0x05b8 }
            java.lang.Object r6 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r2, r4)     // Catch:{ dc -> 0x05b8 }
            com.google.android.gms.internal.e.et r7 = r1.m19562a(r9)     // Catch:{ dc -> 0x05b8 }
            java.lang.Object r7 = r10.mo16441a(r7, r11)     // Catch:{ dc -> 0x05b8 }
            java.lang.Object r6 = com.google.android.gms.internal.p148e.C4520cw.m19447a(r6, r7)     // Catch:{ dc -> 0x05b8 }
            com.google.android.gms.internal.p148e.C4601fr.m19851a(r2, r4, r6)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x0507:
            r4 = r5 & r7
            long r4 = (long) r4     // Catch:{ dc -> 0x05b8 }
            com.google.android.gms.internal.e.et r6 = r1.m19562a(r9)     // Catch:{ dc -> 0x05b8 }
            java.lang.Object r6 = r10.mo16441a(r6, r11)     // Catch:{ dc -> 0x05b8 }
            com.google.android.gms.internal.p148e.C4601fr.m19851a(r2, r4, r6)     // Catch:{ dc -> 0x05b8 }
            r1.m19578b((T) r2, r9)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x051a:
            r1.m19570a(r2, r5, r10)     // Catch:{ dc -> 0x05b8 }
            r1.m19578b((T) r2, r9)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x0522:
            r4 = r5 & r7
            long r4 = (long) r4     // Catch:{ dc -> 0x05b8 }
            boolean r6 = r19.mo16466k()     // Catch:{ dc -> 0x05b8 }
            com.google.android.gms.internal.p148e.C4601fr.m19852a(r2, r4, r6)     // Catch:{ dc -> 0x05b8 }
            r1.m19578b((T) r2, r9)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x0531:
            r4 = r5 & r7
            long r4 = (long) r4     // Catch:{ dc -> 0x05b8 }
            int r6 = r19.mo16463j()     // Catch:{ dc -> 0x05b8 }
            com.google.android.gms.internal.p148e.C4601fr.m19849a(r2, r4, r6)     // Catch:{ dc -> 0x05b8 }
            r1.m19578b((T) r2, r9)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x0540:
            r4 = r5 & r7
            long r4 = (long) r4     // Catch:{ dc -> 0x05b8 }
            long r6 = r19.mo16461i()     // Catch:{ dc -> 0x05b8 }
            com.google.android.gms.internal.p148e.C4601fr.m19850a(r2, r4, r6)     // Catch:{ dc -> 0x05b8 }
            r1.m19578b((T) r2, r9)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x054f:
            r4 = r5 & r7
            long r4 = (long) r4     // Catch:{ dc -> 0x05b8 }
            int r6 = r19.mo16459h()     // Catch:{ dc -> 0x05b8 }
            com.google.android.gms.internal.p148e.C4601fr.m19849a(r2, r4, r6)     // Catch:{ dc -> 0x05b8 }
            r1.m19578b((T) r2, r9)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x055e:
            r4 = r5 & r7
            long r4 = (long) r4     // Catch:{ dc -> 0x05b8 }
            long r6 = r19.mo16455f()     // Catch:{ dc -> 0x05b8 }
            com.google.android.gms.internal.p148e.C4601fr.m19850a(r2, r4, r6)     // Catch:{ dc -> 0x05b8 }
            r1.m19578b((T) r2, r9)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x056d:
            r4 = r5 & r7
            long r4 = (long) r4     // Catch:{ dc -> 0x05b8 }
            long r6 = r19.mo16457g()     // Catch:{ dc -> 0x05b8 }
            com.google.android.gms.internal.p148e.C4601fr.m19850a(r2, r4, r6)     // Catch:{ dc -> 0x05b8 }
            r1.m19578b((T) r2, r9)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x057c:
            r4 = r5 & r7
            long r4 = (long) r4     // Catch:{ dc -> 0x05b8 }
            float r6 = r19.mo16453e()     // Catch:{ dc -> 0x05b8 }
            com.google.android.gms.internal.p148e.C4601fr.m19848a(r2, r4, r6)     // Catch:{ dc -> 0x05b8 }
            r1.m19578b((T) r2, r9)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x058b:
            r4 = r5 & r7
            long r4 = (long) r4     // Catch:{ dc -> 0x05b8 }
            double r6 = r19.mo16451d()     // Catch:{ dc -> 0x05b8 }
            com.google.android.gms.internal.p148e.C4601fr.m19847a(r2, r4, r6)     // Catch:{ dc -> 0x05b8 }
            r1.m19578b((T) r2, r9)     // Catch:{ dc -> 0x05b8 }
            goto L_0x0017
        L_0x059a:
            r15 = r4
        L_0x059b:
            boolean r4 = r12.mo16754a(r15, r10)     // Catch:{ dc -> 0x05b8 }
            if (r4 != 0) goto L_0x0017
            int r3 = r1.f14921m
        L_0x05a3:
            int r4 = r1.f14922n
            if (r3 >= r4) goto L_0x05b2
            int[] r4 = r1.f14920l
            r4 = r4[r3]
            java.lang.Object r15 = r1.m19564a(r2, r4, (UB) r15, r12)
            int r3 = r3 + 1
            goto L_0x05a3
        L_0x05b2:
            if (r15 == 0) goto L_0x05b7
            r12.mo16758b(r2, r15)
        L_0x05b7:
            return
        L_0x05b8:
            r12.mo16753a(r10)     // Catch:{ all -> 0x05df }
            if (r15 != 0) goto L_0x05c2
            java.lang.Object r4 = r12.mo16759c(r2)     // Catch:{ all -> 0x05df }
            r15 = r4
        L_0x05c2:
            boolean r4 = r12.mo16754a(r15, r10)     // Catch:{ all -> 0x05df }
            if (r4 != 0) goto L_0x0017
            int r3 = r1.f14921m
        L_0x05ca:
            int r4 = r1.f14922n
            if (r3 >= r4) goto L_0x05d9
            int[] r4 = r1.f14920l
            r4 = r4[r3]
            java.lang.Object r15 = r1.m19564a(r2, r4, (UB) r15, r12)
            int r3 = r3 + 1
            goto L_0x05ca
        L_0x05d9:
            if (r15 == 0) goto L_0x05de
            r12.mo16758b(r2, r15)
        L_0x05de:
            return
        L_0x05df:
            r0 = move-exception
            r3 = r0
            int r4 = r1.f14921m
        L_0x05e3:
            int r5 = r1.f14922n
            if (r4 >= r5) goto L_0x05f2
            int[] r5 = r1.f14920l
            r5 = r5[r4]
            java.lang.Object r15 = r1.m19564a(r2, r5, (UB) r15, r12)
            int r4 = r4 + 1
            goto L_0x05e3
        L_0x05f2:
            if (r15 == 0) goto L_0x05f7
            r12.mo16758b(r2, r15)
        L_0x05f7:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p148e.C4558eg.mo16686a(java.lang.Object, com.google.android.gms.internal.e.es, com.google.android.gms.internal.e.ch):void");
    }

    /* renamed from: a */
    private final C4571et m19562a(int i) {
        int i2 = (i / 3) << 1;
        C4571et etVar = (C4571et) this.f14912d[i2];
        if (etVar != null) {
            return etVar;
        }
        C4571et a = C4567ep.m19618a().mo16695a((Class) this.f14912d[i2 + 1]);
        this.f14912d[i2] = a;
        return a;
    }

    /* renamed from: b */
    private final Object m19577b(int i) {
        return this.f14912d[(i / 3) << 1];
    }

    /* renamed from: c */
    private final C4523cz m19583c(int i) {
        return (C4523cz) this.f14912d[((i / 3) << 1) + 1];
    }

    /* renamed from: c */
    public final void mo16691c(T t) {
        for (int i = this.f14921m; i < this.f14922n; i++) {
            long d = (long) (m19585d(this.f14920l[i]) & 1048575);
            Object f = C4601fr.m19874f(t, d);
            if (f != null) {
                C4601fr.m19851a((Object) t, d, this.f14927s.mo16678d(f));
            }
        }
        int length = this.f14920l.length;
        for (int i2 = this.f14922n; i2 < length; i2++) {
            this.f14924p.mo16655b(t, (long) this.f14920l[i2]);
        }
        this.f14925q.mo16761d(t);
        if (this.f14916h) {
            this.f14926r.mo16578c(t);
        }
    }

    /* renamed from: a */
    private final <UT, UB> UB m19564a(Object obj, int i, UB ub, C4595fl<UT, UB> flVar) {
        int i2 = this.f14911c[i];
        Object f = C4601fr.m19874f(obj, (long) (m19585d(i) & 1048575));
        if (f == null) {
            return ub;
        }
        C4523cz c = m19583c(i);
        if (c == null) {
            return ub;
        }
        return m19563a(i, i2, this.f14927s.mo16675a(f), c, ub, flVar);
    }

    /* renamed from: a */
    private final <K, V, UT, UB> UB m19563a(int i, int i2, Map<K, V> map, C4523cz czVar, UB ub, C4595fl<UT, UB> flVar) {
        C4546dv f = this.f14927s.mo16680f(m19577b(i));
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            if (!czVar.mo16630a(((Integer) entry.getValue()).intValue())) {
                if (ub == null) {
                    ub = flVar.mo16745a();
                }
                C4477br c = C4469bj.m18964c(C4545du.m19513a(f, entry.getKey(), entry.getValue()));
                try {
                    C4545du.m19514a(c.mo16410b(), f, entry.getKey(), entry.getValue());
                    flVar.mo16749a(ub, i2, c.mo16409a());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0104, code lost:
        continue;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo16692d(T r14) {
        /*
            r13 = this;
            r0 = 0
            r1 = -1
            r3 = r0
            r2 = r1
            r1 = r3
        L_0x0005:
            int r4 = r13.f14921m
            r5 = 1
            if (r1 >= r4) goto L_0x0108
            int[] r4 = r13.f14920l
            r4 = r4[r1]
            int[] r6 = r13.f14911c
            r6 = r6[r4]
            int r7 = r13.m19585d(r4)
            boolean r8 = r13.f14918j
            r9 = 1048575(0xfffff, float:1.469367E-39)
            if (r8 != 0) goto L_0x0035
            int[] r8 = r13.f14911c
            int r10 = r4 + 2
            r8 = r8[r10]
            r10 = r8 & r9
            int r8 = r8 >>> 20
            int r8 = r5 << r8
            if (r10 == r2) goto L_0x0036
            sun.misc.Unsafe r2 = f14910b
            long r11 = (long) r10
            int r2 = r2.getInt(r14, r11)
            r3 = r2
            r2 = r10
            goto L_0x0036
        L_0x0035:
            r8 = r0
        L_0x0036:
            r10 = 268435456(0x10000000, float:2.5243549E-29)
            r10 = r10 & r7
            if (r10 == 0) goto L_0x003d
            r10 = r5
            goto L_0x003e
        L_0x003d:
            r10 = r0
        L_0x003e:
            if (r10 == 0) goto L_0x0047
            boolean r10 = r13.m19574a((T) r14, r4, r3, r8)
            if (r10 != 0) goto L_0x0047
            return r0
        L_0x0047:
            r10 = 267386880(0xff00000, float:2.3665827E-29)
            r10 = r10 & r7
            int r10 = r10 >>> 20
            r11 = 9
            if (r10 == r11) goto L_0x00f3
            r11 = 17
            if (r10 == r11) goto L_0x00f3
            r8 = 27
            if (r10 == r8) goto L_0x00c7
            r8 = 60
            if (r10 == r8) goto L_0x00b6
            r8 = 68
            if (r10 == r8) goto L_0x00b6
            switch(r10) {
                case 49: goto L_0x00c7;
                case 50: goto L_0x0065;
                default: goto L_0x0063;
            }
        L_0x0063:
            goto L_0x0104
        L_0x0065:
            com.google.android.gms.internal.e.dx r6 = r13.f14927s
            r7 = r7 & r9
            long r7 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r7)
            java.util.Map r6 = r6.mo16676b(r7)
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto L_0x00b3
            java.lang.Object r4 = r13.m19577b(r4)
            com.google.android.gms.internal.e.dx r7 = r13.f14927s
            com.google.android.gms.internal.e.dv r4 = r7.mo16680f(r4)
            com.google.android.gms.internal.e.ga r4 = r4.f14903c
            com.google.android.gms.internal.e.gf r4 = r4.mo16809a()
            com.google.android.gms.internal.e.gf r7 = com.google.android.gms.internal.p148e.C4620gf.MESSAGE
            if (r4 != r7) goto L_0x00b3
            r4 = 0
            java.util.Collection r6 = r6.values()
            java.util.Iterator r6 = r6.iterator()
        L_0x0094:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00b3
            java.lang.Object r7 = r6.next()
            if (r4 != 0) goto L_0x00ac
            com.google.android.gms.internal.e.ep r4 = com.google.android.gms.internal.p148e.C4567ep.m19618a()
            java.lang.Class r8 = r7.getClass()
            com.google.android.gms.internal.e.et r4 = r4.mo16695a(r8)
        L_0x00ac:
            boolean r7 = r4.mo16692d(r7)
            if (r7 != 0) goto L_0x0094
            r5 = r0
        L_0x00b3:
            if (r5 != 0) goto L_0x0104
            return r0
        L_0x00b6:
            boolean r5 = r13.m19573a((T) r14, r6, r4)
            if (r5 == 0) goto L_0x0104
            com.google.android.gms.internal.e.et r4 = r13.m19562a(r4)
            boolean r4 = m19575a(r14, r7, r4)
            if (r4 != 0) goto L_0x0104
            return r0
        L_0x00c7:
            r6 = r7 & r9
            long r6 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.p148e.C4601fr.m19874f(r14, r6)
            java.util.List r6 = (java.util.List) r6
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto L_0x00f0
            com.google.android.gms.internal.e.et r4 = r13.m19562a(r4)
            r7 = r0
        L_0x00db:
            int r8 = r6.size()
            if (r7 >= r8) goto L_0x00f0
            java.lang.Object r8 = r6.get(r7)
            boolean r8 = r4.mo16692d(r8)
            if (r8 != 0) goto L_0x00ed
            r5 = r0
            goto L_0x00f0
        L_0x00ed:
            int r7 = r7 + 1
            goto L_0x00db
        L_0x00f0:
            if (r5 != 0) goto L_0x0104
            return r0
        L_0x00f3:
            boolean r5 = r13.m19574a((T) r14, r4, r3, r8)
            if (r5 == 0) goto L_0x0104
            com.google.android.gms.internal.e.et r4 = r13.m19562a(r4)
            boolean r4 = m19575a(r14, r7, r4)
            if (r4 != 0) goto L_0x0104
            return r0
        L_0x0104:
            int r1 = r1 + 1
            goto L_0x0005
        L_0x0108:
            boolean r1 = r13.f14916h
            if (r1 == 0) goto L_0x0119
            com.google.android.gms.internal.e.ci<?> r1 = r13.f14926r
            com.google.android.gms.internal.e.cl r14 = r1.mo16570a(r14)
            boolean r14 = r14.mo16587g()
            if (r14 != 0) goto L_0x0119
            return r0
        L_0x0119:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p148e.C4558eg.mo16692d(java.lang.Object):boolean");
    }

    /* renamed from: a */
    private static boolean m19575a(Object obj, int i, C4571et etVar) {
        return etVar.mo16692d(C4601fr.m19874f(obj, (long) (i & 1048575)));
    }

    /* renamed from: a */
    private static void m19567a(int i, Object obj, C4621gg ggVar) throws IOException {
        if (obj instanceof String) {
            ggVar.mo16530a(i, (String) obj);
        } else {
            ggVar.mo16526a(i, (C4469bj) obj);
        }
    }

    /* renamed from: a */
    private final void m19570a(Object obj, int i, C4570es esVar) throws IOException {
        if (m19589f(i)) {
            C4601fr.m19851a(obj, (long) (i & 1048575), (Object) esVar.mo16469m());
        } else if (this.f14917i) {
            C4601fr.m19851a(obj, (long) (i & 1048575), (Object) esVar.mo16467l());
        } else {
            C4601fr.m19851a(obj, (long) (i & 1048575), (Object) esVar.mo16471n());
        }
    }

    /* renamed from: d */
    private final int m19585d(int i) {
        return this.f14911c[i + 1];
    }

    /* renamed from: e */
    private final int m19587e(int i) {
        return this.f14911c[i + 2];
    }

    /* renamed from: b */
    private static <T> double m19576b(T t, long j) {
        return ((Double) C4601fr.m19874f(t, j)).doubleValue();
    }

    /* renamed from: c */
    private static <T> float m19582c(T t, long j) {
        return ((Float) C4601fr.m19874f(t, j)).floatValue();
    }

    /* renamed from: d */
    private static <T> int m19586d(T t, long j) {
        return ((Integer) C4601fr.m19874f(t, j)).intValue();
    }

    /* renamed from: e */
    private static <T> long m19588e(T t, long j) {
        return ((Long) C4601fr.m19874f(t, j)).longValue();
    }

    /* renamed from: f */
    private static <T> boolean m19590f(T t, long j) {
        return ((Boolean) C4601fr.m19874f(t, j)).booleanValue();
    }

    /* renamed from: c */
    private final boolean m19584c(T t, T t2, int i) {
        return m19572a(t, i) == m19572a(t2, i);
    }

    /* renamed from: a */
    private final boolean m19574a(T t, int i, int i2, int i3) {
        if (this.f14918j) {
            return m19572a(t, i);
        }
        return (i2 & i3) != 0;
    }

    /* renamed from: a */
    private final boolean m19572a(T t, int i) {
        if (this.f14918j) {
            int d = m19585d(i);
            long j = (long) (d & 1048575);
            switch ((d & 267386880) >>> 20) {
                case 0:
                    return C4601fr.m19871e(t, j) != 0.0d;
                case 1:
                    return C4601fr.m19866d(t, j) != 0.0f;
                case 2:
                    return C4601fr.m19857b(t, j) != 0;
                case 3:
                    return C4601fr.m19857b(t, j) != 0;
                case 4:
                    return C4601fr.m19841a((Object) t, j) != 0;
                case 5:
                    return C4601fr.m19857b(t, j) != 0;
                case 6:
                    return C4601fr.m19841a((Object) t, j) != 0;
                case 7:
                    return C4601fr.m19865c(t, j);
                case 8:
                    Object f = C4601fr.m19874f(t, j);
                    if (f instanceof String) {
                        return !((String) f).isEmpty();
                    }
                    if (f instanceof C4469bj) {
                        return !C4469bj.f14699a.equals(f);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return C4601fr.m19874f(t, j) != null;
                case 10:
                    return !C4469bj.f14699a.equals(C4601fr.m19874f(t, j));
                case 11:
                    return C4601fr.m19841a((Object) t, j) != 0;
                case 12:
                    return C4601fr.m19841a((Object) t, j) != 0;
                case 13:
                    return C4601fr.m19841a((Object) t, j) != 0;
                case 14:
                    return C4601fr.m19857b(t, j) != 0;
                case 15:
                    return C4601fr.m19841a((Object) t, j) != 0;
                case 16:
                    return C4601fr.m19857b(t, j) != 0;
                case 17:
                    return C4601fr.m19874f(t, j) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            int e = m19587e(i);
            return (C4601fr.m19841a((Object) t, (long) (e & 1048575)) & (1 << (e >>> 20))) != 0;
        }
    }

    /* renamed from: b */
    private final void m19578b(T t, int i) {
        if (!this.f14918j) {
            int e = m19587e(i);
            long j = (long) (e & 1048575);
            C4601fr.m19849a((Object) t, j, C4601fr.m19841a((Object) t, j) | (1 << (e >>> 20)));
        }
    }

    /* renamed from: a */
    private final boolean m19573a(T t, int i, int i2) {
        return C4601fr.m19841a((Object) t, (long) (m19587e(i2) & 1048575)) == i;
    }

    /* renamed from: b */
    private final void m19579b(T t, int i, int i2) {
        C4601fr.m19849a((Object) t, (long) (m19587e(i2) & 1048575), i);
    }
}
