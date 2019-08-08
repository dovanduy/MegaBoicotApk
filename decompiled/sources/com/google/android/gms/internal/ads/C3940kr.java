package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;
import java.util.regex.Pattern;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.kr */
public final class C3940kr extends C3870ib {

    /* renamed from: a */
    private final Context f13468a;

    private C3940kr(Context context, C4093qi qiVar) {
        super(qiVar);
        this.f13468a = context;
    }

    /* renamed from: a */
    public static azk m17281a(Context context) {
        azk azk = new azk(new C3954le(new File(context.getCacheDir(), "admob_volley")), new C3940kr(context, new C4121rj()));
        azk.mo15022a();
        return azk;
    }

    /* renamed from: a */
    public final atl mo14633a(avm<?> avm) throws C3738df {
        if (avm.mo14907h() && avm.mo14900c() == 0) {
            if (Pattern.matches((String) aoq.m14620f().mo14695a(aru.f11891cJ), avm.mo14904e())) {
                aoq.m14615a();
                if (C3975lz.m17385c(this.f13468a)) {
                    atl a = new awu(this.f13468a).mo14633a(avm);
                    if (a != null) {
                        String str = "Got gmscore asset response: ";
                        String valueOf = String.valueOf(avm.mo14904e());
                        C3900je.m17043a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                        return a;
                    }
                    String str2 = "Failed to get gmscore asset response: ";
                    String valueOf2 = String.valueOf(avm.mo14904e());
                    C3900je.m17043a(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2));
                }
            }
        }
        return super.mo14633a(avm);
    }
}
