package com.truenet.android.p198a;

import android.content.res.Configuration;
import android.os.Build.VERSION;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.p003b.p005b.C0032h;

/* renamed from: com.truenet.android.a.b */
public final class C5573b {
    /* renamed from: a */
    public static final Locale m23740a(@NotNull Configuration configuration) {
        C0032h.m45b(configuration, "receiver$0");
        return VERSION.SDK_INT >= 24 ? configuration.getLocales().get(0) : configuration.locale;
    }
}
