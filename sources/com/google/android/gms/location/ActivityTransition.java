package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C3504r;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;

public class ActivityTransition extends AbstractSafeParcelable {
    public static final Creator<ActivityTransition> CREATOR = new C4735v();

    /* renamed from: a */
    private final int f15283a;

    /* renamed from: b */
    private final int f15284b;

    /* renamed from: com.google.android.gms.location.ActivityTransition$a */
    public static class C4696a {

        /* renamed from: a */
        private int f15285a = -1;

        /* renamed from: b */
        private int f15286b = -1;

        /* renamed from: a */
        public C4696a mo16978a(int i) {
            DetectedActivity.m20270a(i);
            this.f15285a = i;
            return this;
        }

        /* renamed from: a */
        public ActivityTransition mo16979a() {
            boolean z = false;
            C3513t.m12632a(this.f15285a != -1, (Object) "Activity type not set.");
            if (this.f15286b != -1) {
                z = true;
            }
            C3513t.m12632a(z, (Object) "Activity transition type not set.");
            return new ActivityTransition(this.f15285a, this.f15286b);
        }

        /* renamed from: b */
        public C4696a mo16980b(int i) {
            ActivityTransition.m20258a(i);
            this.f15286b = i;
            return this;
        }
    }

    ActivityTransition(int i, int i2) {
        this.f15283a = i;
        this.f15284b = i2;
    }

    /* renamed from: a */
    public static void m20258a(int i) {
        boolean z = true;
        if (i < 0 || i > 1) {
            z = false;
        }
        StringBuilder sb = new StringBuilder(41);
        sb.append("Transition type ");
        sb.append(i);
        sb.append(" is not valid.");
        C3513t.m12636b(z, sb.toString());
    }

    /* renamed from: a */
    public int mo16972a() {
        return this.f15283a;
    }

    /* renamed from: b */
    public int mo16973b() {
        return this.f15284b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransition)) {
            return false;
        }
        ActivityTransition activityTransition = (ActivityTransition) obj;
        return this.f15283a == activityTransition.f15283a && this.f15284b == activityTransition.f15284b;
    }

    public int hashCode() {
        return C3504r.m12548a(Integer.valueOf(this.f15283a), Integer.valueOf(this.f15284b));
    }

    public String toString() {
        int i = this.f15283a;
        int i2 = this.f15284b;
        StringBuilder sb = new StringBuilder(75);
        sb.append("ActivityTransition [mActivityType=");
        sb.append(i);
        sb.append(", mTransitionType=");
        sb.append(i2);
        sb.append(']');
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12599a(parcel, 1, mo16972a());
        C3511b.m12599a(parcel, 2, mo16973b());
        C3511b.m12596a(parcel, a);
    }
}
