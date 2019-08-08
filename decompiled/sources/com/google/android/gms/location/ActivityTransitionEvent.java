package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C3504r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;

public class ActivityTransitionEvent extends AbstractSafeParcelable {
    public static final Creator<ActivityTransitionEvent> CREATOR = new C4736w();

    /* renamed from: a */
    private final int f15287a;

    /* renamed from: b */
    private final int f15288b;

    /* renamed from: c */
    private final long f15289c;

    public ActivityTransitionEvent(int i, int i2, long j) {
        DetectedActivity.m20270a(i);
        ActivityTransition.m20258a(i2);
        this.f15287a = i;
        this.f15288b = i2;
        this.f15289c = j;
    }

    /* renamed from: a */
    public int mo16981a() {
        return this.f15287a;
    }

    /* renamed from: b */
    public int mo16982b() {
        return this.f15288b;
    }

    /* renamed from: c */
    public long mo16983c() {
        return this.f15289c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransitionEvent)) {
            return false;
        }
        ActivityTransitionEvent activityTransitionEvent = (ActivityTransitionEvent) obj;
        return this.f15287a == activityTransitionEvent.f15287a && this.f15288b == activityTransitionEvent.f15288b && this.f15289c == activityTransitionEvent.f15289c;
    }

    public int hashCode() {
        return C3504r.m12548a(Integer.valueOf(this.f15287a), Integer.valueOf(this.f15288b), Long.valueOf(this.f15289c));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f15287a;
        StringBuilder sb2 = new StringBuilder(24);
        sb2.append("ActivityType ");
        sb2.append(i);
        sb.append(sb2.toString());
        sb.append(" ");
        int i2 = this.f15288b;
        StringBuilder sb3 = new StringBuilder(26);
        sb3.append("TransitionType ");
        sb3.append(i2);
        sb.append(sb3.toString());
        sb.append(" ");
        long j = this.f15289c;
        StringBuilder sb4 = new StringBuilder(41);
        sb4.append("ElapsedRealTimeNanos ");
        sb4.append(j);
        sb.append(sb4.toString());
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12599a(parcel, 1, mo16981a());
        C3511b.m12599a(parcel, 2, mo16982b());
        C3511b.m12600a(parcel, 3, mo16983c());
        C3511b.m12596a(parcel, a);
    }
}
