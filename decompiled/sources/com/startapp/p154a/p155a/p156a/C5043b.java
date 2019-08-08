package com.startapp.p154a.p155a.p156a;

/* renamed from: com.startapp.a.a.a.b */
/* compiled from: StartAppSDK */
public class C5043b {
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x00e0, code lost:
        r9 = r9 ^ (((long) r0.get(((r24 + r2) - r3) + 3)) << 24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00ee, code lost:
        r9 = r9 ^ (((long) r0.get(((r24 + r2) - r3) + 2)) << 16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00fc, code lost:
        r9 = r9 ^ (((long) r0.get(((r24 + r2) - r3) + 1)) << 8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x010a, code lost:
        r2 = r9 ^ ((long) r0.get((r24 + r2) - r3));
        r0 = -4132994306676758123L;
        r9 = r2 * -4132994306676758123L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x011b, code lost:
        r5 = (r9 ^ (r9 >>> 47)) * r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0126, code lost:
        return r5 ^ (r5 >>> 47);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x00c4, code lost:
        r9 = r9 ^ (((long) r0.get(((r24 + r2) - r3) + 5)) << 40);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x00d2, code lost:
        r9 = r9 ^ (((long) r0.get(((r24 + r2) - r3) + 4)) << 32);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m21795a(java.nio.ByteBuffer r23, int r24, int r25, long r26) {
        /*
            r0 = r23
            r2 = r25
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r26 & r3
            long r3 = (long) r2
            r5 = -4132994306676758123(0xc6a4a7935bd1e995, double:-2.0946245025644615E32)
            long r3 = r3 * r5
            long r9 = r7 ^ r3
            int r3 = r2 >> 3
            r4 = 0
        L_0x0017:
            r7 = 48
            r8 = 40
            r11 = 32
            r12 = 24
            r13 = 16
            r14 = 8
            if (r4 >= r3) goto L_0x00ab
            int r16 = r4 << 3
            int r16 = r24 + r16
            int r15 = r16 + 0
            byte r15 = r0.get(r15)
            long r5 = (long) r15
            r17 = 255(0xff, double:1.26E-321)
            long r19 = r5 & r17
            int r5 = r16 + 1
            byte r5 = r0.get(r5)
            long r5 = (long) r5
            long r21 = r5 & r17
            long r5 = r21 << r14
            long r14 = r19 + r5
            int r5 = r16 + 2
            byte r5 = r0.get(r5)
            long r5 = (long) r5
            long r19 = r5 & r17
            long r5 = r19 << r13
            long r19 = r14 + r5
            int r5 = r16 + 3
            byte r5 = r0.get(r5)
            long r5 = (long) r5
            long r13 = r5 & r17
            long r5 = r13 << r12
            long r12 = r19 + r5
            int r5 = r16 + 4
            byte r5 = r0.get(r5)
            long r5 = (long) r5
            long r14 = r5 & r17
            long r5 = r14 << r11
            long r14 = r12 + r5
            int r5 = r16 + 5
            byte r5 = r0.get(r5)
            long r5 = (long) r5
            long r11 = r5 & r17
            long r5 = r11 << r8
            long r11 = r14 + r5
            int r5 = r16 + 6
            byte r5 = r0.get(r5)
            long r5 = (long) r5
            long r13 = r5 & r17
            long r5 = r13 << r7
            long r7 = r11 + r5
            int r5 = r16 + 7
            byte r5 = r0.get(r5)
            long r5 = (long) r5
            long r11 = r5 & r17
            r5 = 56
            long r5 = r11 << r5
            long r11 = r7 + r5
            r5 = -4132994306676758123(0xc6a4a7935bd1e995, double:-2.0946245025644615E32)
            long r11 = r11 * r5
            r7 = 47
            long r7 = r11 >>> r7
            long r13 = r11 ^ r7
            long r13 = r13 * r5
            long r7 = r9 ^ r13
            long r9 = r7 * r5
            int r4 = r4 + 1
            r5 = -4132994306676758123(0xc6a4a7935bd1e995, double:-2.0946245025644615E32)
            goto L_0x0017
        L_0x00ab:
            r3 = r2 & 7
            switch(r3) {
                case 0: goto L_0x00b0;
                case 1: goto L_0x010a;
                case 2: goto L_0x00fc;
                case 3: goto L_0x00ee;
                case 4: goto L_0x00e0;
                case 5: goto L_0x00d2;
                case 6: goto L_0x00c4;
                case 7: goto L_0x00b6;
                default: goto L_0x00b0;
            }
        L_0x00b0:
            r0 = -4132994306676758123(0xc6a4a7935bd1e995, double:-2.0946245025644615E32)
            goto L_0x011b
        L_0x00b6:
            int r4 = r24 + r2
            int r4 = r4 - r3
            int r4 = r4 + 6
            byte r4 = r0.get(r4)
            long r4 = (long) r4
            long r4 = r4 << r7
            long r6 = r9 ^ r4
            r9 = r6
        L_0x00c4:
            int r4 = r24 + r2
            int r4 = r4 - r3
            int r4 = r4 + 5
            byte r4 = r0.get(r4)
            long r4 = (long) r4
            long r4 = r4 << r8
            long r6 = r9 ^ r4
            r9 = r6
        L_0x00d2:
            int r4 = r24 + r2
            int r4 = r4 - r3
            int r4 = r4 + 4
            byte r4 = r0.get(r4)
            long r4 = (long) r4
            long r4 = r4 << r11
            long r6 = r9 ^ r4
            r9 = r6
        L_0x00e0:
            int r4 = r24 + r2
            int r4 = r4 - r3
            int r4 = r4 + 3
            byte r4 = r0.get(r4)
            long r4 = (long) r4
            long r4 = r4 << r12
            long r6 = r9 ^ r4
            r9 = r6
        L_0x00ee:
            int r4 = r24 + r2
            int r4 = r4 - r3
            int r4 = r4 + 2
            byte r4 = r0.get(r4)
            long r4 = (long) r4
            long r4 = r4 << r13
            long r6 = r9 ^ r4
            r9 = r6
        L_0x00fc:
            int r4 = r24 + r2
            int r4 = r4 - r3
            int r4 = r4 + 1
            byte r4 = r0.get(r4)
            long r4 = (long) r4
            long r4 = r4 << r14
            long r6 = r9 ^ r4
            r9 = r6
        L_0x010a:
            int r1 = r24 + r2
            int r1 = r1 - r3
            byte r0 = r0.get(r1)
            long r0 = (long) r0
            long r2 = r9 ^ r0
            r0 = -4132994306676758123(0xc6a4a7935bd1e995, double:-2.0946245025644615E32)
            long r9 = r2 * r0
        L_0x011b:
            r2 = 47
            long r3 = r9 >>> r2
            long r5 = r9 ^ r3
            long r5 = r5 * r0
            long r0 = r5 >>> r2
            long r2 = r5 ^ r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.p154a.p155a.p156a.C5043b.m21795a(java.nio.ByteBuffer, int, int, long):long");
    }
}
