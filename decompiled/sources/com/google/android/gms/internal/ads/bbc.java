package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C3025aw;
import com.google.android.gms.ads.internal.gmsg.C3085o;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
@C3718cm
public final class bbc<I, O> implements bar<I, O> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final bat<O> f12529a;

    /* renamed from: b */
    private final bau<I> f12530b;

    /* renamed from: c */
    private final azq f12531c;

    /* renamed from: d */
    private final String f12532d;

    bbc(azq azq, String str, bau<I> bau, bat<O> bat) {
        this.f12531c = azq;
        this.f12532d = str;
        this.f12530b = bau;
        this.f12529a = bat;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m15902a(bad bad, ban ban, I i, C4019np<O> npVar) {
        try {
            C3025aw.m10917e();
            String a = C3909jn.m17128a();
            C3085o.f8996o.mo12618a(a, new bbf(this, bad, npVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TtmlNode.ATTR_ID, a);
            jSONObject.put("args", this.f12530b.mo15047a(i));
            ban.mo14994b(this.f12532d, jSONObject);
        } catch (Exception e) {
            npVar.mo15685a(e);
            C3900je.m17430b("Unable to invokeJavaScript", e);
            bad.mo15037c();
        } catch (Throwable th) {
            bad.mo15037c();
            throw th;
        }
    }

    /* renamed from: a */
    public final C4008ne<O> mo12596a(@Nullable I i) throws Exception {
        return mo15044b(i);
    }

    /* renamed from: b */
    public final C4008ne<O> mo15044b(I i) {
        C4019np npVar = new C4019np();
        bad b = this.f12531c.mo15030b((agw) null);
        b.mo15691a(new bbd(this, b, i, npVar), new bbe(this, npVar, b));
        return npVar;
    }
}
