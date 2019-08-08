package com.google.android.gms.common.internal.safeparcel;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C3513t;

/* renamed from: com.google.android.gms.common.internal.safeparcel.c */
public final class C3512c {
    /* renamed from: a */
    public static <T extends SafeParcelable> T m12623a(byte[] bArr, Creator<T> creator) {
        C3513t.m12625a(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        T t = (SafeParcelable) creator.createFromParcel(obtain);
        obtain.recycle();
        return t;
    }

    /* renamed from: a */
    public static <T extends SafeParcelable> T m12622a(Intent intent, String str, Creator<T> creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        return m12623a(byteArrayExtra, creator);
    }
}
