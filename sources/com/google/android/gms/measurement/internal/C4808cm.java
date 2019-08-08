package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.internal.p148e.C4433aa;
import com.google.android.gms.internal.p148e.C4513cu;
import com.google.android.gms.internal.p148e.C4578f.C4579a;
import com.google.android.gms.internal.p148e.C4578f.C4581b;
import com.google.android.gms.internal.p148e.C4623gi;
import com.google.android.gms.internal.p148e.C4648u;
import com.google.android.gms.internal.p148e.C4649v;
import com.google.android.gms.internal.p148e.C4650w;
import com.google.android.gms.internal.p148e.C4651x;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.cm */
final class C4808cm extends C4851eb {
    public C4808cm(C4852ec ecVar) {
        super(ecVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo17212e() {
        return false;
    }

    /* renamed from: a */
    public final byte[] mo17347a(zzag zzag, String str) {
        Integer num;
        C4650w wVar;
        C4651x xVar;
        C4864en enVar;
        long j;
        Bundle bundle;
        C4822d dVar;
        long j2;
        C4861ek ekVar;
        zzag zzag2 = zzag;
        String str2 = str;
        mo17144d();
        this.f15564q.mo17233F();
        C3513t.m12625a(zzag);
        C3513t.m12627a(str);
        if (!mo17160t().mo17645d(str2, C4882h.f15897at)) {
            mo17158r().mo17758w().mo17764a("Generating ScionPayload disabled. packageName", str2);
            return new byte[0];
        } else if ("_iap".equals(zzag2.f15991a) || "_iapx".equals(zzag2.f15991a)) {
            C4650w wVar2 = new C4650w();
            mo17217i().mo17704f();
            try {
                C4864en b = mo17217i().mo17693b(str2);
                if (b == null) {
                    mo17158r().mo17758w().mo17764a("Log and bundle not available. package_name", str2);
                    byte[] bArr = new byte[0];
                    mo17217i().mo17708x();
                    return bArr;
                } else if (!b.mo17559o()) {
                    mo17158r().mo17758w().mo17764a("Log and bundle disabled. package_name", str2);
                    byte[] bArr2 = new byte[0];
                    mo17217i().mo17708x();
                    return bArr2;
                } else {
                    C4651x xVar2 = new C4651x();
                    wVar2.f15163a = new C4651x[]{xVar2};
                    xVar2.f15180a = Integer.valueOf(1);
                    xVar2.f15188i = "android";
                    xVar2.f15194o = b.mo17523b();
                    xVar2.f15193n = b.mo17552l();
                    xVar2.f15195p = b.mo17548j();
                    long k = b.mo17550k();
                    if (k == -2147483648L) {
                        num = null;
                    } else {
                        num = Integer.valueOf((int) k);
                    }
                    xVar2.f15167C = num;
                    xVar2.f15196q = Long.valueOf(b.mo17554m());
                    xVar2.f15204y = b.mo17531d();
                    if (TextUtils.isEmpty(xVar2.f15204y)) {
                        xVar2.f15173I = b.mo17534e();
                    }
                    xVar2.f15201v = Long.valueOf(b.mo17556n());
                    if (this.f15564q.mo17230C() && C4870et.m21098w() && mo17160t().mo17642c(xVar2.f15194o)) {
                        xVar2.f15171G = null;
                    }
                    Pair a = mo17159s().mo17167a(b.mo17523b());
                    if (b.mo17517C() && a != null && !TextUtils.isEmpty((CharSequence) a.first)) {
                        xVar2.f15198s = m20642a((String) a.first, Long.toString(zzag2.f15994d));
                        xVar2.f15199t = (Boolean) a.second;
                    }
                    mo17152l().mo17300A();
                    xVar2.f15190k = Build.MODEL;
                    mo17152l().mo17300A();
                    xVar2.f15189j = VERSION.RELEASE;
                    xVar2.f15192m = Integer.valueOf((int) mo17152l().mo17281x_());
                    xVar2.f15191l = mo17152l().mo17280g();
                    try {
                        xVar2.f15200u = m20642a(b.mo17527c(), Long.toString(zzag2.f15994d));
                        xVar2.f15166B = b.mo17540g();
                        String str3 = xVar2.f15194o;
                        List a2 = mo17217i().mo17680a(str3);
                        if (mo17160t().mo17646e(str2)) {
                            Iterator it = a2.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    ekVar = null;
                                    break;
                                }
                                ekVar = (C4861ek) it.next();
                                if ("_lte".equals(ekVar.f15786c)) {
                                    break;
                                }
                            }
                            if (ekVar == null || ekVar.f15788e == null) {
                                C4861ek ekVar2 = new C4861ek(str3, "auto", "_lte", mo17153m().mo13694a(), Long.valueOf(0));
                                a2.add(ekVar2);
                                mo17217i().mo17690a(ekVar2);
                            }
                        }
                        C4433aa[] aaVarArr = new C4433aa[a2.size()];
                        for (int i = 0; i < a2.size(); i++) {
                            C4433aa aaVar = new C4433aa();
                            aaVarArr[i] = aaVar;
                            aaVar.f14631b = ((C4861ek) a2.get(i)).f15786c;
                            aaVar.f14630a = Long.valueOf(((C4861ek) a2.get(i)).f15787d);
                            mo17214g().mo17471a(aaVar, ((C4861ek) a2.get(i)).f15788e);
                        }
                        xVar2.f15182c = aaVarArr;
                        Bundle b2 = zzag2.f15992b.mo17773b();
                        b2.putLong("_c", 1);
                        mo17158r().mo17758w().mo17763a("Marking in-app purchase as real-time");
                        b2.putLong("_r", 1);
                        b2.putString("_o", zzag2.f15993c);
                        if (mo17156p().mo17502f(xVar2.f15194o)) {
                            mo17156p().mo17491a(b2, "_dbg", (Object) Long.valueOf(1));
                            mo17156p().mo17491a(b2, "_r", (Object) Long.valueOf(1));
                        }
                        C4822d a3 = mo17217i().mo17677a(str2, zzag2.f15991a);
                        if (a3 == null) {
                            j = 0;
                            enVar = b;
                            xVar = xVar2;
                            bundle = b2;
                            wVar = wVar2;
                            C4822d dVar2 = new C4822d(str2, zzag2.f15991a, 0, 0, zzag2.f15994d, 0, null, null, null, null);
                            dVar = dVar2;
                            j2 = 0;
                        } else {
                            enVar = b;
                            xVar = xVar2;
                            bundle = b2;
                            wVar = wVar2;
                            j = 0;
                            j2 = a3.f15665e;
                            dVar = a3.mo17379a(zzag2.f15994d);
                        }
                        mo17217i().mo17684a(dVar);
                        C4795c cVar = new C4795c(this.f15564q, zzag2.f15993c, str, zzag2.f15991a, zzag2.f15994d, j2, bundle);
                        C4648u uVar = new C4648u();
                        C4651x xVar3 = xVar;
                        xVar3.f15181b = new C4648u[]{uVar};
                        uVar.f15154c = Long.valueOf(cVar.f15574c);
                        uVar.f15153b = cVar.f15573b;
                        uVar.f15155d = Long.valueOf(cVar.f15575d);
                        uVar.f15152a = new C4649v[cVar.f15576e.mo17771a()];
                        Iterator it2 = cVar.f15576e.iterator();
                        int i2 = 0;
                        while (it2.hasNext()) {
                            String str4 = (String) it2.next();
                            C4649v vVar = new C4649v();
                            int i3 = i2 + 1;
                            uVar.f15152a[i2] = vVar;
                            vVar.f15158a = str4;
                            mo17214g().mo17472a(vVar, cVar.f15576e.mo17772a(str4));
                            i2 = i3;
                        }
                        xVar3.f15174J = (C4581b) ((C4513cu) C4581b.m19764a().mo16723a((C4579a) ((C4513cu) C4579a.m19755a().mo16721a(dVar.f15663c).mo16722a(zzag2.f15991a).mo16622g())).mo16622g());
                        C4864en enVar2 = enVar;
                        xVar3.f15165A = mo17216h().mo17633a(enVar2.mo17523b(), (C4648u[]) null, xVar3.f15182c);
                        xVar3.f15184e = uVar.f15154c;
                        xVar3.f15185f = uVar.f15154c;
                        long i4 = enVar2.mo17546i();
                        xVar3.f15187h = i4 != j ? Long.valueOf(i4) : null;
                        long h = enVar2.mo17543h();
                        if (h != j) {
                            i4 = h;
                        }
                        xVar3.f15186g = i4 != j ? Long.valueOf(i4) : null;
                        enVar2.mo17563s();
                        xVar3.f15202w = Integer.valueOf((int) enVar2.mo17560p());
                        xVar3.f15197r = Long.valueOf(mo17160t().mo17647f());
                        xVar3.f15183d = Long.valueOf(mo17153m().mo13694a());
                        xVar3.f15205z = Boolean.TRUE;
                        enVar2.mo17520a(xVar3.f15184e.longValue());
                        enVar2.mo17524b(xVar3.f15185f.longValue());
                        mo17217i().mo17685a(enVar2);
                        mo17217i().mo17707w();
                        mo17217i().mo17708x();
                        C4650w wVar3 = wVar;
                        try {
                            byte[] bArr3 = new byte[wVar3.mo16867e()];
                            C4623gi a4 = C4623gi.m20047a(bArr3, 0, bArr3.length);
                            wVar3.mo16327a(a4);
                            a4.mo16830a();
                            return mo17214g().mo17478b(bArr3);
                        } catch (IOException e) {
                            mo17158r().mo17761y_().mo17765a("Data loss. Failed to bundle and serialize. appId", C4893r.m21360a(str), e);
                            return null;
                        }
                    } catch (SecurityException e2) {
                        mo17158r().mo17758w().mo17764a("app instance id encryption failed", e2.getMessage());
                        byte[] bArr4 = new byte[0];
                        mo17217i().mo17708x();
                        return bArr4;
                    }
                }
            } catch (SecurityException e3) {
                mo17158r().mo17758w().mo17764a("Resettable device id encryption failed", e3.getMessage());
                byte[] bArr5 = new byte[0];
                mo17217i().mo17708x();
                return bArr5;
            } catch (Throwable th) {
                Throwable th2 = th;
                mo17217i().mo17708x();
                throw th2;
            }
        } else {
            mo17158r().mo17758w().mo17765a("Generating a payload for this event is not available. package_name, event_name", str2, zzag2.f15991a);
            return null;
        }
    }

    /* renamed from: a */
    private static String m20642a(String str, String str2) {
        throw new SecurityException("This implementation should not be used.");
    }
}
