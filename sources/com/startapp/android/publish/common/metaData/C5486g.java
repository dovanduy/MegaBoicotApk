package com.startapp.android.publish.common.metaData;

import com.startapp.android.publish.adsCommon.Utils.C5307i;
import com.startapp.common.p196c.C5548f;
import java.io.Serializable;

/* renamed from: com.startapp.android.publish.common.metaData.g */
/* compiled from: StartAppSDK */
public class C5486g implements Serializable {
    private static final long serialVersionUID = 1;
    @C5548f(mo20534a = true)
    private C5476a ambientTemperatureSensor = new C5476a(14);
    private boolean enabled = false;
    @C5548f(mo20534a = true)
    private C5476a gravitySensor = new C5476a(9);
    @C5548f(mo20534a = true)
    private C5476a gyroscopeUncalibratedSensor = new C5476a(18);
    @C5548f(mo20534a = true)
    private C5476a lightSensor = new C5476a(3);
    @C5548f(mo20534a = true)
    private C5476a linearAccelerationSensor = new C5476a(9);
    @C5548f(mo20534a = true)
    private C5476a magneticFieldSensor = new C5476a(3);
    @C5548f(mo20534a = true)
    private C5476a pressureSensor = new C5476a(9);
    @C5548f(mo20534a = true)
    private C5476a relativeHumiditySensor = new C5476a(14);
    @C5548f(mo20534a = true)
    private C5476a rotationVectorSensor = new C5476a(9);
    private int timeoutInSec = 10;

    /* renamed from: a */
    public int mo20278a() {
        return this.timeoutInSec;
    }

    /* renamed from: b */
    public boolean mo20279b() {
        return this.enabled;
    }

    /* renamed from: c */
    public C5476a mo20280c() {
        return this.ambientTemperatureSensor;
    }

    /* renamed from: d */
    public C5476a mo20281d() {
        return this.gravitySensor;
    }

    /* renamed from: e */
    public C5476a mo20282e() {
        return this.lightSensor;
    }

    /* renamed from: f */
    public C5476a mo20284f() {
        return this.linearAccelerationSensor;
    }

    /* renamed from: g */
    public C5476a mo20285g() {
        return this.magneticFieldSensor;
    }

    /* renamed from: h */
    public C5476a mo20286h() {
        return this.pressureSensor;
    }

    /* renamed from: i */
    public C5476a mo20288i() {
        return this.relativeHumiditySensor;
    }

    /* renamed from: j */
    public C5476a mo20289j() {
        return this.rotationVectorSensor;
    }

    /* renamed from: k */
    public C5476a mo20290k() {
        return this.gyroscopeUncalibratedSensor;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C5486g gVar = (C5486g) obj;
        if (this.timeoutInSec != gVar.timeoutInSec || this.enabled != gVar.enabled || !C5307i.m22682b(this.ambientTemperatureSensor, gVar.ambientTemperatureSensor) || !C5307i.m22682b(this.gravitySensor, gVar.gravitySensor) || !C5307i.m22682b(this.lightSensor, gVar.lightSensor) || !C5307i.m22682b(this.linearAccelerationSensor, gVar.linearAccelerationSensor) || !C5307i.m22682b(this.magneticFieldSensor, gVar.magneticFieldSensor) || !C5307i.m22682b(this.pressureSensor, gVar.pressureSensor) || !C5307i.m22682b(this.relativeHumiditySensor, gVar.relativeHumiditySensor) || !C5307i.m22682b(this.rotationVectorSensor, gVar.rotationVectorSensor) || !C5307i.m22682b(this.gyroscopeUncalibratedSensor, gVar.gyroscopeUncalibratedSensor)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return C5307i.m22652a(Integer.valueOf(this.timeoutInSec), Boolean.valueOf(this.enabled), this.ambientTemperatureSensor, this.gravitySensor, this.lightSensor, this.linearAccelerationSensor, this.magneticFieldSensor, this.pressureSensor, this.relativeHumiditySensor, this.rotationVectorSensor, this.gyroscopeUncalibratedSensor);
    }
}
