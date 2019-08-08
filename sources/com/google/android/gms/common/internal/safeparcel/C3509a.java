package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.internal.safeparcel.a */
public class C3509a {

    /* renamed from: com.google.android.gms.common.internal.safeparcel.a$a */
    public static class C3510a extends RuntimeException {
        public C3510a(String str, Parcel parcel) {
            int dataPosition = parcel.dataPosition();
            int dataSize = parcel.dataSize();
            StringBuilder sb = new StringBuilder(41 + String.valueOf(str).length());
            sb.append(str);
            sb.append(" Parcel: pos=");
            sb.append(dataPosition);
            sb.append(" size=");
            sb.append(dataSize);
            super(sb.toString());
        }
    }

    /* renamed from: a */
    public static int m12561a(int i) {
        return i & 65535;
    }

    /* renamed from: a */
    public static int m12562a(Parcel parcel) {
        return parcel.readInt();
    }

    /* renamed from: a */
    public static int m12563a(Parcel parcel, int i) {
        return (i & -65536) != -65536 ? (i >> 16) & 65535 : parcel.readInt();
    }

    /* renamed from: b */
    public static void m12568b(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + m12563a(parcel, i));
    }

    /* renamed from: a */
    private static void m12565a(Parcel parcel, int i, int i2) {
        int a = m12563a(parcel, i);
        if (a != i2) {
            String hexString = Integer.toHexString(a);
            StringBuilder sb = new StringBuilder(46 + String.valueOf(hexString).length());
            sb.append("Expected size ");
            sb.append(i2);
            sb.append(" got ");
            sb.append(a);
            sb.append(" (0x");
            sb.append(hexString);
            sb.append(")");
            throw new C3510a(sb.toString(), parcel);
        }
    }

    /* renamed from: a */
    private static void m12566a(Parcel parcel, int i, int i2, int i3) {
        if (i2 != i3) {
            String hexString = Integer.toHexString(i2);
            StringBuilder sb = new StringBuilder(46 + String.valueOf(hexString).length());
            sb.append("Expected size ");
            sb.append(i3);
            sb.append(" got ");
            sb.append(i2);
            sb.append(" (0x");
            sb.append(hexString);
            sb.append(")");
            throw new C3510a(sb.toString(), parcel);
        }
    }

    /* renamed from: b */
    public static int m12567b(Parcel parcel) {
        int a = m12562a(parcel);
        int a2 = m12563a(parcel, a);
        int dataPosition = parcel.dataPosition();
        if (m12561a(a) != 20293) {
            String str = "Expected object header. Got 0x";
            String valueOf = String.valueOf(Integer.toHexString(a));
            throw new C3510a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), parcel);
        }
        int i = a2 + dataPosition;
        if (i >= dataPosition && i <= parcel.dataSize()) {
            return i;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(i);
        throw new C3510a(sb.toString(), parcel);
    }

    /* renamed from: c */
    public static boolean m12571c(Parcel parcel, int i) {
        m12565a(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    /* renamed from: d */
    public static short m12572d(Parcel parcel, int i) {
        m12565a(parcel, i, 4);
        return (short) parcel.readInt();
    }

    /* renamed from: e */
    public static int m12573e(Parcel parcel, int i) {
        m12565a(parcel, i, 4);
        return parcel.readInt();
    }

    /* renamed from: f */
    public static Integer m12574f(Parcel parcel, int i) {
        int a = m12563a(parcel, i);
        if (a == 0) {
            return null;
        }
        m12566a(parcel, i, a, 4);
        return Integer.valueOf(parcel.readInt());
    }

    /* renamed from: g */
    public static long m12575g(Parcel parcel, int i) {
        m12565a(parcel, i, 8);
        return parcel.readLong();
    }

    /* renamed from: h */
    public static Long m12576h(Parcel parcel, int i) {
        int a = m12563a(parcel, i);
        if (a == 0) {
            return null;
        }
        m12566a(parcel, i, a, 8);
        return Long.valueOf(parcel.readLong());
    }

    /* renamed from: i */
    public static BigInteger m12577i(Parcel parcel, int i) {
        int a = m12563a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + a);
        return new BigInteger(createByteArray);
    }

    /* renamed from: j */
    public static float m12578j(Parcel parcel, int i) {
        m12565a(parcel, i, 4);
        return parcel.readFloat();
    }

    /* renamed from: k */
    public static Float m12579k(Parcel parcel, int i) {
        int a = m12563a(parcel, i);
        if (a == 0) {
            return null;
        }
        m12566a(parcel, i, a, 4);
        return Float.valueOf(parcel.readFloat());
    }

    /* renamed from: l */
    public static double m12580l(Parcel parcel, int i) {
        m12565a(parcel, i, 8);
        return parcel.readDouble();
    }

    /* renamed from: m */
    public static Double m12581m(Parcel parcel, int i) {
        int a = m12563a(parcel, i);
        if (a == 0) {
            return null;
        }
        m12566a(parcel, i, a, 8);
        return Double.valueOf(parcel.readDouble());
    }

    /* renamed from: n */
    public static BigDecimal m12582n(Parcel parcel, int i) {
        int a = m12563a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(dataPosition + a);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    /* renamed from: o */
    public static String m12583o(Parcel parcel, int i) {
        int a = m12563a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + a);
        return readString;
    }

    /* renamed from: p */
    public static IBinder m12584p(Parcel parcel, int i) {
        int a = m12563a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + a);
        return readStrongBinder;
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m12564a(Parcel parcel, int i, Creator<T> creator) {
        int a = m12563a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        T t = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + a);
        return t;
    }

    /* renamed from: q */
    public static Bundle m12585q(Parcel parcel, int i) {
        int a = m12563a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + a);
        return readBundle;
    }

    /* renamed from: r */
    public static byte[] m12586r(Parcel parcel, int i) {
        int a = m12563a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + a);
        return createByteArray;
    }

    /* renamed from: s */
    public static boolean[] m12587s(Parcel parcel, int i) {
        int a = m12563a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        boolean[] createBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(dataPosition + a);
        return createBooleanArray;
    }

    /* renamed from: t */
    public static int[] m12588t(Parcel parcel, int i) {
        int a = m12563a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + a);
        return createIntArray;
    }

    /* renamed from: u */
    public static long[] m12589u(Parcel parcel, int i) {
        int a = m12563a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + a);
        return createLongArray;
    }

    /* renamed from: v */
    public static BigInteger[] m12590v(Parcel parcel, int i) {
        int a = m12563a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigInteger[] bigIntegerArr = new BigInteger[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            bigIntegerArr[i2] = new BigInteger(parcel.createByteArray());
        }
        parcel.setDataPosition(dataPosition + a);
        return bigIntegerArr;
    }

    /* renamed from: w */
    public static float[] m12591w(Parcel parcel, int i) {
        int a = m12563a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        float[] createFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(dataPosition + a);
        return createFloatArray;
    }

    /* renamed from: x */
    public static double[] m12592x(Parcel parcel, int i) {
        int a = m12563a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        double[] createDoubleArray = parcel.createDoubleArray();
        parcel.setDataPosition(dataPosition + a);
        return createDoubleArray;
    }

    /* renamed from: y */
    public static BigDecimal[] m12593y(Parcel parcel, int i) {
        int a = m12563a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigDecimal[] bigDecimalArr = new BigDecimal[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            byte[] createByteArray = parcel.createByteArray();
            bigDecimalArr[i2] = new BigDecimal(new BigInteger(createByteArray), parcel.readInt());
        }
        parcel.setDataPosition(dataPosition + a);
        return bigDecimalArr;
    }

    /* renamed from: z */
    public static String[] m12594z(Parcel parcel, int i) {
        int a = m12563a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + a);
        return createStringArray;
    }

    /* renamed from: A */
    public static ArrayList<Integer> m12556A(Parcel parcel, int i) {
        int a = m12563a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + a);
        return arrayList;
    }

    /* renamed from: B */
    public static ArrayList<String> m12557B(Parcel parcel, int i) {
        int a = m12563a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + a);
        return createStringArrayList;
    }

    /* renamed from: b */
    public static <T> T[] m12569b(Parcel parcel, int i, Creator<T> creator) {
        int a = m12563a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        T[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + a);
        return createTypedArray;
    }

    /* renamed from: c */
    public static <T> ArrayList<T> m12570c(Parcel parcel, int i, Creator<T> creator) {
        int a = m12563a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + a);
        return createTypedArrayList;
    }

    /* renamed from: C */
    public static Parcel m12558C(Parcel parcel, int i) {
        int a = m12563a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.appendFrom(parcel, dataPosition, a);
        parcel.setDataPosition(dataPosition + a);
        return obtain;
    }

    /* renamed from: D */
    public static Parcel[] m12559D(Parcel parcel, int i) {
        int a = m12563a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        Parcel[] parcelArr = new Parcel[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            int readInt2 = parcel.readInt();
            if (readInt2 != 0) {
                int dataPosition2 = parcel.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(parcel, dataPosition2, readInt2);
                parcelArr[i2] = obtain;
                parcel.setDataPosition(dataPosition2 + readInt2);
            } else {
                parcelArr[i2] = null;
            }
        }
        parcel.setDataPosition(dataPosition + a);
        return parcelArr;
    }

    /* renamed from: E */
    public static void m12560E(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Overread allowed size end=");
            sb.append(i);
            throw new C3510a(sb.toString(), parcel);
        }
    }
}
