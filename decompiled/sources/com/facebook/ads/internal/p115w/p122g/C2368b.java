package com.facebook.ads.internal.p115w.p122g;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.SystemClock;
import android.widget.Toast;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.facebook.ads.internal.w.g.b */
public class C2368b implements SensorEventListener {

    /* renamed from: a */
    private final Context f7448a;

    /* renamed from: b */
    private SensorManager f7449b;

    /* renamed from: c */
    private int f7450c = 0;

    /* renamed from: d */
    private long f7451d;

    /* renamed from: e */
    private long f7452e;

    /* renamed from: f */
    private long f7453f;

    /* renamed from: g */
    private float f7454g = -1.0f;

    /* renamed from: h */
    private float f7455h = -1.0f;

    /* renamed from: i */
    private float f7456i = -1.0f;

    /* renamed from: j */
    private final Set<C2369a> f7457j = new CopyOnWriteArraySet();

    /* renamed from: com.facebook.ads.internal.w.g.b$a */
    public interface C2369a {
        /* renamed from: a */
        void mo8769a();
    }

    public C2368b(Context context) {
        this.f7448a = context;
    }

    /* renamed from: a */
    public void mo8773a(C2369a aVar) {
        if (this.f7457j.isEmpty()) {
            this.f7449b = (SensorManager) this.f7448a.getSystemService("sensor");
            if (this.f7449b == null) {
                Toast.makeText(this.f7448a, "Sensors not supported", 1).show();
            }
            boolean z = false;
            try {
                z = this.f7449b.registerListener(this, this.f7449b.getDefaultSensor(1), 3);
            } catch (Exception unused) {
                Toast.makeText(this.f7448a, "Shaking not supported", 1).show();
            }
            if (!z && this.f7449b != null) {
                this.f7449b.unregisterListener(this);
            }
        } else if (this.f7457j.contains(aVar)) {
            return;
        }
        this.f7457j.add(aVar);
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - this.f7453f > 500) {
                this.f7450c = 0;
            }
            if (elapsedRealtime - this.f7451d > 100) {
                if ((Math.abs(((((sensorEvent.values[0] + sensorEvent.values[1]) + sensorEvent.values[2]) - this.f7454g) - this.f7455h) - this.f7456i) / ((float) (elapsedRealtime - this.f7451d))) * 10000.0f > 800.0f) {
                    int i = this.f7450c + 1;
                    this.f7450c = i;
                    if (i >= 3 && elapsedRealtime - this.f7452e > 1000) {
                        this.f7452e = elapsedRealtime;
                        this.f7450c = 0;
                        for (C2369a a : this.f7457j) {
                            a.mo8769a();
                        }
                    }
                    this.f7453f = elapsedRealtime;
                }
                this.f7451d = elapsedRealtime;
                this.f7454g = sensorEvent.values[0];
                this.f7455h = sensorEvent.values[1];
                this.f7456i = sensorEvent.values[2];
            }
        }
    }
}
