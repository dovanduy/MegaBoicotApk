package com.startapp.android.publish.adsCommon.p190j;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build.VERSION;
import com.startapp.android.publish.common.metaData.C5476a;
import com.startapp.android.publish.common.metaData.C5486g;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.common.C5549d;
import java.util.HashMap;
import org.json.JSONArray;

/* renamed from: com.startapp.android.publish.adsCommon.j.b */
/* compiled from: StartAppSDK */
public class C5411b {

    /* renamed from: a */
    protected C5410a f17296a = new C5410a();

    /* renamed from: b */
    protected SensorManager f17297b;

    /* renamed from: c */
    protected C5549d f17298c;

    /* renamed from: d */
    private HashMap<Integer, C5413a> f17299d = null;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f17300e;

    /* renamed from: f */
    private SensorEventListener f17301f = new SensorEventListener() {
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            if (C5411b.this.f17296a.mo19960a(sensorEvent) == C5411b.this.f17300e) {
                C5411b.this.mo19963b();
                if (C5411b.this.f17298c != null) {
                    C5411b.this.f17298c.mo19942a(C5411b.this.mo19964c());
                }
            }
        }
    };

    /* renamed from: com.startapp.android.publish.adsCommon.j.b$a */
    /* compiled from: StartAppSDK */
    private class C5413a {

        /* renamed from: b */
        private int f17304b;

        /* renamed from: c */
        private int f17305c;

        public C5413a(int i, int i2) {
            this.f17304b = i;
            this.f17305c = i2;
        }

        /* renamed from: a */
        public int mo19967a() {
            return this.f17304b;
        }

        /* renamed from: b */
        public int mo19968b() {
            return this.f17305c;
        }
    }

    public C5411b(Context context, C5549d dVar) {
        this.f17297b = (SensorManager) context.getSystemService("sensor");
        this.f17298c = dVar;
        this.f17300e = 0;
        m23085d();
    }

    /* renamed from: a */
    public void mo19962a() {
        for (Integer intValue : this.f17299d.keySet()) {
            int intValue2 = intValue.intValue();
            C5413a aVar = (C5413a) this.f17299d.get(Integer.valueOf(intValue2));
            if (VERSION.SDK_INT >= aVar.mo19967a()) {
                Sensor defaultSensor = this.f17297b.getDefaultSensor(intValue2);
                if (defaultSensor != null) {
                    this.f17297b.registerListener(this.f17301f, defaultSensor, aVar.mo19968b());
                    this.f17300e++;
                }
            }
        }
    }

    /* renamed from: b */
    public void mo19963b() {
        this.f17297b.unregisterListener(this.f17301f);
    }

    /* renamed from: c */
    public JSONArray mo19964c() {
        try {
            return this.f17296a.mo19961a();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: d */
    private void m23085d() {
        this.f17299d = new HashMap<>();
        C5486g sensorsConfig = MetaData.getInstance().getSensorsConfig();
        m23084a(13, sensorsConfig.mo20280c());
        m23084a(9, sensorsConfig.mo20281d());
        m23084a(5, sensorsConfig.mo20282e());
        m23084a(10, sensorsConfig.mo20284f());
        m23084a(2, sensorsConfig.mo20285g());
        m23084a(6, sensorsConfig.mo20286h());
        m23084a(12, sensorsConfig.mo20288i());
        m23084a(11, sensorsConfig.mo20289j());
        m23084a(16, sensorsConfig.mo20290k());
    }

    /* renamed from: a */
    private void m23084a(int i, C5476a aVar) {
        if (aVar.mo20264c()) {
            this.f17299d.put(Integer.valueOf(i), new C5413a(aVar.mo20263b(), aVar.mo20262a()));
        }
    }
}
