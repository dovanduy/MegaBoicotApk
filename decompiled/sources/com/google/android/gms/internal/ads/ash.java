package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.appnext.base.p046b.C1245d;
import com.google.android.gms.ads.internal.C3025aw;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3718cm
public final class ash {

    /* renamed from: a */
    private boolean f12083a;

    /* renamed from: b */
    private final List<asf> f12084b = new LinkedList();

    /* renamed from: c */
    private final Map<String, String> f12085c = new LinkedHashMap();

    /* renamed from: d */
    private final Object f12086d = new Object();

    /* renamed from: e */
    private String f12087e;

    /* renamed from: f */
    private ash f12088f;

    public ash(boolean z, String str, String str2) {
        this.f12083a = z;
        this.f12085c.put(C1245d.f3959jb, str);
        this.f12085c.put("ad_format", str2);
    }

    /* renamed from: a */
    public final asf mo14717a() {
        return mo14718a(C3025aw.m10924l().mo13695b());
    }

    /* renamed from: a */
    public final asf mo14718a(long j) {
        if (!this.f12083a) {
            return null;
        }
        return new asf(j, null, null);
    }

    /* renamed from: a */
    public final void mo14719a(ash ash) {
        synchronized (this.f12086d) {
            this.f12088f = ash;
        }
    }

    /* renamed from: a */
    public final void mo14720a(String str) {
        if (this.f12083a) {
            synchronized (this.f12086d) {
                this.f12087e = str;
            }
        }
    }

    /* renamed from: a */
    public final void mo14721a(String str, String str2) {
        if (this.f12083a && !TextUtils.isEmpty(str2)) {
            arx b = C3025aw.m10921i().mo15438b();
            if (b != null) {
                synchronized (this.f12086d) {
                    asb a = b.mo14703a(str);
                    Map<String, String> map = this.f12085c;
                    map.put(str, a.mo14710a((String) map.get(str), str2));
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo14722a(asf asf, long j, String... strArr) {
        synchronized (this.f12086d) {
            for (String asf2 : strArr) {
                this.f12084b.add(new asf(j, asf2, asf));
            }
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo14723a(asf asf, String... strArr) {
        if (!this.f12083a || asf == null) {
            return false;
        }
        return mo14722a(asf, C3025aw.m10924l().mo13695b(), strArr);
    }

    /* renamed from: b */
    public final String mo14724b() {
        String sb;
        StringBuilder sb2 = new StringBuilder();
        synchronized (this.f12086d) {
            for (asf asf : this.f12084b) {
                long a = asf.mo14711a();
                String b = asf.mo14712b();
                asf c = asf.mo14713c();
                if (c != null && a > 0) {
                    long a2 = a - c.mo14711a();
                    sb2.append(b);
                    sb2.append('.');
                    sb2.append(a2);
                    sb2.append(',');
                }
            }
            this.f12084b.clear();
            if (!TextUtils.isEmpty(this.f12087e)) {
                sb2.append(this.f12087e);
            } else if (sb2.length() > 0) {
                sb2.setLength(sb2.length() - 1);
            }
            sb = sb2.toString();
        }
        return sb;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final Map<String, String> mo14725c() {
        synchronized (this.f12086d) {
            arx b = C3025aw.m10921i().mo15438b();
            if (b != null) {
                if (this.f12088f != null) {
                    Map<String, String> a = b.mo14704a(this.f12085c, this.f12088f.mo14725c());
                    return a;
                }
            }
            Map<String, String> map = this.f12085c;
            return map;
        }
    }

    /* renamed from: d */
    public final asf mo14726d() {
        synchronized (this.f12086d) {
        }
        return null;
    }
}
