package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C3509a;
import java.util.List;

/* renamed from: com.google.android.gms.common.stats.b */
public final class C3542b implements Creator<WakeLockEvent> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new WakeLockEvent[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C3509a.m12567b(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        String str = null;
        List list = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        float f = 0.0f;
        while (parcel.dataPosition() < b) {
            int a = C3509a.m12562a(parcel);
            switch (C3509a.m12561a(a)) {
                case 1:
                    i = C3509a.m12573e(parcel2, a);
                    break;
                case 2:
                    j = C3509a.m12575g(parcel2, a);
                    break;
                case 4:
                    str = C3509a.m12583o(parcel2, a);
                    break;
                case 5:
                    i3 = C3509a.m12573e(parcel2, a);
                    break;
                case 6:
                    list = C3509a.m12557B(parcel2, a);
                    break;
                case 8:
                    j2 = C3509a.m12575g(parcel2, a);
                    break;
                case 10:
                    str3 = C3509a.m12583o(parcel2, a);
                    break;
                case 11:
                    i2 = C3509a.m12573e(parcel2, a);
                    break;
                case 12:
                    str2 = C3509a.m12583o(parcel2, a);
                    break;
                case 13:
                    str4 = C3509a.m12583o(parcel2, a);
                    break;
                case 14:
                    i4 = C3509a.m12573e(parcel2, a);
                    break;
                case 15:
                    f = C3509a.m12578j(parcel2, a);
                    break;
                case 16:
                    j3 = C3509a.m12575g(parcel2, a);
                    break;
                case 17:
                    str5 = C3509a.m12583o(parcel2, a);
                    break;
                default:
                    C3509a.m12568b(parcel2, a);
                    break;
            }
        }
        C3509a.m12560E(parcel2, b);
        WakeLockEvent wakeLockEvent = new WakeLockEvent(i, j, i2, str, i3, list, str2, j2, i4, str3, str4, f, j3, str5);
        return wakeLockEvent;
    }
}
