package com.google.android.gms.common.p140b;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.common.util.C3563o;

/* renamed from: com.google.android.gms.common.b.b */
public class C3403b {

    /* renamed from: a */
    private final Context f9839a;

    public C3403b(Context context) {
        this.f9839a = context;
    }

    /* renamed from: a */
    public ApplicationInfo mo13390a(String str, int i) throws NameNotFoundException {
        return this.f9839a.getPackageManager().getApplicationInfo(str, i);
    }

    /* renamed from: b */
    public PackageInfo mo13395b(String str, int i) throws NameNotFoundException {
        return this.f9839a.getPackageManager().getPackageInfo(str, i);
    }

    /* renamed from: a */
    public final PackageInfo mo13391a(String str, int i, int i2) throws NameNotFoundException {
        return this.f9839a.getPackageManager().getPackageInfo(str, 64);
    }

    /* renamed from: a */
    public final String[] mo13394a(int i) {
        return this.f9839a.getPackageManager().getPackagesForUid(i);
    }

    @TargetApi(19)
    /* renamed from: a */
    public final boolean mo13393a(int i, String str) {
        if (C3563o.m12768g()) {
            try {
                ((AppOpsManager) this.f9839a.getSystemService("appops")).checkPackage(i, str);
                return true;
            } catch (SecurityException unused) {
                return false;
            }
        } else {
            String[] packagesForUid = this.f9839a.getPackageManager().getPackagesForUid(i);
            if (!(str == null || packagesForUid == null)) {
                for (String equals : packagesForUid) {
                    if (str.equals(equals)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: a */
    public int mo13388a(String str) {
        return this.f9839a.checkCallingOrSelfPermission(str);
    }

    /* renamed from: a */
    public int mo13389a(String str, String str2) {
        return this.f9839a.getPackageManager().checkPermission(str, str2);
    }

    /* renamed from: b */
    public CharSequence mo13396b(String str) throws NameNotFoundException {
        return this.f9839a.getPackageManager().getApplicationLabel(this.f9839a.getPackageManager().getApplicationInfo(str, 0));
    }

    /* renamed from: a */
    public boolean mo13392a() {
        if (Binder.getCallingUid() == Process.myUid()) {
            return C3402a.m12220a(this.f9839a);
        }
        if (C3563o.m12773l()) {
            String nameForUid = this.f9839a.getPackageManager().getNameForUid(Binder.getCallingUid());
            if (nameForUid != null) {
                return this.f9839a.getPackageManager().isInstantApp(nameForUid);
            }
        }
        return false;
    }
}
