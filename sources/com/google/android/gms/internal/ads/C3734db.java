package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.C3557i;

/* renamed from: com.google.android.gms.internal.ads.db */
final class C3734db implements C3736dd {

    /* renamed from: a */
    private final /* synthetic */ Context f12846a;

    C3734db(Context context) {
        this.f12846a = context;
    }

    /* renamed from: a */
    public final boolean mo15238a(zzang zzang) {
        aoq.m14615a();
        boolean c = C3975lz.m17385c(this.f12846a);
        boolean z = ((Boolean) aoq.m14620f().mo14695a(aru.f11964dd)).booleanValue() && zzang.f14508d;
        if (!C3733da.m16517b(this.f12846a, zzang.f14508d) || !c || z) {
            return true;
        }
        if (C3557i.m12752c(this.f12846a)) {
            if (!((Boolean) aoq.m14620f().mo14695a(aru.f11756H)).booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
