package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.common.util.C3553e;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.p */
public final class C4891p extends C4788bt {

    /* renamed from: a */
    private static final AtomicReference<String[]> f15954a = new AtomicReference<>();

    /* renamed from: b */
    private static final AtomicReference<String[]> f15955b = new AtomicReference<>();

    /* renamed from: c */
    private static final AtomicReference<String[]> f15956c = new AtomicReference<>();

    C4891p(C4764aw awVar) {
        super(awVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo17176e() {
        return false;
    }

    /* renamed from: g */
    private final boolean m21330g() {
        mo17161u();
        return this.f15564q.mo17251o() && this.f15564q.mo17158r().mo17751a(3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo17746a(String str) {
        if (str == null) {
            return null;
        }
        if (!m21330g()) {
            return str;
        }
        return m21329a(str, C4790bv.f15567b, C4790bv.f15566a, f15954a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo17747b(String str) {
        if (str == null) {
            return null;
        }
        if (!m21330g()) {
            return str;
        }
        return m21329a(str, C4791bw.f15569b, C4791bw.f15568a, f15955b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo17748c(String str) {
        if (str == null) {
            return null;
        }
        if (!m21330g()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return m21329a(str, C4792bx.f15571b, C4792bx.f15570a, f15956c);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("experiment_id");
        sb.append("(");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    private static String m21329a(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        C3513t.m12625a(strArr);
        C3513t.m12625a(strArr2);
        C3513t.m12625a(atomicReference);
        C3513t.m12635b(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (C4862el.m20976c(str, strArr[i])) {
                synchronized (atomicReference) {
                    String[] strArr3 = (String[]) atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    if (strArr3[i] == null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(strArr2[i]);
                        sb.append("(");
                        sb.append(strArr[i]);
                        sb.append(")");
                        strArr3[i] = sb.toString();
                    }
                    str2 = strArr3[i];
                }
                return str2;
            }
        }
        return str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo17745a(zzag zzag) {
        if (zzag == null) {
            return null;
        }
        if (!m21330g()) {
            return zzag.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("origin=");
        sb.append(zzag.f15993c);
        sb.append(",name=");
        sb.append(mo17746a(zzag.f15991a));
        sb.append(",params=");
        sb.append(m21328a(zzag.f15992b));
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo17744a(C4795c cVar) {
        if (cVar == null) {
            return null;
        }
        if (!m21330g()) {
            return cVar.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Event{appId='");
        sb.append(cVar.f15572a);
        sb.append("', name='");
        sb.append(mo17746a(cVar.f15573b));
        sb.append("', params=");
        sb.append(m21328a(cVar.f15576e));
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    private final String m21328a(zzad zzad) {
        if (zzad == null) {
            return null;
        }
        if (!m21330g()) {
            return zzad.toString();
        }
        return mo17743a(zzad.mo17773b());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo17743a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!m21330g()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        for (String str : bundle.keySet()) {
            if (sb.length() != 0) {
                sb.append(", ");
            } else {
                sb.append("Bundle[{");
            }
            sb.append(mo17747b(str));
            sb.append("=");
            sb.append(bundle.get(str));
        }
        sb.append("}]");
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
