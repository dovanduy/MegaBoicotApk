package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.internal.C3504r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;
import java.util.Comparator;

public class DetectedActivity extends AbstractSafeParcelable {
    public static final Creator<DetectedActivity> CREATOR = new C4701ab();

    /* renamed from: a */
    private static final Comparator<DetectedActivity> f15295a = new C4700aa();

    /* renamed from: b */
    private static final int[] f15296b = {9, 10};

    /* renamed from: c */
    private static final int[] f15297c = {0, 1, 2, 4, 5, 6, 7, 8, 10, 11, 12, 13, 14, 16, 17, 18, 19};

    /* renamed from: d */
    private static final int[] f15298d = {0, 1, 2, 3, 7, 8, 16, 17};

    /* renamed from: e */
    private int f15299e;

    /* renamed from: f */
    private int f15300f;

    public DetectedActivity(int i, int i2) {
        this.f15299e = i;
        this.f15300f = i2;
    }

    /* renamed from: a */
    public static void m20270a(int i) {
        boolean z = false;
        for (int i2 : f15298d) {
            if (i2 == i) {
                z = true;
            }
        }
        if (!z) {
            StringBuilder sb = new StringBuilder(81);
            sb.append(i);
            sb.append(" is not a valid DetectedActivity supported by Activity Transition API.");
            Log.w("DetectedActivity", sb.toString());
        }
    }

    /* renamed from: a */
    public int mo16996a() {
        int i = this.f15299e;
        if (i > 19 || i < 0) {
            return 4;
        }
        return i;
    }

    /* renamed from: b */
    public int mo16997b() {
        return this.f15300f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DetectedActivity detectedActivity = (DetectedActivity) obj;
        return this.f15299e == detectedActivity.f15299e && this.f15300f == detectedActivity.f15300f;
    }

    public int hashCode() {
        return C3504r.m12548a(Integer.valueOf(this.f15299e), Integer.valueOf(this.f15300f));
    }

    public String toString() {
        String str;
        int a = mo16996a();
        switch (a) {
            case 0:
                str = "IN_VEHICLE";
                break;
            case 1:
                str = "ON_BICYCLE";
                break;
            case 2:
                str = "ON_FOOT";
                break;
            case 3:
                str = "STILL";
                break;
            case 4:
                str = "UNKNOWN";
                break;
            case 5:
                str = "TILTING";
                break;
            default:
                switch (a) {
                    case 7:
                        str = "WALKING";
                        break;
                    case 8:
                        str = "RUNNING";
                        break;
                    default:
                        switch (a) {
                            case 16:
                                str = "IN_ROAD_VEHICLE";
                                break;
                            case 17:
                                str = "IN_RAIL_VEHICLE";
                                break;
                            case 18:
                                str = "IN_TWO_WHEELER_VEHICLE";
                                break;
                            case 19:
                                str = "IN_FOUR_WHEELER_VEHICLE";
                                break;
                            default:
                                str = Integer.toString(a);
                                break;
                        }
                }
        }
        int i = this.f15300f;
        StringBuilder sb = new StringBuilder(48 + String.valueOf(str).length());
        sb.append("DetectedActivity [type=");
        sb.append(str);
        sb.append(", confidence=");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12599a(parcel, 1, this.f15299e);
        C3511b.m12599a(parcel, 2, this.f15300f);
        C3511b.m12596a(parcel, a);
    }
}
