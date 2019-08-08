package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.google.android.gms.ads.p135a.C2961a.C2962a;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.ig */
public final class C3875ig implements C3877ii {
    /* renamed from: a */
    public final C4008ne<C2962a> mo15409a(Context context) {
        C4019np npVar = new C4019np();
        aoq.m14615a();
        if (C3975lz.m17388f(context)) {
            C3907jl.m17118a((Runnable) new C3876ih(this, context, npVar));
        }
        return npVar;
    }

    /* renamed from: a */
    public final C4008ne<String> mo15410a(String str, PackageInfo packageInfo) {
        return C3996mt.m17448a(str);
    }
}
