package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.C3718cm;
import com.google.android.gms.internal.ads.C3862hu;
import com.google.android.gms.internal.ads.C3909jn;
import com.google.android.gms.internal.ads.zzael;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3718cm
/* renamed from: com.google.android.gms.ads.internal.bu */
public final class C3050bu {

    /* renamed from: a */
    private final Context f8923a;

    /* renamed from: b */
    private boolean f8924b;

    /* renamed from: c */
    private C3862hu f8925c;

    /* renamed from: d */
    private zzael f8926d;

    public C3050bu(Context context, C3862hu huVar, zzael zzael) {
        this.f8923a = context;
        this.f8925c = huVar;
        this.f8926d = zzael;
        if (this.f8926d == null) {
            this.f8926d = new zzael();
        }
    }

    /* renamed from: c */
    private final boolean m11039c() {
        return (this.f8925c != null && this.f8925c.mo15366a().f14502f) || this.f8926d.f14478a;
    }

    /* renamed from: a */
    public final void mo12585a() {
        this.f8924b = true;
    }

    /* renamed from: a */
    public final void mo12586a(String str) {
        if (m11039c()) {
            if (str == null) {
                str = "";
            }
            if (this.f8925c != null) {
                this.f8925c.mo15369a(str, null, 3);
                return;
            }
            if (this.f8926d.f14478a && this.f8926d.f14479b != null) {
                for (String str2 : this.f8926d.f14479b) {
                    if (!TextUtils.isEmpty(str2)) {
                        String replace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                        C3025aw.m10917e();
                        C3909jn.m17138a(this.f8923a, "", replace);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final boolean mo12587b() {
        return !m11039c() || this.f8924b;
    }
}
