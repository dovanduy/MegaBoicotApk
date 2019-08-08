package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C3049bt;
import com.google.android.gms.ads.internal.C3102m;

@C3718cm
public final class axa {

    /* renamed from: a */
    private final Context f12340a;

    /* renamed from: b */
    private final bca f12341b;

    /* renamed from: c */
    private final zzang f12342c;

    /* renamed from: d */
    private final C3049bt f12343d;

    axa(Context context, bca bca, zzang zzang, C3049bt btVar) {
        this.f12340a = context;
        this.f12341b = bca;
        this.f12342c = zzang;
        this.f12343d = btVar;
    }

    /* renamed from: a */
    public final Context mo14931a() {
        return this.f12340a.getApplicationContext();
    }

    /* renamed from: a */
    public final C3102m mo14932a(String str) {
        C3102m mVar = new C3102m(this.f12340a, new zzjn(), str, this.f12341b, this.f12342c, this.f12343d);
        return mVar;
    }

    /* renamed from: b */
    public final C3102m mo14933b(String str) {
        C3102m mVar = new C3102m(this.f12340a.getApplicationContext(), new zzjn(), str, this.f12341b, this.f12342c, this.f12343d);
        return mVar;
    }

    /* renamed from: b */
    public final axa mo14934b() {
        return new axa(this.f12340a.getApplicationContext(), this.f12341b, this.f12342c, this.f12343d);
    }
}
