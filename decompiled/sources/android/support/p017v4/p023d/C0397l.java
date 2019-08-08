package android.support.p017v4.p023d;

/* renamed from: android.support.v4.d.l */
/* compiled from: Preconditions */
public class C0397l {
    /* renamed from: a */
    public static <T> T m1469a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static <T> T m1470a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: a */
    public static int m1468a(int i) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException();
    }
}
