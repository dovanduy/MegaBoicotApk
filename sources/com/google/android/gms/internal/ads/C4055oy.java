package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.exoplayer2.extractor.p132ts.TsExtractor;
import javax.annotation.concurrent.GuardedBy;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.oy */
final class C4055oy implements SensorEventListener {

    /* renamed from: a */
    private final SensorManager f13700a;

    /* renamed from: b */
    private final Object f13701b = new Object();

    /* renamed from: c */
    private final Display f13702c;

    /* renamed from: d */
    private final float[] f13703d = new float[9];

    /* renamed from: e */
    private final float[] f13704e = new float[9];
    @GuardedBy("mSensorThreadLock")

    /* renamed from: f */
    private float[] f13705f;

    /* renamed from: g */
    private Handler f13706g;

    /* renamed from: h */
    private C4058pa f13707h;

    C4055oy(Context context) {
        this.f13700a = (SensorManager) context.getSystemService("sensor");
        this.f13702c = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    /* renamed from: a */
    private final void m17581a(int i, int i2) {
        float f = this.f13704e[i];
        this.f13704e[i] = this.f13704e[i2];
        this.f13704e[i2] = f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo15775a() {
        if (this.f13706g == null) {
            Sensor defaultSensor = this.f13700a.getDefaultSensor(11);
            if (defaultSensor == null) {
                C3900je.m17431c("No Sensor of TYPE_ROTATION_VECTOR");
                return;
            }
            HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
            handlerThread.start();
            this.f13706g = new Handler(handlerThread.getLooper());
            if (!this.f13700a.registerListener(this, defaultSensor, 0, this.f13706g)) {
                C3900je.m17431c("SensorManager.registerListener failed.");
                mo15778b();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo15776a(C4058pa paVar) {
        this.f13707h = paVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo15777a(float[] fArr) {
        synchronized (this.f13701b) {
            if (this.f13705f == null) {
                return false;
            }
            System.arraycopy(this.f13705f, 0, fArr, 0, this.f13705f.length);
            return true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo15778b() {
        if (this.f13706g != null) {
            this.f13700a.unregisterListener(this);
            this.f13706g.post(new C4056oz(this));
            this.f13706g = null;
        }
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] != 0.0f || fArr[1] != 0.0f || fArr[2] != 0.0f) {
            synchronized (this.f13701b) {
                if (this.f13705f == null) {
                    this.f13705f = new float[9];
                }
            }
            SensorManager.getRotationMatrixFromVector(this.f13703d, fArr);
            switch (this.f13702c.getRotation()) {
                case 1:
                    SensorManager.remapCoordinateSystem(this.f13703d, 2, TsExtractor.TS_STREAM_TYPE_AC3, this.f13704e);
                    break;
                case 2:
                    SensorManager.remapCoordinateSystem(this.f13703d, TsExtractor.TS_STREAM_TYPE_AC3, TsExtractor.TS_STREAM_TYPE_HDMV_DTS, this.f13704e);
                    break;
                case 3:
                    SensorManager.remapCoordinateSystem(this.f13703d, TsExtractor.TS_STREAM_TYPE_HDMV_DTS, 1, this.f13704e);
                    break;
                default:
                    System.arraycopy(this.f13703d, 0, this.f13704e, 0, 9);
                    break;
            }
            m17581a(1, 3);
            m17581a(2, 6);
            m17581a(5, 7);
            synchronized (this.f13701b) {
                System.arraycopy(this.f13704e, 0, this.f13705f, 0, 9);
            }
            if (this.f13707h != null) {
                this.f13707h.mo15788a();
            }
        }
    }
}
