package com.startapp.android.p164b;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

/* renamed from: com.startapp.android.b.a */
/* compiled from: StartAppSDK */
public class C5075a {

    /* renamed from: a */
    private final Context f16415a;

    public C5075a(Context context) {
        this.f16415a = context;
    }

    /* renamed from: a */
    public boolean mo18679a() {
        return mo18684c() || mo18685d() || mo18680a("su") || mo18680a("busybox") || mo18687f() || mo18688g() || mo18682b() || mo18689h() || mo18686e();
    }

    /* renamed from: b */
    public boolean mo18682b() {
        String str = Build.TAGS;
        return str != null && str.contains("test-keys");
    }

    /* renamed from: c */
    public boolean mo18684c() {
        return mo18681a((String[]) null);
    }

    /* renamed from: a */
    public boolean mo18681a(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(C5076b.f16416a));
        if (strArr != null && strArr.length > 0) {
            arrayList.addAll(Arrays.asList(strArr));
        }
        return m21870a((List<String>) arrayList);
    }

    /* renamed from: d */
    public boolean mo18685d() {
        return mo18683b(null);
    }

    /* renamed from: b */
    public boolean mo18683b(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(C5076b.f16417b));
        if (strArr != null && strArr.length > 0) {
            arrayList.addAll(Arrays.asList(strArr));
        }
        return m21870a((List<String>) arrayList);
    }

    /* renamed from: e */
    public boolean mo18686e() {
        return mo18680a("magisk");
    }

    /* renamed from: a */
    public boolean mo18680a(String str) {
        String[] strArr;
        boolean z = false;
        for (String str2 : C5076b.f16419d) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str);
            sb.toString();
            if (new File(str2, str).exists()) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: i */
    private String[] m21871i() {
        String[] strArr = new String[0];
        try {
            return new Scanner(Runtime.getRuntime().exec("getprop").getInputStream()).useDelimiter("\\A").next().split("\n");
        } catch (IOException | NoSuchElementException e) {
            e.printStackTrace();
            return strArr;
        }
    }

    /* renamed from: j */
    private String[] m21872j() {
        String[] strArr = new String[0];
        try {
            return new Scanner(Runtime.getRuntime().exec("mount").getInputStream()).useDelimiter("\\A").next().split("\n");
        } catch (IOException | NoSuchElementException e) {
            e.printStackTrace();
            return strArr;
        }
    }

    /* renamed from: a */
    private boolean m21870a(List<String> list) {
        PackageManager packageManager = this.f16415a.getPackageManager();
        boolean z = false;
        for (String packageInfo : list) {
            try {
                packageManager.getPackageInfo(packageInfo, 0);
                z = true;
            } catch (NameNotFoundException unused) {
            }
        }
        return z;
    }

    /* renamed from: f */
    public boolean mo18687f() {
        String[] i;
        HashMap hashMap = new HashMap();
        hashMap.put("ro.debuggable", "1");
        hashMap.put("ro.secure", "0");
        boolean z = false;
        for (String str : m21871i()) {
            for (String str2 : hashMap.keySet()) {
                if (str.contains(str2)) {
                    String str3 = (String) hashMap.get(str2);
                    StringBuilder sb = new StringBuilder();
                    sb.append("[");
                    sb.append(str3);
                    sb.append("]");
                    if (str.contains(sb.toString())) {
                        z = true;
                    }
                }
            }
        }
        return z;
    }

    /* renamed from: g */
    public boolean mo18688g() {
        boolean z = false;
        for (String split : m21872j()) {
            String[] split2 = split.split(" ");
            if (split2.length >= 4) {
                String str = split2[1];
                String str2 = split2[3];
                boolean z2 = z;
                for (String equalsIgnoreCase : C5076b.f16420e) {
                    if (str.equalsIgnoreCase(equalsIgnoreCase)) {
                        String[] split3 = str2.split(",");
                        int length = split3.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                break;
                            } else if (split3[i].equalsIgnoreCase("rw")) {
                                z2 = true;
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
                z = z2;
            }
        }
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003f  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo18689h() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch:{ Throwable -> 0x003d, all -> 0x0036 }
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ Throwable -> 0x003d, all -> 0x0036 }
            java.lang.String r4 = "which"
            r3[r0] = r4     // Catch:{ Throwable -> 0x003d, all -> 0x0036 }
            java.lang.String r4 = "su"
            r5 = 1
            r3[r5] = r4     // Catch:{ Throwable -> 0x003d, all -> 0x0036 }
            java.lang.Process r2 = r2.exec(r3)     // Catch:{ Throwable -> 0x003d, all -> 0x0036 }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x0034, all -> 0x0031 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Throwable -> 0x0034, all -> 0x0031 }
            java.io.InputStream r4 = r2.getInputStream()     // Catch:{ Throwable -> 0x0034, all -> 0x0031 }
            r3.<init>(r4)     // Catch:{ Throwable -> 0x0034, all -> 0x0031 }
            r1.<init>(r3)     // Catch:{ Throwable -> 0x0034, all -> 0x0031 }
            java.lang.String r1 = r1.readLine()     // Catch:{ Throwable -> 0x0034, all -> 0x0031 }
            if (r1 == 0) goto L_0x002b
            r0 = r5
        L_0x002b:
            if (r2 == 0) goto L_0x0030
            r2.destroy()
        L_0x0030:
            return r0
        L_0x0031:
            r0 = move-exception
            r1 = r2
            goto L_0x0037
        L_0x0034:
            r1 = r2
            goto L_0x003d
        L_0x0036:
            r0 = move-exception
        L_0x0037:
            if (r1 == 0) goto L_0x003c
            r1.destroy()
        L_0x003c:
            throw r0
        L_0x003d:
            if (r1 == 0) goto L_0x0042
            r1.destroy()
        L_0x0042:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.android.p164b.C5075a.mo18689h():boolean");
    }
}
