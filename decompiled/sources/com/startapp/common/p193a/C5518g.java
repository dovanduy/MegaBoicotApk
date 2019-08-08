package com.startapp.common.p193a;

import android.util.Log;
import com.startapp.common.Constants;

/* renamed from: com.startapp.common.a.g */
/* compiled from: StartAppSDK */
public class C5518g {
    /* renamed from: a */
    public static void m23561a(int i, String str) {
        if (Constants.m23468a().booleanValue()) {
            m23562a(i, str, (Throwable) null);
        }
    }

    /* renamed from: a */
    public static void m23563a(String str, int i, String str2) {
        if (Constants.m23468a().booleanValue()) {
            m23564a(str, i, str2, null);
        }
    }

    /* renamed from: a */
    public static void m23562a(int i, String str, Throwable th) {
        m23564a(null, i, str, th);
    }

    /* renamed from: a */
    public static void m23564a(String str, int i, String str2, Throwable th) {
        String str3;
        if (str == null) {
            str3 = "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(".");
            sb.append(str);
            str3 = sb.toString();
        }
        if (Constants.m23468a().booleanValue()) {
            StringBuffer stringBuffer = new StringBuffer(str2);
            if (stringBuffer.length() > 4000) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("startapp");
                sb2.append(str3);
                String sb3 = sb2.toString();
                StringBuilder sb4 = new StringBuilder();
                sb4.append("sb.length = ");
                sb4.append(stringBuffer.length());
                m23565b(sb3, i, sb4.toString(), th);
                int length = stringBuffer.length() / 4000;
                int i2 = 0;
                while (i2 <= length) {
                    int i3 = i2 + 1;
                    int i4 = 4000 * i3;
                    if (i4 >= stringBuffer.length()) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("startapp");
                        sb5.append(str3);
                        String sb6 = sb5.toString();
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append(i2);
                        sb7.append("/");
                        sb7.append(length);
                        sb7.append(":");
                        sb7.append(stringBuffer.substring(i2 * 4000));
                        m23565b(sb6, i, sb7.toString(), null);
                    } else {
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append("startapp");
                        sb8.append(str3);
                        String sb9 = sb8.toString();
                        StringBuilder sb10 = new StringBuilder();
                        sb10.append(i2);
                        sb10.append("/");
                        sb10.append(length);
                        sb10.append(":");
                        sb10.append(stringBuffer.substring(i2 * 4000, i4));
                        m23565b(sb9, i, sb10.toString(), null);
                    }
                    i2 = i3;
                }
                return;
            }
            StringBuilder sb11 = new StringBuilder();
            sb11.append("startapp");
            sb11.append(str3);
            m23565b(sb11.toString(), i, str2, th);
        }
    }

    /* renamed from: b */
    private static void m23565b(String str, int i, String str2, Throwable th) {
        switch (i) {
            case 2:
                Log.v(str, str2, th);
                return;
            case 3:
                Log.d(str, str2, th);
                return;
            case 4:
                Log.i(str, str2, th);
                return;
            case 5:
                Log.w(str, str2, th);
                return;
            case 6:
                Log.e(str, str2, th);
                return;
            default:
                return;
        }
    }
}
