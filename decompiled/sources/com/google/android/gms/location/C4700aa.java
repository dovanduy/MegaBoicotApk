package com.google.android.gms.location;

import java.util.Comparator;

/* renamed from: com.google.android.gms.location.aa */
final class C4700aa implements Comparator<DetectedActivity> {
    C4700aa() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        DetectedActivity detectedActivity = (DetectedActivity) obj;
        DetectedActivity detectedActivity2 = (DetectedActivity) obj2;
        int compareTo = Integer.valueOf(detectedActivity2.mo16997b()).compareTo(Integer.valueOf(detectedActivity.mo16997b()));
        return compareTo == 0 ? Integer.valueOf(detectedActivity.mo16996a()).compareTo(Integer.valueOf(detectedActivity2.mo16996a())) : compareTo;
    }
}
