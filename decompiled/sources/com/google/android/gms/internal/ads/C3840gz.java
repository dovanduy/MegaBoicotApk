package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.gz */
public final class C3840gz extends C3894iz implements C3839gy {

    /* renamed from: a */
    private final C3879ik f13180a;

    /* renamed from: b */
    private final Context f13181b;

    /* renamed from: c */
    private final ArrayList<C3830gp> f13182c;

    /* renamed from: d */
    private final List<C3833gs> f13183d;

    /* renamed from: e */
    private final HashSet<String> f13184e;

    /* renamed from: f */
    private final Object f13185f;

    /* renamed from: g */
    private final C3804fq f13186g;

    /* renamed from: h */
    private final long f13187h;

    public C3840gz(Context context, C3879ik ikVar, C3804fq fqVar) {
        Context context2 = context;
        C3879ik ikVar2 = ikVar;
        C3804fq fqVar2 = fqVar;
        this(context2, ikVar2, fqVar2, ((Long) aoq.m14620f().mo14695a(aru.f11780aE)).longValue());
    }

    private C3840gz(Context context, C3879ik ikVar, C3804fq fqVar, long j) {
        this.f13182c = new ArrayList<>();
        this.f13183d = new ArrayList();
        this.f13184e = new HashSet<>();
        this.f13185f = new Object();
        this.f13181b = context;
        this.f13180a = ikVar;
        this.f13186g = fqVar;
        this.f13187h = j;
    }

    /* renamed from: a */
    private final C3878ij m16824a(int i, String str, bbj bbj) {
        boolean z;
        long j;
        String str2;
        zzjn zzjn;
        String str3;
        long j2;
        int i2;
        zzjj zzjj = this.f13180a.f13291a.f14404c;
        List<String> list = this.f13180a.f13292b.f14454c;
        List<String> list2 = this.f13180a.f13292b.f14456e;
        List<String> list3 = this.f13180a.f13292b.f14460i;
        int i3 = this.f13180a.f13292b.f14462k;
        long j3 = this.f13180a.f13292b.f14461j;
        String str4 = this.f13180a.f13291a.f14410i;
        boolean z2 = this.f13180a.f13292b.f14458g;
        bbk bbk = this.f13180a.f13293c;
        long j4 = this.f13180a.f13292b.f14459h;
        zzjn zzjn2 = this.f13180a.f13294d;
        long j5 = j4;
        bbk bbk2 = bbk;
        long j6 = this.f13180a.f13292b.f14457f;
        long j7 = this.f13180a.f13296f;
        long j8 = this.f13180a.f13292b.f14464m;
        String str5 = this.f13180a.f13292b.f14465n;
        JSONObject jSONObject = this.f13180a.f13298h;
        zzaig zzaig = this.f13180a.f13292b.f14428A;
        List<String> list4 = this.f13180a.f13292b.f14429B;
        List<String> list5 = this.f13180a.f13292b.f14430C;
        boolean z3 = this.f13180a.f13292b.f14431D;
        zzael zzael = this.f13180a.f13292b.f14432E;
        JSONObject jSONObject2 = jSONObject;
        StringBuilder sb = new StringBuilder("");
        if (this.f13183d == null) {
            str3 = sb.toString();
            zzjn = zzjn2;
            z = z2;
            str2 = str5;
            j = j8;
        } else {
            Iterator it = this.f13183d.iterator();
            while (true) {
                int i4 = 1;
                zzjn = zzjn2;
                if (it.hasNext()) {
                    C3833gs gsVar = (C3833gs) it.next();
                    if (gsVar != null) {
                        Iterator it2 = it;
                        if (!TextUtils.isEmpty(gsVar.f13168a)) {
                            String str6 = gsVar.f13168a;
                            String str7 = str5;
                            switch (gsVar.f13169b) {
                                case 3:
                                    break;
                                case 4:
                                    i4 = 2;
                                    break;
                                case 5:
                                    i4 = 4;
                                    break;
                                case 6:
                                    j2 = j8;
                                    i2 = 0;
                                    break;
                                case 7:
                                    i4 = 3;
                                    break;
                                default:
                                    i4 = 6;
                                    break;
                            }
                            j2 = j8;
                            i2 = i4;
                            long j9 = gsVar.f13170c;
                            boolean z4 = z2;
                            StringBuilder sb2 = new StringBuilder(33 + String.valueOf(str6).length());
                            sb2.append(str6);
                            sb2.append(".");
                            sb2.append(i2);
                            sb2.append(".");
                            sb2.append(j9);
                            sb.append(String.valueOf(sb2.toString()).concat("_"));
                            zzjn2 = zzjn;
                            it = it2;
                            str5 = str7;
                            j8 = j2;
                            z2 = z4;
                        } else {
                            zzjn2 = zzjn;
                            it = it2;
                        }
                    } else {
                        zzjn2 = zzjn;
                    }
                } else {
                    z = z2;
                    str2 = str5;
                    j = j8;
                    str3 = sb.substring(0, Math.max(0, sb.length() - 1));
                }
            }
        }
        List<String> list6 = this.f13180a.f13292b.f14435H;
        String str8 = this.f13180a.f13292b.f14439L;
        amj amj = this.f13180a.f13299i;
        boolean z5 = this.f13180a.f13292b.f14442O;
        boolean z6 = this.f13180a.f13300j;
        boolean z7 = this.f13180a.f13292b.f14444Q;
        List<String> list7 = this.f13180a.f13292b.f14445R;
        boolean z8 = z7;
        JSONObject jSONObject3 = jSONObject2;
        boolean z9 = z6;
        zzjn zzjn3 = zzjn;
        int i5 = i;
        boolean z10 = z5;
        boolean z11 = z;
        amj amj2 = amj;
        String str9 = str2;
        bbj bbj2 = bbj;
        bbk bbk3 = bbk2;
        List<String> list8 = list6;
        String str10 = str;
        long j10 = j5;
        long j11 = j6;
        long j12 = j7;
        long j13 = j;
        List<String> list9 = list8;
        String str11 = str8;
        C3878ij ijVar = new C3878ij(zzjj, null, list, i5, list2, list3, i3, j3, str4, z11, bbj2, null, str10, bbk3, null, j10, zzjn3, j11, j12, j13, str9, jSONObject3, null, zzaig, list4, list5, z3, zzael, str3, list9, str11, amj2, z10, z9, z8, list7, this.f13180a.f13292b.f14446S, this.f13180a.f13292b.f14447T);
        return ijVar;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:93:0x016e */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12687a() {
        /*
            r20 = this;
            r11 = r20
            com.google.android.gms.internal.ads.ik r1 = r11.f13180a
            com.google.android.gms.internal.ads.bbk r1 = r1.f13293c
            java.util.List<com.google.android.gms.internal.ads.bbj> r1 = r1.f12563a
            java.util.Iterator r12 = r1.iterator()
        L_0x000c:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x00c9
            java.lang.Object r1 = r12.next()
            r13 = r1
            com.google.android.gms.internal.ads.bbj r13 = (com.google.android.gms.internal.ads.bbj) r13
            java.lang.String r14 = r13.f12552k
            java.util.List<java.lang.String> r1 = r13.f12544c
            java.util.Iterator r15 = r1.iterator()
        L_0x0021:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x000c
            java.lang.Object r1 = r15.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x0040
            java.lang.String r2 = "com.google.ads.mediation.customevent.CustomEventAdapter"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x003e
            goto L_0x0040
        L_0x003e:
            r3 = r1
            goto L_0x004c
        L_0x0040:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00bc }
            r1.<init>(r14)     // Catch:{ JSONException -> 0x00bc }
            java.lang.String r2 = "class_name"
            java.lang.String r1 = r1.getString(r2)     // Catch:{ JSONException -> 0x00bc }
            goto L_0x003e
        L_0x004c:
            java.lang.Object r9 = r11.f13185f
            monitor-enter(r9)
            com.google.android.gms.internal.ads.fq r1 = r11.f13186g     // Catch:{ all -> 0x00b4 }
            com.google.android.gms.internal.ads.he r7 = r1.mo15296a(r3)     // Catch:{ all -> 0x00b4 }
            if (r7 == 0) goto L_0x008c
            com.google.android.gms.internal.ads.gx r1 = r7.mo15362b()     // Catch:{ all -> 0x00b4 }
            if (r1 == 0) goto L_0x008c
            com.google.android.gms.internal.ads.bcd r1 = r7.mo15361a()     // Catch:{ all -> 0x00b4 }
            if (r1 != 0) goto L_0x0064
            goto L_0x008c
        L_0x0064:
            com.google.android.gms.internal.ads.gp r10 = new com.google.android.gms.internal.ads.gp     // Catch:{ all -> 0x00b4 }
            android.content.Context r2 = r11.f13181b     // Catch:{ all -> 0x00b4 }
            com.google.android.gms.internal.ads.ik r6 = r11.f13180a     // Catch:{ all -> 0x00b4 }
            long r4 = r11.f13187h     // Catch:{ all -> 0x00b4 }
            r1 = r10
            r16 = r4
            r4 = r14
            r5 = r13
            r8 = r11
            r18 = r9
            r19 = r12
            r12 = r10
            r9 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00ba }
            com.google.android.gms.internal.ads.fq r1 = r11.f13186g     // Catch:{ all -> 0x00ba }
            com.google.android.gms.ads.internal.gmsg.k r1 = r1.mo15295a()     // Catch:{ all -> 0x00ba }
            r12.mo15326a(r1)     // Catch:{ all -> 0x00ba }
            java.util.ArrayList<com.google.android.gms.internal.ads.gp> r1 = r11.f13182c     // Catch:{ all -> 0x00ba }
            r1.add(r12)     // Catch:{ all -> 0x00ba }
        L_0x008a:
            monitor-exit(r18)     // Catch:{ all -> 0x00ba }
            goto L_0x00c5
        L_0x008c:
            r18 = r9
            r19 = r12
            java.util.List<com.google.android.gms.internal.ads.gs> r1 = r11.f13183d     // Catch:{ all -> 0x00ba }
            com.google.android.gms.internal.ads.gu r2 = new com.google.android.gms.internal.ads.gu     // Catch:{ all -> 0x00ba }
            r2.<init>()     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = r13.f12545d     // Catch:{ all -> 0x00ba }
            com.google.android.gms.internal.ads.gu r2 = r2.mo15339b(r4)     // Catch:{ all -> 0x00ba }
            com.google.android.gms.internal.ads.gu r2 = r2.mo15338a(r3)     // Catch:{ all -> 0x00ba }
            r3 = 0
            com.google.android.gms.internal.ads.gu r2 = r2.mo15337a(r3)     // Catch:{ all -> 0x00ba }
            r3 = 7
            com.google.android.gms.internal.ads.gu r2 = r2.mo15336a(r3)     // Catch:{ all -> 0x00ba }
            com.google.android.gms.internal.ads.gs r2 = r2.mo15335a()     // Catch:{ all -> 0x00ba }
            r1.add(r2)     // Catch:{ all -> 0x00ba }
            goto L_0x008a
        L_0x00b4:
            r0 = move-exception
            r18 = r9
        L_0x00b7:
            r1 = r0
            monitor-exit(r18)     // Catch:{ all -> 0x00ba }
            throw r1
        L_0x00ba:
            r0 = move-exception
            goto L_0x00b7
        L_0x00bc:
            r0 = move-exception
            r19 = r12
            r1 = r0
            java.lang.String r2 = "Unable to determine custom event class name, skipping..."
            com.google.android.gms.internal.ads.C3900je.m17430b(r2, r1)
        L_0x00c5:
            r12 = r19
            goto L_0x0021
        L_0x00c9:
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList<com.google.android.gms.internal.ads.gp> r2 = r11.f13182c
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r3 = r2.size()
            r4 = 0
            r5 = r4
        L_0x00d8:
            if (r5 >= r3) goto L_0x00ee
            java.lang.Object r6 = r2.get(r5)
            int r5 = r5 + 1
            com.google.android.gms.internal.ads.gp r6 = (com.google.android.gms.internal.ads.C3830gp) r6
            java.lang.String r7 = r6.f13147a
            boolean r7 = r1.add(r7)
            if (r7 == 0) goto L_0x00d8
            r6.mo15329d()
            goto L_0x00d8
        L_0x00ee:
            java.util.ArrayList<com.google.android.gms.internal.ads.gp> r1 = r11.f13182c
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r2 = r1.size()
        L_0x00f6:
            if (r4 >= r2) goto L_0x01a9
            java.lang.Object r3 = r1.get(r4)
            int r4 = r4 + 1
            com.google.android.gms.internal.ads.gp r3 = (com.google.android.gms.internal.ads.C3830gp) r3
            java.util.concurrent.Future r5 = r3.mo15329d()     // Catch:{ InterruptedException -> 0x016e, Exception -> 0x014d }
            r5.get()     // Catch:{ InterruptedException -> 0x016e, Exception -> 0x014d }
            java.lang.Object r5 = r11.f13185f
            monitor-enter(r5)
            java.lang.String r6 = r3.f13147a     // Catch:{ all -> 0x0146 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0146 }
            if (r6 != 0) goto L_0x011b
            java.util.List<com.google.android.gms.internal.ads.gs> r6 = r11.f13183d     // Catch:{ all -> 0x0146 }
            com.google.android.gms.internal.ads.gs r7 = r3.mo15330e()     // Catch:{ all -> 0x0146 }
            r6.add(r7)     // Catch:{ all -> 0x0146 }
        L_0x011b:
            monitor-exit(r5)     // Catch:{ all -> 0x0146 }
            java.lang.Object r6 = r11.f13185f
            monitor-enter(r6)
            java.util.HashSet<java.lang.String> r5 = r11.f13184e     // Catch:{ all -> 0x0142 }
            java.lang.String r7 = r3.f13147a     // Catch:{ all -> 0x0142 }
            boolean r5 = r5.contains(r7)     // Catch:{ all -> 0x0142 }
            if (r5 == 0) goto L_0x0140
            java.lang.String r1 = r3.f13147a     // Catch:{ all -> 0x0142 }
            com.google.android.gms.internal.ads.bbj r2 = r3.mo15331f()     // Catch:{ all -> 0x0142 }
            r3 = -2
            com.google.android.gms.internal.ads.ij r1 = r11.m16824a(r3, r1, r2)     // Catch:{ all -> 0x0142 }
            android.os.Handler r2 = com.google.android.gms.internal.ads.C3975lz.f13539a     // Catch:{ all -> 0x0142 }
            com.google.android.gms.internal.ads.ha r3 = new com.google.android.gms.internal.ads.ha     // Catch:{ all -> 0x0142 }
            r3.<init>(r11, r1)     // Catch:{ all -> 0x0142 }
            r2.post(r3)     // Catch:{ all -> 0x0142 }
            monitor-exit(r6)     // Catch:{ all -> 0x0142 }
            return
        L_0x0140:
            monitor-exit(r6)     // Catch:{ all -> 0x0142 }
            goto L_0x00f6
        L_0x0142:
            r0 = move-exception
            r1 = r0
            monitor-exit(r6)     // Catch:{ all -> 0x0142 }
            throw r1
        L_0x0146:
            r0 = move-exception
            r1 = r0
            monitor-exit(r5)     // Catch:{ all -> 0x0146 }
            throw r1
        L_0x014a:
            r0 = move-exception
            r1 = r0
            goto L_0x018f
        L_0x014d:
            r0 = move-exception
            r5 = r0
            java.lang.String r6 = "Unable to resolve rewarded adapter."
            com.google.android.gms.internal.ads.C3900je.m17432c(r6, r5)     // Catch:{ all -> 0x014a }
            java.lang.Object r5 = r11.f13185f
            monitor-enter(r5)
            java.lang.String r6 = r3.f13147a     // Catch:{ all -> 0x016a }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x016a }
            if (r6 != 0) goto L_0x0168
            java.util.List<com.google.android.gms.internal.ads.gs> r6 = r11.f13183d     // Catch:{ all -> 0x016a }
            com.google.android.gms.internal.ads.gs r3 = r3.mo15330e()     // Catch:{ all -> 0x016a }
            r6.add(r3)     // Catch:{ all -> 0x016a }
        L_0x0168:
            monitor-exit(r5)     // Catch:{ all -> 0x016a }
            goto L_0x00f6
        L_0x016a:
            r0 = move-exception
            r1 = r0
            monitor-exit(r5)     // Catch:{ all -> 0x016a }
            throw r1
        L_0x016e:
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x014a }
            r1.interrupt()     // Catch:{ all -> 0x014a }
            java.lang.Object r1 = r11.f13185f
            monitor-enter(r1)
            java.lang.String r2 = r3.f13147a     // Catch:{ all -> 0x018b }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x018b }
            if (r2 != 0) goto L_0x0189
            java.util.List<com.google.android.gms.internal.ads.gs> r2 = r11.f13183d     // Catch:{ all -> 0x018b }
            com.google.android.gms.internal.ads.gs r3 = r3.mo15330e()     // Catch:{ all -> 0x018b }
            r2.add(r3)     // Catch:{ all -> 0x018b }
        L_0x0189:
            monitor-exit(r1)     // Catch:{ all -> 0x018b }
            goto L_0x01a9
        L_0x018b:
            r0 = move-exception
            r2 = r0
            monitor-exit(r1)     // Catch:{ all -> 0x018b }
            throw r2
        L_0x018f:
            java.lang.Object r2 = r11.f13185f
            monitor-enter(r2)
            java.lang.String r4 = r3.f13147a     // Catch:{ all -> 0x01a5 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x01a5 }
            if (r4 != 0) goto L_0x01a3
            java.util.List<com.google.android.gms.internal.ads.gs> r4 = r11.f13183d     // Catch:{ all -> 0x01a5 }
            com.google.android.gms.internal.ads.gs r3 = r3.mo15330e()     // Catch:{ all -> 0x01a5 }
            r4.add(r3)     // Catch:{ all -> 0x01a5 }
        L_0x01a3:
            monitor-exit(r2)     // Catch:{ all -> 0x01a5 }
            throw r1
        L_0x01a5:
            r0 = move-exception
            r1 = r0
            monitor-exit(r2)     // Catch:{ all -> 0x01a5 }
            throw r1
        L_0x01a9:
            r1 = 3
            r2 = 0
            com.google.android.gms.internal.ads.ij r1 = r11.m16824a(r1, r2, r2)
            android.os.Handler r2 = com.google.android.gms.internal.ads.C3975lz.f13539a
            com.google.android.gms.internal.ads.hb r3 = new com.google.android.gms.internal.ads.hb
            r3.<init>(r11, r1)
            r2.post(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3840gz.mo12687a():void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo15355a(C3878ij ijVar) {
        this.f13186g.mo15300b().mo12428b(ijVar);
    }

    /* renamed from: a */
    public final void mo15327a(String str) {
        synchronized (this.f13185f) {
            this.f13184e.add(str);
        }
    }

    /* renamed from: a */
    public final void mo15328a(String str, int i) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo15356b(C3878ij ijVar) {
        this.f13186g.mo15300b().mo12428b(ijVar);
    }

    /* renamed from: e_ */
    public final void mo12688e_() {
    }
}
