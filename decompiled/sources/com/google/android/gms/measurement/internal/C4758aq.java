package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.support.p017v4.p023d.C0376a;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.common.util.C3553e;
import com.google.android.gms.internal.p148e.C4622gh;
import com.google.android.gms.internal.p148e.C4623gi;
import com.google.android.gms.internal.p148e.C4637j;
import com.google.android.gms.internal.p148e.C4638k;
import com.google.android.gms.internal.p148e.C4639l;
import com.google.android.gms.internal.p148e.C4641n;
import com.google.android.gms.internal.p148e.C4643p;
import com.google.android.gms.internal.p148e.C4644q;
import com.google.android.gms.internal.p148e.C4645r;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.aq */
public final class C4758aq extends C4851eb implements C4872ev {

    /* renamed from: b */
    private static int f15439b = 65535;

    /* renamed from: c */
    private static int f15440c = 2;

    /* renamed from: d */
    private final Map<String, Map<String, String>> f15441d = new C0376a();

    /* renamed from: e */
    private final Map<String, Map<String, Boolean>> f15442e = new C0376a();

    /* renamed from: f */
    private final Map<String, Map<String, Boolean>> f15443f = new C0376a();

    /* renamed from: g */
    private final Map<String, C4644q> f15444g = new C0376a();

    /* renamed from: h */
    private final Map<String, Map<String, Integer>> f15445h = new C0376a();

    /* renamed from: i */
    private final Map<String, String> f15446i = new C0376a();

    C4758aq(C4852ec ecVar) {
        super(ecVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo17212e() {
        return false;
    }

    /* renamed from: h */
    private final void m20408h(String str) {
        mo17430k();
        mo17144d();
        C3513t.m12627a(str);
        if (this.f15444g.get(str) == null) {
            byte[] d = mo17217i().mo17699d(str);
            if (d == null) {
                this.f15441d.put(str, null);
                this.f15442e.put(str, null);
                this.f15443f.put(str, null);
                this.f15444g.put(str, null);
                this.f15446i.put(str, null);
                this.f15445h.put(str, null);
                return;
            }
            C4644q a = m20405a(str, d);
            this.f15441d.put(str, m20406a(a));
            m20407a(str, a);
            this.f15444g.put(str, a);
            this.f15446i.put(str, null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C4644q mo17202a(String str) {
        mo17430k();
        mo17144d();
        C3513t.m12627a(str);
        m20408h(str);
        return (C4644q) this.f15444g.get(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo17205b(String str) {
        mo17144d();
        return (String) this.f15446i.get(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo17207c(String str) {
        mo17144d();
        this.f15446i.put(str, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo17210d(String str) {
        mo17144d();
        this.f15444g.remove(str);
    }

    /* renamed from: a */
    public final String mo17203a(String str, String str2) {
        mo17144d();
        m20408h(str);
        Map map = (Map) this.f15441d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    /* renamed from: a */
    private static Map<String, String> m20406a(C4644q qVar) {
        C4645r[] rVarArr;
        C0376a aVar = new C0376a();
        if (!(qVar == null || qVar.f15134c == null)) {
            for (C4645r rVar : qVar.f15134c) {
                if (rVar != null) {
                    aVar.put(rVar.f15141a, rVar.f15142b);
                }
            }
        }
        return aVar;
    }

    /* renamed from: a */
    private final void m20407a(String str, C4644q qVar) {
        C4643p[] pVarArr;
        C0376a aVar = new C0376a();
        C0376a aVar2 = new C0376a();
        C0376a aVar3 = new C0376a();
        if (!(qVar == null || qVar.f15135d == null)) {
            for (C4643p pVar : qVar.f15135d) {
                if (TextUtils.isEmpty(pVar.f15128a)) {
                    mo17158r().mo17754i().mo17763a("EventConfig contained null event name");
                } else {
                    String a = C4790bv.m20578a(pVar.f15128a);
                    if (!TextUtils.isEmpty(a)) {
                        pVar.f15128a = a;
                    }
                    aVar.put(pVar.f15128a, pVar.f15129b);
                    aVar2.put(pVar.f15128a, pVar.f15130c);
                    if (pVar.f15131d != null) {
                        if (pVar.f15131d.intValue() < f15440c || pVar.f15131d.intValue() > f15439b) {
                            mo17158r().mo17754i().mo17765a("Invalid sampling rate. Event name, sample rate", pVar.f15128a, pVar.f15131d);
                        } else {
                            aVar3.put(pVar.f15128a, pVar.f15131d);
                        }
                    }
                }
            }
        }
        this.f15442e.put(str, aVar);
        this.f15443f.put(str, aVar2);
        this.f15445h.put(str, aVar3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo17204a(String str, byte[] bArr, String str2) {
        byte[] bArr2;
        C4641n[] nVarArr;
        String str3 = str;
        mo17430k();
        mo17144d();
        C3513t.m12627a(str);
        C4644q a = m20405a(str, bArr);
        int i = 0;
        if (a == null) {
            return false;
        }
        m20407a(str3, a);
        this.f15444g.put(str3, a);
        this.f15446i.put(str3, str2);
        this.f15441d.put(str3, m20406a(a));
        C4867eq h = mo17216h();
        C4637j[] jVarArr = a.f15136e;
        C3513t.m12625a(jVarArr);
        int length = jVarArr.length;
        int i2 = 0;
        while (i2 < length) {
            C4637j jVar = jVarArr[i2];
            C4638k[] kVarArr = jVar.f15096c;
            int length2 = kVarArr.length;
            int i3 = i;
            while (i3 < length2) {
                C4638k kVar = kVarArr[i3];
                String a2 = C4790bv.m20578a(kVar.f15101b);
                if (a2 != null) {
                    kVar.f15101b = a2;
                }
                C4639l[] lVarArr = kVar.f15102c;
                int length3 = lVarArr.length;
                int i4 = i;
                while (i4 < length3) {
                    C4639l lVar = lVarArr[i4];
                    int i5 = length;
                    String a3 = C4791bw.m20579a(lVar.f15111d);
                    if (a3 != null) {
                        lVar.f15111d = a3;
                    }
                    i4++;
                    length = i5;
                }
                int i6 = length;
                i3++;
                i = 0;
            }
            int i7 = length;
            for (C4641n nVar : jVar.f15095b) {
                String a4 = C4792bx.m20580a(nVar.f15119b);
                if (a4 != null) {
                    nVar.f15119b = a4;
                }
            }
            i2++;
            length = i7;
            i = 0;
        }
        h.mo17217i().mo17686a(str3, jVarArr);
        try {
            a.f15136e = null;
            bArr2 = new byte[a.mo16867e()];
            a.mo16327a(C4623gi.m20047a(bArr2, 0, bArr2.length));
        } catch (IOException e) {
            mo17158r().mo17754i().mo17765a("Unable to serialize reduced-size config. Storing full config instead. appId", C4893r.m21360a(str), e);
            bArr2 = bArr;
        }
        C4873ew i8 = mo17217i();
        C3513t.m12627a(str);
        i8.mo17144d();
        i8.mo17430k();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr2);
        try {
            if (((long) i8.mo17709y().update("apps", contentValues, "app_id = ?", new String[]{str3})) == 0) {
                i8.mo17158r().mo17761y_().mo17764a("Failed to update remote config (got 0). appId", C4893r.m21360a(str));
            }
        } catch (SQLiteException e2) {
            i8.mo17158r().mo17761y_().mo17765a("Error storing remote config. appId", C4893r.m21360a(str), e2);
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo17206b(String str, String str2) {
        mo17144d();
        m20408h(str);
        if (mo17213f(str) && C4862el.m20978e(str2)) {
            return true;
        }
        if (mo17215g(str) && C4862el.m20968a(str2)) {
            return true;
        }
        Map map = (Map) this.f15442e.get(str);
        if (map == null) {
            return false;
        }
        Boolean bool = (Boolean) map.get(str2);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final boolean mo17208c(String str, String str2) {
        mo17144d();
        m20408h(str);
        if ("ecommerce_purchase".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f15443f.get(str);
        if (map == null) {
            return false;
        }
        Boolean bool = (Boolean) map.get(str2);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final int mo17209d(String str, String str2) {
        mo17144d();
        m20408h(str);
        Map map = (Map) this.f15445h.get(str);
        if (map == null) {
            return 1;
        }
        Integer num = (Integer) map.get(str2);
        if (num == null) {
            return 1;
        }
        return num.intValue();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final long mo17211e(String str) {
        String a = mo17203a(str, "measurement.account.time_zone_offset_minutes");
        if (!TextUtils.isEmpty(a)) {
            try {
                return Long.parseLong(a);
            } catch (NumberFormatException e) {
                mo17158r().mo17754i().mo17765a("Unable to parse timezone offset. appId", C4893r.m21360a(str), e);
            }
        }
        return 0;
    }

    /* renamed from: a */
    private final C4644q m20405a(String str, byte[] bArr) {
        if (bArr == null) {
            return new C4644q();
        }
        C4622gh a = C4622gh.m20018a(bArr, 0, bArr.length);
        C4644q qVar = new C4644q();
        try {
            qVar.mo16326a(a);
            mo17158r().mo17759x().mo17765a("Parsed config. version, gmp_app_id", qVar.f15132a, qVar.f15133b);
            return qVar;
        } catch (IOException e) {
            mo17158r().mo17754i().mo17765a("Unable to merge remote config. appId", C4893r.m21360a(str), e);
            return new C4644q();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final boolean mo17213f(String str) {
        return "1".equals(mo17203a(str, "measurement.upload.blacklist_internal"));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final boolean mo17215g(String str) {
        return "1".equals(mo17203a(str, "measurement.upload.blacklist_public"));
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ C4859ei mo17214g() {
        return super.mo17214g();
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C4867eq mo17216h() {
        return super.mo17216h();
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ C4873ew mo17217i() {
        return super.mo17217i();
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
