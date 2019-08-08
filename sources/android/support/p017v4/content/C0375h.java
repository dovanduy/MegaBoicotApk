package android.support.p017v4.content;

import android.content.Context;
import android.os.Process;
import android.support.p017v4.app.C0245b;

/* renamed from: android.support.v4.content.h */
/* compiled from: PermissionChecker */
public final class C0375h {
    /* renamed from: a */
    public static int m1381a(Context context, String str, int i, int i2, String str2) {
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String a = C0245b.m732a(str);
        if (a == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        if (C0245b.m731a(context, a, str2) != 0) {
            return -2;
        }
        return 0;
    }

    /* renamed from: a */
    public static int m1380a(Context context, String str) {
        return m1381a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
