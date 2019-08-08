package com.facebook.internal;

import com.facebook.C2649m;
import java.util.Collection;

/* renamed from: com.facebook.internal.aa */
/* compiled from: ServerProtocol */
public final class C2476aa {

    /* renamed from: a */
    public static final Collection<String> f7795a = C2479ad.m9435a((T[]) new String[]{"service_disabled", "AndroidAuthKillSwitchException"});

    /* renamed from: b */
    public static final Collection<String> f7796b = C2479ad.m9435a((T[]) new String[]{"access_denied", "OAuthAccessDeniedException"});

    /* renamed from: c */
    private static final String f7797c = "com.facebook.internal.aa";

    /* renamed from: d */
    public static final String m9413d() {
        return "v3.0";
    }

    /* renamed from: a */
    public static final String m9410a() {
        return String.format("m.%s", new Object[]{C2649m.m10132e()});
    }

    /* renamed from: b */
    public static final String m9411b() {
        return String.format("https://graph.%s", new Object[]{C2649m.m10132e()});
    }

    /* renamed from: c */
    public static final String m9412c() {
        return String.format("https://graph-video.%s", new Object[]{C2649m.m10132e()});
    }
}
