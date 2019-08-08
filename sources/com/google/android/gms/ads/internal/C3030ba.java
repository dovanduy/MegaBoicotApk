package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.overlay.C3117m;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.internal.ads.C3718cm;
import com.google.android.gms.internal.ads.C3721cp;
import com.google.android.gms.internal.ads.C3744dl;
import com.google.android.gms.internal.ads.C3763ec;
import com.google.android.gms.internal.ads.C3878ij;
import com.google.android.gms.internal.ads.C3882in;
import com.google.android.gms.internal.ads.C3894iz;
import com.google.android.gms.internal.ads.C3900je;
import com.google.android.gms.internal.ads.C3909jn;
import com.google.android.gms.internal.ads.C3915jt;
import com.google.android.gms.internal.ads.C4014nk;
import com.google.android.gms.internal.ads.C4089qe;
import com.google.android.gms.internal.ads.alc;
import com.google.android.gms.internal.ads.aml.C3658a.C3660b;
import com.google.android.gms.internal.ads.amo;
import com.google.android.gms.internal.ads.aoq;
import com.google.android.gms.internal.ads.aru;
import com.google.android.gms.internal.ads.ash;
import com.google.android.gms.internal.ads.ave;
import com.google.android.gms.internal.ads.avp;
import com.google.android.gms.internal.ads.bbl;
import com.google.android.gms.internal.ads.bbt;
import com.google.android.gms.internal.ads.bca;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzjj;
import com.google.android.gms.internal.ads.zzjn;
import java.util.concurrent.Executor;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
@C3718cm
/* renamed from: com.google.android.gms.ads.internal.ba */
public abstract class C3030ba extends C3002a implements C3018ap, C3117m, bbl {

    /* renamed from: j */
    protected final bca f8888j;

    /* renamed from: k */
    private transient boolean f8889k;

    public C3030ba(Context context, zzjn zzjn, String str, bca bca, zzang zzang, C3049bt btVar) {
        this(new C3026ax(context, zzjn, str, zzang), bca, null, btVar);
    }

    private C3030ba(C3026ax axVar, bca bca, C3015am amVar, C3049bt btVar) {
        super(axVar, null, btVar);
        this.f8888j = bca;
        this.f8889k = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0189  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.ads.C3744dl m10955a(com.google.android.gms.internal.ads.zzjj r65, android.os.Bundle r66, com.google.android.gms.internal.ads.C3882in r67, int r68) {
        /*
            r64 = this;
            r0 = r64
            com.google.android.gms.ads.internal.ax r1 = r0.f8733e
            android.content.Context r1 = r1.f8858c
            android.content.pm.ApplicationInfo r7 = r1.getApplicationInfo()
            r2 = 0
            com.google.android.gms.ads.internal.ax r3 = r0.f8733e     // Catch:{ NameNotFoundException -> 0x001b }
            android.content.Context r3 = r3.f8858c     // Catch:{ NameNotFoundException -> 0x001b }
            com.google.android.gms.common.b.b r3 = com.google.android.gms.common.p140b.C3404c.m12230a(r3)     // Catch:{ NameNotFoundException -> 0x001b }
            java.lang.String r4 = r7.packageName     // Catch:{ NameNotFoundException -> 0x001b }
            android.content.pm.PackageInfo r3 = r3.mo13395b(r4, r2)     // Catch:{ NameNotFoundException -> 0x001b }
            r8 = r3
            goto L_0x001c
        L_0x001b:
            r8 = 0
        L_0x001c:
            com.google.android.gms.ads.internal.ax r3 = r0.f8733e
            android.content.Context r3 = r3.f8858c
            android.content.res.Resources r3 = r3.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            com.google.android.gms.ads.internal.ax r4 = r0.f8733e
            com.google.android.gms.ads.internal.ay r4 = r4.f8861f
            if (r4 == 0) goto L_0x0093
            com.google.android.gms.ads.internal.ax r4 = r0.f8733e
            com.google.android.gms.ads.internal.ay r4 = r4.f8861f
            android.view.ViewParent r4 = r4.getParent()
            if (r4 == 0) goto L_0x0093
            r4 = 2
            int[] r4 = new int[r4]
            com.google.android.gms.ads.internal.ax r5 = r0.f8733e
            com.google.android.gms.ads.internal.ay r5 = r5.f8861f
            r5.getLocationOnScreen(r4)
            r5 = r4[r2]
            r6 = 1
            r4 = r4[r6]
            com.google.android.gms.ads.internal.ax r9 = r0.f8733e
            com.google.android.gms.ads.internal.ay r9 = r9.f8861f
            int r9 = r9.getWidth()
            com.google.android.gms.ads.internal.ax r10 = r0.f8733e
            com.google.android.gms.ads.internal.ay r10 = r10.f8861f
            int r10 = r10.getHeight()
            com.google.android.gms.ads.internal.ax r11 = r0.f8733e
            com.google.android.gms.ads.internal.ay r11 = r11.f8861f
            boolean r11 = r11.isShown()
            if (r11 == 0) goto L_0x0072
            int r11 = r5 + r9
            if (r11 <= 0) goto L_0x0072
            int r11 = r4 + r10
            if (r11 <= 0) goto L_0x0072
            int r11 = r3.widthPixels
            if (r5 > r11) goto L_0x0072
            int r11 = r3.heightPixels
            if (r4 > r11) goto L_0x0072
            goto L_0x0073
        L_0x0072:
            r6 = r2
        L_0x0073:
            android.os.Bundle r11 = new android.os.Bundle
            r12 = 5
            r11.<init>(r12)
            java.lang.String r12 = "x"
            r11.putInt(r12, r5)
            java.lang.String r5 = "y"
            r11.putInt(r5, r4)
            java.lang.String r4 = "width"
            r11.putInt(r4, r9)
            java.lang.String r4 = "height"
            r11.putInt(r4, r10)
            java.lang.String r4 = "visible"
            r11.putInt(r4, r6)
            goto L_0x0094
        L_0x0093:
            r11 = 0
        L_0x0094:
            com.google.android.gms.internal.ads.io r4 = com.google.android.gms.ads.internal.C3025aw.m10921i()
            com.google.android.gms.internal.ads.iv r4 = r4.mo15432a()
            java.lang.String r9 = r4.mo15462a()
            com.google.android.gms.ads.internal.ax r4 = r0.f8733e
            com.google.android.gms.internal.ads.il r5 = new com.google.android.gms.internal.ads.il
            com.google.android.gms.ads.internal.ax r6 = r0.f8733e
            java.lang.String r6 = r6.f8857b
            r5.<init>(r9, r6)
            r4.f8867l = r5
            com.google.android.gms.ads.internal.ax r4 = r0.f8733e
            com.google.android.gms.internal.ads.il r4 = r4.f8867l
            r5 = r65
            r4.mo15415a(r5)
            com.google.android.gms.ads.internal.C3025aw.m10917e()
            com.google.android.gms.ads.internal.ax r4 = r0.f8733e
            android.content.Context r4 = r4.f8858c
            com.google.android.gms.ads.internal.ax r6 = r0.f8733e
            com.google.android.gms.ads.internal.ay r6 = r6.f8861f
            com.google.android.gms.ads.internal.ax r10 = r0.f8733e
            com.google.android.gms.internal.ads.zzjn r10 = r10.f8864i
            java.lang.String r20 = com.google.android.gms.internal.ads.C3909jn.m17129a(r4, r6, r10)
            r12 = 0
            com.google.android.gms.ads.internal.ax r4 = r0.f8733e
            com.google.android.gms.internal.ads.apw r4 = r4.f8872q
            if (r4 == 0) goto L_0x00e1
            com.google.android.gms.ads.internal.ax r4 = r0.f8733e     // Catch:{ RemoteException -> 0x00dc }
            com.google.android.gms.internal.ads.apw r4 = r4.f8872q     // Catch:{ RemoteException -> 0x00dc }
            long r14 = r4.mo14554a()     // Catch:{ RemoteException -> 0x00dc }
            r21 = r14
            goto L_0x00e3
        L_0x00dc:
            java.lang.String r4 = "Cannot get correlation id, default to 0."
            com.google.android.gms.internal.ads.C3900je.m17435e(r4)
        L_0x00e1:
            r21 = r12
        L_0x00e3:
            java.util.UUID r4 = java.util.UUID.randomUUID()
            java.lang.String r23 = r4.toString()
            com.google.android.gms.internal.ads.ix r4 = com.google.android.gms.ads.internal.C3025aw.m10922j()
            com.google.android.gms.ads.internal.ax r6 = r0.f8733e
            android.content.Context r6 = r6.f8858c
            android.os.Bundle r12 = r4.mo15468a(r6, r0, r9)
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            r4 = r2
        L_0x0102:
            com.google.android.gms.ads.internal.ax r6 = r0.f8733e
            android.support.v4.d.m<java.lang.String, com.google.android.gms.internal.ads.avs> r6 = r6.f8877v
            int r6 = r6.size()
            if (r4 >= r6) goto L_0x0133
            com.google.android.gms.ads.internal.ax r6 = r0.f8733e
            android.support.v4.d.m<java.lang.String, com.google.android.gms.internal.ads.avs> r6 = r6.f8877v
            java.lang.Object r6 = r6.mo1399b(r4)
            java.lang.String r6 = (java.lang.String) r6
            r14.add(r6)
            com.google.android.gms.ads.internal.ax r10 = r0.f8733e
            android.support.v4.d.m<java.lang.String, com.google.android.gms.internal.ads.avp> r10 = r10.f8876u
            boolean r10 = r10.containsKey(r6)
            if (r10 == 0) goto L_0x0130
            com.google.android.gms.ads.internal.ax r10 = r0.f8733e
            android.support.v4.d.m<java.lang.String, com.google.android.gms.internal.ads.avp> r10 = r10.f8876u
            java.lang.Object r10 = r10.get(r6)
            if (r10 == 0) goto L_0x0130
            r15.add(r6)
        L_0x0130:
            int r4 = r4 + 1
            goto L_0x0102
        L_0x0133:
            com.google.android.gms.ads.internal.bd r4 = new com.google.android.gms.ads.internal.bd
            r4.<init>(r0)
            com.google.android.gms.internal.ads.ne r34 = com.google.android.gms.internal.ads.C3907jl.m17119a(r4)
            com.google.android.gms.ads.internal.be r4 = new com.google.android.gms.ads.internal.be
            r4.<init>(r0)
            com.google.android.gms.internal.ads.ne r44 = com.google.android.gms.internal.ads.C3907jl.m17119a(r4)
            if (r67 == 0) goto L_0x014e
            java.lang.String r4 = r67.mo15428c()
            r35 = r4
            goto L_0x0150
        L_0x014e:
            r35 = 0
        L_0x0150:
            com.google.android.gms.ads.internal.ax r4 = r0.f8733e
            java.util.List<java.lang.String> r4 = r4.f8844F
            if (r4 == 0) goto L_0x01a8
            com.google.android.gms.ads.internal.ax r4 = r0.f8733e
            java.util.List<java.lang.String> r4 = r4.f8844F
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x01a8
            if (r8 == 0) goto L_0x0164
            int r2 = r8.versionCode
        L_0x0164:
            com.google.android.gms.internal.ads.io r4 = com.google.android.gms.ads.internal.C3025aw.m10921i()
            com.google.android.gms.internal.ads.jg r4 = r4.mo15449l()
            int r4 = r4.mo15505g()
            if (r2 <= r4) goto L_0x0189
            com.google.android.gms.internal.ads.io r4 = com.google.android.gms.ads.internal.C3025aw.m10921i()
            com.google.android.gms.internal.ads.jg r4 = r4.mo15449l()
            r4.mo15511m()
            com.google.android.gms.internal.ads.io r4 = com.google.android.gms.ads.internal.C3025aw.m10921i()
            com.google.android.gms.internal.ads.jg r4 = r4.mo15449l()
            r4.mo15482a(r2)
            goto L_0x01a8
        L_0x0189:
            com.google.android.gms.internal.ads.io r2 = com.google.android.gms.ads.internal.C3025aw.m10921i()
            com.google.android.gms.internal.ads.jg r2 = r2.mo15449l()
            org.json.JSONObject r2 = r2.mo15510l()
            if (r2 == 0) goto L_0x01a8
            com.google.android.gms.ads.internal.ax r4 = r0.f8733e
            java.lang.String r4 = r4.f8857b
            org.json.JSONArray r2 = r2.optJSONArray(r4)
            if (r2 == 0) goto L_0x01a8
            java.lang.String r2 = r2.toString()
            r46 = r2
            goto L_0x01aa
        L_0x01a8:
            r46 = 0
        L_0x01aa:
            com.google.android.gms.internal.ads.dl r53 = new com.google.android.gms.internal.ads.dl
            com.google.android.gms.ads.internal.ax r2 = r0.f8733e
            com.google.android.gms.internal.ads.zzjn r6 = r2.f8864i
            com.google.android.gms.ads.internal.ax r2 = r0.f8733e
            java.lang.String r10 = r2.f8857b
            java.lang.String r13 = com.google.android.gms.internal.ads.aoq.m14617c()
            com.google.android.gms.ads.internal.ax r2 = r0.f8733e
            com.google.android.gms.internal.ads.zzang r4 = r2.f8860e
            com.google.android.gms.ads.internal.ax r2 = r0.f8733e
            java.util.List<java.lang.String> r2 = r2.f8844F
            com.google.android.gms.internal.ads.io r1 = com.google.android.gms.ads.internal.C3025aw.m10921i()
            com.google.android.gms.internal.ads.jg r1 = r1.mo15449l()
            boolean r16 = r1.mo15489a()
            int r1 = r3.widthPixels
            r54 = r1
            int r1 = r3.heightPixels
            float r3 = r3.density
            java.util.List r24 = com.google.android.gms.internal.ads.aru.m15023a()
            r55 = r2
            com.google.android.gms.ads.internal.ax r2 = r0.f8733e
            java.lang.String r2 = r2.f8856a
            r56 = r2
            com.google.android.gms.ads.internal.ax r2 = r0.f8733e
            com.google.android.gms.internal.ads.zzpl r2 = r2.f8878w
            r57 = r2
            com.google.android.gms.ads.internal.ax r2 = r0.f8733e
            java.lang.String r27 = r2.mo12529f()
            com.google.android.gms.internal.ads.kf r2 = com.google.android.gms.ads.internal.C3025aw.m10910D()
            float r28 = r2.mo15556a()
            com.google.android.gms.internal.ads.kf r2 = com.google.android.gms.ads.internal.C3025aw.m10910D()
            boolean r29 = r2.mo15559b()
            com.google.android.gms.ads.internal.C3025aw.m10917e()
            com.google.android.gms.ads.internal.ax r2 = r0.f8733e
            android.content.Context r2 = r2.f8858c
            int r30 = com.google.android.gms.internal.ads.C3909jn.m17171i(r2)
            com.google.android.gms.ads.internal.C3025aw.m10917e()
            com.google.android.gms.ads.internal.ax r2 = r0.f8733e
            com.google.android.gms.ads.internal.ay r2 = r2.f8861f
            int r31 = com.google.android.gms.internal.ads.C3909jn.m17161d(r2)
            com.google.android.gms.ads.internal.ax r2 = r0.f8733e
            android.content.Context r2 = r2.f8858c
            boolean r2 = r2 instanceof android.app.Activity
            r58 = r2
            com.google.android.gms.internal.ads.io r2 = com.google.android.gms.ads.internal.C3025aw.m10921i()
            com.google.android.gms.internal.ads.jg r2 = r2.mo15449l()
            boolean r33 = r2.mo15504f()
            com.google.android.gms.internal.ads.io r2 = com.google.android.gms.ads.internal.C3025aw.m10921i()
            boolean r36 = r2.mo15441d()
            com.google.android.gms.internal.ads.po r2 = com.google.android.gms.ads.internal.C3025aw.m10938z()
            int r37 = r2.mo15832a()
            com.google.android.gms.ads.internal.C3025aw.m10917e()
            android.os.Bundle r38 = com.google.android.gms.internal.ads.C3909jn.m17156c()
            com.google.android.gms.internal.ads.ko r2 = com.google.android.gms.ads.internal.C3025aw.m10927o()
            java.lang.String r39 = r2.mo15577a()
            com.google.android.gms.ads.internal.ax r2 = r0.f8733e
            com.google.android.gms.internal.ads.zzlu r2 = r2.f8880y
            r59 = r2
            com.google.android.gms.internal.ads.ko r2 = com.google.android.gms.ads.internal.C3025aw.m10927o()
            boolean r41 = r2.mo15581b()
            com.google.android.gms.internal.ads.ayk r2 = com.google.android.gms.internal.ads.ayk.m15729a()
            android.os.Bundle r42 = r2.mo14984j()
            com.google.android.gms.internal.ads.io r2 = com.google.android.gms.ads.internal.C3025aw.m10921i()
            com.google.android.gms.internal.ads.jg r2 = r2.mo15449l()
            r60 = r3
            com.google.android.gms.ads.internal.ax r3 = r0.f8733e
            java.lang.String r3 = r3.f8857b
            boolean r43 = r2.mo15502e(r3)
            com.google.android.gms.ads.internal.ax r2 = r0.f8733e
            java.util.List<java.lang.Integer> r3 = r2.f8839A
            com.google.android.gms.ads.internal.ax r2 = r0.f8733e
            android.content.Context r2 = r2.f8858c
            com.google.android.gms.common.b.b r2 = com.google.android.gms.common.p140b.C3404c.m12230a(r2)
            boolean r49 = r2.mo13392a()
            com.google.android.gms.internal.ads.io r2 = com.google.android.gms.ads.internal.C3025aw.m10921i()
            boolean r50 = r2.mo15442e()
            com.google.android.gms.ads.internal.C3025aw.m10919g()
            boolean r51 = com.google.android.gms.internal.ads.C3915jt.m17197e()
            com.google.android.gms.internal.ads.io r2 = com.google.android.gms.ads.internal.C3025aw.m10921i()
            com.google.android.gms.internal.ads.ne r2 = r2.mo15451n()
            r62 = r3
            r61 = r4
            r3 = 1000(0x3e8, double:4.94E-321)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            r63 = r15
            r15 = 0
            java.lang.Object r0 = com.google.android.gms.internal.ads.C3996mt.m17454a(r2, r15, r3, r0)
            r52 = r0
            java.util.ArrayList r52 = (java.util.ArrayList) r52
            r0 = r55
            r25 = r56
            r26 = r57
            r32 = r58
            r40 = r59
            r2 = r53
            r19 = r60
            r45 = r62
            r3 = r11
            r11 = r61
            r4 = r5
            r5 = r6
            r6 = r10
            r10 = r13
            r13 = r0
            r0 = r63
            r15 = r66
            r17 = r54
            r18 = r1
            r47 = r0
            r48 = r68
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52)
            return r53
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.C3030ba.m10955a(com.google.android.gms.internal.ads.zzjj, android.os.Bundle, com.google.android.gms.internal.ads.in, int):com.google.android.gms.internal.ads.dl");
    }

    /* renamed from: c */
    static String m10956c(C3878ij ijVar) {
        if (ijVar == null) {
            return null;
        }
        String str = ijVar.f13281q;
        if (("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) && ijVar.f13279o != null) {
            try {
                return new JSONObject(ijVar.f13279o.f12552k).getString("class_name");
            } catch (NullPointerException | JSONException unused) {
            }
        }
        return str;
    }

    /* renamed from: I */
    public void mo12456I() {
        C3900je.m17435e("showInterstitial is not supported for current ad type");
    }

    /* renamed from: U */
    public void mo12468U() {
        mo9646e();
    }

    /* renamed from: V */
    public void mo12469V() {
        mo12551ac();
    }

    /* renamed from: W */
    public void mo12470W() {
        C3900je.m17435e("Mediated ad does not support onVideoEnd callback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: X */
    public boolean mo12542X() {
        C3025aw.m10917e();
        if (C3909jn.m17147a(this.f8733e.f8858c, "android.permission.INTERNET")) {
            C3025aw.m10917e();
            if (C3909jn.m17146a(this.f8733e.f8858c)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: Y */
    public final void mo12543Y() {
        mo12557t_();
    }

    /* renamed from: Z */
    public final void mo12544Z() {
        mo12449v();
    }

    /* renamed from: a */
    public final String mo12504a() {
        if (this.f8733e.f8865j == null) {
            return null;
        }
        return this.f8733e.f8865j.f13281q;
    }

    /* renamed from: a */
    public final void mo12545a(ave ave, String str) {
        Object obj;
        avp avp = null;
        if (ave != null) {
            try {
                obj = ave.mo14771l();
            } catch (RemoteException e) {
                C3900je.m17432c("Unable to call onCustomClick.", e);
                return;
            }
        } else {
            obj = null;
        }
        if (!(this.f8733e.f8876u == null || obj == null)) {
            avp = (avp) this.f8733e.f8876u.get(obj);
        }
        if (avp == null) {
            C3900je.m17435e("Mediation adapter invoked onCustomClick but no listeners were set.");
        } else {
            avp.mo14914a(ave, str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12546a(C3878ij ijVar, boolean z) {
        if (ijVar == null) {
            C3900je.m17435e("Ad state was null when trying to ping impression URLs.");
            return;
        }
        if (ijVar == null) {
            C3900je.m17435e("Ad state was null when trying to ping impression URLs.");
        } else {
            C3900je.m17429b("Pinging Impression URLs.");
            if (this.f8733e.f8867l != null) {
                this.f8733e.f8867l.mo15413a();
            }
            ijVar.f13256K.mo14518a(C3660b.AD_IMPRESSION);
            if (ijVar.f13269e != null && !ijVar.f13249D) {
                C3025aw.m10917e();
                C3909jn.m17139a(this.f8733e.f8858c, this.f8733e.f8860e.f14505a, mo12427b(ijVar.f13269e));
                ijVar.f13249D = true;
            }
        }
        if (!ijVar.f13251F || z) {
            if (!(ijVar.f13282r == null || ijVar.f13282r.f12566d == null)) {
                C3025aw.m10936x();
                bbt.m15970a(this.f8733e.f8858c, this.f8733e.f8860e.f14505a, ijVar, this.f8733e.f8857b, z, mo12427b(ijVar.f13282r.f12566d));
            }
            if (!(ijVar.f13279o == null || ijVar.f13279o.f12548g == null)) {
                C3025aw.m10936x();
                bbt.m15970a(this.f8733e.f8858c, this.f8733e.f8860e.f14505a, ijVar, this.f8733e.f8857b, z, ijVar.f13279o.f12548g);
            }
            ijVar.f13251F = true;
        }
    }

    /* renamed from: a */
    public final boolean mo12547a(C3744dl dlVar, ash ash) {
        this.f8729a = ash;
        ash.mo14721a("seq_num", dlVar.f12892g);
        ash.mo14721a("request_id", dlVar.f12907v);
        ash.mo14721a("session_id", dlVar.f12893h);
        if (dlVar.f12891f != null) {
            ash.mo14721a("app_version", String.valueOf(dlVar.f12891f.versionCode));
        }
        C3026ax axVar = this.f8733e;
        C3025aw.m10913a();
        Context context = this.f8733e.f8858c;
        amo amo = this.f8737i.f8922d;
        C3894iz ecVar = dlVar.f12887b.f14527c.getBundle("sdk_less_server_data") != null ? new C3763ec(context, dlVar, this, amo) : new C3721cp(context, dlVar, this, amo);
        ecVar.mo15475h();
        axVar.f8862g = ecVar;
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo12424a(C3878ij ijVar) {
        zzjj zzjj;
        boolean z = false;
        if (this.f8734f != null) {
            zzjj = this.f8734f;
            this.f8734f = null;
        } else {
            zzjj = ijVar.f13265a;
            if (zzjj.f14527c != null) {
                z = zzjj.f14527c.getBoolean("_noRefresh", false);
            }
        }
        return mo12475a(zzjj, ijVar, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo12425a(C3878ij ijVar, C3878ij ijVar2) {
        int i;
        if (!(ijVar == null || ijVar.f13283s == null)) {
            ijVar.f13283s.mo15059a((bbl) null);
        }
        if (ijVar2.f13283s != null) {
            ijVar2.f13283s.mo15059a((bbl) this);
        }
        int i2 = 0;
        if (ijVar2.f13282r != null) {
            i2 = ijVar2.f13282r.f12580r;
            i = ijVar2.f13282r.f12581s;
        } else {
            i = 0;
        }
        this.f8733e.f8845G.mo15464a(i2, i);
        return true;
    }

    /* renamed from: a */
    public boolean mo12426a(zzjj zzjj, ash ash) {
        return mo12548a(zzjj, ash, 1);
    }

    /* renamed from: a */
    public final boolean mo12548a(zzjj zzjj, ash ash, int i) {
        C3882in inVar;
        if (!mo12542X()) {
            return false;
        }
        C3025aw.m10917e();
        alc a = C3025aw.m10921i().mo15431a(this.f8733e.f8858c);
        String str = null;
        Bundle a2 = a == null ? null : C3909jn.m17123a(a);
        this.f8732d.mo12491a();
        this.f8733e.f8847I = 0;
        if (((Boolean) aoq.m14620f().mo14695a(aru.f11926cs)).booleanValue()) {
            inVar = C3025aw.m10921i().mo15449l().mo15506h();
            C3055e m = C3025aw.m10925m();
            Context context = this.f8733e.f8858c;
            zzang zzang = this.f8733e.f8860e;
            String str2 = this.f8733e.f8857b;
            if (inVar != null) {
                str = inVar.mo15429d();
            }
            m.mo12595a(context, zzang, false, inVar, str, str2, null);
        } else {
            inVar = null;
        }
        return mo12547a(m10955a(zzjj, a2, inVar, i), ash);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo12475a(zzjj zzjj, C3878ij ijVar, boolean z) {
        C3015am amVar;
        long j;
        if (!z && this.f8733e.mo12527d()) {
            if (ijVar.f13273i > 0) {
                amVar = this.f8732d;
                j = ijVar.f13273i;
            } else if (ijVar.f13282r != null && ijVar.f13282r.f12572j > 0) {
                amVar = this.f8732d;
                j = ijVar.f13282r.f12572j;
            } else if (!ijVar.f13278n && ijVar.f13268d == 2) {
                this.f8732d.mo12495b(zzjj);
            }
            amVar.mo12493a(zzjj, j);
        }
        return this.f8732d.mo12498e();
    }

    /* renamed from: aa */
    public final void mo12549aa() {
        mo12556g();
    }

    /* renamed from: ab */
    public final void mo12550ab() {
        if (this.f8733e.f8865j != null) {
            String str = this.f8733e.f8865j.f13281q;
            StringBuilder sb = new StringBuilder(74 + String.valueOf(str).length());
            sb.append("Mediation adapter ");
            sb.append(str);
            sb.append(" refreshed, but mediation adapters should never refresh.");
            C3900je.m17435e(sb.toString());
        }
        mo12546a(this.f8733e.f8865j, true);
        mo12552b(this.f8733e.f8865j, true);
        mo12451x();
    }

    /* renamed from: ac */
    public final void mo12551ac() {
        mo12546a(this.f8733e.f8865j, false);
    }

    /* renamed from: b */
    public final void mo12428b(C3878ij ijVar) {
        super.mo12428b(ijVar);
        if (ijVar.f13279o != null) {
            C3900je.m17429b("Disable the debug gesture detector on the mediation ad frame.");
            if (this.f8733e.f8861f != null) {
                this.f8733e.f8861f.mo12535d();
            }
            C3900je.m17429b("Pinging network fill URLs.");
            C3025aw.m10936x();
            bbt.m15970a(this.f8733e.f8858c, this.f8733e.f8860e.f14505a, ijVar, this.f8733e.f8857b, false, ijVar.f13279o.f12551j);
            if (!(ijVar.f13282r == null || ijVar.f13282r.f12569g == null || ijVar.f13282r.f12569g.size() <= 0)) {
                C3900je.m17429b("Pinging urls remotely");
                C3025aw.m10917e().mo15518a(this.f8733e.f8858c, ijVar.f13282r.f12569g);
            }
        } else {
            C3900je.m17429b("Enable the debug gesture detector on the admob ad frame.");
            if (this.f8733e.f8861f != null) {
                this.f8733e.f8861f.mo12534c();
            }
        }
        if (ijVar.f13268d == 3 && ijVar.f13282r != null && ijVar.f13282r.f12568f != null) {
            C3900je.m17429b("Pinging no fill URLs.");
            C3025aw.m10936x();
            bbt.m15970a(this.f8733e.f8858c, this.f8733e.f8860e.f14505a, ijVar, this.f8733e.f8857b, false, ijVar.f13282r.f12568f);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo12552b(C3878ij ijVar, boolean z) {
        if (ijVar != null) {
            if (!(ijVar == null || ijVar.f13270f == null || ijVar.f13250E)) {
                C3025aw.m10917e();
                C3909jn.m17139a(this.f8733e.f8858c, this.f8733e.f8860e.f14505a, mo12400a(ijVar.f13270f));
                ijVar.f13250E = true;
            }
            if (!ijVar.f13252G || z) {
                if (!(ijVar.f13282r == null || ijVar.f13282r.f12567e == null)) {
                    C3025aw.m10936x();
                    bbt.m15970a(this.f8733e.f8858c, this.f8733e.f8860e.f14505a, ijVar, this.f8733e.f8857b, z, mo12400a(ijVar.f13282r.f12567e));
                }
                if (!(ijVar.f13279o == null || ijVar.f13279o.f12549h == null)) {
                    C3025aw.m10936x();
                    bbt.m15970a(this.f8733e.f8858c, this.f8733e.f8860e.f14505a, ijVar, this.f8733e.f8857b, z, ijVar.f13279o.f12549h);
                }
                ijVar.f13252G = true;
            }
        }
    }

    /* renamed from: b */
    public final void mo12553b(String str, String str2) {
        mo12422a(str, str2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo12433c(zzjj zzjj) {
        return super.mo12433c(zzjj) && !this.f8889k;
    }

    /* renamed from: d */
    public final void mo12554d() {
        this.f8735g.mo14381c(this.f8733e.f8865j);
    }

    /* renamed from: e */
    public void mo9646e() {
        if (this.f8733e.f8865j == null) {
            C3900je.m17435e("Ad state was null when trying to ping click URLs.");
            return;
        }
        if (!(this.f8733e.f8865j.f13282r == null || this.f8733e.f8865j.f13282r.f12565c == null)) {
            C3025aw.m10936x();
            bbt.m15970a(this.f8733e.f8858c, this.f8733e.f8860e.f14505a, this.f8733e.f8865j, this.f8733e.f8857b, false, mo12427b(this.f8733e.f8865j.f13282r.f12565c));
        }
        if (!(this.f8733e.f8865j.f13279o == null || this.f8733e.f8865j.f13279o.f12547f == null)) {
            C3025aw.m10936x();
            bbt.m15970a(this.f8733e.f8858c, this.f8733e.f8860e.f14505a, this.f8733e.f8865j, this.f8733e.f8857b, false, this.f8733e.f8865j.f13279o.f12547f);
        }
        super.mo9646e();
    }

    /* renamed from: f */
    public final void mo12555f() {
        this.f8735g.mo14382d(this.f8733e.f8865j);
    }

    /* renamed from: g */
    public void mo12556g() {
        this.f8889k = true;
        mo12450w();
    }

    /* renamed from: j_ */
    public final void mo12502j_() {
        Executor executor = C4014nk.f13617a;
        C3015am amVar = this.f8732d;
        amVar.getClass();
        executor.execute(C3031bb.m10990a(amVar));
    }

    /* renamed from: k_ */
    public final void mo12503k_() {
        Executor executor = C4014nk.f13617a;
        C3015am amVar = this.f8732d;
        amVar.getClass();
        executor.execute(C3032bc.m10991a(amVar));
    }

    /* renamed from: o */
    public void mo12442o() {
        C3513t.m12634b("pause must be called on the main UI thread.");
        if (!(this.f8733e.f8865j == null || this.f8733e.f8865j.f13266b == null || !this.f8733e.mo12527d())) {
            C3025aw.m10919g();
            C3915jt.m17195a(this.f8733e.f8865j.f13266b);
        }
        if (!(this.f8733e.f8865j == null || this.f8733e.f8865j.f13280p == null)) {
            try {
                this.f8733e.f8865j.f13280p.mo15097d();
            } catch (RemoteException unused) {
                C3900je.m17435e("Could not pause mediation adapter.");
            }
        }
        this.f8735g.mo14381c(this.f8733e.f8865j);
        this.f8732d.mo12494b();
    }

    /* renamed from: p */
    public void mo12443p() {
        C3513t.m12634b("resume must be called on the main UI thread.");
        C4089qe qeVar = (this.f8733e.f8865j == null || this.f8733e.f8865j.f13266b == null) ? null : this.f8733e.f8865j.f13266b;
        if (qeVar != null && this.f8733e.mo12527d()) {
            C3025aw.m10919g();
            C3915jt.m17196b(this.f8733e.f8865j.f13266b);
        }
        if (!(this.f8733e.f8865j == null || this.f8733e.f8865j.f13280p == null)) {
            try {
                this.f8733e.f8865j.f13280p.mo15098e();
            } catch (RemoteException unused) {
                C3900je.m17435e("Could not resume mediation adapter.");
            }
        }
        if (qeVar == null || !qeVar.mo15867D()) {
            this.f8732d.mo12496c();
        }
        this.f8735g.mo14382d(this.f8733e.f8865j);
    }

    /* renamed from: t_ */
    public void mo12557t_() {
        this.f8889k = false;
        mo12448u();
        this.f8733e.f8867l.mo15420c();
    }

    /* renamed from: u_ */
    public final String mo12509u_() {
        if (this.f8733e.f8865j == null) {
            return null;
        }
        return m10956c(this.f8733e.f8865j);
    }
}
