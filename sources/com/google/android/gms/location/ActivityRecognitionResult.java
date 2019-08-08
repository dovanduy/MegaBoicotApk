package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C3504r;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;
import java.util.List;

public class ActivityRecognitionResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<ActivityRecognitionResult> CREATOR = new C4734u();

    /* renamed from: a */
    private List<DetectedActivity> f15278a;

    /* renamed from: b */
    private long f15279b;

    /* renamed from: c */
    private long f15280c;

    /* renamed from: d */
    private int f15281d;

    /* renamed from: e */
    private Bundle f15282e;

    public ActivityRecognitionResult(List<DetectedActivity> list, long j, long j2, int i, Bundle bundle) {
        boolean z = false;
        C3513t.m12636b(list != null && list.size() > 0, "Must have at least 1 detected activity");
        if (j > 0 && j2 > 0) {
            z = true;
        }
        C3513t.m12636b(z, "Must set times");
        this.f15278a = list;
        this.f15279b = j;
        this.f15280c = j2;
        this.f15281d = i;
        this.f15282e = bundle;
    }

    /* renamed from: a */
    private static boolean m20257a(Bundle bundle, Bundle bundle2) {
        if (bundle == null && bundle2 == null) {
            return true;
        }
        if ((bundle == null && bundle2 != null) || ((bundle != null && bundle2 == null) || bundle.size() != bundle2.size())) {
            return false;
        }
        for (String str : bundle.keySet()) {
            if (!bundle2.containsKey(str)) {
                return false;
            }
            if (bundle.get(str) == null) {
                if (bundle2.get(str) != null) {
                    return false;
                }
            } else if (bundle.get(str) instanceof Bundle) {
                if (!m20257a(bundle.getBundle(str), bundle2.getBundle(str))) {
                    return false;
                }
            } else if (!bundle.get(str).equals(bundle2.get(str))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) obj;
        return this.f15279b == activityRecognitionResult.f15279b && this.f15280c == activityRecognitionResult.f15280c && this.f15281d == activityRecognitionResult.f15281d && C3504r.m12550a(this.f15278a, activityRecognitionResult.f15278a) && m20257a(this.f15282e, activityRecognitionResult.f15282e);
    }

    public int hashCode() {
        return C3504r.m12548a(Long.valueOf(this.f15279b), Long.valueOf(this.f15280c), Integer.valueOf(this.f15281d), this.f15278a, this.f15282e);
    }

    public String toString() {
        String valueOf = String.valueOf(this.f15278a);
        long j = this.f15279b;
        long j2 = this.f15280c;
        StringBuilder sb = new StringBuilder(124 + String.valueOf(valueOf).length());
        sb.append("ActivityRecognitionResult [probableActivities=");
        sb.append(valueOf);
        sb.append(", timeMillis=");
        sb.append(j);
        sb.append(", elapsedRealtimeMillis=");
        sb.append(j2);
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12621c(parcel, 1, this.f15278a, false);
        C3511b.m12600a(parcel, 2, this.f15279b);
        C3511b.m12600a(parcel, 3, this.f15280c);
        C3511b.m12599a(parcel, 4, this.f15281d);
        C3511b.m12601a(parcel, 5, this.f15282e, false);
        C3511b.m12596a(parcel, a);
    }
}
