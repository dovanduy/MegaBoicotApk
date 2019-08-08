package android.support.p028v7.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.support.p017v4.content.C0375h;
import android.util.Log;
import com.google.android.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.util.Calendar;

/* renamed from: android.support.v7.app.h */
/* compiled from: TwilightManager */
class C0727h {

    /* renamed from: a */
    private static C0727h f2023a;

    /* renamed from: b */
    private final Context f2024b;

    /* renamed from: c */
    private final LocationManager f2025c;

    /* renamed from: d */
    private final C0728a f2026d = new C0728a();

    /* renamed from: android.support.v7.app.h$a */
    /* compiled from: TwilightManager */
    private static class C0728a {

        /* renamed from: a */
        boolean f2027a;

        /* renamed from: b */
        long f2028b;

        /* renamed from: c */
        long f2029c;

        /* renamed from: d */
        long f2030d;

        /* renamed from: e */
        long f2031e;

        /* renamed from: f */
        long f2032f;

        C0728a() {
        }
    }

    /* renamed from: a */
    static C0727h m2946a(Context context) {
        if (f2023a == null) {
            Context applicationContext = context.getApplicationContext();
            f2023a = new C0727h(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f2023a;
    }

    C0727h(Context context, LocationManager locationManager) {
        this.f2024b = context;
        this.f2025c = locationManager;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo2786a() {
        C0728a aVar = this.f2026d;
        if (m2949c()) {
            return aVar.f2027a;
        }
        Location b = m2948b();
        if (b != null) {
            m2947a(b);
            return aVar.f2027a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: b */
    private Location m2948b() {
        Location location = null;
        Location a = C0375h.m1380a(this.f2024b, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? m2945a("network") : null;
        if (C0375h.m1380a(this.f2024b, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location = m2945a("gps");
        }
        if (location == null || a == null) {
            if (location != null) {
                a = location;
            }
            return a;
        }
        if (location.getTime() > a.getTime()) {
            a = location;
        }
        return a;
    }

    /* renamed from: a */
    private Location m2945a(String str) {
        try {
            if (this.f2025c.isProviderEnabled(str)) {
                return this.f2025c.getLastKnownLocation(str);
            }
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
        }
        return null;
    }

    /* renamed from: c */
    private boolean m2949c() {
        return this.f2026d.f2032f > System.currentTimeMillis();
    }

    /* renamed from: a */
    private void m2947a(Location location) {
        long j;
        C0728a aVar = this.f2026d;
        long currentTimeMillis = System.currentTimeMillis();
        C0726g a = C0726g.m2943a();
        C0726g gVar = a;
        gVar.mo2785a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j2 = a.f2020a;
        gVar.mo2785a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = true;
        if (a.f2022c != 1) {
            z = false;
        }
        boolean z2 = z;
        long j3 = a.f2021b;
        long j4 = j2;
        long j5 = a.f2020a;
        C0728a aVar2 = aVar;
        long j6 = j3;
        boolean z3 = z2;
        a.mo2785a(currentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j7 = a.f2021b;
        if (j6 == -1 || j5 == -1) {
            j = currentTimeMillis + 43200000;
        } else {
            long j8 = currentTimeMillis > j5 ? 0 + j7 : currentTimeMillis > j6 ? 0 + j5 : 0 + j6;
            j = j8 + ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
        }
        C0728a aVar3 = aVar2;
        aVar3.f2027a = z3;
        aVar3.f2028b = j4;
        aVar3.f2029c = j6;
        aVar3.f2030d = j5;
        aVar3.f2031e = j7;
        aVar3.f2032f = j;
    }
}
