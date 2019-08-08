package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C3504r;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class ActivityTransitionRequest extends AbstractSafeParcelable {
    public static final Creator<ActivityTransitionRequest> CREATOR = new C4738y();

    /* renamed from: a */
    public static final Comparator<ActivityTransition> f15290a = new C4737x();

    /* renamed from: b */
    private final List<ActivityTransition> f15291b;

    /* renamed from: c */
    private final String f15292c;

    /* renamed from: d */
    private final List<ClientIdentity> f15293d;

    public ActivityTransitionRequest(List<ActivityTransition> list) {
        this(list, null, null);
    }

    public ActivityTransitionRequest(List<ActivityTransition> list, String str, List<ClientIdentity> list2) {
        C3513t.m12626a(list, (Object) "transitions can't be null");
        C3513t.m12636b(list.size() > 0, "transitions can't be empty.");
        TreeSet treeSet = new TreeSet(f15290a);
        for (ActivityTransition activityTransition : list) {
            C3513t.m12636b(treeSet.add(activityTransition), String.format("Found duplicated transition: %s.", new Object[]{activityTransition}));
        }
        this.f15291b = Collections.unmodifiableList(list);
        this.f15292c = str;
        this.f15293d = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ActivityTransitionRequest activityTransitionRequest = (ActivityTransitionRequest) obj;
        return C3504r.m12550a(this.f15291b, activityTransitionRequest.f15291b) && C3504r.m12550a(this.f15292c, activityTransitionRequest.f15292c) && C3504r.m12550a(this.f15293d, activityTransitionRequest.f15293d);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.f15291b.hashCode() * 31) + (this.f15292c != null ? this.f15292c.hashCode() : 0)) * 31;
        if (this.f15293d != null) {
            i = this.f15293d.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f15291b);
        String str = this.f15292c;
        String valueOf2 = String.valueOf(this.f15293d);
        StringBuilder sb = new StringBuilder(61 + String.valueOf(valueOf).length() + String.valueOf(str).length() + String.valueOf(valueOf2).length());
        sb.append("ActivityTransitionRequest [mTransitions=");
        sb.append(valueOf);
        sb.append(", mTag='");
        sb.append(str);
        sb.append('\'');
        sb.append(", mClients=");
        sb.append(valueOf2);
        sb.append(']');
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12621c(parcel, 1, this.f15291b, false);
        C3511b.m12609a(parcel, 2, this.f15292c, false);
        C3511b.m12621c(parcel, 3, this.f15293d, false);
        C3511b.m12596a(parcel, a);
    }
}
