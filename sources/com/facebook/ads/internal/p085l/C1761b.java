package com.facebook.ads.internal.p085l;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.facebook.ads.internal.p115w.p117b.C2309d;
import com.facebook.ads.internal.p115w.p123h.C2370a;
import com.facebook.ads.internal.p115w.p123h.C2373b;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.internal.l.b */
public class C1761b {

    /* renamed from: a */
    public static final String f5515a = VERSION.RELEASE;

    /* renamed from: b */
    private final Context f5516b;

    /* renamed from: c */
    private final AtomicBoolean f5517c = new AtomicBoolean();

    public C1761b(Context context) {
        this.f5516b = context.getApplicationContext();
    }

    /* renamed from: a */
    public String mo7580a() {
        return (Build.MANUFACTURER == null || Build.MANUFACTURER.length() <= 0) ? "" : Build.MANUFACTURER;
    }

    /* renamed from: b */
    public String mo7581b() {
        return (Build.MODEL == null || Build.MODEL.length() <= 0) ? "" : Build.MODEL;
    }

    /* renamed from: c */
    public String mo7582c() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f5516b.getSystemService("phone");
        if (telephonyManager != null) {
            String networkOperatorName = telephonyManager.getNetworkOperatorName();
            if (networkOperatorName != null && networkOperatorName.length() > 0) {
                return networkOperatorName;
            }
        }
        return "";
    }

    /* renamed from: d */
    public String mo7583d() {
        try {
            CharSequence applicationLabel = this.f5516b.getPackageManager().getApplicationLabel(this.f5516b.getPackageManager().getApplicationInfo(mo7585f(), 0));
            if (applicationLabel != null && applicationLabel.length() > 0) {
                return applicationLabel.toString();
            }
        } catch (NameNotFoundException unused) {
        }
        return "";
    }

    /* renamed from: e */
    public String mo7584e() {
        try {
            String f = mo7585f();
            if (f != null && f.length() >= 0) {
                String installerPackageName = this.f5516b.getPackageManager().getInstallerPackageName(f);
                if (installerPackageName != null && installerPackageName.length() > 0) {
                    return installerPackageName;
                }
            }
        } catch (Exception unused) {
        }
        return "";
    }

    /* renamed from: f */
    public String mo7585f() {
        PendingIntent activity = PendingIntent.getActivity(this.f5516b, 0, new Intent(), 0);
        if (activity != null) {
            return VERSION.SDK_INT >= 17 ? activity.getCreatorPackage() : activity.getTargetPackage();
        }
        if (!this.f5517c.getAndSet(true)) {
            C2370a.m9149b(this.f5516b, "generic", C2373b.f7467B, new Exception("PI_NULL"));
        }
        return "";
    }

    /* renamed from: g */
    public String mo7586g() {
        String str;
        try {
            str = this.f5516b.getPackageManager().getPackageInfo(mo7585f(), 0).versionName;
        } catch (NameNotFoundException e) {
            e.printStackTrace();
            str = null;
        }
        return !TextUtils.isEmpty(str) ? str : "";
    }

    /* renamed from: h */
    public int mo7587h() {
        try {
            return this.f5516b.getPackageManager().getPackageInfo(mo7585f(), 0).versionCode;
        } catch (NameNotFoundException e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: i */
    public boolean mo7588i() {
        return this.f5516b.checkCallingOrSelfPermission("android.permission.BIND_ACCESSIBILITY_SERVICE") == 0;
    }

    /* renamed from: j */
    public int mo7589j() {
        return C2309d.m9022a(this.f5516b);
    }
}
