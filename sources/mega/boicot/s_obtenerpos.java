package mega.boicot;

import android.app.Service;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.IBinder;
import java.util.Calendar;
import java.util.List;

public class s_obtenerpos extends Service implements LocationListener {

    /* renamed from: a */
    SharedPreferences f20228a;

    /* renamed from: b */
    Editor f20229b;

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onProviderDisabled(String str) {
    }

    public void onProviderEnabled(String str) {
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
    }

    public void onCreate() {
        boolean z;
        boolean z2;
        boolean z3 = false;
        this.f20228a = getSharedPreferences("sh", 0);
        this.f20229b = this.f20228a.edit();
        LocationManager locationManager = (LocationManager) getSystemService("location");
        List providers = locationManager.getProviders(true);
        int size = providers.size() - 1;
        while (true) {
            if (size < 0) {
                z = true;
                break;
            }
            Location lastKnownLocation = locationManager.getLastKnownLocation((String) providers.get(size));
            if (lastKnownLocation != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(lastKnownLocation.getLatitude());
                sb.append("");
                this.f20229b.putString("x", sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(lastKnownLocation.getLongitude());
                sb2.append("");
                this.f20229b.putString("y", sb2.toString());
                this.f20229b.commit();
                if (lastKnownLocation.getTime() > Calendar.getInstance().getTimeInMillis() - 300000) {
                    m24576a();
                    stopSelf();
                    z = false;
                    break;
                }
            }
            size--;
        }
        if (z) {
            try {
                locationManager.requestLocationUpdates("network", 0, 0.0f, this);
                z2 = true;
            } catch (Exception unused) {
                z2 = false;
            }
            if (!z2) {
                try {
                    locationManager.requestLocationUpdates("gps", 0, 0.0f, this);
                    z3 = true;
                } catch (Exception unused2) {
                }
                if (!z3) {
                    m24576a();
                    stopSelf();
                }
            }
        }
    }

    public void onLocationChanged(Location location) {
        if (location != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(location.getLatitude());
            sb.append("");
            this.f20229b.putString("x", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(location.getLongitude());
            sb2.append("");
            this.f20229b.putString("y", sb2.toString());
            this.f20229b.commit();
            ((LocationManager) getSystemService("location")).removeUpdates(this);
            m24576a();
            stopSelf();
        }
    }

    /* renamed from: a */
    private void m24576a() {
        if (!this.f20228a.getString("x", "").equals("") && !this.f20228a.getString("nick", "").equals("")) {
            startService(new Intent(this, s_guardarpos.class));
        }
    }
}
