package com.google.android.gms.internal.ads;

import java.util.PriorityQueue;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3718cm
public final class alp {
    /* renamed from: a */
    private static long m14398a(long j, int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return j;
        }
        return (i % 2 == 0 ? m14398a((j * j) % 1073807359, i / 2) : j * (m14398a((j * j) % 1073807359, i / 2) % 1073807359)) % 1073807359;
    }

    /* renamed from: a */
    private static String m14399a(String[] strArr, int i, int i2) {
        int i3 = i2 + i;
        if (strArr.length < i3) {
            C3900je.m17431c("Unable to construct shingle");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i4 = i3 - 1;
            if (i < i4) {
                sb.append(strArr[i]);
                sb.append(' ');
                i++;
            } else {
                sb.append(strArr[i4]);
                return sb.toString();
            }
        }
    }

    /* renamed from: a */
    private static void m14400a(int i, long j, String str, int i2, PriorityQueue<alq> priorityQueue) {
        alq alq = new alq(j, str, i2);
        if ((priorityQueue.size() != i || (((alq) priorityQueue.peek()).f11372c <= alq.f11372c && ((alq) priorityQueue.peek()).f11370a <= alq.f11370a)) && !priorityQueue.contains(alq)) {
            priorityQueue.add(alq);
            if (priorityQueue.size() > i) {
                priorityQueue.poll();
            }
        }
    }

    /* renamed from: a */
    public static void m14401a(String[] strArr, int i, int i2, PriorityQueue<alq> priorityQueue) {
        String[] strArr2 = strArr;
        int i3 = i2;
        if (strArr2.length < i3) {
            m14400a(i, m14402b(strArr2, 0, strArr2.length), m14399a(strArr2, 0, strArr2.length), strArr2.length, priorityQueue);
            return;
        }
        long b = m14402b(strArr2, 0, i3);
        m14400a(i, b, m14399a(strArr2, 0, i3), i3, priorityQueue);
        long a = m14398a(16785407, i3 - 1);
        for (int i4 = 1; i4 < (strArr2.length - i3) + 1; i4++) {
            long j = b + 1073807359;
            b = (((((j - ((((((long) alm.m14392a(strArr2[i4 - 1])) + 2147483647L) % 1073807359) * a) % 1073807359)) % 1073807359) * 16785407) % 1073807359) + ((((long) alm.m14392a(strArr2[(i4 + i3) - 1])) + 2147483647L) % 1073807359)) % 1073807359;
            m14400a(i, b, m14399a(strArr2, i4, i3), strArr2.length, priorityQueue);
        }
    }

    /* renamed from: b */
    private static long m14402b(String[] strArr, int i, int i2) {
        long a = (((long) alm.m14392a(strArr[0])) + 2147483647L) % 1073807359;
        for (int i3 = 1; i3 < i2; i3++) {
            a = (((a * 16785407) % 1073807359) + ((((long) alm.m14392a(strArr[i3])) + 2147483647L) % 1073807359)) % 1073807359;
        }
        return a;
    }
}
