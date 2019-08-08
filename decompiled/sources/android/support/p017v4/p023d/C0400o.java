package android.support.p017v4.p023d;

import com.startapp.android.publish.common.metaData.MetaData;
import java.io.PrintWriter;

/* renamed from: android.support.v4.d.o */
/* compiled from: TimeUtils */
public final class C0400o {

    /* renamed from: a */
    private static final Object f1010a = new Object();

    /* renamed from: b */
    private static char[] f1011b = new char[24];

    /* renamed from: a */
    private static int m1496a(int i, int i2, boolean z, int i3) {
        if (i > 99 || (z && i3 >= 3)) {
            return 3 + i2;
        }
        if (i > 9 || (z && i3 >= 2)) {
            return 2 + i2;
        }
        if (z || i > 0) {
            return 1 + i2;
        }
        return 0;
    }

    /* renamed from: a */
    private static int m1498a(char[] cArr, int i, char c, int i2, boolean z, int i3) {
        int i4;
        if (!z && i <= 0) {
            return i2;
        }
        if ((!z || i3 < 3) && i <= 99) {
            i4 = i2;
        } else {
            int i5 = i / 100;
            cArr[i2] = (char) (i5 + 48);
            i4 = i2 + 1;
            i -= i5 * 100;
        }
        if ((z && i3 >= 2) || i > 9 || i2 != i4) {
            int i6 = i / 10;
            cArr[i4] = (char) (i6 + 48);
            i4++;
            i -= i6 * 10;
        }
        cArr[i4] = (char) (i + 48);
        int i7 = i4 + 1;
        cArr[i7] = c;
        return i7 + 1;
    }

    /* renamed from: a */
    private static int m1497a(long j, int i) {
        char c;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j2 = j;
        int i7 = i;
        if (f1011b.length < i7) {
            f1011b = new char[i7];
        }
        char[] cArr = f1011b;
        if (j2 == 0) {
            int i8 = i7 - 1;
            while (i8 > 0) {
                cArr[0] = ' ';
            }
            cArr[0] = '0';
            return 1;
        }
        if (j2 > 0) {
            c = '+';
        } else {
            c = '-';
            j2 = -j2;
        }
        int i9 = (int) (j2 % 1000);
        int floor = (int) Math.floor((double) (j2 / 1000));
        if (floor > 86400) {
            i2 = floor / 86400;
            floor -= 86400 * i2;
        } else {
            i2 = 0;
        }
        if (floor > 3600) {
            i3 = floor / MetaData.DEFAULT_NOT_VISIBLE_BANNER_RELOAD_INTERVAL;
            floor -= i3 * MetaData.DEFAULT_NOT_VISIBLE_BANNER_RELOAD_INTERVAL;
        } else {
            i3 = 0;
        }
        if (floor > 60) {
            int i10 = floor / 60;
            i4 = floor - (i10 * 60);
            i5 = i10;
        } else {
            i4 = floor;
            i5 = 0;
        }
        if (i7 != 0) {
            int a = m1496a(i2, 1, false, 0);
            int a2 = a + m1496a(i3, 1, a > 0, 2);
            int a3 = a2 + m1496a(i5, 1, a2 > 0, 2);
            int a4 = a3 + m1496a(i4, 1, a3 > 0, 2);
            i6 = 0;
            for (int a5 = a4 + m1496a(i9, 2, true, a4 > 0 ? 3 : 0) + 1; a5 < i7; a5++) {
                cArr[i6] = ' ';
                i6++;
            }
        } else {
            i6 = 0;
        }
        cArr[i6] = c;
        int i11 = i6 + 1;
        boolean z = i7 != 0;
        int i12 = i11;
        int a6 = m1498a(cArr, i2, 'd', i11, false, 0);
        int a7 = m1498a(cArr, i3, 'h', a6, a6 != i12, z ? 2 : 0);
        int a8 = m1498a(cArr, i5, 'm', a7, a7 != i12, z ? 2 : 0);
        int a9 = m1498a(cArr, i4, 's', a8, a8 != i12, z ? 2 : 0);
        int a10 = m1498a(cArr, i9, 'm', a9, true, (!z || a9 == i12) ? 0 : 3);
        cArr[a10] = 's';
        return a10 + 1;
    }

    /* renamed from: a */
    public static void m1501a(long j, PrintWriter printWriter, int i) {
        synchronized (f1010a) {
            printWriter.print(new String(f1011b, 0, m1497a(j, i)));
        }
    }

    /* renamed from: a */
    public static void m1500a(long j, PrintWriter printWriter) {
        m1501a(j, printWriter, 0);
    }

    /* renamed from: a */
    public static void m1499a(long j, long j2, PrintWriter printWriter) {
        if (j == 0) {
            printWriter.print("--");
        } else {
            m1501a(j - j2, printWriter, 0);
        }
    }
}
