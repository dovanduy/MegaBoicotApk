package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C3025aw;
import com.google.android.gms.ads.internal.C3049bt;

/* renamed from: com.google.android.gms.internal.ads.qm */
final /* synthetic */ class C4097qm implements C3991mo {

    /* renamed from: a */
    private final Context f13854a;

    /* renamed from: b */
    private final agw f13855b;

    /* renamed from: c */
    private final zzang f13856c;

    /* renamed from: d */
    private final C3049bt f13857d;

    /* renamed from: e */
    private final String f13858e;

    C4097qm(Context context, agw agw, zzang zzang, C3049bt btVar, String str) {
        this.f13854a = context;
        this.f13855b = agw;
        this.f13856c = zzang;
        this.f13857d = btVar;
        this.f13858e = str;
    }

    /* renamed from: a */
    public final C4008ne mo12596a(Object obj) {
        Context context = this.f13854a;
        agw agw = this.f13855b;
        zzang zzang = this.f13856c;
        C3049bt btVar = this.f13857d;
        String str = this.f13858e;
        C3025aw.m10918f();
        C4089qe a = C4096ql.m17760a(context, C4130rs.m17977a(), "", false, false, agw, zzang, null, null, btVar, amj.m14431a());
        C4018no a2 = C4018no.m17476a(a);
        a.mo15919v().mo15931a((C4125rn) new C4099qo(a2));
        a.loadUrl(str);
        return a2;
    }
}
