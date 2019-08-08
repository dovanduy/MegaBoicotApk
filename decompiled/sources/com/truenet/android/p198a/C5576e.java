package com.truenet.android.p198a;

import android.content.Context;
import android.net.NetworkInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.truenet.android.a.e */
public final class C5576e {
    @Nullable

    /* renamed from: a */
    private final NetworkInfo f17667a;

    /* renamed from: b */
    private final boolean f17668b;

    /* renamed from: c */
    private final boolean f17669c;

    /* renamed from: d */
    private final boolean f17670d;
    @NotNull

    /* renamed from: e */
    private final String f17671e;
    @NotNull

    /* renamed from: f */
    private final Context f17672f;

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0060, code lost:
        if (r4 != null) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0072, code lost:
        if (r4 != null) goto L_0x0074;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C5576e(@org.jetbrains.annotations.NotNull android.content.Context r4) {
        /*
            r3 = this;
            java.lang.String r0 = "context"
            p000a.p001a.p003b.p005b.C0032h.m45b(r4, r0)
            r3.<init>()
            r3.f17672f = r4
            android.content.Context r4 = r3.f17672f
            java.lang.String r0 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r4 = com.truenet.android.p198a.C5580h.m23754a(r4, r0)
            if (r4 == 0) goto L_0x001f
            android.content.Context r4 = r3.f17672f
            android.net.ConnectivityManager r4 = com.truenet.android.p198a.C5575d.m23743a(r4)
            android.net.NetworkInfo r4 = r4.getActiveNetworkInfo()
            goto L_0x0020
        L_0x001f:
            r4 = 0
        L_0x0020:
            r3.f17667a = r4
            android.net.NetworkInfo r4 = r3.f17667a
            r0 = 0
            if (r4 == 0) goto L_0x002c
            boolean r4 = r4.isConnected()
            goto L_0x002d
        L_0x002c:
            r4 = r0
        L_0x002d:
            r3.f17668b = r4
            android.net.NetworkInfo r4 = r3.f17667a
            r1 = 1
            if (r4 == 0) goto L_0x0040
            boolean r2 = r3.f17668b
            if (r2 == 0) goto L_0x0040
            int r4 = r4.getType()
            if (r4 != r1) goto L_0x0040
            r4 = r1
            goto L_0x0041
        L_0x0040:
            r4 = r0
        L_0x0041:
            r3.f17669c = r4
            android.net.NetworkInfo r4 = r3.f17667a
            if (r4 == 0) goto L_0x0052
            boolean r2 = r3.f17668b
            if (r2 == 0) goto L_0x0052
            int r4 = r4.getType()
            if (r4 != 0) goto L_0x0052
            r0 = r1
        L_0x0052:
            r3.f17670d = r0
            boolean r4 = r3.f17670d
            if (r4 == 0) goto L_0x0066
            android.net.NetworkInfo r4 = r3.f17667a
            if (r4 == 0) goto L_0x0063
            java.lang.String r4 = r4.getSubtypeName()
            if (r4 == 0) goto L_0x0063
            goto L_0x0074
        L_0x0063:
            java.lang.String r4 = ""
            goto L_0x0074
        L_0x0066:
            boolean r4 = r3.f17669c
            if (r4 == 0) goto L_0x0063
            android.net.NetworkInfo r4 = r3.f17667a
            if (r4 == 0) goto L_0x0063
            java.lang.String r4 = r4.getTypeName()
            if (r4 == 0) goto L_0x0063
        L_0x0074:
            r3.f17671e = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.truenet.android.p198a.C5576e.<init>(android.content.Context):void");
    }

    @NotNull
    /* renamed from: a */
    public final String mo20683a() {
        return this.f17671e;
    }
}
