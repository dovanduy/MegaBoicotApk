package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.common.util.C3553e;
import com.google.android.gms.measurement.AppMeasurement;

/* renamed from: com.google.android.gms.measurement.internal.r */
public final class C4893r extends C4788bt {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public char f15957a = 0;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public long f15958b = -1;

    /* renamed from: c */
    private String f15959c;

    /* renamed from: d */
    private final C4895t f15960d = new C4895t(this, 6, false, false);

    /* renamed from: e */
    private final C4895t f15961e = new C4895t(this, 6, true, false);

    /* renamed from: f */
    private final C4895t f15962f = new C4895t(this, 6, false, true);

    /* renamed from: g */
    private final C4895t f15963g = new C4895t(this, 5, false, false);

    /* renamed from: h */
    private final C4895t f15964h = new C4895t(this, 5, true, false);

    /* renamed from: i */
    private final C4895t f15965i = new C4895t(this, 5, false, true);

    /* renamed from: j */
    private final C4895t f15966j = new C4895t(this, 4, false, false);

    /* renamed from: k */
    private final C4895t f15967k = new C4895t(this, 3, false, false);

    /* renamed from: l */
    private final C4895t f15968l = new C4895t(this, 2, false, false);

    C4893r(C4764aw awVar) {
        super(awVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo17176e() {
        return false;
    }

    /* renamed from: y_ */
    public final C4895t mo17761y_() {
        return this.f15960d;
    }

    /* renamed from: g */
    public final C4895t mo17752g() {
        return this.f15961e;
    }

    /* renamed from: h */
    public final C4895t mo17753h() {
        return this.f15962f;
    }

    /* renamed from: i */
    public final C4895t mo17754i() {
        return this.f15963g;
    }

    /* renamed from: j */
    public final C4895t mo17755j() {
        return this.f15964h;
    }

    /* renamed from: k */
    public final C4895t mo17756k() {
        return this.f15965i;
    }

    /* renamed from: v */
    public final C4895t mo17757v() {
        return this.f15966j;
    }

    /* renamed from: w */
    public final C4895t mo17758w() {
        return this.f15967k;
    }

    /* renamed from: x */
    public final C4895t mo17759x() {
        return this.f15968l;
    }

    /* renamed from: a */
    protected static Object m21360a(String str) {
        if (str == null) {
            return null;
        }
        return new C4896u(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo17750a(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && mo17751a(i)) {
            mo17749a(i, m21362a(false, str, obj, obj2, obj3));
        }
        if (!z2 && i >= 5) {
            C3513t.m12625a(str);
            C4759ar g = this.f15564q.mo17245g();
            if (g == null) {
                mo17749a(6, "Scheduler not set. Not logging error/warn");
            } else if (!g.mo17303z()) {
                mo17749a(6, "Scheduler not initialized. Not logging error/warn");
            } else {
                if (i < 0) {
                    i = 0;
                }
                if (i >= 9) {
                    i = 8;
                }
                C4894s sVar = new C4894s(this, i, str, obj, obj2, obj3);
                g.mo17219a((Runnable) sVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo17751a(int i) {
        return Log.isLoggable(m21356D(), i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo17749a(int i, String str) {
        Log.println(i, m21356D(), str);
    }

    /* renamed from: D */
    private final String m21356D() {
        String str;
        synchronized (this) {
            if (this.f15959c == null) {
                if (this.f15564q.mo17254t() != null) {
                    this.f15959c = this.f15564q.mo17254t();
                } else {
                    this.f15959c = C4870et.m21095e();
                }
            }
            str = this.f15959c;
        }
        return str;
    }

    /* renamed from: a */
    static String m21362a(boolean z, String str, Object obj, Object obj2, Object obj3) {
        if (str == null) {
            str = "";
        }
        String a = m21361a(z, obj);
        String a2 = m21361a(z, obj2);
        String a3 = m21361a(z, obj3);
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        if (!TextUtils.isEmpty(a)) {
            sb.append(str2);
            sb.append(a);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(a2)) {
            sb.append(str2);
            sb.append(a2);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(a3)) {
            sb.append(str2);
            sb.append(a3);
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static String m21361a(boolean z, Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        int i = 0;
        if (obj instanceof Long) {
            if (!z) {
                return String.valueOf(obj);
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return String.valueOf(obj);
            }
            String str = String.valueOf(obj).charAt(0) == '-' ? "-" : "";
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            long round = Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1)));
            long round2 = Math.round(Math.pow(10.0d, (double) valueOf.length()) - 1.0d);
            StringBuilder sb = new StringBuilder(43 + String.valueOf(str).length() + String.valueOf(str).length());
            sb.append(str);
            sb.append(round);
            sb.append("...");
            sb.append(str);
            sb.append(round2);
            return sb.toString();
        } else if (obj instanceof Boolean) {
            return String.valueOf(obj);
        } else {
            if (obj instanceof Throwable) {
                Throwable th = (Throwable) obj;
                StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
                String b = m21364b(AppMeasurement.class.getCanonicalName());
                String b2 = m21364b(C4764aw.class.getCanonicalName());
                StackTraceElement[] stackTrace = th.getStackTrace();
                int length = stackTrace.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i];
                    if (!stackTraceElement.isNativeMethod()) {
                        String className = stackTraceElement.getClassName();
                        if (className != null) {
                            String b3 = m21364b(className);
                            if (b3.equals(b) || b3.equals(b2)) {
                                sb2.append(": ");
                                sb2.append(stackTraceElement);
                            }
                        } else {
                            continue;
                        }
                    }
                    i++;
                }
                return sb2.toString();
            } else if (obj instanceof C4896u) {
                return ((C4896u) obj).f15979a;
            } else {
                if (z) {
                    return "-";
                }
                return String.valueOf(obj);
            }
        }
    }

    /* renamed from: b */
    private static String m21364b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return str;
        }
        return str.substring(0, lastIndexOf);
    }

    /* renamed from: y */
    public final String mo17760y() {
        Pair<String, Long> a = mo17159s().f15385b.mo17190a();
        if (a == null || a == C4745ad.f15384a) {
            return null;
        }
        String valueOf = String.valueOf(a.second);
        String str = (String) a.first;
        StringBuilder sb = new StringBuilder(1 + String.valueOf(valueOf).length() + String.valueOf(str).length());
        sb.append(valueOf);
        sb.append(":");
        sb.append(str);
        return sb.toString();
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
