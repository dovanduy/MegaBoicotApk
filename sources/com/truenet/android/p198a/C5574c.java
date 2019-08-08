package com.truenet.android.p198a;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.view.WindowManager;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0073h;
import p000a.p001a.p003b.p005b.C0032h;

/* renamed from: com.truenet.android.a.c */
public final class C5574c {
    @NotNull
    /* renamed from: a */
    public static final TelephonyManager m23741a(@NotNull Context context) {
        C0032h.m45b(context, "receiver$0");
        Object systemService = context.getSystemService("phone");
        if (systemService != null) {
            return (TelephonyManager) systemService;
        }
        throw new C0073h("null cannot be cast to non-null type android.telephony.TelephonyManager");
    }

    @NotNull
    /* renamed from: b */
    public static final WindowManager m23742b(@NotNull Context context) {
        C0032h.m45b(context, "receiver$0");
        Object systemService = context.getSystemService("window");
        if (systemService != null) {
            return (WindowManager) systemService;
        }
        throw new C0073h("null cannot be cast to non-null type android.view.WindowManager");
    }
}
