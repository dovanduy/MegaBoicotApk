package com.facebook.ads.internal.p115w.p118c;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: com.facebook.ads.internal.w.c.d */
class C2349d implements C2346a {

    /* renamed from: a */
    private static final short[] f7404a = {512, 512, 456, 512, 328, 456, 335, 512, 405, 328, 271, 456, 388, 335, 292, 512, 454, 405, 364, 328, 298, 271, 496, 456, 420, 388, 360, 335, 312, 292, 273, 512, 482, 454, 428, 405, 383, 364, 345, 328, 312, 298, 284, 271, 259, 496, 475, 456, 437, 420, 404, 388, 374, 360, 347, 335, 323, 312, 302, 292, 282, 273, 265, 512, 497, 482, 468, 454, 441, 428, 417, 405, 394, 383, 373, 364, 354, 345, 337, 328, 320, 312, 305, 298, 291, 284, 278, 271, 265, 259, 507, 496, 485, 475, 465, 456, 446, 437, 428, 420, 412, 404, 396, 388, 381, 374, 367, 360, 354, 347, 341, 335, 329, 323, 318, 312, 307, 302, 297, 292, 287, 282, 278, 273, 269, 265, 261, 512, 505, 497, 489, 482, 475, 468, 461, 454, 447, 441, 435, 428, 422, 417, 411, 405, 399, 394, 389, 383, 378, 373, 368, 364, 359, 354, 350, 345, 341, 337, 332, 328, 324, 320, 316, 312, 309, 305, 301, 298, 294, 291, 287, 284, 281, 278, 274, 271, 268, 265, 262, 259, 257, 507, 501, 496, 491, 485, 480, 475, 470, 465, 460, 456, 451, 446, 442, 437, 433, 428, 424, 420, 416, 412, 408, 404, 400, 396, 392, 388, 385, 381, 377, 374, 370, 367, 363, 360, 357, 354, 350, 347, 344, 341, 338, 335, 332, 329, 326, 323, 320, 318, 315, 312, 310, 307, 304, 302, 299, 297, 294, 292, 289, 287, 285, 282, 280, 278, 275, 273, 271, 269, 267, 265, 263, 261, 259};

    /* renamed from: b */
    private static final byte[] f7405b = {9, 11, 12, 13, 13, 14, 14, 15, 15, 15, 15, 16, 16, 16, 16, 17, 17, 17, 17, 17, 17, 17, 18, 18, 18, 18, 18, 18, 18, 18, 18, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24};

    /* renamed from: com.facebook.ads.internal.w.c.d$a */
    private static class C2350a implements Callable<Void> {

        /* renamed from: a */
        private final int[] f7406a;

        /* renamed from: b */
        private final int f7407b;

        /* renamed from: c */
        private final int f7408c;

        /* renamed from: d */
        private final int f7409d;

        /* renamed from: e */
        private final int f7410e;

        /* renamed from: f */
        private final int f7411f;

        /* renamed from: g */
        private final int f7412g;

        public C2350a(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6) {
            this.f7406a = iArr;
            this.f7407b = i;
            this.f7408c = i2;
            this.f7409d = i3;
            this.f7410e = i4;
            this.f7411f = i5;
            this.f7412g = i6;
        }

        /* renamed from: a */
        public Void call() {
            C2349d.m9103a(this.f7406a, this.f7407b, this.f7408c, this.f7409d, this.f7410e, this.f7411f, this.f7412g);
            return null;
        }
    }

    C2349d() {
    }

    /* renamed from: a */
    static /* synthetic */ void m9103a(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i;
        int i8 = i2;
        int i9 = i3;
        int i10 = i6;
        int i11 = i7 - 1;
        int i12 = i8 - 1;
        int i13 = (i9 * 2) + 1;
        short s = f7404a[i9];
        byte b = f7405b[i9];
        int[] iArr2 = new int[i13];
        if (i10 == 1) {
            int i14 = (i5 * i8) / i4;
            int i15 = ((i5 + 1) * i8) / i4;
            while (i14 < i15) {
                int i16 = i7 * i14;
                int i17 = 0;
                long j = 0;
                long j2 = 0;
                long j3 = 0;
                long j4 = 0;
                long j5 = 0;
                long j6 = 0;
                while (i17 <= i9) {
                    iArr2[i17] = iArr[i16];
                    i17++;
                    long j7 = j + ((long) (((iArr[i16] >>> 16) & 255) * i17));
                    long j8 = j2 + ((long) (((iArr[i16] >>> 8) & 255) * i17));
                    j6 += (long) (iArr[i16] & 255);
                    s = s;
                    j5 += (long) ((iArr[i16] >>> 8) & 255);
                    j4 += (long) ((iArr[i16] >>> 16) & 255);
                    j3 += (long) ((iArr[i16] & 255) * i17);
                    j2 = j8;
                    j = j7;
                }
                short s2 = s;
                int i18 = i16;
                int i19 = 1;
                long j9 = 0;
                long j10 = 0;
                long j11 = 0;
                while (i19 <= i9) {
                    if (i19 <= i11) {
                        i18++;
                    }
                    iArr2[i19 + i9] = iArr[i18];
                    int i20 = (i9 + 1) - i19;
                    long j12 = j + ((long) (((iArr[i18] >>> 16) & 255) * i20));
                    i19++;
                    j9 += (long) ((iArr[i18] >>> 16) & 255);
                    j11 += (long) (iArr[i18] & 255);
                    j10 += (long) ((iArr[i18] >>> 8) & 255);
                    j3 += (long) ((iArr[i18] & 255) * i20);
                    j2 += (long) (((iArr[i18] >>> 8) & 255) * i20);
                    j = j12;
                }
                int i21 = i9 > i11 ? i11 : i9;
                long j13 = j9;
                int i22 = i21;
                int i23 = i21 + i16;
                int i24 = i16;
                int i25 = i9;
                int i26 = 0;
                while (i26 < i7) {
                    int i27 = i15;
                    int i28 = i14;
                    long j14 = j13;
                    short s3 = s2;
                    long j15 = (long) s3;
                    iArr[i24] = (int) (((long) (iArr[i24] & -16777216)) | ((((j * j15) >>> b) & 255) << 16) | ((((j2 * j15) >>> b) & 255) << 8) | (((j15 * j3) >>> b) & 255));
                    int i29 = i24 + 1;
                    long j16 = j - j4;
                    long j17 = j2 - j5;
                    long j18 = j3 - j6;
                    short s4 = s3;
                    int i30 = (i25 + i13) - i9;
                    if (i30 >= i13) {
                        i30 -= i13;
                    }
                    int i31 = i29;
                    long j19 = j4 - ((long) ((iArr2[i30] >>> 16) & 255));
                    long j20 = j5 - ((long) ((iArr2[i30] >>> 8) & 255));
                    long j21 = j6 - ((long) (iArr2[i30] & 255));
                    if (i22 < i11) {
                        i23++;
                        i22++;
                    }
                    iArr2[i30] = iArr[i23];
                    long j22 = j14 + ((long) ((iArr[i23] >>> 16) & 255));
                    long j23 = j10 + ((long) ((iArr[i23] >>> 8) & 255));
                    long j24 = j11 + ((long) (iArr[i23] & 255));
                    long j25 = j16 + j22;
                    long j26 = j17 + j23;
                    long j27 = j18 + j24;
                    i25++;
                    if (i25 >= i13) {
                        i25 = 0;
                    }
                    long j28 = j25;
                    long j29 = j19 + ((long) ((iArr2[i25] >>> 16) & 255));
                    long j30 = j20 + ((long) ((iArr2[i25] >>> 8) & 255));
                    long j31 = j21 + ((long) (iArr2[i25] & 255));
                    long j32 = j22 - ((long) ((iArr2[i25] >>> 16) & 255));
                    long j33 = j23 - ((long) ((iArr2[i25] >>> 8) & 255));
                    j11 = j24 - ((long) (iArr2[i25] & 255));
                    i26++;
                    j6 = j31;
                    j10 = j33;
                    s2 = s4;
                    i24 = i31;
                    i7 = i;
                    i9 = i3;
                    j3 = j27;
                    j5 = j30;
                    j13 = j32;
                    j2 = j26;
                    j4 = j29;
                    i15 = i27;
                    i14 = i28;
                    j = j28;
                }
                int i32 = i15;
                i14++;
                s = s2;
                i7 = i;
                i9 = i3;
            }
            return;
        }
        short s5 = s;
        if (i10 == 2) {
            short s6 = s5;
            int i33 = i;
            int i34 = (i5 * i33) / i4;
            int i35 = ((i5 + 1) * i33) / i4;
            while (i34 < i35) {
                int i36 = 0;
                int i37 = i3;
                long j34 = 0;
                long j35 = 0;
                long j36 = 0;
                long j37 = 0;
                long j38 = 0;
                long j39 = 0;
                while (i36 <= i37) {
                    iArr2[i36] = iArr[i34];
                    i36++;
                    long j40 = j34 + ((long) (((iArr[i34] >>> 16) & 255) * i36));
                    long j41 = j35 + ((long) (((iArr[i34] >>> 8) & 255) * i36));
                    j39 += (long) (iArr[i34] & 255);
                    i12 = i12;
                    j38 += (long) ((iArr[i34] >>> 8) & 255);
                    j37 += (long) ((iArr[i34] >>> 16) & 255);
                    j36 += (long) ((iArr[i34] & 255) * i36);
                    j35 = j41;
                    j34 = j40;
                }
                int i38 = i12;
                int i39 = i34;
                int i40 = 1;
                long j42 = 0;
                long j43 = 0;
                long j44 = 0;
                while (i40 <= i37) {
                    int i41 = i35;
                    int i42 = i38;
                    if (i40 <= i42) {
                        i39 += i33;
                    }
                    iArr2[i40 + i37] = iArr[i39];
                    int i43 = (i37 + 1) - i40;
                    long j45 = j34 + ((long) (((iArr[i39] >>> 16) & 255) * i43));
                    i40++;
                    i38 = i42;
                    j42 += (long) ((iArr[i39] >>> 16) & 255);
                    j44 += (long) (iArr[i39] & 255);
                    i35 = i41;
                    j43 += (long) ((iArr[i39] >>> 8) & 255);
                    j36 += (long) ((iArr[i39] & 255) * i43);
                    iArr2 = iArr2;
                    b = b;
                    j35 += (long) (((iArr[i39] >>> 8) & 255) * i43);
                    j34 = j45;
                }
                int i44 = i35;
                byte b2 = b;
                int[] iArr3 = iArr2;
                int i45 = i38;
                int i46 = i37 > i45 ? i45 : i37;
                int i47 = (i46 * i33) + i34;
                long j46 = j44;
                int i48 = i34;
                long j47 = j43;
                long j48 = j42;
                int i49 = i37;
                int i50 = i46;
                int i51 = 0;
                while (i51 < i8) {
                    int i52 = i34;
                    int i53 = i51;
                    int i54 = i47;
                    long j49 = (long) s6;
                    iArr[i48] = (int) (((long) (iArr[i48] & -16777216)) | ((((j34 * j49) >>> b2) & 255) << 16) | ((((j35 * j49) >>> b2) & 255) << 8) | (((j49 * j36) >>> b2) & 255));
                    i48 += i33;
                    long j50 = j34 - j37;
                    long j51 = j35 - j38;
                    long j52 = j36 - j39;
                    int i55 = (i49 + i13) - i37;
                    if (i55 >= i13) {
                        i55 -= i13;
                    }
                    short s7 = s6;
                    long j53 = j37 - ((long) ((iArr3[i55] >>> 16) & 255));
                    long j54 = j38 - ((long) ((iArr3[i55] >>> 8) & 255));
                    long j55 = j39 - ((long) (iArr3[i55] & 255));
                    if (i50 < i45) {
                        i50++;
                        i54 += i33;
                    }
                    iArr3[i55] = iArr[i54];
                    long j56 = j48 + ((long) ((iArr[i54] >>> 16) & 255));
                    long j57 = j47 + ((long) ((iArr[i54] >>> 8) & 255));
                    long j58 = j46 + ((long) (iArr[i54] & 255));
                    long j59 = j50 + j56;
                    long j60 = j51 + j57;
                    long j61 = j52 + j58;
                    i49++;
                    if (i49 >= i13) {
                        i49 = 0;
                    }
                    long j62 = j53 + ((long) ((iArr3[i49] >>> 16) & 255));
                    long j63 = j54 + ((long) ((iArr3[i49] >>> 8) & 255));
                    long j64 = j55 + ((long) (iArr3[i49] & 255));
                    long j65 = j56 - ((long) ((iArr3[i49] >>> 16) & 255));
                    long j66 = j57 - ((long) ((iArr3[i49] >>> 8) & 255));
                    j46 = j58 - ((long) (iArr3[i49] & 255));
                    j34 = j59;
                    j39 = j64;
                    j48 = j65;
                    j37 = j62;
                    s6 = s7;
                    i8 = i2;
                    j36 = j61;
                    j47 = j66;
                    i47 = i54;
                    j38 = j63;
                    j35 = j60;
                    i34 = i52;
                    i51 = i53 + 1;
                    i37 = i3;
                }
                short s8 = s6;
                i34++;
                i12 = i45;
                i35 = i44;
                iArr2 = iArr3;
                b = b2;
                i8 = i2;
            }
        }
    }

    /* renamed from: a */
    public Bitmap mo8746a(Bitmap bitmap, float f) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        try {
            int[] iArr = new int[(width * height)];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            int i = C2352f.f7416a;
            ArrayList arrayList = new ArrayList(i);
            ArrayList arrayList2 = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = (int) f;
                int[] iArr2 = iArr;
                int i4 = width;
                int i5 = height;
                int i6 = i3;
                int i7 = i3;
                int i8 = i;
                int i9 = i2;
                C2350a aVar = r0;
                C2350a aVar2 = new C2350a(iArr2, i4, i5, i6, i8, i9, 1);
                arrayList.add(aVar);
                C2350a aVar3 = new C2350a(iArr2, i4, i5, i7, i8, i9, 2);
                arrayList2.add(aVar3);
            }
            try {
                C2352f.f7417b.invokeAll(arrayList);
                try {
                    C2352f.f7417b.invokeAll(arrayList2);
                    try {
                        return Bitmap.createBitmap(iArr, width, height, Config.ARGB_8888);
                    } catch (OutOfMemoryError unused) {
                        return null;
                    }
                } catch (InterruptedException unused2) {
                    return null;
                }
            } catch (InterruptedException unused3) {
                return null;
            }
        } catch (OutOfMemoryError unused4) {
            return null;
        }
    }
}
