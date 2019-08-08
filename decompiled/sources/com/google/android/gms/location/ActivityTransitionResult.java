package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;
import com.google.android.gms.common.internal.safeparcel.C3512c;
import java.util.Collections;
import java.util.List;

public class ActivityTransitionResult extends AbstractSafeParcelable {
    public static final Creator<ActivityTransitionResult> CREATOR = new C4739z();

    /* renamed from: a */
    private final List<ActivityTransitionEvent> f15294a;

    public ActivityTransitionResult(List<ActivityTransitionEvent> list) {
        C3513t.m12626a(list, (Object) "transitionEvents list can't be null.");
        if (!list.isEmpty()) {
            for (int i = 1; i < list.size(); i++) {
                C3513t.m12635b(((ActivityTransitionEvent) list.get(i)).mo16983c() >= ((ActivityTransitionEvent) list.get(i + -1)).mo16983c());
            }
        }
        this.f15294a = Collections.unmodifiableList(list);
    }

    /* renamed from: a */
    public static boolean m20267a(Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_RESULT");
    }

    /* renamed from: b */
    public static ActivityTransitionResult m20268b(Intent intent) {
        if (!m20267a(intent)) {
            return null;
        }
        return (ActivityTransitionResult) C3512c.m12622a(intent, "com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_RESULT", CREATOR);
    }

    /* renamed from: a */
    public List<ActivityTransitionEvent> mo16992a() {
        return this.f15294a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f15294a.equals(((ActivityTransitionResult) obj).f15294a);
    }

    public int hashCode() {
        return this.f15294a.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12621c(parcel, 1, mo16992a(), false);
        C3511b.m12596a(parcel, a);
    }
}
