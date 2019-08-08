package com.google.android.gms.internal.p148e;

import com.google.android.exoplayer2.C2793C;
import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.e.go */
public final class C4629go {

    /* renamed from: a */
    protected static final Charset f15074a = Charset.forName(C2793C.UTF8_NAME);

    /* renamed from: b */
    public static final Object f15075b = new Object();

    /* renamed from: c */
    private static final Charset f15076c = Charset.forName("ISO-8859-1");

    /* renamed from: a */
    public static boolean m20096a(int[] iArr, int[] iArr2) {
        if (iArr == null || iArr.length == 0) {
            return iArr2 == null || iArr2.length == 0;
        }
        return Arrays.equals(iArr, iArr2);
    }

    /* renamed from: a */
    public static boolean m20097a(long[] jArr, long[] jArr2) {
        if (jArr == null || jArr.length == 0) {
            return jArr2 == null || jArr2.length == 0;
        }
        return Arrays.equals(jArr, jArr2);
    }

    /* renamed from: a */
    public static boolean m20098a(Object[] objArr, Object[] objArr2) {
        int i;
        int length = objArr == null ? 0 : objArr.length;
        if (objArr2 == null) {
            i = 0;
        } else {
            i = objArr2.length;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= length || objArr[i2] != null) {
                while (i3 < i && objArr2[i3] == null) {
                    i3++;
                }
                boolean z = i2 >= length;
                boolean z2 = i3 >= i;
                if (z && z2) {
                    return true;
                }
                if (z != z2 || !objArr[i2].equals(objArr2[i3])) {
                    return false;
                }
                i2++;
                i3++;
            } else {
                i2++;
            }
        }
    }

    /* renamed from: a */
    public static int m20092a(int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            return 0;
        }
        return Arrays.hashCode(iArr);
    }

    /* renamed from: a */
    public static int m20093a(long[] jArr) {
        if (jArr == null || jArr.length == 0) {
            return 0;
        }
        return Arrays.hashCode(jArr);
    }

    /* renamed from: a */
    public static int m20094a(Object[] objArr) {
        int length = objArr == null ? 0 : objArr.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = objArr[i2];
            if (obj != null) {
                i = (i * 31) + obj.hashCode();
            }
        }
        return i;
    }

    /* renamed from: a */
    public static void m20095a(C4625gk gkVar, C4625gk gkVar2) {
        if (gkVar.f15061L != null) {
            gkVar2.f15061L = (C4627gm) gkVar.f15061L.clone();
        }
    }
}
