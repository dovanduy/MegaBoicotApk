package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C3025aw;
import com.google.android.gms.ads.internal.gmsg.C3067ae;
import com.google.android.gms.ads.internal.gmsg.C3073c;
import org.json.JSONObject;

@C3718cm
public final class ajw implements akf {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ajj f11230a;

    /* renamed from: b */
    private final Context f11231b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C3073c f11232c;

    /* renamed from: d */
    private bad f11233d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f11234e;

    /* renamed from: f */
    private final C3067ae<ban> f11235f = new akb(this);

    /* renamed from: g */
    private final C3067ae<ban> f11236g = new akc(this);

    /* renamed from: h */
    private final C3067ae<ban> f11237h = new akd(this);

    /* renamed from: i */
    private final C3067ae<ban> f11238i = new ake(this);

    public ajw(ajj ajj, azq azq, Context context) {
        this.f11230a = ajj;
        this.f11231b = context;
        this.f11232c = new C3073c(this.f11231b);
        this.f11233d = azq.mo15030b((agw) null);
        this.f11233d.mo15691a(new ajx(this), new ajy(this));
        String str = "Core JS tracking ad unit: ";
        String valueOf = String.valueOf(this.f11230a.f11188a.mo14371d());
        C3900je.m17429b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo14409a(ban ban) {
        ban.mo15016a("/updateActiveView", this.f11235f);
        ban.mo15016a("/untrackActiveViewUnit", this.f11236g);
        ban.mo15016a("/visibilityChanged", this.f11237h);
        if (C3025aw.m10908B().mo15388a(this.f11231b)) {
            ban.mo15016a("/logScionEvent", this.f11238i);
        }
    }

    /* renamed from: a */
    public final void mo14406a(JSONObject jSONObject, boolean z) {
        this.f11233d.mo15691a(new ajz(this, jSONObject), new C4023nt());
    }

    /* renamed from: a */
    public final boolean mo14407a() {
        return this.f11234e;
    }

    /* renamed from: b */
    public final void mo14408b() {
        this.f11233d.mo15691a(new aka(this), new C4023nt());
        this.f11233d.mo15037c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo14410b(ban ban) {
        ban.mo15017b("/visibilityChanged", this.f11237h);
        ban.mo15017b("/untrackActiveViewUnit", this.f11236g);
        ban.mo15017b("/updateActiveView", this.f11235f);
        if (C3025aw.m10908B().mo15388a(this.f11231b)) {
            ban.mo15017b("/logScionEvent", this.f11238i);
        }
    }
}
