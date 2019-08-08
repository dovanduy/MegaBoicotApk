package com.facebook.ads.internal.p094u;

import android.content.Context;
import com.facebook.ads.internal.p079f.C1710a;
import com.facebook.ads.internal.p080g.C1719b;
import com.facebook.ads.internal.p087n.C1771d;
import com.facebook.ads.internal.p088o.C1775b;
import com.facebook.ads.internal.p115w.p117b.C2325m;
import com.facebook.ads.internal.p115w.p117b.C2339v;
import com.facebook.ads.internal.p115w.p117b.C2345z;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.protocol.C1784c;
import com.facebook.ads.internal.protocol.C1787e;
import com.facebook.ads.internal.protocol.C1789g;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.facebook.ads.internal.u.b */
public class C1842b {

    /* renamed from: a */
    private String f5859a;

    /* renamed from: b */
    private C1784c f5860b;

    /* renamed from: c */
    private final AdPlacementType f5861c = this.f5860b.mo7639a();

    /* renamed from: d */
    private final String f5862d;

    /* renamed from: e */
    private Context f5863e;

    /* renamed from: f */
    private C1787e f5864f;

    /* renamed from: g */
    private boolean f5865g;

    /* renamed from: h */
    private boolean f5866h;

    /* renamed from: i */
    private int f5867i;

    /* renamed from: j */
    private C2325m f5868j;

    /* renamed from: k */
    private final Map<String, String> f5869k;

    /* renamed from: l */
    private final C1789g f5870l;

    /* renamed from: m */
    private String f5871m;

    /* renamed from: n */
    private String f5872n;

    public C1842b(Context context, C1771d dVar, String str, C2325m mVar, C1787e eVar, String str2, int i, boolean z, boolean z2, C1789g gVar, String str3, String str4) {
        this.f5863e = context;
        this.f5869k = dVar.mo7620b();
        this.f5859a = str;
        this.f5868j = mVar;
        this.f5864f = eVar;
        this.f5862d = str2;
        this.f5867i = i;
        this.f5865g = z;
        this.f5866h = z2;
        this.f5870l = gVar;
        this.f5860b = C1784c.m7387a(eVar);
        this.f5871m = str3;
        this.f5872n = str4;
    }

    /* renamed from: a */
    private void m7745a(Map<String, String> map, String str, String str2) {
        map.put(str, str2);
    }

    /* renamed from: a */
    public C1787e mo7811a() {
        return this.f5864f;
    }

    /* renamed from: b */
    public String mo7812b() {
        return this.f5859a;
    }

    /* renamed from: c */
    public C1784c mo7813c() {
        return this.f5860b;
    }

    /* renamed from: d */
    public C2325m mo7814d() {
        return this.f5868j;
    }

    /* renamed from: e */
    public int mo7815e() {
        return this.f5867i;
    }

    /* renamed from: f */
    public C1789g mo7816f() {
        return this.f5870l;
    }

    /* renamed from: g */
    public Map<String, String> mo7817g() {
        HashMap hashMap = new HashMap(this.f5869k);
        m7745a(hashMap, "IDFA", C1719b.f5386b);
        m7745a(hashMap, "IDFA_FLAG", C1719b.f5387c ? "0" : "1");
        m7745a(hashMap, "COPPA", String.valueOf(this.f5866h));
        m7745a(hashMap, "PLACEMENT_ID", this.f5859a);
        if (this.f5861c != AdPlacementType.UNKNOWN) {
            m7745a(hashMap, "PLACEMENT_TYPE", this.f5861c.toString().toLowerCase());
        }
        if (this.f5868j != null) {
            m7745a(hashMap, "WIDTH", String.valueOf(this.f5868j.mo8726b()));
            m7745a(hashMap, "HEIGHT", String.valueOf(this.f5868j.mo8725a()));
        }
        if (this.f5864f != null) {
            m7745a(hashMap, "TEMPLATE_ID", String.valueOf(this.f5864f.mo7642a()));
        }
        if (this.f5865g) {
            m7745a(hashMap, "TEST_MODE", "1");
        }
        if (this.f5862d != null) {
            m7745a(hashMap, "DEMO_AD_ID", this.f5862d);
        }
        if (this.f5867i != 0) {
            m7745a(hashMap, "NUM_ADS_REQUESTED", String.valueOf(this.f5867i));
        }
        m7745a(hashMap, "CLIENT_EVENTS", C1775b.m7364a());
        m7745a(hashMap, "KG_RESTRICTED", String.valueOf(C2345z.m9094a(this.f5863e)));
        m7745a(hashMap, "REQUEST_TIME", C2339v.m9070b(System.currentTimeMillis()));
        if (this.f5870l.mo7646c()) {
            m7745a(hashMap, "BID_ID", this.f5870l.mo7647d());
        }
        if (this.f5871m != null) {
            m7745a(hashMap, "STACK_TRACE", this.f5871m);
        }
        m7745a(hashMap, "CLIENT_REQUEST_ID", UUID.randomUUID().toString());
        m7745a(hashMap, "AD_REPORTING_CONFIG_LAST_UPDATE_TIME", C2339v.m9069a(C1710a.m7125a(this.f5863e)));
        if (this.f5872n != null) {
            m7745a(hashMap, "EXTRA_HINTS", this.f5872n);
        }
        return hashMap;
    }
}
