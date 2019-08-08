package com.google.android.gms.measurement.internal;

import android.support.p017v4.p023d.C0376a;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.internal.p148e.C4433aa;
import com.google.android.gms.internal.p148e.C4638k;
import com.google.android.gms.internal.p148e.C4639l;
import com.google.android.gms.internal.p148e.C4640m;
import com.google.android.gms.internal.p148e.C4641n;
import com.google.android.gms.internal.p148e.C4642o;
import com.google.android.gms.internal.p148e.C4647t;
import com.google.android.gms.internal.p148e.C4649v;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: com.google.android.gms.measurement.internal.eq */
final class C4867eq extends C4851eb {
    C4867eq(C4852ec ecVar) {
        super(ecVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo17212e() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02e6  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0328  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0395  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x03f0  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0445  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x045a  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x046b  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x02b0  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02c8  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.p148e.C4646s[] mo17633a(java.lang.String r106, com.google.android.gms.internal.p148e.C4648u[] r107, com.google.android.gms.internal.p148e.C4433aa[] r108) {
        /*
            r105 = this;
            r7 = r105
            r15 = r106
            r13 = r107
            r14 = r108
            com.google.android.gms.common.internal.C3513t.m12627a(r106)
            java.util.HashSet r11 = new java.util.HashSet
            r11.<init>()
            android.support.v4.d.a r12 = new android.support.v4.d.a
            r12.<init>()
            android.support.v4.d.a r10 = new android.support.v4.d.a
            r10.<init>()
            android.support.v4.d.a r9 = new android.support.v4.d.a
            r9.<init>()
            android.support.v4.d.a r8 = new android.support.v4.d.a
            r8.<init>()
            android.support.v4.d.a r6 = new android.support.v4.d.a
            r6.<init>()
            com.google.android.gms.measurement.internal.et r1 = r105.mo17160t()
            boolean r23 = r1.mo17656k(r15)
            com.google.android.gms.measurement.internal.ew r1 = r105.mo17217i()
            java.util.Map r1 = r1.mo17701e(r15)
            if (r1 == 0) goto L_0x0185
            java.util.Set r2 = r1.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0043:
            boolean r16 = r2.hasNext()
            if (r16 == 0) goto L_0x0185
            java.lang.Object r16 = r2.next()
            r4 = r16
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            java.lang.Object r5 = r1.get(r5)
            com.google.android.gms.internal.e.y r5 = (com.google.android.gms.internal.p148e.C4652y) r5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            java.lang.Object r3 = r10.get(r3)
            java.util.BitSet r3 = (java.util.BitSet) r3
            r27 = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.Object r1 = r9.get(r1)
            java.util.BitSet r1 = (java.util.BitSet) r1
            if (r23 == 0) goto L_0x00b3
            r28 = r1
            android.support.v4.d.a r1 = new android.support.v4.d.a
            r1.<init>()
            if (r5 == 0) goto L_0x00a7
            r29 = r2
            com.google.android.gms.internal.e.t[] r2 = r5.f15208c
            if (r2 != 0) goto L_0x0087
            goto L_0x00a9
        L_0x0087:
            com.google.android.gms.internal.e.t[] r2 = r5.f15208c
            r30 = r11
            int r11 = r2.length
            r14 = 0
        L_0x008d:
            if (r14 >= r11) goto L_0x00ab
            r31 = r11
            r11 = r2[r14]
            r32 = r2
            java.lang.Integer r2 = r11.f15149a
            if (r2 == 0) goto L_0x00a0
            java.lang.Integer r2 = r11.f15149a
            java.lang.Long r11 = r11.f15150b
            r1.put(r2, r11)
        L_0x00a0:
            int r14 = r14 + 1
            r11 = r31
            r2 = r32
            goto L_0x008d
        L_0x00a7:
            r29 = r2
        L_0x00a9:
            r30 = r11
        L_0x00ab:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r8.put(r2, r1)
            goto L_0x00ba
        L_0x00b3:
            r28 = r1
            r29 = r2
            r30 = r11
            r1 = 0
        L_0x00ba:
            if (r3 != 0) goto L_0x00d5
            java.util.BitSet r3 = new java.util.BitSet
            r3.<init>()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r10.put(r2, r3)
            java.util.BitSet r2 = new java.util.BitSet
            r2.<init>()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r4)
            r9.put(r11, r2)
            goto L_0x00d7
        L_0x00d5:
            r2 = r28
        L_0x00d7:
            r11 = 0
        L_0x00d8:
            long[] r14 = r5.f15206a
            int r14 = r14.length
            int r14 = r14 << 6
            if (r11 >= r14) goto L_0x012d
            long[] r14 = r5.f15206a
            boolean r14 = com.google.android.gms.measurement.internal.C4859ei.m20926a(r14, r11)
            if (r14 == 0) goto L_0x0112
            com.google.android.gms.measurement.internal.r r14 = r105.mo17158r()
            com.google.android.gms.measurement.internal.t r14 = r14.mo17759x()
            r33 = r8
            java.lang.String r8 = "Filter already evaluated. audience ID, filter ID"
            r34 = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
            r35 = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
            r14.mo17765a(r8, r9, r10)
            r2.set(r11)
            long[] r8 = r5.f15207b
            boolean r8 = com.google.android.gms.measurement.internal.C4859ei.m20926a(r8, r11)
            if (r8 == 0) goto L_0x0118
            r3.set(r11)
            r8 = 1
            goto L_0x0119
        L_0x0112:
            r33 = r8
            r34 = r9
            r35 = r10
        L_0x0118:
            r8 = 0
        L_0x0119:
            if (r1 == 0) goto L_0x0124
            if (r8 != 0) goto L_0x0124
            java.lang.Integer r8 = java.lang.Integer.valueOf(r11)
            r1.remove(r8)
        L_0x0124:
            int r11 = r11 + 1
            r8 = r33
            r9 = r34
            r10 = r35
            goto L_0x00d8
        L_0x012d:
            r33 = r8
            r34 = r9
            r35 = r10
            com.google.android.gms.internal.e.s r8 = new com.google.android.gms.internal.e.s
            r8.<init>()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
            r12.put(r9, r8)
            r9 = 0
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r9)
            r8.f15147d = r10
            r8.f15146c = r5
            com.google.android.gms.internal.e.y r5 = new com.google.android.gms.internal.e.y
            r5.<init>()
            r8.f15145b = r5
            com.google.android.gms.internal.e.y r5 = r8.f15145b
            long[] r3 = com.google.android.gms.measurement.internal.C4859ei.m20927a(r3)
            r5.f15207b = r3
            com.google.android.gms.internal.e.y r3 = r8.f15145b
            long[] r2 = com.google.android.gms.measurement.internal.C4859ei.m20927a(r2)
            r3.f15206a = r2
            if (r23 == 0) goto L_0x0175
            com.google.android.gms.internal.e.y r2 = r8.f15145b
            com.google.android.gms.internal.e.t[] r1 = m21090a(r1)
            r2.f15208c = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            android.support.v4.d.a r2 = new android.support.v4.d.a
            r2.<init>()
            r6.put(r1, r2)
        L_0x0175:
            r1 = r27
            r2 = r29
            r11 = r30
            r8 = r33
            r9 = r34
            r10 = r35
            r14 = r108
            goto L_0x0043
        L_0x0185:
            r33 = r8
            r34 = r9
            r35 = r10
            r30 = r11
            if (r13 == 0) goto L_0x080b
            android.support.v4.d.a r10 = new android.support.v4.d.a
            r10.<init>()
            int r4 = r13.length
            r1 = 0
            r2 = 0
            r5 = 0
            r16 = 0
        L_0x019a:
            if (r5 >= r4) goto L_0x080b
            r3 = r13[r5]
            java.lang.String r11 = r3.f15153b
            com.google.android.gms.internal.e.v[] r14 = r3.f15152a
            com.google.android.gms.measurement.internal.et r8 = r105.mo17160t()
            com.google.android.gms.measurement.internal.h$a<java.lang.Boolean> r9 = com.google.android.gms.measurement.internal.C4882h.f15872W
            boolean r8 = r8.mo17643c(r15, r9)
            r18 = 1
            if (r8 == 0) goto L_0x0376
            r105.mo17214g()
            java.lang.String r8 = "_eid"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C4859ei.m20929b(r3, r8)
            java.lang.Long r8 = (java.lang.Long) r8
            if (r8 == 0) goto L_0x01bf
            r9 = 1
            goto L_0x01c0
        L_0x01bf:
            r9 = 0
        L_0x01c0:
            if (r9 == 0) goto L_0x01ce
            r38 = r4
            java.lang.String r4 = "_ep"
            boolean r4 = r11.equals(r4)
            if (r4 == 0) goto L_0x01d0
            r4 = 1
            goto L_0x01d1
        L_0x01ce:
            r38 = r4
        L_0x01d0:
            r4 = 0
        L_0x01d1:
            if (r4 == 0) goto L_0x0328
            r105.mo17214g()
            java.lang.String r4 = "_en"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4859ei.m20929b(r3, r4)
            r9 = r4
            java.lang.String r9 = (java.lang.String) r9
            boolean r4 = android.text.TextUtils.isEmpty(r9)
            if (r4 == 0) goto L_0x01fb
            com.google.android.gms.measurement.internal.r r3 = r105.mo17158r()
            com.google.android.gms.measurement.internal.t r3 = r3.mo17761y_()
            java.lang.String r4 = "Extra parameter without an event name. eventId"
            r3.mo17764a(r4, r8)
            r26 = r5
            r40 = r6
            r24 = r38
            r6 = 1
            goto L_0x0315
        L_0x01fb:
            if (r1 == 0) goto L_0x0210
            if (r2 == 0) goto L_0x0210
            long r20 = r8.longValue()
            long r27 = r2.longValue()
            int r4 = (r20 > r27 ? 1 : (r20 == r27 ? 0 : -1))
            if (r4 == 0) goto L_0x020c
            goto L_0x0210
        L_0x020c:
            r11 = r1
            r20 = r2
            goto L_0x0238
        L_0x0210:
            com.google.android.gms.measurement.internal.ew r4 = r105.mo17217i()
            android.util.Pair r4 = r4.mo17676a(r15, r8)
            if (r4 == 0) goto L_0x0301
            java.lang.Object r11 = r4.first
            if (r11 != 0) goto L_0x0220
            goto L_0x0301
        L_0x0220:
            java.lang.Object r1 = r4.first
            com.google.android.gms.internal.e.u r1 = (com.google.android.gms.internal.p148e.C4648u) r1
            java.lang.Object r2 = r4.second
            java.lang.Long r2 = (java.lang.Long) r2
            long r16 = r2.longValue()
            r105.mo17214g()
            java.lang.String r2 = "_eid"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C4859ei.m20929b(r1, r2)
            java.lang.Long r2 = (java.lang.Long) r2
            goto L_0x020c
        L_0x0238:
            long r21 = r16 - r18
            r1 = 0
            int r4 = (r21 > r1 ? 1 : (r21 == r1 ? 0 : -1))
            if (r4 > 0) goto L_0x0288
            com.google.android.gms.measurement.internal.ew r1 = r105.mo17217i()
            r1.mo17144d()
            com.google.android.gms.measurement.internal.r r2 = r1.mo17158r()
            com.google.android.gms.measurement.internal.t r2 = r2.mo17759x()
            java.lang.String r4 = "Clearing complex main event info. appId"
            r2.mo17764a(r4, r15)
            android.database.sqlite.SQLiteDatabase r2 = r1.mo17709y()     // Catch:{ SQLiteException -> 0x026b }
            java.lang.String r4 = "delete from main_event_params where app_id=?"
            r39 = r3
            r8 = 1
            java.lang.String[] r3 = new java.lang.String[r8]     // Catch:{ SQLiteException -> 0x0269 }
            r16 = 0
            r3[r16] = r15     // Catch:{ SQLiteException -> 0x0267 }
            r2.execSQL(r4, r3)     // Catch:{ SQLiteException -> 0x0267 }
            goto L_0x027f
        L_0x0267:
            r0 = move-exception
            goto L_0x0271
        L_0x0269:
            r0 = move-exception
            goto L_0x026f
        L_0x026b:
            r0 = move-exception
            r39 = r3
            r8 = 1
        L_0x026f:
            r16 = 0
        L_0x0271:
            r2 = r0
            com.google.android.gms.measurement.internal.r r1 = r1.mo17158r()
            com.google.android.gms.measurement.internal.t r1 = r1.mo17761y_()
            java.lang.String r3 = "Error clearing complex main event"
            r1.mo17764a(r3, r2)
        L_0x027f:
            r26 = r5
            r40 = r6
            r24 = r38
            r13 = r39
            goto L_0x02a2
        L_0x0288:
            r39 = r3
            r4 = 1
            r16 = 0
            com.google.android.gms.measurement.internal.ew r1 = r105.mo17217i()
            r2 = r15
            r13 = r39
            r3 = r8
            r8 = r4
            r26 = r5
            r24 = r38
            r4 = r21
            r40 = r6
            r6 = r11
            r1.mo17692a(r2, r3, r4, r6)
        L_0x02a2:
            com.google.android.gms.internal.e.v[] r1 = r11.f15152a
            int r1 = r1.length
            int r2 = r14.length
            int r1 = r1 + r2
            com.google.android.gms.internal.e.v[] r1 = new com.google.android.gms.internal.p148e.C4649v[r1]
            com.google.android.gms.internal.e.v[] r2 = r11.f15152a
            int r3 = r2.length
            r4 = 0
            r5 = 0
        L_0x02ae:
            if (r4 >= r3) goto L_0x02c6
            r6 = r2[r4]
            r105.mo17214g()
            java.lang.String r8 = r6.f15158a
            com.google.android.gms.internal.e.v r8 = com.google.android.gms.measurement.internal.C4859ei.m20919a(r13, r8)
            if (r8 != 0) goto L_0x02c2
            int r8 = r5 + 1
            r1[r5] = r6
            r5 = r8
        L_0x02c2:
            int r4 = r4 + 1
            r8 = 1
            goto L_0x02ae
        L_0x02c6:
            if (r5 <= 0) goto L_0x02e6
            int r2 = r14.length
            r3 = 0
        L_0x02ca:
            if (r3 >= r2) goto L_0x02d6
            r4 = r14[r3]
            int r6 = r5 + 1
            r1[r5] = r4
            int r3 = r3 + 1
            r5 = r6
            goto L_0x02ca
        L_0x02d6:
            int r2 = r1.length
            if (r5 != r2) goto L_0x02da
            goto L_0x02e0
        L_0x02da:
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r5)
            com.google.android.gms.internal.e.v[] r1 = (com.google.android.gms.internal.p148e.C4649v[]) r1
        L_0x02e0:
            r31 = r1
            r5 = r9
            r25 = r11
            goto L_0x02f8
        L_0x02e6:
            com.google.android.gms.measurement.internal.r r1 = r105.mo17158r()
            com.google.android.gms.measurement.internal.t r1 = r1.mo17754i()
            java.lang.String r2 = "No unique parameters in main event. eventName"
            r1.mo17764a(r2, r9)
            r5 = r9
            r25 = r11
            r31 = r14
        L_0x02f8:
            r27 = r20
            r28 = r21
            r9 = 1
            r20 = 0
            goto L_0x0389
        L_0x0301:
            r26 = r5
            r40 = r6
            r24 = r38
            r6 = 1
            com.google.android.gms.measurement.internal.r r3 = r105.mo17158r()
            com.google.android.gms.measurement.internal.t r3 = r3.mo17761y_()
            java.lang.String r4 = "Extra parameter without existing main event. eventName, eventId"
            r3.mo17765a(r4, r9, r8)
        L_0x0315:
            r64 = r10
            r75 = r12
            r3 = r15
            r11 = r30
            r79 = r33
            r72 = r34
            r81 = r35
            r71 = r40
            r41 = 0
            goto L_0x07f4
        L_0x0328:
            r13 = r3
            r26 = r5
            r40 = r6
            r24 = r38
            r6 = 1
            if (r9 == 0) goto L_0x0374
            r105.mo17214g()
            java.lang.String r1 = "_epc"
            r4 = 0
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            java.lang.Object r1 = com.google.android.gms.measurement.internal.C4859ei.m20929b(r13, r1)
            if (r1 != 0) goto L_0x0344
            r1 = r2
        L_0x0344:
            java.lang.Long r1 = (java.lang.Long) r1
            long r16 = r1.longValue()
            int r1 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r1 > 0) goto L_0x035f
            com.google.android.gms.measurement.internal.r r1 = r105.mo17158r()
            com.google.android.gms.measurement.internal.t r1 = r1.mo17754i()
            java.lang.String r2 = "Complex event with zero extra param count. eventName"
            r1.mo17764a(r2, r11)
            r20 = r4
            r9 = r6
            goto L_0x036e
        L_0x035f:
            com.google.android.gms.measurement.internal.ew r1 = r105.mo17217i()
            r2 = r15
            r3 = r8
            r20 = r4
            r4 = r16
            r9 = r6
            r6 = r13
            r1.mo17692a(r2, r3, r4, r6)
        L_0x036e:
            r27 = r8
            r5 = r11
            r25 = r13
            goto L_0x0385
        L_0x0374:
            r9 = r6
            goto L_0x037e
        L_0x0376:
            r13 = r3
            r24 = r4
            r26 = r5
            r40 = r6
            r9 = 1
        L_0x037e:
            r20 = 0
            r25 = r1
            r27 = r2
            r5 = r11
        L_0x0385:
            r31 = r14
            r28 = r16
        L_0x0389:
            com.google.android.gms.measurement.internal.ew r1 = r105.mo17217i()
            java.lang.String r2 = r13.f15153b
            com.google.android.gms.measurement.internal.d r1 = r1.mo17677a(r15, r2)
            if (r1 != 0) goto L_0x03f0
            com.google.android.gms.measurement.internal.r r1 = r105.mo17158r()
            com.google.android.gms.measurement.internal.t r1 = r1.mo17754i()
            java.lang.String r2 = "Event aggregate wasn't created during raw event logging. appId, event"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C4893r.m21360a(r106)
            com.google.android.gms.measurement.internal.p r4 = r105.mo17155o()
            java.lang.String r4 = r4.mo17746a(r5)
            r1.mo17765a(r2, r3, r4)
            com.google.android.gms.measurement.internal.d r1 = new com.google.android.gms.measurement.internal.d
            java.lang.String r2 = r13.f15153b
            r3 = 1
            r16 = 1
            java.lang.Long r6 = r13.f15154c
            long r18 = r6.longValue()
            r36 = 0
            r6 = 0
            r22 = 0
            r32 = 0
            r38 = 0
            r41 = r20
            r14 = r33
            r8 = r1
            r11 = r34
            r9 = r15
            r44 = r10
            r43 = r35
            r10 = r2
            r46 = r11
            r45 = r12
            r2 = r30
            r11 = r3
            r47 = r13
            r3 = r14
            r4 = r108
            r13 = r16
            r15 = r18
            r17 = r36
            r19 = r6
            r20 = r22
            r21 = r32
            r22 = r38
            r8.<init>(r9, r10, r11, r13, r15, r17, r19, r20, r21, r22)
            goto L_0x0432
        L_0x03f0:
            r44 = r10
            r45 = r12
            r47 = r13
            r41 = r20
            r2 = r30
            r3 = r33
            r46 = r34
            r43 = r35
            r4 = r108
            com.google.android.gms.measurement.internal.d r6 = new com.google.android.gms.measurement.internal.d
            java.lang.String r8 = r1.f15661a
            java.lang.String r9 = r1.f15662b
            long r10 = r1.f15663c
            long r51 = r10 + r18
            long r10 = r1.f15664d
            long r53 = r10 + r18
            long r10 = r1.f15665e
            long r12 = r1.f15666f
            java.lang.Long r14 = r1.f15667g
            java.lang.Long r15 = r1.f15668h
            java.lang.Long r4 = r1.f15669i
            java.lang.Boolean r1 = r1.f15670j
            r48 = r6
            r49 = r8
            r50 = r9
            r55 = r10
            r57 = r12
            r59 = r14
            r60 = r15
            r61 = r4
            r62 = r1
            r48.<init>(r49, r50, r51, r53, r55, r57, r59, r60, r61, r62)
            r1 = r6
        L_0x0432:
            com.google.android.gms.measurement.internal.ew r4 = r105.mo17217i()
            r4.mo17684a(r1)
            long r8 = r1.f15663c
            r10 = r44
            java.lang.Object r1 = r10.get(r5)
            java.util.Map r1 = (java.util.Map) r1
            if (r1 != 0) goto L_0x045a
            com.google.android.gms.measurement.internal.ew r1 = r105.mo17217i()
            r11 = r106
            java.util.Map r1 = r1.mo17703f(r11, r5)
            if (r1 != 0) goto L_0x0456
            android.support.v4.d.a r1 = new android.support.v4.d.a
            r1.<init>()
        L_0x0456:
            r10.put(r5, r1)
            goto L_0x045c
        L_0x045a:
            r11 = r106
        L_0x045c:
            r12 = r1
            java.util.Set r1 = r12.keySet()
            java.util.Iterator r13 = r1.iterator()
        L_0x0465:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x07e0
            java.lang.Object r1 = r13.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r14 = r1.intValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            boolean r1 = r2.contains(r1)
            if (r1 == 0) goto L_0x0491
            com.google.android.gms.measurement.internal.r r1 = r105.mo17158r()
            com.google.android.gms.measurement.internal.t r1 = r1.mo17759x()
            java.lang.String r4 = "Skipping failed audience ID"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r14)
            r1.mo17764a(r4, r6)
            goto L_0x0465
        L_0x0491:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r15 = r45
            java.lang.Object r1 = r15.get(r1)
            com.google.android.gms.internal.e.s r1 = (com.google.android.gms.internal.p148e.C4646s) r1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r14)
            r6 = r43
            java.lang.Object r4 = r6.get(r4)
            java.util.BitSet r4 = (java.util.BitSet) r4
            r63 = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            r64 = r10
            r10 = r46
            java.lang.Object r2 = r10.get(r2)
            java.util.BitSet r2 = (java.util.BitSet) r2
            if (r23 == 0) goto L_0x04d8
            r65 = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            java.lang.Object r2 = r3.get(r2)
            java.util.Map r2 = (java.util.Map) r2
            r66 = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            r67 = r13
            r13 = r40
            java.lang.Object r2 = r13.get(r2)
            java.util.Map r2 = (java.util.Map) r2
            goto L_0x04e1
        L_0x04d8:
            r65 = r2
            r67 = r13
            r13 = r40
            r2 = 0
            r66 = 0
        L_0x04e1:
            if (r1 != 0) goto L_0x0546
            com.google.android.gms.internal.e.s r1 = new com.google.android.gms.internal.e.s
            r1.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r14)
            r15.put(r4, r1)
            r68 = r2
            r4 = 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            r1.f15147d = r2
            java.util.BitSet r1 = new java.util.BitSet
            r1.<init>()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            r6.put(r2, r1)
            java.util.BitSet r2 = new java.util.BitSet
            r2.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r14)
            r10.put(r4, r2)
            if (r23 == 0) goto L_0x0535
            android.support.v4.d.a r4 = new android.support.v4.d.a
            r4.<init>()
            r69 = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r3.put(r1, r4)
            android.support.v4.d.a r1 = new android.support.v4.d.a
            r1.<init>()
            r70 = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            r13.put(r2, r1)
            r72 = r10
            r71 = r13
            r10 = r1
            r13 = r4
            goto L_0x0541
        L_0x0535:
            r69 = r1
            r70 = r2
            r72 = r10
            r71 = r13
            r13 = r66
            r10 = r68
        L_0x0541:
            r4 = r69
            r1 = r70
            goto L_0x0552
        L_0x0546:
            r68 = r2
            r72 = r10
            r71 = r13
            r1 = r65
            r13 = r66
            r10 = r68
        L_0x0552:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            java.lang.Object r2 = r12.get(r2)
            java.util.List r2 = (java.util.List) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x0560:
            boolean r16 = r2.hasNext()
            if (r16 == 0) goto L_0x07c9
            java.lang.Object r16 = r2.next()
            r73 = r12
            r12 = r16
            com.google.android.gms.internal.e.k r12 = (com.google.android.gms.internal.p148e.C4638k) r12
            r74 = r1
            com.google.android.gms.measurement.internal.r r1 = r105.mo17158r()
            r75 = r15
            r15 = 2
            boolean r1 = r1.mo17751a(r15)
            if (r1 == 0) goto L_0x05b8
            com.google.android.gms.measurement.internal.r r1 = r105.mo17158r()
            com.google.android.gms.measurement.internal.t r1 = r1.mo17759x()
            java.lang.String r15 = "Evaluating filter. audience, filter, event"
            r76 = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            r77 = r3
            java.lang.Integer r3 = r12.f15100a
            r78 = r6
            com.google.android.gms.measurement.internal.p r6 = r105.mo17155o()
            java.lang.String r11 = r12.f15101b
            java.lang.String r6 = r6.mo17746a(r11)
            r1.mo17766a(r15, r2, r3, r6)
            com.google.android.gms.measurement.internal.r r1 = r105.mo17158r()
            com.google.android.gms.measurement.internal.t r1 = r1.mo17759x()
            java.lang.String r2 = "Filter definition"
            com.google.android.gms.measurement.internal.ei r3 = r105.mo17214g()
            java.lang.String r3 = r3.mo17469a(r12)
            r1.mo17764a(r2, r3)
            goto L_0x05be
        L_0x05b8:
            r76 = r2
            r77 = r3
            r78 = r6
        L_0x05be:
            java.lang.Integer r1 = r12.f15100a
            if (r1 == 0) goto L_0x0784
            java.lang.Integer r1 = r12.f15100a
            int r1 = r1.intValue()
            r11 = 256(0x100, float:3.59E-43)
            if (r1 <= r11) goto L_0x05ce
            goto L_0x0784
        L_0x05ce:
            if (r23 == 0) goto L_0x06de
            if (r12 == 0) goto L_0x05e0
            java.lang.Boolean r1 = r12.f15104e
            if (r1 == 0) goto L_0x05e0
            java.lang.Boolean r1 = r12.f15104e
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x05e0
            r15 = 1
            goto L_0x05e1
        L_0x05e0:
            r15 = 0
        L_0x05e1:
            if (r12 == 0) goto L_0x05f2
            java.lang.Boolean r1 = r12.f15105f
            if (r1 == 0) goto L_0x05f2
            java.lang.Boolean r1 = r12.f15105f
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x05f2
            r16 = 1
            goto L_0x05f4
        L_0x05f2:
            r16 = 0
        L_0x05f4:
            java.lang.Integer r1 = r12.f15100a
            int r1 = r1.intValue()
            boolean r1 = r4.get(r1)
            if (r1 == 0) goto L_0x0625
            if (r15 != 0) goto L_0x0625
            if (r16 != 0) goto L_0x0625
            com.google.android.gms.measurement.internal.r r1 = r105.mo17158r()
            com.google.android.gms.measurement.internal.t r1 = r1.mo17759x()
            java.lang.String r2 = "Event filter already evaluated true and it is not associated with a dynamic audience. audience ID, filter ID"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r14)
            java.lang.Integer r6 = r12.f15100a
            r1.mo17765a(r2, r3, r6)
            r12 = r73
            r1 = r74
            r15 = r75
            r2 = r76
            r3 = r77
            r6 = r78
            goto L_0x0767
        L_0x0625:
            r6 = r74
            r1 = r7
            r3 = r63
            r17 = r76
            r11 = 1
            r2 = r12
            r11 = r3
            r79 = r77
            r3 = r5
            r80 = r13
            r13 = r4
            r4 = r31
            r18 = r5
            r82 = r10
            r81 = r78
            r10 = r6
            r5 = r8
            java.lang.Boolean r1 = r1.m21082a(r2, r3, r4, r5)
            com.google.android.gms.measurement.internal.r r2 = r105.mo17158r()
            com.google.android.gms.measurement.internal.t r2 = r2.mo17759x()
            java.lang.String r3 = "Event filter result"
            if (r1 != 0) goto L_0x0652
            java.lang.String r4 = "null"
            goto L_0x0653
        L_0x0652:
            r4 = r1
        L_0x0653:
            r2.mo17764a(r3, r4)
            if (r1 != 0) goto L_0x0675
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r11.add(r1)
        L_0x065f:
            r1 = r10
            r63 = r11
            r4 = r13
        L_0x0663:
            r2 = r17
            r5 = r18
            r12 = r73
            r15 = r75
            r3 = r79
            r13 = r80
            r6 = r81
            r10 = r82
            goto L_0x0767
        L_0x0675:
            java.lang.Integer r2 = r12.f15100a
            int r2 = r2.intValue()
            r10.set(r2)
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x065f
            java.lang.Integer r1 = r12.f15100a
            int r1 = r1.intValue()
            r13.set(r1)
            if (r15 != 0) goto L_0x0691
            if (r16 == 0) goto L_0x065f
        L_0x0691:
            r15 = r47
            java.lang.Long r1 = r15.f15154c
            if (r1 == 0) goto L_0x06d7
            if (r16 == 0) goto L_0x06c3
            java.lang.Integer r1 = r12.f15100a
            int r1 = r1.intValue()
            java.lang.Long r2 = r15.f15154c
            long r2 = r2.longValue()
            r5 = r82
            m21091b(r5, r1, r2)
            r1 = r10
            r63 = r11
            r4 = r13
            r47 = r15
            r2 = r17
            r12 = r73
            r15 = r75
            r3 = r79
            r13 = r80
            r6 = r81
            r11 = r106
            r10 = r5
            r5 = r18
            goto L_0x0560
        L_0x06c3:
            r5 = r82
            java.lang.Integer r1 = r12.f15100a
            int r1 = r1.intValue()
            java.lang.Long r2 = r15.f15154c
            long r2 = r2.longValue()
            r6 = r80
            m21089a(r6, r1, r2)
            goto L_0x070e
        L_0x06d7:
            r1 = r10
            r63 = r11
            r4 = r13
            r47 = r15
            goto L_0x0663
        L_0x06de:
            r18 = r5
            r5 = r10
            r6 = r13
            r15 = r47
            r11 = r63
            r10 = r74
            r17 = r76
            r79 = r77
            r81 = r78
            r13 = r4
            java.lang.Integer r1 = r12.f15100a
            int r1 = r1.intValue()
            boolean r1 = r13.get(r1)
            if (r1 == 0) goto L_0x0726
            com.google.android.gms.measurement.internal.r r1 = r105.mo17158r()
            com.google.android.gms.measurement.internal.t r1 = r1.mo17759x()
            java.lang.String r2 = "Event filter already evaluated true. audience ID, filter ID"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r14)
            java.lang.Integer r4 = r12.f15100a
            r1.mo17765a(r2, r3, r4)
        L_0x070e:
            r1 = r10
            r63 = r11
            r4 = r13
            r47 = r15
            r2 = r17
            r12 = r73
            r15 = r75
            r3 = r79
            r11 = r106
            r10 = r5
            r13 = r6
            r5 = r18
            r6 = r81
            goto L_0x0560
        L_0x0726:
            r1 = r7
            r2 = r12
            r3 = r18
            r4 = r31
            r68 = r5
            r66 = r6
            r5 = r8
            java.lang.Boolean r1 = r1.m21082a(r2, r3, r4, r5)
            com.google.android.gms.measurement.internal.r r2 = r105.mo17158r()
            com.google.android.gms.measurement.internal.t r2 = r2.mo17759x()
            java.lang.String r3 = "Event filter result"
            if (r1 != 0) goto L_0x0744
            java.lang.String r4 = "null"
            goto L_0x0745
        L_0x0744:
            r4 = r1
        L_0x0745:
            r2.mo17764a(r3, r4)
            if (r1 != 0) goto L_0x076b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r11.add(r1)
        L_0x0751:
            r1 = r10
            r63 = r11
            r4 = r13
            r47 = r15
            r2 = r17
            r5 = r18
            r13 = r66
            r10 = r68
            r12 = r73
            r15 = r75
            r3 = r79
            r6 = r81
        L_0x0767:
            r11 = r106
            goto L_0x0560
        L_0x076b:
            java.lang.Integer r2 = r12.f15100a
            int r2 = r2.intValue()
            r10.set(r2)
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0751
            java.lang.Integer r1 = r12.f15100a
            int r1 = r1.intValue()
            r13.set(r1)
            goto L_0x0751
        L_0x0784:
            r18 = r5
            r68 = r10
            r66 = r13
            r15 = r47
            r11 = r63
            r10 = r74
            r17 = r76
            r79 = r77
            r81 = r78
            r13 = r4
            com.google.android.gms.measurement.internal.r r1 = r105.mo17158r()
            com.google.android.gms.measurement.internal.t r1 = r1.mo17754i()
            java.lang.String r2 = "Invalid event filter ID. appId, id"
            r3 = r106
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4893r.m21360a(r106)
            java.lang.Integer r5 = r12.f15100a
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r1.mo17765a(r2, r4, r5)
            r1 = r10
            r63 = r11
            r4 = r13
            r47 = r15
            r2 = r17
            r5 = r18
            r13 = r66
            r10 = r68
            r12 = r73
            r15 = r75
            r6 = r81
            r11 = r3
            r3 = r79
            goto L_0x0560
        L_0x07c9:
            r79 = r3
            r3 = r11
            r75 = r15
            r43 = r6
            r2 = r63
            r10 = r64
            r13 = r67
            r40 = r71
            r46 = r72
            r45 = r75
            r3 = r79
            goto L_0x0465
        L_0x07e0:
            r79 = r3
            r64 = r10
            r3 = r11
            r71 = r40
            r81 = r43
            r75 = r45
            r72 = r46
            r11 = r2
            r1 = r25
            r2 = r27
            r16 = r28
        L_0x07f4:
            int r5 = r26 + 1
            r13 = r107
            r15 = r3
            r30 = r11
            r4 = r24
            r10 = r64
            r6 = r71
            r34 = r72
            r12 = r75
            r33 = r79
            r35 = r81
            goto L_0x019a
        L_0x080b:
            r71 = r6
            r75 = r12
            r3 = r15
            r11 = r30
            r79 = r33
            r72 = r34
            r81 = r35
            r1 = r108
            if (r1 == 0) goto L_0x0b38
            android.support.v4.d.a r2 = new android.support.v4.d.a
            r2.<init>()
            int r4 = r1.length
            r5 = 0
        L_0x0823:
            if (r5 >= r4) goto L_0x0b38
            r6 = r1[r5]
            java.lang.String r8 = r6.f14631b
            java.lang.Object r8 = r2.get(r8)
            java.util.Map r8 = (java.util.Map) r8
            if (r8 != 0) goto L_0x0847
            com.google.android.gms.measurement.internal.ew r8 = r105.mo17217i()
            java.lang.String r9 = r6.f14631b
            java.util.Map r8 = r8.mo17705g(r3, r9)
            if (r8 != 0) goto L_0x0842
            android.support.v4.d.a r8 = new android.support.v4.d.a
            r8.<init>()
        L_0x0842:
            java.lang.String r9 = r6.f14631b
            r2.put(r9, r8)
        L_0x0847:
            java.util.Set r9 = r8.keySet()
            java.util.Iterator r9 = r9.iterator()
        L_0x084f:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0b22
            java.lang.Object r10 = r9.next()
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)
            boolean r12 = r11.contains(r12)
            if (r12 == 0) goto L_0x087b
            com.google.android.gms.measurement.internal.r r12 = r105.mo17158r()
            com.google.android.gms.measurement.internal.t r12 = r12.mo17759x()
            java.lang.String r13 = "Skipping failed audience ID"
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r12.mo17764a(r13, r10)
            goto L_0x084f
        L_0x087b:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)
            r13 = r75
            java.lang.Object r12 = r13.get(r12)
            com.google.android.gms.internal.e.s r12 = (com.google.android.gms.internal.p148e.C4646s) r12
            java.lang.Integer r14 = java.lang.Integer.valueOf(r10)
            r15 = r81
            java.lang.Object r14 = r15.get(r14)
            java.util.BitSet r14 = (java.util.BitSet) r14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r83 = r2
            r2 = r72
            java.lang.Object r1 = r2.get(r1)
            java.util.BitSet r1 = (java.util.BitSet) r1
            if (r23 == 0) goto L_0x08c4
            r84 = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r85 = r4
            r4 = r79
            java.lang.Object r1 = r4.get(r1)
            java.util.Map r1 = (java.util.Map) r1
            r86 = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r87 = r9
            r9 = r71
            java.lang.Object r1 = r9.get(r1)
            java.util.Map r1 = (java.util.Map) r1
            goto L_0x08d1
        L_0x08c4:
            r84 = r1
            r85 = r4
            r87 = r9
            r9 = r71
            r4 = r79
            r1 = 0
            r86 = 0
        L_0x08d1:
            if (r12 != 0) goto L_0x0936
            com.google.android.gms.internal.e.s r12 = new com.google.android.gms.internal.e.s
            r12.<init>()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r10)
            r13.put(r14, r12)
            r88 = r1
            r14 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r14)
            r12.f15147d = r1
            java.util.BitSet r1 = new java.util.BitSet
            r1.<init>()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)
            r15.put(r12, r1)
            java.util.BitSet r12 = new java.util.BitSet
            r12.<init>()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r10)
            r2.put(r14, r12)
            if (r23 == 0) goto L_0x0927
            android.support.v4.d.a r14 = new android.support.v4.d.a
            r14.<init>()
            r89 = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r4.put(r1, r14)
            android.support.v4.d.a r1 = new android.support.v4.d.a
            r1.<init>()
            r90 = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)
            r9.put(r12, r1)
            r92 = r4
            r91 = r9
            r12 = r90
            r9 = r1
            r1 = r14
            goto L_0x0933
        L_0x0927:
            r89 = r1
            r90 = r12
            r92 = r4
            r91 = r9
            r1 = r86
            r9 = r88
        L_0x0933:
            r14 = r89
            goto L_0x0942
        L_0x0936:
            r88 = r1
            r92 = r4
            r91 = r9
            r12 = r84
            r1 = r86
            r9 = r88
        L_0x0942:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            java.lang.Object r4 = r8.get(r4)
            java.util.List r4 = (java.util.List) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x0950:
            boolean r16 = r4.hasNext()
            if (r16 == 0) goto L_0x0b0e
            java.lang.Object r16 = r4.next()
            r93 = r4
            r4 = r16
            com.google.android.gms.internal.e.n r4 = (com.google.android.gms.internal.p148e.C4641n) r4
            r94 = r8
            com.google.android.gms.measurement.internal.r r8 = r105.mo17158r()
            r95 = r2
            r2 = 2
            boolean r8 = r8.mo17751a(r2)
            if (r8 == 0) goto L_0x09a8
            com.google.android.gms.measurement.internal.r r8 = r105.mo17158r()
            com.google.android.gms.measurement.internal.t r8 = r8.mo17759x()
            java.lang.String r2 = "Evaluating filter. audience, filter, property"
            r96 = r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r10)
            r97 = r15
            java.lang.Integer r15 = r4.f15118a
            r98 = r5
            com.google.android.gms.measurement.internal.p r5 = r105.mo17155o()
            java.lang.String r3 = r4.f15119b
            java.lang.String r3 = r5.mo17748c(r3)
            r8.mo17766a(r2, r13, r15, r3)
            com.google.android.gms.measurement.internal.r r2 = r105.mo17158r()
            com.google.android.gms.measurement.internal.t r2 = r2.mo17759x()
            java.lang.String r3 = "Filter definition"
            com.google.android.gms.measurement.internal.ei r5 = r105.mo17214g()
            java.lang.String r5 = r5.mo17470a(r4)
            r2.mo17764a(r3, r5)
            goto L_0x09ae
        L_0x09a8:
            r98 = r5
            r96 = r13
            r97 = r15
        L_0x09ae:
            java.lang.Integer r2 = r4.f15118a
            if (r2 == 0) goto L_0x0ad9
            java.lang.Integer r2 = r4.f15118a
            int r2 = r2.intValue()
            r3 = 256(0x100, float:3.59E-43)
            if (r2 <= r3) goto L_0x09be
            goto L_0x0ad9
        L_0x09be:
            if (r23 == 0) goto L_0x0a70
            if (r4 == 0) goto L_0x09d0
            java.lang.Boolean r2 = r4.f15121d
            if (r2 == 0) goto L_0x09d0
            java.lang.Boolean r2 = r4.f15121d
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x09d0
            r2 = 1
            goto L_0x09d1
        L_0x09d0:
            r2 = 0
        L_0x09d1:
            if (r4 == 0) goto L_0x09e1
            java.lang.Boolean r5 = r4.f15122e
            if (r5 == 0) goto L_0x09e1
            java.lang.Boolean r5 = r4.f15122e
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x09e1
            r5 = 1
            goto L_0x09e2
        L_0x09e1:
            r5 = 0
        L_0x09e2:
            java.lang.Integer r8 = r4.f15118a
            int r8 = r8.intValue()
            boolean r8 = r14.get(r8)
            if (r8 == 0) goto L_0x0a07
            if (r2 != 0) goto L_0x0a07
            if (r5 != 0) goto L_0x0a07
            com.google.android.gms.measurement.internal.r r2 = r105.mo17158r()
            com.google.android.gms.measurement.internal.t r2 = r2.mo17759x()
            java.lang.String r5 = "Property filter already evaluated true and it is not associated with a dynamic audience. audience ID, filter ID"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r4 = r4.f15118a
            r2.mo17765a(r5, r8, r4)
            goto L_0x0a8f
        L_0x0a07:
            java.lang.Boolean r8 = r7.m21083a(r4, r6)
            com.google.android.gms.measurement.internal.r r13 = r105.mo17158r()
            com.google.android.gms.measurement.internal.t r13 = r13.mo17759x()
            java.lang.String r15 = "Property filter result"
            if (r8 != 0) goto L_0x0a1c
            java.lang.String r16 = "null"
            r3 = r16
            goto L_0x0a1d
        L_0x0a1c:
            r3 = r8
        L_0x0a1d:
            r13.mo17764a(r15, r3)
            if (r8 != 0) goto L_0x0a2a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            r11.add(r2)
            goto L_0x0a8f
        L_0x0a2a:
            java.lang.Integer r3 = r4.f15118a
            int r3 = r3.intValue()
            r12.set(r3)
            java.lang.Integer r3 = r4.f15118a
            int r3 = r3.intValue()
            boolean r13 = r8.booleanValue()
            r14.set(r3, r13)
            boolean r3 = r8.booleanValue()
            if (r3 == 0) goto L_0x0a8f
            if (r2 != 0) goto L_0x0a4a
            if (r5 == 0) goto L_0x0a8f
        L_0x0a4a:
            java.lang.Long r2 = r6.f14630a
            if (r2 == 0) goto L_0x0a8f
            if (r5 == 0) goto L_0x0a60
            java.lang.Integer r2 = r4.f15118a
            int r2 = r2.intValue()
            java.lang.Long r3 = r6.f14630a
            long r3 = r3.longValue()
            m21091b(r9, r2, r3)
            goto L_0x0a8f
        L_0x0a60:
            java.lang.Integer r2 = r4.f15118a
            int r2 = r2.intValue()
            java.lang.Long r3 = r6.f14630a
            long r3 = r3.longValue()
            m21089a(r1, r2, r3)
            goto L_0x0a8f
        L_0x0a70:
            java.lang.Integer r2 = r4.f15118a
            int r2 = r2.intValue()
            boolean r2 = r14.get(r2)
            if (r2 == 0) goto L_0x0a9f
            com.google.android.gms.measurement.internal.r r2 = r105.mo17158r()
            com.google.android.gms.measurement.internal.t r2 = r2.mo17759x()
            java.lang.String r3 = "Property filter already evaluated true. audience ID, filter ID"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r4 = r4.f15118a
            r2.mo17765a(r3, r5, r4)
        L_0x0a8f:
            r4 = r93
            r8 = r94
            r2 = r95
            r13 = r96
            r15 = r97
            r5 = r98
            r3 = r106
            goto L_0x0950
        L_0x0a9f:
            java.lang.Boolean r2 = r7.m21083a(r4, r6)
            com.google.android.gms.measurement.internal.r r3 = r105.mo17158r()
            com.google.android.gms.measurement.internal.t r3 = r3.mo17759x()
            java.lang.String r5 = "Property filter result"
            if (r2 != 0) goto L_0x0ab2
            java.lang.String r8 = "null"
            goto L_0x0ab3
        L_0x0ab2:
            r8 = r2
        L_0x0ab3:
            r3.mo17764a(r5, r8)
            if (r2 != 0) goto L_0x0ac0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            r11.add(r2)
            goto L_0x0a8f
        L_0x0ac0:
            java.lang.Integer r3 = r4.f15118a
            int r3 = r3.intValue()
            r12.set(r3)
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0a8f
            java.lang.Integer r2 = r4.f15118a
            int r2 = r2.intValue()
            r14.set(r2)
            goto L_0x0a8f
        L_0x0ad9:
            com.google.android.gms.measurement.internal.r r1 = r105.mo17158r()
            com.google.android.gms.measurement.internal.t r1 = r1.mo17754i()
            java.lang.String r2 = "Invalid property filter ID. appId, id"
            r3 = r106
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C4893r.m21360a(r106)
            java.lang.Integer r4 = r4.f15118a
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r1.mo17765a(r2, r5, r4)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r11.add(r1)
            r2 = r83
            r4 = r85
            r9 = r87
            r71 = r91
            r79 = r92
            r8 = r94
            r72 = r95
            r75 = r96
            r81 = r97
            r5 = r98
            goto L_0x0b1e
        L_0x0b0e:
            r72 = r2
            r75 = r13
            r81 = r15
            r2 = r83
            r4 = r85
            r9 = r87
            r71 = r91
            r79 = r92
        L_0x0b1e:
            r1 = r108
            goto L_0x084f
        L_0x0b22:
            r83 = r2
            r85 = r4
            r98 = r5
            r91 = r71
            r95 = r72
            r96 = r75
            r92 = r79
            r97 = r81
            int r5 = r98 + 1
            r1 = r108
            goto L_0x0823
        L_0x0b38:
            r91 = r71
            r95 = r72
            r96 = r75
            r92 = r79
            r1 = r81
            int r2 = r1.size()
            com.google.android.gms.internal.e.s[] r2 = new com.google.android.gms.internal.p148e.C4646s[r2]
            java.util.Set r4 = r1.keySet()
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
        L_0x0b51:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0d0f
            java.lang.Object r6 = r4.next()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            boolean r8 = r11.contains(r8)
            if (r8 != 0) goto L_0x0b51
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            r9 = r96
            java.lang.Object r8 = r9.get(r8)
            com.google.android.gms.internal.e.s r8 = (com.google.android.gms.internal.p148e.C4646s) r8
            if (r8 != 0) goto L_0x0b7e
            com.google.android.gms.internal.e.s r8 = new com.google.android.gms.internal.e.s
            r8.<init>()
        L_0x0b7e:
            int r10 = r5 + 1
            r2[r5] = r8
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r8.f15144a = r5
            com.google.android.gms.internal.e.y r5 = new com.google.android.gms.internal.e.y
            r5.<init>()
            r8.f15145b = r5
            com.google.android.gms.internal.e.y r5 = r8.f15145b
            java.lang.Integer r12 = java.lang.Integer.valueOf(r6)
            java.lang.Object r12 = r1.get(r12)
            java.util.BitSet r12 = (java.util.BitSet) r12
            long[] r12 = com.google.android.gms.measurement.internal.C4859ei.m20927a(r12)
            r5.f15207b = r12
            com.google.android.gms.internal.e.y r5 = r8.f15145b
            java.lang.Integer r12 = java.lang.Integer.valueOf(r6)
            r13 = r95
            java.lang.Object r12 = r13.get(r12)
            java.util.BitSet r12 = (java.util.BitSet) r12
            long[] r12 = com.google.android.gms.measurement.internal.C4859ei.m20927a(r12)
            r5.f15206a = r12
            if (r23 == 0) goto L_0x0c65
            com.google.android.gms.internal.e.y r5 = r8.f15145b
            java.lang.Integer r12 = java.lang.Integer.valueOf(r6)
            r14 = r92
            java.lang.Object r12 = r14.get(r12)
            java.util.Map r12 = (java.util.Map) r12
            com.google.android.gms.internal.e.t[] r12 = m21090a(r12)
            r5.f15208c = r12
            com.google.android.gms.internal.e.y r5 = r8.f15145b
            java.lang.Integer r12 = java.lang.Integer.valueOf(r6)
            r15 = r91
            java.lang.Object r12 = r15.get(r12)
            java.util.Map r12 = (java.util.Map) r12
            if (r12 != 0) goto L_0x0be8
            r99 = r1
            r1 = 0
            com.google.android.gms.internal.e.z[] r12 = new com.google.android.gms.internal.p148e.C4653z[r1]
            r100 = r4
            r102 = r9
            r103 = r10
            goto L_0x0c62
        L_0x0be8:
            r99 = r1
            int r1 = r12.size()
            com.google.android.gms.internal.e.z[] r1 = new com.google.android.gms.internal.p148e.C4653z[r1]
            r100 = r4
            java.util.Set r4 = r12.keySet()
            java.util.Iterator r4 = r4.iterator()
            r16 = 0
        L_0x0bfc:
            boolean r17 = r4.hasNext()
            if (r17 == 0) goto L_0x0c5d
            java.lang.Object r17 = r4.next()
            r101 = r4
            r4 = r17
            java.lang.Integer r4 = (java.lang.Integer) r4
            r102 = r9
            com.google.android.gms.internal.e.z r9 = new com.google.android.gms.internal.e.z
            r9.<init>()
            r9.f15211a = r4
            java.lang.Object r4 = r12.get(r4)
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L_0x0c4e
            java.util.Collections.sort(r4)
            r103 = r10
            int r10 = r4.size()
            long[] r10 = new long[r10]
            java.util.Iterator r4 = r4.iterator()
            r17 = 0
        L_0x0c2e:
            boolean r18 = r4.hasNext()
            if (r18 == 0) goto L_0x0c4b
            java.lang.Object r18 = r4.next()
            r104 = r4
            r4 = r18
            java.lang.Long r4 = (java.lang.Long) r4
            int r18 = r17 + 1
            long r19 = r4.longValue()
            r10[r17] = r19
            r17 = r18
            r4 = r104
            goto L_0x0c2e
        L_0x0c4b:
            r9.f15212b = r10
            goto L_0x0c50
        L_0x0c4e:
            r103 = r10
        L_0x0c50:
            int r4 = r16 + 1
            r1[r16] = r9
            r16 = r4
            r4 = r101
            r9 = r102
            r10 = r103
            goto L_0x0bfc
        L_0x0c5d:
            r102 = r9
            r103 = r10
            r12 = r1
        L_0x0c62:
            r5.f15209d = r12
            goto L_0x0c71
        L_0x0c65:
            r99 = r1
            r100 = r4
            r102 = r9
            r103 = r10
            r15 = r91
            r14 = r92
        L_0x0c71:
            com.google.android.gms.measurement.internal.ew r1 = r105.mo17217i()
            com.google.android.gms.internal.e.y r4 = r8.f15145b
            r1.mo17430k()
            r1.mo17144d()
            com.google.android.gms.common.internal.C3513t.m12627a(r106)
            com.google.android.gms.common.internal.C3513t.m12625a(r4)
            int r5 = r4.mo16867e()     // Catch:{ IOException -> 0x0cea }
            byte[] r5 = new byte[r5]     // Catch:{ IOException -> 0x0cea }
            int r8 = r5.length     // Catch:{ IOException -> 0x0cea }
            r9 = 0
            com.google.android.gms.internal.e.gi r8 = com.google.android.gms.internal.p148e.C4623gi.m20047a(r5, r9, r8)     // Catch:{ IOException -> 0x0ce8 }
            r4.mo16327a(r8)     // Catch:{ IOException -> 0x0ce8 }
            r8.mo16830a()     // Catch:{ IOException -> 0x0ce8 }
            android.content.ContentValues r4 = new android.content.ContentValues
            r4.<init>()
            java.lang.String r8 = "app_id"
            r4.put(r8, r3)
            java.lang.String r8 = "audience_id"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.put(r8, r6)
            java.lang.String r6 = "current_results"
            r4.put(r6, r5)
            android.database.sqlite.SQLiteDatabase r5 = r1.mo17709y()     // Catch:{ SQLiteException -> 0x0cd3 }
            java.lang.String r6 = "audience_filter_values"
            r8 = 5
            r10 = 0
            long r4 = r5.insertWithOnConflict(r6, r10, r4, r8)     // Catch:{ SQLiteException -> 0x0cd1 }
            r16 = -1
            int r6 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r6 != 0) goto L_0x0cff
            com.google.android.gms.measurement.internal.r r4 = r1.mo17158r()     // Catch:{ SQLiteException -> 0x0cd1 }
            com.google.android.gms.measurement.internal.t r4 = r4.mo17761y_()     // Catch:{ SQLiteException -> 0x0cd1 }
            java.lang.String r5 = "Failed to insert filter results (got -1). appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C4893r.m21360a(r106)     // Catch:{ SQLiteException -> 0x0cd1 }
            r4.mo17764a(r5, r6)     // Catch:{ SQLiteException -> 0x0cd1 }
            goto L_0x0cff
        L_0x0cd1:
            r0 = move-exception
            goto L_0x0cd5
        L_0x0cd3:
            r0 = move-exception
            r10 = 0
        L_0x0cd5:
            r4 = r0
            com.google.android.gms.measurement.internal.r r1 = r1.mo17158r()
            com.google.android.gms.measurement.internal.t r1 = r1.mo17761y_()
            java.lang.String r5 = "Error storing filter results. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C4893r.m21360a(r106)
            r1.mo17765a(r5, r6, r4)
            goto L_0x0cff
        L_0x0ce8:
            r0 = move-exception
            goto L_0x0cec
        L_0x0cea:
            r0 = move-exception
            r9 = 0
        L_0x0cec:
            r10 = 0
            r4 = r0
            com.google.android.gms.measurement.internal.r r1 = r1.mo17158r()
            com.google.android.gms.measurement.internal.t r1 = r1.mo17761y_()
            java.lang.String r5 = "Configuration loss. Failed to serialize filter results. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C4893r.m21360a(r106)
            r1.mo17765a(r5, r6, r4)
        L_0x0cff:
            r95 = r13
            r92 = r14
            r91 = r15
            r1 = r99
            r4 = r100
            r96 = r102
            r5 = r103
            goto L_0x0b51
        L_0x0d0f:
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r2, r5)
            com.google.android.gms.internal.e.s[] r1 = (com.google.android.gms.internal.p148e.C4646s[]) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4867eq.mo17633a(java.lang.String, com.google.android.gms.internal.e.u[], com.google.android.gms.internal.e.aa[]):com.google.android.gms.internal.e.s[]");
    }

    /* renamed from: a */
    private final Boolean m21082a(C4638k kVar, String str, C4649v[] vVarArr, long j) {
        C4639l[] lVarArr;
        C4639l[] lVarArr2;
        Boolean bool;
        if (kVar.f15103d != null) {
            Boolean a = m21081a(j, kVar.f15103d);
            if (a == null) {
                return null;
            }
            if (!a.booleanValue()) {
                return Boolean.valueOf(false);
            }
        }
        HashSet hashSet = new HashSet();
        for (C4639l lVar : kVar.f15102c) {
            if (TextUtils.isEmpty(lVar.f15111d)) {
                mo17158r().mo17754i().mo17764a("null or empty param name in filter. event", mo17155o().mo17746a(str));
                return null;
            }
            hashSet.add(lVar.f15111d);
        }
        C0376a aVar = new C0376a();
        for (C4649v vVar : vVarArr) {
            if (hashSet.contains(vVar.f15158a)) {
                if (vVar.f15160c != null) {
                    aVar.put(vVar.f15158a, vVar.f15160c);
                } else if (vVar.f15161d != null) {
                    aVar.put(vVar.f15158a, vVar.f15161d);
                } else if (vVar.f15159b != null) {
                    aVar.put(vVar.f15158a, vVar.f15159b);
                } else {
                    mo17158r().mo17754i().mo17765a("Unknown value for param. event, param", mo17155o().mo17746a(str), mo17155o().mo17747b(vVar.f15158a));
                    return null;
                }
            }
        }
        for (C4639l lVar2 : kVar.f15102c) {
            boolean equals = Boolean.TRUE.equals(lVar2.f15110c);
            String str2 = lVar2.f15111d;
            if (TextUtils.isEmpty(str2)) {
                mo17158r().mo17754i().mo17764a("Event has empty param name. event", mo17155o().mo17746a(str));
                return null;
            }
            Object obj = aVar.get(str2);
            if (obj instanceof Long) {
                if (lVar2.f15109b == null) {
                    mo17158r().mo17754i().mo17765a("No number filter for long param. event, param", mo17155o().mo17746a(str), mo17155o().mo17747b(str2));
                    return null;
                }
                Boolean a2 = m21081a(((Long) obj).longValue(), lVar2.f15109b);
                if (a2 == null) {
                    return null;
                }
                if ((true ^ a2.booleanValue()) ^ equals) {
                    return Boolean.valueOf(false);
                }
            } else if (obj instanceof Double) {
                if (lVar2.f15109b == null) {
                    mo17158r().mo17754i().mo17765a("No number filter for double param. event, param", mo17155o().mo17746a(str), mo17155o().mo17747b(str2));
                    return null;
                }
                Boolean a3 = m21080a(((Double) obj).doubleValue(), lVar2.f15109b);
                if (a3 == null) {
                    return null;
                }
                if ((true ^ a3.booleanValue()) ^ equals) {
                    return Boolean.valueOf(false);
                }
            } else if (obj instanceof String) {
                if (lVar2.f15108a != null) {
                    bool = m21087a((String) obj, lVar2.f15108a);
                } else if (lVar2.f15109b != null) {
                    String str3 = (String) obj;
                    if (C4859ei.m20925a(str3)) {
                        bool = m21086a(str3, lVar2.f15109b);
                    } else {
                        mo17158r().mo17754i().mo17765a("Invalid param value for number filter. event, param", mo17155o().mo17746a(str), mo17155o().mo17747b(str2));
                        return null;
                    }
                } else {
                    mo17158r().mo17754i().mo17765a("No filter for String param. event, param", mo17155o().mo17746a(str), mo17155o().mo17747b(str2));
                    return null;
                }
                if (bool == null) {
                    return null;
                }
                if ((true ^ bool.booleanValue()) ^ equals) {
                    return Boolean.valueOf(false);
                }
            } else if (obj == null) {
                mo17158r().mo17759x().mo17765a("Missing param for filter. event, param", mo17155o().mo17746a(str), mo17155o().mo17747b(str2));
                return Boolean.valueOf(false);
            } else {
                mo17158r().mo17754i().mo17765a("Unknown param type. event, param", mo17155o().mo17746a(str), mo17155o().mo17747b(str2));
                return null;
            }
        }
        return Boolean.valueOf(true);
    }

    /* renamed from: a */
    private final Boolean m21083a(C4641n nVar, C4433aa aaVar) {
        C4639l lVar = nVar.f15120c;
        if (lVar == null) {
            mo17158r().mo17754i().mo17764a("Missing property filter. property", mo17155o().mo17748c(aaVar.f14631b));
            return null;
        }
        boolean equals = Boolean.TRUE.equals(lVar.f15110c);
        if (aaVar.f14633d != null) {
            if (lVar.f15109b != null) {
                return m21084a(m21081a(aaVar.f14633d.longValue(), lVar.f15109b), equals);
            }
            mo17158r().mo17754i().mo17764a("No number filter for long property. property", mo17155o().mo17748c(aaVar.f14631b));
            return null;
        } else if (aaVar.f14634e != null) {
            if (lVar.f15109b != null) {
                return m21084a(m21080a(aaVar.f14634e.doubleValue(), lVar.f15109b), equals);
            }
            mo17158r().mo17754i().mo17764a("No number filter for double property. property", mo17155o().mo17748c(aaVar.f14631b));
            return null;
        } else if (aaVar.f14632c == null) {
            mo17158r().mo17754i().mo17764a("User property has no value, property", mo17155o().mo17748c(aaVar.f14631b));
            return null;
        } else if (lVar.f15108a != null) {
            return m21084a(m21087a(aaVar.f14632c, lVar.f15108a), equals);
        } else {
            if (lVar.f15109b == null) {
                mo17158r().mo17754i().mo17764a("No string or number filter defined. property", mo17155o().mo17748c(aaVar.f14631b));
            } else if (C4859ei.m20925a(aaVar.f14632c)) {
                return m21084a(m21086a(aaVar.f14632c, lVar.f15109b), equals);
            } else {
                mo17158r().mo17754i().mo17765a("Invalid user property value for Numeric number filter. property, value", mo17155o().mo17748c(aaVar.f14631b), aaVar.f14632c);
            }
            return null;
        }
    }

    /* renamed from: a */
    private static Boolean m21084a(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() ^ z);
    }

    /* renamed from: a */
    private final Boolean m21087a(String str, C4642o oVar) {
        String str2;
        List list;
        C3513t.m12625a(oVar);
        if (str == null || oVar.f15123a == null || oVar.f15123a.intValue() == 0) {
            return null;
        }
        if (oVar.f15123a.intValue() == 6) {
            if (oVar.f15126d == null || oVar.f15126d.length == 0) {
                return null;
            }
        } else if (oVar.f15124b == null) {
            return null;
        }
        int intValue = oVar.f15123a.intValue();
        boolean z = oVar.f15125c != null && oVar.f15125c.booleanValue();
        if (z || intValue == 1 || intValue == 6) {
            str2 = oVar.f15124b;
        } else {
            str2 = oVar.f15124b.toUpperCase(Locale.ENGLISH);
        }
        String str3 = str2;
        if (oVar.f15126d == null) {
            list = null;
        } else {
            String[] strArr = oVar.f15126d;
            if (z) {
                list = Arrays.asList(strArr);
            } else {
                ArrayList arrayList = new ArrayList();
                for (String upperCase : strArr) {
                    arrayList.add(upperCase.toUpperCase(Locale.ENGLISH));
                }
                list = arrayList;
            }
        }
        return m21085a(str, intValue, z, str3, list, intValue == 1 ? str3 : null);
    }

    /* renamed from: a */
    private final Boolean m21085a(String str, int i, boolean z, String str2, List<String> list, String str3) {
        if (str == null) {
            return null;
        }
        if (i == 6) {
            if (list == null || list.size() == 0) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && i != 1) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (i) {
            case 1:
                try {
                    return Boolean.valueOf(Pattern.compile(str3, z ? 0 : 66).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    mo17158r().mo17754i().mo17764a("Invalid regular expression in REGEXP audience filter. expression", str3);
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(str2));
            case 3:
                return Boolean.valueOf(str.endsWith(str2));
            case 4:
                return Boolean.valueOf(str.contains(str2));
            case 5:
                return Boolean.valueOf(str.equals(str2));
            case 6:
                return Boolean.valueOf(list.contains(str));
            default:
                return null;
        }
    }

    /* renamed from: a */
    private final Boolean m21081a(long j, C4640m mVar) {
        try {
            return m21088a(new BigDecimal(j), mVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private final Boolean m21080a(double d, C4640m mVar) {
        try {
            return m21088a(new BigDecimal(d), mVar, Math.ulp(d));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private final Boolean m21086a(String str, C4640m mVar) {
        if (!C4859ei.m20925a(str)) {
            return null;
        }
        try {
            return m21088a(new BigDecimal(str), mVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0072, code lost:
        if (r3 != null) goto L_0x0074;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Boolean m21088a(java.math.BigDecimal r7, com.google.android.gms.internal.p148e.C4640m r8, double r9) {
        /*
            com.google.android.gms.common.internal.C3513t.m12625a(r8)
            java.lang.Integer r0 = r8.f15112a
            r1 = 0
            if (r0 == 0) goto L_0x00f1
            java.lang.Integer r0 = r8.f15112a
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x0012
            goto L_0x00f1
        L_0x0012:
            java.lang.Integer r0 = r8.f15112a
            int r0 = r0.intValue()
            r2 = 4
            if (r0 != r2) goto L_0x0024
            java.lang.String r0 = r8.f15115d
            if (r0 == 0) goto L_0x0023
            java.lang.String r0 = r8.f15116e
            if (r0 != 0) goto L_0x0029
        L_0x0023:
            return r1
        L_0x0024:
            java.lang.String r0 = r8.f15114c
            if (r0 != 0) goto L_0x0029
            return r1
        L_0x0029:
            java.lang.Integer r0 = r8.f15112a
            int r0 = r0.intValue()
            java.lang.Integer r3 = r8.f15112a
            int r3 = r3.intValue()
            if (r3 != r2) goto L_0x005b
            java.lang.String r3 = r8.f15115d
            boolean r3 = com.google.android.gms.measurement.internal.C4859ei.m20925a(r3)
            if (r3 == 0) goto L_0x005a
            java.lang.String r3 = r8.f15116e
            boolean r3 = com.google.android.gms.measurement.internal.C4859ei.m20925a(r3)
            if (r3 != 0) goto L_0x0048
            goto L_0x005a
        L_0x0048:
            java.math.BigDecimal r3 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0059 }
            java.lang.String r4 = r8.f15115d     // Catch:{ NumberFormatException -> 0x0059 }
            r3.<init>(r4)     // Catch:{ NumberFormatException -> 0x0059 }
            java.math.BigDecimal r4 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0059 }
            java.lang.String r8 = r8.f15116e     // Catch:{ NumberFormatException -> 0x0059 }
            r4.<init>(r8)     // Catch:{ NumberFormatException -> 0x0059 }
            r8 = r3
            r3 = r1
            goto L_0x006d
        L_0x0059:
            return r1
        L_0x005a:
            return r1
        L_0x005b:
            java.lang.String r3 = r8.f15114c
            boolean r3 = com.google.android.gms.measurement.internal.C4859ei.m20925a(r3)
            if (r3 != 0) goto L_0x0064
            return r1
        L_0x0064:
            java.math.BigDecimal r3 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x00f0 }
            java.lang.String r8 = r8.f15114c     // Catch:{ NumberFormatException -> 0x00f0 }
            r3.<init>(r8)     // Catch:{ NumberFormatException -> 0x00f0 }
            r8 = r1
            r4 = r8
        L_0x006d:
            if (r0 != r2) goto L_0x0072
            if (r8 != 0) goto L_0x0074
            return r1
        L_0x0072:
            if (r3 == 0) goto L_0x00ef
        L_0x0074:
            r2 = -1
            r5 = 0
            r6 = 1
            switch(r0) {
                case 1: goto L_0x00e3;
                case 2: goto L_0x00d7;
                case 3: goto L_0x008e;
                case 4: goto L_0x007c;
                default: goto L_0x007a;
            }
        L_0x007a:
            goto L_0x00ef
        L_0x007c:
            int r8 = r7.compareTo(r8)
            if (r8 == r2) goto L_0x0089
            int r7 = r7.compareTo(r4)
            if (r7 == r6) goto L_0x0089
            r5 = r6
        L_0x0089:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)
            return r7
        L_0x008e:
            r0 = 0
            int r8 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r8 == 0) goto L_0x00cb
            java.math.BigDecimal r8 = new java.math.BigDecimal
            r8.<init>(r9)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r1 = 2
            r0.<init>(r1)
            java.math.BigDecimal r8 = r8.multiply(r0)
            java.math.BigDecimal r8 = r3.subtract(r8)
            int r8 = r7.compareTo(r8)
            if (r8 != r6) goto L_0x00c6
            java.math.BigDecimal r8 = new java.math.BigDecimal
            r8.<init>(r9)
            java.math.BigDecimal r9 = new java.math.BigDecimal
            r9.<init>(r1)
            java.math.BigDecimal r8 = r8.multiply(r9)
            java.math.BigDecimal r8 = r3.add(r8)
            int r7 = r7.compareTo(r8)
            if (r7 != r2) goto L_0x00c6
            r5 = r6
        L_0x00c6:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)
            return r7
        L_0x00cb:
            int r7 = r7.compareTo(r3)
            if (r7 != 0) goto L_0x00d2
            r5 = r6
        L_0x00d2:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)
            return r7
        L_0x00d7:
            int r7 = r7.compareTo(r3)
            if (r7 != r6) goto L_0x00de
            r5 = r6
        L_0x00de:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)
            return r7
        L_0x00e3:
            int r7 = r7.compareTo(r3)
            if (r7 != r2) goto L_0x00ea
            r5 = r6
        L_0x00ea:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)
            return r7
        L_0x00ef:
            return r1
        L_0x00f0:
            return r1
        L_0x00f1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4867eq.m21088a(java.math.BigDecimal, com.google.android.gms.internal.e.m, double):java.lang.Boolean");
    }

    /* renamed from: a */
    private static C4647t[] m21090a(Map<Integer, Long> map) {
        if (map == null) {
            return null;
        }
        int i = 0;
        C4647t[] tVarArr = new C4647t[map.size()];
        for (Integer num : map.keySet()) {
            C4647t tVar = new C4647t();
            tVar.f15149a = num;
            tVar.f15150b = (Long) map.get(num);
            int i2 = i + 1;
            tVarArr[i] = tVar;
            i = i2;
        }
        return tVarArr;
    }

    /* renamed from: a */
    private static void m21089a(Map<Integer, Long> map, int i, long j) {
        Long l = (Long) map.get(Integer.valueOf(i));
        long j2 = j / 1000;
        if (l == null || j2 > l.longValue()) {
            map.put(Integer.valueOf(i), Long.valueOf(j2));
        }
    }

    /* renamed from: b */
    private static void m21091b(Map<Integer, List<Long>> map, int i, long j) {
        List list = (List) map.get(Integer.valueOf(i));
        if (list == null) {
            list = new ArrayList();
            map.put(Integer.valueOf(i), list);
        }
        list.add(Long.valueOf(j / 1000));
    }
}
