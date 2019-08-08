package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C3509a;
import java.util.List;

/* renamed from: com.google.android.gms.location.u */
public final class C4734u implements Creator<ActivityRecognitionResult> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C3509a.m12567b(parcel);
        long j = 0;
        long j2 = 0;
        List list = null;
        Bundle bundle = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = C3509a.m12562a(parcel);
            switch (C3509a.m12561a(a)) {
                case 1:
                    list = C3509a.m12570c(parcel, a, DetectedActivity.CREATOR);
                    break;
                case 2:
                    j = C3509a.m12575g(parcel, a);
                    break;
                case 3:
                    j2 = C3509a.m12575g(parcel, a);
                    break;
                case 4:
                    i = C3509a.m12573e(parcel, a);
                    break;
                case 5:
                    bundle = C3509a.m12585q(parcel, a);
                    break;
                default:
                    C3509a.m12568b(parcel, a);
                    break;
            }
        }
        C3509a.m12560E(parcel, b);
        ActivityRecognitionResult activityRecognitionResult = new ActivityRecognitionResult(list, j, j2, i, bundle);
        return activityRecognitionResult;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ActivityRecognitionResult[i];
    }
}
