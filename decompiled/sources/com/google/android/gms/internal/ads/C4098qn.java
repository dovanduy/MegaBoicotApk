package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C3018ap;
import com.google.android.gms.ads.internal.C3025aw;
import com.google.android.gms.ads.internal.C3049bt;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.qn */
final /* synthetic */ class C4098qn implements Callable {

    /* renamed from: a */
    private final Context f13859a;

    /* renamed from: b */
    private final C4130rs f13860b;

    /* renamed from: c */
    private final String f13861c;

    /* renamed from: d */
    private final boolean f13862d;

    /* renamed from: e */
    private final boolean f13863e;

    /* renamed from: f */
    private final agw f13864f;

    /* renamed from: g */
    private final zzang f13865g;

    /* renamed from: h */
    private final ash f13866h;

    /* renamed from: i */
    private final C3018ap f13867i;

    /* renamed from: j */
    private final C3049bt f13868j;

    /* renamed from: k */
    private final amj f13869k;

    C4098qn(Context context, C4130rs rsVar, String str, boolean z, boolean z2, agw agw, zzang zzang, ash ash, C3018ap apVar, C3049bt btVar, amj amj) {
        this.f13859a = context;
        this.f13860b = rsVar;
        this.f13861c = str;
        this.f13862d = z;
        this.f13863e = z2;
        this.f13864f = agw;
        this.f13865g = zzang;
        this.f13866h = ash;
        this.f13867i = apVar;
        this.f13868j = btVar;
        this.f13869k = amj;
    }

    public final Object call() {
        Context context = this.f13859a;
        C4130rs rsVar = this.f13860b;
        String str = this.f13861c;
        boolean z = this.f13862d;
        boolean z2 = this.f13863e;
        C4101qq qqVar = new C4101qq(C4102qr.m17837a(context, rsVar, str, z, z2, this.f13864f, this.f13865g, this.f13866h, this.f13867i, this.f13868j, this.f13869k));
        qqVar.setWebViewClient(C3025aw.m10919g().mo15536a((C4089qe) qqVar, z2));
        qqVar.setWebChromeClient(new C4080pw(qqVar));
        return qqVar;
    }
}
