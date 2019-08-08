package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.common.p140b.C3404c;
import javax.annotation.CheckReturnValue;

@CheckReturnValue
/* renamed from: com.google.android.gms.common.i */
public class C3416i {

    /* renamed from: a */
    private static C3416i f9883a;

    /* renamed from: b */
    private final Context f9884b;

    private C3416i(Context context) {
        this.f9884b = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C3416i m12290a(Context context) {
        C3513t.m12625a(context);
        synchronized (C3416i.class) {
            if (f9883a == null) {
                C3526o.m12656a(context);
                f9883a = new C3416i(context);
            }
        }
        return f9883a;
    }

    /* renamed from: a */
    public boolean mo13432a(int i) {
        C3573x xVar;
        String[] a = C3404c.m12230a(this.f9884b).mo13394a(i);
        if (a != null && a.length != 0) {
            xVar = null;
            for (String a2 : a) {
                xVar = m12292a(a2, i);
                if (xVar.f10196a) {
                    break;
                }
            }
        } else {
            xVar = C3573x.m12786a("no pkgs");
        }
        xVar.mo13701c();
        return xVar.f10196a;
    }

    /* renamed from: a */
    public static boolean m12293a(PackageInfo packageInfo, boolean z) {
        C3528q qVar;
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if (z) {
                qVar = m12291a(packageInfo, C3543t.f10165a);
            } else {
                qVar = m12291a(packageInfo, C3543t.f10165a[0]);
            }
            if (qVar != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo13433a(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (m12293a(packageInfo, false)) {
            return true;
        }
        if (m12293a(packageInfo, true)) {
            if (C3415h.m12282b(this.f9884b)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    /* renamed from: a */
    private final C3573x m12292a(String str, int i) {
        try {
            PackageInfo a = C3404c.m12230a(this.f9884b).mo13391a(str, 64, i);
            boolean b = C3415h.m12282b(this.f9884b);
            if (a == null) {
                return C3573x.m12786a("null pkg");
            }
            if (a.signatures.length != 1) {
                return C3573x.m12786a("single cert required");
            }
            C3529r rVar = new C3529r(a.signatures[0].toByteArray());
            String str2 = a.packageName;
            C3573x a2 = C3526o.m12654a(str2, rVar, b, false);
            return (!a2.f10196a || a.applicationInfo == null || (a.applicationInfo.flags & 2) == 0 || (b && !C3526o.m12654a(str2, rVar, false, false).f10196a)) ? a2 : C3573x.m12786a("debuggable release cert app rejected");
        } catch (NameNotFoundException unused) {
            String str3 = "no pkg ";
            String valueOf = String.valueOf(str);
            return C3573x.m12786a(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
        }
    }

    /* renamed from: a */
    private static C3528q m12291a(PackageInfo packageInfo, C3528q... qVarArr) {
        if (packageInfo.signatures == null) {
            return null;
        }
        if (packageInfo.signatures.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        C3529r rVar = new C3529r(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < qVarArr.length; i++) {
            if (qVarArr[i].equals(rVar)) {
                return qVarArr[i];
            }
        }
        return null;
    }
}
