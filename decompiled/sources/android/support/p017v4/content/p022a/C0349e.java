package android.support.p017v4.content.p022a;

import java.lang.reflect.Array;

/* renamed from: android.support.v4.content.a.e */
/* compiled from: GrowingArrayUtils */
final class C0349e {

    /* renamed from: a */
    static final /* synthetic */ boolean f887a = true;

    /* renamed from: a */
    public static int m1290a(int i) {
        if (i <= 4) {
            return 8;
        }
        return i * 2;
    }

    /* renamed from: a */
    public static <T> T[] m1292a(T[] tArr, int i, T t) {
        if (f887a || i <= tArr.length) {
            if (i + 1 > tArr.length) {
                T[] tArr2 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), m1290a(i));
                System.arraycopy(tArr, 0, tArr2, 0, i);
                tArr = tArr2;
            }
            tArr[i] = t;
            return tArr;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public static int[] m1291a(int[] iArr, int i, int i2) {
        if (f887a || i <= iArr.length) {
            if (i + 1 > iArr.length) {
                int[] iArr2 = new int[m1290a(i)];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                iArr = iArr2;
            }
            iArr[i] = i2;
            return iArr;
        }
        throw new AssertionError();
    }

    private C0349e() {
    }
}
