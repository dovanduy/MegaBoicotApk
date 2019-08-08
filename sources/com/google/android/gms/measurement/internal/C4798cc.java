package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p017v4.p023d.C0376a;
import android.text.TextUtils;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.gms.common.api.internal.C3364e;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.common.util.C3553e;
import com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.cc */
public final class C4798cc extends C4836dn {

    /* renamed from: a */
    protected C4807cl f15587a;

    /* renamed from: b */
    protected boolean f15588b = true;

    /* renamed from: c */
    private C4793by f15589c;

    /* renamed from: d */
    private final Set<C4794bz> f15590d = new CopyOnWriteArraySet();

    /* renamed from: e */
    private boolean f15591e;

    /* renamed from: f */
    private final AtomicReference<String> f15592f = new AtomicReference<>();

    protected C4798cc(C4764aw awVar) {
        super(awVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final boolean mo17328v() {
        return false;
    }

    /* renamed from: a */
    public final void mo17324a(boolean z) {
        mo17408E();
        mo17141b();
        mo17157q().mo17219a((Runnable) new C4806ck(this, z));
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public final void m20584C() {
        if (!mo17160t().mo17655j(mo17147g().mo17730x()) || !this.f15564q.mo17230C() || !this.f15588b) {
            mo17158r().mo17758w().mo17763a("Updating Scion state (FE)");
            mo17148h().mo17372y();
            return;
        }
        mo17158r().mo17758w().mo17763a("Recording app launch after enabling measurement for the first time (FE)");
        mo17330y();
    }

    /* renamed from: a */
    public final void mo17318a(String str, String str2, Bundle bundle) {
        mo17319a(str, str2, bundle, true, true, mo17153m().mo13694a());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo17326b(String str, String str2, Bundle bundle) {
        mo17141b();
        mo17144d();
        mo17317a(str, str2, mo17153m().mo13694a(), bundle);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo17317a(String str, String str2, long j, Bundle bundle) {
        mo17141b();
        mo17144d();
        m20588a(str, str2, j, bundle, true, this.f15589c == null || C4862el.m20978e(str2), false, null);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ba  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m20588a(java.lang.String r31, java.lang.String r32, long r33, android.os.Bundle r35, boolean r36, boolean r37, boolean r38, java.lang.String r39) {
        /*
            r30 = this;
            r1 = r30
            r8 = r31
            r6 = r32
            r5 = r35
            r7 = r39
            com.google.android.gms.common.internal.C3513t.m12627a(r31)
            com.google.android.gms.measurement.internal.et r4 = r30.mo17160t()
            com.google.android.gms.measurement.internal.h$a<java.lang.Boolean> r9 = com.google.android.gms.measurement.internal.C4882h.f15898au
            boolean r4 = r4.mo17645d(r7, r9)
            if (r4 != 0) goto L_0x001c
            com.google.android.gms.common.internal.C3513t.m12627a(r32)
        L_0x001c:
            com.google.android.gms.common.internal.C3513t.m12625a(r35)
            r30.mo17144d()
            r30.mo17408E()
            com.google.android.gms.measurement.internal.aw r4 = r1.f15564q
            boolean r4 = r4.mo17230C()
            if (r4 != 0) goto L_0x003b
            com.google.android.gms.measurement.internal.r r2 = r30.mo17158r()
            com.google.android.gms.measurement.internal.t r2 = r2.mo17758w()
            java.lang.String r3 = "Event not sent since app measurement is disabled"
            r2.mo17763a(r3)
            return
        L_0x003b:
            boolean r4 = r1.f15591e
            r15 = 0
            r16 = 0
            r14 = 1
            if (r4 != 0) goto L_0x0080
            r1.f15591e = r14
            java.lang.String r4 = "com.google.android.gms.tagmanager.TagManagerService"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ ClassNotFoundException -> 0x0073 }
            java.lang.String r9 = "initialize"
            java.lang.Class[] r10 = new java.lang.Class[r14]     // Catch:{ Exception -> 0x0063 }
            java.lang.Class<android.content.Context> r11 = android.content.Context.class
            r10[r16] = r11     // Catch:{ Exception -> 0x0063 }
            java.lang.reflect.Method r4 = r4.getDeclaredMethod(r9, r10)     // Catch:{ Exception -> 0x0063 }
            java.lang.Object[] r9 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x0063 }
            android.content.Context r10 = r30.mo17154n()     // Catch:{ Exception -> 0x0063 }
            r9[r16] = r10     // Catch:{ Exception -> 0x0063 }
            r4.invoke(r15, r9)     // Catch:{ Exception -> 0x0063 }
            goto L_0x0080
        L_0x0063:
            r0 = move-exception
            r4 = r0
            com.google.android.gms.measurement.internal.r r9 = r30.mo17158r()     // Catch:{ ClassNotFoundException -> 0x0073 }
            com.google.android.gms.measurement.internal.t r9 = r9.mo17754i()     // Catch:{ ClassNotFoundException -> 0x0073 }
            java.lang.String r10 = "Failed to invoke Tag Manager's initialize() method"
            r9.mo17764a(r10, r4)     // Catch:{ ClassNotFoundException -> 0x0073 }
            goto L_0x0080
        L_0x0073:
            com.google.android.gms.measurement.internal.r r4 = r30.mo17158r()
            com.google.android.gms.measurement.internal.t r4 = r4.mo17757v()
            java.lang.String r9 = "Tag Manager is not found and thus will not be used"
            r4.mo17763a(r9)
        L_0x0080:
            r4 = 40
            r9 = 2
            if (r38 == 0) goto L_0x00ec
            r30.mo17161u()
            java.lang.String r10 = "_iap"
            boolean r10 = r10.equals(r6)
            if (r10 != 0) goto L_0x00ec
            com.google.android.gms.measurement.internal.aw r10 = r1.f15564q
            com.google.android.gms.measurement.internal.el r10 = r10.mo17248j()
            java.lang.String r11 = "event"
            boolean r11 = r10.mo17494a(r11, r6)
            if (r11 != 0) goto L_0x00a0
        L_0x009e:
            r10 = r9
            goto L_0x00b8
        L_0x00a0:
            java.lang.String r11 = "event"
            java.lang.String[] r12 = com.google.android.gms.measurement.internal.C4790bv.f15566a
            boolean r11 = r10.mo17495a(r11, r12, r6)
            if (r11 != 0) goto L_0x00ad
            r10 = 13
            goto L_0x00b8
        L_0x00ad:
            java.lang.String r11 = "event"
            boolean r10 = r10.mo17493a(r11, r4, r6)
            if (r10 != 0) goto L_0x00b6
            goto L_0x009e
        L_0x00b6:
            r10 = r16
        L_0x00b8:
            if (r10 == 0) goto L_0x00ec
            com.google.android.gms.measurement.internal.r r2 = r30.mo17158r()
            com.google.android.gms.measurement.internal.t r2 = r2.mo17753h()
            java.lang.String r3 = "Invalid public event name. Event will not be logged (FE)"
            com.google.android.gms.measurement.internal.p r5 = r30.mo17155o()
            java.lang.String r5 = r5.mo17746a(r6)
            r2.mo17764a(r3, r5)
            com.google.android.gms.measurement.internal.aw r2 = r1.f15564q
            r2.mo17248j()
            java.lang.String r2 = com.google.android.gms.measurement.internal.C4862el.m20963a(r6, r4, r14)
            if (r6 == 0) goto L_0x00de
            int r16 = r32.length()
        L_0x00de:
            r3 = r16
            com.google.android.gms.measurement.internal.aw r4 = r1.f15564q
            com.google.android.gms.measurement.internal.el r4 = r4.mo17248j()
            java.lang.String r5 = "_ev"
            r4.mo17489a(r10, r5, r2, r3)
            return
        L_0x00ec:
            r30.mo17161u()
            com.google.android.gms.measurement.internal.cp r10 = r30.mo17149i()
            com.google.android.gms.measurement.internal.co r13 = r10.mo17355x()
            if (r13 == 0) goto L_0x0103
            java.lang.String r10 = "_sc"
            boolean r10 = r5.containsKey(r10)
            if (r10 != 0) goto L_0x0103
            r13.f15630d = r14
        L_0x0103:
            if (r36 == 0) goto L_0x0109
            if (r38 == 0) goto L_0x0109
            r10 = r14
            goto L_0x010b
        L_0x0109:
            r10 = r16
        L_0x010b:
            com.google.android.gms.measurement.internal.C4811cp.m20649a(r13, r5, r10)
            java.lang.String r10 = "am"
            boolean r17 = r10.equals(r8)
            boolean r10 = com.google.android.gms.measurement.internal.C4862el.m20978e(r32)
            if (r36 == 0) goto L_0x0149
            com.google.android.gms.measurement.internal.by r2 = r1.f15589c
            if (r2 == 0) goto L_0x0149
            if (r10 != 0) goto L_0x0149
            if (r17 != 0) goto L_0x0149
            com.google.android.gms.measurement.internal.r r2 = r30.mo17158r()
            com.google.android.gms.measurement.internal.t r2 = r2.mo17758w()
            java.lang.String r3 = "Passing event to registered event handler (FE)"
            com.google.android.gms.measurement.internal.p r4 = r30.mo17155o()
            java.lang.String r4 = r4.mo17746a(r6)
            com.google.android.gms.measurement.internal.p r7 = r30.mo17155o()
            java.lang.String r7 = r7.mo17743a(r5)
            r2.mo17765a(r3, r4, r7)
            com.google.android.gms.measurement.internal.by r2 = r1.f15589c
            r3 = r8
            r4 = r6
            r6 = r33
            r2.mo17304a(r3, r4, r5, r6)
            return
        L_0x0149:
            com.google.android.gms.measurement.internal.aw r2 = r1.f15564q
            boolean r2 = r2.mo17235H()
            if (r2 != 0) goto L_0x0152
            return
        L_0x0152:
            com.google.android.gms.measurement.internal.el r2 = r30.mo17156p()
            int r10 = r2.mo17496b(r6)
            if (r10 == 0) goto L_0x0191
            com.google.android.gms.measurement.internal.r r2 = r30.mo17158r()
            com.google.android.gms.measurement.internal.t r2 = r2.mo17753h()
            java.lang.String r3 = "Invalid event name. Event will not be logged (FE)"
            com.google.android.gms.measurement.internal.p r5 = r30.mo17155o()
            java.lang.String r5 = r5.mo17746a(r6)
            r2.mo17764a(r3, r5)
            r30.mo17156p()
            java.lang.String r8 = com.google.android.gms.measurement.internal.C4862el.m20963a(r6, r4, r14)
            if (r6 == 0) goto L_0x0180
            int r2 = r32.length()
            r16 = r2
        L_0x0180:
            com.google.android.gms.measurement.internal.aw r2 = r1.f15564q
            com.google.android.gms.measurement.internal.el r2 = r2.mo17248j()
            java.lang.String r5 = "_ev"
            r3 = r7
            r4 = r10
            r6 = r8
            r7 = r16
            r2.mo17492a(r3, r4, r5, r6, r7)
            return
        L_0x0191:
            r2 = 4
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.String r4 = "_o"
            r2[r16] = r4
            java.lang.String r4 = "_sn"
            r2[r14] = r4
            java.lang.String r4 = "_sc"
            r2[r9] = r4
            r4 = 3
            java.lang.String r9 = "_si"
            r2[r4] = r9
            java.util.List r2 = com.google.android.gms.common.util.C3554f.m12736a((T[]) r2)
            com.google.android.gms.measurement.internal.el r9 = r30.mo17156p()
            r4 = 1
            r10 = r7
            r11 = r6
            r12 = r5
            r18 = r13
            r13 = r2
            r8 = r14
            r14 = r38
            r19 = r15
            r15 = r4
            android.os.Bundle r4 = r9.mo17486a(r10, r11, r12, r13, r14, r15)
            if (r4 == 0) goto L_0x01f2
            java.lang.String r9 = "_sc"
            boolean r9 = r4.containsKey(r9)
            if (r9 == 0) goto L_0x01f2
            java.lang.String r9 = "_si"
            boolean r9 = r4.containsKey(r9)
            if (r9 != 0) goto L_0x01d1
            goto L_0x01f2
        L_0x01d1:
            java.lang.String r9 = "_sn"
            java.lang.String r9 = r4.getString(r9)
            java.lang.String r10 = "_sc"
            java.lang.String r10 = r4.getString(r10)
            java.lang.String r11 = "_si"
            long r11 = r4.getLong(r11)
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            com.google.android.gms.measurement.internal.co r15 = new com.google.android.gms.measurement.internal.co
            long r11 = r11.longValue()
            r15.<init>(r9, r10, r11)
            r13 = r15
            goto L_0x01f4
        L_0x01f2:
            r13 = r19
        L_0x01f4:
            if (r13 != 0) goto L_0x01f9
            r15 = r18
            goto L_0x01fa
        L_0x01f9:
            r15 = r13
        L_0x01fa:
            com.google.android.gms.measurement.internal.et r9 = r30.mo17160t()
            boolean r9 = r9.mo17665t(r7)
            r10 = 0
            if (r9 == 0) goto L_0x022e
            r30.mo17161u()
            com.google.android.gms.measurement.internal.cp r9 = r30.mo17149i()
            com.google.android.gms.measurement.internal.co r9 = r9.mo17355x()
            if (r9 == 0) goto L_0x022e
            java.lang.String r9 = "_ae"
            boolean r9 = r9.equals(r6)
            if (r9 == 0) goto L_0x022e
            com.google.android.gms.measurement.internal.dr r9 = r30.mo17151k()
            long r12 = r9.mo17418y()
            int r9 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r9 <= 0) goto L_0x022e
            com.google.android.gms.measurement.internal.el r9 = r30.mo17156p()
            r9.mo17490a(r4, r12)
        L_0x022e:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r14.add(r4)
            com.google.android.gms.measurement.internal.el r9 = r30.mo17156p()
            java.security.SecureRandom r9 = r9.mo17504h()
            long r12 = r9.nextLong()
            com.google.android.gms.measurement.internal.et r9 = r30.mo17160t()
            com.google.android.gms.measurement.internal.l r8 = r30.mo17147g()
            java.lang.String r8 = r8.mo17730x()
            boolean r8 = r9.mo17664s(r8)
            if (r8 == 0) goto L_0x027a
            java.lang.String r8 = "extend_session"
            long r8 = r4.getLong(r8, r10)
            r10 = 1
            int r18 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r18 != 0) goto L_0x027a
            com.google.android.gms.measurement.internal.r r8 = r30.mo17158r()
            com.google.android.gms.measurement.internal.t r8 = r8.mo17759x()
            java.lang.String r9 = "EXTEND_SESSION param attached: initiate a new session or extend the current active session"
            r8.mo17763a(r9)
            com.google.android.gms.measurement.internal.aw r8 = r1.f15564q
            com.google.android.gms.measurement.internal.dr r8 = r8.mo17243e()
            r10 = r33
            r9 = 1
            r8.mo17415a(r10, r9)
            goto L_0x027c
        L_0x027a:
            r10 = r33
        L_0x027c:
            java.util.Set r8 = r4.keySet()
            int r5 = r35.size()
            java.lang.String[] r5 = new java.lang.String[r5]
            java.lang.Object[] r5 = r8.toArray(r5)
            java.lang.String[] r5 = (java.lang.String[]) r5
            java.util.Arrays.sort(r5)
            int r8 = r5.length
            r9 = r16
            r21 = r9
        L_0x0294:
            if (r9 >= r8) goto L_0x033a
            r22 = r8
            r8 = r5[r9]
            r23 = r5
            java.lang.Object r5 = r4.get(r8)
            r30.mo17156p()
            android.os.Bundle[] r5 = com.google.android.gms.measurement.internal.C4862el.m20972a(r5)
            if (r5 == 0) goto L_0x031c
            r24 = r9
            int r9 = r5.length
            r4.putInt(r8, r9)
            r9 = r16
        L_0x02b1:
            int r10 = r5.length
            if (r9 >= r10) goto L_0x030d
            r11 = r5[r9]
            r10 = 1
            com.google.android.gms.measurement.internal.C4811cp.m20649a(r15, r11, r10)
            com.google.android.gms.measurement.internal.el r18 = r30.mo17156p()
            java.lang.String r19 = "_ep"
            r20 = 0
            r26 = r9
            r9 = r18
            r18 = r10
            r10 = r7
            r25 = r11
            r11 = r19
            r27 = r4
            r28 = r5
            r4 = r12
            r12 = r25
            r13 = r2
            r7 = r14
            r14 = r38
            r19 = r15
            r15 = r20
            android.os.Bundle r9 = r9.mo17486a(r10, r11, r12, r13, r14, r15)
            java.lang.String r10 = "_en"
            r9.putString(r10, r6)
            java.lang.String r10 = "_eid"
            r9.putLong(r10, r4)
            java.lang.String r10 = "_gn"
            r9.putString(r10, r8)
            java.lang.String r10 = "_ll"
            r11 = r28
            int r12 = r11.length
            r9.putInt(r10, r12)
            java.lang.String r10 = "_i"
            r12 = r26
            r9.putInt(r10, r12)
            r7.add(r9)
            int r9 = r12 + 1
            r12 = r4
            r14 = r7
            r5 = r11
            r15 = r19
            r4 = r27
            r7 = r39
            goto L_0x02b1
        L_0x030d:
            r27 = r4
            r11 = r5
            r4 = r12
            r7 = r14
            r19 = r15
            r18 = 1
            int r8 = r11.length
            r9 = r21
            int r21 = r9 + r8
            goto L_0x0328
        L_0x031c:
            r27 = r4
            r24 = r9
            r4 = r12
            r7 = r14
            r19 = r15
            r9 = r21
            r18 = 1
        L_0x0328:
            int r9 = r24 + 1
            r10 = r33
            r12 = r4
            r14 = r7
            r15 = r19
            r8 = r22
            r5 = r23
            r4 = r27
            r7 = r39
            goto L_0x0294
        L_0x033a:
            r27 = r4
            r4 = r12
            r7 = r14
            r9 = r21
            r18 = 1
            if (r9 == 0) goto L_0x0350
            java.lang.String r2 = "_eid"
            r3 = r27
            r3.putLong(r2, r4)
            java.lang.String r2 = "_epc"
            r3.putInt(r2, r9)
        L_0x0350:
            r8 = r16
        L_0x0352:
            int r2 = r7.size()
            if (r8 >= r2) goto L_0x03e0
            java.lang.Object r2 = r7.get(r8)
            android.os.Bundle r2 = (android.os.Bundle) r2
            if (r8 == 0) goto L_0x0363
            r3 = r18
            goto L_0x0365
        L_0x0363:
            r3 = r16
        L_0x0365:
            if (r3 == 0) goto L_0x036a
            java.lang.String r3 = "_ep"
            goto L_0x036b
        L_0x036a:
            r3 = r6
        L_0x036b:
            java.lang.String r4 = "_o"
            r10 = r18
            r9 = r31
            r2.putString(r4, r9)
            if (r37 == 0) goto L_0x037e
            com.google.android.gms.measurement.internal.el r4 = r30.mo17156p()
            android.os.Bundle r2 = r4.mo17485a(r2)
        L_0x037e:
            r12 = r2
            com.google.android.gms.measurement.internal.r r2 = r30.mo17158r()
            com.google.android.gms.measurement.internal.t r2 = r2.mo17758w()
            java.lang.String r4 = "Logging event (FE)"
            com.google.android.gms.measurement.internal.p r5 = r30.mo17155o()
            java.lang.String r5 = r5.mo17746a(r6)
            com.google.android.gms.measurement.internal.p r13 = r30.mo17155o()
            java.lang.String r13 = r13.mo17743a(r12)
            r2.mo17765a(r4, r5, r13)
            com.google.android.gms.measurement.internal.zzag r13 = new com.google.android.gms.measurement.internal.zzag
            com.google.android.gms.measurement.internal.zzad r4 = new com.google.android.gms.measurement.internal.zzad
            r4.<init>(r12)
            r2 = r13
            r5 = r9
            r14 = r6
            r18 = r7
            r15 = r39
            r6 = r33
            r2.<init>(r3, r4, r5, r6)
            com.google.android.gms.measurement.internal.ct r2 = r30.mo17148h()
            r2.mo17365a(r13, r15)
            if (r17 != 0) goto L_0x03d7
            java.util.Set<com.google.android.gms.measurement.internal.bz> r2 = r1.f15590d
            java.util.Iterator r13 = r2.iterator()
        L_0x03be:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L_0x03d7
            java.lang.Object r2 = r13.next()
            com.google.android.gms.measurement.internal.bz r2 = (com.google.android.gms.measurement.internal.C4794bz) r2
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>(r12)
            r3 = r9
            r4 = r14
            r6 = r33
            r2.mo17305a(r3, r4, r5, r6)
            goto L_0x03be
        L_0x03d7:
            int r8 = r8 + 1
            r6 = r14
            r7 = r18
            r18 = r10
            goto L_0x0352
        L_0x03e0:
            r14 = r6
            r10 = r18
            r30.mo17161u()
            com.google.android.gms.measurement.internal.cp r2 = r30.mo17149i()
            com.google.android.gms.measurement.internal.co r2 = r2.mo17355x()
            if (r2 == 0) goto L_0x03ff
            java.lang.String r2 = "_ae"
            boolean r2 = r2.equals(r14)
            if (r2 == 0) goto L_0x03ff
            com.google.android.gms.measurement.internal.dr r2 = r30.mo17151k()
            r2.mo17416a(r10, r10)
        L_0x03ff:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4798cc.m20588a(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo17319a(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        C4798cc ccVar;
        boolean z3;
        mo17141b();
        String str3 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (z2) {
            ccVar = this;
            if (ccVar.f15589c != null && !C4862el.m20978e(str2)) {
                z3 = false;
                ccVar.m20593b(str3, str2, j, bundle2, z2, z3, !z, null);
            }
        } else {
            ccVar = this;
        }
        z3 = true;
        ccVar.m20593b(str3, str2, j, bundle2, z2, z3, !z, null);
    }

    /* renamed from: b */
    private final void m20593b(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        Bundle b = C4862el.m20973b(bundle);
        C4759ar q = mo17157q();
        C4800ce ceVar = new C4800ce(this, str, str2, j, b, z, z2, z3, str3);
        q.mo17219a((Runnable) ceVar);
    }

    /* renamed from: a */
    public final void mo17321a(String str, String str2, Object obj, boolean z) {
        mo17322a(str, str2, obj, z, mo17153m().mo13694a());
    }

    /* renamed from: a */
    public final void mo17322a(String str, String str2, Object obj, boolean z, long j) {
        if (str == null) {
            str = "app";
        }
        String str3 = str;
        int i = 6;
        int i2 = 0;
        if (z) {
            i = mo17156p().mo17499c(str2);
        } else {
            C4862el p = mo17156p();
            if (p.mo17494a("user property", str2)) {
                if (!p.mo17495a("user property", C4792bx.f15570a, str2)) {
                    i = 15;
                } else if (p.mo17493a("user property", 24, str2)) {
                    i = 0;
                }
            }
        }
        if (i != 0) {
            mo17156p();
            String a = C4862el.m20963a(str2, 24, true);
            if (str2 != null) {
                i2 = str2.length();
            }
            this.f15564q.mo17248j().mo17489a(i, "_ev", a, i2);
        } else if (obj != null) {
            int b = mo17156p().mo17497b(str2, obj);
            if (b != 0) {
                mo17156p();
                String a2 = C4862el.m20963a(str2, 24, true);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    i2 = String.valueOf(obj).length();
                }
                this.f15564q.mo17248j().mo17489a(b, "_ev", a2, i2);
                return;
            }
            Object c = mo17156p().mo17500c(str2, obj);
            if (c != null) {
                m20589a(str3, str2, j, c);
            }
        } else {
            m20589a(str3, str2, j, (Object) null);
        }
    }

    /* renamed from: a */
    private final void m20589a(String str, String str2, long j, Object obj) {
        C4759ar q = mo17157q();
        C4801cf cfVar = new C4801cf(this, str, str2, obj, j);
        q.mo17219a((Runnable) cfVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo17320a(String str, String str2, Object obj, long j) {
        C3513t.m12627a(str);
        C3513t.m12627a(str2);
        mo17144d();
        mo17141b();
        mo17408E();
        if (!this.f15564q.mo17230C()) {
            mo17158r().mo17758w().mo17763a("User property not set since app measurement is disabled");
        } else if (this.f15564q.mo17235H()) {
            mo17158r().mo17758w().mo17765a("Setting user property (FE)", mo17155o().mo17746a(str2), obj);
            zzfv zzfv = new zzfv(str2, j, obj, str);
            mo17148h().mo17366a(zzfv);
        }
    }

    /* renamed from: x */
    public final String mo17329x() {
        mo17141b();
        return (String) this.f15592f.get();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo17316a(String str) {
        this.f15592f.set(str);
    }

    /* renamed from: y */
    public final void mo17330y() {
        mo17144d();
        mo17141b();
        mo17408E();
        if (this.f15564q.mo17235H()) {
            mo17148h().mo17373z();
            this.f15588b = false;
            String v = mo17159s().mo17183v();
            if (!TextUtils.isEmpty(v)) {
                mo17152l().mo17300A();
                if (!v.equals(VERSION.RELEASE)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", v);
                    mo17318a("auto", "_ou", bundle);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo17315a(ConditionalUserProperty conditionalUserProperty) {
        C3513t.m12625a(conditionalUserProperty);
        mo17141b();
        ConditionalUserProperty conditionalUserProperty2 = new ConditionalUserProperty(conditionalUserProperty);
        if (!TextUtils.isEmpty(conditionalUserProperty2.mAppId)) {
            mo17158r().mo17754i().mo17763a("Package name should be null when calling setConditionalUserProperty");
        }
        conditionalUserProperty2.mAppId = null;
        m20595c(conditionalUserProperty2);
    }

    /* renamed from: b */
    public final void mo17325b(ConditionalUserProperty conditionalUserProperty) {
        C3513t.m12625a(conditionalUserProperty);
        C3513t.m12627a(conditionalUserProperty.mAppId);
        mo17138a();
        m20595c(new ConditionalUserProperty(conditionalUserProperty));
    }

    /* renamed from: c */
    private final void m20595c(ConditionalUserProperty conditionalUserProperty) {
        long a = mo17153m().mo13694a();
        C3513t.m12625a(conditionalUserProperty);
        C3513t.m12627a(conditionalUserProperty.mName);
        C3513t.m12627a(conditionalUserProperty.mOrigin);
        C3513t.m12625a(conditionalUserProperty.mValue);
        conditionalUserProperty.mCreationTimestamp = a;
        String str = conditionalUserProperty.mName;
        Object obj = conditionalUserProperty.mValue;
        if (mo17156p().mo17499c(str) != 0) {
            mo17158r().mo17761y_().mo17764a("Invalid conditional user property name", mo17155o().mo17748c(str));
        } else if (mo17156p().mo17497b(str, obj) != 0) {
            mo17158r().mo17761y_().mo17765a("Invalid conditional user property value", mo17155o().mo17748c(str), obj);
        } else {
            Object c = mo17156p().mo17500c(str, obj);
            if (c == null) {
                mo17158r().mo17761y_().mo17765a("Unable to normalize conditional user property value", mo17155o().mo17748c(str), obj);
                return;
            }
            conditionalUserProperty.mValue = c;
            long j = conditionalUserProperty.mTriggerTimeout;
            if (TextUtils.isEmpty(conditionalUserProperty.mTriggerEventName) || (j <= 15552000000L && j >= 1)) {
                long j2 = conditionalUserProperty.mTimeToLive;
                if (j2 > 15552000000L || j2 < 1) {
                    mo17158r().mo17761y_().mo17765a("Invalid conditional user property time to live", mo17155o().mo17748c(str), Long.valueOf(j2));
                } else {
                    mo17157q().mo17219a((Runnable) new C4802cg(this, conditionalUserProperty));
                }
            } else {
                mo17158r().mo17761y_().mo17765a("Invalid conditional user property timeout", mo17155o().mo17748c(str), Long.valueOf(j));
            }
        }
    }

    /* renamed from: c */
    public final void mo17327c(String str, String str2, Bundle bundle) {
        mo17141b();
        m20594b((String) null, str, str2, bundle);
    }

    /* renamed from: a */
    public final void mo17323a(String str, String str2, String str3, Bundle bundle) {
        C3513t.m12627a(str);
        mo17138a();
        m20594b(str, str2, str3, bundle);
    }

    /* renamed from: b */
    private final void m20594b(String str, String str2, String str3, Bundle bundle) {
        long a = mo17153m().mo13694a();
        C3513t.m12627a(str2);
        ConditionalUserProperty conditionalUserProperty = new ConditionalUserProperty();
        conditionalUserProperty.mAppId = str;
        conditionalUserProperty.mName = str2;
        conditionalUserProperty.mCreationTimestamp = a;
        if (str3 != null) {
            conditionalUserProperty.mExpiredEventName = str3;
            conditionalUserProperty.mExpiredEventParams = bundle;
        }
        mo17157q().mo17219a((Runnable) new C4803ch(this, conditionalUserProperty));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m20596d(ConditionalUserProperty conditionalUserProperty) {
        ConditionalUserProperty conditionalUserProperty2 = conditionalUserProperty;
        mo17144d();
        mo17408E();
        C3513t.m12625a(conditionalUserProperty);
        C3513t.m12627a(conditionalUserProperty2.mName);
        C3513t.m12627a(conditionalUserProperty2.mOrigin);
        C3513t.m12625a(conditionalUserProperty2.mValue);
        if (!this.f15564q.mo17230C()) {
            mo17158r().mo17758w().mo17763a("Conditional property not sent since collection is disabled");
            return;
        }
        zzfv zzfv = new zzfv(conditionalUserProperty2.mName, conditionalUserProperty2.mTriggeredTimestamp, conditionalUserProperty2.mValue, conditionalUserProperty2.mOrigin);
        try {
            zzag a = mo17156p().mo17487a(conditionalUserProperty2.mAppId, conditionalUserProperty2.mTriggeredEventName, conditionalUserProperty2.mTriggeredEventParams, conditionalUserProperty2.mOrigin, 0, true, false);
            zzag a2 = mo17156p().mo17487a(conditionalUserProperty2.mAppId, conditionalUserProperty2.mTimedOutEventName, conditionalUserProperty2.mTimedOutEventParams, conditionalUserProperty2.mOrigin, 0, true, false);
            zzag a3 = mo17156p().mo17487a(conditionalUserProperty2.mAppId, conditionalUserProperty2.mExpiredEventName, conditionalUserProperty2.mExpiredEventParams, conditionalUserProperty2.mOrigin, 0, true, false);
            String str = conditionalUserProperty2.mAppId;
            String str2 = conditionalUserProperty2.mOrigin;
            long j = conditionalUserProperty2.mCreationTimestamp;
            String str3 = conditionalUserProperty2.mTriggerEventName;
            long j2 = conditionalUserProperty2.mTriggerTimeout;
            zzo zzo = r3;
            zzo zzo2 = new zzo(str, str2, zzfv, j, false, str3, a2, j2, a, conditionalUserProperty2.mTimeToLive, a3);
            mo17148h().mo17367a(zzo);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final void m20597e(ConditionalUserProperty conditionalUserProperty) {
        ConditionalUserProperty conditionalUserProperty2 = conditionalUserProperty;
        mo17144d();
        mo17408E();
        C3513t.m12625a(conditionalUserProperty);
        C3513t.m12627a(conditionalUserProperty2.mName);
        if (!this.f15564q.mo17230C()) {
            mo17158r().mo17758w().mo17763a("Conditional property not cleared since collection is disabled");
            return;
        }
        zzfv zzfv = new zzfv(conditionalUserProperty2.mName, 0, null, null);
        try {
            zzag a = mo17156p().mo17487a(conditionalUserProperty2.mAppId, conditionalUserProperty2.mExpiredEventName, conditionalUserProperty2.mExpiredEventParams, conditionalUserProperty2.mOrigin, conditionalUserProperty2.mCreationTimestamp, true, false);
            String str = conditionalUserProperty2.mAppId;
            String str2 = conditionalUserProperty2.mOrigin;
            long j = conditionalUserProperty2.mCreationTimestamp;
            boolean z = conditionalUserProperty2.mActive;
            String str3 = conditionalUserProperty2.mTriggerEventName;
            long j2 = conditionalUserProperty2.mTriggerTimeout;
            zzo zzo = r3;
            zzo zzo2 = new zzo(str, str2, zzfv, j, z, str3, null, j2, null, conditionalUserProperty2.mTimeToLive, a);
            mo17148h().mo17367a(zzo);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* renamed from: a */
    public final List<ConditionalUserProperty> mo17311a(String str, String str2) {
        mo17141b();
        return m20590b((String) null, str, str2);
    }

    /* renamed from: a */
    public final List<ConditionalUserProperty> mo17312a(String str, String str2, String str3) {
        C3513t.m12627a(str);
        mo17138a();
        return m20590b(str, str2, str3);
    }

    /* renamed from: b */
    private final List<ConditionalUserProperty> m20590b(String str, String str2, String str3) {
        if (mo17157q().mo17222g()) {
            mo17158r().mo17761y_().mo17763a("Cannot get conditional user properties from analytics worker thread");
            return Collections.emptyList();
        } else if (C4868er.m21094a()) {
            mo17158r().mo17761y_().mo17763a("Cannot get conditional user properties from main thread");
            return Collections.emptyList();
        } else {
            AtomicReference atomicReference = new AtomicReference();
            synchronized (atomicReference) {
                C4759ar q = this.f15564q.mo17157q();
                C4804ci ciVar = new C4804ci(this, atomicReference, str, str2, str3);
                q.mo17219a((Runnable) ciVar);
                try {
                    atomicReference.wait(DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
                } catch (InterruptedException e) {
                    mo17158r().mo17754i().mo17765a("Interrupted waiting for get conditional user properties", str, e);
                }
            }
            List<zzo> list = (List) atomicReference.get();
            if (list == null) {
                mo17158r().mo17754i().mo17764a("Timed out waiting for get conditional user properties", str);
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (zzo zzo : list) {
                ConditionalUserProperty conditionalUserProperty = new ConditionalUserProperty();
                conditionalUserProperty.mAppId = zzo.f16021a;
                conditionalUserProperty.mOrigin = zzo.f16022b;
                conditionalUserProperty.mCreationTimestamp = zzo.f16024d;
                conditionalUserProperty.mName = zzo.f16023c.f15995a;
                conditionalUserProperty.mValue = zzo.f16023c.mo17782a();
                conditionalUserProperty.mActive = zzo.f16025e;
                conditionalUserProperty.mTriggerEventName = zzo.f16026f;
                if (zzo.f16027g != null) {
                    conditionalUserProperty.mTimedOutEventName = zzo.f16027g.f15991a;
                    if (zzo.f16027g.f15992b != null) {
                        conditionalUserProperty.mTimedOutEventParams = zzo.f16027g.f15992b.mo17773b();
                    }
                }
                conditionalUserProperty.mTriggerTimeout = zzo.f16028h;
                if (zzo.f16029i != null) {
                    conditionalUserProperty.mTriggeredEventName = zzo.f16029i.f15991a;
                    if (zzo.f16029i.f15992b != null) {
                        conditionalUserProperty.mTriggeredEventParams = zzo.f16029i.f15992b.mo17773b();
                    }
                }
                conditionalUserProperty.mTriggeredTimestamp = zzo.f16023c.f15996b;
                conditionalUserProperty.mTimeToLive = zzo.f16030j;
                if (zzo.f16031k != null) {
                    conditionalUserProperty.mExpiredEventName = zzo.f16031k.f15991a;
                    if (zzo.f16031k.f15992b != null) {
                        conditionalUserProperty.mExpiredEventParams = zzo.f16031k.f15992b.mo17773b();
                    }
                }
                arrayList.add(conditionalUserProperty);
            }
            return arrayList;
        }
    }

    /* renamed from: a */
    public final Map<String, Object> mo17314a(String str, String str2, boolean z) {
        mo17141b();
        return m20591b((String) null, str, str2, z);
    }

    /* renamed from: a */
    public final Map<String, Object> mo17313a(String str, String str2, String str3, boolean z) {
        C3513t.m12627a(str);
        mo17138a();
        return m20591b(str, str2, str3, z);
    }

    /* renamed from: b */
    private final Map<String, Object> m20591b(String str, String str2, String str3, boolean z) {
        if (mo17157q().mo17222g()) {
            mo17158r().mo17761y_().mo17763a("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        } else if (C4868er.m21094a()) {
            mo17158r().mo17761y_().mo17763a("Cannot get user properties from main thread");
            return Collections.emptyMap();
        } else {
            AtomicReference atomicReference = new AtomicReference();
            synchronized (atomicReference) {
                C4759ar q = this.f15564q.mo17157q();
                C4805cj cjVar = new C4805cj(this, atomicReference, str, str2, str3, z);
                q.mo17219a((Runnable) cjVar);
                try {
                    atomicReference.wait(DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
                } catch (InterruptedException e) {
                    mo17158r().mo17754i().mo17764a("Interrupted waiting for get user properties", e);
                }
            }
            List<zzfv> list = (List) atomicReference.get();
            if (list == null) {
                mo17158r().mo17754i().mo17763a("Timed out waiting for get user properties");
                return Collections.emptyMap();
            }
            C0376a aVar = new C0376a(list.size());
            for (zzfv zzfv : list) {
                aVar.put(zzfv.f15995a, zzfv.mo17782a());
            }
            return aVar;
        }
    }

    /* renamed from: z */
    public final String mo17331z() {
        C4810co y = this.f15564q.mo17256w().mo17356y();
        if (y != null) {
            return y.f15627a;
        }
        return null;
    }

    /* renamed from: A */
    public final String mo17309A() {
        C4810co y = this.f15564q.mo17256w().mo17356y();
        if (y != null) {
            return y.f15628b;
        }
        return null;
    }

    /* renamed from: B */
    public final String mo17310B() {
        if (this.f15564q.mo17252p() != null) {
            return this.f15564q.mo17252p();
        }
        try {
            return C3364e.m12106a();
        } catch (IllegalStateException e) {
            this.f15564q.mo17158r().mo17761y_().mo17764a("getGoogleAppId failed with exception", e);
            return null;
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo17138a() {
        super.mo17138a();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo17141b() {
        super.mo17141b();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo17143c() {
        super.mo17143c();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo17144d() {
        super.mo17144d();
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C4741a mo17145e() {
        return super.mo17145e();
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C4798cc mo17146f() {
        return super.mo17146f();
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ C4887l mo17147g() {
        return super.mo17147g();
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C4815ct mo17148h() {
        return super.mo17148h();
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ C4811cp mo17149i() {
        return super.mo17149i();
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C4889n mo17150j() {
        return super.mo17150j();
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C4840dr mo17151k() {
        return super.mo17151k();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C4768b mo17152l() {
        return super.mo17152l();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C3553e mo17153m() {
        return super.mo17153m();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ Context mo17154n() {
        return super.mo17154n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C4891p mo17155o() {
        return super.mo17155o();
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C4862el mo17156p() {
        return super.mo17156p();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C4759ar mo17157q() {
        return super.mo17157q();
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C4893r mo17158r() {
        return super.mo17158r();
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C4745ad mo17159s() {
        return super.mo17159s();
    }

    /* renamed from: t */
    public final /* bridge */ /* synthetic */ C4870et mo17160t() {
        return super.mo17160t();
    }

    /* renamed from: u */
    public final /* bridge */ /* synthetic */ C4868er mo17161u() {
        return super.mo17161u();
    }
}
