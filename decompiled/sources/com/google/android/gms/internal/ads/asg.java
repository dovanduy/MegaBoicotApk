package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3718cm
public final class asg {

    /* renamed from: a */
    private final Map<String, asf> f12081a = new HashMap();

    /* renamed from: b */
    private final ash f12082b;

    public asg(ash ash) {
        this.f12082b = ash;
    }

    /* renamed from: a */
    public final ash mo14714a() {
        return this.f12082b;
    }

    /* renamed from: a */
    public final void mo14715a(String str, asf asf) {
        this.f12081a.put(str, asf);
    }

    /* renamed from: a */
    public final void mo14716a(String str, String str2, long j) {
        ash ash = this.f12082b;
        asf asf = (asf) this.f12081a.get(str2);
        String[] strArr = {str};
        if (!(ash == null || asf == null)) {
            ash.mo14722a(asf, j, strArr);
        }
        Map<String, asf> map = this.f12081a;
        ash ash2 = this.f12082b;
        map.put(str, ash2 == null ? null : ash2.mo14718a(j));
    }
}
