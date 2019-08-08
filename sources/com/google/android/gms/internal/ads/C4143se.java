package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import java.util.Collections;
import java.util.Map;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3718cm
/* renamed from: com.google.android.gms.internal.ads.se */
public final class C4143se {

    /* renamed from: a */
    public final String f14046a;

    /* renamed from: b */
    public final Uri f14047b;

    /* renamed from: c */
    public final Map<String, String> f14048c;

    /* renamed from: d */
    private final String f14049d;

    @TargetApi(21)
    public C4143se(WebResourceRequest webResourceRequest) {
        this(webResourceRequest.getUrl().toString(), webResourceRequest.getUrl(), webResourceRequest.getMethod(), webResourceRequest.getRequestHeaders());
    }

    public C4143se(String str) {
        this(str, Uri.parse(str), null, null);
    }

    private C4143se(String str, Uri uri, @Nullable String str2, @Nullable Map<String, String> map) {
        this.f14046a = str;
        this.f14047b = uri;
        if (str2 == null) {
            str2 = "GET";
        }
        this.f14049d = str2;
        if (map == null) {
            map = Collections.emptyMap();
        }
        this.f14048c = map;
    }
}
