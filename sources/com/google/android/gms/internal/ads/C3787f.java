package com.google.android.gms.internal.ads;

import com.appnext.core.C1286Ad;
import com.google.android.gms.ads.internal.C3025aw;
import java.util.Map;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.f */
public final class C3787f {

    /* renamed from: a */
    private final C4089qe f13029a;

    /* renamed from: b */
    private final boolean f13030b;

    /* renamed from: c */
    private final String f13031c;

    public C3787f(C4089qe qeVar, Map<String, String> map) {
        this.f13029a = qeVar;
        this.f13031c = (String) map.get("forceOrientation");
        this.f13030b = map.containsKey("allowOrientationChange") ? Boolean.parseBoolean((String) map.get("allowOrientationChange")) : true;
    }

    /* renamed from: a */
    public final void mo15275a() {
        if (this.f13029a == null) {
            C3900je.m17435e("AdWebView is null");
            return;
        }
        int i = C1286Ad.ORIENTATION_PORTRAIT.equalsIgnoreCase(this.f13031c) ? C3025aw.m10919g().mo15546b() : C1286Ad.ORIENTATION_LANDSCAPE.equalsIgnoreCase(this.f13031c) ? C3025aw.m10919g().mo15533a() : this.f13030b ? -1 : C3025aw.m10919g().mo15549c();
        this.f13029a.setRequestedOrientation(i);
    }
}
