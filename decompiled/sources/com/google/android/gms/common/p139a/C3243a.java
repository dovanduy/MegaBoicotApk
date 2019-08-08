package com.google.android.gms.common.p139a;

import android.util.Log;
import com.google.android.gms.common.internal.C3492k;
import java.util.Locale;

/* renamed from: com.google.android.gms.common.a.a */
public class C3243a {

    /* renamed from: a */
    private final String f9448a;

    /* renamed from: b */
    private final String f9449b;

    /* renamed from: c */
    private final C3492k f9450c;

    /* renamed from: d */
    private final int f9451d;

    public C3243a(String str, String... strArr) {
        String str2;
        if (strArr.length == 0) {
            str2 = "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str3 : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str3);
            }
            sb.append(']');
            sb.append(' ');
            str2 = sb.toString();
        }
        this(str, str2);
    }

    private C3243a(String str, String str2) {
        this.f9449b = str2;
        this.f9448a = str;
        this.f9450c = new C3492k(str);
        int i = 2;
        while (7 >= i && !Log.isLoggable(this.f9448a, i)) {
            i++;
        }
        this.f9451d = i;
    }

    /* renamed from: a */
    public boolean mo13067a(int i) {
        return this.f9451d <= i;
    }

    /* renamed from: a */
    public void mo13066a(String str, Object... objArr) {
        if (mo13067a(3)) {
            Log.d(this.f9448a, m11590c(str, objArr));
        }
    }

    /* renamed from: b */
    public void mo13068b(String str, Object... objArr) {
        Log.e(this.f9448a, m11590c(str, objArr));
    }

    /* renamed from: c */
    private final String m11590c(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f9449b.concat(str);
    }
}
