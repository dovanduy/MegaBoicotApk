package com.truenet.android.p198a;

import android.content.Context;
import android.net.ConnectivityManager;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0073h;
import p000a.p001a.p003b.p005b.C0032h;

/* renamed from: com.truenet.android.a.d */
public final class C5575d {
    @NotNull
    /* renamed from: a */
    public static final ConnectivityManager m23743a(@NotNull Context context) {
        C0032h.m45b(context, "receiver$0");
        Object systemService = context.getSystemService("connectivity");
        if (systemService != null) {
            return (ConnectivityManager) systemService;
        }
        throw new C0073h("null cannot be cast to non-null type android.net.ConnectivityManager");
    }

    @NotNull
    /* renamed from: b */
    public static final C5576e m23744b(@NotNull Context context) {
        C0032h.m45b(context, "receiver$0");
        return new C5576e(context);
    }
}
