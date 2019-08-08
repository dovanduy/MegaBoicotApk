package com.truenet.android;

import android.content.Context;
import android.content.res.Resources;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import com.startapp.common.C5540c;
import com.truenet.android.p198a.C5574c;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.p003b.p005b.C0032h;

/* renamed from: com.truenet.android.a */
public final class C5571a {
    @NotNull

    /* renamed from: a */
    private final Context f17665a;
    @NotNull

    /* renamed from: b */
    private final TelephonyManager f17666b;

    public C5571a(@NotNull Context context, @NotNull TelephonyManager telephonyManager) {
        C0032h.m45b(context, "context");
        C0032h.m45b(telephonyManager, "telephonyManager");
        this.f17665a = context;
        this.f17666b = telephonyManager;
        try {
            C5540c.m23648b(this.f17665a);
        } catch (Exception e) {
            Log.e("TrueNetSDK", "NetworkStats.init failed!", e);
        }
    }

    public /* synthetic */ C5571a(Context context, TelephonyManager telephonyManager, int i, C0029e eVar) {
        if ((i & 2) != 0) {
            telephonyManager = C5574c.m23741a(context);
        }
        this(context, telephonyManager);
    }

    /* renamed from: b */
    private final boolean m23737b() {
        Resources system = Resources.getSystem();
        C0032h.m42a((Object) system, "Resources.getSystem()");
        DisplayMetrics displayMetrics = system.getDisplayMetrics();
        double d = (double) (((float) displayMetrics.widthPixels) / displayMetrics.xdpi);
        double d2 = (double) (((float) displayMetrics.heightPixels) / displayMetrics.ydpi);
        return Math.sqrt((d * d) + (d2 * d2)) > 6.5d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x006f, code lost:
        if (r3 != null) goto L_0x0074;
     */
    @org.jetbrains.annotations.NotNull
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.truenet.android.DeviceInfo mo20682a() {
        /*
            r31 = this;
            r1 = r31
            java.util.List r2 = p000a.p001a.p002a.C0007g.m5a()
            java.lang.String r3 = ""
            java.lang.String r4 = ""
            r5 = r2
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            r6 = 1
            r5 = r5 ^ r6
            if (r5 == 0) goto L_0x0031
            java.lang.Object r3 = p000a.p001a.p002a.C0007g.m14c(r2)
            android.location.Location r3 = (android.location.Location) r3
            double r3 = r3.getLatitude()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.Object r2 = p000a.p001a.p002a.C0007g.m14c(r2)
            android.location.Location r2 = (android.location.Location) r2
            double r4 = r2.getLongitude()
            java.lang.String r4 = java.lang.String.valueOf(r4)
        L_0x0031:
            r8 = r3
            r9 = r4
            android.content.Context r2 = r1.f17665a
            android.content.res.Resources r2 = r2.getResources()
            java.lang.String r3 = "context.resources"
            p000a.p001a.p003b.p005b.C0032h.m42a(r2, r3)
            android.content.res.Configuration r2 = r2.getConfiguration()
            java.lang.String r3 = "context.resources.configuration"
            p000a.p001a.p003b.p005b.C0032h.m42a(r2, r3)
            java.util.Locale r2 = com.truenet.android.p198a.C5573b.m23740a(r2)
            com.startapp.common.a.b r3 = com.startapp.common.p193a.C5504b.m23480a()
            android.content.Context r4 = r1.f17665a
            com.startapp.common.a.b$b r3 = r3.mo20472a(r4)
            java.lang.String r4 = "AdvertisingIdSingleton.g…getAdvertisingId(context)"
            p000a.p001a.p003b.p005b.C0032h.m42a(r3, r4)
            java.lang.String r12 = r3.mo20477a()
            android.telephony.TelephonyManager r3 = r1.f17666b
            int r3 = r3.getPhoneType()
            if (r3 == 0) goto L_0x0072
            r4 = 2
            if (r3 == r4) goto L_0x0072
            android.telephony.TelephonyManager r3 = r1.f17666b
            java.lang.String r3 = r3.getNetworkOperatorName()
            if (r3 == 0) goto L_0x0072
            goto L_0x0074
        L_0x0072:
            java.lang.String r3 = ""
        L_0x0074:
            r19 = r3
            android.telephony.TelephonyManager r3 = r1.f17666b
            int r4 = r3.getSimState()
            r5 = 5
            if (r4 != r5) goto L_0x0084
            java.lang.String r3 = r3.getSimOperator()
            goto L_0x0086
        L_0x0084:
            java.lang.String r3 = ""
        L_0x0086:
            android.telephony.TelephonyManager r4 = r1.f17666b
            int r7 = r4.getSimState()
            if (r7 != r5) goto L_0x0093
            java.lang.String r4 = r4.getSimOperatorName()
            goto L_0x0095
        L_0x0093:
            java.lang.String r4 = ""
        L_0x0095:
            android.content.Context r5 = r1.f17665a
            java.lang.String r7 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r5 = com.truenet.android.p198a.C5580h.m23754a(r5, r7)
            if (r5 != 0) goto L_0x00ab
            android.content.Context r5 = r1.f17665a
            java.lang.String r7 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r5 = com.truenet.android.p198a.C5580h.m23754a(r5, r7)
            if (r5 == 0) goto L_0x00aa
            goto L_0x00ab
        L_0x00aa:
            r6 = 0
        L_0x00ab:
            if (r6 == 0) goto L_0x00ba
            android.telephony.TelephonyManager r5 = r1.f17666b
            int r5 = com.truenet.android.p198a.C5577f.m23746a(r5)
            java.lang.String r5 = java.lang.String.valueOf(r5)
        L_0x00b7:
            r22 = r5
            goto L_0x00bd
        L_0x00ba:
            java.lang.String r5 = ""
            goto L_0x00b7
        L_0x00bd:
            if (r6 == 0) goto L_0x00cc
            android.telephony.TelephonyManager r5 = r1.f17666b
            int r5 = com.truenet.android.p198a.C5577f.m23747b(r5)
            java.lang.String r5 = java.lang.String.valueOf(r5)
        L_0x00c9:
            r23 = r5
            goto L_0x00cf
        L_0x00cc:
            java.lang.String r5 = ""
            goto L_0x00c9
        L_0x00cf:
            com.startapp.common.c r5 = com.startapp.common.C5540c.m23644a()     // Catch:{ Exception -> 0x00dd }
            java.lang.String r6 = "NetworkStats.get()"
            p000a.p001a.p003b.p005b.C0032h.m42a(r5, r6)     // Catch:{ Exception -> 0x00dd }
            java.lang.String r5 = r5.mo20525b()     // Catch:{ Exception -> 0x00dd }
            goto L_0x00e8
        L_0x00dd:
            r0 = move-exception
            r5 = r0
            java.lang.String r5 = r5.getMessage()
            if (r5 == 0) goto L_0x00e6
            goto L_0x00e8
        L_0x00e6:
            java.lang.String r5 = ""
        L_0x00e8:
            com.truenet.android.a.i$a r6 = com.truenet.android.p198a.C5581i.f17675a
            android.content.Context r7 = r1.f17665a
            java.lang.String r10 = r6.mo20685a(r7)
            boolean r6 = r31.m23737b()
            if (r6 == 0) goto L_0x00fb
            java.lang.String r6 = "tablet"
        L_0x00f8:
            r26 = r6
            goto L_0x00fe
        L_0x00fb:
            java.lang.String r6 = "phone"
            goto L_0x00f8
        L_0x00fe:
            com.truenet.android.DeviceInfo r6 = new com.truenet.android.DeviceInfo
            java.lang.String r11 = r2.toString()
            java.lang.String r2 = "locale.toString()"
            p000a.p001a.p003b.p005b.C0032h.m42a(r11, r2)
            java.lang.String r2 = "advertisingId"
            p000a.p001a.p003b.p005b.C0032h.m42a(r12, r2)
            java.lang.String r13 = "android"
            int r2 = android.os.Build.VERSION.SDK_INT
            java.lang.String r14 = java.lang.String.valueOf(r2)
            java.lang.String r15 = android.os.Build.MODEL
            java.lang.String r2 = "Build.MODEL"
            p000a.p001a.p003b.p005b.C0032h.m42a(r15, r2)
            java.lang.String r2 = android.os.Build.MANUFACTURER
            java.lang.String r7 = "Build.MANUFACTURER"
            p000a.p001a.p003b.p005b.C0032h.m42a(r2, r7)
            java.lang.String r7 = android.os.Build.VERSION.RELEASE
            r29 = r2
            java.lang.String r2 = "Build.VERSION.RELEASE"
            p000a.p001a.p003b.p005b.C0032h.m42a(r7, r2)
            android.content.Context r2 = r1.f17665a
            java.lang.String r2 = r2.getPackageName()
            r30 = r7
            java.lang.String r7 = "context.packageName"
            p000a.p001a.p003b.p005b.C0032h.m42a(r2, r7)
            java.lang.String r7 = "ips"
            p000a.p001a.p003b.p005b.C0032h.m42a(r3, r7)
            java.lang.String r7 = "ipsName"
            p000a.p001a.p003b.p005b.C0032h.m42a(r4, r7)
            android.content.Context r7 = r1.f17665a
            com.truenet.android.a.e r7 = com.truenet.android.p198a.C5575d.m23744b(r7)
            java.lang.String r24 = r7.mo20683a()
            java.lang.String r7 = "signalLevel"
            p000a.p001a.p003b.p005b.C0032h.m42a(r5, r7)
            java.lang.String r27 = "1.1.4"
            java.lang.String r28 = ""
            r17 = r30
            r7 = r6
            r16 = r29
            r18 = r2
            r20 = r3
            r21 = r4
            r25 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.truenet.android.C5571a.mo20682a():com.truenet.android.DeviceInfo");
    }
}
