package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.p135a.C2961a;
import com.google.android.gms.common.C3412e;
import com.google.android.gms.common.C3413f;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.jd */
final class C3899jd extends C3894iz {

    /* renamed from: a */
    private Context f13382a;

    C3899jd(Context context) {
        this.f13382a = context;
    }

    /* renamed from: a */
    public final void mo12687a() {
        boolean z;
        try {
            z = C2961a.m10599b(this.f13382a);
        } catch (C3412e | C3413f | IOException | IllegalStateException e) {
            C3900je.m17430b("Fail to get isAdIdFakeForDebugLogging", e);
            z = false;
        }
        C3980md.m17404a(z);
        StringBuilder sb = new StringBuilder(43);
        sb.append("Update ad debug logging enablement as ");
        sb.append(z);
        C3900je.m17435e(sb.toString());
    }

    /* renamed from: e_ */
    public final void mo12688e_() {
    }
}
