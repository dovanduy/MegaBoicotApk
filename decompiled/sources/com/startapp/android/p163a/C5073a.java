package com.startapp.android.p163a;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Environment;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.appnext.base.p046b.C1245d;
import com.google.android.exoplayer2.C2793C;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@TargetApi(14)
/* renamed from: com.startapp.android.a.a */
/* compiled from: StartAppSDK */
public final class C5073a {

    /* renamed from: a */
    private static final String[] f16397a = {"15555215554", "15555215556", "15555215558", "15555215560", "15555215562", "15555215564", "15555215566", "15555215568", "15555215570", "15555215572", "15555215574", "15555215576", "15555215578", "15555215580", "15555215582", "15555215584"};

    /* renamed from: b */
    private static final String[] f16398b = {"000000000000000", "e21833235b6eef10", "012345678912345"};

    /* renamed from: c */
    private static final String[] f16399c = {"310260000000000"};

    /* renamed from: d */
    private static final String[] f16400d = {"/dev/socket/genyd", "/dev/socket/baseband_genyd"};

    /* renamed from: e */
    private static final String[] f16401e = {"goldfish"};

    /* renamed from: f */
    private static final String[] f16402f = {"/dev/socket/qemud", "/dev/qemu_pipe"};

    /* renamed from: g */
    private static final String[] f16403g = {"ueventd.android_x86.rc", "x86.prop", "ueventd.ttVM_x86.rc", "init.ttVM_x86.rc", "fstab.ttVM_x86", "fstab.vbox86", "init.vbox86.rc", "ueventd.vbox86.rc"};

    /* renamed from: h */
    private static final String[] f16404h = {"fstab.andy", "ueventd.andy.rc"};

    /* renamed from: i */
    private static final String[] f16405i = {"fstab.nox", "init.nox.rc", "ueventd.nox.rc", "/BigNoxGameHD", "/YSLauncher"};

    /* renamed from: j */
    private static final C5074b[] f16406j = {new C5074b("init.svc.qemud", null), new C5074b("init.svc.qemu-props", null), new C5074b("qemu.hw.mainkeys", null), new C5074b("qemu.sf.fake_camera", null), new C5074b("qemu.sf.lcd_density", null), new C5074b("ro.bootloader", "unknown"), new C5074b("ro.bootmode", "unknown"), new C5074b("ro.hardware", "goldfish"), new C5074b("ro.kernel.android.qemud", null), new C5074b("ro.kernel.qemu.gles", null), new C5074b("ro.kernel.qemu", "1"), new C5074b("ro.product.device", "generic"), new C5074b("ro.product.model", "sdk"), new C5074b("ro.product.name", "sdk"), new C5074b("ro.serialno", null), new C5074b("ro.build.description", "72656C656173652D6B657973"), new C5074b("ro.build.fingerprint", "3A757365722F72656C656173652D6B657973"), new C5074b("net.eth0.dns1", null), new C5074b("rild.libpath", "2F73797374656D2F6C69622F6C69627265666572656E63652D72696C2E736F"), new C5074b("ro.radio.use-ppp", null), new C5074b("gsm.version.baseband", null), new C5074b("ro.build.tags", "72656C656173652D6B65"), new C5074b("ro.build.display.id", "746573742D"), new C5074b("init.svc.console", null)};
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: o */
    private static C5073a f16407o;

    /* renamed from: p */
    private static Boolean f16408p;

    /* renamed from: k */
    private final Context f16409k;

    /* renamed from: l */
    private boolean f16410l = false;

    /* renamed from: m */
    private boolean f16411m = true;

    /* renamed from: n */
    private List<String> f16412n = new ArrayList();

    /* renamed from: a */
    public static boolean m21854a(Context context) {
        if (f16408p == null) {
            f16408p = Boolean.valueOf(m21856b(context).m21853a());
        }
        return f16408p.booleanValue();
    }

    /* renamed from: b */
    private static C5073a m21856b(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("Context must not be null.");
        }
        if (f16407o == null) {
            f16407o = new C5073a(context.getApplicationContext());
        }
        return f16407o;
    }

    private C5073a(Context context) {
        this.f16409k = context;
        this.f16412n.add("com.google.android.launcher.layouts.genymotion");
        this.f16412n.add("com.bluestacks");
        this.f16412n.add("com.bignox.app");
        this.f16412n.add("com.vphone.launcher");
    }

    /* renamed from: a */
    private boolean m21853a() {
        boolean b = m21857b();
        if (!b) {
            b = m21859c();
        }
        return !b ? m21860d() : b;
    }

    /* renamed from: b */
    private boolean m21857b() {
        return Build.FINGERPRINT.startsWith("generic") || Build.MODEL.contains("google_sdk") || Build.MODEL.toLowerCase().contains("droid4x") || Build.MODEL.contains("Emulator") || Build.MODEL.contains("Android SDK built for") || Build.MANUFACTURER.contains("Genymotion") || Build.HARDWARE.equals("goldfish") || Build.HARDWARE.equals("vbox86") || Build.PRODUCT.equals("sdk") || Build.PRODUCT.equals("google_sdk") || Build.PRODUCT.equals("sdk_x86") || Build.PRODUCT.equals("vbox86p") || Build.BOARD.toLowerCase().contains("nox") || Build.BOOTLOADER.toLowerCase().contains("nox") || Build.HARDWARE.toLowerCase().contains("nox") || Build.PRODUCT.toLowerCase().contains("nox") || Build.SERIAL.toLowerCase().contains("nox") || Build.FINGERPRINT.startsWith("unknown") || Build.FINGERPRINT.contains("Andy") || Build.FINGERPRINT.contains("ttVM_Hdragon") || Build.FINGERPRINT.contains("vbox86p") || Build.HARDWARE.contains("ttVM_x86") || Build.MODEL.equals("sdk") || Build.MODEL.contains("Droid4X") || Build.MODEL.contains("TiantianVM") || Build.MODEL.contains("Andy") || (Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic"));
    }

    /* renamed from: c */
    private boolean m21859c() {
        return m21861e() || m21855a(f16400d, "Geny") || m21855a(f16404h, "Andy") || m21855a(f16405i, "Nox") || m21866j() || m21855a(f16402f, "Pipes") || m21868l() || (m21867k() && m21855a(f16403g, "X86"));
    }

    /* renamed from: d */
    private boolean m21860d() {
        if (!this.f16411m || this.f16412n.isEmpty()) {
            return false;
        }
        PackageManager packageManager = this.f16409k.getPackageManager();
        for (String launchIntentForPackage : this.f16412n) {
            Intent launchIntentForPackage2 = packageManager.getLaunchIntentForPackage(launchIntentForPackage);
            if (launchIntentForPackage2 != null && !packageManager.queryIntentActivities(launchIntentForPackage2, C2793C.DEFAULT_BUFFER_SEGMENT_SIZE).isEmpty()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    private boolean m21861e() {
        boolean z = false;
        if (!m21858b(this.f16409k, "android.permission.READ_PHONE_STATE") || !this.f16410l || !m21869m()) {
            return false;
        }
        if (m21862f() || m21863g() || m21864h() || m21865i()) {
            z = true;
        }
        return z;
    }

    /* renamed from: f */
    private boolean m21862f() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f16409k.getSystemService("phone");
        if (telephonyManager != null) {
            String line1Number = telephonyManager.getLine1Number();
            for (String equalsIgnoreCase : f16397a) {
                if (equalsIgnoreCase.equalsIgnoreCase(line1Number)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: g */
    private boolean m21863g() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f16409k.getSystemService("phone");
        if (telephonyManager != null) {
            String deviceId = telephonyManager.getDeviceId();
            for (String equalsIgnoreCase : f16398b) {
                if (equalsIgnoreCase.equalsIgnoreCase(deviceId)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: h */
    private boolean m21864h() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f16409k.getSystemService("phone");
        if (telephonyManager != null) {
            String subscriberId = telephonyManager.getSubscriberId();
            for (String equalsIgnoreCase : f16399c) {
                if (equalsIgnoreCase.equalsIgnoreCase(subscriberId)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: i */
    private boolean m21865i() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f16409k.getSystemService("phone");
        if (telephonyManager != null) {
            return telephonyManager.getNetworkOperatorName().equalsIgnoreCase("android");
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0070 A[SYNTHETIC, Splitter:B:29:0x0070] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0076 A[SYNTHETIC, Splitter:B:35:0x0076] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m21866j() {
        /*
            r12 = this;
            r0 = 2
            java.io.File[] r0 = new java.io.File[r0]
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "/proc/tty/drivers"
            r1.<init>(r2)
            r2 = 0
            r0[r2] = r1
            java.io.File r1 = new java.io.File
            java.lang.String r3 = "/proc/cpuinfo"
            r1.<init>(r3)
            r3 = 1
            r0[r3] = r1
            int r1 = r0.length
            r4 = r2
        L_0x0019:
            if (r4 >= r1) goto L_0x007d
            r5 = r0[r4]
            boolean r6 = r5.exists()
            if (r6 == 0) goto L_0x007a
            boolean r6 = r5.canRead()
            if (r6 == 0) goto L_0x007a
            r6 = 1024(0x400, float:1.435E-42)
            char[] r6 = new char[r6]
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r8 = 0
            java.io.BufferedReader r9 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0074, all -> 0x006d }
            java.io.InputStreamReader r10 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0074, all -> 0x006d }
            java.io.FileInputStream r11 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0074, all -> 0x006d }
            r11.<init>(r5)     // Catch:{ Exception -> 0x0074, all -> 0x006d }
            r10.<init>(r11)     // Catch:{ Exception -> 0x0074, all -> 0x006d }
            r9.<init>(r10)     // Catch:{ Exception -> 0x0074, all -> 0x006d }
        L_0x0042:
            int r5 = r9.read(r6)     // Catch:{ Exception -> 0x006b, all -> 0x0068 }
            r8 = -1
            if (r5 == r8) goto L_0x004d
            r7.append(r6, r2, r5)     // Catch:{ Exception -> 0x006b, all -> 0x0068 }
            goto L_0x0042
        L_0x004d:
            if (r9 == 0) goto L_0x0052
            r9.close()     // Catch:{ IOException -> 0x0052 }
        L_0x0052:
            java.lang.String r5 = r7.toString()
            java.lang.String[] r6 = f16401e
            int r7 = r6.length
            r8 = r2
        L_0x005a:
            if (r8 >= r7) goto L_0x007a
            r9 = r6[r8]
            boolean r9 = r5.contains(r9)
            if (r9 == 0) goto L_0x0065
            return r3
        L_0x0065:
            int r8 = r8 + 1
            goto L_0x005a
        L_0x0068:
            r0 = move-exception
            r8 = r9
            goto L_0x006e
        L_0x006b:
            r8 = r9
            goto L_0x0074
        L_0x006d:
            r0 = move-exception
        L_0x006e:
            if (r8 == 0) goto L_0x0073
            r8.close()     // Catch:{ IOException -> 0x0073 }
        L_0x0073:
            throw r0
        L_0x0074:
            if (r8 == 0) goto L_0x0079
            r8.close()     // Catch:{ IOException -> 0x0079 }
        L_0x0079:
            return r2
        L_0x007a:
            int r4 = r4 + 1
            goto L_0x0019
        L_0x007d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.android.p163a.C5073a.m21866j():boolean");
    }

    /* renamed from: a */
    private boolean m21855a(String[] strArr, String str) {
        File file;
        for (String str2 : strArr) {
            if (!m21858b(this.f16409k, "android.permission.READ_EXTERNAL_STORAGE") || !str2.contains("/") || !str.equals("Nox")) {
                file = new File(str2);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(Environment.getExternalStorageDirectory());
                sb.append(str2);
                file = new File(sb.toString());
            }
            if (file.exists()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    private boolean m21867k() {
        C5074b[] bVarArr;
        int i = 0;
        for (C5074b bVar : f16406j) {
            String a = m21852a(this.f16409k, bVar.f16413a);
            if (bVar.f16414b == null && a != null) {
                i++;
            }
            if (!(bVar.f16414b == null || a == null || !a.contains(bVar.f16414b))) {
                i++;
            }
        }
        if (i >= 5) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    private boolean m21868l() {
        String[] split;
        if (!m21858b(this.f16409k, "android.permission.INTERNET")) {
            return false;
        }
        String[] strArr = {"/system/bin/netcfg"};
        StringBuilder sb = new StringBuilder();
        try {
            ProcessBuilder processBuilder = new ProcessBuilder(strArr);
            processBuilder.directory(new File("/system/bin/"));
            processBuilder.redirectErrorStream(true);
            InputStream inputStream = processBuilder.start().getInputStream();
            byte[] bArr = new byte[C1245d.f3947iP];
            while (inputStream.read(bArr) != -1) {
                sb.append(new String(bArr));
            }
            inputStream.close();
        } catch (Exception unused) {
        }
        String sb2 = sb.toString();
        if (TextUtils.isEmpty(sb2)) {
            return false;
        }
        for (String str : sb2.split("\n")) {
            if ((str.contains("wlan0") || str.contains("tunl0") || str.contains("eth0")) && str.contains("10.0.2.15")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private String m21852a(Context context, String str) {
        try {
            Class loadClass = context.getClassLoader().loadClass("android.os.SystemProperties");
            return (String) loadClass.getMethod("get", new Class[]{String.class}).invoke(loadClass, new Object[]{str});
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: m */
    private boolean m21869m() {
        return this.f16409k.getPackageManager().hasSystemFeature("android.hardware.telephony");
    }

    /* renamed from: b */
    private boolean m21858b(Context context, String str) {
        boolean z = false;
        try {
            if (VERSION.SDK_INT >= 23) {
                if (context.checkSelfPermission(str) == 0) {
                    z = true;
                }
                return z;
            }
            if (context.checkCallingOrSelfPermission(str) == 0) {
                z = true;
            }
            return z;
        } catch (Throwable unused) {
            return false;
        }
    }
}
