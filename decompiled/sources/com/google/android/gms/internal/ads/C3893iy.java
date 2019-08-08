package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C3025aw;
import java.math.BigInteger;
import java.util.Locale;
import javax.annotation.concurrent.GuardedBy;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.iy */
public final class C3893iy {

    /* renamed from: a */
    private static final Object f13366a = new Object();
    @GuardedBy("sLock")

    /* renamed from: b */
    private static String f13367b;

    /* renamed from: a */
    public static String m17028a() {
        String str;
        synchronized (f13366a) {
            str = f13367b;
        }
        return str;
    }

    /* renamed from: a */
    public static String m17029a(Context context, String str, String str2) {
        String str3;
        String str4;
        synchronized (f13366a) {
            if (f13367b == null && !TextUtils.isEmpty(str)) {
                try {
                    ClassLoader classLoader = context.createPackageContext(str2, 3).getClassLoader();
                    Class cls = Class.forName("com.google.ads.mediation.MediationAdapter", false, classLoader);
                    BigInteger bigInteger = new BigInteger(new byte[1]);
                    String[] split = str.split(",");
                    BigInteger bigInteger2 = bigInteger;
                    for (int i = 0; i < split.length; i++) {
                        C3025aw.m10917e();
                        if (C3909jn.m17149a(classLoader, cls, split[i])) {
                            bigInteger2 = bigInteger2.setBit(i);
                        }
                    }
                    str4 = String.format(Locale.US, "%X", new Object[]{bigInteger2});
                } catch (Throwable unused) {
                    str4 = "err";
                }
                f13367b = str4;
            }
            str3 = f13367b;
        }
        return str3;
    }
}
