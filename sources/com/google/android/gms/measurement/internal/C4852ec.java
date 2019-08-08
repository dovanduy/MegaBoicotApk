package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.support.p017v4.p023d.C0376a;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.common.p140b.C3404c;
import com.google.android.gms.common.util.C3553e;
import com.google.android.gms.internal.p148e.C4644q;
import com.google.android.gms.internal.p148e.C4648u;
import com.google.android.gms.internal.p148e.C4649v;
import com.google.android.gms.internal.p148e.C4651x;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.measurement.internal.ec */
public class C4852ec implements C4789bu {

    /* renamed from: a */
    private static volatile C4852ec f15746a;

    /* renamed from: b */
    private C4758aq f15747b;

    /* renamed from: c */
    private C4897v f15748c;

    /* renamed from: d */
    private C4873ew f15749d;

    /* renamed from: e */
    private C4743ab f15750e;

    /* renamed from: f */
    private C4847dy f15751f;

    /* renamed from: g */
    private C4867eq f15752g;

    /* renamed from: h */
    private final C4859ei f15753h;

    /* renamed from: i */
    private C4808cm f15754i;

    /* renamed from: j */
    private final C4764aw f15755j;

    /* renamed from: k */
    private boolean f15756k;

    /* renamed from: l */
    private boolean f15757l;

    /* renamed from: m */
    private boolean f15758m;

    /* renamed from: n */
    private long f15759n;

    /* renamed from: o */
    private List<Runnable> f15760o;

    /* renamed from: p */
    private int f15761p;

    /* renamed from: q */
    private int f15762q;

    /* renamed from: r */
    private boolean f15763r;

    /* renamed from: s */
    private boolean f15764s;

    /* renamed from: t */
    private boolean f15765t;

    /* renamed from: u */
    private FileLock f15766u;

    /* renamed from: v */
    private FileChannel f15767v;

    /* renamed from: w */
    private List<Long> f15768w;

    /* renamed from: x */
    private List<Long> f15769x;

    /* renamed from: y */
    private long f15770y;

    /* renamed from: com.google.android.gms.measurement.internal.ec$a */
    class C4853a implements C4875ey {

        /* renamed from: a */
        C4651x f15771a;

        /* renamed from: b */
        List<Long> f15772b;

        /* renamed from: c */
        List<C4648u> f15773c;

        /* renamed from: d */
        private long f15774d;

        private C4853a() {
        }

        /* renamed from: a */
        public final void mo17463a(C4651x xVar) {
            C3513t.m12625a(xVar);
            this.f15771a = xVar;
        }

        /* renamed from: a */
        public final boolean mo17464a(long j, C4648u uVar) {
            C3513t.m12625a(uVar);
            if (this.f15773c == null) {
                this.f15773c = new ArrayList();
            }
            if (this.f15772b == null) {
                this.f15772b = new ArrayList();
            }
            if (this.f15773c.size() > 0 && m20914a((C4648u) this.f15773c.get(0)) != m20914a(uVar)) {
                return false;
            }
            long e = this.f15774d + ((long) uVar.mo16867e());
            if (e >= ((long) Math.max(0, ((Integer) C4882h.f15919q.mo17726b()).intValue()))) {
                return false;
            }
            this.f15774d = e;
            this.f15773c.add(uVar);
            this.f15772b.add(Long.valueOf(j));
            if (this.f15773c.size() >= Math.max(1, ((Integer) C4882h.f15920r.mo17726b()).intValue())) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        private static long m20914a(C4648u uVar) {
            return ((uVar.f15154c.longValue() / 1000) / 60) / 60;
        }

        /* synthetic */ C4853a(C4852ec ecVar, C4854ed edVar) {
            this();
        }
    }

    /* renamed from: a */
    public static C4852ec m20854a(Context context) {
        C3513t.m12625a(context);
        C3513t.m12625a(context.getApplicationContext());
        if (f15746a == null) {
            synchronized (C4852ec.class) {
                if (f15746a == null) {
                    f15746a = new C4852ec(new C4858eh(context));
                }
            }
        }
        return f15746a;
    }

    private C4852ec(C4858eh ehVar) {
        this(ehVar, null);
    }

    private C4852ec(C4858eh ehVar, C4764aw awVar) {
        this.f15756k = false;
        C3513t.m12625a(ehVar);
        this.f15755j = C4764aw.m20471a(ehVar.f15783a, (C4888m) null);
        this.f15770y = -1;
        C4859ei eiVar = new C4859ei(this);
        eiVar.mo17431v();
        this.f15753h = eiVar;
        C4897v vVar = new C4897v(this);
        vVar.mo17431v();
        this.f15748c = vVar;
        C4758aq aqVar = new C4758aq(this);
        aqVar.mo17431v();
        this.f15747b = aqVar;
        this.f15755j.mo17157q().mo17219a((Runnable) new C4854ed(this, ehVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m20859a(C4858eh ehVar) {
        this.f15755j.mo17157q().mo17144d();
        C4873ew ewVar = new C4873ew(this);
        ewVar.mo17431v();
        this.f15749d = ewVar;
        this.f15755j.mo17240b().mo17638a((C4872ev) this.f15747b);
        C4867eq eqVar = new C4867eq(this);
        eqVar.mo17431v();
        this.f15752g = eqVar;
        C4808cm cmVar = new C4808cm(this);
        cmVar.mo17431v();
        this.f15754i = cmVar;
        C4847dy dyVar = new C4847dy(this);
        dyVar.mo17431v();
        this.f15751f = dyVar;
        this.f15750e = new C4743ab(this);
        if (this.f15761p != this.f15762q) {
            this.f15755j.mo17158r().mo17761y_().mo17765a("Not all upload components initialized", Integer.valueOf(this.f15761p), Integer.valueOf(this.f15762q));
        }
        this.f15756k = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo17432a() {
        this.f15755j.mo17157q().mo17144d();
        mo17451d().mo17669B();
        if (this.f15755j.mo17241c().f15386c.mo17188a() == 0) {
            this.f15755j.mo17241c().f15386c.mo17189a(this.f15755j.mo17153m().mo13694a());
        }
        m20877z();
    }

    /* renamed from: u */
    public final C4868er mo17161u() {
        return this.f15755j.mo17161u();
    }

    /* renamed from: b */
    public final C4870et mo17444b() {
        return this.f15755j.mo17240b();
    }

    /* renamed from: r */
    public final C4893r mo17158r() {
        return this.f15755j.mo17158r();
    }

    /* renamed from: q */
    public final C4759ar mo17157q() {
        return this.f15755j.mo17157q();
    }

    /* renamed from: s */
    private final C4758aq m20871s() {
        m20868b((C4851eb) this.f15747b);
        return this.f15747b;
    }

    /* renamed from: c */
    public final C4897v mo17449c() {
        m20868b((C4851eb) this.f15748c);
        return this.f15748c;
    }

    /* renamed from: d */
    public final C4873ew mo17451d() {
        m20868b((C4851eb) this.f15749d);
        return this.f15749d;
    }

    /* renamed from: t */
    private final C4743ab m20872t() {
        if (this.f15750e != null) {
            return this.f15750e;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    /* renamed from: v */
    private final C4847dy m20873v() {
        m20868b((C4851eb) this.f15751f);
        return this.f15751f;
    }

    /* renamed from: e */
    public final C4867eq mo17453e() {
        m20868b((C4851eb) this.f15752g);
        return this.f15752g;
    }

    /* renamed from: f */
    public final C4808cm mo17454f() {
        m20868b((C4851eb) this.f15754i);
        return this.f15754i;
    }

    /* renamed from: g */
    public final C4859ei mo17455g() {
        m20868b((C4851eb) this.f15753h);
        return this.f15753h;
    }

    /* renamed from: h */
    public final C4891p mo17456h() {
        return this.f15755j.mo17249k();
    }

    /* renamed from: n */
    public final Context mo17154n() {
        return this.f15755j.mo17154n();
    }

    /* renamed from: m */
    public final C3553e mo17153m() {
        return this.f15755j.mo17153m();
    }

    /* renamed from: i */
    public final C4862el mo17457i() {
        return this.f15755j.mo17248j();
    }

    /* renamed from: w */
    private final void m20874w() {
        this.f15755j.mo17157q().mo17144d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final void mo17458j() {
        if (!this.f15756k) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    /* renamed from: b */
    private static void m20868b(C4851eb ebVar) {
        if (ebVar == null) {
            throw new IllegalStateException("Upload Component not created");
        } else if (!ebVar.mo17429j()) {
            String valueOf = String.valueOf(ebVar.getClass());
            StringBuilder sb = new StringBuilder(27 + String.valueOf(valueOf).length());
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo17438a(zzk zzk) {
        m20874w();
        mo17458j();
        C3513t.m12627a(zzk.f16003a);
        m20870e(zzk);
    }

    /* renamed from: x */
    private final long m20875x() {
        long a = this.f15755j.mo17153m().mo13694a();
        C4745ad c = this.f15755j.mo17241c();
        c.mo17300A();
        c.mo17144d();
        long a2 = c.f15390g.mo17188a();
        if (a2 == 0) {
            long nextInt = 1 + ((long) c.mo17156p().mo17504h().nextInt(86400000));
            c.f15390g.mo17189a(nextInt);
            a2 = nextInt;
        }
        return ((((a + a2) / 1000) / 60) / 60) / 24;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo17436a(zzag zzag, String str) {
        zzag zzag2 = zzag;
        String str2 = str;
        C4864en b = mo17451d().mo17693b(str2);
        if (b == null || TextUtils.isEmpty(b.mo17548j())) {
            this.f15755j.mo17158r().mo17758w().mo17764a("No app data available; dropping event", str2);
            return;
        }
        Boolean b2 = m20867b(b);
        if (b2 == null) {
            if (!"_ui".equals(zzag2.f15991a)) {
                this.f15755j.mo17158r().mo17754i().mo17764a("Could not find package. appId", C4893r.m21360a(str));
            }
        } else if (!b2.booleanValue()) {
            this.f15755j.mo17158r().mo17761y_().mo17764a("App version does not match; dropping event. appId", C4893r.m21360a(str));
            return;
        }
        zzk zzk = r2;
        zzk zzk2 = new zzk(str2, b.mo17531d(), b.mo17548j(), b.mo17550k(), b.mo17552l(), b.mo17554m(), b.mo17556n(), (String) null, b.mo17559o(), false, b.mo17540g(), b.mo17516B(), 0, 0, b.mo17517C(), b.mo17518D(), false, b.mo17534e());
        mo17435a(zzag2, zzk);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo17435a(zzag zzag, zzk zzk) {
        List<zzo> list;
        List<zzo> list2;
        List list3;
        zzag zzag2 = zzag;
        zzk zzk2 = zzk;
        C3513t.m12625a(zzk);
        C3513t.m12627a(zzk2.f16003a);
        m20874w();
        mo17458j();
        String str = zzk2.f16003a;
        long j = zzag2.f15994d;
        if (mo17455g().mo17474a(zzag2, zzk2)) {
            if (!zzk2.f16010h) {
                m20870e(zzk2);
                return;
            }
            mo17451d().mo17704f();
            try {
                C4873ew d = mo17451d();
                C3513t.m12627a(str);
                d.mo17144d();
                d.mo17430k();
                if (j < 0) {
                    d.mo17158r().mo17754i().mo17765a("Invalid time querying timed out conditional properties", C4893r.m21360a(str), Long.valueOf(j));
                    list = Collections.emptyList();
                } else {
                    list = d.mo17683a("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str, String.valueOf(j)});
                }
                for (zzo zzo : list) {
                    if (zzo != null) {
                        this.f15755j.mo17158r().mo17758w().mo17766a("User property timed out", zzo.f16021a, this.f15755j.mo17249k().mo17748c(zzo.f16023c.f15995a), zzo.f16023c.mo17782a());
                        if (zzo.f16027g != null) {
                            m20869b(new zzag(zzo.f16027g, j), zzk2);
                        }
                        mo17451d().mo17700e(str, zzo.f16023c.f15995a);
                    }
                }
                C4873ew d2 = mo17451d();
                C3513t.m12627a(str);
                d2.mo17144d();
                d2.mo17430k();
                if (j < 0) {
                    d2.mo17158r().mo17754i().mo17765a("Invalid time querying expired conditional properties", C4893r.m21360a(str), Long.valueOf(j));
                    list2 = Collections.emptyList();
                } else {
                    list2 = d2.mo17683a("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str, String.valueOf(j)});
                }
                ArrayList arrayList = new ArrayList(list2.size());
                for (zzo zzo2 : list2) {
                    if (zzo2 != null) {
                        this.f15755j.mo17158r().mo17758w().mo17766a("User property expired", zzo2.f16021a, this.f15755j.mo17249k().mo17748c(zzo2.f16023c.f15995a), zzo2.f16023c.mo17782a());
                        mo17451d().mo17695b(str, zzo2.f16023c.f15995a);
                        if (zzo2.f16031k != null) {
                            arrayList.add(zzo2.f16031k);
                        }
                        mo17451d().mo17700e(str, zzo2.f16023c.f15995a);
                    }
                }
                ArrayList arrayList2 = arrayList;
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    m20869b(new zzag((zzag) obj, j), zzk2);
                }
                C4873ew d3 = mo17451d();
                String str2 = zzag2.f15991a;
                C3513t.m12627a(str);
                C3513t.m12627a(str2);
                d3.mo17144d();
                d3.mo17430k();
                if (j < 0) {
                    d3.mo17158r().mo17754i().mo17766a("Invalid time querying triggered conditional properties", C4893r.m21360a(str), d3.mo17155o().mo17746a(str2), Long.valueOf(j));
                    list3 = Collections.emptyList();
                } else {
                    list3 = d3.mo17683a("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str, str2, String.valueOf(j)});
                }
                ArrayList arrayList3 = new ArrayList(list3.size());
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    zzo zzo3 = (zzo) it.next();
                    if (zzo3 != null) {
                        zzfv zzfv = zzo3.f16023c;
                        C4861ek ekVar = r5;
                        Iterator it2 = it;
                        zzo zzo4 = zzo3;
                        C4861ek ekVar2 = new C4861ek(zzo3.f16021a, zzo3.f16022b, zzfv.f15995a, j, zzfv.mo17782a());
                        if (mo17451d().mo17690a(ekVar)) {
                            this.f15755j.mo17158r().mo17758w().mo17766a("User property triggered", zzo4.f16021a, this.f15755j.mo17249k().mo17748c(ekVar.f15786c), ekVar.f15788e);
                        } else {
                            this.f15755j.mo17158r().mo17761y_().mo17766a("Too many active user properties, ignoring", C4893r.m21360a(zzo4.f16021a), this.f15755j.mo17249k().mo17748c(ekVar.f15786c), ekVar.f15788e);
                        }
                        if (zzo4.f16029i != null) {
                            arrayList3.add(zzo4.f16029i);
                        }
                        zzo4.f16023c = new zzfv(ekVar);
                        zzo4.f16025e = true;
                        mo17451d().mo17691a(zzo4);
                        it = it2;
                    }
                }
                m20869b(zzag, zzk);
                ArrayList arrayList4 = arrayList3;
                int size2 = arrayList4.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayList4.get(i2);
                    i2++;
                    m20869b(new zzag((zzag) obj2, j), zzk2);
                }
                mo17451d().mo17707w();
                mo17451d().mo17708x();
            } catch (Throwable th) {
                Throwable th2 = th;
                mo17451d().mo17708x();
                throw th2;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0339  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x07b4 A[Catch:{ IOException -> 0x07b7, all -> 0x0828 }] */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x07e2 A[Catch:{ IOException -> 0x07b7, all -> 0x0828 }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x027e A[Catch:{ IOException -> 0x07b7, all -> 0x0828 }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x02b8 A[Catch:{ IOException -> 0x07b7, all -> 0x0828 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x030c A[Catch:{ IOException -> 0x07b7, all -> 0x0828 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m20869b(com.google.android.gms.measurement.internal.zzag r25, com.google.android.gms.measurement.internal.zzk r26) {
        /*
            r24 = this;
            r1 = r24
            r2 = r25
            r3 = r26
            com.google.android.gms.common.internal.C3513t.m12625a(r26)
            java.lang.String r4 = r3.f16003a
            com.google.android.gms.common.internal.C3513t.m12627a(r4)
            long r4 = java.lang.System.nanoTime()
            r24.m20874w()
            r24.mo17458j()
            java.lang.String r15 = r3.f16003a
            com.google.android.gms.measurement.internal.ei r6 = r24.mo17455g()
            boolean r6 = r6.mo17474a(r2, r3)
            if (r6 != 0) goto L_0x0025
            return
        L_0x0025:
            boolean r6 = r3.f16010h
            if (r6 != 0) goto L_0x002d
            r1.m20870e(r3)
            return
        L_0x002d:
            com.google.android.gms.measurement.internal.aq r6 = r24.m20871s()
            java.lang.String r7 = r2.f15991a
            boolean r6 = r6.mo17206b(r15, r7)
            if (r6 == 0) goto L_0x00d8
            com.google.android.gms.measurement.internal.aw r3 = r1.f15755j
            com.google.android.gms.measurement.internal.r r3 = r3.mo17158r()
            com.google.android.gms.measurement.internal.t r3 = r3.mo17754i()
            java.lang.String r4 = "Dropping blacklisted event. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C4893r.m21360a(r15)
            com.google.android.gms.measurement.internal.aw r6 = r1.f15755j
            com.google.android.gms.measurement.internal.p r6 = r6.mo17249k()
            java.lang.String r7 = r2.f15991a
            java.lang.String r6 = r6.mo17746a(r7)
            r3.mo17765a(r4, r5, r6)
            com.google.android.gms.measurement.internal.aq r3 = r24.m20871s()
            boolean r3 = r3.mo17213f(r15)
            if (r3 != 0) goto L_0x006f
            com.google.android.gms.measurement.internal.aq r3 = r24.m20871s()
            boolean r3 = r3.mo17215g(r15)
            if (r3 == 0) goto L_0x006d
            goto L_0x006f
        L_0x006d:
            r13 = 0
            goto L_0x0070
        L_0x006f:
            r13 = 1
        L_0x0070:
            if (r13 != 0) goto L_0x008d
            java.lang.String r3 = "_err"
            java.lang.String r4 = r2.f15991a
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x008d
            com.google.android.gms.measurement.internal.aw r3 = r1.f15755j
            com.google.android.gms.measurement.internal.el r6 = r3.mo17248j()
            r8 = 11
            java.lang.String r9 = "_ev"
            java.lang.String r10 = r2.f15991a
            r11 = 0
            r7 = r15
            r6.mo17492a(r7, r8, r9, r10, r11)
        L_0x008d:
            if (r13 == 0) goto L_0x00d7
            com.google.android.gms.measurement.internal.ew r2 = r24.mo17451d()
            com.google.android.gms.measurement.internal.en r2 = r2.mo17693b(r15)
            if (r2 == 0) goto L_0x00d7
            long r3 = r2.mo17562r()
            long r5 = r2.mo17561q()
            long r3 = java.lang.Math.max(r3, r5)
            com.google.android.gms.measurement.internal.aw r5 = r1.f15755j
            com.google.android.gms.common.util.e r5 = r5.mo17153m()
            long r5 = r5.mo13694a()
            long r7 = r5 - r3
            long r3 = java.lang.Math.abs(r7)
            com.google.android.gms.measurement.internal.h$a<java.lang.Long> r5 = com.google.android.gms.measurement.internal.C4882h.f15857H
            java.lang.Object r5 = r5.mo17726b()
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x00d7
            com.google.android.gms.measurement.internal.aw r3 = r1.f15755j
            com.google.android.gms.measurement.internal.r r3 = r3.mo17158r()
            com.google.android.gms.measurement.internal.t r3 = r3.mo17758w()
            java.lang.String r4 = "Fetching config for blacklisted app"
            r3.mo17763a(r4)
            r1.m20860a(r2)
        L_0x00d7:
            return
        L_0x00d8:
            com.google.android.gms.measurement.internal.aw r6 = r1.f15755j
            com.google.android.gms.measurement.internal.r r6 = r6.mo17158r()
            r12 = 2
            boolean r6 = r6.mo17751a(r12)
            if (r6 == 0) goto L_0x00fe
            com.google.android.gms.measurement.internal.aw r6 = r1.f15755j
            com.google.android.gms.measurement.internal.r r6 = r6.mo17158r()
            com.google.android.gms.measurement.internal.t r6 = r6.mo17759x()
            java.lang.String r7 = "Logging event"
            com.google.android.gms.measurement.internal.aw r8 = r1.f15755j
            com.google.android.gms.measurement.internal.p r8 = r8.mo17249k()
            java.lang.String r8 = r8.mo17745a(r2)
            r6.mo17764a(r7, r8)
        L_0x00fe:
            com.google.android.gms.measurement.internal.ew r6 = r24.mo17451d()
            r6.mo17704f()
            r1.m20870e(r3)     // Catch:{ all -> 0x0828 }
            java.lang.String r6 = "_iap"
            java.lang.String r7 = r2.f15991a     // Catch:{ all -> 0x0828 }
            boolean r6 = r6.equals(r7)     // Catch:{ all -> 0x0828 }
            if (r6 != 0) goto L_0x0124
            java.lang.String r6 = "ecommerce_purchase"
            java.lang.String r7 = r2.f15991a     // Catch:{ all -> 0x0828 }
            boolean r6 = r6.equals(r7)     // Catch:{ all -> 0x0828 }
            if (r6 == 0) goto L_0x011d
            goto L_0x0124
        L_0x011d:
            r14 = r12
            r16 = 0
            r17 = 1
            goto L_0x02c7
        L_0x0124:
            com.google.android.gms.measurement.internal.zzad r6 = r2.f15992b     // Catch:{ all -> 0x0828 }
            java.lang.String r7 = "currency"
            java.lang.String r6 = r6.mo17776d(r7)     // Catch:{ all -> 0x0828 }
            java.lang.String r7 = "ecommerce_purchase"
            java.lang.String r8 = r2.f15991a     // Catch:{ all -> 0x0828 }
            boolean r7 = r7.equals(r8)     // Catch:{ all -> 0x0828 }
            if (r7 == 0) goto L_0x018c
            com.google.android.gms.measurement.internal.zzad r7 = r2.f15992b     // Catch:{ all -> 0x0828 }
            java.lang.String r8 = "value"
            java.lang.Double r7 = r7.mo17775c(r8)     // Catch:{ all -> 0x0828 }
            double r7 = r7.doubleValue()     // Catch:{ all -> 0x0828 }
            r9 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r7 = r7 * r9
            r16 = 0
            int r11 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r11 != 0) goto L_0x015c
            com.google.android.gms.measurement.internal.zzad r7 = r2.f15992b     // Catch:{ all -> 0x0828 }
            java.lang.String r8 = "value"
            java.lang.Long r7 = r7.mo17774b(r8)     // Catch:{ all -> 0x0828 }
            long r7 = r7.longValue()     // Catch:{ all -> 0x0828 }
            double r7 = (double) r7     // Catch:{ all -> 0x0828 }
            double r7 = r7 * r9
        L_0x015c:
            r9 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 > 0) goto L_0x016d
            r9 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x016d
            long r7 = java.lang.Math.round(r7)     // Catch:{ all -> 0x0828 }
            goto L_0x0198
        L_0x016d:
            com.google.android.gms.measurement.internal.aw r6 = r1.f15755j     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.r r6 = r6.mo17158r()     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.t r6 = r6.mo17754i()     // Catch:{ all -> 0x0828 }
            java.lang.String r9 = "Data lost. Currency value is too big. appId"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.C4893r.m21360a(r15)     // Catch:{ all -> 0x0828 }
            java.lang.Double r7 = java.lang.Double.valueOf(r7)     // Catch:{ all -> 0x0828 }
            r6.mo17765a(r9, r10, r7)     // Catch:{ all -> 0x0828 }
            r14 = r12
            r6 = 0
            r16 = 0
            r17 = 1
            goto L_0x02b6
        L_0x018c:
            com.google.android.gms.measurement.internal.zzad r7 = r2.f15992b     // Catch:{ all -> 0x0828 }
            java.lang.String r8 = "value"
            java.lang.Long r7 = r7.mo17774b(r8)     // Catch:{ all -> 0x0828 }
            long r7 = r7.longValue()     // Catch:{ all -> 0x0828 }
        L_0x0198:
            boolean r9 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0828 }
            if (r9 != 0) goto L_0x02af
            java.util.Locale r9 = java.util.Locale.US     // Catch:{ all -> 0x0828 }
            java.lang.String r6 = r6.toUpperCase(r9)     // Catch:{ all -> 0x0828 }
            java.lang.String r9 = "[A-Z]{3}"
            boolean r9 = r6.matches(r9)     // Catch:{ all -> 0x0828 }
            if (r9 == 0) goto L_0x02af
            java.lang.String r9 = "_ltv_"
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x0828 }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0828 }
            int r10 = r6.length()     // Catch:{ all -> 0x0828 }
            if (r10 == 0) goto L_0x01c2
            java.lang.String r6 = r9.concat(r6)     // Catch:{ all -> 0x0828 }
        L_0x01c0:
            r9 = r6
            goto L_0x01c8
        L_0x01c2:
            java.lang.String r6 = new java.lang.String     // Catch:{ all -> 0x0828 }
            r6.<init>(r9)     // Catch:{ all -> 0x0828 }
            goto L_0x01c0
        L_0x01c8:
            com.google.android.gms.measurement.internal.ew r6 = r24.mo17451d()     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.ek r6 = r6.mo17697c(r15, r9)     // Catch:{ all -> 0x0828 }
            if (r6 == 0) goto L_0x0207
            java.lang.Object r10 = r6.f15788e     // Catch:{ all -> 0x0828 }
            boolean r10 = r10 instanceof java.lang.Long     // Catch:{ all -> 0x0828 }
            if (r10 != 0) goto L_0x01d9
            goto L_0x0207
        L_0x01d9:
            java.lang.Object r6 = r6.f15788e     // Catch:{ all -> 0x0828 }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ all -> 0x0828 }
            long r10 = r6.longValue()     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.ek r16 = new com.google.android.gms.measurement.internal.ek     // Catch:{ all -> 0x0828 }
            java.lang.String r6 = r2.f15993c     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.aw r12 = r1.f15755j     // Catch:{ all -> 0x0828 }
            com.google.android.gms.common.util.e r12 = r12.mo17153m()     // Catch:{ all -> 0x0828 }
            long r17 = r12.mo13694a()     // Catch:{ all -> 0x0828 }
            long r13 = r10 + r7
            java.lang.Long r12 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0828 }
            r8 = r6
            r6 = r16
            r7 = r15
            r10 = r17
            r14 = 2
            r6.<init>(r7, r8, r9, r10, r12)     // Catch:{ all -> 0x0828 }
            r13 = r16
            r16 = 0
            r17 = 1
            goto L_0x0274
        L_0x0207:
            r14 = r12
            com.google.android.gms.measurement.internal.ew r6 = r24.mo17451d()     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.aw r10 = r1.f15755j     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.et r10 = r10.mo17240b()     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.h$a<java.lang.Integer> r11 = com.google.android.gms.measurement.internal.C4882h.f15862M     // Catch:{ all -> 0x0828 }
            int r10 = r10.mo17640b(r15, r11)     // Catch:{ all -> 0x0828 }
            r11 = 1
            int r10 = r10 - r11
            com.google.android.gms.common.internal.C3513t.m12627a(r15)     // Catch:{ all -> 0x0828 }
            r6.mo17144d()     // Catch:{ all -> 0x0828 }
            r6.mo17430k()     // Catch:{ all -> 0x0828 }
            android.database.sqlite.SQLiteDatabase r11 = r6.mo17709y()     // Catch:{ SQLiteException -> 0x0242 }
            java.lang.String r12 = "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);"
            r13 = 3
            java.lang.String[] r13 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x0242 }
            r16 = 0
            r13[r16] = r15     // Catch:{ SQLiteException -> 0x0240 }
            r17 = 1
            r13[r17] = r15     // Catch:{ SQLiteException -> 0x023e }
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ SQLiteException -> 0x023e }
            r13[r14] = r10     // Catch:{ SQLiteException -> 0x023e }
            r11.execSQL(r12, r13)     // Catch:{ SQLiteException -> 0x023e }
            goto L_0x0259
        L_0x023e:
            r0 = move-exception
            goto L_0x0247
        L_0x0240:
            r0 = move-exception
            goto L_0x0245
        L_0x0242:
            r0 = move-exception
            r16 = 0
        L_0x0245:
            r17 = 1
        L_0x0247:
            r10 = r0
            com.google.android.gms.measurement.internal.r r6 = r6.mo17158r()     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.t r6 = r6.mo17761y_()     // Catch:{ all -> 0x0828 }
            java.lang.String r11 = "Error pruning currencies. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C4893r.m21360a(r15)     // Catch:{ all -> 0x0828 }
            r6.mo17765a(r11, r12, r10)     // Catch:{ all -> 0x0828 }
        L_0x0259:
            com.google.android.gms.measurement.internal.ek r13 = new com.google.android.gms.measurement.internal.ek     // Catch:{ all -> 0x0828 }
            java.lang.String r10 = r2.f15993c     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.aw r6 = r1.f15755j     // Catch:{ all -> 0x0828 }
            com.google.android.gms.common.util.e r6 = r6.mo17153m()     // Catch:{ all -> 0x0828 }
            long r11 = r6.mo13694a()     // Catch:{ all -> 0x0828 }
            java.lang.Long r18 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0828 }
            r6 = r13
            r7 = r15
            r8 = r10
            r10 = r11
            r12 = r18
            r6.<init>(r7, r8, r9, r10, r12)     // Catch:{ all -> 0x0828 }
        L_0x0274:
            com.google.android.gms.measurement.internal.ew r6 = r24.mo17451d()     // Catch:{ all -> 0x0828 }
            boolean r6 = r6.mo17690a(r13)     // Catch:{ all -> 0x0828 }
            if (r6 != 0) goto L_0x02b4
            com.google.android.gms.measurement.internal.aw r6 = r1.f15755j     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.r r6 = r6.mo17158r()     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.t r6 = r6.mo17761y_()     // Catch:{ all -> 0x0828 }
            java.lang.String r7 = "Too many unique user properties are set. Ignoring user property. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C4893r.m21360a(r15)     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.aw r9 = r1.f15755j     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.p r9 = r9.mo17249k()     // Catch:{ all -> 0x0828 }
            java.lang.String r10 = r13.f15786c     // Catch:{ all -> 0x0828 }
            java.lang.String r9 = r9.mo17748c(r10)     // Catch:{ all -> 0x0828 }
            java.lang.Object r10 = r13.f15788e     // Catch:{ all -> 0x0828 }
            r6.mo17766a(r7, r8, r9, r10)     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.aw r6 = r1.f15755j     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.el r6 = r6.mo17248j()     // Catch:{ all -> 0x0828 }
            r8 = 9
            r9 = 0
            r10 = 0
            r11 = 0
            r7 = r15
            r6.mo17492a(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0828 }
            goto L_0x02b4
        L_0x02af:
            r14 = r12
            r16 = 0
            r17 = 1
        L_0x02b4:
            r6 = r17
        L_0x02b6:
            if (r6 != 0) goto L_0x02c7
            com.google.android.gms.measurement.internal.ew r2 = r24.mo17451d()     // Catch:{ all -> 0x0828 }
            r2.mo17707w()     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.ew r2 = r24.mo17451d()
            r2.mo17708x()
            return
        L_0x02c7:
            java.lang.String r6 = r2.f15991a     // Catch:{ all -> 0x0828 }
            boolean r18 = com.google.android.gms.measurement.internal.C4862el.m20968a(r6)     // Catch:{ all -> 0x0828 }
            java.lang.String r6 = "_err"
            java.lang.String r7 = r2.f15991a     // Catch:{ all -> 0x0828 }
            boolean r19 = r6.equals(r7)     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.ew r6 = r24.mo17451d()     // Catch:{ all -> 0x0828 }
            long r7 = r24.m20875x()     // Catch:{ all -> 0x0828 }
            r10 = 1
            r12 = 0
            r20 = 0
            r9 = r15
            r11 = r18
            r13 = r19
            r21 = r4
            r5 = r14
            r4 = r16
            r14 = r20
            com.google.android.gms.measurement.internal.ex r6 = r6.mo17678a(r7, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0828 }
            long r7 = r6.f15839b     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.h$a<java.lang.Integer> r9 = com.google.android.gms.measurement.internal.C4882h.f15921s     // Catch:{ all -> 0x0828 }
            java.lang.Object r9 = r9.mo17726b()     // Catch:{ all -> 0x0828 }
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch:{ all -> 0x0828 }
            int r9 = r9.intValue()     // Catch:{ all -> 0x0828 }
            long r9 = (long) r9     // Catch:{ all -> 0x0828 }
            long r11 = r7 - r9
            r13 = 0
            int r7 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            r8 = 1000(0x3e8, double:4.94E-321)
            r4 = 1
            if (r7 <= 0) goto L_0x0339
            long r11 = r11 % r8
            int r2 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x032a
            com.google.android.gms.measurement.internal.aw r2 = r1.f15755j     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.r r2 = r2.mo17158r()     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.t r2 = r2.mo17761y_()     // Catch:{ all -> 0x0828 }
            java.lang.String r3 = "Data loss. Too many events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4893r.m21360a(r15)     // Catch:{ all -> 0x0828 }
            long r5 = r6.f15839b     // Catch:{ all -> 0x0828 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0828 }
            r2.mo17765a(r3, r4, r5)     // Catch:{ all -> 0x0828 }
        L_0x032a:
            com.google.android.gms.measurement.internal.ew r2 = r24.mo17451d()     // Catch:{ all -> 0x0828 }
            r2.mo17707w()     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.ew r2 = r24.mo17451d()
            r2.mo17708x()
            return
        L_0x0339:
            if (r18 == 0) goto L_0x0391
            long r10 = r6.f15838a     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.h$a<java.lang.Integer> r7 = com.google.android.gms.measurement.internal.C4882h.f15923u     // Catch:{ all -> 0x0828 }
            java.lang.Object r7 = r7.mo17726b()     // Catch:{ all -> 0x0828 }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ all -> 0x0828 }
            int r7 = r7.intValue()     // Catch:{ all -> 0x0828 }
            long r4 = (long) r7     // Catch:{ all -> 0x0828 }
            long r16 = r10 - r4
            int r4 = (r16 > r13 ? 1 : (r16 == r13 ? 0 : -1))
            if (r4 <= 0) goto L_0x0391
            long r16 = r16 % r8
            r3 = 1
            int r5 = (r16 > r3 ? 1 : (r16 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0371
            com.google.android.gms.measurement.internal.aw r3 = r1.f15755j     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.r r3 = r3.mo17158r()     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.t r3 = r3.mo17761y_()     // Catch:{ all -> 0x0828 }
            java.lang.String r4 = "Data loss. Too many public events logged. appId, count"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C4893r.m21360a(r15)     // Catch:{ all -> 0x0828 }
            long r6 = r6.f15838a     // Catch:{ all -> 0x0828 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0828 }
            r3.mo17765a(r4, r5, r6)     // Catch:{ all -> 0x0828 }
        L_0x0371:
            com.google.android.gms.measurement.internal.aw r3 = r1.f15755j     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.el r6 = r3.mo17248j()     // Catch:{ all -> 0x0828 }
            r8 = 16
            java.lang.String r9 = "_ev"
            java.lang.String r10 = r2.f15991a     // Catch:{ all -> 0x0828 }
            r11 = 0
            r7 = r15
            r6.mo17492a(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.ew r2 = r24.mo17451d()     // Catch:{ all -> 0x0828 }
            r2.mo17707w()     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.ew r2 = r24.mo17451d()
            r2.mo17708x()
            return
        L_0x0391:
            if (r19 == 0) goto L_0x03e4
            long r4 = r6.f15841d     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.aw r7 = r1.f15755j     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.et r7 = r7.mo17240b()     // Catch:{ all -> 0x0828 }
            java.lang.String r8 = r3.f16003a     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.h$a<java.lang.Integer> r9 = com.google.android.gms.measurement.internal.C4882h.f15922t     // Catch:{ all -> 0x0828 }
            int r7 = r7.mo17640b(r8, r9)     // Catch:{ all -> 0x0828 }
            r8 = 1000000(0xf4240, float:1.401298E-39)
            int r7 = java.lang.Math.min(r8, r7)     // Catch:{ all -> 0x0828 }
            r11 = 0
            int r7 = java.lang.Math.max(r11, r7)     // Catch:{ all -> 0x0828 }
            long r7 = (long) r7     // Catch:{ all -> 0x0828 }
            long r9 = r4 - r7
            int r4 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r4 <= 0) goto L_0x03e5
            r4 = 1
            int r2 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x03d5
            com.google.android.gms.measurement.internal.aw r2 = r1.f15755j     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.r r2 = r2.mo17158r()     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.t r2 = r2.mo17761y_()     // Catch:{ all -> 0x0828 }
            java.lang.String r3 = "Too many error events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4893r.m21360a(r15)     // Catch:{ all -> 0x0828 }
            long r5 = r6.f15841d     // Catch:{ all -> 0x0828 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0828 }
            r2.mo17765a(r3, r4, r5)     // Catch:{ all -> 0x0828 }
        L_0x03d5:
            com.google.android.gms.measurement.internal.ew r2 = r24.mo17451d()     // Catch:{ all -> 0x0828 }
            r2.mo17707w()     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.ew r2 = r24.mo17451d()
            r2.mo17708x()
            return
        L_0x03e4:
            r11 = 0
        L_0x03e5:
            com.google.android.gms.measurement.internal.zzad r4 = r2.f15992b     // Catch:{ all -> 0x0828 }
            android.os.Bundle r4 = r4.mo17773b()     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.aw r5 = r1.f15755j     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.el r5 = r5.mo17248j()     // Catch:{ all -> 0x0828 }
            java.lang.String r6 = "_o"
            java.lang.String r7 = r2.f15993c     // Catch:{ all -> 0x0828 }
            r5.mo17491a(r4, r6, r7)     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.aw r5 = r1.f15755j     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.el r5 = r5.mo17248j()     // Catch:{ all -> 0x0828 }
            boolean r5 = r5.mo17502f(r15)     // Catch:{ all -> 0x0828 }
            if (r5 == 0) goto L_0x0424
            com.google.android.gms.measurement.internal.aw r5 = r1.f15755j     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.el r5 = r5.mo17248j()     // Catch:{ all -> 0x0828 }
            java.lang.String r6 = "_dbg"
            r7 = 1
            java.lang.Long r9 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0828 }
            r5.mo17491a(r4, r6, r9)     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.aw r5 = r1.f15755j     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.el r5 = r5.mo17248j()     // Catch:{ all -> 0x0828 }
            java.lang.String r6 = "_r"
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0828 }
            r5.mo17491a(r4, r6, r7)     // Catch:{ all -> 0x0828 }
        L_0x0424:
            com.google.android.gms.measurement.internal.aw r5 = r1.f15755j     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.et r5 = r5.mo17240b()     // Catch:{ all -> 0x0828 }
            java.lang.String r6 = r3.f16003a     // Catch:{ all -> 0x0828 }
            boolean r5 = r5.mo17662q(r6)     // Catch:{ all -> 0x0828 }
            if (r5 == 0) goto L_0x045d
            java.lang.String r5 = "_s"
            java.lang.String r6 = r2.f15991a     // Catch:{ all -> 0x0828 }
            boolean r5 = r5.equals(r6)     // Catch:{ all -> 0x0828 }
            if (r5 == 0) goto L_0x045d
            com.google.android.gms.measurement.internal.ew r5 = r24.mo17451d()     // Catch:{ all -> 0x0828 }
            java.lang.String r6 = r3.f16003a     // Catch:{ all -> 0x0828 }
            java.lang.String r7 = "_sno"
            com.google.android.gms.measurement.internal.ek r5 = r5.mo17697c(r6, r7)     // Catch:{ all -> 0x0828 }
            if (r5 == 0) goto L_0x045d
            java.lang.Object r6 = r5.f15788e     // Catch:{ all -> 0x0828 }
            boolean r6 = r6 instanceof java.lang.Long     // Catch:{ all -> 0x0828 }
            if (r6 == 0) goto L_0x045d
            com.google.android.gms.measurement.internal.aw r6 = r1.f15755j     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.el r6 = r6.mo17248j()     // Catch:{ all -> 0x0828 }
            java.lang.String r7 = "_sno"
            java.lang.Object r5 = r5.f15788e     // Catch:{ all -> 0x0828 }
            r6.mo17491a(r4, r7, r5)     // Catch:{ all -> 0x0828 }
        L_0x045d:
            com.google.android.gms.measurement.internal.ew r5 = r24.mo17451d()     // Catch:{ all -> 0x0828 }
            long r5 = r5.mo17696c(r15)     // Catch:{ all -> 0x0828 }
            int r7 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r7 <= 0) goto L_0x0480
            com.google.android.gms.measurement.internal.aw r7 = r1.f15755j     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.r r7 = r7.mo17158r()     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.t r7 = r7.mo17754i()     // Catch:{ all -> 0x0828 }
            java.lang.String r8 = "Data lost. Too many events stored on disk, deleted. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C4893r.m21360a(r15)     // Catch:{ all -> 0x0828 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0828 }
            r7.mo17765a(r8, r9, r5)     // Catch:{ all -> 0x0828 }
        L_0x0480:
            com.google.android.gms.measurement.internal.c r5 = new com.google.android.gms.measurement.internal.c     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.aw r7 = r1.f15755j     // Catch:{ all -> 0x0828 }
            java.lang.String r8 = r2.f15993c     // Catch:{ all -> 0x0828 }
            java.lang.String r10 = r2.f15991a     // Catch:{ all -> 0x0828 }
            long r11 = r2.f15994d     // Catch:{ all -> 0x0828 }
            r16 = 0
            r6 = r5
            r9 = r15
            r2 = 0
            r13 = r16
            r2 = r15
            r15 = r4
            r6.<init>(r7, r8, r9, r10, r11, r13, r15)     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.ew r4 = r24.mo17451d()     // Catch:{ all -> 0x0828 }
            java.lang.String r6 = r5.f15573b     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.d r4 = r4.mo17677a(r2, r6)     // Catch:{ all -> 0x0828 }
            if (r4 != 0) goto L_0x0508
            com.google.android.gms.measurement.internal.ew r4 = r24.mo17451d()     // Catch:{ all -> 0x0828 }
            long r6 = r4.mo17702f(r2)     // Catch:{ all -> 0x0828 }
            r8 = 500(0x1f4, double:2.47E-321)
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 < 0) goto L_0x04ee
            if (r18 == 0) goto L_0x04ee
            com.google.android.gms.measurement.internal.aw r3 = r1.f15755j     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.r r3 = r3.mo17158r()     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.t r3 = r3.mo17761y_()     // Catch:{ all -> 0x0828 }
            java.lang.String r4 = "Too many event names used, ignoring event. appId, name, supported count"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C4893r.m21360a(r2)     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.aw r7 = r1.f15755j     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.p r7 = r7.mo17249k()     // Catch:{ all -> 0x0828 }
            java.lang.String r5 = r5.f15573b     // Catch:{ all -> 0x0828 }
            java.lang.String r5 = r7.mo17746a(r5)     // Catch:{ all -> 0x0828 }
            r7 = 500(0x1f4, float:7.0E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0828 }
            r3.mo17766a(r4, r6, r5, r7)     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.aw r3 = r1.f15755j     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.el r6 = r3.mo17248j()     // Catch:{ all -> 0x0828 }
            r8 = 8
            r9 = 0
            r10 = 0
            r11 = 0
            r7 = r2
            r6.mo17492a(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.ew r2 = r24.mo17451d()
            r2.mo17708x()
            return
        L_0x04ee:
            com.google.android.gms.measurement.internal.d r4 = new com.google.android.gms.measurement.internal.d     // Catch:{ all -> 0x0828 }
            java.lang.String r8 = r5.f15573b     // Catch:{ all -> 0x0828 }
            r9 = 0
            r11 = 0
            long r13 = r5.f15574c     // Catch:{ all -> 0x0828 }
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r6 = r4
            r7 = r2
            r6.<init>(r7, r8, r9, r11, r13, r15, r17, r18, r19, r20)     // Catch:{ all -> 0x0828 }
            goto L_0x0516
        L_0x0508:
            com.google.android.gms.measurement.internal.aw r2 = r1.f15755j     // Catch:{ all -> 0x0828 }
            long r6 = r4.f15665e     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.c r5 = r5.mo17306a(r2, r6)     // Catch:{ all -> 0x0828 }
            long r6 = r5.f15574c     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.d r4 = r4.mo17379a(r6)     // Catch:{ all -> 0x0828 }
        L_0x0516:
            com.google.android.gms.measurement.internal.ew r2 = r24.mo17451d()     // Catch:{ all -> 0x0828 }
            r2.mo17684a(r4)     // Catch:{ all -> 0x0828 }
            r24.m20874w()     // Catch:{ all -> 0x0828 }
            r24.mo17458j()     // Catch:{ all -> 0x0828 }
            com.google.android.gms.common.internal.C3513t.m12625a(r5)     // Catch:{ all -> 0x0828 }
            com.google.android.gms.common.internal.C3513t.m12625a(r26)     // Catch:{ all -> 0x0828 }
            java.lang.String r2 = r5.f15572a     // Catch:{ all -> 0x0828 }
            com.google.android.gms.common.internal.C3513t.m12627a(r2)     // Catch:{ all -> 0x0828 }
            java.lang.String r2 = r5.f15572a     // Catch:{ all -> 0x0828 }
            java.lang.String r4 = r3.f16003a     // Catch:{ all -> 0x0828 }
            boolean r2 = r2.equals(r4)     // Catch:{ all -> 0x0828 }
            com.google.android.gms.common.internal.C3513t.m12635b(r2)     // Catch:{ all -> 0x0828 }
            com.google.android.gms.internal.e.x r2 = new com.google.android.gms.internal.e.x     // Catch:{ all -> 0x0828 }
            r2.<init>()     // Catch:{ all -> 0x0828 }
            r4 = 1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0828 }
            r2.f15180a = r6     // Catch:{ all -> 0x0828 }
            java.lang.String r6 = "android"
            r2.f15188i = r6     // Catch:{ all -> 0x0828 }
            java.lang.String r6 = r3.f16003a     // Catch:{ all -> 0x0828 }
            r2.f15194o = r6     // Catch:{ all -> 0x0828 }
            java.lang.String r6 = r3.f16006d     // Catch:{ all -> 0x0828 }
            r2.f15193n = r6     // Catch:{ all -> 0x0828 }
            java.lang.String r6 = r3.f16005c     // Catch:{ all -> 0x0828 }
            r2.f15195p = r6     // Catch:{ all -> 0x0828 }
            long r6 = r3.f16012j     // Catch:{ all -> 0x0828 }
            r8 = -2147483648(0xffffffff80000000, double:NaN)
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            r6 = 0
            if (r10 != 0) goto L_0x0561
            r7 = r6
            goto L_0x0568
        L_0x0561:
            long r7 = r3.f16012j     // Catch:{ all -> 0x0828 }
            int r7 = (int) r7     // Catch:{ all -> 0x0828 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0828 }
        L_0x0568:
            r2.f15167C = r7     // Catch:{ all -> 0x0828 }
            long r7 = r3.f16007e     // Catch:{ all -> 0x0828 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0828 }
            r2.f15196q = r7     // Catch:{ all -> 0x0828 }
            java.lang.String r7 = r3.f16004b     // Catch:{ all -> 0x0828 }
            r2.f15204y = r7     // Catch:{ all -> 0x0828 }
            java.lang.String r7 = r3.f16020r     // Catch:{ all -> 0x0828 }
            r2.f15173I = r7     // Catch:{ all -> 0x0828 }
            long r7 = r3.f16008f     // Catch:{ all -> 0x0828 }
            r9 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x0584
            r7 = r6
            goto L_0x058a
        L_0x0584:
            long r7 = r3.f16008f     // Catch:{ all -> 0x0828 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0828 }
        L_0x058a:
            r2.f15201v = r7     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.aw r7 = r1.f15755j     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.et r7 = r7.mo17240b()     // Catch:{ all -> 0x0828 }
            java.lang.String r8 = r3.f16003a     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.h$a<java.lang.Boolean> r11 = com.google.android.gms.measurement.internal.C4882h.f15896as     // Catch:{ all -> 0x0828 }
            boolean r7 = r7.mo17645d(r8, r11)     // Catch:{ all -> 0x0828 }
            if (r7 == 0) goto L_0x05a6
            com.google.android.gms.measurement.internal.ei r7 = r24.mo17455g()     // Catch:{ all -> 0x0828 }
            int[] r7 = r7.mo17479f()     // Catch:{ all -> 0x0828 }
            r2.f15175K = r7     // Catch:{ all -> 0x0828 }
        L_0x05a6:
            com.google.android.gms.measurement.internal.aw r7 = r1.f15755j     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.ad r7 = r7.mo17241c()     // Catch:{ all -> 0x0828 }
            java.lang.String r8 = r3.f16003a     // Catch:{ all -> 0x0828 }
            android.util.Pair r7 = r7.mo17167a(r8)     // Catch:{ all -> 0x0828 }
            if (r7 == 0) goto L_0x05cf
            java.lang.Object r8 = r7.first     // Catch:{ all -> 0x0828 }
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8     // Catch:{ all -> 0x0828 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0828 }
            if (r8 != 0) goto L_0x05cf
            boolean r8 = r3.f16017o     // Catch:{ all -> 0x0828 }
            if (r8 == 0) goto L_0x062c
            java.lang.Object r8 = r7.first     // Catch:{ all -> 0x0828 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0828 }
            r2.f15198s = r8     // Catch:{ all -> 0x0828 }
            java.lang.Object r7 = r7.second     // Catch:{ all -> 0x0828 }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x0828 }
            r2.f15199t = r7     // Catch:{ all -> 0x0828 }
            goto L_0x062c
        L_0x05cf:
            com.google.android.gms.measurement.internal.aw r7 = r1.f15755j     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.b r7 = r7.mo17258y()     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.aw r8 = r1.f15755j     // Catch:{ all -> 0x0828 }
            android.content.Context r8 = r8.mo17154n()     // Catch:{ all -> 0x0828 }
            boolean r7 = r7.mo17279a(r8)     // Catch:{ all -> 0x0828 }
            if (r7 != 0) goto L_0x062c
            boolean r7 = r3.f16018p     // Catch:{ all -> 0x0828 }
            if (r7 == 0) goto L_0x062c
            com.google.android.gms.measurement.internal.aw r7 = r1.f15755j     // Catch:{ all -> 0x0828 }
            android.content.Context r7 = r7.mo17154n()     // Catch:{ all -> 0x0828 }
            android.content.ContentResolver r7 = r7.getContentResolver()     // Catch:{ all -> 0x0828 }
            java.lang.String r8 = "android_id"
            java.lang.String r7 = android.provider.Settings.Secure.getString(r7, r8)     // Catch:{ all -> 0x0828 }
            if (r7 != 0) goto L_0x060f
            com.google.android.gms.measurement.internal.aw r7 = r1.f15755j     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.r r7 = r7.mo17158r()     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.t r7 = r7.mo17754i()     // Catch:{ all -> 0x0828 }
            java.lang.String r8 = "null secure ID. appId"
            java.lang.String r11 = r2.f15194o     // Catch:{ all -> 0x0828 }
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C4893r.m21360a(r11)     // Catch:{ all -> 0x0828 }
            r7.mo17764a(r8, r11)     // Catch:{ all -> 0x0828 }
            java.lang.String r7 = "null"
            goto L_0x062a
        L_0x060f:
            boolean r8 = r7.isEmpty()     // Catch:{ all -> 0x0828 }
            if (r8 == 0) goto L_0x062a
            com.google.android.gms.measurement.internal.aw r8 = r1.f15755j     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.r r8 = r8.mo17158r()     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.t r8 = r8.mo17754i()     // Catch:{ all -> 0x0828 }
            java.lang.String r11 = "empty secure ID. appId"
            java.lang.String r12 = r2.f15194o     // Catch:{ all -> 0x0828 }
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C4893r.m21360a(r12)     // Catch:{ all -> 0x0828 }
            r8.mo17764a(r11, r12)     // Catch:{ all -> 0x0828 }
        L_0x062a:
            r2.f15168D = r7     // Catch:{ all -> 0x0828 }
        L_0x062c:
            com.google.android.gms.measurement.internal.aw r7 = r1.f15755j     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.b r7 = r7.mo17258y()     // Catch:{ all -> 0x0828 }
            r7.mo17300A()     // Catch:{ all -> 0x0828 }
            java.lang.String r7 = android.os.Build.MODEL     // Catch:{ all -> 0x0828 }
            r2.f15190k = r7     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.aw r7 = r1.f15755j     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.b r7 = r7.mo17258y()     // Catch:{ all -> 0x0828 }
            r7.mo17300A()     // Catch:{ all -> 0x0828 }
            java.lang.String r7 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x0828 }
            r2.f15189j = r7     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.aw r7 = r1.f15755j     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.b r7 = r7.mo17258y()     // Catch:{ all -> 0x0828 }
            long r7 = r7.mo17281x_()     // Catch:{ all -> 0x0828 }
            int r7 = (int) r7     // Catch:{ all -> 0x0828 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0828 }
            r2.f15192m = r7     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.aw r7 = r1.f15755j     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.b r7 = r7.mo17258y()     // Catch:{ all -> 0x0828 }
            java.lang.String r7 = r7.mo17280g()     // Catch:{ all -> 0x0828 }
            r2.f15191l = r7     // Catch:{ all -> 0x0828 }
            r2.f15197r = r6     // Catch:{ all -> 0x0828 }
            r2.f15183d = r6     // Catch:{ all -> 0x0828 }
            r2.f15184e = r6     // Catch:{ all -> 0x0828 }
            r2.f15185f = r6     // Catch:{ all -> 0x0828 }
            long r7 = r3.f16014l     // Catch:{ all -> 0x0828 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0828 }
            r2.f15170F = r7     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.aw r7 = r1.f15755j     // Catch:{ all -> 0x0828 }
            boolean r7 = r7.mo17230C()     // Catch:{ all -> 0x0828 }
            if (r7 == 0) goto L_0x0683
            boolean r7 = com.google.android.gms.measurement.internal.C4870et.m21098w()     // Catch:{ all -> 0x0828 }
            if (r7 == 0) goto L_0x0683
            r2.f15171G = r6     // Catch:{ all -> 0x0828 }
        L_0x0683:
            com.google.android.gms.measurement.internal.ew r6 = r24.mo17451d()     // Catch:{ all -> 0x0828 }
            java.lang.String r7 = r3.f16003a     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.en r6 = r6.mo17693b(r7)     // Catch:{ all -> 0x0828 }
            if (r6 != 0) goto L_0x06f1
            com.google.android.gms.measurement.internal.en r6 = new com.google.android.gms.measurement.internal.en     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.aw r7 = r1.f15755j     // Catch:{ all -> 0x0828 }
            java.lang.String r8 = r3.f16003a     // Catch:{ all -> 0x0828 }
            r6.<init>(r7, r8)     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.aw r7 = r1.f15755j     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.el r7 = r7.mo17248j()     // Catch:{ all -> 0x0828 }
            java.lang.String r7 = r7.mo17506k()     // Catch:{ all -> 0x0828 }
            r6.mo17521a(r7)     // Catch:{ all -> 0x0828 }
            java.lang.String r7 = r3.f16013k     // Catch:{ all -> 0x0828 }
            r6.mo17536e(r7)     // Catch:{ all -> 0x0828 }
            java.lang.String r7 = r3.f16004b     // Catch:{ all -> 0x0828 }
            r6.mo17525b(r7)     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.aw r7 = r1.f15755j     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.ad r7 = r7.mo17241c()     // Catch:{ all -> 0x0828 }
            java.lang.String r8 = r3.f16003a     // Catch:{ all -> 0x0828 }
            java.lang.String r7 = r7.mo17170b(r8)     // Catch:{ all -> 0x0828 }
            r6.mo17533d(r7)     // Catch:{ all -> 0x0828 }
            r6.mo17538f(r9)     // Catch:{ all -> 0x0828 }
            r6.mo17520a(r9)     // Catch:{ all -> 0x0828 }
            r6.mo17524b(r9)     // Catch:{ all -> 0x0828 }
            java.lang.String r7 = r3.f16005c     // Catch:{ all -> 0x0828 }
            r6.mo17539f(r7)     // Catch:{ all -> 0x0828 }
            long r7 = r3.f16012j     // Catch:{ all -> 0x0828 }
            r6.mo17528c(r7)     // Catch:{ all -> 0x0828 }
            java.lang.String r7 = r3.f16006d     // Catch:{ all -> 0x0828 }
            r6.mo17542g(r7)     // Catch:{ all -> 0x0828 }
            long r7 = r3.f16007e     // Catch:{ all -> 0x0828 }
            r6.mo17532d(r7)     // Catch:{ all -> 0x0828 }
            long r7 = r3.f16008f     // Catch:{ all -> 0x0828 }
            r6.mo17535e(r7)     // Catch:{ all -> 0x0828 }
            boolean r7 = r3.f16010h     // Catch:{ all -> 0x0828 }
            r6.mo17522a(r7)     // Catch:{ all -> 0x0828 }
            long r7 = r3.f16014l     // Catch:{ all -> 0x0828 }
            r6.mo17558o(r7)     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.ew r7 = r24.mo17451d()     // Catch:{ all -> 0x0828 }
            r7.mo17685a(r6)     // Catch:{ all -> 0x0828 }
        L_0x06f1:
            java.lang.String r7 = r6.mo17527c()     // Catch:{ all -> 0x0828 }
            r2.f15200u = r7     // Catch:{ all -> 0x0828 }
            java.lang.String r6 = r6.mo17540g()     // Catch:{ all -> 0x0828 }
            r2.f15166B = r6     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.ew r6 = r24.mo17451d()     // Catch:{ all -> 0x0828 }
            java.lang.String r3 = r3.f16003a     // Catch:{ all -> 0x0828 }
            java.util.List r3 = r6.mo17680a(r3)     // Catch:{ all -> 0x0828 }
            int r6 = r3.size()     // Catch:{ all -> 0x0828 }
            com.google.android.gms.internal.e.aa[] r6 = new com.google.android.gms.internal.p148e.C4433aa[r6]     // Catch:{ all -> 0x0828 }
            r2.f15182c = r6     // Catch:{ all -> 0x0828 }
            r6 = 0
        L_0x0710:
            int r7 = r3.size()     // Catch:{ all -> 0x0828 }
            if (r6 >= r7) goto L_0x0749
            com.google.android.gms.internal.e.aa r7 = new com.google.android.gms.internal.e.aa     // Catch:{ all -> 0x0828 }
            r7.<init>()     // Catch:{ all -> 0x0828 }
            com.google.android.gms.internal.e.aa[] r8 = r2.f15182c     // Catch:{ all -> 0x0828 }
            r8[r6] = r7     // Catch:{ all -> 0x0828 }
            java.lang.Object r8 = r3.get(r6)     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.ek r8 = (com.google.android.gms.measurement.internal.C4861ek) r8     // Catch:{ all -> 0x0828 }
            java.lang.String r8 = r8.f15786c     // Catch:{ all -> 0x0828 }
            r7.f14631b = r8     // Catch:{ all -> 0x0828 }
            java.lang.Object r8 = r3.get(r6)     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.ek r8 = (com.google.android.gms.measurement.internal.C4861ek) r8     // Catch:{ all -> 0x0828 }
            long r11 = r8.f15787d     // Catch:{ all -> 0x0828 }
            java.lang.Long r8 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0828 }
            r7.f14630a = r8     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.ei r8 = r24.mo17455g()     // Catch:{ all -> 0x0828 }
            java.lang.Object r11 = r3.get(r6)     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.ek r11 = (com.google.android.gms.measurement.internal.C4861ek) r11     // Catch:{ all -> 0x0828 }
            java.lang.Object r11 = r11.f15788e     // Catch:{ all -> 0x0828 }
            r8.mo17471a(r7, r11)     // Catch:{ all -> 0x0828 }
            int r6 = r6 + 1
            goto L_0x0710
        L_0x0749:
            com.google.android.gms.measurement.internal.ew r3 = r24.mo17451d()     // Catch:{ IOException -> 0x07b7 }
            long r6 = r3.mo17675a(r2)     // Catch:{ IOException -> 0x07b7 }
            com.google.android.gms.measurement.internal.ew r2 = r24.mo17451d()     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.zzad r3 = r5.f15576e     // Catch:{ all -> 0x0828 }
            if (r3 == 0) goto L_0x07ad
            com.google.android.gms.measurement.internal.zzad r3 = r5.f15576e     // Catch:{ all -> 0x0828 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0828 }
        L_0x075f:
            boolean r8 = r3.hasNext()     // Catch:{ all -> 0x0828 }
            if (r8 == 0) goto L_0x0774
            java.lang.Object r8 = r3.next()     // Catch:{ all -> 0x0828 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0828 }
            java.lang.String r11 = "_r"
            boolean r8 = r11.equals(r8)     // Catch:{ all -> 0x0828 }
            if (r8 == 0) goto L_0x075f
            goto L_0x07ae
        L_0x0774:
            com.google.android.gms.measurement.internal.aq r3 = r24.m20871s()     // Catch:{ all -> 0x0828 }
            java.lang.String r8 = r5.f15572a     // Catch:{ all -> 0x0828 }
            java.lang.String r11 = r5.f15573b     // Catch:{ all -> 0x0828 }
            boolean r3 = r3.mo17208c(r8, r11)     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.ew r11 = r24.mo17451d()     // Catch:{ all -> 0x0828 }
            long r12 = r24.m20875x()     // Catch:{ all -> 0x0828 }
            java.lang.String r14 = r5.f15572a     // Catch:{ all -> 0x0828 }
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            com.google.android.gms.measurement.internal.ex r8 = r11.mo17678a(r12, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0828 }
            if (r3 == 0) goto L_0x07ad
            long r11 = r8.f15842e     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.aw r3 = r1.f15755j     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.et r3 = r3.mo17240b()     // Catch:{ all -> 0x0828 }
            java.lang.String r8 = r5.f15572a     // Catch:{ all -> 0x0828 }
            int r3 = r3.mo17636a(r8)     // Catch:{ all -> 0x0828 }
            long r13 = (long) r3     // Catch:{ all -> 0x0828 }
            int r3 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r3 >= 0) goto L_0x07ad
            goto L_0x07ae
        L_0x07ad:
            r4 = 0
        L_0x07ae:
            boolean r2 = r2.mo17689a(r5, r6, r4)     // Catch:{ all -> 0x0828 }
            if (r2 == 0) goto L_0x07ce
            r1.f15759n = r9     // Catch:{ all -> 0x0828 }
            goto L_0x07ce
        L_0x07b7:
            r0 = move-exception
            r3 = r0
            com.google.android.gms.measurement.internal.aw r4 = r1.f15755j     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.r r4 = r4.mo17158r()     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.t r4 = r4.mo17761y_()     // Catch:{ all -> 0x0828 }
            java.lang.String r6 = "Data loss. Failed to insert raw event metadata. appId"
            java.lang.String r2 = r2.f15194o     // Catch:{ all -> 0x0828 }
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C4893r.m21360a(r2)     // Catch:{ all -> 0x0828 }
            r4.mo17765a(r6, r2, r3)     // Catch:{ all -> 0x0828 }
        L_0x07ce:
            com.google.android.gms.measurement.internal.ew r2 = r24.mo17451d()     // Catch:{ all -> 0x0828 }
            r2.mo17707w()     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.aw r2 = r1.f15755j     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.r r2 = r2.mo17158r()     // Catch:{ all -> 0x0828 }
            r3 = 2
            boolean r2 = r2.mo17751a(r3)     // Catch:{ all -> 0x0828 }
            if (r2 == 0) goto L_0x07fb
            com.google.android.gms.measurement.internal.aw r2 = r1.f15755j     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.r r2 = r2.mo17158r()     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.t r2 = r2.mo17759x()     // Catch:{ all -> 0x0828 }
            java.lang.String r3 = "Event recorded"
            com.google.android.gms.measurement.internal.aw r4 = r1.f15755j     // Catch:{ all -> 0x0828 }
            com.google.android.gms.measurement.internal.p r4 = r4.mo17249k()     // Catch:{ all -> 0x0828 }
            java.lang.String r4 = r4.mo17744a(r5)     // Catch:{ all -> 0x0828 }
            r2.mo17764a(r3, r4)     // Catch:{ all -> 0x0828 }
        L_0x07fb:
            com.google.android.gms.measurement.internal.ew r2 = r24.mo17451d()
            r2.mo17708x()
            r24.m20877z()
            com.google.android.gms.measurement.internal.aw r2 = r1.f15755j
            com.google.android.gms.measurement.internal.r r2 = r2.mo17158r()
            com.google.android.gms.measurement.internal.t r2 = r2.mo17759x()
            java.lang.String r3 = "Background event processing time, ms"
            long r4 = java.lang.System.nanoTime()
            long r6 = r4 - r21
            r4 = 500000(0x7a120, double:2.47033E-318)
            long r8 = r6 + r4
            r4 = 1000000(0xf4240, double:4.940656E-318)
            long r8 = r8 / r4
            java.lang.Long r4 = java.lang.Long.valueOf(r8)
            r2.mo17764a(r3, r4)
            return
        L_0x0828:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.ew r3 = r24.mo17451d()
            r3.mo17708x()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4852ec.m20869b(com.google.android.gms.measurement.internal.zzag, com.google.android.gms.measurement.internal.zzk):void");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:88|89) */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        r14.f15755j.mo17158r().mo17761y_().mo17765a("Failed to parse upload URL. Not uploading. appId", com.google.android.gms.measurement.internal.C4893r.m21360a(r4), r5);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:88:0x0298 */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17459k() {
        /*
            r14 = this;
            r14.m20874w()
            r14.mo17458j()
            r0 = 1
            r14.f15765t = r0
            r1 = 0
            com.google.android.gms.measurement.internal.aw r2 = r14.f15755j     // Catch:{ all -> 0x02d5 }
            r2.mo17161u()     // Catch:{ all -> 0x02d5 }
            com.google.android.gms.measurement.internal.aw r2 = r14.f15755j     // Catch:{ all -> 0x02d5 }
            com.google.android.gms.measurement.internal.ct r2 = r2.mo17257x()     // Catch:{ all -> 0x02d5 }
            java.lang.Boolean r2 = r2.mo17360B()     // Catch:{ all -> 0x02d5 }
            if (r2 != 0) goto L_0x0030
            com.google.android.gms.measurement.internal.aw r0 = r14.f15755j     // Catch:{ all -> 0x02d5 }
            com.google.android.gms.measurement.internal.r r0 = r0.mo17158r()     // Catch:{ all -> 0x02d5 }
            com.google.android.gms.measurement.internal.t r0 = r0.mo17754i()     // Catch:{ all -> 0x02d5 }
            java.lang.String r2 = "Upload data called on the client side before use of service was decided"
            r0.mo17763a(r2)     // Catch:{ all -> 0x02d5 }
            r14.f15765t = r1
            r14.m20850A()
            return
        L_0x0030:
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x02d5 }
            if (r2 == 0) goto L_0x004b
            com.google.android.gms.measurement.internal.aw r0 = r14.f15755j     // Catch:{ all -> 0x02d5 }
            com.google.android.gms.measurement.internal.r r0 = r0.mo17158r()     // Catch:{ all -> 0x02d5 }
            com.google.android.gms.measurement.internal.t r0 = r0.mo17761y_()     // Catch:{ all -> 0x02d5 }
            java.lang.String r2 = "Upload called in the client side when service should be used"
            r0.mo17763a(r2)     // Catch:{ all -> 0x02d5 }
            r14.f15765t = r1
            r14.m20850A()
            return
        L_0x004b:
            long r2 = r14.f15759n     // Catch:{ all -> 0x02d5 }
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x005c
            r14.m20877z()     // Catch:{ all -> 0x02d5 }
            r14.f15765t = r1
            r14.m20850A()
            return
        L_0x005c:
            r14.m20874w()     // Catch:{ all -> 0x02d5 }
            java.util.List<java.lang.Long> r2 = r14.f15768w     // Catch:{ all -> 0x02d5 }
            if (r2 == 0) goto L_0x0065
            r2 = r0
            goto L_0x0066
        L_0x0065:
            r2 = r1
        L_0x0066:
            if (r2 == 0) goto L_0x007d
            com.google.android.gms.measurement.internal.aw r0 = r14.f15755j     // Catch:{ all -> 0x02d5 }
            com.google.android.gms.measurement.internal.r r0 = r0.mo17158r()     // Catch:{ all -> 0x02d5 }
            com.google.android.gms.measurement.internal.t r0 = r0.mo17759x()     // Catch:{ all -> 0x02d5 }
            java.lang.String r2 = "Uploading requested multiple times"
            r0.mo17763a(r2)     // Catch:{ all -> 0x02d5 }
            r14.f15765t = r1
            r14.m20850A()
            return
        L_0x007d:
            com.google.android.gms.measurement.internal.v r2 = r14.mo17449c()     // Catch:{ all -> 0x02d5 }
            boolean r2 = r2.mo17768f()     // Catch:{ all -> 0x02d5 }
            if (r2 != 0) goto L_0x009f
            com.google.android.gms.measurement.internal.aw r0 = r14.f15755j     // Catch:{ all -> 0x02d5 }
            com.google.android.gms.measurement.internal.r r0 = r0.mo17158r()     // Catch:{ all -> 0x02d5 }
            com.google.android.gms.measurement.internal.t r0 = r0.mo17759x()     // Catch:{ all -> 0x02d5 }
            java.lang.String r2 = "Network not connected, ignoring upload request"
            r0.mo17763a(r2)     // Catch:{ all -> 0x02d5 }
            r14.m20877z()     // Catch:{ all -> 0x02d5 }
            r14.f15765t = r1
            r14.m20850A()
            return
        L_0x009f:
            com.google.android.gms.measurement.internal.aw r2 = r14.f15755j     // Catch:{ all -> 0x02d5 }
            com.google.android.gms.common.util.e r2 = r2.mo17153m()     // Catch:{ all -> 0x02d5 }
            long r2 = r2.mo13694a()     // Catch:{ all -> 0x02d5 }
            long r6 = com.google.android.gms.measurement.internal.C4870et.m21097k()     // Catch:{ all -> 0x02d5 }
            long r8 = r2 - r6
            r6 = 0
            r14.m20863a(r6, r8)     // Catch:{ all -> 0x02d5 }
            com.google.android.gms.measurement.internal.aw r7 = r14.f15755j     // Catch:{ all -> 0x02d5 }
            com.google.android.gms.measurement.internal.ad r7 = r7.mo17241c()     // Catch:{ all -> 0x02d5 }
            com.google.android.gms.measurement.internal.ag r7 = r7.f15386c     // Catch:{ all -> 0x02d5 }
            long r7 = r7.mo17188a()     // Catch:{ all -> 0x02d5 }
            int r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r9 == 0) goto L_0x00dc
            com.google.android.gms.measurement.internal.aw r4 = r14.f15755j     // Catch:{ all -> 0x02d5 }
            com.google.android.gms.measurement.internal.r r4 = r4.mo17158r()     // Catch:{ all -> 0x02d5 }
            com.google.android.gms.measurement.internal.t r4 = r4.mo17758w()     // Catch:{ all -> 0x02d5 }
            java.lang.String r5 = "Uploading events. Elapsed time since last upload attempt (ms)"
            long r9 = r2 - r7
            long r7 = java.lang.Math.abs(r9)     // Catch:{ all -> 0x02d5 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x02d5 }
            r4.mo17764a(r5, r7)     // Catch:{ all -> 0x02d5 }
        L_0x00dc:
            com.google.android.gms.measurement.internal.ew r4 = r14.mo17451d()     // Catch:{ all -> 0x02d5 }
            java.lang.String r4 = r4.mo17710z()     // Catch:{ all -> 0x02d5 }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x02d5 }
            r7 = -1
            if (r5 != 0) goto L_0x02ac
            long r9 = r14.f15770y     // Catch:{ all -> 0x02d5 }
            int r5 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r5 != 0) goto L_0x00fc
            com.google.android.gms.measurement.internal.ew r5 = r14.mo17451d()     // Catch:{ all -> 0x02d5 }
            long r7 = r5.mo17674G()     // Catch:{ all -> 0x02d5 }
            r14.f15770y = r7     // Catch:{ all -> 0x02d5 }
        L_0x00fc:
            com.google.android.gms.measurement.internal.aw r5 = r14.f15755j     // Catch:{ all -> 0x02d5 }
            com.google.android.gms.measurement.internal.et r5 = r5.mo17240b()     // Catch:{ all -> 0x02d5 }
            com.google.android.gms.measurement.internal.h$a<java.lang.Integer> r7 = com.google.android.gms.measurement.internal.C4882h.f15917o     // Catch:{ all -> 0x02d5 }
            int r5 = r5.mo17640b(r4, r7)     // Catch:{ all -> 0x02d5 }
            com.google.android.gms.measurement.internal.aw r7 = r14.f15755j     // Catch:{ all -> 0x02d5 }
            com.google.android.gms.measurement.internal.et r7 = r7.mo17240b()     // Catch:{ all -> 0x02d5 }
            com.google.android.gms.measurement.internal.h$a<java.lang.Integer> r8 = com.google.android.gms.measurement.internal.C4882h.f15918p     // Catch:{ all -> 0x02d5 }
            int r7 = r7.mo17640b(r4, r8)     // Catch:{ all -> 0x02d5 }
            int r7 = java.lang.Math.max(r1, r7)     // Catch:{ all -> 0x02d5 }
            com.google.android.gms.measurement.internal.ew r8 = r14.mo17451d()     // Catch:{ all -> 0x02d5 }
            java.util.List r5 = r8.mo17681a(r4, r5, r7)     // Catch:{ all -> 0x02d5 }
            boolean r7 = r5.isEmpty()     // Catch:{ all -> 0x02d5 }
            if (r7 != 0) goto L_0x02cf
            java.util.Iterator r7 = r5.iterator()     // Catch:{ all -> 0x02d5 }
        L_0x012a:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x02d5 }
            if (r8 == 0) goto L_0x0145
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x02d5 }
            android.util.Pair r8 = (android.util.Pair) r8     // Catch:{ all -> 0x02d5 }
            java.lang.Object r8 = r8.first     // Catch:{ all -> 0x02d5 }
            com.google.android.gms.internal.e.x r8 = (com.google.android.gms.internal.p148e.C4651x) r8     // Catch:{ all -> 0x02d5 }
            java.lang.String r9 = r8.f15198s     // Catch:{ all -> 0x02d5 }
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x02d5 }
            if (r9 != 0) goto L_0x012a
            java.lang.String r7 = r8.f15198s     // Catch:{ all -> 0x02d5 }
            goto L_0x0146
        L_0x0145:
            r7 = r6
        L_0x0146:
            if (r7 == 0) goto L_0x0171
            r8 = r1
        L_0x0149:
            int r9 = r5.size()     // Catch:{ all -> 0x02d5 }
            if (r8 >= r9) goto L_0x0171
            java.lang.Object r9 = r5.get(r8)     // Catch:{ all -> 0x02d5 }
            android.util.Pair r9 = (android.util.Pair) r9     // Catch:{ all -> 0x02d5 }
            java.lang.Object r9 = r9.first     // Catch:{ all -> 0x02d5 }
            com.google.android.gms.internal.e.x r9 = (com.google.android.gms.internal.p148e.C4651x) r9     // Catch:{ all -> 0x02d5 }
            java.lang.String r10 = r9.f15198s     // Catch:{ all -> 0x02d5 }
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x02d5 }
            if (r10 != 0) goto L_0x016e
            java.lang.String r9 = r9.f15198s     // Catch:{ all -> 0x02d5 }
            boolean r9 = r9.equals(r7)     // Catch:{ all -> 0x02d5 }
            if (r9 != 0) goto L_0x016e
            java.util.List r5 = r5.subList(r1, r8)     // Catch:{ all -> 0x02d5 }
            goto L_0x0171
        L_0x016e:
            int r8 = r8 + 1
            goto L_0x0149
        L_0x0171:
            com.google.android.gms.internal.e.w r7 = new com.google.android.gms.internal.e.w     // Catch:{ all -> 0x02d5 }
            r7.<init>()     // Catch:{ all -> 0x02d5 }
            int r8 = r5.size()     // Catch:{ all -> 0x02d5 }
            com.google.android.gms.internal.e.x[] r8 = new com.google.android.gms.internal.p148e.C4651x[r8]     // Catch:{ all -> 0x02d5 }
            r7.f15163a = r8     // Catch:{ all -> 0x02d5 }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x02d5 }
            int r9 = r5.size()     // Catch:{ all -> 0x02d5 }
            r8.<init>(r9)     // Catch:{ all -> 0x02d5 }
            boolean r9 = com.google.android.gms.measurement.internal.C4870et.m21098w()     // Catch:{ all -> 0x02d5 }
            if (r9 == 0) goto L_0x019b
            com.google.android.gms.measurement.internal.aw r9 = r14.f15755j     // Catch:{ all -> 0x02d5 }
            com.google.android.gms.measurement.internal.et r9 = r9.mo17240b()     // Catch:{ all -> 0x02d5 }
            boolean r9 = r9.mo17642c(r4)     // Catch:{ all -> 0x02d5 }
            if (r9 == 0) goto L_0x019b
            r9 = r0
            goto L_0x019c
        L_0x019b:
            r9 = r1
        L_0x019c:
            r10 = r1
        L_0x019d:
            com.google.android.gms.internal.e.x[] r11 = r7.f15163a     // Catch:{ all -> 0x02d5 }
            int r11 = r11.length     // Catch:{ all -> 0x02d5 }
            if (r10 >= r11) goto L_0x01f5
            com.google.android.gms.internal.e.x[] r11 = r7.f15163a     // Catch:{ all -> 0x02d5 }
            java.lang.Object r12 = r5.get(r10)     // Catch:{ all -> 0x02d5 }
            android.util.Pair r12 = (android.util.Pair) r12     // Catch:{ all -> 0x02d5 }
            java.lang.Object r12 = r12.first     // Catch:{ all -> 0x02d5 }
            com.google.android.gms.internal.e.x r12 = (com.google.android.gms.internal.p148e.C4651x) r12     // Catch:{ all -> 0x02d5 }
            r11[r10] = r12     // Catch:{ all -> 0x02d5 }
            java.lang.Object r11 = r5.get(r10)     // Catch:{ all -> 0x02d5 }
            android.util.Pair r11 = (android.util.Pair) r11     // Catch:{ all -> 0x02d5 }
            java.lang.Object r11 = r11.second     // Catch:{ all -> 0x02d5 }
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ all -> 0x02d5 }
            r8.add(r11)     // Catch:{ all -> 0x02d5 }
            com.google.android.gms.internal.e.x[] r11 = r7.f15163a     // Catch:{ all -> 0x02d5 }
            r11 = r11[r10]     // Catch:{ all -> 0x02d5 }
            com.google.android.gms.measurement.internal.aw r12 = r14.f15755j     // Catch:{ all -> 0x02d5 }
            com.google.android.gms.measurement.internal.et r12 = r12.mo17240b()     // Catch:{ all -> 0x02d5 }
            long r12 = r12.mo17647f()     // Catch:{ all -> 0x02d5 }
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x02d5 }
            r11.f15197r = r12     // Catch:{ all -> 0x02d5 }
            com.google.android.gms.internal.e.x[] r11 = r7.f15163a     // Catch:{ all -> 0x02d5 }
            r11 = r11[r10]     // Catch:{ all -> 0x02d5 }
            java.lang.Long r12 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x02d5 }
            r11.f15183d = r12     // Catch:{ all -> 0x02d5 }
            com.google.android.gms.internal.e.x[] r11 = r7.f15163a     // Catch:{ all -> 0x02d5 }
            r11 = r11[r10]     // Catch:{ all -> 0x02d5 }
            com.google.android.gms.measurement.internal.aw r12 = r14.f15755j     // Catch:{ all -> 0x02d5 }
            r12.mo17161u()     // Catch:{ all -> 0x02d5 }
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x02d5 }
            r11.f15205z = r12     // Catch:{ all -> 0x02d5 }
            if (r9 != 0) goto L_0x01f2
            com.google.android.gms.internal.e.x[] r11 = r7.f15163a     // Catch:{ all -> 0x02d5 }
            r11 = r11[r10]     // Catch:{ all -> 0x02d5 }
            r11.f15171G = r6     // Catch:{ all -> 0x02d5 }
        L_0x01f2:
            int r10 = r10 + 1
            goto L_0x019d
        L_0x01f5:
            com.google.android.gms.measurement.internal.aw r5 = r14.f15755j     // Catch:{ all -> 0x02d5 }
            com.google.android.gms.measurement.internal.r r5 = r5.mo17158r()     // Catch:{ all -> 0x02d5 }
            r9 = 2
            boolean r5 = r5.mo17751a(r9)     // Catch:{ all -> 0x02d5 }
            if (r5 == 0) goto L_0x020a
            com.google.android.gms.measurement.internal.ei r5 = r14.mo17455g()     // Catch:{ all -> 0x02d5 }
            java.lang.String r6 = r5.mo17477b(r7)     // Catch:{ all -> 0x02d5 }
        L_0x020a:
            com.google.android.gms.measurement.internal.ei r5 = r14.mo17455g()     // Catch:{ all -> 0x02d5 }
            byte[] r11 = r5.mo17475a(r7)     // Catch:{ all -> 0x02d5 }
            com.google.android.gms.measurement.internal.h$a<java.lang.String> r5 = com.google.android.gms.measurement.internal.C4882h.f15927y     // Catch:{ all -> 0x02d5 }
            java.lang.Object r5 = r5.mo17726b()     // Catch:{ all -> 0x02d5 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x02d5 }
            java.net.URL r10 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0298 }
            r10.<init>(r5)     // Catch:{ MalformedURLException -> 0x0298 }
            boolean r9 = r8.isEmpty()     // Catch:{ MalformedURLException -> 0x0298 }
            r9 = r9 ^ r0
            com.google.android.gms.common.internal.C3513t.m12635b(r9)     // Catch:{ MalformedURLException -> 0x0298 }
            java.util.List<java.lang.Long> r9 = r14.f15768w     // Catch:{ MalformedURLException -> 0x0298 }
            if (r9 == 0) goto L_0x023b
            com.google.android.gms.measurement.internal.aw r8 = r14.f15755j     // Catch:{ MalformedURLException -> 0x0298 }
            com.google.android.gms.measurement.internal.r r8 = r8.mo17158r()     // Catch:{ MalformedURLException -> 0x0298 }
            com.google.android.gms.measurement.internal.t r8 = r8.mo17761y_()     // Catch:{ MalformedURLException -> 0x0298 }
            java.lang.String r9 = "Set uploading progress before finishing the previous upload"
            r8.mo17763a(r9)     // Catch:{ MalformedURLException -> 0x0298 }
            goto L_0x0242
        L_0x023b:
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ MalformedURLException -> 0x0298 }
            r9.<init>(r8)     // Catch:{ MalformedURLException -> 0x0298 }
            r14.f15768w = r9     // Catch:{ MalformedURLException -> 0x0298 }
        L_0x0242:
            com.google.android.gms.measurement.internal.aw r8 = r14.f15755j     // Catch:{ MalformedURLException -> 0x0298 }
            com.google.android.gms.measurement.internal.ad r8 = r8.mo17241c()     // Catch:{ MalformedURLException -> 0x0298 }
            com.google.android.gms.measurement.internal.ag r8 = r8.f15387d     // Catch:{ MalformedURLException -> 0x0298 }
            r8.mo17189a(r2)     // Catch:{ MalformedURLException -> 0x0298 }
            java.lang.String r2 = "?"
            com.google.android.gms.internal.e.x[] r3 = r7.f15163a     // Catch:{ MalformedURLException -> 0x0298 }
            int r3 = r3.length     // Catch:{ MalformedURLException -> 0x0298 }
            if (r3 <= 0) goto L_0x025a
            com.google.android.gms.internal.e.x[] r2 = r7.f15163a     // Catch:{ MalformedURLException -> 0x0298 }
            r2 = r2[r1]     // Catch:{ MalformedURLException -> 0x0298 }
            java.lang.String r2 = r2.f15194o     // Catch:{ MalformedURLException -> 0x0298 }
        L_0x025a:
            com.google.android.gms.measurement.internal.aw r3 = r14.f15755j     // Catch:{ MalformedURLException -> 0x0298 }
            com.google.android.gms.measurement.internal.r r3 = r3.mo17158r()     // Catch:{ MalformedURLException -> 0x0298 }
            com.google.android.gms.measurement.internal.t r3 = r3.mo17759x()     // Catch:{ MalformedURLException -> 0x0298 }
            java.lang.String r7 = "Uploading data. app, uncompressed size, data"
            int r8 = r11.length     // Catch:{ MalformedURLException -> 0x0298 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ MalformedURLException -> 0x0298 }
            r3.mo17766a(r7, r2, r8, r6)     // Catch:{ MalformedURLException -> 0x0298 }
            r14.f15764s = r0     // Catch:{ MalformedURLException -> 0x0298 }
            com.google.android.gms.measurement.internal.v r8 = r14.mo17449c()     // Catch:{ MalformedURLException -> 0x0298 }
            com.google.android.gms.measurement.internal.ee r13 = new com.google.android.gms.measurement.internal.ee     // Catch:{ MalformedURLException -> 0x0298 }
            r13.<init>(r14, r4)     // Catch:{ MalformedURLException -> 0x0298 }
            r8.mo17144d()     // Catch:{ MalformedURLException -> 0x0298 }
            r8.mo17430k()     // Catch:{ MalformedURLException -> 0x0298 }
            com.google.android.gms.common.internal.C3513t.m12625a(r10)     // Catch:{ MalformedURLException -> 0x0298 }
            com.google.android.gms.common.internal.C3513t.m12625a(r11)     // Catch:{ MalformedURLException -> 0x0298 }
            com.google.android.gms.common.internal.C3513t.m12625a(r13)     // Catch:{ MalformedURLException -> 0x0298 }
            com.google.android.gms.measurement.internal.ar r0 = r8.mo17157q()     // Catch:{ MalformedURLException -> 0x0298 }
            com.google.android.gms.measurement.internal.aa r2 = new com.google.android.gms.measurement.internal.aa     // Catch:{ MalformedURLException -> 0x0298 }
            r12 = 0
            r7 = r2
            r9 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13)     // Catch:{ MalformedURLException -> 0x0298 }
            r0.mo17221b(r2)     // Catch:{ MalformedURLException -> 0x0298 }
            goto L_0x02cf
        L_0x0298:
            com.google.android.gms.measurement.internal.aw r0 = r14.f15755j     // Catch:{ all -> 0x02d5 }
            com.google.android.gms.measurement.internal.r r0 = r0.mo17158r()     // Catch:{ all -> 0x02d5 }
            com.google.android.gms.measurement.internal.t r0 = r0.mo17761y_()     // Catch:{ all -> 0x02d5 }
            java.lang.String r2 = "Failed to parse upload URL. Not uploading. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C4893r.m21360a(r4)     // Catch:{ all -> 0x02d5 }
            r0.mo17765a(r2, r3, r5)     // Catch:{ all -> 0x02d5 }
            goto L_0x02cf
        L_0x02ac:
            r14.f15770y = r7     // Catch:{ all -> 0x02d5 }
            com.google.android.gms.measurement.internal.ew r0 = r14.mo17451d()     // Catch:{ all -> 0x02d5 }
            long r4 = com.google.android.gms.measurement.internal.C4870et.m21097k()     // Catch:{ all -> 0x02d5 }
            long r6 = r2 - r4
            java.lang.String r0 = r0.mo17679a(r6)     // Catch:{ all -> 0x02d5 }
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x02d5 }
            if (r2 != 0) goto L_0x02cf
            com.google.android.gms.measurement.internal.ew r2 = r14.mo17451d()     // Catch:{ all -> 0x02d5 }
            com.google.android.gms.measurement.internal.en r0 = r2.mo17693b(r0)     // Catch:{ all -> 0x02d5 }
            if (r0 == 0) goto L_0x02cf
            r14.m20860a(r0)     // Catch:{ all -> 0x02d5 }
        L_0x02cf:
            r14.f15765t = r1
            r14.m20850A()
            return
        L_0x02d5:
            r0 = move-exception
            r14.f15765t = r1
            r14.m20850A()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4852ec.mo17459k():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0040, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0041, code lost:
        r2 = r0;
        r8 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0045, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        r7 = null;
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a0, code lost:
        r8 = r3;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0040 A[ExcHandler: all (r0v14 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r3 
      PHI: (r3v149 android.database.Cursor) = (r3v144 android.database.Cursor), (r3v144 android.database.Cursor), (r3v144 android.database.Cursor), (r3v152 android.database.Cursor), (r3v152 android.database.Cursor), (r3v152 android.database.Cursor), (r3v152 android.database.Cursor), (r3v1 android.database.Cursor), (r3v1 android.database.Cursor) binds: [B:48:0x00e5, B:54:0x00f2, B:55:?, B:25:0x0082, B:31:0x008f, B:33:0x0093, B:34:?, B:9:0x0031, B:10:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:9:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0278 A[SYNTHETIC, Splitter:B:130:0x0278] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x027f A[Catch:{ IOException -> 0x022f, all -> 0x0df9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x028d A[Catch:{ IOException -> 0x022f, all -> 0x0df9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x03a5 A[Catch:{ IOException -> 0x022f, all -> 0x0df9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x03a7 A[Catch:{ IOException -> 0x022f, all -> 0x0df9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x03aa A[Catch:{ IOException -> 0x022f, all -> 0x0df9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x03ab A[Catch:{ IOException -> 0x022f, all -> 0x0df9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x0686 A[Catch:{ IOException -> 0x022f, all -> 0x0df9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x0704 A[ADDED_TO_REGION, Catch:{ IOException -> 0x022f, all -> 0x0df9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:361:0x0875 A[Catch:{ IOException -> 0x022f, all -> 0x0df9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:367:0x088f A[Catch:{ IOException -> 0x022f, all -> 0x0df9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:370:0x08af A[Catch:{ IOException -> 0x022f, all -> 0x0df9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:421:0x0a0a A[Catch:{ IOException -> 0x022f, all -> 0x0df9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:422:0x0a19 A[Catch:{ IOException -> 0x022f, all -> 0x0df9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:424:0x0a1c A[Catch:{ IOException -> 0x022f, all -> 0x0df9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:425:0x0a3a A[Catch:{ IOException -> 0x022f, all -> 0x0df9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:545:0x0de1 A[SYNTHETIC, Splitter:B:545:0x0de1] */
    /* JADX WARNING: Removed duplicated region for block: B:552:0x0df5 A[SYNTHETIC, Splitter:B:552:0x0df5] */
    /* JADX WARNING: Removed duplicated region for block: B:587:0x088c A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m20863a(java.lang.String r62, long r63) {
        /*
            r61 = this;
            r1 = r61
            com.google.android.gms.measurement.internal.ew r2 = r61.mo17451d()
            r2.mo17704f()
            com.google.android.gms.measurement.internal.ec$a r2 = new com.google.android.gms.measurement.internal.ec$a     // Catch:{ all -> 0x0df9 }
            r3 = 0
            r2.<init>(r1, r3)     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.ew r4 = r61.mo17451d()     // Catch:{ all -> 0x0df9 }
            long r5 = r1.f15770y     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.common.internal.C3513t.m12625a(r2)     // Catch:{ all -> 0x0df9 }
            r4.mo17144d()     // Catch:{ all -> 0x0df9 }
            r4.mo17430k()     // Catch:{ all -> 0x0df9 }
            r8 = -1
            r10 = 2
            r11 = 0
            r12 = 1
            android.database.sqlite.SQLiteDatabase r15 = r4.mo17709y()     // Catch:{ SQLiteException -> 0x0261, all -> 0x025c }
            boolean r13 = android.text.TextUtils.isEmpty(r3)     // Catch:{ SQLiteException -> 0x0261, all -> 0x025c }
            if (r13 == 0) goto L_0x00a2
            int r13 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r13 == 0) goto L_0x004b
            java.lang.String[] r13 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x0045, all -> 0x0040 }
            java.lang.String r14 = java.lang.String.valueOf(r5)     // Catch:{ SQLiteException -> 0x0045, all -> 0x0040 }
            r13[r11] = r14     // Catch:{ SQLiteException -> 0x0045, all -> 0x0040 }
            java.lang.String r14 = java.lang.String.valueOf(r63)     // Catch:{ SQLiteException -> 0x0045, all -> 0x0040 }
            r13[r12] = r14     // Catch:{ SQLiteException -> 0x0045, all -> 0x0040 }
            goto L_0x0053
        L_0x0040:
            r0 = move-exception
            r2 = r0
            r8 = r3
            goto L_0x0df3
        L_0x0045:
            r0 = move-exception
            r7 = r3
            r8 = r7
        L_0x0048:
            r3 = r0
            goto L_0x0265
        L_0x004b:
            java.lang.String[] r13 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x0261, all -> 0x025c }
            java.lang.String r14 = java.lang.String.valueOf(r63)     // Catch:{ SQLiteException -> 0x0261, all -> 0x025c }
            r13[r11] = r14     // Catch:{ SQLiteException -> 0x0261, all -> 0x025c }
        L_0x0053:
            int r14 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r14 == 0) goto L_0x005a
            java.lang.String r14 = "rowid <= ? and "
            goto L_0x005c
        L_0x005a:
            java.lang.String r14 = ""
        L_0x005c:
            r16 = 148(0x94, float:2.07E-43)
            java.lang.String r7 = java.lang.String.valueOf(r14)     // Catch:{ SQLiteException -> 0x0261, all -> 0x025c }
            int r7 = r7.length()     // Catch:{ SQLiteException -> 0x0261, all -> 0x025c }
            int r7 = r16 + r7
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0261, all -> 0x025c }
            r3.<init>(r7)     // Catch:{ SQLiteException -> 0x0261, all -> 0x025c }
            java.lang.String r7 = "select app_id, metadata_fingerprint from raw_events where "
            r3.append(r7)     // Catch:{ SQLiteException -> 0x0261, all -> 0x025c }
            r3.append(r14)     // Catch:{ SQLiteException -> 0x0261, all -> 0x025c }
            java.lang.String r7 = "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;"
            r3.append(r7)     // Catch:{ SQLiteException -> 0x0261, all -> 0x025c }
            java.lang.String r3 = r3.toString()     // Catch:{ SQLiteException -> 0x0261, all -> 0x025c }
            android.database.Cursor r3 = r15.rawQuery(r3, r13)     // Catch:{ SQLiteException -> 0x0261, all -> 0x025c }
            boolean r7 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x0257, all -> 0x0040 }
            if (r7 != 0) goto L_0x008f
            if (r3 == 0) goto L_0x027b
            r3.close()     // Catch:{ all -> 0x0df9 }
            goto L_0x027b
        L_0x008f:
            java.lang.String r7 = r3.getString(r11)     // Catch:{ SQLiteException -> 0x0257, all -> 0x0040 }
            java.lang.String r13 = r3.getString(r12)     // Catch:{ SQLiteException -> 0x009f, all -> 0x0040 }
            r3.close()     // Catch:{ SQLiteException -> 0x009f, all -> 0x0040 }
            r23 = r3
            r3 = r7
            r7 = r13
            goto L_0x00fd
        L_0x009f:
            r0 = move-exception
            r8 = r3
            goto L_0x0048
        L_0x00a2:
            int r3 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r3 == 0) goto L_0x00b2
            java.lang.String[] r3 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x0261, all -> 0x025c }
            r7 = 0
            r3[r11] = r7     // Catch:{ SQLiteException -> 0x0261, all -> 0x025c }
            java.lang.String r7 = java.lang.String.valueOf(r5)     // Catch:{ SQLiteException -> 0x0261, all -> 0x025c }
            r3[r12] = r7     // Catch:{ SQLiteException -> 0x0261, all -> 0x025c }
            goto L_0x00b7
        L_0x00b2:
            java.lang.String[] r3 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x0261, all -> 0x025c }
            r7 = 0
            r3[r11] = r7     // Catch:{ SQLiteException -> 0x0261, all -> 0x025c }
        L_0x00b7:
            int r7 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r7 == 0) goto L_0x00be
            java.lang.String r7 = " and rowid <= ?"
            goto L_0x00c0
        L_0x00be:
            java.lang.String r7 = ""
        L_0x00c0:
            r13 = 84
            java.lang.String r14 = java.lang.String.valueOf(r7)     // Catch:{ SQLiteException -> 0x0261, all -> 0x025c }
            int r14 = r14.length()     // Catch:{ SQLiteException -> 0x0261, all -> 0x025c }
            int r13 = r13 + r14
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0261, all -> 0x025c }
            r14.<init>(r13)     // Catch:{ SQLiteException -> 0x0261, all -> 0x025c }
            java.lang.String r13 = "select metadata_fingerprint from raw_events where app_id = ?"
            r14.append(r13)     // Catch:{ SQLiteException -> 0x0261, all -> 0x025c }
            r14.append(r7)     // Catch:{ SQLiteException -> 0x0261, all -> 0x025c }
            java.lang.String r7 = " order by rowid limit 1;"
            r14.append(r7)     // Catch:{ SQLiteException -> 0x0261, all -> 0x025c }
            java.lang.String r7 = r14.toString()     // Catch:{ SQLiteException -> 0x0261, all -> 0x025c }
            android.database.Cursor r3 = r15.rawQuery(r7, r3)     // Catch:{ SQLiteException -> 0x0261, all -> 0x025c }
            boolean r7 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x0257, all -> 0x0040 }
            if (r7 != 0) goto L_0x00f2
            if (r3 == 0) goto L_0x027b
            r3.close()     // Catch:{ all -> 0x0df9 }
            goto L_0x027b
        L_0x00f2:
            java.lang.String r13 = r3.getString(r11)     // Catch:{ SQLiteException -> 0x0257, all -> 0x0040 }
            r3.close()     // Catch:{ SQLiteException -> 0x0257, all -> 0x0040 }
            r23 = r3
            r7 = r13
            r3 = 0
        L_0x00fd:
            java.lang.String r14 = "raw_events_metadata"
            java.lang.String[] r13 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x0251, all -> 0x024b }
            java.lang.String r16 = "metadata"
            r13[r11] = r16     // Catch:{ SQLiteException -> 0x0251, all -> 0x024b }
            java.lang.String r16 = "app_id = ? and metadata_fingerprint = ?"
            java.lang.String[] r8 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x0251, all -> 0x024b }
            r8[r11] = r3     // Catch:{ SQLiteException -> 0x0251, all -> 0x024b }
            r8[r12] = r7     // Catch:{ SQLiteException -> 0x0251, all -> 0x024b }
            r18 = 0
            r19 = 0
            java.lang.String r20 = "rowid"
            java.lang.String r21 = "2"
            r9 = r13
            r13 = r15
            r24 = r15
            r15 = r9
            r17 = r8
            android.database.Cursor r8 = r13.query(r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ SQLiteException -> 0x0251, all -> 0x024b }
            boolean r9 = r8.moveToFirst()     // Catch:{ SQLiteException -> 0x0247 }
            if (r9 != 0) goto L_0x013e
            com.google.android.gms.measurement.internal.r r5 = r4.mo17158r()     // Catch:{ SQLiteException -> 0x0247 }
            com.google.android.gms.measurement.internal.t r5 = r5.mo17761y_()     // Catch:{ SQLiteException -> 0x0247 }
            java.lang.String r6 = "Raw event metadata record is missing. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C4893r.m21360a(r3)     // Catch:{ SQLiteException -> 0x0247 }
            r5.mo17764a(r6, r7)     // Catch:{ SQLiteException -> 0x0247 }
            if (r8 == 0) goto L_0x027b
            r8.close()     // Catch:{ all -> 0x0df9 }
            goto L_0x027b
        L_0x013e:
            byte[] r9 = r8.getBlob(r11)     // Catch:{ SQLiteException -> 0x0247 }
            int r13 = r9.length     // Catch:{ SQLiteException -> 0x0247 }
            com.google.android.gms.internal.e.gh r9 = com.google.android.gms.internal.p148e.C4622gh.m20018a(r9, r11, r13)     // Catch:{ SQLiteException -> 0x0247 }
            com.google.android.gms.internal.e.x r13 = new com.google.android.gms.internal.e.x     // Catch:{ SQLiteException -> 0x0247 }
            r13.<init>()     // Catch:{ SQLiteException -> 0x0247 }
            r13.mo16326a(r9)     // Catch:{ IOException -> 0x022f }
            boolean r9 = r8.moveToNext()     // Catch:{ SQLiteException -> 0x0247 }
            if (r9 == 0) goto L_0x0166
            com.google.android.gms.measurement.internal.r r9 = r4.mo17158r()     // Catch:{ SQLiteException -> 0x0247 }
            com.google.android.gms.measurement.internal.t r9 = r9.mo17754i()     // Catch:{ SQLiteException -> 0x0247 }
            java.lang.String r14 = "Get multiple raw event metadata records, expected one. appId"
            java.lang.Object r15 = com.google.android.gms.measurement.internal.C4893r.m21360a(r3)     // Catch:{ SQLiteException -> 0x0247 }
            r9.mo17764a(r14, r15)     // Catch:{ SQLiteException -> 0x0247 }
        L_0x0166:
            r8.close()     // Catch:{ SQLiteException -> 0x0247 }
            r2.mo17463a(r13)     // Catch:{ SQLiteException -> 0x0247 }
            r13 = -1
            int r9 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r9 == 0) goto L_0x0186
            java.lang.String r9 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?"
            r13 = 3
            java.lang.String[] r14 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x0247 }
            r14[r11] = r3     // Catch:{ SQLiteException -> 0x0247 }
            r14[r12] = r7     // Catch:{ SQLiteException -> 0x0247 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ SQLiteException -> 0x0247 }
            r14[r10] = r5     // Catch:{ SQLiteException -> 0x0247 }
            r16 = r9
            r17 = r14
            goto L_0x0192
        L_0x0186:
            java.lang.String r5 = "app_id = ? and metadata_fingerprint = ?"
            java.lang.String[] r6 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x0247 }
            r6[r11] = r3     // Catch:{ SQLiteException -> 0x0247 }
            r6[r12] = r7     // Catch:{ SQLiteException -> 0x0247 }
            r16 = r5
            r17 = r6
        L_0x0192:
            java.lang.String r14 = "raw_events"
            r5 = 4
            java.lang.String[] r15 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0247 }
            java.lang.String r5 = "rowid"
            r15[r11] = r5     // Catch:{ SQLiteException -> 0x0247 }
            java.lang.String r5 = "name"
            r15[r12] = r5     // Catch:{ SQLiteException -> 0x0247 }
            java.lang.String r5 = "timestamp"
            r15[r10] = r5     // Catch:{ SQLiteException -> 0x0247 }
            java.lang.String r5 = "data"
            r6 = 3
            r15[r6] = r5     // Catch:{ SQLiteException -> 0x0247 }
            r18 = 0
            r19 = 0
            java.lang.String r20 = "rowid"
            r21 = 0
            r13 = r24
            android.database.Cursor r5 = r13.query(r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ SQLiteException -> 0x0247 }
            boolean r6 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
            if (r6 != 0) goto L_0x01d4
            com.google.android.gms.measurement.internal.r r6 = r4.mo17158r()     // Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
            com.google.android.gms.measurement.internal.t r6 = r6.mo17754i()     // Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
            java.lang.String r7 = "Raw event data disappeared while in transaction. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C4893r.m21360a(r3)     // Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
            r6.mo17764a(r7, r8)     // Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
            if (r5 == 0) goto L_0x027b
            r5.close()     // Catch:{ all -> 0x0df9 }
            goto L_0x027b
        L_0x01d4:
            long r6 = r5.getLong(r11)     // Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
            r8 = 3
            byte[] r9 = r5.getBlob(r8)     // Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
            int r8 = r9.length     // Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
            com.google.android.gms.internal.e.gh r8 = com.google.android.gms.internal.p148e.C4622gh.m20018a(r9, r11, r8)     // Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
            com.google.android.gms.internal.e.u r9 = new com.google.android.gms.internal.e.u     // Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
            r9.<init>()     // Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
            r9.mo16326a(r8)     // Catch:{ IOException -> 0x0207 }
            java.lang.String r8 = r5.getString(r12)     // Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
            r9.f15153b = r8     // Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
            long r13 = r5.getLong(r10)     // Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
            java.lang.Long r8 = java.lang.Long.valueOf(r13)     // Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
            r9.f15154c = r8     // Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
            boolean r6 = r2.mo17464a(r6, r9)     // Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
            if (r6 != 0) goto L_0x0219
            if (r5 == 0) goto L_0x027b
            r5.close()     // Catch:{ all -> 0x0df9 }
            goto L_0x027b
        L_0x0207:
            r0 = move-exception
            com.google.android.gms.measurement.internal.r r6 = r4.mo17158r()     // Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
            com.google.android.gms.measurement.internal.t r6 = r6.mo17761y_()     // Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
            java.lang.String r7 = "Data loss. Failed to merge raw event. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C4893r.m21360a(r3)     // Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
            r6.mo17765a(r7, r8, r0)     // Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
        L_0x0219:
            boolean r6 = r5.moveToNext()     // Catch:{ SQLiteException -> 0x022a, all -> 0x0225 }
            if (r6 != 0) goto L_0x01d4
            if (r5 == 0) goto L_0x027b
            r5.close()     // Catch:{ all -> 0x0df9 }
            goto L_0x027b
        L_0x0225:
            r0 = move-exception
            r2 = r0
            r8 = r5
            goto L_0x0df3
        L_0x022a:
            r0 = move-exception
            r7 = r3
            r8 = r5
            goto L_0x0048
        L_0x022f:
            r0 = move-exception
            com.google.android.gms.measurement.internal.r r5 = r4.mo17158r()     // Catch:{ SQLiteException -> 0x0247 }
            com.google.android.gms.measurement.internal.t r5 = r5.mo17761y_()     // Catch:{ SQLiteException -> 0x0247 }
            java.lang.String r6 = "Data loss. Failed to merge raw event metadata. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C4893r.m21360a(r3)     // Catch:{ SQLiteException -> 0x0247 }
            r5.mo17765a(r6, r7, r0)     // Catch:{ SQLiteException -> 0x0247 }
            if (r8 == 0) goto L_0x027b
            r8.close()     // Catch:{ all -> 0x0df9 }
            goto L_0x027b
        L_0x0247:
            r0 = move-exception
            r7 = r3
            goto L_0x0048
        L_0x024b:
            r0 = move-exception
            r2 = r0
            r8 = r23
            goto L_0x0df3
        L_0x0251:
            r0 = move-exception
            r7 = r3
            r8 = r23
            goto L_0x0048
        L_0x0257:
            r0 = move-exception
            r8 = r3
            r7 = 0
            goto L_0x0048
        L_0x025c:
            r0 = move-exception
            r2 = r0
            r8 = 0
            goto L_0x0df3
        L_0x0261:
            r0 = move-exception
            r3 = r0
            r7 = 0
            r8 = 0
        L_0x0265:
            com.google.android.gms.measurement.internal.r r4 = r4.mo17158r()     // Catch:{ all -> 0x0df1 }
            com.google.android.gms.measurement.internal.t r4 = r4.mo17761y_()     // Catch:{ all -> 0x0df1 }
            java.lang.String r5 = "Data loss. Error selecting raw event. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C4893r.m21360a(r7)     // Catch:{ all -> 0x0df1 }
            r4.mo17765a(r5, r6, r3)     // Catch:{ all -> 0x0df1 }
            if (r8 == 0) goto L_0x027b
            r8.close()     // Catch:{ all -> 0x0df9 }
        L_0x027b:
            java.util.List<com.google.android.gms.internal.e.u> r3 = r2.f15773c     // Catch:{ all -> 0x0df9 }
            if (r3 == 0) goto L_0x028a
            java.util.List<com.google.android.gms.internal.e.u> r3 = r2.f15773c     // Catch:{ all -> 0x0df9 }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0df9 }
            if (r3 == 0) goto L_0x0288
            goto L_0x028a
        L_0x0288:
            r3 = r11
            goto L_0x028b
        L_0x028a:
            r3 = r12
        L_0x028b:
            if (r3 != 0) goto L_0x0de1
            com.google.android.gms.internal.e.x r3 = r2.f15771a     // Catch:{ all -> 0x0df9 }
            java.util.List<com.google.android.gms.internal.e.u> r4 = r2.f15773c     // Catch:{ all -> 0x0df9 }
            int r4 = r4.size()     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.internal.e.u[] r4 = new com.google.android.gms.internal.p148e.C4648u[r4]     // Catch:{ all -> 0x0df9 }
            r3.f15181b = r4     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.aw r4 = r1.f15755j     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.et r4 = r4.mo17240b()     // Catch:{ all -> 0x0df9 }
            java.lang.String r5 = r3.f15194o     // Catch:{ all -> 0x0df9 }
            boolean r4 = r4.mo17646e(r5)     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.aw r5 = r1.f15755j     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.et r5 = r5.mo17240b()     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.internal.e.x r6 = r2.f15771a     // Catch:{ all -> 0x0df9 }
            java.lang.String r6 = r6.f15194o     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.h$a<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.C4882h.f15892ao     // Catch:{ all -> 0x0df9 }
            boolean r5 = r5.mo17645d(r6, r7)     // Catch:{ all -> 0x0df9 }
            r8 = r11
            r9 = r8
            r13 = r9
            r6 = 0
            r10 = 0
            r14 = 0
        L_0x02bc:
            java.util.List<com.google.android.gms.internal.e.u> r7 = r2.f15773c     // Catch:{ all -> 0x0df9 }
            int r7 = r7.size()     // Catch:{ all -> 0x0df9 }
            r25 = r13
            if (r8 >= r7) goto L_0x0780
            java.util.List<com.google.android.gms.internal.e.u> r7 = r2.f15773c     // Catch:{ all -> 0x0df9 }
            java.lang.Object r7 = r7.get(r8)     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.internal.e.u r7 = (com.google.android.gms.internal.p148e.C4648u) r7     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.aq r12 = r61.m20871s()     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.internal.e.x r13 = r2.f15771a     // Catch:{ all -> 0x0df9 }
            java.lang.String r13 = r13.f15194o     // Catch:{ all -> 0x0df9 }
            java.lang.String r11 = r7.f15153b     // Catch:{ all -> 0x0df9 }
            boolean r11 = r12.mo17206b(r13, r11)     // Catch:{ all -> 0x0df9 }
            if (r11 == 0) goto L_0x0353
            com.google.android.gms.measurement.internal.aw r11 = r1.f15755j     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.r r11 = r11.mo17158r()     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.t r11 = r11.mo17754i()     // Catch:{ all -> 0x0df9 }
            java.lang.String r12 = "Dropping blacklisted raw event. appId"
            com.google.android.gms.internal.e.x r13 = r2.f15771a     // Catch:{ all -> 0x0df9 }
            java.lang.String r13 = r13.f15194o     // Catch:{ all -> 0x0df9 }
            java.lang.Object r13 = com.google.android.gms.measurement.internal.C4893r.m21360a(r13)     // Catch:{ all -> 0x0df9 }
            r26 = r9
            com.google.android.gms.measurement.internal.aw r9 = r1.f15755j     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.p r9 = r9.mo17249k()     // Catch:{ all -> 0x0df9 }
            r27 = r8
            java.lang.String r8 = r7.f15153b     // Catch:{ all -> 0x0df9 }
            java.lang.String r8 = r9.mo17746a(r8)     // Catch:{ all -> 0x0df9 }
            r11.mo17765a(r12, r13, r8)     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.aq r8 = r61.m20871s()     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.internal.e.x r9 = r2.f15771a     // Catch:{ all -> 0x0df9 }
            java.lang.String r9 = r9.f15194o     // Catch:{ all -> 0x0df9 }
            boolean r8 = r8.mo17213f(r9)     // Catch:{ all -> 0x0df9 }
            if (r8 != 0) goto L_0x0324
            com.google.android.gms.measurement.internal.aq r8 = r61.m20871s()     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.internal.e.x r9 = r2.f15771a     // Catch:{ all -> 0x0df9 }
            java.lang.String r9 = r9.f15194o     // Catch:{ all -> 0x0df9 }
            boolean r8 = r8.mo17215g(r9)     // Catch:{ all -> 0x0df9 }
            if (r8 == 0) goto L_0x0322
            goto L_0x0324
        L_0x0322:
            r8 = 0
            goto L_0x0325
        L_0x0324:
            r8 = 1
        L_0x0325:
            if (r8 != 0) goto L_0x034a
            java.lang.String r8 = "_err"
            java.lang.String r9 = r7.f15153b     // Catch:{ all -> 0x0df9 }
            boolean r8 = r8.equals(r9)     // Catch:{ all -> 0x0df9 }
            if (r8 != 0) goto L_0x034a
            com.google.android.gms.measurement.internal.aw r8 = r1.f15755j     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.el r16 = r8.mo17248j()     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.internal.e.x r8 = r2.f15771a     // Catch:{ all -> 0x0df9 }
            java.lang.String r8 = r8.f15194o     // Catch:{ all -> 0x0df9 }
            r18 = 11
            java.lang.String r19 = "_ev"
            java.lang.String r7 = r7.f15153b     // Catch:{ all -> 0x0df9 }
            r21 = 0
            r17 = r8
            r20 = r7
            r16.mo17492a(r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0df9 }
        L_0x034a:
            r8 = r2
            r2 = r3
            r13 = r25
            r9 = r26
            r12 = 3
            goto L_0x0774
        L_0x0353:
            r27 = r8
            r26 = r9
            com.google.android.gms.measurement.internal.aq r8 = r61.m20871s()     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.internal.e.x r9 = r2.f15771a     // Catch:{ all -> 0x0df9 }
            java.lang.String r9 = r9.f15194o     // Catch:{ all -> 0x0df9 }
            java.lang.String r11 = r7.f15153b     // Catch:{ all -> 0x0df9 }
            boolean r8 = r8.mo17208c(r9, r11)     // Catch:{ all -> 0x0df9 }
            if (r8 != 0) goto L_0x03b1
            r61.mo17455g()     // Catch:{ all -> 0x0df9 }
            java.lang.String r11 = r7.f15153b     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.common.internal.C3513t.m12627a(r11)     // Catch:{ all -> 0x0df9 }
            int r12 = r11.hashCode()     // Catch:{ all -> 0x0df9 }
            r13 = 94660(0x171c4, float:1.32647E-40)
            if (r12 == r13) goto L_0x0397
            r13 = 95025(0x17331, float:1.33158E-40)
            if (r12 == r13) goto L_0x038d
            r13 = 95027(0x17333, float:1.33161E-40)
            if (r12 == r13) goto L_0x0383
            goto L_0x03a1
        L_0x0383:
            java.lang.String r12 = "_ui"
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0df9 }
            if (r11 == 0) goto L_0x03a1
            r11 = 1
            goto L_0x03a2
        L_0x038d:
            java.lang.String r12 = "_ug"
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0df9 }
            if (r11 == 0) goto L_0x03a1
            r11 = 2
            goto L_0x03a2
        L_0x0397:
            java.lang.String r12 = "_in"
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0df9 }
            if (r11 == 0) goto L_0x03a1
            r11 = 0
            goto L_0x03a2
        L_0x03a1:
            r11 = -1
        L_0x03a2:
            switch(r11) {
                case 0: goto L_0x03a7;
                case 1: goto L_0x03a7;
                case 2: goto L_0x03a7;
                default: goto L_0x03a5;
            }     // Catch:{ all -> 0x0df9 }
        L_0x03a5:
            r11 = 0
            goto L_0x03a8
        L_0x03a7:
            r11 = 1
        L_0x03a8:
            if (r11 == 0) goto L_0x03ab
            goto L_0x03b1
        L_0x03ab:
            r31 = r3
            r41 = r14
            goto L_0x05b3
        L_0x03b1:
            com.google.android.gms.internal.e.v[] r11 = r7.f15152a     // Catch:{ all -> 0x0df9 }
            if (r11 != 0) goto L_0x03ba
            r11 = 0
            com.google.android.gms.internal.e.v[] r12 = new com.google.android.gms.internal.p148e.C4649v[r11]     // Catch:{ all -> 0x0df9 }
            r7.f15152a = r12     // Catch:{ all -> 0x0df9 }
        L_0x03ba:
            com.google.android.gms.internal.e.v[] r11 = r7.f15152a     // Catch:{ all -> 0x0df9 }
            int r12 = r11.length     // Catch:{ all -> 0x0df9 }
            r13 = 0
            r16 = 0
            r17 = 0
        L_0x03c2:
            if (r13 >= r12) goto L_0x0400
            r9 = r11[r13]     // Catch:{ all -> 0x0df9 }
            r29 = r11
            java.lang.String r11 = "_c"
            r30 = r12
            java.lang.String r12 = r9.f15158a     // Catch:{ all -> 0x0df9 }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0df9 }
            if (r11 == 0) goto L_0x03e1
            r31 = r3
            r11 = 1
            java.lang.Long r3 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0df9 }
            r9.f15160c = r3     // Catch:{ all -> 0x0df9 }
            r16 = 1
            goto L_0x03f7
        L_0x03e1:
            r31 = r3
            java.lang.String r3 = "_r"
            java.lang.String r11 = r9.f15158a     // Catch:{ all -> 0x0df9 }
            boolean r3 = r3.equals(r11)     // Catch:{ all -> 0x0df9 }
            if (r3 == 0) goto L_0x03f7
            r11 = 1
            java.lang.Long r3 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0df9 }
            r9.f15160c = r3     // Catch:{ all -> 0x0df9 }
            r17 = 1
        L_0x03f7:
            int r13 = r13 + 1
            r11 = r29
            r12 = r30
            r3 = r31
            goto L_0x03c2
        L_0x0400:
            r31 = r3
            if (r16 != 0) goto L_0x0446
            if (r8 == 0) goto L_0x0446
            com.google.android.gms.measurement.internal.aw r3 = r1.f15755j     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.r r3 = r3.mo17158r()     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.t r3 = r3.mo17759x()     // Catch:{ all -> 0x0df9 }
            java.lang.String r9 = "Marking event as conversion"
            com.google.android.gms.measurement.internal.aw r11 = r1.f15755j     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.p r11 = r11.mo17249k()     // Catch:{ all -> 0x0df9 }
            java.lang.String r12 = r7.f15153b     // Catch:{ all -> 0x0df9 }
            java.lang.String r11 = r11.mo17746a(r12)     // Catch:{ all -> 0x0df9 }
            r3.mo17764a(r9, r11)     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.internal.e.v[] r3 = r7.f15152a     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.internal.e.v[] r9 = r7.f15152a     // Catch:{ all -> 0x0df9 }
            int r9 = r9.length     // Catch:{ all -> 0x0df9 }
            r11 = 1
            int r9 = r9 + r11
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r9)     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.internal.e.v[] r3 = (com.google.android.gms.internal.p148e.C4649v[]) r3     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.internal.e.v r9 = new com.google.android.gms.internal.e.v     // Catch:{ all -> 0x0df9 }
            r9.<init>()     // Catch:{ all -> 0x0df9 }
            java.lang.String r11 = "_c"
            r9.f15158a = r11     // Catch:{ all -> 0x0df9 }
            r11 = 1
            java.lang.Long r13 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0df9 }
            r9.f15160c = r13     // Catch:{ all -> 0x0df9 }
            int r11 = r3.length     // Catch:{ all -> 0x0df9 }
            r12 = 1
            int r11 = r11 - r12
            r3[r11] = r9     // Catch:{ all -> 0x0df9 }
            r7.f15152a = r3     // Catch:{ all -> 0x0df9 }
        L_0x0446:
            if (r17 != 0) goto L_0x0488
            com.google.android.gms.measurement.internal.aw r3 = r1.f15755j     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.r r3 = r3.mo17158r()     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.t r3 = r3.mo17759x()     // Catch:{ all -> 0x0df9 }
            java.lang.String r9 = "Marking event as real-time"
            com.google.android.gms.measurement.internal.aw r11 = r1.f15755j     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.p r11 = r11.mo17249k()     // Catch:{ all -> 0x0df9 }
            java.lang.String r12 = r7.f15153b     // Catch:{ all -> 0x0df9 }
            java.lang.String r11 = r11.mo17746a(r12)     // Catch:{ all -> 0x0df9 }
            r3.mo17764a(r9, r11)     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.internal.e.v[] r3 = r7.f15152a     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.internal.e.v[] r9 = r7.f15152a     // Catch:{ all -> 0x0df9 }
            int r9 = r9.length     // Catch:{ all -> 0x0df9 }
            r11 = 1
            int r9 = r9 + r11
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r9)     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.internal.e.v[] r3 = (com.google.android.gms.internal.p148e.C4649v[]) r3     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.internal.e.v r9 = new com.google.android.gms.internal.e.v     // Catch:{ all -> 0x0df9 }
            r9.<init>()     // Catch:{ all -> 0x0df9 }
            java.lang.String r11 = "_r"
            r9.f15158a = r11     // Catch:{ all -> 0x0df9 }
            r11 = 1
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0df9 }
            r9.f15160c = r11     // Catch:{ all -> 0x0df9 }
            int r11 = r3.length     // Catch:{ all -> 0x0df9 }
            r12 = 1
            int r11 = r11 - r12
            r3[r11] = r9     // Catch:{ all -> 0x0df9 }
            r7.f15152a = r3     // Catch:{ all -> 0x0df9 }
        L_0x0488:
            com.google.android.gms.measurement.internal.ew r32 = r61.mo17451d()     // Catch:{ all -> 0x0df9 }
            long r33 = r61.m20875x()     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.internal.e.x r3 = r2.f15771a     // Catch:{ all -> 0x0df9 }
            java.lang.String r3 = r3.f15194o     // Catch:{ all -> 0x0df9 }
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 1
            r35 = r3
            com.google.android.gms.measurement.internal.ex r3 = r32.mo17678a(r33, r35, r36, r37, r38, r39, r40)     // Catch:{ all -> 0x0df9 }
            long r11 = r3.f15842e     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.aw r3 = r1.f15755j     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.et r3 = r3.mo17240b()     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.internal.e.x r9 = r2.f15771a     // Catch:{ all -> 0x0df9 }
            java.lang.String r9 = r9.f15194o     // Catch:{ all -> 0x0df9 }
            int r3 = r3.mo17636a(r9)     // Catch:{ all -> 0x0df9 }
            r41 = r14
            long r13 = (long) r3     // Catch:{ all -> 0x0df9 }
            int r3 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r3 <= 0) goto L_0x04f3
            r3 = 0
        L_0x04bc:
            com.google.android.gms.internal.e.v[] r9 = r7.f15152a     // Catch:{ all -> 0x0df9 }
            int r9 = r9.length     // Catch:{ all -> 0x0df9 }
            if (r3 >= r9) goto L_0x04f0
            java.lang.String r9 = "_r"
            com.google.android.gms.internal.e.v[] r11 = r7.f15152a     // Catch:{ all -> 0x0df9 }
            r11 = r11[r3]     // Catch:{ all -> 0x0df9 }
            java.lang.String r11 = r11.f15158a     // Catch:{ all -> 0x0df9 }
            boolean r9 = r9.equals(r11)     // Catch:{ all -> 0x0df9 }
            if (r9 == 0) goto L_0x04ed
            com.google.android.gms.internal.e.v[] r9 = r7.f15152a     // Catch:{ all -> 0x0df9 }
            int r9 = r9.length     // Catch:{ all -> 0x0df9 }
            r11 = 1
            int r9 = r9 - r11
            com.google.android.gms.internal.e.v[] r9 = new com.google.android.gms.internal.p148e.C4649v[r9]     // Catch:{ all -> 0x0df9 }
            if (r3 <= 0) goto L_0x04de
            com.google.android.gms.internal.e.v[] r11 = r7.f15152a     // Catch:{ all -> 0x0df9 }
            r12 = 0
            java.lang.System.arraycopy(r11, r12, r9, r12, r3)     // Catch:{ all -> 0x0df9 }
        L_0x04de:
            int r11 = r9.length     // Catch:{ all -> 0x0df9 }
            if (r3 >= r11) goto L_0x04ea
            com.google.android.gms.internal.e.v[] r11 = r7.f15152a     // Catch:{ all -> 0x0df9 }
            int r12 = r3 + 1
            int r13 = r9.length     // Catch:{ all -> 0x0df9 }
            int r13 = r13 - r3
            java.lang.System.arraycopy(r11, r12, r9, r3, r13)     // Catch:{ all -> 0x0df9 }
        L_0x04ea:
            r7.f15152a = r9     // Catch:{ all -> 0x0df9 }
            goto L_0x04f0
        L_0x04ed:
            int r3 = r3 + 1
            goto L_0x04bc
        L_0x04f0:
            r9 = r26
            goto L_0x04f4
        L_0x04f3:
            r9 = 1
        L_0x04f4:
            java.lang.String r3 = r7.f15153b     // Catch:{ all -> 0x0df9 }
            boolean r3 = com.google.android.gms.measurement.internal.C4862el.m20968a(r3)     // Catch:{ all -> 0x0df9 }
            if (r3 == 0) goto L_0x05af
            if (r8 == 0) goto L_0x05af
            com.google.android.gms.measurement.internal.ew r11 = r61.mo17451d()     // Catch:{ all -> 0x0df9 }
            long r12 = r61.m20875x()     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.internal.e.x r3 = r2.f15771a     // Catch:{ all -> 0x0df9 }
            java.lang.String r14 = r3.f15194o     // Catch:{ all -> 0x0df9 }
            r15 = 0
            r16 = 0
            r17 = 1
            r18 = 0
            r19 = 0
            com.google.android.gms.measurement.internal.ex r3 = r11.mo17678a(r12, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0df9 }
            long r11 = r3.f15840c     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.aw r3 = r1.f15755j     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.et r3 = r3.mo17240b()     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.internal.e.x r13 = r2.f15771a     // Catch:{ all -> 0x0df9 }
            java.lang.String r13 = r13.f15194o     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.h$a<java.lang.Integer> r14 = com.google.android.gms.measurement.internal.C4882h.f15924v     // Catch:{ all -> 0x0df9 }
            int r3 = r3.mo17640b(r13, r14)     // Catch:{ all -> 0x0df9 }
            long r13 = (long) r3     // Catch:{ all -> 0x0df9 }
            int r3 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r3 <= 0) goto L_0x05af
            com.google.android.gms.measurement.internal.aw r3 = r1.f15755j     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.r r3 = r3.mo17158r()     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.t r3 = r3.mo17754i()     // Catch:{ all -> 0x0df9 }
            java.lang.String r11 = "Too many conversions. Not logging as conversion. appId"
            com.google.android.gms.internal.e.x r12 = r2.f15771a     // Catch:{ all -> 0x0df9 }
            java.lang.String r12 = r12.f15194o     // Catch:{ all -> 0x0df9 }
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C4893r.m21360a(r12)     // Catch:{ all -> 0x0df9 }
            r3.mo17764a(r11, r12)     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.internal.e.v[] r3 = r7.f15152a     // Catch:{ all -> 0x0df9 }
            int r11 = r3.length     // Catch:{ all -> 0x0df9 }
            r12 = 0
            r13 = 0
            r14 = 0
        L_0x054b:
            if (r12 >= r11) goto L_0x0571
            r15 = r3[r12]     // Catch:{ all -> 0x0df9 }
            r43 = r3
            java.lang.String r3 = "_c"
            r44 = r9
            java.lang.String r9 = r15.f15158a     // Catch:{ all -> 0x0df9 }
            boolean r3 = r3.equals(r9)     // Catch:{ all -> 0x0df9 }
            if (r3 == 0) goto L_0x055f
            r14 = r15
            goto L_0x056a
        L_0x055f:
            java.lang.String r3 = "_err"
            java.lang.String r9 = r15.f15158a     // Catch:{ all -> 0x0df9 }
            boolean r3 = r3.equals(r9)     // Catch:{ all -> 0x0df9 }
            if (r3 == 0) goto L_0x056a
            r13 = 1
        L_0x056a:
            int r12 = r12 + 1
            r3 = r43
            r9 = r44
            goto L_0x054b
        L_0x0571:
            r44 = r9
            if (r13 == 0) goto L_0x0588
            if (r14 == 0) goto L_0x0588
            com.google.android.gms.internal.e.v[] r3 = r7.f15152a     // Catch:{ all -> 0x0df9 }
            r9 = 1
            com.google.android.gms.internal.e.v[] r11 = new com.google.android.gms.internal.p148e.C4649v[r9]     // Catch:{ all -> 0x0df9 }
            r9 = 0
            r11[r9] = r14     // Catch:{ all -> 0x0df9 }
            java.lang.Object[] r3 = com.google.android.gms.common.util.C3550b.m12725a((T[]) r3, (T[]) r11)     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.internal.e.v[] r3 = (com.google.android.gms.internal.p148e.C4649v[]) r3     // Catch:{ all -> 0x0df9 }
            r7.f15152a = r3     // Catch:{ all -> 0x0df9 }
            goto L_0x05b1
        L_0x0588:
            if (r14 == 0) goto L_0x0597
            java.lang.String r3 = "_err"
            r14.f15158a = r3     // Catch:{ all -> 0x0df9 }
            r11 = 10
            java.lang.Long r3 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0df9 }
            r14.f15160c = r3     // Catch:{ all -> 0x0df9 }
            goto L_0x05b1
        L_0x0597:
            com.google.android.gms.measurement.internal.aw r3 = r1.f15755j     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.r r3 = r3.mo17158r()     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.t r3 = r3.mo17761y_()     // Catch:{ all -> 0x0df9 }
            java.lang.String r9 = "Did not find conversion parameter. appId"
            com.google.android.gms.internal.e.x r11 = r2.f15771a     // Catch:{ all -> 0x0df9 }
            java.lang.String r11 = r11.f15194o     // Catch:{ all -> 0x0df9 }
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C4893r.m21360a(r11)     // Catch:{ all -> 0x0df9 }
            r3.mo17764a(r9, r11)     // Catch:{ all -> 0x0df9 }
            goto L_0x05b1
        L_0x05af:
            r44 = r9
        L_0x05b1:
            r26 = r44
        L_0x05b3:
            com.google.android.gms.measurement.internal.aw r3 = r1.f15755j     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.et r3 = r3.mo17240b()     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.internal.e.x r9 = r2.f15771a     // Catch:{ all -> 0x0df9 }
            java.lang.String r9 = r9.f15194o     // Catch:{ all -> 0x0df9 }
            boolean r3 = r3.mo17658m(r9)     // Catch:{ all -> 0x0df9 }
            if (r3 == 0) goto L_0x0673
            if (r8 == 0) goto L_0x0673
            com.google.android.gms.internal.e.v[] r3 = r7.f15152a     // Catch:{ all -> 0x0df9 }
            r8 = 0
            r9 = -1
            r11 = -1
        L_0x05ca:
            int r12 = r3.length     // Catch:{ all -> 0x0df9 }
            if (r8 >= r12) goto L_0x05eb
            java.lang.String r12 = "value"
            r13 = r3[r8]     // Catch:{ all -> 0x0df9 }
            java.lang.String r13 = r13.f15158a     // Catch:{ all -> 0x0df9 }
            boolean r12 = r12.equals(r13)     // Catch:{ all -> 0x0df9 }
            if (r12 == 0) goto L_0x05db
            r9 = r8
            goto L_0x05e8
        L_0x05db:
            java.lang.String r12 = "currency"
            r13 = r3[r8]     // Catch:{ all -> 0x0df9 }
            java.lang.String r13 = r13.f15158a     // Catch:{ all -> 0x0df9 }
            boolean r12 = r12.equals(r13)     // Catch:{ all -> 0x0df9 }
            if (r12 == 0) goto L_0x05e8
            r11 = r8
        L_0x05e8:
            int r8 = r8 + 1
            goto L_0x05ca
        L_0x05eb:
            r8 = -1
            if (r9 == r8) goto L_0x061b
            r8 = r3[r9]     // Catch:{ all -> 0x0df9 }
            java.lang.Long r8 = r8.f15160c     // Catch:{ all -> 0x0df9 }
            if (r8 != 0) goto L_0x061d
            r8 = r3[r9]     // Catch:{ all -> 0x0df9 }
            java.lang.Double r8 = r8.f15161d     // Catch:{ all -> 0x0df9 }
            if (r8 != 0) goto L_0x061d
            com.google.android.gms.measurement.internal.aw r8 = r1.f15755j     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.r r8 = r8.mo17158r()     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.t r8 = r8.mo17756k()     // Catch:{ all -> 0x0df9 }
            java.lang.String r11 = "Value must be specified with a numeric type."
            r8.mo17763a(r11)     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.internal.e.v[] r3 = m20864a(r3, r9)     // Catch:{ all -> 0x0df9 }
            java.lang.String r8 = "_c"
            com.google.android.gms.internal.e.v[] r3 = m20866a(r3, r8)     // Catch:{ all -> 0x0df9 }
            r8 = 18
            java.lang.String r9 = "value"
            com.google.android.gms.internal.e.v[] r3 = m20865a(r3, r8, r9)     // Catch:{ all -> 0x0df9 }
        L_0x061b:
            r12 = 3
            goto L_0x0670
        L_0x061d:
            r8 = -1
            if (r11 != r8) goto L_0x0623
            r8 = 1
            r12 = 3
            goto L_0x064d
        L_0x0623:
            r8 = r3[r11]     // Catch:{ all -> 0x0df9 }
            java.lang.String r8 = r8.f15159b     // Catch:{ all -> 0x0df9 }
            if (r8 == 0) goto L_0x064b
            int r11 = r8.length()     // Catch:{ all -> 0x0df9 }
            r12 = 3
            if (r11 == r12) goto L_0x0631
            goto L_0x064c
        L_0x0631:
            r11 = 0
        L_0x0632:
            int r13 = r8.length()     // Catch:{ all -> 0x0df9 }
            if (r11 >= r13) goto L_0x0649
            int r13 = r8.codePointAt(r11)     // Catch:{ all -> 0x0df9 }
            boolean r14 = java.lang.Character.isLetter(r13)     // Catch:{ all -> 0x0df9 }
            if (r14 != 0) goto L_0x0643
            goto L_0x064c
        L_0x0643:
            int r13 = java.lang.Character.charCount(r13)     // Catch:{ all -> 0x0df9 }
            int r11 = r11 + r13
            goto L_0x0632
        L_0x0649:
            r8 = 0
            goto L_0x064d
        L_0x064b:
            r12 = 3
        L_0x064c:
            r8 = 1
        L_0x064d:
            if (r8 == 0) goto L_0x0670
            com.google.android.gms.measurement.internal.aw r8 = r1.f15755j     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.r r8 = r8.mo17158r()     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.t r8 = r8.mo17756k()     // Catch:{ all -> 0x0df9 }
            java.lang.String r11 = "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."
            r8.mo17763a(r11)     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.internal.e.v[] r3 = m20864a(r3, r9)     // Catch:{ all -> 0x0df9 }
            java.lang.String r8 = "_c"
            com.google.android.gms.internal.e.v[] r3 = m20866a(r3, r8)     // Catch:{ all -> 0x0df9 }
            r8 = 19
            java.lang.String r9 = "currency"
            com.google.android.gms.internal.e.v[] r3 = m20865a(r3, r8, r9)     // Catch:{ all -> 0x0df9 }
        L_0x0670:
            r7.f15152a = r3     // Catch:{ all -> 0x0df9 }
            goto L_0x0674
        L_0x0673:
            r12 = 3
        L_0x0674:
            com.google.android.gms.measurement.internal.aw r3 = r1.f15755j     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.et r3 = r3.mo17240b()     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.internal.e.x r8 = r2.f15771a     // Catch:{ all -> 0x0df9 }
            java.lang.String r8 = r8.f15194o     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.h$a<java.lang.Boolean> r9 = com.google.android.gms.measurement.internal.C4882h.f15891an     // Catch:{ all -> 0x0df9 }
            boolean r3 = r3.mo17645d(r8, r9)     // Catch:{ all -> 0x0df9 }
            if (r3 == 0) goto L_0x0700
            java.lang.String r3 = "_e"
            java.lang.String r8 = r7.f15153b     // Catch:{ all -> 0x0df9 }
            boolean r3 = r3.equals(r8)     // Catch:{ all -> 0x0df9 }
            if (r3 == 0) goto L_0x06c4
            r61.mo17455g()     // Catch:{ all -> 0x0df9 }
            java.lang.String r3 = "_fr"
            com.google.android.gms.internal.e.v r3 = com.google.android.gms.measurement.internal.C4859ei.m20919a(r7, r3)     // Catch:{ all -> 0x0df9 }
            if (r3 != 0) goto L_0x0700
            if (r6 == 0) goto L_0x06c0
            java.lang.Long r3 = r6.f15154c     // Catch:{ all -> 0x0df9 }
            long r10 = r3.longValue()     // Catch:{ all -> 0x0df9 }
            java.lang.Long r3 = r7.f15154c     // Catch:{ all -> 0x0df9 }
            long r13 = r3.longValue()     // Catch:{ all -> 0x0df9 }
            long r8 = r10 - r13
            long r8 = java.lang.Math.abs(r8)     // Catch:{ all -> 0x0df9 }
            r10 = 1000(0x3e8, double:4.94E-321)
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r3 > 0) goto L_0x06c0
            boolean r3 = r1.m20862a(r7, r6)     // Catch:{ all -> 0x0df9 }
            if (r3 == 0) goto L_0x06c0
            r45 = r2
        L_0x06bd:
            r6 = 0
            r10 = 0
            goto L_0x0702
        L_0x06c0:
            r45 = r2
            r10 = r7
            goto L_0x0702
        L_0x06c4:
            java.lang.String r3 = "_vs"
            java.lang.String r8 = r7.f15153b     // Catch:{ all -> 0x0df9 }
            boolean r3 = r3.equals(r8)     // Catch:{ all -> 0x0df9 }
            if (r3 == 0) goto L_0x0700
            r61.mo17455g()     // Catch:{ all -> 0x0df9 }
            java.lang.String r3 = "_et"
            com.google.android.gms.internal.e.v r3 = com.google.android.gms.measurement.internal.C4859ei.m20919a(r7, r3)     // Catch:{ all -> 0x0df9 }
            if (r3 != 0) goto L_0x0700
            if (r10 == 0) goto L_0x06fc
            java.lang.Long r3 = r10.f15154c     // Catch:{ all -> 0x0df9 }
            long r8 = r3.longValue()     // Catch:{ all -> 0x0df9 }
            java.lang.Long r3 = r7.f15154c     // Catch:{ all -> 0x0df9 }
            long r13 = r3.longValue()     // Catch:{ all -> 0x0df9 }
            r45 = r2
            long r2 = r8 - r13
            long r2 = java.lang.Math.abs(r2)     // Catch:{ all -> 0x0df9 }
            r8 = 1000(0x3e8, double:4.94E-321)
            int r6 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r6 > 0) goto L_0x06fe
            boolean r2 = r1.m20862a(r10, r7)     // Catch:{ all -> 0x0df9 }
            if (r2 == 0) goto L_0x06fe
            goto L_0x06bd
        L_0x06fc:
            r45 = r2
        L_0x06fe:
            r6 = r7
            goto L_0x0702
        L_0x0700:
            r45 = r2
        L_0x0702:
            if (r4 == 0) goto L_0x0766
            if (r5 != 0) goto L_0x0766
            java.lang.String r2 = "_e"
            java.lang.String r3 = r7.f15153b     // Catch:{ all -> 0x0df9 }
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0df9 }
            if (r2 == 0) goto L_0x0766
            com.google.android.gms.internal.e.v[] r2 = r7.f15152a     // Catch:{ all -> 0x0df9 }
            if (r2 == 0) goto L_0x074c
            com.google.android.gms.internal.e.v[] r2 = r7.f15152a     // Catch:{ all -> 0x0df9 }
            int r2 = r2.length     // Catch:{ all -> 0x0df9 }
            if (r2 != 0) goto L_0x071a
            goto L_0x074c
        L_0x071a:
            r61.mo17455g()     // Catch:{ all -> 0x0df9 }
            java.lang.String r2 = "_et"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C4859ei.m20929b(r7, r2)     // Catch:{ all -> 0x0df9 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ all -> 0x0df9 }
            if (r2 != 0) goto L_0x0741
            com.google.android.gms.measurement.internal.aw r2 = r1.f15755j     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.r r2 = r2.mo17158r()     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.t r2 = r2.mo17754i()     // Catch:{ all -> 0x0df9 }
            java.lang.String r3 = "Engagement event does not include duration. appId"
            r8 = r45
            com.google.android.gms.internal.e.x r9 = r8.f15771a     // Catch:{ all -> 0x0df9 }
            java.lang.String r9 = r9.f15194o     // Catch:{ all -> 0x0df9 }
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C4893r.m21360a(r9)     // Catch:{ all -> 0x0df9 }
            r2.mo17764a(r3, r9)     // Catch:{ all -> 0x0df9 }
            goto L_0x0768
        L_0x0741:
            r8 = r45
            long r2 = r2.longValue()     // Catch:{ all -> 0x0df9 }
            long r14 = r41 + r2
            r2 = r31
            goto L_0x076c
        L_0x074c:
            r8 = r45
            com.google.android.gms.measurement.internal.aw r2 = r1.f15755j     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.r r2 = r2.mo17158r()     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.t r2 = r2.mo17754i()     // Catch:{ all -> 0x0df9 }
            java.lang.String r3 = "Engagement event does not contain any parameters. appId"
            com.google.android.gms.internal.e.x r9 = r8.f15771a     // Catch:{ all -> 0x0df9 }
            java.lang.String r9 = r9.f15194o     // Catch:{ all -> 0x0df9 }
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C4893r.m21360a(r9)     // Catch:{ all -> 0x0df9 }
            r2.mo17764a(r3, r9)     // Catch:{ all -> 0x0df9 }
            goto L_0x0768
        L_0x0766:
            r8 = r45
        L_0x0768:
            r2 = r31
            r14 = r41
        L_0x076c:
            com.google.android.gms.internal.e.u[] r3 = r2.f15181b     // Catch:{ all -> 0x0df9 }
            int r13 = r25 + 1
            r3[r25] = r7     // Catch:{ all -> 0x0df9 }
            r9 = r26
        L_0x0774:
            int r3 = r27 + 1
            r11 = 0
            r12 = 1
            r60 = r3
            r3 = r2
            r2 = r8
            r8 = r60
            goto L_0x02bc
        L_0x0780:
            r8 = r2
            r2 = r3
            r26 = r9
            r41 = r14
            if (r5 == 0) goto L_0x07df
            r13 = r25
            r14 = r41
            r3 = 0
        L_0x078d:
            if (r3 >= r13) goto L_0x07e3
            com.google.android.gms.internal.e.u[] r5 = r2.f15181b     // Catch:{ all -> 0x0df9 }
            r5 = r5[r3]     // Catch:{ all -> 0x0df9 }
            java.lang.String r6 = "_e"
            java.lang.String r7 = r5.f15153b     // Catch:{ all -> 0x0df9 }
            boolean r6 = r6.equals(r7)     // Catch:{ all -> 0x0df9 }
            if (r6 == 0) goto L_0x07ba
            r61.mo17455g()     // Catch:{ all -> 0x0df9 }
            java.lang.String r6 = "_fr"
            com.google.android.gms.internal.e.v r6 = com.google.android.gms.measurement.internal.C4859ei.m20919a(r5, r6)     // Catch:{ all -> 0x0df9 }
            if (r6 == 0) goto L_0x07ba
            com.google.android.gms.internal.e.u[] r5 = r2.f15181b     // Catch:{ all -> 0x0df9 }
            int r6 = r3 + 1
            com.google.android.gms.internal.e.u[] r7 = r2.f15181b     // Catch:{ all -> 0x0df9 }
            int r9 = r13 - r3
            r10 = 1
            int r9 = r9 - r10
            java.lang.System.arraycopy(r5, r6, r7, r3, r9)     // Catch:{ all -> 0x0df9 }
            int r13 = r13 + -1
            int r3 = r3 + -1
            goto L_0x07dc
        L_0x07ba:
            if (r4 == 0) goto L_0x07dc
            r61.mo17455g()     // Catch:{ all -> 0x0df9 }
            java.lang.String r6 = "_et"
            com.google.android.gms.internal.e.v r5 = com.google.android.gms.measurement.internal.C4859ei.m20919a(r5, r6)     // Catch:{ all -> 0x0df9 }
            if (r5 == 0) goto L_0x07dc
            java.lang.Long r5 = r5.f15160c     // Catch:{ all -> 0x0df9 }
            if (r5 == 0) goto L_0x07dc
            long r6 = r5.longValue()     // Catch:{ all -> 0x0df9 }
            r9 = 0
            int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x07dc
            long r5 = r5.longValue()     // Catch:{ all -> 0x0df9 }
            long r9 = r14 + r5
            r14 = r9
        L_0x07dc:
            r5 = 1
            int r3 = r3 + r5
            goto L_0x078d
        L_0x07df:
            r13 = r25
            r14 = r41
        L_0x07e3:
            java.util.List<com.google.android.gms.internal.e.u> r3 = r8.f15773c     // Catch:{ all -> 0x0df9 }
            int r3 = r3.size()     // Catch:{ all -> 0x0df9 }
            if (r13 >= r3) goto L_0x07f5
            com.google.android.gms.internal.e.u[] r3 = r2.f15181b     // Catch:{ all -> 0x0df9 }
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r13)     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.internal.e.u[] r3 = (com.google.android.gms.internal.p148e.C4648u[]) r3     // Catch:{ all -> 0x0df9 }
            r2.f15181b = r3     // Catch:{ all -> 0x0df9 }
        L_0x07f5:
            if (r4 == 0) goto L_0x08c7
            com.google.android.gms.measurement.internal.ew r3 = r61.mo17451d()     // Catch:{ all -> 0x0df9 }
            java.lang.String r4 = r2.f15194o     // Catch:{ all -> 0x0df9 }
            java.lang.String r5 = "_lte"
            com.google.android.gms.measurement.internal.ek r3 = r3.mo17697c(r4, r5)     // Catch:{ all -> 0x0df9 }
            if (r3 == 0) goto L_0x0833
            java.lang.Object r4 = r3.f15788e     // Catch:{ all -> 0x0df9 }
            if (r4 != 0) goto L_0x080a
            goto L_0x0833
        L_0x080a:
            com.google.android.gms.measurement.internal.ek r4 = new com.google.android.gms.measurement.internal.ek     // Catch:{ all -> 0x0df9 }
            java.lang.String r5 = r2.f15194o     // Catch:{ all -> 0x0df9 }
            java.lang.String r18 = "auto"
            java.lang.String r19 = "_lte"
            com.google.android.gms.measurement.internal.aw r6 = r1.f15755j     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.common.util.e r6 = r6.mo17153m()     // Catch:{ all -> 0x0df9 }
            long r20 = r6.mo13694a()     // Catch:{ all -> 0x0df9 }
            java.lang.Object r3 = r3.f15788e     // Catch:{ all -> 0x0df9 }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ all -> 0x0df9 }
            long r6 = r3.longValue()     // Catch:{ all -> 0x0df9 }
            long r9 = r6 + r14
            java.lang.Long r22 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0df9 }
            r16 = r4
            r17 = r5
            r16.<init>(r17, r18, r19, r20, r22)     // Catch:{ all -> 0x0df9 }
            r3 = r4
            goto L_0x0850
        L_0x0833:
            com.google.android.gms.measurement.internal.ek r3 = new com.google.android.gms.measurement.internal.ek     // Catch:{ all -> 0x0df9 }
            java.lang.String r4 = r2.f15194o     // Catch:{ all -> 0x0df9 }
            java.lang.String r29 = "auto"
            java.lang.String r30 = "_lte"
            com.google.android.gms.measurement.internal.aw r5 = r1.f15755j     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.common.util.e r5 = r5.mo17153m()     // Catch:{ all -> 0x0df9 }
            long r31 = r5.mo13694a()     // Catch:{ all -> 0x0df9 }
            java.lang.Long r33 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0df9 }
            r27 = r3
            r28 = r4
            r27.<init>(r28, r29, r30, r31, r33)     // Catch:{ all -> 0x0df9 }
        L_0x0850:
            com.google.android.gms.internal.e.aa r4 = new com.google.android.gms.internal.e.aa     // Catch:{ all -> 0x0df9 }
            r4.<init>()     // Catch:{ all -> 0x0df9 }
            java.lang.String r5 = "_lte"
            r4.f14631b = r5     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.aw r5 = r1.f15755j     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.common.util.e r5 = r5.mo17153m()     // Catch:{ all -> 0x0df9 }
            long r5 = r5.mo13694a()     // Catch:{ all -> 0x0df9 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0df9 }
            r4.f14630a = r5     // Catch:{ all -> 0x0df9 }
            java.lang.Object r5 = r3.f15788e     // Catch:{ all -> 0x0df9 }
            java.lang.Long r5 = (java.lang.Long) r5     // Catch:{ all -> 0x0df9 }
            r4.f14633d = r5     // Catch:{ all -> 0x0df9 }
            r5 = 0
        L_0x0870:
            com.google.android.gms.internal.e.aa[] r6 = r2.f15182c     // Catch:{ all -> 0x0df9 }
            int r6 = r6.length     // Catch:{ all -> 0x0df9 }
            if (r5 >= r6) goto L_0x088c
            java.lang.String r6 = "_lte"
            com.google.android.gms.internal.e.aa[] r7 = r2.f15182c     // Catch:{ all -> 0x0df9 }
            r7 = r7[r5]     // Catch:{ all -> 0x0df9 }
            java.lang.String r7 = r7.f14631b     // Catch:{ all -> 0x0df9 }
            boolean r6 = r6.equals(r7)     // Catch:{ all -> 0x0df9 }
            if (r6 == 0) goto L_0x0889
            com.google.android.gms.internal.e.aa[] r6 = r2.f15182c     // Catch:{ all -> 0x0df9 }
            r6[r5] = r4     // Catch:{ all -> 0x0df9 }
            r5 = 1
            goto L_0x088d
        L_0x0889:
            int r5 = r5 + 1
            goto L_0x0870
        L_0x088c:
            r5 = 0
        L_0x088d:
            if (r5 != 0) goto L_0x08a9
            com.google.android.gms.internal.e.aa[] r5 = r2.f15182c     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.internal.e.aa[] r6 = r2.f15182c     // Catch:{ all -> 0x0df9 }
            int r6 = r6.length     // Catch:{ all -> 0x0df9 }
            r7 = 1
            int r6 = r6 + r7
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r6)     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.internal.e.aa[] r5 = (com.google.android.gms.internal.p148e.C4433aa[]) r5     // Catch:{ all -> 0x0df9 }
            r2.f15182c = r5     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.internal.e.aa[] r5 = r2.f15182c     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.internal.e.x r6 = r8.f15771a     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.internal.e.aa[] r6 = r6.f15182c     // Catch:{ all -> 0x0df9 }
            int r6 = r6.length     // Catch:{ all -> 0x0df9 }
            r7 = 1
            int r6 = r6 - r7
            r5[r6] = r4     // Catch:{ all -> 0x0df9 }
        L_0x08a9:
            r4 = 0
            int r6 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x08c7
            com.google.android.gms.measurement.internal.ew r4 = r61.mo17451d()     // Catch:{ all -> 0x0df9 }
            r4.mo17690a(r3)     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.aw r4 = r1.f15755j     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.r r4 = r4.mo17158r()     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.t r4 = r4.mo17758w()     // Catch:{ all -> 0x0df9 }
            java.lang.String r5 = "Updated lifetime engagement user property with value. Value"
            java.lang.Object r3 = r3.f15788e     // Catch:{ all -> 0x0df9 }
            r4.mo17764a(r5, r3)     // Catch:{ all -> 0x0df9 }
        L_0x08c7:
            java.lang.String r3 = r2.f15194o     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.internal.e.aa[] r4 = r2.f15182c     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.internal.e.u[] r5 = r2.f15181b     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.common.internal.C3513t.m12627a(r3)     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.eq r6 = r61.mo17453e()     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.internal.e.s[] r3 = r6.mo17633a(r3, r5, r4)     // Catch:{ all -> 0x0df9 }
            r2.f15165A = r3     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.aw r3 = r1.f15755j     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.et r3 = r3.mo17240b()     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.internal.e.x r4 = r8.f15771a     // Catch:{ all -> 0x0df9 }
            java.lang.String r4 = r4.f15194o     // Catch:{ all -> 0x0df9 }
            boolean r3 = r3.mo17644d(r4)     // Catch:{ all -> 0x0df9 }
            if (r3 == 0) goto L_0x0c1d
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ all -> 0x0df9 }
            r3.<init>()     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.internal.e.u[] r4 = r2.f15181b     // Catch:{ all -> 0x0df9 }
            int r4 = r4.length     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.internal.e.u[] r4 = new com.google.android.gms.internal.p148e.C4648u[r4]     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.aw r5 = r1.f15755j     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.el r5 = r5.mo17248j()     // Catch:{ all -> 0x0df9 }
            java.security.SecureRandom r5 = r5.mo17504h()     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.internal.e.u[] r6 = r2.f15181b     // Catch:{ all -> 0x0df9 }
            int r7 = r6.length     // Catch:{ all -> 0x0df9 }
            r9 = 0
            r10 = 0
        L_0x0903:
            if (r9 >= r7) goto L_0x0bec
            r11 = r6[r9]     // Catch:{ all -> 0x0df9 }
            java.lang.String r12 = r11.f15153b     // Catch:{ all -> 0x0df9 }
            java.lang.String r13 = "_ep"
            boolean r12 = r12.equals(r13)     // Catch:{ all -> 0x0df9 }
            if (r12 == 0) goto L_0x0990
            r61.mo17455g()     // Catch:{ all -> 0x0df9 }
            java.lang.String r12 = "_en"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C4859ei.m20929b(r11, r12)     // Catch:{ all -> 0x0df9 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0df9 }
            java.lang.Object r13 = r3.get(r12)     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.d r13 = (com.google.android.gms.measurement.internal.C4822d) r13     // Catch:{ all -> 0x0df9 }
            if (r13 != 0) goto L_0x0933
            com.google.android.gms.measurement.internal.ew r13 = r61.mo17451d()     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.internal.e.x r14 = r8.f15771a     // Catch:{ all -> 0x0df9 }
            java.lang.String r14 = r14.f15194o     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.d r13 = r13.mo17677a(r14, r12)     // Catch:{ all -> 0x0df9 }
            r3.put(r12, r13)     // Catch:{ all -> 0x0df9 }
        L_0x0933:
            java.lang.Long r12 = r13.f15668h     // Catch:{ all -> 0x0df9 }
            if (r12 != 0) goto L_0x0989
            java.lang.Long r12 = r13.f15669i     // Catch:{ all -> 0x0df9 }
            long r14 = r12.longValue()     // Catch:{ all -> 0x0df9 }
            r16 = 1
            int r12 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r12 <= 0) goto L_0x0952
            r61.mo17455g()     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.internal.e.v[] r12 = r11.f15152a     // Catch:{ all -> 0x0df9 }
            java.lang.String r14 = "_sr"
            java.lang.Long r15 = r13.f15669i     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.internal.e.v[] r12 = com.google.android.gms.measurement.internal.C4859ei.m20928a(r12, r14, r15)     // Catch:{ all -> 0x0df9 }
            r11.f15152a = r12     // Catch:{ all -> 0x0df9 }
        L_0x0952:
            java.lang.Boolean r12 = r13.f15670j     // Catch:{ all -> 0x0df9 }
            if (r12 == 0) goto L_0x0974
            java.lang.Boolean r12 = r13.f15670j     // Catch:{ all -> 0x0df9 }
            boolean r12 = r12.booleanValue()     // Catch:{ all -> 0x0df9 }
            if (r12 == 0) goto L_0x0974
            r61.mo17455g()     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.internal.e.v[] r12 = r11.f15152a     // Catch:{ all -> 0x0df9 }
            java.lang.String r13 = "_efs"
            r46 = r6
            r14 = 1
            java.lang.Long r6 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.internal.e.v[] r6 = com.google.android.gms.measurement.internal.C4859ei.m20928a(r12, r13, r6)     // Catch:{ all -> 0x0df9 }
            r11.f15152a = r6     // Catch:{ all -> 0x0df9 }
            goto L_0x0976
        L_0x0974:
            r46 = r6
        L_0x0976:
            int r6 = r10 + 1
            r4[r10] = r11     // Catch:{ all -> 0x0df9 }
            r50 = r2
            r56 = r5
            r10 = r6
        L_0x097f:
            r49 = r7
        L_0x0981:
            r55 = r8
            r54 = r9
        L_0x0985:
            r8 = 1
            goto L_0x0bdd
        L_0x0989:
            r46 = r6
            r50 = r2
            r56 = r5
            goto L_0x097f
        L_0x0990:
            r46 = r6
            com.google.android.gms.measurement.internal.aq r6 = r61.m20871s()     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.internal.e.x r12 = r8.f15771a     // Catch:{ all -> 0x0df9 }
            java.lang.String r12 = r12.f15194o     // Catch:{ all -> 0x0df9 }
            long r12 = r6.mo17211e(r12)     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.aw r6 = r1.f15755j     // Catch:{ all -> 0x0df9 }
            r6.mo17248j()     // Catch:{ all -> 0x0df9 }
            java.lang.Long r6 = r11.f15154c     // Catch:{ all -> 0x0df9 }
            long r14 = r6.longValue()     // Catch:{ all -> 0x0df9 }
            long r14 = com.google.android.gms.measurement.internal.C4862el.m20960a(r14, r12)     // Catch:{ all -> 0x0df9 }
            java.lang.String r6 = "_dbg"
            r49 = r7
            r47 = r12
            r12 = 1
            java.lang.Long r7 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0df9 }
            boolean r12 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0df9 }
            if (r12 != 0) goto L_0x0a05
            if (r7 != 0) goto L_0x09c2
            goto L_0x0a05
        L_0x09c2:
            com.google.android.gms.internal.e.v[] r12 = r11.f15152a     // Catch:{ all -> 0x0df9 }
            int r13 = r12.length     // Catch:{ all -> 0x0df9 }
            r50 = r2
            r2 = 0
        L_0x09c8:
            if (r2 >= r13) goto L_0x0a07
            r51 = r13
            r13 = r12[r2]     // Catch:{ all -> 0x0df9 }
            r52 = r12
            java.lang.String r12 = r13.f15158a     // Catch:{ all -> 0x0df9 }
            boolean r12 = r6.equals(r12)     // Catch:{ all -> 0x0df9 }
            if (r12 == 0) goto L_0x09fe
            boolean r2 = r7 instanceof java.lang.Long     // Catch:{ all -> 0x0df9 }
            if (r2 == 0) goto L_0x09e4
            java.lang.Long r2 = r13.f15160c     // Catch:{ all -> 0x0df9 }
            boolean r2 = r7.equals(r2)     // Catch:{ all -> 0x0df9 }
            if (r2 != 0) goto L_0x09fc
        L_0x09e4:
            boolean r2 = r7 instanceof java.lang.String     // Catch:{ all -> 0x0df9 }
            if (r2 == 0) goto L_0x09f0
            java.lang.String r2 = r13.f15159b     // Catch:{ all -> 0x0df9 }
            boolean r2 = r7.equals(r2)     // Catch:{ all -> 0x0df9 }
            if (r2 != 0) goto L_0x09fc
        L_0x09f0:
            boolean r2 = r7 instanceof java.lang.Double     // Catch:{ all -> 0x0df9 }
            if (r2 == 0) goto L_0x0a07
            java.lang.Double r2 = r13.f15161d     // Catch:{ all -> 0x0df9 }
            boolean r2 = r7.equals(r2)     // Catch:{ all -> 0x0df9 }
            if (r2 == 0) goto L_0x0a07
        L_0x09fc:
            r2 = 1
            goto L_0x0a08
        L_0x09fe:
            int r2 = r2 + 1
            r13 = r51
            r12 = r52
            goto L_0x09c8
        L_0x0a05:
            r50 = r2
        L_0x0a07:
            r2 = 0
        L_0x0a08:
            if (r2 != 0) goto L_0x0a19
            com.google.android.gms.measurement.internal.aq r2 = r61.m20871s()     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.internal.e.x r6 = r8.f15771a     // Catch:{ all -> 0x0df9 }
            java.lang.String r6 = r6.f15194o     // Catch:{ all -> 0x0df9 }
            java.lang.String r7 = r11.f15153b     // Catch:{ all -> 0x0df9 }
            int r12 = r2.mo17209d(r6, r7)     // Catch:{ all -> 0x0df9 }
            goto L_0x0a1a
        L_0x0a19:
            r12 = 1
        L_0x0a1a:
            if (r12 > 0) goto L_0x0a3a
            com.google.android.gms.measurement.internal.aw r2 = r1.f15755j     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.r r2 = r2.mo17158r()     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.t r2 = r2.mo17754i()     // Catch:{ all -> 0x0df9 }
            java.lang.String r6 = "Sample rate must be positive. event, rate"
            java.lang.String r7 = r11.f15153b     // Catch:{ all -> 0x0df9 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0df9 }
            r2.mo17765a(r6, r7, r12)     // Catch:{ all -> 0x0df9 }
            int r2 = r10 + 1
            r4[r10] = r11     // Catch:{ all -> 0x0df9 }
            r10 = r2
            r56 = r5
            goto L_0x0981
        L_0x0a3a:
            java.lang.String r2 = r11.f15153b     // Catch:{ all -> 0x0df9 }
            java.lang.Object r2 = r3.get(r2)     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.d r2 = (com.google.android.gms.measurement.internal.C4822d) r2     // Catch:{ all -> 0x0df9 }
            if (r2 != 0) goto L_0x0a8e
            com.google.android.gms.measurement.internal.ew r2 = r61.mo17451d()     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.internal.e.x r6 = r8.f15771a     // Catch:{ all -> 0x0df9 }
            java.lang.String r6 = r6.f15194o     // Catch:{ all -> 0x0df9 }
            java.lang.String r7 = r11.f15153b     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.d r2 = r2.mo17677a(r6, r7)     // Catch:{ all -> 0x0df9 }
            if (r2 != 0) goto L_0x0a8e
            com.google.android.gms.measurement.internal.aw r2 = r1.f15755j     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.r r2 = r2.mo17158r()     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.t r2 = r2.mo17754i()     // Catch:{ all -> 0x0df9 }
            java.lang.String r6 = "Event being bundled has no eventAggregate. appId, eventName"
            com.google.android.gms.internal.e.x r7 = r8.f15771a     // Catch:{ all -> 0x0df9 }
            java.lang.String r7 = r7.f15194o     // Catch:{ all -> 0x0df9 }
            java.lang.String r13 = r11.f15153b     // Catch:{ all -> 0x0df9 }
            r2.mo17765a(r6, r7, r13)     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.d r2 = new com.google.android.gms.measurement.internal.d     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.internal.e.x r6 = r8.f15771a     // Catch:{ all -> 0x0df9 }
            java.lang.String r6 = r6.f15194o     // Catch:{ all -> 0x0df9 }
            java.lang.String r7 = r11.f15153b     // Catch:{ all -> 0x0df9 }
            r30 = 1
            r32 = 1
            java.lang.Long r13 = r11.f15154c     // Catch:{ all -> 0x0df9 }
            long r34 = r13.longValue()     // Catch:{ all -> 0x0df9 }
            r36 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r27 = r2
            r28 = r6
            r29 = r7
            r27.<init>(r28, r29, r30, r32, r34, r36, r38, r39, r40, r41)     // Catch:{ all -> 0x0df9 }
        L_0x0a8e:
            r61.mo17455g()     // Catch:{ all -> 0x0df9 }
            java.lang.String r6 = "_eid"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C4859ei.m20929b(r11, r6)     // Catch:{ all -> 0x0df9 }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ all -> 0x0df9 }
            if (r6 == 0) goto L_0x0a9d
            r7 = 1
            goto L_0x0a9e
        L_0x0a9d:
            r7 = 0
        L_0x0a9e:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x0df9 }
            r13 = 1
            if (r12 != r13) goto L_0x0aca
            int r6 = r10 + 1
            r4[r10] = r11     // Catch:{ all -> 0x0df9 }
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x0df9 }
            if (r7 == 0) goto L_0x0ac5
            java.lang.Long r7 = r2.f15668h     // Catch:{ all -> 0x0df9 }
            if (r7 != 0) goto L_0x0abb
            java.lang.Long r7 = r2.f15669i     // Catch:{ all -> 0x0df9 }
            if (r7 != 0) goto L_0x0abb
            java.lang.Boolean r7 = r2.f15670j     // Catch:{ all -> 0x0df9 }
            if (r7 == 0) goto L_0x0ac5
        L_0x0abb:
            r7 = 0
            com.google.android.gms.measurement.internal.d r2 = r2.mo17381a(r7, r7, r7)     // Catch:{ all -> 0x0df9 }
            java.lang.String r7 = r11.f15153b     // Catch:{ all -> 0x0df9 }
            r3.put(r7, r2)     // Catch:{ all -> 0x0df9 }
        L_0x0ac5:
            r56 = r5
            r10 = r6
            goto L_0x0981
        L_0x0aca:
            int r13 = r5.nextInt(r12)     // Catch:{ all -> 0x0df9 }
            if (r13 != 0) goto L_0x0b0f
            r61.mo17455g()     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.internal.e.v[] r6 = r11.f15152a     // Catch:{ all -> 0x0df9 }
            java.lang.String r13 = "_sr"
            r53 = r8
            r54 = r9
            long r8 = (long) r12     // Catch:{ all -> 0x0df9 }
            java.lang.Long r12 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.internal.e.v[] r6 = com.google.android.gms.measurement.internal.C4859ei.m20928a(r6, r13, r12)     // Catch:{ all -> 0x0df9 }
            r11.f15152a = r6     // Catch:{ all -> 0x0df9 }
            int r6 = r10 + 1
            r4[r10] = r11     // Catch:{ all -> 0x0df9 }
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x0df9 }
            if (r7 == 0) goto L_0x0af9
            java.lang.Long r7 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0df9 }
            r8 = 0
            com.google.android.gms.measurement.internal.d r2 = r2.mo17381a(r8, r7, r8)     // Catch:{ all -> 0x0df9 }
        L_0x0af9:
            java.lang.String r7 = r11.f15153b     // Catch:{ all -> 0x0df9 }
            java.lang.Long r8 = r11.f15154c     // Catch:{ all -> 0x0df9 }
            long r8 = r8.longValue()     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.d r2 = r2.mo17380a(r8, r14)     // Catch:{ all -> 0x0df9 }
            r3.put(r7, r2)     // Catch:{ all -> 0x0df9 }
            r56 = r5
            r10 = r6
            r55 = r53
            goto L_0x0985
        L_0x0b0f:
            r53 = r8
            r54 = r9
            com.google.android.gms.measurement.internal.aw r8 = r1.f15755j     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.et r8 = r8.mo17240b()     // Catch:{ all -> 0x0df9 }
            r9 = r53
            com.google.android.gms.internal.e.x r13 = r9.f15771a     // Catch:{ all -> 0x0df9 }
            java.lang.String r13 = r13.f15194o     // Catch:{ all -> 0x0df9 }
            boolean r8 = r8.mo17660o(r13)     // Catch:{ all -> 0x0df9 }
            if (r8 == 0) goto L_0x0b57
            java.lang.Long r8 = r2.f15667g     // Catch:{ all -> 0x0df9 }
            if (r8 == 0) goto L_0x0b36
            java.lang.Long r8 = r2.f15667g     // Catch:{ all -> 0x0df9 }
            long r16 = r8.longValue()     // Catch:{ all -> 0x0df9 }
            r56 = r5
            r57 = r6
            r55 = r9
            goto L_0x0b4d
        L_0x0b36:
            com.google.android.gms.measurement.internal.aw r8 = r1.f15755j     // Catch:{ all -> 0x0df9 }
            r8.mo17248j()     // Catch:{ all -> 0x0df9 }
            java.lang.Long r8 = r11.f15155d     // Catch:{ all -> 0x0df9 }
            r55 = r9
            long r8 = r8.longValue()     // Catch:{ all -> 0x0df9 }
            r56 = r5
            r57 = r6
            r5 = r47
            long r16 = com.google.android.gms.measurement.internal.C4862el.m20960a(r8, r5)     // Catch:{ all -> 0x0df9 }
        L_0x0b4d:
            int r5 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r5 == 0) goto L_0x0b53
            r5 = 1
            goto L_0x0b54
        L_0x0b53:
            r5 = 0
        L_0x0b54:
            r58 = r14
            goto L_0x0b77
        L_0x0b57:
            r56 = r5
            r57 = r6
            r55 = r9
            long r5 = r2.f15666f     // Catch:{ all -> 0x0df9 }
            java.lang.Long r8 = r11.f15154c     // Catch:{ all -> 0x0df9 }
            long r8 = r8.longValue()     // Catch:{ all -> 0x0df9 }
            r58 = r14
            long r13 = r8 - r5
            long r5 = java.lang.Math.abs(r13)     // Catch:{ all -> 0x0df9 }
            r8 = 86400000(0x5265c00, double:4.2687272E-316)
            int r13 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r13 < 0) goto L_0x0b76
            r5 = 1
            goto L_0x0b77
        L_0x0b76:
            r5 = 0
        L_0x0b77:
            if (r5 == 0) goto L_0x0bc9
            r61.mo17455g()     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.internal.e.v[] r5 = r11.f15152a     // Catch:{ all -> 0x0df9 }
            java.lang.String r6 = "_efs"
            r8 = 1
            java.lang.Long r13 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.internal.e.v[] r5 = com.google.android.gms.measurement.internal.C4859ei.m20928a(r5, r6, r13)     // Catch:{ all -> 0x0df9 }
            r11.f15152a = r5     // Catch:{ all -> 0x0df9 }
            r61.mo17455g()     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.internal.e.v[] r5 = r11.f15152a     // Catch:{ all -> 0x0df9 }
            java.lang.String r6 = "_sr"
            long r12 = (long) r12     // Catch:{ all -> 0x0df9 }
            java.lang.Long r14 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.internal.e.v[] r5 = com.google.android.gms.measurement.internal.C4859ei.m20928a(r5, r6, r14)     // Catch:{ all -> 0x0df9 }
            r11.f15152a = r5     // Catch:{ all -> 0x0df9 }
            int r5 = r10 + 1
            r4[r10] = r11     // Catch:{ all -> 0x0df9 }
            boolean r6 = r7.booleanValue()     // Catch:{ all -> 0x0df9 }
            if (r6 == 0) goto L_0x0bb6
            java.lang.Long r6 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0df9 }
            r7 = 1
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x0df9 }
            r7 = 0
            com.google.android.gms.measurement.internal.d r2 = r2.mo17381a(r7, r6, r10)     // Catch:{ all -> 0x0df9 }
        L_0x0bb6:
            java.lang.String r6 = r11.f15153b     // Catch:{ all -> 0x0df9 }
            java.lang.Long r7 = r11.f15154c     // Catch:{ all -> 0x0df9 }
            long r10 = r7.longValue()     // Catch:{ all -> 0x0df9 }
            r12 = r58
            com.google.android.gms.measurement.internal.d r2 = r2.mo17380a(r10, r12)     // Catch:{ all -> 0x0df9 }
            r3.put(r6, r2)     // Catch:{ all -> 0x0df9 }
            r10 = r5
            goto L_0x0bdd
        L_0x0bc9:
            r8 = 1
            boolean r5 = r7.booleanValue()     // Catch:{ all -> 0x0df9 }
            if (r5 == 0) goto L_0x0bdd
            java.lang.String r5 = r11.f15153b     // Catch:{ all -> 0x0df9 }
            r6 = r57
            r7 = 0
            com.google.android.gms.measurement.internal.d r2 = r2.mo17381a(r6, r7, r7)     // Catch:{ all -> 0x0df9 }
            r3.put(r5, r2)     // Catch:{ all -> 0x0df9 }
        L_0x0bdd:
            int r2 = r54 + 1
            r9 = r2
            r6 = r46
            r7 = r49
            r2 = r50
            r8 = r55
            r5 = r56
            goto L_0x0903
        L_0x0bec:
            r55 = r8
            com.google.android.gms.internal.e.u[] r5 = r2.f15181b     // Catch:{ all -> 0x0df9 }
            int r5 = r5.length     // Catch:{ all -> 0x0df9 }
            if (r10 >= r5) goto L_0x0bfb
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r10)     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.internal.e.u[] r4 = (com.google.android.gms.internal.p148e.C4648u[]) r4     // Catch:{ all -> 0x0df9 }
            r2.f15181b = r4     // Catch:{ all -> 0x0df9 }
        L_0x0bfb:
            java.util.Set r3 = r3.entrySet()     // Catch:{ all -> 0x0df9 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0df9 }
        L_0x0c03:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0df9 }
            if (r4 == 0) goto L_0x0c1f
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0df9 }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.ew r5 = r61.mo17451d()     // Catch:{ all -> 0x0df9 }
            java.lang.Object r4 = r4.getValue()     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.d r4 = (com.google.android.gms.measurement.internal.C4822d) r4     // Catch:{ all -> 0x0df9 }
            r5.mo17684a(r4)     // Catch:{ all -> 0x0df9 }
            goto L_0x0c03
        L_0x0c1d:
            r55 = r8
        L_0x0c1f:
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0df9 }
            r2.f15184e = r3     // Catch:{ all -> 0x0df9 }
            r3 = -9223372036854775808
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0df9 }
            r2.f15185f = r3     // Catch:{ all -> 0x0df9 }
            r3 = 0
        L_0x0c33:
            com.google.android.gms.internal.e.u[] r4 = r2.f15181b     // Catch:{ all -> 0x0df9 }
            int r4 = r4.length     // Catch:{ all -> 0x0df9 }
            if (r3 >= r4) goto L_0x0c67
            com.google.android.gms.internal.e.u[] r4 = r2.f15181b     // Catch:{ all -> 0x0df9 }
            r4 = r4[r3]     // Catch:{ all -> 0x0df9 }
            java.lang.Long r5 = r4.f15154c     // Catch:{ all -> 0x0df9 }
            long r5 = r5.longValue()     // Catch:{ all -> 0x0df9 }
            java.lang.Long r7 = r2.f15184e     // Catch:{ all -> 0x0df9 }
            long r7 = r7.longValue()     // Catch:{ all -> 0x0df9 }
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 >= 0) goto L_0x0c50
            java.lang.Long r5 = r4.f15154c     // Catch:{ all -> 0x0df9 }
            r2.f15184e = r5     // Catch:{ all -> 0x0df9 }
        L_0x0c50:
            java.lang.Long r5 = r4.f15154c     // Catch:{ all -> 0x0df9 }
            long r5 = r5.longValue()     // Catch:{ all -> 0x0df9 }
            java.lang.Long r7 = r2.f15185f     // Catch:{ all -> 0x0df9 }
            long r7 = r7.longValue()     // Catch:{ all -> 0x0df9 }
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x0c64
            java.lang.Long r4 = r4.f15154c     // Catch:{ all -> 0x0df9 }
            r2.f15185f = r4     // Catch:{ all -> 0x0df9 }
        L_0x0c64:
            int r3 = r3 + 1
            goto L_0x0c33
        L_0x0c67:
            r3 = r55
            com.google.android.gms.internal.e.x r4 = r3.f15771a     // Catch:{ all -> 0x0df9 }
            java.lang.String r4 = r4.f15194o     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.ew r5 = r61.mo17451d()     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.en r5 = r5.mo17693b(r4)     // Catch:{ all -> 0x0df9 }
            if (r5 != 0) goto L_0x0c8f
            com.google.android.gms.measurement.internal.aw r5 = r1.f15755j     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.r r5 = r5.mo17158r()     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.t r5 = r5.mo17761y_()     // Catch:{ all -> 0x0df9 }
            java.lang.String r6 = "Bundling raw events w/o app info. appId"
            com.google.android.gms.internal.e.x r7 = r3.f15771a     // Catch:{ all -> 0x0df9 }
            java.lang.String r7 = r7.f15194o     // Catch:{ all -> 0x0df9 }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C4893r.m21360a(r7)     // Catch:{ all -> 0x0df9 }
            r5.mo17764a(r6, r7)     // Catch:{ all -> 0x0df9 }
            goto L_0x0ceb
        L_0x0c8f:
            com.google.android.gms.internal.e.u[] r6 = r2.f15181b     // Catch:{ all -> 0x0df9 }
            int r6 = r6.length     // Catch:{ all -> 0x0df9 }
            if (r6 <= 0) goto L_0x0ceb
            long r6 = r5.mo17546i()     // Catch:{ all -> 0x0df9 }
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0ca3
            java.lang.Long r8 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0df9 }
            goto L_0x0ca4
        L_0x0ca3:
            r8 = 0
        L_0x0ca4:
            r2.f15187h = r8     // Catch:{ all -> 0x0df9 }
            long r8 = r5.mo17543h()     // Catch:{ all -> 0x0df9 }
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x0cb1
            goto L_0x0cb2
        L_0x0cb1:
            r6 = r8
        L_0x0cb2:
            int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x0cbb
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0df9 }
            goto L_0x0cbc
        L_0x0cbb:
            r6 = 0
        L_0x0cbc:
            r2.f15186g = r6     // Catch:{ all -> 0x0df9 }
            r5.mo17563s()     // Catch:{ all -> 0x0df9 }
            long r6 = r5.mo17560p()     // Catch:{ all -> 0x0df9 }
            int r6 = (int) r6     // Catch:{ all -> 0x0df9 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0df9 }
            r2.f15202w = r6     // Catch:{ all -> 0x0df9 }
            java.lang.Long r6 = r2.f15184e     // Catch:{ all -> 0x0df9 }
            long r6 = r6.longValue()     // Catch:{ all -> 0x0df9 }
            r5.mo17520a(r6)     // Catch:{ all -> 0x0df9 }
            java.lang.Long r6 = r2.f15185f     // Catch:{ all -> 0x0df9 }
            long r6 = r6.longValue()     // Catch:{ all -> 0x0df9 }
            r5.mo17524b(r6)     // Catch:{ all -> 0x0df9 }
            java.lang.String r6 = r5.mo17515A()     // Catch:{ all -> 0x0df9 }
            r2.f15203x = r6     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.ew r6 = r61.mo17451d()     // Catch:{ all -> 0x0df9 }
            r6.mo17685a(r5)     // Catch:{ all -> 0x0df9 }
        L_0x0ceb:
            com.google.android.gms.internal.e.u[] r5 = r2.f15181b     // Catch:{ all -> 0x0df9 }
            int r5 = r5.length     // Catch:{ all -> 0x0df9 }
            if (r5 <= 0) goto L_0x0d40
            com.google.android.gms.measurement.internal.aw r5 = r1.f15755j     // Catch:{ all -> 0x0df9 }
            r5.mo17161u()     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.aq r5 = r61.m20871s()     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.internal.e.x r6 = r3.f15771a     // Catch:{ all -> 0x0df9 }
            java.lang.String r6 = r6.f15194o     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.internal.e.q r5 = r5.mo17202a(r6)     // Catch:{ all -> 0x0df9 }
            if (r5 == 0) goto L_0x0d0d
            java.lang.Long r6 = r5.f15132a     // Catch:{ all -> 0x0df9 }
            if (r6 != 0) goto L_0x0d08
            goto L_0x0d0d
        L_0x0d08:
            java.lang.Long r5 = r5.f15132a     // Catch:{ all -> 0x0df9 }
            r2.f15169E = r5     // Catch:{ all -> 0x0df9 }
            goto L_0x0d37
        L_0x0d0d:
            com.google.android.gms.internal.e.x r5 = r3.f15771a     // Catch:{ all -> 0x0df9 }
            java.lang.String r5 = r5.f15204y     // Catch:{ all -> 0x0df9 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0df9 }
            if (r5 == 0) goto L_0x0d20
            r5 = -1
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0df9 }
            r2.f15169E = r5     // Catch:{ all -> 0x0df9 }
            goto L_0x0d37
        L_0x0d20:
            com.google.android.gms.measurement.internal.aw r5 = r1.f15755j     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.r r5 = r5.mo17158r()     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.t r5 = r5.mo17754i()     // Catch:{ all -> 0x0df9 }
            java.lang.String r6 = "Did not find measurement config or missing version info. appId"
            com.google.android.gms.internal.e.x r7 = r3.f15771a     // Catch:{ all -> 0x0df9 }
            java.lang.String r7 = r7.f15194o     // Catch:{ all -> 0x0df9 }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C4893r.m21360a(r7)     // Catch:{ all -> 0x0df9 }
            r5.mo17764a(r6, r7)     // Catch:{ all -> 0x0df9 }
        L_0x0d37:
            com.google.android.gms.measurement.internal.ew r5 = r61.mo17451d()     // Catch:{ all -> 0x0df9 }
            r11 = r26
            r5.mo17688a(r2, r11)     // Catch:{ all -> 0x0df9 }
        L_0x0d40:
            com.google.android.gms.measurement.internal.ew r2 = r61.mo17451d()     // Catch:{ all -> 0x0df9 }
            java.util.List<java.lang.Long> r3 = r3.f15772b     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.common.internal.C3513t.m12625a(r3)     // Catch:{ all -> 0x0df9 }
            r2.mo17144d()     // Catch:{ all -> 0x0df9 }
            r2.mo17430k()     // Catch:{ all -> 0x0df9 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0df9 }
            java.lang.String r6 = "rowid in ("
            r5.<init>(r6)     // Catch:{ all -> 0x0df9 }
            r6 = 0
        L_0x0d57:
            int r7 = r3.size()     // Catch:{ all -> 0x0df9 }
            if (r6 >= r7) goto L_0x0d74
            if (r6 == 0) goto L_0x0d64
            java.lang.String r7 = ","
            r5.append(r7)     // Catch:{ all -> 0x0df9 }
        L_0x0d64:
            java.lang.Object r7 = r3.get(r6)     // Catch:{ all -> 0x0df9 }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x0df9 }
            long r7 = r7.longValue()     // Catch:{ all -> 0x0df9 }
            r5.append(r7)     // Catch:{ all -> 0x0df9 }
            int r6 = r6 + 1
            goto L_0x0d57
        L_0x0d74:
            java.lang.String r6 = ")"
            r5.append(r6)     // Catch:{ all -> 0x0df9 }
            android.database.sqlite.SQLiteDatabase r6 = r2.mo17709y()     // Catch:{ all -> 0x0df9 }
            java.lang.String r7 = "raw_events"
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0df9 }
            r8 = 0
            int r5 = r6.delete(r7, r5, r8)     // Catch:{ all -> 0x0df9 }
            int r6 = r3.size()     // Catch:{ all -> 0x0df9 }
            if (r5 == r6) goto L_0x0da7
            com.google.android.gms.measurement.internal.r r2 = r2.mo17158r()     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.t r2 = r2.mo17761y_()     // Catch:{ all -> 0x0df9 }
            java.lang.String r6 = "Deleted fewer rows from raw events table than expected"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0df9 }
            int r3 = r3.size()     // Catch:{ all -> 0x0df9 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0df9 }
            r2.mo17765a(r6, r5, r3)     // Catch:{ all -> 0x0df9 }
        L_0x0da7:
            com.google.android.gms.measurement.internal.ew r2 = r61.mo17451d()     // Catch:{ all -> 0x0df9 }
            android.database.sqlite.SQLiteDatabase r3 = r2.mo17709y()     // Catch:{ all -> 0x0df9 }
            java.lang.String r5 = "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"
            r6 = 2
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x0dbe }
            r7 = 0
            r6[r7] = r4     // Catch:{ SQLiteException -> 0x0dbe }
            r7 = 1
            r6[r7] = r4     // Catch:{ SQLiteException -> 0x0dbe }
            r3.execSQL(r5, r6)     // Catch:{ SQLiteException -> 0x0dbe }
            goto L_0x0dd1
        L_0x0dbe:
            r0 = move-exception
            r3 = r0
            com.google.android.gms.measurement.internal.r r2 = r2.mo17158r()     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.t r2 = r2.mo17761y_()     // Catch:{ all -> 0x0df9 }
            java.lang.String r5 = "Failed to remove unused event metadata. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4893r.m21360a(r4)     // Catch:{ all -> 0x0df9 }
            r2.mo17765a(r5, r4, r3)     // Catch:{ all -> 0x0df9 }
        L_0x0dd1:
            com.google.android.gms.measurement.internal.ew r2 = r61.mo17451d()     // Catch:{ all -> 0x0df9 }
            r2.mo17707w()     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.ew r2 = r61.mo17451d()
            r2.mo17708x()
            r2 = 1
            return r2
        L_0x0de1:
            com.google.android.gms.measurement.internal.ew r2 = r61.mo17451d()     // Catch:{ all -> 0x0df9 }
            r2.mo17707w()     // Catch:{ all -> 0x0df9 }
            com.google.android.gms.measurement.internal.ew r2 = r61.mo17451d()
            r2.mo17708x()
            r2 = 0
            return r2
        L_0x0df1:
            r0 = move-exception
            r2 = r0
        L_0x0df3:
            if (r8 == 0) goto L_0x0df8
            r8.close()     // Catch:{ all -> 0x0df9 }
        L_0x0df8:
            throw r2     // Catch:{ all -> 0x0df9 }
        L_0x0df9:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.ew r3 = r61.mo17451d()
            r3.mo17708x()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4852ec.m20863a(java.lang.String, long):boolean");
    }

    /* renamed from: a */
    private final boolean m20862a(C4648u uVar, C4648u uVar2) {
        Object obj;
        C3513t.m12635b("_e".equals(uVar.f15153b));
        mo17455g();
        C4649v a = C4859ei.m20919a(uVar, "_sc");
        String str = null;
        if (a == null) {
            obj = null;
        } else {
            obj = a.f15159b;
        }
        mo17455g();
        C4649v a2 = C4859ei.m20919a(uVar2, "_pc");
        if (a2 != null) {
            str = a2.f15159b;
        }
        if (str == null || !str.equals(obj)) {
            return false;
        }
        mo17455g();
        C4649v a3 = C4859ei.m20919a(uVar, "_et");
        if (a3.f15160c == null || a3.f15160c.longValue() <= 0) {
            return true;
        }
        long longValue = a3.f15160c.longValue();
        mo17455g();
        C4649v a4 = C4859ei.m20919a(uVar2, "_et");
        if (!(a4 == null || a4.f15160c == null || a4.f15160c.longValue() <= 0)) {
            longValue += a4.f15160c.longValue();
        }
        mo17455g();
        uVar2.f15152a = C4859ei.m20928a(uVar2.f15152a, "_et", (Object) Long.valueOf(longValue));
        mo17455g();
        uVar.f15152a = C4859ei.m20928a(uVar.f15152a, "_fr", (Object) Long.valueOf(1));
        return true;
    }

    /* renamed from: a */
    private static C4649v[] m20866a(C4649v[] vVarArr, String str) {
        int i = 0;
        while (true) {
            if (i >= vVarArr.length) {
                i = -1;
                break;
            } else if (str.equals(vVarArr[i].f15158a)) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return vVarArr;
        }
        return m20864a(vVarArr, i);
    }

    /* renamed from: a */
    private static C4649v[] m20864a(C4649v[] vVarArr, int i) {
        C4649v[] vVarArr2 = new C4649v[(vVarArr.length - 1)];
        if (i > 0) {
            System.arraycopy(vVarArr, 0, vVarArr2, 0, i);
        }
        if (i < vVarArr2.length) {
            System.arraycopy(vVarArr, i + 1, vVarArr2, i, vVarArr2.length - i);
        }
        return vVarArr2;
    }

    /* renamed from: a */
    private static C4649v[] m20865a(C4649v[] vVarArr, int i, String str) {
        for (C4649v vVar : vVarArr) {
            if ("_err".equals(vVar.f15158a)) {
                return vVarArr;
            }
        }
        C4649v[] vVarArr2 = new C4649v[(vVarArr.length + 2)];
        System.arraycopy(vVarArr, 0, vVarArr2, 0, vVarArr.length);
        C4649v vVar2 = new C4649v();
        vVar2.f15158a = "_err";
        vVar2.f15160c = Long.valueOf((long) i);
        C4649v vVar3 = new C4649v();
        vVar3.f15158a = "_ev";
        vVar3.f15159b = str;
        vVarArr2[vVarArr2.length - 2] = vVar2;
        vVarArr2[vVarArr2.length - 1] = vVar3;
        return vVarArr2;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo17433a(int i, Throwable th, byte[] bArr, String str) {
        C4873ew d;
        m20874w();
        mo17458j();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.f15764s = false;
                m20850A();
                throw th2;
            }
        }
        List<Long> list = this.f15768w;
        this.f15768w = null;
        boolean z = true;
        if ((i == 200 || i == 204) && th == null) {
            try {
                this.f15755j.mo17241c().f15386c.mo17189a(this.f15755j.mo17153m().mo13694a());
                this.f15755j.mo17241c().f15387d.mo17189a(0);
                m20877z();
                this.f15755j.mo17158r().mo17759x().mo17765a("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                mo17451d().mo17704f();
                try {
                    for (Long l : list) {
                        try {
                            d = mo17451d();
                            long longValue = l.longValue();
                            d.mo17144d();
                            d.mo17430k();
                            if (d.mo17709y().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                                throw new SQLiteException("Deleted fewer rows from queue than expected");
                            }
                        } catch (SQLiteException e) {
                            d.mo17158r().mo17761y_().mo17764a("Failed to delete a bundle in a queue table", e);
                            throw e;
                        } catch (SQLiteException e2) {
                            if (this.f15769x == null || !this.f15769x.contains(l)) {
                                throw e2;
                            }
                        }
                    }
                    mo17451d().mo17707w();
                    mo17451d().mo17708x();
                    this.f15769x = null;
                    if (!mo17449c().mo17768f() || !m20876y()) {
                        this.f15770y = -1;
                        m20877z();
                    } else {
                        mo17459k();
                    }
                    this.f15759n = 0;
                } catch (Throwable th3) {
                    mo17451d().mo17708x();
                    throw th3;
                }
            } catch (SQLiteException e3) {
                this.f15755j.mo17158r().mo17761y_().mo17764a("Database error while trying to delete uploaded bundles", e3);
                this.f15759n = this.f15755j.mo17153m().mo13695b();
                this.f15755j.mo17158r().mo17759x().mo17764a("Disable upload, time", Long.valueOf(this.f15759n));
            }
        } else {
            this.f15755j.mo17158r().mo17759x().mo17765a("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
            this.f15755j.mo17241c().f15387d.mo17189a(this.f15755j.mo17153m().mo13694a());
            if (i != 503) {
                if (i != 429) {
                    z = false;
                }
            }
            if (z) {
                this.f15755j.mo17241c().f15388e.mo17189a(this.f15755j.mo17153m().mo13694a());
            }
            if (this.f15755j.mo17240b().mo17650g(str)) {
                mo17451d().mo17687a(list);
            }
            m20877z();
        }
        this.f15764s = false;
        m20850A();
    }

    /* renamed from: y */
    private final boolean m20876y() {
        m20874w();
        mo17458j();
        return mo17451d().mo17672E() || !TextUtils.isEmpty(mo17451d().mo17710z());
    }

    /* renamed from: a */
    private final void m20860a(C4864en enVar) {
        Map map;
        m20874w();
        if (!TextUtils.isEmpty(enVar.mo17531d()) || (C4870et.m21099y() && !TextUtils.isEmpty(enVar.mo17534e()))) {
            C4870et b = this.f15755j.mo17240b();
            Builder builder = new Builder();
            String d = enVar.mo17531d();
            if (TextUtils.isEmpty(d) && C4870et.m21099y()) {
                d = enVar.mo17534e();
            }
            Builder encodedAuthority = builder.scheme((String) C4882h.f15915m.mo17726b()).encodedAuthority((String) C4882h.f15916n.mo17726b());
            String str = "config/app/";
            String valueOf = String.valueOf(d);
            encodedAuthority.path(valueOf.length() != 0 ? str.concat(valueOf) : new String(str)).appendQueryParameter("app_instance_id", enVar.mo17527c()).appendQueryParameter("platform", "android").appendQueryParameter("gmp_version", String.valueOf(b.mo17647f()));
            String uri = builder.build().toString();
            try {
                URL url = new URL(uri);
                this.f15755j.mo17158r().mo17759x().mo17764a("Fetching remote configuration", enVar.mo17523b());
                C4644q a = m20871s().mo17202a(enVar.mo17523b());
                String b2 = m20871s().mo17205b(enVar.mo17523b());
                if (a == null || TextUtils.isEmpty(b2)) {
                    map = null;
                } else {
                    C0376a aVar = new C0376a();
                    aVar.put("If-Modified-Since", b2);
                    map = aVar;
                }
                this.f15763r = true;
                C4897v c = mo17449c();
                String b3 = enVar.mo17523b();
                C4856ef efVar = new C4856ef(this);
                c.mo17144d();
                c.mo17430k();
                C3513t.m12625a(url);
                C3513t.m12625a(efVar);
                C4759ar q = c.mo17157q();
                C4742aa aaVar = new C4742aa(c, b3, url, null, map, efVar);
                q.mo17221b((Runnable) aaVar);
            } catch (MalformedURLException unused) {
                this.f15755j.mo17158r().mo17761y_().mo17765a("Failed to parse config URL. Not fetching. appId", C4893r.m21360a(enVar.mo17523b()), uri);
            }
        } else {
            mo17442a(enVar.mo17523b(), 204, null, null, null);
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x013e A[Catch:{ all -> 0x0191, all -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x014e A[Catch:{ all -> 0x0191, all -> 0x000f }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17442a(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r11) {
        /*
            r6 = this;
            r6.m20874w()
            r6.mo17458j()
            com.google.android.gms.common.internal.C3513t.m12627a(r7)
            r0 = 0
            if (r10 != 0) goto L_0x0012
            byte[] r10 = new byte[r0]     // Catch:{ all -> 0x000f }
            goto L_0x0012
        L_0x000f:
            r7 = move-exception
            goto L_0x019a
        L_0x0012:
            com.google.android.gms.measurement.internal.aw r1 = r6.f15755j     // Catch:{ all -> 0x000f }
            com.google.android.gms.measurement.internal.r r1 = r1.mo17158r()     // Catch:{ all -> 0x000f }
            com.google.android.gms.measurement.internal.t r1 = r1.mo17759x()     // Catch:{ all -> 0x000f }
            java.lang.String r2 = "onConfigFetched. Response size"
            int r3 = r10.length     // Catch:{ all -> 0x000f }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x000f }
            r1.mo17764a(r2, r3)     // Catch:{ all -> 0x000f }
            com.google.android.gms.measurement.internal.ew r1 = r6.mo17451d()     // Catch:{ all -> 0x000f }
            r1.mo17704f()     // Catch:{ all -> 0x000f }
            com.google.android.gms.measurement.internal.ew r1 = r6.mo17451d()     // Catch:{ all -> 0x0191 }
            com.google.android.gms.measurement.internal.en r1 = r1.mo17693b(r7)     // Catch:{ all -> 0x0191 }
            r2 = 200(0xc8, float:2.8E-43)
            r3 = 1
            r4 = 304(0x130, float:4.26E-43)
            if (r8 == r2) goto L_0x0042
            r2 = 204(0xcc, float:2.86E-43)
            if (r8 == r2) goto L_0x0042
            if (r8 != r4) goto L_0x0046
        L_0x0042:
            if (r9 != 0) goto L_0x0046
            r2 = r3
            goto L_0x0047
        L_0x0046:
            r2 = r0
        L_0x0047:
            if (r1 != 0) goto L_0x005e
            com.google.android.gms.measurement.internal.aw r8 = r6.f15755j     // Catch:{ all -> 0x0191 }
            com.google.android.gms.measurement.internal.r r8 = r8.mo17158r()     // Catch:{ all -> 0x0191 }
            com.google.android.gms.measurement.internal.t r8 = r8.mo17754i()     // Catch:{ all -> 0x0191 }
            java.lang.String r9 = "App does not exist in onConfigFetched. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C4893r.m21360a(r7)     // Catch:{ all -> 0x0191 }
            r8.mo17764a(r9, r7)     // Catch:{ all -> 0x0191 }
            goto L_0x017d
        L_0x005e:
            r5 = 404(0x194, float:5.66E-43)
            if (r2 != 0) goto L_0x00ce
            if (r8 != r5) goto L_0x0065
            goto L_0x00ce
        L_0x0065:
            com.google.android.gms.measurement.internal.aw r10 = r6.f15755j     // Catch:{ all -> 0x0191 }
            com.google.android.gms.common.util.e r10 = r10.mo17153m()     // Catch:{ all -> 0x0191 }
            long r10 = r10.mo13694a()     // Catch:{ all -> 0x0191 }
            r1.mo17544h(r10)     // Catch:{ all -> 0x0191 }
            com.google.android.gms.measurement.internal.ew r10 = r6.mo17451d()     // Catch:{ all -> 0x0191 }
            r10.mo17685a(r1)     // Catch:{ all -> 0x0191 }
            com.google.android.gms.measurement.internal.aw r10 = r6.f15755j     // Catch:{ all -> 0x0191 }
            com.google.android.gms.measurement.internal.r r10 = r10.mo17158r()     // Catch:{ all -> 0x0191 }
            com.google.android.gms.measurement.internal.t r10 = r10.mo17759x()     // Catch:{ all -> 0x0191 }
            java.lang.String r11 = "Fetching config failed. code, error"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0191 }
            r10.mo17765a(r11, r1, r9)     // Catch:{ all -> 0x0191 }
            com.google.android.gms.measurement.internal.aq r9 = r6.m20871s()     // Catch:{ all -> 0x0191 }
            r9.mo17207c(r7)     // Catch:{ all -> 0x0191 }
            com.google.android.gms.measurement.internal.aw r7 = r6.f15755j     // Catch:{ all -> 0x0191 }
            com.google.android.gms.measurement.internal.ad r7 = r7.mo17241c()     // Catch:{ all -> 0x0191 }
            com.google.android.gms.measurement.internal.ag r7 = r7.f15387d     // Catch:{ all -> 0x0191 }
            com.google.android.gms.measurement.internal.aw r9 = r6.f15755j     // Catch:{ all -> 0x0191 }
            com.google.android.gms.common.util.e r9 = r9.mo17153m()     // Catch:{ all -> 0x0191 }
            long r9 = r9.mo13694a()     // Catch:{ all -> 0x0191 }
            r7.mo17189a(r9)     // Catch:{ all -> 0x0191 }
            r7 = 503(0x1f7, float:7.05E-43)
            if (r8 == r7) goto L_0x00b2
            r7 = 429(0x1ad, float:6.01E-43)
            if (r8 != r7) goto L_0x00b1
            goto L_0x00b2
        L_0x00b1:
            r3 = r0
        L_0x00b2:
            if (r3 == 0) goto L_0x00c9
            com.google.android.gms.measurement.internal.aw r7 = r6.f15755j     // Catch:{ all -> 0x0191 }
            com.google.android.gms.measurement.internal.ad r7 = r7.mo17241c()     // Catch:{ all -> 0x0191 }
            com.google.android.gms.measurement.internal.ag r7 = r7.f15388e     // Catch:{ all -> 0x0191 }
            com.google.android.gms.measurement.internal.aw r8 = r6.f15755j     // Catch:{ all -> 0x0191 }
            com.google.android.gms.common.util.e r8 = r8.mo17153m()     // Catch:{ all -> 0x0191 }
            long r8 = r8.mo13694a()     // Catch:{ all -> 0x0191 }
            r7.mo17189a(r8)     // Catch:{ all -> 0x0191 }
        L_0x00c9:
            r6.m20877z()     // Catch:{ all -> 0x0191 }
            goto L_0x017d
        L_0x00ce:
            r9 = 0
            if (r11 == 0) goto L_0x00da
            java.lang.String r2 = "Last-Modified"
            java.lang.Object r11 = r11.get(r2)     // Catch:{ all -> 0x0191 }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x0191 }
            goto L_0x00db
        L_0x00da:
            r11 = r9
        L_0x00db:
            if (r11 == 0) goto L_0x00ea
            int r2 = r11.size()     // Catch:{ all -> 0x0191 }
            if (r2 <= 0) goto L_0x00ea
            java.lang.Object r11 = r11.get(r0)     // Catch:{ all -> 0x0191 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0191 }
            goto L_0x00eb
        L_0x00ea:
            r11 = r9
        L_0x00eb:
            if (r8 == r5) goto L_0x0107
            if (r8 != r4) goto L_0x00f0
            goto L_0x0107
        L_0x00f0:
            com.google.android.gms.measurement.internal.aq r9 = r6.m20871s()     // Catch:{ all -> 0x0191 }
            boolean r9 = r9.mo17204a(r7, r10, r11)     // Catch:{ all -> 0x0191 }
            if (r9 != 0) goto L_0x0128
            com.google.android.gms.measurement.internal.ew r7 = r6.mo17451d()     // Catch:{ all -> 0x000f }
            r7.mo17708x()     // Catch:{ all -> 0x000f }
            r6.f15763r = r0
            r6.m20850A()
            return
        L_0x0107:
            com.google.android.gms.measurement.internal.aq r11 = r6.m20871s()     // Catch:{ all -> 0x0191 }
            com.google.android.gms.internal.e.q r11 = r11.mo17202a(r7)     // Catch:{ all -> 0x0191 }
            if (r11 != 0) goto L_0x0128
            com.google.android.gms.measurement.internal.aq r11 = r6.m20871s()     // Catch:{ all -> 0x0191 }
            boolean r9 = r11.mo17204a(r7, r9, r9)     // Catch:{ all -> 0x0191 }
            if (r9 != 0) goto L_0x0128
            com.google.android.gms.measurement.internal.ew r7 = r6.mo17451d()     // Catch:{ all -> 0x000f }
            r7.mo17708x()     // Catch:{ all -> 0x000f }
            r6.f15763r = r0
            r6.m20850A()
            return
        L_0x0128:
            com.google.android.gms.measurement.internal.aw r9 = r6.f15755j     // Catch:{ all -> 0x0191 }
            com.google.android.gms.common.util.e r9 = r9.mo17153m()     // Catch:{ all -> 0x0191 }
            long r2 = r9.mo13694a()     // Catch:{ all -> 0x0191 }
            r1.mo17541g(r2)     // Catch:{ all -> 0x0191 }
            com.google.android.gms.measurement.internal.ew r9 = r6.mo17451d()     // Catch:{ all -> 0x0191 }
            r9.mo17685a(r1)     // Catch:{ all -> 0x0191 }
            if (r8 != r5) goto L_0x014e
            com.google.android.gms.measurement.internal.aw r8 = r6.f15755j     // Catch:{ all -> 0x0191 }
            com.google.android.gms.measurement.internal.r r8 = r8.mo17158r()     // Catch:{ all -> 0x0191 }
            com.google.android.gms.measurement.internal.t r8 = r8.mo17756k()     // Catch:{ all -> 0x0191 }
            java.lang.String r9 = "Config not found. Using empty config. appId"
            r8.mo17764a(r9, r7)     // Catch:{ all -> 0x0191 }
            goto L_0x0166
        L_0x014e:
            com.google.android.gms.measurement.internal.aw r7 = r6.f15755j     // Catch:{ all -> 0x0191 }
            com.google.android.gms.measurement.internal.r r7 = r7.mo17158r()     // Catch:{ all -> 0x0191 }
            com.google.android.gms.measurement.internal.t r7 = r7.mo17759x()     // Catch:{ all -> 0x0191 }
            java.lang.String r9 = "Successfully fetched config. Got network response. code, size"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0191 }
            int r10 = r10.length     // Catch:{ all -> 0x0191 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0191 }
            r7.mo17765a(r9, r8, r10)     // Catch:{ all -> 0x0191 }
        L_0x0166:
            com.google.android.gms.measurement.internal.v r7 = r6.mo17449c()     // Catch:{ all -> 0x0191 }
            boolean r7 = r7.mo17768f()     // Catch:{ all -> 0x0191 }
            if (r7 == 0) goto L_0x017a
            boolean r7 = r6.m20876y()     // Catch:{ all -> 0x0191 }
            if (r7 == 0) goto L_0x017a
            r6.mo17459k()     // Catch:{ all -> 0x0191 }
            goto L_0x017d
        L_0x017a:
            r6.m20877z()     // Catch:{ all -> 0x0191 }
        L_0x017d:
            com.google.android.gms.measurement.internal.ew r7 = r6.mo17451d()     // Catch:{ all -> 0x0191 }
            r7.mo17707w()     // Catch:{ all -> 0x0191 }
            com.google.android.gms.measurement.internal.ew r7 = r6.mo17451d()     // Catch:{ all -> 0x000f }
            r7.mo17708x()     // Catch:{ all -> 0x000f }
            r6.f15763r = r0
            r6.m20850A()
            return
        L_0x0191:
            r7 = move-exception
            com.google.android.gms.measurement.internal.ew r8 = r6.mo17451d()     // Catch:{ all -> 0x000f }
            r8.mo17708x()     // Catch:{ all -> 0x000f }
            throw r7     // Catch:{ all -> 0x000f }
        L_0x019a:
            r6.f15763r = r0
            r6.m20850A()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4852ec.mo17442a(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01c6  */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m20877z() {
        /*
            r20 = this;
            r0 = r20
            r20.m20874w()
            r20.mo17458j()
            boolean r1 = r20.m20852C()
            if (r1 != 0) goto L_0x001d
            com.google.android.gms.measurement.internal.aw r1 = r0.f15755j
            com.google.android.gms.measurement.internal.et r1 = r1.mo17240b()
            com.google.android.gms.measurement.internal.h$a<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.C4882h.f15895ar
            boolean r1 = r1.mo17639a(r2)
            if (r1 != 0) goto L_0x001d
            return
        L_0x001d:
            long r1 = r0.f15759n
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0064
            com.google.android.gms.measurement.internal.aw r1 = r0.f15755j
            com.google.android.gms.common.util.e r1 = r1.mo17153m()
            long r1 = r1.mo13695b()
            r5 = 3600000(0x36ee80, double:1.7786363E-317)
            long r7 = r0.f15759n
            long r9 = r1 - r7
            long r1 = java.lang.Math.abs(r9)
            long r7 = r5 - r1
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0062
            com.google.android.gms.measurement.internal.aw r1 = r0.f15755j
            com.google.android.gms.measurement.internal.r r1 = r1.mo17158r()
            com.google.android.gms.measurement.internal.t r1 = r1.mo17759x()
            java.lang.String r2 = "Upload has been suspended. Will update scheduling later in approximately ms"
            java.lang.Long r3 = java.lang.Long.valueOf(r7)
            r1.mo17764a(r2, r3)
            com.google.android.gms.measurement.internal.ab r1 = r20.m20872t()
            r1.mo17164b()
            com.google.android.gms.measurement.internal.dy r1 = r20.m20873v()
            r1.mo17425f()
            return
        L_0x0062:
            r0.f15759n = r3
        L_0x0064:
            com.google.android.gms.measurement.internal.aw r1 = r0.f15755j
            boolean r1 = r1.mo17235H()
            if (r1 == 0) goto L_0x0271
            boolean r1 = r20.m20876y()
            if (r1 != 0) goto L_0x0074
            goto L_0x0271
        L_0x0074:
            com.google.android.gms.measurement.internal.aw r1 = r0.f15755j
            com.google.android.gms.common.util.e r1 = r1.mo17153m()
            long r1 = r1.mo13694a()
            com.google.android.gms.measurement.internal.h$a<java.lang.Long> r5 = com.google.android.gms.measurement.internal.C4882h.f15858I
            java.lang.Object r5 = r5.mo17726b()
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            long r5 = java.lang.Math.max(r3, r5)
            com.google.android.gms.measurement.internal.ew r7 = r20.mo17451d()
            boolean r7 = r7.mo17673F()
            if (r7 != 0) goto L_0x00a5
            com.google.android.gms.measurement.internal.ew r7 = r20.mo17451d()
            boolean r7 = r7.mo17668A()
            if (r7 == 0) goto L_0x00a3
            goto L_0x00a5
        L_0x00a3:
            r7 = 0
            goto L_0x00a6
        L_0x00a5:
            r7 = 1
        L_0x00a6:
            if (r7 == 0) goto L_0x00e2
            com.google.android.gms.measurement.internal.aw r9 = r0.f15755j
            com.google.android.gms.measurement.internal.et r9 = r9.mo17240b()
            java.lang.String r9 = r9.mo17666v()
            boolean r10 = android.text.TextUtils.isEmpty(r9)
            if (r10 != 0) goto L_0x00d1
            java.lang.String r10 = ".none."
            boolean r9 = r10.equals(r9)
            if (r9 != 0) goto L_0x00d1
            com.google.android.gms.measurement.internal.h$a<java.lang.Long> r9 = com.google.android.gms.measurement.internal.C4882h.f15853D
            java.lang.Object r9 = r9.mo17726b()
            java.lang.Long r9 = (java.lang.Long) r9
            long r9 = r9.longValue()
            long r9 = java.lang.Math.max(r3, r9)
            goto L_0x00f2
        L_0x00d1:
            com.google.android.gms.measurement.internal.h$a<java.lang.Long> r9 = com.google.android.gms.measurement.internal.C4882h.f15852C
            java.lang.Object r9 = r9.mo17726b()
            java.lang.Long r9 = (java.lang.Long) r9
            long r9 = r9.longValue()
            long r9 = java.lang.Math.max(r3, r9)
            goto L_0x00f2
        L_0x00e2:
            com.google.android.gms.measurement.internal.h$a<java.lang.Long> r9 = com.google.android.gms.measurement.internal.C4882h.f15851B
            java.lang.Object r9 = r9.mo17726b()
            java.lang.Long r9 = (java.lang.Long) r9
            long r9 = r9.longValue()
            long r9 = java.lang.Math.max(r3, r9)
        L_0x00f2:
            com.google.android.gms.measurement.internal.aw r11 = r0.f15755j
            com.google.android.gms.measurement.internal.ad r11 = r11.mo17241c()
            com.google.android.gms.measurement.internal.ag r11 = r11.f15386c
            long r11 = r11.mo17188a()
            com.google.android.gms.measurement.internal.aw r13 = r0.f15755j
            com.google.android.gms.measurement.internal.ad r13 = r13.mo17241c()
            com.google.android.gms.measurement.internal.ag r13 = r13.f15387d
            long r13 = r13.mo17188a()
            com.google.android.gms.measurement.internal.ew r15 = r20.mo17451d()
            r16 = r9
            long r8 = r15.mo17670C()
            com.google.android.gms.measurement.internal.ew r10 = r20.mo17451d()
            r18 = r5
            long r5 = r10.mo17671D()
            long r5 = java.lang.Math.max(r8, r5)
            int r8 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r8 != 0) goto L_0x0129
        L_0x0126:
            r5 = r3
            goto L_0x01a4
        L_0x0129:
            long r8 = r5 - r1
            long r5 = java.lang.Math.abs(r8)
            long r8 = r1 - r5
            long r5 = r11 - r1
            long r5 = java.lang.Math.abs(r5)
            long r10 = r1 - r5
            long r5 = r13 - r1
            long r5 = java.lang.Math.abs(r5)
            long r12 = r1 - r5
            long r1 = java.lang.Math.max(r10, r12)
            long r5 = r8 + r18
            if (r7 == 0) goto L_0x0154
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 <= 0) goto L_0x0154
            long r5 = java.lang.Math.min(r8, r1)
            long r10 = r5 + r16
            r5 = r10
        L_0x0154:
            com.google.android.gms.measurement.internal.ei r7 = r20.mo17455g()
            r10 = r16
            boolean r7 = r7.mo17473a(r1, r10)
            if (r7 != 0) goto L_0x0162
            long r5 = r1 + r10
        L_0x0162:
            int r1 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x01a4
            int r1 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r1 < 0) goto L_0x01a4
            r1 = 0
        L_0x016b:
            r2 = 20
            com.google.android.gms.measurement.internal.h$a<java.lang.Integer> r7 = com.google.android.gms.measurement.internal.C4882h.f15860K
            java.lang.Object r7 = r7.mo17726b()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r8 = 0
            int r7 = java.lang.Math.max(r8, r7)
            int r2 = java.lang.Math.min(r2, r7)
            if (r1 >= r2) goto L_0x0126
            r9 = 1
            long r9 = r9 << r1
            com.google.android.gms.measurement.internal.h$a<java.lang.Long> r2 = com.google.android.gms.measurement.internal.C4882h.f15859J
            java.lang.Object r2 = r2.mo17726b()
            java.lang.Long r2 = (java.lang.Long) r2
            long r14 = r2.longValue()
            long r14 = java.lang.Math.max(r3, r14)
            long r14 = r14 * r9
            long r9 = r5 + r14
            int r2 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r2 <= 0) goto L_0x01a0
            r5 = r9
            goto L_0x01a4
        L_0x01a0:
            int r1 = r1 + 1
            r5 = r9
            goto L_0x016b
        L_0x01a4:
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x01c6
            com.google.android.gms.measurement.internal.aw r1 = r0.f15755j
            com.google.android.gms.measurement.internal.r r1 = r1.mo17158r()
            com.google.android.gms.measurement.internal.t r1 = r1.mo17759x()
            java.lang.String r2 = "Next upload time is 0"
            r1.mo17763a(r2)
            com.google.android.gms.measurement.internal.ab r1 = r20.m20872t()
            r1.mo17164b()
            com.google.android.gms.measurement.internal.dy r1 = r20.m20873v()
            r1.mo17425f()
            return
        L_0x01c6:
            com.google.android.gms.measurement.internal.v r1 = r20.mo17449c()
            boolean r1 = r1.mo17768f()
            if (r1 != 0) goto L_0x01ee
            com.google.android.gms.measurement.internal.aw r1 = r0.f15755j
            com.google.android.gms.measurement.internal.r r1 = r1.mo17158r()
            com.google.android.gms.measurement.internal.t r1 = r1.mo17759x()
            java.lang.String r2 = "No network"
            r1.mo17763a(r2)
            com.google.android.gms.measurement.internal.ab r1 = r20.m20872t()
            r1.mo17163a()
            com.google.android.gms.measurement.internal.dy r1 = r20.m20873v()
            r1.mo17425f()
            return
        L_0x01ee:
            com.google.android.gms.measurement.internal.aw r1 = r0.f15755j
            com.google.android.gms.measurement.internal.ad r1 = r1.mo17241c()
            com.google.android.gms.measurement.internal.ag r1 = r1.f15388e
            long r1 = r1.mo17188a()
            com.google.android.gms.measurement.internal.h$a<java.lang.Long> r7 = com.google.android.gms.measurement.internal.C4882h.f15928z
            java.lang.Object r7 = r7.mo17726b()
            java.lang.Long r7 = (java.lang.Long) r7
            long r7 = r7.longValue()
            long r7 = java.lang.Math.max(r3, r7)
            com.google.android.gms.measurement.internal.ei r9 = r20.mo17455g()
            boolean r9 = r9.mo17473a(r1, r7)
            if (r9 != 0) goto L_0x021a
            long r9 = r1 + r7
            long r5 = java.lang.Math.max(r5, r9)
        L_0x021a:
            com.google.android.gms.measurement.internal.ab r1 = r20.m20872t()
            r1.mo17164b()
            com.google.android.gms.measurement.internal.aw r1 = r0.f15755j
            com.google.android.gms.common.util.e r1 = r1.mo17153m()
            long r1 = r1.mo13694a()
            long r7 = r5 - r1
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x0256
            com.google.android.gms.measurement.internal.h$a<java.lang.Long> r1 = com.google.android.gms.measurement.internal.C4882h.f15854E
            java.lang.Object r1 = r1.mo17726b()
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r7 = java.lang.Math.max(r3, r1)
            com.google.android.gms.measurement.internal.aw r1 = r0.f15755j
            com.google.android.gms.measurement.internal.ad r1 = r1.mo17241c()
            com.google.android.gms.measurement.internal.ag r1 = r1.f15386c
            com.google.android.gms.measurement.internal.aw r2 = r0.f15755j
            com.google.android.gms.common.util.e r2 = r2.mo17153m()
            long r2 = r2.mo13694a()
            r1.mo17189a(r2)
        L_0x0256:
            com.google.android.gms.measurement.internal.aw r1 = r0.f15755j
            com.google.android.gms.measurement.internal.r r1 = r1.mo17158r()
            com.google.android.gms.measurement.internal.t r1 = r1.mo17759x()
            java.lang.String r2 = "Upload scheduled in approximately ms"
            java.lang.Long r3 = java.lang.Long.valueOf(r7)
            r1.mo17764a(r2, r3)
            com.google.android.gms.measurement.internal.dy r1 = r20.m20873v()
            r1.mo17424a(r7)
            return
        L_0x0271:
            com.google.android.gms.measurement.internal.aw r1 = r0.f15755j
            com.google.android.gms.measurement.internal.r r1 = r1.mo17158r()
            com.google.android.gms.measurement.internal.t r1 = r1.mo17759x()
            java.lang.String r2 = "Nothing to upload or uploading impossible"
            r1.mo17763a(r2)
            com.google.android.gms.measurement.internal.ab r1 = r20.m20872t()
            r1.mo17164b()
            com.google.android.gms.measurement.internal.dy r1 = r20.m20873v()
            r1.mo17425f()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4852ec.m20877z():void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo17441a(Runnable runnable) {
        m20874w();
        if (this.f15760o == null) {
            this.f15760o = new ArrayList();
        }
        this.f15760o.add(runnable);
    }

    /* renamed from: A */
    private final void m20850A() {
        m20874w();
        if (this.f15763r || this.f15764s || this.f15765t) {
            this.f15755j.mo17158r().mo17759x().mo17766a("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f15763r), Boolean.valueOf(this.f15764s), Boolean.valueOf(this.f15765t));
            return;
        }
        this.f15755j.mo17158r().mo17759x().mo17763a("Stopping uploading service(s)");
        if (this.f15760o != null) {
            for (Runnable run : this.f15760o) {
                run.run();
            }
            this.f15760o.clear();
        }
    }

    /* renamed from: b */
    private final Boolean m20867b(C4864en enVar) {
        try {
            if (enVar.mo17550k() != -2147483648L) {
                if (enVar.mo17550k() == ((long) C3404c.m12230a(this.f15755j.mo17154n()).mo13395b(enVar.mo17523b(), 0).versionCode)) {
                    return Boolean.valueOf(true);
                }
            } else {
                String str = C3404c.m12230a(this.f15755j.mo17154n()).mo13395b(enVar.mo17523b(), 0).versionName;
                if (enVar.mo17548j() != null && enVar.mo17548j().equals(str)) {
                    return Boolean.valueOf(true);
                }
            }
            return Boolean.valueOf(false);
        } catch (NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: B */
    private final boolean m20851B() {
        m20874w();
        try {
            this.f15767v = new RandomAccessFile(new File(this.f15755j.mo17154n().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
            this.f15766u = this.f15767v.tryLock();
            if (this.f15766u != null) {
                this.f15755j.mo17158r().mo17759x().mo17763a("Storage concurrent access okay");
                return true;
            }
            this.f15755j.mo17158r().mo17761y_().mo17763a("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e) {
            this.f15755j.mo17158r().mo17761y_().mo17764a("Failed to acquire storage lock", e);
        } catch (IOException e2) {
            this.f15755j.mo17158r().mo17761y_().mo17764a("Failed to access storage lock file", e2);
        }
    }

    /* renamed from: a */
    private final int m20853a(FileChannel fileChannel) {
        int i;
        m20874w();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.f15755j.mo17158r().mo17761y_().mo17763a("Bad channel to read from");
            return 0;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        try {
            fileChannel.position(0);
            int read = fileChannel.read(allocate);
            if (read != 4) {
                if (read != -1) {
                    this.f15755j.mo17158r().mo17754i().mo17764a("Unexpected data length. Bytes read", Integer.valueOf(read));
                }
                return 0;
            }
            allocate.flip();
            i = allocate.getInt();
            return i;
        } catch (IOException e) {
            this.f15755j.mo17158r().mo17761y_().mo17764a("Failed to read from channel", e);
            i = 0;
        }
    }

    /* renamed from: a */
    private final boolean m20861a(int i, FileChannel fileChannel) {
        m20874w();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.f15755j.mo17158r().mo17761y_().mo17763a("Bad channel to read from");
            return false;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(i);
        allocate.flip();
        try {
            fileChannel.truncate(0);
            fileChannel.write(allocate);
            fileChannel.force(true);
            if (fileChannel.size() != 4) {
                this.f15755j.mo17158r().mo17761y_().mo17764a("Error writing to channel. Bytes written", Long.valueOf(fileChannel.size()));
            }
            return true;
        } catch (IOException e) {
            this.f15755j.mo17158r().mo17761y_().mo17764a("Failed to write to channel", e);
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public final void mo17460l() {
        m20874w();
        mo17458j();
        if (!this.f15758m) {
            this.f15758m = true;
            m20874w();
            mo17458j();
            if ((this.f15755j.mo17240b().mo17639a(C4882h.f15895ar) || m20852C()) && m20851B()) {
                int a = m20853a(this.f15767v);
                int A = this.f15755j.mo17259z().mo17727A();
                m20874w();
                if (a > A) {
                    this.f15755j.mo17158r().mo17761y_().mo17765a("Panic: can't downgrade version. Previous, current version", Integer.valueOf(a), Integer.valueOf(A));
                } else if (a < A) {
                    if (m20861a(A, this.f15767v)) {
                        this.f15755j.mo17158r().mo17759x().mo17765a("Storage version upgraded. Previous, current version", Integer.valueOf(a), Integer.valueOf(A));
                    } else {
                        this.f15755j.mo17158r().mo17761y_().mo17765a("Storage version upgrade failed. Previous, current version", Integer.valueOf(a), Integer.valueOf(A));
                    }
                }
            }
        }
        if (!this.f15757l && !this.f15755j.mo17240b().mo17639a(C4882h.f15895ar)) {
            this.f15755j.mo17158r().mo17757v().mo17763a("This instance being marked as an uploader");
            this.f15757l = true;
            m20877z();
        }
    }

    /* renamed from: C */
    private final boolean m20852C() {
        m20874w();
        mo17458j();
        return this.f15757l;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo17446b(zzk zzk) {
        if (this.f15768w != null) {
            this.f15769x = new ArrayList();
            this.f15769x.addAll(this.f15768w);
        }
        C4873ew d = mo17451d();
        String str = zzk.f16003a;
        C3513t.m12627a(str);
        d.mo17144d();
        d.mo17430k();
        try {
            SQLiteDatabase y = d.mo17709y();
            String[] strArr = {str};
            int delete = 0 + y.delete("apps", "app_id=?", strArr) + y.delete("events", "app_id=?", strArr) + y.delete("user_attributes", "app_id=?", strArr) + y.delete("conditional_properties", "app_id=?", strArr) + y.delete("raw_events", "app_id=?", strArr) + y.delete("raw_events_metadata", "app_id=?", strArr) + y.delete("queue", "app_id=?", strArr) + y.delete("audience_filter_values", "app_id=?", strArr) + y.delete("main_event_params", "app_id=?", strArr);
            if (delete > 0) {
                d.mo17158r().mo17759x().mo17765a("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            d.mo17158r().mo17761y_().mo17765a("Error resetting analytics data. appId, error", C4893r.m21360a(str), e);
        }
        zzk a = m20856a(this.f15755j.mo17154n(), zzk.f16003a, zzk.f16004b, zzk.f16010h, zzk.f16017o, zzk.f16018p, zzk.f16015m, zzk.f16020r);
        if (!this.f15755j.mo17240b().mo17655j(zzk.f16003a) || zzk.f16010h) {
            mo17450c(a);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0057 A[Catch:{ NameNotFoundException -> 0x00bd }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.measurement.internal.zzk m20856a(android.content.Context r27, java.lang.String r28, java.lang.String r29, boolean r30, boolean r31, boolean r32, long r33, java.lang.String r35) {
        /*
            r26 = this;
            r0 = r26
            r2 = r28
            java.lang.String r1 = "Unknown"
            java.lang.String r3 = "Unknown"
            java.lang.String r4 = "Unknown"
            android.content.pm.PackageManager r5 = r27.getPackageManager()
            r6 = 0
            if (r5 != 0) goto L_0x0021
            com.google.android.gms.measurement.internal.aw r1 = r0.f15755j
            com.google.android.gms.measurement.internal.r r1 = r1.mo17158r()
            com.google.android.gms.measurement.internal.t r1 = r1.mo17761y_()
            java.lang.String r2 = "PackageManager is null, can not log app install information"
            r1.mo17763a(r2)
            return r6
        L_0x0021:
            java.lang.String r5 = r5.getInstallerPackageName(r2)     // Catch:{ IllegalArgumentException -> 0x0026 }
            goto L_0x003a
        L_0x0026:
            com.google.android.gms.measurement.internal.aw r5 = r0.f15755j
            com.google.android.gms.measurement.internal.r r5 = r5.mo17158r()
            com.google.android.gms.measurement.internal.t r5 = r5.mo17761y_()
            java.lang.String r7 = "Error retrieving installer package name. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C4893r.m21360a(r28)
            r5.mo17764a(r7, r8)
            r5 = r1
        L_0x003a:
            if (r5 != 0) goto L_0x0040
            java.lang.String r1 = "manual_install"
        L_0x003e:
            r7 = r1
            goto L_0x004c
        L_0x0040:
            java.lang.String r1 = "com.android.vending"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x004b
            java.lang.String r1 = ""
            goto L_0x003e
        L_0x004b:
            r7 = r5
        L_0x004c:
            com.google.android.gms.common.b.b r1 = com.google.android.gms.common.p140b.C3404c.m12230a(r27)     // Catch:{ NameNotFoundException -> 0x00bd }
            r5 = 0
            android.content.pm.PackageInfo r1 = r1.mo13395b(r2, r5)     // Catch:{ NameNotFoundException -> 0x00bd }
            if (r1 == 0) goto L_0x006f
            com.google.android.gms.common.b.b r3 = com.google.android.gms.common.p140b.C3404c.m12230a(r27)     // Catch:{ NameNotFoundException -> 0x00bd }
            java.lang.CharSequence r3 = r3.mo13396b(r2)     // Catch:{ NameNotFoundException -> 0x00bd }
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch:{ NameNotFoundException -> 0x00bd }
            if (r5 != 0) goto L_0x006a
            java.lang.String r3 = r3.toString()     // Catch:{ NameNotFoundException -> 0x00bd }
            r4 = r3
        L_0x006a:
            java.lang.String r3 = r1.versionName     // Catch:{ NameNotFoundException -> 0x00bd }
            int r1 = r1.versionCode     // Catch:{ NameNotFoundException -> 0x00bd }
            goto L_0x0071
        L_0x006f:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0071:
            r4 = r3
            r16 = 0
            com.google.android.gms.measurement.internal.aw r3 = r0.f15755j
            r3.mo17161u()
            r5 = 0
            com.google.android.gms.measurement.internal.aw r3 = r0.f15755j
            com.google.android.gms.measurement.internal.et r3 = r3.mo17240b()
            boolean r3 = r3.mo17657l(r2)
            if (r3 == 0) goto L_0x008a
            r18 = r33
            goto L_0x008c
        L_0x008a:
            r18 = r5
        L_0x008c:
            com.google.android.gms.measurement.internal.zzk r25 = new com.google.android.gms.measurement.internal.zzk
            long r5 = (long) r1
            com.google.android.gms.measurement.internal.aw r1 = r0.f15755j
            com.google.android.gms.measurement.internal.et r1 = r1.mo17240b()
            long r8 = r1.mo17647f()
            com.google.android.gms.measurement.internal.aw r1 = r0.f15755j
            com.google.android.gms.measurement.internal.el r1 = r1.mo17248j()
            r3 = r27
            long r10 = r1.mo17483a(r3, r2)
            r12 = 0
            r14 = 0
            java.lang.String r15 = ""
            r20 = 0
            r23 = 0
            r1 = r25
            r3 = r29
            r13 = r30
            r21 = r31
            r22 = r32
            r24 = r35
            r1.<init>(r2, r3, r4, r5, r7, r8, r10, r12, r13, r14, r15, r16, r18, r20, r21, r22, r23, r24)
            return r25
        L_0x00bd:
            com.google.android.gms.measurement.internal.aw r1 = r0.f15755j
            com.google.android.gms.measurement.internal.r r1 = r1.mo17158r()
            com.google.android.gms.measurement.internal.t r1 = r1.mo17761y_()
            java.lang.String r3 = "Error retrieving newly installed package info. appId, appName"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C4893r.m21360a(r28)
            r1.mo17765a(r3, r2, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4852ec.m20856a(android.content.Context, java.lang.String, java.lang.String, boolean, boolean, boolean, long, java.lang.String):com.google.android.gms.measurement.internal.zzk");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo17437a(zzfv zzfv, zzk zzk) {
        m20874w();
        mo17458j();
        if (TextUtils.isEmpty(zzk.f16004b) && TextUtils.isEmpty(zzk.f16020r)) {
            return;
        }
        if (!zzk.f16010h) {
            m20870e(zzk);
            return;
        }
        int c = this.f15755j.mo17248j().mo17499c(zzfv.f15995a);
        int i = 0;
        if (c != 0) {
            this.f15755j.mo17248j();
            this.f15755j.mo17248j().mo17492a(zzk.f16003a, c, "_ev", C4862el.m20963a(zzfv.f15995a, 24, true), zzfv.f15995a != null ? zzfv.f15995a.length() : 0);
            return;
        }
        int b = this.f15755j.mo17248j().mo17497b(zzfv.f15995a, zzfv.mo17782a());
        if (b != 0) {
            this.f15755j.mo17248j();
            String a = C4862el.m20963a(zzfv.f15995a, 24, true);
            Object a2 = zzfv.mo17782a();
            if (a2 != null && ((a2 instanceof String) || (a2 instanceof CharSequence))) {
                i = String.valueOf(a2).length();
            }
            this.f15755j.mo17248j().mo17492a(zzk.f16003a, b, "_ev", a, i);
            return;
        }
        Object c2 = this.f15755j.mo17248j().mo17500c(zzfv.f15995a, zzfv.mo17782a());
        if (c2 != null) {
            if (this.f15755j.mo17240b().mo17662q(zzk.f16003a) && "_sno".equals(zzfv.f15995a)) {
                long j = 0;
                C4861ek c3 = mo17451d().mo17697c(zzk.f16003a, "_sno");
                if (c3 == null || !(c3.f15788e instanceof Long)) {
                    C4822d a3 = mo17451d().mo17677a(zzk.f16003a, "_s");
                    if (a3 != null) {
                        j = a3.f15663c;
                        this.f15755j.mo17158r().mo17759x().mo17764a("Backfill the session number. Last used session number", Long.valueOf(j));
                    }
                } else {
                    j = ((Long) c3.f15788e).longValue();
                }
                c2 = Long.valueOf(j + 1);
            }
            C4861ek ekVar = new C4861ek(zzk.f16003a, zzfv.f15999e, zzfv.f15995a, zzfv.f15996b, c2);
            this.f15755j.mo17158r().mo17758w().mo17765a("Setting user property", this.f15755j.mo17249k().mo17748c(ekVar.f15786c), c2);
            mo17451d().mo17704f();
            try {
                m20870e(zzk);
                boolean a4 = mo17451d().mo17690a(ekVar);
                mo17451d().mo17707w();
                if (a4) {
                    this.f15755j.mo17158r().mo17758w().mo17765a("User property set", this.f15755j.mo17249k().mo17748c(ekVar.f15786c), ekVar.f15788e);
                } else {
                    this.f15755j.mo17158r().mo17761y_().mo17765a("Too many unique user properties are set. Ignoring user property", this.f15755j.mo17249k().mo17748c(ekVar.f15786c), ekVar.f15788e);
                    this.f15755j.mo17248j().mo17492a(zzk.f16003a, 9, (String) null, (String) null, 0);
                }
            } finally {
                mo17451d().mo17708x();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo17445b(zzfv zzfv, zzk zzk) {
        m20874w();
        mo17458j();
        if (TextUtils.isEmpty(zzk.f16004b) && TextUtils.isEmpty(zzk.f16020r)) {
            return;
        }
        if (!zzk.f16010h) {
            m20870e(zzk);
            return;
        }
        this.f15755j.mo17158r().mo17758w().mo17764a("Removing user property", this.f15755j.mo17249k().mo17748c(zzfv.f15995a));
        mo17451d().mo17704f();
        try {
            m20870e(zzk);
            mo17451d().mo17695b(zzk.f16003a, zzfv.f15995a);
            mo17451d().mo17707w();
            this.f15755j.mo17158r().mo17758w().mo17764a("User property removed", this.f15755j.mo17249k().mo17748c(zzfv.f15995a));
        } finally {
            mo17451d().mo17708x();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo17434a(C4851eb ebVar) {
        this.f15761p++;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public final void mo17461o() {
        this.f15762q++;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public final C4764aw mo17462p() {
        return this.f15755j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo17450c(zzk zzk) {
        C4864en b;
        long j;
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo;
        boolean z;
        C4873ew d;
        String b2;
        zzk zzk2 = zzk;
        m20874w();
        mo17458j();
        C3513t.m12625a(zzk);
        C3513t.m12627a(zzk2.f16003a);
        if (!TextUtils.isEmpty(zzk2.f16004b) || !TextUtils.isEmpty(zzk2.f16020r)) {
            C4864en b3 = mo17451d().mo17693b(zzk2.f16003a);
            if (b3 != null && TextUtils.isEmpty(b3.mo17531d()) && !TextUtils.isEmpty(zzk2.f16004b)) {
                b3.mo17541g(0);
                mo17451d().mo17685a(b3);
                m20871s().mo17210d(zzk2.f16003a);
            }
            if (!zzk2.f16010h) {
                m20870e(zzk);
                return;
            }
            long j2 = zzk2.f16015m;
            if (j2 == 0) {
                j2 = this.f15755j.mo17153m().mo13694a();
            }
            int i = zzk2.f16016n;
            if (!(i == 0 || i == 1)) {
                this.f15755j.mo17158r().mo17754i().mo17765a("Incorrect app type, assuming installed app. appId, appType", C4893r.m21360a(zzk2.f16003a), Integer.valueOf(i));
                i = 0;
            }
            mo17451d().mo17704f();
            try {
                b = mo17451d().mo17693b(zzk2.f16003a);
                if (b != null) {
                    this.f15755j.mo17248j();
                    if (C4862el.m20970a(zzk2.f16004b, b.mo17531d(), zzk2.f16020r, b.mo17534e())) {
                        this.f15755j.mo17158r().mo17754i().mo17764a("New GMP App Id passed in. Removing cached database data. appId", C4893r.m21360a(b.mo17523b()));
                        d = mo17451d();
                        b2 = b.mo17523b();
                        d.mo17430k();
                        d.mo17144d();
                        C3513t.m12627a(b2);
                        SQLiteDatabase y = d.mo17709y();
                        String[] strArr = {b2};
                        int delete = y.delete("events", "app_id=?", strArr) + 0 + y.delete("user_attributes", "app_id=?", strArr) + y.delete("conditional_properties", "app_id=?", strArr) + y.delete("apps", "app_id=?", strArr) + y.delete("raw_events", "app_id=?", strArr) + y.delete("raw_events_metadata", "app_id=?", strArr) + y.delete("event_filters", "app_id=?", strArr) + y.delete("property_filters", "app_id=?", strArr) + y.delete("audience_filter_values", "app_id=?", strArr);
                        if (delete > 0) {
                            d.mo17158r().mo17759x().mo17765a("Deleted application data. app, records", b2, Integer.valueOf(delete));
                        }
                        b = null;
                    }
                }
            } catch (SQLiteException e) {
                d.mo17158r().mo17761y_().mo17765a("Error deleting application data. appId, error", C4893r.m21360a(b2), e);
            } catch (Throwable th) {
                Throwable th2 = th;
                mo17451d().mo17708x();
                throw th2;
            }
            if (b != null) {
                if (b.mo17550k() != -2147483648L) {
                    if (b.mo17550k() != zzk2.f16012j) {
                        Bundle bundle = new Bundle();
                        bundle.putString("_pv", b.mo17548j());
                        zzag zzag = new zzag("_au", new zzad(bundle), "auto", j2);
                        mo17435a(zzag, zzk2);
                    }
                } else if (b.mo17548j() != null && !b.mo17548j().equals(zzk2.f16005c)) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("_pv", b.mo17548j());
                    zzag zzag2 = new zzag("_au", new zzad(bundle2), "auto", j2);
                    mo17435a(zzag2, zzk2);
                }
            }
            m20870e(zzk);
            C4822d dVar = i == 0 ? mo17451d().mo17677a(zzk2.f16003a, "_f") : i == 1 ? mo17451d().mo17677a(zzk2.f16003a, "_v") : null;
            if (dVar == null) {
                long j3 = 3600000 * (1 + (j2 / 3600000));
                if (i == 0) {
                    j = 1;
                    zzfv zzfv = new zzfv("_fot", j2, Long.valueOf(j3), "auto");
                    mo17437a(zzfv, zzk2);
                    if (this.f15755j.mo17240b().mo17659n(zzk2.f16004b)) {
                        m20874w();
                        this.f15755j.mo17244f().mo17195a(zzk2.f16003a);
                    }
                    m20874w();
                    mo17458j();
                    Bundle bundle3 = new Bundle();
                    bundle3.putLong("_c", 1);
                    bundle3.putLong("_r", 1);
                    bundle3.putLong("_uwa", 0);
                    bundle3.putLong("_pfo", 0);
                    bundle3.putLong("_sys", 0);
                    bundle3.putLong("_sysu", 0);
                    if (this.f15755j.mo17240b().mo17665t(zzk2.f16003a)) {
                        bundle3.putLong("_et", 1);
                    }
                    if (this.f15755j.mo17240b().mo17655j(zzk2.f16003a) && zzk2.f16019q) {
                        bundle3.putLong("_dac", 1);
                    }
                    if (this.f15755j.mo17154n().getPackageManager() == null) {
                        this.f15755j.mo17158r().mo17761y_().mo17764a("PackageManager is null, first open report might be inaccurate. appId", C4893r.m21360a(zzk2.f16003a));
                    } else {
                        try {
                            packageInfo = C3404c.m12230a(this.f15755j.mo17154n()).mo13395b(zzk2.f16003a, 0);
                        } catch (NameNotFoundException e2) {
                            this.f15755j.mo17158r().mo17761y_().mo17765a("Package info is null, first open report might be inaccurate. appId", C4893r.m21360a(zzk2.f16003a), e2);
                            packageInfo = null;
                        }
                        if (!(packageInfo == null || packageInfo.firstInstallTime == 0)) {
                            if (packageInfo.firstInstallTime != packageInfo.lastUpdateTime) {
                                bundle3.putLong("_uwa", 1);
                                z = false;
                            } else {
                                z = true;
                            }
                            zzfv zzfv2 = new zzfv("_fi", j2, Long.valueOf(z ? 1 : 0), "auto");
                            mo17437a(zzfv2, zzk2);
                        }
                        try {
                            applicationInfo = C3404c.m12230a(this.f15755j.mo17154n()).mo13390a(zzk2.f16003a, 0);
                        } catch (NameNotFoundException e3) {
                            this.f15755j.mo17158r().mo17761y_().mo17765a("Application info is null, first open report might be inaccurate. appId", C4893r.m21360a(zzk2.f16003a), e3);
                            applicationInfo = null;
                        }
                        if (applicationInfo != null) {
                            if ((applicationInfo.flags & 1) != 0) {
                                bundle3.putLong("_sys", 1);
                            }
                            if ((applicationInfo.flags & 128) != 0) {
                                bundle3.putLong("_sysu", 1);
                            }
                        }
                    }
                    C4873ew d2 = mo17451d();
                    String str = zzk2.f16003a;
                    C3513t.m12627a(str);
                    d2.mo17144d();
                    d2.mo17430k();
                    long h = d2.mo17706h(str, "first_open_count");
                    if (h >= 0) {
                        bundle3.putLong("_pfo", h);
                    }
                    zzag zzag3 = new zzag("_f", new zzad(bundle3), "auto", j2);
                    mo17435a(zzag3, zzk2);
                } else {
                    j = 1;
                    if (i == 1) {
                        zzfv zzfv3 = new zzfv("_fvt", j2, Long.valueOf(j3), "auto");
                        mo17437a(zzfv3, zzk2);
                        m20874w();
                        mo17458j();
                        Bundle bundle4 = new Bundle();
                        bundle4.putLong("_c", 1);
                        bundle4.putLong("_r", 1);
                        if (this.f15755j.mo17240b().mo17665t(zzk2.f16003a)) {
                            bundle4.putLong("_et", 1);
                        }
                        if (this.f15755j.mo17240b().mo17655j(zzk2.f16003a) && zzk2.f16019q) {
                            bundle4.putLong("_dac", 1);
                        }
                        zzag zzag4 = new zzag("_v", new zzad(bundle4), "auto", j2);
                        mo17435a(zzag4, zzk2);
                    }
                }
                if (!this.f15755j.mo17240b().mo17645d(zzk2.f16003a, C4882h.f15892ao)) {
                    Bundle bundle5 = new Bundle();
                    bundle5.putLong("_et", j);
                    if (this.f15755j.mo17240b().mo17665t(zzk2.f16003a)) {
                        bundle5.putLong("_fr", j);
                    }
                    zzag zzag5 = new zzag("_e", new zzad(bundle5), "auto", j2);
                    mo17435a(zzag5, zzk2);
                }
            } else if (zzk2.f16011i) {
                zzag zzag6 = new zzag("_cd", new zzad(new Bundle()), "auto", j2);
                mo17435a(zzag6, zzk2);
            }
            mo17451d().mo17707w();
            mo17451d().mo17708x();
        }
    }

    /* renamed from: a */
    private final zzk m20857a(String str) {
        String str2 = str;
        C4864en b = mo17451d().mo17693b(str2);
        if (b == null || TextUtils.isEmpty(b.mo17548j())) {
            this.f15755j.mo17158r().mo17758w().mo17764a("No app data available; dropping", str2);
            return null;
        }
        Boolean b2 = m20867b(b);
        if (b2 == null || b2.booleanValue()) {
            zzk zzk = new zzk(str2, b.mo17531d(), b.mo17548j(), b.mo17550k(), b.mo17552l(), b.mo17554m(), b.mo17556n(), (String) null, b.mo17559o(), false, b.mo17540g(), b.mo17516B(), 0, 0, b.mo17517C(), b.mo17518D(), false, b.mo17534e());
            return zzk;
        }
        this.f15755j.mo17158r().mo17761y_().mo17764a("App version does not match; dropping. appId", C4893r.m21360a(str));
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo17439a(zzo zzo) {
        zzk a = m20857a(zzo.f16021a);
        if (a != null) {
            mo17440a(zzo, a);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo17440a(zzo zzo, zzk zzk) {
        C3513t.m12625a(zzo);
        C3513t.m12627a(zzo.f16021a);
        C3513t.m12625a(zzo.f16022b);
        C3513t.m12625a(zzo.f16023c);
        C3513t.m12627a(zzo.f16023c.f15995a);
        m20874w();
        mo17458j();
        if (TextUtils.isEmpty(zzk.f16004b) && TextUtils.isEmpty(zzk.f16020r)) {
            return;
        }
        if (!zzk.f16010h) {
            m20870e(zzk);
            return;
        }
        zzo zzo2 = new zzo(zzo);
        boolean z = false;
        zzo2.f16025e = false;
        mo17451d().mo17704f();
        try {
            zzo d = mo17451d().mo17698d(zzo2.f16021a, zzo2.f16023c.f15995a);
            if (d != null && !d.f16022b.equals(zzo2.f16022b)) {
                this.f15755j.mo17158r().mo17754i().mo17766a("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.f15755j.mo17249k().mo17748c(zzo2.f16023c.f15995a), zzo2.f16022b, d.f16022b);
            }
            if (d != null && d.f16025e) {
                zzo2.f16022b = d.f16022b;
                zzo2.f16024d = d.f16024d;
                zzo2.f16028h = d.f16028h;
                zzo2.f16026f = d.f16026f;
                zzo2.f16029i = d.f16029i;
                zzo2.f16025e = d.f16025e;
                zzfv zzfv = new zzfv(zzo2.f16023c.f15995a, d.f16023c.f15996b, zzo2.f16023c.mo17782a(), d.f16023c.f15999e);
                zzo2.f16023c = zzfv;
            } else if (TextUtils.isEmpty(zzo2.f16026f)) {
                zzfv zzfv2 = new zzfv(zzo2.f16023c.f15995a, zzo2.f16024d, zzo2.f16023c.mo17782a(), zzo2.f16023c.f15999e);
                zzo2.f16023c = zzfv2;
                zzo2.f16025e = true;
                z = true;
            }
            if (zzo2.f16025e) {
                zzfv zzfv3 = zzo2.f16023c;
                C4861ek ekVar = new C4861ek(zzo2.f16021a, zzo2.f16022b, zzfv3.f15995a, zzfv3.f15996b, zzfv3.mo17782a());
                if (mo17451d().mo17690a(ekVar)) {
                    this.f15755j.mo17158r().mo17758w().mo17766a("User property updated immediately", zzo2.f16021a, this.f15755j.mo17249k().mo17748c(ekVar.f15786c), ekVar.f15788e);
                } else {
                    this.f15755j.mo17158r().mo17761y_().mo17766a("(2)Too many active user properties, ignoring", C4893r.m21360a(zzo2.f16021a), this.f15755j.mo17249k().mo17748c(ekVar.f15786c), ekVar.f15788e);
                }
                if (z && zzo2.f16029i != null) {
                    m20869b(new zzag(zzo2.f16029i, zzo2.f16024d), zzk);
                }
            }
            if (mo17451d().mo17691a(zzo2)) {
                this.f15755j.mo17158r().mo17758w().mo17766a("Conditional property added", zzo2.f16021a, this.f15755j.mo17249k().mo17748c(zzo2.f16023c.f15995a), zzo2.f16023c.mo17782a());
            } else {
                this.f15755j.mo17158r().mo17761y_().mo17766a("Too many conditional properties, ignoring", C4893r.m21360a(zzo2.f16021a), this.f15755j.mo17249k().mo17748c(zzo2.f16023c.f15995a), zzo2.f16023c.mo17782a());
            }
            mo17451d().mo17707w();
        } finally {
            mo17451d().mo17708x();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo17447b(zzo zzo) {
        zzk a = m20857a(zzo.f16021a);
        if (a != null) {
            mo17448b(zzo, a);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo17448b(zzo zzo, zzk zzk) {
        C3513t.m12625a(zzo);
        C3513t.m12627a(zzo.f16021a);
        C3513t.m12625a(zzo.f16023c);
        C3513t.m12627a(zzo.f16023c.f15995a);
        m20874w();
        mo17458j();
        if (TextUtils.isEmpty(zzk.f16004b) && TextUtils.isEmpty(zzk.f16020r)) {
            return;
        }
        if (!zzk.f16010h) {
            m20870e(zzk);
            return;
        }
        mo17451d().mo17704f();
        try {
            m20870e(zzk);
            zzo d = mo17451d().mo17698d(zzo.f16021a, zzo.f16023c.f15995a);
            if (d != null) {
                this.f15755j.mo17158r().mo17758w().mo17765a("Removing conditional user property", zzo.f16021a, this.f15755j.mo17249k().mo17748c(zzo.f16023c.f15995a));
                mo17451d().mo17700e(zzo.f16021a, zzo.f16023c.f15995a);
                if (d.f16025e) {
                    mo17451d().mo17695b(zzo.f16021a, zzo.f16023c.f15995a);
                }
                if (zzo.f16031k != null) {
                    Bundle bundle = null;
                    if (zzo.f16031k.f15992b != null) {
                        bundle = zzo.f16031k.f15992b.mo17773b();
                    }
                    Bundle bundle2 = bundle;
                    m20869b(this.f15755j.mo17248j().mo17487a(zzo.f16021a, zzo.f16031k.f15991a, bundle2, d.f16022b, zzo.f16031k.f15994d, true, false), zzk);
                }
            } else {
                this.f15755j.mo17158r().mo17754i().mo17765a("Conditional user property doesn't exist", C4893r.m21360a(zzo.f16021a), this.f15755j.mo17249k().mo17748c(zzo.f16023c.f15995a));
            }
            mo17451d().mo17707w();
        } finally {
            mo17451d().mo17708x();
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x015a  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C4864en m20870e(com.google.android.gms.measurement.internal.zzk r9) {
        /*
            r8 = this;
            r8.m20874w()
            r8.mo17458j()
            com.google.android.gms.common.internal.C3513t.m12625a(r9)
            java.lang.String r0 = r9.f16003a
            com.google.android.gms.common.internal.C3513t.m12627a(r0)
            com.google.android.gms.measurement.internal.ew r0 = r8.mo17451d()
            java.lang.String r1 = r9.f16003a
            com.google.android.gms.measurement.internal.en r0 = r0.mo17693b(r1)
            com.google.android.gms.measurement.internal.aw r1 = r8.f15755j
            com.google.android.gms.measurement.internal.ad r1 = r1.mo17241c()
            java.lang.String r2 = r9.f16003a
            java.lang.String r1 = r1.mo17170b(r2)
            r2 = 1
            if (r0 != 0) goto L_0x0042
            com.google.android.gms.measurement.internal.en r0 = new com.google.android.gms.measurement.internal.en
            com.google.android.gms.measurement.internal.aw r3 = r8.f15755j
            java.lang.String r4 = r9.f16003a
            r0.<init>(r3, r4)
            com.google.android.gms.measurement.internal.aw r3 = r8.f15755j
            com.google.android.gms.measurement.internal.el r3 = r3.mo17248j()
            java.lang.String r3 = r3.mo17506k()
            r0.mo17521a(r3)
            r0.mo17533d(r1)
        L_0x0040:
            r1 = r2
            goto L_0x005e
        L_0x0042:
            java.lang.String r3 = r0.mo17537f()
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x005d
            r0.mo17533d(r1)
            com.google.android.gms.measurement.internal.aw r1 = r8.f15755j
            com.google.android.gms.measurement.internal.el r1 = r1.mo17248j()
            java.lang.String r1 = r1.mo17506k()
            r0.mo17521a(r1)
            goto L_0x0040
        L_0x005d:
            r1 = 0
        L_0x005e:
            java.lang.String r3 = r9.f16004b
            java.lang.String r4 = r0.mo17531d()
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            if (r3 != 0) goto L_0x0070
            java.lang.String r1 = r9.f16004b
            r0.mo17525b(r1)
            r1 = r2
        L_0x0070:
            java.lang.String r3 = r9.f16020r
            java.lang.String r4 = r0.mo17534e()
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            if (r3 != 0) goto L_0x0082
            java.lang.String r1 = r9.f16020r
            r0.mo17529c(r1)
            r1 = r2
        L_0x0082:
            java.lang.String r3 = r9.f16013k
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x009c
            java.lang.String r3 = r9.f16013k
            java.lang.String r4 = r0.mo17540g()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x009c
            java.lang.String r1 = r9.f16013k
            r0.mo17536e(r1)
            r1 = r2
        L_0x009c:
            long r3 = r9.f16007e
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x00b4
            long r3 = r9.f16007e
            long r5 = r0.mo17554m()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x00b4
            long r3 = r9.f16007e
            r0.mo17532d(r3)
            r1 = r2
        L_0x00b4:
            java.lang.String r3 = r9.f16005c
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x00ce
            java.lang.String r3 = r9.f16005c
            java.lang.String r4 = r0.mo17548j()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x00ce
            java.lang.String r1 = r9.f16005c
            r0.mo17539f(r1)
            r1 = r2
        L_0x00ce:
            long r3 = r9.f16012j
            long r5 = r0.mo17550k()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x00de
            long r3 = r9.f16012j
            r0.mo17528c(r3)
            r1 = r2
        L_0x00de:
            java.lang.String r3 = r9.f16006d
            if (r3 == 0) goto L_0x00f4
            java.lang.String r3 = r9.f16006d
            java.lang.String r4 = r0.mo17552l()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x00f4
            java.lang.String r1 = r9.f16006d
            r0.mo17542g(r1)
            r1 = r2
        L_0x00f4:
            long r3 = r9.f16008f
            long r5 = r0.mo17556n()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0104
            long r3 = r9.f16008f
            r0.mo17535e(r3)
            r1 = r2
        L_0x0104:
            boolean r3 = r9.f16010h
            boolean r4 = r0.mo17559o()
            if (r3 == r4) goto L_0x0112
            boolean r1 = r9.f16010h
            r0.mo17522a(r1)
            r1 = r2
        L_0x0112:
            java.lang.String r3 = r9.f16009g
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x012c
            java.lang.String r3 = r9.f16009g
            java.lang.String r4 = r0.mo17570z()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x012c
            java.lang.String r1 = r9.f16009g
            r0.mo17545h(r1)
            r1 = r2
        L_0x012c:
            long r3 = r9.f16014l
            long r5 = r0.mo17516B()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x013c
            long r3 = r9.f16014l
            r0.mo17558o(r3)
            r1 = r2
        L_0x013c:
            boolean r3 = r9.f16017o
            boolean r4 = r0.mo17517C()
            if (r3 == r4) goto L_0x014a
            boolean r1 = r9.f16017o
            r0.mo17526b(r1)
            r1 = r2
        L_0x014a:
            boolean r3 = r9.f16018p
            boolean r4 = r0.mo17518D()
            if (r3 == r4) goto L_0x0158
            boolean r9 = r9.f16018p
            r0.mo17530c(r9)
            r1 = r2
        L_0x0158:
            if (r1 == 0) goto L_0x0161
            com.google.android.gms.measurement.internal.ew r9 = r8.mo17451d()
            r9.mo17685a(r0)
        L_0x0161:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4852ec.m20870e(com.google.android.gms.measurement.internal.zzk):com.google.android.gms.measurement.internal.en");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final String mo17452d(zzk zzk) {
        try {
            return (String) this.f15755j.mo17157q().mo17218a((Callable<V>) new C4857eg<V>(this, zzk)).get(30000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            this.f15755j.mo17158r().mo17761y_().mo17765a("Failed to get app instance id. appId", C4893r.m21360a(zzk.f16003a), e);
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo17443a(boolean z) {
        m20877z();
    }
}
