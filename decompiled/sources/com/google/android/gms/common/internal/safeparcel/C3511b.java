package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: com.google.android.gms.common.internal.safeparcel.b */
public class C3511b {
    /* renamed from: b */
    private static void m12618b(Parcel parcel, int i, int i2) {
        if (i2 >= 65535) {
            parcel.writeInt(i | -65536);
            parcel.writeInt(i2);
            return;
        }
        parcel.writeInt(i | (i2 << 16));
    }

    /* renamed from: b */
    private static int m12617b(Parcel parcel, int i) {
        parcel.writeInt(i | -65536);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* renamed from: c */
    private static void m12620c(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        int i2 = dataPosition - i;
        parcel.setDataPosition(i - 4);
        parcel.writeInt(i2);
        parcel.setDataPosition(dataPosition);
    }

    /* renamed from: a */
    public static int m12595a(Parcel parcel) {
        return m12617b(parcel, 20293);
    }

    /* renamed from: a */
    public static void m12596a(Parcel parcel, int i) {
        m12620c(parcel, i);
    }

    /* renamed from: a */
    public static void m12612a(Parcel parcel, int i, boolean z) {
        m12618b(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: a */
    public static void m12611a(Parcel parcel, int i, short s) {
        m12618b(parcel, i, 4);
        parcel.writeInt(s);
    }

    /* renamed from: a */
    public static void m12599a(Parcel parcel, int i, int i2) {
        m12618b(parcel, i, 4);
        parcel.writeInt(i2);
    }

    /* renamed from: a */
    public static void m12607a(Parcel parcel, int i, Integer num, boolean z) {
        if (num == null) {
            if (z) {
                m12618b(parcel, i, 0);
            }
            return;
        }
        m12618b(parcel, i, 4);
        parcel.writeInt(num.intValue());
    }

    /* renamed from: a */
    public static void m12600a(Parcel parcel, int i, long j) {
        m12618b(parcel, i, 8);
        parcel.writeLong(j);
    }

    /* renamed from: a */
    public static void m12608a(Parcel parcel, int i, Long l, boolean z) {
        if (l == null) {
            if (z) {
                m12618b(parcel, i, 0);
            }
            return;
        }
        m12618b(parcel, i, 8);
        parcel.writeLong(l.longValue());
    }

    /* renamed from: a */
    public static void m12598a(Parcel parcel, int i, float f) {
        m12618b(parcel, i, 4);
        parcel.writeFloat(f);
    }

    /* renamed from: a */
    public static void m12606a(Parcel parcel, int i, Float f, boolean z) {
        if (f == null) {
            if (z) {
                m12618b(parcel, i, 0);
            }
            return;
        }
        m12618b(parcel, i, 4);
        parcel.writeFloat(f.floatValue());
    }

    /* renamed from: a */
    public static void m12597a(Parcel parcel, int i, double d) {
        m12618b(parcel, i, 8);
        parcel.writeDouble(d);
    }

    /* renamed from: a */
    public static void m12605a(Parcel parcel, int i, Double d, boolean z) {
        if (d == null) {
            if (z) {
                m12618b(parcel, i, 0);
            }
            return;
        }
        m12618b(parcel, i, 8);
        parcel.writeDouble(d.doubleValue());
    }

    /* renamed from: a */
    public static void m12609a(Parcel parcel, int i, String str, boolean z) {
        if (str == null) {
            if (z) {
                m12618b(parcel, i, 0);
            }
            return;
        }
        int b = m12617b(parcel, i);
        parcel.writeString(str);
        m12620c(parcel, b);
    }

    /* renamed from: a */
    public static void m12602a(Parcel parcel, int i, IBinder iBinder, boolean z) {
        if (iBinder == null) {
            if (z) {
                m12618b(parcel, i, 0);
            }
            return;
        }
        int b = m12617b(parcel, i);
        parcel.writeStrongBinder(iBinder);
        m12620c(parcel, b);
    }

    /* renamed from: a */
    public static void m12604a(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable == null) {
            if (z) {
                m12618b(parcel, i, 0);
            }
            return;
        }
        int b = m12617b(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        m12620c(parcel, b);
    }

    /* renamed from: a */
    public static void m12601a(Parcel parcel, int i, Bundle bundle, boolean z) {
        if (bundle == null) {
            if (z) {
                m12618b(parcel, i, 0);
            }
            return;
        }
        int b = m12617b(parcel, i);
        parcel.writeBundle(bundle);
        m12620c(parcel, b);
    }

    /* renamed from: a */
    public static void m12613a(Parcel parcel, int i, byte[] bArr, boolean z) {
        if (bArr == null) {
            if (z) {
                m12618b(parcel, i, 0);
            }
            return;
        }
        int b = m12617b(parcel, i);
        parcel.writeByteArray(bArr);
        m12620c(parcel, b);
    }

    /* renamed from: a */
    public static void m12615a(Parcel parcel, int i, String[] strArr, boolean z) {
        if (strArr == null) {
            if (z) {
                m12618b(parcel, i, 0);
            }
            return;
        }
        int b = m12617b(parcel, i);
        parcel.writeStringArray(strArr);
        m12620c(parcel, b);
    }

    /* renamed from: a */
    public static void m12610a(Parcel parcel, int i, List<Integer> list, boolean z) {
        if (list == null) {
            if (z) {
                m12618b(parcel, i, 0);
            }
            return;
        }
        int b = m12617b(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(((Integer) list.get(i2)).intValue());
        }
        m12620c(parcel, b);
    }

    /* renamed from: b */
    public static void m12619b(Parcel parcel, int i, List<String> list, boolean z) {
        if (list == null) {
            if (z) {
                m12618b(parcel, i, 0);
            }
            return;
        }
        int b = m12617b(parcel, i);
        parcel.writeStringList(list);
        m12620c(parcel, b);
    }

    /* renamed from: a */
    public static <T extends Parcelable> void m12614a(Parcel parcel, int i, T[] tArr, int i2, boolean z) {
        if (tArr == null) {
            if (z) {
                m12618b(parcel, i, 0);
            }
            return;
        }
        int b = m12617b(parcel, i);
        parcel.writeInt(r7);
        for (T t : tArr) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                m12616a(parcel, t, i2);
            }
        }
        m12620c(parcel, b);
    }

    /* renamed from: c */
    public static <T extends Parcelable> void m12621c(Parcel parcel, int i, List<T> list, boolean z) {
        if (list == null) {
            if (z) {
                m12618b(parcel, i, 0);
            }
            return;
        }
        int b = m12617b(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                m12616a(parcel, (T) parcelable, 0);
            }
        }
        m12620c(parcel, b);
    }

    /* renamed from: a */
    private static <T extends Parcelable> void m12616a(Parcel parcel, T t, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        t.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    /* renamed from: a */
    public static void m12603a(Parcel parcel, int i, Parcel parcel2, boolean z) {
        if (parcel2 == null) {
            if (z) {
                m12618b(parcel, i, 0);
            }
            return;
        }
        int b = m12617b(parcel, i);
        parcel.appendFrom(parcel2, 0, parcel2.dataSize());
        m12620c(parcel, b);
    }
}
