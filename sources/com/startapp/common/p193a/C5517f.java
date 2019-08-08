package com.startapp.common.p193a;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* renamed from: com.startapp.common.a.f */
/* compiled from: StartAppSDK */
public class C5517f {
    /* renamed from: a */
    public static List<Location> m23559a(Context context, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        for (String lastKnownLocation : m23560b(context, z, z2)) {
            try {
                LocationManager locationManager = (LocationManager) context.getSystemService("location");
                if (locationManager == null) {
                    return null;
                }
                Location lastKnownLocation2 = locationManager.getLastKnownLocation(lastKnownLocation);
                if (lastKnownLocation2 != null) {
                    arrayList.add(lastKnownLocation2);
                }
            } catch (Exception | IllegalArgumentException | SecurityException unused) {
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static String m23558a(List<Location> list) {
        StringBuilder sb = new StringBuilder();
        if (list == null || list.size() <= 0) {
            return sb.toString();
        }
        for (Location location : list) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(location.getLongitude());
            sb2.append(",");
            sb.append(sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(location.getLatitude());
            sb3.append(",");
            sb.append(sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append(location.getAccuracy());
            sb4.append(",");
            sb.append(sb4.toString());
            StringBuilder sb5 = new StringBuilder();
            sb5.append(location.getProvider());
            sb5.append(",");
            sb.append(sb5.toString());
            StringBuilder sb6 = new StringBuilder();
            sb6.append(location.getTime());
            sb6.append(";");
            sb.append(sb6.toString());
        }
        return sb.toString().substring(0, sb.toString().length() - 1);
    }

    /* renamed from: b */
    private static Queue<String> m23560b(Context context, boolean z, boolean z2) {
        LinkedList linkedList = new LinkedList();
        if (z && C5509c.m23516a(context, "android.permission.ACCESS_FINE_LOCATION")) {
            linkedList.add("gps");
            linkedList.add("passive");
            linkedList.add("network");
        } else if (z2 && C5509c.m23516a(context, "android.permission.ACCESS_COARSE_LOCATION")) {
            linkedList.add("network");
        }
        return linkedList;
    }
}
