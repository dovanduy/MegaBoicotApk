package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C3018ap;
import com.google.android.gms.ads.internal.C3049bt;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.rz */
final /* synthetic */ class C4137rz implements Callable {

    /* renamed from: a */
    private final Context f13988a;

    /* renamed from: b */
    private final C4130rs f13989b;

    /* renamed from: c */
    private final String f13990c;

    /* renamed from: d */
    private final boolean f13991d;

    /* renamed from: e */
    private final boolean f13992e;

    /* renamed from: f */
    private final agw f13993f;

    /* renamed from: g */
    private final zzang f13994g;

    /* renamed from: h */
    private final ash f13995h;

    /* renamed from: i */
    private final C3018ap f13996i;

    /* renamed from: j */
    private final C3049bt f13997j;

    /* renamed from: k */
    private final amj f13998k;

    C4137rz(Context context, C4130rs rsVar, String str, boolean z, boolean z2, agw agw, zzang zzang, ash ash, C3018ap apVar, C3049bt btVar, amj amj) {
        this.f13988a = context;
        this.f13989b = rsVar;
        this.f13990c = str;
        this.f13991d = z;
        this.f13992e = z2;
        this.f13993f = agw;
        this.f13994g = zzang;
        this.f13995h = ash;
        this.f13996i = apVar;
        this.f13997j = btVar;
        this.f13998k = amj;
    }

    public final Object call() {
        Context context = this.f13988a;
        C4130rs rsVar = this.f13989b;
        String str = this.f13990c;
        boolean z = this.f13991d;
        boolean z2 = this.f13992e;
        C4139sa a = C4139sa.m18039a(context, rsVar, str, z, z2, this.f13993f, this.f13994g, this.f13995h, this.f13996i, this.f13997j, this.f13998k);
        C4101qq qqVar = new C4101qq(a);
        C4131rt rtVar = new C4131rt(qqVar, z2);
        a.setWebChromeClient(new C4080pw(qqVar));
        a.mo16027a((C4146sh) rtVar);
        a.mo16030a((C4151sm) rtVar);
        a.mo16029a((C4150sl) rtVar);
        a.mo16028a((C4148sj) rtVar);
        a.mo16016a(rtVar);
        return qqVar;
    }
}
