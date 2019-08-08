package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.au */
public final class C3672au extends C3655ak {

    /* renamed from: g */
    protected bbr f12243g;

    /* renamed from: h */
    private bca f12244h;

    /* renamed from: i */
    private bbi f12245i;

    /* renamed from: j */
    private bbk f12246j;

    /* renamed from: k */
    private final ash f12247k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C4089qe f12248l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f12249m;

    C3672au(Context context, C3879ik ikVar, bca bca, C3665ap apVar, ash ash, C4089qe qeVar) {
        super(context, ikVar, apVar);
        this.f12244h = bca;
        this.f12246j = ikVar.f13293c;
        this.f12247k = ash;
        this.f12248l = qeVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C3878ij mo14413a(int i) {
        bbk bbk;
        boolean z;
        String str;
        long j;
        zzael zzael;
        String str2;
        bbk bbk2;
        boolean z2;
        String str3;
        long j2;
        int i2;
        zzaef zzaef = this.f11246e.f13291a;
        zzjj zzjj = zzaef.f14404c;
        C4089qe qeVar = this.f12248l;
        List<String> list = this.f11247f.f14454c;
        List<String> list2 = this.f11247f.f14456e;
        List<String> list3 = this.f11247f.f14460i;
        int i3 = this.f11247f.f14462k;
        long j3 = this.f11247f.f14461j;
        String str4 = zzaef.f14410i;
        boolean z3 = this.f11247f.f14458g;
        bbj bbj = this.f12243g != null ? this.f12243g.f12614b : null;
        bcd bcd = this.f12243g != null ? this.f12243g.f12615c : null;
        String name = this.f12243g != null ? this.f12243g.f12616d : AdMobAdapter.class.getName();
        bbk bbk3 = this.f12246j;
        bbn bbn = this.f12243g != null ? this.f12243g.f12617e : null;
        bbj bbj2 = bbj;
        bcd bcd2 = bcd;
        long j4 = this.f11247f.f14459h;
        zzjn zzjn = this.f11246e.f13294d;
        long j5 = j4;
        long j6 = this.f11247f.f14457f;
        long j7 = this.f11246e.f13296f;
        long j8 = this.f11247f.f14464m;
        String str5 = this.f11247f.f14465n;
        JSONObject jSONObject = this.f11246e.f13298h;
        zzaig zzaig = this.f11247f.f14428A;
        List<String> list4 = this.f11247f.f14429B;
        List<String> list5 = this.f11247f.f14430C;
        zzjn zzjn2 = zzjn;
        boolean z4 = this.f12246j != null ? this.f12246j.f12577o : false;
        zzael zzael2 = this.f11247f.f14432E;
        if (this.f12245i != null) {
            List b = this.f12245i.mo15053b();
            zzael = zzael2;
            String str6 = "";
            if (b == null) {
                bbk = bbk3;
                str2 = str6.toString();
                str = str4;
                z = z3;
                j = j8;
            } else {
                Iterator it = b.iterator();
                while (it.hasNext()) {
                    Iterator it2 = it;
                    bbr bbr = (bbr) it.next();
                    if (bbr != null) {
                        j2 = j8;
                        if (bbr.f12614b == null || TextUtils.isEmpty(bbr.f12614b.f12545d)) {
                            bbk2 = bbk3;
                            str3 = str4;
                            z2 = z3;
                        } else {
                            String valueOf = String.valueOf(str6);
                            String str7 = bbr.f12614b.f12545d;
                            switch (bbr.f12613a) {
                                case -1:
                                    i2 = 4;
                                    break;
                                case 0:
                                    str3 = str4;
                                    z2 = z3;
                                    i2 = 0;
                                    break;
                                case 1:
                                    str3 = str4;
                                    z2 = z3;
                                    i2 = 1;
                                    break;
                                case 3:
                                    i2 = 2;
                                    break;
                                case 4:
                                    i2 = 3;
                                    break;
                                case 5:
                                    i2 = 5;
                                    break;
                                default:
                                    i2 = 6;
                                    break;
                            }
                            str3 = str4;
                            z2 = z3;
                            long j9 = bbr.f12619g;
                            bbk2 = bbk3;
                            StringBuilder sb = new StringBuilder(33 + String.valueOf(str7).length());
                            sb.append(str7);
                            sb.append(".");
                            sb.append(i2);
                            sb.append(".");
                            sb.append(j9);
                            String sb2 = sb.toString();
                            StringBuilder sb3 = new StringBuilder(1 + String.valueOf(valueOf).length() + String.valueOf(sb2).length());
                            sb3.append(valueOf);
                            sb3.append(sb2);
                            sb3.append("_");
                            str6 = sb3.toString();
                        }
                    } else {
                        bbk2 = bbk3;
                        str3 = str4;
                        z2 = z3;
                        j2 = j8;
                    }
                    it = it2;
                    j8 = j2;
                    str4 = str3;
                    z3 = z2;
                    bbk3 = bbk2;
                }
                bbk = bbk3;
                str = str4;
                z = z3;
                j = j8;
                str2 = str6.substring(0, Math.max(0, str6.length() - 1));
            }
        } else {
            bbk = bbk3;
            zzael = zzael2;
            str = str4;
            z = z3;
            j = j8;
            str2 = null;
        }
        List<String> list6 = this.f11247f.f14435H;
        String str8 = this.f11247f.f14439L;
        amj amj = this.f11246e.f13299i;
        boolean z5 = this.f11247f.f14442O;
        boolean z6 = z5;
        amj amj2 = amj;
        bbj bbj3 = bbj2;
        String str9 = str8;
        bcd bcd3 = bcd2;
        bbk bbk4 = bbk;
        C3878ij ijVar = new C3878ij(zzjj, qeVar, list, i, list2, list3, i3, j3, str, z, bbj3, bcd3, name, bbk4, bbn, j5, zzjn2, j6, j7, j, str5, jSONObject, null, zzaig, list4, list5, z4, zzael, str2, list6, str9, amj2, z6, this.f11246e.f13300j, this.f11247f.f14444Q, this.f11247f.f14445R, this.f11247f.f14446S, this.f11247f.f14447T);
        return ijVar;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r3v3, types: [com.google.android.gms.internal.ads.bbi] */
    /* JADX WARNING: type inference failed for: r18v0, types: [com.google.android.gms.internal.ads.bbx] */
    /* JADX WARNING: type inference failed for: r5v4, types: [com.google.android.gms.internal.ads.bbu] */
    /* JADX WARNING: type inference failed for: r18v2, types: [com.google.android.gms.internal.ads.bbx] */
    /* JADX WARNING: type inference failed for: r5v5, types: [com.google.android.gms.internal.ads.bbu] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r18v2, types: [com.google.android.gms.internal.ads.bbx]
      assigns: [com.google.android.gms.internal.ads.bbx, com.google.android.gms.internal.ads.bbu]
      uses: [com.google.android.gms.internal.ads.bbx, com.google.android.gms.internal.ads.bbi, com.google.android.gms.internal.ads.bbu]
      mth insns count: 154
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0104  */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14414a(long r33) throws com.google.android.gms.internal.ads.C3662an {
        /*
            r32 = this;
            r1 = r32
            java.lang.Object r2 = r1.f11245d
            monitor-enter(r2)
            com.google.android.gms.internal.ads.bbk r3 = r1.f12246j     // Catch:{ all -> 0x0177 }
            int r3 = r3.f12575m     // Catch:{ all -> 0x0177 }
            r4 = -1
            if (r3 == r4) goto L_0x0043
            com.google.android.gms.internal.ads.bbu r3 = new com.google.android.gms.internal.ads.bbu     // Catch:{ all -> 0x0177 }
            android.content.Context r6 = r1.f11243b     // Catch:{ all -> 0x0177 }
            com.google.android.gms.internal.ads.ik r4 = r1.f11246e     // Catch:{ all -> 0x0177 }
            com.google.android.gms.internal.ads.zzaef r7 = r4.f13291a     // Catch:{ all -> 0x0177 }
            com.google.android.gms.internal.ads.bca r8 = r1.f12244h     // Catch:{ all -> 0x0177 }
            com.google.android.gms.internal.ads.bbk r9 = r1.f12246j     // Catch:{ all -> 0x0177 }
            com.google.android.gms.internal.ads.zzaej r4 = r1.f11247f     // Catch:{ all -> 0x0177 }
            boolean r10 = r4.f14470s     // Catch:{ all -> 0x0177 }
            com.google.android.gms.internal.ads.zzaej r4 = r1.f11247f     // Catch:{ all -> 0x0177 }
            boolean r11 = r4.f14477z     // Catch:{ all -> 0x0177 }
            com.google.android.gms.internal.ads.zzaej r4 = r1.f11247f     // Catch:{ all -> 0x0177 }
            java.lang.String r12 = r4.f14437J     // Catch:{ all -> 0x0177 }
            com.google.android.gms.internal.ads.ark<java.lang.Long> r4 = com.google.android.gms.internal.ads.aru.f11830bB     // Catch:{ all -> 0x0177 }
            com.google.android.gms.internal.ads.ars r5 = com.google.android.gms.internal.ads.aoq.m14620f()     // Catch:{ all -> 0x0177 }
            java.lang.Object r4 = r5.mo14695a(r4)     // Catch:{ all -> 0x0177 }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ all -> 0x0177 }
            long r15 = r4.longValue()     // Catch:{ all -> 0x0177 }
            r17 = 2
            com.google.android.gms.internal.ads.ik r4 = r1.f11246e     // Catch:{ all -> 0x0177 }
            boolean r4 = r4.f13300j     // Catch:{ all -> 0x0177 }
            r5 = r3
            r13 = r33
            r18 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r15, r17, r18)     // Catch:{ all -> 0x0177 }
            goto L_0x008a
        L_0x0043:
            com.google.android.gms.internal.ads.bbx r3 = new com.google.android.gms.internal.ads.bbx     // Catch:{ all -> 0x0177 }
            android.content.Context r4 = r1.f11243b     // Catch:{ all -> 0x0177 }
            com.google.android.gms.internal.ads.ik r5 = r1.f11246e     // Catch:{ all -> 0x0177 }
            com.google.android.gms.internal.ads.zzaef r5 = r5.f13291a     // Catch:{ all -> 0x0177 }
            com.google.android.gms.internal.ads.bca r6 = r1.f12244h     // Catch:{ all -> 0x0177 }
            com.google.android.gms.internal.ads.bbk r7 = r1.f12246j     // Catch:{ all -> 0x0177 }
            com.google.android.gms.internal.ads.zzaej r8 = r1.f11247f     // Catch:{ all -> 0x0177 }
            boolean r8 = r8.f14470s     // Catch:{ all -> 0x0177 }
            com.google.android.gms.internal.ads.zzaej r9 = r1.f11247f     // Catch:{ all -> 0x0177 }
            boolean r9 = r9.f14477z     // Catch:{ all -> 0x0177 }
            com.google.android.gms.internal.ads.zzaej r10 = r1.f11247f     // Catch:{ all -> 0x0177 }
            java.lang.String r10 = r10.f14437J     // Catch:{ all -> 0x0177 }
            com.google.android.gms.internal.ads.ark<java.lang.Long> r11 = com.google.android.gms.internal.ads.aru.f11830bB     // Catch:{ all -> 0x0177 }
            com.google.android.gms.internal.ads.ars r12 = com.google.android.gms.internal.ads.aoq.m14620f()     // Catch:{ all -> 0x0177 }
            java.lang.Object r11 = r12.mo14695a(r11)     // Catch:{ all -> 0x0177 }
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ all -> 0x0177 }
            long r28 = r11.longValue()     // Catch:{ all -> 0x0177 }
            com.google.android.gms.internal.ads.ash r11 = r1.f12247k     // Catch:{ all -> 0x0177 }
            com.google.android.gms.internal.ads.ik r12 = r1.f11246e     // Catch:{ all -> 0x0177 }
            boolean r12 = r12.f13300j     // Catch:{ all -> 0x0177 }
            r18 = r3
            r19 = r4
            r20 = r5
            r21 = r6
            r22 = r7
            r23 = r8
            r24 = r9
            r25 = r10
            r26 = r33
            r30 = r11
            r31 = r12
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r28, r30, r31)     // Catch:{ all -> 0x0177 }
        L_0x008a:
            r1.f12245i = r3     // Catch:{ all -> 0x0177 }
            monitor-exit(r2)     // Catch:{ all -> 0x0177 }
            java.util.ArrayList r2 = new java.util.ArrayList
            com.google.android.gms.internal.ads.bbk r3 = r1.f12246j
            java.util.List<com.google.android.gms.internal.ads.bbj> r3 = r3.f12563a
            r2.<init>(r3)
            com.google.android.gms.internal.ads.ik r3 = r1.f11246e
            com.google.android.gms.internal.ads.zzaef r3 = r3.f13291a
            com.google.android.gms.internal.ads.zzjj r3 = r3.f14404c
            android.os.Bundle r3 = r3.f14537m
            java.lang.String r4 = "com.google.ads.mediation.admob.AdMobAdapter"
            r5 = 0
            if (r3 == 0) goto L_0x00b0
            android.os.Bundle r3 = r3.getBundle(r4)
            if (r3 == 0) goto L_0x00b0
            java.lang.String r6 = "_skipMediation"
            boolean r3 = r3.getBoolean(r6)
            goto L_0x00b1
        L_0x00b0:
            r3 = r5
        L_0x00b1:
            if (r3 == 0) goto L_0x00cf
            java.util.ListIterator r3 = r2.listIterator()
        L_0x00b7:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x00cf
            java.lang.Object r6 = r3.next()
            com.google.android.gms.internal.ads.bbj r6 = (com.google.android.gms.internal.ads.bbj) r6
            java.util.List<java.lang.String> r6 = r6.f12544c
            boolean r6 = r6.contains(r4)
            if (r6 != 0) goto L_0x00b7
            r3.remove()
            goto L_0x00b7
        L_0x00cf:
            com.google.android.gms.internal.ads.bbi r3 = r1.f12245i
            com.google.android.gms.internal.ads.bbr r2 = r3.mo15051a(r2)
            r1.f12243g = r2
            com.google.android.gms.internal.ads.bbr r2 = r1.f12243g
            int r2 = r2.f12613a
            switch(r2) {
                case 0: goto L_0x0104;
                case 1: goto L_0x00fb;
                default: goto L_0x00de;
            }
        L_0x00de:
            com.google.android.gms.internal.ads.an r2 = new com.google.android.gms.internal.ads.an
            com.google.android.gms.internal.ads.bbr r3 = r1.f12243g
            int r3 = r3.f12613a
            r4 = 40
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r4)
            java.lang.String r4 = "Unexpected mediation result: "
            r6.append(r4)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            r2.<init>(r3, r5)
            throw r2
        L_0x00fb:
            com.google.android.gms.internal.ads.an r2 = new com.google.android.gms.internal.ads.an
            java.lang.String r3 = "No fill from any mediation ad networks."
            r4 = 3
            r2.<init>(r3, r4)
            throw r2
        L_0x0104:
            com.google.android.gms.internal.ads.bbr r2 = r1.f12243g
            com.google.android.gms.internal.ads.bbj r2 = r2.f12614b
            if (r2 == 0) goto L_0x0176
            com.google.android.gms.internal.ads.bbr r2 = r1.f12243g
            com.google.android.gms.internal.ads.bbj r2 = r2.f12614b
            java.lang.String r2 = r2.f12556o
            if (r2 == 0) goto L_0x0176
            java.util.concurrent.CountDownLatch r2 = new java.util.concurrent.CountDownLatch
            r3 = 1
            r2.<init>(r3)
            android.os.Handler r3 = com.google.android.gms.internal.ads.C3909jn.f13411a
            com.google.android.gms.internal.ads.av r4 = new com.google.android.gms.internal.ads.av
            r4.<init>(r1, r2)
            r3.post(r4)
            r3 = 10
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x014e }
            r2.await(r3, r6)     // Catch:{ InterruptedException -> 0x014e }
            java.lang.Object r2 = r1.f11245d
            monitor-enter(r2)
            boolean r3 = r1.f12249m     // Catch:{ all -> 0x014a }
            if (r3 != 0) goto L_0x0138
            com.google.android.gms.internal.ads.an r3 = new com.google.android.gms.internal.ads.an     // Catch:{ all -> 0x014a }
            java.lang.String r4 = "View could not be prepared"
            r3.<init>(r4, r5)     // Catch:{ all -> 0x014a }
            throw r3     // Catch:{ all -> 0x014a }
        L_0x0138:
            com.google.android.gms.internal.ads.qe r3 = r1.f12248l     // Catch:{ all -> 0x014a }
            boolean r3 = r3.mo15864A()     // Catch:{ all -> 0x014a }
            if (r3 == 0) goto L_0x0148
            com.google.android.gms.internal.ads.an r3 = new com.google.android.gms.internal.ads.an     // Catch:{ all -> 0x014a }
            java.lang.String r4 = "Assets not loaded, web view is destroyed"
            r3.<init>(r4, r5)     // Catch:{ all -> 0x014a }
            throw r3     // Catch:{ all -> 0x014a }
        L_0x0148:
            monitor-exit(r2)     // Catch:{ all -> 0x014a }
            return
        L_0x014a:
            r0 = move-exception
            r3 = r0
            monitor-exit(r2)     // Catch:{ all -> 0x014a }
            throw r3
        L_0x014e:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.internal.ads.an r3 = new com.google.android.gms.internal.ads.an
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r4 = 38
            java.lang.String r6 = java.lang.String.valueOf(r2)
            int r6 = r6.length()
            int r4 = r4 + r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r4)
            java.lang.String r4 = "Interrupted while waiting for latch : "
            r6.append(r4)
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            r3.<init>(r2, r5)
            throw r3
        L_0x0176:
            return
        L_0x0177:
            r0 = move-exception
            r3 = r0
            monitor-exit(r2)     // Catch:{ all -> 0x0177 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3672au.mo14414a(long):void");
    }

    /* renamed from: e_ */
    public final void mo12688e_() {
        synchronized (this.f11245d) {
            super.mo12688e_();
            if (this.f12245i != null) {
                this.f12245i.mo15052a();
            }
        }
    }
}
