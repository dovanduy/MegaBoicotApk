package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.text.TextUtils;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3718cm
/* renamed from: com.google.android.gms.internal.ads.sn */
final class C4152sn {

    /* renamed from: a */
    private static final String[] f14054a = {"UNKNOWN", "HOST_LOOKUP", "UNSUPPORTED_AUTH_SCHEME", "AUTHENTICATION", "PROXY_AUTHENTICATION", "CONNECT", "IO", "TIMEOUT", "REDIRECT_LOOP", "UNSUPPORTED_SCHEME", "FAILED_SSL_HANDSHAKE", "BAD_URL", "FILE", "FILE_NOT_FOUND", "TOO_MANY_REQUESTS"};

    /* renamed from: b */
    private static final String[] f14055b = {"NOT_YET_VALID", "EXPIRED", "ID_MISMATCH", "UNTRUSTED", "DATE_INVALID", "INVALID"};

    C4152sn() {
    }

    /* renamed from: a */
    private static void m18129a(String str, String str2, String str3) {
        String str4;
        if (((Boolean) aoq.m14620f().mo14695a(aru.f11873bs)).booleanValue()) {
            Bundle bundle = new Bundle();
            bundle.putString("err", str);
            bundle.putString("code", str2);
            String str5 = "host";
            if (!TextUtils.isEmpty(str3)) {
                Uri parse = Uri.parse(str3);
                if (parse.getHost() != null) {
                    str4 = parse.getHost();
                    bundle.putString(str5, str4);
                }
            }
            str4 = "";
            bundle.putString(str5, str4);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo16053a(int i, String str) {
        String str2;
        if (i < 0) {
            int i2 = (-i) - 1;
            if (i2 < f14054a.length) {
                str2 = f14054a[i2];
                m18129a("http_err", str2, str);
            }
        }
        str2 = String.valueOf(i);
        m18129a("http_err", str2, str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo16054a(@Nullable SslError sslError) {
        if (sslError != null) {
            int primaryError = sslError.getPrimaryError();
            m18129a("ssl_err", (primaryError < 0 || primaryError >= f14055b.length) ? String.valueOf(primaryError) : f14055b[primaryError], sslError.getUrl());
        }
    }
}
